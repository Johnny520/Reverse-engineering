package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lr2 extends th1 implements j61 {
    public float v;
    public float w;
    public float x;
    public float y;
    public boolean z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int D(kd1 kd1Var, if1 if1Var, int i) {
        long jM0 = M0(kd1Var);
        if (fz.e(jM0)) {
            return fz.g(jM0);
        }
        if (!this.z) {
            i = gz.g(jM0, i);
        }
        return gz.f(jM0, if1Var.X(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long M0(pf1 pf1Var) {
        int iT;
        int iT2;
        int iT3;
        int i = 0;
        if (Float.isNaN(this.x)) {
            iT = Integer.MAX_VALUE;
        } else {
            iT = pf1Var.T(this.x);
            if (iT < 0) {
                iT = 0;
            }
        }
        if (Float.isNaN(this.y)) {
            iT2 = Integer.MAX_VALUE;
        } else {
            iT2 = pf1Var.T(this.y);
            if (iT2 < 0) {
                iT2 = 0;
            }
        }
        if (Float.isNaN(this.v)) {
            iT3 = 0;
        } else {
            iT3 = pf1Var.T(this.v);
            if (iT3 < 0) {
                iT3 = 0;
            }
            if (iT3 > iT) {
                iT3 = iT;
            }
            if (iT3 == Integer.MAX_VALUE) {
            }
        }
        if (!Float.isNaN(this.w)) {
            int iT4 = pf1Var.T(this.w);
            if (iT4 < 0) {
                iT4 = 0;
            }
            if (iT4 > iT2) {
                iT4 = iT2;
            }
            if (iT4 != Integer.MAX_VALUE) {
                i = iT4;
            }
        }
        return gz.a(iT3, iT, i, iT2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int U(kd1 kd1Var, if1 if1Var, int i) {
        long jM0 = M0(kd1Var);
        if (fz.f(jM0)) {
            return fz.h(jM0);
        }
        if (!this.z) {
            i = gz.f(jM0, i);
        }
        return gz.g(jM0, if1Var.N(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jM0 = M0(pf1Var);
        if (this.z) {
            jA = gz.e(j, jM0);
        } else {
            if (Float.isNaN(this.v)) {
                iJ = fz.j(j);
                int iH2 = fz.h(jM0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = fz.j(jM0);
            }
            if (Float.isNaN(this.x)) {
                iH = fz.h(j);
                int iJ2 = fz.j(jM0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = fz.h(jM0);
            }
            if (Float.isNaN(this.w)) {
                i = fz.i(j);
                int iG2 = fz.g(jM0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = fz.i(jM0);
            }
            if (Float.isNaN(this.y)) {
                iG = fz.g(j);
                int i2 = fz.i(jM0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = fz.g(jM0);
            }
            jA = gz.a(iJ, iH, i, iG);
        }
        sz1 sz1VarE = if1Var.e(jA);
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new pg(sz1VarE, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int g(kd1 kd1Var, if1 if1Var, int i) {
        long jM0 = M0(kd1Var);
        if (fz.f(jM0)) {
            return fz.h(jM0);
        }
        if (!this.z) {
            i = gz.f(jM0, i);
        }
        return gz.g(jM0, if1Var.W(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int p(kd1 kd1Var, if1 if1Var, int i) {
        long jM0 = M0(kd1Var);
        if (fz.e(jM0)) {
            return fz.g(jM0);
        }
        if (!this.z) {
            i = gz.g(jM0, i);
        }
        return gz.f(jM0, if1Var.f(i));
    }
}
