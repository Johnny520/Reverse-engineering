package p000;

/* JADX INFO: renamed from: qk */
/* JADX INFO: loaded from: classes.dex */
public final class C0637qk {

    /* JADX INFO: renamed from: a */
    public int f4090a;

    /* JADX INFO: renamed from: d */
    public C0099cc f4093d;

    /* JADX INFO: renamed from: e */
    public C0099cc f4094e;

    /* JADX INFO: renamed from: f */
    public C0099cc f4095f;

    /* JADX INFO: renamed from: g */
    public C0099cc f4096g;

    /* JADX INFO: renamed from: h */
    public int f4097h;

    /* JADX INFO: renamed from: i */
    public int f4098i;

    /* JADX INFO: renamed from: j */
    public int f4099j;

    /* JADX INFO: renamed from: k */
    public int f4100k;

    /* JADX INFO: renamed from: q */
    public int f4106q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0674rk f4107r;

    /* JADX INFO: renamed from: b */
    public C0592pc f4091b = null;

    /* JADX INFO: renamed from: c */
    public int f4092c = 0;

    /* JADX INFO: renamed from: l */
    public int f4101l = 0;

    /* JADX INFO: renamed from: m */
    public int f4102m = 0;

    /* JADX INFO: renamed from: n */
    public int f4103n = 0;

    /* JADX INFO: renamed from: o */
    public int f4104o = 0;

    /* JADX INFO: renamed from: p */
    public int f4105p = 0;

    public C0637qk(C0674rk c0674rk, int i, C0099cc c0099cc, C0099cc c0099cc2, C0099cc c0099cc3, C0099cc c0099cc4, int i2) {
        this.f4107r = c0674rk;
        this.f4097h = 0;
        this.f4098i = 0;
        this.f4099j = 0;
        this.f4100k = 0;
        this.f4106q = 0;
        this.f4090a = i;
        this.f4093d = c0099cc;
        this.f4094e = c0099cc2;
        this.f4095f = c0099cc3;
        this.f4096g = c0099cc4;
        this.f4097h = c0674rk.f4309j0;
        this.f4098i = c0674rk.f4305f0;
        this.f4099j = c0674rk.f4310k0;
        this.f4100k = c0674rk.f4306g0;
        this.f4106q = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2171a(C0592pc c0592pc) {
        int i = this.f4090a;
        C0674rk c0674rk = this.f4107r;
        if (i == 0) {
            int iM2293D = c0674rk.m2293D(c0592pc, this.f4106q);
            if (c0592pc.f3855c0[0] == 3) {
                this.f4105p++;
                iM2293D = 0;
            }
            this.f4101l = iM2293D + (c0592pc.f3845V != 8 ? c0674rk.f4292C0 : 0) + this.f4101l;
            int iM2292C = c0674rk.m2292C(c0592pc, this.f4106q);
            if (this.f4091b == null || this.f4092c < iM2292C) {
                this.f4091b = c0592pc;
                this.f4092c = iM2292C;
                this.f4102m = iM2292C;
            }
        } else {
            int iM2293D2 = c0674rk.m2293D(c0592pc, this.f4106q);
            int iM2292C2 = c0674rk.m2292C(c0592pc, this.f4106q);
            if (c0592pc.f3855c0[1] == 3) {
                this.f4105p++;
                iM2292C2 = 0;
            }
            this.f4102m = iM2292C2 + (c0592pc.f3845V != 8 ? c0674rk.f4293D0 : 0) + this.f4102m;
            if (this.f4091b == null || this.f4092c < iM2293D2) {
                this.f4091b = c0592pc;
                this.f4092c = iM2293D2;
                this.f4101l = iM2293D2;
            }
        }
        this.f4104o++;
    }

    /* JADX INFO: renamed from: b */
    public final void m2172b(int i, boolean z, boolean z2) {
        C0674rk c0674rk;
        int i2;
        C0592pc c0592pc;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f4104o;
        int i8 = 0;
        while (true) {
            c0674rk = this.f4107r;
            if (i8 >= i7 || (i6 = this.f4103n + i8) >= c0674rk.f4304O0) {
                break;
            }
            C0592pc c0592pc2 = c0674rk.f4303N0[i6];
            if (c0592pc2 != null) {
                c0592pc2.m2108t();
            }
            i8++;
        }
        if (i7 == 0 || this.f4091b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = this.f4103n + (z ? (i7 - 1) - i11 : i11);
            if (i12 >= c0674rk.f4304O0) {
                break;
            }
            if (c0674rk.f4303N0[i12].f3845V == 0) {
                if (i9 == -1) {
                    i9 = i11;
                }
                i10 = i11;
            }
        }
        if (this.f4090a != 0) {
            C0592pc c0592pc3 = this.f4091b;
            c0592pc3.f3847X = c0674rk.f4316q0;
            C0099cc c0099cc = c0592pc3.f3876x;
            C0099cc c0099cc2 = c0592pc3.f3878z;
            int i13 = this.f4097h;
            if (i > 0) {
                i13 += c0674rk.f4292C0;
            }
            if (z) {
                c0099cc2.m659a(this.f4095f, i13);
                if (z2) {
                    c0099cc.m659a(this.f4093d, this.f4099j);
                }
                if (i > 0) {
                    this.f4095f.f945b.f3876x.m659a(c0099cc2, 0);
                }
            } else {
                c0099cc.m659a(this.f4093d, i13);
                if (z2) {
                    c0099cc2.m659a(this.f4095f, this.f4099j);
                }
                if (i > 0) {
                    this.f4093d.f945b.f3878z.m659a(c0099cc, 0);
                }
            }
            C0592pc c0592pc4 = null;
            int i14 = 0;
            while (i14 < i7) {
                int i15 = this.f4103n + i14;
                if (i15 >= c0674rk.f4304O0) {
                    return;
                }
                C0592pc c0592pc5 = c0674rk.f4303N0[i15];
                if (i14 == 0) {
                    c0592pc5.m2094e(c0592pc5.f3877y, this.f4094e, this.f4098i);
                    int i16 = c0674rk.f4317r0;
                    float f = c0674rk.f4323x0;
                    if (this.f4103n == 0) {
                        int i17 = c0674rk.f4319t0;
                        i2 = -1;
                        if (i17 != -1) {
                            f = c0674rk.f4325z0;
                        }
                        i16 = i17;
                        c0592pc5.f3848Y = i16;
                        c0592pc5.f3843T = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && (i17 = c0674rk.f4321v0) != i2) {
                        f = c0674rk.f4291B0;
                        i16 = i17;
                    }
                    c0592pc5.f3848Y = i16;
                    c0592pc5.f3843T = f;
                }
                if (i14 == i7 - 1) {
                    c0592pc5.m2094e(c0592pc5.f3824A, this.f4096g, this.f4100k);
                }
                if (c0592pc4 != null) {
                    C0099cc c0099cc3 = c0592pc4.f3824A;
                    C0099cc c0099cc4 = c0592pc5.f3877y;
                    c0099cc4.m659a(c0099cc3, c0674rk.f4293D0);
                    if (i14 == i9) {
                        int i18 = this.f4098i;
                        if (c0099cc4.m664f()) {
                            c0099cc4.f949f = i18;
                        }
                    }
                    c0099cc3.m659a(c0099cc4, 0);
                    if (i14 == i10 + 1) {
                        int i19 = this.f4100k;
                        if (c0099cc3.m664f()) {
                            c0099cc3.f949f = i19;
                        }
                    }
                }
                if (c0592pc5 != c0592pc3) {
                    if (z) {
                        int i20 = c0674rk.f4294E0;
                        if (i20 == 0) {
                            c0592pc5.f3878z.m659a(c0099cc2, 0);
                        } else if (i20 == 1) {
                            c0592pc5.f3876x.m659a(c0099cc, 0);
                        } else if (i20 == 2) {
                            c0592pc5.f3876x.m659a(c0099cc, 0);
                            c0592pc5.f3878z.m659a(c0099cc2, 0);
                        }
                    } else {
                        int i21 = c0674rk.f4294E0;
                        if (i21 == 0) {
                            c0592pc5.f3876x.m659a(c0099cc, 0);
                        } else if (i21 == 1) {
                            c0592pc5.f3878z.m659a(c0099cc2, 0);
                        } else if (i21 == 2) {
                            if (z3) {
                                c0592pc5.f3876x.m659a(this.f4093d, this.f4097h);
                                c0592pc5.f3878z.m659a(this.f4095f, this.f4099j);
                            } else {
                                c0592pc5.f3876x.m659a(c0099cc, 0);
                                c0592pc5.f3878z.m659a(c0099cc2, 0);
                            }
                        }
                    }
                }
                i14++;
                c0592pc4 = c0592pc5;
            }
            return;
        }
        C0592pc c0592pc6 = this.f4091b;
        c0592pc6.f3848Y = c0674rk.f4317r0;
        C0099cc c0099cc5 = c0592pc6.f3824A;
        C0099cc c0099cc6 = c0592pc6.f3877y;
        int i22 = this.f4098i;
        if (i > 0) {
            i22 += c0674rk.f4293D0;
        }
        c0099cc6.m659a(this.f4094e, i22);
        if (z2) {
            c0099cc5.m659a(this.f4096g, this.f4100k);
        }
        if (i > 0) {
            this.f4094e.f945b.f3824A.m659a(c0099cc6, 0);
        }
        if (c0674rk.f4295F0 != 3 || c0592pc6.f3875w) {
            c0592pc = c0592pc6;
        } else {
            for (int i23 = 0; i23 < i7; i23++) {
                int i24 = this.f4103n + (z ? (i7 - 1) - i23 : i23);
                if (i24 >= c0674rk.f4304O0) {
                    break;
                }
                c0592pc = c0674rk.f4303N0[i24];
                if (c0592pc.f3875w) {
                    break;
                }
            }
            c0592pc = c0592pc6;
        }
        int i25 = 0;
        C0592pc c0592pc7 = null;
        while (i25 < i7) {
            int i26 = z ? (i7 - 1) - i25 : i25;
            int i27 = this.f4103n + i26;
            if (i27 >= c0674rk.f4304O0) {
                return;
            }
            C0592pc c0592pc8 = c0674rk.f4303N0[i27];
            if (i25 == 0) {
                c0592pc8.m2094e(c0592pc8.f3876x, this.f4093d, this.f4097h);
            }
            if (i26 == 0) {
                int i28 = c0674rk.f4316q0;
                float f2 = c0674rk.f4322w0;
                if (this.f4103n == 0) {
                    int i29 = c0674rk.f4318s0;
                    i3 = i28;
                    i4 = -1;
                    if (i29 != -1) {
                        f2 = c0674rk.f4324y0;
                    }
                    i5 = i29;
                    c0592pc8.f3847X = i5;
                    c0592pc8.f3842S = f2;
                } else {
                    i3 = i28;
                    i4 = -1;
                }
                if (!z2 || (i29 = c0674rk.f4320u0) == i4) {
                    i5 = i3;
                    c0592pc8.f3847X = i5;
                    c0592pc8.f3842S = f2;
                } else {
                    f2 = c0674rk.f4290A0;
                    i5 = i29;
                    c0592pc8.f3847X = i5;
                    c0592pc8.f3842S = f2;
                }
            }
            if (i25 == i7 - 1) {
                c0592pc8.m2094e(c0592pc8.f3878z, this.f4095f, this.f4099j);
            }
            if (c0592pc7 != null) {
                C0099cc c0099cc7 = c0592pc7.f3878z;
                C0099cc c0099cc8 = c0592pc8.f3876x;
                c0099cc8.m659a(c0099cc7, c0674rk.f4292C0);
                if (i25 == i9) {
                    int i30 = this.f4097h;
                    if (c0099cc8.m664f()) {
                        c0099cc8.f949f = i30;
                    }
                }
                c0099cc7.m659a(c0099cc8, 0);
                if (i25 == i10 + 1) {
                    int i31 = this.f4099j;
                    if (c0099cc7.m664f()) {
                        c0099cc7.f949f = i31;
                    }
                }
            }
            if (c0592pc8 != c0592pc6) {
                int i32 = c0674rk.f4295F0;
                c = 3;
                if (i32 == 3 && c0592pc.f3875w && c0592pc8 != c0592pc && c0592pc8.f3875w) {
                    c0592pc8.f3825B.m659a(c0592pc.f3825B, 0);
                } else if (i32 == 0) {
                    c0592pc8.f3877y.m659a(c0099cc6, 0);
                } else if (i32 == 1) {
                    c0592pc8.f3824A.m659a(c0099cc5, 0);
                } else if (z3) {
                    c0592pc8.f3877y.m659a(this.f4094e, this.f4098i);
                    c0592pc8.f3824A.m659a(this.f4096g, this.f4100k);
                } else {
                    c0592pc8.f3877y.m659a(c0099cc6, 0);
                    c0592pc8.f3824A.m659a(c0099cc5, 0);
                }
            } else {
                c = 3;
            }
            i25++;
            c0592pc7 = c0592pc8;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2173c() {
        return this.f4090a == 1 ? this.f4102m - this.f4107r.f4293D0 : this.f4102m;
    }

    /* JADX INFO: renamed from: d */
    public final int m2174d() {
        return this.f4090a == 0 ? this.f4101l - this.f4107r.f4292C0 : this.f4101l;
    }

    /* JADX INFO: renamed from: e */
    public final void m2175e(int i) {
        C0674rk c0674rk;
        int i2;
        int i3 = this.f4105p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f4104o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c0674rk = this.f4107r;
            if (i6 >= i4 || (i2 = this.f4103n + i6) >= c0674rk.f4304O0) {
                break;
            }
            C0592pc c0592pc = c0674rk.f4303N0[i2];
            if (this.f4090a == 0) {
                if (c0592pc != null) {
                    int[] iArr = c0592pc.f3855c0;
                    if (iArr[0] == 3 && c0592pc.f3862j == 0) {
                        c0674rk.m2294E(1, i5, iArr[1], c0592pc.m2097i(), c0592pc);
                    }
                }
            } else if (c0592pc != null) {
                int[] iArr2 = c0592pc.f3855c0;
                if (iArr2[1] == 3 && c0592pc.f3863k == 0) {
                    int i7 = i5;
                    c0674rk.m2294E(iArr2[0], c0592pc.m2100l(), 1, i7, c0592pc);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.f4101l = 0;
        this.f4102m = 0;
        this.f4091b = null;
        this.f4092c = 0;
        int i8 = this.f4104o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f4103n + i9;
            if (i10 >= c0674rk.f4304O0) {
                return;
            }
            C0592pc c0592pc2 = c0674rk.f4303N0[i10];
            if (this.f4090a == 0) {
                int iM2100l = c0592pc2.m2100l();
                int i11 = c0674rk.f4292C0;
                if (c0592pc2.f3845V == 8) {
                    i11 = 0;
                }
                this.f4101l = iM2100l + i11 + this.f4101l;
                int iM2292C = c0674rk.m2292C(c0592pc2, this.f4106q);
                if (this.f4091b == null || this.f4092c < iM2292C) {
                    this.f4091b = c0592pc2;
                    this.f4092c = iM2292C;
                    this.f4102m = iM2292C;
                }
            } else {
                int iM2293D = c0674rk.m2293D(c0592pc2, this.f4106q);
                int iM2292C2 = c0674rk.m2292C(c0592pc2, this.f4106q);
                int i12 = c0674rk.f4293D0;
                if (c0592pc2.f3845V == 8) {
                    i12 = 0;
                }
                this.f4102m = iM2292C2 + i12 + this.f4102m;
                if (this.f4091b == null || this.f4092c < iM2293D) {
                    this.f4091b = c0592pc2;
                    this.f4092c = iM2293D;
                    this.f4101l = iM2293D;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2176f(int i, C0099cc c0099cc, C0099cc c0099cc2, C0099cc c0099cc3, C0099cc c0099cc4, int i2, int i3, int i4, int i5, int i6) {
        this.f4090a = i;
        this.f4093d = c0099cc;
        this.f4094e = c0099cc2;
        this.f4095f = c0099cc3;
        this.f4096g = c0099cc4;
        this.f4097h = i2;
        this.f4098i = i3;
        this.f4099j = i4;
        this.f4100k = i5;
        this.f4106q = i6;
    }
}
