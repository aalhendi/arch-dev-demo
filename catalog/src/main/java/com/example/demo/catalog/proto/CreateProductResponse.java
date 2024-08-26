// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: src/main/resources/messages.proto
// Protobuf Java Version: 4.27.3

package com.example.demo.catalog.proto;

/**
 * Protobuf type {@code com.example.demo.catalog.CreateProductResponse}
 */
public final class CreateProductResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.example.demo.catalog.CreateProductResponse)
    CreateProductResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      CreateProductResponse.class.getName());
  }
  // Use CreateProductResponse.newBuilder() to construct.
  private CreateProductResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateProductResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_CreateProductResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_CreateProductResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.demo.catalog.proto.CreateProductResponse.class, com.example.demo.catalog.proto.CreateProductResponse.Builder.class);
  }

  private int responseCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object response_;
  public enum ResponseCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PRODUCT(2),
    RESPONSE_NOT_SET(0);
    private final int value;
    private ResponseCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResponseCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResponseCase forNumber(int value) {
      switch (value) {
        case 2: return PRODUCT;
        case 0: return RESPONSE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResponseCase
  getResponseCase() {
    return ResponseCase.forNumber(
        responseCase_);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int PRODUCT_FIELD_NUMBER = 2;
  /**
   * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
   * @return Whether the product field is set.
   */
  @java.lang.Override
  public boolean hasProduct() {
    return responseCase_ == 2;
  }
  /**
   * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
   * @return The product.
   */
  @java.lang.Override
  public com.example.demo.catalog.proto.ProductDto getProduct() {
    if (responseCase_ == 2) {
       return (com.example.demo.catalog.proto.ProductDto) response_;
    }
    return com.example.demo.catalog.proto.ProductDto.getDefaultInstance();
  }
  /**
   * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
   */
  @java.lang.Override
  public com.example.demo.catalog.proto.ProductDtoOrBuilder getProductOrBuilder() {
    if (responseCase_ == 2) {
       return (com.example.demo.catalog.proto.ProductDto) response_;
    }
    return com.example.demo.catalog.proto.ProductDto.getDefaultInstance();
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (responseCase_ == 2) {
      output.writeMessage(2, (com.example.demo.catalog.proto.ProductDto) response_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (responseCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.example.demo.catalog.proto.ProductDto) response_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.demo.catalog.proto.CreateProductResponse)) {
      return super.equals(obj);
    }
    com.example.demo.catalog.proto.CreateProductResponse other = (com.example.demo.catalog.proto.CreateProductResponse) obj;

    if (getId()
        != other.getId()) return false;
    if (!getResponseCase().equals(other.getResponseCase())) return false;
    switch (responseCase_) {
      case 2:
        if (!getProduct()
            .equals(other.getProduct())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    switch (responseCase_) {
      case 2:
        hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
        hash = (53 * hash) + getProduct().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.demo.catalog.proto.CreateProductResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.demo.catalog.proto.CreateProductResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.example.demo.catalog.proto.CreateProductResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.demo.catalog.proto.CreateProductResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.demo.catalog.CreateProductResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.demo.catalog.CreateProductResponse)
      com.example.demo.catalog.proto.CreateProductResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_CreateProductResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_CreateProductResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.demo.catalog.proto.CreateProductResponse.class, com.example.demo.catalog.proto.CreateProductResponse.Builder.class);
    }

    // Construct using com.example.demo.catalog.proto.CreateProductResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = 0L;
      if (productBuilder_ != null) {
        productBuilder_.clear();
      }
      responseCase_ = 0;
      response_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_CreateProductResponse_descriptor;
    }

    @java.lang.Override
    public com.example.demo.catalog.proto.CreateProductResponse getDefaultInstanceForType() {
      return com.example.demo.catalog.proto.CreateProductResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.demo.catalog.proto.CreateProductResponse build() {
      com.example.demo.catalog.proto.CreateProductResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.demo.catalog.proto.CreateProductResponse buildPartial() {
      com.example.demo.catalog.proto.CreateProductResponse result = new com.example.demo.catalog.proto.CreateProductResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.demo.catalog.proto.CreateProductResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
    }

    private void buildPartialOneofs(com.example.demo.catalog.proto.CreateProductResponse result) {
      result.responseCase_ = responseCase_;
      result.response_ = this.response_;
      if (responseCase_ == 2 &&
          productBuilder_ != null) {
        result.response_ = productBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.demo.catalog.proto.CreateProductResponse) {
        return mergeFrom((com.example.demo.catalog.proto.CreateProductResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.demo.catalog.proto.CreateProductResponse other) {
      if (other == com.example.demo.catalog.proto.CreateProductResponse.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      switch (other.getResponseCase()) {
        case PRODUCT: {
          mergeProduct(other.getProduct());
          break;
        }
        case RESPONSE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getProductFieldBuilder().getBuilder(),
                  extensionRegistry);
              responseCase_ = 2;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int responseCase_ = 0;
    private java.lang.Object response_;
    public ResponseCase
        getResponseCase() {
      return ResponseCase.forNumber(
          responseCase_);
    }

    public Builder clearResponse() {
      responseCase_ = 0;
      response_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.example.demo.catalog.proto.ProductDto, com.example.demo.catalog.proto.ProductDto.Builder, com.example.demo.catalog.proto.ProductDtoOrBuilder> productBuilder_;
    /**
     * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
     * @return Whether the product field is set.
     */
    @java.lang.Override
    public boolean hasProduct() {
      return responseCase_ == 2;
    }
    /**
     * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
     * @return The product.
     */
    @java.lang.Override
    public com.example.demo.catalog.proto.ProductDto getProduct() {
      if (productBuilder_ == null) {
        if (responseCase_ == 2) {
          return (com.example.demo.catalog.proto.ProductDto) response_;
        }
        return com.example.demo.catalog.proto.ProductDto.getDefaultInstance();
      } else {
        if (responseCase_ == 2) {
          return productBuilder_.getMessage();
        }
        return com.example.demo.catalog.proto.ProductDto.getDefaultInstance();
      }
    }
    /**
     * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
     */
    public Builder setProduct(com.example.demo.catalog.proto.ProductDto value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }
      responseCase_ = 2;
      return this;
    }
    /**
     * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
     */
    public Builder setProduct(
        com.example.demo.catalog.proto.ProductDto.Builder builderForValue) {
      if (productBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 2;
      return this;
    }
    /**
     * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
     */
    public Builder mergeProduct(com.example.demo.catalog.proto.ProductDto value) {
      if (productBuilder_ == null) {
        if (responseCase_ == 2 &&
            response_ != com.example.demo.catalog.proto.ProductDto.getDefaultInstance()) {
          response_ = com.example.demo.catalog.proto.ProductDto.newBuilder((com.example.demo.catalog.proto.ProductDto) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 2) {
          productBuilder_.mergeFrom(value);
        } else {
          productBuilder_.setMessage(value);
        }
      }
      responseCase_ = 2;
      return this;
    }
    /**
     * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        if (responseCase_ == 2) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 2) {
          responseCase_ = 0;
          response_ = null;
        }
        productBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
     */
    public com.example.demo.catalog.proto.ProductDto.Builder getProductBuilder() {
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
     */
    @java.lang.Override
    public com.example.demo.catalog.proto.ProductDtoOrBuilder getProductOrBuilder() {
      if ((responseCase_ == 2) && (productBuilder_ != null)) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 2) {
          return (com.example.demo.catalog.proto.ProductDto) response_;
        }
        return com.example.demo.catalog.proto.ProductDto.getDefaultInstance();
      }
    }
    /**
     * <code>.com.example.demo.catalog.ProductDto product = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.example.demo.catalog.proto.ProductDto, com.example.demo.catalog.proto.ProductDto.Builder, com.example.demo.catalog.proto.ProductDtoOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        if (!(responseCase_ == 2)) {
          response_ = com.example.demo.catalog.proto.ProductDto.getDefaultInstance();
        }
        productBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.example.demo.catalog.proto.ProductDto, com.example.demo.catalog.proto.ProductDto.Builder, com.example.demo.catalog.proto.ProductDtoOrBuilder>(
                (com.example.demo.catalog.proto.ProductDto) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 2;
      onChanged();
      return productBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.example.demo.catalog.CreateProductResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.demo.catalog.CreateProductResponse)
  private static final com.example.demo.catalog.proto.CreateProductResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.demo.catalog.proto.CreateProductResponse();
  }

  public static com.example.demo.catalog.proto.CreateProductResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProductResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateProductResponse>() {
    @java.lang.Override
    public CreateProductResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreateProductResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProductResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.demo.catalog.proto.CreateProductResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

