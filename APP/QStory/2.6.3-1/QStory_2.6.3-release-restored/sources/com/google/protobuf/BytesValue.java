package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class BytesValue extends GeneratedMessage implements InterfaceC4311 {
    private static final BytesValue DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private ByteString value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "BytesValue");
        DEFAULT_INSTANCE = new BytesValue();
        PARSER = new C4300();
    }

    private BytesValue(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.value_ = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4562.f11907;
    }

    public static C4093 newBuilder(BytesValue bytesValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bytesValue);
    }

    /* JADX INFO: renamed from: of */
    public static BytesValue m139of(ByteString byteString) {
        return newBuilder().setValue(byteString).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) {
        return (BytesValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) {
        return (BytesValue) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BytesValue)) {
            return super.equals(obj);
        }
        BytesValue bytesValue = (BytesValue) obj;
        return getValue().equals(bytesValue.getValue()) && getUnknownFields().equals(bytesValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4562.f11907;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (!this.value_.isEmpty() ? AbstractC4294.m8192(1, this.value_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4311
    public ByteString getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getValue().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4562.f11908;
        c4451.m8386(BytesValue.class, C4093.class);
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
    public C4093 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4093(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4093 toBuilder() {
        C4300 c4300 = null;
        return this == DEFAULT_INSTANCE ? new C4093(c4300) : new C4093(c4300).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!this.value_.isEmpty()) {
            abstractC4294.mo8225(1, this.value_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.BytesValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4093 extends GeneratedMessage.AbstractC4137 implements InterfaceC4311 {
        private int bitField0_;
        private ByteString value_;

        private C4093() {
            this.value_ = ByteString.EMPTY;
        }

        private void buildPartial0(BytesValue bytesValue) {
            if ((this.bitField0_ & 1) != 0) {
                bytesValue.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4562.f11907;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public BytesValue build() {
            BytesValue bytesValueBuildPartial = buildPartial();
            if (bytesValueBuildPartial.isInitialized()) {
                return bytesValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) bytesValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public BytesValue buildPartial() {
            BytesValue bytesValue = new BytesValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(bytesValue);
            }
            onBuilt();
            return bytesValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4093 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.value_ = ByteString.EMPTY;
            return this;
        }

        public C4093 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = BytesValue.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4562.f11907;
        }

        @Override // com.google.protobuf.InterfaceC4311
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4562.f11908;
            c4451.m8386(BytesValue.class, C4093.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4093 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.value_ = abstractC4306.mo8278();
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

        public C4093 setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public BytesValue getDefaultInstanceForType() {
            return BytesValue.getDefaultInstance();
        }

        public /* synthetic */ C4093(C4300 c4300) {
            this();
        }

        public /* synthetic */ C4093(InterfaceC4364 interfaceC4364, C4300 c4300) {
            this(interfaceC4364);
        }

        private C4093(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.value_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4093 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof BytesValue) {
                return mergeFrom((BytesValue) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4093 mergeFrom(BytesValue bytesValue) {
            if (bytesValue == BytesValue.getDefaultInstance()) {
                return this;
            }
            if (!bytesValue.getValue().isEmpty()) {
                setValue(bytesValue.getValue());
            }
            mergeUnknownFields(bytesValue.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public BytesValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (BytesValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4093 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ BytesValue(GeneratedMessage.AbstractC4137 abstractC4137, C4300 c4300) {
        this(abstractC4137);
    }

    public static C4093 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private BytesValue() {
        ByteString byteString = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
        this.value_ = byteString;
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (BytesValue) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static BytesValue parseFrom(ByteString byteString) {
        return (BytesValue) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static BytesValue parseFrom(ByteString byteString, C4529 c4529) {
        return (BytesValue) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static BytesValue parseFrom(byte[] bArr) {
        return (BytesValue) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static BytesValue parseFrom(byte[] bArr, C4529 c4529) {
        return (BytesValue) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static BytesValue parseFrom(InputStream inputStream) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, C4529 c4529) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static BytesValue parseFrom(AbstractC4306 abstractC4306) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static BytesValue parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (BytesValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
