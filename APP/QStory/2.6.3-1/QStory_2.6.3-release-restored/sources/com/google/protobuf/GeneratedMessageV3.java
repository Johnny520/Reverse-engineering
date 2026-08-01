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
    public static InterfaceC4227 mutableCopy(InterfaceC4227 interfaceC4227) {
        return (InterfaceC4227) GeneratedMessage.makeMutableCopy(interfaceC4227);
    }

    public static InterfaceC4444 newBooleanList() {
        return new C4367();
    }

    public static InterfaceC4232 newDoubleList() {
        return new C4423();
    }

    public static InterfaceC4228 newFloatList() {
        return new C4471();
    }

    public static InterfaceC4227 newIntList() {
        return new C4445();
    }

    public static InterfaceC4236 newLongList() {
        return new C4262();
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage
    @Deprecated
    public AbstractC4455 internalGetFieldAccessorTable() {
        throw new UnsupportedOperationException("Should be overridden in gencode.");
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4286 newBuilderForType();

    @Override // com.google.protobuf.AbstractC4365
    @Deprecated
    public InterfaceC4286 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return newBuilderForType((InterfaceC4457) new C4259(interfaceC4364));
    }

    @Deprecated
    public abstract InterfaceC4286 newBuilderForType(InterfaceC4457 interfaceC4457);

    @Deprecated
    public Object newInstance(AbstractC4454 abstractC4454) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public /* bridge */ /* synthetic */ InterfaceC4282 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4286 toBuilder();

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Deprecated
    public static abstract class ExtendableMessage<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessageV3 implements InterfaceC4452 {
        @Deprecated
        public ExtendableMessage() {
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        @Deprecated
        public AbstractC4455 internalGetFieldAccessorTable() {
            throw new UnsupportedOperationException("Should be overridden in gencode.");
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public /* bridge */ /* synthetic */ InterfaceC4282 newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public abstract /* synthetic */ InterfaceC4286 newBuilderForType();

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage
        @Deprecated
        public C4453 newExtensionWriter() {
            return new C4453(this, false);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage
        @Deprecated
        public C4453 newMessageSetExtensionWriter() {
            return new C4453(this, true);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public /* bridge */ /* synthetic */ InterfaceC4282 toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public abstract /* synthetic */ InterfaceC4286 toBuilder();

        @Deprecated
        public ExtendableMessage(AbstractC4139 abstractC4139) {
            super(abstractC4139);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
            return super.getExtension(abstractC4411, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
            return super.getExtensionCount(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
            return super.hasExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        @Deprecated
        public /* bridge */ /* synthetic */ C4451 internalGetFieldAccessorTable() {
            internalGetFieldAccessorTable();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageV3$飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC4139 extends AbstractC4140 implements InterfaceC4452 {
        @Deprecated
        public AbstractC4139() {
        }

        @Deprecated
        public <T> AbstractC4139 addExtension(C4448 c4448, T t) {
            return (AbstractC4139) addExtension((AbstractC4414) c4448, (Object) t);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4139 addRepeatedField(C4489 c4489, Object obj) {
            return (AbstractC4139) super.addRepeatedField(c4489, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 build() {
            return super.build();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 build();

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 buildPartial();

        @Deprecated
        public <T> AbstractC4139 clearExtension(C4448 c4448) {
            return (AbstractC4139) clearExtension((AbstractC4414) c4448);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4139 clearField(C4489 c4489) {
            return (AbstractC4139) super.clearField(c4489);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4139 clearOneof(C4426 c4426) {
            return (AbstractC4139) super.clearOneof(c4426);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Deprecated
        public final void mergeExtensionFields(ExtendableMessage<?> extendableMessage) {
            super.mergeExtensionFields((GeneratedMessage.ExtendableMessage<?>) extendableMessage);
        }

        @Deprecated
        public <T> AbstractC4139 setExtension(C4448 c4448, T t) {
            return (AbstractC4139) setExtension((AbstractC4414) c4448, (Object) t);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4139 setField(C4489 c4489, Object obj) {
            return (AbstractC4139) super.setField(c4489, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4139 setRepeatedField(C4489 c4489, int i, Object obj) {
            return (AbstractC4139) super.setRepeatedField(c4489, i, obj);
        }

        @Deprecated
        public AbstractC4139(InterfaceC4457 interfaceC4457) {
            super(interfaceC4457);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
            return super.getExtension(abstractC4411, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
            return super.getExtensionCount(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
            return super.hasExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.AbstractC4140, com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        @Deprecated
        public <T> AbstractC4139 setExtension(C4448 c4448, int i, T t) {
            return (AbstractC4139) setExtension((AbstractC4414) c4448, i, (Object) t);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageV3$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC4140 extends GeneratedMessage.AbstractC4136 {
        private C4456 meAsParent;

        @Deprecated
        public AbstractC4140() {
            super(null);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4140 addRepeatedField(C4489 c4489, Object obj) {
            return (AbstractC4140) super.addRepeatedField(c4489, obj);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 build() {
            return super.build();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 build();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 buildPartial();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        /* JADX INFO: renamed from: clear */
        public AbstractC4140 mo7901clear() {
            return (AbstractC4140) super.mo7901clear();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4140 clearField(C4489 c4489) {
            return (AbstractC4140) super.clearField(c4489);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4140 clearOneof(C4426 c4426) {
            return (AbstractC4140) super.clearOneof(c4426);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366
        @Deprecated
        /* JADX INFO: renamed from: clone */
        public AbstractC4140 mo7903clone() {
            return (AbstractC4140) super.mo7903clone();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        @Deprecated
        public InterfaceC4457 getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new C4456(this);
            }
            return this.meAsParent;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        @Deprecated
        public AbstractC4455 internalGetFieldAccessorTable() {
            throw new UnsupportedOperationException("Should be overridden in gencode.");
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4140 mergeUnknownFields(C4536 c4536) {
            return (AbstractC4140) super.mergeUnknownFields(c4536);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4140 setField(C4489 c4489, Object obj) {
            return (AbstractC4140) super.setField(c4489, obj);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4140 setRepeatedField(C4489 c4489, int i, Object obj) {
            return (AbstractC4140) super.setRepeatedField(c4489, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        @Deprecated
        public AbstractC4140 setUnknownFields(C4536 c4536) {
            return (AbstractC4140) super.setUnknownFields(c4536);
        }

        @Deprecated
        public AbstractC4140(InterfaceC4457 interfaceC4457) {
            super(interfaceC4457);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
            return super.getExtension(abstractC4411, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
            return super.getExtensionCount(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
            return super.hasExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        @Deprecated
        public /* bridge */ /* synthetic */ C4451 internalGetFieldAccessorTable() {
            internalGetFieldAccessorTable();
            return null;
        }
    }

    @Deprecated
    public GeneratedMessageV3(AbstractC4140 abstractC4140) {
        super(abstractC4140);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
        return super.getExtension(abstractC4411, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
        return super.getExtensionCount(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
        return super.hasExtension(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
        return super.getExtension(c4448);
    }

    @Deprecated
    public static InterfaceC4236 mutableCopy(InterfaceC4236 interfaceC4236) {
        return (InterfaceC4236) GeneratedMessage.makeMutableCopy(interfaceC4236);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
        return super.getExtension(c4448, i);
    }

    @Deprecated
    public static InterfaceC4228 mutableCopy(InterfaceC4228 interfaceC4228) {
        return (InterfaceC4228) GeneratedMessage.makeMutableCopy(interfaceC4228);
    }

    @Override // com.google.protobuf.GeneratedMessage
    @Deprecated
    public /* bridge */ /* synthetic */ C4451 internalGetFieldAccessorTable() {
        internalGetFieldAccessorTable();
        return null;
    }

    @Deprecated
    public static InterfaceC4232 mutableCopy(InterfaceC4232 interfaceC4232) {
        return (InterfaceC4232) GeneratedMessage.makeMutableCopy(interfaceC4232);
    }

    @Deprecated
    public static InterfaceC4444 mutableCopy(InterfaceC4444 interfaceC4444) {
        return (InterfaceC4444) GeneratedMessage.makeMutableCopy(interfaceC4444);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public /* bridge */ /* synthetic */ InterfaceC4282 newBuilderForType() {
        return super.newBuilderForType();
    }
}
