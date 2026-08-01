package p051J;

import p000A.C0078o0;
import p041H0.AbstractC0596h0;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0597i;
import p041H0.InterfaceC0607n;
import p058L.C0920W;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p169h0.AbstractC2206o;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: J.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0824p extends AbstractC2206o implements InterfaceC0595h, InterfaceC0607n, InterfaceC0597i {

    /* JADX INFO: renamed from: r */
    public C0811c f2645r;

    /* JADX INFO: renamed from: s */
    public C0078o0 f2646s;

    /* JADX INFO: renamed from: t */
    public C0920W f2647t;

    /* JADX INFO: renamed from: u */
    public final C1366i0 f2648u = AbstractC1385s.m2629s(null);

    public C0824p(C0811c c0811c, C0078o0 c0078o0, C0920W c0920w) {
        this.f2645r = c0811c;
        this.f2646s = c0078o0;
        this.f2647t = c0920w;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        C0811c c0811c = this.f2645r;
        if (c0811c.f2606a != null) {
            AbstractC3204b.m5477c("Expected textInputModifierNode to be null");
        }
        c0811c.f2606a = this;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        this.f2645r.m1421k(this);
    }

    @Override // p041H0.InterfaceC0607n
    /* JADX INFO: renamed from: P */
    public final void mo654P(AbstractC0596h0 abstractC0596h0) {
        this.f2648u.setValue(abstractC0596h0);
    }
}
