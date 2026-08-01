package p029F0;

import p001A0.C0102b;
import p041H0.AbstractC0573S;
import p041H0.AbstractC0596h0;
import p041H0.C0551B;
import p041H0.C0564I;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p095T.AbstractC1385s;
import p095T.C1371l;
import p095T.C1379p;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2192a;
import p169h0.InterfaceC2207p;
import p204n0.C2684c;

/* JADX INFO: renamed from: F0.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0435z {

    /* JADX INFO: renamed from: a */
    public static final C0402h f1307a = new C0402h(2);

    /* JADX INFO: renamed from: b */
    public static final Object f1308b = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m688a(C0413m0 c0413m0, InterfaceC2207p interfaceC2207p, InterfaceC1603e interfaceC1603e, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-511989831);
        int i6 = (c1383r.m2586h(c0413m0) ? 4 : 2) | i5 | (c1383r.m2582f(interfaceC2207p) ? 32 : 16) | (c1383r.m2586h(interfaceC1603e) ? 256 : 128);
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            int iHashCode = Long.hashCode(c1383r.f4882T);
            C1379p c1379pM2632v = AbstractC1385s.m2632v(c1383r);
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207p);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            c1383r.m2571Z();
            if (c1383r.f4881S) {
                c1383r.m2592k(C0551B.f1664e);
            } else {
                c1383r.m2591j0();
            }
            AbstractC1385s.m2635y(c1383r, c0413m0.f1244c, c0413m0);
            AbstractC1385s.m2635y(c1383r, c0413m0.f1245d, c1379pM2632v);
            AbstractC1385s.m2635y(c1383r, c0413m0.f1246e, interfaceC1603e);
            InterfaceC0593g.f1909a.getClass();
            AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
            AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
            AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
            AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
            c1383r.m2597p(true);
            if (c1383r.m2547A()) {
                c1383r.m2568W(-1266202711);
            } else {
                c1383r.m2568W(-1259244916);
                boolean zM2586h = c1383r.m2586h(c0413m0);
                Object objM2558L = c1383r.m2558L();
                if (zM2586h || objM2558L == C1371l.f4833a) {
                    objM2558L = new C0102b(3, c0413m0);
                    c1383r.m2585g0(objM2558L);
                }
                AbstractC1385s.m2617g((InterfaceC1599a) objM2558L, c1383r);
            }
            c1383r.m2597p(false);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0405i0(c0413m0, interfaceC2207p, interfaceC1603e, i5, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m689b(p029F0.AbstractC0389a0 r6, boolean r7, p029F0.C0414n[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.mo628d(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p029F0.AbstractC0435z.m689b(F0.a0, boolean, F0.n[], float):float");
    }

    /* JADX INFO: renamed from: c */
    public static final C2684c m690c(InterfaceC0430v interfaceC0430v) {
        InterfaceC0430v interfaceC0430vMo643n = interfaceC0430v.mo643n();
        return interfaceC0430vMo643n != null ? interfaceC0430vMo643n.mo634K(interfaceC0430v, true) : new C2684c(0.0f, 0.0f, (int) (interfaceC0430v.mo637Q() >> 32), (int) (interfaceC0430v.mo637Q() & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final C2684c m691d(InterfaceC0430v interfaceC0430v, boolean z5) {
        InterfaceC0430v interfaceC0430vM693f = m693f(interfaceC0430v);
        float fMo637Q = (int) (interfaceC0430vM693f.mo637Q() >> 32);
        float fMo637Q2 = (int) (interfaceC0430vM693f.mo637Q() & 4294967295L);
        C2684c c2684cMo634K = interfaceC0430vM693f.mo634K(interfaceC0430v, z5);
        float f2 = c2684cMo634K.f8561d;
        float f5 = c2684cMo634K.f8560c;
        float f6 = c2684cMo634K.f8559b;
        float f7 = c2684cMo634K.f8558a;
        if (z5) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            }
            if (f7 > fMo637Q) {
                f7 = fMo637Q;
            }
        }
        if (z5) {
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            if (f6 > fMo637Q2) {
                f6 = fMo637Q2;
            }
        }
        if (z5) {
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 <= fMo637Q) {
                fMo637Q = f5;
            }
            f5 = fMo637Q;
        }
        if (z5) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 <= fMo637Q2) {
                fMo637Q2 = f2;
            }
            f2 = fMo637Q2;
        }
        if (f7 == f5 || f6 == f2) {
            return C2684c.f8557e;
        }
        long jMo642k = interfaceC0430vM693f.mo642k((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L));
        long jMo642k2 = interfaceC0430vM693f.mo642k((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L));
        long jMo642k3 = interfaceC0430vM693f.mo642k((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo642k4 = interfaceC0430vM693f.mo642k((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo642k >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo642k2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo642k4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo642k3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo642k & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo642k2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo642k4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo642k3 & 4294967295L));
        return new C2684c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m692e(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0430v m693f(InterfaceC0430v interfaceC0430v) {
        InterfaceC0430v interfaceC0430v2;
        InterfaceC0430v interfaceC0430vMo643n = interfaceC0430v.mo643n();
        while (true) {
            InterfaceC0430v interfaceC0430v3 = interfaceC0430vMo643n;
            interfaceC0430v2 = interfaceC0430v;
            interfaceC0430v = interfaceC0430v3;
            if (interfaceC0430v == null) {
                break;
            }
            interfaceC0430vMo643n = interfaceC0430v.mo643n();
        }
        AbstractC0596h0 abstractC0596h0 = interfaceC0430v2 instanceof AbstractC0596h0 ? (AbstractC0596h0) interfaceC0430v2 : null;
        if (abstractC0596h0 == null) {
            return interfaceC0430v2;
        }
        AbstractC0596h0 abstractC0596h02 = abstractC0596h0.f1934t;
        while (true) {
            AbstractC0596h0 abstractC0596h03 = abstractC0596h02;
            AbstractC0596h0 abstractC0596h04 = abstractC0596h0;
            abstractC0596h0 = abstractC0596h03;
            if (abstractC0596h0 == null) {
                return abstractC0596h04;
            }
            abstractC0596h02 = abstractC0596h0.f1934t;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC0573S m694g(AbstractC0573S abstractC0573S) {
        C0564I c0564i = abstractC0573S.f1785r.f1932r;
        while (true) {
            C0564I c0564iM839u = c0564i.m839u();
            C0564I c0564i2 = null;
            if ((c0564iM839u != null ? c0564iM839u.f1719l : null) == null) {
                AbstractC0573S abstractC0573SMo979P0 = c0564i.f1699J.f1894d.mo979P0();
                AbstractC1665j.m2982b(abstractC0573SMo979P0);
                return abstractC0573SMo979P0;
            }
            C0564I c0564iM839u2 = c0564i.m839u();
            if (c0564iM839u2 != null) {
                c0564i2 = c0564iM839u2.f1719l;
            }
            AbstractC1665j.m2982b(c0564i2);
            C0564I c0564iM839u3 = c0564i.m839u();
            AbstractC1665j.m2982b(c0564iM839u3);
            c0564i = c0564iM839u3.f1719l;
            AbstractC1665j.m2982b(c0564i);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2207p m695h(InterfaceC1604f interfaceC1604f) {
        return new C0432w(interfaceC1604f);
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC2207p m696i(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C0382U(interfaceC1601c));
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC2207p m697j(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C0384W(interfaceC1601c));
    }

    /* JADX INFO: renamed from: k */
    public static final long m698k(long j5, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * Float.intBitsToFloat((int) (j5 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L)) * Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
