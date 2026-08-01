package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Int32Value extends GeneratedMessage implements InterfaceC4443 {
    private static final Int32Value DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Int32Value");
        DEFAULT_INSTANCE = new Int32Value();
        PARSER = new C4442();
    }

    private Int32Value(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4562.f11915;
    }

    public static C4141 newBuilder(Int32Value int32Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(int32Value);
    }

    /* JADX INFO: renamed from: of */
    public static Int32Value m144of(int i) {
        return newBuilder().setValue(i).build();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream) {
        return (Int32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer) {
        return (Int32Value) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4562.f11915;
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
        int i2 = this.value_;
        int serializedSize = getUnknownFields().getSerializedSize() + (i2 != 0 ? AbstractC4294.m8190(1, i2) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4443
    public int getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4562.f11916;
        c4451.m8386(Int32Value.class, C4141.class);
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
    public C4141 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4141(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4141 toBuilder() {
        C4442 c4442 = null;
        return this == DEFAULT_INSTANCE ? new C4141(c4442) : new C4141(c4442).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        int i = this.value_;
        if (i != 0) {
            abstractC4294.mo8210(1, i);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Int32Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4141 extends GeneratedMessage.AbstractC4137 implements InterfaceC4443 {
        private int bitField0_;
        private int value_;

        public /* synthetic */ C4141(InterfaceC4364 interfaceC4364, C4442 c4442) {
            this(interfaceC4364);
        }

        private void buildPartial0(Int32Value int32Value) {
            if ((this.bitField0_ & 1) != 0) {
                int32Value.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4562.f11915;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Int32Value build() {
            Int32Value int32ValueBuildPartial = buildPartial();
            if (int32ValueBuildPartial.isInitialized()) {
                return int32ValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) int32ValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Int32Value buildPartial() {
            Int32Value int32Value = new Int32Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(int32Value);
            }
            onBuilt();
            return int32Value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4141 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.value_ = 0;
            return this;
        }

        public C4141 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4562.f11915;
        }

        @Override // com.google.protobuf.InterfaceC4443
        public int getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4562.f11916;
            c4451.m8386(Int32Value.class, C4141.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4141 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                this.value_ = abstractC4306.mo8276();
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

        public C4141 setValue(int i) {
            this.value_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C4141(C4442 c4442) {
            this();
        }

        private C4141() {
        }

        private C4141(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Int32Value getDefaultInstanceForType() {
            return Int32Value.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4141 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Int32Value) {
                return mergeFrom((Int32Value) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4141 mergeFrom(Int32Value int32Value) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Int32Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Int32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4141 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ Int32Value(GeneratedMessage.AbstractC4137 abstractC4137, C4442 c4442) {
        this(abstractC4137);
    }

    private Int32Value() {
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C4141 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Int32Value) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Int32Value parseFrom(ByteString byteString) {
        return (Int32Value) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Int32Value parseFrom(ByteString byteString, C4529 c4529) {
        return (Int32Value) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Int32Value parseFrom(byte[] bArr) {
        return (Int32Value) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Int32Value parseFrom(byte[] bArr, C4529 c4529) {
        return (Int32Value) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Int32Value parseFrom(InputStream inputStream) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Int32Value parseFrom(InputStream inputStream, C4529 c4529) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Int32Value parseFrom(AbstractC4306 abstractC4306) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Int32Value parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Int32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
