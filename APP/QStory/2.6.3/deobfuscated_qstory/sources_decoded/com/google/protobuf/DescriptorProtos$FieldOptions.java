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
public final class DescriptorProtos$FieldOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FieldOptions> implements InterfaceC3515 {
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
    private static final InterfaceC3375 PARSER;
    public static final int RETENTION_FIELD_NUMBER = 17;
    public static final int TARGETS_FIELD_NUMBER = 19;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
    public static final int WEAK_FIELD_NUMBER = 10;
    private static final long serialVersionUID = 0;
    private static final InterfaceC3406 targets_converter_;
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
    private InterfaceC3395 targets_;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
    private boolean unverifiedLazy_;
    private boolean weak_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldOptions");
        targets_converter_ = new C3526();
        DEFAULT_INSTANCE = new DescriptorProtos$FieldOptions();
        PARSER = new C3527();
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

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11424;
    }

    public static C3279 newBuilder(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FieldOptions);
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.InterfaceC3515
    public CType getCtype() {
        CType cTypeForNumber = CType.forNumber(this.ctype_);
        return cTypeForNumber == null ? CType.STRING : cTypeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11424;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public EditionDefault getEditionDefaults(int i) {
        return this.editionDefaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3515
    public int getEditionDefaultsCount() {
        return this.editionDefaults_.size();
    }

    @Override // com.google.protobuf.InterfaceC3515
    public List<EditionDefault> getEditionDefaultsList() {
        return this.editionDefaults_;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public InterfaceC3525 getEditionDefaultsOrBuilder(int i) {
        return this.editionDefaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3515
    public List<? extends InterfaceC3525> getEditionDefaultsOrBuilderList() {
        return this.editionDefaults_;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3515
    public FeatureSupport getFeatureSupport() {
        FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public InterfaceC3512 getFeatureSupportOrBuilder() {
        FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public InterfaceC3506 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public JSType getJstype() {
        JSType jSTypeForNumber = JSType.forNumber(this.jstype_);
        return jSTypeForNumber == null ? JSType.JS_NORMAL : jSTypeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean getLazy() {
        return this.lazy_;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public OptionRetention getRetention() {
        OptionRetention optionRetentionForNumber = OptionRetention.forNumber(this.retention_);
        return optionRetentionForNumber == null ? OptionRetention.RETENTION_UNKNOWN : optionRetentionForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSize;
        if (i2 != -1) {
            return i2;
        }
        int iM7632 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7632(1, this.ctype_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7632 += AbstractC3462.m7634(2);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM7632 += AbstractC3462.m7634(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7632 += AbstractC3462.m7634(5);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7632 += AbstractC3462.m7632(6, this.jstype_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM7632 += AbstractC3462.m7634(10);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM7632 += AbstractC3462.m7634(15);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM7632 += AbstractC3462.m7634(16);
        }
        if ((this.bitField0_ & 256) != 0) {
            iM7632 += AbstractC3462.m7632(17, this.retention_);
        }
        int i3 = 0;
        int iM7638 = 0;
        while (true) {
            i = ((C3613) this.targets_).f11252;
            if (i3 >= i) {
                break;
            }
            iM7638 += AbstractC3462.m7638(r5.m7814(i3));
            i3++;
        }
        int iM7643 = (i * 2) + iM7632 + iM7638;
        int size = this.editionDefaults_.size();
        for (int i4 = 0; i4 < size; i4++) {
            iM7643 += AbstractC3462.m7643(this.editionDefaults_.get(i4));
        }
        int iM76432 = (size * 2) + iM7643;
        if ((this.bitField0_ & 512) != 0) {
            iM76432 += AbstractC3462.m7639(21, getFeatures());
        }
        if ((this.bitField0_ & 1024) != 0) {
            iM76432 += AbstractC3462.m7639(22, getFeatureSupport());
        }
        int size2 = this.uninterpretedOption_.size();
        for (int i5 = 0; i5 < size2; i5++) {
            iM76432 += AbstractC3462.m7643(this.uninterpretedOption_.get(i5));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size2 * 2) + iM76432;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public OptionTargetType getTargets(int i) {
        InterfaceC3406 interfaceC3406 = targets_converter_;
        int iM7814 = ((C3613) this.targets_).m7814(i);
        ((C3526) interfaceC3406).getClass();
        OptionTargetType optionTargetTypeForNumber = OptionTargetType.forNumber(iM7814);
        return optionTargetTypeForNumber == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : optionTargetTypeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public int getTargetsCount() {
        return ((C3613) this.targets_).size();
    }

    @Override // com.google.protobuf.InterfaceC3515
    public List<OptionTargetType> getTargetsList() {
        return new C3405(this.targets_, targets_converter_);
    }

    @Override // com.google.protobuf.InterfaceC3515
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3515
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3515
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3515
    public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean getUnverifiedLazy() {
        return this.unverifiedLazy_;
    }

    @Override // com.google.protobuf.InterfaceC3515
    @Deprecated
    public boolean getWeak() {
        return this.weak_;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasCtype() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasDebugRedact() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasDeprecated() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasFeatureSupport() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasFeatures() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasJstype() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasLazy() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasPacked() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasRetention() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3515
    public boolean hasUnverifiedLazy() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3515
    @Deprecated
    public boolean hasWeak() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasCtype()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + this.ctype_;
        }
        if (hasPacked()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + AbstractC3402.m7503(getPacked());
        }
        if (hasJstype()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 6, 53) + this.jstype_;
        }
        if (hasLazy()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + AbstractC3402.m7503(getLazy());
        }
        if (hasUnverifiedLazy()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 15, 53) + AbstractC3402.m7503(getUnverifiedLazy());
        }
        if (hasDeprecated()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + AbstractC3402.m7503(getDeprecated());
        }
        if (hasWeak()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 10, 53) + AbstractC3402.m7503(getWeak());
        }
        if (hasDebugRedact()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 16, 53) + AbstractC3402.m7503(getDebugRedact());
        }
        if (hasRetention()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 17, 53) + this.retention_;
        }
        if (getTargetsCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 19, 53) + this.targets_.hashCode();
        }
        if (getEditionDefaultsCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 20, 53) + getEditionDefaultsList().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 21, 53) + getFeatures().hashCode();
        }
        if (hasFeatureSupport()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 22, 53) + getFeatureSupport().hashCode();
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
        C3619 c3619 = AbstractC3670.f11423;
        c3619.m7827(DescriptorProtos$FieldOptions.class, C3279.class);
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
    public C3279 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3279(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3279 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3279() : new C3279().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7651(1, this.ctype_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7663(2, this.packed_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3462.mo7663(3, this.deprecated_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3462.mo7663(5, this.lazy_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7651(6, this.jstype_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC3462.mo7663(10, this.weak_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3462.mo7663(15, this.unverifiedLazy_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC3462.mo7663(16, this.debugRedact_);
        }
        if ((this.bitField0_ & 256) != 0) {
            abstractC3462.mo7651(17, this.retention_);
        }
        int i = 0;
        while (true) {
            C3613 c3613 = (C3613) this.targets_;
            if (i >= c3613.f11252) {
                break;
            }
            abstractC3462.mo7651(19, c3613.m7814(i));
            i++;
        }
        for (int i2 = 0; i2 < this.editionDefaults_.size(); i2++) {
            abstractC3462.mo7649(20, this.editionDefaults_.get(i2));
        }
        if ((this.bitField0_ & 512) != 0) {
            abstractC3462.mo7649(21, getFeatures());
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC3462.mo7649(22, getFeatureSupport());
        }
        for (int i3 = 0; i3 < this.uninterpretedOption_.size(); i3++) {
            abstractC3462.mo7649(999, this.uninterpretedOption_.get(i3));
        }
        interfaceC3629NewExtensionSerializer.mo7828(536870912, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class EditionDefault extends GeneratedMessage implements InterfaceC3525 {
        private static final EditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        private static final InterfaceC3375 PARSER;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int edition_;
        private byte memoizedIsInitialized;
        private volatile Object value_;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "EditionDefault");
            DEFAULT_INSTANCE = new EditionDefault();
            PARSER = new C3522();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11422;
        }

        public static C3277 newBuilder(EditionDefault editionDefault) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(editionDefault);
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream) {
            return (EditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer) {
            return (EditionDefault) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11422;
        }

        @Override // com.google.protobuf.InterfaceC3525
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
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
            int iComputeStringSize = (this.bitField0_ & 2) != 0 ? GeneratedMessage.computeStringSize(2, this.value_) : 0;
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += AbstractC3462.m7632(3, this.edition_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3525
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

        @Override // com.google.protobuf.InterfaceC3525
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3525
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3525
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEdition()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + this.edition_;
            }
            if (hasValue()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getValue().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11421;
            c3619.m7827(EditionDefault.class, C3277.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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

        @Override // com.google.protobuf.AbstractC3533
        public C3277 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3277(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3277 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3277() : new C3277().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC3462, 2, this.value_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC3462.mo7651(3, this.edition_);
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3277 extends GeneratedMessage.AbstractC3305 implements InterfaceC3525 {
            private int bitField0_;
            private int edition_;
            private Object value_;

            private C3277() {
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

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11422;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public EditionDefault build() {
                EditionDefault editionDefaultBuildPartial = buildPartial();
                if (editionDefaultBuildPartial.isInitialized()) {
                    return editionDefaultBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) editionDefaultBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public EditionDefault buildPartial() {
                EditionDefault editionDefault = new EditionDefault(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(editionDefault);
                }
                onBuilt();
                return editionDefault;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3277 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.edition_ = 0;
                this.value_ = "";
                return this;
            }

            public C3277 clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
                onChanged();
                return this;
            }

            public C3277 clearValue() {
                this.value_ = EditionDefault.getDefaultInstance().getValue();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11422;
            }

            @Override // com.google.protobuf.InterfaceC3525
            public DescriptorProtos$Edition getEdition() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3525
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

            @Override // com.google.protobuf.InterfaceC3525
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3525
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3525
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11421;
                c3619.m7827(EditionDefault.class, C3277.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3277 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 18) {
                                    this.value_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 2;
                                } else if (iMo7705 == 24) {
                                    int iMo7724 = abstractC3474.mo7724();
                                    if (DescriptorProtos$Edition.forNumber(iMo7724) == null) {
                                        mergeUnknownVarintField(3, iMo7724);
                                    } else {
                                        this.edition_ = iMo7724;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
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

            public C3277 setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 1;
                this.edition_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3277 setValue(String str) {
                str.getClass();
                this.value_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3277 setValueBytes(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public EditionDefault getDefaultInstanceForType() {
                return EditionDefault.getDefaultInstance();
            }

            private C3277(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
                this.edition_ = 0;
                this.value_ = "";
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3277 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof EditionDefault) {
                    return mergeFrom((EditionDefault) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3277 mergeFrom(EditionDefault editionDefault) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public EditionDefault getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (EditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3277 newBuilderForType() {
            return newBuilder();
        }

        public static C3277 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (EditionDefault) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static EditionDefault parseFrom(ByteString byteString) {
            return (EditionDefault) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        private EditionDefault(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.edition_ = 0;
            this.value_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EditionDefault parseFrom(ByteString byteString, C3697 c3697) {
            return (EditionDefault) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        public static EditionDefault parseFrom(byte[] bArr) {
            return (EditionDefault) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static EditionDefault parseFrom(byte[] bArr, C3697 c3697) {
            return (EditionDefault) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static EditionDefault parseFrom(InputStream inputStream) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static EditionDefault parseFrom(InputStream inputStream, C3697 c3697) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static EditionDefault parseFrom(AbstractC3474 abstractC3474) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static EditionDefault parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class FeatureSupport extends GeneratedMessage implements InterfaceC3512 {
        private static final FeatureSupport DEFAULT_INSTANCE;
        public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
        public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
        public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
        public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
        private static final InterfaceC3375 PARSER;
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
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSupport");
            DEFAULT_INSTANCE = new FeatureSupport();
            PARSER = new C3524();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11412;
        }

        public static C3278 newBuilder(FeatureSupport featureSupport) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureSupport);
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream) {
            return (FeatureSupport) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer) {
            return (FeatureSupport) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

        @Override // com.google.protobuf.InterfaceC3512
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

        @Override // com.google.protobuf.InterfaceC3512
        public ByteString getDeprecationWarningBytes() {
            Object obj = this.deprecationWarning_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deprecationWarning_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11412;
        }

        @Override // com.google.protobuf.InterfaceC3512
        public DescriptorProtos$Edition getEditionDeprecated() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionDeprecated_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3512
        public DescriptorProtos$Edition getEditionIntroduced() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionIntroduced_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3512
        public DescriptorProtos$Edition getEditionRemoved() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionRemoved_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public InterfaceC3375 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC3512
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

        @Override // com.google.protobuf.InterfaceC3512
        public ByteString getRemovalErrorBytes() {
            Object obj = this.removalError_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.removalError_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iM7632 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7632(1, this.editionIntroduced_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7632 += AbstractC3462.m7632(2, this.editionDeprecated_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7632 += GeneratedMessage.computeStringSize(3, this.deprecationWarning_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iM7632 += AbstractC3462.m7632(4, this.editionRemoved_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iM7632 += GeneratedMessage.computeStringSize(5, this.removalError_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7632;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3512
        public boolean hasDeprecationWarning() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3512
        public boolean hasEditionDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3512
        public boolean hasEditionIntroduced() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3512
        public boolean hasEditionRemoved() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3512
        public boolean hasRemovalError() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEditionIntroduced()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + this.editionIntroduced_;
            }
            if (hasEditionDeprecated()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + this.editionDeprecated_;
            }
            if (hasDeprecationWarning()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getDeprecationWarning().hashCode();
            }
            if (hasEditionRemoved()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + this.editionRemoved_;
            }
            if (hasRemovalError()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + getRemovalError().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11411;
            c3619.m7827(FeatureSupport.class, C3278.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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

        @Override // com.google.protobuf.AbstractC3533
        public C3278 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3278(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3278 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3278() : new C3278().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3462.mo7651(1, this.editionIntroduced_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3462.mo7651(2, this.editionDeprecated_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(abstractC3462, 3, this.deprecationWarning_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC3462.mo7651(4, this.editionRemoved_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(abstractC3462, 5, this.removalError_);
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3278 extends GeneratedMessage.AbstractC3305 implements InterfaceC3512 {
            private int bitField0_;
            private Object deprecationWarning_;
            private int editionDeprecated_;
            private int editionIntroduced_;
            private int editionRemoved_;
            private Object removalError_;

            private C3278() {
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

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11412;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public FeatureSupport build() {
                FeatureSupport featureSupportBuildPartial = buildPartial();
                if (featureSupportBuildPartial.isInitialized()) {
                    return featureSupportBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) featureSupportBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public FeatureSupport buildPartial() {
                FeatureSupport featureSupport = new FeatureSupport(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureSupport);
                }
                onBuilt();
                return featureSupport;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3278 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.editionIntroduced_ = 0;
                this.editionDeprecated_ = 0;
                this.deprecationWarning_ = "";
                this.editionRemoved_ = 0;
                this.removalError_ = "";
                return this;
            }

            public C3278 clearDeprecationWarning() {
                this.deprecationWarning_ = FeatureSupport.getDefaultInstance().getDeprecationWarning();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public C3278 clearEditionDeprecated() {
                this.bitField0_ &= -3;
                this.editionDeprecated_ = 0;
                onChanged();
                return this;
            }

            public C3278 clearEditionIntroduced() {
                this.bitField0_ &= -2;
                this.editionIntroduced_ = 0;
                onChanged();
                return this;
            }

            public C3278 clearEditionRemoved() {
                this.bitField0_ &= -9;
                this.editionRemoved_ = 0;
                onChanged();
                return this;
            }

            public C3278 clearRemovalError() {
                this.removalError_ = FeatureSupport.getDefaultInstance().getRemovalError();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.InterfaceC3512
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

            @Override // com.google.protobuf.InterfaceC3512
            public ByteString getDeprecationWarningBytes() {
                Object obj = this.deprecationWarning_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deprecationWarning_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11412;
            }

            @Override // com.google.protobuf.InterfaceC3512
            public DescriptorProtos$Edition getEditionDeprecated() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionDeprecated_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3512
            public DescriptorProtos$Edition getEditionIntroduced() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionIntroduced_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3512
            public DescriptorProtos$Edition getEditionRemoved() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionRemoved_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3512
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

            @Override // com.google.protobuf.InterfaceC3512
            public ByteString getRemovalErrorBytes() {
                Object obj = this.removalError_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.removalError_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3512
            public boolean hasDeprecationWarning() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3512
            public boolean hasEditionDeprecated() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3512
            public boolean hasEditionIntroduced() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3512
            public boolean hasEditionRemoved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3512
            public boolean hasRemovalError() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11411;
                c3619.m7827(FeatureSupport.class, C3278.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3278 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 8) {
                                    int iMo7724 = abstractC3474.mo7724();
                                    if (DescriptorProtos$Edition.forNumber(iMo7724) == null) {
                                        mergeUnknownVarintField(1, iMo7724);
                                    } else {
                                        this.editionIntroduced_ = iMo7724;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (iMo7705 == 16) {
                                    int iMo77242 = abstractC3474.mo7724();
                                    if (DescriptorProtos$Edition.forNumber(iMo77242) == null) {
                                        mergeUnknownVarintField(2, iMo77242);
                                    } else {
                                        this.editionDeprecated_ = iMo77242;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (iMo7705 == 26) {
                                    this.deprecationWarning_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 4;
                                } else if (iMo7705 == 32) {
                                    int iMo77243 = abstractC3474.mo7724();
                                    if (DescriptorProtos$Edition.forNumber(iMo77243) == null) {
                                        mergeUnknownVarintField(4, iMo77243);
                                    } else {
                                        this.editionRemoved_ = iMo77243;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (iMo7705 == 42) {
                                    this.removalError_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 16;
                                } else if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
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

            public C3278 setDeprecationWarning(String str) {
                str.getClass();
                this.deprecationWarning_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3278 setDeprecationWarningBytes(ByteString byteString) {
                byteString.getClass();
                this.deprecationWarning_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3278 setEditionDeprecated(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 2;
                this.editionDeprecated_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3278 setEditionIntroduced(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 1;
                this.editionIntroduced_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3278 setEditionRemoved(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 8;
                this.editionRemoved_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3278 setRemovalError(String str) {
                str.getClass();
                this.removalError_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3278 setRemovalErrorBytes(ByteString byteString) {
                byteString.getClass();
                this.removalError_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public FeatureSupport getDefaultInstanceForType() {
                return FeatureSupport.getDefaultInstance();
            }

            private C3278(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
                this.editionIntroduced_ = 0;
                this.editionDeprecated_ = 0;
                this.deprecationWarning_ = "";
                this.editionRemoved_ = 0;
                this.removalError_ = "";
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3278 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof FeatureSupport) {
                    return mergeFrom((FeatureSupport) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3278 mergeFrom(FeatureSupport featureSupport) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public FeatureSupport getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (FeatureSupport) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3278 newBuilderForType() {
            return newBuilder();
        }

        public static C3278 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (FeatureSupport) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static FeatureSupport parseFrom(ByteString byteString) {
            return (FeatureSupport) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static FeatureSupport parseFrom(ByteString byteString, C3697 c3697) {
            return (FeatureSupport) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        public static FeatureSupport parseFrom(byte[] bArr) {
            return (FeatureSupport) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static FeatureSupport parseFrom(byte[] bArr, C3697 c3697) {
            return (FeatureSupport) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        private FeatureSupport(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
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

        public static FeatureSupport parseFrom(InputStream inputStream, C3697 c3697) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static FeatureSupport parseFrom(AbstractC3474 abstractC3474) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static FeatureSupport parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3279 extends GeneratedMessage.AbstractC3304 implements InterfaceC3515 {
        private int bitField0_;
        private int ctype_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private C3363 editionDefaultsBuilder_;
        private List<EditionDefault> editionDefaults_;
        private C3342 featureSupportBuilder_;
        private FeatureSupport featureSupport_;
        private C3342 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private int retention_;
        private InterfaceC3395 targets_;
        private C3363 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
        private boolean unverifiedLazy_;
        private boolean weak_;

        private C3279() {
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
                ((AbstractC3548) this.targets_).m7787();
                descriptorProtos$FieldOptions.targets_ = this.targets_;
            }
            if ((i2 & 2048) != 0) {
                C3342 c3342 = this.featuresBuilder_;
                descriptorProtos$FieldOptions.features_ = c3342 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3342.m7384();
                i |= 512;
            }
            if ((i2 & 4096) != 0) {
                C3342 c33422 = this.featureSupportBuilder_;
                descriptorProtos$FieldOptions.featureSupport_ = c33422 == null ? this.featureSupport_ : (FeatureSupport) c33422.m7384();
                i |= 1024;
            }
            DescriptorProtos$FieldOptions.access$23476(descriptorProtos$FieldOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 == null) {
                if ((this.bitField0_ & 1024) != 0) {
                    this.editionDefaults_ = Collections.unmodifiableList(this.editionDefaults_);
                    this.bitField0_ &= -1025;
                }
                descriptorProtos$FieldOptions.editionDefaults_ = this.editionDefaults_;
            } else {
                descriptorProtos$FieldOptions.editionDefaults_ = c3363.m7472();
            }
            C3363 c33632 = this.uninterpretedOptionBuilder_;
            if (c33632 != null) {
                descriptorProtos$FieldOptions.uninterpretedOption_ = c33632.m7472();
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
            InterfaceC3403 interfaceC3403 = this.targets_;
            if (!((AbstractC3548) interfaceC3403).f11199) {
                this.targets_ = (InterfaceC3395) GeneratedMessage.makeMutableCopy(interfaceC3403);
            }
            this.bitField0_ |= 512;
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 8192) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 8192;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11424;
        }

        private C3363 internalGetEditionDefaultsFieldBuilder() {
            if (this.editionDefaultsBuilder_ == null) {
                this.editionDefaultsBuilder_ = new C3363(this.editionDefaults_, getParentForChildren(), isClean());
                this.editionDefaults_ = null;
            }
            return this.editionDefaultsBuilder_;
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
                internalGetEditionDefaultsFieldBuilder();
                internalGetFeaturesFieldBuilder();
                internalGetFeatureSupportFieldBuilder();
                internalGetUninterpretedOptionFieldBuilder();
            }
        }

        public C3279 addAllEditionDefaults(Iterable<? extends EditionDefault> iterable) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureEditionDefaultsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.editionDefaults_);
            onChanged();
            return this;
        }

        public C3279 addAllTargets(Iterable<? extends OptionTargetType> iterable) {
            ensureTargetsIsMutable();
            for (OptionTargetType optionTargetType : iterable) {
                ((C3613) this.targets_).m7812(optionTargetType.getNumber());
            }
            onChanged();
            return this;
        }

        public C3279 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
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

        public C3279 addEditionDefaults(EditionDefault.C3277 c3277) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3277.build());
                return this;
            }
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.add(c3277.build());
            onChanged();
            return this;
        }

        public EditionDefault.C3277 addEditionDefaultsBuilder() {
            return (EditionDefault.C3277) internalGetEditionDefaultsFieldBuilder().m7460(EditionDefault.getDefaultInstance());
        }

        public <Type> C3279 addExtension(C3616 c3616, Type type) {
            return (C3279) addExtension((AbstractC3579) c3616, type);
        }

        public C3279 addTargets(OptionTargetType optionTargetType) {
            optionTargetType.getClass();
            ensureTargetsIsMutable();
            ((C3613) this.targets_).m7812(optionTargetType.getNumber());
            onChanged();
            return this;
        }

        public C3279 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public DescriptorProtos$FieldOptions build() {
            DescriptorProtos$FieldOptions descriptorProtos$FieldOptionsBuildPartial = buildPartial();
            if (descriptorProtos$FieldOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$FieldOptionsBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$FieldOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FieldOptions buildPartial() {
            DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = new DescriptorProtos$FieldOptions(this);
            buildPartialRepeatedFields(descriptorProtos$FieldOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FieldOptions);
            }
            onBuilt();
            return descriptorProtos$FieldOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3279 mo7342clear() {
            super.mo7342clear();
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
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 == null) {
                this.editionDefaults_ = Collections.EMPTY_LIST;
            } else {
                this.editionDefaults_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -1025;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            this.featureSupport_ = null;
            C3342 c33422 = this.featureSupportBuilder_;
            if (c33422 != null) {
                c33422.f10971 = null;
                this.featureSupportBuilder_ = null;
            }
            C3363 c33632 = this.uninterpretedOptionBuilder_;
            if (c33632 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c33632.m7471();
            }
            this.bitField0_ &= -8193;
            return this;
        }

        public C3279 clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
            onChanged();
            return this;
        }

        public C3279 clearDebugRedact() {
            this.bitField0_ &= -129;
            this.debugRedact_ = false;
            onChanged();
            return this;
        }

        public C3279 clearDeprecated() {
            this.bitField0_ &= -33;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        public C3279 clearEditionDefaults() {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.editionDefaults_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -1025;
            onChanged();
            return this;
        }

        public <Type> C3279 clearExtension(C3616 c3616) {
            return (C3279) clearExtension((AbstractC3579) c3616);
        }

        public C3279 clearFeatureSupport() {
            this.bitField0_ &= -4097;
            this.featureSupport_ = null;
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featureSupportBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3279 clearFeatures() {
            this.bitField0_ &= -2049;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3279 clearJstype() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
            onChanged();
            return this;
        }

        public C3279 clearLazy() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
            onChanged();
            return this;
        }

        public C3279 clearPacked() {
            this.bitField0_ &= -3;
            this.packed_ = false;
            onChanged();
            return this;
        }

        public C3279 clearRetention() {
            this.bitField0_ &= -257;
            this.retention_ = 0;
            onChanged();
            return this;
        }

        public C3279 clearTargets() {
            this.targets_ = GeneratedMessage.emptyIntList();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C3279 clearUninterpretedOption() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -8193;
            onChanged();
            return this;
        }

        public C3279 clearUnverifiedLazy() {
            this.bitField0_ &= -17;
            this.unverifiedLazy_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public C3279 clearWeak() {
            this.bitField0_ &= -65;
            this.weak_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public CType getCtype() {
            CType cTypeForNumber = CType.forNumber(this.ctype_);
            return cTypeForNumber == null ? CType.STRING : cTypeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11424;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public EditionDefault getEditionDefaults(int i) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            return c3363 == null ? this.editionDefaults_.get(i) : (EditionDefault) c3363.m7466(i, false);
        }

        public EditionDefault.C3277 getEditionDefaultsBuilder(int i) {
            return (EditionDefault.C3277) internalGetEditionDefaultsFieldBuilder().m7473(i);
        }

        public List<EditionDefault.C3277> getEditionDefaultsBuilderList() {
            return internalGetEditionDefaultsFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3515
        public int getEditionDefaultsCount() {
            C3363 c3363 = this.editionDefaultsBuilder_;
            return c3363 == null ? this.editionDefaults_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3515
        public List<EditionDefault> getEditionDefaultsList() {
            C3363 c3363 = this.editionDefaultsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.editionDefaults_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3515
        public InterfaceC3525 getEditionDefaultsOrBuilder(int i) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            return c3363 == null ? this.editionDefaults_.get(i) : (InterfaceC3525) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3515
        public List<? extends InterfaceC3525> getEditionDefaultsOrBuilderList() {
            C3363 c3363 = this.editionDefaultsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.editionDefaults_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3515
        public FeatureSupport getFeatureSupport() {
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 != null) {
                return (FeatureSupport) c3342.m7380();
            }
            FeatureSupport featureSupport = this.featureSupport_;
            return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
        }

        public FeatureSupport.C3278 getFeatureSupportBuilder() {
            this.bitField0_ |= 4096;
            onChanged();
            return (FeatureSupport.C3278) internalGetFeatureSupportFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3515
        public InterfaceC3512 getFeatureSupportOrBuilder() {
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 != null) {
                return (InterfaceC3512) c3342.m7379();
            }
            FeatureSupport featureSupport = this.featureSupport_;
            return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public DescriptorProtos$FeatureSet getFeatures() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$FeatureSet) c3342.m7380();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3273 getFeaturesBuilder() {
            this.bitField0_ |= 2048;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3273) internalGetFeaturesFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3515
        public InterfaceC3506 getFeaturesOrBuilder() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (InterfaceC3506) c3342.m7379();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public JSType getJstype() {
            JSType jSTypeForNumber = JSType.forNumber(this.jstype_);
            return jSTypeForNumber == null ? JSType.JS_NORMAL : jSTypeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean getLazy() {
            return this.lazy_;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public OptionRetention getRetention() {
            OptionRetention optionRetentionForNumber = OptionRetention.forNumber(this.retention_);
            return optionRetentionForNumber == null ? OptionRetention.RETENTION_UNKNOWN : optionRetentionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public OptionTargetType getTargets(int i) {
            InterfaceC3406 interfaceC3406 = DescriptorProtos$FieldOptions.targets_converter_;
            int iM7814 = ((C3613) this.targets_).m7814(i);
            ((C3526) interfaceC3406).getClass();
            OptionTargetType optionTargetTypeForNumber = OptionTargetType.forNumber(iM7814);
            return optionTargetTypeForNumber == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : optionTargetTypeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public int getTargetsCount() {
            return ((C3613) this.targets_).size();
        }

        @Override // com.google.protobuf.InterfaceC3515
        public List<OptionTargetType> getTargetsList() {
            return new C3405(this.targets_, DescriptorProtos$FieldOptions.targets_converter_);
        }

        @Override // com.google.protobuf.InterfaceC3515
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

        @Override // com.google.protobuf.InterfaceC3515
        public int getUninterpretedOptionCount() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3515
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3515
        public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3673) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3515
        public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean getUnverifiedLazy() {
            return this.unverifiedLazy_;
        }

        @Override // com.google.protobuf.InterfaceC3515
        @Deprecated
        public boolean getWeak() {
            return this.weak_;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasDebugRedact() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasDeprecated() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasFeatureSupport() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasFeatures() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasRetention() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3515
        public boolean hasUnverifiedLazy() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3515
        @Deprecated
        public boolean hasWeak() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11423;
            c3619.m7827(DescriptorProtos$FieldOptions.class, C3279.class);
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

        public C3279 mergeFeatureSupport(FeatureSupport featureSupport) {
            FeatureSupport featureSupport2;
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 != null) {
                c3342.m7386(featureSupport);
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

        public C3279 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$FeatureSet);
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
        public C3279 mergeFrom(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
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
                    InterfaceC3395 interfaceC3395 = descriptorProtos$FieldOptions.targets_;
                    this.targets_ = interfaceC3395;
                    ((AbstractC3548) interfaceC3395).m7787();
                    this.bitField0_ |= 512;
                } else {
                    ensureTargetsIsMutable();
                    ((C3613) this.targets_).addAll(descriptorProtos$FieldOptions.targets_);
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
                boolean zIsEmpty = this.editionDefaultsBuilder_.f11012.isEmpty();
                C3363 c3363 = this.editionDefaultsBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.editionDefaultsBuilder_ = null;
                    this.editionDefaults_ = descriptorProtos$FieldOptions.editionDefaults_;
                    this.bitField0_ &= -1025;
                    this.editionDefaultsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEditionDefaultsFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$FieldOptions.editionDefaults_);
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
                boolean zIsEmpty2 = this.uninterpretedOptionBuilder_.f11012.isEmpty();
                C3363 c33632 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty2) {
                    c33632.f11013 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$FieldOptions.uninterpretedOption_;
                    this.bitField0_ &= -8193;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c33632.m7462(descriptorProtos$FieldOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$FieldOptions);
            mergeUnknownFields(descriptorProtos$FieldOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C3279 removeEditionDefaults(int i) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.remove(i);
            onChanged();
            return this;
        }

        public C3279 removeUninterpretedOption(int i) {
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

        public C3279 setCtype(CType cType) {
            cType.getClass();
            this.bitField0_ |= 1;
            this.ctype_ = cType.getNumber();
            onChanged();
            return this;
        }

        public C3279 setDebugRedact(boolean z) {
            this.debugRedact_ = z;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3279 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3279 setEditionDefaults(int i, EditionDefault.C3277 c3277) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3277.build());
                return this;
            }
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.set(i, c3277.build());
            onChanged();
            return this;
        }

        public <Type> C3279 setExtension(C3616 c3616, Type type) {
            return (C3279) setExtension((AbstractC3579) c3616, type);
        }

        public C3279 setFeatureSupport(FeatureSupport.C3278 c3278) {
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 == null) {
                this.featureSupport_ = c3278.build();
            } else {
                c3342.m7387(c3278.build());
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3279 setFeatures(DescriptorProtos$FeatureSet.C3273 c3273) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                this.features_ = c3273.build();
            } else {
                c3342.m7387(c3273.build());
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3279 setJstype(JSType jSType) {
            jSType.getClass();
            this.bitField0_ |= 4;
            this.jstype_ = jSType.getNumber();
            onChanged();
            return this;
        }

        public C3279 setLazy(boolean z) {
            this.lazy_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3279 setPacked(boolean z) {
            this.packed_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3279 setRetention(OptionRetention optionRetention) {
            optionRetention.getClass();
            this.bitField0_ |= 256;
            this.retention_ = optionRetention.getNumber();
            onChanged();
            return this;
        }

        public C3279 setTargets(int i, OptionTargetType optionTargetType) {
            optionTargetType.getClass();
            ensureTargetsIsMutable();
            ((C3613) this.targets_).m7815(i, optionTargetType.getNumber());
            onChanged();
            return this;
        }

        public C3279 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
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

        public C3279 setUnverifiedLazy(boolean z) {
            this.unverifiedLazy_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Deprecated
        public C3279 setWeak(boolean z) {
            this.weak_ = z;
            this.bitField0_ |= 64;
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
        public DescriptorProtos$FieldOptions getDefaultInstanceForType() {
            return DescriptorProtos$FieldOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3279 setExtension(C3616 c3616, int i, Type type) {
            return (C3279) setExtension((AbstractC3579) c3616, i, type);
        }

        public EditionDefault.C3277 addEditionDefaultsBuilder(int i) {
            return (EditionDefault.C3277) internalGetEditionDefaultsFieldBuilder().m7461(i, EditionDefault.getDefaultInstance());
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7461(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        private C3279(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.ctype_ = 0;
            this.jstype_ = 0;
            this.retention_ = 0;
            this.targets_ = GeneratedMessage.emptyIntList();
            List list = Collections.EMPTY_LIST;
            this.editionDefaults_ = list;
            this.uninterpretedOption_ = list;
            maybeForceBuilderInitialization();
        }

        public C3279 addEditionDefaults(int i, EditionDefault editionDefault) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 == null) {
                editionDefault.getClass();
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.add(i, editionDefault);
                onChanged();
                return this;
            }
            c3363.m7459(i, editionDefault);
            return this;
        }

        public C3279 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3279 setEditionDefaults(int i, EditionDefault editionDefault) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 == null) {
                editionDefault.getClass();
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.set(i, editionDefault);
                onChanged();
                return this;
            }
            c3363.m7463(i, editionDefault);
            return this;
        }

        public C3279 setFeatureSupport(FeatureSupport featureSupport) {
            C3342 c3342 = this.featureSupportBuilder_;
            if (c3342 == null) {
                featureSupport.getClass();
                this.featureSupport_ = featureSupport;
            } else {
                c3342.m7387(featureSupport);
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3279 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3342.m7387(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3279 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3279 addEditionDefaults(EditionDefault editionDefault) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 == null) {
                editionDefault.getClass();
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.add(editionDefault);
                onChanged();
                return this;
            }
            c3363.m7458(editionDefault);
            return this;
        }

        public C3279 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3279 addEditionDefaults(int i, EditionDefault.C3277 c3277) {
            C3363 c3363 = this.editionDefaultsBuilder_;
            if (c3363 == null) {
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.add(i, c3277.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3277.build());
            return this;
        }

        public C3279 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
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
        public C3279 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$FieldOptions) {
                return mergeFrom((DescriptorProtos$FieldOptions) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3279 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        switch (iMo7705) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int iMo7724 = abstractC3474.mo7724();
                                if (CType.forNumber(iMo7724) == null) {
                                    mergeUnknownVarintField(1, iMo7724);
                                } else {
                                    this.ctype_ = iMo7724;
                                    this.bitField0_ |= 1;
                                }
                                break;
                            case 16:
                                this.packed_ = abstractC3474.mo7720();
                                this.bitField0_ |= 2;
                                break;
                            case 24:
                                this.deprecated_ = abstractC3474.mo7720();
                                this.bitField0_ |= 32;
                                break;
                            case 40:
                                this.lazy_ = abstractC3474.mo7720();
                                this.bitField0_ |= 8;
                                break;
                            case 48:
                                int iMo77242 = abstractC3474.mo7724();
                                if (JSType.forNumber(iMo77242) == null) {
                                    mergeUnknownVarintField(6, iMo77242);
                                } else {
                                    this.jstype_ = iMo77242;
                                    this.bitField0_ |= 4;
                                }
                                break;
                            case 80:
                                this.weak_ = abstractC3474.mo7720();
                                this.bitField0_ |= 64;
                                break;
                            case 120:
                                this.unverifiedLazy_ = abstractC3474.mo7720();
                                this.bitField0_ |= 16;
                                break;
                            case 128:
                                this.debugRedact_ = abstractC3474.mo7720();
                                this.bitField0_ |= 128;
                                break;
                            case 136:
                                int iMo77243 = abstractC3474.mo7724();
                                if (OptionRetention.forNumber(iMo77243) == null) {
                                    mergeUnknownVarintField(17, iMo77243);
                                } else {
                                    this.retention_ = iMo77243;
                                    this.bitField0_ |= 256;
                                }
                                break;
                            case 152:
                                int iMo77244 = abstractC3474.mo7724();
                                if (OptionTargetType.forNumber(iMo77244) == null) {
                                    mergeUnknownVarintField(19, iMo77244);
                                } else {
                                    ensureTargetsIsMutable();
                                    ((C3613) this.targets_).m7812(iMo77244);
                                }
                                break;
                            case 154:
                                int iMo7727 = abstractC3474.mo7727(abstractC3474.mo7701());
                                ensureTargetsIsMutable();
                                while (abstractC3474.mo7710() > 0) {
                                    int iMo77245 = abstractC3474.mo7724();
                                    if (OptionTargetType.forNumber(iMo77245) == null) {
                                        mergeUnknownVarintField(19, iMo77245);
                                    } else {
                                        ((C3613) this.targets_).m7812(iMo77245);
                                    }
                                }
                                abstractC3474.mo7726(iMo7727);
                                break;
                            case 162:
                                EditionDefault editionDefault = (EditionDefault) abstractC3474.mo7715(EditionDefault.parser(), c3697);
                                C3363 c3363 = this.editionDefaultsBuilder_;
                                if (c3363 == null) {
                                    ensureEditionDefaultsIsMutable();
                                    this.editionDefaults_.add(editionDefault);
                                } else {
                                    c3363.m7458(editionDefault);
                                }
                                break;
                            case 170:
                                abstractC3474.mo7716(internalGetFeaturesFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 2048;
                                break;
                            case 178:
                                abstractC3474.mo7716(internalGetFeatureSupportFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 4096;
                                break;
                            case 7994:
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC3474.mo7715(DescriptorProtos$UninterpretedOption.parser(), c3697);
                                C3363 c33632 = this.uninterpretedOptionBuilder_;
                                if (c33632 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c33632.m7458(descriptorProtos$UninterpretedOption);
                                }
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
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
    public DescriptorProtos$FieldOptions getDefaultInstanceForType() {
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

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3279 newBuilderForType() {
        return newBuilder();
    }

    public static C3279 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum CType implements InterfaceC3381 {
        STRING(0),
        CORD(1),
        STRING_PIECE(2);

        public static final int CORD_VALUE = 1;
        public static final int STRING_PIECE_VALUE = 2;
        public static final int STRING_VALUE = 0;
        private static final CType[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "CType");
            internalValueMap = new C3523();
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

        public static C3666 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11377[0];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static CType valueOf(C3664 c3664) {
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
        public static CType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum JSType implements InterfaceC3381 {
        JS_NORMAL(0),
        JS_STRING(1),
        JS_NUMBER(2);

        public static final int JS_NORMAL_VALUE = 0;
        public static final int JS_NUMBER_VALUE = 2;
        public static final int JS_STRING_VALUE = 1;
        private static final JSType[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "JSType");
            internalValueMap = new C3513();
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

        public static C3666 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11377[1];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static JSType valueOf(C3664 c3664) {
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
        public static JSType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum OptionRetention implements InterfaceC3381 {
        RETENTION_UNKNOWN(0),
        RETENTION_RUNTIME(1),
        RETENTION_SOURCE(2);

        public static final int RETENTION_RUNTIME_VALUE = 1;
        public static final int RETENTION_SOURCE_VALUE = 2;
        public static final int RETENTION_UNKNOWN_VALUE = 0;
        private static final OptionRetention[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "OptionRetention");
            internalValueMap = new C3510();
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

        public static C3666 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11377[2];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static OptionRetention valueOf(C3664 c3664) {
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
        public static OptionRetention valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum OptionTargetType implements InterfaceC3381 {
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
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "OptionTargetType");
            internalValueMap = new C3511();
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

        public static C3666 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11377[3];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static OptionTargetType valueOf(C3664 c3664) {
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
        public static OptionTargetType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    private DescriptorProtos$FieldOptions(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
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
