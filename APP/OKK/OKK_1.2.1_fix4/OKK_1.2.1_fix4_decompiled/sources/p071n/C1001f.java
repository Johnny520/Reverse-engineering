package p071n;

/* JADX INFO: renamed from: n.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1001f {

    /* JADX INFO: renamed from: a */
    public int f3654a;

    /* JADX INFO: renamed from: d */
    public C0998c f3657d;

    /* JADX INFO: renamed from: e */
    public C0998c f3658e;

    /* JADX INFO: renamed from: f */
    public C0998c f3659f;

    /* JADX INFO: renamed from: g */
    public C0998c f3660g;

    /* JADX INFO: renamed from: h */
    public int f3661h;

    /* JADX INFO: renamed from: i */
    public int f3662i;

    /* JADX INFO: renamed from: j */
    public int f3663j;

    /* JADX INFO: renamed from: k */
    public int f3664k;

    /* JADX INFO: renamed from: q */
    public int f3670q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1002g f3671r;

    /* JADX INFO: renamed from: b */
    public C0999d f3655b = null;

    /* JADX INFO: renamed from: c */
    public int f3656c = 0;

    /* JADX INFO: renamed from: l */
    public int f3665l = 0;

    /* JADX INFO: renamed from: m */
    public int f3666m = 0;

    /* JADX INFO: renamed from: n */
    public int f3667n = 0;

    /* JADX INFO: renamed from: o */
    public int f3668o = 0;

    /* JADX INFO: renamed from: p */
    public int f3669p = 0;

    public C1001f(C1002g c1002g, int i2, C0998c c0998c, C0998c c0998c2, C0998c c0998c3, C0998c c0998c4, int i3) {
        this.f3671r = c1002g;
        this.f3661h = 0;
        this.f3662i = 0;
        this.f3663j = 0;
        this.f3664k = 0;
        this.f3670q = 0;
        this.f3654a = i2;
        this.f3657d = c0998c;
        this.f3658e = c0998c2;
        this.f3659f = c0998c3;
        this.f3660g = c0998c4;
        this.f3661h = c1002g.f3691j0;
        this.f3662i = c1002g.f3687f0;
        this.f3663j = c1002g.f3692k0;
        this.f3664k = c1002g.f3688g0;
        this.f3670q = i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m2426a(C0999d c0999d) {
        int i2 = this.f3654a;
        C1002g c1002g = this.f3671r;
        if (i2 == 0) {
            int iM2434D = c1002g.m2434D(c0999d, this.f3670q);
            if (c0999d.f3615c0[0] == 3) {
                this.f3669p++;
                iM2434D = 0;
            }
            this.f3665l = iM2434D + (c0999d.f3605V != 8 ? c1002g.f3674C0 : 0) + this.f3665l;
            int iM2433C = c1002g.m2433C(c0999d, this.f3670q);
            if (this.f3655b == null || this.f3656c < iM2433C) {
                this.f3655b = c0999d;
                this.f3656c = iM2433C;
                this.f3666m = iM2433C;
            }
        } else {
            int iM2434D2 = c1002g.m2434D(c0999d, this.f3670q);
            int iM2433C2 = c1002g.m2433C(c0999d, this.f3670q);
            if (c0999d.f3615c0[1] == 3) {
                this.f3669p++;
                iM2433C2 = 0;
            }
            this.f3666m = iM2433C2 + (c0999d.f3605V != 8 ? c1002g.f3675D0 : 0) + this.f3666m;
            if (this.f3655b == null || this.f3656c < iM2434D2) {
                this.f3655b = c0999d;
                this.f3656c = iM2434D2;
                this.f3665l = iM2434D2;
            }
        }
        this.f3668o++;
    }

    /* JADX INFO: renamed from: b */
    public final void m2427b(int i2, boolean z2, boolean z3) {
        C1002g c1002g;
        int i3;
        C0999d c0999d;
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f3668o;
        int i9 = 0;
        while (true) {
            c1002g = this.f3671r;
            if (i9 >= i8 || (i7 = this.f3667n + i9) >= c1002g.f3686O0) {
                break;
            }
            C0999d c0999d2 = c1002g.f3685N0[i7];
            if (c0999d2 != null) {
                c0999d2.m2415t();
            }
            i9++;
        }
        if (i8 == 0 || this.f3655b == null) {
            return;
        }
        boolean z4 = z3 && i2 == 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = this.f3667n + (z2 ? (i8 - 1) - i12 : i12);
            if (i13 >= c1002g.f3686O0) {
                break;
            }
            if (c1002g.f3685N0[i13].f3605V == 0) {
                if (i10 == -1) {
                    i10 = i12;
                }
                i11 = i12;
            }
        }
        if (this.f3654a != 0) {
            C0999d c0999d3 = this.f3655b;
            c0999d3.f3607X = c1002g.f3698q0;
            int i14 = this.f3661h;
            if (i2 > 0) {
                i14 += c1002g.f3674C0;
            }
            C0998c c0998c = c0999d3.f3636x;
            C0998c c0998c2 = c0999d3.f3638z;
            if (z2) {
                c0998c2.m2388a(this.f3659f, i14);
                if (z3) {
                    c0998c.m2388a(this.f3657d, this.f3663j);
                }
                if (i2 > 0) {
                    this.f3659f.f3578b.f3636x.m2388a(c0998c2, 0);
                }
            } else {
                c0998c.m2388a(this.f3657d, i14);
                if (z3) {
                    c0998c2.m2388a(this.f3659f, this.f3663j);
                }
                if (i2 > 0) {
                    this.f3657d.f3578b.f3638z.m2388a(c0998c, 0);
                }
            }
            int i15 = 0;
            C0999d c0999d4 = null;
            while (i15 < i8) {
                int i16 = this.f3667n + i15;
                if (i16 >= c1002g.f3686O0) {
                    return;
                }
                C0999d c0999d5 = c1002g.f3685N0[i16];
                if (i15 == 0) {
                    c0999d5.m2400e(c0999d5.f3637y, this.f3658e, this.f3662i);
                    int i17 = c1002g.f3699r0;
                    float f2 = c1002g.f3705x0;
                    if (this.f3667n == 0) {
                        int i18 = c1002g.f3701t0;
                        i3 = -1;
                        if (i18 != -1) {
                            f2 = c1002g.f3707z0;
                        }
                        i17 = i18;
                        c0999d5.f3608Y = i17;
                        c0999d5.f3603T = f2;
                    } else {
                        i3 = -1;
                    }
                    if (z3 && (i18 = c1002g.f3703v0) != i3) {
                        f2 = c1002g.f3673B0;
                        i17 = i18;
                    }
                    c0999d5.f3608Y = i17;
                    c0999d5.f3603T = f2;
                }
                if (i15 == i8 - 1) {
                    c0999d5.m2400e(c0999d5.f3584A, this.f3660g, this.f3664k);
                }
                if (c0999d4 != null) {
                    C0998c c0998c3 = c0999d5.f3637y;
                    int i19 = c1002g.f3675D0;
                    C0998c c0998c4 = c0999d4.f3584A;
                    c0998c3.m2388a(c0998c4, i19);
                    C0998c c0998c5 = c0999d5.f3637y;
                    if (i15 == i10) {
                        int i20 = this.f3662i;
                        if (c0998c5.m2393f()) {
                            c0998c5.f3582f = i20;
                        }
                    }
                    c0998c4.m2388a(c0998c5, 0);
                    if (i15 == i11 + 1) {
                        int i21 = this.f3664k;
                        if (c0998c4.m2393f()) {
                            c0998c4.f3582f = i21;
                        }
                    }
                }
                if (c0999d5 != c0999d3) {
                    if (z2) {
                        int i22 = c1002g.f3676E0;
                        if (i22 == 0) {
                            c0999d5.f3638z.m2388a(c0998c2, 0);
                        } else if (i22 == 1) {
                            c0999d5.f3636x.m2388a(c0998c, 0);
                        } else if (i22 == 2) {
                            c0999d5.f3636x.m2388a(c0998c, 0);
                            c0999d5.f3638z.m2388a(c0998c2, 0);
                        }
                    } else {
                        int i23 = c1002g.f3676E0;
                        if (i23 == 0) {
                            c0999d5.f3636x.m2388a(c0998c, 0);
                        } else if (i23 == 1) {
                            c0999d5.f3638z.m2388a(c0998c2, 0);
                        } else if (i23 == 2) {
                            if (z4) {
                                c0999d5.f3636x.m2388a(this.f3657d, this.f3661h);
                                c0999d5.f3638z.m2388a(this.f3659f, this.f3663j);
                            } else {
                                c0999d5.f3636x.m2388a(c0998c, 0);
                                c0999d5.f3638z.m2388a(c0998c2, 0);
                            }
                        }
                    }
                }
                i15++;
                c0999d4 = c0999d5;
            }
            return;
        }
        C0999d c0999d6 = this.f3655b;
        c0999d6.f3608Y = c1002g.f3699r0;
        int i24 = this.f3662i;
        if (i2 > 0) {
            i24 += c1002g.f3675D0;
        }
        C0998c c0998c6 = this.f3658e;
        C0998c c0998c7 = c0999d6.f3637y;
        c0998c7.m2388a(c0998c6, i24);
        C0998c c0998c8 = c0999d6.f3584A;
        if (z3) {
            c0998c8.m2388a(this.f3660g, this.f3664k);
        }
        if (i2 > 0) {
            this.f3658e.f3578b.f3584A.m2388a(c0998c7, 0);
        }
        if (c1002g.f3677F0 != 3 || c0999d6.f3635w) {
            c0999d = c0999d6;
        } else {
            for (int i25 = 0; i25 < i8; i25++) {
                int i26 = this.f3667n + (z2 ? (i8 - 1) - i25 : i25);
                if (i26 >= c1002g.f3686O0) {
                    break;
                }
                c0999d = c1002g.f3685N0[i26];
                if (c0999d.f3635w) {
                    break;
                }
            }
            c0999d = c0999d6;
        }
        int i27 = 0;
        C0999d c0999d7 = null;
        while (i27 < i8) {
            int i28 = z2 ? (i8 - 1) - i27 : i27;
            int i29 = this.f3667n + i28;
            if (i29 >= c1002g.f3686O0) {
                return;
            }
            C0999d c0999d8 = c1002g.f3685N0[i29];
            if (i27 == 0) {
                c0999d8.m2400e(c0999d8.f3636x, this.f3657d, this.f3661h);
            }
            if (i28 == 0) {
                int i30 = c1002g.f3698q0;
                float f3 = c1002g.f3704w0;
                if (this.f3667n == 0) {
                    int i31 = c1002g.f3700s0;
                    i4 = i30;
                    i5 = -1;
                    if (i31 != -1) {
                        f3 = c1002g.f3706y0;
                    }
                    i6 = i31;
                    c0999d8.f3607X = i6;
                    c0999d8.f3602S = f3;
                } else {
                    i4 = i30;
                    i5 = -1;
                }
                if (!z3 || (i31 = c1002g.f3702u0) == i5) {
                    i6 = i4;
                    c0999d8.f3607X = i6;
                    c0999d8.f3602S = f3;
                } else {
                    f3 = c1002g.f3672A0;
                    i6 = i31;
                    c0999d8.f3607X = i6;
                    c0999d8.f3602S = f3;
                }
            }
            if (i27 == i8 - 1) {
                c0999d8.m2400e(c0999d8.f3638z, this.f3659f, this.f3663j);
            }
            if (c0999d7 != null) {
                C0998c c0998c9 = c0999d8.f3636x;
                int i32 = c1002g.f3674C0;
                C0998c c0998c10 = c0999d7.f3638z;
                c0998c9.m2388a(c0998c10, i32);
                C0998c c0998c11 = c0999d8.f3636x;
                if (i27 == i10) {
                    int i33 = this.f3661h;
                    if (c0998c11.m2393f()) {
                        c0998c11.f3582f = i33;
                    }
                }
                c0998c10.m2388a(c0998c11, 0);
                if (i27 == i11 + 1) {
                    int i34 = this.f3663j;
                    if (c0998c10.m2393f()) {
                        c0998c10.f3582f = i34;
                    }
                }
            }
            if (c0999d8 != c0999d6) {
                int i35 = c1002g.f3677F0;
                c = 3;
                if (i35 == 3 && c0999d.f3635w && c0999d8 != c0999d && c0999d8.f3635w) {
                    c0999d8.f3585B.m2388a(c0999d.f3585B, 0);
                } else if (i35 == 0) {
                    c0999d8.f3637y.m2388a(c0998c7, 0);
                } else if (i35 == 1) {
                    c0999d8.f3584A.m2388a(c0998c8, 0);
                } else if (z4) {
                    c0999d8.f3637y.m2388a(this.f3658e, this.f3662i);
                    c0999d8.f3584A.m2388a(this.f3660g, this.f3664k);
                } else {
                    c0999d8.f3637y.m2388a(c0998c7, 0);
                    c0999d8.f3584A.m2388a(c0998c8, 0);
                }
            } else {
                c = 3;
            }
            i27++;
            c0999d7 = c0999d8;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2428c() {
        return this.f3654a == 1 ? this.f3666m - this.f3671r.f3675D0 : this.f3666m;
    }

    /* JADX INFO: renamed from: d */
    public final int m2429d() {
        return this.f3654a == 0 ? this.f3665l - this.f3671r.f3674C0 : this.f3665l;
    }

    /* JADX INFO: renamed from: e */
    public final void m2430e(int i2) {
        C1002g c1002g;
        int i3;
        int i4 = this.f3669p;
        if (i4 == 0) {
            return;
        }
        int i5 = this.f3668o;
        int i6 = i2 / i4;
        int i7 = 0;
        while (true) {
            c1002g = this.f3671r;
            if (i7 >= i5 || (i3 = this.f3667n + i7) >= c1002g.f3686O0) {
                break;
            }
            C0999d c0999d = c1002g.f3685N0[i3];
            if (this.f3654a == 0) {
                if (c0999d != null) {
                    int[] iArr = c0999d.f3615c0;
                    if (iArr[0] == 3 && c0999d.f3622j == 0) {
                        c1002g.m2435E(1, i6, iArr[1], c0999d.m2404i(), c0999d);
                    }
                }
            } else if (c0999d != null) {
                int[] iArr2 = c0999d.f3615c0;
                if (iArr2[1] == 3 && c0999d.f3623k == 0) {
                    c1002g.m2435E(iArr2[0], c0999d.m2407l(), 1, i6, c0999d);
                }
            }
            i7++;
        }
        this.f3665l = 0;
        this.f3666m = 0;
        this.f3655b = null;
        this.f3656c = 0;
        int i8 = this.f3668o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f3667n + i9;
            if (i10 >= c1002g.f3686O0) {
                return;
            }
            C0999d c0999d2 = c1002g.f3685N0[i10];
            if (this.f3654a == 0) {
                int iM2407l = c0999d2.m2407l();
                int i11 = c1002g.f3674C0;
                if (c0999d2.f3605V == 8) {
                    i11 = 0;
                }
                this.f3665l = iM2407l + i11 + this.f3665l;
                int iM2433C = c1002g.m2433C(c0999d2, this.f3670q);
                if (this.f3655b == null || this.f3656c < iM2433C) {
                    this.f3655b = c0999d2;
                    this.f3656c = iM2433C;
                    this.f3666m = iM2433C;
                }
            } else {
                int iM2434D = c1002g.m2434D(c0999d2, this.f3670q);
                int iM2433C2 = c1002g.m2433C(c0999d2, this.f3670q);
                int i12 = c1002g.f3675D0;
                if (c0999d2.f3605V == 8) {
                    i12 = 0;
                }
                this.f3666m = iM2433C2 + i12 + this.f3666m;
                if (this.f3655b == null || this.f3656c < iM2434D) {
                    this.f3655b = c0999d2;
                    this.f3656c = iM2434D;
                    this.f3665l = iM2434D;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2431f(int i2, C0998c c0998c, C0998c c0998c2, C0998c c0998c3, C0998c c0998c4, int i3, int i4, int i5, int i6, int i7) {
        this.f3654a = i2;
        this.f3657d = c0998c;
        this.f3658e = c0998c2;
        this.f3659f = c0998c3;
        this.f3660g = c0998c4;
        this.f3661h = i3;
        this.f3662i = i4;
        this.f3663j = i5;
        this.f3664k = i6;
        this.f3670q = i7;
    }
}
