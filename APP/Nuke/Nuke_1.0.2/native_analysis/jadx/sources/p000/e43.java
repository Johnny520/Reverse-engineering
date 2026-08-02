package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class e43 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final j81 f2306a;

    public e43(j81 j81Var) {
        this.f2306a = j81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e43) && t11.m5086l(this.f2306a, ((e43) obj).f2306a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        f43 f43Var = new f43();
        f43Var.f2793v = this.f2306a;
        return f43Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((f43) th1Var).f2793v = this.f2306a;
    }

    public final int hashCode() {
        return this.f2306a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f2306a + ')';
    }
}
