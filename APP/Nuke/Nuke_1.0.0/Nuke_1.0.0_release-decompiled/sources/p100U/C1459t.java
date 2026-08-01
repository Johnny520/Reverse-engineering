package p100U;

import p000A.C0038T0;
import p058L.C0946r;
import p095T.AbstractC1387t;
import p095T.C1318I0;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.InterfaceC1353c;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1459t extends AbstractC1437J {

    /* JADX INFO: renamed from: c */
    public static final C1459t f5137c = new C1459t(0, 3, 1);

    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        C0038T0 c0038t0;
        C1318I0 c1318i0 = (C1318I0) c0946r.m1953d(1);
        C1349a c1349a = (C1349a) c0946r.m1953d(0);
        C1442c c1442c = (C1442c) c0946r.m1953d(2);
        C1324L0 c1324l0M2439d = c1318i0.m2439d();
        if (interfaceC1438K != null) {
            try {
                c0038t0 = new C0038T0(18, interfaceC1438K, c1324l0);
            } catch (Throwable th) {
                c1324l0M2439d.m2475e(false);
                throw th;
            }
        } else {
            c0038t0 = null;
        }
        if (!c1442c.f5116i.m2726x()) {
            AbstractC1387t.m2638a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c1442c.f5115h.m2725w(interfaceC1353c, c1324l0M2439d, c1849k, c0038t0);
        c1324l0M2439d.m2475e(true);
        c1324l0.m2474d();
        c1349a.getClass();
        c1324l0.m2450A(c1318i0, c1318i0.m2436a(c1349a));
        c1324l0.m2480k();
    }
}
