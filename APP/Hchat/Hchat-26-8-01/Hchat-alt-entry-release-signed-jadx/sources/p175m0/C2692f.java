package p175m0;

import p014b.C0126e;
import p020b5.C0190i;
import p100h0.C1548s;
import p116i.C1795u1;
import p117i0.InterfaceC1807a;
import p159l0.C2429k;
import p266s0.C3875e;

/* JADX INFO: renamed from: m0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2692f extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2692f f8761c = new C2692f(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        C3875e c3875e = (C3875e) c1548s.m4049d(1);
        int i9 = c3875e != null ? c3875e.f12724a : 0;
        C2682a c2682a = (C2682a) c1548s.m4049d(0);
        if (i9 > 0) {
            interfaceC1807a = new C1795u1(interfaceC1807a, i9);
        }
        c2682a.m6125t0(interfaceC1807a, c2429k, c0190i, interfaceC2703k0 != null ? new C0126e(interfaceC2703k0, 23, c2429k) : null);
    }
}
