package p082Q0;

import android.os.Handler;
import p001A0.C0102b;
import p028F.RunnableC0342c;
import p041H0.AbstractC0567L;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0580Z;
import p041H0.C0590e0;
import p041H0.InterfaceC0612p0;
import p047I0.C0769w0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p049I2.C0793k;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p153e1.C2014j;
import p153e1.C2016l;
import p169h0.AbstractC2193b;
import p186k.C2404A;
import p186k.C2439u;
import p204n0.C2682a;
import p211o0.AbstractC2767z;
import p211o0.C2730E;

/* JADX INFO: renamed from: Q0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1168b {

    /* JADX INFO: renamed from: a */
    public final C0793k f3820a;

    /* JADX INFO: renamed from: b */
    public final C1171e f3821b;

    /* JADX INFO: renamed from: c */
    public final C2404A f3822c;

    /* JADX INFO: renamed from: d */
    public boolean f3823d;

    /* JADX INFO: renamed from: e */
    public boolean f3824e;

    /* JADX INFO: renamed from: f */
    public boolean f3825f;

    /* JADX INFO: renamed from: g */
    public RunnableC0342c f3826g;

    /* JADX INFO: renamed from: h */
    public long f3827h;

    /* JADX INFO: renamed from: i */
    public final C0102b f3828i;

    /* JADX INFO: renamed from: j */
    public final C2682a f3829j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1168b() {
        C0793k c0793k = new C0793k((byte) 0, 2);
        c0793k.f2538f = new long[192];
        c0793k.f2539g = new long[192];
        this.f3820a = c0793k;
        this.f3821b = new C1171e();
        this.f3822c = new C2404A();
        this.f3827h = -1L;
        this.f3828i = new C0102b(8, this);
        this.f3829j = new C2682a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static long m2205f(C0564I c0564i) {
        C0590e0 c0590e0 = c0564i.f1699J;
        AbstractC0596h0 abstractC0596h0 = c0590e0.f1894d;
        long jM3702c = 0;
        for (AbstractC0596h0 abstractC0596h02 = c0590e0.f1893c; abstractC0596h02 != null && abstractC0596h02 != abstractC0596h0; abstractC0596h02 = abstractC0596h02.f1934t) {
            InterfaceC0612p0 interfaceC0612p0 = abstractC0596h02.f1931O;
            if (interfaceC0612p0 != null && !AbstractC2767z.m4944o(((C0769w0) interfaceC0612p0).m1280b())) {
                return 9223372034707292159L;
            }
            jM3702c = C2014j.m3702c(jM3702c, abstractC0596h02.f1919C);
        }
        return jM3702c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m2206h(C0564I c0564i) {
        if (c0564i.f1713f) {
            InterfaceC0612p0 interfaceC0612p0 = c0564i.f1699J.f1894d.f1931O;
            if (interfaceC0612p0 == null || AbstractC2767z.m4944o(((C0769w0) interfaceC0612p0).m1280b())) {
                c0564i.f1713f = false;
                if (c0564i.f1717j) {
                    c0564i.f1716i = m2205f(c0564i);
                    c0564i.f1717j = false;
                }
                if (C2014j.m3700a(c0564i.f1716i, 9223372034707292159L)) {
                    return;
                }
                C1483e c1483eM843y = c0564i.m843y();
                Object[] objArr = c1483eM843y.f5181d;
                int i5 = c1483eM843y.f5183f;
                for (int i6 = 0; i6 < i5; i6++) {
                    m2206h((C0564I) objArr[i6]);
                }
            }
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
    public final void m2207a() {
        boolean z5;
        long j5;
        C0793k c0793k;
        int i5;
        long j6;
        long j7;
        int i6;
        long[] jArr;
        long j8;
        long j9;
        RunnableC0342c runnableC0342c = this.f3826g;
        if (runnableC0342c != null) {
            AbstractC2193b.f7159a.removeCallbacks(runnableC0342c);
            this.f3826g = null;
        }
        Handler handler = AbstractC2193b.f7159a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z6 = this.f3823d;
        boolean z7 = z6 || this.f3824e;
        C0793k c0793k2 = this.f3820a;
        boolean z8 = true;
        C1171e c1171e = this.f3821b;
        if (z6) {
            this.f3823d = false;
            C2404A c2404a = this.f3822c;
            Object[] objArr = c2404a.f7766a;
            int i7 = c2404a.f7767b;
            for (int i8 = 0; i8 < i7; i8++) {
                ((InterfaceC1599a) objArr[i8]).mo6a();
            }
            long[] jArr2 = (long[]) c0793k2.f2538f;
            int i9 = c0793k2.f2537e;
            int i10 = 0;
            while (i10 < jArr2.length - 2 && i10 < i9) {
                long j10 = jArr2[i10 + 2];
                boolean z9 = z8;
                int i11 = i9;
                if ((((int) (j10 >> 60)) & 1) != 0) {
                    long j11 = jArr2[i10];
                    long j12 = jArr2[i10 + 1];
                    C1170d c1170d = (C1170d) c1171e.f3845a.m4318b(((int) j10) & 33554431);
                    while (c1170d != null) {
                        C1170d c1170d2 = c1170d.f3840d;
                        boolean z10 = z7;
                        long j13 = c1170d.f3843g;
                        boolean z11 = (jCurrentTimeMillis - j13 >= 0 || j13 == Long.MIN_VALUE) ? z9 : false;
                        c1170d.f3841e = j11;
                        c1170d.f3842f = j12;
                        if (z11) {
                            c1170d.f3843g = jCurrentTimeMillis;
                            j8 = j11;
                            j9 = j12;
                            c1170d.m2214a(j8, j9, c1171e.f3848d, c1171e.f3849e, c1171e.f3851g);
                        } else {
                            j8 = j11;
                            j9 = j12;
                        }
                        c1170d = c1170d2;
                        j11 = j8;
                        j12 = j9;
                        z7 = z10;
                    }
                }
                i10 += 3;
                z8 = z9;
                i9 = i11;
                z7 = z7;
            }
            z5 = z7;
            j5 = 0;
            long[] jArr3 = (long[]) c0793k2.f2538f;
            int i12 = c0793k2.f2537e;
            for (int i13 = 0; i13 < jArr3.length - 2 && i13 < i12; i13 += 3) {
                int i14 = i13 + 2;
                jArr3[i14] = jArr3[i14] & (-1152921504606846977L);
            }
        } else {
            z5 = z7;
            j5 = 0;
        }
        if (this.f3824e) {
            this.f3824e = false;
            long j14 = c1171e.f3848d;
            long j15 = c1171e.f3849e;
            float[] fArr = c1171e.f3851g;
            C2439u c2439u = c1171e.f3845a;
            j6 = 128;
            Object[] objArr2 = c2439u.f7847c;
            long[] jArr4 = c2439u.f7845a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i15 = 0;
                int i16 = 8;
                j7 = 255;
                while (true) {
                    long j16 = j14;
                    long j17 = jArr4[i15];
                    int i17 = i16;
                    c0793k = c0793k2;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i15 - length)) >>> 31);
                        long j18 = j17;
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j18 & 255) < 128) {
                                C1170d c1170d3 = (C1170d) objArr2[(i15 << 3) + i19];
                                while (c1170d3 != null) {
                                    c1171e.m2216a(c1170d3, j16, j15, fArr, jCurrentTimeMillis);
                                    c1170d3 = c1170d3.f3840d;
                                    i17 = i17;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i20 = i17;
                            j18 >>= i20;
                            i19++;
                            j16 = j16;
                            i17 = i20;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i5 = i17;
                        j14 = j16;
                        if (i18 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i5 = i17;
                        j14 = j16;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    i16 = i5;
                    c0793k2 = c0793k;
                    jArr4 = jArr;
                }
                if (z5) {
                    long j19 = c1171e.f3848d;
                    long j20 = c1171e.f3849e;
                    float[] fArr2 = c1171e.f3851g;
                    C1170d c1170d4 = c1171e.f3846b;
                    if (c1170d4 != null) {
                        while (c1170d4 != null) {
                            C0564I c0564iM1044t = AbstractC0601k.m1044t(c1170d4.f3838b);
                            long jM2208b = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564iM1044t)).getRectManager().m2208b(c0564iM1044t);
                            long j21 = c0564iM1044t.f1715h;
                            c1170d4.f3841e = jM2208b;
                            c1170d4.f3842f = (((long) (((int) (jM2208b & 4294967295L)) + ((int) (j21 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jM2208b >> 32)) + ((int) (j21 >> 32)))) << 32);
                            c1171e.m2216a(c1170d4, j19, j20, fArr2, jCurrentTimeMillis);
                            c1170d4 = c1170d4.f3840d;
                        }
                    }
                }
                if (this.f3825f) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    this.f3825f = false;
                    C0793k c0793k3 = c0793k;
                    long[] jArr6 = (long[]) c0793k3.f2538f;
                    int i21 = c0793k3.f2537e;
                    long[] jArr7 = (long[]) c0793k3.f2539g;
                    int i22 = 0;
                    for (int i23 = 0; i23 < jArr6.length - 2 && i22 < jArr7.length - 2 && i23 < i21; i23 += 3) {
                        int i24 = i23 + 2;
                        if (jArr6[i24] != AbstractC1167a.f3819c) {
                            jArr7[i22] = jArr6[i23];
                            jArr7[i22 + 1] = jArr6[i23 + 1];
                            jArr7[i22 + 2] = jArr6[i24];
                            i22 += 3;
                        }
                    }
                    c0793k3.f2537e = i22;
                    c0793k3.f2538f = jArr7;
                    c0793k3.f2539g = jArr6;
                }
                if (c1171e.f3847c <= jCurrentTimeMillis) {
                    C2439u c2439u2 = c1171e.f3845a;
                    Object[] objArr3 = c2439u2.f7847c;
                    long[] jArr8 = c2439u2.f7845a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i25 = i6;
                        while (true) {
                            long j22 = jArr8[i25];
                            if ((((~j22) << 7) & j22 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i26 = 8 - ((~(i25 - length2)) >>> 31);
                                long j23 = j22;
                                for (int i27 = i6; i27 < i26; i27++) {
                                    if ((j23 & j7) < j6) {
                                        for (C1170d c1170d5 = (C1170d) objArr3[(i25 << 3) + i27]; c1170d5 != null; c1170d5 = c1170d5.f3840d) {
                                        }
                                    }
                                    j23 >>= i5;
                                }
                                if (i26 != i5) {
                                    break;
                                } else if (i25 == length2) {
                                    break;
                                } else {
                                    i25++;
                                }
                            }
                        }
                    }
                    C1170d c1170d6 = c1171e.f3846b;
                    if (c1170d6 != null) {
                        while (c1170d6 != null) {
                            c1170d6 = c1170d6.f3840d;
                        }
                    }
                    c1171e.f3847c = -1L;
                }
                if (c1171e.f3847c <= j5) {
                    m2213i();
                    return;
                }
                return;
            }
            c0793k = c0793k2;
            i5 = 8;
        } else {
            c0793k = c0793k2;
            i5 = 8;
            j6 = 128;
        }
        j7 = 255;
        if (z5) {
        }
        if (this.f3825f) {
        }
        if (c1171e.f3847c <= jCurrentTimeMillis) {
        }
        if (c1171e.f3847c <= j5) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m2208b(C0564I c0564i) {
        long j5;
        int i5 = c0564i.f1712e & 33554431;
        C0793k c0793k = this.f3820a;
        long[] jArr = (long[]) c0793k.f2538f;
        int i6 = c0793k.f2537e;
        for (int i7 = 0; i7 < jArr.length - 2 && i7 < i6; i7 += 3) {
            if ((((int) jArr[i7 + 2]) & 33554431) == i5) {
                j5 = jArr[i7];
                break;
            }
        }
        j5 = Long.MAX_VALUE;
        if (j5 == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) (j5 >> 32))) << 32) | (((long) ((int) j5)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2209c(C0564I c0564i) {
        char c5;
        boolean z5;
        boolean z6 = true;
        c0564i.f1713f = true;
        c0564i.f1714g = 9223372034707292159L;
        C0590e0 c0590e0 = c0564i.f1699J;
        AbstractC0596h0 abstractC0596h0 = c0590e0.f1894d;
        C0580Z c0580z = c0564i.f1700K.f1760p;
        int iMo664g0 = c0580z.mo664g0();
        float fMo663d0 = c0580z.mo663d0();
        C2682a c2682a = this.f3829j;
        c2682a.f8552a = 0.0f;
        c2682a.f8553b = 0.0f;
        c2682a.f8554c = iMo664g0;
        c2682a.f8555d = fMo663d0;
        while (true) {
            c5 = ' ';
            if (abstractC0596h0 == null) {
                break;
            }
            C0564I c0564i2 = abstractC0596h0.f1932r;
            if (abstractC0596h0 == c0564i2.f1699J.f1894d && !c0564i2.f1713f) {
                if (!C2014j.m3700a(m2208b(c0564i2), 9223372034707292159L)) {
                    c2682a.m4642c((((long) Float.floatToRawIntBits((int) (r11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (r11 >> 32))) << 32));
                    break;
                }
            }
            InterfaceC0612p0 interfaceC0612p0 = abstractC0596h0.f1931O;
            if (interfaceC0612p0 != null) {
                float[] fArrM1280b = ((C0769w0) interfaceC0612p0).m1280b();
                if (!AbstractC2767z.m4944o(fArrM1280b)) {
                    C2730E.m4784c(fArrM1280b, c2682a);
                }
            }
            long j5 = abstractC0596h0.f1919C;
            c2682a.m4642c((4294967295L & ((long) Float.floatToRawIntBits((int) (j5 & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j5 >> 32))) << 32));
            abstractC0596h0 = abstractC0596h0.f1934t;
        }
        int i5 = (int) c2682a.f8552a;
        int i6 = (int) c2682a.f8553b;
        int i7 = (int) c2682a.f8554c;
        int i8 = (int) c2682a.f8555d;
        int i9 = c0564i.f1712e;
        boolean z7 = c0564i.f1718k;
        c0564i.f1718k = true;
        C0793k c0793k = this.f3820a;
        if (z7) {
            int i10 = i9 & 33554431;
            long[] jArr = (long[]) c0793k.f2538f;
            int i11 = c0793k.f2537e;
            int i12 = 0;
            while (i12 < jArr.length - 2 && i12 < i11) {
                int i13 = i12 + 2;
                char c6 = c5;
                C0793k c0793k2 = c0793k;
                long j6 = jArr[i13];
                z5 = z6;
                if ((((int) j6) & 33554431) == i10) {
                    jArr[i12] = (((long) i5) << c6) | (((long) i6) & 4294967295L);
                    jArr[i12 + 1] = (((long) i8) & 4294967295L) | (((long) i7) << c6);
                    jArr[i13] = (((j6 >> 63) & 1) << 60) | j6;
                    break;
                } else {
                    i12 += 3;
                    c5 = c6;
                    c0793k = c0793k2;
                    z6 = z5;
                }
            }
            z5 = z6;
            C0793k c0793k3 = c0793k;
            C0564I c0564iM839u = c0564i.m839u();
            c0793k3.m1348m(i9, i5, i6, i7, i8, (512 & 32) != 0 ? -1 : c0564iM839u == null ? c0564iM839u.f1712e : -1, c0590e0.m962d(1024), c0590e0.m962d(16), this.f3821b.f3845a.m4317a(i9), -1);
        } else {
            z5 = z6;
            C0793k c0793k32 = c0793k;
            C0564I c0564iM839u2 = c0564i.m839u();
            c0793k32.m1348m(i9, i5, i6, i7, i8, (512 & 32) != 0 ? -1 : c0564iM839u2 == null ? c0564iM839u2.f1712e : -1, c0590e0.m962d(1024), c0590e0.m962d(16), this.f3821b.f3845a.m4317a(i9), -1);
        }
        this.f3823d = z5;
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i14 = c1483eM843y.f5183f;
        for (int i15 = 0; i15 < i14; i15++) {
            C0564I c0564i3 = (C0564I) objArr[i15];
            if (c0564i3.m801I()) {
                m2209c(c0564i3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2210d(C0564I c0564i) {
        if (c0564i.f1718k) {
            this.f3823d = true;
            int i5 = c0564i.f1712e & 33554431;
            C0793k c0793k = this.f3820a;
            long[] jArr = (long[]) c0793k.f2538f;
            int i6 = c0793k.f2537e;
            int i7 = 0;
            while (true) {
                if (i7 >= jArr.length - 2 || i7 >= i6) {
                    break;
                }
                int i8 = i7 + 2;
                long j5 = jArr[i8];
                if ((((int) j5) & 33554431) == i5) {
                    jArr[i8] = (((j5 >> 63) & 1) << 60) | j5;
                    break;
                }
                i7 += 3;
            }
        }
        m2213i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2211e(C0564I c0564i, boolean z5) {
        long j5;
        InterfaceC0612p0 interfaceC0612p0;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean zM801I = c0564i.m801I();
        C0590e0 c0590e0 = c0564i.f1699J;
        if (zM801I) {
            C0564I c0564iM839u = c0564i.m839u();
            if (c0564iM839u == null || c0564iM839u.f1713f) {
                j5 = c0564iM839u == null ? 0L : 9223372034707292159L;
            } else {
                if (c0564iM839u.f1717j) {
                    c0564iM839u.f1717j = false;
                    c0564iM839u.f1716i = m2205f(c0564iM839u);
                }
                j5 = c0564iM839u.f1716i;
            }
            AbstractC0596h0 abstractC0596h0 = c0590e0.f1894d;
            if (C2014j.m3700a(j5, 9223372034707292159L) || !((interfaceC0612p0 = abstractC0596h0.f1931O) == null || AbstractC2767z.m4944o(((C0769w0) interfaceC0612p0).m1280b()))) {
                m2209c(c0564i);
                return;
            }
            if (c0564i.f1713f) {
                m2209c(c0564i);
                m2206h(c0564i);
                return;
            }
            long jM3702c = C2014j.m3702c(j5, abstractC0596h0.f1919C);
            C0580Z c0580z = c0564i.f1700K.f1760p;
            int iMo664g0 = c0580z.mo664g0();
            int iMo663d0 = c0580z.mo663d0();
            long j6 = (((long) iMo664g0) << 32) | (((long) iMo663d0) & 4294967295L);
            int i9 = c0564i.f1712e;
            boolean z6 = c0564i.f1718k;
            int i10 = 33554431;
            C0793k c0793k = this.f3820a;
            if (!z6) {
                c0564i.f1718k = true;
                boolean zM962d = c0590e0.m962d(1024);
                boolean zM962d2 = c0590e0.m962d(16);
                boolean zM4317a = this.f3821b.f3845a.m4317a(i9);
                if (c0564iM839u != null) {
                    int i11 = c0564iM839u.f1712e;
                    int i12 = (int) (jM3702c >> 32);
                    int i13 = (int) (jM3702c & 4294967295L);
                    char c5 = ' ';
                    int i14 = i9 & 33554431;
                    long[] jArr = (long[]) c0793k.f2538f;
                    int i15 = c0793k.f2537e;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= jArr.length - 2 || i16 >= i15) {
                            break;
                        }
                        char c6 = c5;
                        long[] jArr2 = jArr;
                        if ((((int) jArr2[i16 + 2]) & i10) == i11) {
                            long j7 = jArr2[i16];
                            int i17 = ((int) (j7 >> c6)) + i12;
                            int i18 = ((int) j7) + i13;
                            c0793k.m1348m(i14, i17, i18, i17 + iMo664g0, i18 + iMo663d0, i11, zM962d, zM962d2, zM4317a, i16);
                            break;
                        }
                        i16 += 3;
                        c5 = c6;
                        jArr = jArr2;
                        i10 = i10;
                        i11 = i11;
                    }
                } else {
                    int i19 = (int) (jM3702c >> 32);
                    int i20 = (int) (jM3702c & 4294967295L);
                    c0793k.m1348m(i9, i19, i20, i19 + iMo664g0, i20 + iMo663d0, (512 & 32) != 0 ? -1 : 0, zM962d, zM962d2, zM4317a, -1);
                }
                this.f3823d = true;
            } else if (z5 || !C2014j.m3700a(jM3702c, c0564i.f1714g) || !C2016l.m3704a(j6, c0564i.f1715h)) {
                if (c0564iM839u != null) {
                    int i21 = c0564iM839u.f1712e;
                    int i22 = (int) (jM3702c >> 32);
                    int i23 = (int) (jM3702c & 4294967295L);
                    int i24 = i9 & 33554431;
                    long[] jArr3 = (long[]) c0793k.f2538f;
                    int i25 = c0793k.f2537e;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= jArr3.length - 2 || i26 >= i25) {
                            break;
                        }
                        int i27 = iMo664g0;
                        if ((((int) jArr3[i26 + 2]) & 33554431) == i21) {
                            long j8 = jArr3[i26];
                            i7 = i22;
                            i8 = i23;
                            int i28 = ((int) (j8 >> 32)) + i7;
                            int i29 = ((int) j8) + i8;
                            int i30 = i28 + i27;
                            int i31 = i29 + iMo663d0;
                            int i32 = i26 + 3;
                            i5 = i21;
                            while (i32 < jArr3.length - 2 && i32 < i25) {
                                int i33 = i32 + 2;
                                int i34 = i25;
                                long j9 = jArr3[i33];
                                int i35 = i32;
                                if ((((int) j9) & 33554431) == i24) {
                                    long j10 = jArr3[i35];
                                    int i36 = i28 - ((int) (j10 >> 32));
                                    int i37 = i29 - ((int) j10);
                                    jArr3[i35] = (((long) i28) << 32) | (((long) i29) & 4294967295L);
                                    jArr3[i35 + 1] = (((long) i30) << 32) | (((long) i31) & 4294967295L);
                                    jArr3[i33] = j9 | (((j9 >> 63) & 1) << 60);
                                    if (i36 != 0 || i37 != 0) {
                                        c0793k.m1355u(i36, i37, (j9 & AbstractC1167a.f3818b) | (((long) ((i35 + 3) & 33554431)) << 25));
                                    }
                                } else {
                                    i32 = i35 + 3;
                                    i25 = i34;
                                }
                            }
                            i6 = i25;
                            i26 = i32;
                        } else {
                            i5 = i21;
                            i6 = i25;
                            i7 = i22;
                            i8 = i23;
                        }
                        i26 += 3;
                        iMo664g0 = i27;
                        i22 = i7;
                        i23 = i8;
                        i21 = i5;
                        i25 = i6;
                    }
                } else {
                    int i38 = (int) (jM3702c >> 32);
                    int i39 = (int) (jM3702c & 4294967295L);
                    int i40 = i38 + iMo664g0;
                    int i41 = i39 + iMo663d0;
                    int i42 = i9 & 33554431;
                    long[] jArr4 = (long[]) c0793k.f2538f;
                    int i43 = c0793k.f2537e;
                    int i44 = 0;
                    while (true) {
                        if (i44 >= jArr4.length - 2 || i44 >= i43) {
                            break;
                        }
                        int i45 = i44 + 2;
                        int i46 = i43;
                        int i47 = i44;
                        long j11 = jArr4[i45];
                        long[] jArr5 = jArr4;
                        if ((((int) j11) & 33554431) == i42) {
                            long j12 = jArr5[i47];
                            jArr5[i47] = (((long) i38) << 32) | (((long) i39) & 4294967295L);
                            jArr5[i47 + 1] = (((long) i40) << 32) | (((long) i41) & 4294967295L);
                            jArr5[i45] = j11 | (((j11 >> 63) & 1) << 60);
                            int i48 = i38 - ((int) (j12 >> 32));
                            int i49 = i39 - ((int) j12);
                            if ((i48 != 0) | (i49 != 0)) {
                                c0793k.m1355u(i48, i49, (j11 & AbstractC1167a.f3818b) | (((long) ((i47 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i44 = i47 + 3;
                            i43 = i46;
                            jArr4 = jArr5;
                        }
                    }
                }
                this.f3823d = true;
            }
            c0564i.f1715h = j6;
            c0564i.f1714g = jM3702c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m2212g(C0564I c0564i) {
        if (c0564i.f1718k) {
            int i5 = c0564i.f1712e & 33554431;
            C0793k c0793k = this.f3820a;
            long[] jArr = (long[]) c0793k.f2538f;
            int i6 = c0793k.f2537e;
            int i7 = 0;
            while (true) {
                if (i7 >= jArr.length - 2 || i7 >= i6) {
                    break;
                }
                int i8 = i7 + 2;
                if ((((int) jArr[i8]) & 33554431) == i5) {
                    jArr[i7] = -1;
                    jArr[i7 + 1] = -1;
                    jArr[i8] = AbstractC1167a.f3819c;
                    break;
                }
                i7 += 3;
            }
            c0564i.f1718k = false;
            this.f3823d = true;
            this.f3825f = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m2213i() {
        RunnableC0342c runnableC0342c = this.f3826g;
        boolean z5 = runnableC0342c != null;
        long j5 = this.f3821b.f3847c;
        if (j5 >= 0 || !z5) {
            if (this.f3827h == j5 && z5) {
                return;
            }
            if (runnableC0342c != null) {
                Handler handler = AbstractC2193b.f7159a;
                AbstractC2193b.f7159a.removeCallbacks(runnableC0342c);
            }
            Handler handler2 = AbstractC2193b.f7159a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j5, ((long) 16) + jCurrentTimeMillis);
            this.f3827h = jMax;
            long j6 = jMax - jCurrentTimeMillis;
            RunnableC0342c runnableC0342c2 = new RunnableC0342c(this.f3828i, 2);
            AbstractC2193b.f7159a.postDelayed(runnableC0342c2, j6);
            this.f3826g = runnableC0342c2;
        }
    }
}
