package p100U;

import p000A.C0038T0;
import p058L.C0946r;
import p095T.C1324L0;
import p095T.C1352b0;
import p095T.InterfaceC1353c;
import p136b0.C1844f;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1445f extends AbstractC1437J {

    /* JADX INFO: renamed from: c */
    public static final C1445f f5119c = new C1445f(0, 2, 1);

    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        C1844f c1844f = (C1844f) c0946r.m1953d(1);
        int i5 = c1844f != null ? c1844f.f6246a : 0;
        C1440a c1440a = (C1440a) c0946r.m1953d(0);
        if (i5 > 0) {
            interfaceC1353c = new C1352b0(interfaceC1353c, i5);
        }
        c1440a.m2729v(interfaceC1353c, c1324l0, c1849k, interfaceC1438K != null ? new C0038T0(18, interfaceC1438K, c1324l0) : null);
    }
}
