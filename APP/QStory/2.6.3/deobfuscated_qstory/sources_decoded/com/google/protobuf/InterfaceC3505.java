package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3505 extends InterfaceC3442 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

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

    String getExtendee();

    ByteString getExtendeeBytes();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    /* synthetic */ String getInitializationErrorString();

    String getJsonName();

    ByteString getJsonNameBytes();

    DescriptorProtos$FieldDescriptorProto.Label getLabel();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    int getOneofIndex();

    DescriptorProtos$FieldOptions getOptions();

    InterfaceC3515 getOptionsOrBuilder();

    boolean getProto3Optional();

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    DescriptorProtos$FieldDescriptorProto.Type getType();

    String getTypeName();

    ByteString getTypeNameBytes();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    boolean hasDefaultValue();

    boolean hasExtendee();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    boolean hasJsonName();

    boolean hasLabel();

    boolean hasName();

    boolean hasNumber();

    /* synthetic */ boolean hasOneof(C3594 c3594);

    boolean hasOneofIndex();

    boolean hasOptions();

    boolean hasProto3Optional();

    boolean hasType();

    boolean hasTypeName();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();
}
