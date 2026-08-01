package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3701 extends InterfaceC3441 {
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

    Field getFields(int i);

    int getFieldsCount();

    List<Field> getFieldsList();

    InterfaceC3687 getFieldsOrBuilder(int i);

    List<? extends InterfaceC3687> getFieldsOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    String getOneofs(int i);

    ByteString getOneofsBytes(int i);

    int getOneofsCount();

    List<String> getOneofsList();

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

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasSourceContext();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();
}
