package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class BytesValue extends GeneratedMessage implements InterfaceC3479 {
    private static final BytesValue DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private ByteString value_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "BytesValue");
        DEFAULT_INSTANCE = new BytesValue();
        PARSER = new C3468();
    }

    private BytesValue(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.value_ = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3730.f11562;
    }

    public static C3261 newBuilder(BytesValue bytesValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bytesValue);
    }

    public static BytesValue of(ByteString byteString) {
        return newBuilder().setValue(byteString).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) {
        return (BytesValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) {
        return (BytesValue) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BytesValue)) {
            return super.equals(obj);
        }
        BytesValue bytesValue = (BytesValue) obj;
        return getValue().equals(bytesValue.getValue()) && getUnknownFields().equals(bytesValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3730.f11562;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (!this.value_.isEmpty() ? AbstractC3462.m7633(1, this.value_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3479
    public ByteString getValue() {
        return this.value_;
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
        C3619 c3619 = AbstractC3730.f11563;
        c3619.m7827(BytesValue.class, C3261.class);
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
    public C3261 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3261(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3261 toBuilder() {
        C3468 c3468 = null;
        return this == DEFAULT_INSTANCE ? new C3261(c3468) : new C3261(c3468).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!this.value_.isEmpty()) {
            abstractC3462.mo7666(1, this.value_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.BytesValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3261 extends GeneratedMessage.AbstractC3305 implements InterfaceC3479 {
        private int bitField0_;
        private ByteString value_;

        private C3261() {
            this.value_ = ByteString.EMPTY;
        }

        private void buildPartial0(BytesValue bytesValue) {
            if ((this.bitField0_ & 1) != 0) {
                bytesValue.value_ = this.value_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3730.f11562;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public BytesValue build() {
            BytesValue bytesValueBuildPartial = buildPartial();
            if (bytesValueBuildPartial.isInitialized()) {
                return bytesValueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) bytesValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public BytesValue buildPartial() {
            BytesValue bytesValue = new BytesValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(bytesValue);
            }
            onBuilt();
            return bytesValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3261 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.value_ = ByteString.EMPTY;
            return this;
        }

        public C3261 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = BytesValue.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3730.f11562;
        }

        @Override // com.google.protobuf.InterfaceC3479
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3730.f11563;
            c3619.m7827(BytesValue.class, C3261.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3261 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.value_ = abstractC3474.mo7719();
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

        public C3261 setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public BytesValue getDefaultInstanceForType() {
            return BytesValue.getDefaultInstance();
        }

        public /* synthetic */ C3261(C3468 c3468) {
            this();
        }

        public /* synthetic */ C3261(InterfaceC3532 interfaceC3532, C3468 c3468) {
            this(interfaceC3532);
        }

        private C3261(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.value_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3261 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof BytesValue) {
                return mergeFrom((BytesValue) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3261 mergeFrom(BytesValue bytesValue) {
            if (bytesValue == BytesValue.getDefaultInstance()) {
                return this;
            }
            if (!bytesValue.getValue().isEmpty()) {
                setValue(bytesValue.getValue());
            }
            mergeUnknownFields(bytesValue.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public BytesValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (BytesValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3261 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ BytesValue(GeneratedMessage.AbstractC3305 abstractC3305, C3468 c3468) {
        this(abstractC3305);
    }

    public static C3261 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private BytesValue() {
        ByteString byteString = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
        this.value_ = byteString;
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (BytesValue) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static BytesValue parseFrom(ByteString byteString) {
        return (BytesValue) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static BytesValue parseFrom(ByteString byteString, C3697 c3697) {
        return (BytesValue) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static BytesValue parseFrom(byte[] bArr) {
        return (BytesValue) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static BytesValue parseFrom(byte[] bArr, C3697 c3697) {
        return (BytesValue) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static BytesValue parseFrom(InputStream inputStream) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, C3697 c3697) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static BytesValue parseFrom(AbstractC3474 abstractC3474) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static BytesValue parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
