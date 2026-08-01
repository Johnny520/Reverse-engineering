package p167;

import android.util.SparseArray;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7697 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7699 f20880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SparseArray f20881;

    public C7697(int i) {
        this.f20881 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12994(C7699 c7699, int i, int i2) {
        int iM12996 = c7699.m12996(i);
        SparseArray sparseArray = this.f20881;
        C7697 c7697 = sparseArray == null ? null : (C7697) sparseArray.get(iM12996);
        if (c7697 == null) {
            c7697 = new C7697(1);
            sparseArray.put(c7699.m12996(i), c7697);
        }
        if (i2 > i) {
            c7697.m12994(c7699, i + 1, i2);
        } else {
            c7697.f20880 = c7699;
        }
    }
}
