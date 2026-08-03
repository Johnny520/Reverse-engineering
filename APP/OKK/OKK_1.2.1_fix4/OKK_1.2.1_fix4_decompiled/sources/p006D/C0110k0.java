package p006D;

import android.view.WindowInsets;
import p085v.C1102c;

/* JADX INFO: renamed from: D.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C0110k0 extends AbstractC0108j0 {

    /* JADX INFO: renamed from: m */
    public C1102c f294m;

    public C0110k0(C0122q0 c0122q0, WindowInsets windowInsets) {
        super(c0122q0, windowInsets);
        this.f294m = null;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: b */
    public C0122q0 mo389b() {
        return C0122q0.m429d(null, this.f288c.consumeStableInsets());
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: c */
    public C0122q0 mo390c() {
        return C0122q0.m429d(null, this.f288c.consumeSystemWindowInsets());
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: h */
    public final C1102c mo391h() {
        if (this.f294m == null) {
            WindowInsets windowInsets = this.f288c;
            this.f294m = C1102c.m2598b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f294m;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: m */
    public boolean mo392m() {
        return this.f288c.isConsumed();
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: q */
    public void mo393q(C1102c c1102c) {
        this.f294m = c1102c;
    }
}
