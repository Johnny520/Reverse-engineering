package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Ih */
/* JADX INFO: loaded from: classes.dex */
public final class C0368Ih extends AbstractC2592uk {

    /* JADX INFO: renamed from: A0 */
    public int f1248A0;

    /* JADX INFO: renamed from: B0 */
    public C0178E5 f1249B0;

    /* JADX INFO: renamed from: C0 */
    public C1496hb f1250C0;

    /* JADX INFO: renamed from: D0 */
    public int f1251D0;

    /* JADX INFO: renamed from: E0 */
    public int f1252E0;

    /* JADX INFO: renamed from: F0 */
    public int f1253F0;

    /* JADX INFO: renamed from: G0 */
    public int f1254G0;

    /* JADX INFO: renamed from: H0 */
    public int f1255H0;

    /* JADX INFO: renamed from: I0 */
    public int f1256I0;

    /* JADX INFO: renamed from: J0 */
    public float f1257J0;

    /* JADX INFO: renamed from: K0 */
    public float f1258K0;

    /* JADX INFO: renamed from: L0 */
    public float f1259L0;

    /* JADX INFO: renamed from: M0 */
    public float f1260M0;

    /* JADX INFO: renamed from: N0 */
    public float f1261N0;

    /* JADX INFO: renamed from: O0 */
    public float f1262O0;

    /* JADX INFO: renamed from: P0 */
    public int f1263P0;

    /* JADX INFO: renamed from: Q0 */
    public int f1264Q0;

    /* JADX INFO: renamed from: R0 */
    public int f1265R0;

    /* JADX INFO: renamed from: S0 */
    public int f1266S0;

    /* JADX INFO: renamed from: T0 */
    public int f1267T0;

    /* JADX INFO: renamed from: U0 */
    public int f1268U0;

    /* JADX INFO: renamed from: V0 */
    public int f1269V0;

    /* JADX INFO: renamed from: W0 */
    public ArrayList f1270W0;

    /* JADX INFO: renamed from: X0 */
    public C2454rb[] f1271X0;

    /* JADX INFO: renamed from: Y0 */
    public C2454rb[] f1272Y0;

    /* JADX INFO: renamed from: Z0 */
    public int[] f1273Z0;

    /* JADX INFO: renamed from: a1 */
    public C2454rb[] f1274a1;

    /* JADX INFO: renamed from: b1 */
    public int f1275b1;

    /* JADX INFO: renamed from: s0 */
    public int f1276s0;

    /* JADX INFO: renamed from: t0 */
    public int f1277t0;

    /* JADX INFO: renamed from: u0 */
    public int f1278u0;

    /* JADX INFO: renamed from: v0 */
    public int f1279v0;

    /* JADX INFO: renamed from: w0 */
    public int f1280w0;

    /* JADX INFO: renamed from: x0 */
    public int f1281x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f1282y0;

    /* JADX INFO: renamed from: z0 */
    public int f1283z0;

    @Override // p000.AbstractC2592uk
    /* JADX INFO: renamed from: S */
    public final void mo809S() {
        for (int i = 0; i < this.f8966r0; i++) {
            C2454rb c2454rb = this.f8965q0[i];
            if (c2454rb != null) {
                c2454rb.f8585F = true;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final int m810T(C2454rb c2454rb, int i) {
        C2454rb c2454rb2;
        if (c2454rb != null) {
            int[] iArr = c2454rb.f8637p0;
            if (iArr[1] == 3) {
                int i2 = c2454rb.f8640s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c2454rb.f8647z * i);
                        if (i3 != c2454rb.m4933k()) {
                            c2454rb.f8618g = true;
                            m812V(iArr[0], c2454rb.m4937q(), 1, i3, c2454rb);
                        }
                        return i3;
                    }
                    c2454rb2 = c2454rb;
                    if (i2 == 1) {
                        return c2454rb2.m4933k();
                    }
                    if (i2 == 3) {
                        return (int) ((c2454rb2.m4937q() * c2454rb2.f8602W) + 0.5f);
                    }
                }
            } else {
                c2454rb2 = c2454rb;
            }
            return c2454rb2.m4933k();
        }
        return 0;
    }

    /* JADX INFO: renamed from: U */
    public final int m811U(C2454rb c2454rb, int i) {
        C2454rb c2454rb2;
        if (c2454rb != null) {
            int[] iArr = c2454rb.f8637p0;
            if (iArr[0] == 3) {
                int i2 = c2454rb.f8639r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c2454rb.f8644w * i);
                        if (i3 != c2454rb.m4937q()) {
                            c2454rb.f8618g = true;
                            m812V(1, i3, iArr[1], c2454rb.m4933k(), c2454rb);
                        }
                        return i3;
                    }
                    c2454rb2 = c2454rb;
                    if (i2 == 1) {
                        return c2454rb2.m4937q();
                    }
                    if (i2 == 3) {
                        return (int) ((c2454rb2.m4933k() * c2454rb2.f8602W) + 0.5f);
                    }
                }
            } else {
                c2454rb2 = c2454rb;
            }
            return c2454rb2.m4937q();
        }
        return 0;
    }

    /* JADX INFO: renamed from: V */
    public final void m812V(int i, int i2, int i3, int i4, C2454rb c2454rb) {
        C1496hb c1496hb;
        C2454rb c2454rb2;
        C0178E5 c0178e5 = this.f1249B0;
        while (true) {
            c1496hb = this.f1250C0;
            if (c1496hb != null || (c2454rb2 = this.f8599T) == null) {
                break;
            } else {
                this.f1250C0 = ((C2497sb) c2454rb2).f8778u0;
            }
        }
        c0178e5.f520a = i;
        c0178e5.f521b = i3;
        c0178e5.f522c = i2;
        c0178e5.f523d = i4;
        c1496hb.m2865b(c2454rb, c0178e5);
        c2454rb.m4924O(c0178e5.f524e);
        c2454rb.m4921L(c0178e5.f525f);
        c2454rb.f8584E = c0178e5.f527h;
        c2454rb.m4918I(c0178e5.f526g);
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: b */
    public final void mo813b(C2244mo c2244mo, boolean z) {
        C2454rb c2454rb;
        float f;
        int i;
        ArrayList arrayList = this.f1270W0;
        super.mo813b(c2244mo, z);
        C2454rb c2454rb2 = this.f8599T;
        boolean z2 = c2454rb2 != null && ((C2497sb) c2454rb2).f8779v0;
        int i2 = this.f1267T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((C0325Hh) arrayList.get(i3)).m689b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((C0325Hh) arrayList.get(i4)).m689b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f1273Z0 != null && this.f1272Y0 != null && this.f1271X0 != null) {
                for (int i5 = 0; i5 < this.f1275b1; i5++) {
                    this.f1274a1[i5].m4915D();
                }
                int[] iArr = this.f1273Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.f1257J0;
                C2454rb c2454rb3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.f1257J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    C2454rb c2454rb4 = this.f1272Y0[i];
                    if (c2454rb4 != null) {
                        C1259cb c1259cb = c2454rb4.f8588I;
                        if (c2454rb4.f8619g0 != 8) {
                            if (i8 == 0) {
                                c2454rb4.m4929f(c1259cb, this.f8588I, this.f1280w0);
                                c2454rb4.f8623i0 = this.f1251D0;
                                c2454rb4.f8613d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                c2454rb4.m4929f(c2454rb4.f8590K, this.f8590K, this.f1281x0);
                            }
                            if (i8 > 0 && c2454rb3 != null) {
                                C1259cb c1259cb2 = c2454rb3.f8590K;
                                c2454rb4.m4929f(c1259cb, c1259cb2, this.f1263P0);
                                c2454rb3.m4929f(c1259cb2, c1259cb, 0);
                            }
                            c2454rb3 = c2454rb4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    C2454rb c2454rb5 = this.f1271X0[i9];
                    if (c2454rb5 != null) {
                        C1259cb c1259cb3 = c2454rb5.f8589J;
                        if (c2454rb5.f8619g0 != 8) {
                            if (i9 == 0) {
                                c2454rb5.m4929f(c1259cb3, this.f8589J, this.f1276s0);
                                c2454rb5.f8625j0 = this.f1252E0;
                                c2454rb5.f8615e0 = this.f1258K0;
                            }
                            if (i9 == i7 - 1) {
                                c2454rb5.m4929f(c2454rb5.f8591L, this.f8591L, this.f1277t0);
                            }
                            if (i9 > 0 && c2454rb3 != null) {
                                C1259cb c1259cb4 = c2454rb3.f8591L;
                                c2454rb5.m4929f(c1259cb3, c1259cb4, this.f1264Q0);
                                c2454rb3.m4929f(c1259cb4, c1259cb3, 0);
                            }
                            c2454rb3 = c2454rb5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.f1269V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        C2454rb[] c2454rbArr = this.f1274a1;
                        if (i12 < c2454rbArr.length && (c2454rb = c2454rbArr[i12]) != null && c2454rb.f8619g0 != 8) {
                            C2454rb c2454rb6 = this.f1272Y0[i10];
                            C2454rb c2454rb7 = this.f1271X0[i11];
                            if (c2454rb != c2454rb6) {
                                c2454rb.m4929f(c2454rb.f8588I, c2454rb6.f8588I, 0);
                                c2454rb.m4929f(c2454rb.f8590K, c2454rb6.f8590K, 0);
                            }
                            if (c2454rb != c2454rb7) {
                                c2454rb.m4929f(c2454rb.f8589J, c2454rb7.f8589J, 0);
                                c2454rb.m4929f(c2454rb.f8591L, c2454rb7.f8591L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C0325Hh) arrayList.get(0)).m689b(0, z2, true);
        }
        this.f1282y0 = false;
    }
}
