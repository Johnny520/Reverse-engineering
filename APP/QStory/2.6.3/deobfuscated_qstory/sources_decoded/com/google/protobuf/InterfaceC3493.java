package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3493 extends InterfaceC3442 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* bridge */ /* synthetic */ default InterfaceC3441 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    String getDependency(int i);

    ByteString getDependencyBytes(int i);

    int getDependencyCount();

    List<String> getDependencyList();

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ C3663 getDescriptorForType();

    DescriptorProtos$Edition getEdition();

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

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    /* synthetic */ String getInitializationErrorString();

    DescriptorProtos$DescriptorProto getMessageType(int i);

    int getMessageTypeCount();

    List<DescriptorProtos$DescriptorProto> getMessageTypeList();

    InterfaceC3572 getMessageTypeOrBuilder(int i);

    List<? extends InterfaceC3572> getMessageTypeOrBuilderList();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    String getOptionDependency(int i);

    ByteString getOptionDependencyBytes(int i);

    int getOptionDependencyCount();

    List<String> getOptionDependencyList();

    DescriptorProtos$FileOptions getOptions();

    InterfaceC3495 getOptionsOrBuilder();

    String getPackage();

    ByteString getPackageBytes();

    int getPublicDependency(int i);

    int getPublicDependencyCount();

    List<Integer> getPublicDependencyList();

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    DescriptorProtos$ServiceDescriptorProto getService(int i);

    int getServiceCount();

    List<DescriptorProtos$ServiceDescriptorProto> getServiceList();

    InterfaceC3490 getServiceOrBuilder(int i);

    List<? extends InterfaceC3490> getServiceOrBuilderList();

    DescriptorProtos$SourceCodeInfo getSourceCodeInfo();

    InterfaceC3650 getSourceCodeInfoOrBuilder();

    String getSyntax();

    ByteString getSyntaxBytes();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    int getWeakDependency(int i);

    int getWeakDependencyCount();

    List<Integer> getWeakDependencyList();

    boolean hasEdition();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    boolean hasName();

    /* synthetic */ boolean hasOneof(C3594 c3594);

    boolean hasOptions();

    boolean hasPackage();

    boolean hasSourceCodeInfo();

    boolean hasSyntax();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();
}
