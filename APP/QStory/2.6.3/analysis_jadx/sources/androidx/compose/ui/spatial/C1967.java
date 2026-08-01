package androidx.compose.ui.spatial;

import androidx.activity.compose.C0002;
import androidx.collection.C0246;
import androidx.compose.foundation.lazy.layout.C0704;
import androidx.compose.ui.node.AbstractC1757;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1967 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f5843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f5844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C1967 f5845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0002 f5846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0704 f5847;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5848;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ C1966 f5849;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f5850 = Long.MIN_VALUE;

    public C1967(C1966 c1966, int i, C0704 c0704, C0002 c0002) {
        this.f5849 = c1966;
        this.f5848 = i;
        this.f5847 = c0704;
        this.f5846 = c0002;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3694() {
        C1966 c1966 = this.f5849;
        C0246 c0246 = c1966.f5841;
        int i = this.f5848;
        C1967 c1967 = (C1967) c0246.m791(i);
        if (c1967 != null) {
            if (c1967 == this) {
                C1967 c19672 = this.f5845;
                this.f5845 = null;
                if (c19672 == null) {
                    C1748 c1748M3346 = AbstractC1785.m3346(this.f5847.f6292);
                    if (c1748M3346.f5122) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748M3346)).getRectManager().f5823.m573(c1748M3346.f5123, false);
                        return;
                    }
                    return;
                }
                int iM788 = c0246.m788(i);
                Object[] objArr = c0246.f972;
                Object obj = objArr[iM788];
                c0246.f973[iM788] = i;
                objArr[iM788] = c19672;
                return;
            }
            int iM7882 = c0246.m788(i);
            Object[] objArr2 = c0246.f972;
            Object obj2 = objArr2[iM7882];
            c0246.f973[iM7882] = i;
            objArr2[iM7882] = c1967;
            while (true) {
                C1967 c19673 = c1967.f5845;
                if (c19673 == null) {
                    break;
                }
                if (c19673 == this) {
                    c1967.f5845 = this.f5845;
                    this.f5845 = null;
                    return;
                }
                c1967 = c19673;
            }
        }
        C1967 c19674 = c1966.f5840;
        if (c19674 == this) {
            c1966.f5840 = c19674.f5845;
            this.f5845 = null;
            return;
        }
        C1967 c19675 = c19674 != null ? c19674.f5845 : null;
        while (true) {
            C1967 c19676 = c19674;
            c19674 = c19675;
            if (c19674 == null) {
                return;
            }
            if (c19674 == this) {
                if (c19676 != null) {
                    c19676.f5845 = c19674.f5845;
                }
                this.f5845 = null;
                return;
            }
            c19675 = c19674.f5845;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3695(long j, long j2, long j3, long j4, float[] fArr) {
        C1960 c1960;
        C1960 c19602;
        long j5 = this.f5849.f5836;
        C0704 c0704 = this.f5847;
        AbstractC1794 abstractC1794M3348 = AbstractC1785.m3348(c0704, 2);
        C1748 c1748M3346 = AbstractC1785.m3346(c0704);
        boolean zM3242 = c1748M3346.m3242();
        C1811 c1811 = c1748M3346.f5094;
        if (zM3242) {
            if (c1811.f5285 != abstractC1794M3348) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = abstractC1794M3348.f4998;
                AbstractC1794 abstractC1794 = c1811.f5285;
                abstractC1794.getClass();
                long jM13681 = AbstractC8190.m13681(abstractC1794.mo3085(abstractC1794M3348, jFloatToRawIntBits));
                c1960 = new C1960(jM13681, (4294967295L & ((long) (((int) (jM13681 & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jM13681 >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, c0704);
            } else {
                c1960 = new C1960(j, j2, j3, j4, j5, fArr, c0704);
            }
            c19602 = c1960;
        } else {
            c19602 = null;
        }
        if (c19602 == null) {
            return;
        }
        this.f5846.invoke(c19602);
    }
}
