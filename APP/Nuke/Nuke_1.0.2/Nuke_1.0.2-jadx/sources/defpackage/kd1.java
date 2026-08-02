package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kd1 extends sz1 implements pf1, ki1 {
    public hd1 m;
    public in0 n;
    public uz1 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final ld1 s = new ld1(0, this);
    public qb2 t;
    public rk1 u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void E0(zn1 zn1Var) {
        s61 s61Var;
        zn1 zn1Var2 = zn1Var.w;
        r61 r61Var = zn1Var.v;
        if (!t11.l(zn1Var2 != null ? zn1Var2.v : null, r61Var)) {
            r61Var.N.p.D.f();
            return;
        }
        w5 w5VarP = r61Var.N.p.p();
        if (w5VarP == null || (s61Var = ((mf1) w5VarP).D) == null) {
            return;
        }
        s61Var.f();
    }

    public abstract of1 A0();

    public abstract kd1 B0();

    public abstract long C0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final hd1 D0() {
        hd1 hd1Var = this.m;
        if (hd1Var != null) {
            return hd1Var;
        }
        hd1 hd1Var2 = new hd1(this);
        this.m = hd1Var2;
        return hd1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void F0(sk1 sk1Var) {
        r61 r61Var;
        Object[] objArr = sk1Var.b;
        long[] jArr = sk1Var.a;
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
                    if ((255 & j) < 128 && (r61Var = (r61) ((od3) objArr[(i << 3) + i3]).get()) != null) {
                        if (u()) {
                            r61Var.S(false);
                        } else {
                            r61Var.U(false);
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

    public abstract void G0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pf1
    public final of1 S(int i, int i2, Map map, in0 in0Var, in0 in0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            kz0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new jd1(i, i2, map, in0Var, in0Var2, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ki1
    public final void l(boolean z) {
        kd1 kd1VarB0 = B0();
        r61 r61VarW0 = kd1VarB0 != null ? kd1VarB0.w0() : null;
        if (t11.l(r61VarW0, w0())) {
            this.p = z;
            return;
        }
        if ((r61VarW0 != null ? r61VarW0.N.d : null) != n61.j) {
            if ((r61VarW0 != null ? r61VarW0.N.d : null) != n61.k) {
                return;
            }
        }
        this.p = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r29v12, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(r61 r61Var, gu0 gu0Var) {
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
        rk1 rk1Var = this.u;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (rk1Var != null) {
            Object[] objArr = rk1Var.c;
            long[] jArr3 = rk1Var.a;
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
                                sk1 sk1Var = (sk1) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = sk1Var.b;
                                long[] jArr4 = sk1Var.a;
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
                                                    r61 r61Var2 = (r61) ((od3) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (r61Var2 != null) {
                                                        boolean zH = r61Var2.H();
                                                        i4 = i8;
                                                        if (zH) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    sk1Var.m(i14);
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
        rk1 rk1Var2 = this.u;
        if (rk1Var2 != null) {
            long[] jArr5 = rk1Var2.a;
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
                                if (((sk1) rk1Var2.c[i18]).g()) {
                                    rk1Var2.l(i18);
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
        rk1 rk1Var3 = this.u;
        if (rk1Var3 == null) {
            rk1Var3 = new rk1();
            this.u = rk1Var3;
        }
        Object objG = rk1Var3.g(gu0Var);
        if (objG == null) {
            objG = new sk1();
            rk1Var3.m(gu0Var, objG);
        }
        ((sk1) objG).k(new od3(r61Var));
    }

    public abstract int m0(du0 du0Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(uz1 uz1Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        r61 r61Var;
        int i;
        char c2;
        long j6;
        kd1 kd1VarB0;
        bw1 snapshotObserver;
        rk1 rk1Var = this.u;
        qb2 qb2Var = this.t;
        if (qb2Var == null) {
            qb2Var = new qb2();
            this.t = qb2Var;
        }
        qb2 qb2Var2 = qb2Var;
        zv1 zv1Var = w0().u;
        if (zv1Var != null && (snapshotObserver = ((b7) zv1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.c(uz1Var, oq0.l, new id1(this, j, j2, uz1Var));
        }
        boolean zU = u();
        sk1 sk1Var = (sk1) qb2Var2.f;
        sk1 sk1Var2 = (sk1) qb2Var2.g;
        int i2 = qb2Var2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) qb2Var2.e)[i3];
            if (b == 3) {
                gu0 gu0Var = ((gu0[]) qb2Var2.c)[i3];
                gu0Var.getClass();
                sk1Var2.k(gu0Var);
            } else if (b != 0 && rk1Var != null) {
                gu0 gu0Var2 = ((gu0[]) qb2Var2.c)[i3];
                gu0Var2.getClass();
                sk1 sk1Var3 = (sk1) rk1Var.k(gu0Var2);
                if (sk1Var3 != null) {
                    sk1Var.j(sk1Var3);
                }
            }
        }
        int i4 = qb2Var2.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) qb2Var2.e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                gu0[] gu0VarArr = (gu0[]) qb2Var2.c;
                gu0VarArr[i6 - i5] = gu0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = qb2Var2.b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((gu0[]) qb2Var2.c)[i8] = null;
        }
        qb2Var2.b -= i5;
        kd1 kd1VarB02 = B0();
        Object[] objArr = sk1Var2.b;
        long[] jArr = sk1Var2.a;
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
                            gu0 gu0Var3 = (gu0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            kd1 kd1Var = kd1VarB02 == null ? this : kd1VarB02;
                            i = i9;
                            kd1 kd1Var2 = kd1Var;
                            while (true) {
                                qb2 qb2Var3 = kd1Var2.t;
                                if ((qb2Var3 != null && mg.o0((gu0[]) qb2Var3.c, gu0Var3) >= 0) || (kd1VarB0 = kd1Var2.B0()) == null) {
                                    break;
                                } else {
                                    kd1Var2 = kd1VarB0;
                                }
                            }
                            rk1 rk1Var2 = kd1Var2.u;
                            sk1 sk1Var4 = rk1Var2 != null ? (sk1) rk1Var2.k(gu0Var3) : null;
                            if (sk1Var4 != null) {
                                kd1Var.F0(sk1Var4);
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
        sk1Var2.b();
        Object[] objArr2 = sk1Var.b;
        long[] jArr2 = sk1Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (r61Var = (r61) ((od3) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zU) {
                                r61Var.S(false);
                            } else {
                                r61Var.U(false);
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
        sk1Var.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(of1 of1Var) {
        long j;
        long j2;
        rk1 rk1Var = this.u;
        if (this.r) {
            return;
        }
        in0 in0VarD = of1Var.d();
        if (in0VarD != null) {
            boolean z = this.n != in0VarD;
            if (z || !D0().h) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                c61 c61VarT0 = t0();
                long J = tp0.J(c61VarT0.c(0L));
                long jL = c61VarT0.L();
                j2 = J;
                j = jL;
                z = (z01.a(J, D0().i) && h11.a(jL, D0().j)) ? false : true;
            }
            if (z) {
                uz1 uz1Var = this.o;
                if (uz1Var != null) {
                    uz1Var.h = of1Var;
                } else {
                    uz1Var = new uz1(of1Var, this);
                    this.o = uz1Var;
                }
                n0(uz1Var, j2, j);
                this.n = of1Var.d();
                return;
            }
            return;
        }
        if (rk1Var != null) {
            Object[] objArr = rk1Var.c;
            long[] jArr = rk1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                F0((sk1) objArr[(i << 3) + i3]);
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
            rk1Var.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q0(du0 du0Var) {
        int iM0;
        if (v0() && (iM0 = m0(du0Var)) != Integer.MIN_VALUE) {
            return iM0 + ((int) (this.l & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract kd1 r0();

    public abstract c61 t0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m11
    public boolean u() {
        return false;
    }

    public abstract boolean v0();

    public abstract r61 w0();
}
