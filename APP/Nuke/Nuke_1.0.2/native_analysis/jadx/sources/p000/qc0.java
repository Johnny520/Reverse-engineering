package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class qc0 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final in0 f8889a;

    public qc0(in0 in0Var) {
        this.f8889a = in0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qc0) {
            return this.f8889a == ((qc0) obj).f8889a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        rc0 rc0Var = new rc0();
        rc0Var.f9503v = this.f8889a;
        return rc0Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((rc0) th1Var).f9503v = this.f8889a;
    }

    public final int hashCode() {
        return this.f8889a.hashCode();
    }
}
