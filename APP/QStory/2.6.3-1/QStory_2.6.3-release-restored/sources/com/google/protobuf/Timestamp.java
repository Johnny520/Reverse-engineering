package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Timestamp extends GeneratedMessage implements InterfaceC4550 {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static final InterfaceC4207 PARSER;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int nanos_;
    private long seconds_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Timestamp");
        DEFAULT_INSTANCE = new Timestamp();
        PARSER = new C4553();
    }

    private Timestamp(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.seconds_ = 0L;
        this.nanos_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4551.f11886;
    }

    public static C4152 newBuilder(Timestamp timestamp) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(timestamp);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) {
        return (Timestamp) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) {
        return (Timestamp) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timestamp)) {
            return super.equals(obj);
        }
        Timestamp timestamp = (Timestamp) obj;
        return getSeconds() == timestamp.getSeconds() && getNanos() == timestamp.getNanos() && getUnknownFields().equals(timestamp.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4551.f11886;
    }

    @Override // com.google.protobuf.InterfaceC4550
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4550
    public long getSeconds() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        long j = this.seconds_;
        int iM8199 = j != 0 ? AbstractC4294.m8199(1, j) : 0;
        int i2 = this.nanos_;
        if (i2 != 0) {
            iM8199 += AbstractC4294.m8190(2, i2);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM8199;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getNanos() + ((((AbstractC4234.m8061(getSeconds()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4551.f11885;
        c4451.m8386(Timestamp.class, C4152.class);
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
    public C4152 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4152(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4152 toBuilder() {
        C4553 c4553 = null;
        return this == DEFAULT_INSTANCE ? new C4152(c4553) : new C4152(c4553).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        long j = this.seconds_;
        if (j != 0) {
            abstractC4294.mo8207(1, j);
        }
        int i = this.nanos_;
        if (i != 0) {
            abstractC4294.mo8210(2, i);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Timestamp$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4152 extends GeneratedMessage.AbstractC4137 implements InterfaceC4550 {
        private int bitField0_;
        private int nanos_;
        private long seconds_;

        public /* synthetic */ C4152(InterfaceC4364 interfaceC4364, C4553 c4553) {
            this(interfaceC4364);
        }

        private void buildPartial0(Timestamp timestamp) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                timestamp.seconds_ = this.seconds_;
            }
            if ((i & 2) != 0) {
                timestamp.nanos_ = this.nanos_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4551.f11886;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Timestamp build() {
            Timestamp timestampBuildPartial = buildPartial();
            if (timestampBuildPartial.isInitialized()) {
                return timestampBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) timestampBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Timestamp buildPartial() {
            Timestamp timestamp = new Timestamp(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(timestamp);
            }
            onBuilt();
            return timestamp;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4152 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.seconds_ = 0L;
            this.nanos_ = 0;
            return this;
        }

        public C4152 clearNanos() {
            this.bitField0_ &= -3;
            this.nanos_ = 0;
            onChanged();
            return this;
        }

        public C4152 clearSeconds() {
            this.bitField0_ &= -2;
            this.seconds_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4551.f11886;
        }

        @Override // com.google.protobuf.InterfaceC4550
        public int getNanos() {
            return this.nanos_;
        }

        @Override // com.google.protobuf.InterfaceC4550
        public long getSeconds() {
            return this.seconds_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4551.f11885;
            c4451.m8386(Timestamp.class, C4152.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4152 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 8) {
                                this.seconds_ = abstractC4306.mo8277();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 16) {
                                this.nanos_ = abstractC4306.mo8276();
                                this.bitField0_ |= 2;
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

        public C4152 setNanos(int i) {
            this.nanos_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4152 setSeconds(long j) {
            this.seconds_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C4152(C4553 c4553) {
            this();
        }

        private C4152() {
        }

        private C4152(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Timestamp getDefaultInstanceForType() {
            return Timestamp.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4152 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Timestamp) {
                return mergeFrom((Timestamp) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4152 mergeFrom(Timestamp timestamp) {
            if (timestamp == Timestamp.getDefaultInstance()) {
                return this;
            }
            if (timestamp.getSeconds() != 0) {
                setSeconds(timestamp.getSeconds());
            }
            if (timestamp.getNanos() != 0) {
                setNanos(timestamp.getNanos());
            }
            mergeUnknownFields(timestamp.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Timestamp getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Timestamp) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4152 newBuilderForType() {
        return newBuilder();
    }

    public static C4152 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Timestamp) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public /* synthetic */ Timestamp(GeneratedMessage.AbstractC4137 abstractC4137, C4553 c4553) {
        this(abstractC4137);
    }

    private Timestamp() {
        this.seconds_ = 0L;
        this.nanos_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Timestamp parseFrom(ByteString byteString) {
        return (Timestamp) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Timestamp parseFrom(ByteString byteString, C4529 c4529) {
        return (Timestamp) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Timestamp parseFrom(byte[] bArr) {
        return (Timestamp) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Timestamp parseFrom(byte[] bArr, C4529 c4529) {
        return (Timestamp) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Timestamp parseFrom(InputStream inputStream) {
        return (Timestamp) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, C4529 c4529) {
        return (Timestamp) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Timestamp parseFrom(AbstractC4306 abstractC4306) {
        return (Timestamp) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Timestamp parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Timestamp) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
