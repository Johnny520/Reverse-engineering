package p175m0;

import java.util.ArrayList;
import p020b5.C0190i;
import p069f.C0943k0;
import p100h0.C1548s;
import p117i0.C1876r1;
import p117i0.InterfaceC1807a;
import p131j0.C2046b;
import p159l0.C2429k;
import p266s0.C3876f;

/* JADX INFO: renamed from: m0.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2708o extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2708o f8782c = new C2708o(0, 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        C2046b c2046b;
        C1876r1 c1876r1 = (C1876r1) c1548s.m4049d(0);
        C0943k0 c0943k0 = (C0943k0) c0190i.f484j;
        if (c0943k0 == null || ((C3876f) c0943k0.m2320g(c1876r1)) == null) {
            return;
        }
        ArrayList arrayList = c0190i.f475a;
        if (arrayList != null && (c2046b = (C2046b) arrayList.remove(arrayList.size() - 1)) != null) {
            c0190i.f480f = c2046b;
        }
        c0943k0.m2324k(c1876r1);
    }
}
