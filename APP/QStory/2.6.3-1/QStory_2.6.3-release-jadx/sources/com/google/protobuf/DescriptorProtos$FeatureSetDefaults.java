package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FeatureSetDefaults extends GeneratedMessage implements InterfaceC4339 {
    public static final int DEFAULTS_FIELD_NUMBER = 1;
    private static final DescriptorProtos$FeatureSetDefaults DEFAULT_INSTANCE;
    public static final int MAXIMUM_EDITION_FIELD_NUMBER = 5;
    public static final int MINIMUM_EDITION_FIELD_NUMBER = 4;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<FeatureSetEditionDefault> defaults_;
    private int maximumEdition_;
    private byte memoizedIsInitialized;
    private int minimumEdition_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSetDefaults");
        DEFAULT_INSTANCE = new DescriptorProtos$FeatureSetDefaults();
        PARSER = new C4353();
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

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11799;
    }

    public static C4107 newBuilder(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FeatureSetDefaults);
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.InterfaceC4339
    public FeatureSetEditionDefault getDefaults(int i) {
        return this.defaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4339
    public int getDefaultsCount() {
        return this.defaults_.size();
    }

    @Override // com.google.protobuf.InterfaceC4339
    public List<FeatureSetEditionDefault> getDefaultsList() {
        return this.defaults_;
    }

    @Override // com.google.protobuf.InterfaceC4339
    public InterfaceC4351 getDefaultsOrBuilder(int i) {
        return this.defaults_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4339
    public List<? extends InterfaceC4351> getDefaultsOrBuilderList() {
        return this.defaults_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11799;
    }

    @Override // com.google.protobuf.InterfaceC4339
    public DescriptorProtos$Edition getMaximumEdition() {
        DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.maximumEdition_);
        return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4339
    public DescriptorProtos$Edition getMinimumEdition() {
        DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.minimumEdition_);
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
        int size = this.defaults_.size();
        int iM8202 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM8202 += AbstractC4294.m8202(this.defaults_.get(i2));
        }
        int iM8191 = iM8202 + size;
        if ((this.bitField0_ & 1) != 0) {
            iM8191 += AbstractC4294.m8191(4, this.minimumEdition_);
        }
        if ((this.bitField0_ & 2) != 0) {
            iM8191 += AbstractC4294.m8191(5, this.maximumEdition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM8191;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4339
    public boolean hasMaximumEdition() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4339
    public boolean hasMinimumEdition() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getDefaultsCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getDefaultsList().hashCode();
        }
        if (hasMinimumEdition()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + this.minimumEdition_;
        }
        if (hasMaximumEdition()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + this.maximumEdition_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11798;
        c4451.m8386(DescriptorProtos$FeatureSetDefaults.class, C4107.class);
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
        for (int i = 0; i < getDefaultsCount(); i++) {
            if (!getDefaults(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4107 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4107(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4107 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4107() : new C4107().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        for (int i = 0; i < this.defaults_.size(); i++) {
            abstractC4294.mo8208(1, this.defaults_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8210(4, this.minimumEdition_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8210(5, this.maximumEdition_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class FeatureSetEditionDefault extends GeneratedMessage implements InterfaceC4351 {
        private static final FeatureSetEditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
        public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
        private static final InterfaceC4207 PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int edition_;
        private DescriptorProtos$FeatureSet fixedFeatures_;
        private byte memoizedIsInitialized;
        private DescriptorProtos$FeatureSet overridableFeatures_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSetEditionDefault");
            DEFAULT_INSTANCE = new FeatureSetEditionDefault();
            PARSER = new C4350();
        }

        private FeatureSetEditionDefault(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
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

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11797;
        }

        public static C4106 newBuilder(FeatureSetEditionDefault featureSetEditionDefault) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureSetEditionDefault);
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer) {
            return (FeatureSetEditionDefault) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11797;
        }

        @Override // com.google.protobuf.InterfaceC4351
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4351
        public DescriptorProtos$FeatureSet getFixedFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC4351
        public InterfaceC4338 getFixedFeaturesOrBuilder() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC4351
        public DescriptorProtos$FeatureSet getOverridableFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC4351
        public InterfaceC4338 getOverridableFeaturesOrBuilder() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
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
            int iM8191 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8191(3, this.edition_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iM8191 += AbstractC4294.m8198(4, getOverridableFeatures());
            }
            if ((this.bitField0_ & 4) != 0) {
                iM8191 += AbstractC4294.m8198(5, getFixedFeatures());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iM8191;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4351
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4351
        public boolean hasFixedFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4351
        public boolean hasOverridableFeatures() {
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
            if (hasOverridableFeatures()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + getOverridableFeatures().hashCode();
            }
            if (hasFixedFeatures()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + getFixedFeatures().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11796;
            c4451.m8386(FeatureSetEditionDefault.class, C4106.class);
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

        @Override // com.google.protobuf.AbstractC4365
        public C4106 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4106(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4106 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4106() : new C4106().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC4294.mo8210(3, this.edition_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC4294.mo8208(4, getOverridableFeatures());
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC4294.mo8208(5, getFixedFeatures());
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4106 extends GeneratedMessage.AbstractC4137 implements InterfaceC4351 {
            private int bitField0_;
            private int edition_;
            private C4174 fixedFeaturesBuilder_;
            private DescriptorProtos$FeatureSet fixedFeatures_;
            private C4174 overridableFeaturesBuilder_;
            private DescriptorProtos$FeatureSet overridableFeatures_;

            private C4106() {
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
                    C4174 c4174 = this.overridableFeaturesBuilder_;
                    featureSetEditionDefault.overridableFeatures_ = c4174 == null ? this.overridableFeatures_ : (DescriptorProtos$FeatureSet) c4174.m7943();
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    C4174 c41742 = this.fixedFeaturesBuilder_;
                    featureSetEditionDefault.fixedFeatures_ = c41742 == null ? this.fixedFeatures_ : (DescriptorProtos$FeatureSet) c41742.m7943();
                    i |= 4;
                }
                FeatureSetEditionDefault.access$33576(featureSetEditionDefault, i);
            }

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11797;
            }

            private C4174 internalGetFixedFeaturesFieldBuilder() {
                if (this.fixedFeaturesBuilder_ == null) {
                    this.fixedFeaturesBuilder_ = new C4174(getFixedFeatures(), getParentForChildren(), isClean());
                    this.fixedFeatures_ = null;
                }
                return this.fixedFeaturesBuilder_;
            }

            private C4174 internalGetOverridableFeaturesFieldBuilder() {
                if (this.overridableFeaturesBuilder_ == null) {
                    this.overridableFeaturesBuilder_ = new C4174(getOverridableFeatures(), getParentForChildren(), isClean());
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

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public FeatureSetEditionDefault build() {
                FeatureSetEditionDefault featureSetEditionDefaultBuildPartial = buildPartial();
                if (featureSetEditionDefaultBuildPartial.isInitialized()) {
                    return featureSetEditionDefaultBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) featureSetEditionDefaultBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public FeatureSetEditionDefault buildPartial() {
                FeatureSetEditionDefault featureSetEditionDefault = new FeatureSetEditionDefault(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureSetEditionDefault);
                }
                onBuilt();
                return featureSetEditionDefault;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4106 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.edition_ = 0;
                this.overridableFeatures_ = null;
                C4174 c4174 = this.overridableFeaturesBuilder_;
                if (c4174 != null) {
                    c4174.f11316 = null;
                    this.overridableFeaturesBuilder_ = null;
                }
                this.fixedFeatures_ = null;
                C4174 c41742 = this.fixedFeaturesBuilder_;
                if (c41742 != null) {
                    c41742.f11316 = null;
                    this.fixedFeaturesBuilder_ = null;
                }
                return this;
            }

            public C4106 clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
                onChanged();
                return this;
            }

            public C4106 clearFixedFeatures() {
                this.bitField0_ &= -5;
                this.fixedFeatures_ = null;
                C4174 c4174 = this.fixedFeaturesBuilder_;
                if (c4174 != null) {
                    c4174.f11316 = null;
                    this.fixedFeaturesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public C4106 clearOverridableFeatures() {
                this.bitField0_ &= -3;
                this.overridableFeatures_ = null;
                C4174 c4174 = this.overridableFeaturesBuilder_;
                if (c4174 != null) {
                    c4174.f11316 = null;
                    this.overridableFeaturesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11797;
            }

            @Override // com.google.protobuf.InterfaceC4351
            public DescriptorProtos$Edition getEdition() {
                DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.edition_);
                return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
            }

            @Override // com.google.protobuf.InterfaceC4351
            public DescriptorProtos$FeatureSet getFixedFeatures() {
                C4174 c4174 = this.fixedFeaturesBuilder_;
                if (c4174 != null) {
                    return (DescriptorProtos$FeatureSet) c4174.m7939();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            public DescriptorProtos$FeatureSet.C4105 getFixedFeaturesBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DescriptorProtos$FeatureSet.C4105) internalGetFixedFeaturesFieldBuilder().m7940();
            }

            @Override // com.google.protobuf.InterfaceC4351
            public InterfaceC4338 getFixedFeaturesOrBuilder() {
                C4174 c4174 = this.fixedFeaturesBuilder_;
                if (c4174 != null) {
                    return (InterfaceC4338) c4174.m7938();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            @Override // com.google.protobuf.InterfaceC4351
            public DescriptorProtos$FeatureSet getOverridableFeatures() {
                C4174 c4174 = this.overridableFeaturesBuilder_;
                if (c4174 != null) {
                    return (DescriptorProtos$FeatureSet) c4174.m7939();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            public DescriptorProtos$FeatureSet.C4105 getOverridableFeaturesBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DescriptorProtos$FeatureSet.C4105) internalGetOverridableFeaturesFieldBuilder().m7940();
            }

            @Override // com.google.protobuf.InterfaceC4351
            public InterfaceC4338 getOverridableFeaturesOrBuilder() {
                C4174 c4174 = this.overridableFeaturesBuilder_;
                if (c4174 != null) {
                    return (InterfaceC4338) c4174.m7938();
                }
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
                return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
            }

            @Override // com.google.protobuf.InterfaceC4351
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4351
            public boolean hasFixedFeatures() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4351
            public boolean hasOverridableFeatures() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11796;
                c4451.m8386(FeatureSetEditionDefault.class, C4106.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                if (!hasOverridableFeatures() || getOverridableFeatures().isInitialized()) {
                    return !hasFixedFeatures() || getFixedFeatures().isInitialized();
                }
                return false;
            }

            public C4106 mergeFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
                C4174 c4174 = this.fixedFeaturesBuilder_;
                if (c4174 != null) {
                    c4174.m7945(descriptorProtos$FeatureSet);
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

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4106 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 24) {
                                    int iMo8283 = abstractC4306.mo8283();
                                    if (DescriptorProtos$Edition.forNumber(iMo8283) == null) {
                                        mergeUnknownVarintField(3, iMo8283);
                                    } else {
                                        this.edition_ = iMo8283;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (iMo8264 == 34) {
                                    abstractC4306.mo8275(internalGetOverridableFeaturesFieldBuilder().m7940(), c4529);
                                    this.bitField0_ |= 2;
                                } else if (iMo8264 == 42) {
                                    abstractC4306.mo8275(internalGetFixedFeaturesFieldBuilder().m7940(), c4529);
                                    this.bitField0_ |= 4;
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

            public C4106 mergeOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
                C4174 c4174 = this.overridableFeaturesBuilder_;
                if (c4174 != null) {
                    c4174.m7945(descriptorProtos$FeatureSet);
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

            public C4106 setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
                descriptorProtos$Edition.getClass();
                this.bitField0_ |= 1;
                this.edition_ = descriptorProtos$Edition.getNumber();
                onChanged();
                return this;
            }

            public C4106 setFixedFeatures(DescriptorProtos$FeatureSet.C4105 c4105) {
                C4174 c4174 = this.fixedFeaturesBuilder_;
                if (c4174 == null) {
                    this.fixedFeatures_ = c4105.build();
                } else {
                    c4174.m7946(c4105.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4106 setOverridableFeatures(DescriptorProtos$FeatureSet.C4105 c4105) {
                C4174 c4174 = this.overridableFeaturesBuilder_;
                if (c4174 == null) {
                    this.overridableFeatures_ = c4105.build();
                } else {
                    c4174.m7946(c4105.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public FeatureSetEditionDefault getDefaultInstanceForType() {
                return FeatureSetEditionDefault.getDefaultInstance();
            }

            private C4106(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
                this.edition_ = 0;
                maybeForceBuilderInitialization();
            }

            public C4106 setFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                C4174 c4174 = this.fixedFeaturesBuilder_;
                if (c4174 == null) {
                    descriptorProtos$FeatureSet.getClass();
                    this.fixedFeatures_ = descriptorProtos$FeatureSet;
                } else {
                    c4174.m7946(descriptorProtos$FeatureSet);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4106 setOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                C4174 c4174 = this.overridableFeaturesBuilder_;
                if (c4174 == null) {
                    descriptorProtos$FeatureSet.getClass();
                    this.overridableFeatures_ = descriptorProtos$FeatureSet;
                } else {
                    c4174.m7946(descriptorProtos$FeatureSet);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4106 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof FeatureSetEditionDefault) {
                    return mergeFrom((FeatureSetEditionDefault) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4106 mergeFrom(FeatureSetEditionDefault featureSetEditionDefault) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public FeatureSetEditionDefault getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4106 newBuilderForType() {
            return newBuilder();
        }

        private FeatureSetEditionDefault() {
            this.memoizedIsInitialized = (byte) -1;
            this.edition_ = 0;
        }

        public static C4106 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (FeatureSetEditionDefault) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static FeatureSetEditionDefault parseFrom(ByteString byteString) {
            return (FeatureSetEditionDefault) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static FeatureSetEditionDefault parseFrom(ByteString byteString, C4529 c4529) {
            return (FeatureSetEditionDefault) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr) {
            return (FeatureSetEditionDefault) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr, C4529 c4529) {
            return (FeatureSetEditionDefault) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream, C4529 c4529) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static FeatureSetEditionDefault parseFrom(AbstractC4306 abstractC4306) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static FeatureSetEditionDefault parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (FeatureSetEditionDefault) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4107 extends GeneratedMessage.AbstractC4137 implements InterfaceC4339 {
        private int bitField0_;
        private C4195 defaultsBuilder_;
        private List<FeatureSetEditionDefault> defaults_;
        private int maximumEdition_;
        private int minimumEdition_;

        private C4107() {
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
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 != null) {
                descriptorProtos$FeatureSetDefaults.defaults_ = c4195.m8031();
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

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11799;
        }

        private C4195 internalGetDefaultsFieldBuilder() {
            if (this.defaultsBuilder_ == null) {
                this.defaultsBuilder_ = new C4195(this.defaults_, getParentForChildren(), isClean());
                this.defaults_ = null;
            }
            return this.defaultsBuilder_;
        }

        public C4107 addAllDefaults(Iterable<? extends FeatureSetEditionDefault> iterable) {
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureDefaultsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.defaults_);
            onChanged();
            return this;
        }

        public C4107 addDefaults(FeatureSetEditionDefault.C4106 c4106) {
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4106.build());
                return this;
            }
            ensureDefaultsIsMutable();
            this.defaults_.add(c4106.build());
            onChanged();
            return this;
        }

        public FeatureSetEditionDefault.C4106 addDefaultsBuilder() {
            return (FeatureSetEditionDefault.C4106) internalGetDefaultsFieldBuilder().m8019(FeatureSetEditionDefault.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FeatureSetDefaults build() {
            DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaultsBuildPartial = buildPartial();
            if (descriptorProtos$FeatureSetDefaultsBuildPartial.isInitialized()) {
                return descriptorProtos$FeatureSetDefaultsBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$FeatureSetDefaultsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FeatureSetDefaults buildPartial() {
            DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults = new DescriptorProtos$FeatureSetDefaults(this);
            buildPartialRepeatedFields(descriptorProtos$FeatureSetDefaults);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FeatureSetDefaults);
            }
            onBuilt();
            return descriptorProtos$FeatureSetDefaults;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4107 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 == null) {
                this.defaults_ = Collections.EMPTY_LIST;
            } else {
                this.defaults_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -2;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
            return this;
        }

        public C4107 clearDefaults() {
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.defaults_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4107 clearMaximumEdition() {
            this.bitField0_ &= -5;
            this.maximumEdition_ = 0;
            onChanged();
            return this;
        }

        public C4107 clearMinimumEdition() {
            this.bitField0_ &= -3;
            this.minimumEdition_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4339
        public FeatureSetEditionDefault getDefaults(int i) {
            C4195 c4195 = this.defaultsBuilder_;
            return c4195 == null ? this.defaults_.get(i) : (FeatureSetEditionDefault) c4195.m8025(i, false);
        }

        public FeatureSetEditionDefault.C4106 getDefaultsBuilder(int i) {
            return (FeatureSetEditionDefault.C4106) internalGetDefaultsFieldBuilder().m8032(i);
        }

        public List<FeatureSetEditionDefault.C4106> getDefaultsBuilderList() {
            return internalGetDefaultsFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4339
        public int getDefaultsCount() {
            C4195 c4195 = this.defaultsBuilder_;
            return c4195 == null ? this.defaults_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4339
        public List<FeatureSetEditionDefault> getDefaultsList() {
            C4195 c4195 = this.defaultsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.defaults_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4339
        public InterfaceC4351 getDefaultsOrBuilder(int i) {
            C4195 c4195 = this.defaultsBuilder_;
            return c4195 == null ? this.defaults_.get(i) : (InterfaceC4351) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4339
        public List<? extends InterfaceC4351> getDefaultsOrBuilderList() {
            C4195 c4195 = this.defaultsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.defaults_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11799;
        }

        @Override // com.google.protobuf.InterfaceC4339
        public DescriptorProtos$Edition getMaximumEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.maximumEdition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4339
        public DescriptorProtos$Edition getMinimumEdition() {
            DescriptorProtos$Edition descriptorProtos$EditionForNumber = DescriptorProtos$Edition.forNumber(this.minimumEdition_);
            return descriptorProtos$EditionForNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : descriptorProtos$EditionForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4339
        public boolean hasMaximumEdition() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4339
        public boolean hasMinimumEdition() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11798;
            c4451.m8386(DescriptorProtos$FeatureSetDefaults.class, C4107.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            for (int i = 0; i < getDefaultsCount(); i++) {
                if (!getDefaults(i).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        public C4107 mergeFrom(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
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
                boolean zIsEmpty = this.defaultsBuilder_.f11357.isEmpty();
                C4195 c4195 = this.defaultsBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.defaultsBuilder_ = null;
                    this.defaults_ = descriptorProtos$FeatureSetDefaults.defaults_;
                    this.bitField0_ &= -2;
                    this.defaultsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetDefaultsFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$FeatureSetDefaults.defaults_);
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

        public C4107 removeDefaults(int i) {
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureDefaultsIsMutable();
            this.defaults_.remove(i);
            onChanged();
            return this;
        }

        public C4107 setDefaults(int i, FeatureSetEditionDefault.C4106 c4106) {
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4106.build());
                return this;
            }
            ensureDefaultsIsMutable();
            this.defaults_.set(i, c4106.build());
            onChanged();
            return this;
        }

        public C4107 setMaximumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            descriptorProtos$Edition.getClass();
            this.bitField0_ |= 4;
            this.maximumEdition_ = descriptorProtos$Edition.getNumber();
            onChanged();
            return this;
        }

        public C4107 setMinimumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            descriptorProtos$Edition.getClass();
            this.bitField0_ |= 2;
            this.minimumEdition_ = descriptorProtos$Edition.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$FeatureSetDefaults getDefaultInstanceForType() {
            return DescriptorProtos$FeatureSetDefaults.getDefaultInstance();
        }

        private C4107(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.defaults_ = Collections.EMPTY_LIST;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
        }

        public FeatureSetEditionDefault.C4106 addDefaultsBuilder(int i) {
            return (FeatureSetEditionDefault.C4106) internalGetDefaultsFieldBuilder().m8020(i, FeatureSetEditionDefault.getDefaultInstance());
        }

        public C4107 addDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 == null) {
                featureSetEditionDefault.getClass();
                ensureDefaultsIsMutable();
                this.defaults_.add(i, featureSetEditionDefault);
                onChanged();
                return this;
            }
            c4195.m8018(i, featureSetEditionDefault);
            return this;
        }

        public C4107 setDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 == null) {
                featureSetEditionDefault.getClass();
                ensureDefaultsIsMutable();
                this.defaults_.set(i, featureSetEditionDefault);
                onChanged();
                return this;
            }
            c4195.m8022(i, featureSetEditionDefault);
            return this;
        }

        public C4107 addDefaults(FeatureSetEditionDefault featureSetEditionDefault) {
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 == null) {
                featureSetEditionDefault.getClass();
                ensureDefaultsIsMutable();
                this.defaults_.add(featureSetEditionDefault);
                onChanged();
                return this;
            }
            c4195.m8017(featureSetEditionDefault);
            return this;
        }

        public C4107 addDefaults(int i, FeatureSetEditionDefault.C4106 c4106) {
            C4195 c4195 = this.defaultsBuilder_;
            if (c4195 == null) {
                ensureDefaultsIsMutable();
                this.defaults_.add(i, c4106.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4106.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4107 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$FeatureSetDefaults) {
                return mergeFrom((DescriptorProtos$FeatureSetDefaults) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4107 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                FeatureSetEditionDefault featureSetEditionDefault = (FeatureSetEditionDefault) abstractC4306.mo8274(FeatureSetEditionDefault.parser(), c4529);
                                C4195 c4195 = this.defaultsBuilder_;
                                if (c4195 == null) {
                                    ensureDefaultsIsMutable();
                                    this.defaults_.add(featureSetEditionDefault);
                                } else {
                                    c4195.m8017(featureSetEditionDefault);
                                }
                            } else if (iMo8264 == 32) {
                                int iMo8283 = abstractC4306.mo8283();
                                if (DescriptorProtos$Edition.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(4, iMo8283);
                                } else {
                                    this.minimumEdition_ = iMo8283;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo8264 != 40) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                int iMo82832 = abstractC4306.mo8283();
                                if (DescriptorProtos$Edition.forNumber(iMo82832) == null) {
                                    mergeUnknownVarintField(5, iMo82832);
                                } else {
                                    this.maximumEdition_ = iMo82832;
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$FeatureSetDefaults getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4107 newBuilderForType() {
        return newBuilder();
    }

    public static C4107 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteString byteString) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    private DescriptorProtos$FeatureSetDefaults(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$FeatureSetDefaults) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
