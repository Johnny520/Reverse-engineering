package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class rt1 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final in0 f9752a;

    public rt1(in0 in0Var) {
        this.f9752a = in0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rt1) {
            return this.f9752a == ((rt1) obj).f9752a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        st1 st1Var = new st1();
        st1Var.f10365v = this.f9752a;
        return st1Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((st1) th1Var).f10365v = this.f9752a;
    }

    public final int hashCode() {
        return this.f9752a.hashCode();
    }
}
