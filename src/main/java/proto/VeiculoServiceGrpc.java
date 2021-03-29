package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Veiculo.proto")
public final class VeiculoServiceGrpc {

  private VeiculoServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.VeiculoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.CreateVeiculoRequest,
      proto.CreateVeiculoResponse> getCreateVeiculoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVeiculo",
      requestType = proto.CreateVeiculoRequest.class,
      responseType = proto.CreateVeiculoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.CreateVeiculoRequest,
      proto.CreateVeiculoResponse> getCreateVeiculoMethod() {
    io.grpc.MethodDescriptor<proto.CreateVeiculoRequest, proto.CreateVeiculoResponse> getCreateVeiculoMethod;
    if ((getCreateVeiculoMethod = VeiculoServiceGrpc.getCreateVeiculoMethod) == null) {
      synchronized (VeiculoServiceGrpc.class) {
        if ((getCreateVeiculoMethod = VeiculoServiceGrpc.getCreateVeiculoMethod) == null) {
          VeiculoServiceGrpc.getCreateVeiculoMethod = getCreateVeiculoMethod = 
              io.grpc.MethodDescriptor.<proto.CreateVeiculoRequest, proto.CreateVeiculoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.VeiculoService", "CreateVeiculo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.CreateVeiculoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.CreateVeiculoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VeiculoServiceMethodDescriptorSupplier("CreateVeiculo"))
                  .build();
          }
        }
     }
     return getCreateVeiculoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UpdateVeiculoRequest,
      proto.UpdateVeiculoResponse> getUpdateVeiculoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVeiculo",
      requestType = proto.UpdateVeiculoRequest.class,
      responseType = proto.UpdateVeiculoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UpdateVeiculoRequest,
      proto.UpdateVeiculoResponse> getUpdateVeiculoMethod() {
    io.grpc.MethodDescriptor<proto.UpdateVeiculoRequest, proto.UpdateVeiculoResponse> getUpdateVeiculoMethod;
    if ((getUpdateVeiculoMethod = VeiculoServiceGrpc.getUpdateVeiculoMethod) == null) {
      synchronized (VeiculoServiceGrpc.class) {
        if ((getUpdateVeiculoMethod = VeiculoServiceGrpc.getUpdateVeiculoMethod) == null) {
          VeiculoServiceGrpc.getUpdateVeiculoMethod = getUpdateVeiculoMethod = 
              io.grpc.MethodDescriptor.<proto.UpdateVeiculoRequest, proto.UpdateVeiculoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.VeiculoService", "UpdateVeiculo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UpdateVeiculoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UpdateVeiculoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VeiculoServiceMethodDescriptorSupplier("UpdateVeiculo"))
                  .build();
          }
        }
     }
     return getUpdateVeiculoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.DeleteVeiculoRequest,
      proto.DeleteVeiculoResponse> getDeleteVeiculoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVeiculo",
      requestType = proto.DeleteVeiculoRequest.class,
      responseType = proto.DeleteVeiculoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.DeleteVeiculoRequest,
      proto.DeleteVeiculoResponse> getDeleteVeiculoMethod() {
    io.grpc.MethodDescriptor<proto.DeleteVeiculoRequest, proto.DeleteVeiculoResponse> getDeleteVeiculoMethod;
    if ((getDeleteVeiculoMethod = VeiculoServiceGrpc.getDeleteVeiculoMethod) == null) {
      synchronized (VeiculoServiceGrpc.class) {
        if ((getDeleteVeiculoMethod = VeiculoServiceGrpc.getDeleteVeiculoMethod) == null) {
          VeiculoServiceGrpc.getDeleteVeiculoMethod = getDeleteVeiculoMethod = 
              io.grpc.MethodDescriptor.<proto.DeleteVeiculoRequest, proto.DeleteVeiculoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.VeiculoService", "DeleteVeiculo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DeleteVeiculoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DeleteVeiculoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VeiculoServiceMethodDescriptorSupplier("DeleteVeiculo"))
                  .build();
          }
        }
     }
     return getDeleteVeiculoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.GetVeiculoRequest,
      proto.GetVeiculoResponse> getGetVeiculoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVeiculo",
      requestType = proto.GetVeiculoRequest.class,
      responseType = proto.GetVeiculoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.GetVeiculoRequest,
      proto.GetVeiculoResponse> getGetVeiculoMethod() {
    io.grpc.MethodDescriptor<proto.GetVeiculoRequest, proto.GetVeiculoResponse> getGetVeiculoMethod;
    if ((getGetVeiculoMethod = VeiculoServiceGrpc.getGetVeiculoMethod) == null) {
      synchronized (VeiculoServiceGrpc.class) {
        if ((getGetVeiculoMethod = VeiculoServiceGrpc.getGetVeiculoMethod) == null) {
          VeiculoServiceGrpc.getGetVeiculoMethod = getGetVeiculoMethod = 
              io.grpc.MethodDescriptor.<proto.GetVeiculoRequest, proto.GetVeiculoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.VeiculoService", "GetVeiculo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetVeiculoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetVeiculoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VeiculoServiceMethodDescriptorSupplier("GetVeiculo"))
                  .build();
          }
        }
     }
     return getGetVeiculoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ListVeiculoRequest,
      proto.ListVeiculoResponse> getListVeiculoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVeiculo",
      requestType = proto.ListVeiculoRequest.class,
      responseType = proto.ListVeiculoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ListVeiculoRequest,
      proto.ListVeiculoResponse> getListVeiculoMethod() {
    io.grpc.MethodDescriptor<proto.ListVeiculoRequest, proto.ListVeiculoResponse> getListVeiculoMethod;
    if ((getListVeiculoMethod = VeiculoServiceGrpc.getListVeiculoMethod) == null) {
      synchronized (VeiculoServiceGrpc.class) {
        if ((getListVeiculoMethod = VeiculoServiceGrpc.getListVeiculoMethod) == null) {
          VeiculoServiceGrpc.getListVeiculoMethod = getListVeiculoMethod = 
              io.grpc.MethodDescriptor.<proto.ListVeiculoRequest, proto.ListVeiculoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.VeiculoService", "ListVeiculo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ListVeiculoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ListVeiculoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VeiculoServiceMethodDescriptorSupplier("ListVeiculo"))
                  .build();
          }
        }
     }
     return getListVeiculoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VeiculoServiceStub newStub(io.grpc.Channel channel) {
    return new VeiculoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VeiculoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VeiculoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VeiculoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VeiculoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class VeiculoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createVeiculo(proto.CreateVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.CreateVeiculoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVeiculoMethod(), responseObserver);
    }

    /**
     */
    public void updateVeiculo(proto.UpdateVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.UpdateVeiculoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVeiculoMethod(), responseObserver);
    }

    /**
     */
    public void deleteVeiculo(proto.DeleteVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.DeleteVeiculoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVeiculoMethod(), responseObserver);
    }

    /**
     */
    public void getVeiculo(proto.GetVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.GetVeiculoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVeiculoMethod(), responseObserver);
    }

    /**
     */
    public void listVeiculo(proto.ListVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.ListVeiculoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVeiculoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateVeiculoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.CreateVeiculoRequest,
                proto.CreateVeiculoResponse>(
                  this, METHODID_CREATE_VEICULO)))
          .addMethod(
            getUpdateVeiculoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UpdateVeiculoRequest,
                proto.UpdateVeiculoResponse>(
                  this, METHODID_UPDATE_VEICULO)))
          .addMethod(
            getDeleteVeiculoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.DeleteVeiculoRequest,
                proto.DeleteVeiculoResponse>(
                  this, METHODID_DELETE_VEICULO)))
          .addMethod(
            getGetVeiculoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.GetVeiculoRequest,
                proto.GetVeiculoResponse>(
                  this, METHODID_GET_VEICULO)))
          .addMethod(
            getListVeiculoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ListVeiculoRequest,
                proto.ListVeiculoResponse>(
                  this, METHODID_LIST_VEICULO)))
          .build();
    }
  }

  /**
   */
  public static final class VeiculoServiceStub extends io.grpc.stub.AbstractStub<VeiculoServiceStub> {
    private VeiculoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VeiculoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VeiculoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VeiculoServiceStub(channel, callOptions);
    }

    /**
     */
    public void createVeiculo(proto.CreateVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.CreateVeiculoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVeiculoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVeiculo(proto.UpdateVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.UpdateVeiculoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVeiculoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVeiculo(proto.DeleteVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.DeleteVeiculoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVeiculoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVeiculo(proto.GetVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.GetVeiculoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVeiculoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVeiculo(proto.ListVeiculoRequest request,
        io.grpc.stub.StreamObserver<proto.ListVeiculoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVeiculoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VeiculoServiceBlockingStub extends io.grpc.stub.AbstractStub<VeiculoServiceBlockingStub> {
    private VeiculoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VeiculoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VeiculoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VeiculoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.CreateVeiculoResponse createVeiculo(proto.CreateVeiculoRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVeiculoMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.UpdateVeiculoResponse updateVeiculo(proto.UpdateVeiculoRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVeiculoMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.DeleteVeiculoResponse deleteVeiculo(proto.DeleteVeiculoRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVeiculoMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.GetVeiculoResponse getVeiculo(proto.GetVeiculoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVeiculoMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ListVeiculoResponse listVeiculo(proto.ListVeiculoRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVeiculoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VeiculoServiceFutureStub extends io.grpc.stub.AbstractStub<VeiculoServiceFutureStub> {
    private VeiculoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VeiculoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VeiculoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VeiculoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.CreateVeiculoResponse> createVeiculo(
        proto.CreateVeiculoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVeiculoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.UpdateVeiculoResponse> updateVeiculo(
        proto.UpdateVeiculoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVeiculoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.DeleteVeiculoResponse> deleteVeiculo(
        proto.DeleteVeiculoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVeiculoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.GetVeiculoResponse> getVeiculo(
        proto.GetVeiculoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVeiculoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ListVeiculoResponse> listVeiculo(
        proto.ListVeiculoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVeiculoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VEICULO = 0;
  private static final int METHODID_UPDATE_VEICULO = 1;
  private static final int METHODID_DELETE_VEICULO = 2;
  private static final int METHODID_GET_VEICULO = 3;
  private static final int METHODID_LIST_VEICULO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VeiculoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VeiculoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_VEICULO:
          serviceImpl.createVeiculo((proto.CreateVeiculoRequest) request,
              (io.grpc.stub.StreamObserver<proto.CreateVeiculoResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VEICULO:
          serviceImpl.updateVeiculo((proto.UpdateVeiculoRequest) request,
              (io.grpc.stub.StreamObserver<proto.UpdateVeiculoResponse>) responseObserver);
          break;
        case METHODID_DELETE_VEICULO:
          serviceImpl.deleteVeiculo((proto.DeleteVeiculoRequest) request,
              (io.grpc.stub.StreamObserver<proto.DeleteVeiculoResponse>) responseObserver);
          break;
        case METHODID_GET_VEICULO:
          serviceImpl.getVeiculo((proto.GetVeiculoRequest) request,
              (io.grpc.stub.StreamObserver<proto.GetVeiculoResponse>) responseObserver);
          break;
        case METHODID_LIST_VEICULO:
          serviceImpl.listVeiculo((proto.ListVeiculoRequest) request,
              (io.grpc.stub.StreamObserver<proto.ListVeiculoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class VeiculoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VeiculoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.VeiculoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VeiculoService");
    }
  }

  private static final class VeiculoServiceFileDescriptorSupplier
      extends VeiculoServiceBaseDescriptorSupplier {
    VeiculoServiceFileDescriptorSupplier() {}
  }

  private static final class VeiculoServiceMethodDescriptorSupplier
      extends VeiculoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VeiculoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VeiculoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VeiculoServiceFileDescriptorSupplier())
              .addMethod(getCreateVeiculoMethod())
              .addMethod(getUpdateVeiculoMethod())
              .addMethod(getDeleteVeiculoMethod())
              .addMethod(getGetVeiculoMethod())
              .addMethod(getListVeiculoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
