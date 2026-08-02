package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ut1 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final in0 f11477a;

    public ut1(in0 in0Var) {
        this.f11477a = in0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ut1) {
            return this.f11477a == ((ut1) obj).f11477a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        vt1 vt1Var = new vt1();
        vt1Var.f12169v = this.f11477a;
        vt1Var.f12170w = -9223372034707292160L;
        return vt1Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        vt1 vt1Var = (vt1) th1Var;
        vt1Var.f12169v = this.f11477a;
        vt1Var.f12170w = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.f11477a.hashCode();
    }
}
