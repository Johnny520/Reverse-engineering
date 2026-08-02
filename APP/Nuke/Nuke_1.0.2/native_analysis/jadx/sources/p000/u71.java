package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class u71 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final x71 f11125a;

    public u71(x71 x71Var) {
        this.f11125a = x71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u71) && this.f11125a == ((u71) obj).f11125a;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        v71 v71Var = new v71();
        v71Var.f11804v = this.f11125a;
        return v71Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        v71 v71Var = (v71) th1Var;
        x71 x71Var = v71Var.f11804v;
        x71 x71Var2 = this.f11125a;
        if (t11.m5086l(x71Var, x71Var2) || !v71Var.f10757h.f10770u) {
            return;
        }
        x71 x71Var3 = v71Var.f11804v;
        x71Var3.m6043c();
        x71Var3.f12856b = null;
        v71Var.f11804v = x71Var2;
    }

    public final int hashCode() {
        return this.f11125a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f11125a + ')';
    }
}
