package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xz2 implements kz2 {
    public final /* synthetic */ b03 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xz2(b03 b03Var) {
        this.a = b03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void a() {
        b03 b03Var = this.a;
        b03Var.r.setValue(null);
        b03Var.s.setValue(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void b(long j, vm2 vm2Var) {
        z03 z03VarD;
        b03 b03Var = this.a;
        long jA = gn2.a(b03Var.l(true));
        t91 t91Var = b03Var.d;
        if (t91Var == null || (z03VarD = t91Var.d()) == null) {
            return;
        }
        long jE = z03VarD.e(jA);
        b03Var.o = jE;
        b03Var.s.setValue(new rs1(jE));
        b03Var.q = 0L;
        b03Var.r.setValue(rr0.h);
        b03Var.t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void c() {
        b03 b03Var = this.a;
        b03Var.r.setValue(null);
        b03Var.s.setValue(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void e(long j) {
        z03 z03VarD;
        bs0 bs0Var;
        b03 b03Var = this.a;
        b03Var.q = rs1.e(b03Var.q, j);
        t91 t91Var = b03Var.d;
        if (t91Var == null || (z03VarD = t91Var.d()) == null) {
            return;
        }
        b03Var.s.setValue(new rs1(rs1.e(b03Var.o, b03Var.q)));
        us1 us1Var = b03Var.b;
        rs1 rs1VarI = b03Var.i();
        rs1VarI.getClass();
        int iN = us1Var.n(z03VarD.b(rs1VarI.a, true));
        long jI = fg1.i(iN, iN);
        if (f13.b(jI, b03Var.n().b)) {
            return;
        }
        t91 t91Var2 = b03Var.d;
        if ((t91Var2 == null || ((Boolean) t91Var2.q.getValue()).booleanValue()) && (bs0Var = b03Var.k) != null) {
            ((b02) bs0Var).a(9);
        }
        b03Var.c.j(b03.e(b03Var.n().a, jI));
        b03Var.w = new f13(jI);
    }

    @Override // defpackage.kz2
    public final void d() {
    }

    @Override // defpackage.kz2
    public final void onCancel() {
    }
}
