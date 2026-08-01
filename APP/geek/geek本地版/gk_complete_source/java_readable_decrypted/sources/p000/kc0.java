package p000;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class kc0 extends mc0 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f2878c;

    public kc0() {
        this.f2878c = jc0.m1586b();
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: b */
    public wc0 mo1433b() {
        m1819a();
        wc0 wc0VarM2563g = wc0.m2563g(null, this.f2878c.build());
        wc0VarM2563g.f4955a.mo1936o(this.f3195b);
        return wc0VarM2563g;
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: d */
    public void mo1690d(C0195ep c0195ep) {
        this.f2878c.setMandatorySystemGestureInsets(c0195ep.m1052d());
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: e */
    public void mo1434e(C0195ep c0195ep) {
        this.f2878c.setStableInsets(c0195ep.m1052d());
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: f */
    public void mo1691f(C0195ep c0195ep) {
        this.f2878c.setSystemGestureInsets(c0195ep.m1052d());
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: g */
    public void mo1435g(C0195ep c0195ep) {
        this.f2878c.setSystemWindowInsets(c0195ep.m1052d());
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: h */
    public void mo1692h(C0195ep c0195ep) {
        this.f2878c.setTappableElementInsets(c0195ep.m1052d());
    }

    public kc0(wc0 wc0Var) {
        WindowInsets.Builder builderM1586b;
        super(wc0Var);
        WindowInsets windowInsetsM2568f = wc0Var.m2568f();
        if (windowInsetsM2568f != null) {
            builderM1586b = jc0.m1587c(windowInsetsM2568f);
        } else {
            builderM1586b = jc0.m1586b();
        }
        this.f2878c = builderM1586b;
    }
}
