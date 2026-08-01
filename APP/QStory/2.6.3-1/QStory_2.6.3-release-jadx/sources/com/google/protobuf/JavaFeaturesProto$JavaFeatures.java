package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class JavaFeaturesProto$JavaFeatures extends GeneratedMessage implements InterfaceC4218 {
    private static final JavaFeaturesProto$JavaFeatures DEFAULT_INSTANCE;
    public static final int LARGE_ENUM_FIELD_NUMBER = 3;
    public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
    public static final int NEST_IN_FILE_CLASS_FIELD_NUMBER = 5;
    private static final InterfaceC4207 PARSER;
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
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "JavaFeatures");
        DEFAULT_INSTANCE = new JavaFeaturesProto$JavaFeatures();
        PARSER = new C4223();
    }

    private JavaFeaturesProto$JavaFeatures(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
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

    public static final C4495 getDescriptor() {
        return AbstractC4217.f11387;
    }

    public static C4144 newBuilder(JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(javaFeaturesProto$JavaFeatures);
    }

    public static JavaFeaturesProto$JavaFeatures parseDelimitedFrom(InputStream inputStream) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteBuffer byteBuffer) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4217.f11387;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public boolean getLargeEnum() {
        return this.largeEnum_;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public boolean getLegacyClosedEnum() {
        return this.legacyClosedEnum_;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public NestInFileClassFeature.NestInFileClass getNestInFileClass() {
        NestInFileClassFeature.NestInFileClass nestInFileClassForNumber = NestInFileClassFeature.NestInFileClass.forNumber(this.nestInFileClass_);
        return nestInFileClassForNumber == null ? NestInFileClassFeature.NestInFileClass.NEST_IN_FILE_CLASS_UNKNOWN : nestInFileClassForNumber;
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
            iM8193 += AbstractC4294.m8191(2, this.utf8Validation_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM8193 += AbstractC4294.m8193(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM8193 += AbstractC4294.m8193(4);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM8193 += AbstractC4294.m8191(5, this.nestInFileClass_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM8193;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public boolean getUseOldOuterClassnameDefault() {
        return this.useOldOuterClassnameDefault_;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public Utf8Validation getUtf8Validation() {
        Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
        return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public boolean hasLargeEnum() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public boolean hasLegacyClosedEnum() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public boolean hasNestInFileClass() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public boolean hasUseOldOuterClassnameDefault() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4218
    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasLegacyClosedEnum()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + AbstractC4234.m8062(getLegacyClosedEnum());
        }
        if (hasUtf8Validation()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + this.utf8Validation_;
        }
        if (hasLargeEnum()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + AbstractC4234.m8062(getLargeEnum());
        }
        if (hasUseOldOuterClassnameDefault()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + AbstractC4234.m8062(getUseOldOuterClassnameDefault());
        }
        if (hasNestInFileClass()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + this.nestInFileClass_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4217.f11386;
        c4451.m8386(JavaFeaturesProto$JavaFeatures.class, C4144.class);
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
    public C4144 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4144(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4144 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4144() : new C4144().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8222(1, this.legacyClosedEnum_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8210(2, this.utf8Validation_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8222(3, this.largeEnum_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.mo8222(4, this.useOldOuterClassnameDefault_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC4294.mo8210(5, this.nestInFileClass_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class NestInFileClassFeature extends GeneratedMessage implements InterfaceC4221 {
        private static final NestInFileClassFeature DEFAULT_INSTANCE;
        private static final InterfaceC4207 PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "NestInFileClassFeature");
            DEFAULT_INSTANCE = new NestInFileClassFeature();
            PARSER = new C4226();
        }

        private NestInFileClassFeature(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NestInFileClassFeature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4217.f11385;
        }

        public static C4143 newBuilder(NestInFileClassFeature nestInFileClassFeature) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(nestInFileClassFeature);
        }

        public static NestInFileClassFeature parseDelimitedFrom(InputStream inputStream) {
            return (NestInFileClassFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NestInFileClassFeature parseFrom(ByteBuffer byteBuffer) {
            return (NestInFileClassFeature) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof NestInFileClassFeature) ? super.equals(obj) : getUnknownFields().equals(((NestInFileClassFeature) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4217.f11385;
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
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4217.f11384;
            c4451.m8386(NestInFileClassFeature.class, C4143.class);
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
        public C4143 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4143(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4143 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4143() : new C4143().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4143 extends GeneratedMessage.AbstractC4137 implements InterfaceC4221 {
            public static final C4495 getDescriptor() {
                return AbstractC4217.f11385;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public NestInFileClassFeature build() {
                NestInFileClassFeature nestInFileClassFeatureBuildPartial = buildPartial();
                if (nestInFileClassFeatureBuildPartial.isInitialized()) {
                    return nestInFileClassFeatureBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) nestInFileClassFeatureBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public NestInFileClassFeature buildPartial() {
                NestInFileClassFeature nestInFileClassFeature = new NestInFileClassFeature(this);
                onBuilt();
                return nestInFileClassFeature;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4217.f11385;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4217.f11384;
                c4451.m8386(NestInFileClassFeature.class, C4143.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4143 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 == 0 || !super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
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

            private C4143() {
            }

            private C4143(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public NestInFileClassFeature getDefaultInstanceForType() {
                return NestInFileClassFeature.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4143 mo7901clear() {
                super.mo7901clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4143 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof NestInFileClassFeature) {
                    return mergeFrom((NestInFileClassFeature) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4143 mergeFrom(NestInFileClassFeature nestInFileClassFeature) {
                if (nestInFileClassFeature == NestInFileClassFeature.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(nestInFileClassFeature.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public NestInFileClassFeature getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        private NestInFileClassFeature() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NestInFileClassFeature parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (NestInFileClassFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4143 newBuilderForType() {
            return newBuilder();
        }

        public static C4143 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NestInFileClassFeature parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (NestInFileClassFeature) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static NestInFileClassFeature parseFrom(ByteString byteString) {
            return (NestInFileClassFeature) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static NestInFileClassFeature parseFrom(ByteString byteString, C4529 c4529) {
            return (NestInFileClassFeature) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum NestInFileClass implements InterfaceC4213 {
            NEST_IN_FILE_CLASS_UNKNOWN(0),
            NO(1),
            YES(2),
            LEGACY(3);

            public static final int LEGACY_VALUE = 3;
            public static final int NEST_IN_FILE_CLASS_UNKNOWN_VALUE = 0;
            public static final int NO_VALUE = 1;
            private static final NestInFileClass[] VALUES;
            public static final int YES_VALUE = 2;
            private static final InterfaceC4230 internalValueMap;
            private final int value;

            static {
                AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "NestInFileClass");
                internalValueMap = new C4225();
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

            public static C4498 getDescriptor() {
                return NestInFileClassFeature.getDescriptor().f11722[0];
            }

            public static InterfaceC4230 internalGetValueMap() {
                return internalValueMap;
            }

            public static NestInFileClass valueOf(C4496 c4496) {
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
            public static NestInFileClass valueOf(int i) {
                return forNumber(i);
            }
        }

        public static NestInFileClassFeature parseFrom(byte[] bArr) {
            return (NestInFileClassFeature) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static NestInFileClassFeature parseFrom(byte[] bArr, C4529 c4529) {
            return (NestInFileClassFeature) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static NestInFileClassFeature parseFrom(InputStream inputStream) {
            return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static NestInFileClassFeature parseFrom(InputStream inputStream, C4529 c4529) {
            return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static NestInFileClassFeature parseFrom(AbstractC4306 abstractC4306) {
            return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static NestInFileClassFeature parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4144 extends GeneratedMessage.AbstractC4137 implements InterfaceC4218 {
        private int bitField0_;
        private boolean largeEnum_;
        private boolean legacyClosedEnum_;
        private int nestInFileClass_;
        private boolean useOldOuterClassnameDefault_;
        private int utf8Validation_;

        private C4144() {
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

        public static final C4495 getDescriptor() {
            return AbstractC4217.f11387;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public JavaFeaturesProto$JavaFeatures build() {
            JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeaturesBuildPartial = buildPartial();
            if (javaFeaturesProto$JavaFeaturesBuildPartial.isInitialized()) {
                return javaFeaturesProto$JavaFeaturesBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) javaFeaturesProto$JavaFeaturesBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public JavaFeaturesProto$JavaFeatures buildPartial() {
            JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures = new JavaFeaturesProto$JavaFeatures(this);
            if (this.bitField0_ != 0) {
                buildPartial0(javaFeaturesProto$JavaFeatures);
            }
            onBuilt();
            return javaFeaturesProto$JavaFeatures;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4144 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.legacyClosedEnum_ = false;
            this.utf8Validation_ = 0;
            this.largeEnum_ = false;
            this.useOldOuterClassnameDefault_ = false;
            this.nestInFileClass_ = 0;
            return this;
        }

        public C4144 clearLargeEnum() {
            this.bitField0_ &= -5;
            this.largeEnum_ = false;
            onChanged();
            return this;
        }

        public C4144 clearLegacyClosedEnum() {
            this.bitField0_ &= -2;
            this.legacyClosedEnum_ = false;
            onChanged();
            return this;
        }

        public C4144 clearNestInFileClass() {
            this.bitField0_ &= -17;
            this.nestInFileClass_ = 0;
            onChanged();
            return this;
        }

        public C4144 clearUseOldOuterClassnameDefault() {
            this.bitField0_ &= -9;
            this.useOldOuterClassnameDefault_ = false;
            onChanged();
            return this;
        }

        public C4144 clearUtf8Validation() {
            this.bitField0_ &= -3;
            this.utf8Validation_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4217.f11387;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public boolean getLargeEnum() {
            return this.largeEnum_;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public boolean getLegacyClosedEnum() {
            return this.legacyClosedEnum_;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public NestInFileClassFeature.NestInFileClass getNestInFileClass() {
            NestInFileClassFeature.NestInFileClass nestInFileClassForNumber = NestInFileClassFeature.NestInFileClass.forNumber(this.nestInFileClass_);
            return nestInFileClassForNumber == null ? NestInFileClassFeature.NestInFileClass.NEST_IN_FILE_CLASS_UNKNOWN : nestInFileClassForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public boolean getUseOldOuterClassnameDefault() {
            return this.useOldOuterClassnameDefault_;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public Utf8Validation getUtf8Validation() {
            Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
            return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public boolean hasLargeEnum() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public boolean hasLegacyClosedEnum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public boolean hasNestInFileClass() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public boolean hasUseOldOuterClassnameDefault() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4218
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4217.f11386;
            c4451.m8386(JavaFeaturesProto$JavaFeatures.class, C4144.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4144 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                this.legacyClosedEnum_ = abstractC4306.mo8279();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 16) {
                                int iMo8283 = abstractC4306.mo8283();
                                if (Utf8Validation.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(2, iMo8283);
                                } else {
                                    this.utf8Validation_ = iMo8283;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo8264 == 24) {
                                this.largeEnum_ = abstractC4306.mo8279();
                                this.bitField0_ |= 4;
                            } else if (iMo8264 == 32) {
                                this.useOldOuterClassnameDefault_ = abstractC4306.mo8279();
                                this.bitField0_ |= 8;
                            } else if (iMo8264 == 40) {
                                int iMo82832 = abstractC4306.mo8283();
                                if (NestInFileClassFeature.NestInFileClass.forNumber(iMo82832) == null) {
                                    mergeUnknownVarintField(5, iMo82832);
                                } else {
                                    this.nestInFileClass_ = iMo82832;
                                    this.bitField0_ |= 16;
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

        public C4144 setLargeEnum(boolean z) {
            this.largeEnum_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4144 setLegacyClosedEnum(boolean z) {
            this.legacyClosedEnum_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4144 setNestInFileClass(NestInFileClassFeature.NestInFileClass nestInFileClass) {
            nestInFileClass.getClass();
            this.bitField0_ |= 16;
            this.nestInFileClass_ = nestInFileClass.getNumber();
            onChanged();
            return this;
        }

        public C4144 setUseOldOuterClassnameDefault(boolean z) {
            this.useOldOuterClassnameDefault_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4144 setUtf8Validation(Utf8Validation utf8Validation) {
            utf8Validation.getClass();
            this.bitField0_ |= 2;
            this.utf8Validation_ = utf8Validation.getNumber();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public JavaFeaturesProto$JavaFeatures getDefaultInstanceForType() {
            return JavaFeaturesProto$JavaFeatures.getDefaultInstance();
        }

        private C4144(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.utf8Validation_ = 0;
            this.nestInFileClass_ = 0;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4144 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof JavaFeaturesProto$JavaFeatures) {
                return mergeFrom((JavaFeaturesProto$JavaFeatures) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4144 mergeFrom(JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public JavaFeaturesProto$JavaFeatures getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static JavaFeaturesProto$JavaFeatures parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4144 newBuilderForType() {
        return newBuilder();
    }

    public static C4144 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteString byteString) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    private JavaFeaturesProto$JavaFeatures() {
        this.legacyClosedEnum_ = false;
        this.largeEnum_ = false;
        this.useOldOuterClassnameDefault_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.utf8Validation_ = 0;
        this.nestInFileClass_ = 0;
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteString byteString, C4529 c4529) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Utf8Validation implements InterfaceC4213 {
        UTF8_VALIDATION_UNKNOWN(0),
        DEFAULT(1),
        VERIFY(2);

        public static final int DEFAULT_VALUE = 1;
        public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
        private static final Utf8Validation[] VALUES;
        public static final int VERIFY_VALUE = 2;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Utf8Validation");
            internalValueMap = new C4222();
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

        public static C4498 getDescriptor() {
            return JavaFeaturesProto$JavaFeatures.getDescriptor().f11722[0];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static Utf8Validation valueOf(C4496 c4496) {
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
        public static Utf8Validation valueOf(int i) {
            return forNumber(i);
        }
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(byte[] bArr) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(byte[] bArr, C4529 c4529) {
        return (JavaFeaturesProto$JavaFeatures) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(InputStream inputStream) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(InputStream inputStream, C4529 c4529) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(AbstractC4306 abstractC4306) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
