package p197m;

import p007B0.C0172E;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1339T0;
import p095T.InterfaceC1373m;
import p203n.AbstractC2649d;
import p203n.AbstractC2651e;
import p203n.C2650d0;
import p203n.C2652e0;
import p211o0.C2762u;

/* JADX INFO: renamed from: m.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2536V {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2649d.m4617j(0.0f, 0.0f, null, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1339T0 m4472a(long j5, C2650d0 c2650d0, String str, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        boolean zM2582f = c1383r.m2582f(C2762u.m4924f(j5));
        Object objM2558L = c1383r.m2558L();
        if (zM2582f || objM2558L == C1371l.f4833a) {
            C2652e0 c2652e0 = new C2652e0(C2543c.f8117h, new C0172E(21, C2762u.m4924f(j5)));
            c1383r.m2585g0(c2652e0);
            objM2558L = c2652e0;
        }
        return AbstractC2651e.m4622c(new C2762u(j5), (C2652e0) objM2558L, c2650d0, null, str, c1383r, 24960, 8);
    }
}
