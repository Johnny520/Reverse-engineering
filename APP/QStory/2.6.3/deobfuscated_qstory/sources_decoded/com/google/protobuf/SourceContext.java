package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class SourceContext extends GeneratedMessage implements InterfaceC3356 {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private volatile Object fileName_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "SourceContext");
        DEFAULT_INSTANCE = new SourceContext();
        PARSER = new C3348();
    }

    private SourceContext() {
        this.fileName_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.fileName_ = "";
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3355.f11004;
    }

    public static C3317 newBuilder(SourceContext sourceContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sourceContext);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) {
        return (SourceContext) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) {
        return (SourceContext) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3355.f11004;
    }

    @Override // com.google.protobuf.InterfaceC3356
    public String getFileName() {
        Object obj = this.fileName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.fileName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3356
    public ByteString getFileNameBytes() {
        Object obj = this.fileName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.fileName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (!GeneratedMessage.isStringEmpty(this.fileName_) ? GeneratedMessage.computeStringSize(1, this.fileName_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3355.f11003;
        c3619.m7827(SourceContext.class, C3317.class);
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
    public C3317 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3317(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3317 toBuilder() {
        C3348 c3348 = null;
        return this == DEFAULT_INSTANCE ? new C3317(c3348) : new C3317(c3348).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.fileName_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.fileName_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.SourceContext$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3317 extends GeneratedMessage.AbstractC3305 implements InterfaceC3356 {
        private int bitField0_;
        private Object fileName_;

        private C3317() {
            this.fileName_ = "";
        }

        private void buildPartial0(SourceContext sourceContext) {
            if ((this.bitField0_ & 1) != 0) {
                sourceContext.fileName_ = this.fileName_;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3355.f11004;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public SourceContext build() {
            SourceContext sourceContextBuildPartial = buildPartial();
            if (sourceContextBuildPartial.isInitialized()) {
                return sourceContextBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) sourceContextBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public SourceContext buildPartial() {
            SourceContext sourceContext = new SourceContext(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(sourceContext);
            }
            onBuilt();
            return sourceContext;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3317 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.fileName_ = "";
            return this;
        }

        public C3317 clearFileName() {
            this.fileName_ = SourceContext.getDefaultInstance().getFileName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3355.f11004;
        }

        @Override // com.google.protobuf.InterfaceC3356
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fileName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3356
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3355.f11003;
            c3619.m7827(SourceContext.class, C3317.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3317 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.fileName_ = abstractC3474.mo7706();
                                this.bitField0_ |= 1;
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

        public C3317 setFileName(String str) {
            str.getClass();
            this.fileName_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3317 setFileNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.fileName_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public SourceContext getDefaultInstanceForType() {
            return SourceContext.getDefaultInstance();
        }

        public /* synthetic */ C3317(C3348 c3348) {
            this();
        }

        public /* synthetic */ C3317(InterfaceC3532 interfaceC3532, C3348 c3348) {
            this(interfaceC3532);
        }

        private C3317(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.fileName_ = "";
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3317 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof SourceContext) {
                return mergeFrom((SourceContext) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3317 mergeFrom(SourceContext sourceContext) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public SourceContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (SourceContext) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3317 newBuilderForType() {
        return newBuilder();
    }

    public static C3317 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private SourceContext(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.fileName_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (SourceContext) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public /* synthetic */ SourceContext(GeneratedMessage.AbstractC3305 abstractC3305, C3348 c3348) {
        this(abstractC3305);
    }

    public static SourceContext parseFrom(ByteString byteString) {
        return (SourceContext) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static SourceContext parseFrom(ByteString byteString, C3697 c3697) {
        return (SourceContext) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static SourceContext parseFrom(byte[] bArr) {
        return (SourceContext) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static SourceContext parseFrom(byte[] bArr, C3697 c3697) {
        return (SourceContext) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static SourceContext parseFrom(InputStream inputStream) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static SourceContext parseFrom(InputStream inputStream, C3697 c3697) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static SourceContext parseFrom(AbstractC3474 abstractC3474) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static SourceContext parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
