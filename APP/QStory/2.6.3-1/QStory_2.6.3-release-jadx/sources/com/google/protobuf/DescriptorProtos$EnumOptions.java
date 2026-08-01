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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$EnumOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$EnumOptions> implements InterfaceC4390 {
    public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
    private static final DescriptorProtos$EnumOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
    public static final int FEATURES_FIELD_NUMBER = 7;
    private static final InterfaceC4207 PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private static final long serialVersionUID = 0;
    private boolean allowAlias_;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$EnumOptions();
        PARSER = new C4406();
    }

    private DescriptorProtos$EnumOptions() {
        this.allowAlias_ = false;
        this.deprecated_ = false;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.uninterpretedOption_ = Collections.EMPTY_LIST;
    }

    public static /* synthetic */ int access$25476(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions, int i) {
        int i2 = i | descriptorProtos$EnumOptions.bitField0_;
        descriptorProtos$EnumOptions.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$EnumOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11754;
    }

    public static C4099 newBuilder(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$EnumOptions);
    }

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$EnumOptions)) {
            return super.equals(obj);
        }
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = (DescriptorProtos$EnumOptions) obj;
        if (hasAllowAlias() != descriptorProtos$EnumOptions.hasAllowAlias()) {
            return false;
        }
        if ((hasAllowAlias() && getAllowAlias() != descriptorProtos$EnumOptions.getAllowAlias()) || hasDeprecated() != descriptorProtos$EnumOptions.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != descriptorProtos$EnumOptions.getDeprecated()) || hasDeprecatedLegacyJsonFieldConflicts() != descriptorProtos$EnumOptions.hasDeprecatedLegacyJsonFieldConflicts()) {
            return false;
        }
        if ((!hasDeprecatedLegacyJsonFieldConflicts() || getDeprecatedLegacyJsonFieldConflicts() == descriptorProtos$EnumOptions.getDeprecatedLegacyJsonFieldConflicts()) && hasFeatures() == descriptorProtos$EnumOptions.hasFeatures()) {
            return (!hasFeatures() || getFeatures().equals(descriptorProtos$EnumOptions.getFeatures())) && getUninterpretedOptionList().equals(descriptorProtos$EnumOptions.getUninterpretedOptionList()) && getUnknownFields().equals(descriptorProtos$EnumOptions.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$EnumOptions.getExtensionFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC4390
    public boolean getAllowAlias() {
        return this.allowAlias_;
    }

    @Override // com.google.protobuf.InterfaceC4390
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.InterfaceC4390
    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11754;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4390
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC4390
    public InterfaceC4338 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
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
        int iM8193 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8193(2) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM8193 += AbstractC4294.m8193(3);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM8193 += AbstractC4294.m8193(6);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM8193 += AbstractC4294.m8198(7, getFeatures());
        }
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iM8193 += AbstractC4294.m8202(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iM8193;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4390
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4390
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC4390
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4390
    public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4390
    public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4390
    public boolean hasAllowAlias() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4390
    public boolean hasDeprecated() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4390
    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4390
    public boolean hasFeatures() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasAllowAlias()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + AbstractC4234.m8062(getAllowAlias());
        }
        if (hasDeprecated()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + AbstractC4234.m8062(getDeprecated());
        }
        if (hasDeprecatedLegacyJsonFieldConflicts()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + AbstractC4234.m8062(getDeprecatedLegacyJsonFieldConflicts());
        }
        if (hasFeatures()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 7, 53) + getFeatures().hashCode();
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
        C4451 c4451 = AbstractC4502.f11755;
        c4451.m8386(DescriptorProtos$EnumOptions.class, C4099.class);
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
    public C4099 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4099(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4099 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4099() : new C4099().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        InterfaceC4461 interfaceC4461NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8222(2, this.allowAlias_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8222(3, this.deprecated_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8222(6, this.deprecatedLegacyJsonFieldConflicts_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.mo8208(7, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC4294.mo8208(999, this.uninterpretedOption_.get(i));
        }
        interfaceC4461NewExtensionSerializer.mo8387(536870912, abstractC4294);
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4099 extends GeneratedMessage.AbstractC4136 implements InterfaceC4390 {
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private C4174 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private C4195 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C4099() {
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$EnumOptions.allowAlias_ = this.allowAlias_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$EnumOptions.deprecated_ = this.deprecated_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$EnumOptions.deprecatedLegacyJsonFieldConflicts_ = this.deprecatedLegacyJsonFieldConflicts_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C4174 c4174 = this.featuresBuilder_;
                descriptorProtos$EnumOptions.features_ = c4174 == null ? this.features_ : (DescriptorProtos$FeatureSet) c4174.m7943();
                i |= 8;
            }
            DescriptorProtos$EnumOptions.access$25476(descriptorProtos$EnumOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                descriptorProtos$EnumOptions.uninterpretedOption_ = c4195.m8031();
                return;
            }
            if ((this.bitField0_ & 16) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                this.bitField0_ &= -17;
            }
            descriptorProtos$EnumOptions.uninterpretedOption_ = this.uninterpretedOption_;
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 16;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11754;
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

        public C4099 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
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

        public <Type> C4099 addExtension(C4448 c4448, Type type) {
            return (C4099) addExtension((AbstractC4411) c4448, type);
        }

        public C4099 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C4127 c4127) {
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
        public DescriptorProtos$EnumOptions build() {
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptionsBuildPartial = buildPartial();
            if (descriptorProtos$EnumOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$EnumOptionsBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$EnumOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$EnumOptions buildPartial() {
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = new DescriptorProtos$EnumOptions(this);
            buildPartialRepeatedFields(descriptorProtos$EnumOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$EnumOptions);
            }
            onBuilt();
            return descriptorProtos$EnumOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4099 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.allowAlias_ = false;
            this.deprecated_ = false;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
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
            this.bitField0_ &= -17;
            return this;
        }

        public C4099 clearAllowAlias() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
            onChanged();
            return this;
        }

        public C4099 clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public C4099 clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= -5;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
            onChanged();
            return this;
        }

        public <Type> C4099 clearExtension(C4448 c4448) {
            return (C4099) clearExtension((AbstractC4411) c4448);
        }

        public C4099 clearFeatures() {
            this.bitField0_ &= -9;
            this.features_ = null;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4099 clearUninterpretedOption() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4390
        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        @Override // com.google.protobuf.InterfaceC4390
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.InterfaceC4390
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11754;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4390
        public DescriptorProtos$FeatureSet getFeatures() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$FeatureSet) c4174.m7939();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C4105 getFeaturesBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (DescriptorProtos$FeatureSet.C4105) internalGetFeaturesFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4390
        public InterfaceC4338 getFeaturesOrBuilder() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (InterfaceC4338) c4174.m7938();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC4390
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

        @Override // com.google.protobuf.InterfaceC4390
        public int getUninterpretedOptionCount() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4390
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4390
        public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.get(i) : (InterfaceC4505) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4390
        public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC4390
        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4390
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4390
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4390
        public boolean hasFeatures() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11755;
            c4451.m8386(DescriptorProtos$EnumOptions.class, C4099.class);
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

        public C4099 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$FeatureSet);
            } else if ((this.bitField0_ & 8) == 0 || (descriptorProtos$FeatureSet2 = this.features_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                getFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
            }
            if (this.features_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public C4099 mergeFrom(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            if (descriptorProtos$EnumOptions == DescriptorProtos$EnumOptions.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$EnumOptions.hasAllowAlias()) {
                setAllowAlias(descriptorProtos$EnumOptions.getAllowAlias());
            }
            if (descriptorProtos$EnumOptions.hasDeprecated()) {
                setDeprecated(descriptorProtos$EnumOptions.getDeprecated());
            }
            if (descriptorProtos$EnumOptions.hasDeprecatedLegacyJsonFieldConflicts()) {
                setDeprecatedLegacyJsonFieldConflicts(descriptorProtos$EnumOptions.getDeprecatedLegacyJsonFieldConflicts());
            }
            if (descriptorProtos$EnumOptions.hasFeatures()) {
                mergeFeatures(descriptorProtos$EnumOptions.getFeatures());
            }
            if (this.uninterpretedOptionBuilder_ == null) {
                if (!descriptorProtos$EnumOptions.uninterpretedOption_.isEmpty()) {
                    if (this.uninterpretedOption_.isEmpty()) {
                        this.uninterpretedOption_ = descriptorProtos$EnumOptions.uninterpretedOption_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureUninterpretedOptionIsMutable();
                        this.uninterpretedOption_.addAll(descriptorProtos$EnumOptions.uninterpretedOption_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$EnumOptions.uninterpretedOption_.isEmpty()) {
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11357.isEmpty();
                C4195 c4195 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$EnumOptions.uninterpretedOption_;
                    this.bitField0_ &= -17;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$EnumOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$EnumOptions);
            mergeUnknownFields(descriptorProtos$EnumOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C4099 removeUninterpretedOption(int i) {
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

        public C4099 setAllowAlias(boolean z) {
            this.allowAlias_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4099 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Deprecated
        public C4099 setDeprecatedLegacyJsonFieldConflicts(boolean z) {
            this.deprecatedLegacyJsonFieldConflicts_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public <Type> C4099 setExtension(C4448 c4448, Type type) {
            return (C4099) setExtension((AbstractC4411) c4448, type);
        }

        public C4099 setFeatures(DescriptorProtos$FeatureSet.C4105 c4105) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                this.features_ = c4105.build();
            } else {
                c4174.m7946(c4105.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4099 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
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
        public DescriptorProtos$EnumOptions getDefaultInstanceForType() {
            return DescriptorProtos$EnumOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public <Type> C4099 setExtension(C4448 c4448, int i, Type type) {
            return (C4099) setExtension((AbstractC4411) c4448, i, type);
        }

        private C4099(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public DescriptorProtos$UninterpretedOption.C4127 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C4127) internalGetUninterpretedOptionFieldBuilder().m8020(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        public C4099 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C4099 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c4174.m7946(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4099 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C4099 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C4099 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
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
        public C4099 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$EnumOptions) {
                return mergeFrom((DescriptorProtos$EnumOptions) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4099 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 16) {
                                this.allowAlias_ = abstractC4306.mo8279();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 24) {
                                this.deprecated_ = abstractC4306.mo8279();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 == 48) {
                                this.deprecatedLegacyJsonFieldConflicts_ = abstractC4306.mo8279();
                                this.bitField0_ |= 4;
                            } else if (iMo8264 == 58) {
                                abstractC4306.mo8275(internalGetFeaturesFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 8;
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
    public DescriptorProtos$EnumOptions getDefaultInstanceForType() {
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

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4099 newBuilderForType() {
        return newBuilder();
    }

    public static C4099 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$EnumOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumOptions) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    private DescriptorProtos$EnumOptions(GeneratedMessage.AbstractC4136 abstractC4136) {
        super(abstractC4136);
        this.allowAlias_ = false;
        this.deprecated_ = false;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$EnumOptions) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumOptions) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$EnumOptions) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$EnumOptions parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$EnumOptions parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
