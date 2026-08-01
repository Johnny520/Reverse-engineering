package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3494 extends InterfaceC3626 {
    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    boolean getCcEnableArenas();

    boolean getCcGenericServices();

    String getCsharpNamespace();

    ByteString getCsharpNamespaceBytes();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* bridge */ /* synthetic */ default InterfaceC3440 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    boolean getDeprecated();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ C3662 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    /* bridge */ /* synthetic */ default Object getExtension(AbstractC3578 abstractC3578) {
        return super.getExtension(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ Object getExtension(AbstractC3581 abstractC3581);

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ Object getExtension(AbstractC3581 abstractC3581, int i);

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    /* bridge */ /* synthetic */ default int getExtensionCount(AbstractC3578 abstractC3578) {
        return super.getExtensionCount(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ int getExtensionCount(AbstractC3581 abstractC3581);

    DescriptorProtos$FeatureSet getFeatures();

    InterfaceC3505 getFeaturesOrBuilder();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    String getGoPackage();

    ByteString getGoPackageBytes();

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ String getInitializationErrorString();

    @Deprecated
    boolean getJavaGenerateEqualsAndHash();

    boolean getJavaGenericServices();

    boolean getJavaMultipleFiles();

    String getJavaOuterClassname();

    ByteString getJavaOuterClassnameBytes();

    String getJavaPackage();

    ByteString getJavaPackageBytes();

    boolean getJavaStringCheckUtf8();

    String getObjcClassPrefix();

    ByteString getObjcClassPrefixBytes();

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    DescriptorProtos$FileOptions.OptimizeMode getOptimizeFor();

    String getPhpClassPrefix();

    ByteString getPhpClassPrefixBytes();

    String getPhpMetadataNamespace();

    ByteString getPhpMetadataNamespaceBytes();

    String getPhpNamespace();

    ByteString getPhpNamespaceBytes();

    boolean getPyGenericServices();

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    String getRubyPackage();

    ByteString getRubyPackageBytes();

    String getSwiftPrefix();

    ByteString getSwiftPrefixBytes();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    InterfaceC3672 getUninterpretedOptionOrBuilder(int i);

    List<? extends InterfaceC3672> getUninterpretedOptionOrBuilderList();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    boolean hasCcEnableArenas();

    boolean hasCcGenericServices();

    boolean hasCsharpNamespace();

    boolean hasDeprecated();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    /* bridge */ /* synthetic */ default boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ boolean hasExtension(AbstractC3581 abstractC3581);

    boolean hasFeatures();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    boolean hasGoPackage();

    @Deprecated
    boolean hasJavaGenerateEqualsAndHash();

    boolean hasJavaGenericServices();

    boolean hasJavaMultipleFiles();

    boolean hasJavaOuterClassname();

    boolean hasJavaPackage();

    boolean hasJavaStringCheckUtf8();

    boolean hasObjcClassPrefix();

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasOptimizeFor();

    boolean hasPhpClassPrefix();

    boolean hasPhpMetadataNamespace();

    boolean hasPhpNamespace();

    boolean hasPyGenericServices();

    boolean hasRubyPackage();

    boolean hasSwiftPrefix();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    /* bridge */ /* synthetic */ default Object getExtension(AbstractC3578 abstractC3578, int i) {
        return super.getExtension(abstractC3578, i);
    }

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    /* bridge */ /* synthetic */ default int getExtensionCount(C3615 c3615) {
        return super.getExtensionCount(c3615);
    }

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    /* bridge */ /* synthetic */ default boolean hasExtension(C3615 c3615) {
        return super.hasExtension(c3615);
    }

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    /* bridge */ /* synthetic */ default Object getExtension(C3615 c3615) {
        return super.getExtension(c3615);
    }

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    /* bridge */ /* synthetic */ default Object getExtension(C3615 c3615, int i) {
        return super.getExtension(c3615, i);
    }
}
