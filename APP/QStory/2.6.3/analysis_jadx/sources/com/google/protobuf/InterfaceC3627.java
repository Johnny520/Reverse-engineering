package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲世兰苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3627 extends InterfaceC3442 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    InterfaceC3453 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ C3663 getDescriptorForType();

    default <T> T getExtension(AbstractC3579 abstractC3579) {
        return (T) getExtension((AbstractC3582) abstractC3579);
    }

    <T> T getExtension(AbstractC3582 abstractC3582);

    <T> T getExtension(AbstractC3582 abstractC3582, int i);

    default <T> int getExtensionCount(AbstractC3579 abstractC3579) {
        return getExtensionCount((AbstractC3582) abstractC3579);
    }

    <T> int getExtensionCount(AbstractC3582 abstractC3582);

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    default <T> boolean hasExtension(AbstractC3579 abstractC3579) {
        return hasExtension((AbstractC3582) abstractC3579);
    }

    <T> boolean hasExtension(AbstractC3582 abstractC3582);

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    /* synthetic */ boolean hasOneof(C3594 c3594);

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();

    default <T> T getExtension(C3616 c3616) {
        return (T) getExtension((AbstractC3582) c3616);
    }

    default <T> int getExtensionCount(C3616 c3616) {
        return getExtensionCount((AbstractC3582) c3616);
    }

    default <T> boolean hasExtension(C3616 c3616) {
        return hasExtension((AbstractC3582) c3616);
    }

    default <T> T getExtension(AbstractC3579 abstractC3579, int i) {
        return (T) getExtension((AbstractC3582) abstractC3579, i);
    }

    default <T> T getExtension(C3616 c3616, int i) {
        return (T) getExtension((AbstractC3582) c3616, i);
    }
}
