package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4505 extends InterfaceC4274 {
    /* synthetic */ List findInitializationErrors();

    String getAggregateValue();

    ByteString getAggregateValueBytes();

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

    double getDoubleValue();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    String getIdentifierValue();

    ByteString getIdentifierValueBytes();

    /* synthetic */ String getInitializationErrorString();

    DescriptorProtos$UninterpretedOption.NamePart getName(int i);

    int getNameCount();

    List<DescriptorProtos$UninterpretedOption.NamePart> getNameList();

    InterfaceC4504 getNameOrBuilder(int i);

    List<? extends InterfaceC4504> getNameOrBuilderList();

    long getNegativeIntValue();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    long getPositiveIntValue();

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    ByteString getStringValue();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    boolean hasAggregateValue();

    boolean hasDoubleValue();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    boolean hasIdentifierValue();

    boolean hasNegativeIntValue();

    /* synthetic */ boolean hasOneof(C4426 c4426);

    boolean hasPositiveIntValue();

    boolean hasStringValue();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();
}
