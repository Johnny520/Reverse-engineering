package Yue;

import Yue.C4128;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3689 {

    /* JADX INFO: renamed from: ۥ */
    public static final boolean f464 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f465 = false;

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:290:0x04d9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:302:0x0119 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r8 r15
  0x002f: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r15v31 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[PHI: r8 r15
  0x0031: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r15v3 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0189  */
    /* JADX WARN: Type inference failed for: r38v0, types: [Yue.ۥ۠ۧۡۤ] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [Yue.ۥۣۣۢ۟] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [Yue.ۥ۟ۧ۟ۢ] */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m763(C4129 c4129, C5714 c5714, int i, int i2, C3690 c3690) {
        boolean z;
        boolean z2;
        boolean z3;
        C4128 c4128;
        int i3;
        C4125 c4125;
        C7503 c7503;
        C7503 c75032;
        C4128 c41282;
        C4125 c41252;
        C7503 c75033;
        C7503 c75034;
        C4128 c41283;
        int size;
        ArrayList<C4128> arrayList;
        boolean z4;
        boolean z5;
        boolean z6;
        C4128 c41284;
        C4128 c41285;
        int i4;
        C4128 c41286 = c3690.f466;
        C4128 c41287 = c3690.f6508;
        C4128 c41288 = c3690.f467;
        C4128 c41289 = c3690.f6509;
        C4128 c412810 = c3690.f6510;
        float f = c3690.f6516;
        boolean z7 = c4129.f8397[i] == C4128.EnumC0339.WRAP_CONTENT;
        if (i == 0) {
            int i5 = c412810.f8430;
            z = i5 == 0;
            z2 = i5 == 1;
            z3 = i5 == 2;
        } else {
            int i6 = c412810.f8431;
            z = i6 == 0;
            z2 = i6 == 1;
            if (i6 == 2) {
            }
        }
        boolean z8 = z2;
        boolean z9 = false;
        boolean z10 = z;
        ?? r8 = c41286;
        while (true) {
            if (z9) {
                break;
            }
            C4125 c41253 = r8.f8394[i2];
            int i7 = z3 ? 1 : 4;
            int iM11763 = c41253.m11763();
            C4128.EnumC0339 enumC0339 = r8.f8397[i];
            float f2 = f;
            C4128.EnumC0339 enumC03392 = C4128.EnumC0339.MATCH_CONSTRAINT;
            if (enumC0339 == enumC03392 && r8.f8368[i] == 0) {
                z4 = z9;
                z5 = true;
            } else {
                z4 = z9;
                z5 = false;
            }
            C4125 c41254 = c41253.f8275;
            if (c41254 != null && r8 != c41286) {
                iM11763 += c41254.m11763();
            }
            int i8 = iM11763;
            if (!z3 || r8 == c41286 || r8 == c41288) {
                z6 = z10;
            } else {
                z6 = z10;
                i7 = 8;
            }
            C4125 c41255 = c41253.f8275;
            if (c41255 != null) {
                if (r8 == c41288) {
                    c41284 = c412810;
                    c41285 = c41286;
                    c5714.m17626(c41253.f8278, c41255.f8278, i8, 6);
                } else {
                    c41284 = c412810;
                    c41285 = c41286;
                    c5714.m17626(c41253.f8278, c41255.f8278, i8, 8);
                }
                c5714.m17622(c41253.f8278, c41253.f8275.f8278, i8, (!z5 || z3) ? i7 : 5);
            } else {
                c41284 = c412810;
                c41285 = c41286;
            }
            if (z7) {
                if (r8.m11890() == 8 || r8.f8397[i] != enumC03392) {
                    i4 = 0;
                } else {
                    C4125[] c4125Arr = r8.f8394;
                    i4 = 0;
                    c5714.m17626(c4125Arr[i2 + 1].f8278, c4125Arr[i2].f8278, 0, 5);
                }
                c5714.m17626(r8.f8394[i2].f8278, c4129.f8394[i2].f8278, i4, 8);
            }
            C4125 c41256 = r8.f8394[i2 + 1].f8275;
            if (c41256 != null) {
                C4128 c412811 = c41256.f8273;
                C4125 c41257 = c412811.f8394[i2].f8275;
                if (c41257 != null && c41257.f8273 == r8) {
                    obj = c412811;
                }
            }
            if (obj != null) {
                r8 = obj;
                z9 = z4;
            } else {
                z9 = true;
            }
            z10 = z6;
            f = f2;
            c412810 = c41284;
            c41286 = c41285;
            r8 = r8;
        }
        C4128 c412812 = c412810;
        float f3 = f;
        C4128 c412813 = c41286;
        boolean z11 = z10;
        if (c41289 != null) {
            int i9 = i2 + 1;
            if (c41287.f8394[i9].f8275 != null) {
                C4125 c41258 = c41289.f8394[i9];
                if (c41289.f8397[i] == C4128.EnumC0339.MATCH_CONSTRAINT && c41289.f8368[i] == 0 && !z3) {
                    C4125 c41259 = c41258.f8275;
                    if (c41259.f8273 == c4129) {
                        c5714.m17622(c41258.f8278, c41259.f8278, -c41258.m11763(), 5);
                    }
                    c5714.m17628(c41258.f8278, c41287.f8394[i9].f8275.f8278, -c41258.m11763(), 6);
                } else {
                    if (z3) {
                        C4125 c412510 = c41258.f8275;
                        if (c412510.f8273 == c4129) {
                            c5714.m17622(c41258.f8278, c412510.f8278, -c41258.m11763(), 4);
                        }
                    }
                    c5714.m17628(c41258.f8278, c41287.f8394[i9].f8275.f8278, -c41258.m11763(), 6);
                }
            }
        }
        if (z7) {
            int i10 = i2 + 1;
            C7503 c75035 = c4129.f8394[i10].f8278;
            C4125 c412511 = c41287.f8394[i10];
            c5714.m17626(c75035, c412511.f8278, c412511.m11763(), 8);
        }
        ArrayList<C4128> arrayList2 = c3690.f6513;
        if (arrayList2 != null && (size = arrayList2.size()) > 1) {
            float f4 = (!c3690.f6523 || c3690.f6525) ? f3 : c3690.f6515;
            float f5 = 0.0f;
            float f6 = 0.0f;
            C4128 c412814 = null;
            int i11 = 0;
            while (i11 < size) {
                C4128 c412815 = arrayList2.get(i11);
                float f7 = c412815.f8434[i];
                if (f7 < f5) {
                    if (c3690.f6525) {
                        C4125[] c4125Arr2 = c412815.f8394;
                        c5714.m17622(c4125Arr2[i2 + 1].f8278, c4125Arr2[i2].f8278, 0, 4);
                        arrayList = arrayList2;
                        i11++;
                        arrayList2 = arrayList;
                        f5 = 0.0f;
                    } else {
                        f7 = 1.0f;
                    }
                }
                if (f7 == f5) {
                    C4125[] c4125Arr3 = c412815.f8394;
                    c5714.m17622(c4125Arr3[i2 + 1].f8278, c4125Arr3[i2].f8278, 0, 8);
                    arrayList = arrayList2;
                    i11++;
                    arrayList2 = arrayList;
                    f5 = 0.0f;
                } else {
                    if (c412814 != null) {
                        C4125[] c4125Arr4 = c412814.f8394;
                        C7503 c75036 = c4125Arr4[i2].f8278;
                        int i12 = i2 + 1;
                        C7503 c75037 = c4125Arr4[i12].f8278;
                        C4125[] c4125Arr5 = c412815.f8394;
                        C7503 c75038 = c4125Arr5[i2].f8278;
                        C7503 c75039 = c4125Arr5[i12].f8278;
                        arrayList = arrayList2;
                        C3398 c3398M17639 = c5714.m17639();
                        c3398M17639.m7026(f6, f4, f7, c75036, c75037, c75038, c75039);
                        c5714.m17621(c3398M17639);
                    } else {
                        arrayList = arrayList2;
                    }
                    c412814 = c412815;
                    f6 = f7;
                    i11++;
                    arrayList2 = arrayList;
                    f5 = 0.0f;
                }
            }
        }
        if (c41288 != null && (c41288 == c41289 || z3)) {
            C4125 c412512 = c412813.f8394[i2];
            int i13 = i2 + 1;
            C4125 c412513 = c41287.f8394[i13];
            C4125 c412514 = c412512.f8275;
            C7503 c750310 = c412514 != null ? c412514.f8278 : null;
            C4125 c412515 = c412513.f8275;
            C7503 c750311 = c412515 != null ? c412515.f8278 : null;
            C4125 c412516 = c41288.f8394[i2];
            C4125 c412517 = c41289.f8394[i13];
            if (c750310 != null && c750311 != null) {
                c5714.m17620(c412516.f8278, c750310, c412516.m11763(), i == 0 ? c412812.f8412 : c412812.f8413, c750311, c412517.f8278, c412517.m11763(), 7);
            }
        } else if (!z11 || c41288 == null) {
            int i14 = 8;
            if (z8 && c41288 != null) {
                int i15 = c3690.f6515;
                boolean z12 = i15 > 0 && c3690.f6514 == i15;
                C4128 c412816 = c41288;
                C4128 c412817 = c412816;
                while (c412816 != null) {
                    C4128 c412818 = c412816.f8436[i];
                    while (c412818 != null && c412818.m11890() == i14) {
                        c412818 = c412818.f8436[i];
                    }
                    if (c412816 == c41288 || c412816 == c41289 || c412818 == null) {
                        c4128 = c412817;
                        i3 = i14;
                    } else {
                        C4128 c412819 = c412818 == c41289 ? null : c412818;
                        C4125 c412518 = c412816.f8394[i2];
                        C7503 c750312 = c412518.f8278;
                        C4125 c412519 = c412518.f8275;
                        if (c412519 != null) {
                            C7503 c750313 = c412519.f8278;
                        }
                        int i16 = i2 + 1;
                        C7503 c750314 = c412817.f8394[i16].f8278;
                        int iM117632 = c412518.m11763();
                        int iM117633 = c412816.f8394[i16].m11763();
                        if (c412819 != null) {
                            c4125 = c412819.f8394[i2];
                            c7503 = c4125.f8278;
                            C4125 c412520 = c4125.f8275;
                            c75032 = c412520 != null ? c412520.f8278 : null;
                        } else {
                            c4125 = c41289.f8394[i2];
                            c7503 = c4125 != null ? c4125.f8278 : null;
                            c75032 = c412816.f8394[i16].f8278;
                        }
                        if (c4125 != null) {
                            iM117633 += c4125.m11763();
                        }
                        int i17 = iM117633;
                        int iM117634 = c412817.f8394[i16].m11763() + iM117632;
                        int i18 = z12 ? 8 : 4;
                        if (c750312 == null || c750314 == null || c7503 == null || c75032 == null) {
                            c41282 = c412819;
                            c4128 = c412817;
                            i3 = 8;
                        } else {
                            c41282 = c412819;
                            c4128 = c412817;
                            i3 = 8;
                            c5714.m17620(c750312, c750314, iM117634, 0.5f, c7503, c75032, i17, i18);
                        }
                        c412818 = c41282;
                    }
                    if (c412816.m11890() == i3) {
                        c412816 = c4128;
                    }
                    i14 = i3;
                    c412817 = c412816;
                    c412816 = c412818;
                }
                C4125 c412521 = c41288.f8394[i2];
                C4125 c412522 = c412813.f8394[i2].f8275;
                int i19 = i2 + 1;
                C4125 c412523 = c41289.f8394[i19];
                C4125 c412524 = c41287.f8394[i19].f8275;
                if (c412522 != null) {
                    if (c41288 != c41289) {
                        c5714.m17622(c412521.f8278, c412522.f8278, c412521.m11763(), 5);
                    } else if (c412524 != null) {
                        c5714.m17620(c412521.f8278, c412522.f8278, c412521.m11763(), 0.5f, c412523.f8278, c412524.f8278, c412523.m11763(), 5);
                    }
                }
                if (c412524 != null && c41288 != c41289) {
                    c5714.m17622(c412523.f8278, c412524.f8278, -c412523.m11763(), 5);
                }
            }
        } else {
            int i20 = c3690.f6515;
            boolean z13 = i20 > 0 && c3690.f6514 == i20;
            C4128 c412820 = c41288;
            C4128 c412821 = c412820;
            while (c412820 != null) {
                C4128 c412822 = c412820.f8436[i];
                while (c412822 != null && c412822.m11890() == 8) {
                    c412822 = c412822.f8436[i];
                }
                if (c412822 != null || c412820 == c41289) {
                    C4125 c412525 = c412820.f8394[i2];
                    C7503 c750315 = c412525.f8278;
                    C4125 c412526 = c412525.f8275;
                    C7503 c750316 = c412526 != null ? c412526.f8278 : null;
                    if (c412821 != c412820) {
                        c750316 = c412821.f8394[i2 + 1].f8278;
                    } else if (c412820 == c41288 && c412821 == c412820) {
                        C4125 c412527 = c412813.f8394[i2].f8275;
                        c750316 = c412527 != null ? c412527.f8278 : null;
                    }
                    int iM117635 = c412525.m11763();
                    int i21 = i2 + 1;
                    int iM117636 = c412820.f8394[i21].m11763();
                    if (c412822 != null) {
                        c41252 = c412822.f8394[i2];
                        C7503 c750317 = c41252.f8278;
                        c75034 = c412820.f8394[i21].f8278;
                        c75033 = c750317;
                    } else {
                        c41252 = c41287.f8394[i21].f8275;
                        c75033 = c41252 != null ? c41252.f8278 : null;
                        c75034 = c412820.f8394[i21].f8278;
                    }
                    if (c41252 != null) {
                        iM117636 += c41252.m11763();
                    }
                    if (c412821 != null) {
                        iM117635 += c412821.f8394[i21].m11763();
                    }
                    if (c750315 == null || c750316 == null || c75033 == null || c75034 == null) {
                        c41283 = c412822;
                    } else {
                        if (c412820 == c41288) {
                            iM117635 = c41288.f8394[i2].m11763();
                        }
                        int i22 = iM117635;
                        c41283 = c412822;
                        c5714.m17620(c750315, c750316, i22, 0.5f, c75033, c75034, c412820 == c41289 ? c41289.f8394[i21].m11763() : iM117636, z13 ? 8 : 5);
                    }
                }
                if (c412820.m11890() != 8) {
                    c412821 = c412820;
                }
                c412820 = c41283;
            }
        }
        if ((!z11 && !z8) || c41288 == null || c41288 == c41289) {
            return;
        }
        C4125[] c4125Arr6 = c41288.f8394;
        C4125 c412528 = c4125Arr6[i2];
        int i23 = i2 + 1;
        C4125 c412529 = c41289.f8394[i23];
        C4125 c412530 = c412528.f8275;
        C7503 c750318 = c412530 != null ? c412530.f8278 : null;
        C4125 c412531 = c412529.f8275;
        ?? r5 = c412531 != null ? c412531.f8278 : 0;
        if (c41287 != c41289) {
            C4125 c412532 = c41287.f8394[i23].f8275;
            r5 = c412532 != null ? c412532.f8278 : null;
        }
        if (c41288 == c41289) {
            c412529 = c4125Arr6[i23];
        }
        if (c750318 == null || r5 == 0) {
            return;
        }
        c5714.m17620(c412528.f8278, c750318, c412528.m11763(), 0.5f, r5, c412529.f8278, c41289.f8394[i23].m11763(), 5);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m764(C4129 c4129, C5714 c5714, ArrayList<C4128> arrayList, int i) {
        int i2;
        C3690[] c3690Arr;
        int i3;
        if (i == 0) {
            i2 = c4129.f8461;
            c3690Arr = c4129.f8464;
            i3 = 0;
        } else {
            i2 = c4129.f8462;
            c3690Arr = c4129.f8463;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C3690 c3690 = c3690Arr[i4];
            c3690.m765();
            if (arrayList == null || arrayList.contains(c3690.f466)) {
                m763(c4129, c5714, i, i3, c3690);
            }
        }
    }
}
