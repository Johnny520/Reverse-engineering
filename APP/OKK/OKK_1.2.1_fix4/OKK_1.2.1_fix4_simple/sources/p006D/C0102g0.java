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
        C0122q0 r02 = C0122q0.m429d(null, AbstractC0016B.m35h(this.f269c));
        C1102c[] r1 = this.f282b;
        r02.f309a.mo385o(r1);
        return r02;
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: d */
    public void mo365d(C1102c r2) {
        AbstractC0016B.m26C(this.f269c, r2.m2600d());
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: e */
    public void mo363e(C1102c r2) {
        AbstractC0016B.m50w(this.f269c, r2.m2600d());
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: f */
    public void mo366f(C1102c r2) {
        AbstractC0016B.m24A(this.f269c, r2.m2600d());
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: g */
    public void mo364g(C1102c r2) {
        AbstractC0016B.m43p(this.f269c, r2.m2600d());
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: h */
    public void mo367h(C1102c r2) {
        AbstractC0016B.m27D(this.f269c, r2.m2600d());
    }

    public C0102g0(C0122q0 r1) {
        super(r1);
        WindowInsets r12 = r1.m431c();
        if (r12 == null) goto L5;
        WindowInsets.Builder r13 = AbstractC0016B.m34g(r12);
    L6:
        this.f269c = r13;
        return;
    L5:
        r13 = AbstractC0016B.m33f();
        goto L6
    }
}
