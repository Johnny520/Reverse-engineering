package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class te3 extends se3 {

    /* JADX INFO: renamed from: t */
    public zz0 f10706t;

    /* JADX INFO: renamed from: u */
    public zz0 f10707u;

    /* JADX INFO: renamed from: v */
    public zz0 f10708v;

    public te3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
        this.f10706t = null;
        this.f10707u = null;
        this.f10708v = null;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: k */
    public zz0 mo5245k() {
        if (this.f10707u == null) {
            this.f10707u = zz0.m6519c(this.f8938c.getMandatorySystemGestureInsets());
        }
        return this.f10707u;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: m */
    public zz0 mo5246m() {
        if (this.f10706t == null) {
            this.f10706t = zz0.m6519c(this.f8938c.getSystemGestureInsets());
        }
        return this.f10706t;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: o */
    public zz0 mo5247o() {
        if (this.f10708v == null) {
            this.f10708v = zz0.m6519c(this.f8938c.getTappableElementInsets());
        }
        return this.f10708v;
    }

    @Override // p000.qe3, p000.ye3
    /* JADX INFO: renamed from: r */
    public cf3 mo4170r(int i, int i2, int i3, int i4) {
        return cf3.m769c(null, this.f8938c.inset(i, i2, i3, i4));
    }

    public te3(cf3 cf3Var, te3 te3Var) {
        super(cf3Var, te3Var);
        this.f10706t = null;
        this.f10707u = null;
        this.f10708v = null;
    }

    @Override // p000.re3, p000.ye3
    /* JADX INFO: renamed from: z */
    public void mo4443z(zz0 zz0Var) {
    }
}
