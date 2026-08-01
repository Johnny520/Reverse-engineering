package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$MethodDescriptorProto extends GeneratedMessage implements InterfaceC3498 {
    public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
    private static final DescriptorProtos$MethodDescriptorProto DEFAULT_INSTANCE;
    public static final int INPUT_TYPE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
    private static final InterfaceC3374 PARSER;
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
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "MethodDescriptorProto");
        DEFAULT_INSTANCE = new DescriptorProtos$MethodDescriptorProto();
        PARSER = new C3502();
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11413;
    }

    public static C3285 newBuilder(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$MethodDescriptorProto);
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.InterfaceC3498
    public boolean getClientStreaming() {
        return this.clientStreaming_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11413;
    }

    @Override // com.google.protobuf.InterfaceC3498
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

    @Override // com.google.protobuf.InterfaceC3498
    public ByteString getInputTypeBytes() {
        Object obj = this.inputType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.inputType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3498
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

    @Override // com.google.protobuf.InterfaceC3498
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3498
    public DescriptorProtos$MethodOptions getOptions() {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
        return descriptorProtos$MethodOptions == null ? DescriptorProtos$MethodOptions.getDefaultInstance() : descriptorProtos$MethodOptions;
    }

    @Override // com.google.protobuf.InterfaceC3498
    public InterfaceC3499 getOptionsOrBuilder() {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
        return descriptorProtos$MethodOptions == null ? DescriptorProtos$MethodOptions.getDefaultInstance() : descriptorProtos$MethodOptions;
    }

    @Override // com.google.protobuf.InterfaceC3498
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

    @Override // com.google.protobuf.InterfaceC3498
    public ByteString getOutputTypeBytes() {
        Object obj = this.outputType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.outputType_ = byteStringCopyFromUtf8;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.inputType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(3, this.outputType_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC3461.m7652(4, getOptions());
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeStringSize += AbstractC3461.m7647(5);
        }
        if ((this.bitField0_ & 32) != 0) {
            iComputeStringSize += AbstractC3461.m7647(6);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3498
    public boolean getServerStreaming() {
        return this.serverStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC3498
    public boolean hasClientStreaming() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3498
    public boolean hasInputType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3498
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3498
    public boolean hasOptions() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3498
    public boolean hasOutputType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3498
    public boolean hasServerStreaming() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasInputType()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getInputType().hashCode();
        }
        if (hasOutputType()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getOutputType().hashCode();
        }
        if (hasOptions()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + getOptions().hashCode();
        }
        if (hasClientStreaming()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 5, 53) + AbstractC3401.m7516(getClientStreaming());
        }
        if (hasServerStreaming()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 6, 53) + AbstractC3401.m7516(getServerStreaming());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11412;
        c3618.m7840(DescriptorProtos$MethodDescriptorProto.class, C3285.class);
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
        if (!hasOptions() || getOptions().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC3532
    public C3285 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3285(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3285 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3285() : new C3285().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessage.writeString(abstractC3461, 2, this.inputType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            GeneratedMessage.writeString(abstractC3461, 3, this.outputType_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3461.mo7662(4, getOptions());
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3461.mo7676(5, this.clientStreaming_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3461.mo7676(6, this.serverStreaming_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3285 extends GeneratedMessage.AbstractC3304 implements InterfaceC3498 {
        private int bitField0_;
        private boolean clientStreaming_;
        private Object inputType_;
        private Object name_;
        private C3341 optionsBuilder_;
        private DescriptorProtos$MethodOptions options_;
        private Object outputType_;
        private boolean serverStreaming_;

        private C3285() {
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
                C3341 c3341 = this.optionsBuilder_;
                descriptorProtos$MethodDescriptorProto.options_ = c3341 == null ? this.options_ : (DescriptorProtos$MethodOptions) c3341.m7397();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11413;
        }

        private C3341 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3341(getOptions(), getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetOptionsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$MethodDescriptorProto build() {
            DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProtoBuildPartial = buildPartial();
            if (descriptorProtos$MethodDescriptorProtoBuildPartial.isInitialized()) {
                return descriptorProtos$MethodDescriptorProtoBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$MethodDescriptorProtoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$MethodDescriptorProto buildPartial() {
            DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = new DescriptorProtos$MethodDescriptorProto(this);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$MethodDescriptorProto);
            }
            onBuilt();
            return descriptorProtos$MethodDescriptorProto;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3285 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            this.clientStreaming_ = false;
            this.serverStreaming_ = false;
            return this;
        }

        public C3285 clearClientStreaming() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
            onChanged();
            return this;
        }

        public C3285 clearInputType() {
            this.inputType_ = DescriptorProtos$MethodDescriptorProto.getDefaultInstance().getInputType();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3285 clearName() {
            this.name_ = DescriptorProtos$MethodDescriptorProto.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3285 clearOptions() {
            this.bitField0_ &= -9;
            this.options_ = null;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.optionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3285 clearOutputType() {
            this.outputType_ = DescriptorProtos$MethodDescriptorProto.getDefaultInstance().getOutputType();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3285 clearServerStreaming() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3498
        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11413;
        }

        @Override // com.google.protobuf.InterfaceC3498
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

        @Override // com.google.protobuf.InterfaceC3498
        public ByteString getInputTypeBytes() {
            Object obj = this.inputType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.inputType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3498
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

        @Override // com.google.protobuf.InterfaceC3498
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3498
        public DescriptorProtos$MethodOptions getOptions() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$MethodOptions) c3341.m7393();
            }
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
            return descriptorProtos$MethodOptions == null ? DescriptorProtos$MethodOptions.getDefaultInstance() : descriptorProtos$MethodOptions;
        }

        public DescriptorProtos$MethodOptions.C3286 getOptionsBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (DescriptorProtos$MethodOptions.C3286) internalGetOptionsFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3498
        public InterfaceC3499 getOptionsOrBuilder() {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                return (InterfaceC3499) c3341.m7392();
            }
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
            return descriptorProtos$MethodOptions == null ? DescriptorProtos$MethodOptions.getDefaultInstance() : descriptorProtos$MethodOptions;
        }

        @Override // com.google.protobuf.InterfaceC3498
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

        @Override // com.google.protobuf.InterfaceC3498
        public ByteString getOutputTypeBytes() {
            Object obj = this.outputType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.outputType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3498
        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        @Override // com.google.protobuf.InterfaceC3498
        public boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3498
        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3498
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3498
        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3498
        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3498
        public boolean hasServerStreaming() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11412;
            c3618.m7840(DescriptorProtos$MethodDescriptorProto.class, C3285.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return !hasOptions() || getOptions().isInitialized();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3285 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.name_ = abstractC3473.mo7732();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 18) {
                                this.inputType_ = abstractC3473.mo7732();
                                this.bitField0_ |= 2;
                            } else if (iMo7718 == 26) {
                                this.outputType_ = abstractC3473.mo7732();
                                this.bitField0_ |= 4;
                            } else if (iMo7718 == 34) {
                                abstractC3473.mo7729(internalGetOptionsFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 8;
                            } else if (iMo7718 == 40) {
                                this.clientStreaming_ = abstractC3473.mo7733();
                                this.bitField0_ |= 16;
                            } else if (iMo7718 == 48) {
                                this.serverStreaming_ = abstractC3473.mo7733();
                                this.bitField0_ |= 32;
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

        public C3285 mergeOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            DescriptorProtos$MethodOptions descriptorProtos$MethodOptions2;
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$MethodOptions);
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

        public C3285 setClientStreaming(boolean z) {
            this.clientStreaming_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3285 setInputType(String str) {
            str.getClass();
            this.inputType_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3285 setInputTypeBytes(ByteString byteString) {
            byteString.getClass();
            this.inputType_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3285 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3285 setNameBytes(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3285 setOptions(DescriptorProtos$MethodOptions.C3286 c3286) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                this.options_ = c3286.build();
            } else {
                c3341.m7400(c3286.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3285 setOutputType(String str) {
            str.getClass();
            this.outputType_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3285 setOutputTypeBytes(ByteString byteString) {
            byteString.getClass();
            this.outputType_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3285 setServerStreaming(boolean z) {
            this.serverStreaming_ = z;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$MethodDescriptorProto getDefaultInstanceForType() {
            return DescriptorProtos$MethodDescriptorProto.getDefaultInstance();
        }

        private C3285(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
            maybeForceBuilderInitialization();
        }

        public C3285 setOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            C3341 c3341 = this.optionsBuilder_;
            if (c3341 == null) {
                descriptorProtos$MethodOptions.getClass();
                this.options_ = descriptorProtos$MethodOptions;
            } else {
                c3341.m7400(descriptorProtos$MethodOptions);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3285 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$MethodDescriptorProto) {
                return mergeFrom((DescriptorProtos$MethodDescriptorProto) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3285 mergeFrom(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$MethodDescriptorProto getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3285 newBuilderForType() {
        return newBuilder();
    }

    public static C3285 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    private DescriptorProtos$MethodDescriptorProto(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.inputType_ = "";
        this.outputType_ = "";
        this.clientStreaming_ = false;
        this.serverStreaming_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$MethodDescriptorProto) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
