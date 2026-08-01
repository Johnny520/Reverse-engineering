package p262;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3594;
import com.google.protobuf.C3657;
import com.google.protobuf.C3663;
import com.google.protobuf.C3704;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo;
import com.google.protobuf.InterfaceC3441;
import com.google.protobuf.InterfaceC3442;
import com.google.protobuf.InterfaceC3453;
import com.google.protobuf.InterfaceC3480;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言楪哲世苏子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8251 extends InterfaceC3442 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ Map getAllFields();

    String getContent();

    ByteString getContentBytes();

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

    DescriptorProtos$GeneratedCodeInfo getGeneratedCodeInfo();

    InterfaceC3480 getGeneratedCodeInfoOrBuilder();

    /* synthetic */ String getInitializationErrorString();

    String getInsertionPoint();

    ByteString getInsertionPointBytes();

    String getName();

    ByteString getNameBytes();

    /* synthetic */ C3657 getOneofFieldDescriptor(C3594 c3594);

    /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ C3704 getUnknownFields();

    boolean hasContent();

    @Override // com.google.protobuf.InterfaceC3442
    /* synthetic */ boolean hasField(C3657 c3657);

    boolean hasGeneratedCodeInfo();

    boolean hasInsertionPoint();

    boolean hasName();

    /* synthetic */ boolean hasOneof(C3594 c3594);

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    /* synthetic */ boolean isInitialized();
}
