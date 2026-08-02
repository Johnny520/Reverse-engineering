package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class kr2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final float f5735a;

    /* JADX INFO: renamed from: b */
    public final float f5736b;

    /* JADX INFO: renamed from: c */
    public final float f5737c;

    /* JADX INFO: renamed from: d */
    public final float f5738d;

    /* JADX INFO: renamed from: e */
    public final boolean f5739e;

    public /* synthetic */ kr2(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr2)) {
            return false;
        }
        kr2 kr2Var = (kr2) obj;
        return za0.m6404b(this.f5735a, kr2Var.f5735a) && za0.m6404b(this.f5736b, kr2Var.f5736b) && za0.m6404b(this.f5737c, kr2Var.f5737c) && za0.m6404b(this.f5738d, kr2Var.f5738d) && this.f5739e == kr2Var.f5739e;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        lr2 lr2Var = new lr2();
        lr2Var.f6284v = this.f5735a;
        lr2Var.f6285w = this.f5736b;
        lr2Var.f6286x = this.f5737c;
        lr2Var.f6287y = this.f5738d;
        lr2Var.f6288z = this.f5739e;
        return lr2Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        lr2 lr2Var = (lr2) th1Var;
        lr2Var.f6284v = this.f5735a;
        lr2Var.f6285w = this.f5736b;
        lr2Var.f6286x = this.f5737c;
        lr2Var.f6287y = this.f5738d;
        lr2Var.f6288z = this.f5739e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5739e) + vi0.m5684c(this.f5738d, vi0.m5684c(this.f5737c, vi0.m5684c(this.f5736b, Float.hashCode(this.f5735a) * 31, 31), 31), 31);
    }

    public kr2(float f, float f2, float f3, float f4, boolean z) {
        this.f5735a = f;
        this.f5736b = f2;
        this.f5737c = f3;
        this.f5738d = f4;
        this.f5739e = z;
    }
}
