package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class BoolValue extends GeneratedMessage implements InterfaceC3535 {
    private static final BoolValue DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private boolean value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "BoolValue");
        DEFAULT_INSTANCE = new BoolValue();
        PARSER = new C3543();
    }

    private BoolValue(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.value_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3729.f11556;
    }

    public static C3259 newBuilder(BoolValue boolValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(boolValue);
    }

    public static BoolValue of(boolean z) {
        return newBuilder().setValue(z).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) {
        return (BoolValue) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoolValue)) {
            return super.equals(obj);
        }
        BoolValue boolValue = (BoolValue) obj;
        return getValue() == boolValue.getValue() && getUnknownFields().equals(boolValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3729.f11556;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (this.value_ ? AbstractC3461.m7647(1) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3535
    public boolean getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((AbstractC3401.m7516(getValue()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3729.f11555;
        c3618.m7840(BoolValue.class, C3259.class);
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
    public C3259 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3259(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3259 toBuilder() {
        C3543 c3543 = null;
        return this == DEFAULT_INSTANCE ? new C3259(c3543) : new C3259(c3543).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        boolean z = this.value_;
        if (z) {
            abstractC3461.mo7676(1, z);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.BoolValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3259 extends GeneratedMessage.AbstractC3304 implements InterfaceC3535 {
        private int bitField0_;
        private boolean value_;

        public /* synthetic */ C3259(InterfaceC3531 interfaceC3531, C3543 c3543) {
            this(interfaceC3531);
        }

        private void buildPartial0(BoolValue boolValue) {
            if ((this.bitField0_ & 1) != 0) {
                boolValue.value_ = this.value_;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3729.f11556;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public BoolValue build() {
            BoolValue boolValueBuildPartial = buildPartial();
            if (boolValueBuildPartial.isInitialized()) {
                return boolValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) boolValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public BoolValue buildPartial() {
            BoolValue boolValue = new BoolValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(boolValue);
            }
            onBuilt();
            return boolValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3259 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.value_ = false;
            return this;
        }

        public C3259 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3729.f11556;
        }

        @Override // com.google.protobuf.InterfaceC3535
        public boolean getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3729.f11555;
            c3618.m7840(BoolValue.class, C3259.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3259 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 8) {
                                this.value_ = abstractC3473.mo7733();
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

        public C3259 setValue(boolean z) {
            this.value_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3259(C3543 c3543) {
            this();
        }

        private C3259() {
        }

        private C3259(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public BoolValue getDefaultInstanceForType() {
            return BoolValue.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3259 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof BoolValue) {
                return mergeFrom((BoolValue) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3259 mergeFrom(BoolValue boolValue) {
            if (boolValue == BoolValue.getDefaultInstance()) {
                return this;
            }
            if (boolValue.getValue()) {
                setValue(boolValue.getValue());
            }
            mergeUnknownFields(boolValue.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public BoolValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (BoolValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3259 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ BoolValue(GeneratedMessage.AbstractC3304 abstractC3304, C3543 c3543) {
        this(abstractC3304);
    }

    private BoolValue() {
        this.value_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3259 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (BoolValue) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static BoolValue parseFrom(ByteString byteString) {
        return (BoolValue) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static BoolValue parseFrom(ByteString byteString, C3696 c3696) {
        return (BoolValue) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static BoolValue parseFrom(byte[] bArr) {
        return (BoolValue) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static BoolValue parseFrom(byte[] bArr, C3696 c3696) {
        return (BoolValue) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static BoolValue parseFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, C3696 c3696) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static BoolValue parseFrom(AbstractC3473 abstractC3473) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static BoolValue parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
