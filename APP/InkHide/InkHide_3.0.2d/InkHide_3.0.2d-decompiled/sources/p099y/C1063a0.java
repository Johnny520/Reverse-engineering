package p099y;

import android.view.WindowInsets;
import p085r.C0811c;

/* JADX INFO: renamed from: y.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C1063a0 extends AbstractC1061Z {

    /* JADX INFO: renamed from: k */
    public C0811c f3690k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1063a0(C1075g0 c1075g0, WindowInsets windowInsets) {
        super(c1075g0, windowInsets);
        this.f3690k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: b */
    public C1075g0 mo2322b() {
        return C1075g0.m2342c(this.f3686c.consumeStableInsets(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: c */
    public C1075g0 mo2323c() {
        return C1075g0.m2342c(this.f3686c.consumeSystemWindowInsets(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: f */
    public final C0811c mo2324f() {
        if (this.f3690k == null) {
            WindowInsets windowInsets = this.f3686c;
            this.f3690k = C0811c.m1479a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3690k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: i */
    public boolean mo2325i() {
        return this.f3686c.isConsumed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: m */
    public void mo2326m(C0811c c0811c) {
        this.f3690k = c0811c;
    }
}
