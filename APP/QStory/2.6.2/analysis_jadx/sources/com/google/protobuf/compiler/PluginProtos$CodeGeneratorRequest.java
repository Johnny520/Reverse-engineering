package com.google.protobuf.compiler;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3345;
import com.google.protobuf.AbstractC3461;
import com.google.protobuf.AbstractC3473;
import com.google.protobuf.AbstractC3527;
import com.google.protobuf.AbstractC3529;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3341;
import com.google.protobuf.C3362;
import com.google.protobuf.C3383;
import com.google.protobuf.C3618;
import com.google.protobuf.C3662;
import com.google.protobuf.C3696;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC3374;
import com.google.protobuf.InterfaceC3376;
import com.google.protobuf.InterfaceC3452;
import com.google.protobuf.InterfaceC3492;
import com.google.protobuf.InterfaceC3531;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;
import com.google.protobuf.compiler.PluginProtos$Version;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p262.AbstractC8248;
import p262.InterfaceC8249;
import p262.InterfaceC8251;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos$CodeGeneratorRequest extends GeneratedMessage implements InterfaceC8251 {
    public static final int COMPILER_VERSION_FIELD_NUMBER = 3;
    private static final PluginProtos$CodeGeneratorRequest DEFAULT_INSTANCE;
    public static final int FILE_TO_GENERATE_FIELD_NUMBER = 1;
    public static final int PARAMETER_FIELD_NUMBER = 2;
    private static final InterfaceC3374 PARSER;
    public static final int PROTO_FILE_FIELD_NUMBER = 15;
    public static final int SOURCE_FILE_DESCRIPTORS_FIELD_NUMBER = 17;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private PluginProtos$Version compilerVersion_;
    private C3383 fileToGenerate_;
    private byte memoizedIsInitialized;
    private volatile Object parameter_;
    private List<DescriptorProtos$FileDescriptorProto> protoFile_;
    private List<DescriptorProtos$FileDescriptorProto> sourceFileDescriptors_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "CodeGeneratorRequest");
        DEFAULT_INSTANCE = new PluginProtos$CodeGeneratorRequest();
        PARSER = new C3333();
    }

    private PluginProtos$CodeGeneratorRequest() {
        C3383 c3383 = C3383.f11032;
        this.fileToGenerate_ = c3383;
        this.parameter_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.fileToGenerate_ = c3383;
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

    public static final C3662 getDescriptor() {
        return AbstractC8248.f22839;
    }

    public static C3324 newBuilder(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pluginProtos$CodeGeneratorRequest);
    }

    public static PluginProtos$CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // p262.InterfaceC8251
    public PluginProtos$Version getCompilerVersion() {
        PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
        return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
    }

    @Override // p262.InterfaceC8251
    public InterfaceC8249 getCompilerVersionOrBuilder() {
        PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
        return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC8248.f22839;
    }

    @Override // p262.InterfaceC8251
    public String getFileToGenerate(int i) {
        return this.fileToGenerate_.get(i);
    }

    @Override // p262.InterfaceC8251
    public ByteString getFileToGenerateBytes(int i) {
        return this.fileToGenerate_.m7510(i);
    }

    @Override // p262.InterfaceC8251
    public int getFileToGenerateCount() {
        return this.fileToGenerate_.f11033.size();
    }

    @Override // p262.InterfaceC8251
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

    @Override // p262.InterfaceC8251
    public ByteString getParameterBytes() {
        Object obj = this.parameter_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.parameter_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // p262.InterfaceC8251
    public DescriptorProtos$FileDescriptorProto getProtoFile(int i) {
        return this.protoFile_.get(i);
    }

    @Override // p262.InterfaceC8251
    public int getProtoFileCount() {
        return this.protoFile_.size();
    }

    @Override // p262.InterfaceC8251
    public List<DescriptorProtos$FileDescriptorProto> getProtoFileList() {
        return this.protoFile_;
    }

    @Override // p262.InterfaceC8251
    public InterfaceC3492 getProtoFileOrBuilder(int i) {
        return this.protoFile_.get(i);
    }

    @Override // p262.InterfaceC8251
    public List<? extends InterfaceC3492> getProtoFileOrBuilderList() {
        return this.protoFile_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.fileToGenerate_.f11033.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.fileToGenerate_.f11033.get(i2));
        }
        int size = getFileToGenerateList().size() + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 1) != 0) {
            size += GeneratedMessage.computeStringSize(2, this.parameter_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += AbstractC3461.m7652(3, getCompilerVersion());
        }
        int size2 = this.protoFile_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            size += AbstractC3461.m7656(this.protoFile_.get(i3));
        }
        int iM7656 = size + size2;
        int size3 = this.sourceFileDescriptors_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM7656 += AbstractC3461.m7656(this.sourceFileDescriptors_.get(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + (size3 * 2) + iM7656;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p262.InterfaceC8251
    public DescriptorProtos$FileDescriptorProto getSourceFileDescriptors(int i) {
        return this.sourceFileDescriptors_.get(i);
    }

    @Override // p262.InterfaceC8251
    public int getSourceFileDescriptorsCount() {
        return this.sourceFileDescriptors_.size();
    }

    @Override // p262.InterfaceC8251
    public List<DescriptorProtos$FileDescriptorProto> getSourceFileDescriptorsList() {
        return this.sourceFileDescriptors_;
    }

    @Override // p262.InterfaceC8251
    public InterfaceC3492 getSourceFileDescriptorsOrBuilder(int i) {
        return this.sourceFileDescriptors_.get(i);
    }

    @Override // p262.InterfaceC8251
    public List<? extends InterfaceC3492> getSourceFileDescriptorsOrBuilderList() {
        return this.sourceFileDescriptors_;
    }

    @Override // p262.InterfaceC8251
    public boolean hasCompilerVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p262.InterfaceC8251
    public boolean hasParameter() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getFileToGenerateCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getFileToGenerateList().hashCode();
        }
        if (hasParameter()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getParameter().hashCode();
        }
        if (getProtoFileCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 15, 53) + getProtoFileList().hashCode();
        }
        if (getSourceFileDescriptorsCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 17, 53) + getSourceFileDescriptorsList().hashCode();
        }
        if (hasCompilerVersion()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getCompilerVersion().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC8248.f22838;
        c3618.m7840(PluginProtos$CodeGeneratorRequest.class, C3324.class);
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

    @Override // com.google.protobuf.AbstractC3532
    public C3324 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3324(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3324 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3324() : new C3324().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        for (int i = 0; i < this.fileToGenerate_.f11033.size(); i++) {
            GeneratedMessage.writeString(abstractC3461, 1, this.fileToGenerate_.f11033.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 2, this.parameter_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7662(3, getCompilerVersion());
        }
        for (int i2 = 0; i2 < this.protoFile_.size(); i2++) {
            abstractC3461.mo7662(15, this.protoFile_.get(i2));
        }
        for (int i3 = 0; i3 < this.sourceFileDescriptors_.size(); i3++) {
            abstractC3461.mo7662(17, this.sourceFileDescriptors_.get(i3));
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorRequest$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3324 extends GeneratedMessage.AbstractC3304 implements InterfaceC8251 {
        private int bitField0_;
        private C3341 compilerVersionBuilder_;
        private PluginProtos$Version compilerVersion_;
        private C3383 fileToGenerate_;
        private Object parameter_;
        private C3362 protoFileBuilder_;
        private List<DescriptorProtos$FileDescriptorProto> protoFile_;
        private C3362 sourceFileDescriptorsBuilder_;
        private List<DescriptorProtos$FileDescriptorProto> sourceFileDescriptors_;

        private C3324() {
            this.fileToGenerate_ = C3383.f11032;
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
                this.fileToGenerate_.m7800();
                pluginProtos$CodeGeneratorRequest.fileToGenerate_ = this.fileToGenerate_;
            }
            if ((i2 & 2) != 0) {
                pluginProtos$CodeGeneratorRequest.parameter_ = this.parameter_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                C3341 c3341 = this.compilerVersionBuilder_;
                pluginProtos$CodeGeneratorRequest.compilerVersion_ = c3341 == null ? this.compilerVersion_ : (PluginProtos$Version) c3341.m7397();
                i |= 2;
            }
            PluginProtos$CodeGeneratorRequest.access$2176(pluginProtos$CodeGeneratorRequest, i);
        }

        private void buildPartialRepeatedFields(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                    this.bitField0_ &= -5;
                }
                pluginProtos$CodeGeneratorRequest.protoFile_ = this.protoFile_;
            } else {
                pluginProtos$CodeGeneratorRequest.protoFile_ = c3362.m7485();
            }
            C3362 c33622 = this.sourceFileDescriptorsBuilder_;
            if (c33622 != null) {
                pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_ = c33622.m7485();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.sourceFileDescriptors_ = Collections.unmodifiableList(this.sourceFileDescriptors_);
                this.bitField0_ &= -9;
            }
            pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_ = this.sourceFileDescriptors_;
        }

        private void ensureFileToGenerateIsMutable() {
            if (!this.fileToGenerate_.f11194) {
                this.fileToGenerate_ = new C3383(this.fileToGenerate_);
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

        public static final C3662 getDescriptor() {
            return AbstractC8248.f22839;
        }

        private C3341 internalGetCompilerVersionFieldBuilder() {
            if (this.compilerVersionBuilder_ == null) {
                this.compilerVersionBuilder_ = new C3341(getCompilerVersion(), getParentForChildren(), isClean());
                this.compilerVersion_ = null;
            }
            return this.compilerVersionBuilder_;
        }

        private C3362 internalGetProtoFileFieldBuilder() {
            if (this.protoFileBuilder_ == null) {
                this.protoFileBuilder_ = new C3362(this.protoFile_, getParentForChildren(), isClean());
                this.protoFile_ = null;
            }
            return this.protoFileBuilder_;
        }

        private C3362 internalGetSourceFileDescriptorsFieldBuilder() {
            if (this.sourceFileDescriptorsBuilder_ == null) {
                this.sourceFileDescriptorsBuilder_ = new C3362(this.sourceFileDescriptors_, getParentForChildren(), isClean());
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

        public C3324 addAllFileToGenerate(Iterable<String> iterable) {
            ensureFileToGenerateIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.fileToGenerate_);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3324 addAllProtoFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureProtoFileIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.protoFile_);
            onChanged();
            return this;
        }

        public C3324 addAllSourceFileDescriptors(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.sourceFileDescriptors_);
            onChanged();
            return this;
        }

        public C3324 addFileToGenerate(String str) {
            str.getClass();
            ensureFileToGenerateIsMutable();
            this.fileToGenerate_.m7506(str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3324 addFileToGenerateBytes(ByteString byteString) {
            byteString.getClass();
            ensureFileToGenerateIsMutable();
            this.fileToGenerate_.mo7508(byteString);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3324 addProtoFile(DescriptorProtos$FileDescriptorProto.C3279 c3279) {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3279.build());
                return this;
            }
            ensureProtoFileIsMutable();
            this.protoFile_.add(c3279.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FileDescriptorProto.C3279 addProtoFileBuilder() {
            return (DescriptorProtos$FileDescriptorProto.C3279) internalGetProtoFileFieldBuilder().m7473(DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        public C3324 addSourceFileDescriptors(DescriptorProtos$FileDescriptorProto.C3279 c3279) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3279.build());
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            this.sourceFileDescriptors_.add(c3279.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$FileDescriptorProto.C3279 addSourceFileDescriptorsBuilder() {
            return (DescriptorProtos$FileDescriptorProto.C3279) internalGetSourceFileDescriptorsFieldBuilder().m7473(DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public PluginProtos$CodeGeneratorRequest build() {
            PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequestBuildPartial = buildPartial();
            if (pluginProtos$CodeGeneratorRequestBuildPartial.isInitialized()) {
                return pluginProtos$CodeGeneratorRequestBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) pluginProtos$CodeGeneratorRequestBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public PluginProtos$CodeGeneratorRequest buildPartial() {
            PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest = new PluginProtos$CodeGeneratorRequest(this);
            buildPartialRepeatedFields(pluginProtos$CodeGeneratorRequest);
            if (this.bitField0_ != 0) {
                buildPartial0(pluginProtos$CodeGeneratorRequest);
            }
            onBuilt();
            return pluginProtos$CodeGeneratorRequest;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3324 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.fileToGenerate_ = C3383.f11032;
            this.parameter_ = "";
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 == null) {
                this.protoFile_ = Collections.EMPTY_LIST;
            } else {
                this.protoFile_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -5;
            C3362 c33622 = this.sourceFileDescriptorsBuilder_;
            if (c33622 == null) {
                this.sourceFileDescriptors_ = Collections.EMPTY_LIST;
            } else {
                this.sourceFileDescriptors_ = null;
                c33622.m7484();
            }
            this.bitField0_ &= -9;
            this.compilerVersion_ = null;
            C3341 c3341 = this.compilerVersionBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.compilerVersionBuilder_ = null;
            }
            return this;
        }

        public C3324 clearCompilerVersion() {
            this.bitField0_ &= -17;
            this.compilerVersion_ = null;
            C3341 c3341 = this.compilerVersionBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.compilerVersionBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3324 clearFileToGenerate() {
            this.fileToGenerate_ = C3383.f11032;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3324 clearParameter() {
            this.parameter_ = PluginProtos$CodeGeneratorRequest.getDefaultInstance().getParameter();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3324 clearProtoFile() {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.protoFile_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3324 clearSourceFileDescriptors() {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.sourceFileDescriptors_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // p262.InterfaceC8251
        public PluginProtos$Version getCompilerVersion() {
            C3341 c3341 = this.compilerVersionBuilder_;
            if (c3341 != null) {
                return (PluginProtos$Version) c3341.m7393();
            }
            PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
            return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
        }

        public PluginProtos$Version.C3327 getCompilerVersionBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (PluginProtos$Version.C3327) internalGetCompilerVersionFieldBuilder().m7394();
        }

        @Override // p262.InterfaceC8251
        public InterfaceC8249 getCompilerVersionOrBuilder() {
            C3341 c3341 = this.compilerVersionBuilder_;
            if (c3341 != null) {
                return (InterfaceC8249) c3341.m7392();
            }
            PluginProtos$Version pluginProtos$Version = this.compilerVersion_;
            return pluginProtos$Version == null ? PluginProtos$Version.getDefaultInstance() : pluginProtos$Version;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC8248.f22839;
        }

        @Override // p262.InterfaceC8251
        public String getFileToGenerate(int i) {
            return this.fileToGenerate_.get(i);
        }

        @Override // p262.InterfaceC8251
        public ByteString getFileToGenerateBytes(int i) {
            return this.fileToGenerate_.m7510(i);
        }

        @Override // p262.InterfaceC8251
        public int getFileToGenerateCount() {
            return this.fileToGenerate_.f11033.size();
        }

        @Override // p262.InterfaceC8251
        public InterfaceC3376 getFileToGenerateList() {
            this.fileToGenerate_.m7800();
            return this.fileToGenerate_;
        }

        @Override // p262.InterfaceC8251
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

        @Override // p262.InterfaceC8251
        public ByteString getParameterBytes() {
            Object obj = this.parameter_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parameter_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // p262.InterfaceC8251
        public DescriptorProtos$FileDescriptorProto getProtoFile(int i) {
            C3362 c3362 = this.protoFileBuilder_;
            return c3362 == null ? this.protoFile_.get(i) : (DescriptorProtos$FileDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$FileDescriptorProto.C3279 getProtoFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3279) internalGetProtoFileFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$FileDescriptorProto.C3279> getProtoFileBuilderList() {
            return internalGetProtoFileFieldBuilder().m7487();
        }

        @Override // p262.InterfaceC8251
        public int getProtoFileCount() {
            C3362 c3362 = this.protoFileBuilder_;
            return c3362 == null ? this.protoFile_.size() : c3362.f11007.size();
        }

        @Override // p262.InterfaceC8251
        public List<DescriptorProtos$FileDescriptorProto> getProtoFileList() {
            C3362 c3362 = this.protoFileBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.protoFile_) : c3362.m7478();
        }

        @Override // p262.InterfaceC8251
        public InterfaceC3492 getProtoFileOrBuilder(int i) {
            C3362 c3362 = this.protoFileBuilder_;
            return c3362 == null ? this.protoFile_.get(i) : (InterfaceC3492) c3362.m7482(i);
        }

        @Override // p262.InterfaceC8251
        public List<? extends InterfaceC3492> getProtoFileOrBuilderList() {
            C3362 c3362 = this.protoFileBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.protoFile_);
        }

        @Override // p262.InterfaceC8251
        public DescriptorProtos$FileDescriptorProto getSourceFileDescriptors(int i) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            return c3362 == null ? this.sourceFileDescriptors_.get(i) : (DescriptorProtos$FileDescriptorProto) c3362.m7479(i, false);
        }

        public DescriptorProtos$FileDescriptorProto.C3279 getSourceFileDescriptorsBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3279) internalGetSourceFileDescriptorsFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$FileDescriptorProto.C3279> getSourceFileDescriptorsBuilderList() {
            return internalGetSourceFileDescriptorsFieldBuilder().m7487();
        }

        @Override // p262.InterfaceC8251
        public int getSourceFileDescriptorsCount() {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            return c3362 == null ? this.sourceFileDescriptors_.size() : c3362.f11007.size();
        }

        @Override // p262.InterfaceC8251
        public List<DescriptorProtos$FileDescriptorProto> getSourceFileDescriptorsList() {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.sourceFileDescriptors_) : c3362.m7478();
        }

        @Override // p262.InterfaceC8251
        public InterfaceC3492 getSourceFileDescriptorsOrBuilder(int i) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            return c3362 == null ? this.sourceFileDescriptors_.get(i) : (InterfaceC3492) c3362.m7482(i);
        }

        @Override // p262.InterfaceC8251
        public List<? extends InterfaceC3492> getSourceFileDescriptorsOrBuilderList() {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.sourceFileDescriptors_);
        }

        @Override // p262.InterfaceC8251
        public boolean hasCompilerVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p262.InterfaceC8251
        public boolean hasParameter() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC8248.f22838;
            c3618.m7840(PluginProtos$CodeGeneratorRequest.class, C3324.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

        public C3324 mergeCompilerVersion(PluginProtos$Version pluginProtos$Version) {
            PluginProtos$Version pluginProtos$Version2;
            C3341 c3341 = this.compilerVersionBuilder_;
            if (c3341 != null) {
                c3341.m7399(pluginProtos$Version);
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

        public C3324 mergeFrom(PluginProtos$CodeGeneratorRequest pluginProtos$CodeGeneratorRequest) {
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
                boolean zIsEmpty = this.protoFileBuilder_.f11007.isEmpty();
                C3362 c3362 = this.protoFileBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.protoFileBuilder_ = null;
                    this.protoFile_ = pluginProtos$CodeGeneratorRequest.protoFile_;
                    this.bitField0_ &= -5;
                    this.protoFileBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetProtoFileFieldBuilder() : null;
                } else {
                    c3362.m7475(pluginProtos$CodeGeneratorRequest.protoFile_);
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
                boolean zIsEmpty2 = this.sourceFileDescriptorsBuilder_.f11007.isEmpty();
                C3362 c33622 = this.sourceFileDescriptorsBuilder_;
                if (zIsEmpty2) {
                    c33622.f11008 = null;
                    this.sourceFileDescriptorsBuilder_ = null;
                    this.sourceFileDescriptors_ = pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_;
                    this.bitField0_ &= -9;
                    this.sourceFileDescriptorsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetSourceFileDescriptorsFieldBuilder() : null;
                } else {
                    c33622.m7475(pluginProtos$CodeGeneratorRequest.sourceFileDescriptors_);
                }
            }
            if (pluginProtos$CodeGeneratorRequest.hasCompilerVersion()) {
                mergeCompilerVersion(pluginProtos$CodeGeneratorRequest.getCompilerVersion());
            }
            mergeUnknownFields(pluginProtos$CodeGeneratorRequest.getUnknownFields());
            onChanged();
            return this;
        }

        public C3324 removeProtoFile(int i) {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureProtoFileIsMutable();
            this.protoFile_.remove(i);
            onChanged();
            return this;
        }

        public C3324 removeSourceFileDescriptors(int i) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            this.sourceFileDescriptors_.remove(i);
            onChanged();
            return this;
        }

        public C3324 setCompilerVersion(PluginProtos$Version.C3327 c3327) {
            C3341 c3341 = this.compilerVersionBuilder_;
            if (c3341 == null) {
                this.compilerVersion_ = c3327.build();
            } else {
                c3341.m7400(c3327.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3324 setFileToGenerate(int i, String str) {
            str.getClass();
            ensureFileToGenerateIsMutable();
            this.fileToGenerate_.set(i, str);
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3324 setParameter(String str) {
            str.getClass();
            this.parameter_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3324 setParameterBytes(ByteString byteString) {
            byteString.getClass();
            this.parameter_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3324 setProtoFile(int i, DescriptorProtos$FileDescriptorProto.C3279 c3279) {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3279.build());
                return this;
            }
            ensureProtoFileIsMutable();
            this.protoFile_.set(i, c3279.build());
            onChanged();
            return this;
        }

        public C3324 setSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto.C3279 c3279) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3279.build());
                return this;
            }
            ensureSourceFileDescriptorsIsMutable();
            this.sourceFileDescriptors_.set(i, c3279.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public PluginProtos$CodeGeneratorRequest getDefaultInstanceForType() {
            return PluginProtos$CodeGeneratorRequest.getDefaultInstance();
        }

        public DescriptorProtos$FileDescriptorProto.C3279 addProtoFileBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3279) internalGetProtoFileFieldBuilder().m7474(i, DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        public DescriptorProtos$FileDescriptorProto.C3279 addSourceFileDescriptorsBuilder(int i) {
            return (DescriptorProtos$FileDescriptorProto.C3279) internalGetSourceFileDescriptorsFieldBuilder().m7474(i, DescriptorProtos$FileDescriptorProto.getDefaultInstance());
        }

        private C3324(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.fileToGenerate_ = C3383.f11032;
            this.parameter_ = "";
            List<DescriptorProtos$FileDescriptorProto> list = Collections.EMPTY_LIST;
            this.protoFile_ = list;
            this.sourceFileDescriptors_ = list;
            maybeForceBuilderInitialization();
        }

        public C3324 addProtoFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureProtoFileIsMutable();
                this.protoFile_.add(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3324 addSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            if (c3362 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.add(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3324 setCompilerVersion(PluginProtos$Version pluginProtos$Version) {
            C3341 c3341 = this.compilerVersionBuilder_;
            if (c3341 == null) {
                pluginProtos$Version.getClass();
                this.compilerVersion_ = pluginProtos$Version;
            } else {
                c3341.m7400(pluginProtos$Version);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3324 setProtoFile(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureProtoFileIsMutable();
                this.protoFile_.set(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3324 setSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            if (c3362 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.set(i, descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3324 addProtoFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureProtoFileIsMutable();
                this.protoFile_.add(descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3324 addSourceFileDescriptors(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            if (c3362 == null) {
                descriptorProtos$FileDescriptorProto.getClass();
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.add(descriptorProtos$FileDescriptorProto);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public C3324 addProtoFile(int i, DescriptorProtos$FileDescriptorProto.C3279 c3279) {
            C3362 c3362 = this.protoFileBuilder_;
            if (c3362 == null) {
                ensureProtoFileIsMutable();
                this.protoFile_.add(i, c3279.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3279.build());
            return this;
        }

        public C3324 addSourceFileDescriptors(int i, DescriptorProtos$FileDescriptorProto.C3279 c3279) {
            C3362 c3362 = this.sourceFileDescriptorsBuilder_;
            if (c3362 == null) {
                ensureSourceFileDescriptorsIsMutable();
                this.sourceFileDescriptors_.add(i, c3279.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3279.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3324 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof PluginProtos$CodeGeneratorRequest) {
                return mergeFrom((PluginProtos$CodeGeneratorRequest) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3324 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                ByteString byteStringMo7732 = abstractC3473.mo7732();
                                ensureFileToGenerateIsMutable();
                                this.fileToGenerate_.mo7508(byteStringMo7732);
                            } else if (iMo7718 == 18) {
                                this.parameter_ = abstractC3473.mo7732();
                                this.bitField0_ |= 2;
                            } else if (iMo7718 == 26) {
                                abstractC3473.mo7729(internalGetCompilerVersionFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 16;
                            } else if (iMo7718 == 122) {
                                DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto) abstractC3473.mo7728(DescriptorProtos$FileDescriptorProto.parser(), c3696);
                                C3362 c3362 = this.protoFileBuilder_;
                                if (c3362 == null) {
                                    ensureProtoFileIsMutable();
                                    this.protoFile_.add(descriptorProtos$FileDescriptorProto);
                                } else {
                                    c3362.m7471(descriptorProtos$FileDescriptorProto);
                                }
                            } else if (iMo7718 != 138) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto2 = (DescriptorProtos$FileDescriptorProto) abstractC3473.mo7728(DescriptorProtos$FileDescriptorProto.parser(), c3696);
                                C3362 c33622 = this.sourceFileDescriptorsBuilder_;
                                if (c33622 == null) {
                                    ensureSourceFileDescriptorsIsMutable();
                                    this.sourceFileDescriptors_.add(descriptorProtos$FileDescriptorProto2);
                                } else {
                                    c33622.m7471(descriptorProtos$FileDescriptorProto2);
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

    @Override // p262.InterfaceC8251
    public InterfaceC3376 getFileToGenerateList() {
        return this.fileToGenerate_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public PluginProtos$CodeGeneratorRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static PluginProtos$CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3324 newBuilderForType() {
        return newBuilder();
    }

    public static C3324 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteString byteString) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(ByteString byteString, C3696 c3696) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(byte[] bArr) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    private PluginProtos$CodeGeneratorRequest(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.fileToGenerate_ = C3383.f11032;
        this.parameter_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(byte[] bArr, C3696 c3696) {
        return (PluginProtos$CodeGeneratorRequest) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(InputStream inputStream, C3696 c3696) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(AbstractC3473 abstractC3473) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static PluginProtos$CodeGeneratorRequest parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (PluginProtos$CodeGeneratorRequest) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
