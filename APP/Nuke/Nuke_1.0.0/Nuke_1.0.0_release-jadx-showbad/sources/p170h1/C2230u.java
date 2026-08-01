package p170h1;

import p007B0.C0190d;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0604l0;
import p117X2.C1675t;
import p198m0.C2567A;
import p260x.C3395A;

/* JADX INFO: renamed from: h1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2230u extends AbstractC0599j implements InterfaceC0604l0, InterfaceC0595h {

    /* JADX INFO: renamed from: t */
    public final C2567A f7285t;

    /* JADX INFO: renamed from: u */
    public C3395A f7286u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2230u() {
        C2567A c2567a = new C2567A(0, new C2229t(2, this, C2230u.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 0), 9);
        m1021J0(c2567a);
        this.f7285t = c2567a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0604l0
    /* JADX INFO: renamed from: O */
    public final void mo1051O() {
        C1675t c1675t = new C1675t();
        AbstractC0601k.m1040p(this, new C0190d(8, c1675t, this));
        C3395A c3395a = (C3395A) c1675t.f5710e;
        if (this.f7285t.m4488O0().m4540a()) {
            C3395A c3395a2 = this.f7286u;
            if (c3395a2 != null) {
                c3395a2.m5672b();
            }
            if (c3395a != null) {
                c3395a.m5671a();
            } else {
                c3395a = null;
            }
            this.f7286u = c3395a;
        }
    }
}
