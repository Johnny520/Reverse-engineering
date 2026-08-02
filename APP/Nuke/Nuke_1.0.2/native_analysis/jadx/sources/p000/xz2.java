package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xz2 implements kz2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b03 f13245a;

    public xz2(b03 b03Var) {
        this.f13245a = b03Var;
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: a */
    public final void mo2776a() {
        b03 b03Var = this.f13245a;
        b03Var.f497r.setValue(null);
        b03Var.f498s.setValue(null);
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: b */
    public final void mo2777b(long j, vm2 vm2Var) {
        z03 z03VarM5146d;
        b03 b03Var = this.f13245a;
        long jM1941a = gn2.m1941a(b03Var.m348l(true));
        t91 t91Var = b03Var.f483d;
        if (t91Var == null || (z03VarM5146d = t91Var.m5146d()) == null) {
            return;
        }
        long jM6379e = z03VarM5146d.m6379e(jM1941a);
        b03Var.f494o = jM6379e;
        b03Var.f498s.setValue(new rs1(jM6379e));
        b03Var.f496q = 0L;
        b03Var.f497r.setValue(rr0.f9716h);
        b03Var.m356t(false);
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: c */
    public final void mo2778c() {
        b03 b03Var = this.f13245a;
        b03Var.f497r.setValue(null);
        b03Var.f498s.setValue(null);
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: e */
    public final void mo2780e(long j) {
        z03 z03VarM5146d;
        bs0 bs0Var;
        b03 b03Var = this.f13245a;
        b03Var.f496q = rs1.m4612e(b03Var.f496q, j);
        t91 t91Var = b03Var.f483d;
        if (t91Var == null || (z03VarM5146d = t91Var.m5146d()) == null) {
            return;
        }
        b03Var.f498s.setValue(new rs1(rs1.m4612e(b03Var.f494o, b03Var.f496q)));
        us1 us1Var = b03Var.f481b;
        rs1 rs1VarM345i = b03Var.m345i();
        rs1VarM345i.getClass();
        int iMo2449n = us1Var.mo2449n(z03VarM5146d.m6376b(rs1VarM345i.f9744a, true));
        long jM1636i = fg1.m1636i(iMo2449n, iMo2449n);
        if (f13.m1493b(jM1636i, b03Var.m350n().f5297b)) {
            return;
        }
        t91 t91Var2 = b03Var.f483d;
        if ((t91Var2 == null || ((Boolean) t91Var2.f10638q.getValue()).booleanValue()) && (bs0Var = b03Var.f490k) != null) {
            ((b02) bs0Var).m336a(9);
        }
        b03Var.f482c.mo5j(b03.m340e(b03Var.m350n().f5296a, jM1636i));
        b03Var.f502w = new f13(jM1636i);
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: d */
    public final void mo2779d() {
    }

    @Override // p000.kz2
    public final void onCancel() {
    }
}
