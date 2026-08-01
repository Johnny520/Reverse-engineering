package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲世兰苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3626 extends InterfaceC3441 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    InterfaceC3452 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ C3662 getDescriptorForType();

    default <T> T getExtension(AbstractC3578 abstractC3578) {
        return (T) getExtension((AbstractC3581) abstractC3578);
    }

    <T> T getExtension(AbstractC3581 abstractC3581);

    <T> T getExtension(AbstractC3581 abstractC3581, int i);

    default <T> int getExtensionCount(AbstractC3578 abstractC3578) {
        return getExtensionCount((AbstractC3581) abstractC3578);
    }

    <T> int getExtensionCount(AbstractC3581 abstractC3581);

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    default <T> boolean hasExtension(AbstractC3578 abstractC3578) {
        return hasExtension((AbstractC3581) abstractC3578);
    }

    <T> boolean hasExtension(AbstractC3581 abstractC3581);

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    /* synthetic */ boolean hasOneof(C3593 c3593);

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();

    default <T> T getExtension(C3615 c3615) {
        return (T) getExtension((AbstractC3581) c3615);
    }

    default <T> int getExtensionCount(C3615 c3615) {
        return getExtensionCount((AbstractC3581) c3615);
    }

    default <T> boolean hasExtension(C3615 c3615) {
        return hasExtension((AbstractC3581) c3615);
    }

    default <T> T getExtension(AbstractC3578 abstractC3578, int i) {
        return (T) getExtension((AbstractC3581) abstractC3578, i);
    }

    default <T> T getExtension(C3615 c3615, int i) {
        return (T) getExtension((AbstractC3581) c3615, i);
    }
}
