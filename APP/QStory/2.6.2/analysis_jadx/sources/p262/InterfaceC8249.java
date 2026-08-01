package p262;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3593;
import com.google.protobuf.C3656;
import com.google.protobuf.C3662;
import com.google.protobuf.C3703;
import com.google.protobuf.InterfaceC3440;
import com.google.protobuf.InterfaceC3441;
import com.google.protobuf.InterfaceC3452;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言楪哲世苏子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8249 extends InterfaceC3441 {
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

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    /* synthetic */ String getInitializationErrorString();

    int getMajor();

    int getMinor();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    int getPatch();

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    String getSuffix();

    ByteString getSuffixBytes();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    boolean hasMajor();

    boolean hasMinor();

    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasPatch();

    boolean hasSuffix();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();
}
