package p000;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ut0 {

    /* JADX INFO: renamed from: a */
    public final C0791u5 f6297a;

    /* JADX INFO: renamed from: b */
    public final e81 f6298b;

    /* JADX INFO: renamed from: c */
    public final dh0 f6299c;

    /* JADX INFO: renamed from: d */
    public boolean f6300d;

    /* JADX INFO: renamed from: e */
    public boolean f6301e;

    /* JADX INFO: renamed from: f */
    public boolean f6302f;

    /* JADX INFO: renamed from: g */
    public RunnableC0824v1 f6303g;

    /* JADX INFO: renamed from: h */
    public long f6304h;

    /* JADX INFO: renamed from: i */
    public final C0310i7 f6305i;

    /* JADX INFO: renamed from: j */
    public final ih0 f6306j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ut0() {
        C0791u5 c0791u5 = new C0791u5();
        c0791u5.f6135b = new long[192];
        c0791u5.f6136c = new long[192];
        this.f6297a = c0791u5;
        this.f6298b = new e81();
        this.f6299c = new dh0();
        this.f6304h = -1L;
        this.f6305i = new C0310i7(8, this);
        this.f6306j = new ih0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m4345c(qj0 qj0Var) {
        cn0 cn0Var = qj0Var.f5179O;
        return (cn0Var == null || w60.m4919z(((C0942xx) cn0Var).m5172b())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static long m4346g(b60 b60Var) {
        mj0 mj0Var = b60Var.f395I;
        qj0 qj0Var = mj0Var.f3996d;
        long jM4835c = 0;
        for (qj0 qj0Var2 = mj0Var.f3995c; qj0Var2 != null && qj0Var2 != qj0Var; qj0Var2 = qj0Var2.f5182t) {
            if (m4345c(qj0Var2)) {
                return 9223372034707292159L;
            }
            jM4835c = w20.m4835c(jM4835c, qj0Var2.f5167C);
        }
        return jM4835c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m4347i(b60 b60Var) {
        if (!b60Var.f407f || m4345c(b60Var.f395I.f3996d)) {
            return;
        }
        b60Var.f407f = false;
        if (b60Var.f411j) {
            b60Var.f410i = m4346g(b60Var);
            b60Var.f411j = false;
        }
        if (w20.m4833a(b60Var.f410i, 9223372034707292159L)) {
            return;
        }
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            m4347i((b60) objArr[i2]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4348a() {
        boolean z;
        long j;
        C0791u5 c0791u5;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        RunnableC0824v1 runnableC0824v1 = this.f6303g;
        if (runnableC0824v1 != null) {
            AbstractC0873w1.f6892a.removeCallbacks(runnableC0824v1);
            this.f6303g = null;
        }
        Handler handler = AbstractC0873w1.f6892a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f6300d;
        boolean z3 = z2 || this.f6301e;
        C0791u5 c0791u52 = this.f6297a;
        boolean z4 = true;
        e81 e81Var = this.f6298b;
        if (z2) {
            this.f6300d = false;
            dh0 dh0Var = this.f6299c;
            Object[] objArr = dh0Var.f1108a;
            int i3 = dh0Var.f1109b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((InterfaceC0298hw) objArr[i4]).invoke();
            }
            long[] jArr2 = (long[]) c0791u52.f6135b;
            int i5 = c0791u52.f6134a;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    d81 d81Var = (d81) e81Var.f1343a.m4248b(((int) j6) & 33554431);
                    while (d81Var != null) {
                        d81 d81Var2 = d81Var.f998d;
                        boolean z6 = z3;
                        long j9 = d81Var.f1001g;
                        boolean z7 = (jCurrentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        d81Var.f999e = j7;
                        d81Var.f1000f = j8;
                        if (z7) {
                            d81Var.f1001g = jCurrentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            d81Var.m661a(j4, j5, e81Var.f1346d, e81Var.f1347e, e81Var.f1349g);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        d81Var = d81Var2;
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
            long[] jArr3 = (long[]) c0791u52.f6135b;
            int i8 = c0791u52.f6134a;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f6301e) {
            this.f6301e = false;
            long j10 = e81Var.f1346d;
            long j11 = e81Var.f1347e;
            float[] fArr = e81Var.f1349g;
            ug0 ug0Var = e81Var.f1343a;
            j2 = 128;
            Object[] objArr2 = ug0Var.f6113c;
            long[] jArr4 = ug0Var.f6111a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    c0791u5 = c0791u52;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                d81 d81Var3 = (d81) objArr2[(i11 << 3) + i15];
                                while (d81Var3 != null) {
                                    e81Var.m801a(d81Var3, j12, j11, fArr, jCurrentTimeMillis);
                                    d81Var3 = d81Var3.f998d;
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
                    c0791u52 = c0791u5;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = e81Var.f1346d;
                    long j16 = e81Var.f1347e;
                    float[] fArr2 = e81Var.f1349g;
                    d81 d81Var4 = e81Var.f1344b;
                    if (d81Var4 != null) {
                        while (d81Var4 != null) {
                            b60 b60VarM3039Q = pf1.m3039Q(d81Var4.f996b);
                            long jM4349b = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60VarM3039Q)).getRectManager().m4349b(b60VarM3039Q);
                            long j17 = b60VarM3039Q.f409h;
                            d81Var4.f999e = jM4349b;
                            d81Var4.f1000f = (((long) (((int) (jM4349b & 4294967295L)) + ((int) (j17 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jM4349b >> 32)) + ((int) (j17 >> 32)))) << 32);
                            e81Var.m801a(d81Var4, j15, j16, fArr2, jCurrentTimeMillis);
                            d81Var4 = d81Var4.f998d;
                        }
                    }
                }
                if (this.f6302f) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.f6302f = false;
                    C0791u5 c0791u53 = c0791u5;
                    long[] jArr6 = (long[]) c0791u53.f6135b;
                    int i17 = c0791u53.f6134a;
                    long[] jArr7 = (long[]) c0791u53.f6136c;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != tt0.f6042a) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    c0791u53.f6134a = i18;
                    c0791u53.f6135b = jArr7;
                    c0791u53.f6136c = jArr6;
                }
                if (e81Var.f1345c <= jCurrentTimeMillis) {
                    ug0 ug0Var2 = e81Var.f1343a;
                    Object[] objArr3 = ug0Var2.f6113c;
                    long[] jArr8 = ug0Var2.f6111a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j18 = jArr8[i21];
                            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j19 = j18;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j19 & j3) < j2) {
                                        for (d81 d81Var5 = (d81) objArr3[(i21 << 3) + i23]; d81Var5 != null; d81Var5 = d81Var5.f998d) {
                                        }
                                    }
                                    j19 >>= i;
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
                    d81 d81Var6 = e81Var.f1344b;
                    if (d81Var6 != null) {
                        while (d81Var6 != null) {
                            d81Var6 = d81Var6.f998d;
                        }
                    }
                    e81Var.f1345c = -1L;
                }
                if (e81Var.f1345c <= j) {
                    m4354j();
                    return;
                }
                return;
            }
            c0791u5 = c0791u52;
            i = 8;
        } else {
            c0791u5 = c0791u52;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.f6302f) {
        }
        if (e81Var.f1345c <= jCurrentTimeMillis) {
        }
        if (e81Var.f1345c <= j) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m4349b(b60 b60Var) {
        long j;
        int i = b60Var.f406e & 33554431;
        C0791u5 c0791u5 = this.f6297a;
        long[] jArr = (long[]) c0791u5.f6135b;
        int i2 = c0791u5.f6134a;
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
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4350d(b60 b60Var) {
        char c;
        boolean z;
        boolean z2 = true;
        b60Var.f407f = true;
        b60Var.f408g = 9223372034707292159L;
        mj0 mj0Var = b60Var.f395I;
        qj0 qj0Var = mj0Var.f3996d;
        wd0 wd0Var = b60Var.f396J.f1607p;
        int iMo5002U = wd0Var.mo5002U();
        float fMo5001S = wd0Var.mo5001S();
        ih0 ih0Var = this.f6306j;
        ih0Var.f2568a = 0.0f;
        ih0Var.f2569b = 0.0f;
        ih0Var.f2570c = iMo5002U;
        ih0Var.f2571d = fMo5001S;
        while (true) {
            c = ' ';
            if (qj0Var == null) {
                break;
            }
            b60 b60Var2 = qj0Var.f5180r;
            if (qj0Var == b60Var2.f395I.f3996d && !b60Var2.f407f) {
                if (!w20.m4833a(m4349b(b60Var2), 9223372034707292159L)) {
                    ih0Var.m1581c((((long) Float.floatToRawIntBits((int) (r11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (r11 >> 32))) << 32));
                    break;
                }
            }
            cn0 cn0Var = qj0Var.f5179O;
            if (cn0Var != null) {
                float[] fArrM5172b = ((C0942xx) cn0Var).m5172b();
                if (!w60.m4919z(fArrM5172b)) {
                    r60.m3418t(fArrM5172b, ih0Var);
                }
            }
            long j = qj0Var.f5167C;
            ih0Var.m1581c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            qj0Var = qj0Var.f5182t;
        }
        int i = (int) ih0Var.f2568a;
        int i2 = (int) ih0Var.f2569b;
        int i3 = (int) ih0Var.f2570c;
        int i4 = (int) ih0Var.f2571d;
        int i5 = b60Var.f406e;
        boolean z3 = b60Var.f412k;
        b60Var.f412k = true;
        C0791u5 c0791u5 = this.f6297a;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) c0791u5.f6135b;
            int i7 = c0791u5.f6134a;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                char c2 = c;
                C0791u5 c0791u52 = c0791u5;
                long j2 = jArr[i9];
                z = z2;
                if ((((int) j2) & 33554431) == i6) {
                    jArr[i8] = (((long) i) << c2) | (((long) i2) & 4294967295L);
                    jArr[i8 + 1] = (((long) i4) & 4294967295L) | (((long) i3) << c2);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                } else {
                    i8 += 3;
                    c = c2;
                    c0791u5 = c0791u52;
                    z2 = z;
                }
            }
            z = z2;
            C0791u5 c0791u53 = c0791u5;
            b60 b60VarM315v = b60Var.m315v();
            c0791u53.m4253d(i5, i, i2, i3, i4, (512 & 32) != 0 ? -1 : b60VarM315v == null ? b60VarM315v.f406e : -1, mj0Var.m2600d(1024), mj0Var.m2600d(16), this.f6298b.f1343a.m4247a(i5), -1);
        } else {
            z = z2;
            C0791u5 c0791u532 = c0791u5;
            b60 b60VarM315v2 = b60Var.m315v();
            c0791u532.m4253d(i5, i, i2, i3, i4, (512 & 32) != 0 ? -1 : b60VarM315v2 == null ? b60VarM315v2.f406e : -1, mj0Var.m2600d(1024), mj0Var.m2600d(16), this.f6298b.f1343a.m4247a(i5), -1);
        }
        this.f6300d = z;
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i10 = sh0VarM319z.f5770f;
        for (int i11 = 0; i11 < i10; i11++) {
            b60 b60Var3 = (b60) objArr[i11];
            if (b60Var3.m273I()) {
                m4350d(b60Var3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4351e(b60 b60Var) {
        if (b60Var.f412k) {
            this.f6300d = true;
            int i = b60Var.f406e & 33554431;
            C0791u5 c0791u5 = this.f6297a;
            long[] jArr = (long[]) c0791u5.f6135b;
            int i2 = c0791u5.f6134a;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                long j = jArr[i4];
                if ((((int) j) & 33554431) == i) {
                    jArr[i4] = (((j >> 63) & 1) << 60) | j;
                    break;
                }
                i3 += 3;
            }
        }
        m4354j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
    
        r33 = r5;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4352f(b60 b60Var, boolean z) {
        long j;
        long j2;
        int i;
        int i2;
        long[] jArr;
        int i3;
        int i4;
        boolean zM273I = b60Var.m273I();
        mj0 mj0Var = b60Var.f395I;
        if (zM273I) {
            b60 b60VarM315v = b60Var.m315v();
            if (b60VarM315v == null || b60VarM315v.f407f) {
                j = b60VarM315v == null ? 0L : 9223372034707292159L;
            } else {
                if (b60VarM315v.f411j) {
                    b60VarM315v.f411j = false;
                    b60VarM315v.f410i = m4346g(b60VarM315v);
                }
                j = b60VarM315v.f410i;
            }
            qj0 qj0Var = mj0Var.f3996d;
            if (w20.m4833a(j, 9223372034707292159L) || m4345c(qj0Var)) {
                m4350d(b60Var);
                return;
            }
            if (b60Var.f407f) {
                m4350d(b60Var);
                m4347i(b60Var);
                return;
            }
            long jM4835c = w20.m4835c(j, qj0Var.f5167C);
            wd0 wd0Var = b60Var.f396J.f1607p;
            int iMo5002U = wd0Var.mo5002U();
            int iMo5001S = wd0Var.mo5001S();
            long j3 = (((long) iMo5002U) << 32) | (((long) iMo5001S) & 4294967295L);
            int i5 = b60Var.f406e;
            boolean z2 = b60Var.f412k;
            C0791u5 c0791u5 = this.f6297a;
            if (!z2) {
                j2 = jM4835c;
                b60Var.f412k = true;
                boolean zM2600d = mj0Var.m2600d(1024);
                boolean zM2600d2 = mj0Var.m2600d(16);
                boolean zM4247a = this.f6298b.f1343a.m4247a(i5);
                if (b60VarM315v != null) {
                    int i6 = b60VarM315v.f406e;
                    int i7 = (int) (j2 >> 32);
                    int i8 = (int) (j2 & 4294967295L);
                    int i9 = i5 & 33554431;
                    long[] jArr2 = (long[]) c0791u5.f6135b;
                    int i10 = c0791u5.f6134a;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= jArr2.length - 2 || i11 >= i10) {
                            break;
                        }
                        if ((((int) jArr2[i11 + 2]) & 33554431) == i6) {
                            long j4 = jArr2[i11];
                            int i12 = ((int) (j4 >> 32)) + i7;
                            int i13 = ((int) j4) + i8;
                            c0791u5.m4253d(i9, i12, i13, i12 + iMo5002U, i13 + iMo5001S, i6, zM2600d, zM2600d2, zM4247a, i11);
                            break;
                        }
                        i11 += 3;
                    }
                } else {
                    int i14 = (int) (j2 >> 32);
                    int i15 = (int) (j2 & 4294967295L);
                    c0791u5.m4253d(i5, i14, i15, i14 + iMo5002U, i15 + iMo5001S, (512 & 32) != 0 ? -1 : 0, zM2600d, zM2600d2, zM4247a, -1);
                }
                this.f6300d = true;
            } else if (!z && w20.m4833a(jM4835c, b60Var.f408g) && d30.m628a(j3, b60Var.f409h)) {
                j2 = jM4835c;
            } else {
                if (b60VarM315v != null) {
                    int i16 = b60VarM315v.f406e;
                    int i17 = (int) (jM4835c >> 32);
                    j2 = jM4835c;
                    int i18 = (int) (j2 & 4294967295L);
                    int i19 = i5 & 33554431;
                    long[] jArr3 = (long[]) c0791u5.f6135b;
                    int i20 = c0791u5.f6134a;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= jArr3.length - 2 || i21 >= i20) {
                            break;
                        }
                        int i22 = i20;
                        if ((((int) jArr3[i21 + 2]) & 33554431) == i16) {
                            long j5 = jArr3[i21];
                            i = i16;
                            i2 = i18;
                            int i23 = ((int) (j5 >> 32)) + i17;
                            int i24 = ((int) j5) + i2;
                            int i25 = i23 + iMo5002U;
                            int i26 = i24 + iMo5001S;
                            i21 += 3;
                            i3 = iMo5001S;
                            while (true) {
                                if (i21 >= jArr3.length - 2) {
                                    i4 = i22;
                                    break;
                                }
                                int i27 = i22;
                                if (i21 >= i27) {
                                    i4 = i27;
                                    break;
                                }
                                int i28 = i21 + 2;
                                int i29 = iMo5002U;
                                long j6 = jArr3[i28];
                                long[] jArr4 = jArr3;
                                if ((((int) j6) & 33554431) == i19) {
                                    long j7 = jArr4[i21];
                                    int i30 = i23 - ((int) (j7 >> 32));
                                    int i31 = i24 - ((int) j7);
                                    jArr4[i21] = (((long) i24) & 4294967295L) | (((long) i23) << 32);
                                    jArr4[i21 + 1] = (((long) i25) << 32) | (((long) i26) & 4294967295L);
                                    jArr4[i28] = j6 | (((j6 >> 63) & 1) << 60);
                                    if (i30 != 0 || i31 != 0) {
                                        int i32 = tt0.f6043b;
                                        c0791u5.m4255g((j6 & (-1125899873288193L)) | (((long) ((i21 + 3) & 33554431)) << 25), i30, i31);
                                    }
                                } else {
                                    i21 += 3;
                                    iMo5002U = i29;
                                    i22 = i27;
                                    jArr3 = jArr4;
                                }
                            }
                        } else {
                            i = i16;
                            i2 = i18;
                            jArr = jArr3;
                            i3 = iMo5001S;
                            i4 = i22;
                        }
                        i21 += 3;
                        i16 = i;
                        iMo5002U = iMo5002U;
                        i18 = i2;
                        iMo5001S = i3;
                        i20 = i4;
                        jArr3 = jArr;
                    }
                } else {
                    j2 = jM4835c;
                    int i33 = (int) (j2 >> 32);
                    int i34 = (int) (j2 & 4294967295L);
                    int i35 = i33 + iMo5002U;
                    int i36 = i34 + iMo5001S;
                    int i37 = i5 & 33554431;
                    long[] jArr5 = (long[]) c0791u5.f6135b;
                    int i38 = c0791u5.f6134a;
                    int i39 = 0;
                    while (true) {
                        if (i39 >= jArr5.length - 2 || i39 >= i38) {
                            break;
                        }
                        int i40 = i39 + 2;
                        long j8 = jArr5[i40];
                        long[] jArr6 = jArr5;
                        if ((((int) j8) & 33554431) == i37) {
                            long j9 = jArr6[i39];
                            int i41 = i39;
                            jArr6[i41] = (((long) i33) << 32) | (((long) i34) & 4294967295L);
                            jArr6[i41 + 1] = (((long) i35) << 32) | (((long) i36) & 4294967295L);
                            jArr6[i40] = (((j8 >> 63) & 1) << 60) | j8;
                            int i42 = i33 - ((int) (j9 >> 32));
                            int i43 = i34 - ((int) j9);
                            if ((i42 != 0) | (i43 != 0)) {
                                int i44 = tt0.f6043b;
                                c0791u5.m4255g((j8 & (-1125899873288193L)) | (((long) ((i41 + 3) & 33554431)) << 25), i42, i43);
                            }
                        } else {
                            i39 += 3;
                            jArr5 = jArr6;
                        }
                    }
                }
                this.f6300d = true;
            }
            b60Var.f409h = j3;
            b60Var.f408g = j2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4353h(b60 b60Var) {
        if (b60Var.f412k) {
            int i = b60Var.f406e & 33554431;
            C0791u5 c0791u5 = this.f6297a;
            long[] jArr = (long[]) c0791u5.f6135b;
            int i2 = c0791u5.f6134a;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = tt0.f6042a;
                    break;
                }
                i3 += 3;
            }
            b60Var.f412k = false;
            this.f6300d = true;
            this.f6302f = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4354j() {
        RunnableC0824v1 runnableC0824v1 = this.f6303g;
        boolean z = runnableC0824v1 != null;
        long j = this.f6298b.f1345c;
        if (j >= 0 || !z) {
            if (this.f6304h == j && z) {
                return;
            }
            if (runnableC0824v1 != null) {
                Handler handler = AbstractC0873w1.f6892a;
                AbstractC0873w1.f6892a.removeCallbacks(runnableC0824v1);
            }
            Handler handler2 = AbstractC0873w1.f6892a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f6304h = jMax;
            RunnableC0824v1 runnableC0824v12 = new RunnableC0824v1(0, this.f6305i);
            AbstractC0873w1.f6892a.postDelayed(runnableC0824v12, jMax - jCurrentTimeMillis);
            this.f6303g = runnableC0824v12;
        }
    }
}
