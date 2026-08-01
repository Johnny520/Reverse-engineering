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
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FieldOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FieldOptions> implements InterfaceC3514 {
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
    private static final InterfaceC3374 PARSER;
    public static final int RETENTION_FIELD_NUMBER = 17;
    public static final int TARGETS_FIELD_NUMBER = 19;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
    public static final int WEAK_FIELD_NUMBER = 10;
    private static final long serialVersionUID = 0;
    private static final InterfaceC3405 targets_converter_;
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
    private InterfaceC3394 targets_;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
    private boolean unverifiedLazy_;
    private boolean weak_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldOptions");
        targets_converter_ = new C3525();
        DEFAULT_INSTANCE = new DescriptorProtos$FieldOptions();
        PARSER = new C3526();
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11419;
    }

    public static C3278 newBuilder(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FieldOptions);
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.InterfaceC3514
    public CType getCtype() {
        CType cTypeForNumber = CType.forNumber(this.ctype_);
        return cTypeForNumber == null ? CType.STRING : cTypeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11419;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public EditionDefault getEditionDefaults(int i) {
        return this.editionDefaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3514
    public int getEditionDefaultsCount() {
        return this.editionDefaults_.size();
    }

    @Override // com.google.protobuf.InterfaceC3514
    public List<EditionDefault> getEditionDefaultsList() {
        return this.editionDefaults_;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public InterfaceC3524 getEditionDefaultsOrBuilder(int i) {
        return this.editionDefaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3514
    public List<? extends InterfaceC3524> getEditionDefaultsOrBuilderList() {
        return this.editionDefaults_;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
        return super.getExtension(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
        return super.getExtensionCount(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3514
    public FeatureSupport getFeatureSupport() {
        FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public InterfaceC3511 getFeatureSupportOrBuilder() {
        FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public InterfaceC3505 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public JSType getJstype() {
        JSType jSTypeForNumber = JSType.forNumber(this.jstype_);
        return jSTypeForNumber == null ? JSType.JS_NORMAL : jSTypeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean getLazy() {
        return this.lazy_;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public OptionRetention getRetention() {
        OptionRetention optionRetentionForNumber = OptionRetention.forNumber(this.retention_);
        return optionRetentionForNumber == null ? OptionRetention.RETENTION_UNKNOWN : optionRetentionForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSize;
        if (i2 != -1) {
            return i2;
        }
        int iM7645 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7645(1, this.ctype_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7645 += AbstractC3461.m7647(2);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM7645 += AbstractC3461.m7647(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7645 += AbstractC3461.m7647(5);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7645 += AbstractC3461.m7645(6, this.jstype_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM7645 += AbstractC3461.m7647(10);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM7645 += AbstractC3461.m7647(15);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM7645 += AbstractC3461.m7647(16);
        }
        if ((this.bitField0_ & 256) != 0) {
            iM7645 += AbstractC3461.m7645(17, this.retention_);
        }
        int i3 = 0;
        int iM7651 = 0;
        while (true) {
            i = ((C3612) this.targets_).f11247;
            if (i3 >= i) {
                break;
            }
            iM7651 += AbstractC3461.m7651(r5.m7827(i3));
            i3++;
        }
        int iM7656 = (i * 2) + iM7645 + iM7651;
        int size = this.editionDefaults_.size();
        for (int i4 = 0; i4 < size; i4++) {
            iM7656 += AbstractC3461.m7656(this.editionDefaults_.get(i4));
        }
        int iM76562 = (size * 2) + iM7656;
        if ((this.bitField0_ & 512) != 0) {
            iM76562 += AbstractC3461.m7652(21, getFeatures());
        }
        if ((this.bitField0_ & 1024) != 0) {
            iM76562 += AbstractC3461.m7652(22, getFeatureSupport());
        }
        int size2 = this.uninterpretedOption_.size();
        for (int i5 = 0; i5 < size2; i5++) {
            iM76562 += AbstractC3461.m7656(this.uninterpretedOption_.get(i5));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size2 * 2) + iM76562;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public OptionTargetType getTargets(int i) {
        InterfaceC3405 interfaceC3405 = targets_converter_;
        int iM7827 = ((C3612) this.targets_).m7827(i);
        ((C3525) interfaceC3405).getClass();
        OptionTargetType optionTargetTypeForNumber = OptionTargetType.forNumber(iM7827);
        return optionTargetTypeForNumber == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : optionTargetTypeForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public int getTargetsCount() {
        return ((C3612) this.targets_).size();
    }

    @Override // com.google.protobuf.InterfaceC3514
    public List<OptionTargetType> getTargetsList() {
        return new C3404(this.targets_, targets_converter_);
    }

    @Override // com.google.protobuf.InterfaceC3514
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3514
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3514
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public InterfaceC3672 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3514
    public List<? extends InterfaceC3672> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean getUnverifiedLazy() {
        return this.unverifiedLazy_;
    }

    @Override // com.google.protobuf.InterfaceC3514
    @Deprecated
    public boolean getWeak() {
        return this.weak_;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasCtype() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasDebugRedact() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasDeprecated() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasFeatureSupport() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasFeatures() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasJstype() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasLazy() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasPacked() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasRetention() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3514
    public boolean hasUnverifiedLazy() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3514
    @Deprecated
    public boolean hasWeak() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasCtype()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + this.ctype_;
        }
        if (hasPacked()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + AbstractC3401.m7516(getPacked());
        }
        if (hasJstype()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 6, 53) + this.jstype_;
        }
        if (hasLazy()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + AbstractC3401.m7516(getLazy());
        }
        if (hasUnverifiedLazy()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 15, 53) + AbstractC3401.m7516(getUnverifiedLazy());
        }
        if (hasDeprecated()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + AbstractC3401.m7516(getDeprecated());
        }
        if (hasWeak()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 10, 53) + AbstractC3401.m7516(getWeak());
        }
        if (hasDebugRedact()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 16, 53) + AbstractC3401.m7516(getDebugRedact());
        }
        if (hasRetention()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 17, 53) + this.retention_;
        }
        if (getTargetsCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 19, 53) + this.targets_.hashCode();
        }
        if (getEditionDefaultsCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 20, 53) + getEditionDefaultsList().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 21, 53) + getFeatures().hashCode();
        }
        if (hasFeatureSupport()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 22, 53) + getFeatureSupport().hashCode();
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
        C3618 c3618 = AbstractC3669.f11418;
        c3618.m7840(DescriptorProtos$FieldOptions.class, C3278.class);
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
    public C3278 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3278(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3278 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3278() : new C3278().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        InterfaceC3628 interfaceC3628NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7664(1, this.ctype_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7676(2, this.packed_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3461.mo7676(3, this.deprecated_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3461.mo7676(5, this.lazy_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7664(6, this.jstype_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC3461.mo7676(10, this.weak_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3461.mo7676(15, this.unverifiedLazy_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC3461.mo7676(16, this.debugRedact_);
        }
        if ((this.bitField0_ & 256) != 0) {
            abstractC3461.mo7664(17, this.retention_);
        }
        int i = 0;
        while (true) {
            C3612 c3612 = (C3612) this.targets_;
            if (i >= c3612.f11247) {
                break;
            }
            abstractC3461.mo7664(19, c3612.m7827(i));
            i++;
        }
        for (int i2 = 0; i2 < this.editionDefaults_.size(); i2++) {
            abstractC3461.mo7662(20, this.editionDefaults_.get(i2));
        }
        if ((this.bitField0_ & 512) != 0) {
            abstractC3461.mo7662(21, getFeatures());
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC3461.mo7662(22, getFeatureSupport());
        }
        for (int i3 = 0; i3 < this.uninterpretedOption_.size(); i3++) {
            abstractC3461.mo7662(999, this.uninterpretedOption_.get(i3));
        }
        interfaceC3628NewExtensionSerializer.mo7841(536870912, abstractC3461);
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class EditionDefault extends GeneratedMessage implements InterfaceC3524 {
        private static final EditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        private static final InterfaceC3374 PARSER;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int edition_;
        private byte memoizedIsInitialized;
        private volatile Object value_;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "EditionDefault");
            DEFAULT_INSTANCE = new EditionDefault();
            PARSER = new C3521();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11417;
        }

        public static C3276 newBuilder(EditionDefault editionDefault) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(editionDefault);
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream) {
            return (EditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer) {
            return (EditionDefault) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11417;
        }

        @Override // com.google.protobuf.InterfaceC3524
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
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
            int iComputeStringSize = (this.bitField0_ & 2) != 0 ? GeneratedMessage.computeStringSize(2, this.value_) : 0;
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += AbstractC3461.m7645(3, this.edition_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3524
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

        @Override // com.google.protobuf.InterfaceC3524
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3524
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3524
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEdition()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + this.edition_;
            }
            if (hasValue()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getValue().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11416;
            c3618.m7840(EditionDefault.class, C3276.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

        @Override // com.google.protobuf.AbstractC3532
        public C3276 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3276(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3276 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3276() : new C3276().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC3461, 2, this.value_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC3461.mo7664(3, this.edition_);
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3276 extends GeneratedMessage.AbstractC3304 implements InterfaceC3524 {
            private int bitField0_;
            private int edition_;
            private Object value_;

            private C3276() {
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

            public static final C3662 getDescriptor() {
                return AbstractC3669.f11417;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public EditionDefault build() {
                EditionDefault editionDefaultBuildPartial = buildPartial();
                if (editionDefaultBuildPartial.isInitialized()) {
                    return editionDefaultBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) editionDefaultBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public EditionDefault buildPartial() {
                EditionDefault editionDefault = new EditionDefault(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(editionDefault);
                }
                onBuilt();
                return editionDefault;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3276 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.edition_ = 0;
                this.value_ = "";
                return this;
            }

            public C3276 clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
                onChanged();
                return this;
            }

            public C3276 clearValue() {
                this.value_ = EditionDefault.getDefaultInstance().getValue();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11417;
            }

            @Override // com.google.protobuf.InterfaceC3524
            public DescriptorProtos$Edition getEdition() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3524
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

            @Override // com.google.protobuf.InterfaceC3524
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3524
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3524
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11416;
                c3618.m7840(EditionDefault.class, C3276.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3276 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 != 0) {
                                if (iMo7718 == 18) {
                                    this.value_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 2;
                                } else if (iMo7718 == 24) {
                                    int iMo7737 = abstractC3473.mo7737();
                                    if (DescriptorProtos$Edition.forNumber(iMo7737) == null) {
                                        mergeUnknownVarintField(3, iMo7737);
                                    } else {
                                        this.edition_ = iMo7737;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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

            public C3276 setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 1;
                this.edition_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3276 setValue(String str) {
                str.getClass();
                this.value_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3276 setValueBytes(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public EditionDefault getDefaultInstanceForType() {
                return EditionDefault.getDefaultInstance();
            }

            private C3276(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
                this.edition_ = 0;
                this.value_ = "";
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3276 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof EditionDefault) {
                    return mergeFrom((EditionDefault) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3276 mergeFrom(EditionDefault editionDefault) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public EditionDefault getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (EditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3276 newBuilderForType() {
            return newBuilder();
        }

        public static C3276 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (EditionDefault) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static EditionDefault parseFrom(ByteString byteString) {
            return (EditionDefault) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        private EditionDefault(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
            this.edition_ = 0;
            this.value_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EditionDefault parseFrom(ByteString byteString, C3696 c3696) {
            return (EditionDefault) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        public static EditionDefault parseFrom(byte[] bArr) {
            return (EditionDefault) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static EditionDefault parseFrom(byte[] bArr, C3696 c3696) {
            return (EditionDefault) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static EditionDefault parseFrom(InputStream inputStream) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static EditionDefault parseFrom(InputStream inputStream, C3696 c3696) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static EditionDefault parseFrom(AbstractC3473 abstractC3473) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static EditionDefault parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (EditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class FeatureSupport extends GeneratedMessage implements InterfaceC3511 {
        private static final FeatureSupport DEFAULT_INSTANCE;
        public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
        public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
        public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
        public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
        private static final InterfaceC3374 PARSER;
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
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSupport");
            DEFAULT_INSTANCE = new FeatureSupport();
            PARSER = new C3523();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11407;
        }

        public static C3277 newBuilder(FeatureSupport featureSupport) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureSupport);
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream) {
            return (FeatureSupport) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer) {
            return (FeatureSupport) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

        @Override // com.google.protobuf.InterfaceC3511
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

        @Override // com.google.protobuf.InterfaceC3511
        public ByteString getDeprecationWarningBytes() {
            Object obj = this.deprecationWarning_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deprecationWarning_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11407;
        }

        @Override // com.google.protobuf.InterfaceC3511
        public DescriptorProtos$Edition getEditionDeprecated() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionDeprecated_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3511
        public DescriptorProtos$Edition getEditionIntroduced() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionIntroduced_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3511
        public DescriptorProtos$Edition getEditionRemoved() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionRemoved_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public InterfaceC3374 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC3511
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

        @Override // com.google.protobuf.InterfaceC3511
        public ByteString getRemovalErrorBytes() {
            Object obj = this.removalError_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.removalError_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iM7645 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7645(1, this.editionIntroduced_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7645 += AbstractC3461.m7645(2, this.editionDeprecated_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7645 += GeneratedMessage.computeStringSize(3, this.deprecationWarning_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iM7645 += AbstractC3461.m7645(4, this.editionRemoved_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iM7645 += GeneratedMessage.computeStringSize(5, this.removalError_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7645;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3511
        public boolean hasDeprecationWarning() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3511
        public boolean hasEditionDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3511
        public boolean hasEditionIntroduced() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3511
        public boolean hasEditionRemoved() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3511
        public boolean hasRemovalError() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEditionIntroduced()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + this.editionIntroduced_;
            }
            if (hasEditionDeprecated()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + this.editionDeprecated_;
            }
            if (hasDeprecationWarning()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getDeprecationWarning().hashCode();
            }
            if (hasEditionRemoved()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + this.editionRemoved_;
            }
            if (hasRemovalError()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + getRemovalError().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11406;
            c3618.m7840(FeatureSupport.class, C3277.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

        @Override // com.google.protobuf.AbstractC3532
        public C3277 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3277(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3277 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3277() : new C3277().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3461.mo7664(1, this.editionIntroduced_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3461.mo7664(2, this.editionDeprecated_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(abstractC3461, 3, this.deprecationWarning_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC3461.mo7664(4, this.editionRemoved_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(abstractC3461, 5, this.removalError_);
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3277 extends GeneratedMessage.AbstractC3304 implements InterfaceC3511 {
            private int bitField0_;
            private Object deprecationWarning_;
            private int editionDeprecated_;
            private int editionIntroduced_;
            private int editionRemoved_;
            private Object removalError_;

            private C3277() {
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

            public static final C3662 getDescriptor() {
                return AbstractC3669.f11407;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public FeatureSupport build() {
                FeatureSupport featureSupportBuildPartial = buildPartial();
                if (featureSupportBuildPartial.isInitialized()) {
                    return featureSupportBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) featureSupportBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public FeatureSupport buildPartial() {
                FeatureSupport featureSupport = new FeatureSupport(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureSupport);
                }
                onBuilt();
                return featureSupport;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3277 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.editionIntroduced_ = 0;
                this.editionDeprecated_ = 0;
                this.deprecationWarning_ = "";
                this.editionRemoved_ = 0;
                this.removalError_ = "";
                return this;
            }

            public C3277 clearDeprecationWarning() {
                this.deprecationWarning_ = FeatureSupport.getDefaultInstance().getDeprecationWarning();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public C3277 clearEditionDeprecated() {
                this.bitField0_ &= -3;
                this.editionDeprecated_ = 0;
                onChanged();
                return this;
            }

            public C3277 clearEditionIntroduced() {
                this.bitField0_ &= -2;
                this.editionIntroduced_ = 0;
                onChanged();
                return this;
            }

            public C3277 clearEditionRemoved() {
                this.bitField0_ &= -9;
                this.editionRemoved_ = 0;
                onChanged();
                return this;
            }

            public C3277 clearRemovalError() {
                this.removalError_ = FeatureSupport.getDefaultInstance().getRemovalError();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.InterfaceC3511
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

            @Override // com.google.protobuf.InterfaceC3511
            public ByteString getDeprecationWarningBytes() {
                Object obj = this.deprecationWarning_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deprecationWarning_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11407;
            }

            @Override // com.google.protobuf.InterfaceC3511
            public DescriptorProtos$Edition getEditionDeprecated() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionDeprecated_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3511
            public DescriptorProtos$Edition getEditionIntroduced() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionIntroduced_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3511
            public DescriptorProtos$Edition getEditionRemoved() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.editionRemoved_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3511
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

            @Override // com.google.protobuf.InterfaceC3511
            public ByteString getRemovalErrorBytes() {
                Object obj = this.removalError_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.removalError_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3511
            public boolean hasDeprecationWarning() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3511
            public boolean hasEditionDeprecated() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3511
            public boolean hasEditionIntroduced() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3511
            public boolean hasEditionRemoved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3511
            public boolean hasRemovalError() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11406;
                c3618.m7840(FeatureSupport.class, C3277.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3277 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 != 0) {
                                if (iMo7718 == 8) {
                                    int iMo7737 = abstractC3473.mo7737();
                                    if (DescriptorProtos$Edition.forNumber(iMo7737) == null) {
                                        mergeUnknownVarintField(1, iMo7737);
                                    } else {
                                        this.editionIntroduced_ = iMo7737;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (iMo7718 == 16) {
                                    int iMo77372 = abstractC3473.mo7737();
                                    if (DescriptorProtos$Edition.forNumber(iMo77372) == null) {
                                        mergeUnknownVarintField(2, iMo77372);
                                    } else {
                                        this.editionDeprecated_ = iMo77372;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (iMo7718 == 26) {
                                    this.deprecationWarning_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 4;
                                } else if (iMo7718 == 32) {
                                    int iMo77373 = abstractC3473.mo7737();
                                    if (DescriptorProtos$Edition.forNumber(iMo77373) == null) {
                                        mergeUnknownVarintField(4, iMo77373);
                                    } else {
                                        this.editionRemoved_ = iMo77373;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (iMo7718 == 42) {
                                    this.removalError_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 16;
                                } else if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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

            public C3277 setDeprecationWarning(String str) {
                str.getClass();
                this.deprecationWarning_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3277 setDeprecationWarningBytes(ByteString byteString) {
                byteString.getClass();
                this.deprecationWarning_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3277 setEditionDeprecated(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 2;
                this.editionDeprecated_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3277 setEditionIntroduced(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 1;
                this.editionIntroduced_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3277 setEditionRemoved(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 8;
                this.editionRemoved_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3277 setRemovalError(String str) {
                str.getClass();
                this.removalError_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3277 setRemovalErrorBytes(ByteString byteString) {
                byteString.getClass();
                this.removalError_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public FeatureSupport getDefaultInstanceForType() {
                return FeatureSupport.getDefaultInstance();
            }

            private C3277(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
                this.editionIntroduced_ = 0;
                this.editionDeprecated_ = 0;
                this.deprecationWarning_ = "";
                this.editionRemoved_ = 0;
                this.removalError_ = "";
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3277 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof FeatureSupport) {
                    return mergeFrom((FeatureSupport) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3277 mergeFrom(FeatureSupport featureSupport) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public FeatureSupport getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (FeatureSupport) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3277 newBuilderForType() {
            return newBuilder();
        }

        public static C3277 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (FeatureSupport) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static FeatureSupport parseFrom(ByteString byteString) {
            return (FeatureSupport) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static FeatureSupport parseFrom(ByteString byteString, C3696 c3696) {
            return (FeatureSupport) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        public static FeatureSupport parseFrom(byte[] bArr) {
            return (FeatureSupport) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static FeatureSupport parseFrom(byte[] bArr, C3696 c3696) {
            return (FeatureSupport) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        private FeatureSupport(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
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

        public static FeatureSupport parseFrom(InputStream inputStream, C3696 c3696) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static FeatureSupport parseFrom(AbstractC3473 abstractC3473) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static FeatureSupport parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (FeatureSupport) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3278 extends GeneratedMessage.AbstractC3303 implements InterfaceC3514 {
        private int bitField0_;
        private int ctype_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private C3362 editionDefaultsBuilder_;
        private List<EditionDefault> editionDefaults_;
        private C3341 featureSupportBuilder_;
        private FeatureSupport featureSupport_;
        private C3341 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private int retention_;
        private InterfaceC3394 targets_;
        private C3362 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;
        private boolean unverifiedLazy_;
        private boolean weak_;

        private C3278() {
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
                ((AbstractC3547) this.targets_).m7800();
                descriptorProtos$FieldOptions.targets_ = this.targets_;
            }
            if ((i2 & 2048) != 0) {
                C3341 c3341 = this.featuresBuilder_;
                descriptorProtos$FieldOptions.features_ = c3341 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3341.m7397();
                i |= 512;
            }
            if ((i2 & 4096) != 0) {
                C3341 c33412 = this.featureSupportBuilder_;
                descriptorProtos$FieldOptions.featureSupport_ = c33412 == null ? this.featureSupport_ : (FeatureSupport) c33412.m7397();
                i |= 1024;
            }
            DescriptorProtos$FieldOptions.access$23476(descriptorProtos$FieldOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 == null) {
                if ((this.bitField0_ & 1024) != 0) {
                    this.editionDefaults_ = Collections.unmodifiableList(this.editionDefaults_);
                    this.bitField0_ &= -1025;
                }
                descriptorProtos$FieldOptions.editionDefaults_ = this.editionDefaults_;
            } else {
                descriptorProtos$FieldOptions.editionDefaults_ = c3362.m7485();
            }
            C3362 c33622 = this.uninterpretedOptionBuilder_;
            if (c33622 != null) {
                descriptorProtos$FieldOptions.uninterpretedOption_ = c33622.m7485();
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
            InterfaceC3402 interfaceC3402 = this.targets_;
            if (!((AbstractC3547) interfaceC3402).f11194) {
                this.targets_ = (InterfaceC3394) GeneratedMessage.makeMutableCopy(interfaceC3402);
            }
            this.bitField0_ |= 512;
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 8192) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 8192;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11419;
        }

        private C3362 internalGetEditionDefaultsFieldBuilder() {
            if (this.editionDefaultsBuilder_ == null) {
                this.editionDefaultsBuilder_ = new C3362(this.editionDefaults_, getParentForChildren(), isClean());
                this.editionDefaults_ = null;
            }
            return this.editionDefaultsBuilder_;
        }

        private C3341 internalGetFeatureSupportFieldBuilder() {
            if (this.featureSupportBuilder_ == null) {
                this.featureSupportBuilder_ = new C3341(getFeatureSupport(), getParentForChildren(), isClean());
                this.featureSupport_ = null;
            }
            return this.featureSupportBuilder_;
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
                internalGetEditionDefaultsFieldBuilder();
                internalGetFeaturesFieldBuilder();
                internalGetFeatureSupportFieldBuilder();
                internalGetUninterpretedOptionFieldBuilder();
            }
        }

        public C3278 addAllEditionDefaults(Iterable<? extends EditionDefault> iterable) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureEditionDefaultsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.editionDefaults_);
            onChanged();
            return this;
        }

        public C3278 addAllTargets(Iterable<? extends OptionTargetType> iterable) {
            ensureTargetsIsMutable();
            for (OptionTargetType optionTargetType : iterable) {
                ((C3612) this.targets_).m7825(optionTargetType.getNumber());
            }
            onChanged();
            return this;
        }

        public C3278 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
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

        public C3278 addEditionDefaults(EditionDefault.C3276 c3276) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3276.build());
                return this;
            }
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.add(c3276.build());
            onChanged();
            return this;
        }

        public EditionDefault.C3276 addEditionDefaultsBuilder() {
            return (EditionDefault.C3276) internalGetEditionDefaultsFieldBuilder().m7473(EditionDefault.getDefaultInstance());
        }

        public <Type> C3278 addExtension(C3615 c3615, Type type) {
            return (C3278) addExtension((AbstractC3578) c3615, type);
        }

        public C3278 addTargets(OptionTargetType optionTargetType) {
            optionTargetType.getClass();
            ensureTargetsIsMutable();
            ((C3612) this.targets_).m7825(optionTargetType.getNumber());
            onChanged();
            return this;
        }

        public C3278 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3294 c3294) {
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
        public DescriptorProtos$FieldOptions build() {
            DescriptorProtos$FieldOptions descriptorProtos$FieldOptionsBuildPartial = buildPartial();
            if (descriptorProtos$FieldOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$FieldOptionsBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$FieldOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FieldOptions buildPartial() {
            DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = new DescriptorProtos$FieldOptions(this);
            buildPartialRepeatedFields(descriptorProtos$FieldOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FieldOptions);
            }
            onBuilt();
            return descriptorProtos$FieldOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3278 mo7355clear() {
            super.mo7355clear();
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
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 == null) {
                this.editionDefaults_ = Collections.EMPTY_LIST;
            } else {
                this.editionDefaults_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -1025;
            this.features_ = null;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.featuresBuilder_ = null;
            }
            this.featureSupport_ = null;
            C3341 c33412 = this.featureSupportBuilder_;
            if (c33412 != null) {
                c33412.f10966 = null;
                this.featureSupportBuilder_ = null;
            }
            C3362 c33622 = this.uninterpretedOptionBuilder_;
            if (c33622 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c33622.m7484();
            }
            this.bitField0_ &= -8193;
            return this;
        }

        public C3278 clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
            onChanged();
            return this;
        }

        public C3278 clearDebugRedact() {
            this.bitField0_ &= -129;
            this.debugRedact_ = false;
            onChanged();
            return this;
        }

        public C3278 clearDeprecated() {
            this.bitField0_ &= -33;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        public C3278 clearEditionDefaults() {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.editionDefaults_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -1025;
            onChanged();
            return this;
        }

        public <Type> C3278 clearExtension(C3615 c3615) {
            return (C3278) clearExtension((AbstractC3578) c3615);
        }

        public C3278 clearFeatureSupport() {
            this.bitField0_ &= -4097;
            this.featureSupport_ = null;
            C3341 c3341 = this.featureSupportBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.featureSupportBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3278 clearFeatures() {
            this.bitField0_ &= -2049;
            this.features_ = null;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3278 clearJstype() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
            onChanged();
            return this;
        }

        public C3278 clearLazy() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
            onChanged();
            return this;
        }

        public C3278 clearPacked() {
            this.bitField0_ &= -3;
            this.packed_ = false;
            onChanged();
            return this;
        }

        public C3278 clearRetention() {
            this.bitField0_ &= -257;
            this.retention_ = 0;
            onChanged();
            return this;
        }

        public C3278 clearTargets() {
            this.targets_ = GeneratedMessage.emptyIntList();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public C3278 clearUninterpretedOption() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -8193;
            onChanged();
            return this;
        }

        public C3278 clearUnverifiedLazy() {
            this.bitField0_ &= -17;
            this.unverifiedLazy_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public C3278 clearWeak() {
            this.bitField0_ &= -65;
            this.weak_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public CType getCtype() {
            CType cTypeForNumber = CType.forNumber(this.ctype_);
            return cTypeForNumber == null ? CType.STRING : cTypeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11419;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public EditionDefault getEditionDefaults(int i) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            return c3362 == null ? this.editionDefaults_.get(i) : (EditionDefault) c3362.m7479(i, false);
        }

        public EditionDefault.C3276 getEditionDefaultsBuilder(int i) {
            return (EditionDefault.C3276) internalGetEditionDefaultsFieldBuilder().m7486(i);
        }

        public List<EditionDefault.C3276> getEditionDefaultsBuilderList() {
            return internalGetEditionDefaultsFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3514
        public int getEditionDefaultsCount() {
            C3362 c3362 = this.editionDefaultsBuilder_;
            return c3362 == null ? this.editionDefaults_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3514
        public List<EditionDefault> getEditionDefaultsList() {
            C3362 c3362 = this.editionDefaultsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.editionDefaults_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3514
        public InterfaceC3524 getEditionDefaultsOrBuilder(int i) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            return c3362 == null ? this.editionDefaults_.get(i) : (InterfaceC3524) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3514
        public List<? extends InterfaceC3524> getEditionDefaultsOrBuilderList() {
            C3362 c3362 = this.editionDefaultsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.editionDefaults_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3514
        public FeatureSupport getFeatureSupport() {
            C3341 c3341 = this.featureSupportBuilder_;
            if (c3341 != null) {
                return (FeatureSupport) c3341.m7393();
            }
            FeatureSupport featureSupport = this.featureSupport_;
            return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
        }

        public FeatureSupport.C3277 getFeatureSupportBuilder() {
            this.bitField0_ |= 4096;
            onChanged();
            return (FeatureSupport.C3277) internalGetFeatureSupportFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3514
        public InterfaceC3511 getFeatureSupportOrBuilder() {
            C3341 c3341 = this.featureSupportBuilder_;
            if (c3341 != null) {
                return (InterfaceC3511) c3341.m7392();
            }
            FeatureSupport featureSupport = this.featureSupport_;
            return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public DescriptorProtos$FeatureSet getFeatures() {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$FeatureSet) c3341.m7393();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3272 getFeaturesBuilder() {
            this.bitField0_ |= 2048;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3272) internalGetFeaturesFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3514
        public InterfaceC3505 getFeaturesOrBuilder() {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                return (InterfaceC3505) c3341.m7392();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public JSType getJstype() {
            JSType jSTypeForNumber = JSType.forNumber(this.jstype_);
            return jSTypeForNumber == null ? JSType.JS_NORMAL : jSTypeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean getLazy() {
            return this.lazy_;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public OptionRetention getRetention() {
            OptionRetention optionRetentionForNumber = OptionRetention.forNumber(this.retention_);
            return optionRetentionForNumber == null ? OptionRetention.RETENTION_UNKNOWN : optionRetentionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public OptionTargetType getTargets(int i) {
            InterfaceC3405 interfaceC3405 = DescriptorProtos$FieldOptions.targets_converter_;
            int iM7827 = ((C3612) this.targets_).m7827(i);
            ((C3525) interfaceC3405).getClass();
            OptionTargetType optionTargetTypeForNumber = OptionTargetType.forNumber(iM7827);
            return optionTargetTypeForNumber == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : optionTargetTypeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public int getTargetsCount() {
            return ((C3612) this.targets_).size();
        }

        @Override // com.google.protobuf.InterfaceC3514
        public List<OptionTargetType> getTargetsList() {
            return new C3404(this.targets_, DescriptorProtos$FieldOptions.targets_converter_);
        }

        @Override // com.google.protobuf.InterfaceC3514
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

        @Override // com.google.protobuf.InterfaceC3514
        public int getUninterpretedOptionCount() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3514
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3514
        public InterfaceC3672 getUninterpretedOptionOrBuilder(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3672) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3514
        public List<? extends InterfaceC3672> getUninterpretedOptionOrBuilderList() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean getUnverifiedLazy() {
            return this.unverifiedLazy_;
        }

        @Override // com.google.protobuf.InterfaceC3514
        @Deprecated
        public boolean getWeak() {
            return this.weak_;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasDebugRedact() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasDeprecated() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasFeatureSupport() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasFeatures() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasRetention() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3514
        public boolean hasUnverifiedLazy() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3514
        @Deprecated
        public boolean hasWeak() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11418;
            c3618.m7840(DescriptorProtos$FieldOptions.class, C3278.class);
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

        public C3278 mergeFeatureSupport(FeatureSupport featureSupport) {
            FeatureSupport featureSupport2;
            C3341 c3341 = this.featureSupportBuilder_;
            if (c3341 != null) {
                c3341.m7399(featureSupport);
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

        public C3278 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$FeatureSet);
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
        public C3278 mergeFrom(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
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
                    InterfaceC3394 interfaceC3394 = descriptorProtos$FieldOptions.targets_;
                    this.targets_ = interfaceC3394;
                    ((AbstractC3547) interfaceC3394).m7800();
                    this.bitField0_ |= 512;
                } else {
                    ensureTargetsIsMutable();
                    ((C3612) this.targets_).addAll(descriptorProtos$FieldOptions.targets_);
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
                boolean zIsEmpty = this.editionDefaultsBuilder_.f11007.isEmpty();
                C3362 c3362 = this.editionDefaultsBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.editionDefaultsBuilder_ = null;
                    this.editionDefaults_ = descriptorProtos$FieldOptions.editionDefaults_;
                    this.bitField0_ &= -1025;
                    this.editionDefaultsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEditionDefaultsFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$FieldOptions.editionDefaults_);
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
                boolean zIsEmpty2 = this.uninterpretedOptionBuilder_.f11007.isEmpty();
                C3362 c33622 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty2) {
                    c33622.f11008 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$FieldOptions.uninterpretedOption_;
                    this.bitField0_ &= -8193;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c33622.m7475(descriptorProtos$FieldOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$FieldOptions);
            mergeUnknownFields(descriptorProtos$FieldOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C3278 removeEditionDefaults(int i) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.remove(i);
            onChanged();
            return this;
        }

        public C3278 removeUninterpretedOption(int i) {
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

        public C3278 setCtype(CType cType) {
            cType.getClass();
            this.bitField0_ |= 1;
            this.ctype_ = cType.getNumber();
            onChanged();
            return this;
        }

        public C3278 setDebugRedact(boolean z) {
            this.debugRedact_ = z;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3278 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3278 setEditionDefaults(int i, EditionDefault.C3276 c3276) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3276.build());
                return this;
            }
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.set(i, c3276.build());
            onChanged();
            return this;
        }

        public <Type> C3278 setExtension(C3615 c3615, Type type) {
            return (C3278) setExtension((AbstractC3578) c3615, type);
        }

        public C3278 setFeatureSupport(FeatureSupport.C3277 c3277) {
            C3341 c3341 = this.featureSupportBuilder_;
            if (c3341 == null) {
                this.featureSupport_ = c3277.build();
            } else {
                c3341.m7400(c3277.build());
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3278 setFeatures(DescriptorProtos$FeatureSet.C3272 c3272) {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 == null) {
                this.features_ = c3272.build();
            } else {
                c3341.m7400(c3272.build());
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3278 setJstype(JSType jSType) {
            jSType.getClass();
            this.bitField0_ |= 4;
            this.jstype_ = jSType.getNumber();
            onChanged();
            return this;
        }

        public C3278 setLazy(boolean z) {
            this.lazy_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3278 setPacked(boolean z) {
            this.packed_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3278 setRetention(OptionRetention optionRetention) {
            optionRetention.getClass();
            this.bitField0_ |= 256;
            this.retention_ = optionRetention.getNumber();
            onChanged();
            return this;
        }

        public C3278 setTargets(int i, OptionTargetType optionTargetType) {
            optionTargetType.getClass();
            ensureTargetsIsMutable();
            ((C3612) this.targets_).m7828(i, optionTargetType.getNumber());
            onChanged();
            return this;
        }

        public C3278 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3294 c3294) {
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

        public C3278 setUnverifiedLazy(boolean z) {
            this.unverifiedLazy_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Deprecated
        public C3278 setWeak(boolean z) {
            this.weak_ = z;
            this.bitField0_ |= 64;
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
        public DescriptorProtos$FieldOptions getDefaultInstanceForType() {
            return DescriptorProtos$FieldOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        public <Type> C3278 setExtension(C3615 c3615, int i, Type type) {
            return (C3278) setExtension((AbstractC3578) c3615, i, type);
        }

        public EditionDefault.C3276 addEditionDefaultsBuilder(int i) {
            return (EditionDefault.C3276) internalGetEditionDefaultsFieldBuilder().m7474(i, EditionDefault.getDefaultInstance());
        }

        public DescriptorProtos$UninterpretedOption.C3294 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7474(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        private C3278(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.ctype_ = 0;
            this.jstype_ = 0;
            this.retention_ = 0;
            this.targets_ = GeneratedMessage.emptyIntList();
            List list = Collections.EMPTY_LIST;
            this.editionDefaults_ = list;
            this.uninterpretedOption_ = list;
            maybeForceBuilderInitialization();
        }

        public C3278 addEditionDefaults(int i, EditionDefault editionDefault) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 == null) {
                editionDefault.getClass();
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.add(i, editionDefault);
                onChanged();
                return this;
            }
            c3362.m7472(i, editionDefault);
            return this;
        }

        public C3278 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3278 setEditionDefaults(int i, EditionDefault editionDefault) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 == null) {
                editionDefault.getClass();
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.set(i, editionDefault);
                onChanged();
                return this;
            }
            c3362.m7476(i, editionDefault);
            return this;
        }

        public C3278 setFeatureSupport(FeatureSupport featureSupport) {
            C3341 c3341 = this.featureSupportBuilder_;
            if (c3341 == null) {
                featureSupport.getClass();
                this.featureSupport_ = featureSupport;
            } else {
                c3341.m7400(featureSupport);
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3278 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3341.m7400(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3278 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3278 addEditionDefaults(EditionDefault editionDefault) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 == null) {
                editionDefault.getClass();
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.add(editionDefault);
                onChanged();
                return this;
            }
            c3362.m7471(editionDefault);
            return this;
        }

        public C3278 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
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

        public C3278 addEditionDefaults(int i, EditionDefault.C3276 c3276) {
            C3362 c3362 = this.editionDefaultsBuilder_;
            if (c3362 == null) {
                ensureEditionDefaultsIsMutable();
                this.editionDefaults_.add(i, c3276.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3276.build());
            return this;
        }

        public C3278 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3294 c3294) {
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
        public C3278 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$FieldOptions) {
                return mergeFrom((DescriptorProtos$FieldOptions) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3278 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        switch (iMo7718) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int iMo7737 = abstractC3473.mo7737();
                                if (CType.forNumber(iMo7737) == null) {
                                    mergeUnknownVarintField(1, iMo7737);
                                } else {
                                    this.ctype_ = iMo7737;
                                    this.bitField0_ |= 1;
                                }
                                break;
                            case 16:
                                this.packed_ = abstractC3473.mo7733();
                                this.bitField0_ |= 2;
                                break;
                            case 24:
                                this.deprecated_ = abstractC3473.mo7733();
                                this.bitField0_ |= 32;
                                break;
                            case 40:
                                this.lazy_ = abstractC3473.mo7733();
                                this.bitField0_ |= 8;
                                break;
                            case 48:
                                int iMo77372 = abstractC3473.mo7737();
                                if (JSType.forNumber(iMo77372) == null) {
                                    mergeUnknownVarintField(6, iMo77372);
                                } else {
                                    this.jstype_ = iMo77372;
                                    this.bitField0_ |= 4;
                                }
                                break;
                            case 80:
                                this.weak_ = abstractC3473.mo7733();
                                this.bitField0_ |= 64;
                                break;
                            case 120:
                                this.unverifiedLazy_ = abstractC3473.mo7733();
                                this.bitField0_ |= 16;
                                break;
                            case 128:
                                this.debugRedact_ = abstractC3473.mo7733();
                                this.bitField0_ |= 128;
                                break;
                            case 136:
                                int iMo77373 = abstractC3473.mo7737();
                                if (OptionRetention.forNumber(iMo77373) == null) {
                                    mergeUnknownVarintField(17, iMo77373);
                                } else {
                                    this.retention_ = iMo77373;
                                    this.bitField0_ |= 256;
                                }
                                break;
                            case 152:
                                int iMo77374 = abstractC3473.mo7737();
                                if (OptionTargetType.forNumber(iMo77374) == null) {
                                    mergeUnknownVarintField(19, iMo77374);
                                } else {
                                    ensureTargetsIsMutable();
                                    ((C3612) this.targets_).m7825(iMo77374);
                                }
                                break;
                            case 154:
                                int iMo7740 = abstractC3473.mo7740(abstractC3473.mo7714());
                                ensureTargetsIsMutable();
                                while (abstractC3473.mo7723() > 0) {
                                    int iMo77375 = abstractC3473.mo7737();
                                    if (OptionTargetType.forNumber(iMo77375) == null) {
                                        mergeUnknownVarintField(19, iMo77375);
                                    } else {
                                        ((C3612) this.targets_).m7825(iMo77375);
                                    }
                                }
                                abstractC3473.mo7739(iMo7740);
                                break;
                            case 162:
                                EditionDefault editionDefault = (EditionDefault) abstractC3473.mo7728(EditionDefault.parser(), c3696);
                                C3362 c3362 = this.editionDefaultsBuilder_;
                                if (c3362 == null) {
                                    ensureEditionDefaultsIsMutable();
                                    this.editionDefaults_.add(editionDefault);
                                } else {
                                    c3362.m7471(editionDefault);
                                }
                                break;
                            case 170:
                                abstractC3473.mo7729(internalGetFeaturesFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 2048;
                                break;
                            case 178:
                                abstractC3473.mo7729(internalGetFeatureSupportFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 4096;
                                break;
                            case 7994:
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC3473.mo7728(DescriptorProtos$UninterpretedOption.parser(), c3696);
                                C3362 c33622 = this.uninterpretedOptionBuilder_;
                                if (c33622 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c33622.m7471(descriptorProtos$UninterpretedOption);
                                }
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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
    public DescriptorProtos$FieldOptions getDefaultInstanceForType() {
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

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3278 newBuilderForType() {
        return newBuilder();
    }

    public static C3278 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum CType implements InterfaceC3380 {
        STRING(0),
        CORD(1),
        STRING_PIECE(2);

        public static final int CORD_VALUE = 1;
        public static final int STRING_PIECE_VALUE = 2;
        public static final int STRING_VALUE = 0;
        private static final CType[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "CType");
            internalValueMap = new C3522();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11372[0];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static CType valueOf(C3663 c3663) {
            if (c3663.f11379 == getDescriptor()) {
                return VALUES[c3663.f11380];
            }
            C5919.m11249("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3665 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3398
        public final int getNumber() {
            return this.value;
        }

        public final C3663 getValueDescriptor() {
            C3665 descriptor = getDescriptor();
            return descriptor.f11389[ordinal()];
        }

        @Deprecated
        public static CType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum JSType implements InterfaceC3380 {
        JS_NORMAL(0),
        JS_STRING(1),
        JS_NUMBER(2);

        public static final int JS_NORMAL_VALUE = 0;
        public static final int JS_NUMBER_VALUE = 2;
        public static final int JS_STRING_VALUE = 1;
        private static final JSType[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "JSType");
            internalValueMap = new C3512();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11372[1];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static JSType valueOf(C3663 c3663) {
            if (c3663.f11379 == getDescriptor()) {
                return VALUES[c3663.f11380];
            }
            C5919.m11249("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3665 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3398
        public final int getNumber() {
            return this.value;
        }

        public final C3663 getValueDescriptor() {
            C3665 descriptor = getDescriptor();
            return descriptor.f11389[ordinal()];
        }

        @Deprecated
        public static JSType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum OptionRetention implements InterfaceC3380 {
        RETENTION_UNKNOWN(0),
        RETENTION_RUNTIME(1),
        RETENTION_SOURCE(2);

        public static final int RETENTION_RUNTIME_VALUE = 1;
        public static final int RETENTION_SOURCE_VALUE = 2;
        public static final int RETENTION_UNKNOWN_VALUE = 0;
        private static final OptionRetention[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "OptionRetention");
            internalValueMap = new C3509();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11372[2];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static OptionRetention valueOf(C3663 c3663) {
            if (c3663.f11379 == getDescriptor()) {
                return VALUES[c3663.f11380];
            }
            C5919.m11249("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3665 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3398
        public final int getNumber() {
            return this.value;
        }

        public final C3663 getValueDescriptor() {
            C3665 descriptor = getDescriptor();
            return descriptor.f11389[ordinal()];
        }

        @Deprecated
        public static OptionRetention valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum OptionTargetType implements InterfaceC3380 {
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
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "OptionTargetType");
            internalValueMap = new C3510();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FieldOptions.getDescriptor().f11372[3];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static OptionTargetType valueOf(C3663 c3663) {
            if (c3663.f11379 == getDescriptor()) {
                return VALUES[c3663.f11380];
            }
            C5919.m11249("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3665 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3398
        public final int getNumber() {
            return this.value;
        }

        public final C3663 getValueDescriptor() {
            C3665 descriptor = getDescriptor();
            return descriptor.f11389[ordinal()];
        }

        @Deprecated
        public static OptionTargetType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$FieldOptions) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$FieldOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }

    private DescriptorProtos$FieldOptions(GeneratedMessage.AbstractC3303 abstractC3303) {
        super(abstractC3303);
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
