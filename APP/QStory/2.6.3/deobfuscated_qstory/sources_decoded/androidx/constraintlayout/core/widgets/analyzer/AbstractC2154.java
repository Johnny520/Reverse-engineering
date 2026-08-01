package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import p203.C7879;
import p203.C7881;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2154 implements InterfaceC2147 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ConstraintWidget$DimensionBehaviour f6359;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2152 f6360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7879 f6361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f6362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2158 f6358 = new C2158(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6357 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6364 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2145 f6363 = new C2145(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2145 f6365 = new C2145(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public WidgetRun$RunType f6366 = WidgetRun$RunType.NONE;

    public AbstractC2154(C7879 c7879) {
        this.f6361 = c7879;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m3898(C2145 c2145, C2145 c21452, int i) {
        c2145.f6330.add(c21452);
        c2145.f6321 = i;
        c21452.f6329.add(c2145);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C2145 m3899(C7881 c7881) {
        C7881 c78812 = c7881.f21760;
        if (c78812 == null) {
            return null;
        }
        C7879 c7879 = c78812.f21762;
        int i = AbstractC2153.f6356[c78812.f21761.ordinal()];
        if (i == 1) {
            return c7879.f21717.f6363;
        }
        if (i == 2) {
            return c7879.f21717.f6365;
        }
        if (i == 3) {
            return c7879.f21716.f6363;
        }
        if (i == 4) {
            return c7879.f21716.f6367;
        }
        if (i != 5) {
            return null;
        }
        return c7879.f21716.f6365;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C2145 m3900(C7881 c7881, int i) {
        C7881 c78812 = c7881.f21760;
        if (c78812 == null) {
            return null;
        }
        C7879 c7879 = c78812.f21762;
        AbstractC2154 abstractC2154 = i == 0 ? c7879.f21717 : c7879.f21716;
        int i2 = AbstractC2153.f6356[c78812.f21761.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC2154.f6365;
        }
        return abstractC2154.f6363;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo3889();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo3890();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo3891();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3901(C2145 c2145, C2145 c21452, int i, C2158 c2158) {
        c2145.f6330.add(c21452);
        c2145.f6330.add(this.f6358);
        c2145.f6327 = i;
        c2145.f6331 = c2158;
        c21452.f6329.add(c2145);
        c2158.f6329.add(c2145);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m3902(int i, int i2) {
        C7879 c7879 = this.f6361;
        if (i2 == 0) {
            int i3 = c7879.f21726;
            int iMax = Math.max(c7879.f21725, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = c7879.f21708;
            int iMax2 = Math.max(c7879.f21724, i);
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
    public abstract boolean mo3894();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3903(p203.C7881 r13, p203.C7881 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.AbstractC2154.m3903(飘花落叶言子苏兰楪哲世.飘花落叶言子楪世哲苏兰, 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世哲苏兰, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public long mo3895() {
        if (this.f6358.f6332) {
            return r2.f6328;
        }
        return 0L;
    }
}
