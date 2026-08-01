package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: rk */
/* JADX INFO: loaded from: classes.dex */
public final class C0674rk extends AbstractC0566oo {

    /* JADX INFO: renamed from: A0 */
    public float f4290A0;

    /* JADX INFO: renamed from: B0 */
    public float f4291B0;

    /* JADX INFO: renamed from: C0 */
    public int f4292C0;

    /* JADX INFO: renamed from: D0 */
    public int f4293D0;

    /* JADX INFO: renamed from: E0 */
    public int f4294E0;

    /* JADX INFO: renamed from: F0 */
    public int f4295F0;

    /* JADX INFO: renamed from: G0 */
    public int f4296G0;

    /* JADX INFO: renamed from: H0 */
    public int f4297H0;

    /* JADX INFO: renamed from: I0 */
    public int f4298I0;

    /* JADX INFO: renamed from: J0 */
    public ArrayList f4299J0;

    /* JADX INFO: renamed from: K0 */
    public C0592pc[] f4300K0;

    /* JADX INFO: renamed from: L0 */
    public C0592pc[] f4301L0;

    /* JADX INFO: renamed from: M0 */
    public int[] f4302M0;

    /* JADX INFO: renamed from: N0 */
    public C0592pc[] f4303N0;

    /* JADX INFO: renamed from: O0 */
    public int f4304O0;

    /* JADX INFO: renamed from: f0 */
    public int f4305f0;

    /* JADX INFO: renamed from: g0 */
    public int f4306g0;

    /* JADX INFO: renamed from: h0 */
    public int f4307h0;

    /* JADX INFO: renamed from: i0 */
    public int f4308i0;

    /* JADX INFO: renamed from: j0 */
    public int f4309j0;

    /* JADX INFO: renamed from: k0 */
    public int f4310k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f4311l0;

    /* JADX INFO: renamed from: m0 */
    public int f4312m0;

    /* JADX INFO: renamed from: n0 */
    public int f4313n0;

    /* JADX INFO: renamed from: o0 */
    public C0401k7 f4314o0;

    /* JADX INFO: renamed from: p0 */
    public C0293hc f4315p0;

    /* JADX INFO: renamed from: q0 */
    public int f4316q0;

    /* JADX INFO: renamed from: r0 */
    public int f4317r0;

    /* JADX INFO: renamed from: s0 */
    public int f4318s0;

    /* JADX INFO: renamed from: t0 */
    public int f4319t0;

    /* JADX INFO: renamed from: u0 */
    public int f4320u0;

    /* JADX INFO: renamed from: v0 */
    public int f4321v0;

    /* JADX INFO: renamed from: w0 */
    public float f4322w0;

    /* JADX INFO: renamed from: x0 */
    public float f4323x0;

    /* JADX INFO: renamed from: y0 */
    public float f4324y0;

    /* JADX INFO: renamed from: z0 */
    public float f4325z0;

    @Override // p000.AbstractC0566oo
    /* JADX INFO: renamed from: B */
    public final void mo2020B() {
        for (int i = 0; i < this.f3572e0; i++) {
            C0592pc c0592pc = this.f3571d0[i];
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m2292C(C0592pc c0592pc, int i) {
        C0592pc c0592pc2;
        if (c0592pc != null) {
            int[] iArr = c0592pc.f3855c0;
            if (iArr[1] == 3) {
                int i2 = c0592pc.f3863k;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c0592pc.f3870r * i);
                        if (i3 != c0592pc.m2097i()) {
                            m2294E(iArr[0], c0592pc.m2100l(), 1, i3, c0592pc);
                        }
                        return i3;
                    }
                    c0592pc2 = c0592pc;
                    if (i2 == 1) {
                        return c0592pc2.m2097i();
                    }
                    if (i2 == 3) {
                        return (int) ((c0592pc2.m2100l() * c0592pc2.f3835L) + 0.5f);
                    }
                }
            } else {
                c0592pc2 = c0592pc;
            }
            return c0592pc2.m2097i();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public final int m2293D(C0592pc c0592pc, int i) {
        C0592pc c0592pc2;
        if (c0592pc != null) {
            int[] iArr = c0592pc.f3855c0;
            if (iArr[0] == 3) {
                int i2 = c0592pc.f3862j;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c0592pc.f3867o * i);
                        if (i3 != c0592pc.m2100l()) {
                            m2294E(1, i3, iArr[1], c0592pc.m2097i(), c0592pc);
                        }
                        return i3;
                    }
                    c0592pc2 = c0592pc;
                    if (i2 == 1) {
                        return c0592pc2.m2100l();
                    }
                    if (i2 == 3) {
                        return (int) ((c0592pc2.m2097i() * c0592pc2.f3835L) + 0.5f);
                    }
                }
            } else {
                c0592pc2 = c0592pc;
            }
            return c0592pc2.m2100l();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final void m2294E(int i, int i2, int i3, int i4, C0592pc c0592pc) {
        C0293hc c0293hc;
        C0592pc c0592pc2;
        C0401k7 c0401k7 = this.f4314o0;
        while (true) {
            c0293hc = this.f4315p0;
            if (c0293hc != null || (c0592pc2 = this.f3832I) == null) {
                break;
            } else {
                this.f4315p0 = ((C0629qc) c0592pc2).f4065g0;
            }
        }
        c0401k7.f2707a = i;
        c0401k7.f2708b = i3;
        c0401k7.f2709c = i2;
        c0401k7.f2710d = i4;
        c0293hc.m1353a(c0592pc, c0401k7);
        c0592pc.m2113y(c0401k7.f2711e);
        c0592pc.m2110v(c0401k7.f2712f);
        c0592pc.f3875w = c0401k7.f2714h;
        int i5 = c0401k7.f2713g;
        c0592pc.f3839P = i5;
        c0592pc.f3875w = i5 > 0;
    }

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: a */
    public final void mo996a(C0041ar c0041ar) {
        C0592pc c0592pc;
        ArrayList arrayList = this.f4299J0;
        super.mo996a(c0041ar);
        C0592pc c0592pc2 = this.f3832I;
        boolean z = c0592pc2 != null ? ((C0629qc) c0592pc2).f4066h0 : false;
        int i = this.f4296G0;
        if (i != 0) {
            if (i == 1) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    ((C0637qk) arrayList.get(i2)).m2172b(i2, z, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2 && this.f4302M0 != null && this.f4301L0 != null && this.f4300K0 != null) {
                for (int i3 = 0; i3 < this.f4304O0; i3++) {
                    this.f4303N0[i3].m2108t();
                }
                int[] iArr = this.f4302M0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                C0592pc c0592pc3 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    C0592pc c0592pc4 = this.f4301L0[z ? (i4 - i6) - 1 : i6];
                    if (c0592pc4 != null) {
                        C0099cc c0099cc = c0592pc4.f3876x;
                        if (c0592pc4.f3845V != 8) {
                            if (i6 == 0) {
                                c0592pc4.m2094e(c0099cc, this.f3876x, this.f4309j0);
                                c0592pc4.f3847X = this.f4316q0;
                                c0592pc4.f3842S = this.f4322w0;
                            }
                            if (i6 == i4 - 1) {
                                c0592pc4.m2094e(c0592pc4.f3878z, this.f3878z, this.f4310k0);
                            }
                            if (i6 > 0) {
                                c0592pc4.m2094e(c0099cc, c0592pc3.f3878z, this.f4292C0);
                                c0592pc3.m2094e(c0592pc3.f3878z, c0099cc, 0);
                            }
                            c0592pc3 = c0592pc4;
                        }
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    C0592pc c0592pc5 = this.f4300K0[i7];
                    if (c0592pc5 != null) {
                        C0099cc c0099cc2 = c0592pc5.f3877y;
                        if (c0592pc5.f3845V != 8) {
                            if (i7 == 0) {
                                c0592pc5.m2094e(c0099cc2, this.f3877y, this.f4305f0);
                                c0592pc5.f3848Y = this.f4317r0;
                                c0592pc5.f3843T = this.f4323x0;
                            }
                            if (i7 == i5 - 1) {
                                c0592pc5.m2094e(c0592pc5.f3824A, this.f3824A, this.f4306g0);
                            }
                            if (i7 > 0) {
                                c0592pc5.m2094e(c0099cc2, c0592pc3.f3824A, this.f4293D0);
                                c0592pc3.m2094e(c0592pc3.f3824A, c0099cc2, 0);
                            }
                            c0592pc3 = c0592pc5;
                        }
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.f4298I0 == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        C0592pc[] c0592pcArr = this.f4303N0;
                        if (i10 < c0592pcArr.length && (c0592pc = c0592pcArr[i10]) != null && c0592pc.f3845V != 8) {
                            C0592pc c0592pc6 = this.f4301L0[i8];
                            C0592pc c0592pc7 = this.f4300K0[i9];
                            if (c0592pc != c0592pc6) {
                                c0592pc.m2094e(c0592pc.f3876x, c0592pc6.f3876x, 0);
                                c0592pc.m2094e(c0592pc.f3878z, c0592pc6.f3878z, 0);
                            }
                            if (c0592pc != c0592pc7) {
                                c0592pc.m2094e(c0592pc.f3877y, c0592pc7.f3877y, 0);
                                c0592pc.m2094e(c0592pc.f3824A, c0592pc7.f3824A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C0637qk) arrayList.get(0)).m2172b(0, z, true);
        }
        this.f4311l0 = false;
    }
}
