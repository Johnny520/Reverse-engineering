package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q62 {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f8750a;

    /* JADX INFO: renamed from: b */
    public final C0158e9 f8751b;

    /* JADX INFO: renamed from: c */
    public final h23 f8752c;

    /* JADX INFO: renamed from: d */
    public final lk1 f8753d;

    /* JADX INFO: renamed from: e */
    public boolean f8754e;

    /* JADX INFO: renamed from: f */
    public boolean f8755f;

    /* JADX INFO: renamed from: g */
    public boolean f8756g;

    /* JADX INFO: renamed from: h */
    public RunnableC0413l6 f8757h;

    /* JADX INFO: renamed from: i */
    public long f8758i;

    /* JADX INFO: renamed from: j */
    public final C0159ea f8759j;

    /* JADX INFO: renamed from: k */
    public final qk1 f8760k;

    public q62(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        this.f8750a = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        C0158e9 c0158e9 = new C0158e9((byte) 0, 7);
        c0158e9.f2353j = new long[192];
        c0158e9.f2354k = new long[192];
        this.f8751b = c0158e9;
        this.f8752c = new h23();
        this.f8753d = new lk1();
        this.f8758i = -1L;
        this.f8759j = new C0159ea(19, this);
        this.f8760k = new qk1();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4058c(zn1 zn1Var) {
        yv1 yv1Var = zn1Var.f13984S;
        return (yv1Var == null || AbstractC0570p7.m3789y(((sq0) yv1Var).m4968b())) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static long m4059e(r61 r61Var) {
        vn1 vn1Var = r61Var.f9372M;
        zn1 zn1Var = (zn1) vn1Var.f12034e;
        long jM6373c = 0;
        for (zn1 zn1Var2 = (qz0) vn1Var.f12033d; zn1Var2 != null && zn1Var2 != zn1Var; zn1Var2 = zn1Var2.f13987x) {
            if (m4058c(zn1Var2)) {
                return 9223372034707292159L;
            }
            jM6373c = z01.m6373c(jM6373c, zn1Var2.f13972G);
        }
        return jM6373c;
    }

    /* JADX INFO: renamed from: h */
    public static void m4060h(r61 r61Var) {
        if (!r61Var.f9386j || m4058c((zn1) r61Var.f9372M.f12034e)) {
            return;
        }
        r61Var.f9386j = false;
        if (r61Var.f9388l) {
            r61Var.f9387k = m4059e(r61Var);
            r61Var.f9388l = false;
        }
        if (z01.m6371a(r61Var.f9387k, 9223372034707292159L)) {
            return;
        }
        zk1 zk1VarM4393y = r61Var.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            m4060h((r61) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4061a() {
        boolean z;
        long j;
        C0158e9 c0158e9;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        RunnableC0413l6 runnableC0413l6 = this.f8757h;
        if (runnableC0413l6 != null) {
            this.f8750a.removeCallbacks(runnableC0413l6);
            this.f8757h = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f8754e;
        boolean z3 = z2 || this.f8755f;
        C0158e9 c0158e92 = this.f8751b;
        boolean z4 = true;
        h23 h23Var = this.f8752c;
        if (z2) {
            this.f8754e = false;
            lk1 lk1Var = this.f8753d;
            Object[] objArr = lk1Var.f6163a;
            int i3 = lk1Var.f6164b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((xm0) objArr[i4]).mo6a();
            }
            long[] jArr2 = (long[]) c0158e92.f2353j;
            int i5 = c0158e92.f2352i;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    g23 g23Var = (g23) h23Var.f3801a.m6022b(((int) j6) & 33554431);
                    while (g23Var != null) {
                        g23 g23Var2 = g23Var.f3288d;
                        boolean z6 = z3;
                        long j9 = g23Var.f3291g;
                        boolean z7 = (jCurrentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        g23Var.f3289e = j7;
                        g23Var.f3290f = j8;
                        if (z7) {
                            g23Var.f3291g = jCurrentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            g23Var.m1789a(j4, j5, h23Var.f3804d, h23Var.f3805e, h23Var.f3807g);
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
            long[] jArr3 = (long[]) c0158e92.f2353j;
            int i8 = c0158e92.f2352i;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f8755f) {
            this.f8755f = false;
            long j10 = h23Var.f3804d;
            long j11 = h23Var.f3805e;
            float[] fArr = h23Var.f3807g;
            zj1 zj1Var = h23Var.f3801a;
            j2 = 128;
            Object[] objArr2 = zj1Var.f12751c;
            long[] jArr4 = zj1Var.f12749a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    c0158e9 = c0158e92;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                g23 g23Var3 = (g23) objArr2[(i11 << 3) + i15];
                                while (g23Var3 != null) {
                                    h23Var.m2044a(g23Var3, j12, j11, fArr, jCurrentTimeMillis);
                                    g23Var3 = g23Var3.f3288d;
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
                    c0158e92 = c0158e9;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = h23Var.f3804d;
                    long j16 = h23Var.f3805e;
                    float[] fArr2 = h23Var.f3807g;
                    g23 g23Var4 = h23Var.f3802b;
                    if (g23Var4 != null) {
                        while (g23Var4 != null) {
                            r61 r61VarM4933c0 = sp0.m4933c0(g23Var4.f3286b);
                            long jM4062b = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61VarM4933c0)).getRectManager().m4062b(r61VarM4933c0);
                            g23Var4.f3289e = jM4062b;
                            mf1 mf1Var = r61VarM4933c0.f9373N.f11795p;
                            g23Var4.f3290f = (((long) (mf1Var.f10438h + ((int) (jM4062b >> 32)))) << 32) | (((long) (mf1Var.f10439i + ((int) (jM4062b & 4294967295L)))) & 4294967295L);
                            h23Var.m2044a(g23Var4, j15, j16, fArr2, jCurrentTimeMillis);
                            g23Var4 = g23Var4.f3288d;
                        }
                    }
                }
                if (this.f8756g) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.f8756g = false;
                    C0158e9 c0158e93 = c0158e9;
                    long[] jArr6 = (long[]) c0158e93.f2353j;
                    int i17 = c0158e93.f2352i;
                    long[] jArr7 = (long[]) c0158e93.f2354k;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != p62.f7989a) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    c0158e93.f2352i = i18;
                    c0158e93.f2353j = jArr7;
                    c0158e93.f2354k = jArr6;
                }
                if (h23Var.f3803c <= jCurrentTimeMillis) {
                    zj1 zj1Var2 = h23Var.f3801a;
                    Object[] objArr3 = zj1Var2.f12751c;
                    long[] jArr8 = zj1Var2.f12749a;
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
                                        for (g23 g23Var5 = (g23) objArr3[(i21 << 3) + i23]; g23Var5 != null; g23Var5 = g23Var5.f3288d) {
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
                    g23 g23Var6 = h23Var.f3802b;
                    if (g23Var6 != null) {
                        while (g23Var6 != null) {
                            g23Var6 = g23Var6.f3288d;
                        }
                    }
                    h23Var.f3803c = -1L;
                }
                if (h23Var.f3803c <= j) {
                    m4066i();
                    return;
                }
                return;
            }
            c0158e9 = c0158e92;
            i = 8;
        } else {
            c0158e9 = c0158e92;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.f8756g) {
        }
        if (h23Var.f3803c <= jCurrentTimeMillis) {
        }
        if (h23Var.f3803c <= j) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m4062b(r61 r61Var) {
        long j;
        int i = r61Var.f9385i & 33554431;
        C0158e9 c0158e9 = this.f8751b;
        long[] jArr = (long[]) c0158e9.f2353j;
        int i2 = c0158e9.f2352i;
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4063d(r61 r61Var) {
        boolean z;
        boolean z2 = true;
        r61Var.f9386j = true;
        vn1 vn1Var = r61Var.f9372M;
        zn1 zn1Var = (zn1) vn1Var.f12034e;
        mf1 mf1Var = r61Var.f9373N.f11795p;
        int iMo3071b0 = mf1Var.mo3071b0();
        float fMo3069Z = mf1Var.mo3069Z();
        qk1 qk1Var = this.f8760k;
        qk1Var.f9013a = 0.0f;
        qk1Var.f9014b = 0.0f;
        qk1Var.f9015c = iMo3071b0;
        qk1Var.f9016d = fMo3069Z;
        while (true) {
            if (zn1Var == null) {
                break;
            }
            r61 r61Var2 = zn1Var.f13985v;
            if (zn1Var == ((zn1) r61Var2.f9372M.f12034e) && !r61Var2.f9386j) {
                if (!z01.m6371a(m4062b(r61Var2), 9223372034707292159L)) {
                    qk1Var.m4195c((((long) Float.floatToRawIntBits((int) (r9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (r9 & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            yv1 yv1Var = zn1Var.f13984S;
            if (yv1Var != null) {
                float[] fArrM4968b = ((sq0) yv1Var).m4968b();
                if (!AbstractC0570p7.m3789y(fArrM4968b)) {
                    hf1.m2157c(fArrM4968b, qk1Var);
                }
            }
            long j = zn1Var.f13972G;
            qk1Var.m4195c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            zn1Var = zn1Var.f13987x;
        }
        int i = (int) qk1Var.f9013a;
        int i2 = (int) qk1Var.f9014b;
        int i3 = (int) qk1Var.f9015c;
        int i4 = (int) qk1Var.f9016d;
        int i5 = r61Var.f9385i;
        boolean z3 = r61Var.f9390n;
        r61Var.f9390n = true;
        C0158e9 c0158e9 = this.f8751b;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) c0158e9.f2353j;
            int i7 = c0158e9.f2352i;
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
            r61 r61VarM4389u = r61Var.m4389u();
            c0158e9.m1305m(i5, i, i2, i3, i4, (AIChatConfig.DefaultMaxTokens & 32) != 0 ? -1 : r61VarM4389u == null ? r61VarM4389u.f9385i : -1, vn1Var.m5731m(1024), vn1Var.m5731m(16), this.f8752c.f3801a.m6021a(i5), -1);
        } else {
            z = z2;
            r61 r61VarM4389u2 = r61Var.m4389u();
            c0158e9.m1305m(i5, i, i2, i3, i4, (AIChatConfig.DefaultMaxTokens & 32) != 0 ? -1 : r61VarM4389u2 == null ? r61VarM4389u2.f9385i : -1, vn1Var.m5731m(1024), vn1Var.m5731m(16), this.f8752c.f3801a.m6021a(i5), -1);
        }
        r61Var.f9389m = false;
        this.f8754e = z;
        zk1 zk1VarM4393y = r61Var.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i10 = zk1VarM4393y.f13936j;
        for (int i11 = 0; i11 < i10; i11++) {
            r61 r61Var3 = (r61) objArr[i11];
            if (r61Var3.m4351I()) {
                m4063d(r61Var3);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4064f(r61 r61Var) {
        long j;
        boolean zM4351I = r61Var.m4351I();
        vn1 vn1Var = r61Var.f9372M;
        if (zM4351I && r61Var.f9389m) {
            r61 r61VarM4389u = r61Var.m4389u();
            if (r61VarM4389u == null || r61VarM4389u.f9386j) {
                j = r61VarM4389u == null ? 0L : 9223372034707292159L;
            } else {
                if (r61VarM4389u.f9388l) {
                    r61VarM4389u.f9388l = false;
                    r61VarM4389u.f9387k = m4059e(r61VarM4389u);
                }
                j = r61VarM4389u.f9387k;
            }
            zn1 zn1Var = (zn1) vn1Var.f12034e;
            if (z01.m6371a(j, 9223372034707292159L) || m4058c(zn1Var)) {
                m4063d(r61Var);
            } else if (r61Var.f9386j) {
                m4063d(r61Var);
                m4060h(r61Var);
            } else {
                long jM6373c = z01.m6373c(j, zn1Var.f13972G);
                mf1 mf1Var = r61Var.f9373N.f11795p;
                int iMo3071b0 = mf1Var.mo3071b0();
                int iMo3069Z = mf1Var.mo3069Z();
                int i = r61Var.f9385i;
                boolean z = r61Var.f9390n;
                C0158e9 c0158e9 = this.f8751b;
                long j2 = 4294967295L;
                if (!z) {
                    r61Var.f9390n = true;
                    boolean zM5731m = vn1Var.m5731m(1024);
                    boolean zM5731m2 = vn1Var.m5731m(16);
                    boolean zM6021a = this.f8752c.f3801a.m6021a(i);
                    if (r61VarM4389u != null) {
                        int i2 = r61VarM4389u.f9385i;
                        int i3 = (int) (jM6373c >> 32);
                        int i4 = (int) (jM6373c & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) c0158e9.f2353j;
                        int i6 = c0158e9.f2352i - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                c0158e9.m1305m(i5, i7, i8, i7 + iMo3071b0, i8 + iMo3069Z, i2, zM5731m, zM5731m2, zM6021a, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (jM6373c >> 32);
                        int i10 = (int) (jM6373c & 4294967295L);
                        c0158e9.m1305m(i, i9, i10, i9 + iMo3071b0, i10 + iMo3069Z, (AIChatConfig.DefaultMaxTokens & 32) != 0 ? -1 : 0, zM5731m, zM5731m2, zM6021a, -1);
                    }
                } else if (r61VarM4389u != null) {
                    int i11 = r61VarM4389u.f9385i;
                    int i12 = (int) (jM6373c >> 32);
                    int i13 = (int) (jM6373c & 4294967295L);
                    int i14 = i & 33554431;
                    long[] jArr2 = (long[]) c0158e9.f2353j;
                    int i15 = c0158e9.f2352i;
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
                            int i19 = i17 + iMo3071b0;
                            int i20 = i18 + iMo3069Z;
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
                                        int i27 = p62.f7990b;
                                        c0158e9.m1312u(i25, i26, (j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25));
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
                    int i28 = (int) (jM6373c >> 32);
                    int i29 = (int) (jM6373c & 4294967295L);
                    int i30 = iMo3071b0 + i28;
                    int i31 = i29 + iMo3069Z;
                    int i32 = i & 33554431;
                    long[] jArr4 = (long[]) c0158e9.f2353j;
                    int i33 = c0158e9.f2352i;
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
                                int i39 = p62.f7990b;
                                c0158e9.m1312u(i37, i38, (j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i34 += 3;
                        }
                    }
                }
            }
            r61Var.f9389m = false;
            this.f8754e = true;
            m4066i();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4065g(r61 r61Var) {
        if (r61Var.f9390n) {
            int i = r61Var.f9385i & 33554431;
            C0158e9 c0158e9 = this.f8751b;
            long[] jArr = (long[]) c0158e9.f2353j;
            int i2 = c0158e9.f2352i;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = p62.f7989a;
                    break;
                }
                i3 += 3;
            }
            r61Var.f9390n = false;
            r61Var.f9389m = true;
            this.f8754e = true;
            this.f8756g = true;
        }
    }

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
    /* JADX INFO: renamed from: i */
    public final void m4066i() {
        RunnableC0413l6 runnableC0413l6 = this.f8757h;
        boolean z = runnableC0413l6 != null;
        long j = this.f8752c.f3803c;
        if (j >= 0 || !z) {
            if (this.f8758i == j && z) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f8750a;
            if (runnableC0413l6 != null) {
                viewTreeObserverOnGlobalLayoutListenerC0045b7.removeCallbacks(runnableC0413l6);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f8758i = jMax;
            RunnableC0413l6 runnableC0413l62 = new RunnableC0413l6(this.f8759j, 0);
            viewTreeObserverOnGlobalLayoutListenerC0045b7.postDelayed(runnableC0413l62, jMax - jCurrentTimeMillis);
            this.f8757h = runnableC0413l62;
        }
    }
}
