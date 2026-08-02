package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class i03 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final m13 f4206a;

    public i03(m13 m13Var) {
        this.f4206a = m13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i03)) {
            return false;
        }
        return t11.m5086l(this.f4206a, ((i03) obj).f4206a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new j03(this.f4206a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        j03 j03Var = (j03) th1Var;
        j03Var.getClass();
        m13 m13VarM6130k0 = xe1.m6130k0(this.f4206a, sp0.m4933c0(j03Var).f9366G);
        j03Var.m2427M0(m13VarM6130k0, (xl0) p40.m3733p(j03Var, AbstractC0441ly.f6385k));
        h03 h03Var = j03Var.f4876x;
        if (h03Var != null) {
            h03.m2040a(h03Var, null, null, m13VarM6130k0, 23);
            gf1.m1853A(j03Var);
        } else {
            nz0.m3457b("Min size state is not set.");
            C0676s.m4644b();
        }
    }

    public final int hashCode() {
        return this.f4206a.hashCode();
    }
}
