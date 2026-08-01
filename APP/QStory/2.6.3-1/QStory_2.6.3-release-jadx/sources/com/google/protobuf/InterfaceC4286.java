package com.google.protobuf;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏楪子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4286 extends InterfaceC4282, InterfaceC4274 {
    InterfaceC4286 addRepeatedField(C4489 c4489, Object obj);

    @Override // 
    InterfaceC4285 build();

    @Override // 
    InterfaceC4285 buildPartial();

    @Override // 
    /* JADX INFO: renamed from: clear */
    InterfaceC4286 mo7901clear();

    InterfaceC4286 clearField(C4489 c4489);

    InterfaceC4286 clearOneof(C4426 c4426);

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    InterfaceC4286 mo7903clone();

    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* bridge */ /* synthetic */ default InterfaceC4273 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    C4495 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    InterfaceC4286 getFieldBuilder(C4489 c4489);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    InterfaceC4286 getRepeatedFieldBuilder(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    /* synthetic */ boolean hasOneof(C4426 c4426);

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();

    boolean mergeDelimitedFrom(InputStream inputStream);

    boolean mergeDelimitedFrom(InputStream inputStream, C4529 c4529);

    @Override // com.google.protobuf.InterfaceC4282
    /* synthetic */ InterfaceC4282 mergeFrom(InterfaceC4273 interfaceC4273);

    @Override // 
    InterfaceC4286 mergeFrom(ByteString byteString);

    @Override // com.google.protobuf.InterfaceC4282
    InterfaceC4286 mergeFrom(ByteString byteString, C4529 c4529);

    InterfaceC4286 mergeFrom(InterfaceC4285 interfaceC4285);

    @Override // 
    InterfaceC4286 mergeFrom(AbstractC4306 abstractC4306);

    @Override // 
    InterfaceC4286 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529);

    @Override // 
    InterfaceC4286 mergeFrom(InputStream inputStream);

    @Override // 
    InterfaceC4286 mergeFrom(InputStream inputStream, C4529 c4529);

    @Override // com.google.protobuf.InterfaceC4282
    InterfaceC4286 mergeFrom(byte[] bArr);

    @Override // 
    InterfaceC4286 mergeFrom(byte[] bArr, int i, int i2);

    @Override // 
    InterfaceC4286 mergeFrom(byte[] bArr, int i, int i2, C4529 c4529);

    @Override // 
    InterfaceC4286 mergeFrom(byte[] bArr, C4529 c4529);

    InterfaceC4286 mergeUnknownFields(C4536 c4536);

    InterfaceC4286 newBuilderForField(C4489 c4489);

    InterfaceC4286 setField(C4489 c4489, Object obj);

    InterfaceC4286 setRepeatedField(C4489 c4489, int i, Object obj);

    InterfaceC4286 setUnknownFields(C4536 c4536);
}
