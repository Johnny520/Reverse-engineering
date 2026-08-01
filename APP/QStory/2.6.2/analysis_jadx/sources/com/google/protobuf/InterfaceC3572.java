package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3572 extends InterfaceC3441 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* bridge */ /* synthetic */ default InterfaceC3440 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ C3662 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    /* synthetic */ String getInitializationErrorString();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    DescriptorProtos$EnumOptions getOptions();

    InterfaceC3557 getOptionsOrBuilder();

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    String getReservedName(int i);

    ByteString getReservedNameBytes(int i);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$EnumDescriptorProto.EnumReservedRange getReservedRange(int i);

    int getReservedRangeCount();

    List<DescriptorProtos$EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

    InterfaceC3575 getReservedRangeOrBuilder(int i);

    List<? extends InterfaceC3575> getReservedRangeOrBuilderList();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    DescriptorProtos$EnumValueDescriptorProto getValue(int i);

    int getValueCount();

    List<DescriptorProtos$EnumValueDescriptorProto> getValueList();

    InterfaceC3555 getValueOrBuilder(int i);

    List<? extends InterfaceC3555> getValueOrBuilderList();

    DescriptorProtos$SymbolVisibility getVisibility();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    boolean hasName();

    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasOptions();

    boolean hasVisibility();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();
}
