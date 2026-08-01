package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class UInt32Value extends GeneratedMessage implements InterfaceC4546 {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "UInt32Value");
        DEFAULT_INSTANCE = new UInt32Value();
        PARSER = new C4530();
    }

    private UInt32Value(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4562.f11913;
    }

    public static C4154 newBuilder(UInt32Value uInt32Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(uInt32Value);
    }

    /* JADX INFO: renamed from: of */
    public static UInt32Value m147of(int i) {
        return newBuilder().setValue(i).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) {
        return (UInt32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) {
        return (UInt32Value) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UInt32Value)) {
            return super.equals(obj);
        }
        UInt32Value uInt32Value = (UInt32Value) obj;
        return getValue() == uInt32Value.getValue() && getUnknownFields().equals(uInt32Value.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4562.f11913;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (i2 != 0 ? AbstractC4294.m8195(1, i2) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4546
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
        C4451 c4451 = AbstractC4562.f11914;
        c4451.m8386(UInt32Value.class, C4154.class);
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
    public C4154 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4154(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4154 toBuilder() {
        C4530 c4530 = null;
        return this == DEFAULT_INSTANCE ? new C4154(c4530) : new C4154(c4530).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        int i = this.value_;
        if (i != 0) {
            abstractC4294.mo8205(1, i);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.UInt32Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4154 extends GeneratedMessage.AbstractC4137 implements InterfaceC4546 {
        private int bitField0_;
        private int value_;

        public /* synthetic */ C4154(InterfaceC4364 interfaceC4364, C4530 c4530) {
            this(interfaceC4364);
        }

        private void buildPartial0(UInt32Value uInt32Value) {
            if ((this.bitField0_ & 1) != 0) {
                uInt32Value.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4562.f11913;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public UInt32Value build() {
            UInt32Value uInt32ValueBuildPartial = buildPartial();
            if (uInt32ValueBuildPartial.isInitialized()) {
                return uInt32ValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) uInt32ValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public UInt32Value buildPartial() {
            UInt32Value uInt32Value = new UInt32Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(uInt32Value);
            }
            onBuilt();
            return uInt32Value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4154 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.value_ = 0;
            return this;
        }

        public C4154 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4562.f11913;
        }

        @Override // com.google.protobuf.InterfaceC4546
        public int getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4562.f11914;
            c4451.m8386(UInt32Value.class, C4154.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4154 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                this.value_ = abstractC4306.mo8263();
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

        public C4154 setValue(int i) {
            this.value_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C4154(C4530 c4530) {
            this();
        }

        private C4154() {
        }

        private C4154(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public UInt32Value getDefaultInstanceForType() {
            return UInt32Value.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4154 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof UInt32Value) {
                return mergeFrom((UInt32Value) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4154 mergeFrom(UInt32Value uInt32Value) {
            if (uInt32Value == UInt32Value.getDefaultInstance()) {
                return this;
            }
            if (uInt32Value.getValue() != 0) {
                setValue(uInt32Value.getValue());
            }
            mergeUnknownFields(uInt32Value.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public UInt32Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (UInt32Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4154 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ UInt32Value(GeneratedMessage.AbstractC4137 abstractC4137, C4530 c4530) {
        this(abstractC4137);
    }

    private UInt32Value() {
        this.value_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C4154 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (UInt32Value) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static UInt32Value parseFrom(ByteString byteString) {
        return (UInt32Value) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static UInt32Value parseFrom(ByteString byteString, C4529 c4529) {
        return (UInt32Value) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static UInt32Value parseFrom(byte[] bArr) {
        return (UInt32Value) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static UInt32Value parseFrom(byte[] bArr, C4529 c4529) {
        return (UInt32Value) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static UInt32Value parseFrom(InputStream inputStream) {
        return (UInt32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, C4529 c4529) {
        return (UInt32Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static UInt32Value parseFrom(AbstractC4306 abstractC4306) {
        return (UInt32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static UInt32Value parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (UInt32Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
