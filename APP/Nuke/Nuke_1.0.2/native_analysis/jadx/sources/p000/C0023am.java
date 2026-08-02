package p000;

/* JADX INFO: renamed from: am */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class C0023am extends yh1 {

    /* JADX INFO: renamed from: a */
    public final C0659rk f246a;

    /* JADX INFO: renamed from: b */
    public final boolean f247b;

    public C0023am(C0659rk c0659rk, boolean z) {
        this.f246a = c0659rk;
        this.f247b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0023am c0023am = obj instanceof C0023am ? (C0023am) obj : null;
        return c0023am != null && this.f246a.equals(c0023am.f246a) && this.f247b == c0023am.f247b;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        C0060bm c0060bm = new C0060bm();
        c0060bm.f935v = this.f246a;
        c0060bm.f936w = this.f247b;
        return c0060bm;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        C0060bm c0060bm = (C0060bm) th1Var;
        c0060bm.f935v = this.f246a;
        c0060bm.f936w = this.f247b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247b) + (this.f246a.hashCode() * 31);
    }
}
