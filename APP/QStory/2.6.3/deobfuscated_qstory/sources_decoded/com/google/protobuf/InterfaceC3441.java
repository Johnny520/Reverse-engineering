package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏哲子楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3441 extends InterfaceC3440 {
    InterfaceC3375 getParserForType();

    int getSerializedSize();

    InterfaceC3450 newBuilderForType();

    InterfaceC3450 toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(AbstractC3462 abstractC3462);
}
