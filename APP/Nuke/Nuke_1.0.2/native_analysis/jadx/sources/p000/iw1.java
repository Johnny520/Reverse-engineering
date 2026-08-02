package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class iw1 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final jw1 f4823a;

    public iw1(jw1 jw1Var) {
        this.f4823a = jw1Var;
    }

    public final boolean equals(Object obj) {
        iw1 iw1Var = obj instanceof iw1 ? (iw1) obj : null;
        if (iw1Var == null) {
            return false;
        }
        return t11.m5086l(this.f4823a, iw1Var.f4823a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        kw1 kw1Var = new kw1();
        kw1Var.f5839v = this.f4823a;
        return kw1Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((kw1) th1Var).f5839v = this.f4823a;
    }

    public final int hashCode() {
        return this.f4823a.hashCode();
    }
}
