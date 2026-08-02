package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v03 {
    public static final my a = new my(new hn1(27));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(m13 m13Var, kw kwVar, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(15327438);
        int i2 = (go0Var.f(m13Var) ? 4 : 2) | i | (go0Var.h(kwVar) ? 32 : 16);
        if (go0Var.O(i2 & 1, (i2 & 19) != 18)) {
            e42 e42Var = a;
            m13 m13Var2 = (m13) go0Var.j(e42Var);
            m13Var2.getClass();
            if (m13Var != null && !m13Var.equals(m13.d)) {
                m13Var2 = new m13(m13Var2.a.c(m13Var.a), m13Var2.b.a(m13Var.b));
            }
            ci0.a(e42Var.a(m13Var2), kwVar, go0Var, (i2 & 112) | 8);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new af(i, 21, m13Var, kwVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, uh1 uh1Var, final long j, final long j2, im0 im0Var, long j3, long j4, int i, boolean z, int i2, int i3, m13 m13Var, px pxVar, final int i4, final int i5, final int i6) {
        String str2;
        int i7;
        int i8;
        im0 im0Var2;
        int i9;
        long j5;
        int i10;
        int i11;
        int i12;
        go0 go0Var;
        final uh1 uh1Var2;
        final int i13;
        final boolean z2;
        final int i14;
        final int i15;
        final m13 m13Var2;
        final im0 im0Var3;
        final long j6;
        final long j7;
        b62 b62VarR;
        uh1 uh1Var3;
        im0 im0Var4;
        boolean z3;
        long j8;
        long j9;
        m13 m13Var3;
        int i16;
        int i17;
        long j10;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(1809465675);
        if ((i4 & 6) == 0) {
            str2 = str;
            i7 = (go0Var2.f(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i7 = i4;
        }
        int i18 = i6 & 2;
        if (i18 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i7 |= go0Var2.f(uh1Var) ? 32 : 16;
            }
            if ((i4 & 384) == 0) {
                i7 |= go0Var2.e(j) ? 256 : 128;
            }
            int i19 = i7 | 3072;
            if ((i4 & 24576) == 0) {
                i19 |= go0Var2.e(j2) ? 16384 : 8192;
            }
            int i20 = 196608 | i19;
            i8 = i6 & 64;
            if (i8 != 0) {
                if ((1572864 & i4) == 0) {
                    im0Var2 = im0Var;
                    i20 |= go0Var2.f(im0Var2) ? 1048576 : 524288;
                }
                int i21 = 12582912 | i20;
                i9 = i6 & 256;
                if (i9 != 0) {
                    i21 = 113246208 | i20;
                    j5 = j3;
                } else {
                    j5 = j3;
                    if ((100663296 & i4) == 0) {
                        i21 |= go0Var2.e(j5) ? 67108864 : 33554432;
                    }
                }
                i10 = i21 | 805306368;
                i11 = i5 | 6;
                i12 = i6 & 2048;
                if (i12 != 0) {
                    i11 = 54;
                } else if ((i5 & 48) == 0) {
                    i11 |= go0Var2.e(j4) ? 32 : 16;
                }
                int i22 = 1;
                if (go0Var2.O(i10 & 1, ((i10 & 306783379) == 306783378 && (4793491 & (i11 | 5991808)) == 4793490) ? false : true)) {
                    go0Var2.T();
                    if ((i4 & 1) == 0 || go0Var2.y()) {
                        uh1Var3 = i18 != 0 ? rh1.a : uh1Var;
                        im0Var4 = i8 != 0 ? null : im0Var2;
                        z3 = true;
                        j8 = i9 != 0 ? p13.c : j5;
                        j9 = i12 != 0 ? p13.c : j4;
                        m13Var3 = (m13) go0Var2.j(a);
                        i16 = Integer.MAX_VALUE;
                        i17 = 1;
                    } else {
                        go0Var2.R();
                        uh1Var3 = uh1Var;
                        j9 = j4;
                        i22 = i;
                        z3 = z;
                        i17 = i3;
                        m13Var3 = m13Var;
                        im0Var4 = im0Var2;
                        j8 = j5;
                        i16 = i2;
                    }
                    go0Var2.q();
                    go0Var2.W(-565217106);
                    if (j != 16) {
                        j10 = j;
                    } else {
                        go0Var2.W(-565216333);
                        long jB = m13Var3.b();
                        if (jB == 16) {
                            jB = ((ju) go0Var2.j(c00.a)).a;
                        }
                        go0Var2.p(false);
                        j10 = jB;
                    }
                    go0Var2.p(false);
                    uh1 uh1Var4 = uh1Var3;
                    boolean z4 = z3;
                    int i23 = i16;
                    int i24 = i17;
                    eu.a(str2, uh1Var4, m13.d(m13Var3, j10, j2, im0Var4, j8, 0, j9, 16609104), i22, z4, i23, i24, go0Var2, (i10 & 126) | 14380032 | ((i10 << 18) & 1879048192), 256);
                    go0Var = go0Var2;
                    i15 = i24;
                    m13Var2 = m13Var3;
                    i14 = i23;
                    im0Var3 = im0Var4;
                    j6 = j8;
                    j7 = j9;
                    z2 = z4;
                    i13 = i22;
                    uh1Var2 = uh1Var4;
                } else {
                    go0Var = go0Var2;
                    go0Var.R();
                    uh1Var2 = uh1Var;
                    i13 = i;
                    z2 = z;
                    i14 = i2;
                    i15 = i3;
                    m13Var2 = m13Var;
                    im0Var3 = im0Var2;
                    j6 = j5;
                    j7 = j4;
                }
                b62VarR = go0Var.r();
                if (b62VarR != null) {
                    b62VarR.d = new mn0() { // from class: u03
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iN = pp0.N(i4 | 1);
                            int iN2 = pp0.N(i5);
                            v03.b(str, uh1Var2, j, j2, im0Var3, j6, j7, i13, z2, i14, i15, m13Var2, (px) obj, iN, iN2, i6);
                            return a83.a;
                        }
                    };
                    return;
                }
                return;
            }
            i20 = 1769472 | i19;
            im0Var2 = im0Var;
            int i212 = 12582912 | i20;
            i9 = i6 & 256;
            if (i9 != 0) {
            }
            i10 = i212 | 805306368;
            i11 = i5 | 6;
            i12 = i6 & 2048;
            if (i12 != 0) {
            }
            int i222 = 1;
            if (go0Var2.O(i10 & 1, ((i10 & 306783379) == 306783378 && (4793491 & (i11 | 5991808)) == 4793490) ? false : true)) {
            }
            b62VarR = go0Var.r();
            if (b62VarR != null) {
            }
        }
        if ((i4 & 384) == 0) {
        }
        int i192 = i7 | 3072;
        if ((i4 & 24576) == 0) {
        }
        int i202 = 196608 | i192;
        i8 = i6 & 64;
        if (i8 != 0) {
        }
        im0Var2 = im0Var;
        int i2122 = 12582912 | i202;
        i9 = i6 & 256;
        if (i9 != 0) {
        }
        i10 = i2122 | 805306368;
        i11 = i5 | 6;
        i12 = i6 & 2048;
        if (i12 != 0) {
        }
        int i2222 = 1;
        if (go0Var2.O(i10 & 1, ((i10 & 306783379) == 306783378 && (4793491 & (i11 | 5991808)) == 4793490) ? false : true)) {
        }
        b62VarR = go0Var.r();
        if (b62VarR != null) {
        }
    }
}
