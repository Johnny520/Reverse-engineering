package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4723 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f13789;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f13790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13791;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final WireFormat$FieldType f13792;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4722 f13793;

    public C4723(InterfaceC4722 interfaceC4722, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
        this.f13793 = interfaceC4722;
        this.f13791 = i;
        this.f13792 = wireFormat$FieldType;
        this.f13790 = z;
        this.f13789 = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13791 - ((C4723) obj).f13791;
    }
}
