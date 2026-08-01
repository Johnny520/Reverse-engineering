package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: yi */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0964yi implements InterfaceC0690ri {

    /* JADX INFO: renamed from: d */
    public final AbstractC0727si f7625d;

    /* JADX INFO: renamed from: e */
    public final ja1 f7626e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f7627f = new AtomicReference(null);

    /* JADX INFO: renamed from: g */
    public final Object f7628g = new Object();

    /* JADX INFO: renamed from: h */
    public final mh0 f7629h;

    /* JADX INFO: renamed from: i */
    public final w11 f7630i;

    /* JADX INFO: renamed from: j */
    public final jh0 f7631j;

    /* JADX INFO: renamed from: k */
    public final kh0 f7632k;

    /* JADX INFO: renamed from: l */
    public final kh0 f7633l;

    /* JADX INFO: renamed from: m */
    public final jh0 f7634m;

    /* JADX INFO: renamed from: n */
    public final C0351jd f7635n;

    /* JADX INFO: renamed from: o */
    public final C0351jd f7636o;

    /* JADX INFO: renamed from: p */
    public final jh0 f7637p;

    /* JADX INFO: renamed from: q */
    public jh0 f7638q;

    /* JADX INFO: renamed from: r */
    public boolean f7639r;

    /* JADX INFO: renamed from: s */
    public j11 f7640s;

    /* JADX INFO: renamed from: t */
    public yp0 f7641t;

    /* JADX INFO: renamed from: u */
    public C0964yi f7642u;

    /* JADX INFO: renamed from: v */
    public int f7643v;

    /* JADX INFO: renamed from: w */
    public final C0910x1 f7644w;

    /* JADX INFO: renamed from: x */
    public final iu0 f7645x;

    /* JADX INFO: renamed from: y */
    public final C0616pi f7646y;

    /* JADX INFO: renamed from: z */
    public int f7647z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0964yi(AbstractC0727si abstractC0727si, ja1 ja1Var) {
        this.f7625d = abstractC0727si;
        this.f7626e = ja1Var;
        mh0 mh0Var = new mh0(new kh0());
        this.f7629h = mh0Var;
        w11 w11Var = new w11();
        if (abstractC0727si.mo2711d()) {
            w11Var.f6903n = new ug0();
        }
        if (abstractC0727si.mo2713f()) {
            w11Var.m4828b();
        }
        this.f7630i = w11Var;
        this.f7631j = u50.m4265f();
        this.f7632k = new kh0();
        this.f7633l = new kh0();
        this.f7634m = u50.m4265f();
        C0351jd c0351jd = new C0351jd();
        this.f7635n = c0351jd;
        C0351jd c0351jd2 = new C0351jd();
        this.f7636o = c0351jd2;
        this.f7637p = u50.m4265f();
        this.f7638q = u50.m4265f();
        C0910x1 c0910x1 = new C0910x1(4, abstractC0727si);
        this.f7644w = c0910x1;
        this.f7645x = new iu0();
        C0616pi c0616pi = new C0616pi(ja1Var, abstractC0727si, w11Var, mh0Var, c0351jd, c0351jd2, c0910x1, this);
        abstractC0727si.mo2723p(c0616pi);
        this.f7646y = c0616pi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5258A(Object obj) {
        synchronized (this.f7628g) {
            try {
                m5281v(obj);
                Object objM1701g = this.f7634m.m1701g(obj);
                if (objM1701g != null) {
                    if (objM1701g instanceof kh0) {
                        kh0 kh0Var = (kh0) objM1701g;
                        Object[] objArr = kh0Var.f3151b;
                        long[] jArr = kh0Var.f3150a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            m5281v((C0135dn) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i == length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        m5281v((C0135dn) objM1701g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m5259B(InterfaceC0904ww interfaceC0904ww) {
        boolean zM5268i = m5268i();
        m5276q();
        AbstractC0727si abstractC0727si = this.f7625d;
        if (!zM5268i) {
            abstractC0727si.mo2708a(this, interfaceC0904ww);
            return;
        }
        C0616pi c0616pi = this.f7646y;
        c0616pi.f4905z = 100;
        c0616pi.f4904y = true;
        abstractC0727si.mo2708a(this, interfaceC0904ww);
        c0616pi.m3122s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5260a() {
        this.f7627f.set(null);
        this.f7635n.f2797a.m4089E();
        this.f7636o.f2797a.m4089E();
        mh0 mh0Var = this.f7629h;
        if (mh0Var.f3981d.m1896g()) {
            return;
        }
        iu0 iu0Var = this.f7645x;
        try {
            iu0Var.m1603g(mh0Var, this.f7646y.m3129z());
            iu0Var.m1599b();
        } finally {
            iu0Var.m1598a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5261b(Object obj, boolean z) {
        Object objM1701g = this.f7631j.m1701g(obj);
        if (objM1701g == null) {
            return;
        }
        boolean z2 = objM1701g instanceof kh0;
        y30 y30Var = y30.f7506d;
        kh0 kh0Var = this.f7632k;
        kh0 kh0Var2 = this.f7633l;
        jh0 jh0Var = this.f7637p;
        if (!z2) {
            ht0 ht0Var = (ht0) objM1701g;
            if (u50.m4281x(jh0Var, obj, ht0Var) || ht0Var.m1504b(obj) == y30Var) {
                return;
            }
            if (ht0Var.f2365g == null || z) {
                kh0Var.m1890a(ht0Var);
                return;
            } else {
                kh0Var2.m1890a(ht0Var);
                return;
            }
        }
        kh0 kh0Var3 = (kh0) objM1701g;
        Object[] objArr = kh0Var3.f3151b;
        long[] jArr = kh0Var3.f3150a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ht0 ht0Var2 = (ht0) objArr[(i << 3) + i3];
                        if (!u50.m4281x(jh0Var, obj, ht0Var2) && ht0Var2.m1504b(obj) != y30Var) {
                            if (ht0Var2.f2365g == null || z) {
                                kh0Var.m1890a(ht0Var2);
                            } else {
                                kh0Var2.m1890a(ht0Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:220:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5262c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zM1892c;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zM1896g;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z2 = set instanceof fy0;
        jh0 jh0Var = this.f7634m;
        Object obj = null;
        int i4 = 8;
        if (z2) {
            kh0 kh0Var = ((fy0) set).f1821d;
            Object[] objArr = kh0Var.f3151b;
            long[] jArr10 = kh0Var.f3150a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c2 = c3;
                                if (obj2 instanceof ht0) {
                                    ((ht0) obj2).m1504b(obj);
                                } else {
                                    m5261b(obj2, z);
                                    Object objM1701g = jh0Var.m1701g(obj2);
                                    if (objM1701g != null) {
                                        if (objM1701g instanceof kh0) {
                                            kh0 kh0Var2 = (kh0) objM1701g;
                                            Object[] objArr2 = kh0Var2.f3151b;
                                            long[] jArr11 = kh0Var2.f3150a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                m5261b((C0135dn) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            m5261b((C0135dn) objM1701g, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c2 = c3;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c3 = c2;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c3;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof ht0) {
                    ((ht0) obj3).m1504b(null);
                } else {
                    m5261b(obj3, z);
                    Object objM1701g2 = jh0Var.m1701g(obj3);
                    if (objM1701g2 != null) {
                        if (objM1701g2 instanceof kh0) {
                            kh0 kh0Var3 = (kh0) objM1701g2;
                            Object[] objArr3 = kh0Var3.f3151b;
                            long[] jArr13 = kh0Var3.f3150a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                m5261b((C0135dn) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 == 8) {
                                            i = i != length3 ? i + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            m5261b((C0135dn) objM1701g2, z);
                        }
                    }
                }
            }
        }
        jh0 jh0Var2 = this.f7631j;
        kh0 kh0Var4 = this.f7632k;
        if (z) {
            kh0 kh0Var5 = this.f7633l;
            if (kh0Var5.m1897h()) {
                long[] jArr14 = jh0Var2.f2878a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = jh0Var2.f2879b[i18];
                                    Object obj5 = jh0Var2.f2880c[i18];
                                    if (obj5 instanceof kh0) {
                                        kh0 kh0Var6 = (kh0) obj5;
                                        Object[] objArr4 = kh0Var6.f3151b;
                                        long[] jArr15 = kh0Var6.f3150a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            ht0 ht0Var = (ht0) objArr5[i22];
                                                            if (kh0Var5.m1892c(ht0Var) || kh0Var4.m1892c(ht0Var)) {
                                                                kh0Var6.m1902m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        zM1896g = kh0Var6.m1896g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        ht0 ht0Var2 = (ht0) obj5;
                                        zM1896g = kh0Var5.m1892c(ht0Var2) || kh0Var4.m1892c(ht0Var2);
                                    }
                                    if (zM1896g) {
                                        jh0Var2.m1706l(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                kh0Var5.m1891b();
                m5267h();
                return;
            }
        }
        if (kh0Var4.m1897h()) {
            long[] jArr17 = jh0Var2.f2878a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = jh0Var2.f2879b[i26];
                                Object obj7 = jh0Var2.f2880c[i26];
                                if (obj7 instanceof kh0) {
                                    kh0 kh0Var7 = (kh0) obj7;
                                    Object[] objArr6 = kh0Var7.f3151b;
                                    long[] jArr18 = kh0Var7.f3150a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (kh0Var4.m1892c((ht0) objArr7[i30])) {
                                                            kh0Var7.m1902m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    zM1892c = kh0Var7.m1896g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    zM1892c = kh0Var4.m1892c((ht0) obj7);
                                }
                                if (zM1892c) {
                                    jh0Var2.m1706l(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            m5267h();
            kh0Var4.m1891b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX INFO: renamed from: d */
    public final void m5263d() {
        synchronized (this.f7628g) {
            try {
                m5264e(this.f7635n);
                m5274o();
            } catch (Throwable th) {
                try {
                    if (!this.f7629h.f3981d.m1896g()) {
                        iu0 iu0Var = this.f7645x;
                        try {
                            iu0Var.m1603g(this.f7629h, this.f7646y.m3129z());
                            iu0Var.m1599b();
                            iu0Var.m1598a();
                        } catch (Throwable th2) {
                            iu0Var.m1598a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    m5260a();
                    throw th3;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5264e(C0351jd c0351jd) throws Throwable {
        InterfaceC0643q8 interfaceC0643q8;
        iu0 iu0Var;
        iu0 iu0Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        iu0 iu0Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zM1896g;
        long j3;
        C0351jd c0351jd2 = this.f7636o;
        C0616pi c0616pi = this.f7646y;
        C0890wi c0890wiM3129z = c0616pi.m3129z();
        iu0 iu0Var4 = this.f7645x;
        iu0Var4.m1603g(this.f7629h, c0890wiM3129z);
        try {
            if (c0351jd.f2797a.m4091G()) {
                try {
                    if (c0351jd2.f2797a.m4091G() && this.f7641t == null) {
                        iu0Var4.m1599b();
                    }
                    return;
                } finally {
                }
            }
            yp0 yp0Var = this.f7641t;
            if (yp0Var == null || (interfaceC0643q8 = yp0Var.f7685l) == null) {
                interfaceC0643q8 = this.f7626e;
            }
            try {
                Trace.beginSection(interfaceC0643q8.equals(yp0Var != null ? yp0Var.f7685l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    yp0 yp0Var2 = this.f7641t;
                    if (yp0Var2 == null || (iu0Var = yp0Var2.f7684k) == null) {
                        iu0Var = iu0Var4;
                    }
                    z11 z11VarM4830d = this.f7630i.m4830d();
                    int i3 = 0;
                    try {
                        c0351jd.m1692E(interfaceC0643q8, z11VarM4830d, iu0Var, c0616pi.m3129z());
                        z11VarM4830d.m5392e(true);
                        interfaceC0643q8.mo1685e();
                        Trace.endSection();
                        iu0Var4.m1600c();
                        iu0Var4.m1601d();
                        if (this.f7639r) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f7639r = false;
                                jh0 jh0Var = this.f7631j;
                                long[] jArr3 = jh0Var.f2878a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = jh0Var.f2879b[i8];
                                                    Object obj2 = jh0Var.f2880c[i8];
                                                    if (obj2 instanceof kh0) {
                                                        kh0 kh0Var = (kh0) obj2;
                                                        Object[] objArr = kh0Var.f3151b;
                                                        long[] jArr4 = kh0Var.f3150a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        iu0Var3 = iu0Var4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((ht0) objArr[i13]).m1503a()) {
                                                                                    kh0Var.m1902m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 == length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zM1896g = kh0Var.m1896g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        iu0Var3 = iu0Var4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zM1896g = !((ht0) obj2).m1503a();
                                                    }
                                                    if (zM1896g) {
                                                        jh0Var.m1706l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    iu0Var3 = iu0Var4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                iu0Var4 = iu0Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            iu0Var2 = iu0Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            iu0Var2 = iu0Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        iu0Var4 = iu0Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    iu0Var2 = iu0Var4;
                                }
                                m5267h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            iu0Var2 = iu0Var4;
                        }
                        try {
                            if (c0351jd2.f2797a.m4091G() && this.f7641t == null) {
                                iu0Var2.m1599b();
                            }
                            return;
                        } finally {
                            iu0Var2.m1598a();
                        }
                    } catch (Throwable th3) {
                        try {
                            z11VarM4830d.m5392e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (c0351jd2.f2797a.m4091G() && this.f7641t == null) {
                iu0Var4.m1599b();
            }
            throw th;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX INFO: renamed from: f */
    public final void m5265f() {
        synchronized (this.f7628g) {
            try {
                if (this.f7636o.f2797a.m4092H()) {
                    m5264e(this.f7636o);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f7629h.f3981d.m1896g()) {
                        iu0 iu0Var = this.f7645x;
                        try {
                            iu0Var.m1603g(this.f7629h, this.f7646y.m3129z());
                            iu0Var.m1599b();
                            iu0Var.m1598a();
                        } catch (Throwable th2) {
                            iu0Var.m1598a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX INFO: renamed from: g */
    public final void m5266g() {
        iu0 iu0Var;
        synchronized (this.f7628g) {
            try {
                this.f7646y.f4901v = null;
                if (!this.f7629h.f3981d.m1896g()) {
                    iu0Var = this.f7645x;
                    try {
                        iu0Var.m1603g(this.f7629h, this.f7646y.m3129z());
                        iu0Var.m1599b();
                        iu0Var.m1598a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f7629h.f3981d.m1896g()) {
                        iu0Var = this.f7645x;
                        try {
                            iu0Var.m1603g(this.f7629h, this.f7646y.m3129z());
                            iu0Var.m1599b();
                            iu0Var.m1598a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m5260a();
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m5267h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zM1896g;
        int i4;
        int i5;
        jh0 jh0Var = this.f7634m;
        long[] jArr3 = jh0Var.f2878a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = jh0Var.f2879b[i10];
                            Object obj2 = jh0Var.f2880c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof kh0;
                            j5 = j8;
                            jh0 jh0Var2 = this.f7631j;
                            if (z) {
                                kh0 kh0Var = (kh0) obj2;
                                Object[] objArr = kh0Var.f3151b;
                                long[] jArr4 = kh0Var.f3150a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!jh0Var2.m1697c((C0135dn) objArr[i15])) {
                                                        kh0Var.m1902m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zM1896g = kh0Var.m1896g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zM1896g = !jh0Var2.m1697c((C0135dn) obj2);
                            }
                            if (zM1896g) {
                                jh0Var.m1706l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        kh0 kh0Var2 = this.f7633l;
        if (!kh0Var2.m1897h()) {
            return;
        }
        Object[] objArr2 = kh0Var2.f3151b;
        long[] jArr5 = kh0Var2.f3150a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((ht0) objArr2[i20]).f2365g == null) {
                            kh0Var2.m1902m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m5268i() {
        boolean z;
        synchronized (this.f7628g) {
            z = true;
            if (this.f7647z != 1) {
                z = false;
            }
            if (z) {
                this.f7647z = 0;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: j */
    public final void m5269j(InterfaceC0904ww interfaceC0904ww) {
        try {
            synchronized (this.f7628g) {
                m5273n();
                jh0 jh0Var = this.f7638q;
                this.f7638q = u50.m4265f();
                try {
                    C0616pi c0616pi = this.f7646y;
                    j11 j11Var = this.f7640s;
                    if (!c0616pi.f4884e.f2797a.m4091G()) {
                        AbstractC0653qi.m3252a("Expected applyChanges() to have been called");
                    }
                    c0616pi.f4874P = j11Var;
                    try {
                        c0616pi.m3117n(jh0Var, interfaceC0904ww);
                    } finally {
                        c0616pi.f4874P = null;
                    }
                } catch (Throwable th) {
                    this.f7638q = jh0Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f7629h.f3981d.m1896g()) {
                    iu0 iu0Var = this.f7645x;
                    try {
                        iu0Var.m1603g(this.f7629h, this.f7646y.m3129z());
                        iu0Var.m1599b();
                        iu0Var.m1598a();
                    } catch (Throwable th3) {
                        iu0Var.m1598a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m5260a();
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final yp0 m5270k(boolean z, InterfaceC0904ww interfaceC0904ww) {
        if (this.f7641t != null) {
            wr0.m5025b("A pausable composition is in progress");
        }
        yp0 yp0Var = new yp0(this, this.f7625d, this.f7646y, this.f7629h, interfaceC0904ww, z, this.f7626e, this.f7628g);
        this.f7641t = yp0Var;
        return yp0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m5271l() {
        synchronized (this.f7628g) {
            try {
                if (this.f7641t != null) {
                    wr0.m5025b("Deactivate is not supported while pausable composition is in progress");
                }
                int i = 1;
                boolean z = this.f7630i.f6894e > 0;
                if (z || !this.f7629h.f3981d.m1896g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        iu0 iu0Var = this.f7645x;
                        try {
                            iu0Var.m1603g(this.f7629h, this.f7646y.m3129z());
                            if (z) {
                                z11 z11VarM4830d = this.f7630i.m4830d();
                                try {
                                    z11VarM4830d.m5400n(z11VarM4830d.f7770t, new C0168ed(i, this.f7645x, z11VarM4830d));
                                    z11VarM4830d.m5392e(true);
                                    this.f7626e.mo1685e();
                                    iu0Var.m1600c();
                                } catch (Throwable th) {
                                    z11VarM4830d.m5392e(false);
                                    throw th;
                                }
                            }
                            iu0Var.m1599b();
                            iu0Var.m1598a();
                        } catch (Throwable th2) {
                            iu0Var.m1598a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f7631j.m1695a();
                this.f7634m.m1695a();
                this.f7638q.m1695a();
                this.f7635n.f2797a.m4089E();
                this.f7636o.f2797a.m4089E();
                C0616pi c0616pi = this.f7646y;
                c0616pi.f4863E.clear();
                c0616pi.f4898s.clear();
                c0616pi.f4884e.f2797a.m4089E();
                c0616pi.f4901v = null;
                this.f7647z = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m5272m() {
        synchronized (this.f7628g) {
            try {
                if (this.f7646y.f4864F) {
                    wr0.m5025b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f7647z != 3) {
                    this.f7647z = 3;
                    C0351jd c0351jd = this.f7646y.f4870L;
                    if (c0351jd != null) {
                        m5264e(c0351jd);
                    }
                    int i = 1;
                    boolean z = this.f7630i.f6894e > 0;
                    if (z || !this.f7629h.f3981d.m1896g()) {
                        iu0 iu0Var = this.f7645x;
                        try {
                            iu0Var.m1603g(this.f7629h, this.f7646y.m3129z());
                            if (z) {
                                z11 z11VarM4830d = this.f7630i.m4830d();
                                try {
                                    z11VarM4830d.m5400n(z11VarM4830d.f7770t, new C0956ya(i, this.f7645x));
                                    z11VarM4830d.m5374H();
                                    z11VarM4830d.m5392e(true);
                                    this.f7626e.m1690k();
                                    this.f7626e.mo1685e();
                                    iu0Var.m1600c();
                                } catch (Throwable th) {
                                    z11VarM4830d.m5392e(false);
                                    throw th;
                                }
                            }
                            iu0Var.m1599b();
                            iu0Var.m1598a();
                        } catch (Throwable th2) {
                            iu0Var.m1598a();
                            throw th2;
                        }
                    }
                    C0616pi c0616pi = this.f7646y;
                    c0616pi.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0616pi.f4881b.mo2728u(c0616pi);
                        c0616pi.f4863E.clear();
                        c0616pi.f4898s.clear();
                        c0616pi.f4884e.f2797a.m4089E();
                        c0616pi.f4901v = null;
                        c0616pi.f4880a.m1690k();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f7625d.mo2729v(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m5273n() {
        Object obj = AbstractC0307i4.f2421b;
        AtomicReference atomicReference = this.f7627f;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC0653qi.m3253b("pending composition has not been applied");
                throw new C0725sg();
            }
            if (andSet instanceof Set) {
                m5262c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC0653qi.m3253b("corrupt pendingModifications drain: " + atomicReference);
                throw new C0725sg();
            }
            for (Set set : (Set[]) andSet) {
                m5262c(set, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m5274o() {
        AtomicReference atomicReference = this.f7627f;
        Object andSet = atomicReference.getAndSet(null);
        if (p30.m3002l(andSet, AbstractC0307i4.f2421b)) {
            return;
        }
        if (andSet instanceof Set) {
            m5262c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m5262c(set, false);
            }
            return;
        }
        if (andSet != null) {
            AbstractC0653qi.m3253b("corrupt pendingModifications drain: " + atomicReference);
            throw new C0725sg();
        }
        if (this.f7641t == null) {
            AbstractC0653qi.m3252a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m5275p() {
        C0442ls c0442ls = C0442ls.f3582d;
        AtomicReference atomicReference = this.f7627f;
        Object andSet = atomicReference.getAndSet(c0442ls);
        if (p30.m3002l(andSet, AbstractC0307i4.f2421b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m5262c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC0653qi.m3253b("corrupt pendingModifications drain: " + atomicReference);
            throw new C0725sg();
        }
        for (Set set : (Set[]) andSet) {
            m5262c(set, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m5276q() {
        int i = this.f7647z;
        if (i != 0) {
            wr0.m5025b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f7641t == null) {
            return;
        }
        wr0.m5025b("A pausable composition is in progress");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: r */
    public final void m5277r(ArrayList arrayList) {
        mh0 mh0Var = this.f7629h;
        C0616pi c0616pi = this.f7646y;
        if (arrayList.size() > 0) {
            ((mg0) ((uo0) arrayList.get(0)).f6274d).getClass();
            AbstractC0653qi.m3252a("Check failed");
        }
        try {
            c0616pi.getClass();
            try {
                c0616pi.m3070B(arrayList);
                c0616pi.m3110i();
            } catch (Throwable th) {
                c0616pi.m3094a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!mh0Var.f3981d.m1896g()) {
                    iu0 iu0Var = this.f7645x;
                    try {
                        iu0Var.m1603g(mh0Var, c0616pi.m3129z());
                        iu0Var.m1599b();
                        iu0Var.m1598a();
                    } catch (Throwable th3) {
                        iu0Var.m1598a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m5260a();
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final y30 m5278s(ht0 ht0Var, Object obj) {
        C0964yi c0964yi;
        int i = ht0Var.f2360b;
        if ((i & 2) != 0) {
            ht0Var.f2360b = i | 4;
        }
        C0788u2 c0788u2 = ht0Var.f2361c;
        if (c0788u2 == null || !c0788u2.m4246a()) {
            return y30.f7506d;
        }
        if (this.f7630i.m4831e(c0788u2)) {
            if (ht0Var.f2362d == null) {
                return y30.f7506d;
            }
            y30 y30VarM5280u = m5280u(ht0Var, c0788u2, obj);
            if (y30VarM5280u != y30.f7506d) {
                this.f7644w.m5068h();
            }
            return y30VarM5280u;
        }
        synchronized (this.f7628g) {
            c0964yi = this.f7642u;
        }
        if (c0964yi != null) {
            C0616pi c0616pi = c0964yi.f7646y;
            if (c0616pi.f4864F && c0616pi.m3097b0(ht0Var, obj)) {
                return y30.f7509g;
            }
        }
        return y30.f7506d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m5279t() {
        C0964yi c0964yi;
        synchronized (this.f7628g) {
            try {
                for (Object obj : this.f7630i.f6895f) {
                    ht0 ht0Var = obj instanceof ht0 ? (ht0) obj : null;
                    if (ht0Var != null && (c0964yi = ht0Var.f2359a) != null) {
                        c0964yi.m5278s(ht0Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[Catch: all -> 0x0042, EDGE_INSN: B:81:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], EDGE_INSN: B:82:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:40:0x006d, B:41:0x0073, B:43:0x0079, B:45:0x007d, B:48:0x0089, B:50:0x0099, B:52:0x00a5, B:54:0x00af, B:58:0x00be, B:62:0x00ca, B:63:0x00cd, B:66:0x00d2), top: B:79:0x000b }] */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y30 m5280u(ht0 ht0Var, C0788u2 c0788u2, Object obj) {
        int i;
        synchronized (this.f7628g) {
            try {
                C0964yi c0964yi = this.f7642u;
                C0964yi c0964yi2 = null;
                if (c0964yi != null) {
                    w11 w11Var = this.f7630i;
                    int i2 = this.f7643v;
                    if (w11Var.f6899j) {
                        AbstractC0653qi.m3252a("Writer is active");
                    }
                    if (i2 < 0 || i2 >= w11Var.f6894e) {
                        AbstractC0653qi.m3252a("Invalid group index");
                    }
                    if (w11Var.m4831e(c0788u2)) {
                        int i3 = w11Var.f6893d[(i2 * 5) + 3] + i2;
                        int i4 = c0788u2.f6110a;
                        if (i2 > i4 || i4 >= i3) {
                            c0964yi = null;
                        }
                        c0964yi2 = c0964yi;
                    }
                }
                if (c0964yi2 == null) {
                    C0616pi c0616pi = this.f7646y;
                    if (c0616pi.f4864F && c0616pi.m3097b0(ht0Var, obj)) {
                        return y30.f7509g;
                    }
                    if (obj == null) {
                        this.f7638q.m1707m(ht0Var, C0496n2.f4139S);
                    } else {
                        boolean z = obj instanceof C0135dn;
                        jh0 jh0Var = this.f7638q;
                        if (z) {
                            Object objM1701g = jh0Var.m1701g(ht0Var);
                            if (objM1701g == null) {
                                u50.m4264e(this.f7638q, ht0Var, obj);
                            } else if (objM1701g instanceof kh0) {
                                kh0 kh0Var = (kh0) objM1701g;
                                Object[] objArr = kh0Var.f3151b;
                                long[] jArr = kh0Var.f3150a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i5];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8;
                                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                                            int i8 = 0;
                                            while (i8 < i7) {
                                                if ((j & 255) < 128) {
                                                    i = i6;
                                                    if (objArr[(i5 << 3) + i8] == C0496n2.f4139S) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i = i6;
                                                }
                                                j >>= i;
                                                i8++;
                                                i6 = i;
                                            }
                                            if (i7 != i6) {
                                                break;
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                    u50.m4264e(this.f7638q, ht0Var, obj);
                                }
                            } else if (objM1701g == C0496n2.f4139S) {
                            }
                        } else {
                            jh0Var.m1707m(ht0Var, C0496n2.f4139S);
                        }
                    }
                }
                if (c0964yi2 != null) {
                    return c0964yi2.m5280u(ht0Var, c0788u2, obj);
                }
                this.f7625d.mo2719l(this);
                return this.f7646y.f4864F ? y30.f7508f : y30.f7507e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m5281v(Object obj) {
        Object objM1701g = this.f7631j.m1701g(obj);
        if (objM1701g == null) {
            return;
        }
        boolean z = objM1701g instanceof kh0;
        y30 y30Var = y30.f7509g;
        jh0 jh0Var = this.f7637p;
        if (!z) {
            ht0 ht0Var = (ht0) objM1701g;
            if (ht0Var.m1504b(obj) == y30Var) {
                u50.m4264e(jh0Var, obj, ht0Var);
                return;
            }
            return;
        }
        kh0 kh0Var = (kh0) objM1701g;
        Object[] objArr = kh0Var.f3151b;
        long[] jArr = kh0Var.f3150a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ht0 ht0Var2 = (ht0) objArr[(i << 3) + i3];
                        if (ht0Var2.m1504b(obj) == y30Var) {
                            u50.m4264e(jh0Var, obj, ht0Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5282w(Set set) {
        boolean z = set instanceof fy0;
        jh0 jh0Var = this.f7634m;
        jh0 jh0Var2 = this.f7631j;
        if (z) {
            kh0 kh0Var = ((fy0) set).f1821d;
            Object[] objArr = kh0Var.f3151b;
            long[] jArr = kh0Var.f3150a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (jh0Var2.m1697c(obj) || jh0Var.m1697c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        } else {
            for (Object obj2 : set) {
                if (jh0Var2.m1697c(obj2) || jh0Var.m1697c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: x */
    public final boolean m5283x() {
        synchronized (this.f7628g) {
            yp0 yp0Var = this.f7641t;
            boolean zM4092H = false;
            if (yp0Var != null && (yp0Var.f7681h.get() != aq0.f239h || yp0Var.f7682i != u50.m4266g())) {
                AtomicReference atomicReference = yp0Var.f7681h;
                aq0 aq0Var = aq0.f240i;
                aq0 aq0Var2 = aq0.f238g;
                while (!atomicReference.compareAndSet(aq0Var, aq0Var2) && atomicReference.get() == aq0Var) {
                }
                yp0Var.f7685l.f4964a.m4198a(9);
                return false;
            }
            m5273n();
            try {
                jh0 jh0Var = this.f7638q;
                this.f7638q = u50.m4265f();
                try {
                    C0616pi c0616pi = this.f7646y;
                    j11 j11Var = this.f7640s;
                    sm0 sm0Var = c0616pi.f4884e.f2797a;
                    if (!sm0Var.m4091G()) {
                        AbstractC0653qi.m3252a("Expected applyChanges() to have been called");
                    }
                    if (jh0Var.f2882e > 0 || !c0616pi.f4898s.isEmpty()) {
                        c0616pi.f4874P = j11Var;
                        try {
                            c0616pi.m3117n(jh0Var, null);
                            c0616pi.f4874P = null;
                            zM4092H = sm0Var.m4092H();
                        } catch (Throwable th) {
                            c0616pi.f4874P = null;
                            throw th;
                        }
                    }
                    if (!zM4092H) {
                        m5274o();
                    }
                    return zM4092H;
                } catch (Throwable th2) {
                    this.f7638q = jh0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f7629h.f3981d.m1896g()) {
                        iu0 iu0Var = this.f7645x;
                        try {
                            iu0Var.m1603g(this.f7629h, this.f7646y.m3129z());
                            iu0Var.m1599b();
                            iu0Var.m1598a();
                        } catch (Throwable th4) {
                            iu0Var.m1598a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    m5260a();
                    throw th5;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: java.util.Set[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final void m5284y(fy0 fy0Var) {
        Object obj;
        while (true) {
            Object obj2 = this.f7627f.get();
            if (obj2 == null || obj2.equals(AbstractC0307i4.f2421b)) {
                obj = fy0Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, fy0Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f7627f).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = fy0Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f7627f;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f7628g) {
                    m5274o();
                }
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5285z(Object obj) {
        ht0 ht0VarM3127x;
        int i;
        boolean z;
        int i2;
        C0616pi c0616pi = this.f7646y;
        if (c0616pi.f4859A <= 0 && (ht0VarM3127x = c0616pi.m3127x()) != null) {
            int i3 = ht0VarM3127x.f2360b | 1;
            ht0VarM3127x.f2360b = i3;
            if ((i3 & 32) == 0) {
                ch0 ch0Var = ht0VarM3127x.f2364f;
                if (ch0Var == null) {
                    ch0Var = new ch0();
                    ht0VarM3127x.f2364f = ch0Var;
                }
                int i4 = ht0VarM3127x.f2363e;
                int iM533c = ch0Var.m533c(obj);
                if (iM533c < 0) {
                    iM533c = ~iM533c;
                    i = -1;
                } else {
                    i = ch0Var.f812c[iM533c];
                }
                ch0Var.f811b[iM533c] = obj;
                ch0Var.f812c[iM533c] = i4;
                z = i == ht0VarM3127x.f2363e;
            }
            this.f7644w.m5068h();
            if (z) {
                return;
            }
            if (obj instanceof e41) {
                ((e41) obj).m783f(1);
            }
            u50.m4264e(this.f7631j, obj, ht0VarM3127x);
            if (obj instanceof C0135dn) {
                C0135dn c0135dn = (C0135dn) obj;
                C0098cn c0098cnM719h = c0135dn.m719h();
                jh0 jh0Var = this.f7634m;
                u50.m4282y(jh0Var, obj);
                ch0 ch0Var2 = c0098cnM719h.f860e;
                Object[] objArr = ch0Var2.f811b;
                long[] jArr = ch0Var2.f810a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    d41 d41Var = (d41) objArr[(i5 << 3) + i8];
                                    i2 = i6;
                                    if (d41Var instanceof e41) {
                                        ((e41) d41Var).m783f(1);
                                    }
                                    u50.m4264e(jh0Var, d41Var, obj);
                                } else {
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8++;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            } else if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                Object obj2 = c0098cnM719h.f861f;
                jh0 jh0Var2 = ht0VarM3127x.f2365g;
                if (jh0Var2 == null) {
                    jh0Var2 = new jh0();
                    ht0VarM3127x.f2365g = jh0Var2;
                }
                jh0Var2.m1707m(c0135dn, obj2);
            }
        }
    }
}
