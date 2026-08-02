package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class e61 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final nn0 f2327a;

    public e61(nn0 nn0Var) {
        this.f2327a = nn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e61) {
            return this.f2327a == ((e61) obj).f2327a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        i61 i61Var = new i61();
        i61Var.f4288v = this.f2327a;
        return i61Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((i61) th1Var).f4288v = this.f2327a;
    }

    public final int hashCode() {
        return this.f2327a.hashCode();
    }
}
