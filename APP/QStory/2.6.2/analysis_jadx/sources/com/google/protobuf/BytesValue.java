package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class BytesValue extends GeneratedMessage implements InterfaceC3478 {
    private static final BytesValue DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private ByteString value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "BytesValue");
        DEFAULT_INSTANCE = new BytesValue();
        PARSER = new C3467();
    }

    private BytesValue(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.value_ = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3729.f11557;
    }

    public static C3260 newBuilder(BytesValue bytesValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bytesValue);
    }

    public static BytesValue of(ByteString byteString) {
        return newBuilder().setValue(byteString).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) {
        return (BytesValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) {
        return (BytesValue) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3729.f11557;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (!this.value_.isEmpty() ? AbstractC3461.m7646(1, this.value_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3478
    public ByteString getValue() {
        return this.value_;
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
        C3618 c3618 = AbstractC3729.f11558;
        c3618.m7840(BytesValue.class, C3260.class);
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
    public C3260 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3260(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3260 toBuilder() {
        C3467 c3467 = null;
        return this == DEFAULT_INSTANCE ? new C3260(c3467) : new C3260(c3467).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!this.value_.isEmpty()) {
            abstractC3461.mo7679(1, this.value_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.BytesValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3260 extends GeneratedMessage.AbstractC3304 implements InterfaceC3478 {
        private int bitField0_;
        private ByteString value_;

        private C3260() {
            this.value_ = ByteString.EMPTY;
        }

        private void buildPartial0(BytesValue bytesValue) {
            if ((this.bitField0_ & 1) != 0) {
                bytesValue.value_ = this.value_;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3729.f11557;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public BytesValue build() {
            BytesValue bytesValueBuildPartial = buildPartial();
            if (bytesValueBuildPartial.isInitialized()) {
                return bytesValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) bytesValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public BytesValue buildPartial() {
            BytesValue bytesValue = new BytesValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(bytesValue);
            }
            onBuilt();
            return bytesValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3260 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.value_ = ByteString.EMPTY;
            return this;
        }

        public C3260 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = BytesValue.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3729.f11557;
        }

        @Override // com.google.protobuf.InterfaceC3478
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3729.f11558;
            c3618.m7840(BytesValue.class, C3260.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3260 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.value_ = abstractC3473.mo7732();
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

        public C3260 setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public BytesValue getDefaultInstanceForType() {
            return BytesValue.getDefaultInstance();
        }

        public /* synthetic */ C3260(C3467 c3467) {
            this();
        }

        public /* synthetic */ C3260(InterfaceC3531 interfaceC3531, C3467 c3467) {
            this(interfaceC3531);
        }

        private C3260(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.value_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3260 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof BytesValue) {
                return mergeFrom((BytesValue) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3260 mergeFrom(BytesValue bytesValue) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public BytesValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (BytesValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3260 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ BytesValue(GeneratedMessage.AbstractC3304 abstractC3304, C3467 c3467) {
        this(abstractC3304);
    }

    public static C3260 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private BytesValue() {
        ByteString byteString = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
        this.value_ = byteString;
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (BytesValue) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static BytesValue parseFrom(ByteString byteString) {
        return (BytesValue) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static BytesValue parseFrom(ByteString byteString, C3696 c3696) {
        return (BytesValue) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static BytesValue parseFrom(byte[] bArr) {
        return (BytesValue) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static BytesValue parseFrom(byte[] bArr, C3696 c3696) {
        return (BytesValue) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static BytesValue parseFrom(InputStream inputStream) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, C3696 c3696) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static BytesValue parseFrom(AbstractC3473 abstractC3473) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static BytesValue parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
