package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ic0 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final in0 f4551a;

    public ic0(in0 in0Var) {
        this.f4551a = in0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ic0) {
            return this.f4551a == ((ic0) obj).f4551a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        hc0 hc0Var = new hc0();
        hc0Var.f3952v = this.f4551a;
        return hc0Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((hc0) th1Var).f3952v = this.f4551a;
    }

    public final int hashCode() {
        return this.f4551a.hashCode();
    }
}
