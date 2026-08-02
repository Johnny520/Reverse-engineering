package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ez2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final dq1 f2696a;

    /* JADX INFO: renamed from: b */
    public final vz2 f2697b;

    /* JADX INFO: renamed from: c */
    public final wz2 f2698c;

    /* JADX INFO: renamed from: d */
    public final j10 f2699d;

    public ez2(dq1 dq1Var, vz2 vz2Var, wz2 wz2Var, j10 j10Var) {
        this.f2696a = dq1Var;
        this.f2697b = vz2Var;
        this.f2698c = wz2Var;
        this.f2699d = j10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez2)) {
            return false;
        }
        ez2 ez2Var = (ez2) obj;
        return this.f2696a == ez2Var.f2696a && this.f2697b == ez2Var.f2697b && this.f2698c == ez2Var.f2698c && this.f2699d == ez2Var.f2699d;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new fz2(this.f2696a, this.f2697b, this.f2698c, this.f2699d);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        fz2 fz2Var = (fz2) th1Var;
        fz2Var.f3204x.f2147i = null;
        dq1 dq1Var = this.f2696a;
        fz2Var.f3204x = dq1Var;
        dq1Var.f2147i = fz2Var;
        dq1Var.f2148j = fz2Var.f10770u ? w23.f12279j : w23.f12278i;
        fz2Var.f3205y = this.f2697b;
        fz2Var.f3206z = this.f2698c;
        fz2Var.f3200A = this.f2699d;
    }

    public final int hashCode() {
        return this.f2699d.hashCode() + ((this.f2698c.hashCode() + ((this.f2697b.hashCode() + (this.f2696a.hashCode() * 31)) * 31)) * 31);
    }
}
