package p175m0;

import p020b5.C0190i;
import p069f.C0945l0;
import p100h0.C1548s;
import p117i0.AbstractC1855m;
import p117i0.C1848k0;
import p117i0.InterfaceC1807a;
import p131j0.C2046b;
import p159l0.C2420b;
import p159l0.C2429k;

/* JADX INFO: renamed from: m0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2690e extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2690e f8759c = new C2690e(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        C2420b c2420b = (C2420b) c1548s.m4049d(0);
        Object objM4049d = c1548s.m4049d(1);
        if (objM4049d instanceof C1848k0) {
            C1848k0 c1848k0 = (C1848k0) objM4049d;
            ((C2046b) c0190i.f480f).m5056b(c1848k0);
            ((C0945l0) c0190i.f479e).m2328a(c1848k0);
        }
        if (c2429k.f7976n != 0) {
            AbstractC1855m.m4573a("Can only append a slot if not current inserting");
        }
        int i9 = c2429k.f7971i;
        int i10 = c2429k.f7972j;
        int iM5818c = c2429k.m5818c(c2420b);
        int iM5822g = c2429k.m5822g(c2429k.f7964b, c2429k.m5832r(iM5818c + 1));
        c2429k.f7971i = iM5822g;
        c2429k.f7972j = iM5822g;
        c2429k.m5838x(1, iM5818c);
        if (i9 >= iM5822g) {
            i9++;
            i10++;
        }
        c2429k.f7965c[iM5822g] = objM4049d;
        c2429k.f7971i = i9;
        c2429k.f7972j = i10;
    }
}
