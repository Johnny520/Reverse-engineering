package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import p203.C7878;
import p203.C7880;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2154 implements InterfaceC2147 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ConstraintWidget$DimensionBehaviour f6358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2152 f6359;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7878 f6360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f6361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2158 f6357 = new C2158(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6356 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6363 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2145 f6362 = new C2145(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2145 f6364 = new C2145(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public WidgetRun$RunType f6365 = WidgetRun$RunType.NONE;

    public AbstractC2154(C7878 c7878) {
        this.f6360 = c7878;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m3888(C2145 c2145, C2145 c21452, int i) {
        c2145.f6329.add(c21452);
        c2145.f6320 = i;
        c21452.f6328.add(c2145);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C2145 m3889(C7880 c7880) {
        C7880 c78802 = c7880.f21763;
        if (c78802 == null) {
            return null;
        }
        C7878 c7878 = c78802.f21765;
        int i = AbstractC2153.f6355[c78802.f21764.ordinal()];
        if (i == 1) {
            return c7878.f21720.f6362;
        }
        if (i == 2) {
            return c7878.f21720.f6364;
        }
        if (i == 3) {
            return c7878.f21719.f6362;
        }
        if (i == 4) {
            return c7878.f21719.f6366;
        }
        if (i != 5) {
            return null;
        }
        return c7878.f21719.f6364;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C2145 m3890(C7880 c7880, int i) {
        C7880 c78802 = c7880.f21763;
        if (c78802 == null) {
            return null;
        }
        C7878 c7878 = c78802.f21765;
        AbstractC2154 abstractC2154 = i == 0 ? c7878.f21720 : c7878.f21719;
        int i2 = AbstractC2153.f6355[c78802.f21764.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC2154.f6364;
        }
        return abstractC2154.f6362;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo3879();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo3880();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo3881();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3891(C2145 c2145, C2145 c21452, int i, C2158 c2158) {
        c2145.f6329.add(c21452);
        c2145.f6329.add(this.f6357);
        c2145.f6326 = i;
        c2145.f6330 = c2158;
        c21452.f6328.add(c2145);
        c2158.f6328.add(c2145);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m3892(int i, int i2) {
        C7878 c7878 = this.f6360;
        if (i2 == 0) {
            int i3 = c7878.f21729;
            int iMax = Math.max(c7878.f21728, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = c7878.f21711;
            int iMax2 = Math.max(c7878.f21727, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract boolean mo3884();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3893(p203.C7880 r13, p203.C7880 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.AbstractC2154.m3893(飘花落叶言子苏兰楪哲世.飘花落叶言子楪世哲苏兰, 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世哲苏兰, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public long mo3885() {
        if (this.f6357.f6331) {
            return r2.f6327;
        }
        return 0L;
    }
}
