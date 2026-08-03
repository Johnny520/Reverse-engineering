package p222p;

import java.util.List;
import p018b3.C0171a;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p211o9.C3092e;
import p234q.AbstractC3418a;
import p266s0.C3878h;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.C5601f;
import p339x1.C5604f2;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;

/* JADX INFO: renamed from: p.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3208d {

    /* JADX INFO: renamed from: a */
    public static final C3205c f10246a = new C3205c(0);

    /* JADX INFO: renamed from: b */
    public static final C3205c f10247b = new C3205c(1);

    /* JADX INFO: renamed from: c */
    public static final C3206c0 f10248c = new C3206c0();

    /* JADX INFO: renamed from: d */
    public static final C3092e f10249d = new C3092e(5);

    /* JADX INFO: renamed from: e */
    public static final C3092e f10250e = new C3092e(6);

    /* JADX INFO: renamed from: f */
    public static final C3092e f10251f = new C3092e(7);

    /* JADX INFO: renamed from: g */
    public static final C3092e f10252g = new C3092e(8);

    /* JADX INFO: renamed from: h */
    public static final int f10253h = 9;

    /* JADX INFO: renamed from: i */
    public static final int f10254i = 6;

    /* JADX INFO: renamed from: j */
    public static final int f10255j = 10;

    /* JADX INFO: renamed from: k */
    public static final int f10256k = 5;

    /* JADX INFO: renamed from: l */
    public static final int f10257l = 15;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3272z0 m6871a(int i9, float f3) {
        float f10 = 0;
        if ((i9 & 2) != 0) {
            f3 = 0;
        }
        return new C3272z0(f10, f3, f10, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C3272z0 m6872b(float f3, float f10, int i9) {
        float f11 = 0;
        float f12 = 0;
        if ((i9 & 8) != 0) {
            f10 = 0;
        }
        return new C3272z0(f11, f3, f12, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m6873c(C1836h0 c1836h0, InterfaceC5853o interfaceC5853o) {
        C3238n c3238n = C3238n.f10327c;
        int iHashCode = Long.hashCode(c1836h0.f6095T);
        InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853o);
        C3878h c3878hM4546l = c1836h0.m4546l();
        InterfaceC5605g.f22815f.getClass();
        C5660y c5660y = C5601f.f22758b;
        C5604f2 c5604f2 = c1836h0.f6097a;
        c1836h0.m4531d0();
        if (c1836h0.f6094S) {
            c1836h0.m4544k(c5660y);
        } else {
            c1836h0.m4551n0();
        }
        AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c3238n);
        AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
        AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
        AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
        AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
        c1836h0.m4553p(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C3227j0 m6874d(C3202b c3202b, C1836h0 c1836h0) {
        return new C3227j0(c3202b, (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C3207c1 m6875e(InterfaceC4409m0 interfaceC4409m0) {
        Object objMo8824X = interfaceC4409m0.mo8824X();
        if (objMo8824X instanceof C3207c1) {
            return (C3207c1) objMo8824X;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final float m6876f(C3207c1 c3207c1) {
        if (c3207c1 != null) {
            return c3207c1.f10243a;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC5853o m6877g() {
        return new C3233l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static InterfaceC4415o0 m6878h(InterfaceC3204b1 interfaceC3204b1, int i9, int i10, int i11, int i12, int i13, InterfaceC4418p0 interfaceC4418p0, List list, AbstractC4377b1[] abstractC4377b1Arr, int i14) {
        int i15;
        float f3;
        long j3;
        int i16;
        int i17;
        int i18;
        List list2 = list;
        long j4 = i13;
        int[] iArr = new int[i14];
        int iMax = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int iMin = 0;
        float f10 = 0.0f;
        while (i19 < i14) {
            InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) list2.get(i19);
            float fM6876f = m6876f(m6875e(interfaceC4409m0));
            if (fM6876f > 0.0f) {
                f10 += fM6876f;
                i20++;
                j3 = j4;
                i16 = i19;
            } else {
                int i22 = i11 - i21;
                AbstractC4377b1 abstractC4377b1Mo8831Q = abstractC4377b1Arr[i19];
                j3 = j4;
                if (abstractC4377b1Mo8831Q == null) {
                    if (i11 == Integer.MAX_VALUE) {
                        i16 = i19;
                        i17 = i20;
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i16 = i19;
                        i17 = i20;
                        i18 = i22 < 0 ? 0 : i22;
                    }
                    abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(interfaceC3204b1.mo6861b(0, i18, i12, false));
                } else {
                    i16 = i19;
                    i17 = i20;
                }
                AbstractC4377b1 abstractC4377b1 = abstractC4377b1Mo8831Q;
                int iMo6862d = interfaceC3204b1.mo6862d(abstractC4377b1);
                int iMo6863e = interfaceC3204b1.mo6863e(abstractC4377b1);
                iArr[i16] = iMo6862d;
                int i23 = i22 - iMo6862d;
                if (i23 < 0) {
                    i23 = 0;
                }
                iMin = Math.min(i13, i23);
                i21 += iMo6862d + iMin;
                iMax = Math.max(iMax, iMo6863e);
                abstractC4377b1Arr[i16] = abstractC4377b1;
                i20 = i17;
            }
            i19 = i16 + 1;
            j4 = j3;
        }
        long j5 = j4;
        int i24 = i20;
        if (i24 == 0) {
            i21 -= iMin;
            i15 = 0;
        } else {
            long j10 = ((long) (i24 - 1)) * j5;
            long jRound = ((long) ((i11 != Integer.MAX_VALUE ? i11 : i9) - i21)) - j10;
            if (jRound < 0) {
                jRound = 0;
            }
            float f11 = jRound / f10;
            for (int i25 = 0; i25 < i14; i25++) {
                jRound -= (long) Math.round(m6876f(m6875e((InterfaceC4409m0) list2.get(i25))) * f11);
            }
            int i26 = iMax;
            int i27 = 0;
            int i28 = 0;
            while (i27 < i14) {
                if (abstractC4377b1Arr[i27] == null) {
                    InterfaceC4409m0 interfaceC4409m02 = (InterfaceC4409m0) list2.get(i27);
                    C3207c1 c3207c1M6875e = m6875e(interfaceC4409m02);
                    float fM6876f2 = m6876f(c3207c1M6875e);
                    if (fM6876f2 <= 0.0f) {
                        AbstractC3418a.m7195b("All weights <= 0 should have placeables");
                    }
                    f3 = f11;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fM6876f2 * f3) + iSignum);
                    AbstractC4377b1 abstractC4377b1Mo8831Q2 = interfaceC4409m02.mo8831Q(interfaceC3204b1.mo6861b((!(c3207c1M6875e != null ? c3207c1M6875e.f10244b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i12, true));
                    int iMo6862d2 = interfaceC3204b1.mo6862d(abstractC4377b1Mo8831Q2);
                    int iMo6863e2 = interfaceC3204b1.mo6863e(abstractC4377b1Mo8831Q2);
                    iArr[i27] = iMo6862d2;
                    i28 += iMo6862d2;
                    int iMax3 = Math.max(i26, iMo6863e2);
                    abstractC4377b1Arr[i27] = abstractC4377b1Mo8831Q2;
                    i26 = iMax3;
                } else {
                    f3 = f11;
                }
                i27++;
                list2 = list;
                f11 = f3;
            }
            i15 = (int) (((long) i28) + j10);
            int i29 = i11 - i21;
            if (i15 < 0) {
                i15 = 0;
            }
            if (i15 > i29) {
                i15 = i29;
            }
            iMax = i26;
        }
        int i30 = i15 + i21;
        if (i30 < 0) {
            i30 = 0;
        }
        int iMax4 = Math.max(i30, i9);
        int iMax5 = Math.max(iMax, Math.max(i10, 0));
        int[] iArr2 = new int[i14];
        interfaceC3204b1.mo6865j(iMax4, interfaceC4418p0, iArr, iArr2);
        return interfaceC3204b1.mo6864f(abstractC4377b1Arr, interfaceC4418p0, iArr2, iMax4, iMax5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC5853o m6879i(InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l) {
        return interfaceC5853o.mo10549d(new C3257t0(interfaceC1231l));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC5853o m6880j(InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l) {
        return interfaceC5853o.mo10549d(new C3262v(interfaceC1231l));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC5853o m6881k(InterfaceC5853o interfaceC5853o, InterfaceC3268x0 interfaceC3268x0) {
        return interfaceC5853o.mo10549d(new C3270y0(interfaceC3268x0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC5853o m6882l(InterfaceC5853o interfaceC5853o, float f3) {
        return interfaceC5853o.mo10549d(new C3263v0(f3, f3, f3, f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC5853o m6883m(InterfaceC5853o interfaceC5853o, float f3, float f10) {
        return interfaceC5853o.mo10549d(new C3263v0(f3, f10, f3, f10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static InterfaceC5853o m6884n(InterfaceC5853o interfaceC5853o, float f3, float f10, int i9) {
        if ((i9 & 1) != 0) {
            f3 = 0;
        }
        if ((i9 & 2) != 0) {
            f10 = 0;
        }
        return m6883m(interfaceC5853o, f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC5853o m6885o(InterfaceC5853o interfaceC5853o, float f3, float f10, float f11, float f12) {
        return interfaceC5853o.mo10549d(new C3263v0(f3, f10, f11, f12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static InterfaceC5853o m6886p(InterfaceC5853o interfaceC5853o, float f3, float f10, float f11, float f12, int i9) {
        if ((i9 & 1) != 0) {
            f3 = 0;
        }
        if ((i9 & 2) != 0) {
            f10 = 0;
        }
        if ((i9 & 4) != 0) {
            f11 = 0;
        }
        if ((i9 & 8) != 0) {
            f12 = 0;
        }
        return m6885o(interfaceC5853o, f3, f10, f11, f12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final C3230k0 m6887q(C0171a c0171a) {
        return new C3230k0(c0171a.f445a, c0171a.f446b, c0171a.f447c, c0171a.f448d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final void m6888r(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC5853o m6889s(InterfaceC5853o interfaceC5853o, EnumC3239n0 enumC3239n0) {
        return interfaceC5853o.mo10549d(new C3242o0(enumC3239n0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC5853o m6890t(InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l) {
        return interfaceC5853o.mo10549d(new C3228j1(interfaceC1231l));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC5853o m6891u(InterfaceC5853o interfaceC5853o, C3254s0 c3254s0) {
        return interfaceC5853o.mo10549d(new C3218g0(c3254s0));
    }
}
