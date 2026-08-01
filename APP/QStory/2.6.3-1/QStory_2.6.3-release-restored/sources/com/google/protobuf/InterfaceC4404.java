package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4404 extends InterfaceC4274 {
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

    DescriptorProtos$EnumDescriptorProto getEnumType(int i);

    int getEnumTypeCount();

    List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList();

    InterfaceC4405 getEnumTypeOrBuilder(int i);

    List<? extends InterfaceC4405> getEnumTypeOrBuilderList();

    DescriptorProtos$FieldDescriptorProto getExtension(int i);

    int getExtensionCount();

    List<DescriptorProtos$FieldDescriptorProto> getExtensionList();

    InterfaceC4337 getExtensionOrBuilder(int i);

    List<? extends InterfaceC4337> getExtensionOrBuilderList();

    DescriptorProtos$DescriptorProto.ExtensionRange getExtensionRange(int i);

    int getExtensionRangeCount();

    List<DescriptorProtos$DescriptorProto.ExtensionRange> getExtensionRangeList();

    InterfaceC4292 getExtensionRangeOrBuilder(int i);

    List<? extends InterfaceC4292> getExtensionRangeOrBuilderList();

    DescriptorProtos$FieldDescriptorProto getField(int i);

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    int getFieldCount();

    List<DescriptorProtos$FieldDescriptorProto> getFieldList();

    InterfaceC4337 getFieldOrBuilder(int i);

    List<? extends InterfaceC4337> getFieldOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    String getName();

    ByteString getNameBytes();

    DescriptorProtos$DescriptorProto getNestedType(int i);

    int getNestedTypeCount();

    List<DescriptorProtos$DescriptorProto> getNestedTypeList();

    InterfaceC4404 getNestedTypeOrBuilder(int i);

    List<? extends InterfaceC4404> getNestedTypeOrBuilderList();

    DescriptorProtos$OneofDescriptorProto getOneofDecl(int i);

    int getOneofDeclCount();

    List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList();

    InterfaceC4321 getOneofDeclOrBuilder(int i);

    List<? extends InterfaceC4321> getOneofDeclOrBuilderList();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    DescriptorProtos$MessageOptions getOptions();

    InterfaceC4334 getOptionsOrBuilder();

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    String getReservedName(int i);

    ByteString getReservedNameBytes(int i);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$DescriptorProto.ReservedRange getReservedRange(int i);

    int getReservedRangeCount();

    List<DescriptorProtos$DescriptorProto.ReservedRange> getReservedRangeList();

    InterfaceC4289 getReservedRangeOrBuilder(int i);

    List<? extends InterfaceC4289> getReservedRangeOrBuilderList();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

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
