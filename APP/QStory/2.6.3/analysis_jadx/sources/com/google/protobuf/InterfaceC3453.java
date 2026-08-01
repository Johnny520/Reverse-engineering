package com.google.protobuf;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏楪哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3453 extends InterfaceC3441, InterfaceC3442 {
    boolean equals(Object obj);

    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* bridge */ /* synthetic */ default InterfaceC3441 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ C3663 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    InterfaceC3375 getParserForType();

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    /* synthetic */ int getSerializedSize();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    /* synthetic */ boolean hasOneof(C3594 c3594);

    int hashCode();

    /* synthetic */ boolean isInitialized();

    @Override // 
    InterfaceC3454 newBuilderForType();

    @Override // 
    InterfaceC3454 toBuilder();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ byte[] toByteArray();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ ByteString toByteString();

    String toString();

    /* synthetic */ void writeDelimitedTo(OutputStream outputStream);

    /* synthetic */ void writeTo(AbstractC3462 abstractC3462);

    /* synthetic */ void writeTo(OutputStream outputStream);
}
