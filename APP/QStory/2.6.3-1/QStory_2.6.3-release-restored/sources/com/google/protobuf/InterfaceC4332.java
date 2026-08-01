package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$MethodOptions;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4332 extends InterfaceC4459 {
    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4274
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* bridge */ /* synthetic */ default InterfaceC4273 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    boolean getDeprecated();

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ C4495 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    /* bridge */ /* synthetic */ default Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ Object getExtension(AbstractC4414 abstractC4414);

    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ Object getExtension(AbstractC4414 abstractC4414, int i);

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    /* bridge */ /* synthetic */ default int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ int getExtensionCount(AbstractC4414 abstractC4414);

    DescriptorProtos$FeatureSet getFeatures();

    InterfaceC4338 getFeaturesOrBuilder();

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    DescriptorProtos$MethodOptions.IdempotencyLevel getIdempotencyLevel();

    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ String getInitializationErrorString();

    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    InterfaceC4505 getUninterpretedOptionOrBuilder(int i);

    List<? extends InterfaceC4505> getUninterpretedOptionOrBuilderList();

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    boolean hasDeprecated();

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    /* bridge */ /* synthetic */ default boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ boolean hasExtension(AbstractC4414 abstractC4414);

    boolean hasFeatures();

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    boolean hasIdempotencyLevel();

    @Override // com.google.protobuf.InterfaceC4459
    /* synthetic */ boolean hasOneof(C4426 c4426);

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    /* bridge */ /* synthetic */ default Object getExtension(AbstractC4411 abstractC4411, int i) {
        return super.getExtension(abstractC4411, i);
    }

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    /* bridge */ /* synthetic */ default int getExtensionCount(C4448 c4448) {
        return super.getExtensionCount(c4448);
    }

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    /* bridge */ /* synthetic */ default boolean hasExtension(C4448 c4448) {
        return super.hasExtension(c4448);
    }

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    /* bridge */ /* synthetic */ default Object getExtension(C4448 c4448) {
        return super.getExtension(c4448);
    }

    @Override // com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    /* bridge */ /* synthetic */ default Object getExtension(C4448 c4448, int i) {
        return super.getExtension(c4448, i);
    }
}
