package p000;

/* JADX INFO: renamed from: o5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class C0529o5 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final C0016af f7526a;

    public C0529o5(C0016af c0016af) {
        this.f7526a = c0016af;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0529o5) {
            return this.f7526a == ((C0529o5) obj).f7526a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        C0568p5 c0568p5 = new C0568p5();
        c0568p5.f7979x = this.f7526a;
        C0792v c0792v = new C0792v(3, c0568p5);
        C0486n5 c0486n5 = new C0486n5();
        c0486n5.f7006v = c0792v;
        c0568p5.m5468M0(c0486n5);
        return c0568p5;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((C0568p5) th1Var).f7979x = this.f7526a;
    }

    public final int hashCode() {
        return this.f7526a.hashCode();
    }
}
