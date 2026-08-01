package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Empty extends GeneratedMessage implements InterfaceC3584 {
    private static final Empty DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Empty");
        DEFAULT_INSTANCE = new Empty();
        PARSER = new C3585();
    }

    private Empty(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3587.f11204;
    }

    public static C3297 newBuilder(Empty empty) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(empty);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) {
        return (Empty) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) {
        return (Empty) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return !(obj instanceof Empty) ? super.equals(obj) : getUnknownFields().equals(((Empty) obj).getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3587.f11204;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3587.f11203;
        c3618.m7840(Empty.class, C3297.class);
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
    public C3297 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3297(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3297 toBuilder() {
        C3585 c3585 = null;
        return this == DEFAULT_INSTANCE ? new C3297(c3585) : new C3297(c3585).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Empty$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3297 extends GeneratedMessage.AbstractC3304 implements InterfaceC3584 {
        public /* synthetic */ C3297(InterfaceC3531 interfaceC3531, C3585 c3585) {
            this(interfaceC3531);
        }

        public static final C3662 getDescriptor() {
            return AbstractC3587.f11204;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Empty build() {
            Empty emptyBuildPartial = buildPartial();
            if (emptyBuildPartial.isInitialized()) {
                return emptyBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) emptyBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Empty buildPartial() {
            Empty empty = new Empty(this, null);
            onBuilt();
            return empty;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3587.f11204;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3587.f11203;
            c3618.m7840(Empty.class, C3297.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3297 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 == 0 || !super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                            z = true;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.unwrapIOException();
                    }
                } finally {
                    onChanged();
                }
            }
            return this;
        }

        public /* synthetic */ C3297(C3585 c3585) {
            this();
        }

        private C3297() {
        }

        private C3297(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Empty getDefaultInstanceForType() {
            return Empty.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3297 mo7355clear() {
            super.mo7355clear();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3297 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Empty) {
                return mergeFrom((Empty) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3297 mergeFrom(Empty empty) {
            if (empty == Empty.getDefaultInstance()) {
                return this;
            }
            mergeUnknownFields(empty.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Empty getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public /* synthetic */ Empty(GeneratedMessage.AbstractC3304 abstractC3304, C3585 c3585) {
        this(abstractC3304);
    }

    private Empty() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Empty) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3297 newBuilderForType() {
        return newBuilder();
    }

    public static C3297 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Empty) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Empty parseFrom(ByteString byteString) {
        return (Empty) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Empty parseFrom(ByteString byteString, C3696 c3696) {
        return (Empty) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Empty parseFrom(byte[] bArr) {
        return (Empty) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Empty parseFrom(byte[] bArr, C3696 c3696) {
        return (Empty) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Empty parseFrom(InputStream inputStream) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, C3696 c3696) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Empty parseFrom(AbstractC3473 abstractC3473) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Empty parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
