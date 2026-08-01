package com.google.protobuf;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏楪哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4285 extends InterfaceC4273, InterfaceC4274 {
    boolean equals(Object obj);

    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* bridge */ /* synthetic */ default InterfaceC4273 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ C4495 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    InterfaceC4207 getParserForType();

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    /* synthetic */ int getSerializedSize();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    /* synthetic */ boolean hasOneof(C4426 c4426);

    int hashCode();

    /* synthetic */ boolean isInitialized();

    @Override // 
    InterfaceC4286 newBuilderForType();

    @Override // 
    InterfaceC4286 toBuilder();

    @Override // com.google.protobuf.InterfaceC4273
    /* synthetic */ byte[] toByteArray();

    @Override // com.google.protobuf.InterfaceC4273
    /* synthetic */ ByteString toByteString();

    String toString();

    /* synthetic */ void writeDelimitedTo(OutputStream outputStream);

    /* synthetic */ void writeTo(AbstractC4294 abstractC4294);

    /* synthetic */ void writeTo(OutputStream outputStream);
}
