package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q62 {
    public final b7 a;
    public final e9 b;
    public final h23 c;
    public final lk1 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public l6 h;
    public long i;
    public final ea j;
    public final qk1 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q62(b7 b7Var) {
        this.a = b7Var;
        e9 e9Var = new e9((byte) 0, 7);
        e9Var.j = new long[192];
        e9Var.k = new long[192];
        this.b = e9Var;
        this.c = new h23();
        this.d = new lk1();
        this.i = -1L;
        this.j = new ea(19, this);
        this.k = new qk1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c(zn1 zn1Var) {
        yv1 yv1Var = zn1Var.S;
        return (yv1Var == null || p7.y(((sq0) yv1Var).b())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long e(r61 r61Var) {
        vn1 vn1Var = r61Var.M;
        zn1 zn1Var = (zn1) vn1Var.e;
        long jC = 0;
        for (zn1 zn1Var2 = (qz0) vn1Var.d; zn1Var2 != null && zn1Var2 != zn1Var; zn1Var2 = zn1Var2.x) {
            if (c(zn1Var2)) {
                return 9223372034707292159L;
            }
            jC = z01.c(jC, zn1Var2.G);
        }
        return jC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(r61 r61Var) {
        if (!r61Var.j || c((zn1) r61Var.M.e)) {
            return;
        }
        r61Var.j = false;
        if (r61Var.l) {
            r61Var.k = e(r61Var);
            r61Var.l = false;
        }
        if (z01.a(r61Var.k, 9223372034707292159L)) {
            return;
        }
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            h((r61) objArr[i2]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        long j;
        e9 e9Var;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        l6 l6Var = this.h;
        if (l6Var != null) {
            this.a.removeCallbacks(l6Var);
            this.h = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e;
        boolean z3 = z2 || this.f;
        e9 e9Var2 = this.b;
        boolean z4 = true;
        h23 h23Var = this.c;
        if (z2) {
            this.e = false;
            lk1 lk1Var = this.d;
            Object[] objArr = lk1Var.a;
            int i3 = lk1Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((xm0) objArr[i4]).a();
            }
            long[] jArr2 = (long[]) e9Var2.j;
            int i5 = e9Var2.i;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    g23 g23Var = (g23) h23Var.a.b(((int) j6) & 33554431);
                    while (g23Var != null) {
                        g23 g23Var2 = g23Var.d;
                        boolean z6 = z3;
                        long j9 = g23Var.g;
                        boolean z7 = (jCurrentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        g23Var.e = j7;
                        g23Var.f = j8;
                        if (z7) {
                            g23Var.g = jCurrentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            g23Var.a(j4, j5, h23Var.d, h23Var.e, h23Var.g);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        g23Var = g23Var2;
                        j7 = j4;
                        j8 = j5;
                        z3 = z6;
                    }
                }
                i6 += 3;
                z4 = z5;
                i5 = i7;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr3 = (long[]) e9Var2.j;
            int i8 = e9Var2.i;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f) {
            this.f = false;
            long j10 = h23Var.d;
            long j11 = h23Var.e;
            float[] fArr = h23Var.g;
            zj1 zj1Var = h23Var.a;
            j2 = 128;
            Object[] objArr2 = zj1Var.c;
            long[] jArr4 = zj1Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    e9Var = e9Var2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                g23 g23Var3 = (g23) objArr2[(i11 << 3) + i15];
                                while (g23Var3 != null) {
                                    h23Var.a(g23Var3, j12, j11, fArr, jCurrentTimeMillis);
                                    g23Var3 = g23Var3.d;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j14 >>= i16;
                            i15++;
                            j12 = j12;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    e9Var2 = e9Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = h23Var.d;
                    long j16 = h23Var.e;
                    float[] fArr2 = h23Var.g;
                    g23 g23Var4 = h23Var.b;
                    if (g23Var4 != null) {
                        while (g23Var4 != null) {
                            r61 r61VarC0 = sp0.c0(g23Var4.b);
                            long jB = ((b7) u61.a(r61VarC0)).getRectManager().b(r61VarC0);
                            g23Var4.e = jB;
                            mf1 mf1Var = r61VarC0.N.p;
                            g23Var4.f = (((long) (mf1Var.h + ((int) (jB >> 32)))) << 32) | (((long) (mf1Var.i + ((int) (jB & 4294967295L)))) & 4294967295L);
                            h23Var.a(g23Var4, j15, j16, fArr2, jCurrentTimeMillis);
                            g23Var4 = g23Var4.d;
                        }
                    }
                }
                if (this.g) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.g = false;
                    e9 e9Var3 = e9Var;
                    long[] jArr6 = (long[]) e9Var3.j;
                    int i17 = e9Var3.i;
                    long[] jArr7 = (long[]) e9Var3.k;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != p62.a) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    e9Var3.i = i18;
                    e9Var3.j = jArr7;
                    e9Var3.k = jArr6;
                }
                if (h23Var.c <= jCurrentTimeMillis) {
                    zj1 zj1Var2 = h23Var.a;
                    Object[] objArr3 = zj1Var2.c;
                    long[] jArr8 = zj1Var2.a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j17 = jArr8[i21];
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j18 = j17;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j18 & j3) < j2) {
                                        for (g23 g23Var5 = (g23) objArr3[(i21 << 3) + i23]; g23Var5 != null; g23Var5 = g23Var5.d) {
                                        }
                                    }
                                    j18 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                } else if (i21 == length2) {
                                    break;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    g23 g23Var6 = h23Var.b;
                    if (g23Var6 != null) {
                        while (g23Var6 != null) {
                            g23Var6 = g23Var6.d;
                        }
                    }
                    h23Var.c = -1L;
                }
                if (h23Var.c <= j) {
                    i();
                    return;
                }
                return;
            }
            e9Var = e9Var2;
            i = 8;
        } else {
            e9Var = e9Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.g) {
        }
        if (h23Var.c <= jCurrentTimeMillis) {
        }
        if (h23Var.c <= j) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b(r61 r61Var) {
        long j;
        int i = r61Var.i & 33554431;
        e9 e9Var = this.b;
        long[] jArr = (long[]) e9Var.j;
        int i2 = e9Var.i;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) j)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(r61 r61Var) {
        boolean z;
        boolean z2 = true;
        r61Var.j = true;
        vn1 vn1Var = r61Var.M;
        zn1 zn1Var = (zn1) vn1Var.e;
        mf1 mf1Var = r61Var.N.p;
        int iB0 = mf1Var.b0();
        float fZ = mf1Var.Z();
        qk1 qk1Var = this.k;
        qk1Var.a = 0.0f;
        qk1Var.b = 0.0f;
        qk1Var.c = iB0;
        qk1Var.d = fZ;
        while (true) {
            if (zn1Var == null) {
                break;
            }
            r61 r61Var2 = zn1Var.v;
            if (zn1Var == ((zn1) r61Var2.M.e) && !r61Var2.j) {
                if (!z01.a(b(r61Var2), 9223372034707292159L)) {
                    qk1Var.c((((long) Float.floatToRawIntBits((int) (r9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (r9 & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            yv1 yv1Var = zn1Var.S;
            if (yv1Var != null) {
                float[] fArrB = ((sq0) yv1Var).b();
                if (!p7.y(fArrB)) {
                    hf1.c(fArrB, qk1Var);
                }
            }
            long j = zn1Var.G;
            qk1Var.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            zn1Var = zn1Var.x;
        }
        int i = (int) qk1Var.a;
        int i2 = (int) qk1Var.b;
        int i3 = (int) qk1Var.c;
        int i4 = (int) qk1Var.d;
        int i5 = r61Var.i;
        boolean z3 = r61Var.n;
        r61Var.n = true;
        e9 e9Var = this.b;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) e9Var.j;
            int i7 = e9Var.i;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                long j2 = jArr[i9];
                z = z2;
                if ((((int) j2) & 33554431) == i6) {
                    jArr[i8] = (((long) i) << 32) | (((long) i2) & 4294967295L);
                    jArr[i8 + 1] = (((long) i3) << 32) | (((long) i4) & 4294967295L);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i8 += 3;
                z2 = z;
            }
            z = z2;
            r61 r61VarU = r61Var.u();
            e9Var.m(i5, i, i2, i3, i4, (AIChatConfig.DefaultMaxTokens & 32) != 0 ? -1 : r61VarU == null ? r61VarU.i : -1, vn1Var.m(1024), vn1Var.m(16), this.c.a.a(i5), -1);
        } else {
            z = z2;
            r61 r61VarU2 = r61Var.u();
            e9Var.m(i5, i, i2, i3, i4, (AIChatConfig.DefaultMaxTokens & 32) != 0 ? -1 : r61VarU2 == null ? r61VarU2.i : -1, vn1Var.m(1024), vn1Var.m(16), this.c.a.a(i5), -1);
        }
        r61Var.m = false;
        this.e = z;
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i10 = zk1VarY.j;
        for (int i11 = 0; i11 < i10; i11++) {
            r61 r61Var3 = (r61) objArr[i11];
            if (r61Var3.I()) {
                d(r61Var3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(r61 r61Var) {
        long j;
        boolean zI = r61Var.I();
        vn1 vn1Var = r61Var.M;
        if (zI && r61Var.m) {
            r61 r61VarU = r61Var.u();
            if (r61VarU == null || r61VarU.j) {
                j = r61VarU == null ? 0L : 9223372034707292159L;
            } else {
                if (r61VarU.l) {
                    r61VarU.l = false;
                    r61VarU.k = e(r61VarU);
                }
                j = r61VarU.k;
            }
            zn1 zn1Var = (zn1) vn1Var.e;
            if (z01.a(j, 9223372034707292159L) || c(zn1Var)) {
                d(r61Var);
            } else if (r61Var.j) {
                d(r61Var);
                h(r61Var);
            } else {
                long jC = z01.c(j, zn1Var.G);
                mf1 mf1Var = r61Var.N.p;
                int iB0 = mf1Var.b0();
                int iZ = mf1Var.Z();
                int i = r61Var.i;
                boolean z = r61Var.n;
                e9 e9Var = this.b;
                long j2 = 4294967295L;
                if (!z) {
                    r61Var.n = true;
                    boolean zM = vn1Var.m(1024);
                    boolean zM2 = vn1Var.m(16);
                    boolean zA = this.c.a.a(i);
                    if (r61VarU != null) {
                        int i2 = r61VarU.i;
                        int i3 = (int) (jC >> 32);
                        int i4 = (int) (jC & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) e9Var.j;
                        int i6 = e9Var.i - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                e9Var.m(i5, i7, i8, i7 + iB0, i8 + iZ, i2, zM, zM2, zA, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (jC >> 32);
                        int i10 = (int) (jC & 4294967295L);
                        e9Var.m(i, i9, i10, i9 + iB0, i10 + iZ, (AIChatConfig.DefaultMaxTokens & 32) != 0 ? -1 : 0, zM, zM2, zA, -1);
                    }
                } else if (r61VarU != null) {
                    int i11 = r61VarU.i;
                    int i12 = (int) (jC >> 32);
                    int i13 = (int) (jC & 4294967295L);
                    int i14 = i & 33554431;
                    long[] jArr2 = (long[]) e9Var.j;
                    int i15 = e9Var.i;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= jArr2.length - 2 || i16 >= i15) {
                            break;
                        }
                        long j4 = j2;
                        if ((((int) jArr2[i16 + 2]) & 33554431) == i11) {
                            long j5 = jArr2[i16];
                            int i17 = ((int) (j5 >> 32)) + i12;
                            int i18 = ((int) j5) + i13;
                            int i19 = i17 + iB0;
                            int i20 = i18 + iZ;
                            i16 += 3;
                            while (i16 < jArr2.length - 2 && i16 < i15) {
                                int i21 = i16 + 2;
                                int i22 = i11;
                                int i23 = i12;
                                long j6 = jArr2[i21];
                                int i24 = i13;
                                if ((((int) j6) & 33554431) == i14) {
                                    long j7 = jArr2[i16];
                                    long[] jArr3 = jArr2;
                                    int i25 = i17 - ((int) (j7 >> 32));
                                    int i26 = i18 - ((int) j7);
                                    jArr3[i16] = (((long) i18) & j4) | (((long) i17) << 32);
                                    jArr3[i16 + 1] = (((long) i19) << 32) | (((long) i20) & j4);
                                    jArr3[i21] = j6 | (((j6 >> 63) & 1) << 60);
                                    if (i25 != 0 || i26 != 0) {
                                        int i27 = p62.b;
                                        e9Var.u(i25, i26, (j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25));
                                    }
                                } else {
                                    i16 += 3;
                                    i11 = i22;
                                    i12 = i23;
                                    i13 = i24;
                                }
                            }
                        }
                        i16 += 3;
                        jArr2 = jArr2;
                        j2 = j4;
                        i11 = i11;
                        i12 = i12;
                        i13 = i13;
                    }
                } else {
                    int i28 = (int) (jC >> 32);
                    int i29 = (int) (jC & 4294967295L);
                    int i30 = iB0 + i28;
                    int i31 = i29 + iZ;
                    int i32 = i & 33554431;
                    long[] jArr4 = (long[]) e9Var.j;
                    int i33 = e9Var.i;
                    int i34 = 0;
                    while (true) {
                        if (i34 >= jArr4.length - 2 || i34 >= i33) {
                            break;
                        }
                        int i35 = i34 + 2;
                        long j8 = jArr4[i35];
                        if ((((int) j8) & 33554431) == i32) {
                            long j9 = jArr4[i34];
                            int i36 = i34;
                            jArr4[i36] = (((long) i28) << 32) | (((long) i29) & 4294967295L);
                            jArr4[i36 + 1] = (((long) i30) << 32) | (((long) i31) & 4294967295L);
                            jArr4[i35] = (((j8 >> 63) & 1) << 60) | j8;
                            int i37 = i28 - ((int) (j9 >> 32));
                            int i38 = i29 - ((int) j9);
                            if ((i37 != 0) | (i38 != 0)) {
                                int i39 = p62.b;
                                e9Var.u(i37, i38, (j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i34 += 3;
                        }
                    }
                }
            }
            r61Var.m = false;
            this.e = true;
            i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(r61 r61Var) {
        if (r61Var.n) {
            int i = r61Var.i & 33554431;
            e9 e9Var = this.b;
            long[] jArr = (long[]) e9Var.j;
            int i2 = e9Var.i;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = p62.a;
                    break;
                }
                i3 += 3;
            }
            r61Var.n = false;
            r61Var.m = true;
            this.e = true;
            this.g = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        l6 l6Var = this.h;
        boolean z = l6Var != null;
        long j = this.c.c;
        if (j >= 0 || !z) {
            if (this.i == j && z) {
                return;
            }
            b7 b7Var = this.a;
            if (l6Var != null) {
                b7Var.removeCallbacks(l6Var);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.i = jMax;
            l6 l6Var2 = new l6(this.j, 0);
            b7Var.postDelayed(l6Var2, jMax - jCurrentTimeMillis);
            this.h = l6Var2;
        }
    }
}
