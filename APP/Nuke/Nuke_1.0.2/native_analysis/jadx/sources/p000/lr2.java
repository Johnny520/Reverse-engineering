package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lr2 extends th1 implements j61 {

    /* JADX INFO: renamed from: v */
    public float f6284v;

    /* JADX INFO: renamed from: w */
    public float f6285w;

    /* JADX INFO: renamed from: x */
    public float f6286x;

    /* JADX INFO: renamed from: y */
    public float f6287y;

    /* JADX INFO: renamed from: z */
    public boolean f6288z;

    @Override // p000.j61
    /* JADX INFO: renamed from: D */
    public final int mo2360D(kd1 kd1Var, if1 if1Var, int i) {
        long jM2969M0 = m2969M0(kd1Var);
        if (C0221fz.m1760e(jM2969M0)) {
            return C0221fz.m1762g(jM2969M0);
        }
        if (!this.f6288z) {
            i = AbstractC0258gz.m2033g(jM2969M0, i);
        }
        return AbstractC0258gz.m2032f(jM2969M0, if1Var.mo2339X(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX INFO: renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m2969M0(pf1 pf1Var) {
        int iMo692T;
        int iMo692T2;
        int iMo692T3;
        int i = 0;
        if (Float.isNaN(this.f6286x)) {
            iMo692T = Integer.MAX_VALUE;
        } else {
            iMo692T = pf1Var.mo692T(this.f6286x);
            if (iMo692T < 0) {
                iMo692T = 0;
            }
        }
        if (Float.isNaN(this.f6287y)) {
            iMo692T2 = Integer.MAX_VALUE;
        } else {
            iMo692T2 = pf1Var.mo692T(this.f6287y);
            if (iMo692T2 < 0) {
                iMo692T2 = 0;
            }
        }
        if (Float.isNaN(this.f6284v)) {
            iMo692T3 = 0;
        } else {
            iMo692T3 = pf1Var.mo692T(this.f6284v);
            if (iMo692T3 < 0) {
                iMo692T3 = 0;
            }
            if (iMo692T3 > iMo692T) {
                iMo692T3 = iMo692T;
            }
            if (iMo692T3 == Integer.MAX_VALUE) {
            }
        }
        if (!Float.isNaN(this.f6285w)) {
            int iMo692T4 = pf1Var.mo692T(this.f6285w);
            if (iMo692T4 < 0) {
                iMo692T4 = 0;
            }
            if (iMo692T4 > iMo692T2) {
                iMo692T4 = iMo692T2;
            }
            if (iMo692T4 != Integer.MAX_VALUE) {
                i = iMo692T4;
            }
        }
        return AbstractC0258gz.m2027a(iMo692T3, iMo692T, i, iMo692T2);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: U */
    public final int mo2361U(kd1 kd1Var, if1 if1Var, int i) {
        long jM2969M0 = m2969M0(kd1Var);
        if (C0221fz.m1761f(jM2969M0)) {
            return C0221fz.m1763h(jM2969M0);
        }
        if (!this.f6288z) {
            i = AbstractC0258gz.m2032f(jM2969M0, i);
        }
        return AbstractC0258gz.m2033g(jM2969M0, if1Var.mo2337N(i));
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        int iM1765j;
        int iM1763h;
        int iM1764i;
        int iM1762g;
        long jM2027a;
        long jM2969M0 = m2969M0(pf1Var);
        if (this.f6288z) {
            jM2027a = AbstractC0258gz.m2031e(j, jM2969M0);
        } else {
            if (Float.isNaN(this.f6284v)) {
                iM1765j = C0221fz.m1765j(j);
                int iM1763h2 = C0221fz.m1763h(jM2969M0);
                if (iM1765j > iM1763h2) {
                    iM1765j = iM1763h2;
                }
            } else {
                iM1765j = C0221fz.m1765j(jM2969M0);
            }
            if (Float.isNaN(this.f6286x)) {
                iM1763h = C0221fz.m1763h(j);
                int iM1765j2 = C0221fz.m1765j(jM2969M0);
                if (iM1763h < iM1765j2) {
                    iM1763h = iM1765j2;
                }
            } else {
                iM1763h = C0221fz.m1763h(jM2969M0);
            }
            if (Float.isNaN(this.f6285w)) {
                iM1764i = C0221fz.m1764i(j);
                int iM1762g2 = C0221fz.m1762g(jM2969M0);
                if (iM1764i > iM1762g2) {
                    iM1764i = iM1762g2;
                }
            } else {
                iM1764i = C0221fz.m1764i(jM2969M0);
            }
            if (Float.isNaN(this.f6287y)) {
                iM1762g = C0221fz.m1762g(j);
                int iM1764i2 = C0221fz.m1764i(jM2969M0);
                if (iM1762g < iM1764i2) {
                    iM1762g = iM1764i2;
                }
            } else {
                iM1762g = C0221fz.m1762g(jM2969M0);
            }
            jM2027a = AbstractC0258gz.m2027a(iM1765j, iM1763h, iM1764i, iM1762g);
        }
        sz1 sz1VarMo2340e = if1Var.mo2340e(jM2027a);
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0579pg(sz1VarMo2340e, 5));
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: g */
    public final int mo2362g(kd1 kd1Var, if1 if1Var, int i) {
        long jM2969M0 = m2969M0(kd1Var);
        if (C0221fz.m1761f(jM2969M0)) {
            return C0221fz.m1763h(jM2969M0);
        }
        if (!this.f6288z) {
            i = AbstractC0258gz.m2032f(jM2969M0, i);
        }
        return AbstractC0258gz.m2033g(jM2969M0, if1Var.mo2338W(i));
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: p */
    public final int mo2363p(kd1 kd1Var, if1 if1Var, int i) {
        long jM2969M0 = m2969M0(kd1Var);
        if (C0221fz.m1760e(jM2969M0)) {
            return C0221fz.m1762g(jM2969M0);
        }
        if (!this.f6288z) {
            i = AbstractC0258gz.m2033g(jM2969M0, i);
        }
        return AbstractC0258gz.m2032f(jM2969M0, if1Var.mo2341f(i));
    }
}
