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
public final class DescriptorProtos$MessageOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$MessageOptions> implements InterfaceC3502 {
    private static final DescriptorProtos$MessageOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
    public static final int FEATURES_FIELD_NUMBER = 12;
    public static final int MAP_ENTRY_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
    public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
    private static final InterfaceC3375 PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private boolean mapEntry_;
    private byte memoizedIsInitialized;
    private boolean messageSetWireFormat_;
    private boolean noStandardDescriptorAccessor_;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "MessageOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$MessageOptions();
        PARSER = new C3481();
    }

    private DescriptorProtos$MessageOptions() {
        this.messageSetWireFormat_ = false;
        this.noStandardDescriptorAccessor_ = false;
        this.deprecated_ = false;
        this.mapEntry_ = false;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.uninterpretedOption_ = Collections.EMPTY_LIST;
    }

    public static /* synthetic */ int access$19576(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, int i) {
        int i2 = i | descriptorProtos$MessageOptions.bitField0_;
        descriptorProtos$MessageOptions.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$MessageOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11426;
    }

    public static C3285 newBuilder(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$MessageOptions);
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MessageOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$MessageOptions)) {
            return super.equals(obj);
        }
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = (DescriptorProtos$MessageOptions) obj;
        if (hasMessageSetWireFormat() != descriptorProtos$MessageOptions.hasMessageSetWireFormat()) {
            return false;
        }
        if ((hasMessageSetWireFormat() && getMessageSetWireFormat() != descriptorProtos$MessageOptions.getMessageSetWireFormat()) || hasNoStandardDescriptorAccessor() != descriptorProtos$MessageOptions.hasNoStandardDescriptorAccessor()) {
            return false;
        }
        if ((hasNoStandardDescriptorAccessor() && getNoStandardDescriptorAccessor() != descriptorProtos$MessageOptions.getNoStandardDescriptorAccessor()) || hasDeprecated() != descriptorProtos$MessageOptions.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != descriptorProtos$MessageOptions.getDeprecated()) || hasMapEntry() != descriptorProtos$MessageOptions.hasMapEntry()) {
            return false;
        }
        if ((hasMapEntry() && getMapEntry() != descriptorProtos$MessageOptions.getMapEntry()) || hasDeprecatedLegacyJsonFieldConflicts() != descriptorProtos$MessageOptions.hasDeprecatedLegacyJsonFieldConflicts()) {
            return false;
        }
        if ((!hasDeprecatedLegacyJsonFieldConflicts() || getDeprecatedLegacyJsonFieldConflicts() == descriptorProtos$MessageOptions.getDeprecatedLegacyJsonFieldConflicts()) && hasFeatures() == descriptorProtos$MessageOptions.hasFeatures()) {
            return (!hasFeatures() || getFeatures().equals(descriptorProtos$MessageOptions.getFeatures())) && getUninterpretedOptionList().equals(descriptorProtos$MessageOptions.getUninterpretedOptionList()) && getUnknownFields().equals(descriptorProtos$MessageOptions.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$MessageOptions.getExtensionFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.InterfaceC3502
    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11426;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3502
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public InterfaceC3506 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public boolean getMapEntry() {
        return this.mapEntry_;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
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
            iM7634 += AbstractC3462.m7634(2);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7634 += AbstractC3462.m7634(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7634 += AbstractC3462.m7634(7);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM7634 += AbstractC3462.m7634(11);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM7634 += AbstractC3462.m7639(12, getFeatures());
        }
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iM7634 += AbstractC3462.m7643(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iM7634;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3502
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3502
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3502
    public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public boolean hasDeprecated() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3502
    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3502
    public boolean hasFeatures() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public boolean hasMapEntry() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public boolean hasMessageSetWireFormat() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3502
    public boolean hasNoStandardDescriptorAccessor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasMessageSetWireFormat()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + AbstractC3402.m7503(getMessageSetWireFormat());
        }
        if (hasNoStandardDescriptorAccessor()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + AbstractC3402.m7503(getNoStandardDescriptorAccessor());
        }
        if (hasDeprecated()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + AbstractC3402.m7503(getDeprecated());
        }
        if (hasMapEntry()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 7, 53) + AbstractC3402.m7503(getMapEntry());
        }
        if (hasDeprecatedLegacyJsonFieldConflicts()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 11, 53) + AbstractC3402.m7503(getDeprecatedLegacyJsonFieldConflicts());
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 12, 53) + getFeatures().hashCode();
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
        C3619 c3619 = AbstractC3670.f11425;
        c3619.m7827(DescriptorProtos$MessageOptions.class, C3285.class);
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
    public C3285 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3285(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3285 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3285() : new C3285().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7663(1, this.messageSetWireFormat_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7663(2, this.noStandardDescriptorAccessor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7663(3, this.deprecated_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3462.mo7663(7, this.mapEntry_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3462.mo7663(11, this.deprecatedLegacyJsonFieldConflicts_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3462.mo7649(12, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC3462.mo7649(999, this.uninterpretedOption_.get(i));
        }
        interfaceC3629NewExtensionSerializer.mo7828(536870912, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3285 extends GeneratedMessage.AbstractC3304 implements InterfaceC3502 {
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private C3342 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private boolean mapEntry_;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private C3363 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C3285() {
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$MessageOptions.messageSetWireFormat_ = this.messageSetWireFormat_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$MessageOptions.noStandardDescriptorAccessor_ = this.noStandardDescriptorAccessor_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$MessageOptions.deprecated_ = this.deprecated_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                descriptorProtos$MessageOptions.mapEntry_ = this.mapEntry_;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                descriptorProtos$MessageOptions.deprecatedLegacyJsonFieldConflicts_ = this.deprecatedLegacyJsonFieldConflicts_;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                C3342 c3342 = this.featuresBuilder_;
                descriptorProtos$MessageOptions.features_ = c3342 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3342.m7384();
                i |= 32;
            }
            DescriptorProtos$MessageOptions.access$19576(descriptorProtos$MessageOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                descriptorProtos$MessageOptions.uninterpretedOption_ = c3363.m7472();
                return;
            }
            if ((this.bitField0_ & 64) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                this.bitField0_ &= -65;
            }
            descriptorProtos$MessageOptions.uninterpretedOption_ = this.uninterpretedOption_;
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 64;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11426;
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

        public C3285 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
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

        public <Type> C3285 addExtension(C3616 c3616, Type type) {
            return (C3285) addExtension((AbstractC3579) c3616, type);
        }

        public C3285 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public DescriptorProtos$MessageOptions build() {
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptionsBuildPartial = buildPartial();
            if (descriptorProtos$MessageOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$MessageOptionsBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$MessageOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$MessageOptions buildPartial() {
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = new DescriptorProtos$MessageOptions(this);
            buildPartialRepeatedFields(descriptorProtos$MessageOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$MessageOptions);
            }
            onBuilt();
            return descriptorProtos$MessageOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3285 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.messageSetWireFormat_ = false;
            this.noStandardDescriptorAccessor_ = false;
            this.deprecated_ = false;
            this.mapEntry_ = false;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
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
            this.bitField0_ &= -65;
            return this;
        }

        public C3285 clearDeprecated() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public C3285 clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= -17;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
            onChanged();
            return this;
        }

        public <Type> C3285 clearExtension(C3616 c3616) {
            return (C3285) clearExtension((AbstractC3579) c3616);
        }

        public C3285 clearFeatures() {
            this.bitField0_ &= -33;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3285 clearMapEntry() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
            onChanged();
            return this;
        }

        public C3285 clearMessageSetWireFormat() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
            onChanged();
            return this;
        }

        public C3285 clearNoStandardDescriptorAccessor() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
            onChanged();
            return this;
        }

        public C3285 clearUninterpretedOption() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3502
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.InterfaceC3502
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11426;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3502
        public DescriptorProtos$FeatureSet getFeatures() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$FeatureSet) c3342.m7380();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3273 getFeaturesBuilder() {
            this.bitField0_ |= 32;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3273) internalGetFeaturesFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3502
        public InterfaceC3506 getFeaturesOrBuilder() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (InterfaceC3506) c3342.m7379();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3502
        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        @Override // com.google.protobuf.InterfaceC3502
        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        @Override // com.google.protobuf.InterfaceC3502
        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override // com.google.protobuf.InterfaceC3502
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

        @Override // com.google.protobuf.InterfaceC3502
        public int getUninterpretedOptionCount() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3502
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3502
        public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3673) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3502
        public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3502
        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3502
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3502
        public boolean hasFeatures() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3502
        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3502
        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3502
        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11425;
            c3619.m7827(DescriptorProtos$MessageOptions.class, C3285.class);
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

        public C3285 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$FeatureSet);
            } else if ((this.bitField0_ & 32) == 0 || (descriptorProtos$FeatureSet2 = this.features_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                getFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
            }
            if (this.features_ != null) {
                this.bitField0_ |= 32;
                onChanged();
            }
            return this;
        }

        public C3285 mergeFrom(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            if (descriptorProtos$MessageOptions == DescriptorProtos$MessageOptions.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$MessageOptions.hasMessageSetWireFormat()) {
                setMessageSetWireFormat(descriptorProtos$MessageOptions.getMessageSetWireFormat());
            }
            if (descriptorProtos$MessageOptions.hasNoStandardDescriptorAccessor()) {
                setNoStandardDescriptorAccessor(descriptorProtos$MessageOptions.getNoStandardDescriptorAccessor());
            }
            if (descriptorProtos$MessageOptions.hasDeprecated()) {
                setDeprecated(descriptorProtos$MessageOptions.getDeprecated());
            }
            if (descriptorProtos$MessageOptions.hasMapEntry()) {
                setMapEntry(descriptorProtos$MessageOptions.getMapEntry());
            }
            if (descriptorProtos$MessageOptions.hasDeprecatedLegacyJsonFieldConflicts()) {
                setDeprecatedLegacyJsonFieldConflicts(descriptorProtos$MessageOptions.getDeprecatedLegacyJsonFieldConflicts());
            }
            if (descriptorProtos$MessageOptions.hasFeatures()) {
                mergeFeatures(descriptorProtos$MessageOptions.getFeatures());
            }
            if (this.uninterpretedOptionBuilder_ == null) {
                if (!descriptorProtos$MessageOptions.uninterpretedOption_.isEmpty()) {
                    if (this.uninterpretedOption_.isEmpty()) {
                        this.uninterpretedOption_ = descriptorProtos$MessageOptions.uninterpretedOption_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureUninterpretedOptionIsMutable();
                        this.uninterpretedOption_.addAll(descriptorProtos$MessageOptions.uninterpretedOption_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$MessageOptions.uninterpretedOption_.isEmpty()) {
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11012.isEmpty();
                C3363 c3363 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$MessageOptions.uninterpretedOption_;
                    this.bitField0_ &= -65;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$MessageOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$MessageOptions);
            mergeUnknownFields(descriptorProtos$MessageOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C3285 removeUninterpretedOption(int i) {
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

        public C3285 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Deprecated
        public C3285 setDeprecatedLegacyJsonFieldConflicts(boolean z) {
            this.deprecatedLegacyJsonFieldConflicts_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public <Type> C3285 setExtension(C3616 c3616, Type type) {
            return (C3285) setExtension((AbstractC3579) c3616, type);
        }

        public C3285 setFeatures(DescriptorProtos$FeatureSet.C3273 c3273) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                this.features_ = c3273.build();
            } else {
                c3342.m7387(c3273.build());
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3285 setMapEntry(boolean z) {
            this.mapEntry_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3285 setMessageSetWireFormat(boolean z) {
            this.messageSetWireFormat_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3285 setNoStandardDescriptorAccessor(boolean z) {
            this.noStandardDescriptorAccessor_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3285 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public DescriptorProtos$MessageOptions getDefaultInstanceForType() {
            return DescriptorProtos$MessageOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3285 setExtension(C3616 c3616, int i, Type type) {
            return (C3285) setExtension((AbstractC3579) c3616, i, type);
        }

        private C3285(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7461(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        public C3285 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3285 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3342.m7387(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3285 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3285 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3285 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public C3285 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$MessageOptions) {
                return mergeFrom((DescriptorProtos$MessageOptions) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3285 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 8) {
                                this.messageSetWireFormat_ = abstractC3474.mo7720();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 16) {
                                this.noStandardDescriptorAccessor_ = abstractC3474.mo7720();
                                this.bitField0_ |= 2;
                            } else if (iMo7705 == 24) {
                                this.deprecated_ = abstractC3474.mo7720();
                                this.bitField0_ |= 4;
                            } else if (iMo7705 == 56) {
                                this.mapEntry_ = abstractC3474.mo7720();
                                this.bitField0_ |= 8;
                            } else if (iMo7705 == 88) {
                                this.deprecatedLegacyJsonFieldConflicts_ = abstractC3474.mo7720();
                                this.bitField0_ |= 16;
                            } else if (iMo7705 == 98) {
                                abstractC3474.mo7716(internalGetFeaturesFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 32;
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
    public DescriptorProtos$MessageOptions getDefaultInstanceForType() {
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

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3285 newBuilderForType() {
        return newBuilder();
    }

    public static C3285 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$MessageOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$MessageOptions) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$MessageOptions) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    private DescriptorProtos$MessageOptions(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.messageSetWireFormat_ = false;
        this.noStandardDescriptorAccessor_ = false;
        this.deprecated_ = false;
        this.mapEntry_ = false;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$MessageOptions) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$MessageOptions) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$MessageOptions parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$MessageOptions parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
