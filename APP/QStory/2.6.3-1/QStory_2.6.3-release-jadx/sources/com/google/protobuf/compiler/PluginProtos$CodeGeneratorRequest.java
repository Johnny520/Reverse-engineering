package com.google.protobuf.compiler;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4178;
import com.google.protobuf.AbstractC4294;
import com.google.protobuf.AbstractC4306;
import com.google.protobuf.AbstractC4360;
import com.google.protobuf.AbstractC4362;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.ByteString;
import com.google.protobuf.C4174;
import com.google.protobuf.C4195;
import com.google.protobuf.C4216;
import com.google.protobuf.C4451;
import com.google.protobuf.C4495;
import com.google.protobuf.C4529;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC4207;
import com.google.protobuf.InterfaceC4209;
import com.google.protobuf.InterfaceC4285;
import com.google.protobuf.InterfaceC4325;
import com.google.protobuf.InterfaceC4364;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;
import com.google.protobuf.compiler.PluginProtos$Version;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p278.AbstractC9078;
import p278.InterfaceC9079;
import p278.InterfaceC9081;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos$CodeGeneratorRequest extends GeneratedMessage implements InterfaceC9081 {
    public static final int COMPILER_VERSION_FIELD_NUMBER = 3;
    private static final PluginProtos$CodeGeneratorRequest DEFAULT_INSTANCE;
    public static final int FILE_TO_GENERATE_FIELD_NUMBER = 1;
    public static final int PARAMETER_FIELD_NUMBER = 2;
    private static final InterfaceC4207 PARSER;
    public static final int PROTO_FILE_FIELD_NUMBER = 15;
    public static final int SOURCE_FILE_DESCRIPTORS_FIELD_NUMBER = 17;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private PluginProtos$Version compilerVersion_;
    private C4216 fileToGenerate_;
    private byte memoizedIsInitialized;
    private volatile Object parameter_;
    private List<DescriptorProtos$FileDescriptorProto> protoFile_;
    private List<DescriptorProtos$FileDescriptorProto> sourceFileDescriptors_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "CodeGeneratorRequest");
        DEFAULT_INSTANCE = new PluginProtos$CodeGeneratorRequest();
        PARSER = new C4166();
    }

    private PluginProtos$CodeGeneratorRequest() {
        C4216 c4216 = C4216.f11382;
        this.fileToGenerate_ = c4216;
        this.parameter_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.fileToGenerate_ = c4216;
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

    public static final C4495 getDescriptor() {
        return AbstractC9078.f23183;
    }

    public static C4157 newBuilder(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pluginProtos$CodeGeneratorRequest);
    }

    public static PluginProtos$CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // p278.InterfaceC9081
    public PluginProtos$Version getCompilerVersion() {
        PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
        return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
    }

    @Override // p278.InterfaceC9081
    public InterfaceC9079 getCompilerVersionOrBuilder() {
        PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
        return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC9078.f23183;
    }

    @Override // p278.InterfaceC9081
    public String getFileToGenerate(int i) {
        return this.fileToGenerate_.get(i);
    }

    @Override // p278.InterfaceC9081
    public ByteString getFileToGenerateBytes(int i) {
        return this.fileToGenerate_.m8056(i);
    }

    @Override // p278.InterfaceC9081
    public int getFileToGenerateCount() {
        return this.fileToGenerate_.f11383.size();
    }

    @Override // p278.InterfaceC9081
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

    @Override // p278.InterfaceC9081
    public ByteString getParameterBytes() {
        Object obj = this.parameter_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.parameter_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // p278.InterfaceC9081
    public DescriptorProtos$FileDescriptorProto getProtoFile(int i) {
        return this.protoFile_.get(i);
    }

    @Override // p278.InterfaceC9081
    public int getProtoFileCount() {
        return this.protoFile_.size();
    }

    @Override // p278.InterfaceC9081
    public List<DescriptorProtos$FileDescriptorProto> getProtoFileList() {
        return this.protoFile_;
    }

    @Override // p278.InterfaceC9081
    public InterfaceC4325 getProtoFileOrBuilder(int i) {
        return this.protoFile_.get(i);
    }

    @Override // p278.InterfaceC9081
    public List<? extends InterfaceC4325> getProtoFileOrBuilderList() {
        return this.protoFile_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.fileToGenerate_.f11383.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.fileToGenerate_.f11383.get(i2));
        }
        int size = getFileToGenerateList().size() + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 1) != 0) {
            size += GeneratedMessage.computeStringSize(2, this.parameter_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += AbstractC4294.m8198(3, getCompilerVersion());
        }
        int size2 = this.protoFile_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            size += AbstractC4294.m8202(this.protoFile_.get(i3));
        }
        int iM8202 = size + size2;
        int size3 = this.sourceFileDescriptors_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM8202 += AbstractC4294.m8202(this.sourceFileDescriptors_.get(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + (size3 * 2) + iM8202;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p278.InterfaceC9081
    public DescriptorProtos$FileDescriptorProto getSourceFileDescriptors(int i) {
        return this.sourceFileDescriptors_.get(i);
    }

    @Override // p278.InterfaceC9081
    public int getSourceFileDescriptorsCount() {
        return this.sourceFileDescriptors_.size();
    }

    @Override // p278.InterfaceC9081
    public List<DescriptorProtos$FileDescriptorProto> getSourceFileDescriptorsList() {
        return this.sourceFileDescriptors_;
    }

    @Override // p278.InterfaceC9081
    public InterfaceC4325 getSourceFileDescriptorsOrBuilder(int i) {
        return this.sourceFileDescriptors_.get(i);
    }

    @Override // p278.InterfaceC9081
    public List<? extends InterfaceC4325> getSourceFileDescriptorsOrBuilderList() {
        return this.sourceFileDescriptors_;
    }

    @Override // p278.InterfaceC9081
    public boolean hasCompilerVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p278.InterfaceC9081
    public boolean hasParameter() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getFileToGenerateCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getFileToGenerateList().hashCode();
        }
        if (hasParameter()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getParameter().hashCode();
        }
        if (getProtoFileCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 15, 53) + getProtoFileList().hashCode();
        }
        if (getSourceFileDescriptorsCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 17, 53) + getSourceFileDescriptorsList().hashCode();
        }
        if (hasCompilerVersion()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getCompilerVersion().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC9078.f23182;
        c4451.m8386(PluginProtos$CodeGeneratorRequest.class, C4157.class);
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

    @Override // com.google.protobuf.AbstractC4365
    public C4157 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4157(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4157 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4157() : new C4157().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        for (int i = 0; i < this.fileToGenerate_.f11383.size(); i++) {
            GeneratedMessage.writeString(abstractC4294, 1, this.fileToGenerate_.f11383.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 2, this.parameter_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8208(3, getCompilerVersion());
        }
        for (int i2 = 0; i2 < this.protoFile_.size(); i2++) {
            abstractC4294.mo8208(15, this.protoFile_.get(i2));
        }
        for (int i3 = 0; i3 < this.sourceFileDescriptors_.size(); i3++) {
            abstractC4294.mo8208(17, this.sourceFileDescriptors_.get(i3));
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorRequest$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4157 extends GeneratedMessage.AbstractC4137 implements InterfaceC9081 {
        private int bitField0_;
        private C4174 compilerVersionBuilder_;
        private PluginProtos$Version compilerVersion_;
        private C4216 fileToGenerate_;
        private Object parameter_;
        private C4195 protoFileBuilder_;
        private List<DescriptorProtos$FileDescriptorProto> protoFile_;
        private C4195 sourceFileDescriptorsBuilder_;
        private List<DescriptorProtos$FileDescriptorProto> sourceFileDescriptors_;

        private C4157() {
            this.fileToGenerate_ = C4216.f11382;
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
                this.fileToGenerate_.m8346();
                pluginProtos$CodeGeneratorRequest.fileToGenerate_ = this.fileToGenerate_;
            }
            if ((i2 & 2) != 0) {
                pluginProtos$CodeGeneratorRequest.parameter_ = this.parameter_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                C4174 c4174 = this.compilerVersionBuilder_;
                pluginProtos$CodeGeneratorRequest.compilerVersion_ = c4174 == null ? this.compilerVersion_ : (PluginProtos$Version) c4174.m7943();
                i |= 2;
            }
            PluginProtos$CodeGeneratorRequest.access$2176(pluginProtos$CodeGeneratorRequest, i);
        }

        private void buildPartialRepeatedFields(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                    this.bitField0_ &= -5;
                }
                pluginProtos$CodeGeneratorRequest.protoFile_ = this.protoFile_;
            } else {
                pluginProtos$CodeGeneratorRequest.protoFile_ = c4195.m8031();
            }
            C4195 c41952 = this.sourceFileDescriptorsBuilder_;
            if (c41952 != null) {
                pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_ = c41952.m8031();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.sourceFileDescriptors_ = Collections.unmodifiableList(this.sourceFileDescriptors_);
                this.bitField0_ &= -9;
            }
            pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_ = this.sourceFileDescriptors_;
        }

        private void ensureFileToGenerateIsMutable() {
            if (!this.fileToGenerate_.f11544) {
                this.fileToGenerate_ = new C4216(this.fileToGenerate_);
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

        public static final C4495 getDescriptor() {
            return AbstractC9078.f23183;
        }

        private C4174 internalGetCompilerVersionFieldBuilder() {
            if (this.compilerVersionBuilder_ == null) {
                this.compilerVersionBuilder_ = new C4174(getCompilerVersion(), getParentForChildren(), isClean());
                this.compilerVersion_ = null;
            }
            return this.compilerVersionBuilder_;
        }

        private C4195 internalGetProtoFileFieldBuilder() {
            if (this.protoFileBuilder_ == null) {
                this.protoFileBuilder_ = new C4195(this.protoFile_, getParentForChildren(), isClean());
                this.protoFile_ = null;
            }
            return this.protoFileBuilder_;
        }

        private C4195 internalGetSourceFileDescriptorsFieldBuilder() {
            if (this.sourceFileDescriptorsBuilder_ == null) {
                this.sourceFileDescriptorsBuilder_ = new C4195(this.sourceFileDescriptors_, getParentForChildren(), isClean());
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

        public C4157 addAllFileToGenerate(Iterable<String> iterable) {
            ensureFileToGenerateIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.fileToGenerate_);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4157 addAllProtoFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureProtoFileIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.protoFile_);
            onChanged();
            return this;
        }

        public C4157 addAllSourceFileDescriptors(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.sourceFileDescriptors_);
            onChanged();
            return this;
        }

        public C4157 addFileToGenerate(String str) {
            str.getClass();
            ensureFileToGenerateIsMutable();
            this.fileToGenerate_.m8052(str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4157 addFileToGenerateBytes(ByteString byteString) {
            byteString.getClass();
            ensureFileToGenerateIsMutable();
            this.fileToGenerate_.mo8054(byteString);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4157 addProtoFile(DescriptorProtos$FileDescriptorProto.C4112 c4112) {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4112.build());
                return this;
            }
            ensureProtoFileIsMutable();
            this.protoFile_.add(c4112.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FileDescriptorProto.C4112 addProtoFileBuilder() {
            return (DescriptorProtos$FileDescriptorProto.C4112) internalGetProtoFileFieldBuilder().m8019(DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        public C4157 addSourceFileDescriptors(DescriptorProtos$FileDescriptorProto.C4112 c4112) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4112.build());
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            this.sourceFileDescriptors_.add(c4112.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FileDescriptorProto.C4112 addSourceFileDescriptorsBuilder() {
            return (DescriptorProtos$FileDescriptorProto.C4112) internalGetSourceFileDescriptorsFieldBuilder().m8019(DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public PluginProtos$CodeGeneratorRequest build() {
            PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequestBuildPartial = buildPartial();
            if (pluginProtos$CodeGeneratorRequestBuildPartial.isInitialized()) {
                return pluginProtos$CodeGeneratorRequestBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) pluginProtos$CodeGeneratorRequestBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public PluginProtos$CodeGeneratorRequest buildPartial() {
            PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest = new PluginProtos$CodeGeneratorRequest(this);
            buildPartialRepeatedFields(pluginProtos$CodeGeneratorRequest);
            if (this.bitField0_ != 0) {
                buildPartial0(pluginProtos$CodeGeneratorRequest);
            }
            onBuilt();
            return pluginProtos$CodeGeneratorRequest;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4157 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.fileToGenerate_ = C4216.f11382;
            this.parameter_ = "";
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 == null) {
                this.protoFile_ = Collections.EMPTY_LIST;
            } else {
                this.protoFile_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -5;
            C4195 c41952 = this.sourceFileDescriptorsBuilder_;
            if (c41952 == null) {
                this.sourceFileDescriptors_ = Collections.EMPTY_LIST;
            } else {
                this.sourceFileDescriptors_ = null;
                c41952.m8030();
            }
            this.bitField0_ &= -9;
            this.compilerVersion_ = null;
            C4174 c4174 = this.compilerVersionBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.compilerVersionBuilder_ = null;
            }
            return this;
        }

        public C4157 clearCompilerVersion() {
            this.bitField0_ &= -17;
            this.compilerVersion_ = null;
            C4174 c4174 = this.compilerVersionBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.compilerVersionBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4157 clearFileToGenerate() {
            this.fileToGenerate_ = C4216.f11382;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4157 clearParameter() {
            this.parameter_ = PluginProtos$CodeGeneratorRequest.getDefaultInstance().getParameter();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4157 clearProtoFile() {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.protoFile_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C4157 clearSourceFileDescriptors() {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.sourceFileDescriptors_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // p278.InterfaceC9081
        public PluginProtos$Version getCompilerVersion() {
            C4174 c4174 = this.compilerVersionBuilder_;
            if (c4174 != null) {
                return (PluginProtos$Version) c4174.m7939();
            }
            PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
            return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
        }

        public PluginProtos$Version.C4160 getCompilerVersionBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (PluginProtos$Version.C4160) internalGetCompilerVersionFieldBuilder().m7940();
        }

        @Override // p278.InterfaceC9081
        public InterfaceC9079 getCompilerVersionOrBuilder() {
            C4174 c4174 = this.compilerVersionBuilder_;
            if (c4174 != null) {
                return (InterfaceC9079) c4174.m7938();
            }
            PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
            return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC9078.f23183;
        }

        @Override // p278.InterfaceC9081
        public String getFileToGenerate(int i) {
            return this.fileToGenerate_.get(i);
        }

        @Override // p278.InterfaceC9081
        public ByteString getFileToGenerateBytes(int i) {
            return this.fileToGenerate_.m8056(i);
        }

        @Override // p278.InterfaceC9081
        public int getFileToGenerateCount() {
            return this.fileToGenerate_.f11383.size();
        }

        @Override // p278.InterfaceC9081
        public InterfaceC4209 getFileToGenerateList() {
            this.fileToGenerate_.m8346();
            return this.fileToGenerate_;
        }

        @Override // p278.InterfaceC9081
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

        @Override // p278.InterfaceC9081
        public ByteString getParameterBytes() {
            Object obj = this.parameter_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parameter_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // p278.InterfaceC9081
        public DescriptorProtos$FileDescriptorProto getProtoFile(int i) {
            C4195 c4195 = this.protoFileBuilder_;
            return c4195 == null ? this.protoFile_.get(i) : (DescriptorProtos$FileDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$FileDescriptorProto.C4112 getProtoFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C4112) internalGetProtoFileFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$FileDescriptorProto.C4112> getProtoFileBuilderList() {
            return internalGetProtoFileFieldBuilder().m8033();
        }

        @Override // p278.InterfaceC9081
        public int getProtoFileCount() {
            C4195 c4195 = this.protoFileBuilder_;
            return c4195 == null ? this.protoFile_.size() : c4195.f11357.size();
        }

        @Override // p278.InterfaceC9081
        public List<DescriptorProtos$FileDescriptorProto> getProtoFileList() {
            C4195 c4195 = this.protoFileBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.protoFile_) : c4195.m8024();
        }

        @Override // p278.InterfaceC9081
        public InterfaceC4325 getProtoFileOrBuilder(int i) {
            C4195 c4195 = this.protoFileBuilder_;
            return c4195 == null ? this.protoFile_.get(i) : (InterfaceC4325) c4195.m8028(i);
        }

        @Override // p278.InterfaceC9081
        public List<? extends InterfaceC4325> getProtoFileOrBuilderList() {
            C4195 c4195 = this.protoFileBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.protoFile_);
        }

        @Override // p278.InterfaceC9081
        public DescriptorProtos$FileDescriptorProto getSourceFileDescriptors(int i) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            return c4195 == null ? this.sourceFileDescriptors_.get(i) : (DescriptorProtos$FileDescriptorProto) c4195.m8025(i, false);
        }

        public DescriptorProtos$FileDescriptorProto.C4112 getSourceFileDescriptorsBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C4112) internalGetSourceFileDescriptorsFieldBuilder().m8032(i);
        }

        public List<DescriptorProtos$FileDescriptorProto.C4112> getSourceFileDescriptorsBuilderList() {
            return internalGetSourceFileDescriptorsFieldBuilder().m8033();
        }

        @Override // p278.InterfaceC9081
        public int getSourceFileDescriptorsCount() {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            return c4195 == null ? this.sourceFileDescriptors_.size() : c4195.f11357.size();
        }

        @Override // p278.InterfaceC9081
        public List<DescriptorProtos$FileDescriptorProto> getSourceFileDescriptorsList() {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.sourceFileDescriptors_) : c4195.m8024();
        }

        @Override // p278.InterfaceC9081
        public InterfaceC4325 getSourceFileDescriptorsOrBuilder(int i) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            return c4195 == null ? this.sourceFileDescriptors_.get(i) : (InterfaceC4325) c4195.m8028(i);
        }

        @Override // p278.InterfaceC9081
        public List<? extends InterfaceC4325> getSourceFileDescriptorsOrBuilderList() {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.sourceFileDescriptors_);
        }

        @Override // p278.InterfaceC9081
        public boolean hasCompilerVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p278.InterfaceC9081
        public boolean hasParameter() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC9078.f23182;
            c4451.m8386(PluginProtos$CodeGeneratorRequest.class, C4157.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
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

        public C4157 mergeCompilerVersion(PluginProtos$Version pluginProtos$Version) {
            PluginProtos$Version pluginProtos$Version2;
            C4174 c4174 = this.compilerVersionBuilder_;
            if (c4174 != null) {
                c4174.m7945(pluginProtos$Version);
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

        public C4157 mergeFrom(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
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
                boolean zIsEmpty = this.protoFileBuilder_.f11357.isEmpty();
                C4195 c4195 = this.protoFileBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.protoFileBuilder_ = null;
                    this.protoFile_ = pluginProtos$CodeGeneratorRequest.protoFile_;
                    this.bitField0_ &= -5;
                    this.protoFileBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetProtoFileFieldBuilder() : null;
                } else {
                    c4195.m8021(pluginProtos$CodeGeneratorRequest.protoFile_);
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
                boolean zIsEmpty2 = this.sourceFileDescriptorsBuilder_.f11357.isEmpty();
                C4195 c41952 = this.sourceFileDescriptorsBuilder_;
                if (zIsEmpty2) {
                    c41952.f11358 = null;
                    this.sourceFileDescriptorsBuilder_ = null;
                    this.sourceFileDescriptors_ = pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_;
                    this.bitField0_ &= -9;
                    this.sourceFileDescriptorsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetSourceFileDescriptorsFieldBuilder() : null;
                } else {
                    c41952.m8021(pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_);
                }
            }
            if (pluginProtos$CodeGeneratorRequest.hasCompilerVersion()) {
                mergeCompilerVersion(pluginProtos$CodeGeneratorRequest.getCompilerVersion());
            }
            mergeUnknownFields(pluginProtos$CodeGeneratorRequest.getUnknownFields());
            onChanged();
            return this;
        }

        public C4157 removeProtoFile(int i) {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureProtoFileIsMutable();
            this.protoFile_.remove(i);
            onChanged();
            return this;
        }

        public C4157 removeSourceFileDescriptors(int i) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            this.sourceFileDescriptors_.remove(i);
            onChanged();
            return this;
        }

        public C4157 setCompilerVersion(PluginProtos$Version.C4160 c4160) {
            C4174 c4174 = this.compilerVersionBuilder_;
            if (c4174 == null) {
                this.compilerVersion_ = c4160.build();
            } else {
                c4174.m7946(c4160.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4157 setFileToGenerate(int i, String str) {
            str.getClass();
            ensureFileToGenerateIsMutable();
            this.fileToGenerate_.set(i, str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4157 setParameter(String str) {
            str.getClass();
            this.parameter_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4157 setParameterBytes(ByteString byteString) {
            byteString.getClass();
            this.parameter_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4157 setProtoFile(int i, DescriptorProtos$FileDescriptorProto.C4112 c4112) {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4112.build());
                return this;
            }
            ensureProtoFileIsMutable();
            this.protoFile_.set(i, c4112.build());
            onChanged();
            return this;
        }

        public C4157 setSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto.C4112 c4112) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4112.build());
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            this.sourceFileDescriptors_.set(i, c4112.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public PluginProtos$CodeGeneratorRequest getDefaultInstanceForType() {
            return PluginProtos$CodeGeneratorRequest.getDefaultInstance();
        }

        public DescriptorProtos$FileDescriptorProto.C4112 addProtoFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C4112) internalGetProtoFileFieldBuilder().m8020(i, DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$FileDescriptorProto.C4112 addSourceFileDescriptorsBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C4112) internalGetSourceFileDescriptorsFieldBuilder().m8020(i, DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        private C4157(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.fileToGenerate_ = C4216.f11382;
            this.parameter_ = "";
            List<DescriptorProtos$FileDescriptorProto> list = Collections.EMPTY_LIST;
            this.protoFile_ = list;
            this.sourceFileDescriptors_ = list;
            maybeForceBuilderInitialization();
        }

        public C4157 addProtoFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureProtoFileIsMutable();
                this.protoFile_.add(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C4157 addSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            if (c4195 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.add(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8018(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C4157 setCompilerVersion(PluginProtos$Version pluginProtos$Version) {
            C4174 c4174 = this.compilerVersionBuilder_;
            if (c4174 == null) {
                pluginProtos$Version.getClass();
                this.compilerVersion_ = pluginProtos$Version;
            } else {
                c4174.m7946(pluginProtos$Version);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4157 setProtoFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureProtoFileIsMutable();
                this.protoFile_.set(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C4157 setSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            if (c4195 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.set(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8022(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C4157 addProtoFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureProtoFileIsMutable();
                this.protoFile_.add(descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C4157 addSourceFileDescriptors(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            if (c4195 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.add(descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c4195.m8017(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C4157 addProtoFile(int i, DescriptorProtos$FileDescriptorProto.C4112 c4112) {
            C4195 c4195 = this.protoFileBuilder_;
            if (c4195 == null) {
                ensureProtoFileIsMutable();
                this.protoFile_.add(i, c4112.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4112.build());
            return this;
        }

        public C4157 addSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto.C4112 c4112) {
            C4195 c4195 = this.sourceFileDescriptorsBuilder_;
            if (c4195 == null) {
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.add(i, c4112.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4112.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4157 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof PluginProtos$CodeGeneratorRequest) {
                return mergeFrom((PluginProtos$CodeGeneratorRequest) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4157 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                ByteString byteStringMo8278 = abstractC4306.mo8278();
                                ensureFileToGenerateIsMutable();
                                this.fileToGenerate_.mo8054(byteStringMo8278);
                            } else if (iMo8264 == 18) {
                                this.parameter_ = abstractC4306.mo8278();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 == 26) {
                                abstractC4306.mo8275(internalGetCompilerVersionFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 16;
                            } else if (iMo8264 == 122) {
                                DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto) abstractC4306.mo8274(DescriptorProtos$FileDescriptorProto.parser(), c4529);
                                C4195 c4195 = this.protoFileBuilder_;
                                if (c4195 == null) {
                                    ensureProtoFileIsMutable();
                                    this.protoFile_.add(descriptorProtos$FileDescriptorProto);
                                } else {
                                    c4195.m8017(descriptorProtos$FileDescriptorProto);
                                }
                            } else if (iMo8264 != 138) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto2 = (DescriptorProtos$FileDescriptorProto) abstractC4306.mo8274(DescriptorProtos$FileDescriptorProto.parser(), c4529);
                                C4195 c41952 = this.sourceFileDescriptorsBuilder_;
                                if (c41952 == null) {
                                    ensureSourceFileDescriptorsIsMutable();
                                    this.sourceFileDescriptors_.add(descriptorProtos$FileDescriptorProto2);
                                } else {
                                    c41952.m8017(descriptorProtos$FileDescriptorProto2);
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

    @Override // p278.InterfaceC9081
    public InterfaceC4209 getFileToGenerateList() {
        return this.fileToGenerate_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public PluginProtos$CodeGeneratorRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static PluginProtos$CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4157 newBuilderForType() {
        return newBuilder();
    }

    public static C4157 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteString byteString) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteString byteString, C4529 c4529) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(byte[] bArr) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    private PluginProtos$CodeGeneratorRequest(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.fileToGenerate_ = C4216.f11382;
        this.parameter_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(byte[] bArr, C4529 c4529) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(InputStream inputStream, C4529 c4529) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(AbstractC4306 abstractC4306) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
