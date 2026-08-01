package p183;

import android.util.SparseArray;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8526 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8528 f21225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SparseArray f21226;

    public C8526(int i) {
        this.f21226 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13553(C8528 c8528, int i, int i2) {
        int iM13555 = c8528.m13555(i);
        SparseArray sparseArray = this.f21226;
        C8526 c8526 = sparseArray == null ? null : (C8526) sparseArray.get(iM13555);
        if (c8526 == null) {
            c8526 = new C8526(1);
            sparseArray.put(c8528.m13555(i), c8526);
        }
        if (i2 > i) {
            c8526.m13553(c8528, i + 1, i2);
        } else {
            c8526.f21225 = c8528;
        }
    }
}
