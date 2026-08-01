package p262;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3594;
import com.google.protobuf.C3657;
import com.google.protobuf.C3663;
import com.google.protobuf.C3704;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.InterfaceC3441;
import com.google.protobuf.InterfaceC3442;
import com.google.protobuf.InterfaceC3453;
import com.google.protobuf.InterfaceC3493;
import com.google.protobuf.compiler.PluginProtos$Version;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言楪哲世苏子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8252 extends InterfaceC3442 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    PluginProtos$Version getCompilerVersion();

    InterfaceC8250 getCompilerVersionOrBuilder();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* bridge */ /* synthetic */ default InterfaceC3441 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    /* synthetic */ C3663 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Object getField(C3657 c3657);

    String getFileToGenerate(int i);

    ByteString getFileToGenerateBytes(int i);

    int getFileToGenerateCount();

    List<String> getFileToGenerateList();

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    String getParameter();

    ByteString getParameterBytes();

    DescriptorProtos$FileDescriptorProto getProtoFile(int i);

    int getProtoFileCount();

    List<DescriptorProtos$FileDescriptorProto> getProtoFileList();

    InterfaceC3493 getProtoFileOrBuilder(int i);

    List<? extends InterfaceC3493> getProtoFileOrBuilderList();

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    DescriptorProtos$FileDescriptorProto getSourceFileDescriptors(int i);

    int getSourceFileDescriptorsCount();

    List<DescriptorProtos$FileDescriptorProto> getSourceFileDescriptorsList();

    InterfaceC3493 getSourceFileDescriptorsOrBuilder(int i);

    List<? extends InterfaceC3493> getSourceFileDescriptorsOrBuilderList();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    boolean hasCompilerVersion();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    /* synthetic */ boolean hasOneof(C3594 c3594);

    boolean hasParameter();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();
}
