package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FeatureSetDefaults extends GeneratedMessage implements InterfaceC3507 {
    public static final int DEFAULTS_FIELD_NUMBER = 1;
    private static final DescriptorProtos$FeatureSetDefaults DEFAULT_INSTANCE;
    public static final int MAXIMUM_EDITION_FIELD_NUMBER = 5;
    public static final int MINIMUM_EDITION_FIELD_NUMBER = 4;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<FeatureSetEditionDefault> defaults_;
    private int maximumEdition_;
    private byte memoizedIsInitialized;
    private int minimumEdition_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSetDefaults");
        DEFAULT_INSTANCE = new DescriptorProtos$FeatureSetDefaults();
        PARSER = new C3521();
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

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11454;
    }

    public static C3275 newBuilder(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FeatureSetDefaults);
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.InterfaceC3507
    public FeatureSetEditionDefault getDefaults(int i) {
        return this.defaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3507
    public int getDefaultsCount() {
        return this.defaults_.size();
    }

    @Override // com.google.protobuf.InterfaceC3507
    public List<FeatureSetEditionDefault> getDefaultsList() {
        return this.defaults_;
    }

    @Override // com.google.protobuf.InterfaceC3507
    public InterfaceC3519 getDefaultsOrBuilder(int i) {
        return this.defaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3507
    public List<? extends InterfaceC3519> getDefaultsOrBuilderList() {
        return this.defaults_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11454;
    }

    @Override // com.google.protobuf.InterfaceC3507
    public DescriptorProtos$Edition getMaximumEdition() {
        DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.maximumEdition_);
        return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3507
    public DescriptorProtos$Edition getMinimumEdition() {
        DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.minimumEdition_);
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
        int size = this.defaults_.size();
        int iM7643 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7643 += AbstractC3462.m7643(this.defaults_.get(i2));
        }
        int iM7632 = iM7643 + size;
        if ((this.bitField0_ & 1) != 0) {
            iM7632 += AbstractC3462.m7632(4, this.minimumEdition_);
        }
        if ((this.bitField0_ & 2) != 0) {
            iM7632 += AbstractC3462.m7632(5, this.maximumEdition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7632;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3507
    public boolean hasMaximumEdition() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3507
    public boolean hasMinimumEdition() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getDefaultsCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getDefaultsList().hashCode();
        }
        if (hasMinimumEdition()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + this.minimumEdition_;
        }
        if (hasMaximumEdition()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + this.maximumEdition_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11453;
        c3619.m7827(DescriptorProtos$FeatureSetDefaults.class, C3275.class);
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
        for (int i = 0; i < getDefaultsCount(); i++) {
            if (!getDefaults(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3275 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3275(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3275 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3275() : new C3275().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        for (int i = 0; i < this.defaults_.size(); i++) {
            abstractC3462.mo7649(1, this.defaults_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7651(4, this.minimumEdition_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7651(5, this.maximumEdition_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class FeatureSetEditionDefault extends GeneratedMessage implements InterfaceC3519 {
        private static final FeatureSetEditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
        public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
        private static final InterfaceC3375 PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int edition_;
        private DescriptorProtos$FeatureSet fixedFeatures_;
        private byte memoizedIsInitialized;
        private DescriptorProtos$FeatureSet overridableFeatures_;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSetEditionDefault");
            DEFAULT_INSTANCE = new FeatureSetEditionDefault();
            PARSER = new C3518();
        }

        private FeatureSetEditionDefault(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11452;
        }

        public static C3274 newBuilder(FeatureSetEditionDefault featureSetEditionDefault) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureSetEditionDefault);
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer) {
            return (FeatureSetEditionDefault) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11452;
        }

        @Override // com.google.protobuf.InterfaceC3519
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3519
        public DescriptorProtos$FeatureSet getFixedFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3519
        public InterfaceC3506 getFixedFeaturesOrBuilder() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3519
        public DescriptorProtos$FeatureSet getOverridableFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3519
        public InterfaceC3506 getOverridableFeaturesOrBuilder() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
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
            int iM7632 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7632(3, this.edition_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM7632 += AbstractC3462.m7639(4, getOverridableFeatures());
            }
            if ((this.bitField0_ & 4) != 0) {
                iM7632 += AbstractC3462.m7639(5, getFixedFeatures());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM7632;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3519
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3519
        public boolean hasFixedFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3519
        public boolean hasOverridableFeatures() {
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
            if (hasOverridableFeatures()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + getOverridableFeatures().hashCode();
            }
            if (hasFixedFeatures()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + getFixedFeatures().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11451;
            c3619.m7827(FeatureSetEditionDefault.class, C3274.class);
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

        @Override // com.google.protobuf.AbstractC3533
        public C3274 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3274(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3274 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3274() : new C3274().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC3462.mo7651(3, this.edition_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC3462.mo7649(4, getOverridableFeatures());
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC3462.mo7649(5, getFixedFeatures());
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3274 extends GeneratedMessage.AbstractC3305 implements InterfaceC3519 {
            private int bitField0_;
            private int edition_;
            private C3342 fixedFeaturesBuilder_;
            private DescriptorProtos$FeatureSet fixedFeatures_;
            private C3342 overridableFeaturesBuilder_;
            private DescriptorProtos$FeatureSet overridableFeatures_;

            private C3274() {
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
                    C3342 c3342 = this.overridableFeaturesBuilder_;
                    featureSetEditionDefault.overridableFeatures_ = c3342 == null ? this.overridableFeatures_ : (DescriptorProtos$FeatureSet) c3342.m7384();
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    C3342 c33422 = this.fixedFeaturesBuilder_;
                    featureSetEditionDefault.fixedFeatures_ = c33422 == null ? this.fixedFeatures_ : (DescriptorProtos$FeatureSet) c33422.m7384();
                    i |= 4;
                }
                FeatureSetEditionDefault.access$33576(featureSetEditionDefault, i);
            }

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11452;
            }

            private C3342 internalGetFixedFeaturesFieldBuilder() {
                if (this.fixedFeaturesBuilder_ == null) {
                    this.fixedFeaturesBuilder_ = new C3342(getFixedFeatures(), getParentForChildren(), isClean());
                    this.fixedFeatures_ = null;
                }
                return this.fixedFeaturesBuilder_;
            }

            private C3342 internalGetOverridableFeaturesFieldBuilder() {
                if (this.overridableFeaturesBuilder_ == null) {
                    this.overridableFeaturesBuilder_ = new C3342(getOverridableFeatures(), getParentForChildren(), isClean());
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

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public FeatureSetEditionDefault build() {
                FeatureSetEditionDefault featureSetEditionDefaultBuildPartial = buildPartial();
                if (featureSetEditionDefaultBuildPartial.isInitialized()) {
                    return featureSetEditionDefaultBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) featureSetEditionDefaultBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public FeatureSetEditionDefault buildPartial() {
                FeatureSetEditionDefault featureSetEditionDefault = new FeatureSetEditionDefault(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureSetEditionDefault);
                }
                onBuilt();
                return featureSetEditionDefault;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3274 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.edition_ = 0;
                this.overridableFeatures_ = null;
                C3342 c3342 = this.overridableFeaturesBuilder_;
                if (c3342 != null) {
                    c3342.f10971 = null;
                    this.overridableFeaturesBuilder_ = null;
                }
                this.fixedFeatures_ = null;
                C3342 c33422 = this.fixedFeaturesBuilder_;
                if (c33422 != null) {
                    c33422.f10971 = null;
                    this.fixedFeaturesBuilder_ = null;
                }
                return this;
            }

            public C3274 clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
                onChanged();
                return this;
            }

            public C3274 clearFixedFeatures() {
                this.bitField0_ &= -5;
                this.fixedFeatures_ = null;
                C3342 c3342 = this.fixedFeaturesBuilder_;
                if (c3342 != null) {
                    c3342.f10971 = null;
                    this.fixedFeaturesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public C3274 clearOverridableFeatures() {
                this.bitField0_ &= -3;
                this.overridableFeatures_ = null;
                C3342 c3342 = this.overridableFeaturesBuilder_;
                if (c3342 != null) {
                    c3342.f10971 = null;
                    this.overridableFeaturesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11452;
            }

            @Override // com.google.protobuf.InterfaceC3519
            public DescriptorProtos$Edition getEdition() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC3519
            public DescriptorProtos$FeatureSet getFixedFeatures() {
                C3342 c3342 = this.fixedFeaturesBuilder_;
                if (c3342 != null) {
                    return (DescriptorProtos$FeatureSet) c3342.m7380();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            public DescriptorProtos$FeatureSet.C3273 getFixedFeaturesBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DescriptorProtos$FeatureSet.C3273) internalGetFixedFeaturesFieldBuilder().m7381();
            }

            @Override // com.google.protobuf.InterfaceC3519
            public InterfaceC3506 getFixedFeaturesOrBuilder() {
                C3342 c3342 = this.fixedFeaturesBuilder_;
                if (c3342 != null) {
                    return (InterfaceC3506) c3342.m7379();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            @Override // com.google.protobuf.InterfaceC3519
            public DescriptorProtos$FeatureSet getOverridableFeatures() {
                C3342 c3342 = this.overridableFeaturesBuilder_;
                if (c3342 != null) {
                    return (DescriptorProtos$FeatureSet) c3342.m7380();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            public DescriptorProtos$FeatureSet.C3273 getOverridableFeaturesBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DescriptorProtos$FeatureSet.C3273) internalGetOverridableFeaturesFieldBuilder().m7381();
            }

            @Override // com.google.protobuf.InterfaceC3519
            public InterfaceC3506 getOverridableFeaturesOrBuilder() {
                C3342 c3342 = this.overridableFeaturesBuilder_;
                if (c3342 != null) {
                    return (InterfaceC3506) c3342.m7379();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            @Override // com.google.protobuf.InterfaceC3519
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3519
            public boolean hasFixedFeatures() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3519
            public boolean hasOverridableFeatures() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11451;
                c3619.m7827(FeatureSetEditionDefault.class, C3274.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                if (!hasOverridableFeatures() || getOverridableFeatures().isInitialized()) {
                    return !hasFixedFeatures() || getFixedFeatures().isInitialized();
                }
                return false;
            }

            public C3274 mergeFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
                C3342 c3342 = this.fixedFeaturesBuilder_;
                if (c3342 != null) {
                    c3342.m7386(descriptorProtos$FeatureSet);
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

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3274 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 24) {
                                    int iMo7724 = abstractC3474.mo7724();
                                    if (DescriptorProtos$Edition.forNumber(iMo7724) == null) {
                                        mergeUnknownVarintField(3, iMo7724);
                                    } else {
                                        this.edition_ = iMo7724;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (iMo7705 == 34) {
                                    abstractC3474.mo7716(internalGetOverridableFeaturesFieldBuilder().m7381(), c3697);
                                    this.bitField0_ |= 2;
                                } else if (iMo7705 == 42) {
                                    abstractC3474.mo7716(internalGetFixedFeaturesFieldBuilder().m7381(), c3697);
                                    this.bitField0_ |= 4;
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

            public C3274 mergeOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
                C3342 c3342 = this.overridableFeaturesBuilder_;
                if (c3342 != null) {
                    c3342.m7386(descriptorProtos$FeatureSet);
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

            public C3274 setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 1;
                this.edition_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C3274 setFixedFeatures(DescriptorProtos$FeatureSet.C3273 c3273) {
                C3342 c3342 = this.fixedFeaturesBuilder_;
                if (c3342 == null) {
                    this.fixedFeatures_ = c3273.build();
                } else {
                    c3342.m7387(c3273.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3274 setOverridableFeatures(DescriptorProtos$FeatureSet.C3273 c3273) {
                C3342 c3342 = this.overridableFeaturesBuilder_;
                if (c3342 == null) {
                    this.overridableFeatures_ = c3273.build();
                } else {
                    c3342.m7387(c3273.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public FeatureSetEditionDefault getDefaultInstanceForType() {
                return FeatureSetEditionDefault.getDefaultInstance();
            }

            private C3274(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
                this.edition_ = 0;
                maybeForceBuilderInitialization();
            }

            public C3274 setFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                C3342 c3342 = this.fixedFeaturesBuilder_;
                if (c3342 == null) {
                    descriptorProtos$FeatureSet.getClass();
                    this.fixedFeatures_ = descriptorProtos$FeatureSet;
                } else {
                    c3342.m7387(descriptorProtos$FeatureSet);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3274 setOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                C3342 c3342 = this.overridableFeaturesBuilder_;
                if (c3342 == null) {
                    descriptorProtos$FeatureSet.getClass();
                    this.overridableFeatures_ = descriptorProtos$FeatureSet;
                } else {
                    c3342.m7387(descriptorProtos$FeatureSet);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3274 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof FeatureSetEditionDefault) {
                    return mergeFrom((FeatureSetEditionDefault) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3274 mergeFrom(FeatureSetEditionDefault featureSetEditionDefault) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public FeatureSetEditionDefault getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3274 newBuilderForType() {
            return newBuilder();
        }

        private FeatureSetEditionDefault() {
            this.memoizedIsInitialized = (byte) -1;
            this.edition_ = 0;
        }

        public static C3274 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (FeatureSetEditionDefault) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static FeatureSetEditionDefault parseFrom(ByteString byteString) {
            return (FeatureSetEditionDefault) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static FeatureSetEditionDefault parseFrom(ByteString byteString, C3697 c3697) {
            return (FeatureSetEditionDefault) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr) {
            return (FeatureSetEditionDefault) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr, C3697 c3697) {
            return (FeatureSetEditionDefault) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream, C3697 c3697) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static FeatureSetEditionDefault parseFrom(AbstractC3474 abstractC3474) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static FeatureSetEditionDefault parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3275 extends GeneratedMessage.AbstractC3305 implements InterfaceC3507 {
        private int bitField0_;
        private C3363 defaultsBuilder_;
        private List<FeatureSetEditionDefault> defaults_;
        private int maximumEdition_;
        private int minimumEdition_;

        private C3275() {
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
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 != null) {
                descriptorProtos$FeatureSetDefaults.defaults_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11454;
        }

        private C3363 internalGetDefaultsFieldBuilder() {
            if (this.defaultsBuilder_ == null) {
                this.defaultsBuilder_ = new C3363(this.defaults_, getParentForChildren(), isClean());
                this.defaults_ = null;
            }
            return this.defaultsBuilder_;
        }

        public C3275 addAllDefaults(Iterable<? extends FeatureSetEditionDefault> iterable) {
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureDefaultsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.defaults_);
            onChanged();
            return this;
        }

        public C3275 addDefaults(FeatureSetEditionDefault.C3274 c3274) {
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3274.build());
                return this;
            }
            ensureDefaultsIsMutable();
            this.defaults_.add(c3274.build());
            onChanged();
            return this;
        }

        public FeatureSetEditionDefault.C3274 addDefaultsBuilder() {
            return (FeatureSetEditionDefault.C3274) internalGetDefaultsFieldBuilder().m7460(FeatureSetEditionDefault.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FeatureSetDefaults build() {
            DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaultsBuildPartial = buildPartial();
            if (descriptorProtos$FeatureSetDefaultsBuildPartial.isInitialized()) {
                return descriptorProtos$FeatureSetDefaultsBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$FeatureSetDefaultsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FeatureSetDefaults buildPartial() {
            DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults = new DescriptorProtos$FeatureSetDefaults(this);
            buildPartialRepeatedFields(descriptorProtos$FeatureSetDefaults);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FeatureSetDefaults);
            }
            onBuilt();
            return descriptorProtos$FeatureSetDefaults;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3275 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 == null) {
                this.defaults_ = Collections.EMPTY_LIST;
            } else {
                this.defaults_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -2;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
            return this;
        }

        public C3275 clearDefaults() {
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.defaults_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3275 clearMaximumEdition() {
            this.bitField0_ &= -5;
            this.maximumEdition_ = 0;
            onChanged();
            return this;
        }

        public C3275 clearMinimumEdition() {
            this.bitField0_ &= -3;
            this.minimumEdition_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3507
        public FeatureSetEditionDefault getDefaults(int i) {
            C3363 c3363 = this.defaultsBuilder_;
            return c3363 == null ? this.defaults_.get(i) : (FeatureSetEditionDefault) c3363.m7466(i, false);
        }

        public FeatureSetEditionDefault.C3274 getDefaultsBuilder(int i) {
            return (FeatureSetEditionDefault.C3274) internalGetDefaultsFieldBuilder().m7473(i);
        }

        public List<FeatureSetEditionDefault.C3274> getDefaultsBuilderList() {
            return internalGetDefaultsFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3507
        public int getDefaultsCount() {
            C3363 c3363 = this.defaultsBuilder_;
            return c3363 == null ? this.defaults_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3507
        public List<FeatureSetEditionDefault> getDefaultsList() {
            C3363 c3363 = this.defaultsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.defaults_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3507
        public InterfaceC3519 getDefaultsOrBuilder(int i) {
            C3363 c3363 = this.defaultsBuilder_;
            return c3363 == null ? this.defaults_.get(i) : (InterfaceC3519) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3507
        public List<? extends InterfaceC3519> getDefaultsOrBuilderList() {
            C3363 c3363 = this.defaultsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.defaults_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11454;
        }

        @Override // com.google.protobuf.InterfaceC3507
        public DescriptorProtos$Edition getMaximumEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.maximumEdition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3507
        public DescriptorProtos$Edition getMinimumEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.minimumEdition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3507
        public boolean hasMaximumEdition() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3507
        public boolean hasMinimumEdition() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11453;
            c3619.m7827(DescriptorProtos$FeatureSetDefaults.class, C3275.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            for (int i = 0; i < getDefaultsCount(); i++) {
                if (!getDefaults(i).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        public C3275 mergeFrom(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
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
                boolean zIsEmpty = this.defaultsBuilder_.f11012.isEmpty();
                C3363 c3363 = this.defaultsBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.defaultsBuilder_ = null;
                    this.defaults_ = descriptorProtos$FeatureSetDefaults.defaults_;
                    this.bitField0_ &= -2;
                    this.defaultsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetDefaultsFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$FeatureSetDefaults.defaults_);
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

        public C3275 removeDefaults(int i) {
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureDefaultsIsMutable();
            this.defaults_.remove(i);
            onChanged();
            return this;
        }

        public C3275 setDefaults(int i, FeatureSetEditionDefault.C3274 c3274) {
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3274.build());
                return this;
            }
            ensureDefaultsIsMutable();
            this.defaults_.set(i, c3274.build());
            onChanged();
            return this;
        }

        public C3275 setMaximumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            descriptorProtos$Edition.getClass();
            this.bitField0_ |= 4;
            this.maximumEdition_ = descriptorProtos$Edition.getNumber();
            onChanged();
            return this;
        }

        public C3275 setMinimumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            descriptorProtos$Edition.getClass();
            this.bitField0_ |= 2;
            this.minimumEdition_ = descriptorProtos$Edition.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$FeatureSetDefaults getDefaultInstanceForType() {
            return DescriptorProtos$FeatureSetDefaults.getDefaultInstance();
        }

        private C3275(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.defaults_ = Collections.EMPTY_LIST;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
        }

        public FeatureSetEditionDefault.C3274 addDefaultsBuilder(int i) {
            return (FeatureSetEditionDefault.C3274) internalGetDefaultsFieldBuilder().m7461(i, FeatureSetEditionDefault.getDefaultInstance());
        }

        public C3275 addDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 == null) {
                featureSetEditionDefault.getClass();
                ensureDefaultsIsMutable();
                this.defaults_.add(i, featureSetEditionDefault);
                onChanged();
                return this;
            }
            c3363.m7459(i, featureSetEditionDefault);
            return this;
        }

        public C3275 setDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 == null) {
                featureSetEditionDefault.getClass();
                ensureDefaultsIsMutable();
                this.defaults_.set(i, featureSetEditionDefault);
                onChanged();
                return this;
            }
            c3363.m7463(i, featureSetEditionDefault);
            return this;
        }

        public C3275 addDefaults(FeatureSetEditionDefault featureSetEditionDefault) {
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 == null) {
                featureSetEditionDefault.getClass();
                ensureDefaultsIsMutable();
                this.defaults_.add(featureSetEditionDefault);
                onChanged();
                return this;
            }
            c3363.m7458(featureSetEditionDefault);
            return this;
        }

        public C3275 addDefaults(int i, FeatureSetEditionDefault.C3274 c3274) {
            C3363 c3363 = this.defaultsBuilder_;
            if (c3363 == null) {
                ensureDefaultsIsMutable();
                this.defaults_.add(i, c3274.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3274.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3275 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$FeatureSetDefaults) {
                return mergeFrom((DescriptorProtos$FeatureSetDefaults) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3275 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                FeatureSetEditionDefault featureSetEditionDefault = (FeatureSetEditionDefault) abstractC3474.mo7715(FeatureSetEditionDefault.parser(), c3697);
                                C3363 c3363 = this.defaultsBuilder_;
                                if (c3363 == null) {
                                    ensureDefaultsIsMutable();
                                    this.defaults_.add(featureSetEditionDefault);
                                } else {
                                    c3363.m7458(featureSetEditionDefault);
                                }
                            } else if (iMo7705 == 32) {
                                int iMo7724 = abstractC3474.mo7724();
                                if (DescriptorProtos$Edition.forNumber(iMo7724) == null) {
                                    mergeUnknownVarintField(4, iMo7724);
                                } else {
                                    this.minimumEdition_ = iMo7724;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo7705 != 40) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                int iMo77242 = abstractC3474.mo7724();
                                if (DescriptorProtos$Edition.forNumber(iMo77242) == null) {
                                    mergeUnknownVarintField(5, iMo77242);
                                } else {
                                    this.maximumEdition_ = iMo77242;
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$FeatureSetDefaults getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3275 newBuilderForType() {
        return newBuilder();
    }

    public static C3275 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteString byteString) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    private DescriptorProtos$FeatureSetDefaults(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
