package p100U;

import p058L.C0946r;
import p095T.AbstractC1387t;
import p095T.C1308D0;
import p095T.C1324L0;
import p095T.C1388t0;
import p095T.InterfaceC1353c;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1432E extends AbstractC1437J {

    /* JADX INFO: renamed from: c */
    public static final C1432E f5089c = new C1432E(1, 0, 2);

    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        int iM1952c = c0946r.m1952c(0);
        int i5 = c1324l0.f4744v;
        int iM2463N = c1324l0.m2463N(c1324l0.f4724b, c1324l0.m2487r(i5));
        int iM2477g = c1324l0.m2477g(c1324l0.f4724b, c1324l0.m2487r(i5 + 1));
        for (int iMax = Math.max(iM2463N, iM2477g - iM1952c); iMax < iM2477g; iMax++) {
            Object obj = c1324l0.f4725c[c1324l0.m2478h(iMax)];
            if (obj instanceof C1308D0) {
                c1849k.m3321e((C1308D0) obj);
            } else if (obj instanceof C1388t0) {
                ((C1388t0) obj).m2643d();
            }
        }
        if (iM1952c <= 0) {
            AbstractC1387t.m2638a("Check failed");
        }
        int i6 = c1324l0.f4744v;
        int iM2463N2 = c1324l0.m2463N(c1324l0.f4724b, c1324l0.m2487r(i6));
        int iM2477g2 = c1324l0.m2477g(c1324l0.f4724b, c1324l0.m2487r(i6 + 1)) - iM1952c;
        if (iM2477g2 < iM2463N2) {
            AbstractC1387t.m2638a("Check failed");
        }
        c1324l0.m2459J(iM2477g2, iM1952c, i6);
        int i7 = c1324l0.f4731i;
        if (i7 >= iM2463N2) {
            c1324l0.f4731i = i7 - iM1952c;
        }
    }
}
