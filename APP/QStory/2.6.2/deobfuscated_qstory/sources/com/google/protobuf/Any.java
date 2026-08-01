package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Any extends GeneratedMessage implements InterfaceC3551 {
    private static final Any DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile InterfaceC3452 cachedUnpackValue;
    private byte memoizedIsInitialized;
    private volatile Object typeUrl_;
    private ByteString value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Any");
        DEFAULT_INSTANCE = new Any();
        PARSER = new C3550();
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

    public static final C3662 getDescriptor() {
        return AbstractC3548.f11197;
    }

    private static String getTypeNameFromTypeUrl(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf + 1);
    }

    private static String getTypeUrl(String str, C3662 c3662) {
        if (str.endsWith("/")) {
            StringBuilder sbM149 = AbstractC0053.m149(str);
            sbM149.append(c3662.f11368);
            return sbM149.toString();
        }
        StringBuilder sbM11553 = AbstractC6136.m11553(str, "/");
        sbM11553.append(c3662.f11368);
        return sbM11553.toString();
    }

    public static C3257 newBuilder(Any any) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(any);
    }

    public static <T extends InterfaceC3452> Any pack(T t) {
        return newBuilder().setTypeUrl(getTypeUrl("type.googleapis.com", t.getDescriptorForType())).setValue(t.toByteString()).build();
    }

    public static Any parseDelimitedFrom(InputStream inputStream) {
        return (Any) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) {
        return (Any) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3548.f11197;
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
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.typeUrl_) ? GeneratedMessage.computeStringSize(1, this.typeUrl_) : 0;
        if (!this.value_.isEmpty()) {
            iComputeStringSize += AbstractC3461.m7646(2, this.value_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3551
    public ByteString getTypeUrlBytes() {
        Object obj = this.typeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.typeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3551
    public ByteString getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3548.f11196;
        c3618.m7840(Any.class, C3257.class);
        return c3618;
    }

    public <T extends InterfaceC3452> boolean is(Class<T> cls) {
        return getTypeNameFromTypeUrl(getTypeUrl()).equals(((InterfaceC3452) AbstractC3401.m7517(cls)).getDescriptorForType().f11368);
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

    public boolean isSameTypeAs(InterfaceC3452 interfaceC3452) {
        return getTypeNameFromTypeUrl(getTypeUrl()).equals(interfaceC3452.getDescriptorForType().f11368);
    }

    @Override // com.google.protobuf.AbstractC3532
    public C3257 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3257(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3257 toBuilder() {
        C3550 c3550 = null;
        return this == DEFAULT_INSTANCE ? new C3257(c3550) : new C3257(c3550).mergeFrom(this);
    }

    public <T extends InterfaceC3452> T unpack(Class<T> cls) throws InvalidProtocolBufferException {
        if (this.cachedUnpackValue != null) {
            if (this.cachedUnpackValue.getClass() == cls) {
                return (T) this.cachedUnpackValue;
            }
        } else if (is(cls)) {
            T t = (T) ((AbstractC3527) ((InterfaceC3452) AbstractC3401.m7517(cls)).getParserForType()).m7767(getValue(), AbstractC3527.f11169);
            this.cachedUnpackValue = t;
            return t;
        }
        throw new InvalidProtocolBufferException("Type of the Any message does not match the given class.");
    }

    public <T extends InterfaceC3452> T unpackSameTypeAs(T t) throws InvalidProtocolBufferException {
        if (this.cachedUnpackValue != null) {
            if (this.cachedUnpackValue.getClass() == t.getClass()) {
                return (T) this.cachedUnpackValue;
            }
        } else if (isSameTypeAs(t)) {
            T t2 = (T) ((AbstractC3527) t.getParserForType()).m7767(getValue(), AbstractC3527.f11169);
            this.cachedUnpackValue = t2;
            return t2;
        }
        throw new InvalidProtocolBufferException("Type of the Any message does not match the given exemplar.");
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.typeUrl_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.typeUrl_);
        }
        if (!this.value_.isEmpty()) {
            abstractC3461.mo7679(2, this.value_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Any$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3257 extends GeneratedMessage.AbstractC3304 implements InterfaceC3551 {
        private int bitField0_;
        private Object typeUrl_;
        private ByteString value_;

        private C3257() {
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

        public static final C3662 getDescriptor() {
            return AbstractC3548.f11197;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Any build() {
            Any anyBuildPartial = buildPartial();
            if (anyBuildPartial.isInitialized()) {
                return anyBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) anyBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Any buildPartial() {
            Any any = new Any(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(any);
            }
            onBuilt();
            return any;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3257 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.typeUrl_ = "";
            this.value_ = ByteString.EMPTY;
            return this;
        }

        public C3257 clearTypeUrl() {
            this.typeUrl_ = Any.getDefaultInstance().getTypeUrl();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3257 clearValue() {
            this.bitField0_ &= -3;
            this.value_ = Any.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3548.f11197;
        }

        @Override // com.google.protobuf.InterfaceC3551
        public String getTypeUrl() {
            Object obj = this.typeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.typeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3551
        public ByteString getTypeUrlBytes() {
            Object obj = this.typeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3551
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3548.f11196;
            c3618.m7840(Any.class, C3257.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3257 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.typeUrl_ = abstractC3473.mo7719();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 18) {
                                this.value_ = abstractC3473.mo7732();
                                this.bitField0_ |= 2;
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

        public C3257 setTypeUrl(String str) {
            str.getClass();
            this.typeUrl_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3257 setTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.typeUrl_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3257 setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Any getDefaultInstanceForType() {
            return Any.getDefaultInstance();
        }

        public /* synthetic */ C3257(C3550 c3550) {
            this();
        }

        public /* synthetic */ C3257(InterfaceC3531 interfaceC3531, C3550 c3550) {
            this(interfaceC3531);
        }

        private C3257(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.typeUrl_ = "";
            this.value_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3257 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Any) {
                return mergeFrom((Any) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3257 mergeFrom(Any any) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Any getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Any parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Any) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3257 newBuilderForType() {
        return newBuilder();
    }

    public static C3257 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Any parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Any) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Any parseFrom(ByteString byteString) {
        return (Any) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    private Any(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.typeUrl_ = "";
        this.value_ = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Any parseFrom(ByteString byteString, C3696 c3696) {
        return (Any) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public /* synthetic */ Any(GeneratedMessage.AbstractC3304 abstractC3304, C3550 c3550) {
        this(abstractC3304);
    }

    public static Any parseFrom(byte[] bArr) {
        return (Any) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Any parseFrom(byte[] bArr, C3696 c3696) {
        return (Any) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Any parseFrom(InputStream inputStream) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static <T extends InterfaceC3452> Any pack(T t, String str) {
        return newBuilder().setTypeUrl(getTypeUrl(str, t.getDescriptorForType())).setValue(t.toByteString()).build();
    }

    public static Any parseFrom(InputStream inputStream, C3696 c3696) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Any parseFrom(AbstractC3473 abstractC3473) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Any parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Any) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }

    @Override // com.google.protobuf.InterfaceC3551
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
