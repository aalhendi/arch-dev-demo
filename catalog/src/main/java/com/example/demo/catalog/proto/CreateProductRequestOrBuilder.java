// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: src/main/resources/messages.proto
// Protobuf Java Version: 4.27.3

package com.example.demo.catalog.proto;

public interface CreateProductRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.demo.catalog.CreateProductRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sku = 1;</code>
   * @return The sku.
   */
  java.lang.String getSku();
  /**
   * <code>string sku = 1;</code>
   * @return The bytes for sku.
   */
  com.google.protobuf.ByteString
      getSkuBytes();

  /**
   * <code>bool is_enabled = 2;</code>
   * @return The isEnabled.
   */
  boolean getIsEnabled();

  /**
   * <code>repeated .com.example.demo.catalog.ProductAttribute attributes = 3;</code>
   */
  java.util.List<com.example.demo.catalog.proto.ProductAttribute> 
      getAttributesList();
  /**
   * <code>repeated .com.example.demo.catalog.ProductAttribute attributes = 3;</code>
   */
  com.example.demo.catalog.proto.ProductAttribute getAttributes(int index);
  /**
   * <code>repeated .com.example.demo.catalog.ProductAttribute attributes = 3;</code>
   */
  int getAttributesCount();
  /**
   * <code>repeated .com.example.demo.catalog.ProductAttribute attributes = 3;</code>
   */
  java.util.List<? extends com.example.demo.catalog.proto.ProductAttributeOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <code>repeated .com.example.demo.catalog.ProductAttribute attributes = 3;</code>
   */
  com.example.demo.catalog.proto.ProductAttributeOrBuilder getAttributesOrBuilder(
      int index);
}
