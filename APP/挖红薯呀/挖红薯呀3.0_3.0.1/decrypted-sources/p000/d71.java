package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d71 {

    /* JADX INFO: renamed from: a */
    public static final C0174ej f988a = new C0174ej(new us0(13));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m658a(s71 s71Var, InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(15327438);
        int i2 = (c0616pi.m3104f(s71Var) ? 4 : 2) | i | (c0616pi.m3108h(interfaceC0904ww) ? 32 : 16);
        if (c0616pi.m3082O(i2 & 1, (i2 & 19) != 18)) {
            C0174ej c0174ej = f988a;
            AbstractC0307i4.m1526b(c0174ej.mo206a(((s71) c0616pi.m3112j(c0174ej)).m4013c(s71Var)), interfaceC0904ww, c0616pi, (i2 & 112) | 8);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0168ed(i, 11, s71Var, interfaceC0904ww);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m659b(final String str, pe0 pe0Var, long j, long j2, C1018zv c1018zv, z51 z51Var, long j3, r61 r61Var, long j4, int i, boolean z, int i2, int i3, s71 s71Var, InterfaceC0356ji interfaceC0356ji, final int i4, final int i5, final int i6) {
        int i7;
        pe0 pe0Var2;
        int i8;
        long j5;
        int i9;
        long j6;
        int i10;
        C1018zv c1018zv2;
        int i11;
        final z51 z51Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C0616pi c0616pi;
        final r61 r61Var2;
        final boolean z2;
        final int i17;
        final int i18;
        final s71 s71Var2;
        final long j7;
        final pe0 pe0Var3;
        final long j8;
        final C1018zv c1018zv3;
        final long j9;
        final long j10;
        final int i19;
        ht0 ht0VarM3121r;
        long j11;
        long j12;
        r61 r61Var3;
        long j13;
        int i20;
        s71 s71Var3;
        boolean z3;
        int i21;
        long jM4012b;
        long j14;
        boolean z4;
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3091X(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (c0616pi2.m3104f(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i22 = i6 & 2;
        if (i22 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                pe0Var2 = pe0Var;
                i7 |= c0616pi2.m3104f(pe0Var2) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    j5 = j;
                    i7 |= c0616pi2.m3102e(j5) ? 256 : 128;
                }
                int i23 = i7 | 3072;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i23 = i7 | 27648;
                    j6 = j2;
                } else {
                    j6 = j2;
                    if ((i4 & 24576) == 0) {
                        i23 |= c0616pi2.m3102e(j6) ? 16384 : 8192;
                    }
                }
                int i24 = i23 | 196608;
                i10 = i6 & 64;
                if (i10 != 0) {
                    i24 = i23 | 1769472;
                } else {
                    if ((1572864 & i4) == 0) {
                        c1018zv2 = c1018zv;
                        i24 |= c0616pi2.m3104f(c1018zv2) ? 1048576 : 524288;
                    }
                    i11 = i6 & 128;
                    if (i11 == 0) {
                        i24 |= 12582912;
                        z51Var2 = z51Var;
                    } else {
                        z51Var2 = z51Var;
                        if ((i4 & 12582912) == 0) {
                            i24 |= c0616pi2.m3104f(z51Var2) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i24 | 905969664;
                    i13 = i6 & 1024;
                    if (i13 == 0) {
                        i14 = i5 | 6;
                    } else {
                        i14 = i5 | (c0616pi2.m3104f(r61Var) ? 4 : 2);
                    }
                    i15 = i6 & 2048;
                    if (i15 != 0) {
                        if ((i5 & 48) == 0) {
                            i16 = i15;
                            i14 |= c0616pi2.m3102e(j4) ? 32 : 16;
                        }
                        int i25 = 1;
                        if (c0616pi2.m3082O(i12 & 1, ((i12 & 306783379) == 306783378 && ((i14 | 5991808) & 4793491) == 4793490) ? false : true)) {
                            c0616pi2.m3087T();
                            if ((i4 & 1) == 0 || c0616pi2.m3128y()) {
                                if (i22 != 0) {
                                    pe0Var2 = me0.f3922a;
                                }
                                if (i8 != 0) {
                                    j5 = C0207ff.f1707g;
                                }
                                j11 = i9 != 0 ? u71.f6158c : j6;
                                if (i10 != 0) {
                                    c1018zv2 = null;
                                }
                                if (i11 != 0) {
                                    z51Var2 = null;
                                }
                                j12 = u71.f6158c;
                                r61Var3 = i13 == 0 ? r61Var : null;
                                j13 = i16 != 0 ? j12 : j4;
                                i20 = Integer.MAX_VALUE;
                                s71Var3 = (s71) c0616pi2.m3112j(f988a);
                                z3 = true;
                                i21 = 1;
                            } else {
                                c0616pi2.m3085R();
                                j13 = j4;
                                i25 = i;
                                z3 = z;
                                i20 = i2;
                                i21 = i3;
                                s71Var3 = s71Var;
                                j11 = j6;
                                j12 = j3;
                                r61Var3 = r61Var;
                            }
                            c0616pi2.m3120q();
                            c0616pi2.m3090W(-565217106);
                            if (j5 != 16) {
                                j14 = j11;
                                jM4012b = j5;
                                z4 = false;
                            } else {
                                c0616pi2.m3090W(-565216333);
                                jM4012b = s71Var3.m4012b();
                                if (jM4012b != 16) {
                                    j14 = j11;
                                } else {
                                    j14 = j11;
                                    jM4012b = ((C0207ff) c0616pi2.m3112j(AbstractC0928xj.f7352a)).f1709a;
                                }
                                z4 = false;
                                c0616pi2.m3119p(false);
                            }
                            c0616pi2.m3119p(z4);
                            long j15 = j12;
                            s71 s71Var4 = s71Var3;
                            long j16 = j13;
                            j7 = j14;
                            boolean z5 = z3;
                            int i26 = i21;
                            s91.m4036a(str, pe0Var2, s71.m4011d(s71Var4, jM4012b, j14, c1018zv2, z51Var2, j15, (r61Var3 != null ? r61Var3.f5306a : z4) == true ? 1 : 0, j16, 16609104), i25, z5, i20, i26, c0616pi2, (i12 & 126) | 14380032 | ((i12 << 18) & 1879048192));
                            c0616pi = c0616pi2;
                            z2 = z5;
                            r61Var2 = r61Var3;
                            i17 = i20;
                            pe0Var3 = pe0Var2;
                            c1018zv3 = c1018zv2;
                            j9 = j15;
                            i19 = i25;
                            s71Var2 = s71Var4;
                            i18 = i26;
                            j8 = j5;
                            j10 = j16;
                        } else {
                            c0616pi = c0616pi2;
                            c0616pi.m3085R();
                            r61Var2 = r61Var;
                            z2 = z;
                            i17 = i2;
                            i18 = i3;
                            s71Var2 = s71Var;
                            j7 = j6;
                            pe0Var3 = pe0Var2;
                            j8 = j5;
                            c1018zv3 = c1018zv2;
                            j9 = j3;
                            j10 = j4;
                            i19 = i;
                        }
                        ht0VarM3121r = c0616pi.m3121r();
                        if (ht0VarM3121r != null) {
                            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: c71
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p000.InterfaceC0904ww
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iM1649A = j50.m1649A(i4 | 1);
                                    int iM1649A2 = j50.m1649A(i5);
                                    d71.m659b(str, pe0Var3, j8, j7, c1018zv3, z51Var2, j9, r61Var2, j10, i19, z2, i17, i18, s71Var2, (InterfaceC0356ji) obj, iM1649A, iM1649A2, i6);
                                    return na1.f4229a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i14 |= 48;
                    i16 = i15;
                    int i252 = 1;
                    if (c0616pi2.m3082O(i12 & 1, ((i12 & 306783379) == 306783378 && ((i14 | 5991808) & 4793491) == 4793490) ? false : true)) {
                    }
                    ht0VarM3121r = c0616pi.m3121r();
                    if (ht0VarM3121r != null) {
                    }
                }
                c1018zv2 = c1018zv;
                i11 = i6 & 128;
                if (i11 == 0) {
                }
                i12 = i24 | 905969664;
                i13 = i6 & 1024;
                if (i13 == 0) {
                }
                i15 = i6 & 2048;
                if (i15 != 0) {
                }
                i16 = i15;
                int i2522 = 1;
                if (c0616pi2.m3082O(i12 & 1, ((i12 & 306783379) == 306783378 && ((i14 | 5991808) & 4793491) == 4793490) ? false : true)) {
                }
                ht0VarM3121r = c0616pi.m3121r();
                if (ht0VarM3121r != null) {
                }
            }
            j5 = j;
            int i232 = i7 | 3072;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            int i242 = i232 | 196608;
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            c1018zv2 = c1018zv;
            i11 = i6 & 128;
            if (i11 == 0) {
            }
            i12 = i242 | 905969664;
            i13 = i6 & 1024;
            if (i13 == 0) {
            }
            i15 = i6 & 2048;
            if (i15 != 0) {
            }
            i16 = i15;
            int i25222 = 1;
            if (c0616pi2.m3082O(i12 & 1, ((i12 & 306783379) == 306783378 && ((i14 | 5991808) & 4793491) == 4793490) ? false : true)) {
            }
            ht0VarM3121r = c0616pi.m3121r();
            if (ht0VarM3121r != null) {
            }
        }
        pe0Var2 = pe0Var;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        j5 = j;
        int i2322 = i7 | 3072;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        int i2422 = i2322 | 196608;
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        c1018zv2 = c1018zv;
        i11 = i6 & 128;
        if (i11 == 0) {
        }
        i12 = i2422 | 905969664;
        i13 = i6 & 1024;
        if (i13 == 0) {
        }
        i15 = i6 & 2048;
        if (i15 != 0) {
        }
        i16 = i15;
        int i252222 = 1;
        if (c0616pi2.m3082O(i12 & 1, ((i12 & 306783379) == 306783378 && ((i14 | 5991808) & 4793491) == 4793490) ? false : true)) {
        }
        ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
        }
    }
}
