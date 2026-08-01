package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4405 extends InterfaceC4274 {
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

    /* synthetic */ String getInitializationErrorString();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    DescriptorProtos$EnumOptions getOptions();

    InterfaceC4390 getOptionsOrBuilder();

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    String getReservedName(int i);

    ByteString getReservedNameBytes(int i);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$EnumDescriptorProto.EnumReservedRange getReservedRange(int i);

    int getReservedRangeCount();

    List<DescriptorProtos$EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

    InterfaceC4408 getReservedRangeOrBuilder(int i);

    List<? extends InterfaceC4408> getReservedRangeOrBuilderList();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    DescriptorProtos$EnumValueDescriptorProto getValue(int i);

    int getValueCount();

    List<DescriptorProtos$EnumValueDescriptorProto> getValueList();

    InterfaceC4388 getValueOrBuilder(int i);

    List<? extends InterfaceC4388> getValueOrBuilderList();

    DescriptorProtos$SymbolVisibility getVisibility();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    boolean hasName();

    /* synthetic */ boolean hasOneof(C4426 c4426);

    boolean hasOptions();

    boolean hasVisibility();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();
}
