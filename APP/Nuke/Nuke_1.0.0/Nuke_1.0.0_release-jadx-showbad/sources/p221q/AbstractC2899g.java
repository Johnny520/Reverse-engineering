package p221q;

import p000A.AbstractC0070k0;
import p000A.C0008E;
import p008B1.C0214b;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0587d;
import p041H0.C0589e;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p058L.C0904F;
import p092S0.C1260M;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2198g;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p176i1.AbstractC2298n;
import p193l0.AbstractC2485h;
import p211o0.AbstractC2767z;
import p211o0.C2762u;
import p216p.AbstractC2856m;
import p244u.AbstractC3255Y;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.AbstractC3282o;
import p244u.AbstractC3287t;
import p244u.C3244M;
import p244u.C3256Z;
import p244u.C3259b;
import p244u.C3269g;
import p244u.C3289v;
import p244u.C3290w;
import p250v.AbstractC3349a;
import p272z.AbstractC3507e;

/* JADX INFO: renamed from: q.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2899g {

    /* JADX INFO: renamed from: a */
    public static final C2895c f9179a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1305C c1305c = AbstractC2298n.f7490a;
        long j5 = C2762u.f8758c;
        long j6 = C2762u.f8757b;
        f9179a = new C2895c(j5, j6, j6, C2762u.m4920b(0.38f, j6), C2762u.m4920b(0.38f, j6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5093a(C2895c c2895c, InterfaceC2207p interfaceC2207p, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-527864079);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2582f(c2895c) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(interfaceC2207p) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 256 : 128;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            InterfaceC2207p interfaceC2207pM5060n = AbstractC2856m.m5060n(AbstractC3261c.m5530q(AbstractC3261c.m5538y(AbstractC2856m.m5050d(AbstractC2485h.m4433g(interfaceC2207p, AbstractC2897e.f9159d, AbstractC3507e.m5761a(AbstractC2897e.f9160e), 28), c2895c.f9150a, AbstractC2767z.f8776b)), 0.0f, AbstractC2897e.f9164i, 1), AbstractC2856m.m5057k(c1383r));
            int i7 = (i6 << 3) & 7168;
            C3289v c3289vM5564a = AbstractC3287t.m5564a(AbstractC3273i.f10112c, C2194c.f7171o, c1383r, 0);
            int iHashCode = Long.hashCode(c1383r.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pM5060n);
            InterfaceC0593g.f1909a.getClass();
            C0551B c0551b = C0591f.f1902b;
            c1383r.m2571Z();
            if (c1383r.f4881S) {
                c1383r.m2592k(c0551b);
            } else {
                c1383r.m2591j0();
            }
            AbstractC1385s.m2635y(c1383r, C0591f.f1905e, c3289vM5564a);
            AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
            AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
            AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
            AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
            c1843e.mo5f(C3290w.f10173a, c1383r, Integer.valueOf(((i7 >> 6) & 112) | 6));
            c1383r.m2597p(true);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(c2895c, interfaceC2207p, c1843e, i5, 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m5094b(InterfaceC2207p interfaceC2207p, C2895c c2895c, InterfaceC1601c interfaceC1601c, InterfaceC1373m interfaceC1373m, int i5, int i6) {
        int i7;
        int i8;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-625529233);
        int i9 = i6 & 1;
        if (i9 != 0) {
            i7 = i5 | 6;
        } else {
            i7 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        }
        int i10 = i6 & 2;
        if (i10 != 0) {
            i8 = i7 | 48;
        } else {
            i8 = i7 | (c1383r.m2582f(c2895c) ? 32 : 16);
        }
        int i11 = i8 | (c1383r.m2586h(interfaceC1601c) ? 256 : 128);
        if (c1383r.m2560O(i11 & 1, (i11 & 147) != 146)) {
            if (i9 != 0) {
                interfaceC2207p = C2204m.f7185a;
            }
            if (i10 != 0) {
                c2895c = f9179a;
            }
            m5093a(c2895c, interfaceC2207p, AbstractC1848j.m3314c(-250345048, new C0904F(interfaceC1601c, c2895c), c1383r), c1383r, ((i11 << 3) & 112) | ((i11 >> 3) & 14) | 384);
        } else {
            c1383r.m2563R();
        }
        InterfaceC2207p interfaceC2207p2 = interfaceC2207p;
        C2895c c2895c2 = c2895c;
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(interfaceC2207p2, c2895c2, interfaceC1601c, i5, i6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m5095c(final String str, final boolean z5, final C2895c c2895c, final InterfaceC2207p interfaceC2207p, final InterfaceC1604f interfaceC1604f, final InterfaceC1599a interfaceC1599a, InterfaceC1373m interfaceC1373m, final int i5) {
        int i6;
        int i7;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-2001167027);
        int i8 = 2;
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2582f(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2584g(z5) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2582f(c2895c) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r.m2582f(interfaceC2207p) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= c1383r.m2586h(interfaceC1604f) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= c1383r.m2586h(interfaceC1599a) ? 131072 : 65536;
        }
        if (c1383r.m2560O(i6 & 1, (74899 & i6) != 74898)) {
            C2198g c2198g = AbstractC2897e.f9161f;
            C3259b c3259b = AbstractC3273i.f10110a;
            float f2 = AbstractC2897e.f9163h;
            C3269g c3269gM5549g = AbstractC3273i.m5549g(f2);
            boolean z6 = ((i6 & 112) == 32) | ((458752 & i6) == 131072);
            Object objM2558L = c1383r.m2558L();
            if (z6 || objM2558L == C1371l.f4833a) {
                objM2558L = new C0008E(i8, interfaceC1599a, z5);
                c1383r.m2585g0(objM2558L);
            }
            InterfaceC2207p interfaceC2207pMo4021c = AbstractC2856m.m5053g(interfaceC2207p, z5, str, (InterfaceC1599a) objM2558L, 12).mo4021c(AbstractC3261c.f10087c);
            float f5 = AbstractC2897e.f9156a;
            float f6 = AbstractC2897e.f9157b;
            float f7 = AbstractC2897e.f9158c;
            InterfaceC2207p interfaceC2207pM5530q = AbstractC3261c.m5530q(AbstractC3261c.m5535v(interfaceC2207pMo4021c, f5, f7, f6, f7), f2, 0.0f, 2);
            C3256Z c3256zM5504a = AbstractC3255Y.m5504a(c3269gM5549g, c2198g, c1383r, 54);
            int iHashCode = Long.hashCode(c1383r.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pM5530q);
            InterfaceC0593g.f1909a.getClass();
            C0551B c0551b = C0591f.f1902b;
            c1383r.m2571Z();
            if (c1383r.f4881S) {
                c1383r.m2592k(c0551b);
            } else {
                c1383r.m2591j0();
            }
            C0589e c0589e = C0591f.f1905e;
            AbstractC1385s.m2635y(c1383r, c0589e, c3256zM5504a);
            C0589e c0589e2 = C0591f.f1904d;
            AbstractC1385s.m2635y(c1383r, c0589e2, interfaceC1378o0M2593l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0589e c0589e3 = C0591f.f1906f;
            AbstractC1385s.m2627q(c1383r, numValueOf, c0589e3);
            C0587d c0587d = C0591f.f1907g;
            AbstractC1385s.m2631u(c1383r, c0587d);
            C0589e c0589e4 = C0591f.f1903c;
            AbstractC1385s.m2635y(c1383r, c0589e4, interfaceC2207pM4016c);
            if (interfaceC1604f == null) {
                c1383r.m2568W(-1597947094);
                c1383r.m2597p(false);
                i7 = i6;
            } else {
                c1383r.m2568W(-1597947093);
                float f8 = AbstractC2897e.f9165j;
                InterfaceC2207p interfaceC2207pM5532s = AbstractC3261c.m5532s(C2204m.f7185a, f8, 0.0f, f8, f8, 2);
                i7 = i6;
                InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7160d, false);
                int iHashCode2 = Long.hashCode(c1383r.f4882T);
                InterfaceC1378o0 interfaceC1378o0M2593l2 = c1383r.m2593l();
                InterfaceC2207p interfaceC2207pM4016c2 = AbstractC2192a.m4016c(c1383r, interfaceC2207pM5532s);
                c1383r.m2571Z();
                if (c1383r.f4881S) {
                    c1383r.m2592k(c0551b);
                } else {
                    c1383r.m2591j0();
                }
                AbstractC1385s.m2635y(c1383r, c0589e, interfaceC0377OM5561d);
                AbstractC1385s.m2635y(c1383r, c0589e2, interfaceC1378o0M2593l2);
                AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode2), c0589e3);
                AbstractC1385s.m2631u(c1383r, c0587d);
                AbstractC1385s.m2635y(c1383r, c0589e4, interfaceC2207pM4016c2);
                interfaceC1604f.mo5f(new C2762u(z5 ? c2895c.f9152c : c2895c.f9154e), c1383r, 0);
                c1383r.m2597p(true);
                c1383r.m2597p(false);
            }
            C1260M c1260m = new C1260M(z5 ? c2895c.f9151b : c2895c.f9153d, AbstractC2897e.f9168m, AbstractC2897e.f9169n, AbstractC2897e.f9171p, AbstractC2897e.f9162g, AbstractC2897e.f9170o, null, null, 16613240);
            if (1.0f <= 0.0d) {
                AbstractC3349a.m5598a("invalid weight; must be greater than zero");
            }
            AbstractC0070k0.m74a(str, new C3244M(1.0f, true), c1260m, 0, false, 1, 0, c1383r, (i7 & 14) | 1572864, 952);
            c1383r.m2597p(true);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: q.f
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2899g.m5095c(str, z5, c2895c, interfaceC2207p, interfaceC1604f, interfaceC1599a, (InterfaceC1373m) obj, AbstractC1385s.m2609A(i5 | 1));
                    return C0891q.f2780a;
                }
            };
        }
    }
}
