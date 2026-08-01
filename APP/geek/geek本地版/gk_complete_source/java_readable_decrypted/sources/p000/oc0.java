package p000;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class oc0 extends nc0 {

    /* JADX INFO: renamed from: m */
    public C0195ep f3529m;

    public oc0(wc0 wc0Var, WindowInsets windowInsets) {
        super(wc0Var, windowInsets);
        this.f3529m = null;
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: b */
    public wc0 mo2012b() {
        return wc0.m2563g(null, this.f3390c.consumeStableInsets());
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: c */
    public wc0 mo2013c() {
        return wc0.m2563g(null, this.f3390c.consumeSystemWindowInsets());
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: h */
    public final C0195ep mo2014h() {
        if (this.f3529m == null) {
            WindowInsets windowInsets = this.f3390c;
            this.f3529m = C0195ep.m1050b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3529m;
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: m */
    public boolean mo2015m() {
        return this.f3390c.isConsumed();
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: q */
    public void mo2016q(C0195ep c0195ep) {
        this.f3529m = c0195ep;
    }
}
