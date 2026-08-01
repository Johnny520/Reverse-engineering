package p167;

import android.util.SparseArray;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7696 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7698 f20885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SparseArray f20886;

    public C7696(int i) {
        this.f20886 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12964(C7698 c7698, int i, int i2) {
        int iM12966 = c7698.m12966(i);
        SparseArray sparseArray = this.f20886;
        C7696 c7696 = sparseArray == null ? null : (C7696) sparseArray.get(iM12966);
        if (c7696 == null) {
            c7696 = new C7696(1);
            sparseArray.put(c7698.m12966(i), c7696);
        }
        if (i2 > i) {
            c7696.m12964(c7698, i + 1, i2);
        } else {
            c7696.f20885 = c7698;
        }
    }
}
