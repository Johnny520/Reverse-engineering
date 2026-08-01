package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4337 extends InterfaceC4274 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* bridge */ /* synthetic */ default InterfaceC4273 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    String getDefaultValue();

    ByteString getDefaultValueBytes();

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ C4495 getDescriptorForType();

    String getExtendee();

    ByteString getExtendeeBytes();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    /* synthetic */ String getInitializationErrorString();

    String getJsonName();

    ByteString getJsonNameBytes();

    DescriptorProtos$FieldDescriptorProto.Label getLabel();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    int getOneofIndex();

    DescriptorProtos$FieldOptions getOptions();

    InterfaceC4347 getOptionsOrBuilder();

    boolean getProto3Optional();

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    DescriptorProtos$FieldDescriptorProto.Type getType();

    String getTypeName();

    ByteString getTypeNameBytes();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    boolean hasDefaultValue();

    boolean hasExtendee();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    boolean hasJsonName();

    boolean hasLabel();

    boolean hasName();

    boolean hasNumber();

    /* synthetic */ boolean hasOneof(C4426 c4426);

    boolean hasOneofIndex();

    boolean hasOptions();

    boolean hasProto3Optional();

    boolean hasType();

    boolean hasTypeName();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();
}
