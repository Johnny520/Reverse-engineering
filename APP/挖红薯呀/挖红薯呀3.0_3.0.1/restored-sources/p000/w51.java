package p000;

import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w51 {

    /* JADX INFO: renamed from: a */
    public static final float f7006a;

    /* JADX INFO: renamed from: b */
    public static final float f7007b;

    /* JADX INFO: renamed from: c */
    public static final float f7008c;

    /* JADX INFO: renamed from: d */
    public static final float f7009d;

    /* JADX INFO: renamed from: e */
    public static final float f7010e;

    /* JADX INFO: renamed from: f */
    public static final k21 f7011f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f = o30.f4418D;
        f7006a = f;
        f7007b = o30.f4427M;
        f7008c = o30.f4424J;
        float f2 = o30.f4421G;
        f7009d = f2;
        f7010e = (f2 - f) / 2.0f;
        f7011f = new k21();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4877a(final boolean z, final InterfaceC0742sw interfaceC0742sw, pe0 pe0Var, boolean z2, final t51 t51Var, InterfaceC0356ji interfaceC0356ji, final int i) {
        final pe0 pe0Var2;
        final boolean z3;
        boolean z4;
        pe0 pe0Var3;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-263339167);
        int i2 = i | (c0616pi.m3106g(z) ? 4 : 2) | (c0616pi.m3108h(interfaceC0742sw) ? 32 : 16) | 28032 | (c0616pi.m3104f(t51Var) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536) | 1572864;
        if (c0616pi.m3082O(i2 & 1, (599187 & i2) != 599186)) {
            c0616pi.m3087T();
            int i3 = i & 1;
            pe0 pe0VarM3044V = me0.f3922a;
            if (i3 == 0 || c0616pi.m3128y()) {
                z4 = true;
                pe0Var3 = pe0VarM3044V;
            } else {
                c0616pi.m3085R();
                pe0Var3 = pe0Var;
                z4 = z2;
            }
            c0616pi.m3120q();
            c0616pi.m3090W(1768604058);
            Object objM3080L = c0616pi.m3080L();
            if (objM3080L == C0320ii.f2572a) {
                objM3080L = new xg0();
                c0616pi.m3107g0(objM3080L);
            }
            xg0 xg0Var = (xg0) objM3080L;
            c0616pi.m3119p(false);
            if (interfaceC0742sw != null) {
                C0110cz c0110cz = j30.f2667a;
                pe0VarM3044V = pf1.m3044V(z, xg0Var, z4, new xv0(2), interfaceC0742sw);
            }
            pe0 pe0VarM4003f = s11.m4003f(pe0Var3.mo2499c(pe0VarM3044V));
            float f = f7008c;
            float f2 = f7009d;
            boolean z5 = z4;
            m4878b(pe0VarM4003f.mo2499c(new r11(f, f2, f, f2, false)), z, z5, t51Var, xg0Var, c11.m387a(o30.f4416B, c0616pi), c0616pi, ((i2 >> 6) & 7168) | ((i2 << 3) & 112) | 384 | 24576);
            z3 = z5;
            pe0Var2 = pe0Var3;
        } else {
            c0616pi.m3085R();
            pe0Var2 = pe0Var;
            z3 = z2;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww(z, interfaceC0742sw, pe0Var2, z3, t51Var, i) { // from class: u51

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f6137d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC0742sw f6138e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ pe0 f6139f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ boolean f6140g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ t51 f6141h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM1649A = j50.m1649A(1);
                    w51.m4877a(this.f6137d, this.f6138e, this.f6139f, this.f6140g, this.f6141h, (InterfaceC0356ji) obj, iM1649A);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4878b(final pe0 pe0Var, final boolean z, final boolean z2, final t51 t51Var, final g30 g30Var, final x01 x01Var, InterfaceC0356ji interfaceC0356ji, final int i) {
        int i2;
        long j;
        long j2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-670917213);
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3104f(pe0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3106g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3106g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c0616pi.m3104f(t51Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c0616pi.m3108h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c0616pi.m3104f(g30Var) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c0616pi.m3104f(x01Var) ? 1048576 : 524288;
        }
        if (c0616pi.m3082O(i2 & 1, (599187 & i2) != 599186)) {
            long j3 = z2 ? z ? t51Var.f5918b : t51Var.f5922f : z ? t51Var.f5926j : t51Var.f5930n;
            long j4 = z2 ? z ? t51Var.f5917a : t51Var.f5921e : z ? t51Var.f5925i : t51Var.f5929m;
            x01 x01VarM387a = c11.m387a(o30.f4423I, c0616pi);
            float f = o30.f4422H;
            if (z2) {
                j = j4;
                j2 = z ? t51Var.f5919c : t51Var.f5923g;
            } else {
                j = j4;
                j2 = z ? t51Var.f5927k : t51Var.f5931o;
            }
            pe0 pe0VarM4047l = s91.m4047l(pe0Var.mo2499c(new C0757ta(f, new g31(j2), x01VarM387a)), j3, x01VarM387a);
            xd0 xd0VarM5467d = AbstractC0993za.m5467d(C0496n2.f4145e, false);
            int iM2776p = o30.m2776p(c0616pi);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM4047l);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            C0462m7 c0462m7 = C0173ei.f1460e;
            w60.m4888J(c0616pi, c0462m7, xd0VarM5467d);
            C0462m7 c0462m72 = C0173ei.f1459d;
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l);
            C0462m7 c0462m73 = C0173ei.f1461f;
            if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p))) {
                AbstractC0748t1.m4157o(iM2776p, c0616pi, iM2776p, c0462m73);
            }
            C0462m7 c0462m74 = C0173ei.f1458c;
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E);
            pe0 pe0VarM4047l2 = s91.m4047l(c10.m386a(AbstractC0307i4.m1533i().mo2499c(new f81(g30Var, z, g60.m1222u(eg0.f1445d, c0616pi))), g30Var, uv0.m4359a(o30.f4420F / 2.0f, 4)), j, x01Var);
            xd0 xd0VarM5467d2 = AbstractC0993za.m5467d(C0496n2.f4149i, false);
            int iM2776p2 = o30.m2776p(c0616pi);
            fq0 fq0VarM3115l2 = c0616pi.m3115l();
            pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, pe0VarM4047l2);
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, c0462m7, xd0VarM5467d2);
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l2);
            if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p2))) {
                AbstractC0748t1.m4157o(iM2776p2, c0616pi, iM2776p2, c0462m73);
            }
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E2);
            c0616pi.m3090W(1236071411);
            c0616pi.m3119p(false);
            c0616pi.m3119p(true);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: v51
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w51.m4878b(pe0Var, z, z2, t51Var, g30Var, x01Var, (InterfaceC0356ji) obj, j50.m1649A(i | 1));
                    return na1.f4229a;
                }
            };
        }
    }
}
