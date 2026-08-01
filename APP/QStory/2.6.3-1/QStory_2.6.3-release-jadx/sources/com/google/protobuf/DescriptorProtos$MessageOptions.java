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
public final class DescriptorProtos$MessageOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$MessageOptions> implements InterfaceC4334 {
    private static final DescriptorProtos$MessageOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
    public static final int FEATURES_FIELD_NUMBER = 12;
    public static final int MAP_ENTRY_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
    public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
    private static final InterfaceC4207 PARSER;
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
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "MessageOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$MessageOptions();
        PARSER = new C4313();
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

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11771;
    }

    public static C4117 newBuilder(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$MessageOptions);
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MessageOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.InterfaceC4334
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.InterfaceC4334
    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11771;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4334
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public InterfaceC4338 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public boolean getMapEntry() {
        return this.mapEntry_;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
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
        int iM8193 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8193(1) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM8193 += AbstractC4294.m8193(2);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM8193 += AbstractC4294.m8193(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM8193 += AbstractC4294.m8193(7);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM8193 += AbstractC4294.m8193(11);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM8193 += AbstractC4294.m8198(12, getFeatures());
        }
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iM8193 += AbstractC4294.m8202(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iM8193;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4334
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC4334
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4334
    public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public boolean hasDeprecated() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4334
    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4334
    public boolean hasFeatures() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public boolean hasMapEntry() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public boolean hasMessageSetWireFormat() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4334
    public boolean hasNoStandardDescriptorAccessor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasMessageSetWireFormat()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + AbstractC4234.m8062(getMessageSetWireFormat());
        }
        if (hasNoStandardDescriptorAccessor()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + AbstractC4234.m8062(getNoStandardDescriptorAccessor());
        }
        if (hasDeprecated()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + AbstractC4234.m8062(getDeprecated());
        }
        if (hasMapEntry()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 7, 53) + AbstractC4234.m8062(getMapEntry());
        }
        if (hasDeprecatedLegacyJsonFieldConflicts()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 11, 53) + AbstractC4234.m8062(getDeprecatedLegacyJsonFieldConflicts());
        }
        if (hasFeatures()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 12, 53) + getFeatures().hashCode();
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
        C4451 c4451 = AbstractC4502.f11770;
        c4451.m8386(DescriptorProtos$MessageOptions.class, C4117.class);
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
    public C4117 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4117(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4117 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4117() : new C4117().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        InterfaceC4461 interfaceC4461NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8222(1, this.messageSetWireFormat_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8222(2, this.noStandardDescriptorAccessor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8222(3, this.deprecated_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.mo8222(7, this.mapEntry_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC4294.mo8222(11, this.deprecatedLegacyJsonFieldConflicts_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC4294.mo8208(12, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC4294.mo8208(999, this.uninterpretedOption_.get(i));
        }
        interfaceC4461NewExtensionSerializer.mo8387(536870912, abstractC4294);
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4117 extends GeneratedMessage.AbstractC4136 implements InterfaceC4334 {
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private C4174 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private boolean mapEntry_;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private C4195 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C4117() {
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
                C4174 c4174 = this.featuresBuilder_;
                descriptorProtos$MessageOptions.features_ = c4174 == null ? this.features_ : (DescriptorProtos$FeatureSet) c4174.m7943();
                i |= 32;
            }
            DescriptorProtos$MessageOptions.access$19576(descriptorProtos$MessageOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                descriptorProtos$MessageOptions.uninterpretedOption_ = c4195.m8031();
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

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11771;
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

        public C4117 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
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

        public <Type> C4117 addExtension(C4448 c4448, Type type) {
            return (C4117) addExtension((AbstractC4411) c4448, type);
        }

        public C4117 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C4127 c4127) {
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
        public DescriptorProtos$MessageOptions build() {
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptionsBuildPartial = buildPartial();
            if (descriptorProtos$MessageOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$MessageOptionsBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$MessageOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$MessageOptions buildPartial() {
            DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = new DescriptorProtos$MessageOptions(this);
            buildPartialRepeatedFields(descriptorProtos$MessageOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$MessageOptions);
            }
            onBuilt();
            return descriptorProtos$MessageOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4117 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.messageSetWireFormat_ = false;
            this.noStandardDescriptorAccessor_ = false;
            this.deprecated_ = false;
            this.mapEntry_ = false;
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
            this.bitField0_ &= -65;
            return this;
        }

        public C4117 clearDeprecated() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public C4117 clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= -17;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
            onChanged();
            return this;
        }

        public <Type> C4117 clearExtension(C4448 c4448) {
            return (C4117) clearExtension((AbstractC4411) c4448);
        }

        public C4117 clearFeatures() {
            this.bitField0_ &= -33;
            this.features_ = null;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4117 clearMapEntry() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
            onChanged();
            return this;
        }

        public C4117 clearMessageSetWireFormat() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
            onChanged();
            return this;
        }

        public C4117 clearNoStandardDescriptorAccessor() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
            onChanged();
            return this;
        }

        public C4117 clearUninterpretedOption() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4334
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.InterfaceC4334
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11771;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4334
        public DescriptorProtos$FeatureSet getFeatures() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$FeatureSet) c4174.m7939();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C4105 getFeaturesBuilder() {
            this.bitField0_ |= 32;
            onChanged();
            return (DescriptorProtos$FeatureSet.C4105) internalGetFeaturesFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4334
        public InterfaceC4338 getFeaturesOrBuilder() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (InterfaceC4338) c4174.m7938();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC4334
        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        @Override // com.google.protobuf.InterfaceC4334
        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        @Override // com.google.protobuf.InterfaceC4334
        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override // com.google.protobuf.InterfaceC4334
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

        @Override // com.google.protobuf.InterfaceC4334
        public int getUninterpretedOptionCount() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4334
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4334
        public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.get(i) : (InterfaceC4505) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4334
        public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC4334
        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4334
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4334
        public boolean hasFeatures() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4334
        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4334
        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4334
        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11770;
            c4451.m8386(DescriptorProtos$MessageOptions.class, C4117.class);
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

        public C4117 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$FeatureSet);
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

        public C4117 mergeFrom(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
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
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11357.isEmpty();
                C4195 c4195 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$MessageOptions.uninterpretedOption_;
                    this.bitField0_ &= -65;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$MessageOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$MessageOptions);
            mergeUnknownFields(descriptorProtos$MessageOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C4117 removeUninterpretedOption(int i) {
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

        public C4117 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Deprecated
        public C4117 setDeprecatedLegacyJsonFieldConflicts(boolean z) {
            this.deprecatedLegacyJsonFieldConflicts_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public <Type> C4117 setExtension(C4448 c4448, Type type) {
            return (C4117) setExtension((AbstractC4411) c4448, type);
        }

        public C4117 setFeatures(DescriptorProtos$FeatureSet.C4105 c4105) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                this.features_ = c4105.build();
            } else {
                c4174.m7946(c4105.build());
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4117 setMapEntry(boolean z) {
            this.mapEntry_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4117 setMessageSetWireFormat(boolean z) {
            this.messageSetWireFormat_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4117 setNoStandardDescriptorAccessor(boolean z) {
            this.noStandardDescriptorAccessor_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4117 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
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
        public DescriptorProtos$MessageOptions getDefaultInstanceForType() {
            return DescriptorProtos$MessageOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public <Type> C4117 setExtension(C4448 c4448, int i, Type type) {
            return (C4117) setExtension((AbstractC4411) c4448, i, type);
        }

        private C4117(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public DescriptorProtos$UninterpretedOption.C4127 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C4127) internalGetUninterpretedOptionFieldBuilder().m8020(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        public C4117 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C4117 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c4174.m7946(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4117 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C4117 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C4117 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
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
        public C4117 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$MessageOptions) {
                return mergeFrom((DescriptorProtos$MessageOptions) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4117 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                this.messageSetWireFormat_ = abstractC4306.mo8279();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 16) {
                                this.noStandardDescriptorAccessor_ = abstractC4306.mo8279();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 == 24) {
                                this.deprecated_ = abstractC4306.mo8279();
                                this.bitField0_ |= 4;
                            } else if (iMo8264 == 56) {
                                this.mapEntry_ = abstractC4306.mo8279();
                                this.bitField0_ |= 8;
                            } else if (iMo8264 == 88) {
                                this.deprecatedLegacyJsonFieldConflicts_ = abstractC4306.mo8279();
                                this.bitField0_ |= 16;
                            } else if (iMo8264 == 98) {
                                abstractC4306.mo8275(internalGetFeaturesFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 32;
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
    public DescriptorProtos$MessageOptions getDefaultInstanceForType() {
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

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4117 newBuilderForType() {
        return newBuilder();
    }

    public static C4117 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$MessageOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$MessageOptions) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$MessageOptions) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    private DescriptorProtos$MessageOptions(GeneratedMessage.AbstractC4136 abstractC4136) {
        super(abstractC4136);
        this.messageSetWireFormat_ = false;
        this.noStandardDescriptorAccessor_ = false;
        this.deprecated_ = false;
        this.mapEntry_ = false;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$MessageOptions) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$MessageOptions) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$MessageOptions parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$MessageOptions parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$MessageOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
