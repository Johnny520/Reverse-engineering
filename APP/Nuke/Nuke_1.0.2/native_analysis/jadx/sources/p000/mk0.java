package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class mk0 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final in0 f6701a;

    public mk0(in0 in0Var) {
        this.f6701a = in0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mk0) {
            return this.f6701a == ((mk0) obj).f6701a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        nk0 nk0Var = new nk0();
        nk0Var.f7191v = this.f6701a;
        return nk0Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((nk0) th1Var).f7191v = this.f6701a;
    }

    public final int hashCode() {
        return this.f6701a.hashCode();
    }
}
