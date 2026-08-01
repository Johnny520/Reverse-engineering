package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class GeneratedMessageV3 extends GeneratedMessage.ExtendableMessage<GeneratedMessageV3> {
    private static final long serialVersionUID = 1;

    @Deprecated
    public GeneratedMessageV3() {
    }

    @Deprecated
    public static InterfaceC3395 mutableCopy(InterfaceC3395 interfaceC3395) {
        return (InterfaceC3395) GeneratedMessage.makeMutableCopy(interfaceC3395);
    }

    public static InterfaceC3612 newBooleanList() {
        return new C3535();
    }

    public static InterfaceC3400 newDoubleList() {
        return new C3591();
    }

    public static InterfaceC3396 newFloatList() {
        return new C3639();
    }

    public static InterfaceC3395 newIntList() {
        return new C3613();
    }

    public static InterfaceC3404 newLongList() {
        return new C3430();
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage
    @Deprecated
    public AbstractC3623 internalGetFieldAccessorTable() {
        throw new UnsupportedOperationException("Should be overridden in gencode.");
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3454 newBuilderForType();

    @Override // com.google.protobuf.AbstractC3533
    @Deprecated
    public InterfaceC3454 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return newBuilderForType((InterfaceC3625) new C3427(interfaceC3532));
    }

    @Deprecated
    public abstract InterfaceC3454 newBuilderForType(InterfaceC3625 interfaceC3625);

    @Deprecated
    public Object newInstance(AbstractC3622 abstractC3622) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public /* bridge */ /* synthetic */ InterfaceC3450 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3454 toBuilder();

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Deprecated
    public static abstract class ExtendableMessage<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessageV3 implements InterfaceC3620 {
        @Deprecated
        public ExtendableMessage() {
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        @Deprecated
        public AbstractC3623 internalGetFieldAccessorTable() {
            throw new UnsupportedOperationException("Should be overridden in gencode.");
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3450 newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3454 newBuilderForType();

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage
        @Deprecated
        public C3621 newExtensionWriter() {
            return new C3621(this, false);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage
        @Deprecated
        public C3621 newMessageSetExtensionWriter() {
            return new C3621(this, true);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3450 toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3454 toBuilder();

        @Deprecated
        public ExtendableMessage(AbstractC3307 abstractC3307) {
            super(abstractC3307);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
            return super.getExtension(abstractC3579, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
            return super.getExtensionCount(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
            return super.hasExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        @Deprecated
        public /* bridge */ /* synthetic */ C3619 internalGetFieldAccessorTable() {
            internalGetFieldAccessorTable();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageV3$飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC3307 extends AbstractC3308 implements InterfaceC3620 {
        @Deprecated
        public AbstractC3307() {
        }

        @Deprecated
        public <T> AbstractC3307 addExtension(C3616 c3616, T t) {
            return (AbstractC3307) addExtension((AbstractC3582) c3616, (Object) t);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3307 addRepeatedField(C3657 c3657, Object obj) {
            return (AbstractC3307) super.addRepeatedField(c3657, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 build() {
            return super.build();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 build();

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 buildPartial();

        @Deprecated
        public <T> AbstractC3307 clearExtension(C3616 c3616) {
            return (AbstractC3307) clearExtension((AbstractC3582) c3616);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3307 clearField(C3657 c3657) {
            return (AbstractC3307) super.clearField(c3657);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3307 clearOneof(C3594 c3594) {
            return (AbstractC3307) super.clearOneof(c3594);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Deprecated
        public final void mergeExtensionFields(ExtendableMessage<?> extendableMessage) {
            super.mergeExtensionFields((GeneratedMessage.ExtendableMessage<?>) extendableMessage);
        }

        @Deprecated
        public <T> AbstractC3307 setExtension(C3616 c3616, T t) {
            return (AbstractC3307) setExtension((AbstractC3582) c3616, (Object) t);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3307 setField(C3657 c3657, Object obj) {
            return (AbstractC3307) super.setField(c3657, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3307 setRepeatedField(C3657 c3657, int i, Object obj) {
            return (AbstractC3307) super.setRepeatedField(c3657, i, obj);
        }

        @Deprecated
        public AbstractC3307(InterfaceC3625 interfaceC3625) {
            super(interfaceC3625);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
            return super.getExtension(abstractC3579, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
            return super.getExtensionCount(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
            return super.hasExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC3308, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        @Deprecated
        public <T> AbstractC3307 setExtension(C3616 c3616, int i, T t) {
            return (AbstractC3307) setExtension((AbstractC3582) c3616, i, (Object) t);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageV3$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC3308 extends GeneratedMessage.AbstractC3304 {
        private C3624 meAsParent;

        @Deprecated
        public AbstractC3308() {
            super(null);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3308 addRepeatedField(C3657 c3657, Object obj) {
            return (AbstractC3308) super.addRepeatedField(c3657, obj);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 build() {
            return super.build();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 build();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 buildPartial();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        /* JADX INFO: renamed from: clear */
        public AbstractC3308 mo7342clear() {
            return (AbstractC3308) super.mo7342clear();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3308 clearField(C3657 c3657) {
            return (AbstractC3308) super.clearField(c3657);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3308 clearOneof(C3594 c3594) {
            return (AbstractC3308) super.clearOneof(c3594);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534
        @Deprecated
        /* JADX INFO: renamed from: clone */
        public AbstractC3308 mo7344clone() {
            return (AbstractC3308) super.mo7344clone();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        @Deprecated
        public InterfaceC3625 getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new C3624(this);
            }
            return this.meAsParent;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        @Deprecated
        public AbstractC3623 internalGetFieldAccessorTable() {
            throw new UnsupportedOperationException("Should be overridden in gencode.");
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3308 mergeUnknownFields(C3704 c3704) {
            return (AbstractC3308) super.mergeUnknownFields(c3704);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3308 setField(C3657 c3657, Object obj) {
            return (AbstractC3308) super.setField(c3657, obj);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3308 setRepeatedField(C3657 c3657, int i, Object obj) {
            return (AbstractC3308) super.setRepeatedField(c3657, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        @Deprecated
        public AbstractC3308 setUnknownFields(C3704 c3704) {
            return (AbstractC3308) super.setUnknownFields(c3704);
        }

        @Deprecated
        public AbstractC3308(InterfaceC3625 interfaceC3625) {
            super(interfaceC3625);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
            return super.getExtension(abstractC3579, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
            return super.getExtensionCount(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
            return super.hasExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        @Deprecated
        public /* bridge */ /* synthetic */ C3619 internalGetFieldAccessorTable() {
            internalGetFieldAccessorTable();
            return null;
        }
    }

    @Deprecated
    public GeneratedMessageV3(AbstractC3308 abstractC3308) {
        super(abstractC3308);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
        return super.getExtension(abstractC3579, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
        return super.getExtensionCount(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
        return super.hasExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
        return super.getExtension(c3616);
    }

    @Deprecated
    public static InterfaceC3404 mutableCopy(InterfaceC3404 interfaceC3404) {
        return (InterfaceC3404) GeneratedMessage.makeMutableCopy(interfaceC3404);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
        return super.getExtension(c3616, i);
    }

    @Deprecated
    public static InterfaceC3396 mutableCopy(InterfaceC3396 interfaceC3396) {
        return (InterfaceC3396) GeneratedMessage.makeMutableCopy(interfaceC3396);
    }

    @Override // com.google.protobuf.GeneratedMessage
    @Deprecated
    public /* bridge */ /* synthetic */ C3619 internalGetFieldAccessorTable() {
        internalGetFieldAccessorTable();
        return null;
    }

    @Deprecated
    public static InterfaceC3400 mutableCopy(InterfaceC3400 interfaceC3400) {
        return (InterfaceC3400) GeneratedMessage.makeMutableCopy(interfaceC3400);
    }

    @Deprecated
    public static InterfaceC3612 mutableCopy(InterfaceC3612 interfaceC3612) {
        return (InterfaceC3612) GeneratedMessage.makeMutableCopy(interfaceC3612);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public /* bridge */ /* synthetic */ InterfaceC3450 newBuilderForType() {
        return super.newBuilderForType();
    }
}
