package p100U;

import p058L.C0946r;
import p095T.AbstractC1387t;
import p095T.C1308D0;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.InterfaceC1353c;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1444e extends AbstractC1437J {

    /* JADX INFO: renamed from: c */
    public static final C1444e f5118c = new C1444e(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        C1349a c1349a = (C1349a) c0946r.m1953d(0);
        Object objM1953d = c0946r.m1953d(1);
        if (objM1953d instanceof C1308D0) {
            C1308D0 c1308d0 = (C1308D0) objM1953d;
            c1849k.f6262e.m2753b(c1308d0);
            c1849k.f6261d.m4279a(c1308d0);
        }
        if (c1324l0.f4736n != 0) {
            AbstractC1387t.m2638a("Can only append a slot if not current inserting");
        }
        int i5 = c1324l0.f4731i;
        int i6 = c1324l0.f4732j;
        int iM2473c = c1324l0.m2473c(c1349a);
        int iM2477g = c1324l0.m2477g(c1324l0.f4724b, c1324l0.m2487r(iM2473c + 1));
        c1324l0.f4731i = iM2477g;
        c1324l0.f4732j = iM2477g;
        c1324l0.m2493x(1, iM2473c);
        if (i5 >= iM2477g) {
            i5++;
            i6++;
        }
        c1324l0.f4725c[iM2477g] = objM1953d;
        c1324l0.f4731i = i5;
        c1324l0.f4732j = i6;
    }
}
