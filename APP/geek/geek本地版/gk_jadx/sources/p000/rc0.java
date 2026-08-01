package p000;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class rc0 extends qc0 {

    /* JADX INFO: renamed from: n */
    public C0195ep f4259n;

    /* JADX INFO: renamed from: o */
    public C0195ep f4260o;

    /* JADX INFO: renamed from: p */
    public C0195ep f4261p;

    public rc0(wc0 wc0Var, WindowInsets windowInsets) {
        super(wc0Var, windowInsets);
        this.f4259n = null;
        this.f4260o = null;
        this.f4261p = null;
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: g */
    public C0195ep mo2289g() {
        if (this.f4260o == null) {
            this.f4260o = C0195ep.m1051c(this.f3390c.getMandatorySystemGestureInsets());
        }
        return this.f4260o;
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: i */
    public C0195ep mo2290i() {
        if (this.f4259n == null) {
            this.f4259n = C0195ep.m1051c(this.f3390c.getSystemGestureInsets());
        }
        return this.f4259n;
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: k */
    public C0195ep mo2291k() {
        if (this.f4261p == null) {
            this.f4261p = C0195ep.m1051c(this.f3390c.getTappableElementInsets());
        }
        return this.f4261p;
    }

    @Override // p000.nc0, p000.tc0
    /* JADX INFO: renamed from: l */
    public wc0 mo1934l(int i, int i2, int i3, int i4) {
        return wc0.m2563g(null, this.f3390c.inset(i, i2, i3, i4));
    }

    @Override // p000.oc0, p000.tc0
    /* JADX INFO: renamed from: q */
    public void mo2016q(C0195ep c0195ep) {
    }
}
