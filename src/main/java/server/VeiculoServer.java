/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
/**
 *
 * @author Acer
 */
public class VeiculoServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Server start");
        Server server = ServerBuilder.forPort(50051)
                .addService(new VeiculoServiceImpl())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            server.shutdown();
        }));
        server.awaitTermination();
    }
}
