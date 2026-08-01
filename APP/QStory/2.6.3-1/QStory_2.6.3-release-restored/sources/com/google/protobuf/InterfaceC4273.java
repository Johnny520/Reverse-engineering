package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏哲子楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4273 extends InterfaceC4272 {
    InterfaceC4207 getParserForType();

    int getSerializedSize();

    InterfaceC4282 newBuilderForType();

    InterfaceC4282 toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(AbstractC4294 abstractC4294);
}
