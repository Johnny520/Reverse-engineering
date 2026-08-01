package com.google.protobuf.compiler;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3346;
import com.google.protobuf.AbstractC3402;
import com.google.protobuf.AbstractC3462;
import com.google.protobuf.AbstractC3474;
import com.google.protobuf.AbstractC3528;
import com.google.protobuf.AbstractC3530;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3342;
import com.google.protobuf.C3363;
import com.google.protobuf.C3619;
import com.google.protobuf.C3663;
import com.google.protobuf.C3664;
import com.google.protobuf.C3666;
import com.google.protobuf.C3697;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC3375;
import com.google.protobuf.InterfaceC3381;
import com.google.protobuf.InterfaceC3398;
import com.google.protobuf.InterfaceC3453;
import com.google.protobuf.InterfaceC3480;
import com.google.protobuf.InterfaceC3532;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p262.AbstractC8249;
import p262.InterfaceC8251;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos$CodeGeneratorResponse extends GeneratedMessage implements InterfaceC3330 {
    private static final PluginProtos$CodeGeneratorResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    public static final int FILE_FIELD_NUMBER = 15;
    public static final int MAXIMUM_EDITION_FIELD_NUMBER = 4;
    public static final int MINIMUM_EDITION_FIELD_NUMBER = 3;
    private static final InterfaceC3375 PARSER;
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
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "CodeGeneratorResponse");
        DEFAULT_INSTANCE = new PluginProtos$CodeGeneratorResponse();
        PARSER = new C3333();
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

    public static final C3663 getDescriptor() {
        return AbstractC8249.f22836;
    }

    public static C3327 newBuilder(PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pluginProtos$CodeGeneratorResponse);
    }

    public static PluginProtos$CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC8249.f22836;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
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

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public ByteString getErrorBytes() {
        Object obj = this.error_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.error_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public File getFile(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public int getFileCount() {
        return this.file_.size();
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public List<File> getFileList() {
        return this.file_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public InterfaceC8251 getFileOrBuilder(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public List<? extends InterfaceC8251> getFileOrBuilderList() {
        return this.file_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public int getMaximumEdition() {
        return this.maximumEdition_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public int getMinimumEdition() {
        return this.minimumEdition_;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.error_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += AbstractC3462.m7637(2, this.supportedFeatures_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC3462.m7631(3, this.minimumEdition_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC3462.m7631(4, this.maximumEdition_);
        }
        int size = this.file_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3462.m7643(this.file_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public long getSupportedFeatures() {
        return this.supportedFeatures_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public boolean hasError() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public boolean hasMaximumEdition() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public boolean hasMinimumEdition() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3330
    public boolean hasSupportedFeatures() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasError()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getError().hashCode();
        }
        if (hasSupportedFeatures()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + AbstractC3402.m7502(getSupportedFeatures());
        }
        if (hasMinimumEdition()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getMinimumEdition();
        }
        if (hasMaximumEdition()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + getMaximumEdition();
        }
        if (getFileCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 15, 53) + getFileList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC8249.f22835;
        c3619.m7827(PluginProtos$CodeGeneratorResponse.class, C3327.class);
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
    public C3327 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3327(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3327 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3327() : new C3327().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 1, this.error_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3462.mo7648(2, this.supportedFeatures_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7651(3, this.minimumEdition_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3462.mo7651(4, this.maximumEdition_);
        }
        for (int i = 0; i < this.file_.size(); i++) {
            abstractC3462.mo7649(15, this.file_.get(i));
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class File extends GeneratedMessage implements InterfaceC8251 {
        public static final int CONTENT_FIELD_NUMBER = 15;
        private static final File DEFAULT_INSTANCE;
        public static final int GENERATED_CODE_INFO_FIELD_NUMBER = 16;
        public static final int INSERTION_POINT_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final InterfaceC3375 PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object content_;
        private DescriptorProtos$GeneratedCodeInfo generatedCodeInfo_;
        private volatile Object insertionPoint_;
        private byte memoizedIsInitialized;
        private volatile Object name_;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "File");
            DEFAULT_INSTANCE = new File();
            PARSER = new C3331();
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

        public static final C3663 getDescriptor() {
            return AbstractC8249.f22842;
        }

        public static C3326 newBuilder(File file) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(file);
        }

        public static File parseDelimitedFrom(InputStream inputStream) {
            return (File) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static File parseFrom(ByteBuffer byteBuffer) {
            return (File) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

        @Override // p262.InterfaceC8251
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

        @Override // p262.InterfaceC8251
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC8249.f22842;
        }

        @Override // p262.InterfaceC8251
        public DescriptorProtos$GeneratedCodeInfo getGeneratedCodeInfo() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
            return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
        }

        @Override // p262.InterfaceC8251
        public InterfaceC3480 getGeneratedCodeInfoOrBuilder() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
            return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
        }

        @Override // p262.InterfaceC8251
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

        @Override // p262.InterfaceC8251
        public ByteString getInsertionPointBytes() {
            Object obj = this.insertionPoint_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.insertionPoint_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // p262.InterfaceC8251
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

        @Override // p262.InterfaceC8251
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
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
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.insertionPoint_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(15, this.content_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += AbstractC3462.m7639(16, getGeneratedCodeInfo());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // p262.InterfaceC8251
        public boolean hasContent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p262.InterfaceC8251
        public boolean hasGeneratedCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p262.InterfaceC8251
        public boolean hasInsertionPoint() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p262.InterfaceC8251
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getName().hashCode();
            }
            if (hasInsertionPoint()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getInsertionPoint().hashCode();
            }
            if (hasContent()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 15, 53) + getContent().hashCode();
            }
            if (hasGeneratedCodeInfo()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 16, 53) + getGeneratedCodeInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC8249.f22841;
            c3619.m7827(File.class, C3326.class);
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
        public C3326 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3326(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3326 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3326() : new C3326().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC3462, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC3462, 2, this.insertionPoint_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(abstractC3462, 15, this.content_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC3462.mo7649(16, getGeneratedCodeInfo());
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3326 extends GeneratedMessage.AbstractC3305 implements InterfaceC8251 {
            private int bitField0_;
            private Object content_;
            private C3342 generatedCodeInfoBuilder_;
            private DescriptorProtos$GeneratedCodeInfo generatedCodeInfo_;
            private Object insertionPoint_;
            private Object name_;

            private C3326() {
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
                    C3342 c3342 = this.generatedCodeInfoBuilder_;
                    file.generatedCodeInfo_ = c3342 == null ? this.generatedCodeInfo_ : (DescriptorProtos$GeneratedCodeInfo) c3342.m7384();
                    i |= 8;
                }
                File.access$3676(file, i);
            }

            public static final C3663 getDescriptor() {
                return AbstractC8249.f22842;
            }

            private C3342 internalGetGeneratedCodeInfoFieldBuilder() {
                if (this.generatedCodeInfoBuilder_ == null) {
                    this.generatedCodeInfoBuilder_ = new C3342(getGeneratedCodeInfo(), getParentForChildren(), isClean());
                    this.generatedCodeInfo_ = null;
                }
                return this.generatedCodeInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetGeneratedCodeInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public File build() {
                File fileBuildPartial = buildPartial();
                if (fileBuildPartial.isInitialized()) {
                    return fileBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) fileBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public File buildPartial() {
                File file = new File(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(file);
                }
                onBuilt();
                return file;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3326 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
                this.generatedCodeInfo_ = null;
                C3342 c3342 = this.generatedCodeInfoBuilder_;
                if (c3342 != null) {
                    c3342.f10971 = null;
                    this.generatedCodeInfoBuilder_ = null;
                }
                return this;
            }

            public C3326 clearContent() {
                this.content_ = File.getDefaultInstance().getContent();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public C3326 clearGeneratedCodeInfo() {
                this.bitField0_ &= -9;
                this.generatedCodeInfo_ = null;
                C3342 c3342 = this.generatedCodeInfoBuilder_;
                if (c3342 != null) {
                    c3342.f10971 = null;
                    this.generatedCodeInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public C3326 clearInsertionPoint() {
                this.insertionPoint_ = File.getDefaultInstance().getInsertionPoint();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public C3326 clearName() {
                this.name_ = File.getDefaultInstance().getName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // p262.InterfaceC8251
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

            @Override // p262.InterfaceC8251
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC8249.f22842;
            }

            @Override // p262.InterfaceC8251
            public DescriptorProtos$GeneratedCodeInfo getGeneratedCodeInfo() {
                C3342 c3342 = this.generatedCodeInfoBuilder_;
                if (c3342 != null) {
                    return (DescriptorProtos$GeneratedCodeInfo) c3342.m7380();
                }
                DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
                return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
            }

            public DescriptorProtos$GeneratedCodeInfo.C3284 getGeneratedCodeInfoBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DescriptorProtos$GeneratedCodeInfo.C3284) internalGetGeneratedCodeInfoFieldBuilder().m7381();
            }

            @Override // p262.InterfaceC8251
            public InterfaceC3480 getGeneratedCodeInfoOrBuilder() {
                C3342 c3342 = this.generatedCodeInfoBuilder_;
                if (c3342 != null) {
                    return (InterfaceC3480) c3342.m7379();
                }
                DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
                return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
            }

            @Override // p262.InterfaceC8251
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

            @Override // p262.InterfaceC8251
            public ByteString getInsertionPointBytes() {
                Object obj = this.insertionPoint_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.insertionPoint_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // p262.InterfaceC8251
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

            @Override // p262.InterfaceC8251
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // p262.InterfaceC8251
            public boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p262.InterfaceC8251
            public boolean hasGeneratedCodeInfo() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // p262.InterfaceC8251
            public boolean hasInsertionPoint() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p262.InterfaceC8251
            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC8249.f22841;
                c3619.m7827(File.class, C3326.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3326 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 10) {
                                    this.name_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 1;
                                } else if (iMo7705 == 18) {
                                    this.insertionPoint_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 2;
                                } else if (iMo7705 == 122) {
                                    this.content_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 4;
                                } else if (iMo7705 == 130) {
                                    abstractC3474.mo7716(internalGetGeneratedCodeInfoFieldBuilder().m7381(), c3697);
                                    this.bitField0_ |= 8;
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

            public C3326 mergeGeneratedCodeInfo(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
                DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo2;
                C3342 c3342 = this.generatedCodeInfoBuilder_;
                if (c3342 != null) {
                    c3342.m7386(descriptorProtos$GeneratedCodeInfo);
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

            public C3326 setContent(String str) {
                str.getClass();
                this.content_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3326 setContentBytes(ByteString byteString) {
                byteString.getClass();
                this.content_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3326 setGeneratedCodeInfo(DescriptorProtos$GeneratedCodeInfo.C3284 c3284) {
                C3342 c3342 = this.generatedCodeInfoBuilder_;
                if (c3342 == null) {
                    this.generatedCodeInfo_ = c3284.build();
                } else {
                    c3342.m7387(c3284.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C3326 setInsertionPoint(String str) {
                str.getClass();
                this.insertionPoint_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3326 setInsertionPointBytes(ByteString byteString) {
                byteString.getClass();
                this.insertionPoint_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3326 setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3326 setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public File getDefaultInstanceForType() {
                return File.getDefaultInstance();
            }

            private C3326(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
                maybeForceBuilderInitialization();
            }

            public C3326 setGeneratedCodeInfo(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
                C3342 c3342 = this.generatedCodeInfoBuilder_;
                if (c3342 == null) {
                    descriptorProtos$GeneratedCodeInfo.getClass();
                    this.generatedCodeInfo_ = descriptorProtos$GeneratedCodeInfo;
                } else {
                    c3342.m7387(descriptorProtos$GeneratedCodeInfo);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3326 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof File) {
                    return mergeFrom((File) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            public C3326 mergeFrom(File file) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public File getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static File parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (File) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3326 newBuilderForType() {
            return newBuilder();
        }

        public static C3326 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static File parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (File) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static File parseFrom(ByteString byteString) {
            return (File) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static File parseFrom(ByteString byteString, C3697 c3697) {
            return (File) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        private File(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.name_ = "";
            this.insertionPoint_ = "";
            this.content_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static File parseFrom(byte[] bArr) {
            return (File) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static File parseFrom(byte[] bArr, C3697 c3697) {
            return (File) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static File parseFrom(InputStream inputStream) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static File parseFrom(InputStream inputStream, C3697 c3697) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static File parseFrom(AbstractC3474 abstractC3474) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static File parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3327 extends GeneratedMessage.AbstractC3305 implements InterfaceC3330 {
        private int bitField0_;
        private Object error_;
        private C3363 fileBuilder_;
        private List<File> file_;
        private int maximumEdition_;
        private int minimumEdition_;
        private long supportedFeatures_;

        private C3327() {
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
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                pluginProtos$CodeGeneratorResponse.file_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC8249.f22836;
        }

        private C3363 internalGetFileFieldBuilder() {
            if (this.fileBuilder_ == null) {
                this.fileBuilder_ = new C3363(this.file_, getParentForChildren(), isClean());
                this.file_ = null;
            }
            return this.fileBuilder_;
        }

        public C3327 addAllFile(Iterable<? extends File> iterable) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureFileIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.file_);
            onChanged();
            return this;
        }

        public C3327 addFile(File.C3326 c3326) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3326.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.add(c3326.build());
            onChanged();
            return this;
        }

        public File.C3326 addFileBuilder() {
            return (File.C3326) internalGetFileFieldBuilder().m7460(File.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public PluginProtos$CodeGeneratorResponse build() {
            PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponseBuildPartial = buildPartial();
            if (pluginProtos$CodeGeneratorResponseBuildPartial.isInitialized()) {
                return pluginProtos$CodeGeneratorResponseBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) pluginProtos$CodeGeneratorResponseBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public PluginProtos$CodeGeneratorResponse buildPartial() {
            PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse = new PluginProtos$CodeGeneratorResponse(this);
            buildPartialRepeatedFields(pluginProtos$CodeGeneratorResponse);
            if (this.bitField0_ != 0) {
                buildPartial0(pluginProtos$CodeGeneratorResponse);
            }
            onBuilt();
            return pluginProtos$CodeGeneratorResponse;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3327 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.error_ = "";
            this.supportedFeatures_ = 0L;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                this.file_ = Collections.EMPTY_LIST;
            } else {
                this.file_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -17;
            return this;
        }

        public C3327 clearError() {
            this.error_ = PluginProtos$CodeGeneratorResponse.getDefaultInstance().getError();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3327 clearFile() {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.file_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public C3327 clearMaximumEdition() {
            this.bitField0_ &= -9;
            this.maximumEdition_ = 0;
            onChanged();
            return this;
        }

        public C3327 clearMinimumEdition() {
            this.bitField0_ &= -5;
            this.minimumEdition_ = 0;
            onChanged();
            return this;
        }

        public C3327 clearSupportedFeatures() {
            this.bitField0_ &= -3;
            this.supportedFeatures_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC8249.f22836;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
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

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public ByteString getErrorBytes() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public File getFile(int i) {
            C3363 c3363 = this.fileBuilder_;
            return c3363 == null ? this.file_.get(i) : (File) c3363.m7466(i, false);
        }

        public File.C3326 getFileBuilder(int i) {
            return (File.C3326) internalGetFileFieldBuilder().m7473(i);
        }

        public List<File.C3326> getFileBuilderList() {
            return internalGetFileFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public int getFileCount() {
            C3363 c3363 = this.fileBuilder_;
            return c3363 == null ? this.file_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public List<File> getFileList() {
            C3363 c3363 = this.fileBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.file_) : c3363.m7465();
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public InterfaceC8251 getFileOrBuilder(int i) {
            C3363 c3363 = this.fileBuilder_;
            return c3363 == null ? this.file_.get(i) : (InterfaceC8251) c3363.m7469(i);
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public List<? extends InterfaceC8251> getFileOrBuilderList() {
            C3363 c3363 = this.fileBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.file_);
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public int getMaximumEdition() {
            return this.maximumEdition_;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public int getMinimumEdition() {
            return this.minimumEdition_;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public long getSupportedFeatures() {
            return this.supportedFeatures_;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public boolean hasMaximumEdition() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public boolean hasMinimumEdition() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3330
        public boolean hasSupportedFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC8249.f22835;
            c3619.m7827(PluginProtos$CodeGeneratorResponse.class, C3327.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3327 mergeFrom(PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse) {
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
                boolean zIsEmpty = this.fileBuilder_.f11012.isEmpty();
                C3363 c3363 = this.fileBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.fileBuilder_ = null;
                    this.file_ = pluginProtos$CodeGeneratorResponse.file_;
                    this.bitField0_ &= -17;
                    this.fileBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFileFieldBuilder() : null;
                } else {
                    c3363.m7462(pluginProtos$CodeGeneratorResponse.file_);
                }
            }
            mergeUnknownFields(pluginProtos$CodeGeneratorResponse.getUnknownFields());
            onChanged();
            return this;
        }

        public C3327 removeFile(int i) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureFileIsMutable();
            this.file_.remove(i);
            onChanged();
            return this;
        }

        public C3327 setError(String str) {
            str.getClass();
            this.error_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3327 setErrorBytes(ByteString byteString) {
            byteString.getClass();
            this.error_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3327 setFile(int i, File.C3326 c3326) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3326.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.set(i, c3326.build());
            onChanged();
            return this;
        }

        public C3327 setMaximumEdition(int i) {
            this.maximumEdition_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3327 setMinimumEdition(int i) {
            this.minimumEdition_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3327 setSupportedFeatures(long j) {
            this.supportedFeatures_ = j;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public PluginProtos$CodeGeneratorResponse getDefaultInstanceForType() {
            return PluginProtos$CodeGeneratorResponse.getDefaultInstance();
        }

        private C3327(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.error_ = "";
            this.file_ = Collections.EMPTY_LIST;
        }

        public File.C3326 addFileBuilder(int i) {
            return (File.C3326) internalGetFileFieldBuilder().m7461(i, File.getDefaultInstance());
        }

        public C3327 addFile(int i, File file) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                file.getClass();
                ensureFileIsMutable();
                this.file_.add(i, file);
                onChanged();
                return this;
            }
            c3363.m7459(i, file);
            return this;
        }

        public C3327 setFile(int i, File file) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                file.getClass();
                ensureFileIsMutable();
                this.file_.set(i, file);
                onChanged();
                return this;
            }
            c3363.m7463(i, file);
            return this;
        }

        public C3327 addFile(File file) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                file.getClass();
                ensureFileIsMutable();
                this.file_.add(file);
                onChanged();
                return this;
            }
            c3363.m7458(file);
            return this;
        }

        public C3327 addFile(int i, File.C3326 c3326) {
            C3363 c3363 = this.fileBuilder_;
            if (c3363 == null) {
                ensureFileIsMutable();
                this.file_.add(i, c3326.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3326.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3327 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof PluginProtos$CodeGeneratorResponse) {
                return mergeFrom((PluginProtos$CodeGeneratorResponse) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3327 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.error_ = abstractC3474.mo7719();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 16) {
                                this.supportedFeatures_ = abstractC3474.mo7703();
                                this.bitField0_ |= 2;
                            } else if (iMo7705 == 24) {
                                this.minimumEdition_ = abstractC3474.mo7717();
                                this.bitField0_ |= 4;
                            } else if (iMo7705 == 32) {
                                this.maximumEdition_ = abstractC3474.mo7717();
                                this.bitField0_ |= 8;
                            } else if (iMo7705 != 122) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                File file = (File) abstractC3474.mo7715(File.parser(), c3697);
                                C3363 c3363 = this.fileBuilder_;
                                if (c3363 == null) {
                                    ensureFileIsMutable();
                                    this.file_.add(file);
                                } else {
                                    c3363.m7458(file);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public PluginProtos$CodeGeneratorResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static PluginProtos$CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3327 newBuilderForType() {
        return newBuilder();
    }

    public static C3327 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteString byteString) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteString byteString, C3697 c3697) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Feature implements InterfaceC3381 {
        FEATURE_NONE(0),
        FEATURE_PROTO3_OPTIONAL(1),
        FEATURE_SUPPORTS_EDITIONS(2);

        public static final int FEATURE_NONE_VALUE = 0;
        public static final int FEATURE_PROTO3_OPTIONAL_VALUE = 1;
        public static final int FEATURE_SUPPORTS_EDITIONS_VALUE = 2;
        private static final Feature[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Feature");
            internalValueMap = new C3332();
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

        public static C3666 getDescriptor() {
            return PluginProtos$CodeGeneratorResponse.getDescriptor().f11377[0];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static Feature valueOf(C3664 c3664) {
            if (c3664.f11384 == getDescriptor()) {
                return VALUES[c3664.f11385];
            }
            C5925.m11310("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3666 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3399
        public final int getNumber() {
            return this.value;
        }

        public final C3664 getValueDescriptor() {
            C3666 descriptor = getDescriptor();
            return descriptor.f11394[ordinal()];
        }

        @Deprecated
        public static Feature valueOf(int i) {
            return forNumber(i);
        }
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(byte[] bArr) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    private PluginProtos$CodeGeneratorResponse(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.error_ = "";
        this.supportedFeatures_ = 0L;
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(byte[] bArr, C3697 c3697) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(InputStream inputStream, C3697 c3697) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(AbstractC3474 abstractC3474) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
