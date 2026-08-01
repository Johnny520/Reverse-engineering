package p166l2;

/* JADX INFO: renamed from: l2.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4527c1 {
    /* JADX INFO: renamed from: b */
    public static final void m17564b(C4605z c4605z, InterfaceC4578q interfaceC4578q) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < c4605z.m18453c()) {
            int i13 = i10 + 2;
            int iM18452b = c4605z.m18452b(i10) - c4605z.m18452b(i13);
            int iM18452b2 = c4605z.m18452b(i10 + 1) - c4605z.m18452b(i13);
            int iM18452b3 = c4605z.m18452b(i13);
            i10 += 3;
            while (i11 < iM18452b) {
                interfaceC4578q.mo17614b(i12, i11);
                i11++;
            }
            while (i12 < iM18452b2) {
                interfaceC4578q.mo17616d(i12);
                i12++;
            }
            while (true) {
                int i14 = iM18452b3 - 1;
                if (iM18452b3 > 0) {
                    interfaceC4578q.mo17615c(i11, i12);
                    i11++;
                    i12++;
                    iM18452b3 = i14;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m17565c(int i10, int i11, int i12, int i13, InterfaceC4578q interfaceC4578q, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iM17639b;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = (i17 & 1) == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && AbstractC4537f.m17639b(iArr2, i19 + 1) < AbstractC4537f.m17639b(iArr2, i19 - 1))) {
                iM17639b = AbstractC4537f.m17639b(iArr2, i19 + 1);
                i15 = iM17639b;
            } else {
                iM17639b = AbstractC4537f.m17639b(iArr2, i19 - 1);
                i15 = iM17639b - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = ((i14 != 0 ? 1 : 0) & (i15 == iM17639b ? 1 : 0)) + i20;
            while (i15 > i10 && i20 > i12) {
                if (!interfaceC4578q.mo17613a(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            AbstractC4537f.m17641d(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (AbstractC4537f.m17639b(iArr, i16) >= i15) {
                    m17568f(i15, i20, iM17639b, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final C4605z m17566d(int i10, int i11, InterfaceC4578q interfaceC4578q) {
        char c10 = 1;
        int i12 = ((i10 + i11) + 1) / 2;
        C4605z c4605z = new C4605z(i12 * 3);
        C4605z c4605z2 = new C4605z(i12 * 4);
        c4605z2.m18458h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrM17638a = AbstractC4537f.m17638a(new int[i13]);
        int[] iArrM17638a2 = AbstractC4537f.m17638a(new int[i13]);
        int[] iArrM17623b = AbstractC4532d2.m17623b(new int[5]);
        while (c4605z2.m18454d()) {
            int iM18456f = c4605z2.m18456f();
            int iM18456f2 = c4605z2.m18456f();
            int iM18456f3 = c4605z2.m18456f();
            int iM18456f4 = c4605z2.m18456f();
            int[] iArr = iArrM17623b;
            if (m17570h(iM18456f4, iM18456f3, iM18456f2, iM18456f, interfaceC4578q, iArrM17638a, iArrM17638a2, iArrM17623b)) {
                char c11 = c10;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c10]) > 0) {
                    AbstractC4532d2.m17622a(iArr, c4605z);
                }
                c4605z2.m18458h(iM18456f4, iArr[0], iM18456f2, iArr[c11]);
                c4605z2.m18458h(iArr[2], iM18456f3, iArr[3], iM18456f);
                iArrM17623b = iArr;
                c10 = c11;
            } else {
                iArrM17623b = iArr;
            }
        }
        c4605z.m18461k();
        c4605z.m18457g(i10, i11, 0);
        return c4605z;
    }

    /* JADX INFO: renamed from: e */
    public static final void m17567e(int i10, int i11, InterfaceC4578q interfaceC4578q) {
        m17564b(m17566d(i10, i11, interfaceC4578q), interfaceC4578q);
    }

    /* JADX INFO: renamed from: f */
    public static final void m17568f(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final boolean m17569g(int i10, int i11, int i12, int i13, InterfaceC4578q interfaceC4578q, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iM17639b;
        int i15;
        boolean z10;
        int i16 = (i11 - i10) - (i13 - i12);
        boolean z11 = true;
        boolean z12 = (Math.abs(i16) & 1) == 1;
        int i17 = -i14;
        int i18 = i17;
        while (i18 <= i14) {
            if (i18 == i17 || (i18 != i14 && AbstractC4537f.m17639b(iArr, i18 + 1) > AbstractC4537f.m17639b(iArr, i18 - 1))) {
                iM17639b = AbstractC4537f.m17639b(iArr, i18 + 1);
                i15 = iM17639b;
            } else {
                iM17639b = AbstractC4537f.m17639b(iArr, i18 - 1);
                i15 = iM17639b + 1;
            }
            int i19 = (i12 + (i15 - i10)) - i18;
            int i20 = i19 - ((i14 != 0 ? z11 : 0) & (i15 == iM17639b ? z11 : 0));
            while (i15 < i11 && i19 < i13) {
                if (!interfaceC4578q.mo17613a(i15, i19)) {
                    break;
                }
                i15++;
                i19++;
            }
            AbstractC4537f.m17641d(iArr, i18, i15);
            if (z12) {
                int i21 = i16 - i18;
                z10 = z11;
                if (i21 >= i17 + 1 && i21 <= i14 - 1) {
                    if (AbstractC4537f.m17639b(iArr2, i21) <= i15) {
                        m17568f(iM17639b, i20, i15, i19, false, iArr3);
                        return z10;
                    }
                }
                i18 += 2;
                z11 = z10;
            } else {
                z10 = z11;
            }
            i18 += 2;
            z11 = z10;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m17570h(int i10, int i11, int i12, int i13, InterfaceC4578q interfaceC4578q, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            int[] iArr4 = iArr;
            AbstractC4537f.m17641d(iArr4, 1, i10);
            int[] iArr5 = iArr2;
            AbstractC4537f.m17641d(iArr5, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                if (m17569g(i10, i11, i12, i13, interfaceC4578q, iArr4, iArr5, i17, iArr3) || m17565c(i10, i11, i12, i13, interfaceC4578q, iArr, iArr2, i17, iArr3)) {
                    return true;
                }
                i17++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final void m17571i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}
