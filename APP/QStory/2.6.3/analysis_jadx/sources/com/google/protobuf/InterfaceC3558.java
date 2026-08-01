package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3558 extends InterfaceC3627 {
    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    boolean getAllowAlias();

    @Override // com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* bridge */ /* synthetic */ default InterfaceC3441 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    boolean getDeprecated();

    @Deprecated
    boolean getDeprecatedLegacyJsonFieldConflicts();

    @Override // com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ C3663 getDescriptorForType();

    /* bridge */ /* synthetic */ default Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ Object getExtension(AbstractC3582 abstractC3582);

    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ Object getExtension(AbstractC3582 abstractC3582, int i);

    /* bridge */ /* synthetic */ default int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ int getExtensionCount(AbstractC3582 abstractC3582);

    DescriptorProtos$FeatureSet getFeatures();

    InterfaceC3506 getFeaturesOrBuilder();

    @Override // com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ String getInitializationErrorString();

    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    InterfaceC3673 getUninterpretedOptionOrBuilder(int i);

    List<? extends InterfaceC3673> getUninterpretedOptionOrBuilderList();

    @Override // com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    boolean hasAllowAlias();

    boolean hasDeprecated();

    @Deprecated
    boolean hasDeprecatedLegacyJsonFieldConflicts();

    /* bridge */ /* synthetic */ default boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ boolean hasExtension(AbstractC3582 abstractC3582);

    boolean hasFeatures();

    @Override // com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    @Override // com.google.protobuf.InterfaceC3627
    /* synthetic */ boolean hasOneof(C3594 c3594);

    @Override // com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();

    /* bridge */ /* synthetic */ default Object getExtension(AbstractC3579 abstractC3579, int i) {
        return super.getExtension(abstractC3579, i);
    }

    /* bridge */ /* synthetic */ default int getExtensionCount(C3616 c3616) {
        return super.getExtensionCount(c3616);
    }

    /* bridge */ /* synthetic */ default boolean hasExtension(C3616 c3616) {
        return super.hasExtension(c3616);
    }

    /* bridge */ /* synthetic */ default Object getExtension(C3616 c3616) {
        return super.getExtension(c3616);
    }

    /* bridge */ /* synthetic */ default Object getExtension(C3616 c3616, int i) {
        return super.getExtension(c3616, i);
    }
}
