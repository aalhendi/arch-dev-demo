// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: src/main/resources/messages.proto
// Protobuf Java Version: 4.27.3

package com.example.demo.catalog.proto;

public interface RequestWrapperOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.demo.catalog.RequestWrapper)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.example.demo.catalog.CreateProductRequest create_product_request = 1;</code>
   * @return Whether the createProductRequest field is set.
   */
  boolean hasCreateProductRequest();
  /**
   * <code>.com.example.demo.catalog.CreateProductRequest create_product_request = 1;</code>
   * @return The createProductRequest.
   */
  com.example.demo.catalog.proto.CreateProductRequest getCreateProductRequest();
  /**
   * <code>.com.example.demo.catalog.CreateProductRequest create_product_request = 1;</code>
   */
  com.example.demo.catalog.proto.CreateProductRequestOrBuilder getCreateProductRequestOrBuilder();

  com.example.demo.catalog.proto.RequestWrapper.RequestCase getRequestCase();
}
