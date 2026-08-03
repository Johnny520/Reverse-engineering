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

/* JADX INFO: renamed from: m0.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2689d0 extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2689d0 f8758c = new C2689d0(0, 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        C1876r1 c1876r1 = (C1876r1) c1548s.m4049d(0);
        C0943k0 c0943k0 = (C0943k0) c0190i.f484j;
        C3876f c3876f = c0943k0 != null ? (C3876f) c0943k0.m2320g(c1876r1) : null;
        if (c3876f != null) {
            ArrayList arrayList = c0190i.f475a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c0190i.f475a = arrayList;
            }
            arrayList.add((C2046b) c0190i.f480f);
            c0190i.f480f = c3876f.f12726h;
        }
    }
}
