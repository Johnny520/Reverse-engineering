package androidx.compose.p001ui.semantics;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2770 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Comparator f6039;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Comparator f6040;

    public C2770(Comparator comparator, Comparator comparator2) {
        this.f6040 = comparator;
        this.f6039 = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f6040.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        return this.f6039.compare(((C2788) obj).f6115, ((C2788) obj2).f6115);
    }
}
