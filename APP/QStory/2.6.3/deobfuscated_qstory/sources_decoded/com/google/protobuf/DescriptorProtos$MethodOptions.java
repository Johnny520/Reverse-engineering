package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$MethodOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$MethodOptions> implements InterfaceC3500 {
    private static final DescriptorProtos$MethodOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int FEATURES_FIELD_NUMBER = 35;
    public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
    private static final InterfaceC3375 PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private int idempotencyLevel_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "MethodOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$MethodOptions();
        PARSER = new C3498();
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

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11403;
    }

    public static C3287 newBuilder(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$MethodOptions);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MethodOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.InterfaceC3500
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11403;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3500
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3500
    public InterfaceC3506 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3500
    public IdempotencyLevel getIdempotencyLevel() {
        IdempotencyLevel idempotencyLevelForNumber = IdempotencyLevel.forNumber(this.idempotencyLevel_);
        return idempotencyLevelForNumber == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : idempotencyLevelForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7634 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7634(33) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7634 += AbstractC3462.m7632(34, this.idempotencyLevel_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7634 += AbstractC3462.m7639(35, getFeatures());
        }
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iM7634 += AbstractC3462.m7643(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iM7634;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3500
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3500
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3500
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3500
    public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3500
    public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3500
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3500
    public boolean hasFeatures() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3500
    public boolean hasIdempotencyLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasDeprecated()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 33, 53) + AbstractC3402.m7503(getDeprecated());
        }
        if (hasIdempotencyLevel()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 34, 53) + this.idempotencyLevel_;
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 35, 53) + getFeatures().hashCode();
        }
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3533.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11404;
        c3619.m7827(DescriptorProtos$MethodOptions.class, C3287.class);
        return c3619;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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

    @Override // com.google.protobuf.AbstractC3533
    public C3287 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3287(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3287 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3287() : new C3287().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7663(33, this.deprecated_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7651(34, this.idempotencyLevel_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7649(35, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC3462.mo7649(999, this.uninterpretedOption_.get(i));
        }
        interfaceC3629NewExtensionSerializer.mo7828(536870912, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3287 extends GeneratedMessage.AbstractC3304 implements InterfaceC3500 {
        private int bitField0_;
        private boolean deprecated_;
        private C3342 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private int idempotencyLevel_;
        private C3363 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C3287() {
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
                C3342 c3342 = this.featuresBuilder_;
                descriptorProtos$MethodOptions.features_ = c3342 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3342.m7384();
                i |= 4;
            }
            DescriptorProtos$MethodOptions.access$28476(descriptorProtos$MethodOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                descriptorProtos$MethodOptions.uninterpretedOption_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11403;
        }

        private C3342 internalGetFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new C3342(getFeatures(), getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private C3363 internalGetUninterpretedOptionFieldBuilder() {
            if (this.uninterpretedOptionBuilder_ == null) {
                this.uninterpretedOptionBuilder_ = new C3363(this.uninterpretedOption_, getParentForChildren(), isClean());
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

        public C3287 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
            onChanged();
            return this;
        }

        public <Type> C3287 addExtension(C3616 c3616, Type type) {
            return (C3287) addExtension((AbstractC3579) c3616, type);
        }

        public C3287 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3295 c3295) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3295.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c3295.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder() {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7460(DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$MethodOptions build() {
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptionsBuildPartial = buildPartial();
            if (descriptorProtos$MethodOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$MethodOptionsBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$MethodOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$MethodOptions buildPartial() {
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = new DescriptorProtos$MethodOptions(this);
            buildPartialRepeatedFields(descriptorProtos$MethodOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$MethodOptions);
            }
            onBuilt();
            return descriptorProtos$MethodOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3287 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.deprecated_ = false;
            this.idempotencyLevel_ = 0;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -9;
            return this;
        }

        public C3287 clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        public <Type> C3287 clearExtension(C3616 c3616) {
            return (C3287) clearExtension((AbstractC3579) c3616);
        }

        public C3287 clearFeatures() {
            this.bitField0_ &= -5;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3287 clearIdempotencyLevel() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
            onChanged();
            return this;
        }

        public C3287 clearUninterpretedOption() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3500
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11403;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3500
        public DescriptorProtos$FeatureSet getFeatures() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$FeatureSet) c3342.m7380();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3273 getFeaturesBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3273) internalGetFeaturesFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3500
        public InterfaceC3506 getFeaturesOrBuilder() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (InterfaceC3506) c3342.m7379();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3500
        public IdempotencyLevel getIdempotencyLevel() {
            IdempotencyLevel idempotencyLevelForNumber = IdempotencyLevel.forNumber(this.idempotencyLevel_);
            return idempotencyLevelForNumber == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : idempotencyLevelForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3500
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (DescriptorProtos$UninterpretedOption) c3363.m7466(i, false);
        }

        public DescriptorProtos$UninterpretedOption.C3295 getUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$UninterpretedOption.C3295> getUninterpretedOptionBuilderList() {
            return internalGetUninterpretedOptionFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3500
        public int getUninterpretedOptionCount() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3500
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3500
        public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3673) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3500
        public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3500
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3500
        public boolean hasFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3500
        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11404;
            c3619.m7827(DescriptorProtos$MethodOptions.class, C3287.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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

        public C3287 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$FeatureSet);
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

        public C3287 mergeFrom(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
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
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11012.isEmpty();
                C3363 c3363 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$MethodOptions.uninterpretedOption_;
                    this.bitField0_ &= -9;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$MethodOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$MethodOptions);
            mergeUnknownFields(descriptorProtos$MethodOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C3287 removeUninterpretedOption(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
            onChanged();
            return this;
        }

        public C3287 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public <Type> C3287 setExtension(C3616 c3616, Type type) {
            return (C3287) setExtension((AbstractC3579) c3616, type);
        }

        public C3287 setFeatures(DescriptorProtos$FeatureSet.C3273 c3273) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                this.features_ = c3273.build();
            } else {
                c3342.m7387(c3273.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3287 setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
            idempotencyLevel.getClass();
            this.bitField0_ |= 2;
            this.idempotencyLevel_ = idempotencyLevel.getNumber();
            onChanged();
            return this;
        }

        public C3287 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3295.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c3295.build());
            onChanged();
            return this;
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

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$MethodOptions getDefaultInstanceForType() {
            return DescriptorProtos$MethodOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3287 setExtension(C3616 c3616, int i, Type type) {
            return (C3287) setExtension((AbstractC3579) c3616, i, type);
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7461(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        private C3287(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.idempotencyLevel_ = 0;
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public C3287 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3287 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3342.m7387(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3287 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.set(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3287 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3287 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, c3295.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3295.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3287 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$MethodOptions) {
                return mergeFrom((DescriptorProtos$MethodOptions) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3287 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 264) {
                                this.deprecated_ = abstractC3474.mo7720();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 272) {
                                int iMo7724 = abstractC3474.mo7724();
                                if (IdempotencyLevel.forNumber(iMo7724) == null) {
                                    mergeUnknownVarintField(34, iMo7724);
                                } else {
                                    this.idempotencyLevel_ = iMo7724;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo7705 == 282) {
                                abstractC3474.mo7716(internalGetFeaturesFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 4;
                            } else if (iMo7705 != 7994) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC3474.mo7715(DescriptorProtos$UninterpretedOption.parser(), c3697);
                                C3363 c3363 = this.uninterpretedOptionBuilder_;
                                if (c3363 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c3363.m7458(descriptorProtos$UninterpretedOption);
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$MethodOptions getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
        return super.getExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
        return super.getExtension(c3616, i);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3287 newBuilderForType() {
        return newBuilder();
    }

    public static C3287 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$MethodOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    private DescriptorProtos$MethodOptions(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.deprecated_ = false;
        this.idempotencyLevel_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$MethodOptions) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$MethodOptions) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum IdempotencyLevel implements InterfaceC3381 {
        IDEMPOTENCY_UNKNOWN(0),
        NO_SIDE_EFFECTS(1),
        IDEMPOTENT(2);

        public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
        public static final int IDEMPOTENT_VALUE = 2;
        public static final int NO_SIDE_EFFECTS_VALUE = 1;
        private static final IdempotencyLevel[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "IdempotencyLevel");
            internalValueMap = new C3501();
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

        public static C3666 getDescriptor() {
            return DescriptorProtos$MethodOptions.getDescriptor().f11377[0];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static IdempotencyLevel valueOf(C3664 c3664) {
            if (c3664.f11384 == getDescriptor()) {
                return VALUES[c3664.f11385];
            }
            C5925.m11310("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3666 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3399
        public final int getNumber() {
            return this.value;
        }

        public final C3664 getValueDescriptor() {
            C3666 descriptor = getDescriptor();
            return descriptor.f11394[ordinal()];
        }

        @Deprecated
        public static IdempotencyLevel valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$MethodOptions) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$MethodOptions) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$MethodOptions parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$MethodOptions parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$MethodOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
