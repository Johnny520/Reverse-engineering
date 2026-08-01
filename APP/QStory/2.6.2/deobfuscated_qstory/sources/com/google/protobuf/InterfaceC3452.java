package com.google.protobuf;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏楪哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3452 extends InterfaceC3440, InterfaceC3441 {
    boolean equals(Object obj);

    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* bridge */ /* synthetic */ default InterfaceC3440 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ C3662 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    InterfaceC3374 getParserForType();

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    /* synthetic */ int getSerializedSize();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    /* synthetic */ boolean hasOneof(C3593 c3593);

    int hashCode();

    /* synthetic */ boolean isInitialized();

    @Override // 
    InterfaceC3453 newBuilderForType();

    @Override // 
    InterfaceC3453 toBuilder();

    @Override // com.google.protobuf.InterfaceC3440
    /* synthetic */ byte[] toByteArray();

    @Override // com.google.protobuf.InterfaceC3440
    /* synthetic */ ByteString toByteString();

    String toString();

    /* synthetic */ void writeDelimitedTo(OutputStream outputStream);

    /* synthetic */ void writeTo(AbstractC3461 abstractC3461);

    /* synthetic */ void writeTo(OutputStream outputStream);
}
