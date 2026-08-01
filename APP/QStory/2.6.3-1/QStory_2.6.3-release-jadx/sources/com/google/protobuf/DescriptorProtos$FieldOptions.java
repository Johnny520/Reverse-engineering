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
public final class DescriptorProtos$FieldOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FieldOptions> implements InterfaceC4347 {
    public static final int CTYPE_FIELD_NUMBER = 1;
    public static final int DEBUG_REDACT_FIELD_NUMBER = 16;
    private static final DescriptorProtos$FieldOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int EDITION_DEFAULTS_FIELD_NUMBER = 20;
    public static final int FEATURES_FIELD_NUMBER = 21;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 22;
    public static final int JSTYPE_FIELD_NUMBER = 6;
    public static final int LAZY_FIELD_NUMBER = 5;
    public static final int PACKED_FIELD_NUMBER = 2;
    private static final InterfaceC4207 PARSER;
    public static final int RETENTION_FIELD_NUMBER = 17;
    public static final int TARGETS_FIELD_NUMBER = 19;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
    public static final int WEAK_FIELD_NUMBER = 10;
    private static final long serialVersionUID = 0;
    private static final InterfaceC4238 targets_converter_;
    private int bitField0_;
    private int ctype_;
    private boolean debugRedact_;
    private boolean deprecated_;
    private List<EditionDefault> editionDefaults_;
    private FeatureSupport featureSupport_;
    private DescriptorProtos$FeatureSet features_;
    private int jstype_;
    private boolean lazy_;
    private byte memoizedIsInitialized;
    private boolean packed_;
    private int retention_;
    private InterfaceC4227 targets_;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
    private boolean unverifiedLazy_;
    private boolean weak_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldOptions");
        targets_converter_ = new C4358();
        DEFAULT_INSTANCE = new DescriptorProtos$FieldOptions();
        PARSER = new C4359();
    }

    private DescriptorProtos$FieldOptions() {
        this.ctype_ = 0;
        this.packed_ = false;
        this.jstype_ = 0;
        this.lazy_ = false;
        this.unverifiedLazy_ = false;
        this.deprecated_ = false;
        this.weak_ = false;
        this.debugRedact_ = false;
        this.retention_ = 0;
        this.targets_ = GeneratedMessage.emptyIntList();
        this.memoizedIsInitialized = (byte) -1;
        this.ctype_ = 0;
        this.jstype_ = 0;
        this.retention_ = 0;
        this.targets_ = GeneratedMessage.emptyIntList();
        List list = Collections.EMPTY_LIST;
        this.editionDefaults_ = list;
        this.uninterpretedOption_ = list;
    }

    public static /* synthetic */ int access$23476(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, int i) {
        int i2 = i | descriptorProtos$FieldOptions.bitField0_;
        descriptorProtos$FieldOptions.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$FieldOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11769;
    }

    public static C4111 newBuilder(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FieldOptions);
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FieldOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$FieldOptions)) {
            return super.equals(obj);
        }
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = (DescriptorProtos$FieldOptions) obj;
        if (hasCtype() != descriptorProtos$FieldOptions.hasCtype()) {
            return false;
        }
        if ((hasCtype() && this.ctype_ != descriptorProtos$FieldOptions.ctype_) || hasPacked() != descriptorProtos$FieldOptions.hasPacked()) {
            return false;
        }
        if ((hasPacked() && getPacked() != descriptorProtos$FieldOptions.getPacked()) || hasJstype() != descriptorProtos$FieldOptions.hasJstype()) {
            return false;
        }
        if ((hasJstype() && this.jstype_ != descriptorProtos$FieldOptions.jstype_) || hasLazy() != descriptorProtos$FieldOptions.hasLazy()) {
            return false;
        }
        if ((hasLazy() && getLazy() != descriptorProtos$FieldOptions.getLazy()) || hasUnverifiedLazy() != descriptorProtos$FieldOptions.hasUnverifiedLazy()) {
            return false;
        }
        if ((hasUnverifiedLazy() && getUnverifiedLazy() != descriptorProtos$FieldOptions.getUnverifiedLazy()) || hasDeprecated() != descriptorProtos$FieldOptions.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != descriptorProtos$FieldOptions.getDeprecated()) || hasWeak() != descriptorProtos$FieldOptions.hasWeak()) {
            return false;
        }
        if ((hasWeak() && getWeak() != descriptorProtos$FieldOptions.getWeak()) || hasDebugRedact() != descriptorProtos$FieldOptions.hasDebugRedact()) {
            return false;
        }
        if ((hasDebugRedact() && getDebugRedact() != descriptorProtos$FieldOptions.getDebugRedact()) || hasRetention() != descriptorProtos$FieldOptions.hasRetention()) {
            return false;
        }
        if ((hasRetention() && this.retention_ != descriptorProtos$FieldOptions.retention_) || !this.targets_.equals(descriptorProtos$FieldOptions.targets_) || !getEditionDefaultsList().equals(descriptorProtos$FieldOptions.getEditionDefaultsList()) || hasFeatures() != descriptorProtos$FieldOptions.hasFeatures()) {
            return false;
        }
        if ((!hasFeatures() || getFeatures().equals(descriptorProtos$FieldOptions.getFeatures())) && hasFeatureSupport() == descriptorProtos$FieldOptions.hasFeatureSupport()) {
            return (!hasFeatureSupport() || getFeatureSupport().equals(descriptorProtos$FieldOptions.getFeatureSupport())) && getUninterpretedOptionList().equals(descriptorProtos$FieldOptions.getUninterpretedOptionList()) && getUnknownFields().equals(descriptorProtos$FieldOptions.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$FieldOptions.getExtensionFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public CType getCtype() {
        CType cTypeForNumber = CType.forNumber(this.ctype_);
        return cTypeForNumber == null ? CType.STRING : cTypeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11769;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public EditionDefault getEditionDefaults(int i) {
        return this.editionDefaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4347
    public int getEditionDefaultsCount() {
        return this.editionDefaults_.size();
    }

    @Override // com.google.protobuf.InterfaceC4347
    public List<EditionDefault> getEditionDefaultsList() {
        return this.editionDefaults_;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public InterfaceC4357 getEditionDefaultsOrBuilder(int i) {
        return this.editionDefaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4347
    public List<? extends InterfaceC4357> getEditionDefaultsOrBuilderList() {
        return this.editionDefaults_;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4347
    public FeatureSupport getFeatureSupport() {
        FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public InterfaceC4344 getFeatureSupportOrBuilder() {
        FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public InterfaceC4338 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public JSType getJstype() {
        JSType jSTypeForNumber = JSType.forNumber(this.jstype_);
        return jSTypeForNumber == null ? JSType.JS_NORMAL : jSTypeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean getLazy() {
        return this.lazy_;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public OptionRetention getRetention() {
        OptionRetention optionRetentionForNumber = OptionRetention.forNumber(this.retention_);
        return optionRetentionForNumber == null ? OptionRetention.RETENTION_UNKNOWN : optionRetentionForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSize;
        if (i2 != -1) {
            return i2;
        }
        int iM8191 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8191(1, this.ctype_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM8191 += AbstractC4294.m8193(2);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM8191 += AbstractC4294.m8193(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM8191 += AbstractC4294.m8193(5);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM8191 += AbstractC4294.m8191(6, this.jstype_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM8191 += AbstractC4294.m8193(10);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM8191 += AbstractC4294.m8193(15);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM8191 += AbstractC4294.m8193(16);
        }
        if ((this.bitField0_ & 256) != 0) {
            iM8191 += AbstractC4294.m8191(17, this.retention_);
        }
        int i3 = 0;
        int iM8197 = 0;
        while (true) {
            i = ((C4445) this.targets_).f11597;
            if (i3 >= i) {
                break;
            }
            iM8197 += AbstractC4294.m8197(r5.m8373(i3));
            i3++;
        }
        int iM8202 = (i * 2) + iM8191 + iM8197;
        int size = this.editionDefaults_.size();
        for (int i4 = 0; i4 < size; i4++) {
            iM8202 += AbstractC4294.m8202(this.editionDefaults_.get(i4));
        }
        int iM82022 = (size * 2) + iM8202;
        if ((this.bitField0_ & 512) != 0) {
            iM82022 += AbstractC4294.m8198(21, getFeatures());
        }
        if ((this.bitField0_ & 1024) != 0) {
            iM82022 += AbstractC4294.m8198(22, getFeatureSupport());
        }
        int size2 = this.uninterpretedOption_.size();
        for (int i5 = 0; i5 < size2; i5++) {
            iM82022 += AbstractC4294.m8202(this.uninterpretedOption_.get(i5));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size2 * 2) + iM82022;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public OptionTargetType getTargets(int i) {
        InterfaceC4238 interfaceC4238 = targets_converter_;
        int iM8373 = ((C4445) this.targets_).m8373(i);
        ((C4358) interfaceC4238).getClass();
        OptionTargetType optionTargetTypeForNumber = OptionTargetType.forNumber(iM8373);
        return optionTargetTypeForNumber == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : optionTargetTypeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public int getTargetsCount() {
        return ((C4445) this.targets_).size();
    }

    @Override // com.google.protobuf.InterfaceC4347
    public List<OptionTargetType> getTargetsList() {
        return new C4237(this.targets_, targets_converter_);
    }

    @Override // com.google.protobuf.InterfaceC4347
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4347
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC4347
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4347
    public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean getUnverifiedLazy() {
        return this.unverifiedLazy_;
    }

    @Override // com.google.protobuf.InterfaceC4347
    @Deprecated
    public boolean getWeak() {
        return this.weak_;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasCtype() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasDebugRedact() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasDeprecated() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasFeatureSupport() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasFeatures() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasJstype() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasLazy() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasPacked() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasRetention() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4347
    public boolean hasUnverifiedLazy() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4347
    @Deprecated
    public boolean hasWeak() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasCtype()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + this.ctype_;
        }
        if (hasPacked()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + AbstractC4234.m8062(getPacked());
        }
        if (hasJstype()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + this.jstype_;
        }
        if (hasLazy()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + AbstractC4234.m8062(getLazy());
        }
        if (hasUnverifiedLazy()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 15, 53) + AbstractC4234.m8062(getUnverifiedLazy());
        }
        if (hasDeprecated()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + AbstractC4234.m8062(getDeprecated());
        }
        if (hasWeak()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 10, 53) + AbstractC4234.m8062(getWeak());
        }
        if (hasDebugRedact()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 16, 53) + AbstractC4234.m8062(getDebugRedact());
        }
        if (hasRetention()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 17, 53) + this.retention_;
        }
        if (getTargetsCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 19, 53) + this.targets_.hashCode();
        }
        if (getEditionDefaultsCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 20, 53) + getEditionDefaultsList().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 21, 53) + getFeatures().hashCode();
        }
        if (hasFeatureSupport()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 22, 53) + getFeatureSupport().hashCode();
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
        C4451 c4451 = AbstractC4502.f11768;
        c4451.m8386(DescriptorProtos$FieldOptions.class, C4111.class);
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
    public C4111 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4111(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4111 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4111() : new C4111().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        InterfaceC4461 interfaceC4461NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8210(1, this.ctype_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8222(2, this.packed_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC4294.mo8222(3, this.deprecated_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.mo8222(5, this.lazy_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8210(6, this.jstype_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC4294.mo8222(10, this.weak_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC4294.mo8222(15, this.unverifiedLazy_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC4294.mo8222(16, this.debugRedact_);
        }
        if ((this.bitField0_ & 256) != 0) {
            abstractC4294.mo8210(17, this.retention_);
        }
        int i = 0;
        while (true) {
            C4445 c4445 = (C4445) this.targets_;
            if (i >= c4445.f11597) {
                break;
            }
            abstractC4294.mo8210(19, c4445.m8373(i));
            i++;
        }
        for (int i2 = 0; i2 < this.editionDefaults_.size(); i2++) {
            abstractC4294.mo8208(20, this.editionDefaults_.get(i2));
        }
        if ((this.bitField0_ & 512) != 0) {
            abstractC4294.mo8208(21, getFeatures());
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC4294.mo8208(22, getFeatureSupport());
        }
        for (int i3 = 0; i3 < this.uninterpretedOption_.size(); i3++) {
            abstractC4294.mo8208(999, this.uninterpretedOption_.get(i3));
        }
        interfaceC4461NewExtensionSerializer.mo8387(536870912, abstractC4294);
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class EditionDefault extends GeneratedMessage implements InterfaceC4357 {
        private static final EditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        private static final InterfaceC4207 PARSER;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int edition_;
        private byte memoizedIsInitialized;
        private volatile Object value_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "EditionDefault");
            DEFAULT_INSTANCE = new EditionDefault();
            PARSER = new C4354();
        }

        private EditionDefault() {
            this.edition_ = 0;
            this.value_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.edition_ = 0;
            this.value_ = "";
        }

        public static /* synthetic */ int access$20576(EditionDefault editionDefault, int i) {
            int i2 = i | editionDefault.bitField0_;
            editionDefault.bitField0_ = i2;
            return i2;
        }

        public static EditionDefault getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11767;
        }

        public static C4109 newBuilder(EditionDefault editionDefault) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(editionDefault);
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream) {
            return (EditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer) {
            return (EditionDefault) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EditionDefault)) {
                return super.equals(obj);
            }
            EditionDefault editionDefault = (EditionDefault) obj;
            if (hasEdition() != editionDefault.hasEdition()) {
                return false;
            }
            if ((!hasEdition() || this.edition_ == editionDefault.edition_) && hasValue() == editionDefault.hasValue()) {
                return (!hasValue() || getValue().equals(editionDefault.getValue())) && getUnknownFields().equals(editionDefault.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11767;
        }

        @Override // com.google.protobuf.InterfaceC4357
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
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
            int iComputeStringSize = (this.bitField0_ & 2) != 0 ? GeneratedMessage.computeStringSize(2, this.value_) : 0;
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += AbstractC4294.m8191(3, this.edition_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4357
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.value_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4357
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4357
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4357
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEdition()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + this.edition_;
            }
            if (hasValue()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getValue().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11766;
            c4451.m8386(EditionDefault.class, C4109.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365
        public C4109 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4109(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4109 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4109() : new C4109().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC4294, 2, this.value_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC4294.mo8210(3, this.edition_);
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4109 extends GeneratedMessage.AbstractC4137 implements InterfaceC4357 {
            private int bitField0_;
            private int edition_;
            private Object value_;

            private C4109() {
                this.edition_ = 0;
                this.value_ = "";
            }

            private void buildPartial0(EditionDefault editionDefault) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    editionDefault.edition_ = this.edition_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    editionDefault.value_ = this.value_;
                    i |= 2;
                }
                EditionDefault.access$20576(editionDefault, i);
            }

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11767;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public EditionDefault build() {
                EditionDefault editionDefaultBuildPartial = buildPartial();
                if (editionDefaultBuildPartial.isInitialized()) {
                    return editionDefaultBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) editionDefaultBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public EditionDefault buildPartial() {
                EditionDefault editionDefault = new EditionDefault(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(editionDefault);
                }
                onBuilt();
                return editionDefault;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4109 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.edition_ = 0;
                this.value_ = "";
                return this;
            }

            public C4109 clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
                onChanged();
                return this;
            }

            public C4109 clearValue() {
                this.value_ = EditionDefault.getDefaultInstance().getValue();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11767;
            }

            @Override // com.google.protobuf.InterfaceC4357
            public DescriptorProtos$Edition getEdition() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC4357
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.value_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4357
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4357
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4357
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11766;
                c4451.m8386(EditionDefault.class, C4109.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4109 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 18) {
                                    this.value_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 2;
                                } else if (iMo8264 == 24) {
                                    int iMo8283 = abstractC4306.mo8283();
                                    if (DescriptorProtos$Edition.forNumber(iMo8283) == null) {
                                        mergeUnknownVarintField(3, iMo8283);
                                    } else {
                                        this.edition_ = iMo8283;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
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

            public C4109 setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 1;
                this.edition_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C4109 setValue(String str) {
                str.getClass();
                this.value_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4109 setValueBytes(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public EditionDefault getDefaultInstanceForType() {
                return EditionDefault.getDefaultInstance();
            }

            private C4109(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
                this.edition_ = 0;
                this.value_ = "";
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4109 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof EditionDefault) {
                    return mergeFrom((EditionDefault) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4109 mergeFrom(EditionDefault editionDefault) {
                if (editionDefault == EditionDefault.getDefaultInstance()) {
                    return this;
                }
                if (editionDefault.hasEdition()) {
                    setEdition(editionDefault.getEdition());
                }
                if (editionDefault.hasValue()) {
                    this.value_ = editionDefault.value_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(editionDefault.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public EditionDefault getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (EditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4109 newBuilderForType() {
            return newBuilder();
        }

        public static C4109 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (EditionDefault) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static EditionDefault parseFrom(ByteString byteString) {
            return (EditionDefault) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        private EditionDefault(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
            this.edition_ = 0;
            this.value_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EditionDefault parseFrom(ByteString byteString, C4529 c4529) {
            return (EditionDefault) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        public static EditionDefault parseFrom(byte[] bArr) {
            return (EditionDefault) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static EditionDefault parseFrom(byte[] bArr, C4529 c4529) {
            return (EditionDefault) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static EditionDefault parseFrom(InputStream inputStream) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static EditionDefault parseFrom(InputStream inputStream, C4529 c4529) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static EditionDefault parseFrom(AbstractC4306 abstractC4306) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static EditionDefault parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class FeatureSupport extends GeneratedMessage implements InterfaceC4344 {
        private static final FeatureSupport DEFAULT_INSTANCE;
        public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
        public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
        public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
        public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
        private static final InterfaceC4207 PARSER;
        public static final int REMOVAL_ERROR_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object deprecationWarning_;
        private int editionDeprecated_;
        private int editionIntroduced_;
        private int editionRemoved_;
        private byte memoizedIsInitialized;
        private volatile Object removalError_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSupport");
            DEFAULT_INSTANCE = new FeatureSupport();
            PARSER = new C4356();
        }

        private FeatureSupport() {
            this.editionIntroduced_ = 0;
            this.editionDeprecated_ = 0;
            this.deprecationWarning_ = "";
            this.editionRemoved_ = 0;
            this.removalError_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.editionIntroduced_ = 0;
            this.editionDeprecated_ = 0;
            this.deprecationWarning_ = "";
            this.editionRemoved_ = 0;
            this.removalError_ = "";
        }

        public static /* synthetic */ int access$21676(FeatureSupport featureSupport, int i) {
            int i2 = i | featureSupport.bitField0_;
            featureSupport.bitField0_ = i2;
            return i2;
        }

        public static FeatureSupport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11757;
        }

        public static C4110 newBuilder(FeatureSupport featureSupport) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureSupport);
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream) {
            return (FeatureSupport) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer) {
            return (FeatureSupport) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeatureSupport)) {
                return super.equals(obj);
            }
            FeatureSupport featureSupport = (FeatureSupport) obj;
            if (hasEditionIntroduced() != featureSupport.hasEditionIntroduced()) {
                return false;
            }
            if ((hasEditionIntroduced() && this.editionIntroduced_ != featureSupport.editionIntroduced_) || hasEditionDeprecated() != featureSupport.hasEditionDeprecated()) {
                return false;
            }
            if ((hasEditionDeprecated() && this.editionDeprecated_ != featureSupport.editionDeprecated_) || hasDeprecationWarning() != featureSupport.hasDeprecationWarning()) {
                return false;
            }
            if ((hasDeprecationWarning() && !getDeprecationWarning().equals(featureSupport.getDeprecationWarning())) || hasEditionRemoved() != featureSupport.hasEditionRemoved()) {
                return false;
            }
            if ((!hasEditionRemoved() || this.editionRemoved_ == featureSupport.editionRemoved_) && hasRemovalError() == featureSupport.hasRemovalError()) {
                return (!hasRemovalError() || getRemovalError().equals(featureSupport.getRemovalError())) && getUnknownFields().equals(featureSupport.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public String getDeprecationWarning() {
            Object obj = this.deprecationWarning_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deprecationWarning_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public ByteString getDeprecationWarningBytes() {
            Object obj = this.deprecationWarning_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deprecationWarning_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11757;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public DescriptorProtos$Edition getEditionDeprecated() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionDeprecated_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public DescriptorProtos$Edition getEditionIntroduced() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionIntroduced_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public DescriptorProtos$Edition getEditionRemoved() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionRemoved_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public InterfaceC4207 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public String getRemovalError() {
            Object obj = this.removalError_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.removalError_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public ByteString getRemovalErrorBytes() {
            Object obj = this.removalError_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.removalError_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iM8191 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8191(1, this.editionIntroduced_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM8191 += AbstractC4294.m8191(2, this.editionDeprecated_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM8191 += GeneratedMessage.computeStringSize(3, this.deprecationWarning_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iM8191 += AbstractC4294.m8191(4, this.editionRemoved_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iM8191 += GeneratedMessage.computeStringSize(5, this.removalError_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM8191;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public boolean hasDeprecationWarning() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public boolean hasEditionDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public boolean hasEditionIntroduced() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public boolean hasEditionRemoved() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4344
        public boolean hasRemovalError() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEditionIntroduced()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + this.editionIntroduced_;
            }
            if (hasEditionDeprecated()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + this.editionDeprecated_;
            }
            if (hasDeprecationWarning()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getDeprecationWarning().hashCode();
            }
            if (hasEditionRemoved()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + this.editionRemoved_;
            }
            if (hasRemovalError()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + getRemovalError().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11756;
            c4451.m8386(FeatureSupport.class, C4110.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365
        public C4110 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4110(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4110 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4110() : new C4110().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC4294.mo8210(1, this.editionIntroduced_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC4294.mo8210(2, this.editionDeprecated_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(abstractC4294, 3, this.deprecationWarning_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC4294.mo8210(4, this.editionRemoved_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(abstractC4294, 5, this.removalError_);
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4110 extends GeneratedMessage.AbstractC4137 implements InterfaceC4344 {
            private int bitField0_;
            private Object deprecationWarning_;
            private int editionDeprecated_;
            private int editionIntroduced_;
            private int editionRemoved_;
            private Object removalError_;

            private C4110() {
                this.editionIntroduced_ = 0;
                this.editionDeprecated_ = 0;
                this.deprecationWarning_ = "";
                this.editionRemoved_ = 0;
                this.removalError_ = "";
            }

            private void buildPartial0(FeatureSupport featureSupport) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    featureSupport.editionIntroduced_ = this.editionIntroduced_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    featureSupport.editionDeprecated_ = this.editionDeprecated_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    featureSupport.deprecationWarning_ = this.deprecationWarning_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    featureSupport.editionRemoved_ = this.editionRemoved_;
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    featureSupport.removalError_ = this.removalError_;
                    i |= 16;
                }
                FeatureSupport.access$21676(featureSupport, i);
            }

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11757;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public FeatureSupport build() {
                FeatureSupport featureSupportBuildPartial = buildPartial();
                if (featureSupportBuildPartial.isInitialized()) {
                    return featureSupportBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) featureSupportBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public FeatureSupport buildPartial() {
                FeatureSupport featureSupport = new FeatureSupport(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureSupport);
                }
                onBuilt();
                return featureSupport;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4110 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.editionIntroduced_ = 0;
                this.editionDeprecated_ = 0;
                this.deprecationWarning_ = "";
                this.editionRemoved_ = 0;
                this.removalError_ = "";
                return this;
            }

            public C4110 clearDeprecationWarning() {
                this.deprecationWarning_ = FeatureSupport.getDefaultInstance().getDeprecationWarning();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public C4110 clearEditionDeprecated() {
                this.bitField0_ &= -3;
                this.editionDeprecated_ = 0;
                onChanged();
                return this;
            }

            public C4110 clearEditionIntroduced() {
                this.bitField0_ &= -2;
                this.editionIntroduced_ = 0;
                onChanged();
                return this;
            }

            public C4110 clearEditionRemoved() {
                this.bitField0_ &= -9;
                this.editionRemoved_ = 0;
                onChanged();
                return this;
            }

            public C4110 clearRemovalError() {
                this.removalError_ = FeatureSupport.getDefaultInstance().getRemovalError();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public String getDeprecationWarning() {
                Object obj = this.deprecationWarning_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deprecationWarning_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public ByteString getDeprecationWarningBytes() {
                Object obj = this.deprecationWarning_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deprecationWarning_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11757;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public DescriptorProtos$Edition getEditionDeprecated() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionDeprecated_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public DescriptorProtos$Edition getEditionIntroduced() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionIntroduced_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public DescriptorProtos$Edition getEditionRemoved() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionRemoved_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public String getRemovalError() {
                Object obj = this.removalError_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.removalError_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public ByteString getRemovalErrorBytes() {
                Object obj = this.removalError_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.removalError_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public boolean hasDeprecationWarning() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public boolean hasEditionDeprecated() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public boolean hasEditionIntroduced() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public boolean hasEditionRemoved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4344
            public boolean hasRemovalError() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11756;
                c4451.m8386(FeatureSupport.class, C4110.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4110 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 8) {
                                    int iMo8283 = abstractC4306.mo8283();
                                    if (DescriptorProtos$Edition.forNumber(iMo8283) == null) {
                                        mergeUnknownVarintField(1, iMo8283);
                                    } else {
                                        this.editionIntroduced_ = iMo8283;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (iMo8264 == 16) {
                                    int iMo82832 = abstractC4306.mo8283();
                                    if (DescriptorProtos$Edition.forNumber(iMo82832) == null) {
                                        mergeUnknownVarintField(2, iMo82832);
                                    } else {
                                        this.editionDeprecated_ = iMo82832;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (iMo8264 == 26) {
                                    this.deprecationWarning_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 4;
                                } else if (iMo8264 == 32) {
                                    int iMo82833 = abstractC4306.mo8283();
                                    if (DescriptorProtos$Edition.forNumber(iMo82833) == null) {
                                        mergeUnknownVarintField(4, iMo82833);
                                    } else {
                                        this.editionRemoved_ = iMo82833;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (iMo8264 == 42) {
                                    this.removalError_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 16;
                                } else if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
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

            public C4110 setDeprecationWarning(String str) {
                str.getClass();
                this.deprecationWarning_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4110 setDeprecationWarningBytes(ByteString byteString) {
                byteString.getClass();
                this.deprecationWarning_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4110 setEditionDeprecated(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 2;
                this.editionDeprecated_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C4110 setEditionIntroduced(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 1;
                this.editionIntroduced_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C4110 setEditionRemoved(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 8;
                this.editionRemoved_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C4110 setRemovalError(String str) {
                str.getClass();
                this.removalError_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C4110 setRemovalErrorBytes(ByteString byteString) {
                byteString.getClass();
                this.removalError_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public FeatureSupport getDefaultInstanceForType() {
                return FeatureSupport.getDefaultInstance();
            }

            private C4110(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
                this.editionIntroduced_ = 0;
                this.editionDeprecated_ = 0;
                this.deprecationWarning_ = "";
                this.editionRemoved_ = 0;
                this.removalError_ = "";
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4110 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof FeatureSupport) {
                    return mergeFrom((FeatureSupport) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4110 mergeFrom(FeatureSupport featureSupport) {
                if (featureSupport == FeatureSupport.getDefaultInstance()) {
                    return this;
                }
                if (featureSupport.hasEditionIntroduced()) {
                    setEditionIntroduced(featureSupport.getEditionIntroduced());
                }
                if (featureSupport.hasEditionDeprecated()) {
                    setEditionDeprecated(featureSupport.getEditionDeprecated());
                }
                if (featureSupport.hasDeprecationWarning()) {
                    this.deprecationWarning_ = featureSupport.deprecationWarning_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (featureSupport.hasEditionRemoved()) {
                    setEditionRemoved(featureSupport.getEditionRemoved());
                }
                if (featureSupport.hasRemovalError()) {
                    this.removalError_ = featureSupport.removalError_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(featureSupport.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public FeatureSupport getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (FeatureSupport) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4110 newBuilderForType() {
            return newBuilder();
        }

        public static C4110 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (FeatureSupport) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static FeatureSupport parseFrom(ByteString byteString) {
            return (FeatureSupport) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static FeatureSupport parseFrom(ByteString byteString, C4529 c4529) {
            return (FeatureSupport) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        public static FeatureSupport parseFrom(byte[] bArr) {
            return (FeatureSupport) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static FeatureSupport parseFrom(byte[] bArr, C4529 c4529) {
            return (FeatureSupport) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        private FeatureSupport(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
            this.editionIntroduced_ = 0;
            this.editionDeprecated_ = 0;
            this.deprecationWarning_ = "";
            this.editionRemoved_ = 0;
            this.removalError_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FeatureSupport parseFrom(InputStream inputStream) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static FeatureSupport parseFrom(InputStream inputStream, C4529 c4529) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static FeatureSupport parseFrom(AbstractC4306 abstractC4306) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static FeatureSupport parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4111 extends GeneratedMessage.AbstractC4136 implements InterfaceC4347 {
        private int bitField0_;
        private int ctype_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private C4195 editionDefaultsBuilder_;
        private List<EditionDefault> editionDefaults_;
        private C4174 featureSupportBuilder_;
        private FeatureSupport featureSupport_;
        private C4174 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private int retention_;
        private InterfaceC4227 targets_;
        private C4195 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
        private boolean unverifiedLazy_;
        private boolean weak_;

        private C4111() {
            this.ctype_ = 0;
            this.jstype_ = 0;
            this.retention_ = 0;
            this.targets_ = GeneratedMessage.emptyIntList();
            List list = Collections.EMPTY_LIST;
            this.editionDefaults_ = list;
            this.uninterpretedOption_ = list;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$FieldOptions.ctype_ = this.ctype_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$FieldOptions.packed_ = this.packed_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$FieldOptions.jstype_ = this.jstype_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                descriptorProtos$FieldOptions.lazy_ = this.lazy_;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                descriptorProtos$FieldOptions.unverifiedLazy_ = this.unverifiedLazy_;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                descriptorProtos$FieldOptions.deprecated_ = this.deprecated_;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                descriptorProtos$FieldOptions.weak_ = this.weak_;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                descriptorProtos$FieldOptions.debugRedact_ = this.debugRedact_;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                descriptorProtos$FieldOptions.retention_ = this.retention_;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                ((AbstractC4380) this.targets_).m8346();
                descriptorProtos$FieldOptions.targets_ = this.targets_;
            }
            if ((i2 & 2048) != 0) {
                C4174 c4174 = this.featuresBuilder_;
                descriptorProtos$FieldOptions.features_ = c4174 == null ? this.features_ : (DescriptorProtos$FeatureSet) c4174.m7943();
                i |= 512;
            }
            if ((i2 & 4096) != 0) {
                C4174 c41742 = this.featureSupportBuilder_;
                descriptorProtos$FieldOptions.featureSupport_ = c41742 == null ? this.featureSupport_ : (FeatureSupport) c41742.m7943();
                i |= 1024;
            }
            DescriptorProtos$FieldOptions.access$23476(descriptorProtos$FieldOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 == null) {
                if ((this.bitField0_ & 1024) != 0) {
                    this.editionDefaults_ = Collections.unmodifiableList(this.editionDefaults_);
                    this.bitField0_ &= -1025;
                }
                descriptorProtos$FieldOptions.editionDefaults_ = this.editionDefaults_;
            } else {
                descriptorProtos$FieldOptions.editionDefaults_ = c4195.m8031();
            }
            C4195 c41952 = this.uninterpretedOptionBuilder_;
            if (c41952 != null) {
                descriptorProtos$FieldOptions.uninterpretedOption_ = c41952.m8031();
                return;
            }
            if ((this.bitField0_ & 8192) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                this.bitField0_ &= -8193;
            }
            descriptorProtos$FieldOptions.uninterpretedOption_ = this.uninterpretedOption_;
        }

        private void ensureEditionDefaultsIsMutable() {
            if ((this.bitField0_ & 1024) == 0) {
                this.editionDefaults_ = new ArrayList(this.editionDefaults_);
                this.bitField0_ |= 1024;
            }
        }

        private void ensureTargetsIsMutable() {
            InterfaceC4235 interfaceC4235 = this.targets_;
            if (!((AbstractC4380) interfaceC4235).f11544) {
                this.targets_ = (InterfaceC4227) GeneratedMessage.makeMutableCopy(interfaceC4235);
            }
            this.bitField0_ |= 512;
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 8192) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 8192;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11769;
        }

        private C4195 internalGetEditionDefaultsFieldBuilder() {
            if (this.editionDefaultsBuilder_ == null) {
                this.editionDefaultsBuilder_ = new C4195(this.editionDefaults_, getParentForChildren(), isClean());
                this.editionDefaults_ = null;
            }
            return this.editionDefaultsBuilder_;
        }

        private C4174 internalGetFeatureSupportFieldBuilder() {
            if (this.featureSupportBuilder_ == null) {
                this.featureSupportBuilder_ = new C4174(getFeatureSupport(), getParentForChildren(), isClean());
                this.featureSupport_ = null;
            }
            return this.featureSupportBuilder_;
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
                internalGetEditionDefaultsFieldBuilder();
                internalGetFeaturesFieldBuilder();
                internalGetFeatureSupportFieldBuilder();
                internalGetUninterpretedOptionFieldBuilder();
            }
        }

        public C4111 addAllEditionDefaults(Iterable<? extends EditionDefault> iterable) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureEditionDefaultsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.editionDefaults_);
            onChanged();
            return this;
        }

        public C4111 addAllTargets(Iterable<? extends OptionTargetType> iterable) {
            ensureTargetsIsMutable();
            for (OptionTargetType optionTargetType : iterable) {
                ((C4445) this.targets_).m8371(optionTargetType.getNumber());
            }
            onChanged();
            return this;
        }

        public C4111 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
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

        public C4111 addEditionDefaults(EditionDefault.C4109 c4109) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4109.build());
                return this;
            }
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.add(c4109.build());
            onChanged();
            return this;
        }

        public EditionDefault.C4109 addEditionDefaultsBuilder() {
            return (EditionDefault.C4109) internalGetEditionDefaultsFieldBuilder().m8019(EditionDefault.getDefaultInstance());
        }

        public <Type> C4111 addExtension(C4448 c4448, Type type) {
            return (C4111) addExtension((AbstractC4411) c4448, type);
        }

        public C4111 addTargets(OptionTargetType optionTargetType) {
            optionTargetType.getClass();
            ensureTargetsIsMutable();
            ((C4445) this.targets_).m8371(optionTargetType.getNumber());
            onChanged();
            return this;
        }

        public C4111 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C4127 c4127) {
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
        public DescriptorProtos$FieldOptions build() {
            DescriptorProtos$FieldOptions descriptorProtos$FieldOptionsBuildPartial = buildPartial();
            if (descriptorProtos$FieldOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$FieldOptionsBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$FieldOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FieldOptions buildPartial() {
            DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = new DescriptorProtos$FieldOptions(this);
            buildPartialRepeatedFields(descriptorProtos$FieldOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FieldOptions);
            }
            onBuilt();
            return descriptorProtos$FieldOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4111 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.ctype_ = 0;
            this.packed_ = false;
            this.jstype_ = 0;
            this.lazy_ = false;
            this.unverifiedLazy_ = false;
            this.deprecated_ = false;
            this.weak_ = false;
            this.debugRedact_ = false;
            this.retention_ = 0;
            this.targets_ = GeneratedMessage.emptyIntList();
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 == null) {
                this.editionDefaults_ = Collections.EMPTY_LIST;
            } else {
                this.editionDefaults_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -1025;
            this.features_ = null;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.featuresBuilder_ = null;
            }
            this.featureSupport_ = null;
            C4174 c41742 = this.featureSupportBuilder_;
            if (c41742 != null) {
                c41742.f11316 = null;
                this.featureSupportBuilder_ = null;
            }
            C4195 c41952 = this.uninterpretedOptionBuilder_;
            if (c41952 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c41952.m8030();
            }
            this.bitField0_ &= -8193;
            return this;
        }

        public C4111 clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
            onChanged();
            return this;
        }

        public C4111 clearDebugRedact() {
            this.bitField0_ &= -129;
            this.debugRedact_ = false;
            onChanged();
            return this;
        }

        public C4111 clearDeprecated() {
            this.bitField0_ &= -33;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        public C4111 clearEditionDefaults() {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.editionDefaults_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -1025;
            onChanged();
            return this;
        }

        public <Type> C4111 clearExtension(C4448 c4448) {
            return (C4111) clearExtension((AbstractC4411) c4448);
        }

        public C4111 clearFeatureSupport() {
            this.bitField0_ &= -4097;
            this.featureSupport_ = null;
            C4174 c4174 = this.featureSupportBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.featureSupportBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4111 clearFeatures() {
            this.bitField0_ &= -2049;
            this.features_ = null;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4111 clearJstype() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
            onChanged();
            return this;
        }

        public C4111 clearLazy() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
            onChanged();
            return this;
        }

        public C4111 clearPacked() {
            this.bitField0_ &= -3;
            this.packed_ = false;
            onChanged();
            return this;
        }

        public C4111 clearRetention() {
            this.bitField0_ &= -257;
            this.retention_ = 0;
            onChanged();
            return this;
        }

        public C4111 clearTargets() {
            this.targets_ = GeneratedMessage.emptyIntList();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C4111 clearUninterpretedOption() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -8193;
            onChanged();
            return this;
        }

        public C4111 clearUnverifiedLazy() {
            this.bitField0_ &= -17;
            this.unverifiedLazy_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public C4111 clearWeak() {
            this.bitField0_ &= -65;
            this.weak_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public CType getCtype() {
            CType cTypeForNumber = CType.forNumber(this.ctype_);
            return cTypeForNumber == null ? CType.STRING : cTypeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11769;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public EditionDefault getEditionDefaults(int i) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            return c4195 == null ? this.editionDefaults_.get(i) : (EditionDefault) c4195.m8025(i, false);
        }

        public EditionDefault.C4109 getEditionDefaultsBuilder(int i) {
            return (EditionDefault.C4109) internalGetEditionDefaultsFieldBuilder().m8032(i);
        }

        public List<EditionDefault.C4109> getEditionDefaultsBuilderList() {
            return internalGetEditionDefaultsFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4347
        public int getEditionDefaultsCount() {
            C4195 c4195 = this.editionDefaultsBuilder_;
            return c4195 == null ? this.editionDefaults_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4347
        public List<EditionDefault> getEditionDefaultsList() {
            C4195 c4195 = this.editionDefaultsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.editionDefaults_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4347
        public InterfaceC4357 getEditionDefaultsOrBuilder(int i) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            return c4195 == null ? this.editionDefaults_.get(i) : (InterfaceC4357) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4347
        public List<? extends InterfaceC4357> getEditionDefaultsOrBuilderList() {
            C4195 c4195 = this.editionDefaultsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.editionDefaults_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4347
        public FeatureSupport getFeatureSupport() {
            C4174 c4174 = this.featureSupportBuilder_;
            if (c4174 != null) {
                return (FeatureSupport) c4174.m7939();
            }
            FeatureSupport featureSupport = this.featureSupport_;
            return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
        }

        public FeatureSupport.C4110 getFeatureSupportBuilder() {
            this.bitField0_ |= 4096;
            onChanged();
            return (FeatureSupport.C4110) internalGetFeatureSupportFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4347
        public InterfaceC4344 getFeatureSupportOrBuilder() {
            C4174 c4174 = this.featureSupportBuilder_;
            if (c4174 != null) {
                return (InterfaceC4344) c4174.m7938();
            }
            FeatureSupport featureSupport = this.featureSupport_;
            return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public DescriptorProtos$FeatureSet getFeatures() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$FeatureSet) c4174.m7939();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C4105 getFeaturesBuilder() {
            this.bitField0_ |= 2048;
            onChanged();
            return (DescriptorProtos$FeatureSet.C4105) internalGetFeaturesFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4347
        public InterfaceC4338 getFeaturesOrBuilder() {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                return (InterfaceC4338) c4174.m7938();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public JSType getJstype() {
            JSType jSTypeForNumber = JSType.forNumber(this.jstype_);
            return jSTypeForNumber == null ? JSType.JS_NORMAL : jSTypeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean getLazy() {
            return this.lazy_;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public OptionRetention getRetention() {
            OptionRetention optionRetentionForNumber = OptionRetention.forNumber(this.retention_);
            return optionRetentionForNumber == null ? OptionRetention.RETENTION_UNKNOWN : optionRetentionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public OptionTargetType getTargets(int i) {
            InterfaceC4238 interfaceC4238 = DescriptorProtos$FieldOptions.targets_converter_;
            int iM8373 = ((C4445) this.targets_).m8373(i);
            ((C4358) interfaceC4238).getClass();
            OptionTargetType optionTargetTypeForNumber = OptionTargetType.forNumber(iM8373);
            return optionTargetTypeForNumber == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : optionTargetTypeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public int getTargetsCount() {
            return ((C4445) this.targets_).size();
        }

        @Override // com.google.protobuf.InterfaceC4347
        public List<OptionTargetType> getTargetsList() {
            return new C4237(this.targets_, DescriptorProtos$FieldOptions.targets_converter_);
        }

        @Override // com.google.protobuf.InterfaceC4347
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

        @Override // com.google.protobuf.InterfaceC4347
        public int getUninterpretedOptionCount() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4347
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4347
        public InterfaceC4505 getUninterpretedOptionOrBuilder(int i) {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 == null ? this.uninterpretedOption_.get(i) : (InterfaceC4505) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4347
        public List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList() {
            C4195 c4195 = this.uninterpretedOptionBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean getUnverifiedLazy() {
            return this.unverifiedLazy_;
        }

        @Override // com.google.protobuf.InterfaceC4347
        @Deprecated
        public boolean getWeak() {
            return this.weak_;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasDebugRedact() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasDeprecated() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasFeatureSupport() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasFeatures() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasRetention() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4347
        public boolean hasUnverifiedLazy() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4347
        @Deprecated
        public boolean hasWeak() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11768;
            c4451.m8386(DescriptorProtos$FieldOptions.class, C4111.class);
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

        public C4111 mergeFeatureSupport(FeatureSupport featureSupport) {
            FeatureSupport featureSupport2;
            C4174 c4174 = this.featureSupportBuilder_;
            if (c4174 != null) {
                c4174.m7945(featureSupport);
            } else if ((this.bitField0_ & 4096) == 0 || (featureSupport2 = this.featureSupport_) == null || featureSupport2 == FeatureSupport.getDefaultInstance()) {
                this.featureSupport_ = featureSupport;
            } else {
                getFeatureSupportBuilder().mergeFrom(featureSupport);
            }
            if (this.featureSupport_ != null) {
                this.bitField0_ |= 4096;
                onChanged();
            }
            return this;
        }

        public C4111 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$FeatureSet);
            } else if ((this.bitField0_ & 2048) == 0 || (descriptorProtos$FeatureSet2 = this.features_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                getFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
            }
            if (this.features_ != null) {
                this.bitField0_ |= 2048;
                onChanged();
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C4111 mergeFrom(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            if (descriptorProtos$FieldOptions == DescriptorProtos$FieldOptions.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$FieldOptions.hasCtype()) {
                setCtype(descriptorProtos$FieldOptions.getCtype());
            }
            if (descriptorProtos$FieldOptions.hasPacked()) {
                setPacked(descriptorProtos$FieldOptions.getPacked());
            }
            if (descriptorProtos$FieldOptions.hasJstype()) {
                setJstype(descriptorProtos$FieldOptions.getJstype());
            }
            if (descriptorProtos$FieldOptions.hasLazy()) {
                setLazy(descriptorProtos$FieldOptions.getLazy());
            }
            if (descriptorProtos$FieldOptions.hasUnverifiedLazy()) {
                setUnverifiedLazy(descriptorProtos$FieldOptions.getUnverifiedLazy());
            }
            if (descriptorProtos$FieldOptions.hasDeprecated()) {
                setDeprecated(descriptorProtos$FieldOptions.getDeprecated());
            }
            if (descriptorProtos$FieldOptions.hasWeak()) {
                setWeak(descriptorProtos$FieldOptions.getWeak());
            }
            if (descriptorProtos$FieldOptions.hasDebugRedact()) {
                setDebugRedact(descriptorProtos$FieldOptions.getDebugRedact());
            }
            if (descriptorProtos$FieldOptions.hasRetention()) {
                setRetention(descriptorProtos$FieldOptions.getRetention());
            }
            if (!descriptorProtos$FieldOptions.targets_.isEmpty()) {
                if (this.targets_.isEmpty()) {
                    InterfaceC4227 interfaceC4227 = descriptorProtos$FieldOptions.targets_;
                    this.targets_ = interfaceC4227;
                    ((AbstractC4380) interfaceC4227).m8346();
                    this.bitField0_ |= 512;
                } else {
                    ensureTargetsIsMutable();
                    ((C4445) this.targets_).addAll(descriptorProtos$FieldOptions.targets_);
                }
                onChanged();
            }
            if (this.editionDefaultsBuilder_ == null) {
                if (!descriptorProtos$FieldOptions.editionDefaults_.isEmpty()) {
                    if (this.editionDefaults_.isEmpty()) {
                        this.editionDefaults_ = descriptorProtos$FieldOptions.editionDefaults_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureEditionDefaultsIsMutable();
                        this.editionDefaults_.addAll(descriptorProtos$FieldOptions.editionDefaults_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$FieldOptions.editionDefaults_.isEmpty()) {
                boolean zIsEmpty = this.editionDefaultsBuilder_.f11357.isEmpty();
                C4195 c4195 = this.editionDefaultsBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.editionDefaultsBuilder_ = null;
                    this.editionDefaults_ = descriptorProtos$FieldOptions.editionDefaults_;
                    this.bitField0_ &= -1025;
                    this.editionDefaultsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEditionDefaultsFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$FieldOptions.editionDefaults_);
                }
            }
            if (descriptorProtos$FieldOptions.hasFeatures()) {
                mergeFeatures(descriptorProtos$FieldOptions.getFeatures());
            }
            if (descriptorProtos$FieldOptions.hasFeatureSupport()) {
                mergeFeatureSupport(descriptorProtos$FieldOptions.getFeatureSupport());
            }
            if (this.uninterpretedOptionBuilder_ == null) {
                if (!descriptorProtos$FieldOptions.uninterpretedOption_.isEmpty()) {
                    if (this.uninterpretedOption_.isEmpty()) {
                        this.uninterpretedOption_ = descriptorProtos$FieldOptions.uninterpretedOption_;
                        this.bitField0_ &= -8193;
                    } else {
                        ensureUninterpretedOptionIsMutable();
                        this.uninterpretedOption_.addAll(descriptorProtos$FieldOptions.uninterpretedOption_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$FieldOptions.uninterpretedOption_.isEmpty()) {
                boolean zIsEmpty2 = this.uninterpretedOptionBuilder_.f11357.isEmpty();
                C4195 c41952 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty2) {
                    c41952.f11358 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$FieldOptions.uninterpretedOption_;
                    this.bitField0_ &= -8193;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c41952.m8021(descriptorProtos$FieldOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$FieldOptions);
            mergeUnknownFields(descriptorProtos$FieldOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C4111 removeEditionDefaults(int i) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.remove(i);
            onChanged();
            return this;
        }

        public C4111 removeUninterpretedOption(int i) {
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

        public C4111 setCtype(CType cType) {
            cType.getClass();
            this.bitField0_ |= 1;
            this.ctype_ = cType.getNumber();
            onChanged();
            return this;
        }

        public C4111 setDebugRedact(boolean z) {
            this.debugRedact_ = z;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C4111 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4111 setEditionDefaults(int i, EditionDefault.C4109 c4109) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4109.build());
                return this;
            }
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.set(i, c4109.build());
            onChanged();
            return this;
        }

        public <Type> C4111 setExtension(C4448 c4448, Type type) {
            return (C4111) setExtension((AbstractC4411) c4448, type);
        }

        public C4111 setFeatureSupport(FeatureSupport.C4110 c4110) {
            C4174 c4174 = this.featureSupportBuilder_;
            if (c4174 == null) {
                this.featureSupport_ = c4110.build();
            } else {
                c4174.m7946(c4110.build());
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C4111 setFeatures(DescriptorProtos$FeatureSet.C4105 c4105) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                this.features_ = c4105.build();
            } else {
                c4174.m7946(c4105.build());
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C4111 setJstype(JSType jSType) {
            jSType.getClass();
            this.bitField0_ |= 4;
            this.jstype_ = jSType.getNumber();
            onChanged();
            return this;
        }

        public C4111 setLazy(boolean z) {
            this.lazy_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4111 setPacked(boolean z) {
            this.packed_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4111 setRetention(OptionRetention optionRetention) {
            optionRetention.getClass();
            this.bitField0_ |= 256;
            this.retention_ = optionRetention.getNumber();
            onChanged();
            return this;
        }

        public C4111 setTargets(int i, OptionTargetType optionTargetType) {
            optionTargetType.getClass();
            ensureTargetsIsMutable();
            ((C4445) this.targets_).m8374(i, optionTargetType.getNumber());
            onChanged();
            return this;
        }

        public C4111 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
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

        public C4111 setUnverifiedLazy(boolean z) {
            this.unverifiedLazy_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Deprecated
        public C4111 setWeak(boolean z) {
            this.weak_ = z;
            this.bitField0_ |= 64;
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
        public DescriptorProtos$FieldOptions getDefaultInstanceForType() {
            return DescriptorProtos$FieldOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public <Type> C4111 setExtension(C4448 c4448, int i, Type type) {
            return (C4111) setExtension((AbstractC4411) c4448, i, type);
        }

        public EditionDefault.C4109 addEditionDefaultsBuilder(int i) {
            return (EditionDefault.C4109) internalGetEditionDefaultsFieldBuilder().m8020(i, EditionDefault.getDefaultInstance());
        }

        public DescriptorProtos$UninterpretedOption.C4127 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C4127) internalGetUninterpretedOptionFieldBuilder().m8020(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        private C4111(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.ctype_ = 0;
            this.jstype_ = 0;
            this.retention_ = 0;
            this.targets_ = GeneratedMessage.emptyIntList();
            List list = Collections.EMPTY_LIST;
            this.editionDefaults_ = list;
            this.uninterpretedOption_ = list;
            maybeForceBuilderInitialization();
        }

        public C4111 addEditionDefaults(int i, EditionDefault editionDefault) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 == null) {
                editionDefault.getClass();
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.add(i, editionDefault);
                onChanged();
                return this;
            }
            c4195.m8018(i, editionDefault);
            return this;
        }

        public C4111 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C4111 setEditionDefaults(int i, EditionDefault editionDefault) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 == null) {
                editionDefault.getClass();
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.set(i, editionDefault);
                onChanged();
                return this;
            }
            c4195.m8022(i, editionDefault);
            return this;
        }

        public C4111 setFeatureSupport(FeatureSupport featureSupport) {
            C4174 c4174 = this.featureSupportBuilder_;
            if (c4174 == null) {
                featureSupport.getClass();
                this.featureSupport_ = featureSupport;
            } else {
                c4174.m7946(featureSupport);
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C4111 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C4174 c4174 = this.featuresBuilder_;
            if (c4174 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c4174.m7946(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C4111 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C4111 addEditionDefaults(EditionDefault editionDefault) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 == null) {
                editionDefault.getClass();
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.add(editionDefault);
                onChanged();
                return this;
            }
            c4195.m8017(editionDefault);
            return this;
        }

        public C4111 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C4111 addEditionDefaults(int i, EditionDefault.C4109 c4109) {
            C4195 c4195 = this.editionDefaultsBuilder_;
            if (c4195 == null) {
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.add(i, c4109.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4109.build());
            return this;
        }

        public C4111 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C4127 c4127) {
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
        public C4111 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$FieldOptions) {
                return mergeFrom((DescriptorProtos$FieldOptions) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4111 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        switch (iMo8264) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int iMo8283 = abstractC4306.mo8283();
                                if (CType.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(1, iMo8283);
                                } else {
                                    this.ctype_ = iMo8283;
                                    this.bitField0_ |= 1;
                                }
                                break;
                            case 16:
                                this.packed_ = abstractC4306.mo8279();
                                this.bitField0_ |= 2;
                                break;
                            case 24:
                                this.deprecated_ = abstractC4306.mo8279();
                                this.bitField0_ |= 32;
                                break;
                            case 40:
                                this.lazy_ = abstractC4306.mo8279();
                                this.bitField0_ |= 8;
                                break;
                            case 48:
                                int iMo82832 = abstractC4306.mo8283();
                                if (JSType.forNumber(iMo82832) == null) {
                                    mergeUnknownVarintField(6, iMo82832);
                                } else {
                                    this.jstype_ = iMo82832;
                                    this.bitField0_ |= 4;
                                }
                                break;
                            case 80:
                                this.weak_ = abstractC4306.mo8279();
                                this.bitField0_ |= 64;
                                break;
                            case 120:
                                this.unverifiedLazy_ = abstractC4306.mo8279();
                                this.bitField0_ |= 16;
                                break;
                            case 128:
                                this.debugRedact_ = abstractC4306.mo8279();
                                this.bitField0_ |= 128;
                                break;
                            case 136:
                                int iMo82833 = abstractC4306.mo8283();
                                if (OptionRetention.forNumber(iMo82833) == null) {
                                    mergeUnknownVarintField(17, iMo82833);
                                } else {
                                    this.retention_ = iMo82833;
                                    this.bitField0_ |= 256;
                                }
                                break;
                            case 152:
                                int iMo82834 = abstractC4306.mo8283();
                                if (OptionTargetType.forNumber(iMo82834) == null) {
                                    mergeUnknownVarintField(19, iMo82834);
                                } else {
                                    ensureTargetsIsMutable();
                                    ((C4445) this.targets_).m8371(iMo82834);
                                }
                                break;
                            case 154:
                                int iMo8286 = abstractC4306.mo8286(abstractC4306.mo8260());
                                ensureTargetsIsMutable();
                                while (abstractC4306.mo8269() > 0) {
                                    int iMo82835 = abstractC4306.mo8283();
                                    if (OptionTargetType.forNumber(iMo82835) == null) {
                                        mergeUnknownVarintField(19, iMo82835);
                                    } else {
                                        ((C4445) this.targets_).m8371(iMo82835);
                                    }
                                }
                                abstractC4306.mo8285(iMo8286);
                                break;
                            case 162:
                                EditionDefault editionDefault = (EditionDefault) abstractC4306.mo8274(EditionDefault.parser(), c4529);
                                C4195 c4195 = this.editionDefaultsBuilder_;
                                if (c4195 == null) {
                                    ensureEditionDefaultsIsMutable();
                                    this.editionDefaults_.add(editionDefault);
                                } else {
                                    c4195.m8017(editionDefault);
                                }
                                break;
                            case 170:
                                abstractC4306.mo8275(internalGetFeaturesFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 2048;
                                break;
                            case 178:
                                abstractC4306.mo8275(internalGetFeatureSupportFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 4096;
                                break;
                            case 7994:
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC4306.mo8274(DescriptorProtos$UninterpretedOption.parser(), c4529);
                                C4195 c41952 = this.uninterpretedOptionBuilder_;
                                if (c41952 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c41952.m8017(descriptorProtos$UninterpretedOption);
                                }
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                    z = true;
                                }
                                break;
                        }
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
    public DescriptorProtos$FieldOptions getDefaultInstanceForType() {
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

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4111 newBuilderForType() {
        return newBuilder();
    }

    public static C4111 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$FieldOptions) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$FieldOptions) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$FieldOptions) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum CType implements InterfaceC4213 {
        STRING(0),
        CORD(1),
        STRING_PIECE(2);

        public static final int CORD_VALUE = 1;
        public static final int STRING_PIECE_VALUE = 2;
        public static final int STRING_VALUE = 0;
        private static final CType[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "CType");
            internalValueMap = new C4355();
            VALUES = values();
        }

        CType(int i) {
            this.value = i;
        }

        public static CType forNumber(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return CORD;
            }
            if (i != 2) {
                return null;
            }
            return STRING_PIECE;
        }

        public static C4498 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11722[0];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static CType valueOf(C4496 c4496) {
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
        public static CType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum JSType implements InterfaceC4213 {
        JS_NORMAL(0),
        JS_STRING(1),
        JS_NUMBER(2);

        public static final int JS_NORMAL_VALUE = 0;
        public static final int JS_NUMBER_VALUE = 2;
        public static final int JS_STRING_VALUE = 1;
        private static final JSType[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "JSType");
            internalValueMap = new C4345();
            VALUES = values();
        }

        JSType(int i) {
            this.value = i;
        }

        public static JSType forNumber(int i) {
            if (i == 0) {
                return JS_NORMAL;
            }
            if (i == 1) {
                return JS_STRING;
            }
            if (i != 2) {
                return null;
            }
            return JS_NUMBER;
        }

        public static C4498 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11722[1];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static JSType valueOf(C4496 c4496) {
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
        public static JSType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum OptionRetention implements InterfaceC4213 {
        RETENTION_UNKNOWN(0),
        RETENTION_RUNTIME(1),
        RETENTION_SOURCE(2);

        public static final int RETENTION_RUNTIME_VALUE = 1;
        public static final int RETENTION_SOURCE_VALUE = 2;
        public static final int RETENTION_UNKNOWN_VALUE = 0;
        private static final OptionRetention[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "OptionRetention");
            internalValueMap = new C4342();
            VALUES = values();
        }

        OptionRetention(int i) {
            this.value = i;
        }

        public static OptionRetention forNumber(int i) {
            if (i == 0) {
                return RETENTION_UNKNOWN;
            }
            if (i == 1) {
                return RETENTION_RUNTIME;
            }
            if (i != 2) {
                return null;
            }
            return RETENTION_SOURCE;
        }

        public static C4498 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11722[2];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static OptionRetention valueOf(C4496 c4496) {
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
        public static OptionRetention valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum OptionTargetType implements InterfaceC4213 {
        TARGET_TYPE_UNKNOWN(0),
        TARGET_TYPE_FILE(1),
        TARGET_TYPE_EXTENSION_RANGE(2),
        TARGET_TYPE_MESSAGE(3),
        TARGET_TYPE_FIELD(4),
        TARGET_TYPE_ONEOF(5),
        TARGET_TYPE_ENUM(6),
        TARGET_TYPE_ENUM_ENTRY(7),
        TARGET_TYPE_SERVICE(8),
        TARGET_TYPE_METHOD(9);

        public static final int TARGET_TYPE_ENUM_ENTRY_VALUE = 7;
        public static final int TARGET_TYPE_ENUM_VALUE = 6;
        public static final int TARGET_TYPE_EXTENSION_RANGE_VALUE = 2;
        public static final int TARGET_TYPE_FIELD_VALUE = 4;
        public static final int TARGET_TYPE_FILE_VALUE = 1;
        public static final int TARGET_TYPE_MESSAGE_VALUE = 3;
        public static final int TARGET_TYPE_METHOD_VALUE = 9;
        public static final int TARGET_TYPE_ONEOF_VALUE = 5;
        public static final int TARGET_TYPE_SERVICE_VALUE = 8;
        public static final int TARGET_TYPE_UNKNOWN_VALUE = 0;
        private static final OptionTargetType[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "OptionTargetType");
            internalValueMap = new C4343();
            VALUES = values();
        }

        OptionTargetType(int i) {
            this.value = i;
        }

        public static OptionTargetType forNumber(int i) {
            switch (i) {
                case 0:
                    return TARGET_TYPE_UNKNOWN;
                case 1:
                    return TARGET_TYPE_FILE;
                case 2:
                    return TARGET_TYPE_EXTENSION_RANGE;
                case 3:
                    return TARGET_TYPE_MESSAGE;
                case 4:
                    return TARGET_TYPE_FIELD;
                case 5:
                    return TARGET_TYPE_ONEOF;
                case 6:
                    return TARGET_TYPE_ENUM;
                case 7:
                    return TARGET_TYPE_ENUM_ENTRY;
                case 8:
                    return TARGET_TYPE_SERVICE;
                case 9:
                    return TARGET_TYPE_METHOD;
                default:
                    return null;
            }
        }

        public static C4498 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11722[3];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static OptionTargetType valueOf(C4496 c4496) {
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
        public static OptionTargetType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$FieldOptions) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$FieldOptions) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    private DescriptorProtos$FieldOptions(GeneratedMessage.AbstractC4136 abstractC4136) {
        super(abstractC4136);
        this.ctype_ = 0;
        this.packed_ = false;
        this.jstype_ = 0;
        this.lazy_ = false;
        this.unverifiedLazy_ = false;
        this.deprecated_ = false;
        this.weak_ = false;
        this.debugRedact_ = false;
        this.retention_ = 0;
        this.targets_ = GeneratedMessage.emptyIntList();
        this.memoizedIsInitialized = (byte) -1;
    }
}
