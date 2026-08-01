package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Timestamp extends GeneratedMessage implements InterfaceC3717 {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static final InterfaceC3374 PARSER;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int nanos_;
    private long seconds_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Timestamp");
        DEFAULT_INSTANCE = new Timestamp();
        PARSER = new C3720();
    }

    private Timestamp(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.seconds_ = 0L;
        this.nanos_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3718.f11536;
    }

    public static C3319 newBuilder(Timestamp timestamp) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(timestamp);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) {
        return (Timestamp) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) {
        return (Timestamp) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3718.f11536;
    }

    @Override // com.google.protobuf.InterfaceC3717
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3717
    public long getSeconds() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        long j = this.seconds_;
        int iM7653 = j != 0 ? AbstractC3461.m7653(1, j) : 0;
        int i2 = this.nanos_;
        if (i2 != 0) {
            iM7653 += AbstractC3461.m7644(2, i2);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7653;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getNanos() + ((((AbstractC3401.m7515(getSeconds()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3718.f11535;
        c3618.m7840(Timestamp.class, C3319.class);
        return c3618;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

    @Override // com.google.protobuf.AbstractC3532
    public C3319 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3319(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3319 toBuilder() {
        C3720 c3720 = null;
        return this == DEFAULT_INSTANCE ? new C3319(c3720) : new C3319(c3720).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        long j = this.seconds_;
        if (j != 0) {
            abstractC3461.mo7661(1, j);
        }
        int i = this.nanos_;
        if (i != 0) {
            abstractC3461.mo7664(2, i);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Timestamp$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3319 extends GeneratedMessage.AbstractC3304 implements InterfaceC3717 {
        private int bitField0_;
        private int nanos_;
        private long seconds_;

        public /* synthetic */ C3319(InterfaceC3531 interfaceC3531, C3720 c3720) {
            this(interfaceC3531);
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

        public static final C3662 getDescriptor() {
            return AbstractC3718.f11536;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Timestamp build() {
            Timestamp timestampBuildPartial = buildPartial();
            if (timestampBuildPartial.isInitialized()) {
                return timestampBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) timestampBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Timestamp buildPartial() {
            Timestamp timestamp = new Timestamp(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(timestamp);
            }
            onBuilt();
            return timestamp;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3319 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.seconds_ = 0L;
            this.nanos_ = 0;
            return this;
        }

        public C3319 clearNanos() {
            this.bitField0_ &= -3;
            this.nanos_ = 0;
            onChanged();
            return this;
        }

        public C3319 clearSeconds() {
            this.bitField0_ &= -2;
            this.seconds_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3718.f11536;
        }

        @Override // com.google.protobuf.InterfaceC3717
        public int getNanos() {
            return this.nanos_;
        }

        @Override // com.google.protobuf.InterfaceC3717
        public long getSeconds() {
            return this.seconds_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3718.f11535;
            c3618.m7840(Timestamp.class, C3319.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3319 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 8) {
                                this.seconds_ = abstractC3473.mo7731();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 16) {
                                this.nanos_ = abstractC3473.mo7730();
                                this.bitField0_ |= 2;
                            } else if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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

        public C3319 setNanos(int i) {
            this.nanos_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3319 setSeconds(long j) {
            this.seconds_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ C3319(C3720 c3720) {
            this();
        }

        private C3319() {
        }

        private C3319(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Timestamp getDefaultInstanceForType() {
            return Timestamp.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3319 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Timestamp) {
                return mergeFrom((Timestamp) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3319 mergeFrom(Timestamp timestamp) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Timestamp getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Timestamp) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3319 newBuilderForType() {
        return newBuilder();
    }

    public static C3319 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Timestamp) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public /* synthetic */ Timestamp(GeneratedMessage.AbstractC3304 abstractC3304, C3720 c3720) {
        this(abstractC3304);
    }

    private Timestamp() {
        this.seconds_ = 0L;
        this.nanos_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Timestamp parseFrom(ByteString byteString) {
        return (Timestamp) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Timestamp parseFrom(ByteString byteString, C3696 c3696) {
        return (Timestamp) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Timestamp parseFrom(byte[] bArr) {
        return (Timestamp) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Timestamp parseFrom(byte[] bArr, C3696 c3696) {
        return (Timestamp) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Timestamp parseFrom(InputStream inputStream) {
        return (Timestamp) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, C3696 c3696) {
        return (Timestamp) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Timestamp parseFrom(AbstractC3473 abstractC3473) {
        return (Timestamp) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Timestamp parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Timestamp) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
