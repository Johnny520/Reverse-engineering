package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$MethodDescriptorProto extends GeneratedMessage implements InterfaceC4331 {
    public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
    private static final DescriptorProtos$MethodDescriptorProto DEFAULT_INSTANCE;
    public static final int INPUT_TYPE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
    private static final InterfaceC4207 PARSER;
    public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private boolean clientStreaming_;
    private volatile Object inputType_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private DescriptorProtos$MethodOptions options_;
    private volatile Object outputType_;
    private boolean serverStreaming_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "MethodDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$MethodDescriptorProto();
        PARSER = new C4335();
    }

    private DescriptorProtos$MethodDescriptorProto() {
        this.name_ = "";
        this.inputType_ = "";
        this.outputType_ = "";
        this.clientStreaming_ = false;
        this.serverStreaming_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.inputType_ = "";
        this.outputType_ = "";
    }

    public static /* synthetic */ int access$15576(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, int i) {
        int i2 = i | descriptorProtos$MethodDescriptorProto.bitField0_;
        descriptorProtos$MethodDescriptorProto.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$MethodDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11763;
    }

    public static C4118 newBuilder(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$MethodDescriptorProto);
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$MethodDescriptorProto)) {
            return super.equals(obj);
        }
        DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = (DescriptorProtos$MethodDescriptorProto) obj;
        if (hasName() != descriptorProtos$MethodDescriptorProto.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(descriptorProtos$MethodDescriptorProto.getName())) || hasInputType() != descriptorProtos$MethodDescriptorProto.hasInputType()) {
            return false;
        }
        if ((hasInputType() && !getInputType().equals(descriptorProtos$MethodDescriptorProto.getInputType())) || hasOutputType() != descriptorProtos$MethodDescriptorProto.hasOutputType()) {
            return false;
        }
        if ((hasOutputType() && !getOutputType().equals(descriptorProtos$MethodDescriptorProto.getOutputType())) || hasOptions() != descriptorProtos$MethodDescriptorProto.hasOptions()) {
            return false;
        }
        if ((hasOptions() && !getOptions().equals(descriptorProtos$MethodDescriptorProto.getOptions())) || hasClientStreaming() != descriptorProtos$MethodDescriptorProto.hasClientStreaming()) {
            return false;
        }
        if ((!hasClientStreaming() || getClientStreaming() == descriptorProtos$MethodDescriptorProto.getClientStreaming()) && hasServerStreaming() == descriptorProtos$MethodDescriptorProto.hasServerStreaming()) {
            return (!hasServerStreaming() || getServerStreaming() == descriptorProtos$MethodDescriptorProto.getServerStreaming()) && getUnknownFields().equals(descriptorProtos$MethodDescriptorProto.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public boolean getClientStreaming() {
        return this.clientStreaming_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11763;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public String getInputType() {
        Object obj = this.inputType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.inputType_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public ByteString getInputTypeBytes() {
        Object obj = this.inputType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.inputType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.name_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public DescriptorProtos$MethodOptions getOptions() {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
        return descriptorProtos$MethodOptions == null ? DescriptorProtos$MethodOptions.getDefaultInstance() : descriptorProtos$MethodOptions;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public InterfaceC4332 getOptionsOrBuilder() {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
        return descriptorProtos$MethodOptions == null ? DescriptorProtos$MethodOptions.getDefaultInstance() : descriptorProtos$MethodOptions;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public String getOutputType() {
        Object obj = this.outputType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.outputType_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public ByteString getOutputTypeBytes() {
        Object obj = this.outputType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.outputType_ = byteStringCopyFromUtf8;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.inputType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(3, this.outputType_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC4294.m8198(4, getOptions());
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeStringSize += AbstractC4294.m8193(5);
        }
        if ((this.bitField0_ & 32) != 0) {
            iComputeStringSize += AbstractC4294.m8193(6);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public boolean getServerStreaming() {
        return this.serverStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public boolean hasClientStreaming() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public boolean hasInputType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public boolean hasOptions() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public boolean hasOutputType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC4331
    public boolean hasServerStreaming() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasInputType()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getInputType().hashCode();
        }
        if (hasOutputType()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getOutputType().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + getOptions().hashCode();
        }
        if (hasClientStreaming()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 5, 53) + AbstractC4234.m8062(getClientStreaming());
        }
        if (hasServerStreaming()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + AbstractC4234.m8062(getServerStreaming());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11762;
        c4451.m8386(DescriptorProtos$MethodDescriptorProto.class, C4118.class);
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
        if (!hasOptions() || getOptions().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4118 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4118(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4118 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4118() : new C4118().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessage.writeString(abstractC4294, 2, this.inputType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            GeneratedMessage.writeString(abstractC4294, 3, this.outputType_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.mo8208(4, getOptions());
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC4294.mo8222(5, this.clientStreaming_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC4294.mo8222(6, this.serverStreaming_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4118 extends GeneratedMessage.AbstractC4137 implements InterfaceC4331 {
        private int bitField0_;
        private boolean clientStreaming_;
        private Object inputType_;
        private Object name_;
        private C4174 optionsBuilder_;
        private DescriptorProtos$MethodOptions options_;
        private Object outputType_;
        private boolean serverStreaming_;

        private C4118() {
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$MethodDescriptorProto.name_ = this.name_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$MethodDescriptorProto.inputType_ = this.inputType_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$MethodDescriptorProto.outputType_ = this.outputType_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C4174 c4174 = this.optionsBuilder_;
                descriptorProtos$MethodDescriptorProto.options_ = c4174 == null ? this.options_ : (DescriptorProtos$MethodOptions) c4174.m7943();
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                descriptorProtos$MethodDescriptorProto.clientStreaming_ = this.clientStreaming_;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                descriptorProtos$MethodDescriptorProto.serverStreaming_ = this.serverStreaming_;
                i |= 32;
            }
            DescriptorProtos$MethodDescriptorProto.access$15576(descriptorProtos$MethodDescriptorProto, i);
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11763;
        }

        private C4174 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C4174(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetOptionsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$MethodDescriptorProto build() {
            DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$MethodDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$MethodDescriptorProtoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$MethodDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$MethodDescriptorProto buildPartial() {
            DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = new DescriptorProtos$MethodDescriptorProto(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$MethodDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$MethodDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4118 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            this.clientStreaming_ = false;
            this.serverStreaming_ = false;
            return this;
        }

        public C4118 clearClientStreaming() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
            onChanged();
            return this;
        }

        public C4118 clearInputType() {
            this.inputType_ = DescriptorProtos$MethodDescriptorProto.getDefaultInstance().getInputType();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4118 clearName() {
            this.name_ = DescriptorProtos$MethodDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4118 clearOptions() {
            this.bitField0_ &= -9;
            this.options_ = null;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4118 clearOutputType() {
            this.outputType_ = DescriptorProtos$MethodDescriptorProto.getDefaultInstance().getOutputType();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C4118 clearServerStreaming() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11763;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public String getInputType() {
            Object obj = this.inputType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.inputType_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public ByteString getInputTypeBytes() {
            Object obj = this.inputType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.inputType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public DescriptorProtos$MethodOptions getOptions() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (DescriptorProtos$MethodOptions) c4174.m7939();
            }
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
            return descriptorProtos$MethodOptions == null ? DescriptorProtos$MethodOptions.getDefaultInstance() : descriptorProtos$MethodOptions;
        }

        public DescriptorProtos$MethodOptions.C4119 getOptionsBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (DescriptorProtos$MethodOptions.C4119) internalGetOptionsFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4331
        public InterfaceC4332 getOptionsOrBuilder() {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                return (InterfaceC4332) c4174.m7938();
            }
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
            return descriptorProtos$MethodOptions == null ? DescriptorProtos$MethodOptions.getDefaultInstance() : descriptorProtos$MethodOptions;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public String getOutputType() {
            Object obj = this.outputType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.outputType_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public ByteString getOutputTypeBytes() {
            Object obj = this.outputType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.outputType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4331
        public boolean hasServerStreaming() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11762;
            c4451.m8386(DescriptorProtos$MethodDescriptorProto.class, C4118.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return !hasOptions() || getOptions().isInitialized();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4118 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.name_ = abstractC4306.mo8278();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 18) {
                                this.inputType_ = abstractC4306.mo8278();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 == 26) {
                                this.outputType_ = abstractC4306.mo8278();
                                this.bitField0_ |= 4;
                            } else if (iMo8264 == 34) {
                                abstractC4306.mo8275(internalGetOptionsFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 8;
                            } else if (iMo8264 == 40) {
                                this.clientStreaming_ = abstractC4306.mo8279();
                                this.bitField0_ |= 16;
                            } else if (iMo8264 == 48) {
                                this.serverStreaming_ = abstractC4306.mo8279();
                                this.bitField0_ |= 32;
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

        public C4118 mergeOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptions2;
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 != null) {
                c4174.m7945(descriptorProtos$MethodOptions);
            } else if ((this.bitField0_ & 8) == 0 || (descriptorProtos$MethodOptions2 = this.options_) == null || descriptorProtos$MethodOptions2 == DescriptorProtos$MethodOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$MethodOptions;
            } else {
                getOptionsBuilder().mergeFrom(descriptorProtos$MethodOptions);
            }
            if (this.options_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public C4118 setClientStreaming(boolean z) {
            this.clientStreaming_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4118 setInputType(String str) {
            str.getClass();
            this.inputType_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4118 setInputTypeBytes(ByteString byteString) {
            byteString.getClass();
            this.inputType_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4118 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4118 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4118 setOptions(DescriptorProtos$MethodOptions.C4119 c4119) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                this.options_ = c4119.build();
            } else {
                c4174.m7946(c4119.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4118 setOutputType(String str) {
            str.getClass();
            this.outputType_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4118 setOutputTypeBytes(ByteString byteString) {
            byteString.getClass();
            this.outputType_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4118 setServerStreaming(boolean z) {
            this.serverStreaming_ = z;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$MethodDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$MethodDescriptorProto.getDefaultInstance();
        }

        private C4118(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
            maybeForceBuilderInitialization();
        }

        public C4118 setOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            C4174 c4174 = this.optionsBuilder_;
            if (c4174 == null) {
                descriptorProtos$MethodOptions.getClass();
                this.options_ = descriptorProtos$MethodOptions;
            } else {
                c4174.m7946(descriptorProtos$MethodOptions);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4118 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$MethodDescriptorProto) {
                return mergeFrom((DescriptorProtos$MethodDescriptorProto) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4118 mergeFrom(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            if (descriptorProtos$MethodDescriptorProto == DescriptorProtos$MethodDescriptorProto.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$MethodDescriptorProto.hasName()) {
                this.name_ = descriptorProtos$MethodDescriptorProto.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (descriptorProtos$MethodDescriptorProto.hasInputType()) {
                this.inputType_ = descriptorProtos$MethodDescriptorProto.inputType_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (descriptorProtos$MethodDescriptorProto.hasOutputType()) {
                this.outputType_ = descriptorProtos$MethodDescriptorProto.outputType_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (descriptorProtos$MethodDescriptorProto.hasOptions()) {
                mergeOptions(descriptorProtos$MethodDescriptorProto.getOptions());
            }
            if (descriptorProtos$MethodDescriptorProto.hasClientStreaming()) {
                setClientStreaming(descriptorProtos$MethodDescriptorProto.getClientStreaming());
            }
            if (descriptorProtos$MethodDescriptorProto.hasServerStreaming()) {
                setServerStreaming(descriptorProtos$MethodDescriptorProto.getServerStreaming());
            }
            mergeUnknownFields(descriptorProtos$MethodDescriptorProto.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$MethodDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4118 newBuilderForType() {
        return newBuilder();
    }

    public static C4118 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    private DescriptorProtos$MethodDescriptorProto(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.inputType_ = "";
        this.outputType_ = "";
        this.clientStreaming_ = false;
        this.serverStreaming_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
