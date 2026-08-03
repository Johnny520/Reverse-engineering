package p175m0;

import be.AbstractC0283h;
import p020b5.C0190i;
import p100h0.C1548s;
import p117i0.AbstractC1855m;
import p117i0.InterfaceC1807a;
import p159l0.C2420b;
import p159l0.C2429k;
import p266s0.C3875e;

/* JADX INFO: renamed from: m0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2700j extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2700j f8769c = new C2700j(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        int i9;
        C3875e c3875e = (C3875e) c1548s.m4049d(0);
        int iM5818c = c2429k.m5818c((C2420b) c1548s.m4049d(1));
        if (c2429k.f7982t >= iM5818c) {
            AbstractC1855m.m4573a("Check failed");
        }
        AbstractC0283h.m1136P(c2429k, interfaceC1807a, iM5818c);
        int i10 = c2429k.f7982t;
        int iM5799E = c2429k.f7984v;
        while (iM5799E >= 0 && !c2429k.m5839y(iM5799E)) {
            iM5799E = c2429k.m5799E(c2429k.f7964b, iM5799E);
        }
        int iM5835u = iM5799E + 1;
        int iM5806L = 0;
        while (iM5835u < i10) {
            if (c2429k.m5836v(i10, iM5835u)) {
                if (c2429k.m5839y(iM5835u)) {
                    iM5806L = 0;
                }
                iM5835u++;
            } else {
                iM5806L += c2429k.m5839y(iM5835u) ? 1 : c2429k.f7964b[(c2429k.m5832r(iM5835u) * 5) + 1] & 67108863;
                iM5835u += c2429k.m5835u(iM5835u);
            }
        }
        while (true) {
            i9 = c2429k.f7982t;
            if (i9 >= iM5818c) {
                break;
            }
            if (c2429k.m5836v(iM5818c, i9)) {
                int i11 = c2429k.f7982t;
                if (i11 < c2429k.f7983u && (c2429k.f7964b[(c2429k.m5832r(i11) * 5) + 1] & 1073741824) != 0) {
                    interfaceC1807a.mo4443d(c2429k.m5798D(c2429k.f7982t));
                    iM5806L = 0;
                }
                c2429k.m5810P();
            } else {
                iM5806L += c2429k.m5806L();
            }
        }
        if (i9 != iM5818c) {
            AbstractC1855m.m4573a("Check failed");
        }
        c3875e.f12724a = iM5806L;
    }
}
