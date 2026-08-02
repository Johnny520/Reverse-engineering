package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qg extends th1 implements j61 {
    public float v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int D(kd1 kd1Var, if1 if1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.v) : if1Var.X(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long M0(long j, boolean z) {
        int iRound;
        int iG = fz.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.v)) <= 0) {
            return 0L;
        }
        if (!z || up0.z(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long N0(long j, boolean z) {
        int iRound;
        int iH = fz.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.v)) <= 0) {
            return 0L;
        }
        if (!z || up0.z(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long O0(long j, boolean z) {
        int i = fz.i(j);
        int iRound = Math.round(i * this.v);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || up0.z(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long P0(long j, boolean z) {
        int iJ = fz.j(j);
        int iRound = Math.round(iJ / this.v);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || up0.z(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int U(kd1 kd1Var, if1 if1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.v) : if1Var.N(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        long jN0 = N0(j, true);
        if (h11.a(jN0, 0L)) {
            jN0 = M0(j, true);
            if (h11.a(jN0, 0L)) {
                jN0 = P0(j, true);
                if (h11.a(jN0, 0L)) {
                    jN0 = O0(j, true);
                    if (h11.a(jN0, 0L)) {
                        jN0 = N0(j, false);
                        if (h11.a(jN0, 0L)) {
                            jN0 = M0(j, false);
                            if (h11.a(jN0, 0L)) {
                                jN0 = P0(j, false);
                                if (h11.a(jN0, 0L)) {
                                    jN0 = O0(j, false);
                                    if (h11.a(jN0, 0L)) {
                                        jN0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!h11.a(jN0, 0L)) {
            int i = (int) (jN0 >> 32);
            int i2 = (int) (4294967295L & jN0);
            if (!((i >= 0) & (i2 >= 0))) {
                mz0.a("width and height must be >= 0");
            }
            j = gz.h(i, i, i2, i2);
        }
        sz1 sz1VarE = if1Var.e(j);
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new pg(sz1VarE, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int g(kd1 kd1Var, if1 if1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.v) : if1Var.W(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int p(kd1 kd1Var, if1 if1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.v) : if1Var.f(i);
    }
}
