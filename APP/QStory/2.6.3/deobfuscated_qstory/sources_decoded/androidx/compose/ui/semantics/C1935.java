package androidx.compose.ui.semantics;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1935 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Comparator f5694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Comparator f5695;

    public C1935(Comparator comparator, Comparator comparator2) {
        this.f5695 = comparator;
        this.f5694 = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f5695.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        return this.f5694.compare(((C1953) obj).f5770, ((C1953) obj2).f5770);
    }
}
