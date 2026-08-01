package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FeatureSetDefaults extends GeneratedMessage implements InterfaceC3506 {
    public static final int DEFAULTS_FIELD_NUMBER = 1;
    private static final DescriptorProtos$FeatureSetDefaults DEFAULT_INSTANCE;
    public static final int MAXIMUM_EDITION_FIELD_NUMBER = 5;
    public static final int MINIMUM_EDITION_FIELD_NUMBER = 4;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<FeatureSetEditionDefault> defaults_;
    private int maximumEdition_;
    private byte memoizedIsInitialized;
    private int minimumEdition_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSetDefaults");
        DEFAULT_INSTANCE = new DescriptorProtos$FeatureSetDefaults();
        PARSER = new C3520();
    }

    private DescriptorProtos$FeatureSetDefaults() {
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.defaults_ = Collections.EMPTY_LIST;
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
    }

    public static /* synthetic */ int access$34276(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults, int i) {
        int i2 = i | descriptorProtos$FeatureSetDefaults.bitField0_;
        descriptorProtos$FeatureSetDefaults.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$FeatureSetDefaults getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11449;
    }

    public static C3274 newBuilder(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FeatureSetDefaults);
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$FeatureSetDefaults)) {
            return super.equals(obj);
        }
        DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults = (DescriptorProtos$FeatureSetDefaults) obj;
        if (!getDefaultsList().equals(descriptorProtos$FeatureSetDefaults.getDefaultsList()) || hasMinimumEdition() != descriptorProtos$FeatureSetDefaults.hasMinimumEdition()) {
            return false;
        }
        if ((!hasMinimumEdition() || this.minimumEdition_ == descriptorProtos$FeatureSetDefaults.minimumEdition_) && hasMaximumEdition() == descriptorProtos$FeatureSetDefaults.hasMaximumEdition()) {
            return (!hasMaximumEdition() || this.maximumEdition_ == descriptorProtos$FeatureSetDefaults.maximumEdition_) && getUnknownFields().equals(descriptorProtos$FeatureSetDefaults.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public FeatureSetEditionDefault getDefaults(int i) {
        return this.defaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3506
    public int getDefaultsCount() {
        return this.defaults_.size();
    }

    @Override // com.google.protobuf.InterfaceC3506
    public List<FeatureSetEditionDefault> getDefaultsList() {
        return this.defaults_;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public InterfaceC3518 getDefaultsOrBuilder(int i) {
        return this.defaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3506
    public List<? extends InterfaceC3518> getDefaultsOrBuilderList() {
        return this.defaults_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11449;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public DescriptorProtos$Edition getMaximumEdition() {
        DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.maximumEdition_);
        return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public DescriptorProtos$Edition getMinimumEdition() {
        DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.minimumEdition_);
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
        int size = this.defaults_.size();
        int iM7656 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7656 += AbstractC3461.m7656(this.defaults_.get(i2));
        }
        int iM7645 = iM7656 + size;
        if ((this.bitField0_ & 1) != 0) {
            iM7645 += AbstractC3461.m7645(4, this.minimumEdition_);
        }
        if ((this.bitField0_ & 2) != 0) {
            iM7645 += AbstractC3461.m7645(5, this.maximumEdition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7645;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasMaximumEdition() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasMinimumEdition() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getDefaultsCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getDefaultsList().hashCode();
        }
        if (hasMinimumEdition()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + this.minimumEdition_;
        }
        if (hasMaximumEdition()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + this.maximumEdition_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11448;
        c3618.m7840(DescriptorProtos$FeatureSetDefaults.class, C3274.class);
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
        for (int i = 0; i < getDefaultsCount(); i++) {
            if (!getDefaults(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC3532
    public C3274 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3274(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3274 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3274() : new C3274().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        for (int i = 0; i < this.defaults_.size(); i++) {
            abstractC3461.mo7662(1, this.defaults_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7664(4, this.minimumEdition_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7664(5, this.maximumEdition_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class FeatureSetEditionDefault extends GeneratedMessage implements InterfaceC3518 {
        private static final FeatureSetEditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
        public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
        private static final InterfaceC3374 PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int edition_;
        private DescriptorProtos$FeatureSet fixedFeatures_;
        private byte memoizedIsInitialized;
        private DescriptorProtos$FeatureSet overridableFeatures_;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSetEditionDefault");
            DEFAULT_INSTANCE = new FeatureSetEditionDefault();
            PARSER = new C3517();
        }

        private FeatureSetEditionDefault(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
            this.edition_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static /* synthetic */ int access$33576(FeatureSetEditionDefault featureSetEditionDefault, int i) {
            int i2 = i | featureSetEditionDefault.bitField0_;
            featureSetEditionDefault.bitField0_ = i2;
            return i2;
        }

        public static FeatureSetEditionDefault getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11447;
        }

        public static C3273 newBuilder(FeatureSetEditionDefault featureSetEditionDefault) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureSetEditionDefault);
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer) {
            return (FeatureSetEditionDefault) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeatureSetEditionDefault)) {
                return super.equals(obj);
            }
            FeatureSetEditionDefault featureSetEditionDefault = (FeatureSetEditionDefault) obj;
            if (hasEdition() != featureSetEditionDefault.hasEdition()) {
                return false;
            }
            if ((hasEdition() && this.edition_ != featureSetEditionDefault.edition_) || hasOverridableFeatures() != featureSetEditionDefault.hasOverridableFeatures()) {
                return false;
            }
            if ((!hasOverridableFeatures() || getOverridableFeatures().equals(featureSetEditionDefault.getOverridableFeatures())) && hasFixedFeatures() == featureSetEditionDefault.hasFixedFeatures()) {
                return (!hasFixedFeatures() || getFixedFeatures().equals(featureSetEditionDefault.getFixedFeatures())) && getUnknownFields().equals(featureSetEditionDefault.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11447;
        }

        @Override // com.google.protobuf.InterfaceC3518
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3518
        public DescriptorProtos$FeatureSet getFixedFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3518
        public InterfaceC3505 getFixedFeaturesOrBuilder() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3518
        public DescriptorProtos$FeatureSet getOverridableFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3518
        public InterfaceC3505 getOverridableFeaturesOrBuilder() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
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
            int iM7645 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7645(3, this.edition_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7645 += AbstractC3461.m7652(4, getOverridableFeatures());
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7645 += AbstractC3461.m7652(5, getFixedFeatures());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7645;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3518
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3518
        public boolean hasFixedFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3518
        public boolean hasOverridableFeatures() {
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
            if (hasOverridableFeatures()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + getOverridableFeatures().hashCode();
            }
            if (hasFixedFeatures()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + getFixedFeatures().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11446;
            c3618.m7840(FeatureSetEditionDefault.class, C3273.class);
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
            if (hasOverridableFeatures() && !getOverridableFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFixedFeatures() || getFixedFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.AbstractC3532
        public C3273 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3273(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3273 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3273() : new C3273().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3461.mo7664(3, this.edition_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3461.mo7662(4, getOverridableFeatures());
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC3461.mo7662(5, getFixedFeatures());
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3273 extends GeneratedMessage.AbstractC3304 implements InterfaceC3518 {
            private int bitField0_;
            private int edition_;
            private C3341 fixedFeaturesBuilder_;
            private DescriptorProtos$FeatureSet fixedFeatures_;
            private C3341 overridableFeaturesBuilder_;
            private DescriptorProtos$FeatureSet overridableFeatures_;

            private C3273() {
                this.edition_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(FeatureSetEditionDefault featureSetEditionDefault) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    featureSetEditionDefault.edition_ = this.edition_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    C3341 c3341 = this.overridableFeaturesBuilder_;
                    featureSetEditionDefault.overridableFeatures_ = c3341 == null ? this.overridableFeatures_ : (DescriptorProtos$FeatureSet) c3341.m7397();
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    C3341 c33412 = this.fixedFeaturesBuilder_;
                    featureSetEditionDefault.fixedFeatures_ = c33412 == null ? this.fixedFeatures_ : (DescriptorProtos$FeatureSet) c33412.m7397();
                    i |= 4;
                }
                FeatureSetEditionDefault.access$33576(featureSetEditionDefault, i);
            }

            public static final C3662 getDescriptor() {
                return AbstractC3669.f11447;
            }

            private C3341 internalGetFixedFeaturesFieldBuilder() {
                if (this.fixedFeaturesBuilder_ == null) {
                    this.fixedFeaturesBuilder_ = new C3341(getFixedFeatures(), getParentForChildren(), isClean());
                    this.fixedFeatures_ = null;
                }
                return this.fixedFeaturesBuilder_;
            }

            private C3341 internalGetOverridableFeaturesFieldBuilder() {
                if (this.overridableFeaturesBuilder_ == null) {
                    this.overridableFeaturesBuilder_ = new C3341(getOverridableFeatures(), getParentForChildren(), isClean());
                    this.overridableFeatures_ = null;
                }
                return this.overridableFeaturesBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetOverridableFeaturesFieldBuilder();
                    internalGetFixedFeaturesFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public FeatureSetEditionDefault build() {
                FeatureSetEditionDefault featureSetEditionDefaultBuildPartial = buildPartial();
                if (featureSetEditionDefaultBuildPartial.isInitialized()) {
                    return featureSetEditionDefaultBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) featureSetEditionDefaultBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public FeatureSetEditionDefault buildPartial() {
                FeatureSetEditionDefault featureSetEditionDefault = new FeatureSetEditionDefault(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureSetEditionDefault);
                }
                onBuilt();
                return featureSetEditionDefault;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3273 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.edition_ = 0;
                this.overridableFeatures_ = null;
                C3341 c3341 = this.overridableFeaturesBuilder_;
                if (c3341 != null) {
                    c3341.f10966 = null;
                    this.overridableFeaturesBuilder_ = null;
                }
                this.fixedFeatures_ = null;
                C3341 c33412 = this.fixedFeaturesBuilder_;
                if (c33412 != null) {
                    c33412.f10966 = null;
                    this.fixedFeaturesBuilder_ = null;
                }
                return this;
            }

            public C3273 clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
                onChanged();
                return this;
            }

            public C3273 clearFixedFeatures() {
                this.bitField0_ &= -5;
                this.fixedFeatures_ = null;
                C3341 c3341 = this.fixedFeaturesBuilder_;
                if (c3341 != null) {
                    c3341.f10966 = null;
                    this.fixedFeaturesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public C3273 clearOverridableFeatures() {
                this.bitField0_ &= -3;
                this.overridableFeatures_ = null;
                C3341 c3341 = this.overridableFeaturesBuilder_;
                if (c3341 != null) {
                    c3341.f10966 = null;
                    this.overridableFeaturesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11447;
            }

            @Override // com.google.protobuf.InterfaceC3518
            public DescriptorProtos$Edition getEdition() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3518
            public DescriptorProtos$FeatureSet getFixedFeatures() {
                C3341 c3341 = this.fixedFeaturesBuilder_;
                if (c3341 != null) {
                    return (DescriptorProtos$FeatureSet) c3341.m7393();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            public DescriptorProtos$FeatureSet.C3272 getFixedFeaturesBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DescriptorProtos$FeatureSet.C3272) internalGetFixedFeaturesFieldBuilder().m7394();
            }

            @Override // com.google.protobuf.InterfaceC3518
            public InterfaceC3505 getFixedFeaturesOrBuilder() {
                C3341 c3341 = this.fixedFeaturesBuilder_;
                if (c3341 != null) {
                    return (InterfaceC3505) c3341.m7392();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            @Override // com.google.protobuf.InterfaceC3518
            public DescriptorProtos$FeatureSet getOverridableFeatures() {
                C3341 c3341 = this.overridableFeaturesBuilder_;
                if (c3341 != null) {
                    return (DescriptorProtos$FeatureSet) c3341.m7393();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            public DescriptorProtos$FeatureSet.C3272 getOverridableFeaturesBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DescriptorProtos$FeatureSet.C3272) internalGetOverridableFeaturesFieldBuilder().m7394();
            }

            @Override // com.google.protobuf.InterfaceC3518
            public InterfaceC3505 getOverridableFeaturesOrBuilder() {
                C3341 c3341 = this.overridableFeaturesBuilder_;
                if (c3341 != null) {
                    return (InterfaceC3505) c3341.m7392();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            @Override // com.google.protobuf.InterfaceC3518
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3518
            public boolean hasFixedFeatures() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3518
            public boolean hasOverridableFeatures() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11446;
                c3618.m7840(FeatureSetEditionDefault.class, C3273.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                if (!hasOverridableFeatures() || getOverridableFeatures().isInitialized()) {
                    return !hasFixedFeatures() || getFixedFeatures().isInitialized();
                }
                return false;
            }

            public C3273 mergeFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
                C3341 c3341 = this.fixedFeaturesBuilder_;
                if (c3341 != null) {
                    c3341.m7399(descriptorProtos$FeatureSet);
                } else if ((this.bitField0_ & 4) == 0 || (descriptorProtos$FeatureSet2 = this.fixedFeatures_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                    this.fixedFeatures_ = descriptorProtos$FeatureSet;
                } else {
                    getFixedFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
                }
                if (this.fixedFeatures_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3273 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 != 0) {
                                if (iMo7718 == 24) {
                                    int iMo7737 = abstractC3473.mo7737();
                                    if (DescriptorProtos$Edition.forNumber(iMo7737) == null) {
                                        mergeUnknownVarintField(3, iMo7737);
                                    } else {
                                        this.edition_ = iMo7737;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (iMo7718 == 34) {
                                    abstractC3473.mo7729(internalGetOverridableFeaturesFieldBuilder().m7394(), c3696);
                                    this.bitField0_ |= 2;
                                } else if (iMo7718 == 42) {
                                    abstractC3473.mo7729(internalGetFixedFeaturesFieldBuilder().m7394(), c3696);
                                    this.bitField0_ |= 4;
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

            public C3273 mergeOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
                C3341 c3341 = this.overridableFeaturesBuilder_;
                if (c3341 != null) {
                    c3341.m7399(descriptorProtos$FeatureSet);
                } else if ((this.bitField0_ & 2) == 0 || (descriptorProtos$FeatureSet2 = this.overridableFeatures_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                    this.overridableFeatures_ = descriptorProtos$FeatureSet;
                } else {
                    getOverridableFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
                }
                if (this.overridableFeatures_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public C3273 setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 1;
                this.edition_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3273 setFixedFeatures(DescriptorProtos$FeatureSet.C3272 c3272) {
                C3341 c3341 = this.fixedFeaturesBuilder_;
                if (c3341 == null) {
                    this.fixedFeatures_ = c3272.build();
                } else {
                    c3341.m7400(c3272.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3273 setOverridableFeatures(DescriptorProtos$FeatureSet.C3272 c3272) {
                C3341 c3341 = this.overridableFeaturesBuilder_;
                if (c3341 == null) {
                    this.overridableFeatures_ = c3272.build();
                } else {
                    c3341.m7400(c3272.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public FeatureSetEditionDefault getDefaultInstanceForType() {
                return FeatureSetEditionDefault.getDefaultInstance();
            }

            private C3273(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
                this.edition_ = 0;
                maybeForceBuilderInitialization();
            }

            public C3273 setFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                C3341 c3341 = this.fixedFeaturesBuilder_;
                if (c3341 == null) {
                    descriptorProtos$FeatureSet.getClass();
                    this.fixedFeatures_ = descriptorProtos$FeatureSet;
                } else {
                    c3341.m7400(descriptorProtos$FeatureSet);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3273 setOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                C3341 c3341 = this.overridableFeaturesBuilder_;
                if (c3341 == null) {
                    descriptorProtos$FeatureSet.getClass();
                    this.overridableFeatures_ = descriptorProtos$FeatureSet;
                } else {
                    c3341.m7400(descriptorProtos$FeatureSet);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3273 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof FeatureSetEditionDefault) {
                    return mergeFrom((FeatureSetEditionDefault) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3273 mergeFrom(FeatureSetEditionDefault featureSetEditionDefault) {
                if (featureSetEditionDefault == FeatureSetEditionDefault.getDefaultInstance()) {
                    return this;
                }
                if (featureSetEditionDefault.hasEdition()) {
                    setEdition(featureSetEditionDefault.getEdition());
                }
                if (featureSetEditionDefault.hasOverridableFeatures()) {
                    mergeOverridableFeatures(featureSetEditionDefault.getOverridableFeatures());
                }
                if (featureSetEditionDefault.hasFixedFeatures()) {
                    mergeFixedFeatures(featureSetEditionDefault.getFixedFeatures());
                }
                mergeUnknownFields(featureSetEditionDefault.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public FeatureSetEditionDefault getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3273 newBuilderForType() {
            return newBuilder();
        }

        private FeatureSetEditionDefault() {
            this.memoizedIsInitialized = (byte) -1;
            this.edition_ = 0;
        }

        public static C3273 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (FeatureSetEditionDefault) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static FeatureSetEditionDefault parseFrom(ByteString byteString) {
            return (FeatureSetEditionDefault) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static FeatureSetEditionDefault parseFrom(ByteString byteString, C3696 c3696) {
            return (FeatureSetEditionDefault) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr) {
            return (FeatureSetEditionDefault) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr, C3696 c3696) {
            return (FeatureSetEditionDefault) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream, C3696 c3696) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static FeatureSetEditionDefault parseFrom(AbstractC3473 abstractC3473) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static FeatureSetEditionDefault parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3274 extends GeneratedMessage.AbstractC3304 implements InterfaceC3506 {
        private int bitField0_;
        private C3362 defaultsBuilder_;
        private List<FeatureSetEditionDefault> defaults_;
        private int maximumEdition_;
        private int minimumEdition_;

        private C3274() {
            this.defaults_ = Collections.EMPTY_LIST;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
        }

        private void buildPartial0(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 2) != 0) {
                descriptorProtos$FeatureSetDefaults.minimumEdition_ = this.minimumEdition_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$FeatureSetDefaults.maximumEdition_ = this.maximumEdition_;
                i |= 2;
            }
            DescriptorProtos$FeatureSetDefaults.access$34276(descriptorProtos$FeatureSetDefaults, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 != null) {
                descriptorProtos$FeatureSetDefaults.defaults_ = c3362.m7485();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.defaults_ = Collections.unmodifiableList(this.defaults_);
                this.bitField0_ &= -2;
            }
            descriptorProtos$FeatureSetDefaults.defaults_ = this.defaults_;
        }

        private void ensureDefaultsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.defaults_ = new ArrayList(this.defaults_);
                this.bitField0_ |= 1;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11449;
        }

        private C3362 internalGetDefaultsFieldBuilder() {
            if (this.defaultsBuilder_ == null) {
                this.defaultsBuilder_ = new C3362(this.defaults_, getParentForChildren(), isClean());
                this.defaults_ = null;
            }
            return this.defaultsBuilder_;
        }

        public C3274 addAllDefaults(Iterable<? extends FeatureSetEditionDefault> iterable) {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureDefaultsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.defaults_);
            onChanged();
            return this;
        }

        public C3274 addDefaults(FeatureSetEditionDefault.C3273 c3273) {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3273.build());
                return this;
            }
            ensureDefaultsIsMutable();
            this.defaults_.add(c3273.build());
            onChanged();
            return this;
        }

        public FeatureSetEditionDefault.C3273 addDefaultsBuilder() {
            return (FeatureSetEditionDefault.C3273) internalGetDefaultsFieldBuilder().m7473(FeatureSetEditionDefault.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FeatureSetDefaults build() {
            DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaultsBuildPartial = buildPartial();
            if (descriptorProtos$FeatureSetDefaultsBuildPartial.isInitialized()) {
                return descriptorProtos$FeatureSetDefaultsBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$FeatureSetDefaultsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FeatureSetDefaults buildPartial() {
            DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults = new DescriptorProtos$FeatureSetDefaults(this);
            buildPartialRepeatedFields(descriptorProtos$FeatureSetDefaults);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FeatureSetDefaults);
            }
            onBuilt();
            return descriptorProtos$FeatureSetDefaults;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3274 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 == null) {
                this.defaults_ = Collections.EMPTY_LIST;
            } else {
                this.defaults_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -2;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
            return this;
        }

        public C3274 clearDefaults() {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.defaults_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3274 clearMaximumEdition() {
            this.bitField0_ &= -5;
            this.maximumEdition_ = 0;
            onChanged();
            return this;
        }

        public C3274 clearMinimumEdition() {
            this.bitField0_ &= -3;
            this.minimumEdition_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public FeatureSetEditionDefault getDefaults(int i) {
            C3362 c3362 = this.defaultsBuilder_;
            return c3362 == null ? this.defaults_.get(i) : (FeatureSetEditionDefault) c3362.m7479(i, false);
        }

        public FeatureSetEditionDefault.C3273 getDefaultsBuilder(int i) {
            return (FeatureSetEditionDefault.C3273) internalGetDefaultsFieldBuilder().m7486(i);
        }

        public List<FeatureSetEditionDefault.C3273> getDefaultsBuilderList() {
            return internalGetDefaultsFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3506
        public int getDefaultsCount() {
            C3362 c3362 = this.defaultsBuilder_;
            return c3362 == null ? this.defaults_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3506
        public List<FeatureSetEditionDefault> getDefaultsList() {
            C3362 c3362 = this.defaultsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.defaults_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3506
        public InterfaceC3518 getDefaultsOrBuilder(int i) {
            C3362 c3362 = this.defaultsBuilder_;
            return c3362 == null ? this.defaults_.get(i) : (InterfaceC3518) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3506
        public List<? extends InterfaceC3518> getDefaultsOrBuilderList() {
            C3362 c3362 = this.defaultsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.defaults_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11449;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public DescriptorProtos$Edition getMaximumEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.maximumEdition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public DescriptorProtos$Edition getMinimumEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.minimumEdition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasMaximumEdition() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasMinimumEdition() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11448;
            c3618.m7840(DescriptorProtos$FeatureSetDefaults.class, C3274.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            for (int i = 0; i < getDefaultsCount(); i++) {
                if (!getDefaults(i).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        public C3274 mergeFrom(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
            if (descriptorProtos$FeatureSetDefaults == DescriptorProtos$FeatureSetDefaults.getDefaultInstance()) {
                return this;
            }
            if (this.defaultsBuilder_ == null) {
                if (!descriptorProtos$FeatureSetDefaults.defaults_.isEmpty()) {
                    if (this.defaults_.isEmpty()) {
                        this.defaults_ = descriptorProtos$FeatureSetDefaults.defaults_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureDefaultsIsMutable();
                        this.defaults_.addAll(descriptorProtos$FeatureSetDefaults.defaults_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$FeatureSetDefaults.defaults_.isEmpty()) {
                boolean zIsEmpty = this.defaultsBuilder_.f11007.isEmpty();
                C3362 c3362 = this.defaultsBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.defaultsBuilder_ = null;
                    this.defaults_ = descriptorProtos$FeatureSetDefaults.defaults_;
                    this.bitField0_ &= -2;
                    this.defaultsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetDefaultsFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$FeatureSetDefaults.defaults_);
                }
            }
            if (descriptorProtos$FeatureSetDefaults.hasMinimumEdition()) {
                setMinimumEdition(descriptorProtos$FeatureSetDefaults.getMinimumEdition());
            }
            if (descriptorProtos$FeatureSetDefaults.hasMaximumEdition()) {
                setMaximumEdition(descriptorProtos$FeatureSetDefaults.getMaximumEdition());
            }
            mergeUnknownFields(descriptorProtos$FeatureSetDefaults.getUnknownFields());
            onChanged();
            return this;
        }

        public C3274 removeDefaults(int i) {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureDefaultsIsMutable();
            this.defaults_.remove(i);
            onChanged();
            return this;
        }

        public C3274 setDefaults(int i, FeatureSetEditionDefault.C3273 c3273) {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3273.build());
                return this;
            }
            ensureDefaultsIsMutable();
            this.defaults_.set(i, c3273.build());
            onChanged();
            return this;
        }

        public C3274 setMaximumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            descriptorProtos$Edition.getClass();
            this.bitField0_ |= 4;
            this.maximumEdition_ = descriptorProtos$Edition.getNumber();
            onChanged();
            return this;
        }

        public C3274 setMinimumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            descriptorProtos$Edition.getClass();
            this.bitField0_ |= 2;
            this.minimumEdition_ = descriptorProtos$Edition.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$FeatureSetDefaults getDefaultInstanceForType() {
            return DescriptorProtos$FeatureSetDefaults.getDefaultInstance();
        }

        private C3274(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.defaults_ = Collections.EMPTY_LIST;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
        }

        public FeatureSetEditionDefault.C3273 addDefaultsBuilder(int i) {
            return (FeatureSetEditionDefault.C3273) internalGetDefaultsFieldBuilder().m7474(i, FeatureSetEditionDefault.getDefaultInstance());
        }

        public C3274 addDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 == null) {
                featureSetEditionDefault.getClass();
                ensureDefaultsIsMutable();
                this.defaults_.add(i, featureSetEditionDefault);
                onChanged();
                return this;
            }
            c3362.m7472(i, featureSetEditionDefault);
            return this;
        }

        public C3274 setDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 == null) {
                featureSetEditionDefault.getClass();
                ensureDefaultsIsMutable();
                this.defaults_.set(i, featureSetEditionDefault);
                onChanged();
                return this;
            }
            c3362.m7476(i, featureSetEditionDefault);
            return this;
        }

        public C3274 addDefaults(FeatureSetEditionDefault featureSetEditionDefault) {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 == null) {
                featureSetEditionDefault.getClass();
                ensureDefaultsIsMutable();
                this.defaults_.add(featureSetEditionDefault);
                onChanged();
                return this;
            }
            c3362.m7471(featureSetEditionDefault);
            return this;
        }

        public C3274 addDefaults(int i, FeatureSetEditionDefault.C3273 c3273) {
            C3362 c3362 = this.defaultsBuilder_;
            if (c3362 == null) {
                ensureDefaultsIsMutable();
                this.defaults_.add(i, c3273.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3273.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3274 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$FeatureSetDefaults) {
                return mergeFrom((DescriptorProtos$FeatureSetDefaults) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3274 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                FeatureSetEditionDefault featureSetEditionDefault = (FeatureSetEditionDefault) abstractC3473.mo7728(FeatureSetEditionDefault.parser(), c3696);
                                C3362 c3362 = this.defaultsBuilder_;
                                if (c3362 == null) {
                                    ensureDefaultsIsMutable();
                                    this.defaults_.add(featureSetEditionDefault);
                                } else {
                                    c3362.m7471(featureSetEditionDefault);
                                }
                            } else if (iMo7718 == 32) {
                                int iMo7737 = abstractC3473.mo7737();
                                if (DescriptorProtos$Edition.forNumber(iMo7737) == null) {
                                    mergeUnknownVarintField(4, iMo7737);
                                } else {
                                    this.minimumEdition_ = iMo7737;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo7718 != 40) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                int iMo77372 = abstractC3473.mo7737();
                                if (DescriptorProtos$Edition.forNumber(iMo77372) == null) {
                                    mergeUnknownVarintField(5, iMo77372);
                                } else {
                                    this.maximumEdition_ = iMo77372;
                                    this.bitField0_ |= 4;
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$FeatureSetDefaults getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3274 newBuilderForType() {
        return newBuilder();
    }

    public static C3274 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteString byteString) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    private DescriptorProtos$FeatureSetDefaults(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
