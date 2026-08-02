package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class we3 extends ve3 {

    /* JADX INFO: renamed from: x */
    public static final cf3 f12478x = cf3.m769c(null, WindowInsets.CONSUMED);

    public we3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
    }

    @Override // p000.ue3, p000.qe3, p000.ye3
    /* JADX INFO: renamed from: i */
    public zz0 mo4165i(int i) {
        return zz0.m6519c(this.f8938c.getInsets(bf3.m530a(i)));
    }

    @Override // p000.ue3, p000.qe3, p000.ye3
    /* JADX INFO: renamed from: j */
    public zz0 mo4166j(int i) {
        return zz0.m6519c(this.f8938c.getInsetsIgnoringVisibility(bf3.m530a(i)));
    }

    @Override // p000.ue3, p000.qe3, p000.ye3
    /* JADX INFO: renamed from: u */
    public boolean mo4172u(int i) {
        return this.f8938c.isVisible(bf3.m530a(i));
    }

    public we3(cf3 cf3Var, we3 we3Var) {
        super(cf3Var, we3Var);
    }

    @Override // p000.qe3, p000.ye3
    /* JADX INFO: renamed from: p */
    public void mo4168p(View view) {
    }
}
