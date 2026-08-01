package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3571 extends InterfaceC3441 {
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

    DescriptorProtos$EnumDescriptorProto getEnumType(int i);

    int getEnumTypeCount();

    List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList();

    InterfaceC3572 getEnumTypeOrBuilder(int i);

    List<? extends InterfaceC3572> getEnumTypeOrBuilderList();

    DescriptorProtos$FieldDescriptorProto getExtension(int i);

    int getExtensionCount();

    List<DescriptorProtos$FieldDescriptorProto> getExtensionList();

    InterfaceC3504 getExtensionOrBuilder(int i);

    List<? extends InterfaceC3504> getExtensionOrBuilderList();

    DescriptorProtos$DescriptorProto.ExtensionRange getExtensionRange(int i);

    int getExtensionRangeCount();

    List<DescriptorProtos$DescriptorProto.ExtensionRange> getExtensionRangeList();

    InterfaceC3459 getExtensionRangeOrBuilder(int i);

    List<? extends InterfaceC3459> getExtensionRangeOrBuilderList();

    DescriptorProtos$FieldDescriptorProto getField(int i);

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    int getFieldCount();

    List<DescriptorProtos$FieldDescriptorProto> getFieldList();

    InterfaceC3504 getFieldOrBuilder(int i);

    List<? extends InterfaceC3504> getFieldOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    String getName();

    ByteString getNameBytes();

    DescriptorProtos$DescriptorProto getNestedType(int i);

    int getNestedTypeCount();

    List<DescriptorProtos$DescriptorProto> getNestedTypeList();

    InterfaceC3571 getNestedTypeOrBuilder(int i);

    List<? extends InterfaceC3571> getNestedTypeOrBuilderList();

    DescriptorProtos$OneofDescriptorProto getOneofDecl(int i);

    int getOneofDeclCount();

    List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList();

    InterfaceC3488 getOneofDeclOrBuilder(int i);

    List<? extends InterfaceC3488> getOneofDeclOrBuilderList();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    DescriptorProtos$MessageOptions getOptions();

    InterfaceC3501 getOptionsOrBuilder();

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    String getReservedName(int i);

    ByteString getReservedNameBytes(int i);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$DescriptorProto.ReservedRange getReservedRange(int i);

    int getReservedRangeCount();

    List<DescriptorProtos$DescriptorProto.ReservedRange> getReservedRangeList();

    InterfaceC3456 getReservedRangeOrBuilder(int i);

    List<? extends InterfaceC3456> getReservedRangeOrBuilderList();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

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
