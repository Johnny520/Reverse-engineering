package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class gw1 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final float f3720a;

    /* JADX INFO: renamed from: b */
    public final float f3721b;

    /* JADX INFO: renamed from: c */
    public final float f3722c;

    /* JADX INFO: renamed from: d */
    public final float f3723d;

    public gw1(float f, float f2, float f3, float f4) {
        this.f3720a = f;
        this.f3721b = f2;
        this.f3722c = f3;
        this.f3723d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            iz0.m2423a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        gw1 gw1Var = obj instanceof gw1 ? (gw1) obj : null;
        return gw1Var != null && za0.m6404b(this.f3720a, gw1Var.f3720a) && za0.m6404b(this.f3721b, gw1Var.f3721b) && za0.m6404b(this.f3722c, gw1Var.f3722c) && za0.m6404b(this.f3723d, gw1Var.f3723d);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        hw1 hw1Var = new hw1();
        hw1Var.f4156v = this.f3720a;
        hw1Var.f4157w = this.f3721b;
        hw1Var.f4158x = this.f3722c;
        hw1Var.f4159y = this.f3723d;
        hw1Var.f4160z = true;
        return hw1Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        hw1 hw1Var = (hw1) th1Var;
        hw1Var.f4156v = this.f3720a;
        hw1Var.f4157w = this.f3721b;
        hw1Var.f4158x = this.f3722c;
        hw1Var.f4159y = this.f3723d;
        hw1Var.f4160z = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + vi0.m5684c(this.f3723d, vi0.m5684c(this.f3722c, vi0.m5684c(this.f3721b, Float.hashCode(this.f3720a) * 31, 31), 31), 31);
    }
}
