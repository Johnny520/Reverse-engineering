package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class mj extends yh1 {
    public final long a;
    public final float b = 1.0f;
    public final eq2 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mj(long j, eq2 eq2Var) {
        this.a = j;
        this.c = eq2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        mj mjVar = obj instanceof mj ? (mj) obj : null;
        return mjVar != null && ju.c(this.a, mjVar.a) && this.b == mjVar.b && t11.l(this.c, mjVar.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        nj njVar = new nj();
        njVar.v = this.a;
        njVar.w = this.c;
        njVar.x = 9205357640488583168L;
        return njVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        nj njVar = (nj) th1Var;
        njVar.v = this.a;
        eq2 eq2Var = njVar.w;
        eq2 eq2Var2 = this.c;
        if (!t11.l(eq2Var, eq2Var2)) {
            njVar.w = eq2Var2;
            qp0.E(njVar);
        }
        ci0.M(njVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = ju.h;
        return this.c.hashCode() + vi0.c(this.b, Long.hashCode(this.a) * 961, 31);
    }
}
