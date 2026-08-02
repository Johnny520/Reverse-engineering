package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class yi0 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final t80 f13467a;

    public yi0(t80 t80Var) {
        this.f13467a = t80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yi0) {
            return this.f13467a == ((yi0) obj).f13467a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        zi0 zi0Var = new zi0();
        zi0Var.f13917v = this.f13467a;
        zi0Var.f13918w = 1.0f;
        return zi0Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        zi0 zi0Var = (zi0) th1Var;
        zi0Var.f13917v = this.f13467a;
        zi0Var.f13918w = 1.0f;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.f13467a.hashCode() * 31);
    }
}
