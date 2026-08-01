package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$EnumOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$EnumOptions> implements InterfaceC3557 {
    public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
    private static final DescriptorProtos$EnumOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
    public static final int FEATURES_FIELD_NUMBER = 7;
    private static final InterfaceC3374 PARSER;
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
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$EnumOptions();
        PARSER = new C3573();
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11404;
    }

    public static C3266 newBuilder(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$EnumOptions);
    }

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumOptions) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.InterfaceC3557
    public boolean getAllowAlias() {
        return this.allowAlias_;
    }

    @Override // com.google.protobuf.InterfaceC3557
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.InterfaceC3557
    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11404;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
        return super.getExtension(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
        return super.getExtensionCount(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3557
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3557
    public InterfaceC3505 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7647 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7647(2) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7647 += AbstractC3461.m7647(3);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7647 += AbstractC3461.m7647(6);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7647 += AbstractC3461.m7652(7, getFeatures());
        }
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iM7647 += AbstractC3461.m7656(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iM7647;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3557
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3557
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3557
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3557
    public InterfaceC3672 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3557
    public List<? extends InterfaceC3672> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3557
    public boolean hasAllowAlias() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3557
    public boolean hasDeprecated() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3557
    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3557
    public boolean hasFeatures() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasAllowAlias()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + AbstractC3401.m7516(getAllowAlias());
        }
        if (hasDeprecated()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + AbstractC3401.m7516(getDeprecated());
        }
        if (hasDeprecatedLegacyJsonFieldConflicts()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 6, 53) + AbstractC3401.m7516(getDeprecatedLegacyJsonFieldConflicts());
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 7, 53) + getFeatures().hashCode();
        }
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3532.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11405;
        c3618.m7840(DescriptorProtos$EnumOptions.class, C3266.class);
        return c3618;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

    @Override // com.google.protobuf.AbstractC3532
    public C3266 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3266(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3266 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3266() : new C3266().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        InterfaceC3628 interfaceC3628NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7676(2, this.allowAlias_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7676(3, this.deprecated_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7676(6, this.deprecatedLegacyJsonFieldConflicts_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3461.mo7662(7, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC3461.mo7662(999, this.uninterpretedOption_.get(i));
        }
        interfaceC3628NewExtensionSerializer.mo7841(536870912, abstractC3461);
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$EnumOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3266 extends GeneratedMessage.AbstractC3303 implements InterfaceC3557 {
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private C3341 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private C3362 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C3266() {
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
                C3341 c3341 = this.featuresBuilder_;
                descriptorProtos$EnumOptions.features_ = c3341 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3341.m7397();
                i |= 8;
            }
            DescriptorProtos$EnumOptions.access$25476(descriptorProtos$EnumOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                descriptorProtos$EnumOptions.uninterpretedOption_ = c3362.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11404;
        }

        private C3341 internalGetFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new C3341(getFeatures(), getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private C3362 internalGetUninterpretedOptionFieldBuilder() {
            if (this.uninterpretedOptionBuilder_ == null) {
                this.uninterpretedOptionBuilder_ = new C3362(this.uninterpretedOption_, getParentForChildren(), isClean());
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

        public C3266 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
            onChanged();
            return this;
        }

        public <Type> C3266 addExtension(C3615 c3615, Type type) {
            return (C3266) addExtension((AbstractC3578) c3615, type);
        }

        public C3266 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3294 c3294) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3294.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c3294.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$UninterpretedOption.C3294 addUninterpretedOptionBuilder() {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7473(DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$EnumOptions build() {
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptionsBuildPartial = buildPartial();
            if (descriptorProtos$EnumOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$EnumOptionsBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$EnumOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$EnumOptions buildPartial() {
            DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = new DescriptorProtos$EnumOptions(this);
            buildPartialRepeatedFields(descriptorProtos$EnumOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$EnumOptions);
            }
            onBuilt();
            return descriptorProtos$EnumOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3266 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.allowAlias_ = false;
            this.deprecated_ = false;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
            this.features_ = null;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.featuresBuilder_ = null;
            }
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -17;
            return this;
        }

        public C3266 clearAllowAlias() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
            onChanged();
            return this;
        }

        public C3266 clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public C3266 clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= -5;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
            onChanged();
            return this;
        }

        public <Type> C3266 clearExtension(C3615 c3615) {
            return (C3266) clearExtension((AbstractC3578) c3615);
        }

        public C3266 clearFeatures() {
            this.bitField0_ &= -9;
            this.features_ = null;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3266 clearUninterpretedOption() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3557
        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        @Override // com.google.protobuf.InterfaceC3557
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.InterfaceC3557
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11404;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3557
        public DescriptorProtos$FeatureSet getFeatures() {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$FeatureSet) c3341.m7393();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3272 getFeaturesBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3272) internalGetFeaturesFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3557
        public InterfaceC3505 getFeaturesOrBuilder() {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                return (InterfaceC3505) c3341.m7392();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3557
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.get(i) : (DescriptorProtos$UninterpretedOption) c3362.m7479(i, false);
        }

        public DescriptorProtos$UninterpretedOption.C3294 getUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$UninterpretedOption.C3294> getUninterpretedOptionBuilderList() {
            return internalGetUninterpretedOptionFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3557
        public int getUninterpretedOptionCount() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3557
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3557
        public InterfaceC3672 getUninterpretedOptionOrBuilder(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3672) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3557
        public List<? extends InterfaceC3672> getUninterpretedOptionOrBuilderList() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3557
        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3557
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3557
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3557
        public boolean hasFeatures() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11405;
            c3618.m7840(DescriptorProtos$EnumOptions.class, C3266.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

        public C3266 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$FeatureSet);
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

        public C3266 mergeFrom(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
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
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11007.isEmpty();
                C3362 c3362 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$EnumOptions.uninterpretedOption_;
                    this.bitField0_ &= -17;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$EnumOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$EnumOptions);
            mergeUnknownFields(descriptorProtos$EnumOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C3266 removeUninterpretedOption(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
            onChanged();
            return this;
        }

        public C3266 setAllowAlias(boolean z) {
            this.allowAlias_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3266 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Deprecated
        public C3266 setDeprecatedLegacyJsonFieldConflicts(boolean z) {
            this.deprecatedLegacyJsonFieldConflicts_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public <Type> C3266 setExtension(C3615 c3615, Type type) {
            return (C3266) setExtension((AbstractC3578) c3615, type);
        }

        public C3266 setFeatures(DescriptorProtos$FeatureSet.C3272 c3272) {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 == null) {
                this.features_ = c3272.build();
            } else {
                c3341.m7400(c3272.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3266 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3294 c3294) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3294.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c3294.build());
            onChanged();
            return this;
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

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$EnumOptions getDefaultInstanceForType() {
            return DescriptorProtos$EnumOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        public <Type> C3266 setExtension(C3615 c3615, int i, Type type) {
            return (C3266) setExtension((AbstractC3578) c3615, i, type);
        }

        private C3266(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public DescriptorProtos$UninterpretedOption.C3294 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7474(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        public C3266 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3266 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3341.m7400(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3266 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.set(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3266 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3266 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3294 c3294) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, c3294.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3294.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3266 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$EnumOptions) {
                return mergeFrom((DescriptorProtos$EnumOptions) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3266 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 16) {
                                this.allowAlias_ = abstractC3473.mo7733();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 24) {
                                this.deprecated_ = abstractC3473.mo7733();
                                this.bitField0_ |= 2;
                            } else if (iMo7718 == 48) {
                                this.deprecatedLegacyJsonFieldConflicts_ = abstractC3473.mo7733();
                                this.bitField0_ |= 4;
                            } else if (iMo7718 == 58) {
                                abstractC3473.mo7729(internalGetFeaturesFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 8;
                            } else if (iMo7718 != 7994) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC3473.mo7728(DescriptorProtos$UninterpretedOption.parser(), c3696);
                                C3362 c3362 = this.uninterpretedOptionBuilder_;
                                if (c3362 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c3362.m7471(descriptorProtos$UninterpretedOption);
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$EnumOptions getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
        return super.getExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
        return super.getExtension(c3615, i);
    }

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3266 newBuilderForType() {
        return newBuilder();
    }

    public static C3266 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$EnumOptions) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumOptions) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    private DescriptorProtos$EnumOptions(GeneratedMessage.AbstractC3303 abstractC3303) {
        super(abstractC3303);
        this.allowAlias_ = false;
        this.deprecated_ = false;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$EnumOptions) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumOptions) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$EnumOptions) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$EnumOptions parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$EnumOptions parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$EnumOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
