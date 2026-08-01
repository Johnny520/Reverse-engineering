package com.google.protobuf.compiler;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3593;
import com.google.protobuf.C3656;
import com.google.protobuf.C3662;
import com.google.protobuf.C3703;
import com.google.protobuf.InterfaceC3440;
import com.google.protobuf.InterfaceC3441;
import com.google.protobuf.InterfaceC3452;
import com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse;
import java.util.List;
import java.util.Map;
import p262.InterfaceC8250;

/* JADX INFO: renamed from: com.google.protobuf.compiler.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3329 extends InterfaceC3441 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* bridge */ /* synthetic */ default InterfaceC3440 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ C3662 getDescriptorForType();

    String getError();

    ByteString getErrorBytes();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    PluginProtos$CodeGeneratorResponse.File getFile(int i);

    int getFileCount();

    List<PluginProtos$CodeGeneratorResponse.File> getFileList();

    InterfaceC8250 getFileOrBuilder(int i);

    List<? extends InterfaceC8250> getFileOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    int getMaximumEdition();

    int getMinimumEdition();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    long getSupportedFeatures();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    boolean hasError();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    boolean hasMaximumEdition();

    boolean hasMinimumEdition();

    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasSupportedFeatures();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();
}
