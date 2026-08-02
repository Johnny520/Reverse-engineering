package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class je3 extends pe3 {

    /* JADX INFO: renamed from: e */
    public final WindowInsets.Builder f5003e;

    public je3(cf3 cf3Var) {
        super(cf3Var);
        WindowInsets windowInsetsM770b = cf3Var.m770b();
        this.f5003e = windowInsetsM770b != null ? wq0.m5966i(windowInsetsM770b) : wq0.m5965h();
    }

    @Override // p000.pe3
    /* JADX INFO: renamed from: b */
    public cf3 mo2150b() {
        m3862a();
        cf3 cf3VarM769c = cf3.m769c(null, this.f5003e.build());
        zz0[] zz0VarArr = this.f8288b;
        ye3 ye3Var = cf3VarM769c.f1518a;
        ye3Var.mo4174w(zz0VarArr);
        ye3Var.mo4173v(null);
        ye3Var.mo4157B(this.f8289c);
        ye3Var.mo4158C(this.f8290d);
        return cf3VarM769c;
    }

    @Override // p000.pe3
    /* JADX INFO: renamed from: e */
    public void mo2491e(zz0 zz0Var) {
        this.f5003e.setMandatorySystemGestureInsets(zz0Var.m6520d());
    }

    @Override // p000.pe3
    /* JADX INFO: renamed from: f */
    public void mo2151f(zz0 zz0Var) {
        this.f5003e.setStableInsets(zz0Var.m6520d());
    }

    @Override // p000.pe3
    /* JADX INFO: renamed from: g */
    public void mo2492g(zz0 zz0Var) {
        this.f5003e.setSystemGestureInsets(zz0Var.m6520d());
    }

    @Override // p000.pe3
    /* JADX INFO: renamed from: h */
    public void mo2152h(zz0 zz0Var) {
        this.f5003e.setSystemWindowInsets(zz0Var.m6520d());
    }

    @Override // p000.pe3
    /* JADX INFO: renamed from: i */
    public void mo2493i(zz0 zz0Var) {
        this.f5003e.setTappableElementInsets(zz0Var.m6520d());
    }

    public je3() {
        this.f5003e = wq0.m5965h();
    }
}
