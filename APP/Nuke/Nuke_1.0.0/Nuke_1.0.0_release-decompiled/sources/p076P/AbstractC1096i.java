package p076P;

import p000A.C0065i;
import p007B0.C0173F;
import p008B1.C0213a;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0589e;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p045H4.C0651c;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p169h0.AbstractC2192a;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p176i1.C2307w;
import p211o0.InterfaceC2738M;
import p244u.AbstractC3261c;
import p244u.C3251U;

/* JADX INFO: renamed from: P.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1096i {

    /* JADX INFO: renamed from: a */
    public static final float f3517a = 280;

    /* JADX INFO: renamed from: b */
    public static final float f3518b = 560;

    /* JADX INFO: renamed from: c */
    public static final float f3519c = 8;

    /* JADX INFO: renamed from: d */
    public static final float f3520d = 12;

    /* JADX INFO: renamed from: e */
    public static final C3251U f3521e;

    /* JADX INFO: renamed from: f */
    public static final C3251U f3522f;

    /* JADX INFO: renamed from: g */
    public static final C3251U f3523g;

    /* JADX INFO: renamed from: h */
    public static final C1305C f3524h;

    static {
        float f2 = 24;
        f3521e = new C3251U(f2, f2, f2, f2);
        float f5 = 16;
        AbstractC3261c.m5515b(0.0f, 0.0f, f5, 7);
        f3522f = AbstractC3261c.m5515b(0.0f, 0.0f, f5, 7);
        f3523g = AbstractC3261c.m5515b(0.0f, 0.0f, f2, 7);
        f3524h = new C1305C(new C0065i(23));
    }

    /* JADX INFO: renamed from: a */
    public static final void m2149a(final C1843e c1843e, InterfaceC2207p interfaceC2207p, final InterfaceC1603e interfaceC1603e, final InterfaceC1603e interfaceC1603e2, final InterfaceC2738M interfaceC2738M, final long j5, final float f2, final long j6, final long j7, final long j8, final long j9, InterfaceC1373m interfaceC1373m, final int i5) {
        final InterfaceC2207p interfaceC2207p2;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1378716401);
        int i6 = i5 | 48 | (c1383r.m2586h(null) ? 256 : 128) | (c1383r.m2586h(interfaceC1603e) ? 2048 : 1024) | (c1383r.m2586h(interfaceC1603e2) ? 16384 : 8192) | (c1383r.m2582f(interfaceC2738M) ? 131072 : 65536) | (c1383r.m2580e(j5) ? 1048576 : 524288) | (c1383r.m2576c(f2) ? 8388608 : 4194304) | (c1383r.m2580e(j6) ? 67108864 : 33554432) | (c1383r.m2580e(j7) ? 536870912 : 268435456);
        if (c1383r.m2560O(i6 & 1, ((i6 & 306783379) == 306783378 && (((c1383r.m2580e(j8) ? (char) 4 : (char) 2) | (c1383r.m2580e(j9) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            C1843e c1843eM3314c = AbstractC1848j.m3314c(-652798794, new C1088e(interfaceC1603e, interfaceC1603e2, j7, j8, j9, j6, c1843e), c1383r);
            int i7 = i6 >> 12;
            int i8 = (i7 & 896) | (i7 & 112) | 12582918 | ((i6 >> 9) & 57344);
            C2204m c2204m = C2204m.f7185a;
            AbstractC1085c0.m2142a(c2204m, interfaceC2738M, j5, f2, 0.0f, c1843eM3314c, c1383r, i8, 104);
            interfaceC2207p2 = c2204m;
        } else {
            c1383r.m2563R();
            interfaceC2207p2 = interfaceC2207p;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e(interfaceC2207p2, interfaceC1603e, interfaceC1603e2, interfaceC2738M, j5, f2, j6, j7, j8, j9, i5) { // from class: P.c

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC2207p f3396e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ InterfaceC1603e f3397f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC1603e f3398g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ InterfaceC2738M f3399h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ long f3400i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ float f3401j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ long f3402k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ long f3403l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ long f3404m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ long f3405n;

                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2609A = AbstractC1385s.m2609A(7);
                    AbstractC1096i.m2149a(this.f3395d, this.f3396e, this.f3397f, this.f3398g, this.f3399h, this.f3400i, this.f3401j, this.f3402k, this.f3403l, this.f3404m, this.f3405n, (InterfaceC1373m) obj, iM2609A);
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2150b(C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-917637668);
        if (c1383r.m2560O(i5 & 1, (i5 & 147) != 146)) {
            Object objM2558L = c1383r.m2558L();
            if (objM2558L == C1371l.f4833a) {
                objM2558L = new C1090f();
                c1383r.m2585g0(objM2558L);
            }
            InterfaceC0377O interfaceC0377O = (InterfaceC0377O) objM2558L;
            int iHashCode = Long.hashCode(c1383r.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, C2204m.f7185a);
            InterfaceC0593g.f1909a.getClass();
            C0551B c0551b = C0591f.f1902b;
            c1383r.m2571Z();
            if (c1383r.f4881S) {
                c1383r.m2592k(c0551b);
            } else {
                c1383r.m2591j0();
            }
            AbstractC1385s.m2635y(c1383r, C0591f.f1905e, interfaceC0377O);
            AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
            C0589e c0589e = C0591f.f1906f;
            if (c1383r.f4881S || !AbstractC1665j.m2981a(c1383r.m2558L(), Integer.valueOf(iHashCode))) {
                c1383r.m2585g0(Integer.valueOf(iHashCode));
                c1383r.m2574b(c0589e, Integer.valueOf(iHashCode));
            }
            AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
            c1843e.mo0g(c1383r, 6);
            c1383r.m2597p(true);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0651c(c1843e, i5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m2151c(final InterfaceC1599a interfaceC1599a, final C1843e c1843e, final InterfaceC2207p interfaceC2207p, final InterfaceC1603e interfaceC1603e, final InterfaceC1603e interfaceC1603e2, final InterfaceC2738M interfaceC2738M, final long j5, final long j6, final long j7, final long j8, final float f2, final C2307w c2307w, InterfaceC1373m interfaceC1373m, final int i5, final int i6) {
        int i7;
        C1843e c1843e2;
        InterfaceC1603e interfaceC1603e3;
        InterfaceC1603e interfaceC1603e4;
        int i8;
        float f5;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-867616355);
        if ((i5 & 6) == 0) {
            i7 = (c1383r.m2586h(interfaceC1599a) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            c1843e2 = c1843e;
            i7 |= c1383r.m2586h(c1843e2) ? 32 : 16;
        } else {
            c1843e2 = c1843e;
        }
        if ((i5 & 384) == 0) {
            i7 |= c1383r.m2582f(interfaceC2207p) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= c1383r.m2586h(null) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= c1383r.m2586h(null) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            interfaceC1603e3 = interfaceC1603e;
            i7 |= c1383r.m2586h(interfaceC1603e3) ? 131072 : 65536;
        } else {
            interfaceC1603e3 = interfaceC1603e;
        }
        if ((1572864 & i5) == 0) {
            interfaceC1603e4 = interfaceC1603e2;
            i7 |= c1383r.m2586h(interfaceC1603e4) ? 1048576 : 524288;
        } else {
            interfaceC1603e4 = interfaceC1603e2;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= c1383r.m2582f(interfaceC2738M) ? 8388608 : 4194304;
        }
        int i9 = i7;
        if ((i5 & 100663296) == 0) {
            i9 |= c1383r.m2580e(j5) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i9 |= c1383r.m2580e(j6) ? 536870912 : 268435456;
        }
        int i10 = i9;
        if ((i6 & 6) == 0) {
            i8 = i6 | (c1383r.m2580e(j7) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c1383r.m2580e(j8) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            f5 = f2;
            i8 |= c1383r.m2576c(f5) ? 256 : 128;
        } else {
            f5 = f2;
        }
        if ((i6 & 3072) == 0) {
            i8 |= c1383r.m2582f(c2307w) ? 2048 : 1024;
        }
        int i11 = i8;
        if (c1383r.m2560O(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
            m2152d(interfaceC1599a, interfaceC2207p, c2307w, AbstractC1848j.m3314c(527420759, new C1094h(interfaceC1603e3, interfaceC1603e4, interfaceC2738M, j5, f5, j6, j7, j8, c1843e2), c1383r), c1383r, (i10 & 14) | 3072 | ((i10 >> 3) & 112) | ((i11 >> 3) & 896));
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: P.b
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2609A = AbstractC1385s.m2609A(i5 | 1);
                    int iM2609A2 = AbstractC1385s.m2609A(i6);
                    AbstractC1096i.m2151c(interfaceC1599a, c1843e, interfaceC2207p, interfaceC1603e, interfaceC1603e2, interfaceC2738M, j5, j6, j7, j8, f2, c2307w, (InterfaceC1373m) obj, iM2609A, iM2609A2);
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2152d(InterfaceC1599a interfaceC1599a, InterfaceC2207p interfaceC2207p, C2307w c2307w, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(24925658);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(interfaceC1599a) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(interfaceC2207p) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2582f(c2307w) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 2048 : 1024;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 1171) != 1170)) {
            ((C1109v) c1383r.m2590j(f3524h)).m2157a(new C0173F(interfaceC1599a, interfaceC2207p, c2307w, c1843e), c1383r, 0);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0213a(interfaceC1599a, interfaceC2207p, c2307w, c1843e, i5, 1);
        }
    }
}
