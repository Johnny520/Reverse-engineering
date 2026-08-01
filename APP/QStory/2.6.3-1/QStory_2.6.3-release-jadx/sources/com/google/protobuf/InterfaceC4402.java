package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4402 extends InterfaceC4274 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* bridge */ /* synthetic */ default InterfaceC4273 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ C4495 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    String getFullName();

    ByteString getFullNameBytes();

    /* synthetic */ String getInitializationErrorString();

    int getNumber();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    boolean getRepeated();

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    boolean getReserved();

    String getType();

    ByteString getTypeBytes();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    boolean hasFullName();

    boolean hasNumber();

    /* synthetic */ boolean hasOneof(C4426 c4426);

    boolean hasRepeated();

    boolean hasReserved();

    boolean hasType();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();
}
