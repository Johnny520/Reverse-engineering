package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r11 extends th1 implements j61 {
    public o11 v;
    public boolean w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int D(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.X(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int U(kd1 kd1Var, if1 if1Var, int i) {
        return this.v == o11.h ? if1Var.N(i) : if1Var.W(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        int iN = this.v == o11.h ? if1Var.N(fz.g(j)) : if1Var.W(fz.g(j));
        if (iN < 0) {
            iN = 0;
        }
        if (iN < 0) {
            mz0.a("width must be >= 0");
        }
        long jH = gz.h(iN, iN, 0, Integer.MAX_VALUE);
        if (this.w) {
            jH = gz.e(j, jH);
        }
        sz1 sz1VarE = if1Var.e(jH);
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new pg(sz1VarE, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int g(kd1 kd1Var, if1 if1Var, int i) {
        return this.v == o11.h ? if1Var.N(i) : if1Var.W(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int p(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.f(i);
    }
}
