// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: src/main/resources/messages.proto
// Protobuf Java Version: 4.27.3

package com.example.demo.catalog.proto;

/**
 * Protobuf type {@code com.example.demo.catalog.ProductAttribute}
 */
public final class ProductAttribute extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.example.demo.catalog.ProductAttribute)
    ProductAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      ProductAttribute.class.getName());
  }
  // Use ProductAttribute.newBuilder() to construct.
  private ProductAttribute(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ProductAttribute() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_ProductAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_ProductAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.demo.catalog.proto.ProductAttribute.class, com.example.demo.catalog.proto.ProductAttribute.Builder.class);
  }

  private int valueCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INT_VALUE(2),
    BIGINT_VALUE(3),
    DECIMAL_VALUE(4),
    VARCHAR_VALUE(5),
    BLOB_VALUE(6),
    DATETIME_VALUE(7),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 2: return INT_VALUE;
        case 3: return BIGINT_VALUE;
        case 4: return DECIMAL_VALUE;
        case 5: return VARCHAR_VALUE;
        case 6: return BLOB_VALUE;
        case 7: return DATETIME_VALUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int ATTRIBUTE_ID_FIELD_NUMBER = 1;
  private long attributeId_ = 0L;
  /**
   * <code>int64 attribute_id = 1;</code>
   * @return The attributeId.
   */
  @java.lang.Override
  public long getAttributeId() {
    return attributeId_;
  }

  public static final int INT_VALUE_FIELD_NUMBER = 2;
  /**
   * <code>int32 int_value = 2;</code>
   * @return Whether the intValue field is set.
   */
  @java.lang.Override
  public boolean hasIntValue() {
    return valueCase_ == 2;
  }
  /**
   * <code>int32 int_value = 2;</code>
   * @return The intValue.
   */
  @java.lang.Override
  public int getIntValue() {
    if (valueCase_ == 2) {
      return (java.lang.Integer) value_;
    }
    return 0;
  }

  public static final int BIGINT_VALUE_FIELD_NUMBER = 3;
  /**
   * <code>int64 bigint_value = 3;</code>
   * @return Whether the bigintValue field is set.
   */
  @java.lang.Override
  public boolean hasBigintValue() {
    return valueCase_ == 3;
  }
  /**
   * <code>int64 bigint_value = 3;</code>
   * @return The bigintValue.
   */
  @java.lang.Override
  public long getBigintValue() {
    if (valueCase_ == 3) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int DECIMAL_VALUE_FIELD_NUMBER = 4;
  /**
   * <code>double decimal_value = 4;</code>
   * @return Whether the decimalValue field is set.
   */
  @java.lang.Override
  public boolean hasDecimalValue() {
    return valueCase_ == 4;
  }
  /**
   * <code>double decimal_value = 4;</code>
   * @return The decimalValue.
   */
  @java.lang.Override
  public double getDecimalValue() {
    if (valueCase_ == 4) {
      return (java.lang.Double) value_;
    }
    return 0D;
  }

  public static final int VARCHAR_VALUE_FIELD_NUMBER = 5;
  /**
   * <code>string varchar_value = 5;</code>
   * @return Whether the varcharValue field is set.
   */
  public boolean hasVarcharValue() {
    return valueCase_ == 5;
  }
  /**
   * <code>string varchar_value = 5;</code>
   * @return The varcharValue.
   */
  public java.lang.String getVarcharValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 5) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 5) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string varchar_value = 5;</code>
   * @return The bytes for varcharValue.
   */
  public com.google.protobuf.ByteString
      getVarcharValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 5) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 5) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BLOB_VALUE_FIELD_NUMBER = 6;
  /**
   * <code>bytes blob_value = 6;</code>
   * @return Whether the blobValue field is set.
   */
  @java.lang.Override
  public boolean hasBlobValue() {
    return valueCase_ == 6;
  }
  /**
   * <code>bytes blob_value = 6;</code>
   * @return The blobValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBlobValue() {
    if (valueCase_ == 6) {
      return (com.google.protobuf.ByteString) value_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int DATETIME_VALUE_FIELD_NUMBER = 7;
  /**
   * <code>string datetime_value = 7;</code>
   * @return Whether the datetimeValue field is set.
   */
  public boolean hasDatetimeValue() {
    return valueCase_ == 7;
  }
  /**
   * <code>string datetime_value = 7;</code>
   * @return The datetimeValue.
   */
  public java.lang.String getDatetimeValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 7) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 7) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string datetime_value = 7;</code>
   * @return The bytes for datetimeValue.
   */
  public com.google.protobuf.ByteString
      getDatetimeValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 7) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 7) {
        value_ = b;
      }
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
    if (attributeId_ != 0L) {
      output.writeInt64(1, attributeId_);
    }
    if (valueCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 3) {
      output.writeInt64(
          3, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 4) {
      output.writeDouble(
          4, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 5) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, value_);
    }
    if (valueCase_ == 6) {
      output.writeBytes(
          6, (com.google.protobuf.ByteString) value_);
    }
    if (valueCase_ == 7) {
      com.google.protobuf.GeneratedMessage.writeString(output, 7, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attributeId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, attributeId_);
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            3, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            4, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 5) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, value_);
    }
    if (valueCase_ == 6) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            6, (com.google.protobuf.ByteString) value_);
    }
    if (valueCase_ == 7) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(7, value_);
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
    if (!(obj instanceof com.example.demo.catalog.proto.ProductAttribute)) {
      return super.equals(obj);
    }
    com.example.demo.catalog.proto.ProductAttribute other = (com.example.demo.catalog.proto.ProductAttribute) obj;

    if (getAttributeId()
        != other.getAttributeId()) return false;
    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 2:
        if (getIntValue()
            != other.getIntValue()) return false;
        break;
      case 3:
        if (getBigintValue()
            != other.getBigintValue()) return false;
        break;
      case 4:
        if (java.lang.Double.doubleToLongBits(getDecimalValue())
            != java.lang.Double.doubleToLongBits(
                other.getDecimalValue())) return false;
        break;
      case 5:
        if (!getVarcharValue()
            .equals(other.getVarcharValue())) return false;
        break;
      case 6:
        if (!getBlobValue()
            .equals(other.getBlobValue())) return false;
        break;
      case 7:
        if (!getDatetimeValue()
            .equals(other.getDatetimeValue())) return false;
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
    hash = (37 * hash) + ATTRIBUTE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAttributeId());
    switch (valueCase_) {
      case 2:
        hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getIntValue();
        break;
      case 3:
        hash = (37 * hash) + BIGINT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getBigintValue());
        break;
      case 4:
        hash = (37 * hash) + DECIMAL_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDecimalValue()));
        break;
      case 5:
        hash = (37 * hash) + VARCHAR_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getVarcharValue().hashCode();
        break;
      case 6:
        hash = (37 * hash) + BLOB_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getBlobValue().hashCode();
        break;
      case 7:
        hash = (37 * hash) + DATETIME_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getDatetimeValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.demo.catalog.proto.ProductAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.demo.catalog.proto.ProductAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.example.demo.catalog.proto.ProductAttribute parseFrom(
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
  public static Builder newBuilder(com.example.demo.catalog.proto.ProductAttribute prototype) {
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
   * Protobuf type {@code com.example.demo.catalog.ProductAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.demo.catalog.ProductAttribute)
      com.example.demo.catalog.proto.ProductAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_ProductAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_ProductAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.demo.catalog.proto.ProductAttribute.class, com.example.demo.catalog.proto.ProductAttribute.Builder.class);
    }

    // Construct using com.example.demo.catalog.proto.ProductAttribute.newBuilder()
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
      attributeId_ = 0L;
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.demo.catalog.proto.Messages.internal_static_com_example_demo_catalog_ProductAttribute_descriptor;
    }

    @java.lang.Override
    public com.example.demo.catalog.proto.ProductAttribute getDefaultInstanceForType() {
      return com.example.demo.catalog.proto.ProductAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.demo.catalog.proto.ProductAttribute build() {
      com.example.demo.catalog.proto.ProductAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.demo.catalog.proto.ProductAttribute buildPartial() {
      com.example.demo.catalog.proto.ProductAttribute result = new com.example.demo.catalog.proto.ProductAttribute(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.demo.catalog.proto.ProductAttribute result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attributeId_ = attributeId_;
      }
    }

    private void buildPartialOneofs(com.example.demo.catalog.proto.ProductAttribute result) {
      result.valueCase_ = valueCase_;
      result.value_ = this.value_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.demo.catalog.proto.ProductAttribute) {
        return mergeFrom((com.example.demo.catalog.proto.ProductAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.demo.catalog.proto.ProductAttribute other) {
      if (other == com.example.demo.catalog.proto.ProductAttribute.getDefaultInstance()) return this;
      if (other.getAttributeId() != 0L) {
        setAttributeId(other.getAttributeId());
      }
      switch (other.getValueCase()) {
        case INT_VALUE: {
          setIntValue(other.getIntValue());
          break;
        }
        case BIGINT_VALUE: {
          setBigintValue(other.getBigintValue());
          break;
        }
        case DECIMAL_VALUE: {
          setDecimalValue(other.getDecimalValue());
          break;
        }
        case VARCHAR_VALUE: {
          valueCase_ = 5;
          value_ = other.value_;
          onChanged();
          break;
        }
        case BLOB_VALUE: {
          setBlobValue(other.getBlobValue());
          break;
        }
        case DATETIME_VALUE: {
          valueCase_ = 7;
          value_ = other.value_;
          onChanged();
          break;
        }
        case VALUE_NOT_SET: {
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
              attributeId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              value_ = input.readInt32();
              valueCase_ = 2;
              break;
            } // case 16
            case 24: {
              value_ = input.readInt64();
              valueCase_ = 3;
              break;
            } // case 24
            case 33: {
              value_ = input.readDouble();
              valueCase_ = 4;
              break;
            } // case 33
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              valueCase_ = 5;
              value_ = s;
              break;
            } // case 42
            case 50: {
              value_ = input.readBytes();
              valueCase_ = 6;
              break;
            } // case 50
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();
              valueCase_ = 7;
              value_ = s;
              break;
            } // case 58
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
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private long attributeId_ ;
    /**
     * <code>int64 attribute_id = 1;</code>
     * @return The attributeId.
     */
    @java.lang.Override
    public long getAttributeId() {
      return attributeId_;
    }
    /**
     * <code>int64 attribute_id = 1;</code>
     * @param value The attributeId to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeId(long value) {

      attributeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 attribute_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attributeId_ = 0L;
      onChanged();
      return this;
    }

    /**
     * <code>int32 int_value = 2;</code>
     * @return Whether the intValue field is set.
     */
    public boolean hasIntValue() {
      return valueCase_ == 2;
    }
    /**
     * <code>int32 int_value = 2;</code>
     * @return The intValue.
     */
    public int getIntValue() {
      if (valueCase_ == 2) {
        return (java.lang.Integer) value_;
      }
      return 0;
    }
    /**
     * <code>int32 int_value = 2;</code>
     * @param value The intValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntValue(int value) {

      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 int_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int64 bigint_value = 3;</code>
     * @return Whether the bigintValue field is set.
     */
    public boolean hasBigintValue() {
      return valueCase_ == 3;
    }
    /**
     * <code>int64 bigint_value = 3;</code>
     * @return The bigintValue.
     */
    public long getBigintValue() {
      if (valueCase_ == 3) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }
    /**
     * <code>int64 bigint_value = 3;</code>
     * @param value The bigintValue to set.
     * @return This builder for chaining.
     */
    public Builder setBigintValue(long value) {

      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 bigint_value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBigintValue() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>double decimal_value = 4;</code>
     * @return Whether the decimalValue field is set.
     */
    public boolean hasDecimalValue() {
      return valueCase_ == 4;
    }
    /**
     * <code>double decimal_value = 4;</code>
     * @return The decimalValue.
     */
    public double getDecimalValue() {
      if (valueCase_ == 4) {
        return (java.lang.Double) value_;
      }
      return 0D;
    }
    /**
     * <code>double decimal_value = 4;</code>
     * @param value The decimalValue to set.
     * @return This builder for chaining.
     */
    public Builder setDecimalValue(double value) {

      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double decimal_value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDecimalValue() {
      if (valueCase_ == 4) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>string varchar_value = 5;</code>
     * @return Whether the varcharValue field is set.
     */
    @java.lang.Override
    public boolean hasVarcharValue() {
      return valueCase_ == 5;
    }
    /**
     * <code>string varchar_value = 5;</code>
     * @return The varcharValue.
     */
    @java.lang.Override
    public java.lang.String getVarcharValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 5) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 5) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string varchar_value = 5;</code>
     * @return The bytes for varcharValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getVarcharValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 5) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 5) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string varchar_value = 5;</code>
     * @param value The varcharValue to set.
     * @return This builder for chaining.
     */
    public Builder setVarcharValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string varchar_value = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearVarcharValue() {
      if (valueCase_ == 5) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string varchar_value = 5;</code>
     * @param value The bytes for varcharValue to set.
     * @return This builder for chaining.
     */
    public Builder setVarcharValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>bytes blob_value = 6;</code>
     * @return Whether the blobValue field is set.
     */
    public boolean hasBlobValue() {
      return valueCase_ == 6;
    }
    /**
     * <code>bytes blob_value = 6;</code>
     * @return The blobValue.
     */
    public com.google.protobuf.ByteString getBlobValue() {
      if (valueCase_ == 6) {
        return (com.google.protobuf.ByteString) value_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes blob_value = 6;</code>
     * @param value The blobValue to set.
     * @return This builder for chaining.
     */
    public Builder setBlobValue(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      valueCase_ = 6;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes blob_value = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlobValue() {
      if (valueCase_ == 6) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>string datetime_value = 7;</code>
     * @return Whether the datetimeValue field is set.
     */
    @java.lang.Override
    public boolean hasDatetimeValue() {
      return valueCase_ == 7;
    }
    /**
     * <code>string datetime_value = 7;</code>
     * @return The datetimeValue.
     */
    @java.lang.Override
    public java.lang.String getDatetimeValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 7) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 7) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string datetime_value = 7;</code>
     * @return The bytes for datetimeValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDatetimeValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 7) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 7) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string datetime_value = 7;</code>
     * @param value The datetimeValue to set.
     * @return This builder for chaining.
     */
    public Builder setDatetimeValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valueCase_ = 7;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string datetime_value = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDatetimeValue() {
      if (valueCase_ == 7) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string datetime_value = 7;</code>
     * @param value The bytes for datetimeValue to set.
     * @return This builder for chaining.
     */
    public Builder setDatetimeValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valueCase_ = 7;
      value_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.example.demo.catalog.ProductAttribute)
  }

  // @@protoc_insertion_point(class_scope:com.example.demo.catalog.ProductAttribute)
  private static final com.example.demo.catalog.proto.ProductAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.demo.catalog.proto.ProductAttribute();
  }

  public static com.example.demo.catalog.proto.ProductAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductAttribute>
      PARSER = new com.google.protobuf.AbstractParser<ProductAttribute>() {
    @java.lang.Override
    public ProductAttribute parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProductAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.demo.catalog.proto.ProductAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

