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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$OneofOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$OneofOptions> implements InterfaceC3487 {
    private static final DescriptorProtos$OneofOptions DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 1;
    private static final InterfaceC3375 PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "OneofOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$OneofOptions();
        PARSER = new C3486();
    }

    private DescriptorProtos$OneofOptions() {
        this.memoizedIsInitialized = (byte) -1;
        this.uninterpretedOption_ = Collections.EMPTY_LIST;
    }

    public static /* synthetic */ int access$24376(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions, int i) {
        int i2 = i | descriptorProtos$OneofOptions.bitField0_;
        descriptorProtos$OneofOptions.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$OneofOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11414;
    }

    public static C3289 newBuilder(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$OneofOptions);
    }

    public static DescriptorProtos$OneofOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$OneofOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$OneofOptions)) {
            return super.equals(obj);
        }
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = (DescriptorProtos$OneofOptions) obj;
        if (hasFeatures() != descriptorProtos$OneofOptions.hasFeatures()) {
            return false;
        }
        return (!hasFeatures() || getFeatures().equals(descriptorProtos$OneofOptions.getFeatures())) && getUninterpretedOptionList().equals(descriptorProtos$OneofOptions.getUninterpretedOptionList()) && getUnknownFields().equals(descriptorProtos$OneofOptions.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$OneofOptions.getExtensionFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11414;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3487
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3487
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
        int iM7639 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7639(1, getFeatures()) : 0;
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iM7639 += AbstractC3462.m7643(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iM7639;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3487
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3487
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3487
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3487
    public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3487
    public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3487
    public boolean hasFeatures() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getFeatures().hashCode();
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
        C3619 c3619 = AbstractC3670.f11413;
        c3619.m7827(DescriptorProtos$OneofOptions.class, C3289.class);
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
    public C3289 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3289(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3289 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3289() : new C3289().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7649(1, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC3462.mo7649(999, this.uninterpretedOption_.get(i));
        }
        interfaceC3629NewExtensionSerializer.mo7828(536870912, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$OneofOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3289 extends GeneratedMessage.AbstractC3304 implements InterfaceC3487 {
        private int bitField0_;
        private C3342 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private C3363 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C3289() {
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            int i = 1;
            if ((this.bitField0_ & 1) != 0) {
                C3342 c3342 = this.featuresBuilder_;
                descriptorProtos$OneofOptions.features_ = c3342 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3342.m7384();
            } else {
                i = 0;
            }
            DescriptorProtos$OneofOptions.access$24376(descriptorProtos$OneofOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                descriptorProtos$OneofOptions.uninterpretedOption_ = c3363.m7472();
                return;
            }
            if ((this.bitField0_ & 2) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                this.bitField0_ &= -3;
            }
            descriptorProtos$OneofOptions.uninterpretedOption_ = this.uninterpretedOption_;
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 2;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11414;
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

        public C3289 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
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

        public <Type> C3289 addExtension(C3616 c3616, Type type) {
            return (C3289) addExtension((AbstractC3579) c3616, type);
        }

        public C3289 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public DescriptorProtos$OneofOptions build() {
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptionsBuildPartial = buildPartial();
            if (descriptorProtos$OneofOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$OneofOptionsBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$OneofOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$OneofOptions buildPartial() {
            DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = new DescriptorProtos$OneofOptions(this);
            buildPartialRepeatedFields(descriptorProtos$OneofOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$OneofOptions);
            }
            onBuilt();
            return descriptorProtos$OneofOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3289 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
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
            this.bitField0_ &= -3;
            return this;
        }

        public <Type> C3289 clearExtension(C3616 c3616) {
            return (C3289) clearExtension((AbstractC3579) c3616);
        }

        public C3289 clearFeatures() {
            this.bitField0_ &= -2;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3289 clearUninterpretedOption() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11414;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3487
        public DescriptorProtos$FeatureSet getFeatures() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$FeatureSet) c3342.m7380();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3273 getFeaturesBuilder() {
            this.bitField0_ |= 1;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3273) internalGetFeaturesFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3487
        public InterfaceC3506 getFeaturesOrBuilder() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (InterfaceC3506) c3342.m7379();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3487
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

        @Override // com.google.protobuf.InterfaceC3487
        public int getUninterpretedOptionCount() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3487
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3487
        public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3673) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3487
        public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3487
        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11413;
            c3619.m7827(DescriptorProtos$OneofOptions.class, C3289.class);
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

        public C3289 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$FeatureSet);
            } else if ((this.bitField0_ & 1) == 0 || (descriptorProtos$FeatureSet2 = this.features_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                getFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
            }
            if (this.features_ != null) {
                this.bitField0_ |= 1;
                onChanged();
            }
            return this;
        }

        public C3289 mergeFrom(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            if (descriptorProtos$OneofOptions == DescriptorProtos$OneofOptions.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$OneofOptions.hasFeatures()) {
                mergeFeatures(descriptorProtos$OneofOptions.getFeatures());
            }
            if (this.uninterpretedOptionBuilder_ == null) {
                if (!descriptorProtos$OneofOptions.uninterpretedOption_.isEmpty()) {
                    if (this.uninterpretedOption_.isEmpty()) {
                        this.uninterpretedOption_ = descriptorProtos$OneofOptions.uninterpretedOption_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureUninterpretedOptionIsMutable();
                        this.uninterpretedOption_.addAll(descriptorProtos$OneofOptions.uninterpretedOption_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$OneofOptions.uninterpretedOption_.isEmpty()) {
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11012.isEmpty();
                C3363 c3363 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$OneofOptions.uninterpretedOption_;
                    this.bitField0_ &= -3;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$OneofOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$OneofOptions);
            mergeUnknownFields(descriptorProtos$OneofOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C3289 removeUninterpretedOption(int i) {
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

        public <Type> C3289 setExtension(C3616 c3616, Type type) {
            return (C3289) setExtension((AbstractC3579) c3616, type);
        }

        public C3289 setFeatures(DescriptorProtos$FeatureSet.C3273 c3273) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                this.features_ = c3273.build();
            } else {
                c3342.m7387(c3273.build());
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3289 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public DescriptorProtos$OneofOptions getDefaultInstanceForType() {
            return DescriptorProtos$OneofOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3289 setExtension(C3616 c3616, int i, Type type) {
            return (C3289) setExtension((AbstractC3579) c3616, i, type);
        }

        private C3289(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7461(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        public C3289 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3289 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3342.m7387(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3289 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3289 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3289 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public C3289 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$OneofOptions) {
                return mergeFrom((DescriptorProtos$OneofOptions) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3289 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                abstractC3474.mo7716(internalGetFeaturesFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 1;
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
    public DescriptorProtos$OneofOptions getDefaultInstanceForType() {
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

    public static DescriptorProtos$OneofOptions parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$OneofOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3289 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$OneofOptions(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3289 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$OneofOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$OneofOptions) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$OneofOptions) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$OneofOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$OneofOptions) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$OneofOptions parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$OneofOptions) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$OneofOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$OneofOptions parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$OneofOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$OneofOptions parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$OneofOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$OneofOptions parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$OneofOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
