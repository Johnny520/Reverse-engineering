package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$MethodOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$MethodOptions> implements InterfaceC4332 {
    private static final DescriptorProtos$MethodOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int FEATURES_FIELD_NUMBER = 35;
    public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
    private static final InterfaceC4207 PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private int idempotencyLevel_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "MethodOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$MethodOptions();
        PARSER = new C4330();
    }

    private DescriptorProtos$MethodOptions() {
        this.deprecated_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.idempotencyLevel_ = 0;
        this.uninterpretedOption_ = Collections.EMPTY_LIST;
    }

    public static /* synthetic */ int access$28476(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions, int i) {
        int i2 = i | descriptorProtos$MethodOptions.bitField0_;
        descriptorProtos$MethodOptions.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$MethodOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11748;
    }

    public static C4119 newBuilder(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$MethodOptions);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MethodOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$MethodOptions)) {
            return super.equals(obj);
        }
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = (DescriptorProtos$MethodOptions) obj;
        if (hasDeprecated() != descriptorProtos$MethodOptions.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != descriptorProtos$MethodOptions.getDeprecated()) || hasIdempotencyLevel() != descriptorProtos$MethodOptions.hasIdempotencyLevel()) {
            return false;
        }
        if ((!hasIdempotencyLevel() || this.idempotencyLevel_ == descriptorProtos$MethodOptions.idempotencyLevel_) && hasFeatures() == descriptorProtos$MethodOptions.hasFeatures()) {
            return (!hasFeatures() || getFeatures().equals(descriptorProtos$MethodOptions.getFeatures())) && getUninterpretedOptionList().equals(descriptorProtos$MethodOptions.getUninterpretedOptionList()) && getUnknownFields().equals(descriptorProtos$MethodOptions.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$MethodOptions.getExtensionFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC4332
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11748;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4332
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC4332
    public InterfaceC4338 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC4332
    public IdempotencyLevel getIdempotencyLevel() {
        IdempotencyLevel idempotencyLevelForNumber = IdempotencyLevel.forNumber(this.idempotencyLevel_);
        return idempotencyLevelForNumber == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : idempotencyLevelForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM8193 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8193(33) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM8193 += AbstractC4294.m8191(34, this.idempotencyLevel_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM8193 += AbstractC4294.m8198(35, getFeatures());
        }
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iM8193 += AbstractC4294.m8202(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iM8193;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4332
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4332
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC4332
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4332
    public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4332
    public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4332
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4332
    public boolean hasFeatures() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4332
    public boolean hasIdempotencyLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasDeprecated()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 33, 53) + AbstractC4234.m8062(getDeprecated());
        }
        if (hasIdempotencyLevel()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 34, 53) + this.idempotencyLevel_;
        }
        if (hasFeatures()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 35, 53) + getFeatures().hashCode();
        }
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC4365.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11749;
        c4451.m8386(DescriptorProtos$MethodOptions.class, C4119.class);
        return c4451;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (hasFeatures() && !getFeatures().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getUninterpretedOptionCount(); i++) {
            if (!getUninterpretedOption(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4119 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4119(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4119 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4119() : new C4119().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        InterfaceC4461 interfaceC4461NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8222(33, this.deprecated_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8210(34, this.idempotencyLevel_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8208(35, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC4294.mo8208(999, this.uninterpretedOption_.get(i));
        }
        interfaceC4461NewExtensionSerializer.mo8387(536870912, abstractC4294);
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4119 extends GeneratedMessage.AbstractC4136 implements InterfaceC4332 {
        private int bitField0_;
        private boolean deprecated_;
        private C4174 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private int idempotencyLevel_;
        private C4195 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C4119() {
            this.idempotencyLevel_ = 0;
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$MethodOptions.deprecated_ = this.deprecated_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$MethodOptions.idempotencyLevel_ = this.idempotencyLevel_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C4174 c4174 = this.featuresBuilder_;
                descriptorProtos$MethodOptions.features_ = c4174 == null ? this.features_ : (DescriptorProtos$FeatureSet) c4174.m7943();
                i |= 4;
            }
            DescriptorProtos$MethodOptions.access$28476(descriptorProtos$MethodOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                descriptorProtos$MethodOptions.uninterpretedOption_ = c4195.m8031();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                this.bitField0_ &= -9;
            }
            descriptorProtos$MethodOptions.uninterpretedOption_ = this.uninterpretedOption_;
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 8;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11748;
        }

        private C4174 internalGetFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new C4174(getFeatures(), getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private C4195 internalGetUninterpretedOptionFieldBuilder() {
            if (this.uninterpretedOptionBuilder_ == null) {
                this.uninterpretedOptionBuilder_ = new C4195(this.uninterpretedOption_, getParentForChildren(), isClean());
                this.uninterpretedOption_ = null;
            }
            return this.uninterpretedOptionBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetFeaturesFieldBuilder();
                internalGetUninterpretedOptionFieldBuilder();
            }
        }

        public C4119 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
            onChanged();
            return this;
        }

        public <Type> C4119 addExtension(C4448 c4448, Type type) {
            return (C4119) addExtension((AbstractC4411) c4448, type);
        }

        public C4119 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C4127 c4127) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4127.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c4127.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$UninterpretedOption.C4127 addUninterpretedOptionBuilder() {
            return (DescriptorProtos$UninterpretedOption.C4127) internalGetUninterpretedOptionFieldBuilder().m8019(DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$MethodOptions build() {
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptionsBuildPartial = buildPartial();
            if (descriptorProtos$MethodOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$MethodOptionsBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$MethodOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$MethodOptions buildPartial() {
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = new DescriptorProtos$MethodOptions(this);
            buildPartialRepeatedFields(descriptorProtos$MethodOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$MethodOptions);
            }
            onBuilt();
            return descriptorProtos$MethodOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4119 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.deprecated_ = false;
            this.idempotencyLevel_ = 0;
            this.features_ = null;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.featuresBuilder_ = null;
            }
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -9;
            return this;
        }

        public C4119 clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        public <Type> C4119 clearExtension(C4448 c4448) {
            return (C4119) clearExtension((AbstractC4411) c4448);
        }

        public C4119 clearFeatures() {
            this.bitField0_ &= -5;
            this.features_ = null;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4119 clearIdempotencyLevel() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
            onChanged();
            return this;
        }

        public C4119 clearUninterpretedOption() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4332
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11748;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4332
        public DescriptorProtos$FeatureSet getFeatures() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$FeatureSet) c4174.m7939();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C4105 getFeaturesBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$FeatureSet.C4105) internalGetFeaturesFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4332
        public InterfaceC4338 getFeaturesOrBuilder() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (InterfaceC4338) c4174.m7938();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC4332
        public IdempotencyLevel getIdempotencyLevel() {
            IdempotencyLevel idempotencyLevelForNumber = IdempotencyLevel.forNumber(this.idempotencyLevel_);
            return idempotencyLevelForNumber == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : idempotencyLevelForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4332
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.get(i) : (DescriptorProtos$UninterpretedOption) c4195.m8025(i, false);
        }

        public DescriptorProtos$UninterpretedOption.C4127 getUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C4127) internalGetUninterpretedOptionFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$UninterpretedOption.C4127> getUninterpretedOptionBuilderList() {
            return internalGetUninterpretedOptionFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4332
        public int getUninterpretedOptionCount() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4332
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4332
        public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.get(i) : (InterfaceC4505) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4332
        public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC4332
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4332
        public boolean hasFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4332
        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11749;
            c4451.m8386(DescriptorProtos$MethodOptions.class, C4119.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            if (hasFeatures() && !getFeatures().isInitialized()) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    return false;
                }
            }
            return extensionsAreInitialized();
        }

        public C4119 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$FeatureSet);
            } else if ((this.bitField0_ & 4) == 0 || (descriptorProtos$FeatureSet2 = this.features_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                getFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
            }
            if (this.features_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public C4119 mergeFrom(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            if (descriptorProtos$MethodOptions == DescriptorProtos$MethodOptions.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$MethodOptions.hasDeprecated()) {
                setDeprecated(descriptorProtos$MethodOptions.getDeprecated());
            }
            if (descriptorProtos$MethodOptions.hasIdempotencyLevel()) {
                setIdempotencyLevel(descriptorProtos$MethodOptions.getIdempotencyLevel());
            }
            if (descriptorProtos$MethodOptions.hasFeatures()) {
                mergeFeatures(descriptorProtos$MethodOptions.getFeatures());
            }
            if (this.uninterpretedOptionBuilder_ == null) {
                if (!descriptorProtos$MethodOptions.uninterpretedOption_.isEmpty()) {
                    if (this.uninterpretedOption_.isEmpty()) {
                        this.uninterpretedOption_ = descriptorProtos$MethodOptions.uninterpretedOption_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureUninterpretedOptionIsMutable();
                        this.uninterpretedOption_.addAll(descriptorProtos$MethodOptions.uninterpretedOption_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$MethodOptions.uninterpretedOption_.isEmpty()) {
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11357.isEmpty();
                C4195 c4195 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$MethodOptions.uninterpretedOption_;
                    this.bitField0_ &= -9;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$MethodOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$MethodOptions);
            mergeUnknownFields(descriptorProtos$MethodOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C4119 removeUninterpretedOption(int i) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
            onChanged();
            return this;
        }

        public C4119 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public <Type> C4119 setExtension(C4448 c4448, Type type) {
            return (C4119) setExtension((AbstractC4411) c4448, type);
        }

        public C4119 setFeatures(DescriptorProtos$FeatureSet.C4105 c4105) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                this.features_ = c4105.build();
            } else {
                c4174.m7946(c4105.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4119 setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
            idempotencyLevel.getClass();
            this.bitField0_ |= 2;
            this.idempotencyLevel_ = idempotencyLevel.getNumber();
            onChanged();
            return this;
        }

        public C4119 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4127.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c4127.build());
            onChanged();
            return this;
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

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$MethodOptions getDefaultInstanceForType() {
            return DescriptorProtos$MethodOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public <Type> C4119 setExtension(C4448 c4448, int i, Type type) {
            return (C4119) setExtension((AbstractC4411) c4448, i, type);
        }

        public DescriptorProtos$UninterpretedOption.C4127 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C4127) internalGetUninterpretedOptionFieldBuilder().m8020(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        private C4119(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.idempotencyLevel_ = 0;
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public C4119 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C4119 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c4174.m7946(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4119 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.set(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C4119 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$UninterpretedOption);
            return this;
        }

        public C4119 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 == null) {
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, c4127.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4127.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4119 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$MethodOptions) {
                return mergeFrom((DescriptorProtos$MethodOptions) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4119 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 264) {
                                this.deprecated_ = abstractC4306.mo8279();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 272) {
                                int iMo8283 = abstractC4306.mo8283();
                                if (IdempotencyLevel.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(34, iMo8283);
                                } else {
                                    this.idempotencyLevel_ = iMo8283;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo8264 == 282) {
                                abstractC4306.mo8275(internalGetFeaturesFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 4;
                            } else if (iMo8264 != 7994) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC4306.mo8274(DescriptorProtos$UninterpretedOption.parser(), c4529);
                                C4195 c4195 = this.uninterpretedOptionBuilder_;
                                if (c4195 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c4195.m8017(descriptorProtos$UninterpretedOption);
                                }
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$MethodOptions getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
        return super.getExtension(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
        return super.getExtension(c4448, i);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4119 newBuilderForType() {
        return newBuilder();
    }

    public static C4119 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$MethodOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    private DescriptorProtos$MethodOptions(GeneratedMessage.AbstractC4136 abstractC4136) {
        super(abstractC4136);
        this.deprecated_ = false;
        this.idempotencyLevel_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$MethodOptions) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$MethodOptions) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum IdempotencyLevel implements InterfaceC4213 {
        IDEMPOTENCY_UNKNOWN(0),
        NO_SIDE_EFFECTS(1),
        IDEMPOTENT(2);

        public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
        public static final int IDEMPOTENT_VALUE = 2;
        public static final int NO_SIDE_EFFECTS_VALUE = 1;
        private static final IdempotencyLevel[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "IdempotencyLevel");
            internalValueMap = new C4333();
            VALUES = values();
        }

        IdempotencyLevel(int i) {
            this.value = i;
        }

        public static IdempotencyLevel forNumber(int i) {
            if (i == 0) {
                return IDEMPOTENCY_UNKNOWN;
            }
            if (i == 1) {
                return NO_SIDE_EFFECTS;
            }
            if (i != 2) {
                return null;
            }
            return IDEMPOTENT;
        }

        public static C4498 getDescriptor() {
            return DescriptorProtos$MethodOptions.getDescriptor().f11722[0];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static IdempotencyLevel valueOf(C4496 c4496) {
            if (c4496.f11729 == getDescriptor()) {
                return VALUES[c4496.f11730];
            }
            C6755.m11869("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C4498 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC4231
        public final int getNumber() {
            return this.value;
        }

        public final C4496 getValueDescriptor() {
            C4498 descriptor = getDescriptor();
            return descriptor.f11739[ordinal()];
        }

        @Deprecated
        public static IdempotencyLevel valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$MethodOptions) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$MethodOptions) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$MethodOptions parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$MethodOptions parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
