package p076P;

import p000A.C0065i;
import p037G2.C0508t;
import p049I2.AbstractC0797o;
import p056K2.C0891q;
import p058L.AbstractC0933e0;
import p058L.C0931d0;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1386s0;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p211o0.C2762u;
import p216p.AbstractC2816I;

/* JADX INFO: renamed from: P.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1061G {

    /* JADX INFO: renamed from: a */
    public static final C1341U0 f3310a;

    static {
        AbstractC0797o.m1396u(new C0065i(28));
        f3310a = new C1341U0(new C0065i(29));
    }

    /* JADX INFO: renamed from: a */
    public static final void m2126a(final C1104q c1104q, final C1065K c1065k, final C1077X c1077x, final C1093g0 c1093g0, final C1843e c1843e, InterfaceC1373m interfaceC1373m, final int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(904511636);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2582f(c1104q) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(c1065k) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2582f(c1077x) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r.m2582f(c1093g0) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 16384 : 8192;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 9363) != 9362)) {
            c1383r.m2565T();
            if ((i5 & 1) != 0 && !c1383r.m2606y()) {
                c1383r.m2563R();
            }
            c1383r.m2598q();
            C1075V c1075vM2138a = AbstractC1074U.m2138a();
            long j5 = c1104q.f3586a;
            boolean zM2580e = c1383r.m2580e(j5);
            Object objM2558L = c1383r.m2558L();
            if (zM2580e || objM2558L == C1371l.f4833a) {
                objM2558L = new C0931d0(j5, C2762u.m4920b(0.4f, j5));
                c1383r.m2585g0(objM2558L);
            }
            AbstractC1385s.m2612b(new C1386s0[]{AbstractC1105r.f3612a.mo2399a(c1104q), f3310a.mo2399a(c1065k), AbstractC2816I.f8869a.mo2399a(c1075vM2138a), AbstractC1078Y.f3363a.mo2399a(c1077x), AbstractC0933e0.f2926a.mo2399a((C0931d0) objM2558L), AbstractC1095h0.f3516a.mo2399a(c1093g0)}, AbstractC1848j.m3314c(-1750539308, new C1102o(1, c1843e, c1093g0), c1383r), c1383r, 56);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: P.F
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1061G.m2126a(c1104q, c1065k, c1077x, c1093g0, c1843e, (InterfaceC1373m) obj, AbstractC1385s.m2609A(i5 | 1));
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2127b(C1104q c1104q, C1077X c1077x, C1093g0 c1093g0, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        C1104q c1104q2;
        C1843e c1843e2;
        C1093g0 c1093g02;
        C1077X c1077x2;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-449719819);
        int i6 = (c1383r.m2582f(c1104q) ? 4 : 2) | i5 | 16;
        if (c1383r.m2560O(i6 & 1, (i6 & 1171) != 1170)) {
            c1383r.m2565T();
            if ((i5 & 1) == 0 || c1383r.m2606y()) {
                c1077x = (C1077X) c1383r.m2590j(AbstractC1078Y.f3363a);
            } else {
                c1383r.m2563R();
            }
            int i7 = i6 & (-113);
            C1077X c1077x3 = c1077x;
            c1383r.m2598q();
            c1104q2 = c1104q;
            m2126a(c1104q2, (C1065K) c1383r.m2590j(f3310a), c1077x3, c1093g0, c1843e, c1383r, (i7 & 14) | 27648);
            c1093g02 = c1093g0;
            c1843e2 = c1843e;
            c1077x2 = c1077x3;
        } else {
            c1104q2 = c1104q;
            c1843e2 = c1843e;
            c1093g02 = c1093g0;
            c1383r.m2563R();
            c1077x2 = c1077x;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0508t(c1104q2, c1077x2, c1093g02, c1843e2, i5);
        }
    }
}
