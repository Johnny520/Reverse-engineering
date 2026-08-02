package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zz2 implements kz2 {
    public f13 b;
    public final /* synthetic */ b03 d;
    public boolean a = true;
    public vm2 c = gd3.H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zz2(b03 b03Var) {
        this.d = b03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void a() {
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void b(long j, vm2 vm2Var) {
        long j2;
        z03 z03VarD;
        z03 z03VarD2;
        b03 b03Var = this.d;
        nx1 nx1Var = b03Var.r;
        if (b03Var.k() && ((rr0) nx1Var.getValue()) == null) {
            nx1Var.setValue(rr0.j);
            b03Var.t = -1;
            this.a = true;
            this.c = vm2Var;
            b03Var.o();
            t91 t91Var = b03Var.d;
            if (t91Var == null || (z03VarD2 = t91Var.d()) == null || !z03VarD2.c(j)) {
                j2 = j;
                t91 t91Var2 = b03Var.d;
                if (t91Var2 != null && (z03VarD = t91Var2.d()) != null) {
                    int iN = b03Var.b.n(z03VarD.b(j2, true));
                    k03 k03VarE = b03.e(b03Var.n().a, fg1.i(iN, iN));
                    b03Var.h(false);
                    bs0 bs0Var = b03Var.k;
                    if (bs0Var != null) {
                        ((b02) bs0Var).a(0);
                    }
                    b03Var.c.j(k03VarE);
                    b03Var.w = new f13(k03VarE.b);
                }
                this.a = false;
            } else {
                if (b03Var.n().a.i.length() == 0) {
                    return;
                }
                b03Var.h(false);
                long jC = b03.c(b03Var, k03.a(b03Var.n(), null, f13.b, 5), j, true, false, this.c, true, new cs0(0));
                j2 = j;
                b03Var.p = new f13(jC);
                this.b = new f13(jC);
            }
            b03Var.q(tr0.h);
            b03Var.o = j2;
            b03Var.s.setValue(new rs1(j2));
            b03Var.q = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    @Override // defpackage.kz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j) {
        z03 z03VarD;
        long jC;
        b03 b03Var = this.d;
        if (!b03Var.k() || b03Var.n().a.i.length() == 0) {
            return;
        }
        b03Var.q = rs1.e(b03Var.q, j);
        t91 t91Var = b03Var.d;
        if (t91Var != null && (z03VarD = t91Var.d()) != null) {
            b03Var.s.setValue(new rs1(rs1.e(b03Var.o, b03Var.q)));
            if (b03Var.p == null) {
                rs1 rs1VarI = b03Var.i();
                rs1VarI.getClass();
                if (z03VarD.c(rs1VarI.a)) {
                    f13 f13Var = b03Var.p;
                    int iB = f13Var != null ? (int) (f13Var.a >> 32) : z03VarD.b(b03Var.o, false);
                    rs1 rs1VarI2 = b03Var.i();
                    rs1VarI2.getClass();
                    int iB2 = z03VarD.b(rs1VarI2.a, false);
                    if (b03Var.p == null && iB == iB2) {
                        return;
                    }
                    k03 k03VarN = b03Var.n();
                    rs1 rs1VarI3 = b03Var.i();
                    rs1VarI3.getClass();
                    jC = b03.c(b03Var, k03VarN, rs1VarI3.a, false, false, this.c, true, new cs0(9));
                } else {
                    int iN = b03Var.b.n(z03VarD.b(b03Var.o, true));
                    us1 us1Var = b03Var.b;
                    rs1 rs1VarI4 = b03Var.i();
                    rs1VarI4.getClass();
                    c80 c80Var = iN == us1Var.n(z03VarD.b(rs1VarI4.a, true)) ? gd3.H : gd3.I;
                    k03 k03VarN2 = b03Var.n();
                    rs1 rs1VarI5 = b03Var.i();
                    rs1VarI5.getClass();
                    jC = b03.c(b03Var, k03VarN2, rs1VarI5.a, false, false, c80Var, true, new cs0(9));
                }
                this.b = new f13(jC);
                if (!f13.a(jC, b03Var.p)) {
                    this.a = false;
                }
            }
        }
        b03Var.t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        b03 b03Var = this.d;
        b03Var.r.setValue(null);
        b03Var.s.setValue(null);
        this.c = gd3.H;
        b03Var.t(true);
        f13 f13Var = this.b;
        boolean zC = f13.c(f13Var != null ? f13Var.a : b03Var.n().b);
        b03Var.q(zC ? tr0.j : tr0.i);
        t91 t91Var = b03Var.d;
        if (t91Var != null) {
            t91Var.m.setValue(Boolean.valueOf(!zC && s11.O(b03Var, true)));
        }
        t91 t91Var2 = b03Var.d;
        if (t91Var2 != null) {
            t91Var2.n.setValue(Boolean.valueOf(!zC && s11.O(b03Var, false)));
        }
        t91 t91Var3 = b03Var.d;
        if (t91Var3 != null) {
            t91Var3.o.setValue(Boolean.valueOf(zC && s11.O(b03Var, true)));
        }
        if (this.a) {
            b03.b(b03Var, b03Var.p);
        }
        b03Var.p = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kz2
    public final void onCancel() {
        f();
    }

    @Override // defpackage.kz2
    public final void c() {
    }

    @Override // defpackage.kz2
    public final void d() {
    }
}
