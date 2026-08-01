package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qd0 {

    /* JADX INFO: renamed from: a */
    public static final g41 f5125a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        z60.m5423J(new sc0(1));
        f5125a = new g41(new sc0(2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3213a(final C0429lf c0429lf, final dg0 dg0Var, final b11 b11Var, final da1 da1Var, final InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, final int i) {
        int i2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(904511636);
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3104f(c0429lf) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3104f(dg0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3104f(b11Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c0616pi.m3104f(da1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0904ww) ? 16384 : 8192;
        }
        int i3 = 1;
        if (c0616pi.m3082O(i2 & 1, (i2 & 9363) != 9362)) {
            c0616pi.m3087T();
            if ((i & 1) != 0 && !c0616pi.m3128y()) {
                c0616pi.m3085R();
            }
            c0616pi.m3120q();
            wv0 wv0VarM4359a = uv0.m4359a(0.0f, 7);
            long j = c0429lf.f3452a;
            boolean zM3102e = c0616pi.m3102e(j);
            Object objM3080L = c0616pi.m3080L();
            if (zM3102e || objM3080L == C0320ii.f2572a) {
                objM3080L = new m71(j, C0207ff.m1093b(0.4f, j));
                c0616pi.m3107g0(objM3080L);
            }
            AbstractC0307i4.m1527c(new ct0[]{AbstractC0510nf.f4248a.mo206a(c0429lf), f5125a.mo206a(dg0Var), c10.f626a.mo206a(wv0VarM4359a), c11.f627a.mo206a(b11Var), n71.f4204a.mo206a((m71) objM3080L), fa1.f1646a.mo206a(da1Var)}, AbstractC0398kl.m1937w(-1750539308, new C0350jc(i3, da1Var, interfaceC0904ww), c0616pi), c0616pi, 56);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: pd0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qd0.m3213a(c0429lf, dg0Var, b11Var, da1Var, interfaceC0904ww, (InterfaceC0356ji) obj, j50.m1649A(i | 1));
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m3214b(C0429lf c0429lf, b11 b11Var, da1 da1Var, InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        b11 b11Var2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-449719819);
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3104f(c0429lf) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3104f(da1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0904ww) ? 2048 : 1024;
        }
        if (c0616pi.m3082O(i2 & 1, (i2 & 1171) != 1170)) {
            c0616pi.m3087T();
            if ((i & 1) == 0 || c0616pi.m3128y()) {
                b11Var = (b11) c0616pi.m3112j(c11.f627a);
            } else {
                c0616pi.m3085R();
            }
            int i3 = i2 & (-113);
            b11 b11Var3 = b11Var;
            c0616pi.m3120q();
            int i4 = i3 & 14;
            int i5 = i3 << 3;
            m3213a(c0429lf, (dg0) c0616pi.m3112j(f5125a), b11Var3, da1Var, interfaceC0904ww, c0616pi, i4 | (i5 & 7168) | (i5 & 57344));
            b11Var2 = b11Var3;
        } else {
            c0616pi.m3085R();
            b11Var2 = b11Var;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0194f2(c0429lf, b11Var2, da1Var, interfaceC0904ww, i, 1);
        }
    }
}
