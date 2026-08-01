package com.google.protobuf.compiler;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4178;
import com.google.protobuf.AbstractC4234;
import com.google.protobuf.AbstractC4294;
import com.google.protobuf.AbstractC4306;
import com.google.protobuf.AbstractC4360;
import com.google.protobuf.AbstractC4362;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.ByteString;
import com.google.protobuf.C4174;
import com.google.protobuf.C4195;
import com.google.protobuf.C4451;
import com.google.protobuf.C4495;
import com.google.protobuf.C4496;
import com.google.protobuf.C4498;
import com.google.protobuf.C4529;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC4207;
import com.google.protobuf.InterfaceC4213;
import com.google.protobuf.InterfaceC4230;
import com.google.protobuf.InterfaceC4285;
import com.google.protobuf.InterfaceC4312;
import com.google.protobuf.InterfaceC4364;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p278.AbstractC9078;
import p278.InterfaceC9080;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos$CodeGeneratorResponse extends GeneratedMessage implements InterfaceC4162 {
    private static final PluginProtos$CodeGeneratorResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    public static final int FILE_FIELD_NUMBER = 15;
    public static final int MAXIMUM_EDITION_FIELD_NUMBER = 4;
    public static final int MINIMUM_EDITION_FIELD_NUMBER = 3;
    private static final InterfaceC4207 PARSER;
    public static final int SUPPORTED_FEATURES_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object error_;
    private List<File> file_;
    private int maximumEdition_;
    private byte memoizedIsInitialized;
    private int minimumEdition_;
    private long supportedFeatures_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "CodeGeneratorResponse");
        DEFAULT_INSTANCE = new PluginProtos$CodeGeneratorResponse();
        PARSER = new C4165();
    }

    private PluginProtos$CodeGeneratorResponse() {
        this.error_ = "";
        this.supportedFeatures_ = 0L;
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.error_ = "";
        this.file_ = Collections.EMPTY_LIST;
    }

    public static /* synthetic */ int access$4576(PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse, int i) {
        int i2 = i | pluginProtos$CodeGeneratorResponse.bitField0_;
        pluginProtos$CodeGeneratorResponse.bitField0_ = i2;
        return i2;
    }

    public static PluginProtos$CodeGeneratorResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC9078.f23181;
    }

    public static C4159 newBuilder(PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pluginProtos$CodeGeneratorResponse);
    }

    public static PluginProtos$CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PluginProtos$CodeGeneratorResponse)) {
            return super.equals(obj);
        }
        PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse = (PluginProtos$CodeGeneratorResponse) obj;
        if (hasError() != pluginProtos$CodeGeneratorResponse.hasError()) {
            return false;
        }
        if ((hasError() && !getError().equals(pluginProtos$CodeGeneratorResponse.getError())) || hasSupportedFeatures() != pluginProtos$CodeGeneratorResponse.hasSupportedFeatures()) {
            return false;
        }
        if ((hasSupportedFeatures() && getSupportedFeatures() != pluginProtos$CodeGeneratorResponse.getSupportedFeatures()) || hasMinimumEdition() != pluginProtos$CodeGeneratorResponse.hasMinimumEdition()) {
            return false;
        }
        if ((!hasMinimumEdition() || getMinimumEdition() == pluginProtos$CodeGeneratorResponse.getMinimumEdition()) && hasMaximumEdition() == pluginProtos$CodeGeneratorResponse.hasMaximumEdition()) {
            return (!hasMaximumEdition() || getMaximumEdition() == pluginProtos$CodeGeneratorResponse.getMaximumEdition()) && getFileList().equals(pluginProtos$CodeGeneratorResponse.getFileList()) && getUnknownFields().equals(pluginProtos$CodeGeneratorResponse.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC9078.f23181;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public String getError() {
        Object obj = this.error_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.error_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public ByteString getErrorBytes() {
        Object obj = this.error_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.error_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public File getFile(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public int getFileCount() {
        return this.file_.size();
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public List<File> getFileList() {
        return this.file_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public InterfaceC9080 getFileOrBuilder(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public List<? extends InterfaceC9080> getFileOrBuilderList() {
        return this.file_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public int getMaximumEdition() {
        return this.maximumEdition_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public int getMinimumEdition() {
        return this.minimumEdition_;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.error_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += AbstractC4294.m8196(2, this.supportedFeatures_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC4294.m8190(3, this.minimumEdition_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC4294.m8190(4, this.maximumEdition_);
        }
        int size = this.file_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC4294.m8202(this.file_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public long getSupportedFeatures() {
        return this.supportedFeatures_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public boolean hasError() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public boolean hasMaximumEdition() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public boolean hasMinimumEdition() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.compiler.InterfaceC4162
    public boolean hasSupportedFeatures() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasError()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getError().hashCode();
        }
        if (hasSupportedFeatures()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + AbstractC4234.m8061(getSupportedFeatures());
        }
        if (hasMinimumEdition()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getMinimumEdition();
        }
        if (hasMaximumEdition()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + getMaximumEdition();
        }
        if (getFileCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 15, 53) + getFileList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC9078.f23180;
        c4451.m8386(PluginProtos$CodeGeneratorResponse.class, C4159.class);
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
    public C4159 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4159(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4159 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4159() : new C4159().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC4294, 1, this.error_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC4294.mo8207(2, this.supportedFeatures_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC4294.mo8210(3, this.minimumEdition_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC4294.mo8210(4, this.maximumEdition_);
        }
        for (int i = 0; i < this.file_.size(); i++) {
            abstractC4294.mo8208(15, this.file_.get(i));
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class File extends GeneratedMessage implements InterfaceC9080 {
        public static final int CONTENT_FIELD_NUMBER = 15;
        private static final File DEFAULT_INSTANCE;
        public static final int GENERATED_CODE_INFO_FIELD_NUMBER = 16;
        public static final int INSERTION_POINT_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final InterfaceC4207 PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object content_;
        private DescriptorProtos$GeneratedCodeInfo generatedCodeInfo_;
        private volatile Object insertionPoint_;
        private byte memoizedIsInitialized;
        private volatile Object name_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "File");
            DEFAULT_INSTANCE = new File();
            PARSER = new C4163();
        }

        private File() {
            this.name_ = "";
            this.insertionPoint_ = "";
            this.content_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.insertionPoint_ = "";
            this.content_ = "";
        }

        public static /* synthetic */ int access$3676(File file, int i) {
            int i2 = i | file.bitField0_;
            file.bitField0_ = i2;
            return i2;
        }

        public static File getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C4495 getDescriptor() {
            return AbstractC9078.f23187;
        }

        public static C4158 newBuilder(File file) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(file);
        }

        public static File parseDelimitedFrom(InputStream inputStream) {
            return (File) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static File parseFrom(ByteBuffer byteBuffer) {
            return (File) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof File)) {
                return super.equals(obj);
            }
            File file = (File) obj;
            if (hasName() != file.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(file.getName())) || hasInsertionPoint() != file.hasInsertionPoint()) {
                return false;
            }
            if ((hasInsertionPoint() && !getInsertionPoint().equals(file.getInsertionPoint())) || hasContent() != file.hasContent()) {
                return false;
            }
            if ((!hasContent() || getContent().equals(file.getContent())) && hasGeneratedCodeInfo() == file.hasGeneratedCodeInfo()) {
                return (!hasGeneratedCodeInfo() || getGeneratedCodeInfo().equals(file.getGeneratedCodeInfo())) && getUnknownFields().equals(file.getUnknownFields());
            }
            return false;
        }

        @Override // p278.InterfaceC9080
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.content_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // p278.InterfaceC9080
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC9078.f23187;
        }

        @Override // p278.InterfaceC9080
        public DescriptorProtos$GeneratedCodeInfo getGeneratedCodeInfo() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
            return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
        }

        @Override // p278.InterfaceC9080
        public InterfaceC4312 getGeneratedCodeInfoOrBuilder() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
            return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
        }

        @Override // p278.InterfaceC9080
        public String getInsertionPoint() {
            Object obj = this.insertionPoint_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.insertionPoint_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // p278.InterfaceC9080
        public ByteString getInsertionPointBytes() {
            Object obj = this.insertionPoint_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.insertionPoint_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // p278.InterfaceC9080
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

        @Override // p278.InterfaceC9080
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.insertionPoint_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(15, this.content_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += AbstractC4294.m8198(16, getGeneratedCodeInfo());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // p278.InterfaceC9080
        public boolean hasContent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p278.InterfaceC9080
        public boolean hasGeneratedCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p278.InterfaceC9080
        public boolean hasInsertionPoint() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p278.InterfaceC9080
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            if (hasInsertionPoint()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getInsertionPoint().hashCode();
            }
            if (hasContent()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 15, 53) + getContent().hashCode();
            }
            if (hasGeneratedCodeInfo()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 16, 53) + getGeneratedCodeInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC9078.f23186;
            c4451.m8386(File.class, C4158.class);
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
        public C4158 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4158(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4158 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4158() : new C4158().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC4294, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC4294, 2, this.insertionPoint_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(abstractC4294, 15, this.content_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC4294.mo8208(16, getGeneratedCodeInfo());
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4158 extends GeneratedMessage.AbstractC4137 implements InterfaceC9080 {
            private int bitField0_;
            private Object content_;
            private C4174 generatedCodeInfoBuilder_;
            private DescriptorProtos$GeneratedCodeInfo generatedCodeInfo_;
            private Object insertionPoint_;
            private Object name_;

            private C4158() {
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(File file) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    file.name_ = this.name_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    file.insertionPoint_ = this.insertionPoint_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    file.content_ = this.content_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    C4174 c4174 = this.generatedCodeInfoBuilder_;
                    file.generatedCodeInfo_ = c4174 == null ? this.generatedCodeInfo_ : (DescriptorProtos$GeneratedCodeInfo) c4174.m7943();
                    i |= 8;
                }
                File.access$3676(file, i);
            }

            public static final C4495 getDescriptor() {
                return AbstractC9078.f23187;
            }

            private C4174 internalGetGeneratedCodeInfoFieldBuilder() {
                if (this.generatedCodeInfoBuilder_ == null) {
                    this.generatedCodeInfoBuilder_ = new C4174(getGeneratedCodeInfo(), getParentForChildren(), isClean());
                    this.generatedCodeInfo_ = null;
                }
                return this.generatedCodeInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetGeneratedCodeInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public File build() {
                File fileBuildPartial = buildPartial();
                if (fileBuildPartial.isInitialized()) {
                    return fileBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) fileBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public File buildPartial() {
                File file = new File(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(file);
                }
                onBuilt();
                return file;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4158 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
                this.generatedCodeInfo_ = null;
                C4174 c4174 = this.generatedCodeInfoBuilder_;
                if (c4174 != null) {
                    c4174.f11316 = null;
                    this.generatedCodeInfoBuilder_ = null;
                }
                return this;
            }

            public C4158 clearContent() {
                this.content_ = File.getDefaultInstance().getContent();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public C4158 clearGeneratedCodeInfo() {
                this.bitField0_ &= -9;
                this.generatedCodeInfo_ = null;
                C4174 c4174 = this.generatedCodeInfoBuilder_;
                if (c4174 != null) {
                    c4174.f11316 = null;
                    this.generatedCodeInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public C4158 clearInsertionPoint() {
                this.insertionPoint_ = File.getDefaultInstance().getInsertionPoint();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public C4158 clearName() {
                this.name_ = File.getDefaultInstance().getName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // p278.InterfaceC9080
            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.content_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // p278.InterfaceC9080
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC9078.f23187;
            }

            @Override // p278.InterfaceC9080
            public DescriptorProtos$GeneratedCodeInfo getGeneratedCodeInfo() {
                C4174 c4174 = this.generatedCodeInfoBuilder_;
                if (c4174 != null) {
                    return (DescriptorProtos$GeneratedCodeInfo) c4174.m7939();
                }
                DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
                return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
            }

            public DescriptorProtos$GeneratedCodeInfo.C4116 getGeneratedCodeInfoBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DescriptorProtos$GeneratedCodeInfo.C4116) internalGetGeneratedCodeInfoFieldBuilder().m7940();
            }

            @Override // p278.InterfaceC9080
            public InterfaceC4312 getGeneratedCodeInfoOrBuilder() {
                C4174 c4174 = this.generatedCodeInfoBuilder_;
                if (c4174 != null) {
                    return (InterfaceC4312) c4174.m7938();
                }
                DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
                return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
            }

            @Override // p278.InterfaceC9080
            public String getInsertionPoint() {
                Object obj = this.insertionPoint_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.insertionPoint_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // p278.InterfaceC9080
            public ByteString getInsertionPointBytes() {
                Object obj = this.insertionPoint_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.insertionPoint_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // p278.InterfaceC9080
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

            @Override // p278.InterfaceC9080
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // p278.InterfaceC9080
            public boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p278.InterfaceC9080
            public boolean hasGeneratedCodeInfo() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // p278.InterfaceC9080
            public boolean hasInsertionPoint() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p278.InterfaceC9080
            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC9078.f23186;
                c4451.m8386(File.class, C4158.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4158 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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
                                    this.insertionPoint_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 2;
                                } else if (iMo8264 == 122) {
                                    this.content_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 4;
                                } else if (iMo8264 == 130) {
                                    abstractC4306.mo8275(internalGetGeneratedCodeInfoFieldBuilder().m7940(), c4529);
                                    this.bitField0_ |= 8;
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

            public C4158 mergeGeneratedCodeInfo(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
                DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo2;
                C4174 c4174 = this.generatedCodeInfoBuilder_;
                if (c4174 != null) {
                    c4174.m7945(descriptorProtos$GeneratedCodeInfo);
                } else if ((this.bitField0_ & 8) == 0 || (descriptorProtos$GeneratedCodeInfo2 = this.generatedCodeInfo_) == null || descriptorProtos$GeneratedCodeInfo2 == DescriptorProtos$GeneratedCodeInfo.getDefaultInstance()) {
                    this.generatedCodeInfo_ = descriptorProtos$GeneratedCodeInfo;
                } else {
                    getGeneratedCodeInfoBuilder().mergeFrom(descriptorProtos$GeneratedCodeInfo);
                }
                if (this.generatedCodeInfo_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public C4158 setContent(String str) {
                str.getClass();
                this.content_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4158 setContentBytes(ByteString byteString) {
                byteString.getClass();
                this.content_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4158 setGeneratedCodeInfo(DescriptorProtos$GeneratedCodeInfo.C4116 c4116) {
                C4174 c4174 = this.generatedCodeInfoBuilder_;
                if (c4174 == null) {
                    this.generatedCodeInfo_ = c4116.build();
                } else {
                    c4174.m7946(c4116.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C4158 setInsertionPoint(String str) {
                str.getClass();
                this.insertionPoint_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4158 setInsertionPointBytes(ByteString byteString) {
                byteString.getClass();
                this.insertionPoint_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4158 setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C4158 setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public File getDefaultInstanceForType() {
                return File.getDefaultInstance();
            }

            private C4158(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
                maybeForceBuilderInitialization();
            }

            public C4158 setGeneratedCodeInfo(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
                C4174 c4174 = this.generatedCodeInfoBuilder_;
                if (c4174 == null) {
                    descriptorProtos$GeneratedCodeInfo.getClass();
                    this.generatedCodeInfo_ = descriptorProtos$GeneratedCodeInfo;
                } else {
                    c4174.m7946(descriptorProtos$GeneratedCodeInfo);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4158 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof File) {
                    return mergeFrom((File) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            public C4158 mergeFrom(File file) {
                if (file == File.getDefaultInstance()) {
                    return this;
                }
                if (file.hasName()) {
                    this.name_ = file.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (file.hasInsertionPoint()) {
                    this.insertionPoint_ = file.insertionPoint_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (file.hasContent()) {
                    this.content_ = file.content_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (file.hasGeneratedCodeInfo()) {
                    mergeGeneratedCodeInfo(file.getGeneratedCodeInfo());
                }
                mergeUnknownFields(file.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public File getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static File parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (File) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4158 newBuilderForType() {
            return newBuilder();
        }

        public static C4158 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static File parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (File) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static File parseFrom(ByteString byteString) {
            return (File) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static File parseFrom(ByteString byteString, C4529 c4529) {
            return (File) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        private File(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
            this.name_ = "";
            this.insertionPoint_ = "";
            this.content_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static File parseFrom(byte[] bArr) {
            return (File) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static File parseFrom(byte[] bArr, C4529 c4529) {
            return (File) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static File parseFrom(InputStream inputStream) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static File parseFrom(InputStream inputStream, C4529 c4529) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static File parseFrom(AbstractC4306 abstractC4306) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static File parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4159 extends GeneratedMessage.AbstractC4137 implements InterfaceC4162 {
        private int bitField0_;
        private Object error_;
        private C4195 fileBuilder_;
        private List<File> file_;
        private int maximumEdition_;
        private int minimumEdition_;
        private long supportedFeatures_;

        private C4159() {
            this.error_ = "";
            this.file_ = Collections.EMPTY_LIST;
        }

        private void buildPartial0(PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                pluginProtos$CodeGeneratorResponse.error_ = this.error_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                pluginProtos$CodeGeneratorResponse.supportedFeatures_ = this.supportedFeatures_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                pluginProtos$CodeGeneratorResponse.minimumEdition_ = this.minimumEdition_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                pluginProtos$CodeGeneratorResponse.maximumEdition_ = this.maximumEdition_;
                i |= 8;
            }
            PluginProtos$CodeGeneratorResponse.access$4576(pluginProtos$CodeGeneratorResponse, i);
        }

        private void buildPartialRepeatedFields(PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                pluginProtos$CodeGeneratorResponse.file_ = c4195.m8031();
                return;
            }
            if ((this.bitField0_ & 16) != 0) {
                this.file_ = Collections.unmodifiableList(this.file_);
                this.bitField0_ &= -17;
            }
            pluginProtos$CodeGeneratorResponse.file_ = this.file_;
        }

        private void ensureFileIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.file_ = new ArrayList(this.file_);
                this.bitField0_ |= 16;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC9078.f23181;
        }

        private C4195 internalGetFileFieldBuilder() {
            if (this.fileBuilder_ == null) {
                this.fileBuilder_ = new C4195(this.file_, getParentForChildren(), isClean());
                this.file_ = null;
            }
            return this.fileBuilder_;
        }

        public C4159 addAllFile(Iterable<? extends File> iterable) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureFileIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.file_);
            onChanged();
            return this;
        }

        public C4159 addFile(File.C4158 c4158) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4158.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.add(c4158.build());
            onChanged();
            return this;
        }

        public File.C4158 addFileBuilder() {
            return (File.C4158) internalGetFileFieldBuilder().m8019(File.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public PluginProtos$CodeGeneratorResponse build() {
            PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponseBuildPartial = buildPartial();
            if (pluginProtos$CodeGeneratorResponseBuildPartial.isInitialized()) {
                return pluginProtos$CodeGeneratorResponseBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) pluginProtos$CodeGeneratorResponseBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public PluginProtos$CodeGeneratorResponse buildPartial() {
            PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse = new PluginProtos$CodeGeneratorResponse(this);
            buildPartialRepeatedFields(pluginProtos$CodeGeneratorResponse);
            if (this.bitField0_ != 0) {
                buildPartial0(pluginProtos$CodeGeneratorResponse);
            }
            onBuilt();
            return pluginProtos$CodeGeneratorResponse;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4159 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.error_ = "";
            this.supportedFeatures_ = 0L;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                this.file_ = Collections.EMPTY_LIST;
            } else {
                this.file_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -17;
            return this;
        }

        public C4159 clearError() {
            this.error_ = PluginProtos$CodeGeneratorResponse.getDefaultInstance().getError();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4159 clearFile() {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.file_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public C4159 clearMaximumEdition() {
            this.bitField0_ &= -9;
            this.maximumEdition_ = 0;
            onChanged();
            return this;
        }

        public C4159 clearMinimumEdition() {
            this.bitField0_ &= -5;
            this.minimumEdition_ = 0;
            onChanged();
            return this;
        }

        public C4159 clearSupportedFeatures() {
            this.bitField0_ &= -3;
            this.supportedFeatures_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC9078.f23181;
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public String getError() {
            Object obj = this.error_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.error_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public ByteString getErrorBytes() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public File getFile(int i) {
            C4195 c4195 = this.fileBuilder_;
            return c4195 == null ? this.file_.get(i) : (File) c4195.m8025(i, false);
        }

        public File.C4158 getFileBuilder(int i) {
            return (File.C4158) internalGetFileFieldBuilder().m8032(i);
        }

        public List<File.C4158> getFileBuilderList() {
            return internalGetFileFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public int getFileCount() {
            C4195 c4195 = this.fileBuilder_;
            return c4195 == null ? this.file_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public List<File> getFileList() {
            C4195 c4195 = this.fileBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.file_) : c4195.m8024();
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public InterfaceC9080 getFileOrBuilder(int i) {
            C4195 c4195 = this.fileBuilder_;
            return c4195 == null ? this.file_.get(i) : (InterfaceC9080) c4195.m8028(i);
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public List<? extends InterfaceC9080> getFileOrBuilderList() {
            C4195 c4195 = this.fileBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.file_);
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public int getMaximumEdition() {
            return this.maximumEdition_;
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public int getMinimumEdition() {
            return this.minimumEdition_;
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public long getSupportedFeatures() {
            return this.supportedFeatures_;
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public boolean hasMaximumEdition() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public boolean hasMinimumEdition() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.compiler.InterfaceC4162
        public boolean hasSupportedFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC9078.f23180;
            c4451.m8386(PluginProtos$CodeGeneratorResponse.class, C4159.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4159 mergeFrom(PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse) {
            if (pluginProtos$CodeGeneratorResponse == PluginProtos$CodeGeneratorResponse.getDefaultInstance()) {
                return this;
            }
            if (pluginProtos$CodeGeneratorResponse.hasError()) {
                this.error_ = pluginProtos$CodeGeneratorResponse.error_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (pluginProtos$CodeGeneratorResponse.hasSupportedFeatures()) {
                setSupportedFeatures(pluginProtos$CodeGeneratorResponse.getSupportedFeatures());
            }
            if (pluginProtos$CodeGeneratorResponse.hasMinimumEdition()) {
                setMinimumEdition(pluginProtos$CodeGeneratorResponse.getMinimumEdition());
            }
            if (pluginProtos$CodeGeneratorResponse.hasMaximumEdition()) {
                setMaximumEdition(pluginProtos$CodeGeneratorResponse.getMaximumEdition());
            }
            if (this.fileBuilder_ == null) {
                if (!pluginProtos$CodeGeneratorResponse.file_.isEmpty()) {
                    if (this.file_.isEmpty()) {
                        this.file_ = pluginProtos$CodeGeneratorResponse.file_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureFileIsMutable();
                        this.file_.addAll(pluginProtos$CodeGeneratorResponse.file_);
                    }
                    onChanged();
                }
            } else if (!pluginProtos$CodeGeneratorResponse.file_.isEmpty()) {
                boolean zIsEmpty = this.fileBuilder_.f11357.isEmpty();
                C4195 c4195 = this.fileBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.fileBuilder_ = null;
                    this.file_ = pluginProtos$CodeGeneratorResponse.file_;
                    this.bitField0_ &= -17;
                    this.fileBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFileFieldBuilder() : null;
                } else {
                    c4195.m8021(pluginProtos$CodeGeneratorResponse.file_);
                }
            }
            mergeUnknownFields(pluginProtos$CodeGeneratorResponse.getUnknownFields());
            onChanged();
            return this;
        }

        public C4159 removeFile(int i) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureFileIsMutable();
            this.file_.remove(i);
            onChanged();
            return this;
        }

        public C4159 setError(String str) {
            str.getClass();
            this.error_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4159 setErrorBytes(ByteString byteString) {
            byteString.getClass();
            this.error_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4159 setFile(int i, File.C4158 c4158) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4158.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.set(i, c4158.build());
            onChanged();
            return this;
        }

        public C4159 setMaximumEdition(int i) {
            this.maximumEdition_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4159 setMinimumEdition(int i) {
            this.minimumEdition_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4159 setSupportedFeatures(long j) {
            this.supportedFeatures_ = j;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public PluginProtos$CodeGeneratorResponse getDefaultInstanceForType() {
            return PluginProtos$CodeGeneratorResponse.getDefaultInstance();
        }

        private C4159(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.error_ = "";
            this.file_ = Collections.EMPTY_LIST;
        }

        public File.C4158 addFileBuilder(int i) {
            return (File.C4158) internalGetFileFieldBuilder().m8020(i, File.getDefaultInstance());
        }

        public C4159 addFile(int i, File file) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                file.getClass();
                ensureFileIsMutable();
                this.file_.add(i, file);
                onChanged();
                return this;
            }
            c4195.m8018(i, file);
            return this;
        }

        public C4159 setFile(int i, File file) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                file.getClass();
                ensureFileIsMutable();
                this.file_.set(i, file);
                onChanged();
                return this;
            }
            c4195.m8022(i, file);
            return this;
        }

        public C4159 addFile(File file) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                file.getClass();
                ensureFileIsMutable();
                this.file_.add(file);
                onChanged();
                return this;
            }
            c4195.m8017(file);
            return this;
        }

        public C4159 addFile(int i, File.C4158 c4158) {
            C4195 c4195 = this.fileBuilder_;
            if (c4195 == null) {
                ensureFileIsMutable();
                this.file_.add(i, c4158.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4158.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4159 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof PluginProtos$CodeGeneratorResponse) {
                return mergeFrom((PluginProtos$CodeGeneratorResponse) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4159 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.error_ = abstractC4306.mo8278();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 16) {
                                this.supportedFeatures_ = abstractC4306.mo8262();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 == 24) {
                                this.minimumEdition_ = abstractC4306.mo8276();
                                this.bitField0_ |= 4;
                            } else if (iMo8264 == 32) {
                                this.maximumEdition_ = abstractC4306.mo8276();
                                this.bitField0_ |= 8;
                            } else if (iMo8264 != 122) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                File file = (File) abstractC4306.mo8274(File.parser(), c4529);
                                C4195 c4195 = this.fileBuilder_;
                                if (c4195 == null) {
                                    ensureFileIsMutable();
                                    this.file_.add(file);
                                } else {
                                    c4195.m8017(file);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public PluginProtos$CodeGeneratorResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static PluginProtos$CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4159 newBuilderForType() {
        return newBuilder();
    }

    public static C4159 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteString byteString) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteString byteString, C4529 c4529) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Feature implements InterfaceC4213 {
        FEATURE_NONE(0),
        FEATURE_PROTO3_OPTIONAL(1),
        FEATURE_SUPPORTS_EDITIONS(2);

        public static final int FEATURE_NONE_VALUE = 0;
        public static final int FEATURE_PROTO3_OPTIONAL_VALUE = 1;
        public static final int FEATURE_SUPPORTS_EDITIONS_VALUE = 2;
        private static final Feature[] VALUES;
        private static final InterfaceC4230 internalValueMap;
        private final int value;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Feature");
            internalValueMap = new C4164();
            VALUES = values();
        }

        Feature(int i) {
            this.value = i;
        }

        public static Feature forNumber(int i) {
            if (i == 0) {
                return FEATURE_NONE;
            }
            if (i == 1) {
                return FEATURE_PROTO3_OPTIONAL;
            }
            if (i != 2) {
                return null;
            }
            return FEATURE_SUPPORTS_EDITIONS;
        }

        public static C4498 getDescriptor() {
            return PluginProtos$CodeGeneratorResponse.getDescriptor().f11722[0];
        }

        public static InterfaceC4230 internalGetValueMap() {
            return internalValueMap;
        }

        public static Feature valueOf(C4496 c4496) {
            if (c4496.f11729 == getDescriptor()) {
                return VALUES[c4496.f11730];
            }
            C6755.m11869("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C4498 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC4231
        public final int getNumber() {
            return this.value;
        }

        public final C4496 getValueDescriptor() {
            C4498 descriptor = getDescriptor();
            return descriptor.f11739[ordinal()];
        }

        @Deprecated
        public static Feature valueOf(int i) {
            return forNumber(i);
        }
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(byte[] bArr) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    private PluginProtos$CodeGeneratorResponse(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.error_ = "";
        this.supportedFeatures_ = 0L;
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(byte[] bArr, C4529 c4529) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(InputStream inputStream, C4529 c4529) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(AbstractC4306 abstractC4306) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
