package p100U;

import java.util.Set;
import p058L.C0946r;
import p095T.C1308D0;
import p095T.C1324L0;
import p095T.C1388t0;
import p095T.InterfaceC1353c;
import p136b0.C1845g;
import p136b0.C1849k;
import p186k.AbstractC2415L;
import p186k.C2408E;

/* JADX INFO: renamed from: U.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1463x extends AbstractC1437J {

    /* JADX INFO: renamed from: c */
    public static final C1463x f5141c = new C1463x(0, 1, 1);

    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        C1388t0 c1388t0 = (C1388t0) c0946r.m1953d(0);
        Set set = c1849k.f6258a;
        if (set == null) {
            return;
        }
        C1845g c1845g = new C1845g(set);
        C2408E c2408e = c1849k.f6266i;
        if (c2408e == null) {
            long[] jArr = AbstractC2415L.f7816a;
            c2408e = new C2408E();
            c1849k.f6266i = c2408e;
        }
        c2408e.m4278m(c1388t0, c1845g);
        c1849k.f6262e.m2753b(new C1308D0(c1845g, -1));
    }
}
