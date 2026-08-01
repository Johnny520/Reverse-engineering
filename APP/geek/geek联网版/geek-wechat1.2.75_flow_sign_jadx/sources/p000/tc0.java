package p000;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class tc0 extends sc0 {

    /* JADX INFO: renamed from: m */
    public C0346ip f4502m;

    public tc0(bd0 bd0Var, WindowInsets windowInsets) {
        super(bd0Var, windowInsets);
        this.f4502m = null;
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: b */
    public bd0 mo2408b() {
        return bd0.m515g(null, this.f4305c.consumeStableInsets());
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: c */
    public bd0 mo2409c() {
        return bd0.m515g(null, this.f4305c.consumeSystemWindowInsets());
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: h */
    public final C0346ip mo2410h() {
        if (this.f4502m == null) {
            WindowInsets windowInsets = this.f4305c;
            this.f4502m = C0346ip.m1524b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f4502m;
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: m */
    public boolean mo2411m() {
        return this.f4305c.isConsumed();
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: q */
    public void mo2412q(C0346ip c0346ip) {
        this.f4502m = c0346ip;
    }
}
