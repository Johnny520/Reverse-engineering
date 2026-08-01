package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Int32Value extends GeneratedMessage implements InterfaceC3611 {
    private static final Int32Value DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int value_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Int32Value");
        DEFAULT_INSTANCE = new Int32Value();
        PARSER = new C3610();
    }

    private Int32Value(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3730.f11570;
    }

    public static C3309 newBuilder(Int32Value int32Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(int32Value);
    }

    public static Int32Value of(int i) {
        return newBuilder().setValue(i).build();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream) {
        return (Int32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer) {
        return (Int32Value) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3730.f11570;
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
        int i2 = this.value_;
        int serializedSize = getUnknownFields().getSerializedSize() + (i2 != 0 ? AbstractC3462.m7631(1, i2) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3611
    public int getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3730.f11571;
        c3619.m7827(Int32Value.class, C3309.class);
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
    public C3309 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3309(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3309 toBuilder() {
        C3610 c3610 = null;
        return this == DEFAULT_INSTANCE ? new C3309(c3610) : new C3309(c3610).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        int i = this.value_;
        if (i != 0) {
            abstractC3462.mo7651(1, i);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Int32Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3309 extends GeneratedMessage.AbstractC3305 implements InterfaceC3611 {
        private int bitField0_;
        private int value_;

        public /* synthetic */ C3309(InterfaceC3532 interfaceC3532, C3610 c3610) {
            this(interfaceC3532);
        }

        private void buildPartial0(Int32Value int32Value) {
            if ((this.bitField0_ & 1) != 0) {
                int32Value.value_ = this.value_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3730.f11570;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Int32Value build() {
            Int32Value int32ValueBuildPartial = buildPartial();
            if (int32ValueBuildPartial.isInitialized()) {
                return int32ValueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) int32ValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Int32Value buildPartial() {
            Int32Value int32Value = new Int32Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(int32Value);
            }
            onBuilt();
            return int32Value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3309 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.value_ = 0;
            return this;
        }

        public C3309 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3730.f11570;
        }

        @Override // com.google.protobuf.InterfaceC3611
        public int getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3730.f11571;
            c3619.m7827(Int32Value.class, C3309.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3309 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 8) {
                                this.value_ = abstractC3474.mo7717();
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

        public C3309 setValue(int i) {
            this.value_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3309(C3610 c3610) {
            this();
        }

        private C3309() {
        }

        private C3309(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Int32Value getDefaultInstanceForType() {
            return Int32Value.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3309 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Int32Value) {
                return mergeFrom((Int32Value) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3309 mergeFrom(Int32Value int32Value) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Int32Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Int32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3309 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ Int32Value(GeneratedMessage.AbstractC3305 abstractC3305, C3610 c3610) {
        this(abstractC3305);
    }

    private Int32Value() {
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3309 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Int32Value) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Int32Value parseFrom(ByteString byteString) {
        return (Int32Value) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Int32Value parseFrom(ByteString byteString, C3697 c3697) {
        return (Int32Value) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Int32Value parseFrom(byte[] bArr) {
        return (Int32Value) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Int32Value parseFrom(byte[] bArr, C3697 c3697) {
        return (Int32Value) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Int32Value parseFrom(InputStream inputStream) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Int32Value parseFrom(InputStream inputStream, C3697 c3697) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Int32Value parseFrom(AbstractC3474 abstractC3474) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Int32Value parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
