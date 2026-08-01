package p244u;

import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p169h0.C2194c;
import p169h0.C2197f;

/* JADX INFO: renamed from: u.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3287t {

    /* JADX INFO: renamed from: a */
    public static final C3289v f10165a = new C3289v(AbstractC3273i.f10112c, C2194c.f7171o);

    /* JADX INFO: renamed from: a */
    public static final C3289v m5564a(InterfaceC3271h interfaceC3271h, C2197f c2197f, InterfaceC1373m interfaceC1373m, int i5) {
        if (interfaceC3271h.equals(AbstractC3273i.f10112c) && c2197f.equals(C2194c.f7171o)) {
            C1383r c1383r = (C1383r) interfaceC1373m;
            c1383r.m2568W(-1446604504);
            c1383r.m2597p(false);
            return f10165a;
        }
        C1383r c1383r2 = (C1383r) interfaceC1373m;
        c1383r2.m2568W(-1446550657);
        boolean z5 = true;
        boolean z6 = (((i5 & 14) ^ 6) > 4 && c1383r2.m2582f(interfaceC3271h)) || (i5 & 6) == 4;
        if ((((i5 & 112) ^ 48) <= 32 || !c1383r2.m2582f(c2197f)) && (i5 & 48) != 32) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object objM2558L = c1383r2.m2558L();
        if (z7 || objM2558L == C1371l.f4833a) {
            objM2558L = new C3289v(interfaceC3271h, c2197f);
            c1383r2.m2585g0(objM2558L);
        }
        C3289v c3289v = (C3289v) objM2558L;
        c1383r2.m2597p(false);
        return c3289v;
    }
}
