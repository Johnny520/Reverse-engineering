package p006D;

import android.view.WindowInsets;
import p001A0.AbstractC0016B;
import p085v.C1102c;

/* JADX INFO: renamed from: D.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C0102g0 extends AbstractC0106i0 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f269c;

    public C0102g0() {
        this.f269c = AbstractC0016B.m33f();
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: b */
    public C0122q0 mo362b() {
        m369a();
        C0122q0 c0122q0M429d = C0122q0.m429d(null, this.f269c.build());
        c0122q0M429d.f309a.mo385o(this.f282b);
        return c0122q0M429d;
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: d */
    public void mo365d(C1102c c1102c) {
        this.f269c.setMandatorySystemGestureInsets(c1102c.m2600d());
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: e */
    public void mo363e(C1102c c1102c) {
        this.f269c.setStableInsets(c1102c.m2600d());
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: f */
    public void mo366f(C1102c c1102c) {
        this.f269c.setSystemGestureInsets(c1102c.m2600d());
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: g */
    public void mo364g(C1102c c1102c) {
        this.f269c.setSystemWindowInsets(c1102c.m2600d());
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: h */
    public void mo367h(C1102c c1102c) {
        this.f269c.setTappableElementInsets(c1102c.m2600d());
    }

    public C0102g0(C0122q0 c0122q0) {
        WindowInsets.Builder builderM33f;
        super(c0122q0);
        WindowInsets windowInsetsM431c = c0122q0.m431c();
        if (windowInsetsM431c != null) {
            builderM33f = AbstractC0016B.m34g(windowInsetsM431c);
        } else {
            builderM33f = AbstractC0016B.m33f();
        }
        this.f269c = builderM33f;
    }
}
