package p175m0;

import java.util.Set;
import p020b5.C0190i;
import p069f.AbstractC0957r0;
import p069f.C0943k0;
import p100h0.C1548s;
import p117i0.C1848k0;
import p117i0.C1876r1;
import p117i0.InterfaceC1807a;
import p131j0.C2046b;
import p159l0.C2429k;
import p266s0.C3876f;

/* JADX INFO: renamed from: m0.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2717x extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2717x f8795c = new C2717x(0, 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        C1876r1 c1876r1 = (C1876r1) c1548s.m4049d(0);
        Set set = (Set) c0190i.f476b;
        if (set == null) {
            return;
        }
        C3876f c3876f = new C3876f(set);
        C0943k0 c0943k0 = (C0943k0) c0190i.f484j;
        if (c0943k0 == null) {
            long[] jArr = AbstractC0957r0.f3015a;
            c0943k0 = new C0943k0();
            c0190i.f484j = c0943k0;
        }
        c0943k0.m2326m(c1876r1, c3876f);
        ((C2046b) c0190i.f480f).m5056b(new C1848k0(c3876f, -1));
    }
}
