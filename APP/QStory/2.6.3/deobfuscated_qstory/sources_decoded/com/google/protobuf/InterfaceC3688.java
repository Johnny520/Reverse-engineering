package com.google.protobuf;

import com.google.protobuf.Field;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏哲兰世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3688 extends InterfaceC3442 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    Field.Cardinality getCardinality();

    int getCardinalityValue();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* bridge */ /* synthetic */ default InterfaceC3441 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    String getDefaultValue();

    ByteString getDefaultValueBytes();

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ C3663 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    /* synthetic */ String getInitializationErrorString();

    String getJsonName();

    ByteString getJsonNameBytes();

    Field.Kind getKind();

    int getKindValue();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    int getOneofIndex();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    InterfaceC3376 getOptionsOrBuilder(int i);

    List<? extends InterfaceC3376> getOptionsOrBuilderList();

    boolean getPacked();

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    String getTypeUrl();

    ByteString getTypeUrlBytes();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    /* synthetic */ boolean hasOneof(C3594 c3594);

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();
}
