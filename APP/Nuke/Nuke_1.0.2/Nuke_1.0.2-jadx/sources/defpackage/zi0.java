package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 extends th1 implements j61 {
    public t80 v;
    public float w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!fz.d(j) || this.v == t80.h) {
            iJ = fz.j(j);
            iH = fz.h(j);
        } else {
            int iRound = Math.round(fz.h(j) * this.w);
            int iJ2 = fz.j(j);
            iJ = fz.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!fz.c(j) || this.v == t80.i) {
            int i2 = fz.i(j);
            int iG2 = fz.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(fz.g(j) * this.w);
            int i3 = fz.i(j);
            iG = fz.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        sz1 sz1VarE = if1Var.e(gz.a(iJ, iH, iG, i));
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new pg(sz1VarE, 1));
    }
}
