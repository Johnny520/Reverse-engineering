package p000;

/* JADX INFO: renamed from: sk */
/* JADX INFO: loaded from: classes.dex */
public final class C0710sk {

    /* JADX INFO: renamed from: a */
    public int f4321a;

    /* JADX INFO: renamed from: d */
    public C0443lc f4324d;

    /* JADX INFO: renamed from: e */
    public C0443lc f4325e;

    /* JADX INFO: renamed from: f */
    public C0443lc f4326f;

    /* JADX INFO: renamed from: g */
    public C0443lc f4327g;

    /* JADX INFO: renamed from: h */
    public int f4328h;

    /* JADX INFO: renamed from: i */
    public int f4329i;

    /* JADX INFO: renamed from: j */
    public int f4330j;

    /* JADX INFO: renamed from: k */
    public int f4331k;

    /* JADX INFO: renamed from: q */
    public int f4337q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0747tk f4338r;

    /* JADX INFO: renamed from: b */
    public C0925yc f4322b = null;

    /* JADX INFO: renamed from: c */
    public int f4323c = 0;

    /* JADX INFO: renamed from: l */
    public int f4332l = 0;

    /* JADX INFO: renamed from: m */
    public int f4333m = 0;

    /* JADX INFO: renamed from: n */
    public int f4334n = 0;

    /* JADX INFO: renamed from: o */
    public int f4335o = 0;

    /* JADX INFO: renamed from: p */
    public int f4336p = 0;

    public C0710sk(C0747tk c0747tk, int i, C0443lc c0443lc, C0443lc c0443lc2, C0443lc c0443lc3, C0443lc c0443lc4, int i2) {
        this.f4338r = c0747tk;
        this.f4328h = 0;
        this.f4329i = 0;
        this.f4330j = 0;
        this.f4331k = 0;
        this.f4337q = 0;
        this.f4321a = i;
        this.f4324d = c0443lc;
        this.f4325e = c0443lc2;
        this.f4326f = c0443lc3;
        this.f4327g = c0443lc4;
        this.f4328h = c0747tk.f4548j0;
        this.f4329i = c0747tk.f4544f0;
        this.f4330j = c0747tk.f4549k0;
        this.f4331k = c0747tk.f4545g0;
        this.f4337q = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2376a(C0925yc c0925yc) {
        int i = this.f4321a;
        C0747tk c0747tk = this.f4338r;
        if (i == 0) {
            int iM2415D = c0747tk.m2415D(c0925yc, this.f4337q);
            if (c0925yc.f5402c0[0] == 3) {
                this.f4336p++;
                iM2415D = 0;
            }
            this.f4332l = iM2415D + (c0925yc.f5392V != 8 ? c0747tk.f4531C0 : 0) + this.f4332l;
            int iM2414C = c0747tk.m2414C(c0925yc, this.f4337q);
            if (this.f4322b == null || this.f4323c < iM2414C) {
                this.f4322b = c0925yc;
                this.f4323c = iM2414C;
                this.f4333m = iM2414C;
            }
        } else {
            int iM2415D2 = c0747tk.m2415D(c0925yc, this.f4337q);
            int iM2414C2 = c0747tk.m2414C(c0925yc, this.f4337q);
            if (c0925yc.f5402c0[1] == 3) {
                this.f4336p++;
                iM2414C2 = 0;
            }
            this.f4333m = iM2414C2 + (c0925yc.f5392V != 8 ? c0747tk.f4532D0 : 0) + this.f4333m;
            if (this.f4322b == null || this.f4323c < iM2415D2) {
                this.f4322b = c0925yc;
                this.f4323c = iM2415D2;
                this.f4332l = iM2415D2;
            }
        }
        this.f4335o++;
    }

    /* JADX INFO: renamed from: b */
    public final void m2377b(int i, boolean z, boolean z2) {
        C0747tk c0747tk;
        int i2;
        C0925yc c0925yc;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f4335o;
        int i8 = 0;
        while (true) {
            c0747tk = this.f4338r;
            if (i8 >= i7 || (i6 = this.f4334n + i8) >= c0747tk.f4543O0) {
                break;
            }
            C0925yc c0925yc2 = c0747tk.f4542N0[i6];
            if (c0925yc2 != null) {
                c0925yc2.m2757t();
            }
            i8++;
        }
        if (i7 == 0 || this.f4322b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = this.f4334n + (z ? (i7 - 1) - i11 : i11);
            if (i12 >= c0747tk.f4543O0) {
                break;
            }
            if (c0747tk.f4542N0[i12].f5392V == 0) {
                if (i9 == -1) {
                    i9 = i11;
                }
                i10 = i11;
            }
        }
        if (this.f4321a != 0) {
            C0925yc c0925yc3 = this.f4322b;
            c0925yc3.f5394X = c0747tk.f4555q0;
            C0443lc c0443lc = c0925yc3.f5423x;
            C0443lc c0443lc2 = c0925yc3.f5425z;
            int i13 = this.f4328h;
            if (i > 0) {
                i13 += c0747tk.f4531C0;
            }
            if (z) {
                c0443lc2.m1751a(this.f4326f, i13);
                if (z2) {
                    c0443lc.m1751a(this.f4324d, this.f4330j);
                }
                if (i > 0) {
                    this.f4326f.f2991b.f5423x.m1751a(c0443lc2, 0);
                }
            } else {
                c0443lc.m1751a(this.f4324d, i13);
                if (z2) {
                    c0443lc2.m1751a(this.f4326f, this.f4330j);
                }
                if (i > 0) {
                    this.f4324d.f2991b.f5425z.m1751a(c0443lc, 0);
                }
            }
            C0925yc c0925yc4 = null;
            int i14 = 0;
            while (i14 < i7) {
                int i15 = this.f4334n + i14;
                if (i15 >= c0747tk.f4543O0) {
                    return;
                }
                C0925yc c0925yc5 = c0747tk.f4542N0[i15];
                if (i14 == 0) {
                    c0925yc5.m2743e(c0925yc5.f5424y, this.f4325e, this.f4329i);
                    int i16 = c0747tk.f4556r0;
                    float f = c0747tk.f4562x0;
                    if (this.f4334n == 0) {
                        int i17 = c0747tk.f4558t0;
                        i2 = -1;
                        if (i17 != -1) {
                            f = c0747tk.f4564z0;
                        }
                        i16 = i17;
                        c0925yc5.f5395Y = i16;
                        c0925yc5.f5390T = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && (i17 = c0747tk.f4560v0) != i2) {
                        f = c0747tk.f4530B0;
                        i16 = i17;
                    }
                    c0925yc5.f5395Y = i16;
                    c0925yc5.f5390T = f;
                }
                if (i14 == i7 - 1) {
                    c0925yc5.m2743e(c0925yc5.f5371A, this.f4327g, this.f4331k);
                }
                if (c0925yc4 != null) {
                    C0443lc c0443lc3 = c0925yc4.f5371A;
                    C0443lc c0443lc4 = c0925yc5.f5424y;
                    c0443lc4.m1751a(c0443lc3, c0747tk.f4532D0);
                    if (i14 == i9) {
                        int i18 = this.f4329i;
                        if (c0443lc4.m1756f()) {
                            c0443lc4.f2995f = i18;
                        }
                    }
                    c0443lc3.m1751a(c0443lc4, 0);
                    if (i14 == i10 + 1) {
                        int i19 = this.f4331k;
                        if (c0443lc3.m1756f()) {
                            c0443lc3.f2995f = i19;
                        }
                    }
                }
                if (c0925yc5 != c0925yc3) {
                    if (z) {
                        int i20 = c0747tk.f4533E0;
                        if (i20 == 0) {
                            c0925yc5.f5425z.m1751a(c0443lc2, 0);
                        } else if (i20 == 1) {
                            c0925yc5.f5423x.m1751a(c0443lc, 0);
                        } else if (i20 == 2) {
                            c0925yc5.f5423x.m1751a(c0443lc, 0);
                            c0925yc5.f5425z.m1751a(c0443lc2, 0);
                        }
                    } else {
                        int i21 = c0747tk.f4533E0;
                        if (i21 == 0) {
                            c0925yc5.f5423x.m1751a(c0443lc, 0);
                        } else if (i21 == 1) {
                            c0925yc5.f5425z.m1751a(c0443lc2, 0);
                        } else if (i21 == 2) {
                            if (z3) {
                                c0925yc5.f5423x.m1751a(this.f4324d, this.f4328h);
                                c0925yc5.f5425z.m1751a(this.f4326f, this.f4330j);
                            } else {
                                c0925yc5.f5423x.m1751a(c0443lc, 0);
                                c0925yc5.f5425z.m1751a(c0443lc2, 0);
                            }
                        }
                    }
                }
                i14++;
                c0925yc4 = c0925yc5;
            }
            return;
        }
        C0925yc c0925yc6 = this.f4322b;
        c0925yc6.f5395Y = c0747tk.f4556r0;
        C0443lc c0443lc5 = c0925yc6.f5371A;
        C0443lc c0443lc6 = c0925yc6.f5424y;
        int i22 = this.f4329i;
        if (i > 0) {
            i22 += c0747tk.f4532D0;
        }
        c0443lc6.m1751a(this.f4325e, i22);
        if (z2) {
            c0443lc5.m1751a(this.f4327g, this.f4331k);
        }
        if (i > 0) {
            this.f4325e.f2991b.f5371A.m1751a(c0443lc6, 0);
        }
        if (c0747tk.f4534F0 != 3 || c0925yc6.f5422w) {
            c0925yc = c0925yc6;
        } else {
            for (int i23 = 0; i23 < i7; i23++) {
                int i24 = this.f4334n + (z ? (i7 - 1) - i23 : i23);
                if (i24 >= c0747tk.f4543O0) {
                    break;
                }
                c0925yc = c0747tk.f4542N0[i24];
                if (c0925yc.f5422w) {
                    break;
                }
            }
            c0925yc = c0925yc6;
        }
        int i25 = 0;
        C0925yc c0925yc7 = null;
        while (i25 < i7) {
            int i26 = z ? (i7 - 1) - i25 : i25;
            int i27 = this.f4334n + i26;
            if (i27 >= c0747tk.f4543O0) {
                return;
            }
            C0925yc c0925yc8 = c0747tk.f4542N0[i27];
            if (i25 == 0) {
                c0925yc8.m2743e(c0925yc8.f5423x, this.f4324d, this.f4328h);
            }
            if (i26 == 0) {
                int i28 = c0747tk.f4555q0;
                float f2 = c0747tk.f4561w0;
                if (this.f4334n == 0) {
                    int i29 = c0747tk.f4557s0;
                    i3 = i28;
                    i4 = -1;
                    if (i29 != -1) {
                        f2 = c0747tk.f4563y0;
                    }
                    i5 = i29;
                    c0925yc8.f5394X = i5;
                    c0925yc8.f5389S = f2;
                } else {
                    i3 = i28;
                    i4 = -1;
                }
                if (!z2 || (i29 = c0747tk.f4559u0) == i4) {
                    i5 = i3;
                    c0925yc8.f5394X = i5;
                    c0925yc8.f5389S = f2;
                } else {
                    f2 = c0747tk.f4529A0;
                    i5 = i29;
                    c0925yc8.f5394X = i5;
                    c0925yc8.f5389S = f2;
                }
            }
            if (i25 == i7 - 1) {
                c0925yc8.m2743e(c0925yc8.f5425z, this.f4326f, this.f4330j);
            }
            if (c0925yc7 != null) {
                C0443lc c0443lc7 = c0925yc7.f5425z;
                C0443lc c0443lc8 = c0925yc8.f5423x;
                c0443lc8.m1751a(c0443lc7, c0747tk.f4531C0);
                if (i25 == i9) {
                    int i30 = this.f4328h;
                    if (c0443lc8.m1756f()) {
                        c0443lc8.f2995f = i30;
                    }
                }
                c0443lc7.m1751a(c0443lc8, 0);
                if (i25 == i10 + 1) {
                    int i31 = this.f4330j;
                    if (c0443lc7.m1756f()) {
                        c0443lc7.f2995f = i31;
                    }
                }
            }
            if (c0925yc8 != c0925yc6) {
                int i32 = c0747tk.f4534F0;
                c = 3;
                if (i32 == 3 && c0925yc.f5422w && c0925yc8 != c0925yc && c0925yc8.f5422w) {
                    c0925yc8.f5372B.m1751a(c0925yc.f5372B, 0);
                } else if (i32 == 0) {
                    c0925yc8.f5424y.m1751a(c0443lc6, 0);
                } else if (i32 == 1) {
                    c0925yc8.f5371A.m1751a(c0443lc5, 0);
                } else if (z3) {
                    c0925yc8.f5424y.m1751a(this.f4325e, this.f4329i);
                    c0925yc8.f5371A.m1751a(this.f4327g, this.f4331k);
                } else {
                    c0925yc8.f5424y.m1751a(c0443lc6, 0);
                    c0925yc8.f5371A.m1751a(c0443lc5, 0);
                }
            } else {
                c = 3;
            }
            i25++;
            c0925yc7 = c0925yc8;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2378c() {
        return this.f4321a == 1 ? this.f4333m - this.f4338r.f4532D0 : this.f4333m;
    }

    /* JADX INFO: renamed from: d */
    public final int m2379d() {
        return this.f4321a == 0 ? this.f4332l - this.f4338r.f4531C0 : this.f4332l;
    }

    /* JADX INFO: renamed from: e */
    public final void m2380e(int i) {
        C0747tk c0747tk;
        int i2;
        int i3 = this.f4336p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f4335o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c0747tk = this.f4338r;
            if (i6 >= i4 || (i2 = this.f4334n + i6) >= c0747tk.f4543O0) {
                break;
            }
            C0925yc c0925yc = c0747tk.f4542N0[i2];
            if (this.f4321a == 0) {
                if (c0925yc != null) {
                    int[] iArr = c0925yc.f5402c0;
                    if (iArr[0] == 3 && c0925yc.f5409j == 0) {
                        c0747tk.m2416E(1, i5, iArr[1], c0925yc.m2746i(), c0925yc);
                    }
                }
            } else if (c0925yc != null) {
                int[] iArr2 = c0925yc.f5402c0;
                if (iArr2[1] == 3 && c0925yc.f5410k == 0) {
                    int i7 = i5;
                    c0747tk.m2416E(iArr2[0], c0925yc.m2749l(), 1, i7, c0925yc);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.f4332l = 0;
        this.f4333m = 0;
        this.f4322b = null;
        this.f4323c = 0;
        int i8 = this.f4335o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f4334n + i9;
            if (i10 >= c0747tk.f4543O0) {
                return;
            }
            C0925yc c0925yc2 = c0747tk.f4542N0[i10];
            if (this.f4321a == 0) {
                int iM2749l = c0925yc2.m2749l();
                int i11 = c0747tk.f4531C0;
                if (c0925yc2.f5392V == 8) {
                    i11 = 0;
                }
                this.f4332l = iM2749l + i11 + this.f4332l;
                int iM2414C = c0747tk.m2414C(c0925yc2, this.f4337q);
                if (this.f4322b == null || this.f4323c < iM2414C) {
                    this.f4322b = c0925yc2;
                    this.f4323c = iM2414C;
                    this.f4333m = iM2414C;
                }
            } else {
                int iM2415D = c0747tk.m2415D(c0925yc2, this.f4337q);
                int iM2414C2 = c0747tk.m2414C(c0925yc2, this.f4337q);
                int i12 = c0747tk.f4532D0;
                if (c0925yc2.f5392V == 8) {
                    i12 = 0;
                }
                this.f4333m = iM2414C2 + i12 + this.f4333m;
                if (this.f4322b == null || this.f4323c < iM2415D) {
                    this.f4322b = c0925yc2;
                    this.f4323c = iM2415D;
                    this.f4332l = iM2415D;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2381f(int i, C0443lc c0443lc, C0443lc c0443lc2, C0443lc c0443lc3, C0443lc c0443lc4, int i2, int i3, int i4, int i5, int i6) {
        this.f4321a = i;
        this.f4324d = c0443lc;
        this.f4325e = c0443lc2;
        this.f4326f = c0443lc3;
        this.f4327g = c0443lc4;
        this.f4328h = i2;
        this.f4329i = i3;
        this.f4330j = i4;
        this.f4331k = i5;
        this.f4337q = i6;
    }
}
