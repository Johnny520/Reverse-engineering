package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class f51 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final in0 f2795a;

    /* JADX INFO: renamed from: b */
    public final in0 f2796b;

    public f51(in0 in0Var, in0 in0Var2) {
        this.f2795a = in0Var;
        this.f2796b = in0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f51)) {
            return false;
        }
        f51 f51Var = (f51) obj;
        return this.f2795a == f51Var.f2795a && this.f2796b == f51Var.f2796b;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        h51 h51Var = new h51();
        h51Var.f3824v = this.f2795a;
        h51Var.f3825w = this.f2796b;
        return h51Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        h51 h51Var = (h51) th1Var;
        h51Var.f3824v = this.f2795a;
        h51Var.f3825w = this.f2796b;
    }

    public final int hashCode() {
        in0 in0Var = this.f2795a;
        int iHashCode = (in0Var != null ? in0Var.hashCode() : 0) * 31;
        in0 in0Var2 = this.f2796b;
        return iHashCode + (in0Var2 != null ? in0Var2.hashCode() : 0);
    }
}
