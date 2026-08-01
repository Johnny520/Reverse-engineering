package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class StringValue extends GeneratedMessage implements InterfaceC3357 {
    private static final StringValue DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object value_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "StringValue");
        DEFAULT_INSTANCE = new StringValue();
        PARSER = new C3358();
    }

    private StringValue() {
        this.value_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.value_ = "";
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3730.f11564;
    }

    public static C3318 newBuilder(StringValue stringValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(stringValue);
    }

    public static StringValue of(String str) {
        return newBuilder().setValue(str).build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) {
        return (StringValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) {
        return (StringValue) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3730.f11564;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (!GeneratedMessage.isStringEmpty(this.value_) ? GeneratedMessage.computeStringSize(1, this.value_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3357
    public String getValue() {
        Object obj = this.value_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.value_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3357
    public ByteString getValueBytes() {
        Object obj = this.value_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.value_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3730.f11565;
        c3619.m7827(StringValue.class, C3318.class);
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
    public C3318 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3318(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3318 toBuilder() {
        C3358 c3358 = null;
        return this == DEFAULT_INSTANCE ? new C3318(c3358) : new C3318(c3358).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.value_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.value_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.StringValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3318 extends GeneratedMessage.AbstractC3305 implements InterfaceC3357 {
        private int bitField0_;
        private Object value_;

        private C3318() {
            this.value_ = "";
        }

        private void buildPartial0(StringValue stringValue) {
            if ((this.bitField0_ & 1) != 0) {
                stringValue.value_ = this.value_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3730.f11564;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public StringValue build() {
            StringValue stringValueBuildPartial = buildPartial();
            if (stringValueBuildPartial.isInitialized()) {
                return stringValueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) stringValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public StringValue buildPartial() {
            StringValue stringValue = new StringValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(stringValue);
            }
            onBuilt();
            return stringValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3318 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.value_ = "";
            return this;
        }

        public C3318 clearValue() {
            this.value_ = StringValue.getDefaultInstance().getValue();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3730.f11564;
        }

        @Override // com.google.protobuf.InterfaceC3357
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3357
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3730.f11565;
            c3619.m7827(StringValue.class, C3318.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3318 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.value_ = abstractC3474.mo7706();
                                this.bitField0_ |= 1;
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

        public C3318 setValue(String str) {
            str.getClass();
            this.value_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3318 setValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.value_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public StringValue getDefaultInstanceForType() {
            return StringValue.getDefaultInstance();
        }

        public /* synthetic */ C3318(C3358 c3358) {
            this();
        }

        public /* synthetic */ C3318(InterfaceC3532 interfaceC3532, C3358 c3358) {
            this(interfaceC3532);
        }

        private C3318(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.value_ = "";
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3318 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof StringValue) {
                return mergeFrom((StringValue) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3318 mergeFrom(StringValue stringValue) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public StringValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (StringValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3318 newBuilderForType() {
        return newBuilder();
    }

    public static C3318 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private StringValue(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.value_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (StringValue) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public /* synthetic */ StringValue(GeneratedMessage.AbstractC3305 abstractC3305, C3358 c3358) {
        this(abstractC3305);
    }

    public static StringValue parseFrom(ByteString byteString) {
        return (StringValue) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static StringValue parseFrom(ByteString byteString, C3697 c3697) {
        return (StringValue) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static StringValue parseFrom(byte[] bArr) {
        return (StringValue) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static StringValue parseFrom(byte[] bArr, C3697 c3697) {
        return (StringValue) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static StringValue parseFrom(InputStream inputStream) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, C3697 c3697) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static StringValue parseFrom(AbstractC3474 abstractC3474) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static StringValue parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
