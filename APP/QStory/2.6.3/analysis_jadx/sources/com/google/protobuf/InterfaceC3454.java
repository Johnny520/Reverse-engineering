package com.google.protobuf;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏楪子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3454 extends InterfaceC3450, InterfaceC3442 {
    InterfaceC3454 addRepeatedField(C3657 c3657, Object obj);

    @Override // 
    InterfaceC3453 build();

    @Override // 
    InterfaceC3453 buildPartial();

    @Override // 
    /* JADX INFO: renamed from: clear */
    InterfaceC3454 mo7342clear();

    InterfaceC3454 clearField(C3657 c3657);

    InterfaceC3454 clearOneof(C3594 c3594);

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    InterfaceC3454 mo7344clone();

    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* bridge */ /* synthetic */ default InterfaceC3441 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    C3663 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    InterfaceC3454 getFieldBuilder(C3657 c3657);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    InterfaceC3454 getRepeatedFieldBuilder(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    /* synthetic */ boolean hasOneof(C3594 c3594);

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();

    boolean mergeDelimitedFrom(InputStream inputStream);

    boolean mergeDelimitedFrom(InputStream inputStream, C3697 c3697);

    @Override // com.google.protobuf.InterfaceC3450
    /* synthetic */ InterfaceC3450 mergeFrom(InterfaceC3441 interfaceC3441);

    @Override // 
    InterfaceC3454 mergeFrom(ByteString byteString);

    @Override // com.google.protobuf.InterfaceC3450
    InterfaceC3454 mergeFrom(ByteString byteString, C3697 c3697);

    InterfaceC3454 mergeFrom(InterfaceC3453 interfaceC3453);

    @Override // 
    InterfaceC3454 mergeFrom(AbstractC3474 abstractC3474);

    @Override // 
    InterfaceC3454 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697);

    @Override // 
    InterfaceC3454 mergeFrom(InputStream inputStream);

    @Override // 
    InterfaceC3454 mergeFrom(InputStream inputStream, C3697 c3697);

    @Override // com.google.protobuf.InterfaceC3450
    InterfaceC3454 mergeFrom(byte[] bArr);

    @Override // 
    InterfaceC3454 mergeFrom(byte[] bArr, int i, int i2);

    @Override // 
    InterfaceC3454 mergeFrom(byte[] bArr, int i, int i2, C3697 c3697);

    @Override // 
    InterfaceC3454 mergeFrom(byte[] bArr, C3697 c3697);

    InterfaceC3454 mergeUnknownFields(C3704 c3704);

    InterfaceC3454 newBuilderForField(C3657 c3657);

    InterfaceC3454 setField(C3657 c3657, Object obj);

    InterfaceC3454 setRepeatedField(C3657 c3657, int i, Object obj);

    InterfaceC3454 setUnknownFields(C3704 c3704);
}
