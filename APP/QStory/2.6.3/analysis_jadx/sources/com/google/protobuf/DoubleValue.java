package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DoubleValue extends GeneratedMessage implements InterfaceC3589 {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private double value_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "DoubleValue");
        DEFAULT_INSTANCE = new DoubleValue();
        PARSER = new C3590();
    }

    private DoubleValue(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.value_ = 0.0d;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3730.f11559;
    }

    public static C3296 newBuilder(DoubleValue doubleValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(doubleValue);
    }

    public static DoubleValue of(double d) {
        return newBuilder().setValue(d).build();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) {
        return (DoubleValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) {
        return (DoubleValue) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3730.f11559;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (Double.doubleToRawLongBits(this.value_) != 0 ? AbstractC3462.m7642(1) + 8 : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3589
    public double getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((AbstractC3402.m7502(Double.doubleToLongBits(getValue())) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3730.f11558;
        c3619.m7827(DoubleValue.class, C3296.class);
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
    public C3296 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3296(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3296 toBuilder() {
        C3590 c3590 = null;
        return this == DEFAULT_INSTANCE ? new C3296(c3590) : new C3296(c3590).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (Double.doubleToRawLongBits(this.value_) != 0) {
            abstractC3462.m7664(1, this.value_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DoubleValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3296 extends GeneratedMessage.AbstractC3305 implements InterfaceC3589 {
        private int bitField0_;
        private double value_;

        public /* synthetic */ C3296(InterfaceC3532 interfaceC3532, C3590 c3590) {
            this(interfaceC3532);
        }

        private void buildPartial0(DoubleValue doubleValue) {
            if ((this.bitField0_ & 1) != 0) {
                doubleValue.value_ = this.value_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3730.f11559;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DoubleValue build() {
            DoubleValue doubleValueBuildPartial = buildPartial();
            if (doubleValueBuildPartial.isInitialized()) {
                return doubleValueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) doubleValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DoubleValue buildPartial() {
            DoubleValue doubleValue = new DoubleValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(doubleValue);
            }
            onBuilt();
            return doubleValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3296 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.value_ = 0.0d;
            return this;
        }

        public C3296 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0.0d;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3730.f11559;
        }

        @Override // com.google.protobuf.InterfaceC3589
        public double getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3730.f11558;
            c3619.m7827(DoubleValue.class, C3296.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3296 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 9) {
                                this.value_ = abstractC3474.mo7723();
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

        public C3296 setValue(double d) {
            this.value_ = d;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3296(C3590 c3590) {
            this();
        }

        private C3296() {
        }

        private C3296(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DoubleValue getDefaultInstanceForType() {
            return DoubleValue.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3296 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DoubleValue) {
                return mergeFrom((DoubleValue) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3296 mergeFrom(DoubleValue doubleValue) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DoubleValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DoubleValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3296 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ DoubleValue(GeneratedMessage.AbstractC3305 abstractC3305, C3590 c3590) {
        this(abstractC3305);
    }

    public static C3296 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private DoubleValue() {
        this.value_ = 0.0d;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DoubleValue) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DoubleValue parseFrom(ByteString byteString) {
        return (DoubleValue) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DoubleValue parseFrom(ByteString byteString, C3697 c3697) {
        return (DoubleValue) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DoubleValue parseFrom(byte[] bArr) {
        return (DoubleValue) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DoubleValue parseFrom(byte[] bArr, C3697 c3697) {
        return (DoubleValue) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DoubleValue parseFrom(InputStream inputStream) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, C3697 c3697) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DoubleValue parseFrom(AbstractC3474 abstractC3474) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DoubleValue parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
