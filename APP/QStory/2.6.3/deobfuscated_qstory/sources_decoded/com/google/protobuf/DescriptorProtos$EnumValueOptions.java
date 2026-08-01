package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$EnumValueOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$EnumValueOptions> implements InterfaceC3554 {
    public static final int DEBUG_REDACT_FIELD_NUMBER = 3;
    private static final DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 1;
    public static final int FEATURES_FIELD_NUMBER = 2;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 4;
    private static final InterfaceC3375 PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private boolean debugRedact_;
    private boolean deprecated_;
    private DescriptorProtos$FieldOptions.FeatureSupport featureSupport_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumValueOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$EnumValueOptions();
        PARSER = new C3555();
    }

    private DescriptorProtos$EnumValueOptions() {
        this.deprecated_ = false;
        this.debugRedact_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.uninterpretedOption_ = Collections.EMPTY_LIST;
    }

    public static /* synthetic */ int access$26576(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions, int i) {
        int i2 = i | descriptorProtos$EnumValueOptions.bitField0_;
        descriptorProtos$EnumValueOptions.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$EnumValueOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11406;
    }

    public static C3269 newBuilder(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$EnumValueOptions);
    }

    public static DescriptorProtos$EnumValueOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumValueOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$EnumValueOptions)) {
            return super.equals(obj);
        }
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = (DescriptorProtos$EnumValueOptions) obj;
        if (hasDeprecated() != descriptorProtos$EnumValueOptions.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != descriptorProtos$EnumValueOptions.getDeprecated()) || hasFeatures() != descriptorProtos$EnumValueOptions.hasFeatures()) {
            return false;
        }
        if ((hasFeatures() && !getFeatures().equals(descriptorProtos$EnumValueOptions.getFeatures())) || hasDebugRedact() != descriptorProtos$EnumValueOptions.hasDebugRedact()) {
            return false;
        }
        if ((!hasDebugRedact() || getDebugRedact() == descriptorProtos$EnumValueOptions.getDebugRedact()) && hasFeatureSupport() == descriptorProtos$EnumValueOptions.hasFeatureSupport()) {
            return (!hasFeatureSupport() || getFeatureSupport().equals(descriptorProtos$EnumValueOptions.getFeatureSupport())) && getUninterpretedOptionList().equals(descriptorProtos$EnumValueOptions.getUninterpretedOptionList()) && getUnknownFields().equals(descriptorProtos$EnumValueOptions.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$EnumValueOptions.getExtensionFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11406;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3554
    public DescriptorProtos$FieldOptions.FeatureSupport getFeatureSupport() {
        DescriptorProtos$FieldOptions.FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? DescriptorProtos$FieldOptions.FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public InterfaceC3512 getFeatureSupportOrBuilder() {
        DescriptorProtos$FieldOptions.FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? DescriptorProtos$FieldOptions.FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public InterfaceC3506 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
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
        int iM7634 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7634(1) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7634 += AbstractC3462.m7639(2, getFeatures());
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7634 += AbstractC3462.m7634(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7634 += AbstractC3462.m7639(4, getFeatureSupport());
        }
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iM7634 += AbstractC3462.m7643(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iM7634;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3554
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3554
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3554
    public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public boolean hasDebugRedact() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3554
    public boolean hasFeatureSupport() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3554
    public boolean hasFeatures() {
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
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + AbstractC3402.m7503(getDeprecated());
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getFeatures().hashCode();
        }
        if (hasDebugRedact()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + AbstractC3402.m7503(getDebugRedact());
        }
        if (hasFeatureSupport()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + getFeatureSupport().hashCode();
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
        C3619 c3619 = AbstractC3670.f11405;
        c3619.m7827(DescriptorProtos$EnumValueOptions.class, C3269.class);
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
    public C3269 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3269(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3269 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3269() : new C3269().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7663(1, this.deprecated_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7649(2, getFeatures());
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7663(3, this.debugRedact_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3462.mo7649(4, getFeatureSupport());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC3462.mo7649(999, this.uninterpretedOption_.get(i));
        }
        interfaceC3629NewExtensionSerializer.mo7828(536870912, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumValueOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3269 extends GeneratedMessage.AbstractC3304 implements InterfaceC3554 {
        private int bitField0_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private C3342 featureSupportBuilder_;
        private DescriptorProtos$FieldOptions.FeatureSupport featureSupport_;
        private C3342 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private C3363 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C3269() {
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$EnumValueOptions.deprecated_ = this.deprecated_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                C3342 c3342 = this.featuresBuilder_;
                descriptorProtos$EnumValueOptions.features_ = c3342 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3342.m7384();
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$EnumValueOptions.debugRedact_ = this.debugRedact_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C3342 c33422 = this.featureSupportBuilder_;
                descriptorProtos$EnumValueOptions.featureSupport_ = c33422 == null ? this.featureSupport_ : (DescriptorProtos$FieldOptions.FeatureSupport) c33422.m7384();
                i |= 8;
            }
            DescriptorProtos$EnumValueOptions.access$26576(descriptorProtos$EnumValueOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                descriptorProtos$EnumValueOptions.uninterpretedOption_ = c3363.m7472();
                return;
            }
            if ((this.bitField0_ & 16) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                this.bitField0_ &= -17;
            }
            descriptorProtos$EnumValueOptions.uninterpretedOption_ = this.uninterpretedOption_;
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 16;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11406;
        }

        private C3342 internalGetFeatureSupportFieldBuilder() {
            if (this.featureSupportBuilder_ == null) {
                this.featureSupportBuilder_ = new C3342(getFeatureSupport(), getParentForChildren(), isClean());
                this.featureSupport_ = null;
            }
            return this.featureSupportBuilder_;
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
                internalGetFeatureSupportFieldBuilder();
                internalGetUninterpretedOptionFieldBuilder();
            }
        }

        public C3269 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
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

        public <Type> C3269 addExtension(C3616 c3616, Type type) {
            return (C3269) addExtension((AbstractC3579) c3616, type);
        }

        public C3269 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public DescriptorProtos$EnumValueOptions build() {
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptionsBuildPartial = buildPartial();
            if (descriptorProtos$EnumValueOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$EnumValueOptionsBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$EnumValueOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$EnumValueOptions buildPartial() {
            DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = new DescriptorProtos$EnumValueOptions(this);
            buildPartialRepeatedFields(descriptorProtos$EnumValueOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$EnumValueOptions);
            }
            onBuilt();
            return descriptorProtos$EnumValueOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3269 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.deprecated_ = false;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            this.debugRedact_ = false;
            this.featureSupport_ = null;
            C3342 c33422 = this.featureSupportBuilder_;
            if (c33422 != null) {
                c33422.f10971 = null;
                this.featureSupportBuilder_ = null;
            }
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -17;
            return this;
        }

        public C3269 clearDebugRedact() {
            this.bitField0_ &= -5;
            this.debugRedact_ = false;
            onChanged();
            return this;
        }

        public C3269 clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        public <Type> C3269 clearExtension(C3616 c3616) {
            return (C3269) clearExtension((AbstractC3579) c3616);
        }

        public C3269 clearFeatureSupport() {
            this.bitField0_ &= -9;
            this.featureSupport_ = null;
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featureSupportBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3269 clearFeatures() {
            this.bitField0_ &= -3;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3269 clearUninterpretedOption() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3554
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // com.google.protobuf.InterfaceC3554
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11406;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3554
        public DescriptorProtos$FieldOptions.FeatureSupport getFeatureSupport() {
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$FieldOptions.FeatureSupport) c3342.m7380();
            }
            DescriptorProtos$FieldOptions.FeatureSupport featureSupport = this.featureSupport_;
            return featureSupport == null ? DescriptorProtos$FieldOptions.FeatureSupport.getDefaultInstance() : featureSupport;
        }

        public DescriptorProtos$FieldOptions.FeatureSupport.C3278 getFeatureSupportBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (DescriptorProtos$FieldOptions.FeatureSupport.C3278) internalGetFeatureSupportFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3554
        public InterfaceC3512 getFeatureSupportOrBuilder() {
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 != null) {
                return (InterfaceC3512) c3342.m7379();
            }
            DescriptorProtos$FieldOptions.FeatureSupport featureSupport = this.featureSupport_;
            return featureSupport == null ? DescriptorProtos$FieldOptions.FeatureSupport.getDefaultInstance() : featureSupport;
        }

        @Override // com.google.protobuf.InterfaceC3554
        public DescriptorProtos$FeatureSet getFeatures() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$FeatureSet) c3342.m7380();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3273 getFeaturesBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3273) internalGetFeaturesFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3554
        public InterfaceC3506 getFeaturesOrBuilder() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (InterfaceC3506) c3342.m7379();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3554
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

        @Override // com.google.protobuf.InterfaceC3554
        public int getUninterpretedOptionCount() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3554
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3554
        public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3673) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3554
        public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3554
        public boolean hasDebugRedact() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3554
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3554
        public boolean hasFeatureSupport() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3554
        public boolean hasFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11405;
            c3619.m7827(DescriptorProtos$EnumValueOptions.class, C3269.class);
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

        public C3269 mergeFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
            DescriptorProtos$FieldOptions.FeatureSupport featureSupport2;
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 != null) {
                c3342.m7386(featureSupport);
            } else if ((this.bitField0_ & 8) == 0 || (featureSupport2 = this.featureSupport_) == null || featureSupport2 == DescriptorProtos$FieldOptions.FeatureSupport.getDefaultInstance()) {
                this.featureSupport_ = featureSupport;
            } else {
                getFeatureSupportBuilder().mergeFrom(featureSupport);
            }
            if (this.featureSupport_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public C3269 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$FeatureSet);
            } else if ((this.bitField0_ & 2) == 0 || (descriptorProtos$FeatureSet2 = this.features_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                getFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
            }
            if (this.features_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public C3269 mergeFrom(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            if (descriptorProtos$EnumValueOptions == DescriptorProtos$EnumValueOptions.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$EnumValueOptions.hasDeprecated()) {
                setDeprecated(descriptorProtos$EnumValueOptions.getDeprecated());
            }
            if (descriptorProtos$EnumValueOptions.hasFeatures()) {
                mergeFeatures(descriptorProtos$EnumValueOptions.getFeatures());
            }
            if (descriptorProtos$EnumValueOptions.hasDebugRedact()) {
                setDebugRedact(descriptorProtos$EnumValueOptions.getDebugRedact());
            }
            if (descriptorProtos$EnumValueOptions.hasFeatureSupport()) {
                mergeFeatureSupport(descriptorProtos$EnumValueOptions.getFeatureSupport());
            }
            if (this.uninterpretedOptionBuilder_ == null) {
                if (!descriptorProtos$EnumValueOptions.uninterpretedOption_.isEmpty()) {
                    if (this.uninterpretedOption_.isEmpty()) {
                        this.uninterpretedOption_ = descriptorProtos$EnumValueOptions.uninterpretedOption_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureUninterpretedOptionIsMutable();
                        this.uninterpretedOption_.addAll(descriptorProtos$EnumValueOptions.uninterpretedOption_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$EnumValueOptions.uninterpretedOption_.isEmpty()) {
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11012.isEmpty();
                C3363 c3363 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$EnumValueOptions.uninterpretedOption_;
                    this.bitField0_ &= -17;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$EnumValueOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$EnumValueOptions);
            mergeUnknownFields(descriptorProtos$EnumValueOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C3269 removeUninterpretedOption(int i) {
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

        public C3269 setDebugRedact(boolean z) {
            this.debugRedact_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3269 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public <Type> C3269 setExtension(C3616 c3616, Type type) {
            return (C3269) setExtension((AbstractC3579) c3616, type);
        }

        public C3269 setFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport.C3278 c3278) {
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 == null) {
                this.featureSupport_ = c3278.build();
            } else {
                c3342.m7387(c3278.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3269 setFeatures(DescriptorProtos$FeatureSet.C3273 c3273) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                this.features_ = c3273.build();
            } else {
                c3342.m7387(c3273.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3269 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public DescriptorProtos$EnumValueOptions getDefaultInstanceForType() {
            return DescriptorProtos$EnumValueOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3269 setExtension(C3616 c3616, int i, Type type) {
            return (C3269) setExtension((AbstractC3579) c3616, i, type);
        }

        private C3269(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7461(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        public C3269 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3269 setFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 == null) {
                featureSupport.getClass();
                this.featureSupport_ = featureSupport;
            } else {
                c3342.m7387(featureSupport);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3269 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3342.m7387(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3269 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3269 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3269 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public C3269 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$EnumValueOptions) {
                return mergeFrom((DescriptorProtos$EnumValueOptions) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3269 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 8) {
                                this.deprecated_ = abstractC3474.mo7720();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 18) {
                                abstractC3474.mo7716(internalGetFeaturesFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 2;
                            } else if (iMo7705 == 24) {
                                this.debugRedact_ = abstractC3474.mo7720();
                                this.bitField0_ |= 4;
                            } else if (iMo7705 == 34) {
                                abstractC3474.mo7716(internalGetFeatureSupportFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 8;
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
    public DescriptorProtos$EnumValueOptions getDefaultInstanceForType() {
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

    public static DescriptorProtos$EnumValueOptions parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3269 newBuilderForType() {
        return newBuilder();
    }

    public static C3269 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$EnumValueOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    private DescriptorProtos$EnumValueOptions(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.deprecated_ = false;
        this.debugRedact_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumValueOptions) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$EnumValueOptions) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumValueOptions) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$EnumValueOptions) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
