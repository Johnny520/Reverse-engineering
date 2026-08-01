package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3572 extends InterfaceC3442 {
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

    DescriptorProtos$EnumDescriptorProto getEnumType(int i);

    int getEnumTypeCount();

    List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList();

    InterfaceC3573 getEnumTypeOrBuilder(int i);

    List<? extends InterfaceC3573> getEnumTypeOrBuilderList();

    DescriptorProtos$FieldDescriptorProto getExtension(int i);

    int getExtensionCount();

    List<DescriptorProtos$FieldDescriptorProto> getExtensionList();

    InterfaceC3505 getExtensionOrBuilder(int i);

    List<? extends InterfaceC3505> getExtensionOrBuilderList();

    DescriptorProtos$DescriptorProto.ExtensionRange getExtensionRange(int i);

    int getExtensionRangeCount();

    List<DescriptorProtos$DescriptorProto.ExtensionRange> getExtensionRangeList();

    InterfaceC3460 getExtensionRangeOrBuilder(int i);

    List<? extends InterfaceC3460> getExtensionRangeOrBuilderList();

    DescriptorProtos$FieldDescriptorProto getField(int i);

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    int getFieldCount();

    List<DescriptorProtos$FieldDescriptorProto> getFieldList();

    InterfaceC3505 getFieldOrBuilder(int i);

    List<? extends InterfaceC3505> getFieldOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    String getName();

    ByteString getNameBytes();

    DescriptorProtos$DescriptorProto getNestedType(int i);

    int getNestedTypeCount();

    List<DescriptorProtos$DescriptorProto> getNestedTypeList();

    InterfaceC3572 getNestedTypeOrBuilder(int i);

    List<? extends InterfaceC3572> getNestedTypeOrBuilderList();

    DescriptorProtos$OneofDescriptorProto getOneofDecl(int i);

    int getOneofDeclCount();

    List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList();

    InterfaceC3489 getOneofDeclOrBuilder(int i);

    List<? extends InterfaceC3489> getOneofDeclOrBuilderList();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    DescriptorProtos$MessageOptions getOptions();

    InterfaceC3502 getOptionsOrBuilder();

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    String getReservedName(int i);

    ByteString getReservedNameBytes(int i);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$DescriptorProto.ReservedRange getReservedRange(int i);

    int getReservedRangeCount();

    List<DescriptorProtos$DescriptorProto.ReservedRange> getReservedRangeList();

    InterfaceC3457 getReservedRangeOrBuilder(int i);

    List<? extends InterfaceC3457> getReservedRangeOrBuilderList();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    DescriptorProtos$SymbolVisibility getVisibility();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    boolean hasName();

    /* synthetic */ boolean hasOneof(C3594 c3594);

    boolean hasOptions();

    boolean hasVisibility();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();
}
