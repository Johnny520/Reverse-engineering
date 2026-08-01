package p034G;

import p000A.C0032Q;
import p007B0.AbstractC0181N;
import p007B0.C0186T;
import p007B0.C0200n;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0607n;
import p058L.C0912N;
import p095T.C1357e;
import p095T.C1366i0;

/* JADX INFO: renamed from: G.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0463h extends AbstractC0599j implements InterfaceC0595h, InterfaceC0607n {

    /* JADX INFO: renamed from: t */
    public C0912N f1372t;

    /* JADX INFO: renamed from: u */
    public final C1366i0 f1373u = new C1366i0(null, C1357e.f4795g);

    public C0463h(C0912N c0912n) {
        this.f1372t = c0912n;
        C0032Q c0032q = new C0032Q(1, this);
        C0200n c0200n = AbstractC0181N.f628a;
        m1021J0(new C0186T(null, null, null, c0032q));
    }

    @Override // p041H0.InterfaceC0607n
    /* JADX INFO: renamed from: P */
    public final void mo654P(AbstractC0596h0 abstractC0596h0) {
        this.f1373u.setValue(abstractC0596h0);
    }
}
