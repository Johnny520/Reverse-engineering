package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Int64Value extends GeneratedMessage implements InterfaceC4441 {
    private static final Int64Value DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private long value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Int64Value");
        DEFAULT_INSTANCE = new Int64Value();
        PARSER = new C4440();
    }

    private Int64Value(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.value_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Int64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4562.f11900;
    }

    public static C4142 newBuilder(Int64Value int64Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(int64Value);
    }

    /* JADX INFO: renamed from: of */
    public static Int64Value m145of(long j) {
        return newBuilder().setValue(j).build();
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream) {
        return (Int64Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer) {
        return (Int64Value) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4562.f11900;
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
        long j = this.value_;
        int serializedSize = getUnknownFields().getSerializedSize() + (j != 0 ? AbstractC4294.m8199(1, j) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4441
    public long getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((AbstractC4234.m8061(getValue()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4562.f11899;
        c4451.m8386(Int64Value.class, C4142.class);
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
    public C4142 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4142(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4142 toBuilder() {
        C4440 c4440 = null;
        return this == DEFAULT_INSTANCE ? new C4142(c4440) : new C4142(c4440).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        long j = this.value_;
        if (j != 0) {
            abstractC4294.mo8207(1, j);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Int64Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4142 extends GeneratedMessage.AbstractC4137 implements InterfaceC4441 {
        private int bitField0_;
        private long value_;

        public /* synthetic */ C4142(InterfaceC4364 interfaceC4364, C4440 c4440) {
            this(interfaceC4364);
        }

        private void buildPartial0(Int64Value int64Value) {
            if ((this.bitField0_ & 1) != 0) {
                int64Value.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4562.f11900;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Int64Value build() {
            Int64Value int64ValueBuildPartial = buildPartial();
            if (int64ValueBuildPartial.isInitialized()) {
                return int64ValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) int64ValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Int64Value buildPartial() {
            Int64Value int64Value = new Int64Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(int64Value);
            }
            onBuilt();
            return int64Value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4142 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.value_ = 0L;
            return this;
        }

        public C4142 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4562.f11900;
        }

        @Override // com.google.protobuf.InterfaceC4441
        public long getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4562.f11899;
            c4451.m8386(Int64Value.class, C4142.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4142 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                this.value_ = abstractC4306.mo8277();
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

        public C4142 setValue(long j) {
            this.value_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C4142(C4440 c4440) {
            this();
        }

        private C4142() {
        }

        private C4142(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Int64Value getDefaultInstanceForType() {
            return Int64Value.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4142 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Int64Value) {
                return mergeFrom((Int64Value) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4142 mergeFrom(Int64Value int64Value) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Int64Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Int64Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4142 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ Int64Value(GeneratedMessage.AbstractC4137 abstractC4137, C4440 c4440) {
        this(abstractC4137);
    }

    public static C4142 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private Int64Value() {
        this.value_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Int64Value) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Int64Value parseFrom(ByteString byteString) {
        return (Int64Value) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Int64Value parseFrom(ByteString byteString, C4529 c4529) {
        return (Int64Value) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Int64Value parseFrom(byte[] bArr) {
        return (Int64Value) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Int64Value parseFrom(byte[] bArr, C4529 c4529) {
        return (Int64Value) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Int64Value parseFrom(InputStream inputStream) {
        return (Int64Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Int64Value parseFrom(InputStream inputStream, C4529 c4529) {
        return (Int64Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Int64Value parseFrom(AbstractC4306 abstractC4306) {
        return (Int64Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Int64Value parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Int64Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
