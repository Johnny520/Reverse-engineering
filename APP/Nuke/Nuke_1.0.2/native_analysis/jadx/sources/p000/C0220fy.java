package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: fy */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0220fy implements InterfaceC0902xx {

    /* JADX INFO: renamed from: A */
    public final C0485n4 f3172A;

    /* JADX INFO: renamed from: B */
    public final z72 f3173B;

    /* JADX INFO: renamed from: C */
    public final go0 f3174C;

    /* JADX INFO: renamed from: D */
    public int f3175D;

    /* JADX INFO: renamed from: h */
    public final AbstractC0941yx f3176h;

    /* JADX INFO: renamed from: i */
    public final s73 f3177i;

    /* JADX INFO: renamed from: j */
    public final AtomicReference f3178j = new AtomicReference(null);

    /* JADX INFO: renamed from: k */
    public final Object f3179k = new Object();

    /* JADX INFO: renamed from: l */
    public final uk1 f3180l;

    /* JADX INFO: renamed from: m */
    public final qr2 f3181m;

    /* JADX INFO: renamed from: n */
    public final rk1 f3182n;

    /* JADX INFO: renamed from: o */
    public final sk1 f3183o;

    /* JADX INFO: renamed from: p */
    public final sk1 f3184p;

    /* JADX INFO: renamed from: q */
    public final rk1 f3185q;

    /* JADX INFO: renamed from: r */
    public final C0138dq f3186r;

    /* JADX INFO: renamed from: s */
    public final C0138dq f3187s;

    /* JADX INFO: renamed from: t */
    public final rk1 f3188t;

    /* JADX INFO: renamed from: u */
    public rk1 f3189u;

    /* JADX INFO: renamed from: v */
    public boolean f3190v;

    /* JADX INFO: renamed from: w */
    public sq2 f3191w;

    /* JADX INFO: renamed from: x */
    public sy1 f3192x;

    /* JADX INFO: renamed from: y */
    public C0220fy f3193y;

    /* JADX INFO: renamed from: z */
    public int f3194z;

    public C0220fy(AbstractC0941yx abstractC0941yx, s73 s73Var) {
        this.f3176h = abstractC0941yx;
        this.f3177i = s73Var;
        uk1 uk1Var = new uk1(new sk1());
        this.f3180l = uk1Var;
        qr2 qr2Var = new qr2();
        if (abstractC0941yx.mo1378d()) {
            qr2Var.f9142r = new zj1();
        }
        if (abstractC0941yx.mo1380f()) {
            qr2Var.m4273b();
        }
        this.f3181m = qr2Var;
        this.f3182n = qp0.m4260o();
        this.f3183o = new sk1();
        this.f3184p = new sk1();
        this.f3185q = qp0.m4260o();
        C0138dq c0138dq = new C0138dq();
        this.f3186r = c0138dq;
        C0138dq c0138dq2 = new C0138dq();
        this.f3187s = c0138dq2;
        this.f3188t = qp0.m4260o();
        this.f3189u = qp0.m4260o();
        C0485n4 c0485n4 = new C0485n4(5, abstractC0941yx);
        this.f3172A = c0485n4;
        this.f3173B = new z72();
        go0 go0Var = new go0(s73Var, abstractC0941yx, sr2.m4992d(qr2Var), uk1Var, c0138dq, c0138dq2, c0485n4, this);
        abstractC0941yx.mo1390p(go0Var);
        this.f3174C = go0Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m1729A(mn0 mn0Var) {
        boolean zM1738i = m1738i();
        m1746q();
        AbstractC0941yx abstractC0941yx = this.f3176h;
        if (!zM1738i) {
            abstractC0941yx.mo1375a(this, mn0Var);
            return;
        }
        go0 go0Var = this.f3174C;
        go0Var.f3641z = 0;
        go0Var.f3640y = true;
        abstractC0941yx.mo1375a(this, mn0Var);
        go0Var.m1997s();
    }

    /* JADX INFO: renamed from: a */
    public final void m1730a() {
        this.f3178j.set(null);
        this.f3186r.f2145t.m2740U();
        this.f3187s.f2145t.m2740U();
        uk1 uk1Var = this.f3180l;
        if (uk1Var.f11340h.m4888g()) {
            return;
        }
        z72 z72Var = this.f3173B;
        try {
            z72Var.m6395g(uk1Var, this.f3174C.m2004z());
            z72Var.m6391b();
        } finally {
            z72Var.m6390a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1731b(Object obj, boolean z) {
        Object objM4505g = this.f3182n.m4505g(obj);
        if (objM4505g == null) {
            return;
        }
        boolean z2 = objM4505g instanceof sk1;
        c21 c21Var = c21.f1110h;
        sk1 sk1Var = this.f3183o;
        sk1 sk1Var2 = this.f3184p;
        rk1 rk1Var = this.f3188t;
        if (!z2) {
            b62 b62Var = (b62) objM4505g;
            if (qp0.m4237S(rk1Var, obj, b62Var) || b62Var.m442b(obj) == c21Var) {
                return;
            }
            if (b62Var.f619g == null || z) {
                sk1Var.m4882a(b62Var);
                return;
            } else {
                sk1Var2.m4882a(b62Var);
                return;
            }
        }
        sk1 sk1Var3 = (sk1) objM4505g;
        Object[] objArr = sk1Var3.f10175b;
        long[] jArr = sk1Var3.f10174a;
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
                        b62 b62Var2 = (b62) objArr[(i << 3) + i3];
                        if (!qp0.m4237S(rk1Var, obj, b62Var2) && b62Var2.m442b(obj) != c21Var) {
                            if (b62Var2.f619g == null || z) {
                                sk1Var.m4882a(b62Var2);
                            } else {
                                sk1Var2.m4882a(b62Var2);
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

    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1732c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zM4884c;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i2;
        long j6;
        boolean zM4888g;
        int i3;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i4;
        int i5;
        long[] jArr8;
        boolean z2 = set instanceof gd2;
        rk1 rk1Var = this.f3185q;
        Object obj = null;
        int i6 = 8;
        if (z2) {
            sk1 sk1Var = ((gd2) set).f3413h;
            Object[] objArr = sk1Var.f10175b;
            long[] jArr9 = sk1Var.f10174a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i7];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i7 << 3) + i9];
                                c2 = c3;
                                if (obj2 instanceof b62) {
                                    ((b62) obj2).m442b(obj);
                                } else {
                                    m1731b(obj2, z);
                                    Object objM4505g = rk1Var.m4505g(obj2);
                                    if (objM4505g != null) {
                                        if (objM4505g instanceof sk1) {
                                            sk1 sk1Var2 = (sk1) objM4505g;
                                            Object[] objArr2 = sk1Var2.f10175b;
                                            long[] jArr10 = sk1Var2.f10174a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i10 = i6;
                                                i4 = length;
                                                int i11 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i11];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i13 = 0;
                                                        while (i13 < i12) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                m1731b((n70) objArr2[(i11 << 3) + i13], z);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j10 >>= i10;
                                                            i13++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i12 != i10) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr7;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j8 = j9;
                                            i4 = length;
                                            m1731b((n70) objM4505g, z);
                                        }
                                        i5 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j8 = j9;
                                i4 = length;
                                i5 = 8;
                            } else {
                                jArr7 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i4 = length;
                                i5 = i6;
                            }
                            j9 = j8 >> i5;
                            i9++;
                            length = i4;
                            i6 = i5;
                            c3 = c2;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c = c3;
                        int i14 = length;
                        if (i8 != i6) {
                            break;
                        } else {
                            length = i14;
                        }
                    } else {
                        jArr6 = jArr9;
                        c = 7;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    jArr9 = jArr6;
                    obj = null;
                    i6 = 8;
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
                if (obj3 instanceof b62) {
                    ((b62) obj3).m442b(null);
                } else {
                    m1731b(obj3, z);
                    Object objM4505g2 = rk1Var.m4505g(obj3);
                    if (objM4505g2 != null) {
                        if (objM4505g2 instanceof sk1) {
                            sk1 sk1Var3 = (sk1) objM4505g2;
                            Object[] objArr3 = sk1Var3.f10175b;
                            long[] jArr12 = sk1Var3.f10174a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr12[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                m1731b((n70) objArr3[(i << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 == 8) {
                                            i = i != length3 ? i + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            m1731b((n70) objM4505g2, z);
                        }
                    }
                }
            }
        }
        rk1 rk1Var2 = this.f3182n;
        sk1 sk1Var4 = this.f3183o;
        if (z) {
            sk1 sk1Var5 = this.f3184p;
            if (sk1Var5.m4889h()) {
                long[] jArr13 = rk1Var2.f9618a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr13[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = rk1Var2.f9619b[i20];
                                    Object obj5 = rk1Var2.f9620c[i20];
                                    if (obj5 instanceof sk1) {
                                        sk1 sk1Var6 = (sk1) obj5;
                                        Object[] objArr4 = sk1Var6.f10175b;
                                        long[] jArr14 = sk1Var6.f10174a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr14[i21];
                                                jArr5 = jArr13;
                                                i2 = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i3 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i3 = i23;
                                                            int i24 = (i21 << 3) + i3;
                                                            j7 = j13;
                                                            b62 b62Var = (b62) objArr4[i24];
                                                            if (sk1Var5.m4884c(b62Var) || sk1Var4.m4884c(b62Var)) {
                                                                sk1Var6.m4894m(i24);
                                                            }
                                                        } else {
                                                            i3 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                    if (i21 == length5) {
                                                        break;
                                                    }
                                                    i21++;
                                                    length4 = i2;
                                                    jArr13 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i2 = length4;
                                            j6 = j12;
                                        }
                                        zM4888g = sk1Var6.m4888g();
                                    } else {
                                        jArr5 = jArr13;
                                        i2 = length4;
                                        j6 = j12;
                                        obj5.getClass();
                                        b62 b62Var2 = (b62) obj5;
                                        zM4888g = sk1Var5.m4884c(b62Var2) || sk1Var4.m4884c(b62Var2);
                                    }
                                    if (zM4888g) {
                                        rk1Var2.m4510l(i20);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i2 = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i2;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr13 = jArr4;
                    }
                }
                sk1Var5.m4883b();
                m1737h();
                return;
            }
        }
        if (sk1Var4.m4889h()) {
            long[] jArr15 = rk1Var2.f9618a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr15[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = rk1Var2.f9619b[i29];
                                Object obj7 = rk1Var2.f9620c[i29];
                                if (obj7 instanceof sk1) {
                                    sk1 sk1Var7 = (sk1) obj7;
                                    Object[] objArr5 = sk1Var7.f10175b;
                                    long[] jArr16 = sk1Var7.f10174a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr16[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr15;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (sk1Var4.m4884c((b62) objArr6[i33])) {
                                                            sk1Var7.m4894m(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr15 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j4 = j14;
                                    }
                                    zM4884c = sk1Var7.m4888g();
                                } else {
                                    jArr2 = jArr15;
                                    j4 = j14;
                                    obj7.getClass();
                                    zM4884c = sk1Var4.m4884c((b62) obj7);
                                }
                                if (zM4884c) {
                                    rk1Var2.m4510l(i29);
                                }
                            } else {
                                jArr2 = jArr15;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr15 = jArr;
                }
            }
            m1737h();
            sk1Var4.m4883b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1733d() {
        synchronized (this.f3179k) {
            try {
                m1734e(this.f3186r);
                m1744o();
            } catch (Throwable th) {
                try {
                    if (!this.f3180l.f11340h.m4888g()) {
                        z72 z72Var = this.f3173B;
                        try {
                            z72Var.m6395g(this.f3180l, this.f3174C.m2004z());
                            z72Var.m6391b();
                            z72Var.m6390a();
                        } catch (Throwable th2) {
                            z72Var.m6390a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    m1730a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1734e(C0138dq c0138dq) throws Throwable {
        InterfaceC0654rf interfaceC0654rf;
        z72 z72Var;
        z72 z72Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        z72 z72Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zM4888g;
        long j3;
        C0138dq c0138dq2 = this.f3187s;
        go0 go0Var = this.f3174C;
        C0110cy c0110cyM2004z = go0Var.m2004z();
        z72 z72Var4 = this.f3173B;
        z72Var4.m6395g(this.f3180l, c0110cyM2004z);
        try {
            if (c0138dq.f2145t.m2742W()) {
                try {
                    if (c0138dq2.f2145t.m2742W() && this.f3192x == null) {
                        z72Var4.m6391b();
                    }
                    return;
                } finally {
                }
            }
            sy1 sy1Var = this.f3192x;
            if (sy1Var == null || (interfaceC0654rf = sy1Var.f10432l) == null) {
                interfaceC0654rf = this.f3177i;
            }
            try {
                Trace.beginSection(interfaceC0654rf.equals(sy1Var != null ? sy1Var.f10432l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    sy1 sy1Var2 = this.f3192x;
                    if (sy1Var2 == null || (z72Var = sy1Var2.f10431k) == null) {
                        z72Var = z72Var4;
                    }
                    qr2 qr2Var = this.f3181m;
                    C0110cy c0110cyM2004z2 = go0Var.m2004z();
                    tr2 tr2VarM4275d = sr2.m4992d(qr2Var).m4275d();
                    int i3 = 0;
                    try {
                        c0138dq.m1068b0(interfaceC0654rf, tr2VarM4275d, z72Var, c0110cyM2004z2);
                        tr2VarM4275d.m5414e(true);
                        interfaceC0654rf.mo4444i();
                        Trace.endSection();
                        z72Var4.m6392c();
                        z72Var4.m6393d();
                        if (this.f3190v) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f3190v = false;
                                rk1 rk1Var = this.f3182n;
                                long[] jArr3 = rk1Var.f9618a;
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
                                                    Object obj = rk1Var.f9619b[i8];
                                                    Object obj2 = rk1Var.f9620c[i8];
                                                    if (obj2 instanceof sk1) {
                                                        sk1 sk1Var = (sk1) obj2;
                                                        Object[] objArr = sk1Var.f10175b;
                                                        long[] jArr4 = sk1Var.f10174a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        z72Var3 = z72Var4;
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
                                                                                if (!((b62) objArr[i13]).m441a()) {
                                                                                    sk1Var.m4894m(i13);
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
                                                        zM4888g = sk1Var.m4888g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        z72Var3 = z72Var4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zM4888g = !((b62) obj2).m441a();
                                                    }
                                                    if (zM4888g) {
                                                        rk1Var.m4510l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    z72Var3 = z72Var4;
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
                                                z72Var4 = z72Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            z72Var2 = z72Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            z72Var2 = z72Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        z72Var4 = z72Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    z72Var2 = z72Var4;
                                }
                                m1737h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            z72Var2 = z72Var4;
                        }
                        try {
                            if (c0138dq2.f2145t.m2742W() && this.f3192x == null) {
                                z72Var2.m6391b();
                            }
                            return;
                        } finally {
                            z72Var2.m6390a();
                        }
                    } catch (Throwable th3) {
                        try {
                            tr2VarM4275d.m5414e(false);
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
            if (c0138dq2.f2145t.m2742W() && this.f3192x == null) {
                z72Var4.m6391b();
            }
            throw th;
        } finally {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1735f() {
        synchronized (this.f3179k) {
            try {
                C0138dq c0138dq = this.f3187s;
                c0138dq.getClass();
                if (!c0138dq.f2145t.m2742W()) {
                    m1734e(this.f3187s);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f3180l.f11340h.m4888g()) {
                        z72 z72Var = this.f3173B;
                        try {
                            z72Var.m6395g(this.f3180l, this.f3174C.m2004z());
                            z72Var.m6391b();
                            z72Var.m6390a();
                        } catch (Throwable th2) {
                            z72Var.m6390a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1736g() {
        z72 z72Var;
        synchronized (this.f3179k) {
            try {
                this.f3174C.f3637v = null;
                if (!this.f3180l.f11340h.m4888g()) {
                    z72Var = this.f3173B;
                    try {
                        z72Var.m6395g(this.f3180l, this.f3174C.m2004z());
                        z72Var.m6391b();
                        z72Var.m6390a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f3180l.f11340h.m4888g()) {
                        z72Var = this.f3173B;
                        try {
                            z72Var.m6395g(this.f3180l, this.f3174C.m2004z());
                            z72Var.m6391b();
                            z72Var.m6390a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m1730a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1737h() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zM4888g;
        int i3;
        long j7;
        rk1 rk1Var = this.f3185q;
        long[] jArr3 = rk1Var.f9618a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = rk1Var.f9619b[i8];
                            Object obj2 = rk1Var.f9620c[i8];
                            boolean z = obj2 instanceof sk1;
                            rk1 rk1Var2 = this.f3182n;
                            if (z) {
                                sk1 sk1Var = (sk1) obj2;
                                Object[] objArr = sk1Var.f10175b;
                                long[] jArr4 = sk1Var.f10174a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!rk1Var2.m4501c((n70) objArr[i13])) {
                                                        sk1Var.m4894m(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                            if (i10 == length2) {
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                zM4888g = sk1Var.m4888g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                obj2.getClass();
                                zM4888g = !rk1Var2.m4501c((n70) obj2);
                            }
                            if (zM4888g) {
                                rk1Var.m4510l(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        sk1 sk1Var2 = this.f3184p;
        if (!sk1Var2.m4889h()) {
            return;
        }
        Object[] objArr2 = sk1Var2.f10175b;
        long[] jArr5 = sk1Var2.f10174a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((b62) objArr2[i18]).f619g != null)) {
                            sk1Var2.m4894m(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1738i() {
        boolean z;
        synchronized (this.f3179k) {
            z = true;
            if (this.f3175D != 1) {
                z = false;
            }
            if (z) {
                this.f3175D = 0;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final void m1739j(mn0 mn0Var) {
        try {
            synchronized (this.f3179k) {
                m1743n();
                rk1 rk1Var = this.f3189u;
                this.f3189u = qp0.m4260o();
                try {
                    go0 go0Var = this.f3174C;
                    sq2 sq2Var = this.f3191w;
                    if (!go0Var.f3620e.f2145t.m2742W()) {
                        AbstractC0752tx.m5443a("Expected applyChanges() to have been called");
                    }
                    go0Var.f3610P = sq2Var;
                    try {
                        go0Var.m1992n(rk1Var, mn0Var);
                    } finally {
                        go0Var.f3610P = null;
                    }
                } catch (Throwable th) {
                    this.f3189u = rk1Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f3180l.f11340h.m4888g()) {
                    z72 z72Var = this.f3173B;
                    try {
                        z72Var.m6395g(this.f3180l, this.f3174C.m2004z());
                        z72Var.m6391b();
                        z72Var.m6390a();
                    } catch (Throwable th3) {
                        z72Var.m6390a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m1730a();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final sy1 m1740k(boolean z, mn0 mn0Var) {
        if (this.f3192x != null) {
            j22.m2430b("A pausable composition is in progress");
        }
        sy1 sy1Var = new sy1(this, this.f3176h, this.f3174C, this.f3180l, mn0Var, z, this.f3177i, this.f3179k);
        this.f3192x = sy1Var;
        return sy1Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m1741l() {
        synchronized (this.f3179k) {
            try {
                if (this.f3192x != null) {
                    j22.m2430b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f3181m.f9133i == 0;
                if (!z || !this.f3180l.f11340h.m4888g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        z72 z72Var = this.f3173B;
                        try {
                            z72Var.m6395g(this.f3180l, this.f3174C.m2004z());
                            if (!z) {
                                qr2 qr2Var = this.f3181m;
                                z72 z72Var2 = this.f3173B;
                                tr2 tr2VarM4275d = qr2Var.m4275d();
                                try {
                                    tr2VarM4275d.m5422n(tr2VarM4275d.f10932t, new C0016af(6, z72Var2, tr2VarM4275d));
                                    tr2VarM4275d.m5414e(true);
                                    this.f3177i.mo4444i();
                                    z72Var.m6392c();
                                } catch (Throwable th) {
                                    tr2VarM4275d.m5414e(false);
                                    throw th;
                                }
                            }
                            z72Var.m6391b();
                            z72Var.m6390a();
                        } catch (Throwable th2) {
                            z72Var.m6390a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f3182n.m4499a();
                this.f3185q.m4499a();
                this.f3189u.m4499a();
                this.f3186r.f2145t.m2740U();
                this.f3187s.f2145t.m2740U();
                go0 go0Var = this.f3174C;
                go0Var.f3599E.clear();
                go0Var.f3634s.clear();
                go0Var.f3620e.f2145t.m2740U();
                go0Var.f3637v = null;
                this.f3175D = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1742m() {
        synchronized (this.f3179k) {
            try {
                if (this.f3174C.f3600F) {
                    j22.m2430b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f3175D != 3) {
                    this.f3175D = 3;
                    C0138dq c0138dq = this.f3174C.f3606L;
                    if (c0138dq != null) {
                        m1734e(c0138dq);
                    }
                    boolean z = this.f3181m.f9133i == 0;
                    if (!z || !this.f3180l.f11340h.m4888g()) {
                        z72 z72Var = this.f3173B;
                        try {
                            z72Var.m6395g(this.f3180l, this.f3174C.m2004z());
                            if (!z) {
                                qr2 qr2Var = this.f3181m;
                                z72 z72Var2 = this.f3173B;
                                tr2 tr2VarM4275d = qr2Var.m4275d();
                                try {
                                    tr2VarM4275d.m5422n(tr2VarM4275d.f10932t, new C0686s9(4, z72Var2));
                                    tr2VarM4275d.m5396H();
                                    tr2VarM4275d.m5414e(true);
                                    this.f3177i.m4750c();
                                    this.f3177i.mo4444i();
                                    z72Var.m6392c();
                                } catch (Throwable th) {
                                    tr2VarM4275d.m5414e(false);
                                    throw th;
                                }
                            }
                            z72Var.m6391b();
                            z72Var.m6390a();
                        } catch (Throwable th2) {
                            z72Var.m6390a();
                            throw th2;
                        }
                    }
                    go0 go0Var = this.f3174C;
                    go0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        go0Var.f3617b.mo1395u(go0Var);
                        go0Var.f3599E.clear();
                        go0Var.f3634s.clear();
                        go0Var.f3620e.f2145t.m2740U();
                        go0Var.f3637v = null;
                        go0Var.f3616a.m4750c();
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
        this.f3176h.mo1396v(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m1743n() {
        Object obj = fg1.f2980h;
        AtomicReference atomicReference = this.f3178j;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC0752tx.m5444b("pending composition has not been applied");
                C0676s.m4644b();
                return;
            }
            if (andSet instanceof Set) {
                m1732c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC0752tx.m5444b("corrupt pendingModifications drain: " + atomicReference);
                C0676s.m4644b();
                return;
            }
            for (Set set : (Set[]) andSet) {
                m1732c(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1744o() {
        AtomicReference atomicReference = this.f3178j;
        Object andSet = atomicReference.getAndSet(null);
        if (t11.m5086l(andSet, fg1.f2980h)) {
            return;
        }
        if (andSet instanceof Set) {
            m1732c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m1732c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f3192x == null) {
                AbstractC0752tx.m5443a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            AbstractC0752tx.m5444b("corrupt pendingModifications drain: " + atomicReference);
            C0676s.m4644b();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1745p() {
        fe0 fe0Var = fe0.f2918h;
        AtomicReference atomicReference = this.f3178j;
        Object andSet = atomicReference.getAndSet(fe0Var);
        if (t11.m5086l(andSet, fg1.f2980h) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m1732c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC0752tx.m5444b("corrupt pendingModifications drain: " + atomicReference);
            C0676s.m4644b();
            return;
        }
        for (Set set : (Set[]) andSet) {
            m1732c(set, false);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1746q() {
        int i = this.f3175D;
        if (i != 0) {
            j22.m2430b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f3192x == null) {
            return;
        }
        j22.m2430b("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: r */
    public final void m1747r(ArrayList arrayList) {
        uk1 uk1Var = this.f3180l;
        go0 go0Var = this.f3174C;
        if (arrayList.size() > 0) {
            ((ui1) ((ow1) arrayList.get(0)).f7862h).getClass();
            AbstractC0752tx.m5443a("Check failed");
        }
        try {
            go0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    go0Var.m1946B(arrayList);
                    go0Var.m1986i();
                } catch (Throwable th) {
                    go0Var.m1970a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!uk1Var.f11340h.m4888g()) {
                    z72 z72Var = this.f3173B;
                    try {
                        z72Var.m6395g(uk1Var, go0Var.m2004z());
                        z72Var.m6391b();
                        z72Var.m6390a();
                    } catch (Throwable th3) {
                        z72Var.m6390a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m1730a();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final c21 m1748s(b62 b62Var, Object obj) {
        C0220fy c0220fy;
        int i = b62Var.f614b;
        if ((i & 2) != 0) {
            b62Var.f614b = i | 4;
        }
        ao0 ao0Var = b62Var.f615c;
        if (ao0Var == null || !ao0Var.m237a()) {
            return c21.f1110h;
        }
        qr2 qr2Var = this.f3181m;
        qr2Var.getClass();
        ao0 ao0Var2 = b62Var.f615c;
        if (ao0Var2 != null && qr2Var.m4276e(up0.m5540e(ao0Var2))) {
            if (b62Var.f616d == null) {
                return c21.f1110h;
            }
            c21 c21VarM1749t = m1749t(b62Var, ao0Var, obj);
            if (c21VarM1749t != c21.f1110h) {
                this.f3172A.m3237m();
            }
            return c21VarM1749t;
        }
        synchronized (this.f3179k) {
            c0220fy = this.f3193y;
        }
        if (c0220fy != null) {
            go0 go0Var = c0220fy.f3174C;
            if (go0Var.f3600F && go0Var.m1973b0(b62Var, obj)) {
                return c21.f1113k;
            }
        }
        return c21.f1110h;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:79:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], EDGE_INSN: B:80:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c21 m1749t(b62 b62Var, ao0 ao0Var, Object obj) {
        synchronized (this.f3179k) {
            try {
                C0220fy c0220fy = this.f3193y;
                C0220fy c0220fy2 = null;
                if (c0220fy != null) {
                    qr2 qr2Var = this.f3181m;
                    int i = this.f3194z;
                    if (qr2Var.f9138n) {
                        AbstractC0752tx.m5443a("Writer is active");
                    }
                    if (i < 0 || i >= qr2Var.f9133i) {
                        AbstractC0752tx.m5443a("Invalid group index");
                    }
                    ao0 ao0VarM5540e = up0.m5540e(ao0Var);
                    if (qr2Var.m4276e(ao0VarM5540e)) {
                        int i2 = qr2Var.f9132h[(i * 5) + 3] + i;
                        int i3 = ao0VarM5540e.f313a;
                        if (i > i3 || i3 >= i2) {
                            c0220fy = null;
                        }
                        c0220fy2 = c0220fy;
                    }
                }
                if (c0220fy2 == null) {
                    go0 go0Var = this.f3174C;
                    if (go0Var.f3600F && go0Var.m1973b0(b62Var, obj)) {
                        return c21.f1113k;
                    }
                    if (obj == null) {
                        this.f3189u.m4511m(b62Var, gd3.f3418E);
                    } else {
                        boolean z = obj instanceof n70;
                        rk1 rk1Var = this.f3189u;
                        if (z) {
                            Object objM4505g = rk1Var.m4505g(b62Var);
                            if (objM4505g == null) {
                                qp0.m4256k(this.f3189u, b62Var, obj);
                            } else if (objM4505g instanceof sk1) {
                                sk1 sk1Var = (sk1) objM4505g;
                                Object[] objArr = sk1Var.f10175b;
                                long[] jArr = sk1Var.f10174a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i4];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                            for (int i6 = 0; i6 < i5; i6++) {
                                                if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == gd3.f3418E) {
                                                    break loop0;
                                                }
                                                j >>= 8;
                                            }
                                            if (i5 != 8) {
                                                break;
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                    qp0.m4256k(this.f3189u, b62Var, obj);
                                }
                            } else if (objM4505g == gd3.f3418E) {
                            }
                        } else {
                            rk1Var.m4511m(b62Var, gd3.f3418E);
                        }
                    }
                }
                if (c0220fy2 != null) {
                    return c0220fy2.m1749t(b62Var, ao0Var, obj);
                }
                this.f3176h.mo1386l(this);
                return this.f3174C.f3600F ? c21.f1112j : c21.f1111i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1750u(Object obj) {
        Object objM4505g = this.f3182n.m4505g(obj);
        if (objM4505g == null) {
            return;
        }
        boolean z = objM4505g instanceof sk1;
        c21 c21Var = c21.f1113k;
        rk1 rk1Var = this.f3188t;
        if (!z) {
            b62 b62Var = (b62) objM4505g;
            if (b62Var.m442b(obj) == c21Var) {
                qp0.m4256k(rk1Var, obj, b62Var);
                return;
            }
            return;
        }
        sk1 sk1Var = (sk1) objM4505g;
        Object[] objArr = sk1Var.f10175b;
        long[] jArr = sk1Var.f10174a;
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
                        b62 b62Var2 = (b62) objArr[(i << 3) + i3];
                        if (b62Var2.m442b(obj) == c21Var) {
                            qp0.m4256k(rk1Var, obj, b62Var2);
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1751v(Set set) {
        boolean z = set instanceof gd2;
        rk1 rk1Var = this.f3185q;
        rk1 rk1Var2 = this.f3182n;
        if (z) {
            sk1 sk1Var = ((gd2) set).f3413h;
            Object[] objArr = sk1Var.f10175b;
            long[] jArr = sk1Var.f10174a;
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
                                if (rk1Var2.m4501c(obj) || rk1Var.m4501c(obj)) {
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
                if (rk1Var2.m4501c(obj2) || rk1Var.m4501c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1752w() {
        synchronized (this.f3179k) {
            sy1 sy1Var = this.f3192x;
            boolean z = false;
            if (sy1Var != null && (sy1Var.f10428h.get() != uy1.f11559l || sy1Var.f10429i != v93.m5656b())) {
                AtomicReference atomicReference = sy1Var.f10428h;
                uy1 uy1Var = uy1.f11560m;
                uy1 uy1Var2 = uy1.f11558k;
                while (!atomicReference.compareAndSet(uy1Var, uy1Var2) && atomicReference.get() == uy1Var) {
                }
                sy1Var.f10432l.f4901h.m6281a(9);
                return false;
            }
            m1743n();
            try {
                rk1 rk1Var = this.f3189u;
                this.f3189u = qp0.m4260o();
                try {
                    go0 go0Var = this.f3174C;
                    sq2 sq2Var = this.f3191w;
                    kv1 kv1Var = go0Var.f3620e.f2145t;
                    if (!kv1Var.m2742W()) {
                        AbstractC0752tx.m5443a("Expected applyChanges() to have been called");
                    }
                    if (rk1Var.f9622e > 0 || !go0Var.f3634s.isEmpty()) {
                        go0Var.f3610P = sq2Var;
                        try {
                            go0Var.m1992n(rk1Var, null);
                            go0Var.f3610P = null;
                            z = !kv1Var.m2742W();
                        } catch (Throwable th) {
                            go0Var.f3610P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        m1744o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.f3189u = rk1Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f3180l.f11340h.m4888g()) {
                        z72 z72Var = this.f3173B;
                        try {
                            z72Var.m6395g(this.f3180l, this.f3174C.m2004z());
                            z72Var.m6391b();
                            z72Var.m6390a();
                        } catch (Throwable th4) {
                            z72Var.m6390a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    m1730a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m1753x(gd2 gd2Var) {
        Object obj;
        while (true) {
            Object obj2 = this.f3178j.get();
            if (obj2 == null || obj2.equals(fg1.f2980h)) {
                obj = gd2Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, gd2Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    C0676s.m4652k("corrupt pendingModifications: ", this.f3178j);
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = gd2Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f3178j;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f3179k) {
                    m1744o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1754y(Object obj) {
        b62 b62VarM2002x;
        int i;
        boolean z;
        int i2;
        go0 go0Var = this.f3174C;
        if (go0Var.f3595A <= 0 && (b62VarM2002x = go0Var.m2002x()) != null) {
            int i3 = b62VarM2002x.f614b | 1;
            b62VarM2002x.f614b = i3;
            if ((i3 & 32) == 0) {
                gk1 gk1Var = b62VarM2002x.f618f;
                if (gk1Var == null) {
                    gk1Var = new gk1();
                    b62VarM2002x.f618f = gk1Var;
                }
                int i4 = b62VarM2002x.f617e;
                int iM1932c = gk1Var.m1932c(obj);
                if (iM1932c < 0) {
                    iM1932c = ~iM1932c;
                    i = -1;
                } else {
                    i = gk1Var.f3554c[iM1932c];
                }
                gk1Var.f3553b[iM1932c] = obj;
                gk1Var.f3554c[iM1932c] = i4;
                z = i == b62VarM2002x.f617e;
            }
            this.f3172A.m3237m();
            if (z) {
                return;
            }
            if (obj instanceof qu2) {
                ((qu2) obj).m4280f(1);
            }
            qp0.m4256k(this.f3182n, obj, b62VarM2002x);
            if (obj instanceof n70) {
                n70 n70Var = (n70) obj;
                m70 m70VarM3254h = n70Var.m3254h();
                rk1 rk1Var = this.f3185q;
                qp0.m4238T(rk1Var, obj);
                gk1 gk1Var2 = m70VarM3254h.f6495e;
                Object[] objArr = gk1Var2.f3553b;
                long[] jArr = gk1Var2.f3552a;
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
                                    pu2 pu2Var = (pu2) objArr[(i5 << 3) + i8];
                                    i2 = i6;
                                    if (pu2Var instanceof qu2) {
                                        ((qu2) pu2Var).m4280f(1);
                                    }
                                    qp0.m4256k(rk1Var, pu2Var, obj);
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
                Object obj2 = m70VarM3254h.f6496f;
                rk1 rk1Var2 = b62VarM2002x.f619g;
                if (rk1Var2 == null) {
                    rk1Var2 = new rk1();
                    b62VarM2002x.f619g = rk1Var2;
                }
                rk1Var2.m4511m(n70Var, obj2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1755z(Object obj) {
        synchronized (this.f3179k) {
            try {
                m1750u(obj);
                Object objM4505g = this.f3185q.m4505g(obj);
                if (objM4505g != null) {
                    if (objM4505g instanceof sk1) {
                        sk1 sk1Var = (sk1) objM4505g;
                        Object[] objArr = sk1Var.f10175b;
                        long[] jArr = sk1Var.f10174a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            m1750u((n70) objArr[(i << 3) + i3]);
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
                        m1750u((n70) objM4505g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
