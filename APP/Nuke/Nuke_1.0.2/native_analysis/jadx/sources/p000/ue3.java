package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class ue3 extends te3 {

    /* JADX INFO: renamed from: w */
    public static final cf3 f11263w = cf3.m769c(null, WindowInsets.CONSUMED);

    public ue3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
    }

    @Override // p000.qe3, p000.ye3
    /* JADX INFO: renamed from: i */
    public zz0 mo4165i(int i) {
        return zz0.m6519c(this.f8938c.getInsets(af3.m151a(i)));
    }

    @Override // p000.qe3, p000.ye3
    /* JADX INFO: renamed from: j */
    public zz0 mo4166j(int i) {
        return zz0.m6519c(this.f8938c.getInsetsIgnoringVisibility(af3.m151a(i)));
    }

    @Override // p000.qe3, p000.ye3
    /* JADX INFO: renamed from: u */
    public boolean mo4172u(int i) {
        return this.f8938c.isVisible(af3.m151a(i));
    }

    public ue3(cf3 cf3Var, ue3 ue3Var) {
        super(cf3Var, ue3Var);
    }

    @Override // p000.qe3, p000.ye3
    /* JADX INFO: renamed from: d */
    public final void mo4161d(View view) {
    }
}
