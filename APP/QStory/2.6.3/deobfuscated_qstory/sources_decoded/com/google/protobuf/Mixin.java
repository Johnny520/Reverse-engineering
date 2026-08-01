package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Mixin extends GeneratedMessage implements InterfaceC3367 {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final InterfaceC3375 PARSER;
    public static final int ROOT_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private volatile Object root_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Mixin");
        DEFAULT_INSTANCE = new Mixin();
        PARSER = new C3368();
    }

    private Mixin() {
        this.name_ = "";
        this.root_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.root_ = "";
    }

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3541.f11186;
    }

    public static C3315 newBuilder(Mixin mixin) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) {
        return (Mixin) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) {
        return (Mixin) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Mixin)) {
            return super.equals(obj);
        }
        Mixin mixin = (Mixin) obj;
        return getName().equals(mixin.getName()) && getRoot().equals(mixin.getRoot()) && getUnknownFields().equals(mixin.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3541.f11186;
    }

    @Override // com.google.protobuf.InterfaceC3367
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3367
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3367
    public String getRoot() {
        Object obj = this.root_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.root_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3367
    public ByteString getRootBytes() {
        Object obj = this.root_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.root_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if (!GeneratedMessage.isStringEmpty(this.root_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.root_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getRoot().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3541.f11185;
        c3619.m7827(Mixin.class, C3315.class);
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
    public C3315 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3315(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3315 toBuilder() {
        C3368 c3368 = null;
        return this == DEFAULT_INSTANCE ? new C3315(c3368) : new C3315(c3368).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.root_)) {
            GeneratedMessage.writeString(abstractC3462, 2, this.root_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Mixin$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3315 extends GeneratedMessage.AbstractC3305 implements InterfaceC3367 {
        private int bitField0_;
        private Object name_;
        private Object root_;

        private C3315() {
            this.name_ = "";
            this.root_ = "";
        }

        private void buildPartial0(Mixin mixin) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                mixin.name_ = this.name_;
            }
            if ((i & 2) != 0) {
                mixin.root_ = this.root_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3541.f11186;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Mixin build() {
            Mixin mixinBuildPartial = buildPartial();
            if (mixinBuildPartial.isInitialized()) {
                return mixinBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) mixinBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Mixin buildPartial() {
            Mixin mixin = new Mixin(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(mixin);
            }
            onBuilt();
            return mixin;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3315 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.root_ = "";
            return this;
        }

        public C3315 clearName() {
            this.name_ = Mixin.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3315 clearRoot() {
            this.root_ = Mixin.getDefaultInstance().getRoot();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3541.f11186;
        }

        @Override // com.google.protobuf.InterfaceC3367
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3367
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3367
        public String getRoot() {
            Object obj = this.root_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.root_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3367
        public ByteString getRootBytes() {
            Object obj = this.root_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.root_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3541.f11185;
            c3619.m7827(Mixin.class, C3315.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3315 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.name_ = abstractC3474.mo7706();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 18) {
                                this.root_ = abstractC3474.mo7706();
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

        public C3315 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3315 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3315 setRoot(String str) {
            str.getClass();
            this.root_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3315 setRootBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.root_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Mixin getDefaultInstanceForType() {
            return Mixin.getDefaultInstance();
        }

        public /* synthetic */ C3315(C3368 c3368) {
            this();
        }

        public /* synthetic */ C3315(InterfaceC3532 interfaceC3532, C3368 c3368) {
            this(interfaceC3532);
        }

        private C3315(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            this.root_ = "";
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3315 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Mixin) {
                return mergeFrom((Mixin) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3315 mergeFrom(Mixin mixin) {
            if (mixin == Mixin.getDefaultInstance()) {
                return this;
            }
            if (!mixin.getName().isEmpty()) {
                this.name_ = mixin.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!mixin.getRoot().isEmpty()) {
                this.root_ = mixin.root_;
                this.bitField0_ |= 2;
                onChanged();
            }
            mergeUnknownFields(mixin.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Mixin getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Mixin) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3315 newBuilderForType() {
        return newBuilder();
    }

    public static C3315 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Mixin) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Mixin parseFrom(ByteString byteString) {
        return (Mixin) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    private Mixin(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.root_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Mixin parseFrom(ByteString byteString, C3697 c3697) {
        return (Mixin) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public /* synthetic */ Mixin(GeneratedMessage.AbstractC3305 abstractC3305, C3368 c3368) {
        this(abstractC3305);
    }

    public static Mixin parseFrom(byte[] bArr) {
        return (Mixin) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Mixin parseFrom(byte[] bArr, C3697 c3697) {
        return (Mixin) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Mixin parseFrom(InputStream inputStream) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, C3697 c3697) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Mixin parseFrom(AbstractC3474 abstractC3474) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Mixin parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
