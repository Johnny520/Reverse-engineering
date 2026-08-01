package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class StringValue extends GeneratedMessage implements InterfaceC4189 {
    private static final StringValue DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "StringValue");
        DEFAULT_INSTANCE = new StringValue();
        PARSER = new C4190();
    }

    private StringValue() {
        this.value_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.value_ = "";
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4562.f11909;
    }

    public static C4150 newBuilder(StringValue stringValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(stringValue);
    }

    /* JADX INFO: renamed from: of */
    public static StringValue m146of(String str) {
        return newBuilder().setValue(str).build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) {
        return (StringValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) {
        return (StringValue) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4562.f11909;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (!GeneratedMessage.isStringEmpty(this.value_) ? GeneratedMessage.computeStringSize(1, this.value_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4189
    public String getValue() {
        Object obj = this.value_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.value_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4189
    public ByteString getValueBytes() {
        Object obj = this.value_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.value_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4562.f11910;
        c4451.m8386(StringValue.class, C4150.class);
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
    public C4150 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4150(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4150 toBuilder() {
        C4190 c4190 = null;
        return this == DEFAULT_INSTANCE ? new C4150(c4190) : new C4150(c4190).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.value_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.value_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.StringValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4150 extends GeneratedMessage.AbstractC4137 implements InterfaceC4189 {
        private int bitField0_;
        private Object value_;

        private C4150() {
            this.value_ = "";
        }

        private void buildPartial0(StringValue stringValue) {
            if ((this.bitField0_ & 1) != 0) {
                stringValue.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4562.f11909;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public StringValue build() {
            StringValue stringValueBuildPartial = buildPartial();
            if (stringValueBuildPartial.isInitialized()) {
                return stringValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) stringValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public StringValue buildPartial() {
            StringValue stringValue = new StringValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(stringValue);
            }
            onBuilt();
            return stringValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4150 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.value_ = "";
            return this;
        }

        public C4150 clearValue() {
            this.value_ = StringValue.getDefaultInstance().getValue();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4562.f11909;
        }

        @Override // com.google.protobuf.InterfaceC4189
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4189
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4562.f11910;
            c4451.m8386(StringValue.class, C4150.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4150 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.value_ = abstractC4306.mo8265();
                                this.bitField0_ |= 1;
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

        public C4150 setValue(String str) {
            str.getClass();
            this.value_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4150 setValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.value_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public StringValue getDefaultInstanceForType() {
            return StringValue.getDefaultInstance();
        }

        public /* synthetic */ C4150(C4190 c4190) {
            this();
        }

        public /* synthetic */ C4150(InterfaceC4364 interfaceC4364, C4190 c4190) {
            this(interfaceC4364);
        }

        private C4150(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.value_ = "";
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4150 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof StringValue) {
                return mergeFrom((StringValue) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4150 mergeFrom(StringValue stringValue) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public StringValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (StringValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4150 newBuilderForType() {
        return newBuilder();
    }

    public static C4150 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private StringValue(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.value_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (StringValue) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public /* synthetic */ StringValue(GeneratedMessage.AbstractC4137 abstractC4137, C4190 c4190) {
        this(abstractC4137);
    }

    public static StringValue parseFrom(ByteString byteString) {
        return (StringValue) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static StringValue parseFrom(ByteString byteString, C4529 c4529) {
        return (StringValue) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static StringValue parseFrom(byte[] bArr) {
        return (StringValue) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static StringValue parseFrom(byte[] bArr, C4529 c4529) {
        return (StringValue) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static StringValue parseFrom(InputStream inputStream) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, C4529 c4529) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static StringValue parseFrom(AbstractC4306 abstractC4306) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static StringValue parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (StringValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
