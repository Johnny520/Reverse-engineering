package com.google.protobuf.compiler;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3346;
import com.google.protobuf.AbstractC3462;
import com.google.protobuf.AbstractC3474;
import com.google.protobuf.AbstractC3528;
import com.google.protobuf.AbstractC3530;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3342;
import com.google.protobuf.C3363;
import com.google.protobuf.C3384;
import com.google.protobuf.C3619;
import com.google.protobuf.C3663;
import com.google.protobuf.C3697;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC3375;
import com.google.protobuf.InterfaceC3377;
import com.google.protobuf.InterfaceC3453;
import com.google.protobuf.InterfaceC3493;
import com.google.protobuf.InterfaceC3532;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;
import com.google.protobuf.compiler.PluginProtos$Version;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p262.AbstractC8249;
import p262.InterfaceC8250;
import p262.InterfaceC8252;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos$CodeGeneratorRequest extends GeneratedMessage implements InterfaceC8252 {
    public static final int COMPILER_VERSION_FIELD_NUMBER = 3;
    private static final PluginProtos$CodeGeneratorRequest DEFAULT_INSTANCE;
    public static final int FILE_TO_GENERATE_FIELD_NUMBER = 1;
    public static final int PARAMETER_FIELD_NUMBER = 2;
    private static final InterfaceC3375 PARSER;
    public static final int PROTO_FILE_FIELD_NUMBER = 15;
    public static final int SOURCE_FILE_DESCRIPTORS_FIELD_NUMBER = 17;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private PluginProtos$Version compilerVersion_;
    private C3384 fileToGenerate_;
    private byte memoizedIsInitialized;
    private volatile Object parameter_;
    private List<DescriptorProtos$FileDescriptorProto> protoFile_;
    private List<DescriptorProtos$FileDescriptorProto> sourceFileDescriptors_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "CodeGeneratorRequest");
        DEFAULT_INSTANCE = new PluginProtos$CodeGeneratorRequest();
        PARSER = new C3334();
    }

    private PluginProtos$CodeGeneratorRequest() {
        C3384 c3384 = C3384.f11037;
        this.fileToGenerate_ = c3384;
        this.parameter_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.fileToGenerate_ = c3384;
        this.parameter_ = "";
        List<DescriptorProtos$FileDescriptorProto> list = Collections.EMPTY_LIST;
        this.protoFile_ = list;
        this.sourceFileDescriptors_ = list;
    }

    public static /* synthetic */ int access$2176(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest, int i) {
        int i2 = i | pluginProtos$CodeGeneratorRequest.bitField0_;
        pluginProtos$CodeGeneratorRequest.bitField0_ = i2;
        return i2;
    }

    public static PluginProtos$CodeGeneratorRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC8249.f22838;
    }

    public static C3325 newBuilder(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pluginProtos$CodeGeneratorRequest);
    }

    public static PluginProtos$CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PluginProtos$CodeGeneratorRequest)) {
            return super.equals(obj);
        }
        PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest = (PluginProtos$CodeGeneratorRequest) obj;
        if (!getFileToGenerateList().equals(pluginProtos$CodeGeneratorRequest.getFileToGenerateList()) || hasParameter() != pluginProtos$CodeGeneratorRequest.hasParameter()) {
            return false;
        }
        if ((!hasParameter() || getParameter().equals(pluginProtos$CodeGeneratorRequest.getParameter())) && getProtoFileList().equals(pluginProtos$CodeGeneratorRequest.getProtoFileList()) && getSourceFileDescriptorsList().equals(pluginProtos$CodeGeneratorRequest.getSourceFileDescriptorsList()) && hasCompilerVersion() == pluginProtos$CodeGeneratorRequest.hasCompilerVersion()) {
            return (!hasCompilerVersion() || getCompilerVersion().equals(pluginProtos$CodeGeneratorRequest.getCompilerVersion())) && getUnknownFields().equals(pluginProtos$CodeGeneratorRequest.getUnknownFields());
        }
        return false;
    }

    @Override // p262.InterfaceC8252
    public PluginProtos$Version getCompilerVersion() {
        PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
        return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
    }

    @Override // p262.InterfaceC8252
    public InterfaceC8250 getCompilerVersionOrBuilder() {
        PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
        return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC8249.f22838;
    }

    @Override // p262.InterfaceC8252
    public String getFileToGenerate(int i) {
        return this.fileToGenerate_.get(i);
    }

    @Override // p262.InterfaceC8252
    public ByteString getFileToGenerateBytes(int i) {
        return this.fileToGenerate_.m7497(i);
    }

    @Override // p262.InterfaceC8252
    public int getFileToGenerateCount() {
        return this.fileToGenerate_.f11038.size();
    }

    @Override // p262.InterfaceC8252
    public String getParameter() {
        Object obj = this.parameter_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.parameter_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // p262.InterfaceC8252
    public ByteString getParameterBytes() {
        Object obj = this.parameter_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.parameter_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // p262.InterfaceC8252
    public DescriptorProtos$FileDescriptorProto getProtoFile(int i) {
        return this.protoFile_.get(i);
    }

    @Override // p262.InterfaceC8252
    public int getProtoFileCount() {
        return this.protoFile_.size();
    }

    @Override // p262.InterfaceC8252
    public List<DescriptorProtos$FileDescriptorProto> getProtoFileList() {
        return this.protoFile_;
    }

    @Override // p262.InterfaceC8252
    public InterfaceC3493 getProtoFileOrBuilder(int i) {
        return this.protoFile_.get(i);
    }

    @Override // p262.InterfaceC8252
    public List<? extends InterfaceC3493> getProtoFileOrBuilderList() {
        return this.protoFile_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.fileToGenerate_.f11038.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.fileToGenerate_.f11038.get(i2));
        }
        int size = getFileToGenerateList().size() + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 1) != 0) {
            size += GeneratedMessage.computeStringSize(2, this.parameter_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += AbstractC3462.m7639(3, getCompilerVersion());
        }
        int size2 = this.protoFile_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            size += AbstractC3462.m7643(this.protoFile_.get(i3));
        }
        int iM7643 = size + size2;
        int size3 = this.sourceFileDescriptors_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM7643 += AbstractC3462.m7643(this.sourceFileDescriptors_.get(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + (size3 * 2) + iM7643;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p262.InterfaceC8252
    public DescriptorProtos$FileDescriptorProto getSourceFileDescriptors(int i) {
        return this.sourceFileDescriptors_.get(i);
    }

    @Override // p262.InterfaceC8252
    public int getSourceFileDescriptorsCount() {
        return this.sourceFileDescriptors_.size();
    }

    @Override // p262.InterfaceC8252
    public List<DescriptorProtos$FileDescriptorProto> getSourceFileDescriptorsList() {
        return this.sourceFileDescriptors_;
    }

    @Override // p262.InterfaceC8252
    public InterfaceC3493 getSourceFileDescriptorsOrBuilder(int i) {
        return this.sourceFileDescriptors_.get(i);
    }

    @Override // p262.InterfaceC8252
    public List<? extends InterfaceC3493> getSourceFileDescriptorsOrBuilderList() {
        return this.sourceFileDescriptors_;
    }

    @Override // p262.InterfaceC8252
    public boolean hasCompilerVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p262.InterfaceC8252
    public boolean hasParameter() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getFileToGenerateCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getFileToGenerateList().hashCode();
        }
        if (hasParameter()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getParameter().hashCode();
        }
        if (getProtoFileCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 15, 53) + getProtoFileList().hashCode();
        }
        if (getSourceFileDescriptorsCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 17, 53) + getSourceFileDescriptorsList().hashCode();
        }
        if (hasCompilerVersion()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getCompilerVersion().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC8249.f22837;
        c3619.m7827(PluginProtos$CodeGeneratorRequest.class, C3325.class);
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
        for (int i = 0; i < getProtoFileCount(); i++) {
            if (!getProtoFile(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getSourceFileDescriptorsCount(); i2++) {
            if (!getSourceFileDescriptors(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3325 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3325(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3325 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3325() : new C3325().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        for (int i = 0; i < this.fileToGenerate_.f11038.size(); i++) {
            GeneratedMessage.writeString(abstractC3462, 1, this.fileToGenerate_.f11038.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 2, this.parameter_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7649(3, getCompilerVersion());
        }
        for (int i2 = 0; i2 < this.protoFile_.size(); i2++) {
            abstractC3462.mo7649(15, this.protoFile_.get(i2));
        }
        for (int i3 = 0; i3 < this.sourceFileDescriptors_.size(); i3++) {
            abstractC3462.mo7649(17, this.sourceFileDescriptors_.get(i3));
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorRequest$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3325 extends GeneratedMessage.AbstractC3305 implements InterfaceC8252 {
        private int bitField0_;
        private C3342 compilerVersionBuilder_;
        private PluginProtos$Version compilerVersion_;
        private C3384 fileToGenerate_;
        private Object parameter_;
        private C3363 protoFileBuilder_;
        private List<DescriptorProtos$FileDescriptorProto> protoFile_;
        private C3363 sourceFileDescriptorsBuilder_;
        private List<DescriptorProtos$FileDescriptorProto> sourceFileDescriptors_;

        private C3325() {
            this.fileToGenerate_ = C3384.f11037;
            this.parameter_ = "";
            List<DescriptorProtos$FileDescriptorProto> list = Collections.EMPTY_LIST;
            this.protoFile_ = list;
            this.sourceFileDescriptors_ = list;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                this.fileToGenerate_.m7787();
                pluginProtos$CodeGeneratorRequest.fileToGenerate_ = this.fileToGenerate_;
            }
            if ((i2 & 2) != 0) {
                pluginProtos$CodeGeneratorRequest.parameter_ = this.parameter_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                C3342 c3342 = this.compilerVersionBuilder_;
                pluginProtos$CodeGeneratorRequest.compilerVersion_ = c3342 == null ? this.compilerVersion_ : (PluginProtos$Version) c3342.m7384();
                i |= 2;
            }
            PluginProtos$CodeGeneratorRequest.access$2176(pluginProtos$CodeGeneratorRequest, i);
        }

        private void buildPartialRepeatedFields(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                    this.bitField0_ &= -5;
                }
                pluginProtos$CodeGeneratorRequest.protoFile_ = this.protoFile_;
            } else {
                pluginProtos$CodeGeneratorRequest.protoFile_ = c3363.m7472();
            }
            C3363 c33632 = this.sourceFileDescriptorsBuilder_;
            if (c33632 != null) {
                pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_ = c33632.m7472();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.sourceFileDescriptors_ = Collections.unmodifiableList(this.sourceFileDescriptors_);
                this.bitField0_ &= -9;
            }
            pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_ = this.sourceFileDescriptors_;
        }

        private void ensureFileToGenerateIsMutable() {
            if (!this.fileToGenerate_.f11199) {
                this.fileToGenerate_ = new C3384(this.fileToGenerate_);
            }
            this.bitField0_ |= 1;
        }

        private void ensureProtoFileIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.protoFile_ = new ArrayList(this.protoFile_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureSourceFileDescriptorsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.sourceFileDescriptors_ = new ArrayList(this.sourceFileDescriptors_);
                this.bitField0_ |= 8;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC8249.f22838;
        }

        private C3342 internalGetCompilerVersionFieldBuilder() {
            if (this.compilerVersionBuilder_ == null) {
                this.compilerVersionBuilder_ = new C3342(getCompilerVersion(), getParentForChildren(), isClean());
                this.compilerVersion_ = null;
            }
            return this.compilerVersionBuilder_;
        }

        private C3363 internalGetProtoFileFieldBuilder() {
            if (this.protoFileBuilder_ == null) {
                this.protoFileBuilder_ = new C3363(this.protoFile_, getParentForChildren(), isClean());
                this.protoFile_ = null;
            }
            return this.protoFileBuilder_;
        }

        private C3363 internalGetSourceFileDescriptorsFieldBuilder() {
            if (this.sourceFileDescriptorsBuilder_ == null) {
                this.sourceFileDescriptorsBuilder_ = new C3363(this.sourceFileDescriptors_, getParentForChildren(), isClean());
                this.sourceFileDescriptors_ = null;
            }
            return this.sourceFileDescriptorsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetProtoFileFieldBuilder();
                internalGetSourceFileDescriptorsFieldBuilder();
                internalGetCompilerVersionFieldBuilder();
            }
        }

        public C3325 addAllFileToGenerate(Iterable<String> iterable) {
            ensureFileToGenerateIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.fileToGenerate_);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3325 addAllProtoFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureProtoFileIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.protoFile_);
            onChanged();
            return this;
        }

        public C3325 addAllSourceFileDescriptors(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.sourceFileDescriptors_);
            onChanged();
            return this;
        }

        public C3325 addFileToGenerate(String str) {
            str.getClass();
            ensureFileToGenerateIsMutable();
            this.fileToGenerate_.m7493(str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3325 addFileToGenerateBytes(ByteString byteString) {
            byteString.getClass();
            ensureFileToGenerateIsMutable();
            this.fileToGenerate_.mo7495(byteString);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3325 addProtoFile(DescriptorProtos$FileDescriptorProto.C3280 c3280) {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3280.build());
                return this;
            }
            ensureProtoFileIsMutable();
            this.protoFile_.add(c3280.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FileDescriptorProto.C3280 addProtoFileBuilder() {
            return (DescriptorProtos$FileDescriptorProto.C3280) internalGetProtoFileFieldBuilder().m7460(DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        public C3325 addSourceFileDescriptors(DescriptorProtos$FileDescriptorProto.C3280 c3280) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3280.build());
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            this.sourceFileDescriptors_.add(c3280.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FileDescriptorProto.C3280 addSourceFileDescriptorsBuilder() {
            return (DescriptorProtos$FileDescriptorProto.C3280) internalGetSourceFileDescriptorsFieldBuilder().m7460(DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public PluginProtos$CodeGeneratorRequest build() {
            PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequestBuildPartial = buildPartial();
            if (pluginProtos$CodeGeneratorRequestBuildPartial.isInitialized()) {
                return pluginProtos$CodeGeneratorRequestBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) pluginProtos$CodeGeneratorRequestBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public PluginProtos$CodeGeneratorRequest buildPartial() {
            PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest = new PluginProtos$CodeGeneratorRequest(this);
            buildPartialRepeatedFields(pluginProtos$CodeGeneratorRequest);
            if (this.bitField0_ != 0) {
                buildPartial0(pluginProtos$CodeGeneratorRequest);
            }
            onBuilt();
            return pluginProtos$CodeGeneratorRequest;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3325 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.fileToGenerate_ = C3384.f11037;
            this.parameter_ = "";
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 == null) {
                this.protoFile_ = Collections.EMPTY_LIST;
            } else {
                this.protoFile_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -5;
            C3363 c33632 = this.sourceFileDescriptorsBuilder_;
            if (c33632 == null) {
                this.sourceFileDescriptors_ = Collections.EMPTY_LIST;
            } else {
                this.sourceFileDescriptors_ = null;
                c33632.m7471();
            }
            this.bitField0_ &= -9;
            this.compilerVersion_ = null;
            C3342 c3342 = this.compilerVersionBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.compilerVersionBuilder_ = null;
            }
            return this;
        }

        public C3325 clearCompilerVersion() {
            this.bitField0_ &= -17;
            this.compilerVersion_ = null;
            C3342 c3342 = this.compilerVersionBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.compilerVersionBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3325 clearFileToGenerate() {
            this.fileToGenerate_ = C3384.f11037;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3325 clearParameter() {
            this.parameter_ = PluginProtos$CodeGeneratorRequest.getDefaultInstance().getParameter();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3325 clearProtoFile() {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.protoFile_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3325 clearSourceFileDescriptors() {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.sourceFileDescriptors_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // p262.InterfaceC8252
        public PluginProtos$Version getCompilerVersion() {
            C3342 c3342 = this.compilerVersionBuilder_;
            if (c3342 != null) {
                return (PluginProtos$Version) c3342.m7380();
            }
            PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
            return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
        }

        public PluginProtos$Version.C3328 getCompilerVersionBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (PluginProtos$Version.C3328) internalGetCompilerVersionFieldBuilder().m7381();
        }

        @Override // p262.InterfaceC8252
        public InterfaceC8250 getCompilerVersionOrBuilder() {
            C3342 c3342 = this.compilerVersionBuilder_;
            if (c3342 != null) {
                return (InterfaceC8250) c3342.m7379();
            }
            PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
            return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC8249.f22838;
        }

        @Override // p262.InterfaceC8252
        public String getFileToGenerate(int i) {
            return this.fileToGenerate_.get(i);
        }

        @Override // p262.InterfaceC8252
        public ByteString getFileToGenerateBytes(int i) {
            return this.fileToGenerate_.m7497(i);
        }

        @Override // p262.InterfaceC8252
        public int getFileToGenerateCount() {
            return this.fileToGenerate_.f11038.size();
        }

        @Override // p262.InterfaceC8252
        public InterfaceC3377 getFileToGenerateList() {
            this.fileToGenerate_.m7787();
            return this.fileToGenerate_;
        }

        @Override // p262.InterfaceC8252
        public String getParameter() {
            Object obj = this.parameter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.parameter_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // p262.InterfaceC8252
        public ByteString getParameterBytes() {
            Object obj = this.parameter_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parameter_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // p262.InterfaceC8252
        public DescriptorProtos$FileDescriptorProto getProtoFile(int i) {
            C3363 c3363 = this.protoFileBuilder_;
            return c3363 == null ? this.protoFile_.get(i) : (DescriptorProtos$FileDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$FileDescriptorProto.C3280 getProtoFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3280) internalGetProtoFileFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$FileDescriptorProto.C3280> getProtoFileBuilderList() {
            return internalGetProtoFileFieldBuilder().m7474();
        }

        @Override // p262.InterfaceC8252
        public int getProtoFileCount() {
            C3363 c3363 = this.protoFileBuilder_;
            return c3363 == null ? this.protoFile_.size() : c3363.f11012.size();
        }

        @Override // p262.InterfaceC8252
        public List<DescriptorProtos$FileDescriptorProto> getProtoFileList() {
            C3363 c3363 = this.protoFileBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.protoFile_) : c3363.m7465();
        }

        @Override // p262.InterfaceC8252
        public InterfaceC3493 getProtoFileOrBuilder(int i) {
            C3363 c3363 = this.protoFileBuilder_;
            return c3363 == null ? this.protoFile_.get(i) : (InterfaceC3493) c3363.m7469(i);
        }

        @Override // p262.InterfaceC8252
        public List<? extends InterfaceC3493> getProtoFileOrBuilderList() {
            C3363 c3363 = this.protoFileBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.protoFile_);
        }

        @Override // p262.InterfaceC8252
        public DescriptorProtos$FileDescriptorProto getSourceFileDescriptors(int i) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            return c3363 == null ? this.sourceFileDescriptors_.get(i) : (DescriptorProtos$FileDescriptorProto) c3363.m7466(i, false);
        }

        public DescriptorProtos$FileDescriptorProto.C3280 getSourceFileDescriptorsBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3280) internalGetSourceFileDescriptorsFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$FileDescriptorProto.C3280> getSourceFileDescriptorsBuilderList() {
            return internalGetSourceFileDescriptorsFieldBuilder().m7474();
        }

        @Override // p262.InterfaceC8252
        public int getSourceFileDescriptorsCount() {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            return c3363 == null ? this.sourceFileDescriptors_.size() : c3363.f11012.size();
        }

        @Override // p262.InterfaceC8252
        public List<DescriptorProtos$FileDescriptorProto> getSourceFileDescriptorsList() {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.sourceFileDescriptors_) : c3363.m7465();
        }

        @Override // p262.InterfaceC8252
        public InterfaceC3493 getSourceFileDescriptorsOrBuilder(int i) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            return c3363 == null ? this.sourceFileDescriptors_.get(i) : (InterfaceC3493) c3363.m7469(i);
        }

        @Override // p262.InterfaceC8252
        public List<? extends InterfaceC3493> getSourceFileDescriptorsOrBuilderList() {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.sourceFileDescriptors_);
        }

        @Override // p262.InterfaceC8252
        public boolean hasCompilerVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p262.InterfaceC8252
        public boolean hasParameter() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC8249.f22837;
            c3619.m7827(PluginProtos$CodeGeneratorRequest.class, C3325.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            for (int i = 0; i < getProtoFileCount(); i++) {
                if (!getProtoFile(i).isInitialized()) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < getSourceFileDescriptorsCount(); i2++) {
                if (!getSourceFileDescriptors(i2).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        public C3325 mergeCompilerVersion(PluginProtos$Version pluginProtos$Version) {
            PluginProtos$Version pluginProtos$Version2;
            C3342 c3342 = this.compilerVersionBuilder_;
            if (c3342 != null) {
                c3342.m7386(pluginProtos$Version);
            } else if ((this.bitField0_ & 16) == 0 || (pluginProtos$Version2 = this.compilerVersion_) == null || pluginProtos$Version2 == PluginProtos$Version.getDefaultInstance()) {
                this.compilerVersion_ = pluginProtos$Version;
            } else {
                getCompilerVersionBuilder().mergeFrom(pluginProtos$Version);
            }
            if (this.compilerVersion_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public C3325 mergeFrom(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
            if (pluginProtos$CodeGeneratorRequest == PluginProtos$CodeGeneratorRequest.getDefaultInstance()) {
                return this;
            }
            if (!pluginProtos$CodeGeneratorRequest.fileToGenerate_.isEmpty()) {
                if (this.fileToGenerate_.isEmpty()) {
                    this.fileToGenerate_ = pluginProtos$CodeGeneratorRequest.fileToGenerate_;
                    this.bitField0_ |= 1;
                } else {
                    ensureFileToGenerateIsMutable();
                    this.fileToGenerate_.addAll(pluginProtos$CodeGeneratorRequest.fileToGenerate_);
                }
                onChanged();
            }
            if (pluginProtos$CodeGeneratorRequest.hasParameter()) {
                this.parameter_ = pluginProtos$CodeGeneratorRequest.parameter_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (this.protoFileBuilder_ == null) {
                if (!pluginProtos$CodeGeneratorRequest.protoFile_.isEmpty()) {
                    if (this.protoFile_.isEmpty()) {
                        this.protoFile_ = pluginProtos$CodeGeneratorRequest.protoFile_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureProtoFileIsMutable();
                        this.protoFile_.addAll(pluginProtos$CodeGeneratorRequest.protoFile_);
                    }
                    onChanged();
                }
            } else if (!pluginProtos$CodeGeneratorRequest.protoFile_.isEmpty()) {
                boolean zIsEmpty = this.protoFileBuilder_.f11012.isEmpty();
                C3363 c3363 = this.protoFileBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.protoFileBuilder_ = null;
                    this.protoFile_ = pluginProtos$CodeGeneratorRequest.protoFile_;
                    this.bitField0_ &= -5;
                    this.protoFileBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetProtoFileFieldBuilder() : null;
                } else {
                    c3363.m7462(pluginProtos$CodeGeneratorRequest.protoFile_);
                }
            }
            if (this.sourceFileDescriptorsBuilder_ == null) {
                if (!pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_.isEmpty()) {
                    if (this.sourceFileDescriptors_.isEmpty()) {
                        this.sourceFileDescriptors_ = pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureSourceFileDescriptorsIsMutable();
                        this.sourceFileDescriptors_.addAll(pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_);
                    }
                    onChanged();
                }
            } else if (!pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_.isEmpty()) {
                boolean zIsEmpty2 = this.sourceFileDescriptorsBuilder_.f11012.isEmpty();
                C3363 c33632 = this.sourceFileDescriptorsBuilder_;
                if (zIsEmpty2) {
                    c33632.f11013 = null;
                    this.sourceFileDescriptorsBuilder_ = null;
                    this.sourceFileDescriptors_ = pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_;
                    this.bitField0_ &= -9;
                    this.sourceFileDescriptorsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetSourceFileDescriptorsFieldBuilder() : null;
                } else {
                    c33632.m7462(pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_);
                }
            }
            if (pluginProtos$CodeGeneratorRequest.hasCompilerVersion()) {
                mergeCompilerVersion(pluginProtos$CodeGeneratorRequest.getCompilerVersion());
            }
            mergeUnknownFields(pluginProtos$CodeGeneratorRequest.getUnknownFields());
            onChanged();
            return this;
        }

        public C3325 removeProtoFile(int i) {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureProtoFileIsMutable();
            this.protoFile_.remove(i);
            onChanged();
            return this;
        }

        public C3325 removeSourceFileDescriptors(int i) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            this.sourceFileDescriptors_.remove(i);
            onChanged();
            return this;
        }

        public C3325 setCompilerVersion(PluginProtos$Version.C3328 c3328) {
            C3342 c3342 = this.compilerVersionBuilder_;
            if (c3342 == null) {
                this.compilerVersion_ = c3328.build();
            } else {
                c3342.m7387(c3328.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3325 setFileToGenerate(int i, String str) {
            str.getClass();
            ensureFileToGenerateIsMutable();
            this.fileToGenerate_.set(i, str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3325 setParameter(String str) {
            str.getClass();
            this.parameter_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3325 setParameterBytes(ByteString byteString) {
            byteString.getClass();
            this.parameter_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3325 setProtoFile(int i, DescriptorProtos$FileDescriptorProto.C3280 c3280) {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3280.build());
                return this;
            }
            ensureProtoFileIsMutable();
            this.protoFile_.set(i, c3280.build());
            onChanged();
            return this;
        }

        public C3325 setSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto.C3280 c3280) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3280.build());
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            this.sourceFileDescriptors_.set(i, c3280.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public PluginProtos$CodeGeneratorRequest getDefaultInstanceForType() {
            return PluginProtos$CodeGeneratorRequest.getDefaultInstance();
        }

        public DescriptorProtos$FileDescriptorProto.C3280 addProtoFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3280) internalGetProtoFileFieldBuilder().m7461(i, DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$FileDescriptorProto.C3280 addSourceFileDescriptorsBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3280) internalGetSourceFileDescriptorsFieldBuilder().m7461(i, DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        private C3325(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.fileToGenerate_ = C3384.f11037;
            this.parameter_ = "";
            List<DescriptorProtos$FileDescriptorProto> list = Collections.EMPTY_LIST;
            this.protoFile_ = list;
            this.sourceFileDescriptors_ = list;
            maybeForceBuilderInitialization();
        }

        public C3325 addProtoFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureProtoFileIsMutable();
                this.protoFile_.add(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3325 addSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            if (c3363 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.add(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3325 setCompilerVersion(PluginProtos$Version pluginProtos$Version) {
            C3342 c3342 = this.compilerVersionBuilder_;
            if (c3342 == null) {
                pluginProtos$Version.getClass();
                this.compilerVersion_ = pluginProtos$Version;
            } else {
                c3342.m7387(pluginProtos$Version);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3325 setProtoFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureProtoFileIsMutable();
                this.protoFile_.set(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3325 setSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            if (c3363 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.set(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3325 addProtoFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureProtoFileIsMutable();
                this.protoFile_.add(descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3325 addSourceFileDescriptors(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            if (c3363 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.add(descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3325 addProtoFile(int i, DescriptorProtos$FileDescriptorProto.C3280 c3280) {
            C3363 c3363 = this.protoFileBuilder_;
            if (c3363 == null) {
                ensureProtoFileIsMutable();
                this.protoFile_.add(i, c3280.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3280.build());
            return this;
        }

        public C3325 addSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto.C3280 c3280) {
            C3363 c3363 = this.sourceFileDescriptorsBuilder_;
            if (c3363 == null) {
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.add(i, c3280.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3280.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3325 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof PluginProtos$CodeGeneratorRequest) {
                return mergeFrom((PluginProtos$CodeGeneratorRequest) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3325 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                ByteString byteStringMo7719 = abstractC3474.mo7719();
                                ensureFileToGenerateIsMutable();
                                this.fileToGenerate_.mo7495(byteStringMo7719);
                            } else if (iMo7705 == 18) {
                                this.parameter_ = abstractC3474.mo7719();
                                this.bitField0_ |= 2;
                            } else if (iMo7705 == 26) {
                                abstractC3474.mo7716(internalGetCompilerVersionFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 16;
                            } else if (iMo7705 == 122) {
                                DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto) abstractC3474.mo7715(DescriptorProtos$FileDescriptorProto.parser(), c3697);
                                C3363 c3363 = this.protoFileBuilder_;
                                if (c3363 == null) {
                                    ensureProtoFileIsMutable();
                                    this.protoFile_.add(descriptorProtos$FileDescriptorProto);
                                } else {
                                    c3363.m7458(descriptorProtos$FileDescriptorProto);
                                }
                            } else if (iMo7705 != 138) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto2 = (DescriptorProtos$FileDescriptorProto) abstractC3474.mo7715(DescriptorProtos$FileDescriptorProto.parser(), c3697);
                                C3363 c33632 = this.sourceFileDescriptorsBuilder_;
                                if (c33632 == null) {
                                    ensureSourceFileDescriptorsIsMutable();
                                    this.sourceFileDescriptors_.add(descriptorProtos$FileDescriptorProto2);
                                } else {
                                    c33632.m7458(descriptorProtos$FileDescriptorProto2);
                                }
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
    }

    @Override // p262.InterfaceC8252
    public InterfaceC3377 getFileToGenerateList() {
        return this.fileToGenerate_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public PluginProtos$CodeGeneratorRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static PluginProtos$CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3325 newBuilderForType() {
        return newBuilder();
    }

    public static C3325 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteString byteString) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteString byteString, C3697 c3697) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(byte[] bArr) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    private PluginProtos$CodeGeneratorRequest(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.fileToGenerate_ = C3384.f11037;
        this.parameter_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(byte[] bArr, C3697 c3697) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(InputStream inputStream, C3697 c3697) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(AbstractC3474 abstractC3474) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
