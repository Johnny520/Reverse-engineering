package p000a;

import java.util.ArrayList;
import p000a.C0240N3;

/* JADX INFO: renamed from: a.S2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0328S2 {
    /* JADX WARN: Removed duplicated region for block: B:179:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x066c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06cf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m907a(C0258O3 c0258o3, C0029B9 c0029b9, int i) {
        int i2;
        C0346T2[] c0346t2Arr;
        int i3;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        C0240N3 c0240n3;
        boolean z4;
        C0222M3[] c0222m3Arr;
        C0240N3 c0240n32;
        C0029B9 c0029b92;
        C0693le c0693le;
        C0222M3 c0222m3;
        C0693le c0693le2;
        C0240N3 c0240n33;
        int i4;
        C0222M3 c0222m32;
        C0693le c0693le3;
        C0693le c0693le4;
        C0240N3 c0240n34;
        C0240N3 c0240n35;
        int i5;
        C0693le c0693le5;
        int size;
        ArrayList<C0240N3> arrayList;
        int i6;
        C0240N3 c0240n36;
        float f3;
        float f4;
        int i7;
        boolean z5;
        C0346T2[] c0346t2Arr2;
        int i8;
        C0240N3 c0240n37;
        int i9;
        int i10;
        int i11;
        C0240N3 c0240n38;
        float f5;
        C0258O3 c0258o32 = c0258o3;
        C0029B9 c0029b93 = c0029b9;
        if (i == 0) {
            i2 = c0258o32.f934m0;
            c0346t2Arr = c0258o32.f937p0;
            i3 = 0;
        } else {
            i2 = c0258o32.f935n0;
            c0346t2Arr = c0258o32.f936o0;
            i3 = 2;
        }
        int i12 = i2;
        C0346T2[] c0346t2Arr3 = c0346t2Arr;
        int i13 = 0;
        while (i13 < i12) {
            C0346T2 c0346t2 = c0346t2Arr3[i13];
            boolean z6 = c0346t2.f1239q;
            C0240N3.a aVar = C0240N3.a.f841c;
            C0240N3 c0240n39 = c0346t2.f1223a;
            int i14 = 8;
            if (z6) {
                f = 0.0f;
            } else {
                int i15 = c0346t2.f1234l;
                int i16 = i15 * 2;
                C0240N3 c0240n310 = c0240n39;
                C0240N3 c0240n311 = c0240n310;
                boolean z7 = false;
                f = 0.0f;
                while (!z7) {
                    c0346t2.f1231i++;
                    c0240n310.f816d0[i15] = null;
                    c0240n310.f814c0[i15] = null;
                    int i17 = c0240n310.f806X;
                    C0222M3[] c0222m3Arr2 = c0240n310.f789G;
                    if (i17 != i14) {
                        c0240n310.m644h(i15);
                        c0222m3Arr2[i16].m600c();
                        int i18 = i16 + 1;
                        c0222m3Arr2[i18].m600c();
                        c0222m3Arr2[i16].m600c();
                        c0222m3Arr2[i18].m600c();
                        if (c0346t2.f1224b == null) {
                            c0346t2.f1224b = c0240n310;
                        }
                        c0346t2.f1226d = c0240n310;
                        C0240N3.a aVar2 = c0240n310.f792J[i15];
                        if (aVar2 == aVar) {
                            int i19 = c0240n310.f824l[i15];
                            i10 = i15;
                            if (i19 == 0 || i19 == 3 || i19 == 2) {
                                c0346t2.f1232j++;
                                float f6 = c0240n310.f812b0[i10];
                                if (f6 > 0.0f) {
                                    f5 = f6;
                                    c0346t2.f1233k += f5;
                                } else {
                                    f5 = f6;
                                }
                                i11 = i16;
                                if (c0240n310.f806X != 8 && aVar2 == aVar && (i19 == 0 || i19 == 3)) {
                                    if (f5 < 0.0f) {
                                        c0346t2.f1236n = true;
                                    } else {
                                        c0346t2.f1237o = true;
                                    }
                                    if (c0346t2.f1230h == null) {
                                        c0346t2.f1230h = new ArrayList<>();
                                    }
                                    c0346t2.f1230h.add(c0240n310);
                                }
                                if (c0346t2.f1228f == null) {
                                    c0346t2.f1228f = c0240n310;
                                }
                                C0240N3 c0240n312 = c0346t2.f1229g;
                                if (c0240n312 != null) {
                                    c0240n312.f814c0[i10] = c0240n310;
                                }
                                c0346t2.f1229g = c0240n310;
                            } else {
                                i11 = i16;
                            }
                            if (i10 == 0) {
                                if (c0240n310.f822j == 0 && c0240n310.f825m == 0) {
                                    int i20 = c0240n310.f826n;
                                }
                            } else if (c0240n310.f823k == 0 && c0240n310.f828p == 0) {
                                int i21 = c0240n310.f829q;
                            }
                        } else {
                            i10 = i15;
                            i11 = i16;
                        }
                    }
                    if (c0240n311 != c0240n310) {
                        c0240n311.f816d0[i10] = c0240n310;
                    }
                    C0222M3 c0222m33 = c0222m3Arr2[i11 + 1].f747d;
                    if (c0222m33 != null) {
                        c0240n38 = c0222m33.f745b;
                        C0222M3 c0222m34 = c0240n38.f789G[i11].f747d;
                        if (c0222m34 == null || c0222m34.f745b != c0240n310) {
                            c0240n38 = null;
                        }
                    }
                    if (c0240n38 == null) {
                        c0240n38 = c0240n310;
                        z7 = true;
                    }
                    c0240n311 = c0240n310;
                    i16 = i11;
                    i14 = 8;
                    c0240n310 = c0240n38;
                    i15 = i10;
                }
                int i22 = i15;
                int i23 = i16;
                C0240N3 c0240n313 = c0346t2.f1224b;
                if (c0240n313 != null) {
                    c0240n313.f789G[i23].m600c();
                }
                C0240N3 c0240n314 = c0346t2.f1226d;
                if (c0240n314 != null) {
                    c0240n314.f789G[i23 + 1].m600c();
                }
                c0346t2.f1225c = c0240n310;
                if (i22 == 0 && c0346t2.f1235m) {
                    c0346t2.f1227e = c0240n310;
                } else {
                    c0346t2.f1227e = c0240n39;
                }
                c0346t2.f1238p = c0346t2.f1237o && c0346t2.f1236n;
            }
            c0346t2.f1239q = true;
            C0240N3 c0240n315 = c0346t2.f1225c;
            C0240N3 c0240n316 = c0346t2.f1224b;
            C0240N3 c0240n317 = c0346t2.f1226d;
            C0240N3 c0240n318 = c0346t2.f1227e;
            float f7 = c0346t2.f1233k;
            boolean z8 = c0258o32.f792J[i] == C0240N3.a.f840b;
            if (i == 0) {
                int i24 = c0240n318.f808Z;
                boolean z9 = i24 == 0;
                f2 = f7;
                z2 = i24 == 1;
                z3 = i24 == 2;
                c0240n3 = c0240n39;
                z4 = z8;
                z = z9;
            } else {
                f2 = f7;
                int i25 = c0240n318.f810a0;
                z = i25 == 0;
                z2 = i25 == 1;
                z3 = i25 == 2;
                c0240n3 = c0240n39;
                z4 = z8;
            }
            boolean z10 = z2;
            boolean z11 = false;
            while (true) {
                c0222m3Arr = c0258o32.f789G;
                if (z11) {
                    break;
                }
                C0222M3 c0222m35 = c0240n3.f789G[i3];
                int i26 = z3 ? 1 : 4;
                int iM600c = c0222m35.m600c();
                boolean z12 = z3;
                C0240N3.a[] aVarArr = c0240n3.f792J;
                boolean z13 = aVarArr[i] == aVar && c0240n3.f824l[i] == 0;
                C0222M3 c0222m36 = c0222m35.f747d;
                if (c0222m36 != null && c0240n3 != c0240n39) {
                    iM600c = c0222m36.m600c() + iM600c;
                }
                int i27 = iM600c;
                if (z12 && c0240n3 != c0240n39 && c0240n3 != c0240n316) {
                    i26 = 5;
                }
                int i28 = i12;
                C0222M3 c0222m37 = c0222m35.f747d;
                if (c0222m37 != null) {
                    if (c0240n3 == c0240n316) {
                        c0346t2Arr2 = c0346t2Arr3;
                        i8 = i3;
                        c0029b93.m75f(c0222m35.f750g, c0222m37.f750g, i27, 6);
                    } else {
                        c0346t2Arr2 = c0346t2Arr3;
                        i8 = i3;
                        c0029b93.m75f(c0222m35.f750g, c0222m37.f750g, i27, 8);
                    }
                    c0029b93.m74e(c0222m35.f750g, c0222m35.f747d.f750g, i27, (!z13 || z12) ? i26 : 5);
                } else {
                    c0346t2Arr2 = c0346t2Arr3;
                    i8 = i3;
                }
                C0222M3[] c0222m3Arr3 = c0240n3.f789G;
                if (z4) {
                    if (c0240n3.f806X == 8 || aVarArr[i] != aVar) {
                        i9 = 0;
                    } else {
                        i9 = 0;
                        c0029b93.m75f(c0222m3Arr3[i8 + 1].f750g, c0222m3Arr3[i8].f750g, 0, 5);
                    }
                    c0029b93.m75f(c0222m3Arr3[i8].f750g, c0222m3Arr[i8].f750g, i9, 8);
                }
                C0222M3 c0222m38 = c0222m3Arr3[i8 + 1].f747d;
                if (c0222m38 != null) {
                    c0240n37 = c0222m38.f745b;
                    C0222M3 c0222m39 = c0240n37.f789G[i8].f747d;
                    if (c0222m39 == null || c0222m39.f745b != c0240n3) {
                        c0240n37 = null;
                    }
                }
                if (c0240n37 != null) {
                    c0240n3 = c0240n37;
                } else {
                    z11 = true;
                }
                i12 = i28;
                z3 = z12;
                c0346t2Arr3 = c0346t2Arr2;
                i3 = i8;
            }
            boolean z14 = z3;
            int i29 = i12;
            C0346T2[] c0346t2Arr4 = c0346t2Arr3;
            int i30 = i3;
            if (c0240n317 != null) {
                int i31 = i30 + 1;
                if (c0240n315.f789G[i31].f747d != null) {
                    C0222M3 c0222m310 = c0240n317.f789G[i31];
                    if (c0240n317.f792J[i] == aVar && c0240n317.f824l[i] == 0 && !z14) {
                        C0222M3 c0222m311 = c0222m310.f747d;
                        if (c0222m311.f745b == c0258o32) {
                            c0029b93.m74e(c0222m310.f750g, c0222m311.f750g, -c0222m310.m600c(), 5);
                        }
                        c0029b93.m76g(c0222m310.f750g, c0240n315.f789G[i31].f747d.f750g, -c0222m310.m600c(), 6);
                    } else {
                        if (z14) {
                            C0222M3 c0222m312 = c0222m310.f747d;
                            if (c0222m312.f745b == c0258o32) {
                                c0029b93.m74e(c0222m310.f750g, c0222m312.f750g, -c0222m310.m600c(), 4);
                            }
                        }
                        c0029b93.m76g(c0222m310.f750g, c0240n315.f789G[i31].f747d.f750g, -c0222m310.m600c(), 6);
                    }
                }
            }
            if (z4) {
                int i32 = i30 + 1;
                C0693le c0693le6 = c0222m3Arr[i32].f750g;
                C0222M3 c0222m313 = c0240n315.f789G[i32];
                c0029b93.m75f(c0693le6, c0222m313.f750g, c0222m313.m600c(), 8);
            }
            ArrayList<C0240N3> arrayList2 = c0346t2.f1230h;
            if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                if (c0346t2.f1236n && !c0346t2.f1238p) {
                    f2 = c0346t2.f1232j;
                }
                C0240N3 c0240n319 = null;
                float f8 = f;
                int i33 = 0;
                while (i33 < size) {
                    C0240N3 c0240n320 = arrayList2.get(i33);
                    float f9 = c0240n320.f812b0[i];
                    C0222M3[] c0222m3Arr4 = c0240n320.f789G;
                    if (f9 >= f) {
                        arrayList = arrayList2;
                        if (f9 != f) {
                            z5 = false;
                            c0029b93.m74e(c0222m3Arr4[i30 + 1].f750g, c0222m3Arr4[i30].f750g, 0, 8);
                            i6 = size;
                            f4 = f;
                            i7 = i33;
                        } else {
                            if (c0240n319 != null) {
                                C0222M3[] c0222m3Arr5 = c0240n319.f789G;
                                C0693le c0693le7 = c0222m3Arr5[i30].f750g;
                                int i34 = i30 + 1;
                                C0693le c0693le8 = c0222m3Arr5[i34].f750g;
                                C0693le c0693le9 = c0222m3Arr4[i30].f750g;
                                i6 = size;
                                C0693le c0693le10 = c0222m3Arr4[i34].f750g;
                                c0240n36 = c0240n320;
                                C0184K1 c0184k1M80k = c0029b93.m80k();
                                f3 = f9;
                                float f10 = f;
                                c0184k1M80k.f634b = f10;
                                f4 = f10;
                                if (f2 == f10 || f8 == f3) {
                                    i7 = i33;
                                    c0184k1M80k.f636d.mo343c(c0693le7, 1.0f);
                                    c0184k1M80k.f636d.mo343c(c0693le8, -1.0f);
                                    c0184k1M80k.f636d.mo343c(c0693le10, 1.0f);
                                    c0184k1M80k.f636d.mo343c(c0693le9, -1.0f);
                                } else {
                                    if (f8 == f4) {
                                        c0184k1M80k.f636d.mo343c(c0693le7, 1.0f);
                                        c0184k1M80k.f636d.mo343c(c0693le8, -1.0f);
                                    } else if (f9 == f) {
                                        c0184k1M80k.f636d.mo343c(c0693le9, 1.0f);
                                        c0184k1M80k.f636d.mo343c(c0693le10, -1.0f);
                                    } else {
                                        float f11 = (f8 / f2) / (f3 / f2);
                                        i7 = i33;
                                        c0184k1M80k.f636d.mo343c(c0693le7, 1.0f);
                                        c0184k1M80k.f636d.mo343c(c0693le8, -1.0f);
                                        c0184k1M80k.f636d.mo343c(c0693le10, f11);
                                        c0184k1M80k.f636d.mo343c(c0693le9, -f11);
                                    }
                                    i7 = i33;
                                }
                                c0029b93.m72c(c0184k1M80k);
                            } else {
                                i6 = size;
                                c0240n36 = c0240n320;
                                f3 = f9;
                                f4 = f;
                                i7 = i33;
                            }
                            c0240n319 = c0240n36;
                            f8 = f3;
                        }
                    } else if (c0346t2.f1238p) {
                        arrayList = arrayList2;
                        z5 = false;
                        c0029b93.m74e(c0222m3Arr4[i30 + 1].f750g, c0222m3Arr4[i30].f750g, 0, 4);
                        i6 = size;
                        f4 = f;
                        i7 = i33;
                    } else {
                        f9 = 1.0f;
                        arrayList = arrayList2;
                        if (f9 != f) {
                        }
                    }
                    i33 = i7 + 1;
                    arrayList2 = arrayList;
                    size = i6;
                    f = f4;
                }
            }
            if (c0240n316 == null || !(c0240n316 == c0240n317 || z14)) {
                c0240n32 = c0240n317;
                if (!z || c0240n316 == null) {
                    if (z10 && c0240n316 != null) {
                        int i35 = c0346t2.f1232j;
                        boolean z15 = i35 > 0 && c0346t2.f1231i == i35;
                        C0240N3 c0240n321 = c0240n316;
                        C0240N3 c0240n322 = c0240n321;
                        while (c0240n321 != null) {
                            C0240N3 c0240n323 = c0240n321.f816d0[i];
                            while (c0240n323 != null && c0240n323.f806X == 8) {
                                c0240n323 = c0240n323.f816d0[i];
                            }
                            if (c0240n321 != c0240n316 && c0240n321 != c0240n32 && c0240n323 != null) {
                                if (c0240n323 == c0240n32) {
                                    c0240n323 = null;
                                }
                                C0222M3[] c0222m3Arr6 = c0240n321.f789G;
                                C0222M3 c0222m314 = c0222m3Arr6[i30];
                                C0693le c0693le11 = c0222m314.f750g;
                                int i36 = i30 + 1;
                                C0693le c0693le12 = c0240n322.f789G[i36].f750g;
                                int iM600c2 = c0222m314.m600c();
                                int iM600c3 = c0222m3Arr6[i36].m600c();
                                if (c0240n323 != null) {
                                    c0222m3 = c0240n323.f789G[i30];
                                    c0693le2 = c0222m3.f750g;
                                    C0222M3 c0222m315 = c0222m3.f747d;
                                    c0693le = c0222m315 != null ? c0222m315.f750g : null;
                                } else {
                                    C0222M3 c0222m316 = c0240n32.f789G[i30];
                                    C0693le c0693le13 = c0222m316 != null ? c0222m316.f750g : null;
                                    c0693le = c0222m3Arr6[i36].f750g;
                                    c0222m3 = c0222m316;
                                    c0693le2 = c0693le13;
                                }
                                if (c0222m3 != null) {
                                    iM600c3 += c0222m3.m600c();
                                }
                                int iM600c4 = c0240n322.f789G[i36].m600c() + iM600c2;
                                C0693le c0693le14 = c0693le2;
                                int i37 = iM600c3;
                                C0693le c0693le15 = c0693le;
                                int i38 = z15 ? 8 : 4;
                                if (c0693le11 == null || c0693le12 == null || c0693le14 == null || c0693le15 == null) {
                                    c0240n33 = c0240n323;
                                } else {
                                    c0240n33 = c0240n323;
                                    c0029b9.m71b(c0693le11, c0693le12, iM600c4, 0.5f, c0693le14, c0693le15, i37, i38);
                                }
                                c0240n323 = c0240n33;
                            }
                            if (c0240n321.f806X != 8) {
                                c0240n322 = c0240n321;
                            }
                            c0240n321 = c0240n323;
                        }
                        C0222M3 c0222m317 = c0240n316.f789G[i30];
                        C0222M3 c0222m318 = c0240n39.f789G[i30].f747d;
                        int i39 = i30 + 1;
                        C0222M3 c0222m319 = c0240n32.f789G[i39];
                        C0222M3 c0222m320 = c0240n315.f789G[i39].f747d;
                        if (c0222m318 == null) {
                            c0029b92 = c0029b9;
                            if (c0222m320 != null && c0240n316 != c0240n32) {
                                c0029b92.m74e(c0222m319.f750g, c0222m320.f750g, -c0222m319.m600c(), 5);
                            }
                        } else {
                            if (c0240n316 != c0240n32) {
                                c0029b9.m74e(c0222m317.f750g, c0222m318.f750g, c0222m317.m600c(), 5);
                            } else {
                                if (c0222m320 != null) {
                                    c0029b92 = c0029b9;
                                    c0029b92.m71b(c0222m317.f750g, c0222m318.f750g, c0222m317.m600c(), 0.5f, c0222m319.f750g, c0222m320.f750g, c0222m319.m600c(), 5);
                                }
                                if (c0222m320 != null) {
                                    c0029b92.m74e(c0222m319.f750g, c0222m320.f750g, -c0222m319.m600c(), 5);
                                }
                            }
                            c0029b92 = c0029b9;
                            if (c0222m320 != null) {
                            }
                        }
                    }
                    if ((z || z10) && c0240n316 != null && c0240n316 != c0240n32) {
                        C0222M3[] c0222m3Arr7 = c0240n316.f789G;
                        C0222M3 c0222m321 = c0222m3Arr7[i30];
                        int i40 = i30 + 1;
                        C0222M3 c0222m322 = c0240n32.f789G[i40];
                        C0222M3 c0222m323 = c0222m321.f747d;
                        c0693le5 = c0222m323 != null ? c0222m323.f750g : null;
                        C0222M3 c0222m324 = c0222m322.f747d;
                        C0693le c0693le16 = c0222m324 != null ? c0222m324.f750g : null;
                        if (c0240n315 != c0240n32) {
                            C0222M3 c0222m325 = c0240n315.f789G[i40].f747d;
                            c0693le16 = c0222m325 != null ? c0222m325.f750g : null;
                        }
                        if (c0240n316 == c0240n32) {
                            c0222m322 = c0222m3Arr7[i40];
                        }
                        if (c0693le5 != null && c0693le16 != null) {
                            c0029b92.m71b(c0222m321.f750g, c0693le5, c0222m321.m600c(), 0.5f, c0693le16, c0222m322.f750g, c0240n32.f789G[i40].m600c(), 5);
                        }
                    }
                    i13++;
                    c0258o32 = c0258o3;
                    c0029b93 = c0029b9;
                    i12 = i29;
                    c0346t2Arr3 = c0346t2Arr4;
                    i3 = i30;
                } else {
                    int i41 = c0346t2.f1232j;
                    boolean z16 = i41 > 0 && c0346t2.f1231i == i41;
                    C0240N3 c0240n324 = c0240n316;
                    C0240N3 c0240n325 = c0240n324;
                    while (c0240n324 != null) {
                        C0240N3 c0240n326 = c0240n324.f816d0[i];
                        while (true) {
                            if (c0240n326 == null) {
                                i4 = 8;
                                break;
                            }
                            i4 = 8;
                            if (c0240n326.f806X != 8) {
                                break;
                            } else {
                                c0240n326 = c0240n326.f816d0[i];
                            }
                        }
                        if (c0240n326 != null || c0240n324 == c0240n32) {
                            C0222M3[] c0222m3Arr8 = c0240n324.f789G;
                            C0222M3 c0222m326 = c0222m3Arr8[i30];
                            C0693le c0693le17 = c0222m326.f750g;
                            C0222M3 c0222m327 = c0222m326.f747d;
                            C0693le c0693le18 = c0222m327 != null ? c0222m327.f750g : null;
                            if (c0240n325 != c0240n324) {
                                c0693le18 = c0240n325.f789G[i30 + 1].f750g;
                            } else if (c0240n324 == c0240n316 && c0240n325 == c0240n324) {
                                C0222M3 c0222m328 = c0240n39.f789G[i30].f747d;
                                c0693le18 = c0222m328 != null ? c0222m328.f750g : null;
                            }
                            int iM600c5 = c0222m326.m600c();
                            int i42 = i30 + 1;
                            int iM600c6 = c0222m3Arr8[i42].m600c();
                            if (c0240n326 != null) {
                                c0222m32 = c0240n326.f789G[i30];
                                c0693le3 = c0222m32.f750g;
                                c0693le4 = c0222m3Arr8[i42].f750g;
                            } else {
                                c0222m32 = c0240n315.f789G[i42].f747d;
                                c0693le3 = c0222m32 != null ? c0222m32.f750g : null;
                                c0693le4 = c0222m3Arr8[i42].f750g;
                            }
                            if (c0222m32 != null) {
                                iM600c6 += c0222m32.m600c();
                            }
                            if (c0240n325 != null) {
                                iM600c5 += c0240n325.f789G[i42].m600c();
                            }
                            if (c0693le17 == null || c0693le18 == null || c0693le3 == null || c0693le4 == null) {
                                c0240n34 = c0240n39;
                                c0240n35 = c0240n325;
                                i5 = 8;
                            } else {
                                if (c0240n324 == c0240n316) {
                                    iM600c5 = c0240n316.f789G[i30].m600c();
                                }
                                if (c0240n324 == c0240n32) {
                                    iM600c6 = c0240n32.f789G[i42].m600c();
                                }
                                c0240n34 = c0240n39;
                                c0240n35 = c0240n325;
                                i5 = 8;
                                c0029b9.m71b(c0693le17, c0693le18, iM600c5, 0.5f, c0693le3, c0693le4, iM600c6, z16 ? 8 : 5);
                            }
                        } else {
                            c0240n34 = c0240n39;
                            c0240n35 = c0240n325;
                            i5 = i4;
                        }
                        if (c0240n324.f806X != i5) {
                            c0240n35 = c0240n324;
                        }
                        c0240n324 = c0240n326;
                        c0240n325 = c0240n35;
                        c0240n39 = c0240n34;
                    }
                }
            } else {
                C0222M3 c0222m329 = c0240n39.f789G[i30];
                int i43 = i30 + 1;
                C0222M3 c0222m330 = c0240n315.f789G[i43];
                C0222M3 c0222m331 = c0222m329.f747d;
                C0693le c0693le19 = c0222m331 != null ? c0222m331.f750g : null;
                C0222M3 c0222m332 = c0222m330.f747d;
                C0693le c0693le20 = c0222m332 != null ? c0222m332.f750g : null;
                C0222M3 c0222m333 = c0240n316.f789G[i30];
                C0222M3 c0222m334 = c0240n317.f789G[i43];
                if (c0693le19 == null || c0693le20 == null) {
                    c0240n32 = c0240n317;
                } else {
                    C0693le c0693le21 = c0693le19;
                    c0240n32 = c0240n317;
                    c0029b93.m71b(c0222m333.f750g, c0693le21, c0222m333.m600c(), i == 0 ? c0240n318.f803U : c0240n318.f804V, c0693le20, c0222m334.f750g, c0222m334.m600c(), 7);
                }
            }
            c0029b92 = c0029b9;
            if (z) {
                C0222M3[] c0222m3Arr72 = c0240n316.f789G;
                C0222M3 c0222m3212 = c0222m3Arr72[i30];
                int i402 = i30 + 1;
                C0222M3 c0222m3222 = c0240n32.f789G[i402];
                C0222M3 c0222m3232 = c0222m3212.f747d;
                if (c0222m3232 != null) {
                }
                C0222M3 c0222m3242 = c0222m3222.f747d;
                if (c0222m3242 != null) {
                }
                if (c0240n315 != c0240n32) {
                }
                if (c0240n316 == c0240n32) {
                }
                if (c0693le5 != null) {
                }
            } else {
                C0222M3[] c0222m3Arr722 = c0240n316.f789G;
                C0222M3 c0222m32122 = c0222m3Arr722[i30];
                int i4022 = i30 + 1;
                C0222M3 c0222m32222 = c0240n32.f789G[i4022];
                C0222M3 c0222m32322 = c0222m32122.f747d;
                if (c0222m32322 != null) {
                }
                C0222M3 c0222m32422 = c0222m32222.f747d;
                if (c0222m32422 != null) {
                }
                if (c0240n315 != c0240n32) {
                }
                if (c0240n316 == c0240n32) {
                }
                if (c0693le5 != null) {
                }
            }
            i13++;
            c0258o32 = c0258o3;
            c0029b93 = c0029b9;
            i12 = i29;
            c0346t2Arr3 = c0346t2Arr4;
            i3 = i30;
        }
    }
}
