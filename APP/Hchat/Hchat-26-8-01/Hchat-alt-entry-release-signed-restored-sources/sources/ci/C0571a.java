package ci;

import p012ah.C0086a;
import p015b0.C0154t;
import p036c9.C0446i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p276sf.C3967n;
import p293u2.C4236f;
import p293u2.C4238h;
import p304uf.C4327a;
import p322w0.C4665p;
import p357y1.AbstractC5888h1;
import p357y1.C5944v1;
import p357y1.InterfaceC5917o2;

/* JADX INFO: renamed from: ci.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0571a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m1578a(C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-74985928);
        int i10 = i9 & 1;
        if (c1836h0.m4516S(i10, i10 != 0)) {
            C4665p c4665p = (C4665p) c1836h0.m4542j(AbstractC0613y.f1924b);
            C4665p c4665p2 = (C4665p) c1836h0.m4542j(AbstractC0613y.f1923a);
            C5944v1 c5944v1 = (C5944v1) ((InterfaceC5917o2) c1836h0.m4542j(AbstractC5888h1.f23939u));
            float fM8524b = C4238h.m8524b(c5944v1.m10670a());
            if (C4236f.m8519a(C4238h.m8523a(c5944v1.m10670a()), 480) >= 0) {
                C4236f.m8519a(fM8524b, 840);
            }
            c1836h0.m4525a0(952973683);
            C4327a c4327a = (C4327a) c4665p.listIterator();
            if (c4327a.hasNext()) {
                c4327a.next().getClass();
                C0086a.m445d();
                return;
            }
            c1836h0.m4553p(false);
            c1836h0.m4525a0(952982109);
            C4327a c4327a2 = (C4327a) c4665p2.listIterator();
            if (c4327a2.hasNext()) {
                c4327a2.next().getClass();
                C0086a.m445d();
                return;
            }
            c1836h0.m4553p(false);
            Integer numValueOf = Integer.valueOf(c4665p.size());
            Integer numValueOf2 = Integer.valueOf(c4665p2.size());
            boolean zM4534f = c1836h0.m4534f(c4665p) | c1836h0.m4534f(c4665p2);
            Object objM4514P = c1836h0.m4514P();
            Object obj = C1851l.f6155a;
            if (zM4534f || objM4514P == obj) {
                objM4514P = new C0609u(c4665p, c4665p2, null, 0);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC1874r.m4625g(numValueOf, numValueOf2, (InterfaceC1235p) objM4514P, c1836h0);
            boolean zM4534f2 = c1836h0.m4534f(c4665p) | c1836h0.m4534f(c4665p2);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4534f2 || objM4514P2 == obj) {
                objM4514P2 = new C0446i(c4665p, 7, c4665p2);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC1874r.m4621c(C3967n.f12976a, (InterfaceC1231l) objM4514P2, c1836h0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0154t(i9, 5, this);
        }
    }
}
