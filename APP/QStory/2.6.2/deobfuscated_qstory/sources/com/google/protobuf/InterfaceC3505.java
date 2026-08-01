package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FeatureSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3505 extends InterfaceC3626 {
    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* bridge */ /* synthetic */ default InterfaceC3440 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    DescriptorProtos$FeatureSet.VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ C3662 getDescriptorForType();

    DescriptorProtos$FeatureSet.EnforceNamingStyle getEnforceNamingStyle();

    DescriptorProtos$FeatureSet.EnumType getEnumType();

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

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    DescriptorProtos$FeatureSet.FieldPresence getFieldPresence();

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ String getInitializationErrorString();

    DescriptorProtos$FeatureSet.JsonFormat getJsonFormat();

    DescriptorProtos$FeatureSet.MessageEncoding getMessageEncoding();

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    DescriptorProtos$FeatureSet.RepeatedFieldEncoding getRepeatedFieldEncoding();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    DescriptorProtos$FeatureSet.Utf8Validation getUtf8Validation();

    boolean hasDefaultSymbolVisibility();

    boolean hasEnforceNamingStyle();

    boolean hasEnumType();

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    /* bridge */ /* synthetic */ default boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ boolean hasExtension(AbstractC3581 abstractC3581);

    @Override // com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    boolean hasFieldPresence();

    boolean hasJsonFormat();

    boolean hasMessageEncoding();

    @Override // com.google.protobuf.InterfaceC3626
    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasRepeatedFieldEncoding();

    boolean hasUtf8Validation();

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
