package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4724 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f13793;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f13794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final WireFormat$FieldType f13796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4723 f13797;

    public C4724(InterfaceC4723 interfaceC4723, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
        this.f13797 = interfaceC4723;
        this.f13795 = i;
        this.f13796 = wireFormat$FieldType;
        this.f13794 = z;
        this.f13793 = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13795 - ((C4724) obj).f13795;
    }
}
