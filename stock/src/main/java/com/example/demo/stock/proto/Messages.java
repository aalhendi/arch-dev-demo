// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: src/main/resources/messages.proto
// Protobuf Java Version: 4.27.3

package com.example.demo.stock.proto;

public final class Messages {
  private Messages() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      Messages.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_stock_RequestWrapper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_example_demo_stock_RequestWrapper_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_stock_UpsertStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_example_demo_stock_UpsertStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_stock_ReserveOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_example_demo_stock_ReserveOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_stock_ReserveItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_example_demo_stock_ReserveItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_stock_ResponseWrapper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_example_demo_stock_ResponseWrapper_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_stock_StockMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_example_demo_stock_StockMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_stock_ReserveOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_example_demo_stock_ReserveOrderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!src/main/resources/messages.proto\022\026com" +
      ".example.demo.stock\"\265\001\n\016RequestWrapper\022J" +
      "\n\024upsert_stock_request\030\001 \001(\0132*.com.examp" +
      "le.demo.stock.UpsertStockRequestH\000\022L\n\025re" +
      "serve_order_request\030\002 \001(\0132+.com.example." +
      "demo.stock.ReserveOrderRequestH\000B\t\n\007requ" +
      "est\"P\n\022UpsertStockRequest\022\022\n\nproduct_id\030" +
      "\001 \001(\003\022\024\n\014country_code\030\002 \001(\t\022\020\n\010quantity\030" +
      "\003 \001(\003\"I\n\023ReserveOrderRequest\0222\n\005items\030\001 " +
      "\003(\0132#.com.example.demo.stock.ReserveItem" +
      "\"I\n\013ReserveItem\022\022\n\nproduct_id\030\001 \001(\003\022\024\n\014c" +
      "ountry_code\030\002 \001(\t\022\020\n\010quantity\030\003 \001(\003\"\264\001\n\017" +
      "ResponseWrapper\022E\n\025upsert_stock_response" +
      "\030\001 \001(\0132$.com.example.demo.stock.StockMes" +
      "sageH\000\022N\n\026reserve_order_response\030\002 \001(\0132," +
      ".com.example.demo.stock.ReserveOrderResp" +
      "onseH\000B\n\n\010response\"Q\n\014StockMessage\022\022\n\npr" +
      "oduct_id\030\001 \001(\003\022\024\n\014country_code\030\002 \001(\t\022\027\n\017" +
      "available_stock\030\003 \001(\003\"]\n\024ReserveOrderRes" +
      "ponse\022\017\n\007success\030\001 \001(\010\0224\n\006stocks\030\002 \003(\0132$" +
      ".com.example.demo.stock.StockMessageB#\n\034" +
      "com.example.demo.stock.protoP\001\240\001\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_demo_stock_RequestWrapper_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_demo_stock_RequestWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_example_demo_stock_RequestWrapper_descriptor,
        new java.lang.String[] { "UpsertStockRequest", "ReserveOrderRequest", "Request", });
    internal_static_com_example_demo_stock_UpsertStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_demo_stock_UpsertStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_example_demo_stock_UpsertStockRequest_descriptor,
        new java.lang.String[] { "ProductId", "CountryCode", "Quantity", });
    internal_static_com_example_demo_stock_ReserveOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_demo_stock_ReserveOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_example_demo_stock_ReserveOrderRequest_descriptor,
        new java.lang.String[] { "Items", });
    internal_static_com_example_demo_stock_ReserveItem_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_demo_stock_ReserveItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_example_demo_stock_ReserveItem_descriptor,
        new java.lang.String[] { "ProductId", "CountryCode", "Quantity", });
    internal_static_com_example_demo_stock_ResponseWrapper_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_demo_stock_ResponseWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_example_demo_stock_ResponseWrapper_descriptor,
        new java.lang.String[] { "UpsertStockResponse", "ReserveOrderResponse", "Response", });
    internal_static_com_example_demo_stock_StockMessage_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_demo_stock_StockMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_example_demo_stock_StockMessage_descriptor,
        new java.lang.String[] { "ProductId", "CountryCode", "AvailableStock", });
    internal_static_com_example_demo_stock_ReserveOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_example_demo_stock_ReserveOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_example_demo_stock_ReserveOrderResponse_descriptor,
        new java.lang.String[] { "Success", "Stocks", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
