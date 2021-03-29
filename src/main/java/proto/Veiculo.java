// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Veiculo.proto

package proto;

/**
 * Protobuf type {@code proto.Veiculo}
 */
public  final class Veiculo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Veiculo)
    VeiculoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Veiculo.newBuilder() to construct.
  private Veiculo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Veiculo() {
    id_ = 0;
    marca_ = "";
    modelo_ = "";
    anoFab_ = "";
    anoMod_ = "";
    preco_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Veiculo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            marca_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            modelo_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            anoFab_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            anoMod_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            preco_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.VeiculoOuterClass.internal_static_proto_Veiculo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.VeiculoOuterClass.internal_static_proto_Veiculo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.Veiculo.class, proto.Veiculo.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int MARCA_FIELD_NUMBER = 2;
  private volatile java.lang.Object marca_;
  /**
   * <code>string marca = 2;</code>
   */
  public java.lang.String getMarca() {
    java.lang.Object ref = marca_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      marca_ = s;
      return s;
    }
  }
  /**
   * <code>string marca = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMarcaBytes() {
    java.lang.Object ref = marca_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      marca_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODELO_FIELD_NUMBER = 3;
  private volatile java.lang.Object modelo_;
  /**
   * <code>string modelo = 3;</code>
   */
  public java.lang.String getModelo() {
    java.lang.Object ref = modelo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelo_ = s;
      return s;
    }
  }
  /**
   * <code>string modelo = 3;</code>
   */
  public com.google.protobuf.ByteString
      getModeloBytes() {
    java.lang.Object ref = modelo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANOFAB_FIELD_NUMBER = 4;
  private volatile java.lang.Object anoFab_;
  /**
   * <code>string anoFab = 4;</code>
   */
  public java.lang.String getAnoFab() {
    java.lang.Object ref = anoFab_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      anoFab_ = s;
      return s;
    }
  }
  /**
   * <code>string anoFab = 4;</code>
   */
  public com.google.protobuf.ByteString
      getAnoFabBytes() {
    java.lang.Object ref = anoFab_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      anoFab_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANOMOD_FIELD_NUMBER = 5;
  private volatile java.lang.Object anoMod_;
  /**
   * <code>string anoMod = 5;</code>
   */
  public java.lang.String getAnoMod() {
    java.lang.Object ref = anoMod_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      anoMod_ = s;
      return s;
    }
  }
  /**
   * <code>string anoMod = 5;</code>
   */
  public com.google.protobuf.ByteString
      getAnoModBytes() {
    java.lang.Object ref = anoMod_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      anoMod_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRECO_FIELD_NUMBER = 6;
  private volatile java.lang.Object preco_;
  /**
   * <code>string preco = 6;</code>
   */
  public java.lang.String getPreco() {
    java.lang.Object ref = preco_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      preco_ = s;
      return s;
    }
  }
  /**
   * <code>string preco = 6;</code>
   */
  public com.google.protobuf.ByteString
      getPrecoBytes() {
    java.lang.Object ref = preco_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      preco_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getMarcaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, marca_);
    }
    if (!getModeloBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, modelo_);
    }
    if (!getAnoFabBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, anoFab_);
    }
    if (!getAnoModBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, anoMod_);
    }
    if (!getPrecoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, preco_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getMarcaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, marca_);
    }
    if (!getModeloBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, modelo_);
    }
    if (!getAnoFabBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, anoFab_);
    }
    if (!getAnoModBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, anoMod_);
    }
    if (!getPrecoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, preco_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto.Veiculo)) {
      return super.equals(obj);
    }
    proto.Veiculo other = (proto.Veiculo) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getMarca()
        .equals(other.getMarca());
    result = result && getModelo()
        .equals(other.getModelo());
    result = result && getAnoFab()
        .equals(other.getAnoFab());
    result = result && getAnoMod()
        .equals(other.getAnoMod());
    result = result && getPreco()
        .equals(other.getPreco());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + MARCA_FIELD_NUMBER;
    hash = (53 * hash) + getMarca().hashCode();
    hash = (37 * hash) + MODELO_FIELD_NUMBER;
    hash = (53 * hash) + getModelo().hashCode();
    hash = (37 * hash) + ANOFAB_FIELD_NUMBER;
    hash = (53 * hash) + getAnoFab().hashCode();
    hash = (37 * hash) + ANOMOD_FIELD_NUMBER;
    hash = (53 * hash) + getAnoMod().hashCode();
    hash = (37 * hash) + PRECO_FIELD_NUMBER;
    hash = (53 * hash) + getPreco().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.Veiculo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Veiculo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Veiculo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Veiculo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Veiculo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Veiculo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Veiculo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Veiculo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Veiculo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.Veiculo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Veiculo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Veiculo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.Veiculo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.Veiculo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Veiculo)
      proto.VeiculoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.VeiculoOuterClass.internal_static_proto_Veiculo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.VeiculoOuterClass.internal_static_proto_Veiculo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.Veiculo.class, proto.Veiculo.Builder.class);
    }

    // Construct using proto.Veiculo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      marca_ = "";

      modelo_ = "";

      anoFab_ = "";

      anoMod_ = "";

      preco_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.VeiculoOuterClass.internal_static_proto_Veiculo_descriptor;
    }

    @java.lang.Override
    public proto.Veiculo getDefaultInstanceForType() {
      return proto.Veiculo.getDefaultInstance();
    }

    @java.lang.Override
    public proto.Veiculo build() {
      proto.Veiculo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.Veiculo buildPartial() {
      proto.Veiculo result = new proto.Veiculo(this);
      result.id_ = id_;
      result.marca_ = marca_;
      result.modelo_ = modelo_;
      result.anoFab_ = anoFab_;
      result.anoMod_ = anoMod_;
      result.preco_ = preco_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.Veiculo) {
        return mergeFrom((proto.Veiculo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.Veiculo other) {
      if (other == proto.Veiculo.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getMarca().isEmpty()) {
        marca_ = other.marca_;
        onChanged();
      }
      if (!other.getModelo().isEmpty()) {
        modelo_ = other.modelo_;
        onChanged();
      }
      if (!other.getAnoFab().isEmpty()) {
        anoFab_ = other.anoFab_;
        onChanged();
      }
      if (!other.getAnoMod().isEmpty()) {
        anoMod_ = other.anoMod_;
        onChanged();
      }
      if (!other.getPreco().isEmpty()) {
        preco_ = other.preco_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      proto.Veiculo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.Veiculo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object marca_ = "";
    /**
     * <code>string marca = 2;</code>
     */
    public java.lang.String getMarca() {
      java.lang.Object ref = marca_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        marca_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string marca = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMarcaBytes() {
      java.lang.Object ref = marca_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        marca_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string marca = 2;</code>
     */
    public Builder setMarca(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      marca_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string marca = 2;</code>
     */
    public Builder clearMarca() {
      
      marca_ = getDefaultInstance().getMarca();
      onChanged();
      return this;
    }
    /**
     * <code>string marca = 2;</code>
     */
    public Builder setMarcaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      marca_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object modelo_ = "";
    /**
     * <code>string modelo = 3;</code>
     */
    public java.lang.String getModelo() {
      java.lang.Object ref = modelo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string modelo = 3;</code>
     */
    public com.google.protobuf.ByteString
        getModeloBytes() {
      java.lang.Object ref = modelo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string modelo = 3;</code>
     */
    public Builder setModelo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string modelo = 3;</code>
     */
    public Builder clearModelo() {
      
      modelo_ = getDefaultInstance().getModelo();
      onChanged();
      return this;
    }
    /**
     * <code>string modelo = 3;</code>
     */
    public Builder setModeloBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object anoFab_ = "";
    /**
     * <code>string anoFab = 4;</code>
     */
    public java.lang.String getAnoFab() {
      java.lang.Object ref = anoFab_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        anoFab_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string anoFab = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAnoFabBytes() {
      java.lang.Object ref = anoFab_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        anoFab_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string anoFab = 4;</code>
     */
    public Builder setAnoFab(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      anoFab_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string anoFab = 4;</code>
     */
    public Builder clearAnoFab() {
      
      anoFab_ = getDefaultInstance().getAnoFab();
      onChanged();
      return this;
    }
    /**
     * <code>string anoFab = 4;</code>
     */
    public Builder setAnoFabBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      anoFab_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object anoMod_ = "";
    /**
     * <code>string anoMod = 5;</code>
     */
    public java.lang.String getAnoMod() {
      java.lang.Object ref = anoMod_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        anoMod_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string anoMod = 5;</code>
     */
    public com.google.protobuf.ByteString
        getAnoModBytes() {
      java.lang.Object ref = anoMod_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        anoMod_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string anoMod = 5;</code>
     */
    public Builder setAnoMod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      anoMod_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string anoMod = 5;</code>
     */
    public Builder clearAnoMod() {
      
      anoMod_ = getDefaultInstance().getAnoMod();
      onChanged();
      return this;
    }
    /**
     * <code>string anoMod = 5;</code>
     */
    public Builder setAnoModBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      anoMod_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object preco_ = "";
    /**
     * <code>string preco = 6;</code>
     */
    public java.lang.String getPreco() {
      java.lang.Object ref = preco_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        preco_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string preco = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPrecoBytes() {
      java.lang.Object ref = preco_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        preco_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string preco = 6;</code>
     */
    public Builder setPreco(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      preco_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string preco = 6;</code>
     */
    public Builder clearPreco() {
      
      preco_ = getDefaultInstance().getPreco();
      onChanged();
      return this;
    }
    /**
     * <code>string preco = 6;</code>
     */
    public Builder setPrecoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      preco_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.Veiculo)
  }

  // @@protoc_insertion_point(class_scope:proto.Veiculo)
  private static final proto.Veiculo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.Veiculo();
  }

  public static proto.Veiculo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Veiculo>
      PARSER = new com.google.protobuf.AbstractParser<Veiculo>() {
    @java.lang.Override
    public Veiculo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Veiculo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Veiculo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Veiculo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.Veiculo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
