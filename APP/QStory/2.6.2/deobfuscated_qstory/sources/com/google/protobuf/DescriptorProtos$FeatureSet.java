package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FeatureSet extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FeatureSet> implements InterfaceC3505 {
    private static final DescriptorProtos$FeatureSet DEFAULT_INSTANCE;
    public static final int DEFAULT_SYMBOL_VISIBILITY_FIELD_NUMBER = 8;
    public static final int ENFORCE_NAMING_STYLE_FIELD_NUMBER = 7;
    public static final int ENUM_TYPE_FIELD_NUMBER = 2;
    public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
    public static final int JSON_FORMAT_FIELD_NUMBER = 6;
    public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
    private static final InterfaceC3374 PARSER;
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
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSet");
        DEFAULT_INSTANCE = new DescriptorProtos$FeatureSet();
        PARSER = new C3567();
    }

    private DescriptorProtos$FeatureSet(GeneratedMessage.AbstractC3303 abstractC3303) {
        super(abstractC3303);
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11463;
    }

    public static C3272 newBuilder(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FeatureSet);
    }

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.InterfaceC3505
    public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
        VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibilityForNumber = VisibilityFeature.DefaultSymbolVisibility.forNumber(this.defaultSymbolVisibility_);
        return defaultSymbolVisibilityForNumber == null ? VisibilityFeature.DefaultSymbolVisibility.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN : defaultSymbolVisibilityForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11463;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public EnforceNamingStyle getEnforceNamingStyle() {
        EnforceNamingStyle enforceNamingStyleForNumber = EnforceNamingStyle.forNumber(this.enforceNamingStyle_);
        return enforceNamingStyleForNumber == null ? EnforceNamingStyle.ENFORCE_NAMING_STYLE_UNKNOWN : enforceNamingStyleForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public EnumType getEnumType() {
        EnumType enumTypeForNumber = EnumType.forNumber(this.enumType_);
        return enumTypeForNumber == null ? EnumType.ENUM_TYPE_UNKNOWN : enumTypeForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
        return super.getExtension(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
        return super.getExtensionCount(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3505
    public FieldPresence getFieldPresence() {
        FieldPresence fieldPresenceForNumber = FieldPresence.forNumber(this.fieldPresence_);
        return fieldPresenceForNumber == null ? FieldPresence.FIELD_PRESENCE_UNKNOWN : fieldPresenceForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public JsonFormat getJsonFormat() {
        JsonFormat jsonFormatForNumber = JsonFormat.forNumber(this.jsonFormat_);
        return jsonFormatForNumber == null ? JsonFormat.JSON_FORMAT_UNKNOWN : jsonFormatForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public MessageEncoding getMessageEncoding() {
        MessageEncoding messageEncodingForNumber = MessageEncoding.forNumber(this.messageEncoding_);
        return messageEncodingForNumber == null ? MessageEncoding.MESSAGE_ENCODING_UNKNOWN : messageEncodingForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public RepeatedFieldEncoding getRepeatedFieldEncoding() {
        RepeatedFieldEncoding repeatedFieldEncodingForNumber = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
        return repeatedFieldEncodingForNumber == null ? RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN : repeatedFieldEncodingForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7645 = (this.bitField0_ & 1) != 0 ? AbstractC3461.m7645(1, this.fieldPresence_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM7645 += AbstractC3461.m7645(2, this.enumType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM7645 += AbstractC3461.m7645(3, this.repeatedFieldEncoding_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM7645 += AbstractC3461.m7645(4, this.utf8Validation_);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM7645 += AbstractC3461.m7645(5, this.messageEncoding_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM7645 += AbstractC3461.m7645(6, this.jsonFormat_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM7645 += AbstractC3461.m7645(7, this.enforceNamingStyle_);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM7645 += AbstractC3461.m7645(8, this.defaultSymbolVisibility_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iM7645;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public Utf8Validation getUtf8Validation() {
        Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
        return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public boolean hasDefaultSymbolVisibility() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public boolean hasEnforceNamingStyle() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public boolean hasEnumType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3505
    public boolean hasFieldPresence() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public boolean hasJsonFormat() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public boolean hasMessageEncoding() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public boolean hasRepeatedFieldEncoding() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3505
    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasFieldPresence()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + this.fieldPresence_;
        }
        if (hasEnumType()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + this.enumType_;
        }
        if (hasRepeatedFieldEncoding()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + this.repeatedFieldEncoding_;
        }
        if (hasUtf8Validation()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + this.utf8Validation_;
        }
        if (hasMessageEncoding()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + this.messageEncoding_;
        }
        if (hasJsonFormat()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 6, 53) + this.jsonFormat_;
        }
        if (hasEnforceNamingStyle()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 7, 53) + this.enforceNamingStyle_;
        }
        if (hasDefaultSymbolVisibility()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 8, 53) + this.defaultSymbolVisibility_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3532.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11464;
        c3618.m7840(DescriptorProtos$FeatureSet.class, C3272.class);
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
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC3532
    public C3272 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3272(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3272 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3272() : new C3272().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        InterfaceC3628 interfaceC3628NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7664(1, this.fieldPresence_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7664(2, this.enumType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7664(3, this.repeatedFieldEncoding_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3461.mo7664(4, this.utf8Validation_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3461.mo7664(5, this.messageEncoding_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3461.mo7664(6, this.jsonFormat_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC3461.mo7664(7, this.enforceNamingStyle_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC3461.mo7664(8, this.defaultSymbolVisibility_);
        }
        interfaceC3628NewExtensionSerializer.mo7841(10001, abstractC3461);
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class VisibilityFeature extends GeneratedMessage implements InterfaceC3519 {
        private static final VisibilityFeature DEFAULT_INSTANCE;
        private static final InterfaceC3374 PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "VisibilityFeature");
            DEFAULT_INSTANCE = new VisibilityFeature();
            PARSER = new C3516();
        }

        private VisibilityFeature(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VisibilityFeature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11451;
        }

        public static C3271 newBuilder(VisibilityFeature visibilityFeature) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(visibilityFeature);
        }

        public static VisibilityFeature parseDelimitedFrom(InputStream inputStream) {
            return (VisibilityFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VisibilityFeature parseFrom(ByteBuffer byteBuffer) {
            return (VisibilityFeature) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof VisibilityFeature) ? super.equals(obj) : getUnknownFields().equals(((VisibilityFeature) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11451;
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
            C3618 c3618 = AbstractC3669.f11450;
            c3618.m7840(VisibilityFeature.class, C3271.class);
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
        public C3271 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3271(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3271 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3271() : new C3271().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSet$VisibilityFeature$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3271 extends GeneratedMessage.AbstractC3304 implements InterfaceC3519 {
            public static final C3662 getDescriptor() {
                return AbstractC3669.f11451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public VisibilityFeature build() {
                VisibilityFeature visibilityFeatureBuildPartial = buildPartial();
                if (visibilityFeatureBuildPartial.isInitialized()) {
                    return visibilityFeatureBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) visibilityFeatureBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public VisibilityFeature buildPartial() {
                VisibilityFeature visibilityFeature = new VisibilityFeature(this);
                onBuilt();
                return visibilityFeature;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11450;
                c3618.m7840(VisibilityFeature.class, C3271.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3271 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
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

            private C3271() {
            }

            private C3271(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public VisibilityFeature getDefaultInstanceForType() {
                return VisibilityFeature.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3271 mo7355clear() {
                super.mo7355clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3271 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof VisibilityFeature) {
                    return mergeFrom((VisibilityFeature) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3271 mergeFrom(VisibilityFeature visibilityFeature) {
                if (visibilityFeature == VisibilityFeature.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(visibilityFeature.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public VisibilityFeature getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        private VisibilityFeature() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VisibilityFeature parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (VisibilityFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3271 newBuilderForType() {
            return newBuilder();
        }

        public static C3271 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VisibilityFeature parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (VisibilityFeature) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static VisibilityFeature parseFrom(ByteString byteString) {
            return (VisibilityFeature) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static VisibilityFeature parseFrom(ByteString byteString, C3696 c3696) {
            return (VisibilityFeature) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public enum DefaultSymbolVisibility implements InterfaceC3380 {
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
            private static final InterfaceC3397 internalValueMap;
            private final int value;

            static {
                AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "DefaultSymbolVisibility");
                internalValueMap = new C3515();
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

            public static C3665 getDescriptor() {
                return VisibilityFeature.getDescriptor().f11372[0];
            }

            public static InterfaceC3397 internalGetValueMap() {
                return internalValueMap;
            }

            public static DefaultSymbolVisibility valueOf(C3663 c3663) {
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
            public static DefaultSymbolVisibility valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VisibilityFeature parseFrom(byte[] bArr) {
            return (VisibilityFeature) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static VisibilityFeature parseFrom(byte[] bArr, C3696 c3696) {
            return (VisibilityFeature) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static VisibilityFeature parseFrom(InputStream inputStream) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static VisibilityFeature parseFrom(InputStream inputStream, C3696 c3696) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static VisibilityFeature parseFrom(AbstractC3473 abstractC3473) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static VisibilityFeature parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3272 extends GeneratedMessage.AbstractC3303 implements InterfaceC3505 {
        private int bitField0_;
        private int defaultSymbolVisibility_;
        private int enforceNamingStyle_;
        private int enumType_;
        private int fieldPresence_;
        private int jsonFormat_;
        private int messageEncoding_;
        private int repeatedFieldEncoding_;
        private int utf8Validation_;

        private C3272() {
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11463;
        }

        public <Type> C3272 addExtension(C3615 c3615, Type type) {
            return (C3272) addExtension((AbstractC3578) c3615, type);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FeatureSet build() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSetBuildPartial = buildPartial();
            if (descriptorProtos$FeatureSetBuildPartial.isInitialized()) {
                return descriptorProtos$FeatureSetBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$FeatureSetBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FeatureSet buildPartial() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = new DescriptorProtos$FeatureSet(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FeatureSet);
            }
            onBuilt();
            return descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3272 mo7355clear() {
            super.mo7355clear();
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

        public C3272 clearDefaultSymbolVisibility() {
            this.bitField0_ &= -129;
            this.defaultSymbolVisibility_ = 0;
            onChanged();
            return this;
        }

        public C3272 clearEnforceNamingStyle() {
            this.bitField0_ &= -65;
            this.enforceNamingStyle_ = 0;
            onChanged();
            return this;
        }

        public C3272 clearEnumType() {
            this.bitField0_ &= -3;
            this.enumType_ = 0;
            onChanged();
            return this;
        }

        public <Type> C3272 clearExtension(C3615 c3615) {
            return (C3272) clearExtension((AbstractC3578) c3615);
        }

        public C3272 clearFieldPresence() {
            this.bitField0_ &= -2;
            this.fieldPresence_ = 0;
            onChanged();
            return this;
        }

        public C3272 clearJsonFormat() {
            this.bitField0_ &= -33;
            this.jsonFormat_ = 0;
            onChanged();
            return this;
        }

        public C3272 clearMessageEncoding() {
            this.bitField0_ &= -17;
            this.messageEncoding_ = 0;
            onChanged();
            return this;
        }

        public C3272 clearRepeatedFieldEncoding() {
            this.bitField0_ &= -5;
            this.repeatedFieldEncoding_ = 0;
            onChanged();
            return this;
        }

        public C3272 clearUtf8Validation() {
            this.bitField0_ &= -9;
            this.utf8Validation_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
            VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibilityForNumber = VisibilityFeature.DefaultSymbolVisibility.forNumber(this.defaultSymbolVisibility_);
            return defaultSymbolVisibilityForNumber == null ? VisibilityFeature.DefaultSymbolVisibility.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN : defaultSymbolVisibilityForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11463;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public EnforceNamingStyle getEnforceNamingStyle() {
            EnforceNamingStyle enforceNamingStyleForNumber = EnforceNamingStyle.forNumber(this.enforceNamingStyle_);
            return enforceNamingStyleForNumber == null ? EnforceNamingStyle.ENFORCE_NAMING_STYLE_UNKNOWN : enforceNamingStyleForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public EnumType getEnumType() {
            EnumType enumTypeForNumber = EnumType.forNumber(this.enumType_);
            return enumTypeForNumber == null ? EnumType.ENUM_TYPE_UNKNOWN : enumTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3505
        public FieldPresence getFieldPresence() {
            FieldPresence fieldPresenceForNumber = FieldPresence.forNumber(this.fieldPresence_);
            return fieldPresenceForNumber == null ? FieldPresence.FIELD_PRESENCE_UNKNOWN : fieldPresenceForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public JsonFormat getJsonFormat() {
            JsonFormat jsonFormatForNumber = JsonFormat.forNumber(this.jsonFormat_);
            return jsonFormatForNumber == null ? JsonFormat.JSON_FORMAT_UNKNOWN : jsonFormatForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public MessageEncoding getMessageEncoding() {
            MessageEncoding messageEncodingForNumber = MessageEncoding.forNumber(this.messageEncoding_);
            return messageEncodingForNumber == null ? MessageEncoding.MESSAGE_ENCODING_UNKNOWN : messageEncodingForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public RepeatedFieldEncoding getRepeatedFieldEncoding() {
            RepeatedFieldEncoding repeatedFieldEncodingForNumber = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
            return repeatedFieldEncodingForNumber == null ? RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN : repeatedFieldEncodingForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public Utf8Validation getUtf8Validation() {
            Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
            return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public boolean hasDefaultSymbolVisibility() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public boolean hasEnforceNamingStyle() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public boolean hasEnumType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3505
        public boolean hasFieldPresence() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public boolean hasJsonFormat() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public boolean hasMessageEncoding() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public boolean hasRepeatedFieldEncoding() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3505
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11464;
            c3618.m7840(DescriptorProtos$FeatureSet.class, C3272.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return extensionsAreInitialized();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3272 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 8) {
                                int iMo7737 = abstractC3473.mo7737();
                                if (FieldPresence.forNumber(iMo7737) == null) {
                                    mergeUnknownVarintField(1, iMo7737);
                                } else {
                                    this.fieldPresence_ = iMo7737;
                                    this.bitField0_ |= 1;
                                }
                            } else if (iMo7718 == 16) {
                                int iMo77372 = abstractC3473.mo7737();
                                if (EnumType.forNumber(iMo77372) == null) {
                                    mergeUnknownVarintField(2, iMo77372);
                                } else {
                                    this.enumType_ = iMo77372;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo7718 == 24) {
                                int iMo77373 = abstractC3473.mo7737();
                                if (RepeatedFieldEncoding.forNumber(iMo77373) == null) {
                                    mergeUnknownVarintField(3, iMo77373);
                                } else {
                                    this.repeatedFieldEncoding_ = iMo77373;
                                    this.bitField0_ |= 4;
                                }
                            } else if (iMo7718 == 32) {
                                int iMo77374 = abstractC3473.mo7737();
                                if (Utf8Validation.forNumber(iMo77374) == null) {
                                    mergeUnknownVarintField(4, iMo77374);
                                } else {
                                    this.utf8Validation_ = iMo77374;
                                    this.bitField0_ |= 8;
                                }
                            } else if (iMo7718 == 40) {
                                int iMo77375 = abstractC3473.mo7737();
                                if (MessageEncoding.forNumber(iMo77375) == null) {
                                    mergeUnknownVarintField(5, iMo77375);
                                } else {
                                    this.messageEncoding_ = iMo77375;
                                    this.bitField0_ |= 16;
                                }
                            } else if (iMo7718 == 48) {
                                int iMo77376 = abstractC3473.mo7737();
                                if (JsonFormat.forNumber(iMo77376) == null) {
                                    mergeUnknownVarintField(6, iMo77376);
                                } else {
                                    this.jsonFormat_ = iMo77376;
                                    this.bitField0_ |= 32;
                                }
                            } else if (iMo7718 == 56) {
                                int iMo77377 = abstractC3473.mo7737();
                                if (EnforceNamingStyle.forNumber(iMo77377) == null) {
                                    mergeUnknownVarintField(7, iMo77377);
                                } else {
                                    this.enforceNamingStyle_ = iMo77377;
                                    this.bitField0_ |= 64;
                                }
                            } else if (iMo7718 == 64) {
                                int iMo77378 = abstractC3473.mo7737();
                                if (VisibilityFeature.DefaultSymbolVisibility.forNumber(iMo77378) == null) {
                                    mergeUnknownVarintField(8, iMo77378);
                                } else {
                                    this.defaultSymbolVisibility_ = iMo77378;
                                    this.bitField0_ |= 128;
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

        public C3272 setDefaultSymbolVisibility(VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibility) {
            defaultSymbolVisibility.getClass();
            this.bitField0_ |= 128;
            this.defaultSymbolVisibility_ = defaultSymbolVisibility.getNumber();
            onChanged();
            return this;
        }

        public C3272 setEnforceNamingStyle(EnforceNamingStyle enforceNamingStyle) {
            enforceNamingStyle.getClass();
            this.bitField0_ |= 64;
            this.enforceNamingStyle_ = enforceNamingStyle.getNumber();
            onChanged();
            return this;
        }

        public C3272 setEnumType(EnumType enumType) {
            enumType.getClass();
            this.bitField0_ |= 2;
            this.enumType_ = enumType.getNumber();
            onChanged();
            return this;
        }

        public <Type> C3272 setExtension(C3615 c3615, Type type) {
            return (C3272) setExtension((AbstractC3578) c3615, type);
        }

        public C3272 setFieldPresence(FieldPresence fieldPresence) {
            fieldPresence.getClass();
            this.bitField0_ |= 1;
            this.fieldPresence_ = fieldPresence.getNumber();
            onChanged();
            return this;
        }

        public C3272 setJsonFormat(JsonFormat jsonFormat) {
            jsonFormat.getClass();
            this.bitField0_ |= 32;
            this.jsonFormat_ = jsonFormat.getNumber();
            onChanged();
            return this;
        }

        public C3272 setMessageEncoding(MessageEncoding messageEncoding) {
            messageEncoding.getClass();
            this.bitField0_ |= 16;
            this.messageEncoding_ = messageEncoding.getNumber();
            onChanged();
            return this;
        }

        public C3272 setRepeatedFieldEncoding(RepeatedFieldEncoding repeatedFieldEncoding) {
            repeatedFieldEncoding.getClass();
            this.bitField0_ |= 4;
            this.repeatedFieldEncoding_ = repeatedFieldEncoding.getNumber();
            onChanged();
            return this;
        }

        public C3272 setUtf8Validation(Utf8Validation utf8Validation) {
            utf8Validation.getClass();
            this.bitField0_ |= 8;
            this.utf8Validation_ = utf8Validation.getNumber();
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
        public DescriptorProtos$FeatureSet getDefaultInstanceForType() {
            return DescriptorProtos$FeatureSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        public <Type> C3272 setExtension(C3615 c3615, int i, Type type) {
            return (C3272) setExtension((AbstractC3578) c3615, i, type);
        }

        private C3272(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.fieldPresence_ = 0;
            this.enumType_ = 0;
            this.repeatedFieldEncoding_ = 0;
            this.utf8Validation_ = 0;
            this.messageEncoding_ = 0;
            this.jsonFormat_ = 0;
            this.enforceNamingStyle_ = 0;
            this.defaultSymbolVisibility_ = 0;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3272 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$FeatureSet) {
                return mergeFrom((DescriptorProtos$FeatureSet) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3272 mergeFrom(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
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
    public DescriptorProtos$FeatureSet getDefaultInstanceForType() {
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

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3272 newBuilderForType() {
        return newBuilder();
    }

    public static C3272 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteString byteString) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum EnforceNamingStyle implements InterfaceC3380 {
        ENFORCE_NAMING_STYLE_UNKNOWN(0),
        STYLE2024(1),
        STYLE_LEGACY(2);

        public static final int ENFORCE_NAMING_STYLE_UNKNOWN_VALUE = 0;
        public static final int STYLE2024_VALUE = 1;
        public static final int STYLE_LEGACY_VALUE = 2;
        private static final EnforceNamingStyle[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "EnforceNamingStyle");
            internalValueMap = new C3566();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11372[6];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static EnforceNamingStyle valueOf(C3663 c3663) {
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
        public static EnforceNamingStyle valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum EnumType implements InterfaceC3380 {
        ENUM_TYPE_UNKNOWN(0),
        OPEN(1),
        CLOSED(2);

        public static final int CLOSED_VALUE = 2;
        public static final int ENUM_TYPE_UNKNOWN_VALUE = 0;
        public static final int OPEN_VALUE = 1;
        private static final EnumType[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumType");
            internalValueMap = new C3562();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11372[1];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static EnumType valueOf(C3663 c3663) {
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
        public static EnumType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum FieldPresence implements InterfaceC3380 {
        FIELD_PRESENCE_UNKNOWN(0),
        EXPLICIT(1),
        IMPLICIT(2),
        LEGACY_REQUIRED(3);

        public static final int EXPLICIT_VALUE = 1;
        public static final int FIELD_PRESENCE_UNKNOWN_VALUE = 0;
        public static final int IMPLICIT_VALUE = 2;
        public static final int LEGACY_REQUIRED_VALUE = 3;
        private static final FieldPresence[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldPresence");
            internalValueMap = new C3563();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11372[0];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static FieldPresence valueOf(C3663 c3663) {
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
        public static FieldPresence valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum JsonFormat implements InterfaceC3380 {
        JSON_FORMAT_UNKNOWN(0),
        ALLOW(1),
        LEGACY_BEST_EFFORT(2);

        public static final int ALLOW_VALUE = 1;
        public static final int JSON_FORMAT_UNKNOWN_VALUE = 0;
        public static final int LEGACY_BEST_EFFORT_VALUE = 2;
        private static final JsonFormat[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "JsonFormat");
            internalValueMap = new C3559();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11372[5];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static JsonFormat valueOf(C3663 c3663) {
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
        public static JsonFormat valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum MessageEncoding implements InterfaceC3380 {
        MESSAGE_ENCODING_UNKNOWN(0),
        LENGTH_PREFIXED(1),
        DELIMITED(2);

        public static final int DELIMITED_VALUE = 2;
        public static final int LENGTH_PREFIXED_VALUE = 1;
        public static final int MESSAGE_ENCODING_UNKNOWN_VALUE = 0;
        private static final MessageEncoding[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "MessageEncoding");
            internalValueMap = new C3558();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11372[4];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static MessageEncoding valueOf(C3663 c3663) {
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
        public static MessageEncoding valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum RepeatedFieldEncoding implements InterfaceC3380 {
        REPEATED_FIELD_ENCODING_UNKNOWN(0),
        PACKED(1),
        EXPANDED(2);

        public static final int EXPANDED_VALUE = 2;
        public static final int PACKED_VALUE = 1;
        public static final int REPEATED_FIELD_ENCODING_UNKNOWN_VALUE = 0;
        private static final RepeatedFieldEncoding[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "RepeatedFieldEncoding");
            internalValueMap = new C3561();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11372[2];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static RepeatedFieldEncoding valueOf(C3663 c3663) {
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
        public static RepeatedFieldEncoding valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Utf8Validation implements InterfaceC3380 {
        UTF8_VALIDATION_UNKNOWN(0),
        VERIFY(2),
        NONE(3);

        public static final int NONE_VALUE = 3;
        public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
        private static final Utf8Validation[] VALUES;
        public static final int VERIFY_VALUE = 2;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Utf8Validation");
            internalValueMap = new C3560();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11372[3];
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

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
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

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$FeatureSet) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$FeatureSet parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$FeatureSet parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
