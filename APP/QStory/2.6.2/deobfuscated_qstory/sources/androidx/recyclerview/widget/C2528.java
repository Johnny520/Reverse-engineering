package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Set f7622;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7623;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public SparseArray f7624;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2529 m5018(int i) {
        SparseArray sparseArray = this.f7624;
        C2529 c2529 = (C2529) sparseArray.get(i);
        if (c2529 != null) {
            return c2529;
        }
        C2529 c25292 = new C2529();
        sparseArray.put(i, c25292);
        return c25292;
    }
}
