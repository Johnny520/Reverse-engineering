package p175m0;

import p014b.C0126e;
import p020b5.C0190i;
import p100h0.C1548s;
import p117i0.AbstractC1855m;
import p117i0.InterfaceC1807a;
import p159l0.C2420b;
import p159l0.C2426h;
import p159l0.C2429k;

/* JADX INFO: renamed from: m0.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2713t extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2713t f8791c = new C2713t(0, 3, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        C0126e c0126e;
        C2426h c2426h = (C2426h) c1548s.m4049d(1);
        C2420b c2420b = (C2420b) c1548s.m4049d(0);
        C2686c c2686c = (C2686c) c1548s.m4049d(2);
        C2429k c2429kM5784e = c2426h.m5784e();
        if (interfaceC2703k0 != null) {
            try {
                c0126e = new C0126e(interfaceC2703k0, 23, c2429k);
            } catch (Throwable th2) {
                c2429kM5784e.m5820e(false);
                throw th2;
            }
        } else {
            c0126e = null;
        }
        if (!c2686c.f8755d.m6135T()) {
            AbstractC1855m.m4573a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c2686c.f8754c.m6134S(interfaceC1807a, c2429kM5784e, c0190i, c0126e);
        c2429kM5784e.m5820e(true);
        c2429k.m5819d();
        c2420b.getClass();
        c2429k.m5795A(c2426h, c2426h.m5781a(c2420b));
        c2429k.m5825k();
    }
}
