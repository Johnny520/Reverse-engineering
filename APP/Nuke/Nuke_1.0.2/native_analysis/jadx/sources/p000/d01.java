package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class d01 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final vd3 f1800a;

    public d01(vd3 vd3Var) {
        this.f1800a = vd3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d01) {
            return t11.m5086l(((d01) obj).f1800a, this.f1800a);
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        f01 f01Var = new f01();
        hj0 hj0Var = AbstractC0738tl.f10827h;
        f01Var.f2708v = hj0Var;
        f01Var.f2709w = hj0Var;
        f01Var.f2710x = this.f1800a;
        return f01Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        f01 f01Var = (f01) th1Var;
        vd3 vd3Var = f01Var.f2710x;
        vd3 vd3Var2 = this.f1800a;
        if (t11.m5086l(vd3Var2, vd3Var)) {
            return;
        }
        f01Var.f2710x = vd3Var2;
        f01Var.m1487M0();
    }

    public final int hashCode() {
        return this.f1800a.hashCode();
    }
}
