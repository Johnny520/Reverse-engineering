package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 extends th1 implements j61 {

    /* JADX INFO: renamed from: v */
    public t80 f13917v;

    /* JADX INFO: renamed from: w */
    public float f13918w;

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        int iM1765j;
        int iM1763h;
        int iM1762g;
        int i;
        if (!C0221fz.m1759d(j) || this.f13917v == t80.f10603h) {
            iM1765j = C0221fz.m1765j(j);
            iM1763h = C0221fz.m1763h(j);
        } else {
            int iRound = Math.round(C0221fz.m1763h(j) * this.f13918w);
            int iM1765j2 = C0221fz.m1765j(j);
            iM1765j = C0221fz.m1763h(j);
            if (iRound < iM1765j2) {
                iRound = iM1765j2;
            }
            if (iRound <= iM1765j) {
                iM1765j = iRound;
            }
            iM1763h = iM1765j;
        }
        if (!C0221fz.m1758c(j) || this.f13917v == t80.f10604i) {
            int iM1764i = C0221fz.m1764i(j);
            int iM1762g2 = C0221fz.m1762g(j);
            iM1762g = iM1764i;
            i = iM1762g2;
        } else {
            int iRound2 = Math.round(C0221fz.m1762g(j) * this.f13918w);
            int iM1764i2 = C0221fz.m1764i(j);
            iM1762g = C0221fz.m1762g(j);
            if (iRound2 < iM1764i2) {
                iRound2 = iM1764i2;
            }
            if (iRound2 <= iM1762g) {
                iM1762g = iRound2;
            }
            i = iM1762g;
        }
        sz1 sz1VarMo2340e = if1Var.mo2340e(AbstractC0258gz.m2027a(iM1765j, iM1763h, iM1762g, i));
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0579pg(sz1VarMo2340e, 1));
    }
}
