package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class um1 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final tm1 f11372a;

    public um1(tm1 tm1Var) {
        this.f11372a = tm1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof um1) && ((um1) obj).f11372a == this.f11372a;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new xm1(op0.f7754a, this.f11372a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        xm1 xm1Var = (xm1) th1Var;
        xm1Var.f13078v = op0.f7754a;
        tm1 tm1Var = xm1Var.f13079w;
        if (tm1Var.f10845a == xm1Var) {
            tm1Var.f10845a = null;
        }
        tm1 tm1Var2 = this.f11372a;
        if (tm1Var2 != tm1Var) {
            xm1Var.f13079w = tm1Var2;
        }
        if (xm1Var.f10770u) {
            tm1 tm1Var3 = xm1Var.f13079w;
            tm1Var3.f10845a = xm1Var;
            tm1Var3.f10846b = null;
            xm1Var.f13080x = null;
            tm1Var3.f10847c = new C0159ea(17, xm1Var);
            tm1Var3.f10848d = xm1Var.m5255A0();
        }
    }

    public final int hashCode() {
        return this.f11372a.hashCode() + (op0.f7754a.hashCode() * 31);
    }
}
