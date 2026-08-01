package com.google.protobuf;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏楪子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3453 extends InterfaceC3449, InterfaceC3441 {
    InterfaceC3453 addRepeatedField(C3656 c3656, Object obj);

    @Override // 
    InterfaceC3452 build();

    @Override // 
    InterfaceC3452 buildPartial();

    @Override // 
    /* JADX INFO: renamed from: clear */
    InterfaceC3453 mo7355clear();

    InterfaceC3453 clearField(C3656 c3656);

    InterfaceC3453 clearOneof(C3593 c3593);

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    InterfaceC3453 mo7357clone();

    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* bridge */ /* synthetic */ default InterfaceC3440 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    C3662 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    InterfaceC3453 getFieldBuilder(C3656 c3656);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    InterfaceC3453 getRepeatedFieldBuilder(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    /* synthetic */ boolean hasOneof(C3593 c3593);

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();

    boolean mergeDelimitedFrom(InputStream inputStream);

    boolean mergeDelimitedFrom(InputStream inputStream, C3696 c3696);

    @Override // com.google.protobuf.InterfaceC3449
    /* synthetic */ InterfaceC3449 mergeFrom(InterfaceC3440 interfaceC3440);

    @Override // 
    InterfaceC3453 mergeFrom(ByteString byteString);

    @Override // com.google.protobuf.InterfaceC3449
    InterfaceC3453 mergeFrom(ByteString byteString, C3696 c3696);

    InterfaceC3453 mergeFrom(InterfaceC3452 interfaceC3452);

    @Override // 
    InterfaceC3453 mergeFrom(AbstractC3473 abstractC3473);

    @Override // 
    InterfaceC3453 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696);

    @Override // 
    InterfaceC3453 mergeFrom(InputStream inputStream);

    @Override // 
    InterfaceC3453 mergeFrom(InputStream inputStream, C3696 c3696);

    @Override // com.google.protobuf.InterfaceC3449
    InterfaceC3453 mergeFrom(byte[] bArr);

    @Override // 
    InterfaceC3453 mergeFrom(byte[] bArr, int i, int i2);

    @Override // 
    InterfaceC3453 mergeFrom(byte[] bArr, int i, int i2, C3696 c3696);

    @Override // 
    InterfaceC3453 mergeFrom(byte[] bArr, C3696 c3696);

    InterfaceC3453 mergeUnknownFields(C3703 c3703);

    InterfaceC3453 newBuilderForField(C3656 c3656);

    InterfaceC3453 setField(C3656 c3656, Object obj);

    InterfaceC3453 setRepeatedField(C3656 c3656, int i, Object obj);

    InterfaceC3453 setUnknownFields(C3703 c3703);
}
