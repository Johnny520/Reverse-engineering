package com.google.protobuf.compiler;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3345;
import com.google.protobuf.AbstractC3401;
import com.google.protobuf.AbstractC3461;
import com.google.protobuf.AbstractC3473;
import com.google.protobuf.AbstractC3527;
import com.google.protobuf.AbstractC3529;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3341;
import com.google.protobuf.C3362;
import com.google.protobuf.C3618;
import com.google.protobuf.C3662;
import com.google.protobuf.C3663;
import com.google.protobuf.C3665;
import com.google.protobuf.C3696;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC3374;
import com.google.protobuf.InterfaceC3380;
import com.google.protobuf.InterfaceC3397;
import com.google.protobuf.InterfaceC3452;
import com.google.protobuf.InterfaceC3479;
import com.google.protobuf.InterfaceC3531;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p262.AbstractC8248;
import p262.InterfaceC8250;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos$CodeGeneratorResponse extends GeneratedMessage implements InterfaceC3329 {
    private static final PluginProtos$CodeGeneratorResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    public static final int FILE_FIELD_NUMBER = 15;
    public static final int MAXIMUM_EDITION_FIELD_NUMBER = 4;
    public static final int MINIMUM_EDITION_FIELD_NUMBER = 3;
    private static final InterfaceC3374 PARSER;
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
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "CodeGeneratorResponse");
        DEFAULT_INSTANCE = new PluginProtos$CodeGeneratorResponse();
        PARSER = new C3332();
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

    public static final C3662 getDescriptor() {
        return AbstractC8248.f22837;
    }

    public static C3326 newBuilder(PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pluginProtos$CodeGeneratorResponse);
    }

    public static PluginProtos$CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC8248.f22837;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
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

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public ByteString getErrorBytes() {
        Object obj = this.error_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.error_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public File getFile(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public int getFileCount() {
        return this.file_.size();
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public List<File> getFileList() {
        return this.file_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public InterfaceC8250 getFileOrBuilder(int i) {
        return this.file_.get(i);
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public List<? extends InterfaceC8250> getFileOrBuilderList() {
        return this.file_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public int getMaximumEdition() {
        return this.maximumEdition_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public int getMinimumEdition() {
        return this.minimumEdition_;
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
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.error_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += AbstractC3461.m7650(2, this.supportedFeatures_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC3461.m7644(3, this.minimumEdition_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC3461.m7644(4, this.maximumEdition_);
        }
        int size = this.file_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3461.m7656(this.file_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public long getSupportedFeatures() {
        return this.supportedFeatures_;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public boolean hasError() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public boolean hasMaximumEdition() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public boolean hasMinimumEdition() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.compiler.InterfaceC3329
    public boolean hasSupportedFeatures() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasError()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getError().hashCode();
        }
        if (hasSupportedFeatures()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + AbstractC3401.m7515(getSupportedFeatures());
        }
        if (hasMinimumEdition()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getMinimumEdition();
        }
        if (hasMaximumEdition()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + getMaximumEdition();
        }
        if (getFileCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 15, 53) + getFileList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC8248.f22836;
        c3618.m7840(PluginProtos$CodeGeneratorResponse.class, C3326.class);
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
    public C3326 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3326(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3326 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3326() : new C3326().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 1, this.error_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC3461.mo7661(2, this.supportedFeatures_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7664(3, this.minimumEdition_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3461.mo7664(4, this.maximumEdition_);
        }
        for (int i = 0; i < this.file_.size(); i++) {
            abstractC3461.mo7662(15, this.file_.get(i));
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class File extends GeneratedMessage implements InterfaceC8250 {
        public static final int CONTENT_FIELD_NUMBER = 15;
        private static final File DEFAULT_INSTANCE;
        public static final int GENERATED_CODE_INFO_FIELD_NUMBER = 16;
        public static final int INSERTION_POINT_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final InterfaceC3374 PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object content_;
        private DescriptorProtos$GeneratedCodeInfo generatedCodeInfo_;
        private volatile Object insertionPoint_;
        private byte memoizedIsInitialized;
        private volatile Object name_;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "File");
            DEFAULT_INSTANCE = new File();
            PARSER = new C3330();
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

        public static final C3662 getDescriptor() {
            return AbstractC8248.f22843;
        }

        public static C3325 newBuilder(File file) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(file);
        }

        public static File parseDelimitedFrom(InputStream inputStream) {
            return (File) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static File parseFrom(ByteBuffer byteBuffer) {
            return (File) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

        @Override // p262.InterfaceC8250
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

        @Override // p262.InterfaceC8250
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC8248.f22843;
        }

        @Override // p262.InterfaceC8250
        public DescriptorProtos$GeneratedCodeInfo getGeneratedCodeInfo() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
            return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
        }

        @Override // p262.InterfaceC8250
        public InterfaceC3479 getGeneratedCodeInfoOrBuilder() {
            DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
            return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
        }

        @Override // p262.InterfaceC8250
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

        @Override // p262.InterfaceC8250
        public ByteString getInsertionPointBytes() {
            Object obj = this.insertionPoint_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.insertionPoint_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // p262.InterfaceC8250
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

        @Override // p262.InterfaceC8250
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
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
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.insertionPoint_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(15, this.content_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += AbstractC3461.m7652(16, getGeneratedCodeInfo());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // p262.InterfaceC8250
        public boolean hasContent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p262.InterfaceC8250
        public boolean hasGeneratedCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p262.InterfaceC8250
        public boolean hasInsertionPoint() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p262.InterfaceC8250
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            if (hasInsertionPoint()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getInsertionPoint().hashCode();
            }
            if (hasContent()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 15, 53) + getContent().hashCode();
            }
            if (hasGeneratedCodeInfo()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 16, 53) + getGeneratedCodeInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC8248.f22842;
            c3618.m7840(File.class, C3325.class);
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
        public C3325 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3325(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3325 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3325() : new C3325().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC3461, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC3461, 2, this.insertionPoint_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(abstractC3461, 15, this.content_);
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC3461.mo7662(16, getGeneratedCodeInfo());
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3325 extends GeneratedMessage.AbstractC3304 implements InterfaceC8250 {
            private int bitField0_;
            private Object content_;
            private C3341 generatedCodeInfoBuilder_;
            private DescriptorProtos$GeneratedCodeInfo generatedCodeInfo_;
            private Object insertionPoint_;
            private Object name_;

            private C3325() {
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
                    C3341 c3341 = this.generatedCodeInfoBuilder_;
                    file.generatedCodeInfo_ = c3341 == null ? this.generatedCodeInfo_ : (DescriptorProtos$GeneratedCodeInfo) c3341.m7397();
                    i |= 8;
                }
                File.access$3676(file, i);
            }

            public static final C3662 getDescriptor() {
                return AbstractC8248.f22843;
            }

            private C3341 internalGetGeneratedCodeInfoFieldBuilder() {
                if (this.generatedCodeInfoBuilder_ == null) {
                    this.generatedCodeInfoBuilder_ = new C3341(getGeneratedCodeInfo(), getParentForChildren(), isClean());
                    this.generatedCodeInfo_ = null;
                }
                return this.generatedCodeInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetGeneratedCodeInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public File build() {
                File fileBuildPartial = buildPartial();
                if (fileBuildPartial.isInitialized()) {
                    return fileBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) fileBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public File buildPartial() {
                File file = new File(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(file);
                }
                onBuilt();
                return file;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3325 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
                this.generatedCodeInfo_ = null;
                C3341 c3341 = this.generatedCodeInfoBuilder_;
                if (c3341 != null) {
                    c3341.f10966 = null;
                    this.generatedCodeInfoBuilder_ = null;
                }
                return this;
            }

            public C3325 clearContent() {
                this.content_ = File.getDefaultInstance().getContent();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public C3325 clearGeneratedCodeInfo() {
                this.bitField0_ &= -9;
                this.generatedCodeInfo_ = null;
                C3341 c3341 = this.generatedCodeInfoBuilder_;
                if (c3341 != null) {
                    c3341.f10966 = null;
                    this.generatedCodeInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public C3325 clearInsertionPoint() {
                this.insertionPoint_ = File.getDefaultInstance().getInsertionPoint();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public C3325 clearName() {
                this.name_ = File.getDefaultInstance().getName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // p262.InterfaceC8250
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

            @Override // p262.InterfaceC8250
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC8248.f22843;
            }

            @Override // p262.InterfaceC8250
            public DescriptorProtos$GeneratedCodeInfo getGeneratedCodeInfo() {
                C3341 c3341 = this.generatedCodeInfoBuilder_;
                if (c3341 != null) {
                    return (DescriptorProtos$GeneratedCodeInfo) c3341.m7393();
                }
                DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
                return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
            }

            public DescriptorProtos$GeneratedCodeInfo.C3283 getGeneratedCodeInfoBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DescriptorProtos$GeneratedCodeInfo.C3283) internalGetGeneratedCodeInfoFieldBuilder().m7394();
            }

            @Override // p262.InterfaceC8250
            public InterfaceC3479 getGeneratedCodeInfoOrBuilder() {
                C3341 c3341 = this.generatedCodeInfoBuilder_;
                if (c3341 != null) {
                    return (InterfaceC3479) c3341.m7392();
                }
                DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = this.generatedCodeInfo_;
                return descriptorProtos$GeneratedCodeInfo == null ? DescriptorProtos$GeneratedCodeInfo.getDefaultInstance() : descriptorProtos$GeneratedCodeInfo;
            }

            @Override // p262.InterfaceC8250
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

            @Override // p262.InterfaceC8250
            public ByteString getInsertionPointBytes() {
                Object obj = this.insertionPoint_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.insertionPoint_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // p262.InterfaceC8250
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

            @Override // p262.InterfaceC8250
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // p262.InterfaceC8250
            public boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p262.InterfaceC8250
            public boolean hasGeneratedCodeInfo() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // p262.InterfaceC8250
            public boolean hasInsertionPoint() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p262.InterfaceC8250
            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC8248.f22842;
                c3618.m7840(File.class, C3325.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3325 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
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
                                    this.insertionPoint_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 2;
                                } else if (iMo7718 == 122) {
                                    this.content_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 4;
                                } else if (iMo7718 == 130) {
                                    abstractC3473.mo7729(internalGetGeneratedCodeInfoFieldBuilder().m7394(), c3696);
                                    this.bitField0_ |= 8;
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

            public C3325 mergeGeneratedCodeInfo(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
                DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo2;
                C3341 c3341 = this.generatedCodeInfoBuilder_;
                if (c3341 != null) {
                    c3341.m7399(descriptorProtos$GeneratedCodeInfo);
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

            public C3325 setContent(String str) {
                str.getClass();
                this.content_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3325 setContentBytes(ByteString byteString) {
                byteString.getClass();
                this.content_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3325 setGeneratedCodeInfo(DescriptorProtos$GeneratedCodeInfo.C3283 c3283) {
                C3341 c3341 = this.generatedCodeInfoBuilder_;
                if (c3341 == null) {
                    this.generatedCodeInfo_ = c3283.build();
                } else {
                    c3341.m7400(c3283.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C3325 setInsertionPoint(String str) {
                str.getClass();
                this.insertionPoint_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3325 setInsertionPointBytes(ByteString byteString) {
                byteString.getClass();
                this.insertionPoint_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3325 setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3325 setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public File getDefaultInstanceForType() {
                return File.getDefaultInstance();
            }

            private C3325(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
                maybeForceBuilderInitialization();
            }

            public C3325 setGeneratedCodeInfo(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
                C3341 c3341 = this.generatedCodeInfoBuilder_;
                if (c3341 == null) {
                    descriptorProtos$GeneratedCodeInfo.getClass();
                    this.generatedCodeInfo_ = descriptorProtos$GeneratedCodeInfo;
                } else {
                    c3341.m7400(descriptorProtos$GeneratedCodeInfo);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3325 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof File) {
                    return mergeFrom((File) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            public C3325 mergeFrom(File file) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public File getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static File parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (File) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3325 newBuilderForType() {
            return newBuilder();
        }

        public static C3325 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static File parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (File) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static File parseFrom(ByteString byteString) {
            return (File) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static File parseFrom(ByteString byteString, C3696 c3696) {
            return (File) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        private File(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
            this.name_ = "";
            this.insertionPoint_ = "";
            this.content_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static File parseFrom(byte[] bArr) {
            return (File) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static File parseFrom(byte[] bArr, C3696 c3696) {
            return (File) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static File parseFrom(InputStream inputStream) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static File parseFrom(InputStream inputStream, C3696 c3696) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static File parseFrom(AbstractC3473 abstractC3473) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static File parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (File) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3326 extends GeneratedMessage.AbstractC3304 implements InterfaceC3329 {
        private int bitField0_;
        private Object error_;
        private C3362 fileBuilder_;
        private List<File> file_;
        private int maximumEdition_;
        private int minimumEdition_;
        private long supportedFeatures_;

        private C3326() {
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
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                pluginProtos$CodeGeneratorResponse.file_ = c3362.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC8248.f22837;
        }

        private C3362 internalGetFileFieldBuilder() {
            if (this.fileBuilder_ == null) {
                this.fileBuilder_ = new C3362(this.file_, getParentForChildren(), isClean());
                this.file_ = null;
            }
            return this.fileBuilder_;
        }

        public C3326 addAllFile(Iterable<? extends File> iterable) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureFileIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.file_);
            onChanged();
            return this;
        }

        public C3326 addFile(File.C3325 c3325) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3325.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.add(c3325.build());
            onChanged();
            return this;
        }

        public File.C3325 addFileBuilder() {
            return (File.C3325) internalGetFileFieldBuilder().m7473(File.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public PluginProtos$CodeGeneratorResponse build() {
            PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponseBuildPartial = buildPartial();
            if (pluginProtos$CodeGeneratorResponseBuildPartial.isInitialized()) {
                return pluginProtos$CodeGeneratorResponseBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) pluginProtos$CodeGeneratorResponseBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public PluginProtos$CodeGeneratorResponse buildPartial() {
            PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse = new PluginProtos$CodeGeneratorResponse(this);
            buildPartialRepeatedFields(pluginProtos$CodeGeneratorResponse);
            if (this.bitField0_ != 0) {
                buildPartial0(pluginProtos$CodeGeneratorResponse);
            }
            onBuilt();
            return pluginProtos$CodeGeneratorResponse;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3326 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.error_ = "";
            this.supportedFeatures_ = 0L;
            this.minimumEdition_ = 0;
            this.maximumEdition_ = 0;
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                this.file_ = Collections.EMPTY_LIST;
            } else {
                this.file_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -17;
            return this;
        }

        public C3326 clearError() {
            this.error_ = PluginProtos$CodeGeneratorResponse.getDefaultInstance().getError();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3326 clearFile() {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.file_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public C3326 clearMaximumEdition() {
            this.bitField0_ &= -9;
            this.maximumEdition_ = 0;
            onChanged();
            return this;
        }

        public C3326 clearMinimumEdition() {
            this.bitField0_ &= -5;
            this.minimumEdition_ = 0;
            onChanged();
            return this;
        }

        public C3326 clearSupportedFeatures() {
            this.bitField0_ &= -3;
            this.supportedFeatures_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC8248.f22837;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
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

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public ByteString getErrorBytes() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public File getFile(int i) {
            C3362 c3362 = this.fileBuilder_;
            return c3362 == null ? this.file_.get(i) : (File) c3362.m7479(i, false);
        }

        public File.C3325 getFileBuilder(int i) {
            return (File.C3325) internalGetFileFieldBuilder().m7486(i);
        }

        public List<File.C3325> getFileBuilderList() {
            return internalGetFileFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public int getFileCount() {
            C3362 c3362 = this.fileBuilder_;
            return c3362 == null ? this.file_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public List<File> getFileList() {
            C3362 c3362 = this.fileBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.file_) : c3362.m7478();
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public InterfaceC8250 getFileOrBuilder(int i) {
            C3362 c3362 = this.fileBuilder_;
            return c3362 == null ? this.file_.get(i) : (InterfaceC8250) c3362.m7482(i);
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public List<? extends InterfaceC8250> getFileOrBuilderList() {
            C3362 c3362 = this.fileBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.file_);
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public int getMaximumEdition() {
            return this.maximumEdition_;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public int getMinimumEdition() {
            return this.minimumEdition_;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public long getSupportedFeatures() {
            return this.supportedFeatures_;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public boolean hasMaximumEdition() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public boolean hasMinimumEdition() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.compiler.InterfaceC3329
        public boolean hasSupportedFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC8248.f22836;
            c3618.m7840(PluginProtos$CodeGeneratorResponse.class, C3326.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3326 mergeFrom(PluginProtos$CodeGeneratorResponse pluginProtos$CodeGeneratorResponse) {
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
                boolean zIsEmpty = this.fileBuilder_.f11007.isEmpty();
                C3362 c3362 = this.fileBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.fileBuilder_ = null;
                    this.file_ = pluginProtos$CodeGeneratorResponse.file_;
                    this.bitField0_ &= -17;
                    this.fileBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFileFieldBuilder() : null;
                } else {
                    c3362.m7475(pluginProtos$CodeGeneratorResponse.file_);
                }
            }
            mergeUnknownFields(pluginProtos$CodeGeneratorResponse.getUnknownFields());
            onChanged();
            return this;
        }

        public C3326 removeFile(int i) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureFileIsMutable();
            this.file_.remove(i);
            onChanged();
            return this;
        }

        public C3326 setError(String str) {
            str.getClass();
            this.error_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3326 setErrorBytes(ByteString byteString) {
            byteString.getClass();
            this.error_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3326 setFile(int i, File.C3325 c3325) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3325.build());
                return this;
            }
            ensureFileIsMutable();
            this.file_.set(i, c3325.build());
            onChanged();
            return this;
        }

        public C3326 setMaximumEdition(int i) {
            this.maximumEdition_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3326 setMinimumEdition(int i) {
            this.minimumEdition_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3326 setSupportedFeatures(long j) {
            this.supportedFeatures_ = j;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public PluginProtos$CodeGeneratorResponse getDefaultInstanceForType() {
            return PluginProtos$CodeGeneratorResponse.getDefaultInstance();
        }

        private C3326(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.error_ = "";
            this.file_ = Collections.EMPTY_LIST;
        }

        public File.C3325 addFileBuilder(int i) {
            return (File.C3325) internalGetFileFieldBuilder().m7474(i, File.getDefaultInstance());
        }

        public C3326 addFile(int i, File file) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                file.getClass();
                ensureFileIsMutable();
                this.file_.add(i, file);
                onChanged();
                return this;
            }
            c3362.m7472(i, file);
            return this;
        }

        public C3326 setFile(int i, File file) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                file.getClass();
                ensureFileIsMutable();
                this.file_.set(i, file);
                onChanged();
                return this;
            }
            c3362.m7476(i, file);
            return this;
        }

        public C3326 addFile(File file) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                file.getClass();
                ensureFileIsMutable();
                this.file_.add(file);
                onChanged();
                return this;
            }
            c3362.m7471(file);
            return this;
        }

        public C3326 addFile(int i, File.C3325 c3325) {
            C3362 c3362 = this.fileBuilder_;
            if (c3362 == null) {
                ensureFileIsMutable();
                this.file_.add(i, c3325.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3325.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3326 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof PluginProtos$CodeGeneratorResponse) {
                return mergeFrom((PluginProtos$CodeGeneratorResponse) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3326 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.error_ = abstractC3473.mo7732();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 16) {
                                this.supportedFeatures_ = abstractC3473.mo7716();
                                this.bitField0_ |= 2;
                            } else if (iMo7718 == 24) {
                                this.minimumEdition_ = abstractC3473.mo7730();
                                this.bitField0_ |= 4;
                            } else if (iMo7718 == 32) {
                                this.maximumEdition_ = abstractC3473.mo7730();
                                this.bitField0_ |= 8;
                            } else if (iMo7718 != 122) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                File file = (File) abstractC3473.mo7728(File.parser(), c3696);
                                C3362 c3362 = this.fileBuilder_;
                                if (c3362 == null) {
                                    ensureFileIsMutable();
                                    this.file_.add(file);
                                } else {
                                    c3362.m7471(file);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public PluginProtos$CodeGeneratorResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static PluginProtos$CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3326 newBuilderForType() {
        return newBuilder();
    }

    public static C3326 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteString byteString) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(ByteString byteString, C3696 c3696) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Feature implements InterfaceC3380 {
        FEATURE_NONE(0),
        FEATURE_PROTO3_OPTIONAL(1),
        FEATURE_SUPPORTS_EDITIONS(2);

        public static final int FEATURE_NONE_VALUE = 0;
        public static final int FEATURE_PROTO3_OPTIONAL_VALUE = 1;
        public static final int FEATURE_SUPPORTS_EDITIONS_VALUE = 2;
        private static final Feature[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Feature");
            internalValueMap = new C3331();
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

        public static C3665 getDescriptor() {
            return PluginProtos$CodeGeneratorResponse.getDescriptor().f11372[0];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static Feature valueOf(C3663 c3663) {
            if (c3663.f11379 == getDescriptor()) {
                return VALUES[c3663.f11380];
            }
            C5919.m11249("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final C3665 getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC3398
        public final int getNumber() {
            return this.value;
        }

        public final C3663 getValueDescriptor() {
            C3665 descriptor = getDescriptor();
            return descriptor.f11389[ordinal()];
        }

        @Deprecated
        public static Feature valueOf(int i) {
            return forNumber(i);
        }
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(byte[] bArr) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    private PluginProtos$CodeGeneratorResponse(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.error_ = "";
        this.supportedFeatures_ = 0L;
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(byte[] bArr, C3696 c3696) {
        return (PluginProtos$CodeGeneratorResponse) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(InputStream inputStream) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(InputStream inputStream, C3696 c3696) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(AbstractC3473 abstractC3473) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static PluginProtos$CodeGeneratorResponse parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (PluginProtos$CodeGeneratorResponse) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
