package p000;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class pc0 extends rc0 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f3705c;

    public pc0() {
        this.f3705c = oc0.m2017b();
    }

    @Override // p000.rc0
    /* JADX INFO: renamed from: b */
    public bd0 mo1944b() {
        m2287a();
        bd0 bd0VarM515g = bd0.m515g(null, this.f3705c.build());
        bd0VarM515g.f724a.mo2372o(this.f4122b);
        return bd0VarM515g;
    }

    @Override // p000.rc0
    /* JADX INFO: renamed from: d */
    public void mo2084d(C0346ip c0346ip) {
        this.f3705c.setMandatorySystemGestureInsets(c0346ip.m1526d());
    }

    @Override // p000.rc0
    /* JADX INFO: renamed from: e */
    public void mo1945e(C0346ip c0346ip) {
        this.f3705c.setStableInsets(c0346ip.m1526d());
    }

    @Override // p000.rc0
    /* JADX INFO: renamed from: f */
    public void mo2085f(C0346ip c0346ip) {
        this.f3705c.setSystemGestureInsets(c0346ip.m1526d());
    }

    @Override // p000.rc0
    /* JADX INFO: renamed from: g */
    public void mo1946g(C0346ip c0346ip) {
        this.f3705c.setSystemWindowInsets(c0346ip.m1526d());
    }

    @Override // p000.rc0
    /* JADX INFO: renamed from: h */
    public void mo2086h(C0346ip c0346ip) {
        this.f3705c.setTappableElementInsets(c0346ip.m1526d());
    }

    public pc0(bd0 bd0Var) {
        WindowInsets.Builder builderM2017b;
        super(bd0Var);
        WindowInsets windowInsetsM520f = bd0Var.m520f();
        if (windowInsetsM520f != null) {
            builderM2017b = oc0.m2018c(windowInsetsM520f);
        } else {
            builderM2017b = oc0.m2017b();
        }
        this.f3705c = builderM2017b;
    }
}
