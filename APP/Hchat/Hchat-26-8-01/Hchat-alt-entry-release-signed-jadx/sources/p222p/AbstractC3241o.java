package p222p;

import p069f.C0943k0;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1876r1;
import p266s0.C3878h;
import p293u2.EnumC4243m;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5845g;
import p356y0.InterfaceC5841c;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: p.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3241o {

    /* JADX INFO: renamed from: a */
    public static final C0943k0 f10334a = m6929c(true);

    /* JADX INFO: renamed from: b */
    public static final C0943k0 f10335b = m6929c(false);

    /* JADX INFO: renamed from: c */
    public static final C3238n f10336c = C3238n.f10326b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m6927a(InterfaceC5853o interfaceC5853o, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-211209833);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 3) != 2)) {
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853o);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, f10336c);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            c1836h0.m4553p(true);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C3235m(interfaceC5853o, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m6928b(AbstractC4374a1 abstractC4374a1, AbstractC4377b1 abstractC4377b1, InterfaceC4409m0 interfaceC4409m0, EnumC4243m enumC4243m, int i9, int i10, C5845g c5845g) {
        InterfaceC5841c interfaceC5841c;
        Object objMo8824X = interfaceC4409m0.mo8824X();
        C3232l c3232l = objMo8824X instanceof C3232l ? (C3232l) objMo8824X : null;
        AbstractC4374a1.m8810C(abstractC4374a1, abstractC4377b1, ((c3232l == null || (interfaceC5841c = c3232l.f10315u) == null) ? c5845g : interfaceC5841c).mo10544a((((long) abstractC4377b1.f14593g) << 32) | (((long) abstractC4377b1.f14594h) & 4294967295L), (((long) i9) << 32) | (((long) i10) & 4294967295L), enumC4243m));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final C0943k0 m6929c(boolean z9) {
        C0943k0 c0943k0 = new C0943k0(9);
        C5845g c5845g = C5840b.f23761g;
        c0943k0.m2326m(c5845g, new C3247q(c5845g, z9));
        C5845g c5845g2 = C5840b.f23762h;
        c0943k0.m2326m(c5845g2, new C3247q(c5845g2, z9));
        C5845g c5845g3 = C5840b.f23763i;
        c0943k0.m2326m(c5845g3, new C3247q(c5845g3, z9));
        C5845g c5845g4 = C5840b.f23764j;
        c0943k0.m2326m(c5845g4, new C3247q(c5845g4, z9));
        C5845g c5845g5 = C5840b.f23765k;
        c0943k0.m2326m(c5845g5, new C3247q(c5845g5, z9));
        C5845g c5845g6 = C5840b.f23766l;
        c0943k0.m2326m(c5845g6, new C3247q(c5845g6, z9));
        C5845g c5845g7 = C5840b.f23767m;
        c0943k0.m2326m(c5845g7, new C3247q(c5845g7, z9));
        C5845g c5845g8 = C5840b.f23768n;
        c0943k0.m2326m(c5845g8, new C3247q(c5845g8, z9));
        C5845g c5845g9 = C5840b.f23769o;
        c0943k0.m2326m(c5845g9, new C3247q(c5845g9, z9));
        return c0943k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC4412n0 m6930d(C5845g c5845g, boolean z9) {
        InterfaceC4412n0 interfaceC4412n0 = (InterfaceC4412n0) (z9 ? f10334a : f10335b).m2320g(c5845g);
        return interfaceC4412n0 == null ? new C3247q(c5845g, z9) : interfaceC4412n0;
    }
}
