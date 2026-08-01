package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.jar.asm.Opcodes;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FileOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FileOptions> implements InterfaceC3495 {
    public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
    public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
    public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
    private static final DescriptorProtos$FileOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 23;
    public static final int FEATURES_FIELD_NUMBER = 50;
    public static final int GO_PACKAGE_FIELD_NUMBER = 11;
    public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
    public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
    public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
    public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
    public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
    public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
    public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
    public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
    private static final InterfaceC3375 PARSER;
    public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
    public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
    public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
    public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
    public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
    public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private boolean ccEnableArenas_;
    private boolean ccGenericServices_;
    private volatile Object csharpNamespace_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private volatile Object goPackage_;
    private boolean javaGenerateEqualsAndHash_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private volatile Object javaOuterClassname_;
    private volatile Object javaPackage_;
    private boolean javaStringCheckUtf8_;
    private byte memoizedIsInitialized;
    private volatile Object objcClassPrefix_;
    private int optimizeFor_;
    private volatile Object phpClassPrefix_;
    private volatile Object phpMetadataNamespace_;
    private volatile Object phpNamespace_;
    private boolean pyGenericServices_;
    private volatile Object rubyPackage_;
    private volatile Object swiftPrefix_;
    private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "FileOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$FileOptions();
        PARSER = new C3497();
    }

    private DescriptorProtos$FileOptions() {
        this.javaPackage_ = "";
        this.javaOuterClassname_ = "";
        this.javaMultipleFiles_ = false;
        this.javaGenerateEqualsAndHash_ = false;
        this.javaStringCheckUtf8_ = false;
        this.optimizeFor_ = 1;
        this.goPackage_ = "";
        this.ccGenericServices_ = false;
        this.javaGenericServices_ = false;
        this.pyGenericServices_ = false;
        this.deprecated_ = false;
        this.ccEnableArenas_ = true;
        this.objcClassPrefix_ = "";
        this.csharpNamespace_ = "";
        this.swiftPrefix_ = "";
        this.phpClassPrefix_ = "";
        this.phpNamespace_ = "";
        this.phpMetadataNamespace_ = "";
        this.rubyPackage_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.javaPackage_ = "";
        this.javaOuterClassname_ = "";
        this.optimizeFor_ = 1;
        this.goPackage_ = "";
        this.ccEnableArenas_ = true;
        this.objcClassPrefix_ = "";
        this.csharpNamespace_ = "";
        this.swiftPrefix_ = "";
        this.phpClassPrefix_ = "";
        this.phpNamespace_ = "";
        this.phpMetadataNamespace_ = "";
        this.rubyPackage_ = "";
        this.uninterpretedOption_ = Collections.EMPTY_LIST;
    }

    public static /* synthetic */ int access$18276(DescriptorProtos$FileOptions descriptorProtos$FileOptions, int i) {
        int i2 = i | descriptorProtos$FileOptions.bitField0_;
        descriptorProtos$FileOptions.bitField0_ = i2;
        return i2;
    }

    public static DescriptorProtos$FileOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11416;
    }

    public static C3282 newBuilder(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FileOptions);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$FileOptions)) {
            return super.equals(obj);
        }
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = (DescriptorProtos$FileOptions) obj;
        if (hasJavaPackage() != descriptorProtos$FileOptions.hasJavaPackage()) {
            return false;
        }
        if ((hasJavaPackage() && !getJavaPackage().equals(descriptorProtos$FileOptions.getJavaPackage())) || hasJavaOuterClassname() != descriptorProtos$FileOptions.hasJavaOuterClassname()) {
            return false;
        }
        if ((hasJavaOuterClassname() && !getJavaOuterClassname().equals(descriptorProtos$FileOptions.getJavaOuterClassname())) || hasJavaMultipleFiles() != descriptorProtos$FileOptions.hasJavaMultipleFiles()) {
            return false;
        }
        if ((hasJavaMultipleFiles() && getJavaMultipleFiles() != descriptorProtos$FileOptions.getJavaMultipleFiles()) || hasJavaGenerateEqualsAndHash() != descriptorProtos$FileOptions.hasJavaGenerateEqualsAndHash()) {
            return false;
        }
        if ((hasJavaGenerateEqualsAndHash() && getJavaGenerateEqualsAndHash() != descriptorProtos$FileOptions.getJavaGenerateEqualsAndHash()) || hasJavaStringCheckUtf8() != descriptorProtos$FileOptions.hasJavaStringCheckUtf8()) {
            return false;
        }
        if ((hasJavaStringCheckUtf8() && getJavaStringCheckUtf8() != descriptorProtos$FileOptions.getJavaStringCheckUtf8()) || hasOptimizeFor() != descriptorProtos$FileOptions.hasOptimizeFor()) {
            return false;
        }
        if ((hasOptimizeFor() && this.optimizeFor_ != descriptorProtos$FileOptions.optimizeFor_) || hasGoPackage() != descriptorProtos$FileOptions.hasGoPackage()) {
            return false;
        }
        if ((hasGoPackage() && !getGoPackage().equals(descriptorProtos$FileOptions.getGoPackage())) || hasCcGenericServices() != descriptorProtos$FileOptions.hasCcGenericServices()) {
            return false;
        }
        if ((hasCcGenericServices() && getCcGenericServices() != descriptorProtos$FileOptions.getCcGenericServices()) || hasJavaGenericServices() != descriptorProtos$FileOptions.hasJavaGenericServices()) {
            return false;
        }
        if ((hasJavaGenericServices() && getJavaGenericServices() != descriptorProtos$FileOptions.getJavaGenericServices()) || hasPyGenericServices() != descriptorProtos$FileOptions.hasPyGenericServices()) {
            return false;
        }
        if ((hasPyGenericServices() && getPyGenericServices() != descriptorProtos$FileOptions.getPyGenericServices()) || hasDeprecated() != descriptorProtos$FileOptions.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != descriptorProtos$FileOptions.getDeprecated()) || hasCcEnableArenas() != descriptorProtos$FileOptions.hasCcEnableArenas()) {
            return false;
        }
        if ((hasCcEnableArenas() && getCcEnableArenas() != descriptorProtos$FileOptions.getCcEnableArenas()) || hasObjcClassPrefix() != descriptorProtos$FileOptions.hasObjcClassPrefix()) {
            return false;
        }
        if ((hasObjcClassPrefix() && !getObjcClassPrefix().equals(descriptorProtos$FileOptions.getObjcClassPrefix())) || hasCsharpNamespace() != descriptorProtos$FileOptions.hasCsharpNamespace()) {
            return false;
        }
        if ((hasCsharpNamespace() && !getCsharpNamespace().equals(descriptorProtos$FileOptions.getCsharpNamespace())) || hasSwiftPrefix() != descriptorProtos$FileOptions.hasSwiftPrefix()) {
            return false;
        }
        if ((hasSwiftPrefix() && !getSwiftPrefix().equals(descriptorProtos$FileOptions.getSwiftPrefix())) || hasPhpClassPrefix() != descriptorProtos$FileOptions.hasPhpClassPrefix()) {
            return false;
        }
        if ((hasPhpClassPrefix() && !getPhpClassPrefix().equals(descriptorProtos$FileOptions.getPhpClassPrefix())) || hasPhpNamespace() != descriptorProtos$FileOptions.hasPhpNamespace()) {
            return false;
        }
        if ((hasPhpNamespace() && !getPhpNamespace().equals(descriptorProtos$FileOptions.getPhpNamespace())) || hasPhpMetadataNamespace() != descriptorProtos$FileOptions.hasPhpMetadataNamespace()) {
            return false;
        }
        if ((hasPhpMetadataNamespace() && !getPhpMetadataNamespace().equals(descriptorProtos$FileOptions.getPhpMetadataNamespace())) || hasRubyPackage() != descriptorProtos$FileOptions.hasRubyPackage()) {
            return false;
        }
        if ((!hasRubyPackage() || getRubyPackage().equals(descriptorProtos$FileOptions.getRubyPackage())) && hasFeatures() == descriptorProtos$FileOptions.hasFeatures()) {
            return (!hasFeatures() || getFeatures().equals(descriptorProtos$FileOptions.getFeatures())) && getUninterpretedOptionList().equals(descriptorProtos$FileOptions.getUninterpretedOptionList()) && getUnknownFields().equals(descriptorProtos$FileOptions.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$FileOptions.getExtensionFields());
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getCsharpNamespace() {
        Object obj = this.csharpNamespace_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.csharpNamespace_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getCsharpNamespaceBytes() {
        Object obj = this.csharpNamespace_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.csharpNamespace_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11416;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3495
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public InterfaceC3506 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getGoPackage() {
        Object obj = this.goPackage_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.goPackage_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getGoPackageBytes() {
        Object obj = this.goPackage_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.goPackage_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    @Deprecated
    public boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getJavaOuterClassname() {
        Object obj = this.javaOuterClassname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.javaOuterClassname_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getJavaOuterClassnameBytes() {
        Object obj = this.javaOuterClassname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.javaOuterClassname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getJavaPackage() {
        Object obj = this.javaPackage_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.javaPackage_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getJavaPackageBytes() {
        Object obj = this.javaPackage_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.javaPackage_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getObjcClassPrefix() {
        Object obj = this.objcClassPrefix_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.objcClassPrefix_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getObjcClassPrefixBytes() {
        Object obj = this.objcClassPrefix_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.objcClassPrefix_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public OptimizeMode getOptimizeFor() {
        OptimizeMode optimizeModeForNumber = OptimizeMode.forNumber(this.optimizeFor_);
        return optimizeModeForNumber == null ? OptimizeMode.SPEED : optimizeModeForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getPhpClassPrefix() {
        Object obj = this.phpClassPrefix_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.phpClassPrefix_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getPhpClassPrefixBytes() {
        Object obj = this.phpClassPrefix_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.phpClassPrefix_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getPhpMetadataNamespace() {
        Object obj = this.phpMetadataNamespace_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.phpMetadataNamespace_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getPhpMetadataNamespaceBytes() {
        Object obj = this.phpMetadataNamespace_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.phpMetadataNamespace_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getPhpNamespace() {
        Object obj = this.phpNamespace_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.phpNamespace_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getPhpNamespaceBytes() {
        Object obj = this.phpNamespace_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.phpNamespace_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getRubyPackage() {
        Object obj = this.rubyPackage_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.rubyPackage_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getRubyPackageBytes() {
        Object obj = this.rubyPackage_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.rubyPackage_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.javaPackage_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(8, this.javaOuterClassname_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iComputeStringSize += AbstractC3462.m7632(9, this.optimizeFor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC3462.m7634(10);
        }
        if ((this.bitField0_ & 64) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(11, this.goPackage_);
        }
        if ((this.bitField0_ & 128) != 0) {
            iComputeStringSize += AbstractC3462.m7634(16);
        }
        if ((this.bitField0_ & 256) != 0) {
            iComputeStringSize += AbstractC3462.m7634(17);
        }
        if ((this.bitField0_ & 512) != 0) {
            iComputeStringSize += AbstractC3462.m7634(18);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC3462.m7634(20);
        }
        if ((this.bitField0_ & 1024) != 0) {
            iComputeStringSize += AbstractC3462.m7634(23);
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeStringSize += AbstractC3462.m7634(27);
        }
        if ((this.bitField0_ & 2048) != 0) {
            iComputeStringSize += AbstractC3462.m7634(31);
        }
        if ((this.bitField0_ & 4096) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(36, this.objcClassPrefix_);
        }
        if ((this.bitField0_ & 8192) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(37, this.csharpNamespace_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(39, this.swiftPrefix_);
        }
        if ((this.bitField0_ & 32768) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(40, this.phpClassPrefix_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(41, this.phpNamespace_);
        }
        if ((this.bitField0_ & 131072) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(44, this.phpMetadataNamespace_);
        }
        if ((this.bitField0_ & 262144) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(45, this.rubyPackage_);
        }
        if ((this.bitField0_ & Opcodes.ASM8) != 0) {
            iComputeStringSize += AbstractC3462.m7639(50, getFeatures());
        }
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3462.m7643(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public String getSwiftPrefix() {
        Object obj = this.swiftPrefix_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ByteString byteString = (ByteString) obj;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.swiftPrefix_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public ByteString getSwiftPrefixBytes() {
        Object obj = this.swiftPrefix_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.swiftPrefix_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3495
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3495
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3495
    public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasCcEnableArenas() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasCcGenericServices() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasCsharpNamespace() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasFeatures() {
        return (this.bitField0_ & Opcodes.ASM8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasGoPackage() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    @Deprecated
    public boolean hasJavaGenerateEqualsAndHash() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasJavaGenericServices() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasJavaMultipleFiles() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasJavaOuterClassname() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasJavaPackage() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasJavaStringCheckUtf8() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasObjcClassPrefix() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasOptimizeFor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasPhpClassPrefix() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasPhpMetadataNamespace() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasPhpNamespace() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasPyGenericServices() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasRubyPackage() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3495
    public boolean hasSwiftPrefix() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasJavaPackage()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getJavaPackage().hashCode();
        }
        if (hasJavaOuterClassname()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 8, 53) + getJavaOuterClassname().hashCode();
        }
        if (hasJavaMultipleFiles()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 10, 53) + AbstractC3402.m7503(getJavaMultipleFiles());
        }
        if (hasJavaGenerateEqualsAndHash()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 20, 53) + AbstractC3402.m7503(getJavaGenerateEqualsAndHash());
        }
        if (hasJavaStringCheckUtf8()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 27, 53) + AbstractC3402.m7503(getJavaStringCheckUtf8());
        }
        if (hasOptimizeFor()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 9, 53) + this.optimizeFor_;
        }
        if (hasGoPackage()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 11, 53) + getGoPackage().hashCode();
        }
        if (hasCcGenericServices()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 16, 53) + AbstractC3402.m7503(getCcGenericServices());
        }
        if (hasJavaGenericServices()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 17, 53) + AbstractC3402.m7503(getJavaGenericServices());
        }
        if (hasPyGenericServices()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 18, 53) + AbstractC3402.m7503(getPyGenericServices());
        }
        if (hasDeprecated()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 23, 53) + AbstractC3402.m7503(getDeprecated());
        }
        if (hasCcEnableArenas()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 31, 53) + AbstractC3402.m7503(getCcEnableArenas());
        }
        if (hasObjcClassPrefix()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 36, 53) + getObjcClassPrefix().hashCode();
        }
        if (hasCsharpNamespace()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 37, 53) + getCsharpNamespace().hashCode();
        }
        if (hasSwiftPrefix()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 39, 53) + getSwiftPrefix().hashCode();
        }
        if (hasPhpClassPrefix()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 40, 53) + getPhpClassPrefix().hashCode();
        }
        if (hasPhpNamespace()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 41, 53) + getPhpNamespace().hashCode();
        }
        if (hasPhpMetadataNamespace()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 44, 53) + getPhpMetadataNamespace().hashCode();
        }
        if (hasRubyPackage()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 45, 53) + getRubyPackage().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 50, 53) + getFeatures().hashCode();
        }
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3533.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11415;
        c3619.m7827(DescriptorProtos$FileOptions.class, C3282.class);
        return c3619;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (hasFeatures() && !getFeatures().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getUninterpretedOptionCount(); i++) {
            if (!getUninterpretedOption(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC3533
    public C3282 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3282(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3282 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3282() : new C3282().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3462, 1, this.javaPackage_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessage.writeString(abstractC3462, 8, this.javaOuterClassname_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3462.mo7651(9, this.optimizeFor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3462.mo7663(10, this.javaMultipleFiles_);
        }
        if ((this.bitField0_ & 64) != 0) {
            GeneratedMessage.writeString(abstractC3462, 11, this.goPackage_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC3462.mo7663(16, this.ccGenericServices_);
        }
        if ((this.bitField0_ & 256) != 0) {
            abstractC3462.mo7663(17, this.javaGenericServices_);
        }
        if ((this.bitField0_ & 512) != 0) {
            abstractC3462.mo7663(18, this.pyGenericServices_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3462.mo7663(20, this.javaGenerateEqualsAndHash_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC3462.mo7663(23, this.deprecated_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3462.mo7663(27, this.javaStringCheckUtf8_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            abstractC3462.mo7663(31, this.ccEnableArenas_);
        }
        if ((this.bitField0_ & 4096) != 0) {
            GeneratedMessage.writeString(abstractC3462, 36, this.objcClassPrefix_);
        }
        if ((this.bitField0_ & 8192) != 0) {
            GeneratedMessage.writeString(abstractC3462, 37, this.csharpNamespace_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            GeneratedMessage.writeString(abstractC3462, 39, this.swiftPrefix_);
        }
        if ((this.bitField0_ & 32768) != 0) {
            GeneratedMessage.writeString(abstractC3462, 40, this.phpClassPrefix_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            GeneratedMessage.writeString(abstractC3462, 41, this.phpNamespace_);
        }
        if ((this.bitField0_ & 131072) != 0) {
            GeneratedMessage.writeString(abstractC3462, 44, this.phpMetadataNamespace_);
        }
        if ((this.bitField0_ & 262144) != 0) {
            GeneratedMessage.writeString(abstractC3462, 45, this.rubyPackage_);
        }
        if ((this.bitField0_ & Opcodes.ASM8) != 0) {
            abstractC3462.mo7649(50, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC3462.mo7649(999, this.uninterpretedOption_.get(i));
        }
        interfaceC3629NewExtensionSerializer.mo7828(536870912, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3282 extends GeneratedMessage.AbstractC3304 implements InterfaceC3495 {
        private int bitField0_;
        private boolean ccEnableArenas_;
        private boolean ccGenericServices_;
        private Object csharpNamespace_;
        private boolean deprecated_;
        private C3342 featuresBuilder_;
        private DescriptorProtos$FeatureSet features_;
        private Object goPackage_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private Object javaOuterClassname_;
        private Object javaPackage_;
        private boolean javaStringCheckUtf8_;
        private Object objcClassPrefix_;
        private int optimizeFor_;
        private Object phpClassPrefix_;
        private Object phpMetadataNamespace_;
        private Object phpNamespace_;
        private boolean pyGenericServices_;
        private Object rubyPackage_;
        private Object swiftPrefix_;
        private C3363 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C3282() {
            this.javaPackage_ = "";
            this.javaOuterClassname_ = "";
            this.optimizeFor_ = 1;
            this.goPackage_ = "";
            this.ccEnableArenas_ = true;
            this.objcClassPrefix_ = "";
            this.csharpNamespace_ = "";
            this.swiftPrefix_ = "";
            this.phpClassPrefix_ = "";
            this.phpNamespace_ = "";
            this.phpMetadataNamespace_ = "";
            this.rubyPackage_ = "";
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                descriptorProtos$FileOptions.javaPackage_ = this.javaPackage_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                descriptorProtos$FileOptions.javaOuterClassname_ = this.javaOuterClassname_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                descriptorProtos$FileOptions.javaMultipleFiles_ = this.javaMultipleFiles_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                descriptorProtos$FileOptions.javaGenerateEqualsAndHash_ = this.javaGenerateEqualsAndHash_;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                descriptorProtos$FileOptions.javaStringCheckUtf8_ = this.javaStringCheckUtf8_;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                descriptorProtos$FileOptions.optimizeFor_ = this.optimizeFor_;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                descriptorProtos$FileOptions.goPackage_ = this.goPackage_;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                descriptorProtos$FileOptions.ccGenericServices_ = this.ccGenericServices_;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                descriptorProtos$FileOptions.javaGenericServices_ = this.javaGenericServices_;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                descriptorProtos$FileOptions.pyGenericServices_ = this.pyGenericServices_;
                i |= 512;
            }
            if ((i2 & 1024) != 0) {
                descriptorProtos$FileOptions.deprecated_ = this.deprecated_;
                i |= 1024;
            }
            if ((i2 & 2048) != 0) {
                descriptorProtos$FileOptions.ccEnableArenas_ = this.ccEnableArenas_;
                i |= 2048;
            }
            if ((i2 & 4096) != 0) {
                descriptorProtos$FileOptions.objcClassPrefix_ = this.objcClassPrefix_;
                i |= 4096;
            }
            if ((i2 & 8192) != 0) {
                descriptorProtos$FileOptions.csharpNamespace_ = this.csharpNamespace_;
                i |= 8192;
            }
            if ((i2 & 16384) != 0) {
                descriptorProtos$FileOptions.swiftPrefix_ = this.swiftPrefix_;
                i |= 16384;
            }
            if ((i2 & 32768) != 0) {
                descriptorProtos$FileOptions.phpClassPrefix_ = this.phpClassPrefix_;
                i |= 32768;
            }
            if ((i2 & 65536) != 0) {
                descriptorProtos$FileOptions.phpNamespace_ = this.phpNamespace_;
                i |= 65536;
            }
            if ((i2 & 131072) != 0) {
                descriptorProtos$FileOptions.phpMetadataNamespace_ = this.phpMetadataNamespace_;
                i |= 131072;
            }
            if ((i2 & 262144) != 0) {
                descriptorProtos$FileOptions.rubyPackage_ = this.rubyPackage_;
                i |= 262144;
            }
            if ((i2 & Opcodes.ASM8) != 0) {
                C3342 c3342 = this.featuresBuilder_;
                descriptorProtos$FileOptions.features_ = c3342 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3342.m7384();
                i |= Opcodes.ASM8;
            }
            DescriptorProtos$FileOptions.access$18276(descriptorProtos$FileOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                descriptorProtos$FileOptions.uninterpretedOption_ = c3363.m7472();
                return;
            }
            if ((this.bitField0_ & 1048576) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                this.bitField0_ &= -1048577;
            }
            descriptorProtos$FileOptions.uninterpretedOption_ = this.uninterpretedOption_;
        }

        private void ensureUninterpretedOptionIsMutable() {
            if ((this.bitField0_ & 1048576) == 0) {
                this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                this.bitField0_ |= 1048576;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11416;
        }

        private C3342 internalGetFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new C3342(getFeatures(), getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private C3363 internalGetUninterpretedOptionFieldBuilder() {
            if (this.uninterpretedOptionBuilder_ == null) {
                this.uninterpretedOptionBuilder_ = new C3363(this.uninterpretedOption_, getParentForChildren(), isClean());
                this.uninterpretedOption_ = null;
            }
            return this.uninterpretedOptionBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetFeaturesFieldBuilder();
                internalGetUninterpretedOptionFieldBuilder();
            }
        }

        public C3282 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
            onChanged();
            return this;
        }

        public <Type> C3282 addExtension(C3616 c3616, Type type) {
            return (C3282) addExtension((AbstractC3579) c3616, type);
        }

        public C3282 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3295 c3295) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3295.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c3295.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder() {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7460(DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FileOptions build() {
            DescriptorProtos$FileOptions descriptorProtos$FileOptionsBuildPartial = buildPartial();
            if (descriptorProtos$FileOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$FileOptionsBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$FileOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$FileOptions buildPartial() {
            DescriptorProtos$FileOptions descriptorProtos$FileOptions = new DescriptorProtos$FileOptions(this);
            buildPartialRepeatedFields(descriptorProtos$FileOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FileOptions);
            }
            onBuilt();
            return descriptorProtos$FileOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3282 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.javaPackage_ = "";
            this.javaOuterClassname_ = "";
            this.javaMultipleFiles_ = false;
            this.javaGenerateEqualsAndHash_ = false;
            this.javaStringCheckUtf8_ = false;
            this.optimizeFor_ = 1;
            this.goPackage_ = "";
            this.ccGenericServices_ = false;
            this.javaGenericServices_ = false;
            this.pyGenericServices_ = false;
            this.deprecated_ = false;
            this.ccEnableArenas_ = true;
            this.objcClassPrefix_ = "";
            this.csharpNamespace_ = "";
            this.swiftPrefix_ = "";
            this.phpClassPrefix_ = "";
            this.phpNamespace_ = "";
            this.phpMetadataNamespace_ = "";
            this.rubyPackage_ = "";
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -1048577;
            return this;
        }

        public C3282 clearCcEnableArenas() {
            this.bitField0_ &= -2049;
            this.ccEnableArenas_ = true;
            onChanged();
            return this;
        }

        public C3282 clearCcGenericServices() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
            onChanged();
            return this;
        }

        public C3282 clearCsharpNamespace() {
            this.csharpNamespace_ = DescriptorProtos$FileOptions.getDefaultInstance().getCsharpNamespace();
            this.bitField0_ &= -8193;
            onChanged();
            return this;
        }

        public C3282 clearDeprecated() {
            this.bitField0_ &= -1025;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        public <Type> C3282 clearExtension(C3616 c3616) {
            return (C3282) clearExtension((AbstractC3579) c3616);
        }

        public C3282 clearFeatures() {
            this.bitField0_ &= -524289;
            this.features_ = null;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3282 clearGoPackage() {
            this.goPackage_ = DescriptorProtos$FileOptions.getDefaultInstance().getGoPackage();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        @Deprecated
        public C3282 clearJavaGenerateEqualsAndHash() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
            onChanged();
            return this;
        }

        public C3282 clearJavaGenericServices() {
            this.bitField0_ &= -257;
            this.javaGenericServices_ = false;
            onChanged();
            return this;
        }

        public C3282 clearJavaMultipleFiles() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
            onChanged();
            return this;
        }

        public C3282 clearJavaOuterClassname() {
            this.javaOuterClassname_ = DescriptorProtos$FileOptions.getDefaultInstance().getJavaOuterClassname();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3282 clearJavaPackage() {
            this.javaPackage_ = DescriptorProtos$FileOptions.getDefaultInstance().getJavaPackage();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3282 clearJavaStringCheckUtf8() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
            onChanged();
            return this;
        }

        public C3282 clearObjcClassPrefix() {
            this.objcClassPrefix_ = DescriptorProtos$FileOptions.getDefaultInstance().getObjcClassPrefix();
            this.bitField0_ &= -4097;
            onChanged();
            return this;
        }

        public C3282 clearOptimizeFor() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
            onChanged();
            return this;
        }

        public C3282 clearPhpClassPrefix() {
            this.phpClassPrefix_ = DescriptorProtos$FileOptions.getDefaultInstance().getPhpClassPrefix();
            this.bitField0_ &= -32769;
            onChanged();
            return this;
        }

        public C3282 clearPhpMetadataNamespace() {
            this.phpMetadataNamespace_ = DescriptorProtos$FileOptions.getDefaultInstance().getPhpMetadataNamespace();
            this.bitField0_ &= -131073;
            onChanged();
            return this;
        }

        public C3282 clearPhpNamespace() {
            this.phpNamespace_ = DescriptorProtos$FileOptions.getDefaultInstance().getPhpNamespace();
            this.bitField0_ &= -65537;
            onChanged();
            return this;
        }

        public C3282 clearPyGenericServices() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
            onChanged();
            return this;
        }

        public C3282 clearRubyPackage() {
            this.rubyPackage_ = DescriptorProtos$FileOptions.getDefaultInstance().getRubyPackage();
            this.bitField0_ &= -262145;
            onChanged();
            return this;
        }

        public C3282 clearSwiftPrefix() {
            this.swiftPrefix_ = DescriptorProtos$FileOptions.getDefaultInstance().getSwiftPrefix();
            this.bitField0_ &= -16385;
            onChanged();
            return this;
        }

        public C3282 clearUninterpretedOption() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -1048577;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getCsharpNamespace() {
            Object obj = this.csharpNamespace_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.csharpNamespace_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getCsharpNamespaceBytes() {
            Object obj = this.csharpNamespace_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.csharpNamespace_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11416;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3495
        public DescriptorProtos$FeatureSet getFeatures() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (DescriptorProtos$FeatureSet) c3342.m7380();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3273 getFeaturesBuilder() {
            this.bitField0_ |= Opcodes.ASM8;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3273) internalGetFeaturesFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3495
        public InterfaceC3506 getFeaturesOrBuilder() {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                return (InterfaceC3506) c3342.m7379();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getGoPackage() {
            Object obj = this.goPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.goPackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getGoPackageBytes() {
            Object obj = this.goPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.goPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getJavaOuterClassname() {
            Object obj = this.javaOuterClassname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.javaOuterClassname_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getJavaOuterClassnameBytes() {
            Object obj = this.javaOuterClassname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.javaOuterClassname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getJavaPackage() {
            Object obj = this.javaPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.javaPackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getJavaPackageBytes() {
            Object obj = this.javaPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.javaPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getObjcClassPrefix() {
            Object obj = this.objcClassPrefix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.objcClassPrefix_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getObjcClassPrefixBytes() {
            Object obj = this.objcClassPrefix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.objcClassPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public OptimizeMode getOptimizeFor() {
            OptimizeMode optimizeModeForNumber = OptimizeMode.forNumber(this.optimizeFor_);
            return optimizeModeForNumber == null ? OptimizeMode.SPEED : optimizeModeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getPhpClassPrefix() {
            Object obj = this.phpClassPrefix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phpClassPrefix_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getPhpClassPrefixBytes() {
            Object obj = this.phpClassPrefix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phpClassPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getPhpMetadataNamespace() {
            Object obj = this.phpMetadataNamespace_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phpMetadataNamespace_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getPhpMetadataNamespaceBytes() {
            Object obj = this.phpMetadataNamespace_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phpMetadataNamespace_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getPhpNamespace() {
            Object obj = this.phpNamespace_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phpNamespace_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getPhpNamespaceBytes() {
            Object obj = this.phpNamespace_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phpNamespace_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getRubyPackage() {
            Object obj = this.rubyPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.rubyPackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getRubyPackageBytes() {
            Object obj = this.rubyPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.rubyPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public String getSwiftPrefix() {
            Object obj = this.swiftPrefix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.swiftPrefix_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public ByteString getSwiftPrefixBytes() {
            Object obj = this.swiftPrefix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.swiftPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (DescriptorProtos$UninterpretedOption) c3363.m7466(i, false);
        }

        public DescriptorProtos$UninterpretedOption.C3295 getUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7473(i);
        }

        public List<DescriptorProtos$UninterpretedOption.C3295> getUninterpretedOptionBuilderList() {
            return internalGetUninterpretedOptionFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3495
        public int getUninterpretedOptionCount() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3495
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3495
        public InterfaceC3673 getUninterpretedOptionOrBuilder(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3673) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3495
        public List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList() {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasFeatures() {
            return (this.bitField0_ & Opcodes.ASM8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasGoPackage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasRubyPackage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3495
        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11415;
            c3619.m7827(DescriptorProtos$FileOptions.class, C3282.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            if (hasFeatures() && !getFeatures().isInitialized()) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    return false;
                }
            }
            return extensionsAreInitialized();
        }

        public C3282 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 != null) {
                c3342.m7386(descriptorProtos$FeatureSet);
            } else if ((this.bitField0_ & Opcodes.ASM8) == 0 || (descriptorProtos$FeatureSet2 = this.features_) == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                getFeaturesBuilder().mergeFrom(descriptorProtos$FeatureSet);
            }
            if (this.features_ != null) {
                this.bitField0_ |= Opcodes.ASM8;
                onChanged();
            }
            return this;
        }

        public C3282 mergeFrom(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            if (descriptorProtos$FileOptions == DescriptorProtos$FileOptions.getDefaultInstance()) {
                return this;
            }
            if (descriptorProtos$FileOptions.hasJavaPackage()) {
                this.javaPackage_ = descriptorProtos$FileOptions.javaPackage_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasJavaOuterClassname()) {
                this.javaOuterClassname_ = descriptorProtos$FileOptions.javaOuterClassname_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasJavaMultipleFiles()) {
                setJavaMultipleFiles(descriptorProtos$FileOptions.getJavaMultipleFiles());
            }
            if (descriptorProtos$FileOptions.hasJavaGenerateEqualsAndHash()) {
                setJavaGenerateEqualsAndHash(descriptorProtos$FileOptions.getJavaGenerateEqualsAndHash());
            }
            if (descriptorProtos$FileOptions.hasJavaStringCheckUtf8()) {
                setJavaStringCheckUtf8(descriptorProtos$FileOptions.getJavaStringCheckUtf8());
            }
            if (descriptorProtos$FileOptions.hasOptimizeFor()) {
                setOptimizeFor(descriptorProtos$FileOptions.getOptimizeFor());
            }
            if (descriptorProtos$FileOptions.hasGoPackage()) {
                this.goPackage_ = descriptorProtos$FileOptions.goPackage_;
                this.bitField0_ |= 64;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasCcGenericServices()) {
                setCcGenericServices(descriptorProtos$FileOptions.getCcGenericServices());
            }
            if (descriptorProtos$FileOptions.hasJavaGenericServices()) {
                setJavaGenericServices(descriptorProtos$FileOptions.getJavaGenericServices());
            }
            if (descriptorProtos$FileOptions.hasPyGenericServices()) {
                setPyGenericServices(descriptorProtos$FileOptions.getPyGenericServices());
            }
            if (descriptorProtos$FileOptions.hasDeprecated()) {
                setDeprecated(descriptorProtos$FileOptions.getDeprecated());
            }
            if (descriptorProtos$FileOptions.hasCcEnableArenas()) {
                setCcEnableArenas(descriptorProtos$FileOptions.getCcEnableArenas());
            }
            if (descriptorProtos$FileOptions.hasObjcClassPrefix()) {
                this.objcClassPrefix_ = descriptorProtos$FileOptions.objcClassPrefix_;
                this.bitField0_ |= 4096;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasCsharpNamespace()) {
                this.csharpNamespace_ = descriptorProtos$FileOptions.csharpNamespace_;
                this.bitField0_ |= 8192;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasSwiftPrefix()) {
                this.swiftPrefix_ = descriptorProtos$FileOptions.swiftPrefix_;
                this.bitField0_ |= 16384;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasPhpClassPrefix()) {
                this.phpClassPrefix_ = descriptorProtos$FileOptions.phpClassPrefix_;
                this.bitField0_ |= 32768;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasPhpNamespace()) {
                this.phpNamespace_ = descriptorProtos$FileOptions.phpNamespace_;
                this.bitField0_ |= 65536;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasPhpMetadataNamespace()) {
                this.phpMetadataNamespace_ = descriptorProtos$FileOptions.phpMetadataNamespace_;
                this.bitField0_ |= 131072;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasRubyPackage()) {
                this.rubyPackage_ = descriptorProtos$FileOptions.rubyPackage_;
                this.bitField0_ |= 262144;
                onChanged();
            }
            if (descriptorProtos$FileOptions.hasFeatures()) {
                mergeFeatures(descriptorProtos$FileOptions.getFeatures());
            }
            if (this.uninterpretedOptionBuilder_ == null) {
                if (!descriptorProtos$FileOptions.uninterpretedOption_.isEmpty()) {
                    if (this.uninterpretedOption_.isEmpty()) {
                        this.uninterpretedOption_ = descriptorProtos$FileOptions.uninterpretedOption_;
                        this.bitField0_ &= -1048577;
                    } else {
                        ensureUninterpretedOptionIsMutable();
                        this.uninterpretedOption_.addAll(descriptorProtos$FileOptions.uninterpretedOption_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$FileOptions.uninterpretedOption_.isEmpty()) {
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11012.isEmpty();
                C3363 c3363 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$FileOptions.uninterpretedOption_;
                    this.bitField0_ = (-1048577) & this.bitField0_;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$FileOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$FileOptions);
            mergeUnknownFields(descriptorProtos$FileOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C3282 removeUninterpretedOption(int i) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
            onChanged();
            return this;
        }

        public C3282 setCcEnableArenas(boolean z) {
            this.ccEnableArenas_ = z;
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3282 setCcGenericServices(boolean z) {
            this.ccGenericServices_ = z;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3282 setCsharpNamespace(String str) {
            str.getClass();
            this.csharpNamespace_ = str;
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public C3282 setCsharpNamespaceBytes(ByteString byteString) {
            byteString.getClass();
            this.csharpNamespace_ = byteString;
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public C3282 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public <Type> C3282 setExtension(C3616 c3616, Type type) {
            return (C3282) setExtension((AbstractC3579) c3616, type);
        }

        public C3282 setFeatures(DescriptorProtos$FeatureSet.C3273 c3273) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                this.features_ = c3273.build();
            } else {
                c3342.m7387(c3273.build());
            }
            this.bitField0_ |= Opcodes.ASM8;
            onChanged();
            return this;
        }

        public C3282 setGoPackage(String str) {
            str.getClass();
            this.goPackage_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3282 setGoPackageBytes(ByteString byteString) {
            byteString.getClass();
            this.goPackage_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        @Deprecated
        public C3282 setJavaGenerateEqualsAndHash(boolean z) {
            this.javaGenerateEqualsAndHash_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3282 setJavaGenericServices(boolean z) {
            this.javaGenericServices_ = z;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C3282 setJavaMultipleFiles(boolean z) {
            this.javaMultipleFiles_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3282 setJavaOuterClassname(String str) {
            str.getClass();
            this.javaOuterClassname_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3282 setJavaOuterClassnameBytes(ByteString byteString) {
            byteString.getClass();
            this.javaOuterClassname_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3282 setJavaPackage(String str) {
            str.getClass();
            this.javaPackage_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3282 setJavaPackageBytes(ByteString byteString) {
            byteString.getClass();
            this.javaPackage_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3282 setJavaStringCheckUtf8(boolean z) {
            this.javaStringCheckUtf8_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3282 setObjcClassPrefix(String str) {
            str.getClass();
            this.objcClassPrefix_ = str;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3282 setObjcClassPrefixBytes(ByteString byteString) {
            byteString.getClass();
            this.objcClassPrefix_ = byteString;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3282 setOptimizeFor(OptimizeMode optimizeMode) {
            optimizeMode.getClass();
            this.bitField0_ |= 32;
            this.optimizeFor_ = optimizeMode.getNumber();
            onChanged();
            return this;
        }

        public C3282 setPhpClassPrefix(String str) {
            str.getClass();
            this.phpClassPrefix_ = str;
            this.bitField0_ |= 32768;
            onChanged();
            return this;
        }

        public C3282 setPhpClassPrefixBytes(ByteString byteString) {
            byteString.getClass();
            this.phpClassPrefix_ = byteString;
            this.bitField0_ |= 32768;
            onChanged();
            return this;
        }

        public C3282 setPhpMetadataNamespace(String str) {
            str.getClass();
            this.phpMetadataNamespace_ = str;
            this.bitField0_ |= 131072;
            onChanged();
            return this;
        }

        public C3282 setPhpMetadataNamespaceBytes(ByteString byteString) {
            byteString.getClass();
            this.phpMetadataNamespace_ = byteString;
            this.bitField0_ |= 131072;
            onChanged();
            return this;
        }

        public C3282 setPhpNamespace(String str) {
            str.getClass();
            this.phpNamespace_ = str;
            this.bitField0_ |= 65536;
            onChanged();
            return this;
        }

        public C3282 setPhpNamespaceBytes(ByteString byteString) {
            byteString.getClass();
            this.phpNamespace_ = byteString;
            this.bitField0_ |= 65536;
            onChanged();
            return this;
        }

        public C3282 setPyGenericServices(boolean z) {
            this.pyGenericServices_ = z;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3282 setRubyPackage(String str) {
            str.getClass();
            this.rubyPackage_ = str;
            this.bitField0_ |= 262144;
            onChanged();
            return this;
        }

        public C3282 setRubyPackageBytes(ByteString byteString) {
            byteString.getClass();
            this.rubyPackage_ = byteString;
            this.bitField0_ |= 262144;
            onChanged();
            return this;
        }

        public C3282 setSwiftPrefix(String str) {
            str.getClass();
            this.swiftPrefix_ = str;
            this.bitField0_ |= 16384;
            onChanged();
            return this;
        }

        public C3282 setSwiftPrefixBytes(ByteString byteString) {
            byteString.getClass();
            this.swiftPrefix_ = byteString;
            this.bitField0_ |= 16384;
            onChanged();
            return this;
        }

        public C3282 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3295.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c3295.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
            return super.getExtension(abstractC3579, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
            return super.getExtensionCount(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
            return super.hasExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$FileOptions getDefaultInstanceForType() {
            return DescriptorProtos$FileOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3282 setExtension(C3616 c3616, int i, Type type) {
            return (C3282) setExtension((AbstractC3579) c3616, i, type);
        }

        public DescriptorProtos$UninterpretedOption.C3295 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3295) internalGetUninterpretedOptionFieldBuilder().m7461(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        public C3282 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3363.m7459(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3282 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.set(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3363.m7463(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3282 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3342 c3342 = this.featuresBuilder_;
            if (c3342 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3342.m7387(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= Opcodes.ASM8;
            onChanged();
            return this;
        }

        public C3282 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3363.m7458(descriptorProtos$UninterpretedOption);
            return this;
        }

        private C3282(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.javaPackage_ = "";
            this.javaOuterClassname_ = "";
            this.optimizeFor_ = 1;
            this.goPackage_ = "";
            this.ccEnableArenas_ = true;
            this.objcClassPrefix_ = "";
            this.csharpNamespace_ = "";
            this.swiftPrefix_ = "";
            this.phpClassPrefix_ = "";
            this.phpNamespace_ = "";
            this.phpMetadataNamespace_ = "";
            this.rubyPackage_ = "";
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public C3282 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3295 c3295) {
            C3363 c3363 = this.uninterpretedOptionBuilder_;
            if (c3363 == null) {
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, c3295.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3295.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3282 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$FileOptions) {
                return mergeFrom((DescriptorProtos$FileOptions) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3282 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        switch (iMo7705) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.javaPackage_ = abstractC3474.mo7719();
                                this.bitField0_ |= 1;
                                break;
                            case 66:
                                this.javaOuterClassname_ = abstractC3474.mo7719();
                                this.bitField0_ |= 2;
                                break;
                            case 72:
                                int iMo7724 = abstractC3474.mo7724();
                                if (OptimizeMode.forNumber(iMo7724) == null) {
                                    mergeUnknownVarintField(9, iMo7724);
                                } else {
                                    this.optimizeFor_ = iMo7724;
                                    this.bitField0_ |= 32;
                                }
                                break;
                            case 80:
                                this.javaMultipleFiles_ = abstractC3474.mo7720();
                                this.bitField0_ |= 4;
                                break;
                            case 90:
                                this.goPackage_ = abstractC3474.mo7719();
                                this.bitField0_ |= 64;
                                break;
                            case 128:
                                this.ccGenericServices_ = abstractC3474.mo7720();
                                this.bitField0_ |= 128;
                                break;
                            case 136:
                                this.javaGenericServices_ = abstractC3474.mo7720();
                                this.bitField0_ |= 256;
                                break;
                            case 144:
                                this.pyGenericServices_ = abstractC3474.mo7720();
                                this.bitField0_ |= 512;
                                break;
                            case 160:
                                this.javaGenerateEqualsAndHash_ = abstractC3474.mo7720();
                                this.bitField0_ |= 8;
                                break;
                            case 184:
                                this.deprecated_ = abstractC3474.mo7720();
                                this.bitField0_ |= 1024;
                                break;
                            case com.android.dx.io.Opcodes.ADD_INT_LIT8 /* 216 */:
                                this.javaStringCheckUtf8_ = abstractC3474.mo7720();
                                this.bitField0_ |= 16;
                                break;
                            case 248:
                                this.ccEnableArenas_ = abstractC3474.mo7720();
                                this.bitField0_ |= 2048;
                                break;
                            case 290:
                                this.objcClassPrefix_ = abstractC3474.mo7719();
                                this.bitField0_ |= 4096;
                                break;
                            case 298:
                                this.csharpNamespace_ = abstractC3474.mo7719();
                                this.bitField0_ |= 8192;
                                break;
                            case 314:
                                this.swiftPrefix_ = abstractC3474.mo7719();
                                this.bitField0_ |= 16384;
                                break;
                            case 322:
                                this.phpClassPrefix_ = abstractC3474.mo7719();
                                this.bitField0_ |= 32768;
                                break;
                            case 330:
                                this.phpNamespace_ = abstractC3474.mo7719();
                                this.bitField0_ |= 65536;
                                break;
                            case 354:
                                this.phpMetadataNamespace_ = abstractC3474.mo7719();
                                this.bitField0_ |= 131072;
                                break;
                            case 362:
                                this.rubyPackage_ = abstractC3474.mo7719();
                                this.bitField0_ |= 262144;
                                break;
                            case 402:
                                abstractC3474.mo7716(internalGetFeaturesFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= Opcodes.ASM8;
                                break;
                            case 7994:
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC3474.mo7715(DescriptorProtos$UninterpretedOption.parser(), c3697);
                                C3363 c3363 = this.uninterpretedOptionBuilder_;
                                if (c3363 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c3363.m7458(descriptorProtos$UninterpretedOption);
                                }
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                    z = true;
                                }
                                break;
                        }
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
        return super.getExtension(abstractC3579, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
        return super.getExtensionCount(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
        return super.hasExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$FileOptions getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
        return super.getExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
        return super.getExtension(c3616, i);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3282 newBuilderForType() {
        return newBuilder();
    }

    public static C3282 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$FileOptions) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileOptions) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$FileOptions) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum OptimizeMode implements InterfaceC3381 {
        SPEED(1),
        CODE_SIZE(2),
        LITE_RUNTIME(3);

        public static final int CODE_SIZE_VALUE = 2;
        public static final int LITE_RUNTIME_VALUE = 3;
        public static final int SPEED_VALUE = 1;
        private static final OptimizeMode[] VALUES;
        private static final InterfaceC3398 internalValueMap;
        private final int value;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "OptimizeMode");
            internalValueMap = new C3494();
            VALUES = values();
        }

        OptimizeMode(int i) {
            this.value = i;
        }

        public static OptimizeMode forNumber(int i) {
            if (i == 1) {
                return SPEED;
            }
            if (i == 2) {
                return CODE_SIZE;
            }
            if (i != 3) {
                return null;
            }
            return LITE_RUNTIME;
        }

        public static C3666 getDescriptor() {
            return DescriptorProtos$FileOptions.getDescriptor().f11377[0];
        }

        public static InterfaceC3398 internalGetValueMap() {
            return internalValueMap;
        }

        public static OptimizeMode valueOf(C3664 c3664) {
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
        public static OptimizeMode valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileOptions) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$FileOptions) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$FileOptions parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$FileOptions parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    private DescriptorProtos$FileOptions(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.javaPackage_ = "";
        this.javaOuterClassname_ = "";
        this.javaMultipleFiles_ = false;
        this.javaGenerateEqualsAndHash_ = false;
        this.javaStringCheckUtf8_ = false;
        this.optimizeFor_ = 1;
        this.goPackage_ = "";
        this.ccGenericServices_ = false;
        this.javaGenericServices_ = false;
        this.pyGenericServices_ = false;
        this.deprecated_ = false;
        this.ccEnableArenas_ = true;
        this.objcClassPrefix_ = "";
        this.csharpNamespace_ = "";
        this.swiftPrefix_ = "";
        this.phpClassPrefix_ = "";
        this.phpNamespace_ = "";
        this.phpMetadataNamespace_ = "";
        this.rubyPackage_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }
}
