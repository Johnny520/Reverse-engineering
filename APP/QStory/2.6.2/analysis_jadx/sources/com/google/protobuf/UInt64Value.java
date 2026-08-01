package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class UInt64Value extends GeneratedMessage implements InterfaceC3710 {
    private static final UInt64Value DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private long value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "UInt64Value");
        DEFAULT_INSTANCE = new UInt64Value();
        PARSER = new C3714();
    }

    private UInt64Value(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.value_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static UInt64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3729.f11562;
    }

    public static C3322 newBuilder(UInt64Value uInt64Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(uInt64Value);
    }

    public static UInt64Value of(long j) {
        return newBuilder().setValue(j).build();
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream) {
        return (UInt64Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer) {
        return (UInt64Value) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UInt64Value)) {
            return super.equals(obj);
        }
        UInt64Value uInt64Value = (UInt64Value) obj;
        return getValue() == uInt64Value.getValue() && getUnknownFields().equals(uInt64Value.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3729.f11562;
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
        long j = this.value_;
        int serializedSize = getUnknownFields().getSerializedSize() + (j != 0 ? AbstractC3461.m7650(1, j) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3710
    public long getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((AbstractC3401.m7515(getValue()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3729.f11561;
        c3618.m7840(UInt64Value.class, C3322.class);
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
    public C3322 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3322(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3322 toBuilder() {
        C3714 c3714 = null;
        return this == DEFAULT_INSTANCE ? new C3322(c3714) : new C3322(c3714).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        long j = this.value_;
        if (j != 0) {
            abstractC3461.mo7661(1, j);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.UInt64Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3322 extends GeneratedMessage.AbstractC3304 implements InterfaceC3710 {
        private int bitField0_;
        private long value_;

        public /* synthetic */ C3322(InterfaceC3531 interfaceC3531, C3714 c3714) {
            this(interfaceC3531);
        }

        private void buildPartial0(UInt64Value uInt64Value) {
            if ((this.bitField0_ & 1) != 0) {
                uInt64Value.value_ = this.value_;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3729.f11562;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public UInt64Value build() {
            UInt64Value uInt64ValueBuildPartial = buildPartial();
            if (uInt64ValueBuildPartial.isInitialized()) {
                return uInt64ValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) uInt64ValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public UInt64Value buildPartial() {
            UInt64Value uInt64Value = new UInt64Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(uInt64Value);
            }
            onBuilt();
            return uInt64Value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3322 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.value_ = 0L;
            return this;
        }

        public C3322 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3729.f11562;
        }

        @Override // com.google.protobuf.InterfaceC3710
        public long getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3729.f11561;
            c3618.m7840(UInt64Value.class, C3322.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3322 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 8) {
                                this.value_ = abstractC3473.mo7716();
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

        public C3322 setValue(long j) {
            this.value_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3322(C3714 c3714) {
            this();
        }

        private C3322() {
        }

        private C3322(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public UInt64Value getDefaultInstanceForType() {
            return UInt64Value.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3322 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof UInt64Value) {
                return mergeFrom((UInt64Value) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3322 mergeFrom(UInt64Value uInt64Value) {
            if (uInt64Value == UInt64Value.getDefaultInstance()) {
                return this;
            }
            if (uInt64Value.getValue() != 0) {
                setValue(uInt64Value.getValue());
            }
            mergeUnknownFields(uInt64Value.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public UInt64Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (UInt64Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3322 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ UInt64Value(GeneratedMessage.AbstractC3304 abstractC3304, C3714 c3714) {
        this(abstractC3304);
    }

    public static C3322 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private UInt64Value() {
        this.value_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (UInt64Value) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static UInt64Value parseFrom(ByteString byteString) {
        return (UInt64Value) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static UInt64Value parseFrom(ByteString byteString, C3696 c3696) {
        return (UInt64Value) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static UInt64Value parseFrom(byte[] bArr) {
        return (UInt64Value) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static UInt64Value parseFrom(byte[] bArr, C3696 c3696) {
        return (UInt64Value) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static UInt64Value parseFrom(InputStream inputStream) {
        return (UInt64Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static UInt64Value parseFrom(InputStream inputStream, C3696 c3696) {
        return (UInt64Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static UInt64Value parseFrom(AbstractC3473 abstractC3473) {
        return (UInt64Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static UInt64Value parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (UInt64Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
