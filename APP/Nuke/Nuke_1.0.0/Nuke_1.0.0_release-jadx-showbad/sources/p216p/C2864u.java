package p216p;

import p095T.C1305C;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1604f;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p232s.C3162i;

/* JADX INFO: renamed from: p.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2864u implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC2819L f9029d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f9030e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1599a f9031f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2864u(InterfaceC2819L interfaceC2819L, boolean z5, InterfaceC1599a interfaceC1599a) {
        this.f9029d = interfaceC2819L;
        this.f9030e = z5;
        this.f9031f = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C1383r c1383r = (C1383r) ((InterfaceC1373m) obj2);
        c1383r.m2568W(-1525724089);
        Object objM2558L = c1383r.m2558L();
        if (objM2558L == C1371l.f4833a) {
            objM2558L = new C3162i();
            c1383r.m2585g0(objM2558L);
        }
        C3162i c3162i = (C3162i) objM2558L;
        C1305C c1305c = AbstractC2816I.f8869a;
        InterfaceC2819L interfaceC2819L = this.f9029d;
        InterfaceC2207p interfaceC2207pMo4021c = (interfaceC2819L == null ? C2204m.f7185a : new C2817J(c3162i, interfaceC2819L)).mo4021c(new C2863t(c3162i, null, false, this.f9030e, null, this.f9031f));
        c1383r.m2597p(false);
        return interfaceC2207pMo4021c;
    }
}
