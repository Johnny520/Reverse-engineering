package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class re3 extends qe3 {

    /* JADX INFO: renamed from: s */
    public zz0 f9530s;

    public re3(cf3 cf3Var, re3 re3Var) {
        super(cf3Var, re3Var);
        this.f9530s = null;
        this.f9530s = re3Var.f9530s;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: b */
    public cf3 mo4439b() {
        return cf3.m769c(null, this.f8938c.consumeStableInsets());
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: c */
    public cf3 mo4440c() {
        return cf3.m769c(null, this.f8938c.consumeSystemWindowInsets());
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: l */
    public final zz0 mo4441l() {
        if (this.f9530s == null) {
            WindowInsets windowInsets = this.f8938c;
            this.f9530s = zz0.m6518b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f9530s;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: s */
    public boolean mo4442s() {
        return this.f8938c.isConsumed();
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: z */
    public void mo4443z(zz0 zz0Var) {
        this.f9530s = zz0Var;
    }

    public re3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
        this.f9530s = null;
    }
}
