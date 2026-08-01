package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲世兰苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4459 extends InterfaceC4274 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    InterfaceC4285 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ C4495 getDescriptorForType();

    default <T> T getExtension(AbstractC4411 abstractC4411) {
        return (T) getExtension((AbstractC4414) abstractC4411);
    }

    <T> T getExtension(AbstractC4414 abstractC4414);

    <T> T getExtension(AbstractC4414 abstractC4414, int i);

    default <T> int getExtensionCount(AbstractC4411 abstractC4411) {
        return getExtensionCount((AbstractC4414) abstractC4411);
    }

    <T> int getExtensionCount(AbstractC4414 abstractC4414);

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    default <T> boolean hasExtension(AbstractC4411 abstractC4411) {
        return hasExtension((AbstractC4414) abstractC4411);
    }

    <T> boolean hasExtension(AbstractC4414 abstractC4414);

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    /* synthetic */ boolean hasOneof(C4426 c4426);

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();

    default <T> T getExtension(C4448 c4448) {
        return (T) getExtension((AbstractC4414) c4448);
    }

    default <T> int getExtensionCount(C4448 c4448) {
        return getExtensionCount((AbstractC4414) c4448);
    }

    default <T> boolean hasExtension(C4448 c4448) {
        return hasExtension((AbstractC4414) c4448);
    }

    default <T> T getExtension(AbstractC4411 abstractC4411, int i) {
        return (T) getExtension((AbstractC4414) abstractC4411, i);
    }

    default <T> T getExtension(C4448 c4448, int i) {
        return (T) getExtension((AbstractC4414) c4448, i);
    }
}
