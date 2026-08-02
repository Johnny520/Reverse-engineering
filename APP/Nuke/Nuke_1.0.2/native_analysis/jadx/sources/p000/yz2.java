package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yz2 implements kz2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b03 f13685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f13686b;

    public yz2(b03 b03Var, boolean z) {
        this.f13685a = b03Var;
        this.f13686b = z;
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: a */
    public final void mo2776a() {
        b03 b03Var = this.f13685a;
        b03Var.f497r.setValue(null);
        b03Var.f498s.setValue(null);
        b03Var.m356t(true);
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: c */
    public final void mo2778c() {
        b03 b03Var = this.f13685a;
        b03Var.f497r.setValue(null);
        b03Var.f498s.setValue(null);
        b03Var.m356t(true);
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: d */
    public final void mo2779d() {
        z03 z03VarM5146d;
        boolean z = this.f13686b;
        rr0 rr0Var = z ? rr0.f9717i : rr0.f9718j;
        b03 b03Var = this.f13685a;
        b03Var.f497r.setValue(rr0Var);
        long jM1941a = gn2.m1941a(b03Var.m348l(z));
        t91 t91Var = b03Var.f483d;
        if (t91Var == null || (z03VarM5146d = t91Var.m5146d()) == null) {
            return;
        }
        long jM6379e = z03VarM5146d.m6379e(jM1941a);
        b03Var.f494o = jM6379e;
        b03Var.f498s.setValue(new rs1(jM6379e));
        b03Var.f496q = 0L;
        b03Var.f499t = -1;
        t91 t91Var2 = b03Var.f483d;
        if (t91Var2 != null) {
            t91Var2.f10638q.setValue(Boolean.TRUE);
        }
        b03Var.m356t(false);
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: e */
    public final void mo2780e(long j) {
        b03 b03Var = this.f13685a;
        long jM4612e = rs1.m4612e(b03Var.f496q, j);
        b03Var.f496q = jM4612e;
        b03Var.f498s.setValue(new rs1(rs1.m4612e(b03Var.f494o, jM4612e)));
        k03 k03VarM350n = b03Var.m350n();
        rs1 rs1VarM345i = b03Var.m345i();
        rs1VarM345i.getClass();
        b03.m339c(b03Var, k03VarM350n, rs1VarM345i.f9744a, false, this.f13686b, gd3.f3424K, true, new cs0(9));
        b03Var.m356t(false);
    }

    @Override // p000.kz2
    public final void onCancel() {
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: b */
    public final void mo2777b(long j, vm2 vm2Var) {
    }
}
