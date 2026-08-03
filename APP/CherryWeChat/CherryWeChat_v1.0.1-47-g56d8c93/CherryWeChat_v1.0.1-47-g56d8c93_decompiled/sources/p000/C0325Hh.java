package p000;

/* JADX INFO: renamed from: Hh */
/* JADX INFO: loaded from: classes.dex */
public final class C0325Hh {

    /* JADX INFO: renamed from: a */
    public int f1090a;

    /* JADX INFO: renamed from: d */
    public C1259cb f1093d;

    /* JADX INFO: renamed from: e */
    public C1259cb f1094e;

    /* JADX INFO: renamed from: f */
    public C1259cb f1095f;

    /* JADX INFO: renamed from: g */
    public C1259cb f1096g;

    /* JADX INFO: renamed from: h */
    public int f1097h;

    /* JADX INFO: renamed from: i */
    public int f1098i;

    /* JADX INFO: renamed from: j */
    public int f1099j;

    /* JADX INFO: renamed from: k */
    public int f1100k;

    /* JADX INFO: renamed from: q */
    public int f1106q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0368Ih f1107r;

    /* JADX INFO: renamed from: b */
    public C2454rb f1091b = null;

    /* JADX INFO: renamed from: c */
    public int f1092c = 0;

    /* JADX INFO: renamed from: l */
    public int f1101l = 0;

    /* JADX INFO: renamed from: m */
    public int f1102m = 0;

    /* JADX INFO: renamed from: n */
    public int f1103n = 0;

    /* JADX INFO: renamed from: o */
    public int f1104o = 0;

    /* JADX INFO: renamed from: p */
    public int f1105p = 0;

    public C0325Hh(C0368Ih c0368Ih, int i, C1259cb c1259cb, C1259cb c1259cb2, C1259cb c1259cb3, C1259cb c1259cb4, int i2) {
        this.f1107r = c0368Ih;
        this.f1090a = i;
        this.f1093d = c1259cb;
        this.f1094e = c1259cb2;
        this.f1095f = c1259cb3;
        this.f1096g = c1259cb4;
        this.f1097h = c0368Ih.f1280w0;
        this.f1098i = c0368Ih.f1276s0;
        this.f1099j = c0368Ih.f1281x0;
        this.f1100k = c0368Ih.f1277t0;
        this.f1106q = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m688a(C2454rb c2454rb) {
        int i = this.f1090a;
        C0368Ih c0368Ih = this.f1107r;
        if (i == 0) {
            int iM811U = c0368Ih.m811U(c2454rb, this.f1106q);
            if (c2454rb.f8637p0[0] == 3) {
                this.f1105p++;
                iM811U = 0;
            }
            this.f1101l = iM811U + (c2454rb.f8619g0 != 8 ? c0368Ih.f1263P0 : 0) + this.f1101l;
            int iM810T = c0368Ih.m810T(c2454rb, this.f1106q);
            if (this.f1091b == null || this.f1092c < iM810T) {
                this.f1091b = c2454rb;
                this.f1092c = iM810T;
                this.f1102m = iM810T;
            }
        } else {
            int iM811U2 = c0368Ih.m811U(c2454rb, this.f1106q);
            int iM810T2 = c0368Ih.m810T(c2454rb, this.f1106q);
            if (c2454rb.f8637p0[1] == 3) {
                this.f1105p++;
                iM810T2 = 0;
            }
            this.f1102m = iM810T2 + (c2454rb.f8619g0 != 8 ? c0368Ih.f1264Q0 : 0) + this.f1102m;
            if (this.f1091b == null || this.f1092c < iM811U2) {
                this.f1091b = c2454rb;
                this.f1092c = iM811U2;
                this.f1101l = iM811U2;
            }
        }
        this.f1104o++;
    }

    /* JADX INFO: renamed from: b */
    public final void m689b(int i, boolean z, boolean z2) {
        C0368Ih c0368Ih;
        int i2;
        int i3;
        C2454rb c2454rb;
        boolean z3;
        int i4;
        int i5;
        char c;
        float f;
        float f2;
        float f3;
        int i6;
        float f4;
        float f5;
        int i7;
        int i8 = this.f1104o;
        int i9 = 0;
        while (true) {
            c0368Ih = this.f1107r;
            if (i9 >= i8 || (i7 = this.f1103n + i9) >= c0368Ih.f1275b1) {
                break;
            }
            C2454rb c2454rb2 = c0368Ih.f1274a1[i7];
            if (c2454rb2 != null) {
                c2454rb2.m4915D();
            }
            i9++;
        }
        if (i8 == 0 || this.f1091b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = this.f1103n + (z ? (i8 - 1) - i12 : i12);
            if (i13 >= c0368Ih.f1275b1) {
                break;
            }
            C2454rb c2454rb3 = c0368Ih.f1274a1[i13];
            if (c2454rb3 != null && c2454rb3.f8619g0 == 0) {
                if (i10 == -1) {
                    i10 = i12;
                }
                i11 = i12;
            }
        }
        if (this.f1090a == 0) {
            C2454rb c2454rb4 = this.f1091b;
            c2454rb4.f8625j0 = c0368Ih.f1252E0;
            C1259cb c1259cb = c2454rb4.f8591L;
            C1259cb c1259cb2 = c2454rb4.f8589J;
            int i14 = this.f1098i;
            if (i > 0) {
                i14 += c0368Ih.f1264Q0;
            }
            c1259cb2.m2380a(this.f1094e, i14);
            if (z2) {
                c1259cb.m2380a(this.f1096g, this.f1100k);
            }
            if (i > 0) {
                this.f1094e.f4268d.f8591L.m2380a(c1259cb2, 0);
            }
            if (c0368Ih.f1266S0 != 3 || c2454rb4.f8584E) {
                c2454rb = c2454rb4;
            } else {
                for (int i15 = 0; i15 < i8; i15++) {
                    int i16 = this.f1103n + (z ? (i8 - 1) - i15 : i15);
                    if (i16 >= c0368Ih.f1275b1) {
                        break;
                    }
                    c2454rb = c0368Ih.f1274a1[i16];
                    if (c2454rb.f8584E) {
                        break;
                    }
                }
                c2454rb = c2454rb4;
            }
            int i17 = 0;
            C2454rb c2454rb5 = null;
            while (i17 < i8) {
                int i18 = z ? (i8 - 1) - i17 : i17;
                int i19 = this.f1103n + i18;
                if (i19 >= c0368Ih.f1275b1) {
                    return;
                }
                C2454rb c2454rb6 = c0368Ih.f1274a1[i19];
                if (c2454rb6 == null) {
                    i5 = i8;
                    z3 = z4;
                    i4 = i11;
                    c = 3;
                } else {
                    C1259cb c1259cb3 = c2454rb6.f8591L;
                    C1259cb c1259cb4 = c2454rb6.f8589J;
                    C1259cb c1259cb5 = c2454rb6.f8588I;
                    z3 = z4;
                    if (i17 == 0) {
                        i4 = i11;
                        c2454rb6.m4929f(c1259cb5, this.f1093d, this.f1097h);
                    } else {
                        i4 = i11;
                    }
                    if (i18 == 0) {
                        int i20 = c0368Ih.f1251D0;
                        if (z) {
                            f = 1.0f;
                            f2 = 1.0f - c0368Ih.f1257J0;
                        } else {
                            f = 1.0f;
                            f2 = c0368Ih.f1257J0;
                        }
                        if (this.f1103n == 0) {
                            i6 = c0368Ih.f1253F0;
                            f3 = f2;
                            if (i6 != -1) {
                                if (z) {
                                    f5 = c0368Ih.f1259L0;
                                    f4 = f - f5;
                                    c2454rb6.f8623i0 = i6;
                                    c2454rb6.f8613d0 = f4;
                                } else {
                                    f4 = c0368Ih.f1259L0;
                                    c2454rb6.f8623i0 = i6;
                                    c2454rb6.f8613d0 = f4;
                                }
                            }
                        } else {
                            f3 = f2;
                        }
                        if (!z2 || (i6 = c0368Ih.f1255H0) == -1) {
                            i6 = i20;
                            f4 = f3;
                        } else if (z) {
                            f5 = c0368Ih.f1261N0;
                            f4 = f - f5;
                        } else {
                            f4 = c0368Ih.f1261N0;
                        }
                        c2454rb6.f8623i0 = i6;
                        c2454rb6.f8613d0 = f4;
                    }
                    if (i17 == i8 - 1) {
                        i5 = i8;
                        c2454rb6.m4929f(c2454rb6.f8590K, this.f1095f, this.f1099j);
                    } else {
                        i5 = i8;
                    }
                    if (c2454rb5 != null) {
                        C1259cb c1259cb6 = c2454rb5.f8590K;
                        c1259cb5.m2380a(c1259cb6, c0368Ih.f1263P0);
                        if (i17 == i10) {
                            int i21 = this.f1097h;
                            if (c1259cb5.m2387h()) {
                                c1259cb5.f4272h = i21;
                            }
                        }
                        c1259cb6.m2380a(c1259cb5, 0);
                        if (i17 == i4 + 1) {
                            int i22 = this.f1099j;
                            if (c1259cb6.m2387h()) {
                                c1259cb6.f4272h = i22;
                            }
                        }
                    }
                    if (c2454rb6 != c2454rb4) {
                        int i23 = c0368Ih.f1266S0;
                        c = 3;
                        if (i23 == 3 && c2454rb.f8584E && c2454rb6 != c2454rb && c2454rb6.f8584E) {
                            c2454rb6.f8592M.m2380a(c2454rb.f8592M, 0);
                        } else if (i23 == 0) {
                            c1259cb4.m2380a(c1259cb2, 0);
                        } else if (i23 == 1) {
                            c1259cb3.m2380a(c1259cb, 0);
                        } else if (z3) {
                            c1259cb4.m2380a(this.f1094e, this.f1098i);
                            c1259cb3.m2380a(this.f1096g, this.f1100k);
                        } else {
                            c1259cb4.m2380a(c1259cb2, 0);
                            c1259cb3.m2380a(c1259cb, 0);
                        }
                    } else {
                        c = 3;
                    }
                    c2454rb5 = c2454rb6;
                }
                i17++;
                z4 = z3;
                i11 = i4;
                i8 = i5;
            }
            return;
        }
        int i24 = i8;
        boolean z5 = z4;
        int i25 = i11;
        C2454rb c2454rb7 = this.f1091b;
        c2454rb7.f8623i0 = c0368Ih.f1251D0;
        C1259cb c1259cb7 = c2454rb7.f8588I;
        C1259cb c1259cb8 = c2454rb7.f8590K;
        int i26 = this.f1097h;
        if (i > 0) {
            i26 += c0368Ih.f1263P0;
        }
        if (z) {
            c1259cb8.m2380a(this.f1095f, i26);
            if (z2) {
                c1259cb7.m2380a(this.f1093d, this.f1099j);
            }
            if (i > 0) {
                this.f1095f.f4268d.f8588I.m2380a(c1259cb8, 0);
            }
        } else {
            c1259cb7.m2380a(this.f1093d, i26);
            if (z2) {
                c1259cb8.m2380a(this.f1095f, this.f1099j);
            }
            if (i > 0) {
                this.f1093d.f4268d.f8590K.m2380a(c1259cb7, 0);
            }
        }
        int i27 = 0;
        C2454rb c2454rb8 = null;
        while (true) {
            int i28 = i24;
            if (i27 >= i28 || (i2 = this.f1103n + i27) >= c0368Ih.f1275b1) {
                return;
            }
            C2454rb c2454rb9 = c0368Ih.f1274a1[i2];
            if (c2454rb9 == null) {
                i24 = i28;
            } else {
                C1259cb c1259cb9 = c2454rb9.f8589J;
                C1259cb c1259cb10 = c2454rb9.f8590K;
                C1259cb c1259cb11 = c2454rb9.f8588I;
                if (i27 == 0) {
                    c2454rb9.m4929f(c1259cb9, this.f1094e, this.f1098i);
                    int i29 = c0368Ih.f1252E0;
                    float f6 = c0368Ih.f1258K0;
                    if (this.f1103n == 0) {
                        int i30 = c0368Ih.f1254G0;
                        i24 = i28;
                        i3 = -1;
                        if (i30 != -1) {
                            f6 = c0368Ih.f1260M0;
                        }
                        i29 = i30;
                        c2454rb9.f8625j0 = i29;
                        c2454rb9.f8615e0 = f6;
                    } else {
                        i24 = i28;
                        i3 = -1;
                    }
                    if (z2 && (i30 = c0368Ih.f1256I0) != i3) {
                        f6 = c0368Ih.f1262O0;
                        i29 = i30;
                    }
                    c2454rb9.f8625j0 = i29;
                    c2454rb9.f8615e0 = f6;
                } else {
                    i24 = i28;
                }
                if (i27 == i24 - 1) {
                    c2454rb9.m4929f(c2454rb9.f8591L, this.f1096g, this.f1100k);
                }
                if (c2454rb8 != null) {
                    C1259cb c1259cb12 = c2454rb8.f8591L;
                    c1259cb9.m2380a(c1259cb12, c0368Ih.f1264Q0);
                    if (i27 == i10) {
                        int i31 = this.f1098i;
                        if (c1259cb9.m2387h()) {
                            c1259cb9.f4272h = i31;
                        }
                    }
                    c1259cb12.m2380a(c1259cb9, 0);
                    if (i27 == i25 + 1) {
                        int i32 = this.f1100k;
                        if (c1259cb12.m2387h()) {
                            c1259cb12.f4272h = i32;
                        }
                    }
                }
                if (c2454rb9 == c2454rb7) {
                    c2454rb8 = c2454rb9;
                } else if (z) {
                    int i33 = c0368Ih.f1265R0;
                    if (i33 == 0) {
                        c1259cb10.m2380a(c1259cb8, 0);
                    } else if (i33 == 1) {
                        c1259cb11.m2380a(c1259cb7, 0);
                    } else if (i33 == 2) {
                        c1259cb11.m2380a(c1259cb7, 0);
                        c1259cb10.m2380a(c1259cb8, 0);
                    }
                    c2454rb8 = c2454rb9;
                } else {
                    int i34 = c0368Ih.f1265R0;
                    if (i34 == 0) {
                        c1259cb11.m2380a(c1259cb7, 0);
                    } else if (i34 == 1) {
                        c1259cb10.m2380a(c1259cb8, 0);
                    } else if (i34 == 2) {
                        if (z5) {
                            c1259cb11.m2380a(this.f1093d, this.f1097h);
                            c1259cb10.m2380a(this.f1095f, this.f1099j);
                        } else {
                            c1259cb11.m2380a(c1259cb7, 0);
                            c1259cb10.m2380a(c1259cb8, 0);
                        }
                    }
                    c2454rb8 = c2454rb9;
                }
            }
            i27++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m690c() {
        return this.f1090a == 1 ? this.f1102m - this.f1107r.f1264Q0 : this.f1102m;
    }

    /* JADX INFO: renamed from: d */
    public final int m691d() {
        return this.f1090a == 0 ? this.f1101l - this.f1107r.f1263P0 : this.f1101l;
    }

    /* JADX INFO: renamed from: e */
    public final void m692e(int i) {
        C0368Ih c0368Ih;
        int i2;
        int i3 = this.f1105p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f1104o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c0368Ih = this.f1107r;
            if (i6 >= i4 || (i2 = this.f1103n + i6) >= c0368Ih.f1275b1) {
                break;
            }
            C2454rb c2454rb = c0368Ih.f1274a1[i2];
            if (this.f1090a == 0) {
                if (c2454rb != null) {
                    int[] iArr = c2454rb.f8637p0;
                    if (iArr[0] == 3 && c2454rb.f8639r == 0) {
                        c0368Ih.m812V(1, i5, iArr[1], c2454rb.m4933k(), c2454rb);
                    }
                }
            } else if (c2454rb != null) {
                int[] iArr2 = c2454rb.f8637p0;
                if (iArr2[1] == 3 && c2454rb.f8640s == 0) {
                    int i7 = i5;
                    c0368Ih.m812V(iArr2[0], c2454rb.m4937q(), 1, i7, c2454rb);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.f1101l = 0;
        this.f1102m = 0;
        this.f1091b = null;
        this.f1092c = 0;
        int i8 = this.f1104o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f1103n + i9;
            if (i10 >= c0368Ih.f1275b1) {
                return;
            }
            C2454rb c2454rb2 = c0368Ih.f1274a1[i10];
            if (this.f1090a == 0) {
                int iM4937q = c2454rb2.m4937q();
                int i11 = c0368Ih.f1263P0;
                if (c2454rb2.f8619g0 == 8) {
                    i11 = 0;
                }
                this.f1101l = iM4937q + i11 + this.f1101l;
                int iM810T = c0368Ih.m810T(c2454rb2, this.f1106q);
                if (this.f1091b == null || this.f1092c < iM810T) {
                    this.f1091b = c2454rb2;
                    this.f1092c = iM810T;
                    this.f1102m = iM810T;
                }
            } else {
                int iM811U = c0368Ih.m811U(c2454rb2, this.f1106q);
                int iM810T2 = c0368Ih.m810T(c2454rb2, this.f1106q);
                int i12 = c0368Ih.f1264Q0;
                if (c2454rb2.f8619g0 == 8) {
                    i12 = 0;
                }
                this.f1102m = iM810T2 + i12 + this.f1102m;
                if (this.f1091b == null || this.f1092c < iM811U) {
                    this.f1091b = c2454rb2;
                    this.f1092c = iM811U;
                    this.f1101l = iM811U;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m693f(int i, C1259cb c1259cb, C1259cb c1259cb2, C1259cb c1259cb3, C1259cb c1259cb4, int i2, int i3, int i4, int i5, int i6) {
        this.f1090a = i;
        this.f1093d = c1259cb;
        this.f1094e = c1259cb2;
        this.f1095f = c1259cb3;
        this.f1096g = c1259cb4;
        this.f1097h = i2;
        this.f1098i = i3;
        this.f1099j = i4;
        this.f1100k = i5;
        this.f1106q = i6;
    }
}
