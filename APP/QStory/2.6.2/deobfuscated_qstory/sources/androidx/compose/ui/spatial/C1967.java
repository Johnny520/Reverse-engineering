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
import p175.AbstractC7738;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1967 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f5842;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f5843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C1967 f5844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0002 f5845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0704 f5846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5847;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ C1966 f5848;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f5849 = Long.MIN_VALUE;

    public C1967(C1966 c1966, int i, C0704 c0704, C0002 c0002) {
        this.f5848 = c1966;
        this.f5847 = i;
        this.f5846 = c0704;
        this.f5845 = c0002;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3684() {
        C1966 c1966 = this.f5848;
        C0246 c0246 = c1966.f5840;
        int i = this.f5847;
        C1967 c1967 = (C1967) c0246.m790(i);
        if (c1967 != null) {
            if (c1967 == this) {
                C1967 c19672 = this.f5844;
                this.f5844 = null;
                if (c19672 == null) {
                    C1748 c1748M3336 = AbstractC1785.m3336(this.f5846.f6291);
                    if (c1748M3336.f5121) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748M3336)).getRectManager().f5822.m572(c1748M3336.f5122, false);
                        return;
                    }
                    return;
                }
                int iM787 = c0246.m787(i);
                Object[] objArr = c0246.f972;
                Object obj = objArr[iM787];
                c0246.f973[iM787] = i;
                objArr[iM787] = c19672;
                return;
            }
            int iM7872 = c0246.m787(i);
            Object[] objArr2 = c0246.f972;
            Object obj2 = objArr2[iM7872];
            c0246.f973[iM7872] = i;
            objArr2[iM7872] = c1967;
            while (true) {
                C1967 c19673 = c1967.f5844;
                if (c19673 == null) {
                    break;
                }
                if (c19673 == this) {
                    c1967.f5844 = this.f5844;
                    this.f5844 = null;
                    return;
                }
                c1967 = c19673;
            }
        }
        C1967 c19674 = c1966.f5839;
        if (c19674 == this) {
            c1966.f5839 = c19674.f5844;
            this.f5844 = null;
            return;
        }
        C1967 c19675 = c19674 != null ? c19674.f5844 : null;
        while (true) {
            C1967 c19676 = c19674;
            c19674 = c19675;
            if (c19674 == null) {
                return;
            }
            if (c19674 == this) {
                if (c19676 != null) {
                    c19676.f5844 = c19674.f5844;
                }
                this.f5844 = null;
                return;
            }
            c19675 = c19674.f5844;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3685(long j, long j2, long j3, long j4, float[] fArr) {
        C1960 c1960;
        C1960 c19602;
        long j5 = this.f5848.f5835;
        C0704 c0704 = this.f5846;
        AbstractC1794 abstractC1794M3338 = AbstractC1785.m3338(c0704, 2);
        C1748 c1748M3336 = AbstractC1785.m3336(c0704);
        boolean zM3232 = c1748M3336.m3232();
        C1811 c1811 = c1748M3336.f5093;
        if (zM3232) {
            if (c1811.f5284 != abstractC1794M3338) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = abstractC1794M3338.f4997;
                AbstractC1794 abstractC1794 = c1811.f5284;
                abstractC1794.getClass();
                long jM13022 = AbstractC7738.m13022(abstractC1794.mo3075(abstractC1794M3338, jFloatToRawIntBits));
                c1960 = new C1960(jM13022, (4294967295L & ((long) (((int) (jM13022 & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jM13022 >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, c0704);
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
        this.f5845.invoke(c19602);
    }
}
