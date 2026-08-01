package p000;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class wc0 extends vc0 {

    /* JADX INFO: renamed from: n */
    public C0346ip f5093n;

    /* JADX INFO: renamed from: o */
    public C0346ip f5094o;

    /* JADX INFO: renamed from: p */
    public C0346ip f5095p;

    public wc0(bd0 bd0Var, WindowInsets windowInsets) {
        super(bd0Var, windowInsets);
        this.f5093n = null;
        this.f5094o = null;
        this.f5095p = null;
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: g */
    public C0346ip mo2607g() {
        if (this.f5094o == null) {
            this.f5094o = C0346ip.m1525c(this.f4305c.getMandatorySystemGestureInsets());
        }
        return this.f5094o;
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: i */
    public C0346ip mo2608i() {
        if (this.f5093n == null) {
            this.f5093n = C0346ip.m1525c(this.f4305c.getSystemGestureInsets());
        }
        return this.f5093n;
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: k */
    public C0346ip mo2609k() {
        if (this.f5095p == null) {
            this.f5095p = C0346ip.m1525c(this.f4305c.getTappableElementInsets());
        }
        return this.f5095p;
    }

    @Override // p000.sc0, p000.yc0
    /* JADX INFO: renamed from: l */
    public bd0 mo2370l(int i, int i2, int i3, int i4) {
        return bd0.m515g(null, this.f4305c.inset(i, i2, i3, i4));
    }

    @Override // p000.tc0, p000.yc0
    /* JADX INFO: renamed from: q */
    public void mo2412q(C0346ip c0346ip) {
    }
}
