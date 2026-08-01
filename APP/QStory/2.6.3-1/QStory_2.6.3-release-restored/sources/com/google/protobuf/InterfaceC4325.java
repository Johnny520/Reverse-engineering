package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4325 extends InterfaceC4274 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* bridge */ /* synthetic */ default InterfaceC4273 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    String getDependency(int i);

    ByteString getDependencyBytes(int i);

    int getDependencyCount();

    List<String> getDependencyList();

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ C4495 getDescriptorForType();

    DescriptorProtos$Edition getEdition();

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

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    /* synthetic */ String getInitializationErrorString();

    DescriptorProtos$DescriptorProto getMessageType(int i);

    int getMessageTypeCount();

    List<DescriptorProtos$DescriptorProto> getMessageTypeList();

    InterfaceC4404 getMessageTypeOrBuilder(int i);

    List<? extends InterfaceC4404> getMessageTypeOrBuilderList();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    String getOptionDependency(int i);

    ByteString getOptionDependencyBytes(int i);

    int getOptionDependencyCount();

    List<String> getOptionDependencyList();

    DescriptorProtos$FileOptions getOptions();

    InterfaceC4327 getOptionsOrBuilder();

    String getPackage();

    ByteString getPackageBytes();

    int getPublicDependency(int i);

    int getPublicDependencyCount();

    List<Integer> getPublicDependencyList();

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    DescriptorProtos$ServiceDescriptorProto getService(int i);

    int getServiceCount();

    List<DescriptorProtos$ServiceDescriptorProto> getServiceList();

    InterfaceC4322 getServiceOrBuilder(int i);

    List<? extends InterfaceC4322> getServiceOrBuilderList();

    DescriptorProtos$SourceCodeInfo getSourceCodeInfo();

    InterfaceC4482 getSourceCodeInfoOrBuilder();

    String getSyntax();

    ByteString getSyntaxBytes();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    int getWeakDependency(int i);

    int getWeakDependencyCount();

    List<Integer> getWeakDependencyList();

    boolean hasEdition();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    boolean hasName();

    /* synthetic */ boolean hasOneof(C4426 c4426);

    boolean hasOptions();

    boolean hasPackage();

    boolean hasSourceCodeInfo();

    boolean hasSyntax();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();
}
