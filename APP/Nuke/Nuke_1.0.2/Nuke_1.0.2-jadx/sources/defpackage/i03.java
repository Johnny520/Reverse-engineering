package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class i03 extends yh1 {
    public final m13 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i03(m13 m13Var) {
        this.a = m13Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i03)) {
            return false;
        }
        return t11.l(this.a, ((i03) obj).a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new j03(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        j03 j03Var = (j03) th1Var;
        j03Var.getClass();
        m13 m13VarK0 = xe1.k0(this.a, sp0.c0(j03Var).G);
        j03Var.M0(m13VarK0, (xl0) p40.p(j03Var, ly.k));
        h03 h03Var = j03Var.x;
        if (h03Var != null) {
            h03.a(h03Var, null, null, m13VarK0, 23);
            gf1.A(j03Var);
        } else {
            nz0.b("Min size state is not set.");
            s.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode();
    }
}
