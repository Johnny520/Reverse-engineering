package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yz2 implements kz2 {
    public final /* synthetic */ b03 a;
    public final /* synthetic */ boolean b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yz2(b03 b03Var, boolean z) {
        this.a = b03Var;
        this.b = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void a() {
        b03 b03Var = this.a;
        b03Var.r.setValue(null);
        b03Var.s.setValue(null);
        b03Var.t(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void c() {
        b03 b03Var = this.a;
        b03Var.r.setValue(null);
        b03Var.s.setValue(null);
        b03Var.t(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void d() {
        z03 z03VarD;
        boolean z = this.b;
        rr0 rr0Var = z ? rr0.i : rr0.j;
        b03 b03Var = this.a;
        b03Var.r.setValue(rr0Var);
        long jA = gn2.a(b03Var.l(z));
        t91 t91Var = b03Var.d;
        if (t91Var == null || (z03VarD = t91Var.d()) == null) {
            return;
        }
        long jE = z03VarD.e(jA);
        b03Var.o = jE;
        b03Var.s.setValue(new rs1(jE));
        b03Var.q = 0L;
        b03Var.t = -1;
        t91 t91Var2 = b03Var.d;
        if (t91Var2 != null) {
            t91Var2.q.setValue(Boolean.TRUE);
        }
        b03Var.t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void e(long j) {
        b03 b03Var = this.a;
        long jE = rs1.e(b03Var.q, j);
        b03Var.q = jE;
        b03Var.s.setValue(new rs1(rs1.e(b03Var.o, jE)));
        k03 k03VarN = b03Var.n();
        rs1 rs1VarI = b03Var.i();
        rs1VarI.getClass();
        b03.c(b03Var, k03VarN, rs1VarI.a, false, this.b, gd3.K, true, new cs0(9));
        b03Var.t(false);
    }

    @Override // defpackage.kz2
    public final void onCancel() {
    }

    @Override // defpackage.kz2
    public final void b(long j, vm2 vm2Var) {
    }
}
