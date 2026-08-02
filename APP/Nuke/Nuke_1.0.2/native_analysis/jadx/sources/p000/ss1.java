package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ss1 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final float f10347a;

    /* JADX INFO: renamed from: b */
    public final float f10348b;

    public ss1(float f, float f2) {
        this.f10347a = f;
        this.f10348b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ss1 ss1Var = obj instanceof ss1 ? (ss1) obj : null;
        return ss1Var != null && za0.m6404b(this.f10347a, ss1Var.f10347a) && za0.m6404b(this.f10348b, ss1Var.f10348b);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        vs1 vs1Var = new vs1();
        vs1Var.f12163v = this.f10347a;
        vs1Var.f12164w = this.f10348b;
        vs1Var.f12165x = true;
        return vs1Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        vs1 vs1Var = (vs1) th1Var;
        float f = vs1Var.f12163v;
        float f2 = this.f10347a;
        boolean zM6404b = za0.m6404b(f, f2);
        float f3 = this.f10348b;
        if (!zM6404b || !za0.m6404b(vs1Var.f12164w, f3) || !vs1Var.f12165x) {
            sp0.m4933c0(vs1Var).m4362U(false);
        }
        vs1Var.f12163v = f2;
        vs1Var.f12164w = f3;
        vs1Var.f12165x = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + vi0.m5684c(this.f10348b, Float.hashCode(this.f10347a) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) za0.m6405c(this.f10347a)) + ", y=" + ((Object) za0.m6405c(this.f10348b)) + ", rtlAware=true)";
    }
}
