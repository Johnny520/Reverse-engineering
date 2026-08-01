package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4534 extends InterfaceC4274 {
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

    Field getFields(int i);

    int getFieldsCount();

    List<Field> getFieldsList();

    InterfaceC4520 getFieldsOrBuilder(int i);

    List<? extends InterfaceC4520> getFieldsOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    String getOneofs(int i);

    ByteString getOneofsBytes(int i);

    int getOneofsCount();

    List<String> getOneofsList();

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

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    /* synthetic */ boolean hasOneof(C4426 c4426);

    boolean hasSourceContext();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();
}
