package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class StringValue extends GeneratedMessage implements InterfaceC3356 {
    private static final StringValue DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "StringValue");
        DEFAULT_INSTANCE = new StringValue();
        PARSER = new C3357();
    }

    private StringValue() {
        this.value_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.value_ = "";
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3729.f11559;
    }

    public static C3317 newBuilder(StringValue stringValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(stringValue);
    }

    public static StringValue of(String str) {
        return newBuilder().setValue(str).build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) {
        return (StringValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) {
        return (StringValue) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StringValue)) {
            return super.equals(obj);
        }
        StringValue stringValue = (StringValue) obj;
        return getValue().equals(stringValue.getValue()) && getUnknownFields().equals(stringValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3729.f11559;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (!GeneratedMessage.isStringEmpty(this.value_) ? GeneratedMessage.computeStringSize(1, this.value_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3356
    public String getValue() {
        Object obj = this.value_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.value_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3356
    public ByteString getValueBytes() {
        Object obj = this.value_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.value_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getValue().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3729.f11560;
        c3618.m7840(StringValue.class, C3317.class);
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
    public C3317 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3317(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3317 toBuilder() {
        C3357 c3357 = null;
        return this == DEFAULT_INSTANCE ? new C3317(c3357) : new C3317(c3357).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.value_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.value_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.StringValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3317 extends GeneratedMessage.AbstractC3304 implements InterfaceC3356 {
        private int bitField0_;
        private Object value_;

        private C3317() {
            this.value_ = "";
        }

        private void buildPartial0(StringValue stringValue) {
            if ((this.bitField0_ & 1) != 0) {
                stringValue.value_ = this.value_;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3729.f11559;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public StringValue build() {
            StringValue stringValueBuildPartial = buildPartial();
            if (stringValueBuildPartial.isInitialized()) {
                return stringValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) stringValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public StringValue buildPartial() {
            StringValue stringValue = new StringValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(stringValue);
            }
            onBuilt();
            return stringValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3317 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.value_ = "";
            return this;
        }

        public C3317 clearValue() {
            this.value_ = StringValue.getDefaultInstance().getValue();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3729.f11559;
        }

        @Override // com.google.protobuf.InterfaceC3356
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3356
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3729.f11560;
            c3618.m7840(StringValue.class, C3317.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3317 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.value_ = abstractC3473.mo7719();
                                this.bitField0_ |= 1;
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

        public C3317 setValue(String str) {
            str.getClass();
            this.value_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3317 setValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.value_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public StringValue getDefaultInstanceForType() {
            return StringValue.getDefaultInstance();
        }

        public /* synthetic */ C3317(C3357 c3357) {
            this();
        }

        public /* synthetic */ C3317(InterfaceC3531 interfaceC3531, C3357 c3357) {
            this(interfaceC3531);
        }

        private C3317(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.value_ = "";
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3317 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof StringValue) {
                return mergeFrom((StringValue) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3317 mergeFrom(StringValue stringValue) {
            if (stringValue == StringValue.getDefaultInstance()) {
                return this;
            }
            if (!stringValue.getValue().isEmpty()) {
                this.value_ = stringValue.value_;
                this.bitField0_ |= 1;
                onChanged();
            }
            mergeUnknownFields(stringValue.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public StringValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (StringValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3317 newBuilderForType() {
        return newBuilder();
    }

    public static C3317 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private StringValue(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.value_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (StringValue) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public /* synthetic */ StringValue(GeneratedMessage.AbstractC3304 abstractC3304, C3357 c3357) {
        this(abstractC3304);
    }

    public static StringValue parseFrom(ByteString byteString) {
        return (StringValue) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static StringValue parseFrom(ByteString byteString, C3696 c3696) {
        return (StringValue) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static StringValue parseFrom(byte[] bArr) {
        return (StringValue) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static StringValue parseFrom(byte[] bArr, C3696 c3696) {
        return (StringValue) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static StringValue parseFrom(InputStream inputStream) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, C3696 c3696) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static StringValue parseFrom(AbstractC3473 abstractC3473) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static StringValue parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
