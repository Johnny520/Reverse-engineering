package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FloatValue extends GeneratedMessage implements InterfaceC4474 {
    private static final FloatValue DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private float value_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "FloatValue");
        DEFAULT_INSTANCE = new FloatValue();
        PARSER = new C4470();
    }

    private FloatValue(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.value_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4562.f11902;
    }

    public static C4135 newBuilder(FloatValue floatValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(floatValue);
    }

    /* JADX INFO: renamed from: of */
    public static FloatValue m142of(float f) {
        return newBuilder().setValue(f).build();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) {
        return (FloatValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) {
        return (FloatValue) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatValue)) {
            return super.equals(obj);
        }
        FloatValue floatValue = (FloatValue) obj;
        return Float.floatToIntBits(getValue()) == Float.floatToIntBits(floatValue.getValue()) && getUnknownFields().equals(floatValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4562.f11902;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (Float.floatToRawIntBits(this.value_) != 0 ? AbstractC4294.m8201(1) + 4 : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4474
    public float getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((Float.floatToIntBits(getValue()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4562.f11901;
        c4451.m8386(FloatValue.class, C4135.class);
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
    public C4135 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4135(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4135 toBuilder() {
        C4470 c4470 = null;
        return this == DEFAULT_INSTANCE ? new C4135(c4470) : new C4135(c4470).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (Float.floatToRawIntBits(this.value_) != 0) {
            float f = this.value_;
            abstractC4294.getClass();
            abstractC4294.mo8224(1, Float.floatToRawIntBits(f));
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.FloatValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4135 extends GeneratedMessage.AbstractC4137 implements InterfaceC4474 {
        private int bitField0_;
        private float value_;

        public /* synthetic */ C4135(InterfaceC4364 interfaceC4364, C4470 c4470) {
            this(interfaceC4364);
        }

        private void buildPartial0(FloatValue floatValue) {
            if ((this.bitField0_ & 1) != 0) {
                floatValue.value_ = this.value_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4562.f11902;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public FloatValue build() {
            FloatValue floatValueBuildPartial = buildPartial();
            if (floatValueBuildPartial.isInitialized()) {
                return floatValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) floatValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public FloatValue buildPartial() {
            FloatValue floatValue = new FloatValue(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(floatValue);
            }
            onBuilt();
            return floatValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4135 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.value_ = 0.0f;
            return this;
        }

        public C4135 clearValue() {
            this.bitField0_ &= -2;
            this.value_ = 0.0f;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4562.f11902;
        }

        @Override // com.google.protobuf.InterfaceC4474
        public float getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4562.f11901;
            c4451.m8386(FloatValue.class, C4135.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4135 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 13) {
                                this.value_ = abstractC4306.mo8273();
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

        public C4135 setValue(float f) {
            this.value_ = f;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C4135(C4470 c4470) {
            this();
        }

        private C4135() {
        }

        private C4135(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public FloatValue getDefaultInstanceForType() {
            return FloatValue.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4135 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof FloatValue) {
                return mergeFrom((FloatValue) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4135 mergeFrom(FloatValue floatValue) {
            if (floatValue == FloatValue.getDefaultInstance()) {
                return this;
            }
            if (Float.floatToRawIntBits(floatValue.getValue()) != 0) {
                setValue(floatValue.getValue());
            }
            mergeUnknownFields(floatValue.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public FloatValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (FloatValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4135 newBuilderForType() {
        return newBuilder();
    }

    public /* synthetic */ FloatValue(GeneratedMessage.AbstractC4137 abstractC4137, C4470 c4470) {
        this(abstractC4137);
    }

    private FloatValue() {
        this.value_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C4135 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (FloatValue) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static FloatValue parseFrom(ByteString byteString) {
        return (FloatValue) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static FloatValue parseFrom(ByteString byteString, C4529 c4529) {
        return (FloatValue) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static FloatValue parseFrom(byte[] bArr) {
        return (FloatValue) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static FloatValue parseFrom(byte[] bArr, C4529 c4529) {
        return (FloatValue) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static FloatValue parseFrom(InputStream inputStream) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, C4529 c4529) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static FloatValue parseFrom(AbstractC4306 abstractC4306) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static FloatValue parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (FloatValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
