package p100U;

import p049I2.AbstractC0797o;
import p058L.C0946r;
import p095T.AbstractC1387t;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.InterfaceC1353c;
import p136b0.C1844f;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1449j extends AbstractC1437J {

    /* JADX INFO: renamed from: c */
    public static final C1449j f5123c = new C1449j(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        int i5;
        C1844f c1844f = (C1844f) c0946r.m1953d(0);
        int iM2473c = c1324l0.m2473c((C1349a) c0946r.m1953d(1));
        if (c1324l0.f4742t >= iM2473c) {
            AbstractC1387t.m2638a("Check failed");
        }
        AbstractC0797o.m1400y(c1324l0, interfaceC1353c, iM2473c);
        int i6 = c1324l0.f4742t;
        int iM2454E = c1324l0.f4744v;
        while (iM2454E >= 0 && !c1324l0.m2494y(iM2454E)) {
            iM2454E = c1324l0.m2454E(c1324l0.f4724b, iM2454E);
        }
        int iM2490u = iM2454E + 1;
        int iM2461L = 0;
        while (iM2490u < i6) {
            if (c1324l0.m2491v(i6, iM2490u)) {
                if (c1324l0.m2494y(iM2490u)) {
                    iM2461L = 0;
                }
                iM2490u++;
            } else {
                iM2461L += c1324l0.m2494y(iM2490u) ? 1 : c1324l0.f4724b[(c1324l0.m2487r(iM2490u) * 5) + 1] & 67108863;
                iM2490u += c1324l0.m2490u(iM2490u);
            }
        }
        while (true) {
            i5 = c1324l0.f4742t;
            if (i5 >= iM2473c) {
                break;
            }
            if (c1324l0.m2491v(iM2473c, i5)) {
                int i7 = c1324l0.f4742t;
                if (i7 < c1324l0.f4743u && (c1324l0.f4724b[(c1324l0.m2487r(i7) * 5) + 1] & 1073741824) != 0) {
                    interfaceC1353c.mo781d(c1324l0.m2453D(c1324l0.f4742t));
                    iM2461L = 0;
                }
                c1324l0.m2465P();
            } else {
                iM2461L += c1324l0.m2461L();
            }
        }
        if (i5 != iM2473c) {
            AbstractC1387t.m2638a("Check failed");
        }
        c1844f.f6246a = iM2461L;
    }
}
