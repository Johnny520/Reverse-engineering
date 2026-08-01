package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3492 extends InterfaceC3441 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* bridge */ /* synthetic */ default InterfaceC3440 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    String getDependency(int i);

    ByteString getDependencyBytes(int i);

    int getDependencyCount();

    List<String> getDependencyList();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ C3662 getDescriptorForType();

    DescriptorProtos$Edition getEdition();

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

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    /* synthetic */ String getInitializationErrorString();

    DescriptorProtos$DescriptorProto getMessageType(int i);

    int getMessageTypeCount();

    List<DescriptorProtos$DescriptorProto> getMessageTypeList();

    InterfaceC3571 getMessageTypeOrBuilder(int i);

    List<? extends InterfaceC3571> getMessageTypeOrBuilderList();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    String getOptionDependency(int i);

    ByteString getOptionDependencyBytes(int i);

    int getOptionDependencyCount();

    List<String> getOptionDependencyList();

    DescriptorProtos$FileOptions getOptions();

    InterfaceC3494 getOptionsOrBuilder();

    String getPackage();

    ByteString getPackageBytes();

    int getPublicDependency(int i);

    int getPublicDependencyCount();

    List<Integer> getPublicDependencyList();

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    DescriptorProtos$ServiceDescriptorProto getService(int i);

    int getServiceCount();

    List<DescriptorProtos$ServiceDescriptorProto> getServiceList();

    InterfaceC3489 getServiceOrBuilder(int i);

    List<? extends InterfaceC3489> getServiceOrBuilderList();

    DescriptorProtos$SourceCodeInfo getSourceCodeInfo();

    InterfaceC3649 getSourceCodeInfoOrBuilder();

    String getSyntax();

    ByteString getSyntaxBytes();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    int getWeakDependency(int i);

    int getWeakDependencyCount();

    List<Integer> getWeakDependencyList();

    boolean hasEdition();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    boolean hasName();

    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasOptions();

    boolean hasPackage();

    boolean hasSourceCodeInfo();

    boolean hasSyntax();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();
}
