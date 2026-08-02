package p000;

/* JADX INFO: renamed from: qg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0618qg extends th1 implements j61 {

    /* JADX INFO: renamed from: v */
    public float f8956v;

    @Override // p000.j61
    /* JADX INFO: renamed from: D */
    public final int mo2360D(kd1 kd1Var, if1 if1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f8956v) : if1Var.mo2339X(i);
    }

    /* JADX INFO: renamed from: M0 */
    public final long m4177M0(long j, boolean z) {
        int iRound;
        int iM1762g = C0221fz.m1762g(j);
        if (iM1762g == Integer.MAX_VALUE || (iRound = Math.round(iM1762g * this.f8956v)) <= 0) {
            return 0L;
        }
        if (!z || up0.m5560z(iRound, iM1762g, j)) {
            return (((long) iRound) << 32) | (((long) iM1762g) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N0 */
    public final long m4178N0(long j, boolean z) {
        int iRound;
        int iM1763h = C0221fz.m1763h(j);
        if (iM1763h == Integer.MAX_VALUE || (iRound = Math.round(iM1763h / this.f8956v)) <= 0) {
            return 0L;
        }
        if (!z || up0.m5560z(iM1763h, iRound, j)) {
            return (((long) iM1763h) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: O0 */
    public final long m4179O0(long j, boolean z) {
        int iM1764i = C0221fz.m1764i(j);
        int iRound = Math.round(iM1764i * this.f8956v);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || up0.m5560z(iRound, iM1764i, j)) {
            return (((long) iRound) << 32) | (((long) iM1764i) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: P0 */
    public final long m4180P0(long j, boolean z) {
        int iM1765j = C0221fz.m1765j(j);
        int iRound = Math.round(iM1765j / this.f8956v);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || up0.m5560z(iM1765j, iRound, j)) {
            return (((long) iM1765j) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: U */
    public final int mo2361U(kd1 kd1Var, if1 if1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f8956v) : if1Var.mo2337N(i);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        long jM4178N0 = m4178N0(j, true);
        if (h11.m2041a(jM4178N0, 0L)) {
            jM4178N0 = m4177M0(j, true);
            if (h11.m2041a(jM4178N0, 0L)) {
                jM4178N0 = m4180P0(j, true);
                if (h11.m2041a(jM4178N0, 0L)) {
                    jM4178N0 = m4179O0(j, true);
                    if (h11.m2041a(jM4178N0, 0L)) {
                        jM4178N0 = m4178N0(j, false);
                        if (h11.m2041a(jM4178N0, 0L)) {
                            jM4178N0 = m4177M0(j, false);
                            if (h11.m2041a(jM4178N0, 0L)) {
                                jM4178N0 = m4180P0(j, false);
                                if (h11.m2041a(jM4178N0, 0L)) {
                                    jM4178N0 = m4179O0(j, false);
                                    if (h11.m2041a(jM4178N0, 0L)) {
                                        jM4178N0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!h11.m2041a(jM4178N0, 0L)) {
            int i = (int) (jM4178N0 >> 32);
            int i2 = (int) (4294967295L & jM4178N0);
            if (!((i >= 0) & (i2 >= 0))) {
                mz0.m3220a("width and height must be >= 0");
            }
            j = AbstractC0258gz.m2034h(i, i, i2, i2);
        }
        sz1 sz1VarMo2340e = if1Var.mo2340e(j);
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0579pg(sz1VarMo2340e, 0));
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: g */
    public final int mo2362g(kd1 kd1Var, if1 if1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f8956v) : if1Var.mo2338W(i);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: p */
    public final int mo2363p(kd1 kd1Var, if1 if1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f8956v) : if1Var.mo2341f(i);
    }
}
