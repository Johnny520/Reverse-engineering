package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Empty extends GeneratedMessage implements InterfaceC4417 {
    private static final Empty DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Empty");
        DEFAULT_INSTANCE = new Empty();
        PARSER = new C4418();
    }

    private Empty(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4420.f11554;
    }

    public static C4130 newBuilder(Empty empty) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(empty);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) {
        return (Empty) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) {
        return (Empty) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return !(obj instanceof Empty) ? super.equals(obj) : getUnknownFields().equals(((Empty) obj).getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4420.f11554;
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
        int serializedSize = getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4420.f11553;
        c4451.m8386(Empty.class, C4130.class);
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
    public C4130 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4130(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4130 toBuilder() {
        C4418 c4418 = null;
        return this == DEFAULT_INSTANCE ? new C4130(c4418) : new C4130(c4418).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Empty$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4130 extends GeneratedMessage.AbstractC4137 implements InterfaceC4417 {
        public /* synthetic */ C4130(InterfaceC4364 interfaceC4364, C4418 c4418) {
            this(interfaceC4364);
        }

        public static final C4495 getDescriptor() {
            return AbstractC4420.f11554;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Empty build() {
            Empty emptyBuildPartial = buildPartial();
            if (emptyBuildPartial.isInitialized()) {
                return emptyBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) emptyBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Empty buildPartial() {
            Empty empty = new Empty(this, null);
            onBuilt();
            return empty;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4420.f11554;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4420.f11553;
            c4451.m8386(Empty.class, C4130.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4130 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 == 0 || !super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
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

        public /* synthetic */ C4130(C4418 c4418) {
            this();
        }

        private C4130() {
        }

        private C4130(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Empty getDefaultInstanceForType() {
            return Empty.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4130 mo7901clear() {
            super.mo7901clear();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4130 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Empty) {
                return mergeFrom((Empty) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4130 mergeFrom(Empty empty) {
            if (empty == Empty.getDefaultInstance()) {
                return this;
            }
            mergeUnknownFields(empty.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Empty getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public /* synthetic */ Empty(GeneratedMessage.AbstractC4137 abstractC4137, C4418 c4418) {
        this(abstractC4137);
    }

    private Empty() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Empty) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4130 newBuilderForType() {
        return newBuilder();
    }

    public static C4130 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Empty) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Empty parseFrom(ByteString byteString) {
        return (Empty) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Empty parseFrom(ByteString byteString, C4529 c4529) {
        return (Empty) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Empty parseFrom(byte[] bArr) {
        return (Empty) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Empty parseFrom(byte[] bArr, C4529 c4529) {
        return (Empty) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Empty parseFrom(InputStream inputStream) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, C4529 c4529) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Empty parseFrom(AbstractC4306 abstractC4306) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Empty parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
