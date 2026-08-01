package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FloatValue extends GeneratedMessage implements InterfaceC3642 {
    private static final FloatValue DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private float value_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FloatValue");
        DEFAULT_INSTANCE = new FloatValue();
        PARSER = new C3638();
    }

    private FloatValue(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.value_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3730.f11557;
    }

    public static C3303 newBuilder(FloatValue floatValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(floatValue);
    }

    public static FloatValue of(float f) {
        return newBuilder().setValue(f).build();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) {
        return (FloatValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) {
        return (FloatValue) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3730.f11557;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (Float.floatToRawIntBits(this.value_) != 0 ? AbstractC3462.m7642(1) + 4 : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3642
    public float getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3730.f11556;
        c3619.m7827(FloatValue.class, C3303.class);
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
    public C3303 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3303(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3303 toBuilder() {
        C3638 c3638 = null;
        return this == DEFAULT_INSTANCE ? new C3303(c3638) : new C3303(c3638).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (Float.floatToRawIntBits(this.value_) != 0) {
            float f = this.value_;
            abstractC3462.getClass();
            abstractC3462.mo7665(1, Float.floatToRawIntBits(f));
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.FloatValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3303 extends GeneratedMessage.AbstractC3305 implements InterfaceC3642 {
        private int bitField0_;
        private float value_;

        public /* synthetic */ C3303(InterfaceC3532 interfaceC3532, C3638 c3638) {
            this(interfaceC3532);
        }

        private void buildPartial0(FloatValue floatValue) {
            if ((this.bitField0_ & 1) != 0) {
                floatValue.value_ = this.value_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3730.f11557;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public FloatValue build() {
            FloatValue floatValueBuildPartial = buildPartial();
            if (floatValueBuildPartial.isInitialized()) {
                return floatValueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) floatValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public FloatValue buildPartial() {
            FloatValue floatValue = new FloatValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(floatValue);
            }
            onBuilt();
            return floatValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3303 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.value_ = 0.0f;
            return this;
        }

        public C3303 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0.0f;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3730.f11557;
        }

        @Override // com.google.protobuf.InterfaceC3642
        public float getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3730.f11556;
            c3619.m7827(FloatValue.class, C3303.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3303 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 13) {
                                this.value_ = abstractC3474.mo7714();
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

        public C3303 setValue(float f) {
            this.value_ = f;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3303(C3638 c3638) {
            this();
        }

        private C3303() {
        }

        private C3303(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public FloatValue getDefaultInstanceForType() {
            return FloatValue.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3303 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof FloatValue) {
                return mergeFrom((FloatValue) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3303 mergeFrom(FloatValue floatValue) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public FloatValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (FloatValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3303 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ FloatValue(GeneratedMessage.AbstractC3305 abstractC3305, C3638 c3638) {
        this(abstractC3305);
    }

    private FloatValue() {
        this.value_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3303 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (FloatValue) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static FloatValue parseFrom(ByteString byteString) {
        return (FloatValue) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static FloatValue parseFrom(ByteString byteString, C3697 c3697) {
        return (FloatValue) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static FloatValue parseFrom(byte[] bArr) {
        return (FloatValue) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static FloatValue parseFrom(byte[] bArr, C3697 c3697) {
        return (FloatValue) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static FloatValue parseFrom(InputStream inputStream) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, C3697 c3697) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static FloatValue parseFrom(AbstractC3474 abstractC3474) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static FloatValue parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
