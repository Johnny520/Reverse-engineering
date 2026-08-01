package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏哲子楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3440 extends InterfaceC3439 {
    InterfaceC3374 getParserForType();

    int getSerializedSize();

    InterfaceC3449 newBuilderForType();

    InterfaceC3449 toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(AbstractC3461 abstractC3461);
}
