package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Mixin extends GeneratedMessage implements InterfaceC4199 {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final InterfaceC4207 PARSER;
    public static final int ROOT_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private volatile Object root_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Mixin");
        DEFAULT_INSTANCE = new Mixin();
        PARSER = new C4200();
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

    public static final C4495 getDescriptor() {
        return AbstractC4373.f11531;
    }

    public static C4147 newBuilder(Mixin mixin) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) {
        return (Mixin) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) {
        return (Mixin) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4373.f11531;
    }

    @Override // com.google.protobuf.InterfaceC4199
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4199
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4199
    public String getRoot() {
        Object obj = this.root_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.root_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4199
    public ByteString getRootBytes() {
        Object obj = this.root_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.root_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4373.f11530;
        c4451.m8386(Mixin.class, C4147.class);
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
    public C4147 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4147(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4147 toBuilder() {
        C4200 c4200 = null;
        return this == DEFAULT_INSTANCE ? new C4147(c4200) : new C4147(c4200).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.root_)) {
            GeneratedMessage.writeString(abstractC4294, 2, this.root_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Mixin$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4147 extends GeneratedMessage.AbstractC4137 implements InterfaceC4199 {
        private int bitField0_;
        private Object name_;
        private Object root_;

        private C4147() {
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

        public static final C4495 getDescriptor() {
            return AbstractC4373.f11531;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Mixin build() {
            Mixin mixinBuildPartial = buildPartial();
            if (mixinBuildPartial.isInitialized()) {
                return mixinBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) mixinBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Mixin buildPartial() {
            Mixin mixin = new Mixin(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(mixin);
            }
            onBuilt();
            return mixin;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4147 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.root_ = "";
            return this;
        }

        public C4147 clearName() {
            this.name_ = Mixin.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4147 clearRoot() {
            this.root_ = Mixin.getDefaultInstance().getRoot();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4373.f11531;
        }

        @Override // com.google.protobuf.InterfaceC4199
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4199
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4199
        public String getRoot() {
            Object obj = this.root_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.root_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4199
        public ByteString getRootBytes() {
            Object obj = this.root_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.root_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4373.f11530;
            c4451.m8386(Mixin.class, C4147.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4147 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.name_ = abstractC4306.mo8265();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 18) {
                                this.root_ = abstractC4306.mo8265();
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

        public C4147 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4147 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4147 setRoot(String str) {
            str.getClass();
            this.root_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4147 setRootBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.root_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Mixin getDefaultInstanceForType() {
            return Mixin.getDefaultInstance();
        }

        public /* synthetic */ C4147(C4200 c4200) {
            this();
        }

        public /* synthetic */ C4147(InterfaceC4364 interfaceC4364, C4200 c4200) {
            this(interfaceC4364);
        }

        private C4147(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            this.root_ = "";
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4147 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Mixin) {
                return mergeFrom((Mixin) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4147 mergeFrom(Mixin mixin) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Mixin getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Mixin) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4147 newBuilderForType() {
        return newBuilder();
    }

    public static C4147 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Mixin) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Mixin parseFrom(ByteString byteString) {
        return (Mixin) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    private Mixin(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.root_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Mixin parseFrom(ByteString byteString, C4529 c4529) {
        return (Mixin) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public /* synthetic */ Mixin(GeneratedMessage.AbstractC4137 abstractC4137, C4200 c4200) {
        this(abstractC4137);
    }

    public static Mixin parseFrom(byte[] bArr) {
        return (Mixin) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Mixin parseFrom(byte[] bArr, C4529 c4529) {
        return (Mixin) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Mixin parseFrom(InputStream inputStream) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, C4529 c4529) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Mixin parseFrom(AbstractC4306 abstractC4306) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Mixin parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
