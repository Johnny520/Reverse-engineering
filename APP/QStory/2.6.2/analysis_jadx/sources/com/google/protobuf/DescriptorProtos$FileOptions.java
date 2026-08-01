package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.jar.asm.Opcodes;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$FileOptions extends GeneratedMessage.ExtendableMessage<DescriptorProtos$FileOptions> implements InterfaceC3494 {
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
    private static final InterfaceC3374 PARSER;
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
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "FileOptions");
        DEFAULT_INSTANCE = new DescriptorProtos$FileOptions();
        PARSER = new C3496();
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

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11411;
    }

    public static C3281 newBuilder(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$FileOptions);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileOptions) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.InterfaceC3494
    public boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getCsharpNamespaceBytes() {
        Object obj = this.csharpNamespace_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.csharpNamespace_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11411;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
        return super.getExtension(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
        return super.getExtensionCount(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3494
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public InterfaceC3505 getFeaturesOrBuilder() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getGoPackageBytes() {
        Object obj = this.goPackage_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.goPackage_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3494
    @Deprecated
    public boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getJavaOuterClassnameBytes() {
        Object obj = this.javaOuterClassname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.javaOuterClassname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getJavaPackageBytes() {
        Object obj = this.javaPackage_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.javaPackage_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getObjcClassPrefixBytes() {
        Object obj = this.objcClassPrefix_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.objcClassPrefix_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public OptimizeMode getOptimizeFor() {
        OptimizeMode optimizeModeForNumber = OptimizeMode.forNumber(this.optimizeFor_);
        return optimizeModeForNumber == null ? OptimizeMode.SPEED : optimizeModeForNumber;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getPhpClassPrefixBytes() {
        Object obj = this.phpClassPrefix_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.phpClassPrefix_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getPhpMetadataNamespaceBytes() {
        Object obj = this.phpMetadataNamespace_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.phpMetadataNamespace_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getPhpNamespaceBytes() {
        Object obj = this.phpNamespace_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.phpNamespace_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getRubyPackageBytes() {
        Object obj = this.rubyPackage_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.rubyPackage_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
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
            iComputeStringSize += AbstractC3461.m7645(9, this.optimizeFor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += AbstractC3461.m7647(10);
        }
        if ((this.bitField0_ & 64) != 0) {
            iComputeStringSize += GeneratedMessage.computeStringSize(11, this.goPackage_);
        }
        if ((this.bitField0_ & 128) != 0) {
            iComputeStringSize += AbstractC3461.m7647(16);
        }
        if ((this.bitField0_ & 256) != 0) {
            iComputeStringSize += AbstractC3461.m7647(17);
        }
        if ((this.bitField0_ & 512) != 0) {
            iComputeStringSize += AbstractC3461.m7647(18);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += AbstractC3461.m7647(20);
        }
        if ((this.bitField0_ & 1024) != 0) {
            iComputeStringSize += AbstractC3461.m7647(23);
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeStringSize += AbstractC3461.m7647(27);
        }
        if ((this.bitField0_ & 2048) != 0) {
            iComputeStringSize += AbstractC3461.m7647(31);
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
            iComputeStringSize += AbstractC3461.m7652(50, getFeatures());
        }
        int size = this.uninterpretedOption_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3461.m7656(this.uninterpretedOption_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + (size * 2) + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3494
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

    @Override // com.google.protobuf.InterfaceC3494
    public ByteString getSwiftPrefixBytes() {
        Object obj = this.swiftPrefix_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.swiftPrefix_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3494
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC3494
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public InterfaceC3672 getUninterpretedOptionOrBuilder(int i) {
        return this.uninterpretedOption_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3494
    public List<? extends InterfaceC3672> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasCcEnableArenas() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasCcGenericServices() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasCsharpNamespace() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasFeatures() {
        return (this.bitField0_ & Opcodes.ASM8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasGoPackage() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    @Deprecated
    public boolean hasJavaGenerateEqualsAndHash() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasJavaGenericServices() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasJavaMultipleFiles() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasJavaOuterClassname() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasJavaPackage() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasJavaStringCheckUtf8() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasObjcClassPrefix() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasOptimizeFor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasPhpClassPrefix() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasPhpMetadataNamespace() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasPhpNamespace() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasPyGenericServices() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasRubyPackage() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // com.google.protobuf.InterfaceC3494
    public boolean hasSwiftPrefix() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasJavaPackage()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getJavaPackage().hashCode();
        }
        if (hasJavaOuterClassname()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 8, 53) + getJavaOuterClassname().hashCode();
        }
        if (hasJavaMultipleFiles()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 10, 53) + AbstractC3401.m7516(getJavaMultipleFiles());
        }
        if (hasJavaGenerateEqualsAndHash()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 20, 53) + AbstractC3401.m7516(getJavaGenerateEqualsAndHash());
        }
        if (hasJavaStringCheckUtf8()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 27, 53) + AbstractC3401.m7516(getJavaStringCheckUtf8());
        }
        if (hasOptimizeFor()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 9, 53) + this.optimizeFor_;
        }
        if (hasGoPackage()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 11, 53) + getGoPackage().hashCode();
        }
        if (hasCcGenericServices()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 16, 53) + AbstractC3401.m7516(getCcGenericServices());
        }
        if (hasJavaGenericServices()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 17, 53) + AbstractC3401.m7516(getJavaGenericServices());
        }
        if (hasPyGenericServices()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 18, 53) + AbstractC3401.m7516(getPyGenericServices());
        }
        if (hasDeprecated()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 23, 53) + AbstractC3401.m7516(getDeprecated());
        }
        if (hasCcEnableArenas()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 31, 53) + AbstractC3401.m7516(getCcEnableArenas());
        }
        if (hasObjcClassPrefix()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 36, 53) + getObjcClassPrefix().hashCode();
        }
        if (hasCsharpNamespace()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 37, 53) + getCsharpNamespace().hashCode();
        }
        if (hasSwiftPrefix()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 39, 53) + getSwiftPrefix().hashCode();
        }
        if (hasPhpClassPrefix()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 40, 53) + getPhpClassPrefix().hashCode();
        }
        if (hasPhpNamespace()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 41, 53) + getPhpNamespace().hashCode();
        }
        if (hasPhpMetadataNamespace()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 44, 53) + getPhpMetadataNamespace().hashCode();
        }
        if (hasRubyPackage()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 45, 53) + getRubyPackage().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 50, 53) + getFeatures().hashCode();
        }
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3532.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11410;
        c3618.m7840(DescriptorProtos$FileOptions.class, C3281.class);
        return c3618;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

    @Override // com.google.protobuf.AbstractC3532
    public C3281 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3281(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3281 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3281() : new C3281().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        InterfaceC3628 interfaceC3628NewExtensionSerializer = newExtensionSerializer();
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessage.writeString(abstractC3461, 1, this.javaPackage_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessage.writeString(abstractC3461, 8, this.javaOuterClassname_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC3461.mo7664(9, this.optimizeFor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC3461.mo7676(10, this.javaMultipleFiles_);
        }
        if ((this.bitField0_ & 64) != 0) {
            GeneratedMessage.writeString(abstractC3461, 11, this.goPackage_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC3461.mo7676(16, this.ccGenericServices_);
        }
        if ((this.bitField0_ & 256) != 0) {
            abstractC3461.mo7676(17, this.javaGenericServices_);
        }
        if ((this.bitField0_ & 512) != 0) {
            abstractC3461.mo7676(18, this.pyGenericServices_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC3461.mo7676(20, this.javaGenerateEqualsAndHash_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC3461.mo7676(23, this.deprecated_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC3461.mo7676(27, this.javaStringCheckUtf8_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            abstractC3461.mo7676(31, this.ccEnableArenas_);
        }
        if ((this.bitField0_ & 4096) != 0) {
            GeneratedMessage.writeString(abstractC3461, 36, this.objcClassPrefix_);
        }
        if ((this.bitField0_ & 8192) != 0) {
            GeneratedMessage.writeString(abstractC3461, 37, this.csharpNamespace_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            GeneratedMessage.writeString(abstractC3461, 39, this.swiftPrefix_);
        }
        if ((this.bitField0_ & 32768) != 0) {
            GeneratedMessage.writeString(abstractC3461, 40, this.phpClassPrefix_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            GeneratedMessage.writeString(abstractC3461, 41, this.phpNamespace_);
        }
        if ((this.bitField0_ & 131072) != 0) {
            GeneratedMessage.writeString(abstractC3461, 44, this.phpMetadataNamespace_);
        }
        if ((this.bitField0_ & 262144) != 0) {
            GeneratedMessage.writeString(abstractC3461, 45, this.rubyPackage_);
        }
        if ((this.bitField0_ & Opcodes.ASM8) != 0) {
            abstractC3461.mo7662(50, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC3461.mo7662(999, this.uninterpretedOption_.get(i));
        }
        interfaceC3628NewExtensionSerializer.mo7841(536870912, abstractC3461);
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3281 extends GeneratedMessage.AbstractC3303 implements InterfaceC3494 {
        private int bitField0_;
        private boolean ccEnableArenas_;
        private boolean ccGenericServices_;
        private Object csharpNamespace_;
        private boolean deprecated_;
        private C3341 featuresBuilder_;
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
        private C3362 uninterpretedOptionBuilder_;
        private List<DescriptorProtos$UninterpretedOption> uninterpretedOption_;

        private C3281() {
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
                C3341 c3341 = this.featuresBuilder_;
                descriptorProtos$FileOptions.features_ = c3341 == null ? this.features_ : (DescriptorProtos$FeatureSet) c3341.m7397();
                i |= Opcodes.ASM8;
            }
            DescriptorProtos$FileOptions.access$18276(descriptorProtos$FileOptions, i);
        }

        private void buildPartialRepeatedFields(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                descriptorProtos$FileOptions.uninterpretedOption_ = c3362.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11411;
        }

        private C3341 internalGetFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new C3341(getFeatures(), getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private C3362 internalGetUninterpretedOptionFieldBuilder() {
            if (this.uninterpretedOptionBuilder_ == null) {
                this.uninterpretedOptionBuilder_ = new C3362(this.uninterpretedOption_, getParentForChildren(), isClean());
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

        public C3281 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
            onChanged();
            return this;
        }

        public <Type> C3281 addExtension(C3615 c3615, Type type) {
            return (C3281) addExtension((AbstractC3578) c3615, type);
        }

        public C3281 addUninterpretedOption(DescriptorProtos$UninterpretedOption.C3294 c3294) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3294.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c3294.build());
            onChanged();
            return this;
        }

        public DescriptorProtos$UninterpretedOption.C3294 addUninterpretedOptionBuilder() {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7473(DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FileOptions build() {
            DescriptorProtos$FileOptions descriptorProtos$FileOptionsBuildPartial = buildPartial();
            if (descriptorProtos$FileOptionsBuildPartial.isInitialized()) {
                return descriptorProtos$FileOptionsBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$FileOptionsBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$FileOptions buildPartial() {
            DescriptorProtos$FileOptions descriptorProtos$FileOptions = new DescriptorProtos$FileOptions(this);
            buildPartialRepeatedFields(descriptorProtos$FileOptions);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$FileOptions);
            }
            onBuilt();
            return descriptorProtos$FileOptions;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3281 mo7355clear() {
            super.mo7355clear();
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
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.featuresBuilder_ = null;
            }
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                this.uninterpretedOption_ = Collections.EMPTY_LIST;
            } else {
                this.uninterpretedOption_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -1048577;
            return this;
        }

        public C3281 clearCcEnableArenas() {
            this.bitField0_ &= -2049;
            this.ccEnableArenas_ = true;
            onChanged();
            return this;
        }

        public C3281 clearCcGenericServices() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
            onChanged();
            return this;
        }

        public C3281 clearCsharpNamespace() {
            this.csharpNamespace_ = DescriptorProtos$FileOptions.getDefaultInstance().getCsharpNamespace();
            this.bitField0_ &= -8193;
            onChanged();
            return this;
        }

        public C3281 clearDeprecated() {
            this.bitField0_ &= -1025;
            this.deprecated_ = false;
            onChanged();
            return this;
        }

        public <Type> C3281 clearExtension(C3615 c3615) {
            return (C3281) clearExtension((AbstractC3578) c3615);
        }

        public C3281 clearFeatures() {
            this.bitField0_ &= -524289;
            this.features_ = null;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.featuresBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3281 clearGoPackage() {
            this.goPackage_ = DescriptorProtos$FileOptions.getDefaultInstance().getGoPackage();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        @Deprecated
        public C3281 clearJavaGenerateEqualsAndHash() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
            onChanged();
            return this;
        }

        public C3281 clearJavaGenericServices() {
            this.bitField0_ &= -257;
            this.javaGenericServices_ = false;
            onChanged();
            return this;
        }

        public C3281 clearJavaMultipleFiles() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
            onChanged();
            return this;
        }

        public C3281 clearJavaOuterClassname() {
            this.javaOuterClassname_ = DescriptorProtos$FileOptions.getDefaultInstance().getJavaOuterClassname();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3281 clearJavaPackage() {
            this.javaPackage_ = DescriptorProtos$FileOptions.getDefaultInstance().getJavaPackage();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3281 clearJavaStringCheckUtf8() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
            onChanged();
            return this;
        }

        public C3281 clearObjcClassPrefix() {
            this.objcClassPrefix_ = DescriptorProtos$FileOptions.getDefaultInstance().getObjcClassPrefix();
            this.bitField0_ &= -4097;
            onChanged();
            return this;
        }

        public C3281 clearOptimizeFor() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
            onChanged();
            return this;
        }

        public C3281 clearPhpClassPrefix() {
            this.phpClassPrefix_ = DescriptorProtos$FileOptions.getDefaultInstance().getPhpClassPrefix();
            this.bitField0_ &= -32769;
            onChanged();
            return this;
        }

        public C3281 clearPhpMetadataNamespace() {
            this.phpMetadataNamespace_ = DescriptorProtos$FileOptions.getDefaultInstance().getPhpMetadataNamespace();
            this.bitField0_ &= -131073;
            onChanged();
            return this;
        }

        public C3281 clearPhpNamespace() {
            this.phpNamespace_ = DescriptorProtos$FileOptions.getDefaultInstance().getPhpNamespace();
            this.bitField0_ &= -65537;
            onChanged();
            return this;
        }

        public C3281 clearPyGenericServices() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
            onChanged();
            return this;
        }

        public C3281 clearRubyPackage() {
            this.rubyPackage_ = DescriptorProtos$FileOptions.getDefaultInstance().getRubyPackage();
            this.bitField0_ &= -262145;
            onChanged();
            return this;
        }

        public C3281 clearSwiftPrefix() {
            this.swiftPrefix_ = DescriptorProtos$FileOptions.getDefaultInstance().getSwiftPrefix();
            this.bitField0_ &= -16385;
            onChanged();
            return this;
        }

        public C3281 clearUninterpretedOption() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.uninterpretedOption_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -1048577;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getCsharpNamespaceBytes() {
            Object obj = this.csharpNamespace_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.csharpNamespace_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11411;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3494
        public DescriptorProtos$FeatureSet getFeatures() {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                return (DescriptorProtos$FeatureSet) c3341.m7393();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        public DescriptorProtos$FeatureSet.C3272 getFeaturesBuilder() {
            this.bitField0_ |= Opcodes.ASM8;
            onChanged();
            return (DescriptorProtos$FeatureSet.C3272) internalGetFeaturesFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3494
        public InterfaceC3505 getFeaturesOrBuilder() {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                return (InterfaceC3505) c3341.m7392();
            }
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getGoPackageBytes() {
            Object obj = this.goPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.goPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getJavaOuterClassnameBytes() {
            Object obj = this.javaOuterClassname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.javaOuterClassname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getJavaPackageBytes() {
            Object obj = this.javaPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.javaPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getObjcClassPrefixBytes() {
            Object obj = this.objcClassPrefix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.objcClassPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public OptimizeMode getOptimizeFor() {
            OptimizeMode optimizeModeForNumber = OptimizeMode.forNumber(this.optimizeFor_);
            return optimizeModeForNumber == null ? OptimizeMode.SPEED : optimizeModeForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getPhpClassPrefixBytes() {
            Object obj = this.phpClassPrefix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phpClassPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getPhpMetadataNamespaceBytes() {
            Object obj = this.phpMetadataNamespace_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phpMetadataNamespace_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getPhpNamespaceBytes() {
            Object obj = this.phpNamespace_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phpNamespace_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getRubyPackageBytes() {
            Object obj = this.rubyPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.rubyPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
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

        @Override // com.google.protobuf.InterfaceC3494
        public ByteString getSwiftPrefixBytes() {
            Object obj = this.swiftPrefix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.swiftPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.get(i) : (DescriptorProtos$UninterpretedOption) c3362.m7479(i, false);
        }

        public DescriptorProtos$UninterpretedOption.C3294 getUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7486(i);
        }

        public List<DescriptorProtos$UninterpretedOption.C3294> getUninterpretedOptionBuilderList() {
            return internalGetUninterpretedOptionFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3494
        public int getUninterpretedOptionCount() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3494
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.uninterpretedOption_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3494
        public InterfaceC3672 getUninterpretedOptionOrBuilder(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 == null ? this.uninterpretedOption_.get(i) : (InterfaceC3672) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3494
        public List<? extends InterfaceC3672> getUninterpretedOptionOrBuilderList() {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.uninterpretedOption_);
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasFeatures() {
            return (this.bitField0_ & Opcodes.ASM8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasGoPackage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasRubyPackage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3494
        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11410;
            c3618.m7840(DescriptorProtos$FileOptions.class, C3281.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

        public C3281 mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2;
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 != null) {
                c3341.m7399(descriptorProtos$FeatureSet);
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

        public C3281 mergeFrom(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
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
                boolean zIsEmpty = this.uninterpretedOptionBuilder_.f11007.isEmpty();
                C3362 c3362 = this.uninterpretedOptionBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.uninterpretedOptionBuilder_ = null;
                    this.uninterpretedOption_ = descriptorProtos$FileOptions.uninterpretedOption_;
                    this.bitField0_ = (-1048577) & this.bitField0_;
                    this.uninterpretedOptionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUninterpretedOptionFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$FileOptions.uninterpretedOption_);
                }
            }
            mergeExtensionFields(descriptorProtos$FileOptions);
            mergeUnknownFields(descriptorProtos$FileOptions.getUnknownFields());
            onChanged();
            return this;
        }

        public C3281 removeUninterpretedOption(int i) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
            onChanged();
            return this;
        }

        public C3281 setCcEnableArenas(boolean z) {
            this.ccEnableArenas_ = z;
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public C3281 setCcGenericServices(boolean z) {
            this.ccGenericServices_ = z;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3281 setCsharpNamespace(String str) {
            str.getClass();
            this.csharpNamespace_ = str;
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public C3281 setCsharpNamespaceBytes(ByteString byteString) {
            byteString.getClass();
            this.csharpNamespace_ = byteString;
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public C3281 setDeprecated(boolean z) {
            this.deprecated_ = z;
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public <Type> C3281 setExtension(C3615 c3615, Type type) {
            return (C3281) setExtension((AbstractC3578) c3615, type);
        }

        public C3281 setFeatures(DescriptorProtos$FeatureSet.C3272 c3272) {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 == null) {
                this.features_ = c3272.build();
            } else {
                c3341.m7400(c3272.build());
            }
            this.bitField0_ |= Opcodes.ASM8;
            onChanged();
            return this;
        }

        public C3281 setGoPackage(String str) {
            str.getClass();
            this.goPackage_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3281 setGoPackageBytes(ByteString byteString) {
            byteString.getClass();
            this.goPackage_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        @Deprecated
        public C3281 setJavaGenerateEqualsAndHash(boolean z) {
            this.javaGenerateEqualsAndHash_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3281 setJavaGenericServices(boolean z) {
            this.javaGenericServices_ = z;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public C3281 setJavaMultipleFiles(boolean z) {
            this.javaMultipleFiles_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3281 setJavaOuterClassname(String str) {
            str.getClass();
            this.javaOuterClassname_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3281 setJavaOuterClassnameBytes(ByteString byteString) {
            byteString.getClass();
            this.javaOuterClassname_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3281 setJavaPackage(String str) {
            str.getClass();
            this.javaPackage_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3281 setJavaPackageBytes(ByteString byteString) {
            byteString.getClass();
            this.javaPackage_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3281 setJavaStringCheckUtf8(boolean z) {
            this.javaStringCheckUtf8_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3281 setObjcClassPrefix(String str) {
            str.getClass();
            this.objcClassPrefix_ = str;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3281 setObjcClassPrefixBytes(ByteString byteString) {
            byteString.getClass();
            this.objcClassPrefix_ = byteString;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public C3281 setOptimizeFor(OptimizeMode optimizeMode) {
            optimizeMode.getClass();
            this.bitField0_ |= 32;
            this.optimizeFor_ = optimizeMode.getNumber();
            onChanged();
            return this;
        }

        public C3281 setPhpClassPrefix(String str) {
            str.getClass();
            this.phpClassPrefix_ = str;
            this.bitField0_ |= 32768;
            onChanged();
            return this;
        }

        public C3281 setPhpClassPrefixBytes(ByteString byteString) {
            byteString.getClass();
            this.phpClassPrefix_ = byteString;
            this.bitField0_ |= 32768;
            onChanged();
            return this;
        }

        public C3281 setPhpMetadataNamespace(String str) {
            str.getClass();
            this.phpMetadataNamespace_ = str;
            this.bitField0_ |= 131072;
            onChanged();
            return this;
        }

        public C3281 setPhpMetadataNamespaceBytes(ByteString byteString) {
            byteString.getClass();
            this.phpMetadataNamespace_ = byteString;
            this.bitField0_ |= 131072;
            onChanged();
            return this;
        }

        public C3281 setPhpNamespace(String str) {
            str.getClass();
            this.phpNamespace_ = str;
            this.bitField0_ |= 65536;
            onChanged();
            return this;
        }

        public C3281 setPhpNamespaceBytes(ByteString byteString) {
            byteString.getClass();
            this.phpNamespace_ = byteString;
            this.bitField0_ |= 65536;
            onChanged();
            return this;
        }

        public C3281 setPyGenericServices(boolean z) {
            this.pyGenericServices_ = z;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public C3281 setRubyPackage(String str) {
            str.getClass();
            this.rubyPackage_ = str;
            this.bitField0_ |= 262144;
            onChanged();
            return this;
        }

        public C3281 setRubyPackageBytes(ByteString byteString) {
            byteString.getClass();
            this.rubyPackage_ = byteString;
            this.bitField0_ |= 262144;
            onChanged();
            return this;
        }

        public C3281 setSwiftPrefix(String str) {
            str.getClass();
            this.swiftPrefix_ = str;
            this.bitField0_ |= 16384;
            onChanged();
            return this;
        }

        public C3281 setSwiftPrefixBytes(ByteString byteString) {
            byteString.getClass();
            this.swiftPrefix_ = byteString;
            this.bitField0_ |= 16384;
            onChanged();
            return this;
        }

        public C3281 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3294 c3294) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3294.build());
                return this;
            }
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c3294.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
            return super.getExtension(abstractC3578, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
            return super.getExtensionCount(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
            return super.hasExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$FileOptions getDefaultInstanceForType() {
            return DescriptorProtos$FileOptions.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        public <Type> C3281 setExtension(C3615 c3615, int i, Type type) {
            return (C3281) setExtension((AbstractC3578) c3615, i, type);
        }

        public DescriptorProtos$UninterpretedOption.C3294 addUninterpretedOptionBuilder(int i) {
            return (DescriptorProtos$UninterpretedOption.C3294) internalGetUninterpretedOptionFieldBuilder().m7474(i, DescriptorProtos$UninterpretedOption.getDefaultInstance());
        }

        public C3281 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3362.m7472(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3281 setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.set(i, descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3362.m7476(i, descriptorProtos$UninterpretedOption);
            return this;
        }

        public C3281 setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            C3341 c3341 = this.featuresBuilder_;
            if (c3341 == null) {
                descriptorProtos$FeatureSet.getClass();
                this.features_ = descriptorProtos$FeatureSet;
            } else {
                c3341.m7400(descriptorProtos$FeatureSet);
            }
            this.bitField0_ |= Opcodes.ASM8;
            onChanged();
            return this;
        }

        public C3281 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                descriptorProtos$UninterpretedOption.getClass();
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                onChanged();
                return this;
            }
            c3362.m7471(descriptorProtos$UninterpretedOption);
            return this;
        }

        private C3281(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
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

        public C3281 addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption.C3294 c3294) {
            C3362 c3362 = this.uninterpretedOptionBuilder_;
            if (c3362 == null) {
                ensureUninterpretedOptionIsMutable();
                this.uninterpretedOption_.add(i, c3294.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3294.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3281 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$FileOptions) {
                return mergeFrom((DescriptorProtos$FileOptions) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3281 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        switch (iMo7718) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.javaPackage_ = abstractC3473.mo7732();
                                this.bitField0_ |= 1;
                                break;
                            case 66:
                                this.javaOuterClassname_ = abstractC3473.mo7732();
                                this.bitField0_ |= 2;
                                break;
                            case 72:
                                int iMo7737 = abstractC3473.mo7737();
                                if (OptimizeMode.forNumber(iMo7737) == null) {
                                    mergeUnknownVarintField(9, iMo7737);
                                } else {
                                    this.optimizeFor_ = iMo7737;
                                    this.bitField0_ |= 32;
                                }
                                break;
                            case 80:
                                this.javaMultipleFiles_ = abstractC3473.mo7733();
                                this.bitField0_ |= 4;
                                break;
                            case 90:
                                this.goPackage_ = abstractC3473.mo7732();
                                this.bitField0_ |= 64;
                                break;
                            case 128:
                                this.ccGenericServices_ = abstractC3473.mo7733();
                                this.bitField0_ |= 128;
                                break;
                            case 136:
                                this.javaGenericServices_ = abstractC3473.mo7733();
                                this.bitField0_ |= 256;
                                break;
                            case 144:
                                this.pyGenericServices_ = abstractC3473.mo7733();
                                this.bitField0_ |= 512;
                                break;
                            case 160:
                                this.javaGenerateEqualsAndHash_ = abstractC3473.mo7733();
                                this.bitField0_ |= 8;
                                break;
                            case 184:
                                this.deprecated_ = abstractC3473.mo7733();
                                this.bitField0_ |= 1024;
                                break;
                            case com.android.dx.io.Opcodes.ADD_INT_LIT8 /* 216 */:
                                this.javaStringCheckUtf8_ = abstractC3473.mo7733();
                                this.bitField0_ |= 16;
                                break;
                            case 248:
                                this.ccEnableArenas_ = abstractC3473.mo7733();
                                this.bitField0_ |= 2048;
                                break;
                            case 290:
                                this.objcClassPrefix_ = abstractC3473.mo7732();
                                this.bitField0_ |= 4096;
                                break;
                            case 298:
                                this.csharpNamespace_ = abstractC3473.mo7732();
                                this.bitField0_ |= 8192;
                                break;
                            case 314:
                                this.swiftPrefix_ = abstractC3473.mo7732();
                                this.bitField0_ |= 16384;
                                break;
                            case 322:
                                this.phpClassPrefix_ = abstractC3473.mo7732();
                                this.bitField0_ |= 32768;
                                break;
                            case 330:
                                this.phpNamespace_ = abstractC3473.mo7732();
                                this.bitField0_ |= 65536;
                                break;
                            case 354:
                                this.phpMetadataNamespace_ = abstractC3473.mo7732();
                                this.bitField0_ |= 131072;
                                break;
                            case 362:
                                this.rubyPackage_ = abstractC3473.mo7732();
                                this.bitField0_ |= 262144;
                                break;
                            case 402:
                                abstractC3473.mo7729(internalGetFeaturesFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= Opcodes.ASM8;
                                break;
                            case 7994:
                                DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption) abstractC3473.mo7728(DescriptorProtos$UninterpretedOption.parser(), c3696);
                                C3362 c3362 = this.uninterpretedOptionBuilder_;
                                if (c3362 == null) {
                                    ensureUninterpretedOptionIsMutable();
                                    this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
                                } else {
                                    c3362.m7471(descriptorProtos$UninterpretedOption);
                                }
                                break;
                            default:
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
        return super.getExtension(abstractC3578, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
        return super.getExtensionCount(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
        return super.hasExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$FileOptions getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
        return super.getExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
        return super.getExtension(c3615, i);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3281 newBuilderForType() {
        return newBuilder();
    }

    public static C3281 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$FileOptions) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileOptions) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$FileOptions) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum OptimizeMode implements InterfaceC3380 {
        SPEED(1),
        CODE_SIZE(2),
        LITE_RUNTIME(3);

        public static final int CODE_SIZE_VALUE = 2;
        public static final int LITE_RUNTIME_VALUE = 3;
        public static final int SPEED_VALUE = 1;
        private static final OptimizeMode[] VALUES;
        private static final InterfaceC3397 internalValueMap;
        private final int value;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "OptimizeMode");
            internalValueMap = new C3493();
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

        public static C3665 getDescriptor() {
            return DescriptorProtos$FileOptions.getDescriptor().f11372[0];
        }

        public static InterfaceC3397 internalGetValueMap() {
            return internalValueMap;
        }

        public static OptimizeMode valueOf(C3663 c3663) {
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
        public static OptimizeMode valueOf(int i) {
            return forNumber(i);
        }
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileOptions) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$FileOptions) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$FileOptions parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$FileOptions parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$FileOptions) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }

    private DescriptorProtos$FileOptions(GeneratedMessage.AbstractC3303 abstractC3303) {
        super(abstractC3303);
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
