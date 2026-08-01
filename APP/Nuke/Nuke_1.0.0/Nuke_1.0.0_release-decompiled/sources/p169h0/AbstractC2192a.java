package p169h0;

import p047I0.C0710a;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1604f;

/* JADX INFO: renamed from: h0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2192a {

    /* JADX INFO: renamed from: a */
    public static final C2196e f7157a = new C2196e(-1.0f);

    /* JADX INFO: renamed from: b */
    public static final C2196e f7158b = new C2196e(1.0f);

    /* JADX INFO: renamed from: a */
    public static InterfaceC2207p m4014a(InterfaceC2207p interfaceC2207p, InterfaceC1604f interfaceC1604f) {
        return interfaceC2207p.mo4021c(new C2202k(interfaceC1604f));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2207p m4015b(InterfaceC1373m interfaceC1373m, InterfaceC2207p interfaceC2207p) {
        if (interfaceC2207p.mo4019a(C2203l.f7184e)) {
            return interfaceC2207p;
        }
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2564S(1219399079, 0, null, null);
        InterfaceC2207p interfaceC2207p2 = (InterfaceC2207p) interfaceC2207p.mo4020b(new C0710a(2, interfaceC1373m), C2204m.f7185a);
        c1383r.m2597p(false);
        return interfaceC2207p2;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2207p m4016c(InterfaceC1373m interfaceC1373m, InterfaceC2207p interfaceC2207p) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2568W(439770924);
        InterfaceC2207p interfaceC2207pM4015b = m4015b(c1383r, interfaceC2207p);
        c1383r.m2597p(false);
        return interfaceC2207pM4015b;
    }
}
