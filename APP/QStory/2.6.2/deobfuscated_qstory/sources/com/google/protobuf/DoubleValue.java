package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DoubleValue extends GeneratedMessage implements InterfaceC3588 {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private double value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "DoubleValue");
        DEFAULT_INSTANCE = new DoubleValue();
        PARSER = new C3589();
    }

    private DoubleValue(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.value_ = 0.0d;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3729.f11554;
    }

    public static C3295 newBuilder(DoubleValue doubleValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(doubleValue);
    }

    public static DoubleValue of(double d) {
        return newBuilder().setValue(d).build();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) {
        return (DoubleValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) {
        return (DoubleValue) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoubleValue)) {
            return super.equals(obj);
        }
        DoubleValue doubleValue = (DoubleValue) obj;
        return Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(doubleValue.getValue()) && getUnknownFields().equals(doubleValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3729.f11554;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (Double.doubleToRawLongBits(this.value_) != 0 ? AbstractC3461.m7655(1) + 8 : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3588
    public double getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((AbstractC3401.m7515(Double.doubleToLongBits(getValue())) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3729.f11553;
        c3618.m7840(DoubleValue.class, C3295.class);
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
    public C3295 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3295(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3295 toBuilder() {
        C3589 c3589 = null;
        return this == DEFAULT_INSTANCE ? new C3295(c3589) : new C3295(c3589).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (Double.doubleToRawLongBits(this.value_) != 0) {
            abstractC3461.m7677(1, this.value_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DoubleValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3295 extends GeneratedMessage.AbstractC3304 implements InterfaceC3588 {
        private int bitField0_;
        private double value_;

        public /* synthetic */ C3295(InterfaceC3531 interfaceC3531, C3589 c3589) {
            this(interfaceC3531);
        }

        private void buildPartial0(DoubleValue doubleValue) {
            if ((this.bitField0_ & 1) != 0) {
                doubleValue.value_ = this.value_;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3729.f11554;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DoubleValue build() {
            DoubleValue doubleValueBuildPartial = buildPartial();
            if (doubleValueBuildPartial.isInitialized()) {
                return doubleValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) doubleValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DoubleValue buildPartial() {
            DoubleValue doubleValue = new DoubleValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(doubleValue);
            }
            onBuilt();
            return doubleValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3295 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.value_ = 0.0d;
            return this;
        }

        public C3295 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0.0d;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3729.f11554;
        }

        @Override // com.google.protobuf.InterfaceC3588
        public double getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3729.f11553;
            c3618.m7840(DoubleValue.class, C3295.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3295 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 9) {
                                this.value_ = abstractC3473.mo7736();
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

        public C3295 setValue(double d) {
            this.value_ = d;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3295(C3589 c3589) {
            this();
        }

        private C3295() {
        }

        private C3295(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DoubleValue getDefaultInstanceForType() {
            return DoubleValue.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3295 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DoubleValue) {
                return mergeFrom((DoubleValue) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3295 mergeFrom(DoubleValue doubleValue) {
            if (doubleValue == DoubleValue.getDefaultInstance()) {
                return this;
            }
            if (Double.doubleToRawLongBits(doubleValue.getValue()) != 0) {
                setValue(doubleValue.getValue());
            }
            mergeUnknownFields(doubleValue.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DoubleValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DoubleValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3295 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ DoubleValue(GeneratedMessage.AbstractC3304 abstractC3304, C3589 c3589) {
        this(abstractC3304);
    }

    public static C3295 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private DoubleValue() {
        this.value_ = 0.0d;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DoubleValue) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DoubleValue parseFrom(ByteString byteString) {
        return (DoubleValue) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DoubleValue parseFrom(ByteString byteString, C3696 c3696) {
        return (DoubleValue) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DoubleValue parseFrom(byte[] bArr) {
        return (DoubleValue) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DoubleValue parseFrom(byte[] bArr, C3696 c3696) {
        return (DoubleValue) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DoubleValue parseFrom(InputStream inputStream) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, C3696 c3696) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DoubleValue parseFrom(AbstractC3473 abstractC3473) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DoubleValue parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
