package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5556 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f14138;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14139;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14140;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final WireFormat$FieldType f14141;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5555 f14142;

    public C5556(InterfaceC5555 interfaceC5555, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
        this.f14142 = interfaceC5555;
        this.f14140 = i;
        this.f14141 = wireFormat$FieldType;
        this.f14139 = z;
        this.f14138 = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14140 - ((C5556) obj).f14140;
    }
}
