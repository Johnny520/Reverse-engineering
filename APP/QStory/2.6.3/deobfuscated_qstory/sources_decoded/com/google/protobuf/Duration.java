package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Duration extends GeneratedMessage implements InterfaceC3600 {
    private static final Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static final InterfaceC3375 PARSER;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int nanos_;
    private long seconds_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Duration");
        DEFAULT_INSTANCE = new Duration();
        PARSER = new C3601();
    }

    private Duration(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.seconds_ = 0L;
        this.nanos_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3599.f11236;
    }

    public static C3297 newBuilder(Duration duration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(duration);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream) {
        return (Duration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer) {
        return (Duration) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return super.equals(obj);
        }
        Duration duration = (Duration) obj;
        return getSeconds() == duration.getSeconds() && getNanos() == duration.getNanos() && getUnknownFields().equals(duration.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3599.f11236;
    }

    @Override // com.google.protobuf.InterfaceC3600
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3600
    public long getSeconds() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        long j = this.seconds_;
        int iM7640 = j != 0 ? AbstractC3462.m7640(1, j) : 0;
        int i2 = this.nanos_;
        if (i2 != 0) {
            iM7640 += AbstractC3462.m7631(2, i2);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7640;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getNanos() + ((((AbstractC3402.m7502(getSeconds()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3599.f11235;
        c3619.m7827(Duration.class, C3297.class);
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
    public C3297 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3297(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3297 toBuilder() {
        C3601 c3601 = null;
        return this == DEFAULT_INSTANCE ? new C3297(c3601) : new C3297(c3601).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        long j = this.seconds_;
        if (j != 0) {
            abstractC3462.mo7648(1, j);
        }
        int i = this.nanos_;
        if (i != 0) {
            abstractC3462.mo7651(2, i);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Duration$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3297 extends GeneratedMessage.AbstractC3305 implements InterfaceC3600 {
        private int bitField0_;
        private int nanos_;
        private long seconds_;

        public /* synthetic */ C3297(InterfaceC3532 interfaceC3532, C3601 c3601) {
            this(interfaceC3532);
        }

        private void buildPartial0(Duration duration) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                duration.seconds_ = this.seconds_;
            }
            if ((i & 2) != 0) {
                duration.nanos_ = this.nanos_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3599.f11236;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Duration build() {
            Duration durationBuildPartial = buildPartial();
            if (durationBuildPartial.isInitialized()) {
                return durationBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) durationBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Duration buildPartial() {
            Duration duration = new Duration(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(duration);
            }
            onBuilt();
            return duration;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3297 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.seconds_ = 0L;
            this.nanos_ = 0;
            return this;
        }

        public C3297 clearNanos() {
            this.bitField0_ &= -3;
            this.nanos_ = 0;
            onChanged();
            return this;
        }

        public C3297 clearSeconds() {
            this.bitField0_ &= -2;
            this.seconds_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3599.f11236;
        }

        @Override // com.google.protobuf.InterfaceC3600
        public int getNanos() {
            return this.nanos_;
        }

        @Override // com.google.protobuf.InterfaceC3600
        public long getSeconds() {
            return this.seconds_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3599.f11235;
            c3619.m7827(Duration.class, C3297.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3297 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 8) {
                                this.seconds_ = abstractC3474.mo7718();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 16) {
                                this.nanos_ = abstractC3474.mo7717();
                                this.bitField0_ |= 2;
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

        public C3297 setNanos(int i) {
            this.nanos_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3297 setSeconds(long j) {
            this.seconds_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3297(C3601 c3601) {
            this();
        }

        private C3297() {
        }

        private C3297(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Duration getDefaultInstanceForType() {
            return Duration.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3297 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Duration) {
                return mergeFrom((Duration) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3297 mergeFrom(Duration duration) {
            if (duration == Duration.getDefaultInstance()) {
                return this;
            }
            if (duration.getSeconds() != 0) {
                setSeconds(duration.getSeconds());
            }
            if (duration.getNanos() != 0) {
                setNanos(duration.getNanos());
            }
            mergeUnknownFields(duration.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Duration getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Duration parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Duration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3297 newBuilderForType() {
        return newBuilder();
    }

    public static C3297 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Duration parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Duration) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public /* synthetic */ Duration(GeneratedMessage.AbstractC3305 abstractC3305, C3601 c3601) {
        this(abstractC3305);
    }

    private Duration() {
        this.seconds_ = 0L;
        this.nanos_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Duration parseFrom(ByteString byteString) {
        return (Duration) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Duration parseFrom(ByteString byteString, C3697 c3697) {
        return (Duration) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Duration parseFrom(byte[] bArr) {
        return (Duration) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Duration parseFrom(byte[] bArr, C3697 c3697) {
        return (Duration) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Duration parseFrom(InputStream inputStream) {
        return (Duration) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Duration parseFrom(InputStream inputStream, C3697 c3697) {
        return (Duration) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Duration parseFrom(AbstractC3474 abstractC3474) {
        return (Duration) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Duration parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Duration) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
