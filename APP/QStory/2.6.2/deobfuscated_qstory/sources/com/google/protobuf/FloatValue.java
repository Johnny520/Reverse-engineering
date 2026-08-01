package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class FloatValue extends GeneratedMessage implements InterfaceC3641 {
    private static final FloatValue DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private float value_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FloatValue");
        DEFAULT_INSTANCE = new FloatValue();
        PARSER = new C3637();
    }

    private FloatValue(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.value_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3729.f11552;
    }

    public static C3302 newBuilder(FloatValue floatValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(floatValue);
    }

    public static FloatValue of(float f) {
        return newBuilder().setValue(f).build();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) {
        return (FloatValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) {
        return (FloatValue) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatValue)) {
            return super.equals(obj);
        }
        FloatValue floatValue = (FloatValue) obj;
        return Float.floatToIntBits(getValue()) == Float.floatToIntBits(floatValue.getValue()) && getUnknownFields().equals(floatValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3729.f11552;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (Float.floatToRawIntBits(this.value_) != 0 ? AbstractC3461.m7655(1) + 4 : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3641
    public float getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((Float.floatToIntBits(getValue()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3729.f11551;
        c3618.m7840(FloatValue.class, C3302.class);
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
    public C3302 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3302(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3302 toBuilder() {
        C3637 c3637 = null;
        return this == DEFAULT_INSTANCE ? new C3302(c3637) : new C3302(c3637).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (Float.floatToRawIntBits(this.value_) != 0) {
            float f = this.value_;
            abstractC3461.getClass();
            abstractC3461.mo7678(1, Float.floatToRawIntBits(f));
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.FloatValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3302 extends GeneratedMessage.AbstractC3304 implements InterfaceC3641 {
        private int bitField0_;
        private float value_;

        public /* synthetic */ C3302(InterfaceC3531 interfaceC3531, C3637 c3637) {
            this(interfaceC3531);
        }

        private void buildPartial0(FloatValue floatValue) {
            if ((this.bitField0_ & 1) != 0) {
                floatValue.value_ = this.value_;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3729.f11552;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public FloatValue build() {
            FloatValue floatValueBuildPartial = buildPartial();
            if (floatValueBuildPartial.isInitialized()) {
                return floatValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) floatValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public FloatValue buildPartial() {
            FloatValue floatValue = new FloatValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(floatValue);
            }
            onBuilt();
            return floatValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3302 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.value_ = 0.0f;
            return this;
        }

        public C3302 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0.0f;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3729.f11552;
        }

        @Override // com.google.protobuf.InterfaceC3641
        public float getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3729.f11551;
            c3618.m7840(FloatValue.class, C3302.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3302 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 13) {
                                this.value_ = abstractC3473.mo7727();
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

        public C3302 setValue(float f) {
            this.value_ = f;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3302(C3637 c3637) {
            this();
        }

        private C3302() {
        }

        private C3302(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public FloatValue getDefaultInstanceForType() {
            return FloatValue.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3302 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof FloatValue) {
                return mergeFrom((FloatValue) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3302 mergeFrom(FloatValue floatValue) {
            if (floatValue == FloatValue.getDefaultInstance()) {
                return this;
            }
            if (Float.floatToRawIntBits(floatValue.getValue()) != 0) {
                setValue(floatValue.getValue());
            }
            mergeUnknownFields(floatValue.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public FloatValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (FloatValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3302 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ FloatValue(GeneratedMessage.AbstractC3304 abstractC3304, C3637 c3637) {
        this(abstractC3304);
    }

    private FloatValue() {
        this.value_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3302 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (FloatValue) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static FloatValue parseFrom(ByteString byteString) {
        return (FloatValue) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static FloatValue parseFrom(ByteString byteString, C3696 c3696) {
        return (FloatValue) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static FloatValue parseFrom(byte[] bArr) {
        return (FloatValue) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static FloatValue parseFrom(byte[] bArr, C3696 c3696) {
        return (FloatValue) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static FloatValue parseFrom(InputStream inputStream) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, C3696 c3696) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static FloatValue parseFrom(AbstractC3473 abstractC3473) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static FloatValue parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
