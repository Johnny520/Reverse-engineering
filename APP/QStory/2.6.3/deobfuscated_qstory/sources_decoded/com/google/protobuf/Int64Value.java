package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Int64Value extends GeneratedMessage implements InterfaceC3609 {
    private static final Int64Value DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private long value_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Int64Value");
        DEFAULT_INSTANCE = new Int64Value();
        PARSER = new C3608();
    }

    private Int64Value(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.value_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Int64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3730.f11555;
    }

    public static C3310 newBuilder(Int64Value int64Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(int64Value);
    }

    public static Int64Value of(long j) {
        return newBuilder().setValue(j).build();
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream) {
        return (Int64Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer) {
        return (Int64Value) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Int64Value)) {
            return super.equals(obj);
        }
        Int64Value int64Value = (Int64Value) obj;
        return getValue() == int64Value.getValue() && getUnknownFields().equals(int64Value.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3730.f11555;
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
        long j = this.value_;
        int serializedSize = getUnknownFields().getSerializedSize() + (j != 0 ? AbstractC3462.m7640(1, j) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3609
    public long getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((AbstractC3402.m7502(getValue()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3730.f11554;
        c3619.m7827(Int64Value.class, C3310.class);
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
    public C3310 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3310(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3310 toBuilder() {
        C3608 c3608 = null;
        return this == DEFAULT_INSTANCE ? new C3310(c3608) : new C3310(c3608).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        long j = this.value_;
        if (j != 0) {
            abstractC3462.mo7648(1, j);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Int64Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3310 extends GeneratedMessage.AbstractC3305 implements InterfaceC3609 {
        private int bitField0_;
        private long value_;

        public /* synthetic */ C3310(InterfaceC3532 interfaceC3532, C3608 c3608) {
            this(interfaceC3532);
        }

        private void buildPartial0(Int64Value int64Value) {
            if ((this.bitField0_ & 1) != 0) {
                int64Value.value_ = this.value_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3730.f11555;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Int64Value build() {
            Int64Value int64ValueBuildPartial = buildPartial();
            if (int64ValueBuildPartial.isInitialized()) {
                return int64ValueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) int64ValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Int64Value buildPartial() {
            Int64Value int64Value = new Int64Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(int64Value);
            }
            onBuilt();
            return int64Value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3310 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.value_ = 0L;
            return this;
        }

        public C3310 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3730.f11555;
        }

        @Override // com.google.protobuf.InterfaceC3609
        public long getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3730.f11554;
            c3619.m7827(Int64Value.class, C3310.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3310 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 8) {
                                this.value_ = abstractC3474.mo7718();
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

        public C3310 setValue(long j) {
            this.value_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3310(C3608 c3608) {
            this();
        }

        private C3310() {
        }

        private C3310(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Int64Value getDefaultInstanceForType() {
            return Int64Value.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3310 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Int64Value) {
                return mergeFrom((Int64Value) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3310 mergeFrom(Int64Value int64Value) {
            if (int64Value == Int64Value.getDefaultInstance()) {
                return this;
            }
            if (int64Value.getValue() != 0) {
                setValue(int64Value.getValue());
            }
            mergeUnknownFields(int64Value.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Int64Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Int64Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3310 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ Int64Value(GeneratedMessage.AbstractC3305 abstractC3305, C3608 c3608) {
        this(abstractC3305);
    }

    public static C3310 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private Int64Value() {
        this.value_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Int64Value) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Int64Value parseFrom(ByteString byteString) {
        return (Int64Value) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Int64Value parseFrom(ByteString byteString, C3697 c3697) {
        return (Int64Value) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Int64Value parseFrom(byte[] bArr) {
        return (Int64Value) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Int64Value parseFrom(byte[] bArr, C3697 c3697) {
        return (Int64Value) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Int64Value parseFrom(InputStream inputStream) {
        return (Int64Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Int64Value parseFrom(InputStream inputStream, C3697 c3697) {
        return (Int64Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Int64Value parseFrom(AbstractC3474 abstractC3474) {
        return (Int64Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Int64Value parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Int64Value) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
