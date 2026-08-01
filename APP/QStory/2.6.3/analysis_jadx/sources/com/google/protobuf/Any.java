package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p009.AbstractC6183;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Any extends GeneratedMessage implements InterfaceC3552 {
    private static final Any DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile InterfaceC3453 cachedUnpackValue;
    private byte memoizedIsInitialized;
    private volatile Object typeUrl_;
    private ByteString value_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Any");
        DEFAULT_INSTANCE = new Any();
        PARSER = new C3551();
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

    public static final C3663 getDescriptor() {
        return AbstractC3549.f11202;
    }

    private static String getTypeNameFromTypeUrl(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf + 1);
    }

    private static String getTypeUrl(String str, C3663 c3663) {
        if (str.endsWith("/")) {
            StringBuilder sbM140 = AbstractC0053.m140(str);
            sbM140.append(c3663.f11373);
            return sbM140.toString();
        }
        StringBuilder sbM11584 = AbstractC6183.m11584(str, "/");
        sbM11584.append(c3663.f11373);
        return sbM11584.toString();
    }

    public static C3258 newBuilder(Any any) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(any);
    }

    public static <T extends InterfaceC3453> Any pack(T t) {
        return newBuilder().setTypeUrl(getTypeUrl("type.googleapis.com", t.getDescriptorForType())).setValue(t.toByteString()).build();
    }

    public static Any parseDelimitedFrom(InputStream inputStream) {
        return (Any) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) {
        return (Any) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3549.f11202;
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
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.typeUrl_) ? GeneratedMessage.computeStringSize(1, this.typeUrl_) : 0;
        if (!this.value_.isEmpty()) {
            iComputeStringSize += AbstractC3462.m7633(2, this.value_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3552
    public ByteString getTypeUrlBytes() {
        Object obj = this.typeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.typeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3552
    public ByteString getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3549.f11201;
        c3619.m7827(Any.class, C3258.class);
        return c3619;
    }

    public <T extends InterfaceC3453> boolean is(Class<T> cls) {
        return getTypeNameFromTypeUrl(getTypeUrl()).equals(((InterfaceC3453) AbstractC3402.m7504(cls)).getDescriptorForType().f11373);
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

    public boolean isSameTypeAs(InterfaceC3453 interfaceC3453) {
        return getTypeNameFromTypeUrl(getTypeUrl()).equals(interfaceC3453.getDescriptorForType().f11373);
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3258 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3258(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3258 toBuilder() {
        C3551 c3551 = null;
        return this == DEFAULT_INSTANCE ? new C3258(c3551) : new C3258(c3551).mergeFrom(this);
    }

    public <T extends InterfaceC3453> T unpack(Class<T> cls) throws InvalidProtocolBufferException {
        if (this.cachedUnpackValue != null) {
            if (this.cachedUnpackValue.getClass() == cls) {
                return (T) this.cachedUnpackValue;
            }
        } else if (is(cls)) {
            T t = (T) ((AbstractC3528) ((InterfaceC3453) AbstractC3402.m7504(cls)).getParserForType()).m7754(getValue(), AbstractC3528.f11174);
            this.cachedUnpackValue = t;
            return t;
        }
        throw new InvalidProtocolBufferException("Type of the Any message does not match the given class.");
    }

    public <T extends InterfaceC3453> T unpackSameTypeAs(T t) throws InvalidProtocolBufferException {
        if (this.cachedUnpackValue != null) {
            if (this.cachedUnpackValue.getClass() == t.getClass()) {
                return (T) this.cachedUnpackValue;
            }
        } else if (isSameTypeAs(t)) {
            T t2 = (T) ((AbstractC3528) t.getParserForType()).m7754(getValue(), AbstractC3528.f11174);
            this.cachedUnpackValue = t2;
            return t2;
        }
        throw new InvalidProtocolBufferException("Type of the Any message does not match the given exemplar.");
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.typeUrl_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.typeUrl_);
        }
        if (!this.value_.isEmpty()) {
            abstractC3462.mo7666(2, this.value_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Any$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3258 extends GeneratedMessage.AbstractC3305 implements InterfaceC3552 {
        private int bitField0_;
        private Object typeUrl_;
        private ByteString value_;

        private C3258() {
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

        public static final C3663 getDescriptor() {
            return AbstractC3549.f11202;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Any build() {
            Any anyBuildPartial = buildPartial();
            if (anyBuildPartial.isInitialized()) {
                return anyBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) anyBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Any buildPartial() {
            Any any = new Any(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(any);
            }
            onBuilt();
            return any;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3258 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.typeUrl_ = "";
            this.value_ = ByteString.EMPTY;
            return this;
        }

        public C3258 clearTypeUrl() {
            this.typeUrl_ = Any.getDefaultInstance().getTypeUrl();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3258 clearValue() {
            this.bitField0_ &= -3;
            this.value_ = Any.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3549.f11202;
        }

        @Override // com.google.protobuf.InterfaceC3552
        public String getTypeUrl() {
            Object obj = this.typeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.typeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3552
        public ByteString getTypeUrlBytes() {
            Object obj = this.typeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3552
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3549.f11201;
            c3619.m7827(Any.class, C3258.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3258 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.typeUrl_ = abstractC3474.mo7706();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 18) {
                                this.value_ = abstractC3474.mo7719();
                                this.bitField0_ |= 2;
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

        public C3258 setTypeUrl(String str) {
            str.getClass();
            this.typeUrl_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3258 setTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.typeUrl_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3258 setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Any getDefaultInstanceForType() {
            return Any.getDefaultInstance();
        }

        public /* synthetic */ C3258(C3551 c3551) {
            this();
        }

        public /* synthetic */ C3258(InterfaceC3532 interfaceC3532, C3551 c3551) {
            this(interfaceC3532);
        }

        private C3258(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.typeUrl_ = "";
            this.value_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3258 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Any) {
                return mergeFrom((Any) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3258 mergeFrom(Any any) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Any getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Any parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Any) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3258 newBuilderForType() {
        return newBuilder();
    }

    public static C3258 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Any parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Any) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Any parseFrom(ByteString byteString) {
        return (Any) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    private Any(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.typeUrl_ = "";
        this.value_ = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Any parseFrom(ByteString byteString, C3697 c3697) {
        return (Any) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public /* synthetic */ Any(GeneratedMessage.AbstractC3305 abstractC3305, C3551 c3551) {
        this(abstractC3305);
    }

    public static Any parseFrom(byte[] bArr) {
        return (Any) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Any parseFrom(byte[] bArr, C3697 c3697) {
        return (Any) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Any parseFrom(InputStream inputStream) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static <T extends InterfaceC3453> Any pack(T t, String str) {
        return newBuilder().setTypeUrl(getTypeUrl(str, t.getDescriptorForType())).setValue(t.toByteString()).build();
    }

    public static Any parseFrom(InputStream inputStream, C3697 c3697) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Any parseFrom(AbstractC3474 abstractC3474) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Any parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    @Override // com.google.protobuf.InterfaceC3552
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
