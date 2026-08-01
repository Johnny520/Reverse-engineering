package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: tk */
/* JADX INFO: loaded from: classes.dex */
public final class C0747tk extends AbstractC0714so {

    /* JADX INFO: renamed from: A0 */
    public float f4529A0;

    /* JADX INFO: renamed from: B0 */
    public float f4530B0;

    /* JADX INFO: renamed from: C0 */
    public int f4531C0;

    /* JADX INFO: renamed from: D0 */
    public int f4532D0;

    /* JADX INFO: renamed from: E0 */
    public int f4533E0;

    /* JADX INFO: renamed from: F0 */
    public int f4534F0;

    /* JADX INFO: renamed from: G0 */
    public int f4535G0;

    /* JADX INFO: renamed from: H0 */
    public int f4536H0;

    /* JADX INFO: renamed from: I0 */
    public int f4537I0;

    /* JADX INFO: renamed from: J0 */
    public ArrayList f4538J0;

    /* JADX INFO: renamed from: K0 */
    public C0925yc[] f4539K0;

    /* JADX INFO: renamed from: L0 */
    public C0925yc[] f4540L0;

    /* JADX INFO: renamed from: M0 */
    public int[] f4541M0;

    /* JADX INFO: renamed from: N0 */
    public C0925yc[] f4542N0;

    /* JADX INFO: renamed from: O0 */
    public int f4543O0;

    /* JADX INFO: renamed from: f0 */
    public int f4544f0;

    /* JADX INFO: renamed from: g0 */
    public int f4545g0;

    /* JADX INFO: renamed from: h0 */
    public int f4546h0;

    /* JADX INFO: renamed from: i0 */
    public int f4547i0;

    /* JADX INFO: renamed from: j0 */
    public int f4548j0;

    /* JADX INFO: renamed from: k0 */
    public int f4549k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f4550l0;

    /* JADX INFO: renamed from: m0 */
    public int f4551m0;

    /* JADX INFO: renamed from: n0 */
    public int f4552n0;

    /* JADX INFO: renamed from: o0 */
    public C0771u7 f4553o0;

    /* JADX INFO: renamed from: p0 */
    public C0628qc f4554p0;

    /* JADX INFO: renamed from: q0 */
    public int f4555q0;

    /* JADX INFO: renamed from: r0 */
    public int f4556r0;

    /* JADX INFO: renamed from: s0 */
    public int f4557s0;

    /* JADX INFO: renamed from: t0 */
    public int f4558t0;

    /* JADX INFO: renamed from: u0 */
    public int f4559u0;

    /* JADX INFO: renamed from: v0 */
    public int f4560v0;

    /* JADX INFO: renamed from: w0 */
    public float f4561w0;

    /* JADX INFO: renamed from: x0 */
    public float f4562x0;

    /* JADX INFO: renamed from: y0 */
    public float f4563y0;

    /* JADX INFO: renamed from: z0 */
    public float f4564z0;

    @Override // p000.AbstractC0714so
    /* JADX INFO: renamed from: B */
    public final void mo2382B() {
        for (int i = 0; i < this.f4357e0; i++) {
            C0925yc c0925yc = this.f4356d0[i];
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m2414C(C0925yc c0925yc, int i) {
        C0925yc c0925yc2;
        if (c0925yc != null) {
            int[] iArr = c0925yc.f5402c0;
            if (iArr[1] == 3) {
                int i2 = c0925yc.f5410k;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c0925yc.f5417r * i);
                        if (i3 != c0925yc.m2746i()) {
                            m2416E(iArr[0], c0925yc.m2749l(), 1, i3, c0925yc);
                        }
                        return i3;
                    }
                    c0925yc2 = c0925yc;
                    if (i2 == 1) {
                        return c0925yc2.m2746i();
                    }
                    if (i2 == 3) {
                        return (int) ((c0925yc2.m2749l() * c0925yc2.f5382L) + 0.5f);
                    }
                }
            } else {
                c0925yc2 = c0925yc;
            }
            return c0925yc2.m2746i();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public final int m2415D(C0925yc c0925yc, int i) {
        C0925yc c0925yc2;
        if (c0925yc != null) {
            int[] iArr = c0925yc.f5402c0;
            if (iArr[0] == 3) {
                int i2 = c0925yc.f5409j;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c0925yc.f5414o * i);
                        if (i3 != c0925yc.m2749l()) {
                            m2416E(1, i3, iArr[1], c0925yc.m2746i(), c0925yc);
                        }
                        return i3;
                    }
                    c0925yc2 = c0925yc;
                    if (i2 == 1) {
                        return c0925yc2.m2749l();
                    }
                    if (i2 == 3) {
                        return (int) ((c0925yc2.m2746i() * c0925yc2.f5382L) + 0.5f);
                    }
                }
            } else {
                c0925yc2 = c0925yc;
            }
            return c0925yc2.m2749l();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final void m2416E(int i, int i2, int i3, int i4, C0925yc c0925yc) {
        C0628qc c0628qc;
        C0925yc c0925yc2;
        C0771u7 c0771u7 = this.f4553o0;
        while (true) {
            c0628qc = this.f4554p0;
            if (c0628qc != null || (c0925yc2 = this.f5379I) == null) {
                break;
            } else {
                this.f4554p0 = ((C0962zc) c0925yc2).f5568g0;
            }
        }
        c0771u7.f4651a = i;
        c0771u7.f4652b = i3;
        c0771u7.f4653c = i2;
        c0771u7.f4654d = i4;
        c0628qc.m2145a(c0925yc, c0771u7);
        c0925yc.m2762y(c0771u7.f4655e);
        c0925yc.m2759v(c0771u7.f4656f);
        c0925yc.f5422w = c0771u7.f4658h;
        int i5 = c0771u7.f4657g;
        c0925yc.f5386P = i5;
        c0925yc.f5422w = i5 > 0;
    }

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: a */
    public final void mo1703a(C0197er c0197er) {
        C0925yc c0925yc;
        ArrayList arrayList = this.f4538J0;
        super.mo1703a(c0197er);
        C0925yc c0925yc2 = this.f5379I;
        boolean z = c0925yc2 != null ? ((C0962zc) c0925yc2).f5569h0 : false;
        int i = this.f4535G0;
        if (i != 0) {
            if (i == 1) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    ((C0710sk) arrayList.get(i2)).m2377b(i2, z, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2 && this.f4541M0 != null && this.f4540L0 != null && this.f4539K0 != null) {
                for (int i3 = 0; i3 < this.f4543O0; i3++) {
                    this.f4542N0[i3].m2757t();
                }
                int[] iArr = this.f4541M0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                C0925yc c0925yc3 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    C0925yc c0925yc4 = this.f4540L0[z ? (i4 - i6) - 1 : i6];
                    if (c0925yc4 != null) {
                        C0443lc c0443lc = c0925yc4.f5423x;
                        if (c0925yc4.f5392V != 8) {
                            if (i6 == 0) {
                                c0925yc4.m2743e(c0443lc, this.f5423x, this.f4548j0);
                                c0925yc4.f5394X = this.f4555q0;
                                c0925yc4.f5389S = this.f4561w0;
                            }
                            if (i6 == i4 - 1) {
                                c0925yc4.m2743e(c0925yc4.f5425z, this.f5425z, this.f4549k0);
                            }
                            if (i6 > 0) {
                                c0925yc4.m2743e(c0443lc, c0925yc3.f5425z, this.f4531C0);
                                c0925yc3.m2743e(c0925yc3.f5425z, c0443lc, 0);
                            }
                            c0925yc3 = c0925yc4;
                        }
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    C0925yc c0925yc5 = this.f4539K0[i7];
                    if (c0925yc5 != null) {
                        C0443lc c0443lc2 = c0925yc5.f5424y;
                        if (c0925yc5.f5392V != 8) {
                            if (i7 == 0) {
                                c0925yc5.m2743e(c0443lc2, this.f5424y, this.f4544f0);
                                c0925yc5.f5395Y = this.f4556r0;
                                c0925yc5.f5390T = this.f4562x0;
                            }
                            if (i7 == i5 - 1) {
                                c0925yc5.m2743e(c0925yc5.f5371A, this.f5371A, this.f4545g0);
                            }
                            if (i7 > 0) {
                                c0925yc5.m2743e(c0443lc2, c0925yc3.f5371A, this.f4532D0);
                                c0925yc3.m2743e(c0925yc3.f5371A, c0443lc2, 0);
                            }
                            c0925yc3 = c0925yc5;
                        }
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.f4537I0 == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        C0925yc[] c0925ycArr = this.f4542N0;
                        if (i10 < c0925ycArr.length && (c0925yc = c0925ycArr[i10]) != null && c0925yc.f5392V != 8) {
                            C0925yc c0925yc6 = this.f4540L0[i8];
                            C0925yc c0925yc7 = this.f4539K0[i9];
                            if (c0925yc != c0925yc6) {
                                c0925yc.m2743e(c0925yc.f5423x, c0925yc6.f5423x, 0);
                                c0925yc.m2743e(c0925yc.f5425z, c0925yc6.f5425z, 0);
                            }
                            if (c0925yc != c0925yc7) {
                                c0925yc.m2743e(c0925yc.f5424y, c0925yc7.f5424y, 0);
                                c0925yc.m2743e(c0925yc.f5371A, c0925yc7.f5371A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C0710sk) arrayList.get(0)).m2377b(0, z, true);
        }
        this.f4550l0 = false;
    }
}
