package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class UInt64Value extends GeneratedMessage implements InterfaceC4543 {
    private static final UInt64Value DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private long value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "UInt64Value");
        DEFAULT_INSTANCE = new UInt64Value();
        PARSER = new C4547();
    }

    private UInt64Value(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.value_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static UInt64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4562.f11912;
    }

    public static C4155 newBuilder(UInt64Value uInt64Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(uInt64Value);
    }

    /* JADX INFO: renamed from: of */
    public static UInt64Value m148of(long j) {
        return newBuilder().setValue(j).build();
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream) {
        return (UInt64Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer) {
        return (UInt64Value) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UInt64Value)) {
            return super.equals(obj);
        }
        UInt64Value uInt64Value = (UInt64Value) obj;
        return getValue() == uInt64Value.getValue() && getUnknownFields().equals(uInt64Value.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4562.f11912;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (j != 0 ? AbstractC4294.m8196(1, j) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4543
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
        C4451 c4451 = AbstractC4562.f11911;
        c4451.m8386(UInt64Value.class, C4155.class);
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
    public C4155 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4155(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4155 toBuilder() {
        C4547 c4547 = null;
        return this == DEFAULT_INSTANCE ? new C4155(c4547) : new C4155(c4547).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        long j = this.value_;
        if (j != 0) {
            abstractC4294.mo8207(1, j);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.UInt64Value$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4155 extends GeneratedMessage.AbstractC4137 implements InterfaceC4543 {
        private int bitField0_;
        private long value_;

        public /* synthetic */ C4155(InterfaceC4364 interfaceC4364, C4547 c4547) {
            this(interfaceC4364);
        }

        private void buildPartial0(UInt64Value uInt64Value) {
            if ((this.bitField0_ & 1) != 0) {
                uInt64Value.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4562.f11912;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public UInt64Value build() {
            UInt64Value uInt64ValueBuildPartial = buildPartial();
            if (uInt64ValueBuildPartial.isInitialized()) {
                return uInt64ValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) uInt64ValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public UInt64Value buildPartial() {
            UInt64Value uInt64Value = new UInt64Value(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(uInt64Value);
            }
            onBuilt();
            return uInt64Value;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4155 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.value_ = 0L;
            return this;
        }

        public C4155 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4562.f11912;
        }

        @Override // com.google.protobuf.InterfaceC4543
        public long getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4562.f11911;
            c4451.m8386(UInt64Value.class, C4155.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4155 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                this.value_ = abstractC4306.mo8262();
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

        public C4155 setValue(long j) {
            this.value_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C4155(C4547 c4547) {
            this();
        }

        private C4155() {
        }

        private C4155(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public UInt64Value getDefaultInstanceForType() {
            return UInt64Value.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4155 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof UInt64Value) {
                return mergeFrom((UInt64Value) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4155 mergeFrom(UInt64Value uInt64Value) {
            if (uInt64Value == UInt64Value.getDefaultInstance()) {
                return this;
            }
            if (uInt64Value.getValue() != 0) {
                setValue(uInt64Value.getValue());
            }
            mergeUnknownFields(uInt64Value.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public UInt64Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (UInt64Value) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4155 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ UInt64Value(GeneratedMessage.AbstractC4137 abstractC4137, C4547 c4547) {
        this(abstractC4137);
    }

    public static C4155 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private UInt64Value() {
        this.value_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (UInt64Value) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static UInt64Value parseFrom(ByteString byteString) {
        return (UInt64Value) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static UInt64Value parseFrom(ByteString byteString, C4529 c4529) {
        return (UInt64Value) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static UInt64Value parseFrom(byte[] bArr) {
        return (UInt64Value) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static UInt64Value parseFrom(byte[] bArr, C4529 c4529) {
        return (UInt64Value) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static UInt64Value parseFrom(InputStream inputStream) {
        return (UInt64Value) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static UInt64Value parseFrom(InputStream inputStream, C4529 c4529) {
        return (UInt64Value) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static UInt64Value parseFrom(AbstractC4306 abstractC4306) {
        return (UInt64Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static UInt64Value parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (UInt64Value) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
