package p000;

/* JADX INFO: renamed from: qf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0617qf extends yh1 implements mn2 {

    /* JADX INFO: renamed from: a */
    public final boolean f8949a;

    /* JADX INFO: renamed from: b */
    public final in0 f8950b;

    public C0617qf(in0 in0Var, boolean z) {
        this.f8949a = z;
        this.f8950b = in0Var;
    }

    @Override // p000.mn2
    /* JADX INFO: renamed from: d */
    public final ln2 mo2229d() {
        ln2 ln2Var = new ln2();
        ln2Var.f6223j = this.f8949a;
        this.f8950b.mo5j(ln2Var);
        return ln2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0617qf)) {
            return false;
        }
        C0617qf c0617qf = (C0617qf) obj;
        return this.f8949a == c0617qf.f8949a && this.f8950b == c0617qf.f8950b;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new b10(this.f8949a, false, this.f8950b);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        b10 b10Var = (b10) th1Var;
        b10Var.f506v = this.f8949a;
        b10Var.f508x = this.f8950b;
    }

    public final int hashCode() {
        return this.f8950b.hashCode() + (Boolean.hashCode(this.f8949a) * 31);
    }
}
