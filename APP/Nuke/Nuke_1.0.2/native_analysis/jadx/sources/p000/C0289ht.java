package p000;

/* JADX INFO: renamed from: ht */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0289ht extends yh1 implements mn2 {

    /* JADX INFO: renamed from: a */
    public final in0 f4126a;

    public C0289ht(in0 in0Var) {
        this.f4126a = in0Var;
    }

    @Override // p000.mn2
    /* JADX INFO: renamed from: d */
    public final ln2 mo2229d() {
        ln2 ln2Var = new ln2();
        ln2Var.f6223j = false;
        ln2Var.f6224k = true;
        this.f4126a.mo5j(ln2Var);
        return ln2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0289ht) {
            return this.f4126a == ((C0289ht) obj).f4126a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new b10(false, true, this.f4126a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((b10) th1Var).f508x = this.f4126a;
    }

    public final int hashCode() {
        return this.f4126a.hashCode();
    }
}
