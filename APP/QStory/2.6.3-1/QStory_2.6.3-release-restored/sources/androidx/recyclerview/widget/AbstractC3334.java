package androidx.recyclerview.widget;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3334 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SparseIntArray f7834 = new SparseIntArray();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SparseIntArray f7833 = new SparseIntArray();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5519() {
        this.f7834.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract int mo5520(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo5521(int i, int i2) {
        int iMo5520 = mo5520(i);
        if (iMo5520 == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int iMo55202 = mo5520(i4);
            i3 += iMo55202;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = iMo55202;
            }
        }
        if (iMo5520 + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m5522(int i, int i2) {
        int iMo5520 = mo5520(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int iMo55202 = mo5520(i5);
            i3 += iMo55202;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = iMo55202;
            }
        }
        return i3 + iMo5520 > i2 ? i4 + 1 : i4;
    }
}
