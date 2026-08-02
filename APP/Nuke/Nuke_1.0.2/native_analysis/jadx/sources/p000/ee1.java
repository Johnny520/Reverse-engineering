package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final gp1 f2414a;

    /* JADX INFO: renamed from: b */
    public final f03 f2415b;

    /* JADX INFO: renamed from: c */
    public final f02 f2416c;

    public ee1(gp1 gp1Var, f03 f03Var, f02 f02Var) {
        this.f2414a = gp1Var;
        this.f2415b = f03Var;
        this.f2416c = f02Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new ge1(this.f2414a, this.f2415b, this.f2416c);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ge1 ge1Var = (ge1) th1Var;
        ge1Var.getClass();
        f02 f02Var = ge1Var.f3465x;
        View view = ge1Var.f3466y;
        e70 e70Var = ge1Var.f3467z;
        ge1Var.f3463v = this.f2414a;
        ge1Var.f3464w = this.f2415b;
        f02 f02Var2 = this.f2416c;
        ge1Var.f3465x = f02Var2;
        View viewM5344H = tp0.m5344H(ge1Var);
        e70 e70Var2 = sp0.m4933c0(ge1Var).f9365F;
        if (ge1Var.f3457A != null) {
            yn2 yn2Var = he1.f3973a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !f02Var2.mo1488a()) || !za0.m6404b(Float.NaN, Float.NaN) || !za0.m6404b(Float.NaN, Float.NaN) || !f02Var2.equals(f02Var) || !viewM5344H.equals(view) || !t11.m5086l(e70Var2, e70Var)) {
                ge1Var.m1849N0();
            }
        }
        ge1Var.m1850O0();
    }

    public final int hashCode() {
        return this.f2416c.hashCode() + ((this.f2415b.hashCode() + hk1.m2205d(vi0.m5684c(Float.NaN, vi0.m5684c(Float.NaN, hk1.m2204c(hk1.m2205d(vi0.m5684c(Float.NaN, this.f2414a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
