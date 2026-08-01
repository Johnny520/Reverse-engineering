package androidx.compose.ui.semantics;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1935 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Comparator f5693;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Comparator f5694;

    public C1935(Comparator comparator, Comparator comparator2) {
        this.f5694 = comparator;
        this.f5693 = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f5694.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        return this.f5693.compare(((C1953) obj).f5769, ((C1953) obj2).f5769);
    }
}
