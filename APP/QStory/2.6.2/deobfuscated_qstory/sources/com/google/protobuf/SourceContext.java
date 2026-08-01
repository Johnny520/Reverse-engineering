package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class SourceContext extends GeneratedMessage implements InterfaceC3355 {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private volatile Object fileName_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "SourceContext");
        DEFAULT_INSTANCE = new SourceContext();
        PARSER = new C3347();
    }

    private SourceContext() {
        this.fileName_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.fileName_ = "";
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3354.f10999;
    }

    public static C3316 newBuilder(SourceContext sourceContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sourceContext);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) {
        return (SourceContext) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) {
        return (SourceContext) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SourceContext)) {
            return super.equals(obj);
        }
        SourceContext sourceContext = (SourceContext) obj;
        return getFileName().equals(sourceContext.getFileName()) && getUnknownFields().equals(sourceContext.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3354.f10999;
    }

    @Override // com.google.protobuf.InterfaceC3355
    public String getFileName() {
        Object obj = this.fileName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.fileName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3355
    public ByteString getFileNameBytes() {
        Object obj = this.fileName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.fileName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (!GeneratedMessage.isStringEmpty(this.fileName_) ? GeneratedMessage.computeStringSize(1, this.fileName_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getFileName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3354.f10998;
        c3618.m7840(SourceContext.class, C3316.class);
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
    public C3316 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3316(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3316 toBuilder() {
        C3347 c3347 = null;
        return this == DEFAULT_INSTANCE ? new C3316(c3347) : new C3316(c3347).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.fileName_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.fileName_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.SourceContext$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3316 extends GeneratedMessage.AbstractC3304 implements InterfaceC3355 {
        private int bitField0_;
        private Object fileName_;

        private C3316() {
            this.fileName_ = "";
        }

        private void buildPartial0(SourceContext sourceContext) {
            if ((this.bitField0_ & 1) != 0) {
                sourceContext.fileName_ = this.fileName_;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3354.f10999;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public SourceContext build() {
            SourceContext sourceContextBuildPartial = buildPartial();
            if (sourceContextBuildPartial.isInitialized()) {
                return sourceContextBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) sourceContextBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public SourceContext buildPartial() {
            SourceContext sourceContext = new SourceContext(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(sourceContext);
            }
            onBuilt();
            return sourceContext;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3316 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.fileName_ = "";
            return this;
        }

        public C3316 clearFileName() {
            this.fileName_ = SourceContext.getDefaultInstance().getFileName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3354.f10999;
        }

        @Override // com.google.protobuf.InterfaceC3355
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fileName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3355
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3354.f10998;
            c3618.m7840(SourceContext.class, C3316.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3316 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.fileName_ = abstractC3473.mo7719();
                                this.bitField0_ |= 1;
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

        public C3316 setFileName(String str) {
            str.getClass();
            this.fileName_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3316 setFileNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.fileName_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public SourceContext getDefaultInstanceForType() {
            return SourceContext.getDefaultInstance();
        }

        public /* synthetic */ C3316(C3347 c3347) {
            this();
        }

        public /* synthetic */ C3316(InterfaceC3531 interfaceC3531, C3347 c3347) {
            this(interfaceC3531);
        }

        private C3316(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.fileName_ = "";
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3316 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof SourceContext) {
                return mergeFrom((SourceContext) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3316 mergeFrom(SourceContext sourceContext) {
            if (sourceContext == SourceContext.getDefaultInstance()) {
                return this;
            }
            if (!sourceContext.getFileName().isEmpty()) {
                this.fileName_ = sourceContext.fileName_;
                this.bitField0_ |= 1;
                onChanged();
            }
            mergeUnknownFields(sourceContext.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public SourceContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (SourceContext) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3316 newBuilderForType() {
        return newBuilder();
    }

    public static C3316 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private SourceContext(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.fileName_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (SourceContext) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public /* synthetic */ SourceContext(GeneratedMessage.AbstractC3304 abstractC3304, C3347 c3347) {
        this(abstractC3304);
    }

    public static SourceContext parseFrom(ByteString byteString) {
        return (SourceContext) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static SourceContext parseFrom(ByteString byteString, C3696 c3696) {
        return (SourceContext) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static SourceContext parseFrom(byte[] bArr) {
        return (SourceContext) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static SourceContext parseFrom(byte[] bArr, C3696 c3696) {
        return (SourceContext) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static SourceContext parseFrom(InputStream inputStream) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static SourceContext parseFrom(InputStream inputStream, C3696 c3696) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static SourceContext parseFrom(AbstractC3473 abstractC3473) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static SourceContext parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
