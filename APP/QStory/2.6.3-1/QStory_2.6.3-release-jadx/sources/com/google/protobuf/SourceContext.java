package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class SourceContext extends GeneratedMessage implements InterfaceC4188 {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private volatile Object fileName_;
    private byte memoizedIsInitialized;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "SourceContext");
        DEFAULT_INSTANCE = new SourceContext();
        PARSER = new C4180();
    }

    private SourceContext() {
        this.fileName_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.fileName_ = "";
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4187.f11349;
    }

    public static C4149 newBuilder(SourceContext sourceContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sourceContext);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) {
        return (SourceContext) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) {
        return (SourceContext) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4187.f11349;
    }

    @Override // com.google.protobuf.InterfaceC4188
    public String getFileName() {
        Object obj = this.fileName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.fileName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4188
    public ByteString getFileNameBytes() {
        Object obj = this.fileName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.fileName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int serializedSize = getUnknownFields().getSerializedSize() + (!GeneratedMessage.isStringEmpty(this.fileName_) ? GeneratedMessage.computeStringSize(1, this.fileName_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4187.f11348;
        c4451.m8386(SourceContext.class, C4149.class);
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
    public C4149 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4149(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4149 toBuilder() {
        C4180 c4180 = null;
        return this == DEFAULT_INSTANCE ? new C4149(c4180) : new C4149(c4180).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.fileName_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.fileName_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.SourceContext$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4149 extends GeneratedMessage.AbstractC4137 implements InterfaceC4188 {
        private int bitField0_;
        private Object fileName_;

        private C4149() {
            this.fileName_ = "";
        }

        private void buildPartial0(SourceContext sourceContext) {
            if ((this.bitField0_ & 1) != 0) {
                sourceContext.fileName_ = this.fileName_;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4187.f11349;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public SourceContext build() {
            SourceContext sourceContextBuildPartial = buildPartial();
            if (sourceContextBuildPartial.isInitialized()) {
                return sourceContextBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) sourceContextBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public SourceContext buildPartial() {
            SourceContext sourceContext = new SourceContext(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(sourceContext);
            }
            onBuilt();
            return sourceContext;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4149 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.fileName_ = "";
            return this;
        }

        public C4149 clearFileName() {
            this.fileName_ = SourceContext.getDefaultInstance().getFileName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4187.f11349;
        }

        @Override // com.google.protobuf.InterfaceC4188
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fileName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4188
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4187.f11348;
            c4451.m8386(SourceContext.class, C4149.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4149 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.fileName_ = abstractC4306.mo8265();
                                this.bitField0_ |= 1;
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

        public C4149 setFileName(String str) {
            str.getClass();
            this.fileName_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4149 setFileNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.fileName_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public SourceContext getDefaultInstanceForType() {
            return SourceContext.getDefaultInstance();
        }

        public /* synthetic */ C4149(C4180 c4180) {
            this();
        }

        public /* synthetic */ C4149(InterfaceC4364 interfaceC4364, C4180 c4180) {
            this(interfaceC4364);
        }

        private C4149(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.fileName_ = "";
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4149 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof SourceContext) {
                return mergeFrom((SourceContext) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4149 mergeFrom(SourceContext sourceContext) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public SourceContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (SourceContext) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4149 newBuilderForType() {
        return newBuilder();
    }

    public static C4149 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private SourceContext(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.fileName_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (SourceContext) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public /* synthetic */ SourceContext(GeneratedMessage.AbstractC4137 abstractC4137, C4180 c4180) {
        this(abstractC4137);
    }

    public static SourceContext parseFrom(ByteString byteString) {
        return (SourceContext) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static SourceContext parseFrom(ByteString byteString, C4529 c4529) {
        return (SourceContext) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static SourceContext parseFrom(byte[] bArr) {
        return (SourceContext) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static SourceContext parseFrom(byte[] bArr, C4529 c4529) {
        return (SourceContext) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static SourceContext parseFrom(InputStream inputStream) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static SourceContext parseFrom(InputStream inputStream, C4529 c4529) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static SourceContext parseFrom(AbstractC4306 abstractC4306) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static SourceContext parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (SourceContext) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
