/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;
import java.util.Map;
import proto.CreateVeiculoRequest;
import proto.CreateVeiculoResponse;
import proto.DeleteVeiculoRequest;
import proto.DeleteVeiculoResponse;
import proto.GetVeiculoRequest;
import proto.GetVeiculoResponse;
import proto.ListVeiculoRequest;
import proto.ListVeiculoResponse;
import proto.UpdateVeiculoRequest;
import proto.UpdateVeiculoResponse;
import proto.Veiculo;
import proto.VeiculoServiceGrpc;

/**
 *
 * @author Acer
 */
public class VeiculoServiceImpl extends VeiculoServiceGrpc.VeiculoServiceImplBase{
    
    private Map<Integer, Veiculo> veiculoMap = new HashMap<Integer, Veiculo>();
    private int i = 1;
 
    @Override
    public void createVeiculo(CreateVeiculoRequest request, StreamObserver<CreateVeiculoResponse> responseObserver) {
        System.out.println("Creating Veiculo");
        Veiculo veiculo = request.getVeiculo();
 
        veiculo = veiculo.toBuilder().setId(i).setModelo(request.getVeiculo().getModelo())
                .setMarca(request.getVeiculo().getMarca())
                .setAnoFab(request.getVeiculo().getAnoFab())
                .setAnoMod(request.getVeiculo().getAnoMod())
                .build();
 
        CreateVeiculoResponse response = CreateVeiculoResponse.newBuilder().setVeiculo(veiculo).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
 
        veiculoMap.put(i, veiculo);
        i++;
    }
   

    //@Override
    public void updateVeiculo(UpdateVeiculoRequest request, StreamObserver<UpdateVeiculoResponse> responseObserver){
        
        Veiculo veiculo = request.getVeiculo();
        
        if(veiculoMap.containsKey(veiculo.getId())){
            //veiculoMap.putAll(veiculoMap);
            veiculoMap.remove(veiculo.getId(),request.getVeiculo());
                veiculo = veiculo.toBuilder().setId(request.getVeiculo().getId()).setModelo(request.getVeiculo().getModelo())
                .setMarca(request.getVeiculo().getMarca())
                .setAnoFab(request.getVeiculo().getAnoFab())
                .setAnoMod(request.getVeiculo().getAnoMod())
                .build();
            UpdateVeiculoResponse response= UpdateVeiculoResponse.newBuilder().setVeiculo(veiculo).build();
             System.out.println("Veiculo was updated");
             
            responseObserver.onNext(response);
			
            responseObserver.onCompleted();
        } else {
            System.out.println("Veiculo not found");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
            
        }
    }
        
    @Override
    public void deleteVeiculo(DeleteVeiculoRequest request, StreamObserver<DeleteVeiculoResponse> responseObserver) {
        if (veiculoMap.containsKey(request.getVeiculoId())) {
            veiculoMap.remove(request.getVeiculoId());
            System.out.println("Veiculo was deleted");
            responseObserver.onNext(DeleteVeiculoResponse.newBuilder().setVeiculoId(request.getVeiculoId()).build());
            responseObserver.onCompleted();
        } else {
            System.out.println("Veiculo not found");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }
 
    @Override
    public void getVeiculo(GetVeiculoRequest request, StreamObserver<GetVeiculoResponse> responseObserver) {
        System.out.println("Get veiculo");
        if (veiculoMap.containsKey(request.getVeiculoId())) {
            Veiculo veiculo = veiculoMap.get(request.getVeiculoId());
            GetVeiculoResponse response = GetVeiculoResponse.newBuilder().setVeiculo(veiculo).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } else {
            System.out.println("Veiculo not found");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
 
    }
 
    @Override
    public void listVeiculo(ListVeiculoRequest request, StreamObserver<ListVeiculoResponse> responseObserver) {
        System.out.println("List veiculos");
        ListVeiculoResponse response = ListVeiculoResponse.newBuilder().addAllVeiculo(veiculoMap.values()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }    
}
