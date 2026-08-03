package p340x2;

import gg.C1425u;
import p028c1.C0372b;
import p041d1.C0653b0;
import p126ia.C2026t;
import p265s.C3834h0;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5626m1;

/* JADX INFO: renamed from: x2.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5684s extends AbstractC5615j implements InterfaceC5626m1, InterfaceC5609h {

    /* JADX INFO: renamed from: w */
    public final C0653b0 f23135w;

    /* JADX INFO: renamed from: x */
    public C3834h0 f23136x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5684s() {
        C0653b0 c0653b0 = new C0653b0(0, new C2026t(2, this, C5684s.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 27), 9);
        m10122k1(c0653b0);
        this.f23135w = c0653b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        C1425u c1425u = new C1425u();
        AbstractC5618k.m10162r(this, new C0372b(c1425u, 6, this));
        C3834h0 c3834h0 = (C3834h0) c1425u.f4738g;
        if (this.f23135w.m1803p1().m1860a()) {
            C3834h0 c3834h02 = this.f23136x;
            if (c3834h02 != null) {
                c3834h02.m8013b();
            }
            if (c3834h0 != null) {
                c3834h0.m8012a();
            } else {
                c3834h0 = null;
            }
            this.f23136x = c3834h0;
        }
    }
}
