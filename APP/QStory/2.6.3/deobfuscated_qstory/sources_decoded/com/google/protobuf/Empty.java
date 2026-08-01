package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Empty extends GeneratedMessage implements InterfaceC3585 {
    private static final Empty DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Empty");
        DEFAULT_INSTANCE = new Empty();
        PARSER = new C3586();
    }

    private Empty(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3588.f11209;
    }

    public static C3298 newBuilder(Empty empty) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(empty);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) {
        return (Empty) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) {
        return (Empty) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return !(obj instanceof Empty) ? super.equals(obj) : getUnknownFields().equals(((Empty) obj).getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3588.f11209;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3588.f11208;
        c3619.m7827(Empty.class, C3298.class);
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
    public C3298 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3298(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3298 toBuilder() {
        C3586 c3586 = null;
        return this == DEFAULT_INSTANCE ? new C3298(c3586) : new C3298(c3586).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Empty$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3298 extends GeneratedMessage.AbstractC3305 implements InterfaceC3585 {
        public /* synthetic */ C3298(InterfaceC3532 interfaceC3532, C3586 c3586) {
            this(interfaceC3532);
        }

        public static final C3663 getDescriptor() {
            return AbstractC3588.f11209;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Empty build() {
            Empty emptyBuildPartial = buildPartial();
            if (emptyBuildPartial.isInitialized()) {
                return emptyBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) emptyBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Empty buildPartial() {
            Empty empty = new Empty(this, null);
            onBuilt();
            return empty;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3588.f11209;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3588.f11208;
            c3619.m7827(Empty.class, C3298.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3298 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 == 0 || !super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
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

        public /* synthetic */ C3298(C3586 c3586) {
            this();
        }

        private C3298() {
        }

        private C3298(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Empty getDefaultInstanceForType() {
            return Empty.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3298 mo7342clear() {
            super.mo7342clear();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3298 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Empty) {
                return mergeFrom((Empty) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3298 mergeFrom(Empty empty) {
            if (empty == Empty.getDefaultInstance()) {
                return this;
            }
            mergeUnknownFields(empty.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Empty getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public /* synthetic */ Empty(GeneratedMessage.AbstractC3305 abstractC3305, C3586 c3586) {
        this(abstractC3305);
    }

    private Empty() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Empty) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3298 newBuilderForType() {
        return newBuilder();
    }

    public static C3298 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Empty) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Empty parseFrom(ByteString byteString) {
        return (Empty) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Empty parseFrom(ByteString byteString, C3697 c3697) {
        return (Empty) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Empty parseFrom(byte[] bArr) {
        return (Empty) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Empty parseFrom(byte[] bArr, C3697 c3697) {
        return (Empty) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Empty parseFrom(InputStream inputStream) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, C3697 c3697) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Empty parseFrom(AbstractC3474 abstractC3474) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Empty parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
