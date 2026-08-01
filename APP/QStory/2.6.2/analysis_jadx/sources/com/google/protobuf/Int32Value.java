package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Int32Value extends GeneratedMessage implements InterfaceC3610 {
    private static final Int32Value DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Int32Value");
        DEFAULT_INSTANCE = new Int32Value();
        PARSER = new C3609();
    }

    private Int32Value(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3729.f11565;
    }

    public static C3308 newBuilder(Int32Value int32Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(int32Value);
    }

    public static Int32Value of(int i) {
        return newBuilder().setValue(i).build();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream) {
        return (Int32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer) {
        return (Int32Value) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Int32Value)) {
            return super.equals(obj);
        }
        Int32Value int32Value = (Int32Value) obj;
        return getValue() == int32Value.getValue() && getUnknownFields().equals(int32Value.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3729.f11565;
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
        int i2 = this.value_;
        int serializedSize = getUnknownFields().getSerializedSize() + (i2 != 0 ? AbstractC3461.m7644(1, i2) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3610
    public int getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getValue() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3729.f11566;
        c3618.m7840(Int32Value.class, C3308.class);
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
    public C3308 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3308(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3308 toBuilder() {
        C3609 c3609 = null;
        return this == DEFAULT_INSTANCE ? new C3308(c3609) : new C3308(c3609).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        int i = this.value_;
        if (i != 0) {
            abstractC3461.mo7664(1, i);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Int32Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3308 extends GeneratedMessage.AbstractC3304 implements InterfaceC3610 {
        private int bitField0_;
        private int value_;

        public /* synthetic */ C3308(InterfaceC3531 interfaceC3531, C3609 c3609) {
            this(interfaceC3531);
        }

        private void buildPartial0(Int32Value int32Value) {
            if ((this.bitField0_ & 1) != 0) {
                int32Value.value_ = this.value_;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3729.f11565;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Int32Value build() {
            Int32Value int32ValueBuildPartial = buildPartial();
            if (int32ValueBuildPartial.isInitialized()) {
                return int32ValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) int32ValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Int32Value buildPartial() {
            Int32Value int32Value = new Int32Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(int32Value);
            }
            onBuilt();
            return int32Value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3308 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.value_ = 0;
            return this;
        }

        public C3308 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3729.f11565;
        }

        @Override // com.google.protobuf.InterfaceC3610
        public int getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3729.f11566;
            c3618.m7840(Int32Value.class, C3308.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3308 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 8) {
                                this.value_ = abstractC3473.mo7730();
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

        public C3308 setValue(int i) {
            this.value_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3308(C3609 c3609) {
            this();
        }

        private C3308() {
        }

        private C3308(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Int32Value getDefaultInstanceForType() {
            return Int32Value.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3308 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Int32Value) {
                return mergeFrom((Int32Value) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3308 mergeFrom(Int32Value int32Value) {
            if (int32Value == Int32Value.getDefaultInstance()) {
                return this;
            }
            if (int32Value.getValue() != 0) {
                setValue(int32Value.getValue());
            }
            mergeUnknownFields(int32Value.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Int32Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Int32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3308 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ Int32Value(GeneratedMessage.AbstractC3304 abstractC3304, C3609 c3609) {
        this(abstractC3304);
    }

    private Int32Value() {
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3308 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Int32Value) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Int32Value parseFrom(ByteString byteString) {
        return (Int32Value) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Int32Value parseFrom(ByteString byteString, C3696 c3696) {
        return (Int32Value) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Int32Value parseFrom(byte[] bArr) {
        return (Int32Value) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Int32Value parseFrom(byte[] bArr, C3696 c3696) {
        return (Int32Value) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Int32Value parseFrom(InputStream inputStream) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Int32Value parseFrom(InputStream inputStream, C3696 c3696) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Int32Value parseFrom(AbstractC3473 abstractC3473) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Int32Value parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
