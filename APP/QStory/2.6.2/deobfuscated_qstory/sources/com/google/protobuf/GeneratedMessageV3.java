package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class GeneratedMessageV3 extends GeneratedMessage.ExtendableMessage<GeneratedMessageV3> {
    private static final long serialVersionUID = 1;

    @Deprecated
    public GeneratedMessageV3() {
    }

    @Deprecated
    public static InterfaceC3394 mutableCopy(InterfaceC3394 interfaceC3394) {
        return (InterfaceC3394) GeneratedMessage.makeMutableCopy(interfaceC3394);
    }

    public static InterfaceC3611 newBooleanList() {
        return new C3534();
    }

    public static InterfaceC3399 newDoubleList() {
        return new C3590();
    }

    public static InterfaceC3395 newFloatList() {
        return new C3638();
    }

    public static InterfaceC3394 newIntList() {
        return new C3612();
    }

    public static InterfaceC3403 newLongList() {
        return new C3429();
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
        return super.getExtension(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
        return super.getExtensionCount(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage
    @Deprecated
    public AbstractC3622 internalGetFieldAccessorTable() {
        throw new UnsupportedOperationException("Should be overridden in gencode.");
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3453 newBuilderForType();

    @Override // com.google.protobuf.AbstractC3532
    @Deprecated
    public InterfaceC3453 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return newBuilderForType((InterfaceC3624) new C3426(interfaceC3531));
    }

    @Deprecated
    public abstract InterfaceC3453 newBuilderForType(InterfaceC3624 interfaceC3624);

    @Deprecated
    public Object newInstance(AbstractC3621 abstractC3621) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3449 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3453 toBuilder();

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Deprecated
    public static abstract class ExtendableMessage<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessageV3 implements InterfaceC3619 {
        @Deprecated
        public ExtendableMessage() {
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        @Deprecated
        public AbstractC3622 internalGetFieldAccessorTable() {
            throw new UnsupportedOperationException("Should be overridden in gencode.");
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public /* bridge */ /* synthetic */ InterfaceC3449 newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public abstract /* synthetic */ InterfaceC3453 newBuilderForType();

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage
        @Deprecated
        public C3620 newExtensionWriter() {
            return new C3620(this, false);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage
        @Deprecated
        public C3620 newMessageSetExtensionWriter() {
            return new C3620(this, true);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public /* bridge */ /* synthetic */ InterfaceC3449 toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public abstract /* synthetic */ InterfaceC3453 toBuilder();

        @Deprecated
        public ExtendableMessage(AbstractC3306 abstractC3306) {
            super(abstractC3306);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
            return super.getExtension(abstractC3578, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
            return super.getExtensionCount(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
            return super.hasExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        @Deprecated
        public /* bridge */ /* synthetic */ C3618 internalGetFieldAccessorTable() {
            internalGetFieldAccessorTable();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageV3$飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class AbstractC3306 extends AbstractC3307 implements InterfaceC3619 {
        @Deprecated
        public AbstractC3306() {
        }

        @Deprecated
        public <T> AbstractC3306 addExtension(C3615 c3615, T t) {
            return (AbstractC3306) addExtension((AbstractC3581) c3615, (Object) t);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3306 addRepeatedField(C3656 c3656, Object obj) {
            return (AbstractC3306) super.addRepeatedField(c3656, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 build() {
            return super.build();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 build();

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 buildPartial();

        @Deprecated
        public <T> AbstractC3306 clearExtension(C3615 c3615) {
            return (AbstractC3306) clearExtension((AbstractC3581) c3615);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3306 clearField(C3656 c3656) {
            return (AbstractC3306) super.clearField(c3656);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3306 clearOneof(C3593 c3593) {
            return (AbstractC3306) super.clearOneof(c3593);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Deprecated
        public final void mergeExtensionFields(ExtendableMessage<?> extendableMessage) {
            super.mergeExtensionFields((GeneratedMessage.ExtendableMessage<?>) extendableMessage);
        }

        @Deprecated
        public <T> AbstractC3306 setExtension(C3615 c3615, T t) {
            return (AbstractC3306) setExtension((AbstractC3581) c3615, (Object) t);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3306 setField(C3656 c3656, Object obj) {
            return (AbstractC3306) super.setField(c3656, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3306 setRepeatedField(C3656 c3656, int i, Object obj) {
            return (AbstractC3306) super.setRepeatedField(c3656, i, obj);
        }

        @Deprecated
        public AbstractC3306(InterfaceC3624 interfaceC3624) {
            super(interfaceC3624);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
            return super.getExtension(abstractC3578, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
            return super.getExtensionCount(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
            return super.hasExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3307, com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        @Deprecated
        public <T> AbstractC3306 setExtension(C3615 c3615, int i, T t) {
            return (AbstractC3306) setExtension((AbstractC3581) c3615, i, (Object) t);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageV3$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class AbstractC3307 extends GeneratedMessage.AbstractC3303 {
        private C3623 meAsParent;

        @Deprecated
        public AbstractC3307() {
            super(null);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3307 addRepeatedField(C3656 c3656, Object obj) {
            return (AbstractC3307) super.addRepeatedField(c3656, obj);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 build() {
            return super.build();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 build();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 buildPartial();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        /* JADX INFO: renamed from: clear */
        public AbstractC3307 mo7355clear() {
            return (AbstractC3307) super.mo7355clear();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3307 clearField(C3656 c3656) {
            return (AbstractC3307) super.clearField(c3656);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3307 clearOneof(C3593 c3593) {
            return (AbstractC3307) super.clearOneof(c3593);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533
        @Deprecated
        /* JADX INFO: renamed from: clone */
        public AbstractC3307 mo7357clone() {
            return (AbstractC3307) super.mo7357clone();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        @Deprecated
        public InterfaceC3624 getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new C3623(this);
            }
            return this.meAsParent;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        @Deprecated
        public AbstractC3622 internalGetFieldAccessorTable() {
            throw new UnsupportedOperationException("Should be overridden in gencode.");
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3307 mergeUnknownFields(C3703 c3703) {
            return (AbstractC3307) super.mergeUnknownFields(c3703);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3307 setField(C3656 c3656, Object obj) {
            return (AbstractC3307) super.setField(c3656, obj);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3307 setRepeatedField(C3656 c3656, int i, Object obj) {
            return (AbstractC3307) super.setRepeatedField(c3656, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        @Deprecated
        public AbstractC3307 setUnknownFields(C3703 c3703) {
            return (AbstractC3307) super.setUnknownFields(c3703);
        }

        @Deprecated
        public AbstractC3307(InterfaceC3624 interfaceC3624) {
            super(interfaceC3624);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
            return super.getExtension(abstractC3578, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
            return super.getExtensionCount(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
            return super.hasExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        @Deprecated
        public /* bridge */ /* synthetic */ C3618 internalGetFieldAccessorTable() {
            internalGetFieldAccessorTable();
            return null;
        }
    }

    @Deprecated
    public GeneratedMessageV3(AbstractC3307 abstractC3307) {
        super(abstractC3307);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
        return super.getExtension(abstractC3578, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
        return super.getExtensionCount(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
        return super.hasExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
        return super.getExtension(c3615);
    }

    @Deprecated
    public static InterfaceC3403 mutableCopy(InterfaceC3403 interfaceC3403) {
        return (InterfaceC3403) GeneratedMessage.makeMutableCopy(interfaceC3403);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
        return super.getExtension(c3615, i);
    }

    @Deprecated
    public static InterfaceC3395 mutableCopy(InterfaceC3395 interfaceC3395) {
        return (InterfaceC3395) GeneratedMessage.makeMutableCopy(interfaceC3395);
    }

    @Override // com.google.protobuf.GeneratedMessage
    @Deprecated
    public /* bridge */ /* synthetic */ C3618 internalGetFieldAccessorTable() {
        internalGetFieldAccessorTable();
        return null;
    }

    @Deprecated
    public static InterfaceC3399 mutableCopy(InterfaceC3399 interfaceC3399) {
        return (InterfaceC3399) GeneratedMessage.makeMutableCopy(interfaceC3399);
    }

    @Deprecated
    public static InterfaceC3611 mutableCopy(InterfaceC3611 interfaceC3611) {
        return (InterfaceC3611) GeneratedMessage.makeMutableCopy(interfaceC3611);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3449 newBuilderForType() {
        return super.newBuilderForType();
    }
}
