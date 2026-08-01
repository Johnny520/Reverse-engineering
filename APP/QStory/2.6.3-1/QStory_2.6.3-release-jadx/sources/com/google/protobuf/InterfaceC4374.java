package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4374 extends InterfaceC4274 {
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

    String getEdition();

    ByteString getEditionBytes();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    /* synthetic */ String getInitializationErrorString();

    Method getMethods(int i);

    int getMethodsCount();

    List<Method> getMethodsList();

    InterfaceC4265 getMethodsOrBuilder(int i);

    List<? extends InterfaceC4265> getMethodsOrBuilderList();

    Mixin getMixins(int i);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    InterfaceC4199 getMixinsOrBuilder(int i);

    List<? extends InterfaceC4199> getMixinsOrBuilderList();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    InterfaceC4208 getOptionsOrBuilder(int i);

    List<? extends InterfaceC4208> getOptionsOrBuilderList();

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    SourceContext getSourceContext();

    InterfaceC4188 getSourceContextOrBuilder();

    Syntax getSyntax();

    int getSyntaxValue();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    String getVersion();

    ByteString getVersionBytes();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    /* synthetic */ boolean hasOneof(C4426 c4426);

    boolean hasSourceContext();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();
}
