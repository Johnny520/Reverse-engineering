package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class BoolValue extends GeneratedMessage implements InterfaceC3536 {
    private static final BoolValue DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private boolean value_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "BoolValue");
        DEFAULT_INSTANCE = new BoolValue();
        PARSER = new C3544();
    }

    private BoolValue(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.value_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3730.f11561;
    }

    public static C3260 newBuilder(BoolValue boolValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(boolValue);
    }

    public static BoolValue of(boolean z) {
        return newBuilder().setValue(z).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) {
        return (BoolValue) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3730.f11561;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (this.value_ ? AbstractC3462.m7634(1) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3536
    public boolean getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((AbstractC3402.m7503(getValue()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3730.f11560;
        c3619.m7827(BoolValue.class, C3260.class);
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
    public C3260 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3260(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3260 toBuilder() {
        C3544 c3544 = null;
        return this == DEFAULT_INSTANCE ? new C3260(c3544) : new C3260(c3544).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        boolean z = this.value_;
        if (z) {
            abstractC3462.mo7663(1, z);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.BoolValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3260 extends GeneratedMessage.AbstractC3305 implements InterfaceC3536 {
        private int bitField0_;
        private boolean value_;

        public /* synthetic */ C3260(InterfaceC3532 interfaceC3532, C3544 c3544) {
            this(interfaceC3532);
        }

        private void buildPartial0(BoolValue boolValue) {
            if ((this.bitField0_ & 1) != 0) {
                boolValue.value_ = this.value_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3730.f11561;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public BoolValue build() {
            BoolValue boolValueBuildPartial = buildPartial();
            if (boolValueBuildPartial.isInitialized()) {
                return boolValueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) boolValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public BoolValue buildPartial() {
            BoolValue boolValue = new BoolValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(boolValue);
            }
            onBuilt();
            return boolValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3260 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.value_ = false;
            return this;
        }

        public C3260 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3730.f11561;
        }

        @Override // com.google.protobuf.InterfaceC3536
        public boolean getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3730.f11560;
            c3619.m7827(BoolValue.class, C3260.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3260 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 8) {
                                this.value_ = abstractC3474.mo7720();
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

        public C3260 setValue(boolean z) {
            this.value_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3260(C3544 c3544) {
            this();
        }

        private C3260() {
        }

        private C3260(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public BoolValue getDefaultInstanceForType() {
            return BoolValue.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3260 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof BoolValue) {
                return mergeFrom((BoolValue) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3260 mergeFrom(BoolValue boolValue) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public BoolValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (BoolValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3260 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ BoolValue(GeneratedMessage.AbstractC3305 abstractC3305, C3544 c3544) {
        this(abstractC3305);
    }

    private BoolValue() {
        this.value_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3260 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (BoolValue) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static BoolValue parseFrom(ByteString byteString) {
        return (BoolValue) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static BoolValue parseFrom(ByteString byteString, C3697 c3697) {
        return (BoolValue) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static BoolValue parseFrom(byte[] bArr) {
        return (BoolValue) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static BoolValue parseFrom(byte[] bArr, C3697 c3697) {
        return (BoolValue) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static BoolValue parseFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, C3697 c3697) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static BoolValue parseFrom(AbstractC3474 abstractC3474) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static BoolValue parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
