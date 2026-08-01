package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class BoolValue extends GeneratedMessage implements InterfaceC4368 {
    private static final BoolValue DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private boolean value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "BoolValue");
        DEFAULT_INSTANCE = new BoolValue();
        PARSER = new C4376();
    }

    private BoolValue(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.value_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4562.f11906;
    }

    public static C4092 newBuilder(BoolValue boolValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(boolValue);
    }

    /* JADX INFO: renamed from: of */
    public static BoolValue m138of(boolean z) {
        return newBuilder().setValue(z).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) {
        return (BoolValue) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4562.f11906;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (this.value_ ? AbstractC4294.m8193(1) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4368
    public boolean getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((AbstractC4234.m8062(getValue()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4562.f11905;
        c4451.m8386(BoolValue.class, C4092.class);
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
    public C4092 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4092(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4092 toBuilder() {
        C4376 c4376 = null;
        return this == DEFAULT_INSTANCE ? new C4092(c4376) : new C4092(c4376).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        boolean z = this.value_;
        if (z) {
            abstractC4294.mo8222(1, z);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.BoolValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4092 extends GeneratedMessage.AbstractC4137 implements InterfaceC4368 {
        private int bitField0_;
        private boolean value_;

        public /* synthetic */ C4092(InterfaceC4364 interfaceC4364, C4376 c4376) {
            this(interfaceC4364);
        }

        private void buildPartial0(BoolValue boolValue) {
            if ((this.bitField0_ & 1) != 0) {
                boolValue.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4562.f11906;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public BoolValue build() {
            BoolValue boolValueBuildPartial = buildPartial();
            if (boolValueBuildPartial.isInitialized()) {
                return boolValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) boolValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public BoolValue buildPartial() {
            BoolValue boolValue = new BoolValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(boolValue);
            }
            onBuilt();
            return boolValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4092 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.value_ = false;
            return this;
        }

        public C4092 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4562.f11906;
        }

        @Override // com.google.protobuf.InterfaceC4368
        public boolean getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4562.f11905;
            c4451.m8386(BoolValue.class, C4092.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4092 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                this.value_ = abstractC4306.mo8279();
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

        public C4092 setValue(boolean z) {
            this.value_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C4092(C4376 c4376) {
            this();
        }

        private C4092() {
        }

        private C4092(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public BoolValue getDefaultInstanceForType() {
            return BoolValue.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4092 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof BoolValue) {
                return mergeFrom((BoolValue) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4092 mergeFrom(BoolValue boolValue) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public BoolValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (BoolValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4092 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ BoolValue(GeneratedMessage.AbstractC4137 abstractC4137, C4376 c4376) {
        this(abstractC4137);
    }

    private BoolValue() {
        this.value_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C4092 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (BoolValue) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static BoolValue parseFrom(ByteString byteString) {
        return (BoolValue) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static BoolValue parseFrom(ByteString byteString, C4529 c4529) {
        return (BoolValue) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static BoolValue parseFrom(byte[] bArr) {
        return (BoolValue) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static BoolValue parseFrom(byte[] bArr, C4529 c4529) {
        return (BoolValue) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static BoolValue parseFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, C4529 c4529) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static BoolValue parseFrom(AbstractC4306 abstractC4306) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static BoolValue parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
