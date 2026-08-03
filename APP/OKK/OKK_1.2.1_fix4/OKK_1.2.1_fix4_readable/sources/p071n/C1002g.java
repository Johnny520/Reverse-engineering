package p071n;

import java.util.ArrayList;
import p069m.C0985e;
import p073o.C1013b;
import p075p.C1040f;

/* JADX INFO: renamed from: n.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1002g extends AbstractC1004i {

    /* JADX INFO: renamed from: A0 */
    public float f3672A0;

    /* JADX INFO: renamed from: B0 */
    public float f3673B0;

    /* JADX INFO: renamed from: C0 */
    public int f3674C0;

    /* JADX INFO: renamed from: D0 */
    public int f3675D0;

    /* JADX INFO: renamed from: E0 */
    public int f3676E0;

    /* JADX INFO: renamed from: F0 */
    public int f3677F0;

    /* JADX INFO: renamed from: G0 */
    public int f3678G0;

    /* JADX INFO: renamed from: H0 */
    public int f3679H0;

    /* JADX INFO: renamed from: I0 */
    public int f3680I0;

    /* JADX INFO: renamed from: J0 */
    public ArrayList f3681J0;

    /* JADX INFO: renamed from: K0 */
    public C0999d[] f3682K0;

    /* JADX INFO: renamed from: L0 */
    public C0999d[] f3683L0;

    /* JADX INFO: renamed from: M0 */
    public int[] f3684M0;

    /* JADX INFO: renamed from: N0 */
    public C0999d[] f3685N0;

    /* JADX INFO: renamed from: O0 */
    public int f3686O0;

    /* JADX INFO: renamed from: f0 */
    public int f3687f0;

    /* JADX INFO: renamed from: g0 */
    public int f3688g0;

    /* JADX INFO: renamed from: h0 */
    public int f3689h0;

    /* JADX INFO: renamed from: i0 */
    public int f3690i0;

    /* JADX INFO: renamed from: j0 */
    public int f3691j0;

    /* JADX INFO: renamed from: k0 */
    public int f3692k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f3693l0;

    /* JADX INFO: renamed from: m0 */
    public int f3694m0;

    /* JADX INFO: renamed from: n0 */
    public int f3695n0;

    /* JADX INFO: renamed from: o0 */
    public C1013b f3696o0;

    /* JADX INFO: renamed from: p0 */
    public C1040f f3697p0;

    /* JADX INFO: renamed from: q0 */
    public int f3698q0;

    /* JADX INFO: renamed from: r0 */
    public int f3699r0;

    /* JADX INFO: renamed from: s0 */
    public int f3700s0;

    /* JADX INFO: renamed from: t0 */
    public int f3701t0;

    /* JADX INFO: renamed from: u0 */
    public int f3702u0;

    /* JADX INFO: renamed from: v0 */
    public int f3703v0;

    /* JADX INFO: renamed from: w0 */
    public float f3704w0;

    /* JADX INFO: renamed from: x0 */
    public float f3705x0;

    /* JADX INFO: renamed from: y0 */
    public float f3706y0;

    /* JADX INFO: renamed from: z0 */
    public float f3707z0;

    @Override // p071n.AbstractC1004i
    /* JADX INFO: renamed from: B */
    public final void mo2432B() {
        for (int i2 = 0; i2 < this.f3714e0; i2++) {
            C0999d c0999d = this.f3713d0[i2];
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m2433C(C0999d c0999d, int i2) {
        if (c0999d == null) {
            return 0;
        }
        int[] iArr = c0999d.f3615c0;
        if (iArr[1] == 3) {
            int i3 = c0999d.f3623k;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (c0999d.f3630r * i2);
                if (i4 != c0999d.m2404i()) {
                    m2435E(iArr[0], c0999d.m2407l(), 1, i4, c0999d);
                }
                return i4;
            }
            if (i3 == 1) {
                return c0999d.m2404i();
            }
            if (i3 == 3) {
                return (int) ((c0999d.m2407l() * c0999d.f3595L) + 0.5f);
            }
        }
        return c0999d.m2404i();
    }

    /* JADX INFO: renamed from: D */
    public final int m2434D(C0999d c0999d, int i2) {
        if (c0999d == null) {
            return 0;
        }
        int[] iArr = c0999d.f3615c0;
        if (iArr[0] == 3) {
            int i3 = c0999d.f3622j;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (c0999d.f3627o * i2);
                if (i4 != c0999d.m2407l()) {
                    m2435E(1, i4, iArr[1], c0999d.m2404i(), c0999d);
                }
                return i4;
            }
            if (i3 == 1) {
                return c0999d.m2407l();
            }
            if (i3 == 3) {
                return (int) ((c0999d.m2404i() * c0999d.f3595L) + 0.5f);
            }
        }
        return c0999d.m2407l();
    }

    /* JADX INFO: renamed from: E */
    public final void m2435E(int i2, int i3, int i4, int i5, C0999d c0999d) {
        C1040f c1040f;
        C0999d c0999d2;
        while (true) {
            c1040f = this.f3697p0;
            if (c1040f != null || (c0999d2 = this.f3592I) == null) {
                break;
            } else {
                this.f3697p0 = ((C1000e) c0999d2).f3642g0;
            }
        }
        C1013b c1013b = this.f3696o0;
        c1013b.f3724a = i2;
        c1013b.f3725b = i4;
        c1013b.f3726c = i3;
        c1013b.f3727d = i5;
        c1040f.m2519a(c0999d, c1013b);
        c0999d.m2420y(c1013b.f3728e);
        c0999d.m2417v(c1013b.f3729f);
        c0999d.f3635w = c1013b.f3731h;
        int i6 = c1013b.f3730g;
        c0999d.f3599P = i6;
        c0999d.f3635w = i6 > 0;
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: a */
    public final void mo2386a(C0985e c0985e) {
        C0999d c0999d;
        super.mo2386a(c0985e);
        C0999d c0999d2 = this.f3592I;
        boolean z2 = c0999d2 != null ? ((C1000e) c0999d2).f3643h0 : false;
        int i2 = this.f3678G0;
        ArrayList arrayList = this.f3681J0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((C1001f) arrayList.get(i3)).m2427b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 == 2 && this.f3684M0 != null && this.f3683L0 != null && this.f3682K0 != null) {
                for (int i4 = 0; i4 < this.f3686O0; i4++) {
                    this.f3685N0[i4].m2415t();
                }
                int[] iArr = this.f3684M0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                C0999d c0999d3 = null;
                for (int i7 = 0; i7 < i5; i7++) {
                    C0999d c0999d4 = this.f3683L0[z2 ? (i5 - i7) - 1 : i7];
                    if (c0999d4 != null && c0999d4.f3605V != 8) {
                        C0998c c0998c = c0999d4.f3636x;
                        if (i7 == 0) {
                            c0999d4.m2400e(c0998c, this.f3636x, this.f3691j0);
                            c0999d4.f3607X = this.f3698q0;
                            c0999d4.f3602S = this.f3704w0;
                        }
                        if (i7 == i5 - 1) {
                            c0999d4.m2400e(c0999d4.f3638z, this.f3638z, this.f3692k0);
                        }
                        if (i7 > 0) {
                            c0999d4.m2400e(c0998c, c0999d3.f3638z, this.f3674C0);
                            c0999d3.m2400e(c0999d3.f3638z, c0998c, 0);
                        }
                        c0999d3 = c0999d4;
                    }
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    C0999d c0999d5 = this.f3682K0[i8];
                    if (c0999d5 != null && c0999d5.f3605V != 8) {
                        C0998c c0998c2 = c0999d5.f3637y;
                        if (i8 == 0) {
                            c0999d5.m2400e(c0998c2, this.f3637y, this.f3687f0);
                            c0999d5.f3608Y = this.f3699r0;
                            c0999d5.f3603T = this.f3705x0;
                        }
                        if (i8 == i6 - 1) {
                            c0999d5.m2400e(c0999d5.f3584A, this.f3584A, this.f3688g0);
                        }
                        if (i8 > 0) {
                            c0999d5.m2400e(c0998c2, c0999d3.f3584A, this.f3675D0);
                            c0999d3.m2400e(c0999d3.f3584A, c0998c2, 0);
                        }
                        c0999d3 = c0999d5;
                    }
                }
                for (int i9 = 0; i9 < i5; i9++) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = (i10 * i5) + i9;
                        if (this.f3680I0 == 1) {
                            i11 = (i9 * i6) + i10;
                        }
                        C0999d[] c0999dArr = this.f3685N0;
                        if (i11 < c0999dArr.length && (c0999d = c0999dArr[i11]) != null && c0999d.f3605V != 8) {
                            C0999d c0999d6 = this.f3683L0[i9];
                            C0999d c0999d7 = this.f3682K0[i10];
                            if (c0999d != c0999d6) {
                                c0999d.m2400e(c0999d.f3636x, c0999d6.f3636x, 0);
                                c0999d.m2400e(c0999d.f3638z, c0999d6.f3638z, 0);
                            }
                            if (c0999d != c0999d7) {
                                c0999d.m2400e(c0999d.f3637y, c0999d7.f3637y, 0);
                                c0999d.m2400e(c0999d.f3584A, c0999d7.f3584A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1001f) arrayList.get(0)).m2427b(0, z2, true);
        }
        this.f3693l0 = false;
    }
}
