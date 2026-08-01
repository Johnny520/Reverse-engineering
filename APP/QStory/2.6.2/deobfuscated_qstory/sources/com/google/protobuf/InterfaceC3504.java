package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3504 extends InterfaceC3441 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* bridge */ /* synthetic */ default InterfaceC3440 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    String getDefaultValue();

    ByteString getDefaultValueBytes();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ C3662 getDescriptorForType();

    String getExtendee();

    ByteString getExtendeeBytes();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    /* synthetic */ String getInitializationErrorString();

    String getJsonName();

    ByteString getJsonNameBytes();

    DescriptorProtos$FieldDescriptorProto.Label getLabel();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    int getOneofIndex();

    DescriptorProtos$FieldOptions getOptions();

    InterfaceC3514 getOptionsOrBuilder();

    boolean getProto3Optional();

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    DescriptorProtos$FieldDescriptorProto.Type getType();

    String getTypeName();

    ByteString getTypeNameBytes();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    boolean hasDefaultValue();

    boolean hasExtendee();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    boolean hasJsonName();

    boolean hasLabel();

    boolean hasName();

    boolean hasNumber();

    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasOneofIndex();

    boolean hasOptions();

    boolean hasProto3Optional();

    boolean hasType();

    boolean hasTypeName();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();
}
