package p175m0;

import p020b5.C0190i;
import p100h0.C1548s;
import p117i0.AbstractC1855m;
import p117i0.C1848k0;
import p117i0.C1876r1;
import p117i0.InterfaceC1807a;
import p159l0.C2429k;

/* JADX INFO: renamed from: m0.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2691e0 extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2691e0 f8760c = new C2691e0(1, 0, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        int iM4048c = c1548s.m4048c(0);
        int i9 = c2429k.f7984v;
        int iM5808N = c2429k.m5808N(c2429k.f7964b, c2429k.m5832r(i9));
        int iM5822g = c2429k.m5822g(c2429k.f7964b, c2429k.m5832r(i9 + 1));
        for (int iMax = Math.max(iM5808N, iM5822g - iM4048c); iMax < iM5822g; iMax++) {
            Object obj = c2429k.f7965c[c2429k.m5823h(iMax)];
            if (obj instanceof C1848k0) {
                c0190i.m845g((C1848k0) obj);
            } else if (obj instanceof C1876r1) {
                ((C1876r1) obj).m4647c();
            }
        }
        if (iM4048c <= 0) {
            AbstractC1855m.m4573a("Check failed");
        }
        int i10 = c2429k.f7984v;
        int iM5808N2 = c2429k.m5808N(c2429k.f7964b, c2429k.m5832r(i10));
        int iM5822g2 = c2429k.m5822g(c2429k.f7964b, c2429k.m5832r(i10 + 1)) - iM4048c;
        if (iM5822g2 < iM5808N2) {
            AbstractC1855m.m4573a("Check failed");
        }
        c2429k.m5804J(iM5822g2, iM4048c, i10);
        int i11 = c2429k.f7971i;
        if (i11 >= iM5808N2) {
            c2429k.f7971i = i11 - iM4048c;
        }
    }
}
