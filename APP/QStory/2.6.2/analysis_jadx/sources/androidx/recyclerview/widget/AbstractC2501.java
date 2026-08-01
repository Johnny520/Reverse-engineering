package androidx.recyclerview.widget;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2501 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SparseIntArray f7488 = new SparseIntArray();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SparseIntArray f7487 = new SparseIntArray();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4949() {
        this.f7488.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract int mo4950(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo4951(int i, int i2) {
        int iMo4950 = mo4950(i);
        if (iMo4950 == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int iMo49502 = mo4950(i4);
            i3 += iMo49502;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = iMo49502;
            }
        }
        if (iMo4950 + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m4952(int i, int i2) {
        int iMo4950 = mo4950(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int iMo49502 = mo4950(i5);
            i3 += iMo49502;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = iMo49502;
            }
        }
        return i3 + iMo4950 > i2 ? i4 + 1 : i4;
    }
}
