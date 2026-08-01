package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DoubleValue extends GeneratedMessage implements InterfaceC4421 {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private double value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "DoubleValue");
        DEFAULT_INSTANCE = new DoubleValue();
        PARSER = new C4422();
    }

    private DoubleValue(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.value_ = 0.0d;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4562.f11904;
    }

    public static C4128 newBuilder(DoubleValue doubleValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(doubleValue);
    }

    /* JADX INFO: renamed from: of */
    public static DoubleValue m140of(double d) {
        return newBuilder().setValue(d).build();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) {
        return (DoubleValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) {
        return (DoubleValue) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4562.f11904;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = getUnknownFields().getSerializedSize() + (Double.doubleToRawLongBits(this.value_) != 0 ? AbstractC4294.m8201(1) + 8 : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4421
    public double getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((AbstractC4234.m8061(Double.doubleToLongBits(getValue())) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4562.f11903;
        c4451.m8386(DoubleValue.class, C4128.class);
        return c4451;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
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

    @Override // com.google.protobuf.AbstractC4365
    public C4128 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4128(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4128 toBuilder() {
        C4422 c4422 = null;
        return this == DEFAULT_INSTANCE ? new C4128(c4422) : new C4128(c4422).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (Double.doubleToRawLongBits(this.value_) != 0) {
            abstractC4294.m8223(1, this.value_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DoubleValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4128 extends GeneratedMessage.AbstractC4137 implements InterfaceC4421 {
        private int bitField0_;
        private double value_;

        public /* synthetic */ C4128(InterfaceC4364 interfaceC4364, C4422 c4422) {
            this(interfaceC4364);
        }

        private void buildPartial0(DoubleValue doubleValue) {
            if ((this.bitField0_ & 1) != 0) {
                doubleValue.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4562.f11904;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DoubleValue build() {
            DoubleValue doubleValueBuildPartial = buildPartial();
            if (doubleValueBuildPartial.isInitialized()) {
                return doubleValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) doubleValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DoubleValue buildPartial() {
            DoubleValue doubleValue = new DoubleValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(doubleValue);
            }
            onBuilt();
            return doubleValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4128 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.value_ = 0.0d;
            return this;
        }

        public C4128 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0.0d;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4562.f11904;
        }

        @Override // com.google.protobuf.InterfaceC4421
        public double getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4562.f11903;
            c4451.m8386(DoubleValue.class, C4128.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4128 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 9) {
                                this.value_ = abstractC4306.mo8282();
                                this.bitField0_ |= 1;
                            } else if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
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

        public C4128 setValue(double d) {
            this.value_ = d;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C4128(C4422 c4422) {
            this();
        }

        private C4128() {
        }

        private C4128(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DoubleValue getDefaultInstanceForType() {
            return DoubleValue.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4128 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DoubleValue) {
                return mergeFrom((DoubleValue) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4128 mergeFrom(DoubleValue doubleValue) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DoubleValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DoubleValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4128 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ DoubleValue(GeneratedMessage.AbstractC4137 abstractC4137, C4422 c4422) {
        this(abstractC4137);
    }

    public static C4128 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private DoubleValue() {
        this.value_ = 0.0d;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DoubleValue) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DoubleValue parseFrom(ByteString byteString) {
        return (DoubleValue) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DoubleValue parseFrom(ByteString byteString, C4529 c4529) {
        return (DoubleValue) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DoubleValue parseFrom(byte[] bArr) {
        return (DoubleValue) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DoubleValue parseFrom(byte[] bArr, C4529 c4529) {
        return (DoubleValue) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DoubleValue parseFrom(InputStream inputStream) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, C4529 c4529) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DoubleValue parseFrom(AbstractC4306 abstractC4306) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DoubleValue parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DoubleValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
