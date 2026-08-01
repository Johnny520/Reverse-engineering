package p278;

import com.google.protobuf.ByteString;
import com.google.protobuf.C4426;
import com.google.protobuf.C4489;
import com.google.protobuf.C4495;
import com.google.protobuf.C4536;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo;
import com.google.protobuf.InterfaceC4273;
import com.google.protobuf.InterfaceC4274;
import com.google.protobuf.InterfaceC4285;
import com.google.protobuf.InterfaceC4312;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言楪哲世苏子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9080 extends InterfaceC4274 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Map getAllFields();

    String getContent();

    ByteString getContentBytes();

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* bridge */ /* synthetic */ default InterfaceC4273 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    /* synthetic */ C4495 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ Object getField(C4489 c4489);

    DescriptorProtos$GeneratedCodeInfo getGeneratedCodeInfo();

    InterfaceC4312 getGeneratedCodeInfoOrBuilder();

    /* synthetic */ String getInitializationErrorString();

    String getInsertionPoint();

    ByteString getInsertionPointBytes();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C4489 getOneofFieldDescriptor(C4426 c4426);

    /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ C4536 getUnknownFields();

    boolean hasContent();

    @Override // com.google.protobuf.InterfaceC4274
    /* synthetic */ boolean hasField(C4489 c4489);

    boolean hasGeneratedCodeInfo();

    boolean hasInsertionPoint();

    boolean hasName();

    /* synthetic */ boolean hasOneof(C4426 c4426);

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    /* synthetic */ boolean isInitialized();
}
