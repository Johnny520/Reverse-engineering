package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Mixin extends GeneratedMessage implements InterfaceC3366 {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final InterfaceC3374 PARSER;
    public static final int ROOT_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private volatile Object root_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Mixin");
        DEFAULT_INSTANCE = new Mixin();
        PARSER = new C3367();
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

    public static final C3662 getDescriptor() {
        return AbstractC3540.f11181;
    }

    public static C3314 newBuilder(Mixin mixin) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) {
        return (Mixin) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) {
        return (Mixin) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3540.f11181;
    }

    @Override // com.google.protobuf.InterfaceC3366
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3366
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3366
    public String getRoot() {
        Object obj = this.root_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.root_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3366
    public ByteString getRootBytes() {
        Object obj = this.root_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.root_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3540.f11180;
        c3618.m7840(Mixin.class, C3314.class);
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
    public C3314 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3314(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3314 toBuilder() {
        C3367 c3367 = null;
        return this == DEFAULT_INSTANCE ? new C3314(c3367) : new C3314(c3367).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.root_)) {
            GeneratedMessage.writeString(abstractC3461, 2, this.root_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Mixin$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3314 extends GeneratedMessage.AbstractC3304 implements InterfaceC3366 {
        private int bitField0_;
        private Object name_;
        private Object root_;

        private C3314() {
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

        public static final C3662 getDescriptor() {
            return AbstractC3540.f11181;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Mixin build() {
            Mixin mixinBuildPartial = buildPartial();
            if (mixinBuildPartial.isInitialized()) {
                return mixinBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) mixinBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Mixin buildPartial() {
            Mixin mixin = new Mixin(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(mixin);
            }
            onBuilt();
            return mixin;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3314 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.root_ = "";
            return this;
        }

        public C3314 clearName() {
            this.name_ = Mixin.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3314 clearRoot() {
            this.root_ = Mixin.getDefaultInstance().getRoot();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3540.f11181;
        }

        @Override // com.google.protobuf.InterfaceC3366
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3366
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3366
        public String getRoot() {
            Object obj = this.root_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.root_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3366
        public ByteString getRootBytes() {
            Object obj = this.root_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.root_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3540.f11180;
            c3618.m7840(Mixin.class, C3314.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3314 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.name_ = abstractC3473.mo7719();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 18) {
                                this.root_ = abstractC3473.mo7719();
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

        public C3314 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3314 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3314 setRoot(String str) {
            str.getClass();
            this.root_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3314 setRootBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.root_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Mixin getDefaultInstanceForType() {
            return Mixin.getDefaultInstance();
        }

        public /* synthetic */ C3314(C3367 c3367) {
            this();
        }

        public /* synthetic */ C3314(InterfaceC3531 interfaceC3531, C3367 c3367) {
            this(interfaceC3531);
        }

        private C3314(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            this.root_ = "";
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3314 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Mixin) {
                return mergeFrom((Mixin) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3314 mergeFrom(Mixin mixin) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Mixin getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Mixin) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3314 newBuilderForType() {
        return newBuilder();
    }

    public static C3314 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Mixin) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Mixin parseFrom(ByteString byteString) {
        return (Mixin) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    private Mixin(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.root_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Mixin parseFrom(ByteString byteString, C3696 c3696) {
        return (Mixin) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public /* synthetic */ Mixin(GeneratedMessage.AbstractC3304 abstractC3304, C3367 c3367) {
        this(abstractC3304);
    }

    public static Mixin parseFrom(byte[] bArr) {
        return (Mixin) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Mixin parseFrom(byte[] bArr, C3696 c3696) {
        return (Mixin) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Mixin parseFrom(InputStream inputStream) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, C3696 c3696) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Mixin parseFrom(AbstractC3473 abstractC3473) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Mixin parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Mixin) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
