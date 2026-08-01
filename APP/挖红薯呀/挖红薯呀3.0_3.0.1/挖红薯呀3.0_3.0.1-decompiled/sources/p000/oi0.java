package p000;

import java.util.WeakHashMap;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oi0 {

    /* JADX INFO: renamed from: a */
    public static final float f4572a = AbstractC0307i4.f2431l;

    /* JADX INFO: renamed from: b */
    public static final float f4573b = 8.0f;

    /* JADX INFO: renamed from: c */
    public static final float f4574c = 4.0f;

    /* JADX INFO: renamed from: d */
    public static final float f4575d = 16.0f;

    /* JADX INFO: renamed from: e */
    public static final float f4576e = 4.0f;

    /* JADX INFO: renamed from: f */
    public static final float f4577f = 12.0f;

    /* JADX INFO: renamed from: g */
    public static final float f4578g = 44.0f;

    /* JADX INFO: renamed from: h */
    public static final C0174ej f4579h = new C0174ej(new sc0(4));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2927a(pe0 pe0Var, final long j, long j2, final float f, fd1 fd1Var, final C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, final int i) {
        final pe0 pe0Var2;
        final long j3;
        final fd1 fd1Var2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1054099326);
        int i2 = i | 6 | (c0616pi.m3102e(j) ? 32 : 16) | 8320;
        if (c0616pi.m3082O(i2 & 1, (74899 & i2) != 74898)) {
            c0616pi.m3087T();
            if ((i & 1) == 0 || c0616pi.m3128y()) {
                long jM2695a = AbstractC0510nf.m2695a((C0429lf) c0616pi.m3112j(AbstractC0510nf.f4248a), j);
                WeakHashMap weakHashMap = de1.f1062v;
                ea0 ea0Var = new ea0(new ma1(jo0.m1731o(c0616pi).f1069g, jo0.m1731o(c0616pi).f1064b), 15 | 32);
                pe0Var = me0.f3922a;
                fd1Var2 = ea0Var;
                j3 = jM2695a;
            } else {
                c0616pi.m3085R();
                j3 = j2;
                fd1Var2 = fd1Var;
            }
            pe0Var2 = pe0Var;
            c0616pi.m3120q();
            ((C0324im) c0616pi.m3112j(f4579h)).m1593a(new pi0(pe0Var2, j, j3, f, fd1Var2, c0474mh), c0616pi, 0);
        } else {
            c0616pi.m3085R();
            pe0Var2 = pe0Var;
            j3 = j2;
            fd1Var2 = fd1Var;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww(j, j3, f, fd1Var2, c0474mh, i) { // from class: fi0

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f1735e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f1736f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ float f1737g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ fd1 f1738h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C0474mh f1739i;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM1649A = j50.m1649A(199681);
                    oi0.m2927a(this.f1734d, this.f1735e, this.f1736f, this.f1737g, this.f1738h, this.f1739i, (InterfaceC0356ji) obj, iM1649A);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v12, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m2928b(final jw0 jw0Var, final boolean z, final InterfaceC0298hw interfaceC0298hw, final InterfaceC0904ww interfaceC0904ww, pe0 pe0Var, boolean z2, final InterfaceC0904ww interfaceC0904ww2, boolean z3, ei0 ei0Var, InterfaceC0356ji interfaceC0356ji, final int i) {
        int i2;
        ei0 ei0Var2;
        final pe0 pe0Var2;
        final boolean z4;
        final boolean z5;
        C0616pi c0616pi;
        pe0 pe0Var3;
        boolean z6;
        C0474mh c0474mhM1937w;
        final int i3;
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3091X(974293026);
        if ((i & 6) == 0) {
            i2 = (c0616pi2.m3104f(jw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi2.m3106g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi2.m3108h(interfaceC0298hw) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c0616pi2.m3108h(interfaceC0904ww) ? 2048 : 1024;
        }
        int i4 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i4 |= c0616pi2.m3108h(interfaceC0904ww2) ? 1048576 : 524288;
        }
        int i5 = i4 | 12582912;
        if ((100663296 & i) == 0) {
            i5 |= c0616pi2.m3104f(ei0Var) ? 67108864 : 33554432;
        }
        int i6 = i5 | 805306368;
        boolean z7 = true;
        if (c0616pi2.m3082O(i6 & 1, (306783379 & i6) != 306783378)) {
            c0616pi2.m3087T();
            if ((i & 1) == 0 || c0616pi2.m3128y()) {
                pe0Var3 = me0.f3922a;
                z6 = true;
            } else {
                c0616pi2.m3085R();
                pe0Var3 = pe0Var;
                z6 = z2;
                z7 = z3;
            }
            c0616pi2.m3120q();
            c0616pi2.m3090W(-224963495);
            Object objM3080L = c0616pi2.m3080L();
            Object obj = C0320ii.f2572a;
            if (objM3080L == obj) {
                objM3080L = new xg0();
                c0616pi2.m3107g0(objM3080L);
            }
            xg0 xg0Var = (xg0) objM3080L;
            c0616pi2.m3119p(false);
            eg0 eg0Var = eg0.f1446e;
            o31 o31VarM1222u = g60.m1222u(eg0Var, c0616pi2);
            C0474mh c0474mhM1937w2 = AbstractC0398kl.m1937w(-876637252, new li0(ei0Var, z, z6, o31VarM1222u, interfaceC0904ww2, z7, interfaceC0904ww), c0616pi2);
            if (interfaceC0904ww2 == null) {
                c0616pi2.m3090W(-224036658);
                c0616pi2.m3119p(false);
                c0474mhM1937w = null;
            } else {
                c0616pi2.m3090W(-224036657);
                c0474mhM1937w = AbstractC0398kl.m1937w(802208206, new mi0(ei0Var, z, z6, o31VarM1222u, interfaceC0904ww2), c0616pi2);
                c0616pi2.m3119p(false);
            }
            C0474mh c0474mh = c0474mhM1937w;
            Object objM3080L2 = c0616pi2.m3080L();
            if (objM3080L2 == obj) {
                objM3080L2 = new dp0(0);
                c0616pi2.m3107g0(objM3080L2);
            }
            wg0 wg0Var = (wg0) objM3080L2;
            ei0Var2 = ei0Var;
            pe0 pe0Var4 = pe0Var3;
            boolean z8 = z6;
            pe0 pe0VarMo2499c = s11.m3998a(pf1.m3042T(pe0Var4, z, xg0Var, z6, new xv0(4), interfaceC0298hw), Float.NaN, f4572a).mo2499c(new s60(1.0f, true));
            Object objM3080L3 = c0616pi2.m3080L();
            if (objM3080L3 == obj) {
                objM3080L3 = new C0532o(12, wg0Var);
                c0616pi2.m3107g0(objM3080L3);
            }
            pe0 pe0VarM2982R = p30.m2982R(pe0VarMo2499c, (InterfaceC0742sw) objM3080L3);
            xd0 xd0VarM5467d = AbstractC0993za.m5467d(C0496n2.f4149i, true);
            int iM2776p = o30.m2776p(c0616pi2);
            fq0 fq0VarM3115l = c0616pi2.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi2, pe0VarM2982R);
            InterfaceC0210fi.f1733b.getClass();
            InterfaceC0298hw interfaceC0298hw2 = C0173ei.f1457b;
            c0616pi2.m3093Z();
            if (c0616pi2.f4877S) {
                c0616pi2.m3114k(interfaceC0298hw2);
            } else {
                c0616pi2.m3113j0();
            }
            w60.m4888J(c0616pi2, C0173ei.f1460e, xd0VarM5467d);
            w60.m4888J(c0616pi2, C0173ei.f1459d, fq0VarM3115l);
            C0462m7 c0462m7 = C0173ei.f1461f;
            if (c0616pi2.f4877S || !p30.m3002l(c0616pi2.m3080L(), Integer.valueOf(iM2776p))) {
                AbstractC0748t1.m4157o(iM2776p, c0616pi2, iM2776p, c0462m7);
            }
            w60.m4888J(c0616pi2, C0173ei.f1458c, pe0VarM4020E);
            final w31 w31VarM1042a = AbstractC0199f7.m1042a(z ? 1.0f : 0.0f, g60.m1222u(eg0Var, c0616pi2), c0616pi2);
            final w31 w31VarM1042a2 = AbstractC0199f7.m1042a(z ? 1.0f : 0.0f, g60.m1222u(eg0.f1445d, c0616pi2), c0616pi2);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((((dp0) wg0Var).m720g() - r3.mo641F(56.0f)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(((InterfaceC0968ym) c0616pi2.m3112j(AbstractC0131dj.f1121h)).mo654p(f4577f))) & 4294967295L);
            boolean zM3104f = c0616pi2.m3104f(xg0Var) | c0616pi2.m3102e(jFloatToRawIntBits);
            Object objM3080L4 = c0616pi2.m3080L();
            if (zM3104f || objM3080L4 == obj) {
                objM3080L4 = new ld0(xg0Var, jFloatToRawIntBits);
                c0616pi2.m3107g0(objM3080L4);
            }
            C0474mh c0474mhM1937w3 = AbstractC0398kl.m1937w(-2082182507, new C0288hm(2, (ld0) objM3080L4), c0616pi2);
            C0474mh c0474mhM1937w4 = AbstractC0398kl.m1937w(-799524251, new C0350jc(2, w31VarM1042a, ei0Var2), c0616pi2);
            boolean zM3104f2 = c0616pi2.m3104f(w31VarM1042a);
            Object objM3080L5 = c0616pi2.m3080L();
            if (zM3104f2 || objM3080L5 == obj) {
                final int i7 = 0;
                objM3080L5 = new InterfaceC0298hw() { // from class: gi0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0298hw
                    public final Object invoke() {
                        float fFloatValue;
                        int i8 = i7;
                        w31 w31Var = w31VarM1042a;
                        switch (i8) {
                            case 0:
                                fFloatValue = ((Number) w31Var.getValue()).floatValue();
                                break;
                            default:
                                fFloatValue = ((Number) w31Var.getValue()).floatValue();
                                break;
                        }
                        return Float.valueOf(fFloatValue);
                    }
                };
                c0616pi2.m3107g0(objM3080L5);
            }
            InterfaceC0298hw interfaceC0298hw3 = (InterfaceC0298hw) objM3080L5;
            boolean zM3104f3 = c0616pi2.m3104f(w31VarM1042a2);
            Object objM3080L6 = c0616pi2.m3080L();
            if (zM3104f3 || objM3080L6 == obj) {
                i3 = 1;
                objM3080L6 = new InterfaceC0298hw() { // from class: gi0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0298hw
                    public final Object invoke() {
                        float fFloatValue;
                        int i8 = i3;
                        w31 w31Var = w31VarM1042a2;
                        switch (i8) {
                            case 0:
                                fFloatValue = ((Number) w31Var.getValue()).floatValue();
                                break;
                            default:
                                fFloatValue = ((Number) w31Var.getValue()).floatValue();
                                break;
                        }
                        return Float.valueOf(fFloatValue);
                    }
                };
                c0616pi2.m3107g0(objM3080L6);
            } else {
                i3 = 1;
            }
            C0616pi c0616pi3 = c0616pi2;
            boolean z9 = z7;
            m2929c(c0474mhM1937w3, c0474mhM1937w4, c0474mhM1937w2, c0474mh, z9, interfaceC0298hw3, (InterfaceC0298hw) objM3080L6, c0616pi3, ((i6 >> 9) & 57344) | 438);
            c0616pi3.m3119p(i3);
            z5 = z9;
            z4 = z8;
            pe0Var2 = pe0Var4;
            c0616pi = c0616pi3;
        } else {
            ei0Var2 = ei0Var;
            C0616pi c0616pi4 = c0616pi2;
            c0616pi4.m3085R();
            pe0Var2 = pe0Var;
            z4 = z2;
            z5 = z3;
            c0616pi = c0616pi4;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            final ei0 ei0Var3 = ei0Var2;
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: hi0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    oi0.m2928b(jw0Var, z, interfaceC0298hw, interfaceC0904ww, pe0Var2, z4, interfaceC0904ww2, z5, ei0Var3, (InterfaceC0356ji) obj2, j50.m1649A(i | 1));
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m2929c(C0474mh c0474mh, C0474mh c0474mh2, C0474mh c0474mh3, InterfaceC0904ww interfaceC0904ww, final boolean z, final InterfaceC0298hw interfaceC0298hw, InterfaceC0298hw interfaceC0298hw2, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        InterfaceC0904ww interfaceC0904ww2;
        InterfaceC0904ww interfaceC0904ww3;
        boolean z2;
        InterfaceC0904ww interfaceC0904ww4 = interfaceC0904ww;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-1019541078);
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3108h(c0474mh) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3108h(c0474mh2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3108h(c0474mh3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0904ww4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c0616pi.m3106g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0298hw) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0298hw2) ? 1048576 : 524288;
        }
        if (c0616pi.m3082O(i2 & 1, (599187 & i2) != 599186)) {
            pe0 pe0VarM1548x = AbstractC0307i4.m1548x(new C0832v9(0));
            int i3 = 57344 & i2;
            boolean z3 = ((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576) | (i3 == 16384);
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (z3 || objM3080L == c0675r3) {
                objM3080L = new ni0(interfaceC0298hw2, interfaceC0904ww4, z);
                c0616pi.m3107g0(objM3080L);
            }
            xd0 xd0Var = (xd0) objM3080L;
            int iM2776p = o30.m2776p(c0616pi);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM1548x);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            C0462m7 c0462m7 = C0173ei.f1460e;
            w60.m4888J(c0616pi, c0462m7, xd0Var);
            C0462m7 c0462m72 = C0173ei.f1459d;
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l);
            C0462m7 c0462m73 = C0173ei.f1461f;
            int i4 = i2;
            if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p))) {
                AbstractC0748t1.m4157o(iM2776p, c0616pi, iM2776p, c0462m73);
            }
            C0462m7 c0462m74 = C0173ei.f1458c;
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E);
            c0474mh.invoke(c0616pi, Integer.valueOf(i4 & 14));
            c0474mh2.invoke(c0616pi, Integer.valueOf((i4 >> 3) & 14));
            pe0 pe0VarM3029E = pf1.m3029E("icon");
            C0276ha c0276ha = C0496n2.f4145e;
            xd0 xd0VarM5467d = AbstractC0993za.m5467d(c0276ha, false);
            int iM2776p2 = o30.m2776p(c0616pi);
            fq0 fq0VarM3115l2 = c0616pi.m3115l();
            pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, pe0VarM3029E);
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, c0462m7, xd0VarM5467d);
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l2);
            if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p2))) {
                AbstractC0748t1.m4157o(iM2776p2, c0616pi, iM2776p2, c0462m73);
            }
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E2);
            c0474mh3.invoke(c0616pi, Integer.valueOf((i4 >> 6) & 14));
            c0616pi.m3119p(true);
            if (interfaceC0904ww != null) {
                c0616pi.m3090W(-660471321);
                pe0 pe0VarM3029E2 = pf1.m3029E("label");
                boolean z4 = (i3 == 16384) | ((i4 & 458752) == 131072);
                Object objM3080L2 = c0616pi.m3080L();
                if (z4 || objM3080L2 == c0675r3) {
                    objM3080L2 = new InterfaceC0742sw() { // from class: ii0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p000.InterfaceC0742sw
                        public final Object invoke(Object obj) {
                            ((gv0) obj).m1260d(z ? 1.0f : ((Number) interfaceC0298hw.invoke()).floatValue());
                            return na1.f4229a;
                        }
                    };
                    c0616pi.m3107g0(objM3080L2);
                }
                pe0 pe0VarM2972H = p30.m2972H(pe0VarM3029E2, (InterfaceC0742sw) objM3080L2);
                xd0 xd0VarM5467d2 = AbstractC0993za.m5467d(c0276ha, false);
                int iM2776p3 = o30.m2776p(c0616pi);
                fq0 fq0VarM3115l3 = c0616pi.m3115l();
                pe0 pe0VarM4020E3 = s91.m4020E(c0616pi, pe0VarM2972H);
                c0616pi.m3093Z();
                if (c0616pi.f4877S) {
                    c0616pi.m3114k(c0094cj);
                } else {
                    c0616pi.m3113j0();
                }
                w60.m4888J(c0616pi, c0462m7, xd0VarM5467d2);
                w60.m4888J(c0616pi, c0462m72, fq0VarM3115l3);
                if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p3))) {
                    AbstractC0748t1.m4157o(iM2776p3, c0616pi, iM2776p3, c0462m73);
                }
                w60.m4888J(c0616pi, c0462m74, pe0VarM4020E3);
                InterfaceC0904ww interfaceC0904ww5 = interfaceC0904ww;
                interfaceC0904ww5.invoke(c0616pi, Integer.valueOf((i4 >> 9) & 14));
                z2 = true;
                c0616pi.m3119p(true);
                c0616pi.m3119p(false);
                interfaceC0904ww3 = interfaceC0904ww5;
            } else {
                interfaceC0904ww3 = interfaceC0904ww;
                z2 = true;
                c0616pi.m3090W(-660200319);
                c0616pi.m3119p(false);
            }
            c0616pi.m3119p(z2);
            interfaceC0904ww2 = interfaceC0904ww3;
        } else {
            c0616pi.m3085R();
            interfaceC0904ww2 = interfaceC0904ww4;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0315ic(c0474mh, c0474mh2, c0474mh3, interfaceC0904ww2, z, interfaceC0298hw, interfaceC0298hw2, i);
        }
    }
}
