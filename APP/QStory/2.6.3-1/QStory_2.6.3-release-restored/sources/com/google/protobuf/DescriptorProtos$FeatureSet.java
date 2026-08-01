package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FeatureSet extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FeatureSet> implements InterfaceC4338 {
    private static final DescriptorProtos$FeatureSet DEFAULT_INSTANCE;
    public static final int DEFAULT_SYMBOL_VISIBILITY_FIELD_NUMBER = 8;
    public static final int ENFORCE_NAMING_STYLE_FIELD_NUMBER = 7;
    public static final int ENUM_TYPE_FIELD_NUMBER = 2;
    public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
    public static final int JSON_FORMAT_FIELD_NUMBER = 6;
    public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
    private static final InterfaceC4207 PARSER;
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
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FeatureSet");
        DEFAULT_INSTANCE = new DescriptorProtos$FeatureSet();
        PARSER = new C4400();
    }

    private DescriptorProtos$FeatureSet(GeneratedMessage.AbstractC4136 abstractC4136) {
        super(abstractC4136);
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

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11813;
    }

    public static C4105 newBuilder(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FeatureSet);
    }

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FeatureSet) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.InterfaceC4338
    public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
        VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibilityForNumber = VisibilityFeature.DefaultSymbolVisibility.forNumber(this.defaultSymbolVisibility_);
        return defaultSymbolVisibilityForNumber == null ? VisibilityFeature.DefaultSymbolVisibility.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN : defaultSymbolVisibilityForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11813;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public EnforceNamingStyle getEnforceNamingStyle() {
        EnforceNamingStyle enforceNamingStyleForNumber = EnforceNamingStyle.forNumber(this.enforceNamingStyle_);
        return enforceNamingStyleForNumber == null ? EnforceNamingStyle.ENFORCE_NAMING_STYLE_UNKNOWN : enforceNamingStyleForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public EnumType getEnumType() {
        EnumType enumTypeForNumber = EnumType.forNumber(this.enumType_);
        return enumTypeForNumber == null ? EnumType.ENUM_TYPE_UNKNOWN : enumTypeForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4338
    public FieldPresence getFieldPresence() {
        FieldPresence fieldPresenceForNumber = FieldPresence.forNumber(this.fieldPresence_);
        return fieldPresenceForNumber == null ? FieldPresence.FIELD_PRESENCE_UNKNOWN : fieldPresenceForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public JsonFormat getJsonFormat() {
        JsonFormat jsonFormatForNumber = JsonFormat.forNumber(this.jsonFormat_);
        return jsonFormatForNumber == null ? JsonFormat.JSON_FORMAT_UNKNOWN : jsonFormatForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public MessageEncoding getMessageEncoding() {
        MessageEncoding messageEncodingForNumber = MessageEncoding.forNumber(this.messageEncoding_);
        return messageEncodingForNumber == null ? MessageEncoding.MESSAGE_ENCODING_UNKNOWN : messageEncodingForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public RepeatedFieldEncoding getRepeatedFieldEncoding() {
        RepeatedFieldEncoding repeatedFieldEncodingForNumber = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
        return repeatedFieldEncodingForNumber == null ? RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN : repeatedFieldEncodingForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM8191 = (this.bitField0_ & 1) != 0 ? AbstractC4294.m8191(1, this.fieldPresence_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM8191 += AbstractC4294.m8191(2, this.enumType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM8191 += AbstractC4294.m8191(3, this.repeatedFieldEncoding_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM8191 += AbstractC4294.m8191(4, this.utf8Validation_);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM8191 += AbstractC4294.m8191(5, this.messageEncoding_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM8191 += AbstractC4294.m8191(6, this.jsonFormat_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM8191 += AbstractC4294.m8191(7, this.enforceNamingStyle_);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM8191 += AbstractC4294.m8191(8, this.defaultSymbolVisibility_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iM8191;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public Utf8Validation getUtf8Validation() {
        Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
        return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public boolean hasDefaultSymbolVisibility() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public boolean hasEnforceNamingStyle() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public boolean hasEnumType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4338
    public boolean hasFieldPresence() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public boolean hasJsonFormat() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public boolean hasMessageEncoding() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public boolean hasRepeatedFieldEncoding() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4338
    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasFieldPresence()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + this.fieldPresence_;
        }
        if (hasEnumType()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + this.enumType_;
        }
        if (hasRepeatedFieldEncoding()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + this.repeatedFieldEncoding_;
        }
        if (hasUtf8Validation()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + this.utf8Validation_;
        }
        if (hasMessageEncoding()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + this.messageEncoding_;
        }
        if (hasJsonFormat()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + this.jsonFormat_;
        }
        if (hasEnforceNamingStyle()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 7, 53) + this.enforceNamingStyle_;
        }
        if (hasDefaultSymbolVisibility()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 8, 53) + this.defaultSymbolVisibility_;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC4365.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11814;
        c4451.m8386(DescriptorProtos$FeatureSet.class, C4105.class);
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
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4105 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4105(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4105 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4105() : new C4105().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        InterfaceC4461 interfaceC4461NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8210(1, this.fieldPresence_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8210(2, this.enumType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8210(3, this.repeatedFieldEncoding_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.mo8210(4, this.utf8Validation_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC4294.mo8210(5, this.messageEncoding_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC4294.mo8210(6, this.jsonFormat_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC4294.mo8210(7, this.enforceNamingStyle_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC4294.mo8210(8, this.defaultSymbolVisibility_);
        }
        interfaceC4461NewExtensionSerializer.mo8387(10001, abstractC4294);
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class VisibilityFeature extends GeneratedMessage implements InterfaceC4352 {
        private static final VisibilityFeature DEFAULT_INSTANCE;
        private static final InterfaceC4207 PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "VisibilityFeature");
            DEFAULT_INSTANCE = new VisibilityFeature();
            PARSER = new C4349();
        }

        private VisibilityFeature(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VisibilityFeature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11801;
        }

        public static C4104 newBuilder(VisibilityFeature visibilityFeature) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(visibilityFeature);
        }

        public static VisibilityFeature parseDelimitedFrom(InputStream inputStream) {
            return (VisibilityFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VisibilityFeature parseFrom(ByteBuffer byteBuffer) {
            return (VisibilityFeature) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof VisibilityFeature) ? super.equals(obj) : getUnknownFields().equals(((VisibilityFeature) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11801;
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
            C4451 c4451 = AbstractC4502.f11800;
            c4451.m8386(VisibilityFeature.class, C4104.class);
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
        public C4104 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4104(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4104 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4104() : new C4104().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSet$VisibilityFeature$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4104 extends GeneratedMessage.AbstractC4137 implements InterfaceC4352 {
            public static final C4495 getDescriptor() {
                return AbstractC4502.f11801;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public VisibilityFeature build() {
                VisibilityFeature visibilityFeatureBuildPartial = buildPartial();
                if (visibilityFeatureBuildPartial.isInitialized()) {
                    return visibilityFeatureBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) visibilityFeatureBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public VisibilityFeature buildPartial() {
                VisibilityFeature visibilityFeature = new VisibilityFeature(this);
                onBuilt();
                return visibilityFeature;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11801;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11800;
                c4451.m8386(VisibilityFeature.class, C4104.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4104 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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

            private C4104() {
            }

            private C4104(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public VisibilityFeature getDefaultInstanceForType() {
                return VisibilityFeature.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4104 mo7901clear() {
                super.mo7901clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4104 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof VisibilityFeature) {
                    return mergeFrom((VisibilityFeature) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4104 mergeFrom(VisibilityFeature visibilityFeature) {
                if (visibilityFeature == VisibilityFeature.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(visibilityFeature.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public VisibilityFeature getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        private VisibilityFeature() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VisibilityFeature parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (VisibilityFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4104 newBuilderForType() {
            return newBuilder();
        }

        public static C4104 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VisibilityFeature parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (VisibilityFeature) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static VisibilityFeature parseFrom(ByteString byteString) {
            return (VisibilityFeature) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static VisibilityFeature parseFrom(ByteString byteString, C4529 c4529) {
            return (VisibilityFeature) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum DefaultSymbolVisibility implements InterfaceC4213 {
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
            private static final InterfaceC4230 internalValueMap;
            private final int value;

            static {
                AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "DefaultSymbolVisibility");
                internalValueMap = new C4348();
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

            public static C4498 getDescriptor() {
                return VisibilityFeature.getDescriptor().f11722[0];
            }

            public static InterfaceC4230 internalGetValueMap() {
                return internalValueMap;
            }

            public static DefaultSymbolVisibility valueOf(C4496 c4496) {
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
            public static DefaultSymbolVisibility valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VisibilityFeature parseFrom(byte[] bArr) {
            return (VisibilityFeature) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static VisibilityFeature parseFrom(byte[] bArr, C4529 c4529) {
            return (VisibilityFeature) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static VisibilityFeature parseFrom(InputStream inputStream) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static VisibilityFeature parseFrom(InputStream inputStream, C4529 c4529) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static VisibilityFeature parseFrom(AbstractC4306 abstractC4306) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static VisibilityFeature parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (VisibilityFeature) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4105 extends GeneratedMessage.AbstractC4136 implements InterfaceC4338 {
        private int bitField0_;
        private int defaultSymbolVisibility_;
        private int enforceNamingStyle_;
        private int enumType_;
        private int fieldPresence_;
        private int jsonFormat_;
        private int messageEncoding_;
        private int repeatedFieldEncoding_;
        private int utf8Validation_;

        private C4105() {
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

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11813;
        }

        public <Type> C4105 addExtension(C4448 c4448, Type type) {
            return (C4105) addExtension((AbstractC4411) c4448, type);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FeatureSet build() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSetBuildPartial = buildPartial();
            if (descriptorProtos$FeatureSetBuildPartial.isInitialized()) {
                return descriptorProtos$FeatureSetBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$FeatureSetBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$FeatureSet buildPartial() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = new DescriptorProtos$FeatureSet(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FeatureSet);
            }
            onBuilt();
            return descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4105 mo7901clear() {
            super.mo7901clear();
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

        public C4105 clearDefaultSymbolVisibility() {
            this.bitField0_ &= -129;
            this.defaultSymbolVisibility_ = 0;
            onChanged();
            return this;
        }

        public C4105 clearEnforceNamingStyle() {
            this.bitField0_ &= -65;
            this.enforceNamingStyle_ = 0;
            onChanged();
            return this;
        }

        public C4105 clearEnumType() {
            this.bitField0_ &= -3;
            this.enumType_ = 0;
            onChanged();
            return this;
        }

        public <Type> C4105 clearExtension(C4448 c4448) {
            return (C4105) clearExtension((AbstractC4411) c4448);
        }

        public C4105 clearFieldPresence() {
            this.bitField0_ &= -2;
            this.fieldPresence_ = 0;
            onChanged();
            return this;
        }

        public C4105 clearJsonFormat() {
            this.bitField0_ &= -33;
            this.jsonFormat_ = 0;
            onChanged();
            return this;
        }

        public C4105 clearMessageEncoding() {
            this.bitField0_ &= -17;
            this.messageEncoding_ = 0;
            onChanged();
            return this;
        }

        public C4105 clearRepeatedFieldEncoding() {
            this.bitField0_ &= -5;
            this.repeatedFieldEncoding_ = 0;
            onChanged();
            return this;
        }

        public C4105 clearUtf8Validation() {
            this.bitField0_ &= -9;
            this.utf8Validation_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
            VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibilityForNumber = VisibilityFeature.DefaultSymbolVisibility.forNumber(this.defaultSymbolVisibility_);
            return defaultSymbolVisibilityForNumber == null ? VisibilityFeature.DefaultSymbolVisibility.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN : defaultSymbolVisibilityForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11813;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public EnforceNamingStyle getEnforceNamingStyle() {
            EnforceNamingStyle enforceNamingStyleForNumber = EnforceNamingStyle.forNumber(this.enforceNamingStyle_);
            return enforceNamingStyleForNumber == null ? EnforceNamingStyle.ENFORCE_NAMING_STYLE_UNKNOWN : enforceNamingStyleForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public EnumType getEnumType() {
            EnumType enumTypeForNumber = EnumType.forNumber(this.enumType_);
            return enumTypeForNumber == null ? EnumType.ENUM_TYPE_UNKNOWN : enumTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4338
        public FieldPresence getFieldPresence() {
            FieldPresence fieldPresenceForNumber = FieldPresence.forNumber(this.fieldPresence_);
            return fieldPresenceForNumber == null ? FieldPresence.FIELD_PRESENCE_UNKNOWN : fieldPresenceForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public JsonFormat getJsonFormat() {
            JsonFormat jsonFormatForNumber = JsonFormat.forNumber(this.jsonFormat_);
            return jsonFormatForNumber == null ? JsonFormat.JSON_FORMAT_UNKNOWN : jsonFormatForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public MessageEncoding getMessageEncoding() {
            MessageEncoding messageEncodingForNumber = MessageEncoding.forNumber(this.messageEncoding_);
            return messageEncodingForNumber == null ? MessageEncoding.MESSAGE_ENCODING_UNKNOWN : messageEncodingForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public RepeatedFieldEncoding getRepeatedFieldEncoding() {
            RepeatedFieldEncoding repeatedFieldEncodingForNumber = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
            return repeatedFieldEncodingForNumber == null ? RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN : repeatedFieldEncodingForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public Utf8Validation getUtf8Validation() {
            Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
            return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public boolean hasDefaultSymbolVisibility() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public boolean hasEnforceNamingStyle() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public boolean hasEnumType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4338
        public boolean hasFieldPresence() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public boolean hasJsonFormat() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public boolean hasMessageEncoding() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public boolean hasRepeatedFieldEncoding() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4338
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11814;
            c4451.m8386(DescriptorProtos$FeatureSet.class, C4105.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return extensionsAreInitialized();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4105 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                int iMo8283 = abstractC4306.mo8283();
                                if (FieldPresence.forNumber(iMo8283) == null) {
                                    mergeUnknownVarintField(1, iMo8283);
                                } else {
                                    this.fieldPresence_ = iMo8283;
                                    this.bitField0_ |= 1;
                                }
                            } else if (iMo8264 == 16) {
                                int iMo82832 = abstractC4306.mo8283();
                                if (EnumType.forNumber(iMo82832) == null) {
                                    mergeUnknownVarintField(2, iMo82832);
                                } else {
                                    this.enumType_ = iMo82832;
                                    this.bitField0_ |= 2;
                                }
                            } else if (iMo8264 == 24) {
                                int iMo82833 = abstractC4306.mo8283();
                                if (RepeatedFieldEncoding.forNumber(iMo82833) == null) {
                                    mergeUnknownVarintField(3, iMo82833);
                                } else {
                                    this.repeatedFieldEncoding_ = iMo82833;
                                    this.bitField0_ |= 4;
                                }
                            } else if (iMo8264 == 32) {
                                int iMo82834 = abstractC4306.mo8283();
                                if (Utf8Validation.forNumber(iMo82834) == null) {
                                    mergeUnknownVarintField(4, iMo82834);
                                } else {
                                    this.utf8Validation_ = iMo82834;
                                    this.bitField0_ |= 8;
                                }
                            } else if (iMo8264 == 40) {
                                int iMo82835 = abstractC4306.mo8283();
                                if (MessageEncoding.forNumber(iMo82835) == null) {
                                    mergeUnknownVarintField(5, iMo82835);
                                } else {
                                    this.messageEncoding_ = iMo82835;
                                    this.bitField0_ |= 16;
                                }
                            } else if (iMo8264 == 48) {
                                int iMo82836 = abstractC4306.mo8283();
                                if (JsonFormat.forNumber(iMo82836) == null) {
                                    mergeUnknownVarintField(6, iMo82836);
                                } else {
                                    this.jsonFormat_ = iMo82836;
                                    this.bitField0_ |= 32;
                                }
                            } else if (iMo8264 == 56) {
                                int iMo82837 = abstractC4306.mo8283();
                                if (EnforceNamingStyle.forNumber(iMo82837) == null) {
                                    mergeUnknownVarintField(7, iMo82837);
                                } else {
                                    this.enforceNamingStyle_ = iMo82837;
                                    this.bitField0_ |= 64;
                                }
                            } else if (iMo8264 == 64) {
                                int iMo82838 = abstractC4306.mo8283();
                                if (VisibilityFeature.DefaultSymbolVisibility.forNumber(iMo82838) == null) {
                                    mergeUnknownVarintField(8, iMo82838);
                                } else {
                                    this.defaultSymbolVisibility_ = iMo82838;
                                    this.bitField0_ |= 128;
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

        public C4105 setDefaultSymbolVisibility(VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibility) {
            defaultSymbolVisibility.getClass();
            this.bitField0_ |= 128;
            this.defaultSymbolVisibility_ = defaultSymbolVisibility.getNumber();
            onChanged();
            return this;
        }

        public C4105 setEnforceNamingStyle(EnforceNamingStyle enforceNamingStyle) {
            enforceNamingStyle.getClass();
            this.bitField0_ |= 64;
            this.enforceNamingStyle_ = enforceNamingStyle.getNumber();
            onChanged();
            return this;
        }

        public C4105 setEnumType(EnumType enumType) {
            enumType.getClass();
            this.bitField0_ |= 2;
            this.enumType_ = enumType.getNumber();
            onChanged();
            return this;
        }

        public <Type> C4105 setExtension(C4448 c4448, Type type) {
            return (C4105) setExtension((AbstractC4411) c4448, type);
        }

        public C4105 setFieldPresence(FieldPresence fieldPresence) {
            fieldPresence.getClass();
            this.bitField0_ |= 1;
            this.fieldPresence_ = fieldPresence.getNumber();
            onChanged();
            return this;
        }

        public C4105 setJsonFormat(JsonFormat jsonFormat) {
            jsonFormat.getClass();
            this.bitField0_ |= 32;
            this.jsonFormat_ = jsonFormat.getNumber();
            onChanged();
            return this;
        }

        public C4105 setMessageEncoding(MessageEncoding messageEncoding) {
            messageEncoding.getClass();
            this.bitField0_ |= 16;
            this.messageEncoding_ = messageEncoding.getNumber();
            onChanged();
            return this;
        }

        public C4105 setRepeatedFieldEncoding(RepeatedFieldEncoding repeatedFieldEncoding) {
            repeatedFieldEncoding.getClass();
            this.bitField0_ |= 4;
            this.repeatedFieldEncoding_ = repeatedFieldEncoding.getNumber();
            onChanged();
            return this;
        }

        public C4105 setUtf8Validation(Utf8Validation utf8Validation) {
            utf8Validation.getClass();
            this.bitField0_ |= 8;
            this.utf8Validation_ = utf8Validation.getNumber();
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
        public DescriptorProtos$FeatureSet getDefaultInstanceForType() {
            return DescriptorProtos$FeatureSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public <Type> C4105 setExtension(C4448 c4448, int i, Type type) {
            return (C4105) setExtension((AbstractC4411) c4448, i, type);
        }

        private C4105(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.fieldPresence_ = 0;
            this.enumType_ = 0;
            this.repeatedFieldEncoding_ = 0;
            this.utf8Validation_ = 0;
            this.messageEncoding_ = 0;
            this.jsonFormat_ = 0;
            this.enforceNamingStyle_ = 0;
            this.defaultSymbolVisibility_ = 0;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4105 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$FeatureSet) {
                return mergeFrom((DescriptorProtos$FeatureSet) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4105 mergeFrom(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
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
    public DescriptorProtos$FeatureSet getDefaultInstanceForType() {
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

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4105 newBuilderForType() {
        return newBuilder();
    }

    public static C4105 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$FeatureSet) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteString byteString) {
        return (DescriptorProtos$FeatureSet) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$FeatureSet) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum EnforceNamingStyle implements InterfaceC4213 {
        ENFORCE_NAMING_STYLE_UNKNOWN(0),
        STYLE2024(1),
        STYLE_LEGACY(2);

        public static final int ENFORCE_NAMING_STYLE_UNKNOWN_VALUE = 0;
        public static final int STYLE2024_VALUE = 1;
        public static final int STYLE_LEGACY_VALUE = 2;
        private static final EnforceNamingStyle[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "EnforceNamingStyle");
            internalValueMap = new C4399();
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

        public static C4498 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11722[6];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static EnforceNamingStyle valueOf(C4496 c4496) {
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
        public static EnforceNamingStyle valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum EnumType implements InterfaceC4213 {
        ENUM_TYPE_UNKNOWN(0),
        OPEN(1),
        CLOSED(2);

        public static final int CLOSED_VALUE = 2;
        public static final int ENUM_TYPE_UNKNOWN_VALUE = 0;
        public static final int OPEN_VALUE = 1;
        private static final EnumType[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "EnumType");
            internalValueMap = new C4395();
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

        public static C4498 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11722[1];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static EnumType valueOf(C4496 c4496) {
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
        public static EnumType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum FieldPresence implements InterfaceC4213 {
        FIELD_PRESENCE_UNKNOWN(0),
        EXPLICIT(1),
        IMPLICIT(2),
        LEGACY_REQUIRED(3);

        public static final int EXPLICIT_VALUE = 1;
        public static final int FIELD_PRESENCE_UNKNOWN_VALUE = 0;
        public static final int IMPLICIT_VALUE = 2;
        public static final int LEGACY_REQUIRED_VALUE = 3;
        private static final FieldPresence[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FieldPresence");
            internalValueMap = new C4396();
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

        public static C4498 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11722[0];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static FieldPresence valueOf(C4496 c4496) {
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
        public static FieldPresence valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum JsonFormat implements InterfaceC4213 {
        JSON_FORMAT_UNKNOWN(0),
        ALLOW(1),
        LEGACY_BEST_EFFORT(2);

        public static final int ALLOW_VALUE = 1;
        public static final int JSON_FORMAT_UNKNOWN_VALUE = 0;
        public static final int LEGACY_BEST_EFFORT_VALUE = 2;
        private static final JsonFormat[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "JsonFormat");
            internalValueMap = new C4392();
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

        public static C4498 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11722[5];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static JsonFormat valueOf(C4496 c4496) {
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
        public static JsonFormat valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum MessageEncoding implements InterfaceC4213 {
        MESSAGE_ENCODING_UNKNOWN(0),
        LENGTH_PREFIXED(1),
        DELIMITED(2);

        public static final int DELIMITED_VALUE = 2;
        public static final int LENGTH_PREFIXED_VALUE = 1;
        public static final int MESSAGE_ENCODING_UNKNOWN_VALUE = 0;
        private static final MessageEncoding[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "MessageEncoding");
            internalValueMap = new C4391();
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

        public static C4498 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11722[4];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static MessageEncoding valueOf(C4496 c4496) {
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
        public static MessageEncoding valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum RepeatedFieldEncoding implements InterfaceC4213 {
        REPEATED_FIELD_ENCODING_UNKNOWN(0),
        PACKED(1),
        EXPANDED(2);

        public static final int EXPANDED_VALUE = 2;
        public static final int PACKED_VALUE = 1;
        public static final int REPEATED_FIELD_ENCODING_UNKNOWN_VALUE = 0;
        private static final RepeatedFieldEncoding[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "RepeatedFieldEncoding");
            internalValueMap = new C4394();
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

        public static C4498 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11722[2];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static RepeatedFieldEncoding valueOf(C4496 c4496) {
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
        public static RepeatedFieldEncoding valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Utf8Validation implements InterfaceC4213 {
        UTF8_VALIDATION_UNKNOWN(0),
        VERIFY(2),
        NONE(3);

        public static final int NONE_VALUE = 3;
        public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
        private static final Utf8Validation[] VALUES;
        public static final int VERIFY_VALUE = 2;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Utf8Validation");
            internalValueMap = new C4393();
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

        public static C4498 getDescriptor() {
            return DescriptorProtos$FeatureSet.getDescriptor().f11722[3];
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

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr) {
        return (DescriptorProtos$FeatureSet) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
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

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$FeatureSet) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$FeatureSet parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$FeatureSet parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$FeatureSet) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
