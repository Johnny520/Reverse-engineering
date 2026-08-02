package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class pc0 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final in0 f8254a;

    public pc0(in0 in0Var) {
        this.f8254a = in0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pc0) {
            return this.f8254a == ((pc0) obj).f8254a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new C0587po(new C0626qo(), this.f8254a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        C0587po c0587po = (C0587po) th1Var;
        c0587po.f8420x = this.f8254a;
        c0587po.m3888M0();
    }

    public final int hashCode() {
        return this.f8254a.hashCode();
    }
}
