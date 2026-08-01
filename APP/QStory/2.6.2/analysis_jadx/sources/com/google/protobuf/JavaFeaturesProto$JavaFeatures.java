package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class JavaFeaturesProto$JavaFeatures extends GeneratedMessage implements InterfaceC3385 {
    private static final JavaFeaturesProto$JavaFeatures DEFAULT_INSTANCE;
    public static final int LARGE_ENUM_FIELD_NUMBER = 3;
    public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
    public static final int NEST_IN_FILE_CLASS_FIELD_NUMBER = 5;
    private static final InterfaceC3374 PARSER;
    public static final int USE_OLD_OUTER_CLASSNAME_DEFAULT_FIELD_NUMBER = 4;
    public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private boolean largeEnum_;
    private boolean legacyClosedEnum_;
    private byte memoizedIsInitialized;
    private int nestInFileClass_;
    private boolean useOldOuterClassnameDefault_;
    private int utf8Validation_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "JavaFeatures");
        DEFAULT_INSTANCE = new JavaFeaturesProto$JavaFeatures();
        PARSER = new C3390();
    }

    private JavaFeaturesProto$JavaFeatures(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.legacyClosedEnum_ = false;
        this.utf8Validation_ = 0;
        this.largeEnum_ = false;
        this.useOldOuterClassnameDefault_ = false;
        this.nestInFileClass_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static /* synthetic */ int access$1576(JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures, int i) {
        int i2 = i | javaFeaturesProto$JavaFeatures.bitField0_;
        javaFeaturesProto$JavaFeatures.bitField0_ = i2;
        return i2;
    }

    public static JavaFeaturesProto$JavaFeatures getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3384.f11037;
    }

    public static C3311 newBuilder(JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(javaFeaturesProto$JavaFeatures);
    }

    public static JavaFeaturesProto$JavaFeatures parseDelimitedFrom(InputStream inputStream) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteBuffer byteBuffer) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JavaFeaturesProto$JavaFeatures)) {
            return super.equals(obj);
        }
        JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures = (JavaFeaturesProto$JavaFeatures) obj;
        if (hasLegacyClosedEnum() != javaFeaturesProto$JavaFeatures.hasLegacyClosedEnum()) {
            return false;
        }
        if ((hasLegacyClosedEnum() && getLegacyClosedEnum() != javaFeaturesProto$JavaFeatures.getLegacyClosedEnum()) || hasUtf8Validation() != javaFeaturesProto$JavaFeatures.hasUtf8Validation()) {
            return false;
        }
        if ((hasUtf8Validation() && this.utf8Validation_ != javaFeaturesProto$JavaFeatures.utf8Validation_) || hasLargeEnum() != javaFeaturesProto$JavaFeatures.hasLargeEnum()) {
            return false;
        }
        if ((hasLargeEnum() && getLargeEnum() != javaFeaturesProto$JavaFeatures.getLargeEnum()) || hasUseOldOuterClassnameDefault() != javaFeaturesProto$JavaFeatures.hasUseOldOuterClassnameDefault()) {
            return false;
        }
        if ((!hasUseOldOuterClassnameDefault() || getUseOldOuterClassnameDefault() == javaFeaturesProto$JavaFeatures.getUseOldOuterClassnameDefault()) && hasNestInFileClass() == javaFeaturesProto$JavaFeatures.hasNestInFileClass()) {
            return (!hasNestInFileClass() || this.nestInFileClass_ == javaFeaturesProto$JavaFeatures.nestInFileClass_) && getUnknownFields().equals(javaFeaturesProto$JavaFeatures.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3384.f11037;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public boolean getLargeEnum() {
        return this.largeEnum_;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public boolean getLegacyClosedEnum() {
        return this.legacyClosedEnum_;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public NestInFileClassFeature.NestInFileClass getNestInFileClass() {
        NestInFileClassFeature.NestInFileClass nestInFileClassForNumber = NestInFileClassFeature.NestInFileClass.forNumber(this.nestInFileClass_);
        return nestInFileClassForNumber == null ? NestInFileClassFeature.NestInFileClass.NEST_IN_FILE_CLASS_UNKNOWN : nestInFileClassForNumber;
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
        int iM7647 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7647(1) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7647 += AbstractC3461.m7645(2, this.utf8Validation_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7647 += AbstractC3461.m7647(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7647 += AbstractC3461.m7647(4);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM7647 += AbstractC3461.m7645(5, this.nestInFileClass_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7647;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public boolean getUseOldOuterClassnameDefault() {
        return this.useOldOuterClassnameDefault_;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public Utf8Validation getUtf8Validation() {
        Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
        return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public boolean hasLargeEnum() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public boolean hasLegacyClosedEnum() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public boolean hasNestInFileClass() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public boolean hasUseOldOuterClassnameDefault() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3385
    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasLegacyClosedEnum()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + AbstractC3401.m7516(getLegacyClosedEnum());
        }
        if (hasUtf8Validation()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + this.utf8Validation_;
        }
        if (hasLargeEnum()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + AbstractC3401.m7516(getLargeEnum());
        }
        if (hasUseOldOuterClassnameDefault()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + AbstractC3401.m7516(getUseOldOuterClassnameDefault());
        }
        if (hasNestInFileClass()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + this.nestInFileClass_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3384.f11036;
        c3618.m7840(JavaFeaturesProto$JavaFeatures.class, C3311.class);
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
    public C3311 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3311(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3311 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3311() : new C3311().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7676(1, this.legacyClosedEnum_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7664(2, this.utf8Validation_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7676(3, this.largeEnum_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3461.mo7676(4, this.useOldOuterClassnameDefault_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3461.mo7664(5, this.nestInFileClass_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class NestInFileClassFeature extends GeneratedMessage implements InterfaceC3388 {
        private static final NestInFileClassFeature DEFAULT_INSTANCE;
        private static final InterfaceC3374 PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "NestInFileClassFeature");
            DEFAULT_INSTANCE = new NestInFileClassFeature();
            PARSER = new C3393();
        }

        private NestInFileClassFeature(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NestInFileClassFeature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C3662 getDescriptor() {
            return AbstractC3384.f11035;
        }

        public static C3310 newBuilder(NestInFileClassFeature nestInFileClassFeature) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(nestInFileClassFeature);
        }

        public static NestInFileClassFeature parseDelimitedFrom(InputStream inputStream) {
            return (NestInFileClassFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NestInFileClassFeature parseFrom(ByteBuffer byteBuffer) {
            return (NestInFileClassFeature) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof NestInFileClassFeature) ? super.equals(obj) : getUnknownFields().equals(((NestInFileClassFeature) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3384.f11035;
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
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3384.f11034;
            c3618.m7840(NestInFileClassFeature.class, C3310.class);
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
        public C3310 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3310(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3310 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3310() : new C3310().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3310 extends GeneratedMessage.AbstractC3304 implements InterfaceC3388 {
            public static final C3662 getDescriptor() {
                return AbstractC3384.f11035;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public NestInFileClassFeature build() {
                NestInFileClassFeature nestInFileClassFeatureBuildPartial = buildPartial();
                if (nestInFileClassFeatureBuildPartial.isInitialized()) {
                    return nestInFileClassFeatureBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) nestInFileClassFeatureBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public NestInFileClassFeature buildPartial() {
                NestInFileClassFeature nestInFileClassFeature = new NestInFileClassFeature(this);
                onBuilt();
                return nestInFileClassFeature;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3384.f11035;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3384.f11034;
                c3618.m7840(NestInFileClassFeature.class, C3310.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3310 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 == 0 || !super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                z = true;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            private C3310() {
            }

            private C3310(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public NestInFileClassFeature getDefaultInstanceForType() {
                return NestInFileClassFeature.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3310 mo7355clear() {
                super.mo7355clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3310 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof NestInFileClassFeature) {
                    return mergeFrom((NestInFileClassFeature) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3310 mergeFrom(NestInFileClassFeature nestInFileClassFeature) {
                if (nestInFileClassFeature == NestInFileClassFeature.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(nestInFileClassFeature.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public NestInFileClassFeature getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        private NestInFileClassFeature() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NestInFileClassFeature parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (NestInFileClassFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3310 newBuilderForType() {
            return newBuilder();
        }

        public static C3310 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NestInFileClassFeature parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (NestInFileClassFeature) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static NestInFileClassFeature parseFrom(ByteString byteString) {
            return (NestInFileClassFeature) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static NestInFileClassFeature parseFrom(ByteString byteString, C3696 c3696) {
            return (NestInFileClassFeature) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public enum NestInFileClass implements InterfaceC3380 {
            NEST_IN_FILE_CLASS_UNKNOWN(0),
            NO(1),
            YES(2),
            LEGACY(3);

            public static final int LEGACY_VALUE = 3;
            public static final int NEST_IN_FILE_CLASS_UNKNOWN_VALUE = 0;
            public static final int NO_VALUE = 1;
            private static final NestInFileClass[] VALUES;
            public static final int YES_VALUE = 2;
            private static final InterfaceC3397 internalValueMap;
            private final int value;

            static {
                AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "NestInFileClass");
                internalValueMap = new C3392();
                VALUES = values();
            }

            NestInFileClass(int i) {
                this.value = i;
            }

            public static NestInFileClass forNumber(int i) {
                if (i == 0) {
                    return NEST_IN_FILE_CLASS_UNKNOWN;
                }
                if (i == 1) {
                    return NO;
                }
                if (i == 2) {
                    return YES;
                }
                if (i != 3) {
                    return null;
                }
                return LEGACY;
            }

            public static C3665 getDescriptor() {
                return NestInFileClassFeature.getDescriptor().f11372[0];
            }

            public static InterfaceC3397 internalGetValueMap() {
                return internalValueMap;
            }

            public static NestInFileClass valueOf(C3663 c3663) {
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
            public static NestInFileClass valueOf(int i) {
                return forNumber(i);
            }
        }

        public static NestInFileClassFeature parseFrom(byte[] bArr) {
            return (NestInFileClassFeature) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static NestInFileClassFeature parseFrom(byte[] bArr, C3696 c3696) {
            return (NestInFileClassFeature) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static NestInFileClassFeature parseFrom(InputStream inputStream) {
            return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static NestInFileClassFeature parseFrom(InputStream inputStream, C3696 c3696) {
            return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static NestInFileClassFeature parseFrom(AbstractC3473 abstractC3473) {
            return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static NestInFileClassFeature parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3311 extends GeneratedMessage.AbstractC3304 implements InterfaceC3385 {
        private int bitField0_;
        private boolean largeEnum_;
        private boolean legacyClosedEnum_;
        private int nestInFileClass_;
        private boolean useOldOuterClassnameDefault_;
        private int utf8Validation_;

        private C3311() {
            this.utf8Validation_ = 0;
            this.nestInFileClass_ = 0;
        }

        private void buildPartial0(JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                javaFeaturesProto$JavaFeatures.legacyClosedEnum_ = this.legacyClosedEnum_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                javaFeaturesProto$JavaFeatures.utf8Validation_ = this.utf8Validation_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                javaFeaturesProto$JavaFeatures.largeEnum_ = this.largeEnum_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                javaFeaturesProto$JavaFeatures.useOldOuterClassnameDefault_ = this.useOldOuterClassnameDefault_;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                javaFeaturesProto$JavaFeatures.nestInFileClass_ = this.nestInFileClass_;
                i |= 16;
            }
            JavaFeaturesProto$JavaFeatures.access$1576(javaFeaturesProto$JavaFeatures, i);
        }

        public static final C3662 getDescriptor() {
            return AbstractC3384.f11037;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public JavaFeaturesProto$JavaFeatures build() {
            JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeaturesBuildPartial = buildPartial();
            if (javaFeaturesProto$JavaFeaturesBuildPartial.isInitialized()) {
                return javaFeaturesProto$JavaFeaturesBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) javaFeaturesProto$JavaFeaturesBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public JavaFeaturesProto$JavaFeatures buildPartial() {
            JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures = new JavaFeaturesProto$JavaFeatures(this);
            if (this.bitField0_ != 0) {
                buildPartial0(javaFeaturesProto$JavaFeatures);
            }
            onBuilt();
            return javaFeaturesProto$JavaFeatures;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3311 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.legacyClosedEnum_ = false;
            this.utf8Validation_ = 0;
            this.largeEnum_ = false;
            this.useOldOuterClassnameDefault_ = false;
            this.nestInFileClass_ = 0;
            return this;
        }

        public C3311 clearLargeEnum() {
            this.bitField0_ &= -5;
            this.largeEnum_ = false;
            onChanged();
            return this;
        }

        public C3311 clearLegacyClosedEnum() {
            this.bitField0_ &= -2;
            this.legacyClosedEnum_ = false;
            onChanged();
            return this;
        }

        public C3311 clearNestInFileClass() {
            this.bitField0_ &= -17;
            this.nestInFileClass_ = 0;
            onChanged();
            return this;
        }

        public C3311 clearUseOldOuterClassnameDefault() {
            this.bitField0_ &= -9;
            this.useOldOuterClassnameDefault_ = false;
            onChanged();
            return this;
        }

        public C3311 clearUtf8Validation() {
            this.bitField0_ &= -3;
            this.utf8Validation_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3384.f11037;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public boolean getLargeEnum() {
            return this.largeEnum_;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public boolean getLegacyClosedEnum() {
            return this.legacyClosedEnum_;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public NestInFileClassFeature.NestInFileClass getNestInFileClass() {
            NestInFileClassFeature.NestInFileClass nestInFileClassForNumber = NestInFileClassFeature.NestInFileClass.forNumber(this.nestInFileClass_);
            return nestInFileClassForNumber == null ? NestInFileClassFeature.NestInFileClass.NEST_IN_FILE_CLASS_UNKNOWN : nestInFileClassForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public boolean getUseOldOuterClassnameDefault() {
            return this.useOldOuterClassnameDefault_;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public Utf8Validation getUtf8Validation() {
            Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
            return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public boolean hasLargeEnum() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public boolean hasLegacyClosedEnum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public boolean hasNestInFileClass() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public boolean hasUseOldOuterClassnameDefault() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3385
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3384.f11036;
            c3618.m7840(JavaFeaturesProto$JavaFeatures.class, C3311.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3311 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 8) {
                                this.legacyClosedEnum_ = abstractC3473.mo7733();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 16) {
                                int iMo7737 = abstractC3473.mo7737();
                                if (Utf8Validation.forNumber(iMo7737) == null) {
                                    mergeUnknownVarintField(2, iMo7737);
                                } else {
                                    this.utf8Validation_ = iMo7737;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo7718 == 24) {
                                this.largeEnum_ = abstractC3473.mo7733();
                                this.bitField0_ |= 4;
                            } else if (iMo7718 == 32) {
                                this.useOldOuterClassnameDefault_ = abstractC3473.mo7733();
                                this.bitField0_ |= 8;
                            } else if (iMo7718 == 40) {
                                int iMo77372 = abstractC3473.mo7737();
                                if (NestInFileClassFeature.NestInFileClass.forNumber(iMo77372) == null) {
                                    mergeUnknownVarintField(5, iMo77372);
                                } else {
                                    this.nestInFileClass_ = iMo77372;
                                    this.bitField0_ |= 16;
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

        public C3311 setLargeEnum(boolean z) {
            this.largeEnum_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3311 setLegacyClosedEnum(boolean z) {
            this.legacyClosedEnum_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3311 setNestInFileClass(NestInFileClassFeature.NestInFileClass nestInFileClass) {
            nestInFileClass.getClass();
            this.bitField0_ |= 16;
            this.nestInFileClass_ = nestInFileClass.getNumber();
            onChanged();
            return this;
        }

        public C3311 setUseOldOuterClassnameDefault(boolean z) {
            this.useOldOuterClassnameDefault_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3311 setUtf8Validation(Utf8Validation utf8Validation) {
            utf8Validation.getClass();
            this.bitField0_ |= 2;
            this.utf8Validation_ = utf8Validation.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public JavaFeaturesProto$JavaFeatures getDefaultInstanceForType() {
            return JavaFeaturesProto$JavaFeatures.getDefaultInstance();
        }

        private C3311(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.utf8Validation_ = 0;
            this.nestInFileClass_ = 0;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3311 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof JavaFeaturesProto$JavaFeatures) {
                return mergeFrom((JavaFeaturesProto$JavaFeatures) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3311 mergeFrom(JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures) {
            if (javaFeaturesProto$JavaFeatures == JavaFeaturesProto$JavaFeatures.getDefaultInstance()) {
                return this;
            }
            if (javaFeaturesProto$JavaFeatures.hasLegacyClosedEnum()) {
                setLegacyClosedEnum(javaFeaturesProto$JavaFeatures.getLegacyClosedEnum());
            }
            if (javaFeaturesProto$JavaFeatures.hasUtf8Validation()) {
                setUtf8Validation(javaFeaturesProto$JavaFeatures.getUtf8Validation());
            }
            if (javaFeaturesProto$JavaFeatures.hasLargeEnum()) {
                setLargeEnum(javaFeaturesProto$JavaFeatures.getLargeEnum());
            }
            if (javaFeaturesProto$JavaFeatures.hasUseOldOuterClassnameDefault()) {
                setUseOldOuterClassnameDefault(javaFeaturesProto$JavaFeatures.getUseOldOuterClassnameDefault());
            }
            if (javaFeaturesProto$JavaFeatures.hasNestInFileClass()) {
                setNestInFileClass(javaFeaturesProto$JavaFeatures.getNestInFileClass());
            }
            mergeUnknownFields(javaFeaturesProto$JavaFeatures.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public JavaFeaturesProto$JavaFeatures getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static JavaFeaturesProto$JavaFeatures parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3311 newBuilderForType() {
        return newBuilder();
    }

    public static C3311 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteString byteString) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    private JavaFeaturesProto$JavaFeatures() {
        this.legacyClosedEnum_ = false;
        this.largeEnum_ = false;
        this.useOldOuterClassnameDefault_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.utf8Validation_ = 0;
        this.nestInFileClass_ = 0;
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteString byteString, C3696 c3696) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Utf8Validation implements InterfaceC3380 {
        UTF8_VALIDATION_UNKNOWN(0),
        DEFAULT(1),
        VERIFY(2);

        public static final int DEFAULT_VALUE = 1;
        public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
        private static final Utf8Validation[] VALUES;
        public static final int VERIFY_VALUE = 2;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Utf8Validation");
            internalValueMap = new C3389();
            VALUES = values();
        }

        Utf8Validation(int i) {
            this.value = i;
        }

        public static Utf8Validation forNumber(int i) {
            if (i == 0) {
                return UTF8_VALIDATION_UNKNOWN;
            }
            if (i == 1) {
                return DEFAULT;
            }
            if (i != 2) {
                return null;
            }
            return VERIFY;
        }

        public static C3665 getDescriptor() {
            return JavaFeaturesProto$JavaFeatures.getDescriptor().f11372[0];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static Utf8Validation valueOf(C3663 c3663) {
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
        public static Utf8Validation valueOf(int i) {
            return forNumber(i);
        }
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(byte[] bArr) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(byte[] bArr, C3696 c3696) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(InputStream inputStream) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(InputStream inputStream, C3696 c3696) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(AbstractC3473 abstractC3473) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
