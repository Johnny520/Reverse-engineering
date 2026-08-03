package p071n;

import java.util.ArrayList;
import p069m.C0983c;
import p069m.C0985e;
import p069m.C0989i;

/* JADX INFO: renamed from: n.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1005j {

    /* JADX INFO: renamed from: a */
    public static final boolean[] f3715a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:173:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0711 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2437a(C1000e c1000e, C0985e c0985e, int i2) {
        int i3;
        C0997b[] c0997bArr;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        float f2;
        C0999d c0999d;
        boolean z4;
        boolean z5;
        C0998c[] c0998cArr;
        int i6;
        C0999d c0999d2;
        int i7;
        C0999d c0999d3;
        C0999d c0999d4;
        int i8;
        C0989i c0989i;
        int i9;
        C0999d c0999d5;
        int i10;
        int i11;
        C0999d c0999d6;
        C0989i c0989i2;
        C0989i c0989i3;
        C0998c c0998c;
        C0999d c0999d7;
        C0998c c0998c2;
        C0989i c0989i4;
        C0989i c0989i5;
        C0999d c0999d8;
        C0999d c0999d9;
        C0999d c0999d10;
        int size;
        ArrayList arrayList;
        int i12;
        float f3;
        C0999d c0999d11;
        boolean z6;
        C0999d c0999d12;
        C0997b c0997b;
        C0999d c0999d13;
        C0999d c0999d14;
        int i13;
        int i14;
        C0999d c0999d15;
        C1000e c1000e2 = c1000e;
        int i15 = 2;
        if (i2 == 0) {
            i3 = c1000e2.f3647l0;
            c0997bArr = c1000e2.f3650o0;
            i4 = 0;
        } else {
            i3 = c1000e2.f3648m0;
            c0997bArr = c1000e2.f3649n0;
            i4 = 2;
        }
        int i16 = 0;
        while (i16 < i3) {
            C0997b c0997b2 = c0997bArr[i16];
            boolean z7 = c0997b2.f3576q;
            C0999d c0999d16 = c0997b2.f3560a;
            int i17 = 3;
            int i18 = 1;
            int i19 = 8;
            if (z7) {
                i5 = i16;
                z2 = true;
            } else {
                int i20 = c0997b2.f3571l;
                int i21 = i20 * 2;
                C0999d c0999d17 = c0999d16;
                C0999d c0999d18 = c0999d17;
                boolean z8 = false;
                while (!z8) {
                    c0997b2.f3568i += i18;
                    c0999d17.f3613b0[i20] = null;
                    c0999d17.f3611a0[i20] = null;
                    int i22 = c0999d17.f3605V;
                    C0998c[] c0998cArr2 = c0999d17.f3589F;
                    if (i22 != i19) {
                        c0999d17.m2403h(i20);
                        c0998cArr2[i21].m2390c();
                        int i23 = i21 + 1;
                        c0998cArr2[i23].m2390c();
                        c0998cArr2[i21].m2390c();
                        c0998cArr2[i23].m2390c();
                        if (c0997b2.f3561b == null) {
                            c0997b2.f3561b = c0999d17;
                        }
                        c0997b2.f3563d = c0999d17;
                        int i24 = c0999d17.f3615c0[i20];
                        if (i24 == i17) {
                            int i25 = c0999d17.f3624l[i20];
                            if (i25 == 0 || i25 == i17 || i25 == i15) {
                                c0997b2.f3569j++;
                                float f4 = c0999d17.f3609Z[i20];
                                if (f4 > 0.0f) {
                                    c0997b2.f3570k += f4;
                                }
                                i14 = i16;
                                if (c0999d17.f3605V != 8 && i24 == 3 && (i25 == 0 || i25 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0997b2.f3573n = true;
                                    } else {
                                        c0997b2.f3574o = true;
                                    }
                                    if (c0997b2.f3567h == null) {
                                        c0997b2.f3567h = new ArrayList();
                                    }
                                    c0997b2.f3567h.add(c0999d17);
                                }
                                if (c0997b2.f3565f == null) {
                                    c0997b2.f3565f = c0999d17;
                                }
                                C0999d c0999d19 = c0997b2.f3566g;
                                if (c0999d19 != null) {
                                    c0999d19.f3611a0[i20] = c0999d17;
                                }
                                c0997b2.f3566g = c0999d17;
                            } else {
                                i14 = i16;
                            }
                            if (i20 == 0) {
                                if (c0999d17.f3622j == 0 && c0999d17.f3625m == 0) {
                                    int i26 = c0999d17.f3626n;
                                }
                            } else if (c0999d17.f3623k == 0 && c0999d17.f3628p == 0) {
                                int i27 = c0999d17.f3629q;
                            }
                        } else {
                            i14 = i16;
                        }
                    }
                    C0999d c0999d20 = c0999d18;
                    if (c0999d20 != c0999d17) {
                        c0999d20.f3613b0[i20] = c0999d17;
                    }
                    C0998c c0998c3 = c0998cArr2[i21 + 1].f3580d;
                    if (c0998c3 != null) {
                        c0999d15 = c0998c3.f3578b;
                        C0998c c0998c4 = c0999d15.f3589F[i21].f3580d;
                        if (c0998c4 == null || c0998c4.f3578b != c0999d17) {
                            c0999d15 = null;
                        }
                    }
                    if (c0999d15 == null) {
                        c0999d15 = c0999d17;
                        z8 = true;
                    }
                    c0999d18 = c0999d17;
                    i16 = i14;
                    i18 = 1;
                    i19 = 8;
                    i15 = 2;
                    c0999d17 = c0999d15;
                    i17 = 3;
                }
                i5 = i16;
                C0999d c0999d21 = c0997b2.f3561b;
                if (c0999d21 != null) {
                    c0999d21.f3589F[i21].m2390c();
                }
                C0999d c0999d22 = c0997b2.f3563d;
                if (c0999d22 != null) {
                    c0999d22.f3589F[i21 + 1].m2390c();
                }
                c0997b2.f3562c = c0999d17;
                if (i20 == 0 && c0997b2.f3572m) {
                    c0997b2.f3564e = c0999d17;
                } else {
                    c0997b2.f3564e = c0999d16;
                }
                c0997b2.f3575p = c0997b2.f3574o && c0997b2.f3573n;
                z2 = true;
            }
            c0997b2.f3576q = z2;
            C0999d c0999d23 = c0997b2.f3562c;
            C0999d c0999d24 = c0997b2.f3561b;
            C0999d c0999d25 = c0997b2.f3563d;
            C0999d c0999d26 = c0997b2.f3564e;
            float f5 = c0997b2.f3570k;
            boolean z9 = c1000e2.f3615c0[i2] == 2;
            if (i2 == 0) {
                int i28 = c0999d26.f3607X;
                boolean z10 = i28 == 0;
                z5 = i28 == 1;
                z3 = i28 == 2;
                f2 = f5;
                c0999d = c0999d16;
                z4 = z10;
            } else {
                int i29 = c0999d26.f3608Y;
                boolean z11 = i29 == 0;
                boolean z12 = i29 == 1;
                z3 = i29 == 2;
                f2 = f5;
                c0999d = c0999d16;
                z4 = z11;
                z5 = z12;
            }
            boolean z13 = false;
            while (true) {
                c0998cArr = c1000e2.f3589F;
                i6 = i3;
                if (z13) {
                    break;
                }
                C0998c c0998c5 = c0999d.f3589F[i4];
                int i30 = z3 ? 1 : 4;
                int iM2390c = c0998c5.m2390c();
                boolean z14 = z13;
                int[] iArr = c0999d.f3615c0;
                C0997b[] c0997bArr2 = c0997bArr;
                C0999d c0999d27 = c0999d26;
                boolean z15 = iArr[i2] == 3 && c0999d.f3624l[i2] == 0;
                C0998c c0998c6 = c0998c5.f3580d;
                if (c0998c6 != null && c0999d != c0999d16) {
                    iM2390c = c0998c6.m2390c() + iM2390c;
                }
                int i31 = iM2390c;
                if (!z3 || c0999d == c0999d16 || c0999d == c0999d24) {
                    c0999d12 = c0999d16;
                } else {
                    c0999d12 = c0999d16;
                    i30 = 5;
                }
                C0998c c0998c7 = c0998c5.f3580d;
                if (c0998c7 != null) {
                    if (c0999d == c0999d24) {
                        c0999d13 = c0999d24;
                        c0997b = c0997b2;
                        c0985e.m2358f(c0998c5.f3583g, c0998c7.f3583g, i31, 6);
                    } else {
                        c0997b = c0997b2;
                        c0999d13 = c0999d24;
                        c0985e.m2358f(c0998c5.f3583g, c0998c7.f3583g, i31, 8);
                    }
                    c0985e.m2357e(c0998c5.f3583g, c0998c5.f3580d.f3583g, i31, (!z15 || z3) ? i30 : 5);
                } else {
                    c0997b = c0997b2;
                    c0999d13 = c0999d24;
                }
                C0998c[] c0998cArr3 = c0999d.f3589F;
                if (z9) {
                    if (c0999d.f3605V == 8 || iArr[i2] != 3) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        c0985e.m2358f(c0998cArr3[i4 + 1].f3583g, c0998cArr3[i4].f3583g, 0, 5);
                    }
                    c0985e.m2358f(c0998cArr3[i4].f3583g, c0998cArr[i4].f3583g, i13, 8);
                }
                C0998c c0998c8 = c0998cArr3[i4 + 1].f3580d;
                if (c0998c8 != null) {
                    c0999d14 = c0998c8.f3578b;
                    C0998c c0998c9 = c0999d14.f3589F[i4].f3580d;
                    if (c0998c9 == null || c0998c9.f3578b != c0999d) {
                        c0999d14 = null;
                    }
                }
                if (c0999d14 != null) {
                    c0999d = c0999d14;
                    z13 = z14;
                } else {
                    z13 = true;
                }
                i3 = i6;
                c0999d16 = c0999d12;
                c0997bArr = c0997bArr2;
                c0999d26 = c0999d27;
                c0999d24 = c0999d13;
                c0997b2 = c0997b;
            }
            C0997b c0997b3 = c0997b2;
            C0999d c0999d28 = c0999d26;
            C0999d c0999d29 = c0999d16;
            C0999d c0999d30 = c0999d24;
            C0997b[] c0997bArr3 = c0997bArr;
            if (c0999d25 != null) {
                int i32 = i4 + 1;
                if (c0999d23.f3589F[i32].f3580d != null) {
                    C0998c c0998c10 = c0999d25.f3589F[i32];
                    if (c0999d25.f3615c0[i2] == 3 && c0999d25.f3624l[i2] == 0 && !z3) {
                        C0998c c0998c11 = c0998c10.f3580d;
                        if (c0998c11.f3578b == c1000e2) {
                            c0985e.m2357e(c0998c10.f3583g, c0998c11.f3583g, -c0998c10.m2390c(), 5);
                        }
                        c0985e.m2359g(c0998c10.f3583g, c0999d23.f3589F[i32].f3580d.f3583g, -c0998c10.m2390c(), 6);
                    } else {
                        if (z3) {
                            C0998c c0998c12 = c0998c10.f3580d;
                            if (c0998c12.f3578b == c1000e2) {
                                c0985e.m2357e(c0998c10.f3583g, c0998c12.f3583g, -c0998c10.m2390c(), 4);
                            }
                        }
                        c0985e.m2359g(c0998c10.f3583g, c0999d23.f3589F[i32].f3580d.f3583g, -c0998c10.m2390c(), 6);
                    }
                }
            }
            if (z9) {
                int i33 = i4 + 1;
                C0989i c0989i6 = c0998cArr[i33].f3583g;
                C0998c c0998c13 = c0999d23.f3589F[i33];
                c0985e.m2358f(c0989i6, c0998c13.f3583g, c0998c13.m2390c(), 8);
            }
            ArrayList arrayList2 = c0997b3.f3567h;
            if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                float f6 = (!c0997b3.f3573n || c0997b3.f3575p) ? f2 : c0997b3.f3569j;
                C0999d c0999d31 = null;
                float f7 = 0.0f;
                int i34 = 0;
                while (i34 < size) {
                    C0999d c0999d32 = (C0999d) arrayList2.get(i34);
                    float f8 = c0999d32.f3609Z[i2];
                    C0998c[] c0998cArr4 = c0999d32.f3589F;
                    if (f8 < 0.0f) {
                        if (c0997b3.f3575p) {
                            C0989i c0989i7 = c0998cArr4[i4 + 1].f3583g;
                            C0989i c0989i8 = c0998cArr4[i4].f3583g;
                            z6 = false;
                            c0985e.m2357e(c0989i7, c0989i8, 0, 4);
                            arrayList = arrayList2;
                            i12 = size;
                            i34++;
                            size = i12;
                            arrayList2 = arrayList;
                        } else {
                            f8 = 1.0f;
                        }
                    }
                    if (f8 == 0.0f) {
                        C0989i c0989i9 = c0998cArr4[i4 + 1].f3583g;
                        C0989i c0989i10 = c0998cArr4[i4].f3583g;
                        z6 = false;
                        c0985e.m2357e(c0989i9, c0989i10, 0, 8);
                        arrayList = arrayList2;
                        i12 = size;
                        i34++;
                        size = i12;
                        arrayList2 = arrayList;
                    } else {
                        if (c0999d31 != null) {
                            C0998c[] c0998cArr5 = c0999d31.f3589F;
                            C0989i c0989i11 = c0998cArr5[i4].f3583g;
                            int i35 = i4 + 1;
                            C0989i c0989i12 = c0998cArr5[i35].f3583g;
                            arrayList = arrayList2;
                            C0989i c0989i13 = c0998cArr4[i4].f3583g;
                            C0989i c0989i14 = c0998cArr4[i35].f3583g;
                            i12 = size;
                            C0983c c0983cM2363k = c0985e.m2363k();
                            c0999d11 = c0999d32;
                            c0983cM2363k.f3480b = 0.0f;
                            if (f6 == 0.0f || f7 == f8) {
                                f3 = f8;
                                c0983cM2363k.f3482d.mo2335c(c0989i11, 1.0f);
                                c0983cM2363k.f3482d.mo2335c(c0989i12, -1.0f);
                                c0983cM2363k.f3482d.mo2335c(c0989i14, 1.0f);
                                c0983cM2363k.f3482d.mo2335c(c0989i13, -1.0f);
                            } else {
                                if (f7 == 0.0f) {
                                    c0983cM2363k.f3482d.mo2335c(c0989i11, 1.0f);
                                    c0983cM2363k.f3482d.mo2335c(c0989i12, -1.0f);
                                } else if (f8 == 0.0f) {
                                    c0983cM2363k.f3482d.mo2335c(c0989i13, 1.0f);
                                    c0983cM2363k.f3482d.mo2335c(c0989i14, -1.0f);
                                } else {
                                    float f9 = (f7 / f6) / (f8 / f6);
                                    f3 = f8;
                                    c0983cM2363k.f3482d.mo2335c(c0989i11, 1.0f);
                                    c0983cM2363k.f3482d.mo2335c(c0989i12, -1.0f);
                                    c0983cM2363k.f3482d.mo2335c(c0989i14, f9);
                                    c0983cM2363k.f3482d.mo2335c(c0989i13, -f9);
                                }
                                f3 = f8;
                            }
                            c0985e.m2355c(c0983cM2363k);
                        } else {
                            arrayList = arrayList2;
                            i12 = size;
                            f3 = f8;
                            c0999d11 = c0999d32;
                        }
                        f7 = f3;
                        c0999d31 = c0999d11;
                        i34++;
                        size = i12;
                        arrayList2 = arrayList;
                    }
                }
            }
            if (c0999d30 != null) {
                c0999d4 = c0999d30;
                if (c0999d4 == c0999d25 || z3) {
                    C0998c c0998c14 = c0999d29.f3589F[i4];
                    int i36 = i4 + 1;
                    C0998c c0998c15 = c0999d23.f3589F[i36];
                    C0998c c0998c16 = c0998c14.f3580d;
                    C0989i c0989i15 = c0998c16 != null ? c0998c16.f3583g : null;
                    C0998c c0998c17 = c0998c15.f3580d;
                    C0989i c0989i16 = c0998c17 != null ? c0998c17.f3583g : null;
                    C0998c c0998c18 = c0999d4.f3589F[i4];
                    C0998c c0998c19 = c0999d25.f3589F[i36];
                    if (c0989i15 == null || c0989i16 == null) {
                        c0999d2 = c0999d25;
                        i7 = i5;
                    } else {
                        c0999d2 = c0999d25;
                        i7 = i5;
                        c0985e.m2354b(c0998c18.f3583g, c0989i15, c0998c18.m2390c(), i2 == 0 ? c0999d28.f3602S : c0999d28.f3603T, c0989i16, c0998c19.f3583g, c0998c19.m2390c(), 7);
                    }
                    i8 = i7;
                    if ((z4 || z5) && c0999d4 != null && c0999d4 != c0999d2) {
                        C0998c[] c0998cArr6 = c0999d4.f3589F;
                        C0998c c0998c20 = c0998cArr6[i4];
                        int i37 = i4 + 1;
                        C0998c c0998c21 = c0999d2.f3589F[i37];
                        C0998c c0998c22 = c0998c20.f3580d;
                        c0989i = c0998c22 != null ? c0998c22.f3583g : null;
                        C0998c c0998c23 = c0998c21.f3580d;
                        C0989i c0989i17 = c0998c23 != null ? c0998c23.f3583g : null;
                        if (c0999d23 != c0999d2) {
                            C0998c c0998c24 = c0999d23.f3589F[i37].f3580d;
                            c0989i17 = c0998c24 != null ? c0998c24.f3583g : null;
                        }
                        if (c0999d4 == c0999d2) {
                            c0998c21 = c0998cArr6[i37];
                        }
                        if (c0989i != null && c0989i17 != null) {
                            c0985e.m2354b(c0998c20.f3583g, c0989i, c0998c20.m2390c(), 0.5f, c0989i17, c0998c21.f3583g, c0999d2.f3589F[i37].m2390c(), 5);
                        }
                    }
                    i16 = i8 + 1;
                    i15 = 2;
                    c1000e2 = c1000e;
                    i3 = i6;
                    c0997bArr = c0997bArr3;
                } else {
                    c0999d2 = c0999d25;
                    i7 = i5;
                    c0999d3 = c0999d29;
                }
            } else {
                c0999d2 = c0999d25;
                i7 = i5;
                c0999d3 = c0999d29;
                c0999d4 = c0999d30;
            }
            if (!z4 || c0999d4 == null) {
                C0999d c0999d33 = c0999d3;
                int i38 = 8;
                if (z5 && c0999d4 != null) {
                    int i39 = c0997b3.f3569j;
                    boolean z16 = i39 > 0 && c0997b3.f3568i == i39;
                    C0999d c0999d34 = c0999d4;
                    C0999d c0999d35 = c0999d34;
                    while (c0999d35 != null) {
                        C0999d c0999d36 = c0999d35.f3613b0[i2];
                        while (c0999d36 != null && c0999d36.f3605V == i38) {
                            c0999d36 = c0999d36.f3613b0[i2];
                        }
                        if (c0999d35 == c0999d4 || c0999d35 == c0999d2 || c0999d36 == null) {
                            c0999d5 = c0999d34;
                            i10 = i7;
                            i11 = i38;
                        } else {
                            C0999d c0999d37 = c0999d36 == c0999d2 ? null : c0999d36;
                            C0998c[] c0998cArr7 = c0999d35.f3589F;
                            C0998c c0998c25 = c0998cArr7[i4];
                            C0989i c0989i18 = c0998c25.f3583g;
                            int i40 = i4 + 1;
                            C0989i c0989i19 = c0999d34.f3589F[i40].f3583g;
                            int iM2390c2 = c0998c25.m2390c();
                            int iM2390c3 = c0998cArr7[i40].m2390c();
                            if (c0999d37 != null) {
                                c0998c = c0999d37.f3589F[i4];
                                c0989i2 = c0998c.f3583g;
                                c0999d6 = c0999d37;
                                C0998c c0998c26 = c0998c.f3580d;
                                c0989i3 = c0998c26 != null ? c0998c26.f3583g : null;
                            } else {
                                c0999d6 = c0999d37;
                                C0998c c0998c27 = c0999d2.f3589F[i4];
                                c0989i2 = c0998c27 != null ? c0998c27.f3583g : null;
                                c0989i3 = c0998cArr7[i40].f3583g;
                                c0998c = c0998c27;
                            }
                            int iM2390c4 = c0998c != null ? c0998c.m2390c() + iM2390c3 : iM2390c3;
                            int iM2390c5 = c0999d34.f3589F[i40].m2390c() + iM2390c2;
                            int i41 = z16 ? 8 : 4;
                            if (c0989i18 == null || c0989i19 == null || c0989i2 == null || c0989i3 == null) {
                                c0999d5 = c0999d34;
                                i10 = i7;
                                i11 = 8;
                            } else {
                                c0999d5 = c0999d34;
                                int i42 = iM2390c4;
                                i10 = i7;
                                i11 = 8;
                                c0985e.m2354b(c0989i18, c0989i19, iM2390c5, 0.5f, c0989i2, c0989i3, i42, i41);
                            }
                            c0999d36 = c0999d6;
                        }
                        c0999d34 = c0999d35.f3605V != i11 ? c0999d35 : c0999d5;
                        c0999d35 = c0999d36;
                        i38 = i11;
                        i7 = i10;
                    }
                    i8 = i7;
                    C0998c c0998c28 = c0999d4.f3589F[i4];
                    C0998c c0998c29 = c0999d33.f3589F[i4].f3580d;
                    int i43 = i4 + 1;
                    C0998c c0998c30 = c0999d2.f3589F[i43];
                    C0998c c0998c31 = c0999d23.f3589F[i43].f3580d;
                    if (c0998c29 == null) {
                        i9 = 5;
                        if (c0998c31 != null && c0999d4 != c0999d2) {
                            c0985e.m2357e(c0998c30.f3583g, c0998c31.f3583g, -c0998c30.m2390c(), i9);
                        }
                    } else {
                        if (c0999d4 != c0999d2) {
                            c0985e.m2357e(c0998c28.f3583g, c0998c29.f3583g, c0998c28.m2390c(), 5);
                        } else {
                            if (c0998c31 != null) {
                                i9 = 5;
                                c0985e.m2354b(c0998c28.f3583g, c0998c29.f3583g, c0998c28.m2390c(), 0.5f, c0998c30.f3583g, c0998c31.f3583g, c0998c30.m2390c(), 5);
                            }
                            if (c0998c31 != null) {
                                c0985e.m2357e(c0998c30.f3583g, c0998c31.f3583g, -c0998c30.m2390c(), i9);
                            }
                        }
                        i9 = 5;
                        if (c0998c31 != null) {
                        }
                    }
                }
                if (z4) {
                    C0998c[] c0998cArr62 = c0999d4.f3589F;
                    C0998c c0998c202 = c0998cArr62[i4];
                    int i372 = i4 + 1;
                    C0998c c0998c212 = c0999d2.f3589F[i372];
                    C0998c c0998c222 = c0998c202.f3580d;
                    if (c0998c222 != null) {
                    }
                    C0998c c0998c232 = c0998c212.f3580d;
                    if (c0998c232 != null) {
                    }
                    if (c0999d23 != c0999d2) {
                    }
                    if (c0999d4 == c0999d2) {
                    }
                    if (c0989i != null) {
                    }
                } else {
                    C0998c[] c0998cArr622 = c0999d4.f3589F;
                    C0998c c0998c2022 = c0998cArr622[i4];
                    int i3722 = i4 + 1;
                    C0998c c0998c2122 = c0999d2.f3589F[i3722];
                    C0998c c0998c2222 = c0998c2022.f3580d;
                    if (c0998c2222 != null) {
                    }
                    C0998c c0998c2322 = c0998c2122.f3580d;
                    if (c0998c2322 != null) {
                    }
                    if (c0999d23 != c0999d2) {
                    }
                    if (c0999d4 == c0999d2) {
                    }
                    if (c0989i != null) {
                    }
                }
                i16 = i8 + 1;
                i15 = 2;
                c1000e2 = c1000e;
                i3 = i6;
                c0997bArr = c0997bArr3;
            } else {
                int i44 = c0997b3.f3569j;
                boolean z17 = i44 > 0 && c0997b3.f3568i == i44;
                C0999d c0999d38 = c0999d4;
                C0999d c0999d39 = c0999d38;
                while (c0999d39 != null) {
                    C0999d c0999d40 = c0999d39.f3613b0[i2];
                    while (c0999d40 != null && c0999d40.f3605V == 8) {
                        c0999d40 = c0999d40.f3613b0[i2];
                    }
                    if (c0999d40 != null || c0999d39 == c0999d2) {
                        C0998c[] c0998cArr8 = c0999d39.f3589F;
                        C0998c c0998c32 = c0998cArr8[i4];
                        C0989i c0989i20 = c0998c32.f3583g;
                        C0998c c0998c33 = c0998c32.f3580d;
                        C0989i c0989i21 = c0998c33 != null ? c0998c33.f3583g : null;
                        if (c0999d38 != c0999d39) {
                            c0989i21 = c0999d38.f3589F[i4 + 1].f3583g;
                        } else if (c0999d39 == c0999d4 && c0999d38 == c0999d39) {
                            C0998c c0998c34 = c0999d3.f3589F[i4].f3580d;
                            c0989i21 = c0998c34 != null ? c0998c34.f3583g : null;
                        }
                        int iM2390c6 = c0998c32.m2390c();
                        int i45 = i4 + 1;
                        int iM2390c7 = c0998cArr8[i45].m2390c();
                        if (c0999d40 != null) {
                            c0998c2 = c0999d40.f3589F[i4];
                            c0999d7 = c0999d40;
                            c0989i4 = c0998c2.f3583g;
                            c0989i5 = c0998cArr8[i45].f3583g;
                        } else {
                            c0999d7 = c0999d40;
                            c0998c2 = c0999d23.f3589F[i45].f3580d;
                            c0989i4 = c0998c2 != null ? c0998c2.f3583g : null;
                            c0989i5 = c0998cArr8[i45].f3583g;
                        }
                        C0989i c0989i22 = c0989i5;
                        if (c0998c2 != null) {
                            iM2390c7 = c0998c2.m2390c() + iM2390c7;
                        }
                        if (c0999d38 != null) {
                            iM2390c6 += c0999d38.f3589F[i45].m2390c();
                        }
                        if (c0989i20 == null || c0989i21 == null || c0989i4 == null || c0989i22 == null) {
                            c0999d8 = c0999d3;
                            c0999d9 = c0999d38;
                            c0999d10 = c0999d7;
                        } else {
                            int iM2390c8 = c0999d39 == c0999d4 ? c0999d4.f3589F[i4].m2390c() : iM2390c6;
                            if (c0999d39 == c0999d2) {
                                iM2390c7 = c0999d2.f3589F[i45].m2390c();
                            }
                            c0999d10 = c0999d7;
                            c0999d8 = c0999d3;
                            int i46 = iM2390c7;
                            c0999d9 = c0999d38;
                            c0985e.m2354b(c0989i20, c0989i21, iM2390c8, 0.5f, c0989i4, c0989i22, i46, z17 ? 8 : 5);
                        }
                    } else {
                        c0999d10 = c0999d40;
                        c0999d8 = c0999d3;
                        c0999d9 = c0999d38;
                    }
                    if (c0999d39.f3605V == 8) {
                        c0999d39 = c0999d9;
                    }
                    c0999d38 = c0999d39;
                    c0999d39 = c0999d10;
                    c0999d3 = c0999d8;
                }
            }
            i8 = i7;
            if (z4) {
            }
            i16 = i8 + 1;
            i15 = 2;
            c1000e2 = c1000e;
            i3 = i6;
            c0997bArr = c0997bArr3;
        }
    }
}
