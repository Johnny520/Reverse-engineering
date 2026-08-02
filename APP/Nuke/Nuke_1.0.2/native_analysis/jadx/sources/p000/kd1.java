package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kd1 extends sz1 implements pf1, ki1 {

    /* JADX INFO: renamed from: m */
    public hd1 f5463m;

    /* JADX INFO: renamed from: n */
    public in0 f5464n;

    /* JADX INFO: renamed from: o */
    public uz1 f5465o;

    /* JADX INFO: renamed from: p */
    public boolean f5466p;

    /* JADX INFO: renamed from: q */
    public boolean f5467q;

    /* JADX INFO: renamed from: r */
    public boolean f5468r;

    /* JADX INFO: renamed from: s */
    public final ld1 f5469s = new ld1(0, this);

    /* JADX INFO: renamed from: t */
    public qb2 f5470t;

    /* JADX INFO: renamed from: u */
    public rk1 f5471u;

    /* JADX INFO: renamed from: E0 */
    public static void m2629E0(zn1 zn1Var) {
        s61 s61Var;
        zn1 zn1Var2 = zn1Var.f13986w;
        r61 r61Var = zn1Var.f13985v;
        if (!t11.m5086l(zn1Var2 != null ? zn1Var2.f13985v : null, r61Var)) {
            r61Var.f9373N.f11795p.f6604D.m4743f();
            return;
        }
        InterfaceC0835w5 interfaceC0835w5Mo3078p = r61Var.f9373N.f11795p.mo3078p();
        if (interfaceC0835w5Mo3078p == null || (s61Var = ((mf1) interfaceC0835w5Mo3078p).f6604D) == null) {
            return;
        }
        s61Var.m4743f();
    }

    /* JADX INFO: renamed from: A0 */
    public abstract of1 mo2630A0();

    /* JADX INFO: renamed from: B0 */
    public abstract kd1 mo2631B0();

    /* JADX INFO: renamed from: C0 */
    public abstract long mo2632C0();

    /* JADX INFO: renamed from: D0 */
    public final hd1 m2633D0() {
        hd1 hd1Var = this.f5463m;
        if (hd1Var != null) {
            return hd1Var;
        }
        hd1 hd1Var2 = new hd1(this);
        this.f5463m = hd1Var2;
        return hd1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F0 */
    public final void m2634F0(sk1 sk1Var) {
        r61 r61Var;
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
                    if ((255 & j) < 128 && (r61Var = (r61) ((od3) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo699u()) {
                            r61Var.m4361S(false);
                        } else {
                            r61Var.m4362U(false);
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

    /* JADX INFO: renamed from: G0 */
    public abstract void mo2635G0();

    @Override // p000.pf1
    /* JADX INFO: renamed from: S */
    public final of1 mo691S(int i, int i2, Map map, in0 in0Var, in0 in0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            kz0.m2764b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new jd1(i, i2, map, in0Var, in0Var2, this);
    }

    @Override // p000.ki1
    /* JADX INFO: renamed from: l */
    public final void mo2636l(boolean z) {
        kd1 kd1VarMo2631B0 = mo2631B0();
        r61 r61VarMo2644w0 = kd1VarMo2631B0 != null ? kd1VarMo2631B0.mo2644w0() : null;
        if (t11.m5086l(r61VarMo2644w0, mo2644w0())) {
            this.f5466p = z;
            return;
        }
        if ((r61VarMo2644w0 != null ? r61VarMo2644w0.f9373N.f11783d : null) != n61.f7020j) {
            if ((r61VarMo2644w0 != null ? r61VarMo2644w0.f9373N.f11783d : null) != n61.f7021k) {
                return;
            }
        }
        this.f5466p = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX INFO: renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2637l0(r61 r61Var, gu0 gu0Var) {
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
        rk1 rk1Var = this.f5471u;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (rk1Var != null) {
            Object[] objArr = rk1Var.f9620c;
            long[] jArr3 = rk1Var.f9618a;
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
                                Object[] objArr2 = sk1Var.f10175b;
                                long[] jArr4 = sk1Var.f10174a;
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
                                                        boolean zM4350H = r61Var2.m4350H();
                                                        i4 = i8;
                                                        if (zM4350H) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    sk1Var.m4894m(i14);
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
        rk1 rk1Var2 = this.f5471u;
        if (rk1Var2 != null) {
            long[] jArr5 = rk1Var2.f9618a;
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
                                if (((sk1) rk1Var2.f9620c[i18]).m4888g()) {
                                    rk1Var2.m4510l(i18);
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
        rk1 rk1Var3 = this.f5471u;
        if (rk1Var3 == null) {
            rk1Var3 = new rk1();
            this.f5471u = rk1Var3;
        }
        Object objM4505g = rk1Var3.m4505g(gu0Var);
        if (objM4505g == null) {
            objM4505g = new sk1();
            rk1Var3.m4511m(gu0Var, objM4505g);
        }
        ((sk1) objM4505g).m4892k(new od3(r61Var));
    }

    /* JADX INFO: renamed from: m0 */
    public abstract int mo2610m0(du0 du0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final void m2638n0(uz1 uz1Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        r61 r61Var;
        int i;
        char c2;
        long j6;
        kd1 kd1VarMo2631B0;
        bw1 snapshotObserver;
        rk1 rk1Var = this.f5471u;
        qb2 qb2Var = this.f5470t;
        if (qb2Var == null) {
            qb2Var = new qb2();
            this.f5470t = qb2Var;
        }
        qb2 qb2Var2 = qb2Var;
        zv1 zv1Var = mo2644w0().f9397u;
        if (zv1Var != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var).getSnapshotObserver()) != null) {
            snapshotObserver.f1051a.m5436c(uz1Var, oq0.f7774l, new id1(this, j, j2, uz1Var));
        }
        boolean zMo699u = mo699u();
        sk1 sk1Var = (sk1) qb2Var2.f8878f;
        sk1 sk1Var2 = (sk1) qb2Var2.f8879g;
        int i2 = qb2Var2.f8874b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) qb2Var2.f8877e)[i3];
            if (b == 3) {
                gu0 gu0Var = ((gu0[]) qb2Var2.f8875c)[i3];
                gu0Var.getClass();
                sk1Var2.m4892k(gu0Var);
            } else if (b != 0 && rk1Var != null) {
                gu0 gu0Var2 = ((gu0[]) qb2Var2.f8875c)[i3];
                gu0Var2.getClass();
                sk1 sk1Var3 = (sk1) rk1Var.m4509k(gu0Var2);
                if (sk1Var3 != null) {
                    sk1Var.m4891j(sk1Var3);
                }
            }
        }
        int i4 = qb2Var2.f8874b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) qb2Var2.f8877e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                gu0[] gu0VarArr = (gu0[]) qb2Var2.f8875c;
                gu0VarArr[i6 - i5] = gu0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = qb2Var2.f8874b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((gu0[]) qb2Var2.f8875c)[i8] = null;
        }
        qb2Var2.f8874b -= i5;
        kd1 kd1VarMo2631B02 = mo2631B0();
        Object[] objArr = sk1Var2.f10175b;
        long[] jArr = sk1Var2.f10174a;
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
                            kd1 kd1Var = kd1VarMo2631B02 == null ? this : kd1VarMo2631B02;
                            i = i9;
                            kd1 kd1Var2 = kd1Var;
                            while (true) {
                                qb2 qb2Var3 = kd1Var2.f5470t;
                                if ((qb2Var3 != null && AbstractC0460mg.m3100o0((gu0[]) qb2Var3.f8875c, gu0Var3) >= 0) || (kd1VarMo2631B0 = kd1Var2.mo2631B0()) == null) {
                                    break;
                                } else {
                                    kd1Var2 = kd1VarMo2631B0;
                                }
                            }
                            rk1 rk1Var2 = kd1Var2.f5471u;
                            sk1 sk1Var4 = rk1Var2 != null ? (sk1) rk1Var2.m4509k(gu0Var3) : null;
                            if (sk1Var4 != null) {
                                kd1Var.m2634F0(sk1Var4);
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
        sk1Var2.m4883b();
        Object[] objArr2 = sk1Var.f10175b;
        long[] jArr2 = sk1Var.f10174a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (r61Var = (r61) ((od3) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zMo699u) {
                                r61Var.m4361S(false);
                            } else {
                                r61Var.m4362U(false);
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
        sk1Var.m4883b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX INFO: renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2639o0(of1 of1Var) {
        long j;
        long j2;
        rk1 rk1Var = this.f5471u;
        if (this.f5468r) {
            return;
        }
        in0 in0VarMo107d = of1Var.mo107d();
        if (in0VarMo107d != null) {
            boolean z = this.f5464n != in0VarMo107d;
            if (z || !m2633D0().f3957h) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                c61 c61VarMo2642t0 = mo2642t0();
                long jM5346J = tp0.m5346J(c61VarMo2642t0.mo647c(0L));
                long jMo645L = c61VarMo2642t0.mo645L();
                j2 = jM5346J;
                j = jMo645L;
                z = (z01.m6371a(jM5346J, m2633D0().f3958i) && h11.m2041a(jMo645L, m2633D0().f3959j)) ? false : true;
            }
            if (z) {
                uz1 uz1Var = this.f5465o;
                if (uz1Var != null) {
                    uz1Var.f11567h = of1Var;
                } else {
                    uz1Var = new uz1(of1Var, this);
                    this.f5465o = uz1Var;
                }
                m2638n0(uz1Var, j2, j);
                this.f5464n = of1Var.mo107d();
                return;
            }
            return;
        }
        if (rk1Var != null) {
            Object[] objArr = rk1Var.f9620c;
            long[] jArr = rk1Var.f9618a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                m2634F0((sk1) objArr[(i << 3) + i3]);
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
            rk1Var.m4499a();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final int m2640q0(du0 du0Var) {
        int iMo2610m0;
        if (mo2643v0() && (iMo2610m0 = mo2610m0(du0Var)) != Integer.MIN_VALUE) {
            return iMo2610m0 + ((int) (this.f10442l & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: r0 */
    public abstract kd1 mo2641r0();

    /* JADX INFO: renamed from: t0 */
    public abstract c61 mo2642t0();

    @Override // p000.m11
    /* JADX INFO: renamed from: u */
    public boolean mo699u() {
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public abstract boolean mo2643v0();

    /* JADX INFO: renamed from: w0 */
    public abstract r61 mo2644w0();
}
