package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Any extends GeneratedMessage implements InterfaceC4384 {
    private static final Any DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile InterfaceC4285 cachedUnpackValue;
    private byte memoizedIsInitialized;
    private volatile Object typeUrl_;
    private ByteString value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Any");
        DEFAULT_INSTANCE = new Any();
        PARSER = new C4383();
    }

    private Any() {
        this.typeUrl_ = "";
        ByteString byteString = ByteString.EMPTY;
        this.value_ = byteString;
        this.memoizedIsInitialized = (byte) -1;
        this.typeUrl_ = "";
        this.value_ = byteString;
    }

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4381.f11547;
    }

    private static String getTypeNameFromTypeUrl(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf + 1);
    }

    private static String getTypeUrl(String str, C4495 c4495) {
        if (str.endsWith("/")) {
            StringBuilder sbM700 = AbstractC0900.m700(str);
            sbM700.append(c4495.f11718);
            return sbM700.toString();
        }
        StringBuilder sbM12143 = AbstractC7012.m12143(str, "/");
        sbM12143.append(c4495.f11718);
        return sbM12143.toString();
    }

    public static C4090 newBuilder(Any any) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(any);
    }

    public static <T extends InterfaceC4285> Any pack(T t) {
        return newBuilder().setTypeUrl(getTypeUrl("type.googleapis.com", t.getDescriptorForType())).setValue(t.toByteString()).build();
    }

    public static Any parseDelimitedFrom(InputStream inputStream) {
        return (Any) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) {
        return (Any) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Any)) {
            return super.equals(obj);
        }
        Any any = (Any) obj;
        return getTypeUrl().equals(any.getTypeUrl()) && getValue().equals(any.getValue()) && getUnknownFields().equals(any.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4381.f11547;
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
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.typeUrl_) ? GeneratedMessage.computeStringSize(1, this.typeUrl_) : 0;
        if (!this.value_.isEmpty()) {
            iComputeStringSize += AbstractC4294.m8192(2, this.value_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4384
    public ByteString getTypeUrlBytes() {
        Object obj = this.typeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.typeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4384
    public ByteString getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getValue().hashCode() + ((((getTypeUrl().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4381.f11546;
        c4451.m8386(Any.class, C4090.class);
        return c4451;
    }

    /* JADX INFO: renamed from: is */
    public <T extends InterfaceC4285> boolean m137is(Class<T> cls) {
        return getTypeNameFromTypeUrl(getTypeUrl()).equals(((InterfaceC4285) AbstractC4234.m8063(cls)).getDescriptorForType().f11718);
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

    public boolean isSameTypeAs(InterfaceC4285 interfaceC4285) {
        return getTypeNameFromTypeUrl(getTypeUrl()).equals(interfaceC4285.getDescriptorForType().f11718);
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4090 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4090(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4090 toBuilder() {
        C4383 c4383 = null;
        return this == DEFAULT_INSTANCE ? new C4090(c4383) : new C4090(c4383).mergeFrom(this);
    }

    public <T extends InterfaceC4285> T unpack(Class<T> cls) throws InvalidProtocolBufferException {
        if (this.cachedUnpackValue != null) {
            if (this.cachedUnpackValue.getClass() == cls) {
                return (T) this.cachedUnpackValue;
            }
        } else if (m137is(cls)) {
            T t = (T) ((AbstractC4360) ((InterfaceC4285) AbstractC4234.m8063(cls)).getParserForType()).m8313(getValue(), AbstractC4360.f11519);
            this.cachedUnpackValue = t;
            return t;
        }
        throw new InvalidProtocolBufferException("Type of the Any message does not match the given class.");
    }

    public <T extends InterfaceC4285> T unpackSameTypeAs(T t) throws InvalidProtocolBufferException {
        if (this.cachedUnpackValue != null) {
            if (this.cachedUnpackValue.getClass() == t.getClass()) {
                return (T) this.cachedUnpackValue;
            }
        } else if (isSameTypeAs(t)) {
            T t2 = (T) ((AbstractC4360) t.getParserForType()).m8313(getValue(), AbstractC4360.f11519);
            this.cachedUnpackValue = t2;
            return t2;
        }
        throw new InvalidProtocolBufferException("Type of the Any message does not match the given exemplar.");
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.typeUrl_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.typeUrl_);
        }
        if (!this.value_.isEmpty()) {
            abstractC4294.mo8225(2, this.value_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Any$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4090 extends GeneratedMessage.AbstractC4137 implements InterfaceC4384 {
        private int bitField0_;
        private Object typeUrl_;
        private ByteString value_;

        private C4090() {
            this.typeUrl_ = "";
            this.value_ = ByteString.EMPTY;
        }

        private void buildPartial0(Any any) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                any.typeUrl_ = this.typeUrl_;
            }
            if ((i & 2) != 0) {
                any.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4381.f11547;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Any build() {
            Any anyBuildPartial = buildPartial();
            if (anyBuildPartial.isInitialized()) {
                return anyBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) anyBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Any buildPartial() {
            Any any = new Any(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(any);
            }
            onBuilt();
            return any;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4090 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.typeUrl_ = "";
            this.value_ = ByteString.EMPTY;
            return this;
        }

        public C4090 clearTypeUrl() {
            this.typeUrl_ = Any.getDefaultInstance().getTypeUrl();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4090 clearValue() {
            this.bitField0_ &= -3;
            this.value_ = Any.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4381.f11547;
        }

        @Override // com.google.protobuf.InterfaceC4384
        public String getTypeUrl() {
            Object obj = this.typeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.typeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4384
        public ByteString getTypeUrlBytes() {
            Object obj = this.typeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4384
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4381.f11546;
            c4451.m8386(Any.class, C4090.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4090 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.typeUrl_ = abstractC4306.mo8265();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 18) {
                                this.value_ = abstractC4306.mo8278();
                                this.bitField0_ |= 2;
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

        public C4090 setTypeUrl(String str) {
            str.getClass();
            this.typeUrl_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4090 setTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.typeUrl_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4090 setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Any getDefaultInstanceForType() {
            return Any.getDefaultInstance();
        }

        public /* synthetic */ C4090(C4383 c4383) {
            this();
        }

        public /* synthetic */ C4090(InterfaceC4364 interfaceC4364, C4383 c4383) {
            this(interfaceC4364);
        }

        private C4090(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.typeUrl_ = "";
            this.value_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4090 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Any) {
                return mergeFrom((Any) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4090 mergeFrom(Any any) {
            if (any == Any.getDefaultInstance()) {
                return this;
            }
            if (!any.getTypeUrl().isEmpty()) {
                this.typeUrl_ = any.typeUrl_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!any.getValue().isEmpty()) {
                setValue(any.getValue());
            }
            mergeUnknownFields(any.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Any getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Any parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Any) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4090 newBuilderForType() {
        return newBuilder();
    }

    public static C4090 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Any parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Any) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Any parseFrom(ByteString byteString) {
        return (Any) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    private Any(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.typeUrl_ = "";
        this.value_ = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Any parseFrom(ByteString byteString, C4529 c4529) {
        return (Any) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public /* synthetic */ Any(GeneratedMessage.AbstractC4137 abstractC4137, C4383 c4383) {
        this(abstractC4137);
    }

    public static Any parseFrom(byte[] bArr) {
        return (Any) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Any parseFrom(byte[] bArr, C4529 c4529) {
        return (Any) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Any parseFrom(InputStream inputStream) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static <T extends InterfaceC4285> Any pack(T t, String str) {
        return newBuilder().setTypeUrl(getTypeUrl(str, t.getDescriptorForType())).setValue(t.toByteString()).build();
    }

    public static Any parseFrom(InputStream inputStream, C4529 c4529) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Any parseFrom(AbstractC4306 abstractC4306) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Any parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    @Override // com.google.protobuf.InterfaceC4384
    public String getTypeUrl() {
        Object obj = this.typeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.typeUrl_ = stringUtf8;
        return stringUtf8;
    }
}
