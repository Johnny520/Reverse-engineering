package com.google.protobuf.compiler;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3594;
import com.google.protobuf.C3657;
import com.google.protobuf.C3663;
import com.google.protobuf.C3704;
import com.google.protobuf.InterfaceC3441;
import com.google.protobuf.InterfaceC3442;
import com.google.protobuf.InterfaceC3453;
import com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse;
import java.util.List;
import java.util.Map;
import p262.InterfaceC8251;

/* JADX INFO: renamed from: com.google.protobuf.compiler.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3330 extends InterfaceC3442 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* bridge */ /* synthetic */ default InterfaceC3441 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ C3663 getDescriptorForType();

    String getError();

    ByteString getErrorBytes();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    PluginProtos$CodeGeneratorResponse.File getFile(int i);

    int getFileCount();

    List<PluginProtos$CodeGeneratorResponse.File> getFileList();

    InterfaceC8251 getFileOrBuilder(int i);

    List<? extends InterfaceC8251> getFileOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    int getMaximumEdition();

    int getMinimumEdition();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    long getSupportedFeatures();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    boolean hasError();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    boolean hasMaximumEdition();

    boolean hasMinimumEdition();

    /* synthetic */ boolean hasOneof(C3594 c3594);

    boolean hasSupportedFeatures();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();
}
