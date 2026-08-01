package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FeatureSet extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FeatureSet> implements InterfaceC3506 {
    private static final DescriptorProtos$FeatureSet DEFAULT_INSTANCE;
    public static final int DEFAULT_SYMBOL_VISIBILITY_FIELD_NUMBER = 8;
    public static final int ENFORCE_NAMING_STYLE_FIELD_NUMBER = 7;
    public static final int ENUM_TYPE_FIELD_NUMBER = 2;
    public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
    public static final int JSON_FORMAT_FIELD_NUMBER = 6;
    public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
    private static final InterfaceC3375 PARSER;
    public static final int REPEATED_FIELD_ENCODING_FIELD_NUMBER = 3;
    public static final int UTF8_VALIDATION_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private int defaultSymbolVisibility_;
    private int enforceNamingStyle_;
    private int enumType_;
    private int fieldPresence_;
    private int jsonFormat_;
    private byte memoizedIsInitialized;
    private int messageEncoding_;
    private int repeatedFieldEncoding_;
    private int utf8Validation_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSet");
        DEFAULT_INSTANCE = new DescriptorProtos$FeatureSet();
        PARSER = new C3568();
    }

    private DescriptorProtos$FeatureSet(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.fieldPresence_ = 0;
        this.enumType_ = 0;
        this.repeatedFieldEncoding_ = 0;
        this.utf8Validation_ = 0;
        this.messageEncoding_ = 0;
        this.jsonFormat_ = 0;
        this.enforceNamingStyle_ = 0;
        this.defaultSymbolVisibility_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static /* synthetic */ int access$32476(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet, int i) {
        int i2 = i | descriptorProtos$FeatureSet.bitField0_;
        descriptorProtos$FeatureSet.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$FeatureSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11468;
    }

    public static C3273 newBuilder(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FeatureSet);
    }

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$FeatureSet)) {
            return super.equals(obj);
        }
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = (DescriptorProtos$FeatureSet) obj;
        if (hasFieldPresence() != descriptorProtos$FeatureSet.hasFieldPresence()) {
            return false;
        }
        if ((hasFieldPresence() && this.fieldPresence_ != descriptorProtos$FeatureSet.fieldPresence_) || hasEnumType() != descriptorProtos$FeatureSet.hasEnumType()) {
            return false;
        }
        if ((hasEnumType() && this.enumType_ != descriptorProtos$FeatureSet.enumType_) || hasRepeatedFieldEncoding() != descriptorProtos$FeatureSet.hasRepeatedFieldEncoding()) {
            return false;
        }
        if ((hasRepeatedFieldEncoding() && this.repeatedFieldEncoding_ != descriptorProtos$FeatureSet.repeatedFieldEncoding_) || hasUtf8Validation() != descriptorProtos$FeatureSet.hasUtf8Validation()) {
            return false;
        }
        if ((hasUtf8Validation() && this.utf8Validation_ != descriptorProtos$FeatureSet.utf8Validation_) || hasMessageEncoding() != descriptorProtos$FeatureSet.hasMessageEncoding()) {
            return false;
        }
        if ((hasMessageEncoding() && this.messageEncoding_ != descriptorProtos$FeatureSet.messageEncoding_) || hasJsonFormat() != descriptorProtos$FeatureSet.hasJsonFormat()) {
            return false;
        }
        if ((hasJsonFormat() && this.jsonFormat_ != descriptorProtos$FeatureSet.jsonFormat_) || hasEnforceNamingStyle() != descriptorProtos$FeatureSet.hasEnforceNamingStyle()) {
            return false;
        }
        if ((!hasEnforceNamingStyle() || this.enforceNamingStyle_ == descriptorProtos$FeatureSet.enforceNamingStyle_) && hasDefaultSymbolVisibility() == descriptorProtos$FeatureSet.hasDefaultSymbolVisibility()) {
            return (!hasDefaultSymbolVisibility() || this.defaultSymbolVisibility_ == descriptorProtos$FeatureSet.defaultSymbolVisibility_) && getUnknownFields().equals(descriptorProtos$FeatureSet.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$FeatureSet.getExtensionFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
        VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibilityForNumber = VisibilityFeature.DefaultSymbolVisibility.forNumber(this.defaultSymbolVisibility_);
        return defaultSymbolVisibilityForNumber == null ? VisibilityFeature.DefaultSymbolVisibility.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN : defaultSymbolVisibilityForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11468;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public EnforceNamingStyle getEnforceNamingStyle() {
        EnforceNamingStyle enforceNamingStyleForNumber = EnforceNamingStyle.forNumber(this.enforceNamingStyle_);
        return enforceNamingStyleForNumber == null ? EnforceNamingStyle.ENFORCE_NAMING_STYLE_UNKNOWN : enforceNamingStyleForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public EnumType getEnumType() {
        EnumType enumTypeForNumber = EnumType.forNumber(this.enumType_);
        return enumTypeForNumber == null ? EnumType.ENUM_TYPE_UNKNOWN : enumTypeForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3506
    public FieldPresence getFieldPresence() {
        FieldPresence fieldPresenceForNumber = FieldPresence.forNumber(this.fieldPresence_);
        return fieldPresenceForNumber == null ? FieldPresence.FIELD_PRESENCE_UNKNOWN : fieldPresenceForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public JsonFormat getJsonFormat() {
        JsonFormat jsonFormatForNumber = JsonFormat.forNumber(this.jsonFormat_);
        return jsonFormatForNumber == null ? JsonFormat.JSON_FORMAT_UNKNOWN : jsonFormatForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public MessageEncoding getMessageEncoding() {
        MessageEncoding messageEncodingForNumber = MessageEncoding.forNumber(this.messageEncoding_);
        return messageEncodingForNumber == null ? MessageEncoding.MESSAGE_ENCODING_UNKNOWN : messageEncodingForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public RepeatedFieldEncoding getRepeatedFieldEncoding() {
        RepeatedFieldEncoding repeatedFieldEncodingForNumber = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
        return repeatedFieldEncodingForNumber == null ? RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN : repeatedFieldEncodingForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7632 = (this.bitField0_ & 1) != 0 ? AbstractC3462.m7632(1, this.fieldPresence_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7632 += AbstractC3462.m7632(2, this.enumType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7632 += AbstractC3462.m7632(3, this.repeatedFieldEncoding_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7632 += AbstractC3462.m7632(4, this.utf8Validation_);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM7632 += AbstractC3462.m7632(5, this.messageEncoding_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM7632 += AbstractC3462.m7632(6, this.jsonFormat_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM7632 += AbstractC3462.m7632(7, this.enforceNamingStyle_);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM7632 += AbstractC3462.m7632(8, this.defaultSymbolVisibility_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iM7632;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public Utf8Validation getUtf8Validation() {
        Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
        return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasDefaultSymbolVisibility() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasEnforceNamingStyle() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasEnumType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasFieldPresence() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasJsonFormat() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasMessageEncoding() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasRepeatedFieldEncoding() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3506
    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasFieldPresence()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + this.fieldPresence_;
        }
        if (hasEnumType()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + this.enumType_;
        }
        if (hasRepeatedFieldEncoding()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + this.repeatedFieldEncoding_;
        }
        if (hasUtf8Validation()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + this.utf8Validation_;
        }
        if (hasMessageEncoding()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 5, 53) + this.messageEncoding_;
        }
        if (hasJsonFormat()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 6, 53) + this.jsonFormat_;
        }
        if (hasEnforceNamingStyle()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 7, 53) + this.enforceNamingStyle_;
        }
        if (hasDefaultSymbolVisibility()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 8, 53) + this.defaultSymbolVisibility_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3533.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11469;
        c3619.m7827(DescriptorProtos$FeatureSet.class, C3273.class);
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
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3273 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3273(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3273 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3273() : new C3273().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7651(1, this.fieldPresence_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7651(2, this.enumType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7651(3, this.repeatedFieldEncoding_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3462.mo7651(4, this.utf8Validation_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3462.mo7651(5, this.messageEncoding_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3462.mo7651(6, this.jsonFormat_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC3462.mo7651(7, this.enforceNamingStyle_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC3462.mo7651(8, this.defaultSymbolVisibility_);
        }
        interfaceC3629NewExtensionSerializer.mo7828(10001, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class VisibilityFeature extends GeneratedMessage implements InterfaceC3520 {
        private static final VisibilityFeature DEFAULT_INSTANCE;
        private static final InterfaceC3375 PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "VisibilityFeature");
            DEFAULT_INSTANCE = new VisibilityFeature();
            PARSER = new C3517();
        }

        private VisibilityFeature(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VisibilityFeature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11456;
        }

        public static C3272 newBuilder(VisibilityFeature visibilityFeature) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(visibilityFeature);
        }

        public static VisibilityFeature parseDelimitedFrom(InputStream inputStream) {
            return (VisibilityFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VisibilityFeature parseFrom(ByteBuffer byteBuffer) {
            return (VisibilityFeature) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof VisibilityFeature) ? super.equals(obj) : getUnknownFields().equals(((VisibilityFeature) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11456;
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
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11455;
            c3619.m7827(VisibilityFeature.class, C3272.class);
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
        public C3272 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3272(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3272 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3272() : new C3272().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSet$VisibilityFeature$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3272 extends GeneratedMessage.AbstractC3305 implements InterfaceC3520 {
            public static final C3663 getDescriptor() {
                return AbstractC3670.f11456;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public VisibilityFeature build() {
                VisibilityFeature visibilityFeatureBuildPartial = buildPartial();
                if (visibilityFeatureBuildPartial.isInitialized()) {
                    return visibilityFeatureBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) visibilityFeatureBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public VisibilityFeature buildPartial() {
                VisibilityFeature visibilityFeature = new VisibilityFeature(this);
                onBuilt();
                return visibilityFeature;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11456;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11455;
                c3619.m7827(VisibilityFeature.class, C3272.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3272 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 == 0 || !super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
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

            private C3272() {
            }

            private C3272(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public VisibilityFeature getDefaultInstanceForType() {
                return VisibilityFeature.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3272 mo7342clear() {
                super.mo7342clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3272 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof VisibilityFeature) {
                    return mergeFrom((VisibilityFeature) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3272 mergeFrom(VisibilityFeature visibilityFeature) {
                if (visibilityFeature == VisibilityFeature.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(visibilityFeature.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public VisibilityFeature getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        private VisibilityFeature() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VisibilityFeature parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (VisibilityFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3272 newBuilderForType() {
            return newBuilder();
        }

        public static C3272 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VisibilityFeature parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (VisibilityFeature) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static VisibilityFeature parseFrom(ByteString byteString) {
            return (VisibilityFeature) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static VisibilityFeature parseFrom(ByteString byteString, C3697 c3697) {
            return (VisibilityFeature) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum DefaultSymbolVisibility implements InterfaceC3381 {
            DEFAULT_SYMBOL_VISIBILITY_UNKNOWN(0),
            EXPORT_ALL(1),
            EXPORT_TOP_LEVEL(2),
            LOCAL_ALL(3),
            STRICT(4);

            public static final int DEFAULT_SYMBOL_VISIBILITY_UNKNOWN_VALUE = 0;
            public static final int EXPORT_ALL_VALUE = 1;
            public static final int EXPORT_TOP_LEVEL_VALUE = 2;
            public static final int LOCAL_ALL_VALUE = 3;
            public static final int STRICT_VALUE = 4;
            private static final DefaultSymbolVisibility[] VALUES;
            private static final InterfaceC3398 internalValueMap;
            private final int value;

            static {
                AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "DefaultSymbolVisibility");
                internalValueMap = new C3516();
                VALUES = values();
            }

            DefaultSymbolVisibility(int i) {
                this.value = i;
            }

            public static DefaultSymbolVisibility forNumber(int i) {
                if (i == 0) {
                    return DEFAULT_SYMBOL_VISIBILITY_UNKNOWN;
                }
                if (i == 1) {
                    return EXPORT_ALL;
                }
                if (i == 2) {
                    return EXPORT_TOP_LEVEL;
                }
                if (i == 3) {
                    return LOCAL_ALL;
                }
                if (i != 4) {
                    return null;
                }
                return STRICT;
            }

            public static C3666 getDescriptor() {
                return VisibilityFeature.getDescriptor().f11377[0];
            }

            public static InterfaceC3398 internalGetValueMap() {
                return internalValueMap;
            }

            public static DefaultSymbolVisibility valueOf(C3664 c3664) {
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
            public static DefaultSymbolVisibility valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VisibilityFeature parseFrom(byte[] bArr) {
            return (VisibilityFeature) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static VisibilityFeature parseFrom(byte[] bArr, C3697 c3697) {
            return (VisibilityFeature) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static VisibilityFeature parseFrom(InputStream inputStream) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static VisibilityFeature parseFrom(InputStream inputStream, C3697 c3697) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static VisibilityFeature parseFrom(AbstractC3474 abstractC3474) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static VisibilityFeature parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3273 extends GeneratedMessage.AbstractC3304 implements InterfaceC3506 {
        private int bitField0_;
        private int defaultSymbolVisibility_;
        private int enforceNamingStyle_;
        private int enumType_;
        private int fieldPresence_;
        private int jsonFormat_;
        private int messageEncoding_;
        private int repeatedFieldEncoding_;
        private int utf8Validation_;

        private C3273() {
            this.fieldPresence_ = 0;
            this.enumType_ = 0;
            this.repeatedFieldEncoding_ = 0;
            this.utf8Validation_ = 0;
            this.messageEncoding_ = 0;
            this.jsonFormat_ = 0;
            this.enforceNamingStyle_ = 0;
            this.defaultSymbolVisibility_ = 0;
        }

        private void buildPartial0(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$FeatureSet.fieldPresence_ = this.fieldPresence_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$FeatureSet.enumType_ = this.enumType_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$FeatureSet.repeatedFieldEncoding_ = this.repeatedFieldEncoding_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                descriptorProtos$FeatureSet.utf8Validation_ = this.utf8Validation_;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                descriptorProtos$FeatureSet.messageEncoding_ = this.messageEncoding_;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                descriptorProtos$FeatureSet.jsonFormat_ = this.jsonFormat_;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                descriptorProtos$FeatureSet.enforceNamingStyle_ = this.enforceNamingStyle_;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                descriptorProtos$FeatureSet.defaultSymbolVisibility_ = this.defaultSymbolVisibility_;
                i |= 128;
            }
            DescriptorProtos$FeatureSet.access$32476(descriptorProtos$FeatureSet, i);
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11468;
        }

        public <Type> C3273 addExtension(C3616 c3616, Type type) {
            return (C3273) addExtension((AbstractC3579) c3616, type);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FeatureSet build() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSetBuildPartial = buildPartial();
            if (descriptorProtos$FeatureSetBuildPartial.isInitialized()) {
                return descriptorProtos$FeatureSetBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$FeatureSetBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FeatureSet buildPartial() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = new DescriptorProtos$FeatureSet(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FeatureSet);
            }
            onBuilt();
            return descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3273 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.fieldPresence_ = 0;
            this.enumType_ = 0;
            this.repeatedFieldEncoding_ = 0;
            this.utf8Validation_ = 0;
            this.messageEncoding_ = 0;
            this.jsonFormat_ = 0;
            this.enforceNamingStyle_ = 0;
            this.defaultSymbolVisibility_ = 0;
            return this;
        }

        public C3273 clearDefaultSymbolVisibility() {
            this.bitField0_ &= -129;
            this.defaultSymbolVisibility_ = 0;
            onChanged();
            return this;
        }

        public C3273 clearEnforceNamingStyle() {
            this.bitField0_ &= -65;
            this.enforceNamingStyle_ = 0;
            onChanged();
            return this;
        }

        public C3273 clearEnumType() {
            this.bitField0_ &= -3;
            this.enumType_ = 0;
            onChanged();
            return this;
        }

        public <Type> C3273 clearExtension(C3616 c3616) {
            return (C3273) clearExtension((AbstractC3579) c3616);
        }

        public C3273 clearFieldPresence() {
            this.bitField0_ &= -2;
            this.fieldPresence_ = 0;
            onChanged();
            return this;
        }

        public C3273 clearJsonFormat() {
            this.bitField0_ &= -33;
            this.jsonFormat_ = 0;
            onChanged();
            return this;
        }

        public C3273 clearMessageEncoding() {
            this.bitField0_ &= -17;
            this.messageEncoding_ = 0;
            onChanged();
            return this;
        }

        public C3273 clearRepeatedFieldEncoding() {
            this.bitField0_ &= -5;
            this.repeatedFieldEncoding_ = 0;
            onChanged();
            return this;
        }

        public C3273 clearUtf8Validation() {
            this.bitField0_ &= -9;
            this.utf8Validation_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
            VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibilityForNumber = VisibilityFeature.DefaultSymbolVisibility.forNumber(this.defaultSymbolVisibility_);
            return defaultSymbolVisibilityForNumber == null ? VisibilityFeature.DefaultSymbolVisibility.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN : defaultSymbolVisibilityForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11468;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public EnforceNamingStyle getEnforceNamingStyle() {
            EnforceNamingStyle enforceNamingStyleForNumber = EnforceNamingStyle.forNumber(this.enforceNamingStyle_);
            return enforceNamingStyleForNumber == null ? EnforceNamingStyle.ENFORCE_NAMING_STYLE_UNKNOWN : enforceNamingStyleForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public EnumType getEnumType() {
            EnumType enumTypeForNumber = EnumType.forNumber(this.enumType_);
            return enumTypeForNumber == null ? EnumType.ENUM_TYPE_UNKNOWN : enumTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3506
        public FieldPresence getFieldPresence() {
            FieldPresence fieldPresenceForNumber = FieldPresence.forNumber(this.fieldPresence_);
            return fieldPresenceForNumber == null ? FieldPresence.FIELD_PRESENCE_UNKNOWN : fieldPresenceForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public JsonFormat getJsonFormat() {
            JsonFormat jsonFormatForNumber = JsonFormat.forNumber(this.jsonFormat_);
            return jsonFormatForNumber == null ? JsonFormat.JSON_FORMAT_UNKNOWN : jsonFormatForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public MessageEncoding getMessageEncoding() {
            MessageEncoding messageEncodingForNumber = MessageEncoding.forNumber(this.messageEncoding_);
            return messageEncodingForNumber == null ? MessageEncoding.MESSAGE_ENCODING_UNKNOWN : messageEncodingForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public RepeatedFieldEncoding getRepeatedFieldEncoding() {
            RepeatedFieldEncoding repeatedFieldEncodingForNumber = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
            return repeatedFieldEncodingForNumber == null ? RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN : repeatedFieldEncodingForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public Utf8Validation getUtf8Validation() {
            Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
            return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasDefaultSymbolVisibility() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasEnforceNamingStyle() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasEnumType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasFieldPresence() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasJsonFormat() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasMessageEncoding() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasRepeatedFieldEncoding() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3506
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11469;
            c3619.m7827(DescriptorProtos$FeatureSet.class, C3273.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return extensionsAreInitialized();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3273 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 8) {
                                int iMo7724 = abstractC3474.mo7724();
                                if (FieldPresence.forNumber(iMo7724) == null) {
                                    mergeUnknownVarintField(1, iMo7724);
                                } else {
                                    this.fieldPresence_ = iMo7724;
                                    this.bitField0_ |= 1;
                                }
                            } else if (iMo7705 == 16) {
                                int iMo77242 = abstractC3474.mo7724();
                                if (EnumType.forNumber(iMo77242) == null) {
                                    mergeUnknownVarintField(2, iMo77242);
                                } else {
                                    this.enumType_ = iMo77242;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo7705 == 24) {
                                int iMo77243 = abstractC3474.mo7724();
                                if (RepeatedFieldEncoding.forNumber(iMo77243) == null) {
                                    mergeUnknownVarintField(3, iMo77243);
                                } else {
                                    this.repeatedFieldEncoding_ = iMo77243;
                                    this.bitField0_ |= 4;
                                }
                            } else if (iMo7705 == 32) {
                                int iMo77244 = abstractC3474.mo7724();
                                if (Utf8Validation.forNumber(iMo77244) == null) {
                                    mergeUnknownVarintField(4, iMo77244);
                                } else {
                                    this.utf8Validation_ = iMo77244;
                                    this.bitField0_ |= 8;
                                }
                            } else if (iMo7705 == 40) {
                                int iMo77245 = abstractC3474.mo7724();
                                if (MessageEncoding.forNumber(iMo77245) == null) {
                                    mergeUnknownVarintField(5, iMo77245);
                                } else {
                                    this.messageEncoding_ = iMo77245;
                                    this.bitField0_ |= 16;
                                }
                            } else if (iMo7705 == 48) {
                                int iMo77246 = abstractC3474.mo7724();
                                if (JsonFormat.forNumber(iMo77246) == null) {
                                    mergeUnknownVarintField(6, iMo77246);
                                } else {
                                    this.jsonFormat_ = iMo77246;
                                    this.bitField0_ |= 32;
                                }
                            } else if (iMo7705 == 56) {
                                int iMo77247 = abstractC3474.mo7724();
                                if (EnforceNamingStyle.forNumber(iMo77247) == null) {
                                    mergeUnknownVarintField(7, iMo77247);
                                } else {
                                    this.enforceNamingStyle_ = iMo77247;
                                    this.bitField0_ |= 64;
                                }
                            } else if (iMo7705 == 64) {
                                int iMo77248 = abstractC3474.mo7724();
                                if (VisibilityFeature.DefaultSymbolVisibility.forNumber(iMo77248) == null) {
                                    mergeUnknownVarintField(8, iMo77248);
                                } else {
                                    this.defaultSymbolVisibility_ = iMo77248;
                                    this.bitField0_ |= 128;
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

        public C3273 setDefaultSymbolVisibility(VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibility) {
            defaultSymbolVisibility.getClass();
            this.bitField0_ |= 128;
            this.defaultSymbolVisibility_ = defaultSymbolVisibility.getNumber();
            onChanged();
            return this;
        }

        public C3273 setEnforceNamingStyle(EnforceNamingStyle enforceNamingStyle) {
            enforceNamingStyle.getClass();
            this.bitField0_ |= 64;
            this.enforceNamingStyle_ = enforceNamingStyle.getNumber();
            onChanged();
            return this;
        }

        public C3273 setEnumType(EnumType enumType) {
            enumType.getClass();
            this.bitField0_ |= 2;
            this.enumType_ = enumType.getNumber();
            onChanged();
            return this;
        }

        public <Type> C3273 setExtension(C3616 c3616, Type type) {
            return (C3273) setExtension((AbstractC3579) c3616, type);
        }

        public C3273 setFieldPresence(FieldPresence fieldPresence) {
            fieldPresence.getClass();
            this.bitField0_ |= 1;
            this.fieldPresence_ = fieldPresence.getNumber();
            onChanged();
            return this;
        }

        public C3273 setJsonFormat(JsonFormat jsonFormat) {
            jsonFormat.getClass();
            this.bitField0_ |= 32;
            this.jsonFormat_ = jsonFormat.getNumber();
            onChanged();
            return this;
        }

        public C3273 setMessageEncoding(MessageEncoding messageEncoding) {
            messageEncoding.getClass();
            this.bitField0_ |= 16;
            this.messageEncoding_ = messageEncoding.getNumber();
            onChanged();
            return this;
        }

        public C3273 setRepeatedFieldEncoding(RepeatedFieldEncoding repeatedFieldEncoding) {
            repeatedFieldEncoding.getClass();
            this.bitField0_ |= 4;
            this.repeatedFieldEncoding_ = repeatedFieldEncoding.getNumber();
            onChanged();
            return this;
        }

        public C3273 setUtf8Validation(Utf8Validation utf8Validation) {
            utf8Validation.getClass();
            this.bitField0_ |= 8;
            this.utf8Validation_ = utf8Validation.getNumber();
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
        public DescriptorProtos$FeatureSet getDefaultInstanceForType() {
            return DescriptorProtos$FeatureSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3273 setExtension(C3616 c3616, int i, Type type) {
            return (C3273) setExtension((AbstractC3579) c3616, i, type);
        }

        private C3273(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.fieldPresence_ = 0;
            this.enumType_ = 0;
            this.repeatedFieldEncoding_ = 0;
            this.utf8Validation_ = 0;
            this.messageEncoding_ = 0;
            this.jsonFormat_ = 0;
            this.enforceNamingStyle_ = 0;
            this.defaultSymbolVisibility_ = 0;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3273 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$FeatureSet) {
                return mergeFrom((DescriptorProtos$FeatureSet) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3273 mergeFrom(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            if (descriptorProtos$FeatureSet == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$FeatureSet.hasFieldPresence()) {
                setFieldPresence(descriptorProtos$FeatureSet.getFieldPresence());
            }
            if (descriptorProtos$FeatureSet.hasEnumType()) {
                setEnumType(descriptorProtos$FeatureSet.getEnumType());
            }
            if (descriptorProtos$FeatureSet.hasRepeatedFieldEncoding()) {
                setRepeatedFieldEncoding(descriptorProtos$FeatureSet.getRepeatedFieldEncoding());
            }
            if (descriptorProtos$FeatureSet.hasUtf8Validation()) {
                setUtf8Validation(descriptorProtos$FeatureSet.getUtf8Validation());
            }
            if (descriptorProtos$FeatureSet.hasMessageEncoding()) {
                setMessageEncoding(descriptorProtos$FeatureSet.getMessageEncoding());
            }
            if (descriptorProtos$FeatureSet.hasJsonFormat()) {
                setJsonFormat(descriptorProtos$FeatureSet.getJsonFormat());
            }
            if (descriptorProtos$FeatureSet.hasEnforceNamingStyle()) {
                setEnforceNamingStyle(descriptorProtos$FeatureSet.getEnforceNamingStyle());
            }
            if (descriptorProtos$FeatureSet.hasDefaultSymbolVisibility()) {
                setDefaultSymbolVisibility(descriptorProtos$FeatureSet.getDefaultSymbolVisibility());
            }
            mergeExtensionFields(descriptorProtos$FeatureSet);
            mergeUnknownFields(descriptorProtos$FeatureSet.getUnknownFields());
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
    public DescriptorProtos$FeatureSet getDefaultInstanceForType() {
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

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3273 newBuilderForType() {
        return newBuilder();
    }

    public static C3273 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteString byteString) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum EnforceNamingStyle implements InterfaceC3381 {
        ENFORCE_NAMING_STYLE_UNKNOWN(0),
        STYLE2024(1),
        STYLE_LEGACY(2);

        public static final int ENFORCE_NAMING_STYLE_UNKNOWN_VALUE = 0;
        public static final int STYLE2024_VALUE = 1;
        public static final int STYLE_LEGACY_VALUE = 2;
        private static final EnforceNamingStyle[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "EnforceNamingStyle");
            internalValueMap = new C3567();
            VALUES = values();
        }

        EnforceNamingStyle(int i) {
            this.value = i;
        }

        public static EnforceNamingStyle forNumber(int i) {
            if (i == 0) {
                return ENFORCE_NAMING_STYLE_UNKNOWN;
            }
            if (i == 1) {
                return STYLE2024;
            }
            if (i != 2) {
                return null;
            }
            return STYLE_LEGACY;
        }

        public static C3666 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11377[6];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static EnforceNamingStyle valueOf(C3664 c3664) {
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
        public static EnforceNamingStyle valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum EnumType implements InterfaceC3381 {
        ENUM_TYPE_UNKNOWN(0),
        OPEN(1),
        CLOSED(2);

        public static final int CLOSED_VALUE = 2;
        public static final int ENUM_TYPE_UNKNOWN_VALUE = 0;
        public static final int OPEN_VALUE = 1;
        private static final EnumType[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumType");
            internalValueMap = new C3563();
            VALUES = values();
        }

        EnumType(int i) {
            this.value = i;
        }

        public static EnumType forNumber(int i) {
            if (i == 0) {
                return ENUM_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i != 2) {
                return null;
            }
            return CLOSED;
        }

        public static C3666 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11377[1];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static EnumType valueOf(C3664 c3664) {
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
        public static EnumType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum FieldPresence implements InterfaceC3381 {
        FIELD_PRESENCE_UNKNOWN(0),
        EXPLICIT(1),
        IMPLICIT(2),
        LEGACY_REQUIRED(3);

        public static final int EXPLICIT_VALUE = 1;
        public static final int FIELD_PRESENCE_UNKNOWN_VALUE = 0;
        public static final int IMPLICIT_VALUE = 2;
        public static final int LEGACY_REQUIRED_VALUE = 3;
        private static final FieldPresence[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldPresence");
            internalValueMap = new C3564();
            VALUES = values();
        }

        FieldPresence(int i) {
            this.value = i;
        }

        public static FieldPresence forNumber(int i) {
            if (i == 0) {
                return FIELD_PRESENCE_UNKNOWN;
            }
            if (i == 1) {
                return EXPLICIT;
            }
            if (i == 2) {
                return IMPLICIT;
            }
            if (i != 3) {
                return null;
            }
            return LEGACY_REQUIRED;
        }

        public static C3666 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11377[0];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static FieldPresence valueOf(C3664 c3664) {
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
        public static FieldPresence valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum JsonFormat implements InterfaceC3381 {
        JSON_FORMAT_UNKNOWN(0),
        ALLOW(1),
        LEGACY_BEST_EFFORT(2);

        public static final int ALLOW_VALUE = 1;
        public static final int JSON_FORMAT_UNKNOWN_VALUE = 0;
        public static final int LEGACY_BEST_EFFORT_VALUE = 2;
        private static final JsonFormat[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "JsonFormat");
            internalValueMap = new C3560();
            VALUES = values();
        }

        JsonFormat(int i) {
            this.value = i;
        }

        public static JsonFormat forNumber(int i) {
            if (i == 0) {
                return JSON_FORMAT_UNKNOWN;
            }
            if (i == 1) {
                return ALLOW;
            }
            if (i != 2) {
                return null;
            }
            return LEGACY_BEST_EFFORT;
        }

        public static C3666 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11377[5];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static JsonFormat valueOf(C3664 c3664) {
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
        public static JsonFormat valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum MessageEncoding implements InterfaceC3381 {
        MESSAGE_ENCODING_UNKNOWN(0),
        LENGTH_PREFIXED(1),
        DELIMITED(2);

        public static final int DELIMITED_VALUE = 2;
        public static final int LENGTH_PREFIXED_VALUE = 1;
        public static final int MESSAGE_ENCODING_UNKNOWN_VALUE = 0;
        private static final MessageEncoding[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "MessageEncoding");
            internalValueMap = new C3559();
            VALUES = values();
        }

        MessageEncoding(int i) {
            this.value = i;
        }

        public static MessageEncoding forNumber(int i) {
            if (i == 0) {
                return MESSAGE_ENCODING_UNKNOWN;
            }
            if (i == 1) {
                return LENGTH_PREFIXED;
            }
            if (i != 2) {
                return null;
            }
            return DELIMITED;
        }

        public static C3666 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11377[4];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static MessageEncoding valueOf(C3664 c3664) {
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
        public static MessageEncoding valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum RepeatedFieldEncoding implements InterfaceC3381 {
        REPEATED_FIELD_ENCODING_UNKNOWN(0),
        PACKED(1),
        EXPANDED(2);

        public static final int EXPANDED_VALUE = 2;
        public static final int PACKED_VALUE = 1;
        public static final int REPEATED_FIELD_ENCODING_UNKNOWN_VALUE = 0;
        private static final RepeatedFieldEncoding[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "RepeatedFieldEncoding");
            internalValueMap = new C3562();
            VALUES = values();
        }

        RepeatedFieldEncoding(int i) {
            this.value = i;
        }

        public static RepeatedFieldEncoding forNumber(int i) {
            if (i == 0) {
                return REPEATED_FIELD_ENCODING_UNKNOWN;
            }
            if (i == 1) {
                return PACKED;
            }
            if (i != 2) {
                return null;
            }
            return EXPANDED;
        }

        public static C3666 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11377[2];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static RepeatedFieldEncoding valueOf(C3664 c3664) {
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
        public static RepeatedFieldEncoding valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Utf8Validation implements InterfaceC3381 {
        UTF8_VALIDATION_UNKNOWN(0),
        VERIFY(2),
        NONE(3);

        public static final int NONE_VALUE = 3;
        public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
        private static final Utf8Validation[] VALUES;
        public static final int VERIFY_VALUE = 2;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Utf8Validation");
            internalValueMap = new C3561();
            VALUES = values();
        }

        Utf8Validation(int i) {
            this.value = i;
        }

        public static Utf8Validation forNumber(int i) {
            if (i == 0) {
                return UTF8_VALIDATION_UNKNOWN;
            }
            if (i == 2) {
                return VERIFY;
            }
            if (i != 3) {
                return null;
            }
            return NONE;
        }

        public static C3666 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11377[3];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static Utf8Validation valueOf(C3664 c3664) {
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
        public static Utf8Validation valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    private DescriptorProtos$FeatureSet() {
        this.memoizedIsInitialized = (byte) -1;
        this.fieldPresence_ = 0;
        this.enumType_ = 0;
        this.repeatedFieldEncoding_ = 0;
        this.utf8Validation_ = 0;
        this.messageEncoding_ = 0;
        this.jsonFormat_ = 0;
        this.enforceNamingStyle_ = 0;
        this.defaultSymbolVisibility_ = 0;
    }

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$FeatureSet parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$FeatureSet parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
