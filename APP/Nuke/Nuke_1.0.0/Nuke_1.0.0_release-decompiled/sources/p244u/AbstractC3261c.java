package p244u;

import java.util.List;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.C0551B;
import p041H0.C0560F0;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p153e1.C2005a;
import p169h0.AbstractC2192a;
import p169h0.InterfaceC2207p;
import p203n.C2654f0;
import p205n1.C2688b;
import p250v.AbstractC3349a;

/* JADX INFO: renamed from: u.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3261c {

    /* JADX INFO: renamed from: a */
    public static final C3259b f10085a = new C3259b(0);

    /* JADX INFO: renamed from: b */
    public static final C3259b f10086b = new C3259b(1);

    /* JADX INFO: renamed from: c */
    public static final C3293z f10087c = new C3293z(EnumC3292y.f10176e);

    /* JADX INFO: renamed from: d */
    public static final C3293z f10088d = new C3293z(EnumC3292y.f10177f);

    /* JADX INFO: renamed from: e */
    public static final C3233B f10089e = new C3233B();

    /* JADX INFO: renamed from: A */
    public static final InterfaceC2207p m5512A(InterfaceC2207p interfaceC2207p, float f2, float f5) {
        return interfaceC2207p.mo4021c(new C3260b0(f2, 0.0f, f5, 0.0f, 10));
    }

    /* JADX INFO: renamed from: B */
    public static final InterfaceC2207p m5513B(InterfaceC2207p interfaceC2207p, C3257a c3257a) {
        return interfaceC2207p.mo4021c(new C3238G(c3257a));
    }

    /* JADX INFO: renamed from: a */
    public static C3251U m5514a(float f2, int i5) {
        float f5 = 0;
        if ((i5 & 2) != 0) {
            f2 = 0;
        }
        return new C3251U(f5, f2, f5, f2);
    }

    /* JADX INFO: renamed from: b */
    public static C3251U m5515b(float f2, float f5, float f6, int i5) {
        if ((i5 & 1) != 0) {
            f2 = 0;
        }
        float f7 = 0;
        if ((i5 & 4) != 0) {
            f5 = 0;
        }
        return new C3251U(f2, f7, f5, f6);
    }

    /* JADX INFO: renamed from: c */
    public static final void m5516c(InterfaceC1373m interfaceC1373m, InterfaceC2207p interfaceC2207p) {
        C3281n c3281n = C3281n.f10145c;
        C1383r c1383r = (C1383r) interfaceC1373m;
        int iHashCode = Long.hashCode(c1383r.f4882T);
        InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(interfaceC1373m, interfaceC2207p);
        InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
        InterfaceC0593g.f1909a.getClass();
        C0551B c0551b = C0591f.f1902b;
        C0560F0 c0560f0 = c1383r.f4884a;
        c1383r.m2571Z();
        if (c1383r.f4881S) {
            c1383r.m2592k(c0551b);
        } else {
            c1383r.m2591j0();
        }
        AbstractC1385s.m2635y(interfaceC1373m, C0591f.f1905e, c3281n);
        AbstractC1385s.m2635y(interfaceC1373m, C0591f.f1904d, interfaceC1378o0M2593l);
        AbstractC1385s.m2631u(interfaceC1373m, C0591f.f1907g);
        AbstractC1385s.m2635y(interfaceC1373m, C0591f.f1903c, interfaceC2207pM4016c);
        AbstractC1385s.m2627q(interfaceC1373m, Integer.valueOf(iHashCode), C0591f.f1906f);
        c1383r.m2597p(true);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC2207p m5517d(InterfaceC2207p interfaceC2207p) {
        return interfaceC2207p.mo4021c(new C3275j());
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2207p m5518e(float f2, float f5) {
        return new C3270g0(f2, f5);
    }

    /* JADX INFO: renamed from: f */
    public static final C3254X m5519f(InterfaceC0376N interfaceC0376N) {
        Object objMo650l = interfaceC0376N.mo650l();
        if (objMo650l instanceof C3254X) {
            return (C3254X) objMo650l;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final float m5520g(C3254X c3254x) {
        if (c3254x != null) {
            return c3254x.f10068a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2207p m5521h(InterfaceC2207p interfaceC2207p, float f2) {
        return interfaceC2207p.mo4021c(new C3260b0(0.0f, f2, 0.0f, f2, 5));
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC2207p m5522i(InterfaceC2207p interfaceC2207p, float f2, float f5) {
        return interfaceC2207p.mo4021c(new C3260b0(0.0f, f2, 0.0f, f5, 5));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC2207p m5523j(InterfaceC2207p interfaceC2207p, float f2, float f5, int i5) {
        if ((i5 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i5 & 2) != 0) {
            f5 = Float.NaN;
        }
        return m5522i(interfaceC2207p, f2, f5);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m5524k(int i5, int i6, long j5) {
        int iM3682j = C2005a.m3682j(j5);
        if (i5 > C2005a.m3680h(j5) || iM3682j > i5) {
            return false;
        }
        return i6 <= C2005a.m3679g(j5) && C2005a.m3681i(j5) <= i6;
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC0378P m5525l(InterfaceC3253W interfaceC3253W, int i5, int i6, int i7, int i8, int i9, InterfaceC0379Q interfaceC0379Q, List list, AbstractC0391b0[] abstractC0391b0Arr, int i10) {
        int i11;
        float f2;
        long j5;
        int i12;
        int i13;
        int i14;
        List list2 = list;
        long j6 = i9;
        int[] iArr = new int[i10];
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int iMin = 0;
        float f5 = 0.0f;
        while (i15 < i10) {
            InterfaceC0376N interfaceC0376N = (InterfaceC0376N) list2.get(i15);
            float fM5520g = m5520g(m5519f(interfaceC0376N));
            if (fM5520g > 0.0f) {
                f5 += fM5520g;
                i16++;
                j5 = j6;
                i12 = i15;
            } else {
                int i18 = i7 - i17;
                AbstractC0391b0 abstractC0391b0Mo648e = abstractC0391b0Arr[i15];
                j5 = j6;
                if (abstractC0391b0Mo648e == null) {
                    if (i7 == Integer.MAX_VALUE) {
                        i12 = i15;
                        i13 = i16;
                        i14 = Integer.MAX_VALUE;
                    } else {
                        i12 = i15;
                        i13 = i16;
                        i14 = i18 < 0 ? 0 : i18;
                    }
                    abstractC0391b0Mo648e = interfaceC0376N.mo648e(interfaceC3253W.mo5502g(0, i14, i8, false));
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                AbstractC0391b0 abstractC0391b0 = abstractC0391b0Mo648e;
                int iMo5500c = interfaceC3253W.mo5500c(abstractC0391b0);
                int iMo5503j = interfaceC3253W.mo5503j(abstractC0391b0);
                iArr[i12] = iMo5500c;
                int i19 = i18 - iMo5500c;
                if (i19 < 0) {
                    i19 = 0;
                }
                iMin = Math.min(i9, i19);
                i17 += iMo5500c + iMin;
                iMax = Math.max(iMax, iMo5503j);
                abstractC0391b0Arr[i12] = abstractC0391b0;
                i16 = i13;
            }
            i15 = i12 + 1;
            j6 = j5;
        }
        long j7 = j6;
        int i20 = i16;
        if (i20 == 0) {
            i17 -= iMin;
            i11 = 0;
        } else {
            long j8 = ((long) (i20 - 1)) * j7;
            long jRound = ((long) ((i7 != Integer.MAX_VALUE ? i7 : i5) - i17)) - j8;
            if (jRound < 0) {
                jRound = 0;
            }
            float f6 = jRound / f5;
            for (int i21 = 0; i21 < i10; i21++) {
                jRound -= (long) Math.round(m5520g(m5519f((InterfaceC0376N) list2.get(i21))) * f6);
            }
            int i22 = iMax;
            int i23 = 0;
            int i24 = 0;
            while (i23 < i10) {
                if (abstractC0391b0Arr[i23] == null) {
                    InterfaceC0376N interfaceC0376N2 = (InterfaceC0376N) list2.get(i23);
                    C3254X c3254xM5519f = m5519f(interfaceC0376N2);
                    float fM5520g2 = m5520g(c3254xM5519f);
                    if (fM5520g2 <= 0.0f) {
                        AbstractC3349a.m5599b("All weights <= 0 should have placeables");
                    }
                    f2 = f6;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fM5520g2 * f2) + iSignum);
                    AbstractC0391b0 abstractC0391b0Mo648e2 = interfaceC0376N2.mo648e(interfaceC3253W.mo5502g((!(c3254xM5519f != null ? c3254xM5519f.f10069b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i8, true));
                    int iMo5500c2 = interfaceC3253W.mo5500c(abstractC0391b0Mo648e2);
                    int iMo5503j2 = interfaceC3253W.mo5503j(abstractC0391b0Mo648e2);
                    iArr[i23] = iMo5500c2;
                    i24 += iMo5500c2;
                    int iMax3 = Math.max(i22, iMo5503j2);
                    abstractC0391b0Arr[i23] = abstractC0391b0Mo648e2;
                    i22 = iMax3;
                } else {
                    f2 = f6;
                }
                i23++;
                list2 = list;
                f6 = f2;
            }
            i11 = (int) (((long) i24) + j8);
            int i25 = i7 - i17;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 > i25) {
                i11 = i25;
            }
            iMax = i22;
        }
        int i26 = i11 + i17;
        if (i26 < 0) {
            i26 = 0;
        }
        int iMax4 = Math.max(i26, i5);
        int iMax5 = Math.max(iMax, Math.max(i6, 0));
        int[] iArr2 = new int[i10];
        interfaceC3253W.mo5501d(iMax4, interfaceC0379Q, iArr, iArr2);
        return interfaceC3253W.mo5499b(abstractC0391b0Arr, interfaceC0379Q, iArr2, iMax4, iMax5);
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC2207p m5526m(InterfaceC2207p interfaceC2207p, float f2, float f5, int i5) {
        if ((i5 & 1) != 0) {
            f2 = 0;
        }
        if ((i5 & 2) != 0) {
            f5 = 0;
        }
        return interfaceC2207p.mo4021c(new C3246O(f2, f5));
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC2207p m5527n(InterfaceC2207p interfaceC2207p, C3251U c3251u) {
        return interfaceC2207p.mo4021c(new C3250T(c3251u));
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC2207p m5528o(InterfaceC2207p interfaceC2207p, float f2) {
        return interfaceC2207p.mo4021c(new C3248Q(f2, f2, f2, f2));
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC2207p m5529p(InterfaceC2207p interfaceC2207p, float f2, float f5) {
        return interfaceC2207p.mo4021c(new C3248Q(f2, f5, f2, f5));
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC2207p m5530q(InterfaceC2207p interfaceC2207p, float f2, float f5, int i5) {
        if ((i5 & 1) != 0) {
            f2 = 0;
        }
        if ((i5 & 2) != 0) {
            f5 = 0;
        }
        return m5529p(interfaceC2207p, f2, f5);
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC2207p m5531r(InterfaceC2207p interfaceC2207p, float f2, float f5, float f6, float f7, int i5) {
        if ((i5 & 1) != 0) {
            f2 = 0;
        }
        if ((i5 & 2) != 0) {
            f5 = 0;
        }
        if ((i5 & 4) != 0) {
            f6 = 0;
        }
        if ((i5 & 8) != 0) {
            f7 = 0;
        }
        return interfaceC2207p.mo4021c(new C3248Q(f2, f5, f6, f7));
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC2207p m5532s(InterfaceC2207p interfaceC2207p, float f2, float f5, float f6, float f7, int i5) {
        return interfaceC2207p.mo4021c(new C3260b0(f2, (i5 & 2) != 0 ? Float.NaN : f5, (i5 & 4) != 0 ? Float.NaN : f6, (i5 & 8) != 0 ? Float.NaN : f7, false));
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC2207p m5533t(InterfaceC2207p interfaceC2207p, float f2) {
        return interfaceC2207p.mo4021c(new C3260b0(f2, f2, f2, f2, true));
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC2207p m5534u(InterfaceC2207p interfaceC2207p, float f2, float f5) {
        return interfaceC2207p.mo4021c(new C3260b0(f2, f5, f2, f5, true));
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC2207p m5535v(InterfaceC2207p interfaceC2207p, float f2, float f5, float f6, float f7) {
        return interfaceC2207p.mo4021c(new C3260b0(f2, f5, f6, f7, true));
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC2207p m5536w(InterfaceC2207p interfaceC2207p) {
        return interfaceC2207p.mo4021c(new C3264d0(new C2654f0(23)));
    }

    /* JADX INFO: renamed from: x */
    public static final C3240I m5537x(C2688b c2688b) {
        return new C3240I(c2688b.f8572a, c2688b.f8573b, c2688b.f8574c, c2688b.f8575d);
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC2207p m5538y(InterfaceC2207p interfaceC2207p) {
        return interfaceC2207p.mo4021c(new C3242K());
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC2207p m5539z(float f2) {
        return new C3260b0(f2, 0.0f, f2, 0.0f, 10);
    }
}
