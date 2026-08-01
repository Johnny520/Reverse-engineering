package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3541 extends InterfaceC3441 {
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

    String getEdition();

    ByteString getEditionBytes();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    /* synthetic */ String getInitializationErrorString();

    Method getMethods(int i);

    int getMethodsCount();

    List<Method> getMethodsList();

    InterfaceC3432 getMethodsOrBuilder(int i);

    List<? extends InterfaceC3432> getMethodsOrBuilderList();

    Mixin getMixins(int i);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    InterfaceC3366 getMixinsOrBuilder(int i);

    List<? extends InterfaceC3366> getMixinsOrBuilderList();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    InterfaceC3375 getOptionsOrBuilder(int i);

    List<? extends InterfaceC3375> getOptionsOrBuilderList();

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    SourceContext getSourceContext();

    InterfaceC3355 getSourceContextOrBuilder();

    Syntax getSyntax();

    int getSyntaxValue();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    String getVersion();

    ByteString getVersionBytes();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasSourceContext();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();
}
