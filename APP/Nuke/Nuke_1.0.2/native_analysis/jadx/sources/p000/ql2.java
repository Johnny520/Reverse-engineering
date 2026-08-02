package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ql2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final bm2 f9036a;

    /* JADX INFO: renamed from: b */
    public final qv1 f9037b;

    /* JADX INFO: renamed from: c */
    public final boolean f9038c;

    /* JADX INFO: renamed from: d */
    public final boolean f9039d;

    public ql2(bm2 bm2Var, qv1 qv1Var, boolean z, boolean z2) {
        this.f9036a = bm2Var;
        this.f9037b = qv1Var;
        this.f9038c = z;
        this.f9039d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql2)) {
            return false;
        }
        ql2 ql2Var = (ql2) obj;
        return t11.m5086l(this.f9036a, ql2Var.f9036a) && this.f9037b == ql2Var.f9037b && this.f9038c == ql2Var.f9038c && this.f9039d == ql2Var.f9039d;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new am2(null, null, null, this.f9037b, this.f9036a, this.f9038c, this.f9039d);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((am2) th1Var).m229d1(null, null, null, this.f9037b, this.f9036a, this.f9038c, this.f9039d);
    }

    public final int hashCode() {
        return hk1.m2205d(hk1.m2205d((this.f9037b.hashCode() + (this.f9036a.hashCode() * 31)) * 961, 31, this.f9038c), 29791, this.f9039d);
    }
}
