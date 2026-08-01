package p000;

/* JADX INFO: renamed from: oz */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0596oz {

    /* JADX INFO: renamed from: a */
    public static final pe0 f4680a = s11.m4000c(me0.f3922a, z60.f7815a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2962a(final r00 r00Var, final String str, pe0 pe0Var, long j, InterfaceC0356ji interfaceC0356ji, final int i, final int i2) {
        final pe0 pe0Var2;
        final long j2;
        int i3;
        ht0 ht0VarM3121r;
        pe0 pe0Var3;
        long j3;
        InterfaceC0968ym interfaceC0968ym;
        boolean zM3102e;
        Object objM3080L;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-126890956);
        int i4 = (c0616pi.m3104f(r00Var) ? 4 : 2) | i;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                pe0Var2 = pe0Var;
                i4 |= c0616pi.m3104f(pe0Var2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                j2 = j;
                int i6 = c0616pi.m3102e(j2) ? 2048 : 1024;
                i3 = i4 | i6;
                if (c0616pi.m3082O(i3 & 1, (i3 & 1171) != 1170)) {
                    c0616pi.m3087T();
                    if ((i & 1) == 0 || c0616pi.m3128y()) {
                        pe0 pe0Var4 = i5 != 0 ? me0.f3922a : pe0Var2;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            pe0Var3 = pe0Var4;
                            j3 = ((C0207ff) c0616pi.m3112j(AbstractC0928xj.f7352a)).f1709a;
                            c0616pi.m3120q();
                            interfaceC0968ym = (InterfaceC0968ym) c0616pi.m3112j(AbstractC0131dj.f1121h);
                            zM3102e = c0616pi.m3102e((((long) Float.floatToRawIntBits(interfaceC0968ym.mo48b())) & 4294967295L) | (((long) Float.floatToRawIntBits(r00Var.f5273i)) << 32));
                            objM3080L = c0616pi.m3080L();
                            if (!zM3102e || objM3080L == C0320ii.f2572a) {
                                C0035ay c0035ay = new C0035ay();
                                v50.m4403h(c0035ay, r00Var.f5270f);
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(interfaceC0968ym.mo654p(r00Var.f5267c))) & 4294967295L) | (((long) Float.floatToRawIntBits(interfaceC0968ym.mo654p(r00Var.f5266b))) << 32);
                                fIntBitsToFloat = r00Var.f5268d;
                                fIntBitsToFloat2 = r00Var.f5269e;
                                if (Float.isNaN(fIntBitsToFloat)) {
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                                }
                                if (Float.isNaN(fIntBitsToFloat2)) {
                                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                                }
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                                kb1 kb1Var = new kb1(c0035ay);
                                String str2 = r00Var.f5265a;
                                long j4 = r00Var.f5271g;
                                C0348ja c0348ja = j4 == 16 ? new C0348ja(r00Var.f5272h, j4) : null;
                                kb1Var.f3066e.setValue(new q11(jFloatToRawIntBits));
                                kb1Var.f3067f.setValue(Boolean.FALSE);
                                fb1 fb1Var = kb1Var.f3068g;
                                fb1Var.f1658g.setValue(c0348ja);
                                fb1Var.f1660i.setValue(new q11(jFloatToRawIntBits2));
                                fb1Var.f1654c = str2;
                                c0616pi.m3107g0(kb1Var);
                                objM3080L = kb1Var;
                            }
                            m2963b((kb1) objM3080L, str, pe0Var3, j3, c0616pi, (i3 & 896) | 56 | (i3 & 7168));
                            pe0Var2 = pe0Var3;
                            j2 = j3;
                        } else {
                            pe0Var3 = pe0Var4;
                        }
                    } else {
                        c0616pi.m3085R();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        pe0Var3 = pe0Var2;
                    }
                    j3 = j2;
                    c0616pi.m3120q();
                    interfaceC0968ym = (InterfaceC0968ym) c0616pi.m3112j(AbstractC0131dj.f1121h);
                    zM3102e = c0616pi.m3102e((((long) Float.floatToRawIntBits(interfaceC0968ym.mo48b())) & 4294967295L) | (((long) Float.floatToRawIntBits(r00Var.f5273i)) << 32));
                    objM3080L = c0616pi.m3080L();
                    if (!zM3102e) {
                        C0035ay c0035ay2 = new C0035ay();
                        v50.m4403h(c0035ay2, r00Var.f5270f);
                        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(interfaceC0968ym.mo654p(r00Var.f5267c))) & 4294967295L) | (((long) Float.floatToRawIntBits(interfaceC0968ym.mo654p(r00Var.f5266b))) << 32);
                        fIntBitsToFloat = r00Var.f5268d;
                        fIntBitsToFloat2 = r00Var.f5269e;
                        if (Float.isNaN(fIntBitsToFloat)) {
                        }
                        if (Float.isNaN(fIntBitsToFloat2)) {
                        }
                        long jFloatToRawIntBits22 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                        kb1 kb1Var2 = new kb1(c0035ay2);
                        String str22 = r00Var.f5265a;
                        long j42 = r00Var.f5271g;
                        if (j42 == 16) {
                        }
                        kb1Var2.f3066e.setValue(new q11(jFloatToRawIntBits3));
                        kb1Var2.f3067f.setValue(Boolean.FALSE);
                        fb1 fb1Var2 = kb1Var2.f3068g;
                        fb1Var2.f1658g.setValue(c0348ja);
                        fb1Var2.f1660i.setValue(new q11(jFloatToRawIntBits22));
                        fb1Var2.f1654c = str22;
                        c0616pi.m3107g0(kb1Var2);
                        objM3080L = kb1Var2;
                        m2963b((kb1) objM3080L, str, pe0Var3, j3, c0616pi, (i3 & 896) | 56 | (i3 & 7168));
                        pe0Var2 = pe0Var3;
                        j2 = j3;
                    }
                } else {
                    c0616pi.m3085R();
                }
                ht0VarM3121r = c0616pi.m3121r();
                if (ht0VarM3121r != null) {
                    ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: mz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p000.InterfaceC0904ww
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC0596oz.m2962a(r00Var, str, pe0Var2, j2, (InterfaceC0356ji) obj, j50.m1649A(i | 1), i2);
                            return na1.f4229a;
                        }
                    };
                    return;
                }
                return;
            }
            j2 = j;
            i3 = i4 | i6;
            if (c0616pi.m3082O(i3 & 1, (i3 & 1171) != 1170)) {
            }
            ht0VarM3121r = c0616pi.m3121r();
            if (ht0VarM3121r != null) {
            }
        }
        pe0Var2 = pe0Var;
        if ((i2 & 8) != 0) {
        }
        i3 = i4 | i6;
        if (c0616pi.m3082O(i3 & 1, (i3 & 1171) != 1170)) {
        }
        ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2963b(final ro0 ro0Var, final String str, final pe0 pe0Var, final long j, InterfaceC0356ji interfaceC0356ji, final int i) {
        ro0 ro0Var2;
        int i2;
        pe0 pe0Var2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-2142239481);
        if ((i & 6) == 0) {
            ro0Var2 = ro0Var;
            i2 = (c0616pi.m3108h(ro0Var2) ? 4 : 2) | i;
        } else {
            ro0Var2 = ro0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3104f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3104f(pe0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c0616pi.m3102e(j) ? 2048 : 1024;
        }
        if (c0616pi.m3082O(i2 & 1, (i2 & 1171) != 1170)) {
            c0616pi.m3087T();
            if ((i & 1) != 0 && !c0616pi.m3128y()) {
                c0616pi.m3085R();
            }
            c0616pi.m3120q();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && c0616pi.m3102e(j)) || (i2 & 3072) == 2048;
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (z || objM3080L == c0675r3) {
                objM3080L = C0207ff.m1094c(j, C0207ff.f1707g) ? null : new C0348ja(5, j);
                c0616pi.m3107g0(objM3080L);
            }
            C0348ja c0348ja = (C0348ja) objM3080L;
            pe0 pe0Var3 = me0.f3922a;
            if (str != null) {
                c0616pi.m3090W(-536990979);
                boolean z2 = (i2 & 112) == 32;
                Object objM3080L2 = c0616pi.m3080L();
                if (z2 || objM3080L2 == c0675r3) {
                    objM3080L2 = new C0516nl(str, 1);
                    c0616pi.m3107g0(objM3080L2);
                }
                pe0 pe0VarM4362a = uz0.m4362a(pe0Var3, (InterfaceC0742sw) objM3080L2);
                c0616pi.m3119p(false);
                pe0Var2 = pe0VarM4362a;
            } else {
                c0616pi.m3090W(-536832197);
                c0616pi.m3119p(false);
                pe0Var2 = pe0Var3;
            }
            if (!q11.m3185a(ro0Var2.mo1568d(), 9205357640488583168L)) {
                long jMo1568d = ro0Var2.mo1568d();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jMo1568d >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jMo1568d & 4294967295L)))) {
                    pe0Var3 = f4680a;
                }
                AbstractC0993za.m5464a(s91.m4023J(pe0Var.mo2499c(pe0Var3), ro0Var2, null, C0132dk.f1137a, c0348ja, 22).mo2499c(pe0Var2), c0616pi, 0);
            }
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: nz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0596oz.m2963b(ro0Var, str, pe0Var, j, (InterfaceC0356ji) obj, j50.m1649A(i | 1));
                    return na1.f4229a;
                }
            };
        }
    }
}
