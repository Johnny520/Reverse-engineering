package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class UInt32Value extends GeneratedMessage implements InterfaceC3713 {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "UInt32Value");
        DEFAULT_INSTANCE = new UInt32Value();
        PARSER = new C3697();
    }

    private UInt32Value(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3729.f11563;
    }

    public static C3321 newBuilder(UInt32Value uInt32Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(uInt32Value);
    }

    public static UInt32Value of(int i) {
        return newBuilder().setValue(i).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) {
        return (UInt32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) {
        return (UInt32Value) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UInt32Value)) {
            return super.equals(obj);
        }
        UInt32Value uInt32Value = (UInt32Value) obj;
        return getValue() == uInt32Value.getValue() && getUnknownFields().equals(uInt32Value.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3729.f11563;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (i2 != 0 ? AbstractC3461.m7649(1, i2) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3713
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
        C3618 c3618 = AbstractC3729.f11564;
        c3618.m7840(UInt32Value.class, C3321.class);
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
    public C3321 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3321(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3321 toBuilder() {
        C3697 c3697 = null;
        return this == DEFAULT_INSTANCE ? new C3321(c3697) : new C3321(c3697).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        int i = this.value_;
        if (i != 0) {
            abstractC3461.mo7659(1, i);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.UInt32Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3321 extends GeneratedMessage.AbstractC3304 implements InterfaceC3713 {
        private int bitField0_;
        private int value_;

        public /* synthetic */ C3321(InterfaceC3531 interfaceC3531, C3697 c3697) {
            this(interfaceC3531);
        }

        private void buildPartial0(UInt32Value uInt32Value) {
            if ((this.bitField0_ & 1) != 0) {
                uInt32Value.value_ = this.value_;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3729.f11563;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public UInt32Value build() {
            UInt32Value uInt32ValueBuildPartial = buildPartial();
            if (uInt32ValueBuildPartial.isInitialized()) {
                return uInt32ValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) uInt32ValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public UInt32Value buildPartial() {
            UInt32Value uInt32Value = new UInt32Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(uInt32Value);
            }
            onBuilt();
            return uInt32Value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3321 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.value_ = 0;
            return this;
        }

        public C3321 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3729.f11563;
        }

        @Override // com.google.protobuf.InterfaceC3713
        public int getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3729.f11564;
            c3618.m7840(UInt32Value.class, C3321.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3321 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 8) {
                                this.value_ = abstractC3473.mo7717();
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

        public C3321 setValue(int i) {
            this.value_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3321(C3697 c3697) {
            this();
        }

        private C3321() {
        }

        private C3321(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public UInt32Value getDefaultInstanceForType() {
            return UInt32Value.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3321 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof UInt32Value) {
                return mergeFrom((UInt32Value) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3321 mergeFrom(UInt32Value uInt32Value) {
            if (uInt32Value == UInt32Value.getDefaultInstance()) {
                return this;
            }
            if (uInt32Value.getValue() != 0) {
                setValue(uInt32Value.getValue());
            }
            mergeUnknownFields(uInt32Value.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public UInt32Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (UInt32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3321 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ UInt32Value(GeneratedMessage.AbstractC3304 abstractC3304, C3697 c3697) {
        this(abstractC3304);
    }

    private UInt32Value() {
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3321 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (UInt32Value) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static UInt32Value parseFrom(ByteString byteString) {
        return (UInt32Value) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static UInt32Value parseFrom(ByteString byteString, C3696 c3696) {
        return (UInt32Value) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static UInt32Value parseFrom(byte[] bArr) {
        return (UInt32Value) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static UInt32Value parseFrom(byte[] bArr, C3696 c3696) {
        return (UInt32Value) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static UInt32Value parseFrom(InputStream inputStream) {
        return (UInt32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, C3696 c3696) {
        return (UInt32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static UInt32Value parseFrom(AbstractC3473 abstractC3473) {
        return (UInt32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static UInt32Value parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (UInt32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
