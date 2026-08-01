package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3490 extends InterfaceC3442 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* bridge */ /* synthetic */ default InterfaceC3441 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ C3663 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    /* synthetic */ String getInitializationErrorString();

    DescriptorProtos$MethodDescriptorProto getMethod(int i);

    int getMethodCount();

    List<DescriptorProtos$MethodDescriptorProto> getMethodList();

    InterfaceC3499 getMethodOrBuilder(int i);

    List<? extends InterfaceC3499> getMethodOrBuilderList();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    DescriptorProtos$ServiceOptions getOptions();

    InterfaceC3654 getOptionsOrBuilder();

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    boolean hasName();

    /* synthetic */ boolean hasOneof(C3594 c3594);

    boolean hasOptions();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();
}
