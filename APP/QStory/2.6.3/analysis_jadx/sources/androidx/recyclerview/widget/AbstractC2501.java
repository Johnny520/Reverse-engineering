package androidx.recyclerview.widget;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2501 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SparseIntArray f7489 = new SparseIntArray();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SparseIntArray f7488 = new SparseIntArray();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4959() {
        this.f7489.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract int mo4960(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo4961(int i, int i2) {
        int iMo4960 = mo4960(i);
        if (iMo4960 == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int iMo49602 = mo4960(i4);
            i3 += iMo49602;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = iMo49602;
            }
        }
        if (iMo4960 + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m4962(int i, int i2) {
        int iMo4960 = mo4960(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int iMo49602 = mo4960(i5);
            i3 += iMo49602;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = iMo49602;
            }
        }
        return i3 + iMo4960 > i2 ? i4 + 1 : i4;
    }
}
