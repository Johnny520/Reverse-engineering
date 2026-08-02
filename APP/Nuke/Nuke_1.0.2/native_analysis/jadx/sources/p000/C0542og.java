package p000;

/* JADX INFO: renamed from: og */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class C0542og extends yh1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0542og ? (C0542og) obj : null) == null) {
            return false;
        }
        ((C0542og) obj).getClass();
        return true;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        C0618qg c0618qg = new C0618qg();
        c0618qg.f8956v = 1.0f;
        return c0618qg;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((C0618qg) th1Var).f8956v = 1.0f;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(1.0f) * 31);
    }
}
