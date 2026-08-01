package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3673 extends InterfaceC3442 {
    /* synthetic */ List findInitializationErrors();

    String getAggregateValue();

    ByteString getAggregateValueBytes();

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

    double getDoubleValue();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    String getIdentifierValue();

    ByteString getIdentifierValueBytes();

    /* synthetic */ String getInitializationErrorString();

    DescriptorProtos$UninterpretedOption.NamePart getName(int i);

    int getNameCount();

    List<DescriptorProtos$UninterpretedOption.NamePart> getNameList();

    InterfaceC3672 getNameOrBuilder(int i);

    List<? extends InterfaceC3672> getNameOrBuilderList();

    long getNegativeIntValue();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    long getPositiveIntValue();

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    ByteString getStringValue();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    boolean hasAggregateValue();

    boolean hasDoubleValue();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    boolean hasIdentifierValue();

    boolean hasNegativeIntValue();

    /* synthetic */ boolean hasOneof(C3594 c3594);

    boolean hasPositiveIntValue();

    boolean hasStringValue();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();
}
