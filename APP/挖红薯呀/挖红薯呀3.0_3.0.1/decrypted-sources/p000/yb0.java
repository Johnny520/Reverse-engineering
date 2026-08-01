package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yb0 extends xq0 implements zd0, cg0 {

    /* JADX INFO: renamed from: i */
    public vb0 f7592i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0742sw f7593j;

    /* JADX INFO: renamed from: k */
    public zq0 f7594k;

    /* JADX INFO: renamed from: l */
    public boolean f7595l;

    /* JADX INFO: renamed from: m */
    public boolean f7596m;

    /* JADX INFO: renamed from: n */
    public boolean f7597n;

    /* JADX INFO: renamed from: o */
    public final zb0 f7598o = new zb0(0, this);

    /* JADX INFO: renamed from: p */
    public lw0 f7599p;

    /* JADX INFO: renamed from: q */
    public jh0 f7600q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static void m5231s0(qj0 qj0Var) {
        c60 c60Var;
        qj0 qj0Var2 = qj0Var.f5181s;
        b60 b60Var = qj0Var.f5180r;
        if (!p30.m3002l(qj0Var2 != null ? qj0Var2.f5180r : null, b60Var)) {
            b60Var.f396J.f1607p.f7112z.m496f();
            return;
        }
        InterfaceC0749t2 interfaceC0749t2Mo841s = b60Var.f396J.f1607p.mo841s();
        if (interfaceC0749t2Mo841s == null || (c60Var = ((wd0) interfaceC0749t2Mo841s).f7112z) == null) {
            return;
        }
        c60Var.m496f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zd0
    /* JADX INFO: renamed from: E */
    public final yd0 mo1278E(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            w10.m4824b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new xb0(i, i2, map, interfaceC0742sw, interfaceC0742sw2, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r29v12, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX INFO: renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5232b0(b60 b60Var, C0190ez c0190ez) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        jh0 jh0Var = this.f7600q;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (jh0Var != null) {
            Object[] objArr = jh0Var.f2880c;
            long[] jArr3 = jh0Var.f2878a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                kh0 kh0Var = (kh0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = kh0Var.f3151b;
                                long[] jArr4 = kh0Var.f3150a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    b60 b60Var2 = (b60) ((ad1) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (b60Var2 != null) {
                                                        boolean zM272H = b60Var2.m272H();
                                                        i4 = i8;
                                                        if (zM272H) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    kh0Var.m1902m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        }
        jh0 jh0Var2 = this.f7600q;
        if (jh0Var2 != null) {
            long[] jArr5 = jh0Var2.f2878a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((kh0) jh0Var2.f2880c[i18]).m1896g()) {
                                    jh0Var2.m1706l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        jh0 jh0Var3 = this.f7600q;
        if (jh0Var3 == null) {
            jh0Var3 = new jh0();
            this.f7600q = jh0Var3;
        }
        Object objM1701g = jh0Var3.m1701g(c0190ez);
        if (objM1701g == null) {
            objM1701g = new kh0();
            jh0Var3.m1707m(c0190ez, objM1701g);
        }
        ((kh0) objM1701g).m1900k(new ad1(b60Var));
    }

    /* JADX INFO: renamed from: c0 */
    public abstract int mo234c0(AbstractC0535o2 abstractC0535o2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public final void m5233d0(zq0 zq0Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        b60 b60Var;
        int i;
        char c2;
        long j6;
        yb0 yb0VarMo57p0;
        fn0 snapshotObserver;
        jh0 jh0Var = this.f7600q;
        lw0 lw0Var = this.f7599p;
        if (lw0Var == null) {
            lw0Var = new lw0();
            this.f7599p = lw0Var;
        }
        lw0 lw0Var2 = lw0Var;
        dn0 dn0Var = mo55n0().f419r;
        if (dn0Var != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var).getSnapshotObserver()) != null) {
            snapshotObserver.f1778a.m777b(zq0Var, C0601p3.f4725s, new wb0(this, j, j2, zq0Var));
        }
        boolean zMo53m = mo53m();
        kh0 kh0Var = lw0Var2.f3610e;
        kh0 kh0Var2 = lw0Var2.f3611f;
        int i2 = lw0Var2.f3606a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = lw0Var2.f3609d[i3];
            if (b == 3) {
                C0190ez c0190ez = lw0Var2.f3607b[i3];
                c0190ez.getClass();
                kh0Var2.m1900k(c0190ez);
            } else if (b != 0 && jh0Var != null) {
                C0190ez c0190ez2 = lw0Var2.f3607b[i3];
                c0190ez2.getClass();
                kh0 kh0Var3 = (kh0) jh0Var.m1705k(c0190ez2);
                if (kh0Var3 != null) {
                    kh0Var.m1899j(kh0Var3);
                }
            }
        }
        int i4 = lw0Var2.f3606a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = lw0Var2.f3609d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                C0190ez[] c0190ezArr = lw0Var2.f3607b;
                c0190ezArr[i6 - i5] = c0190ezArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = lw0Var2.f3606a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            lw0Var2.f3607b[i8] = null;
        }
        lw0Var2.f3606a -= i5;
        yb0 yb0VarMo57p02 = mo57p0();
        Object[] objArr = kh0Var2.f3151b;
        long[] jArr = kh0Var2.f3150a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            C0190ez c0190ez3 = (C0190ez) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            yb0 yb0Var = yb0VarMo57p02 == null ? this : yb0VarMo57p02;
                            i = i9;
                            yb0 yb0Var2 = yb0Var;
                            while (true) {
                                lw0 lw0Var3 = yb0Var2.f7599p;
                                if ((lw0Var3 != null && AbstractC0201f9.m1066l0(lw0Var3.f3607b, c0190ez3) >= 0) || (yb0VarMo57p0 = yb0Var2.mo57p0()) == null) {
                                    break;
                                } else {
                                    yb0Var2 = yb0VarMo57p0;
                                }
                            }
                            jh0 jh0Var2 = yb0Var2.f7600q;
                            kh0 kh0Var4 = jh0Var2 != null ? (kh0) jh0Var2.m1705k(c0190ez3) : null;
                            if (kh0Var4 != null) {
                                yb0Var.m5237t0(kh0Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        kh0Var2.m1891b();
        Object[] objArr2 = kh0Var.f3151b;
        long[] jArr2 = kh0Var.f3150a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (b60Var = (b60) ((ad1) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zMo53m) {
                                b60Var.m284U(false);
                            } else {
                                b60Var.m285W(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        kh0Var.m1891b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX INFO: renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5234e0(yd0 yd0Var) {
        long j;
        long j2;
        jh0 jh0Var = this.f7600q;
        if (this.f7597n) {
            return;
        }
        InterfaceC0742sw interfaceC0742swMo1678d = yd0Var.mo1678d();
        if (interfaceC0742swMo1678d != null) {
            boolean z = this.f7593j != interfaceC0742swMo1678d;
            if (z || !m5236r0().f6647d) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                i50 i50VarMo52l0 = mo52l0();
                long jM1518D = AbstractC0307i4.m1518D(i50VarMo52l0.mo344d(0L));
                long jMo342G = i50VarMo52l0.mo342G();
                j2 = jM1518D;
                j = jMo342G;
                z = (w20.m4833a(jM1518D, m5236r0().f6648e) && d30.m628a(jMo342G, m5236r0().f6649f)) ? false : true;
            }
            if (z) {
                zq0 zq0Var = this.f7594k;
                if (zq0Var != null) {
                    zq0Var.f7984d = yd0Var;
                } else {
                    zq0Var = new zq0(yd0Var, this);
                    this.f7594k = zq0Var;
                }
                m5233d0(zq0Var, j2, j);
                this.f7593j = yd0Var.mo1678d();
                return;
            }
            return;
        }
        if (jh0Var != null) {
            Object[] objArr = jh0Var.f2880c;
            long[] jArr = jh0Var.f2878a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                m5237t0((kh0) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
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
            jh0Var.m1695a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final int m5235g0(AbstractC0535o2 abstractC0535o2) {
        int iMo234c0;
        if (!mo54m0() || (iMo234c0 = mo234c0(abstractC0535o2)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = abstractC0535o2 instanceof ac1;
        long j = this.f7404h;
        return iMo234c0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    /* JADX INFO: renamed from: k0 */
    public abstract yb0 mo51k0();

    /* JADX INFO: renamed from: l0 */
    public abstract i50 mo52l0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public boolean mo53m() {
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public abstract boolean mo54m0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.cg0
    /* JADX INFO: renamed from: n */
    public final void mo530n(boolean z) {
        yb0 yb0VarMo57p0 = mo57p0();
        b60 b60VarMo55n0 = yb0VarMo57p0 != null ? yb0VarMo57p0.mo55n0() : null;
        if (p30.m3002l(b60VarMo55n0, mo55n0())) {
            this.f7595l = z;
            return;
        }
        if ((b60VarMo55n0 != null ? b60VarMo55n0.f396J.f1595d : null) != x50.f7266f) {
            if ((b60VarMo55n0 != null ? b60VarMo55n0.f396J.f1595d : null) != x50.f7267g) {
                return;
            }
        }
        this.f7595l = z;
    }

    /* JADX INFO: renamed from: n0 */
    public abstract b60 mo55n0();

    /* JADX INFO: renamed from: o0 */
    public abstract yd0 mo56o0();

    /* JADX INFO: renamed from: p0 */
    public abstract yb0 mo57p0();

    /* JADX INFO: renamed from: q0 */
    public abstract long mo58q0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public final vb0 m5236r0() {
        vb0 vb0Var = this.f7592i;
        if (vb0Var != null) {
            return vb0Var;
        }
        vb0 vb0Var2 = new vb0(this);
        this.f7592i = vb0Var2;
        return vb0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final void m5237t0(kh0 kh0Var) {
        b60 b60Var;
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
                    if ((255 & j) < 128 && (b60Var = (b60) ((ad1) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo53m()) {
                            b60Var.m284U(false);
                        } else {
                            b60Var.m285W(false);
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

    /* JADX INFO: renamed from: u0 */
    public abstract void mo59u0();
}
