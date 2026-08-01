package com.google.protobuf.compiler;

import com.google.protobuf.ByteString;
import com.google.protobuf.C4426;
import com.google.protobuf.C4489;
import com.google.protobuf.C4495;
import com.google.protobuf.C4536;
import com.google.protobuf.InterfaceC4273;
import com.google.protobuf.InterfaceC4274;
import com.google.protobuf.InterfaceC4285;
import com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse;
import java.util.List;
import java.util.Map;
import p278.InterfaceC9080;

/* JADX INFO: renamed from: com.google.protobuf.compiler.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4162 extends InterfaceC4274 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* bridge */ /* synthetic */ default InterfaceC4273 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ C4495 getDescriptorForType();

    String getError();

    ByteString getErrorBytes();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    PluginProtos$CodeGeneratorResponse.File getFile(int i);

    int getFileCount();

    List<PluginProtos$CodeGeneratorResponse.File> getFileList();

    InterfaceC9080 getFileOrBuilder(int i);

    List<? extends InterfaceC9080> getFileOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    int getMaximumEdition();

    int getMinimumEdition();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    long getSupportedFeatures();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    boolean hasError();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    boolean hasMaximumEdition();

    boolean hasMinimumEdition();

    /* synthetic */ boolean hasOneof(C4426 c4426);

    boolean hasSupportedFeatures();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();
}
