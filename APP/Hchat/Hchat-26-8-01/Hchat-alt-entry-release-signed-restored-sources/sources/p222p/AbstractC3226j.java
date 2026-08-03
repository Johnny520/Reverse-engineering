package p222p;

import okio.C3193a;

/* JADX INFO: renamed from: p.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3226j {

    /* JADX INFO: renamed from: a */
    public static final C3205c f10298a = new C3205c(3);

    /* JADX INFO: renamed from: b */
    public static final C3205c f10299b = new C3205c(2);

    /* JADX INFO: renamed from: c */
    public static final C3211e f10300c = new C3211e(1);

    /* JADX INFO: renamed from: d */
    public static final C3211e f10301d = new C3211e(0);

    /* JADX INFO: renamed from: e */
    public static final C3214f f10302e = new C3214f(0);

    /* JADX INFO: renamed from: f */
    public static final C3214f f10303f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C3214f(3);
        f10303f = new C3214f(2);
        new C3214f(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x002a */
    /* JADX INFO: renamed from: a */
    public static void m6915a(int i9, int[] iArr, int[] iArr2, boolean z9) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float f3 = (i9 - i11) / 2;
        if (!z9) {
            int length = iArr.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f3);
                f3 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = iArr[length2];
            iArr2[length2] = Math.round(f3);
            f3 += i15;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:8:0x0016 */
    /* JADX INFO: renamed from: b */
    public static void m6916b(int[] iArr, int[] iArr2, boolean z9) {
        int i9 = 0;
        if (!z9) {
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i9 < length) {
                int i12 = iArr[i9];
                iArr2[i10] = i11;
                i11 += i12;
                i9++;
                i10++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i13 = iArr[length2];
            iArr2[length2] = i9;
            i9 += i13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x0021 */
    /* JADX INFO: renamed from: c */
    public static void m6917c(int i9, int[] iArr, int[] iArr2, boolean z9) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int i13 = i9 - i11;
        if (!z9) {
            int length = iArr.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = iArr[i10];
                iArr2[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = i13;
            i13 += i16;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:15:0x0034 */
    /* JADX INFO: renamed from: d */
    public static void m6918d(int i9, int[] iArr, int[] iArr2, boolean z9) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float length = iArr.length == 0 ? 0.0f : (i9 - i11) / iArr.length;
        float f3 = length / 2;
        if (!z9) {
            int length2 = iArr.length;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f3);
                f3 += i14 + length;
                i10++;
                i13++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i15 = iArr[length3];
            iArr2[length3] = Math.round(f3);
            f3 += i15 + length;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m6919e(int i9, int[] iArr, int[] iArr2, boolean z9) {
        if (iArr.length == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float fMax = (i9 - i11) / Math.max(iArr.length - 1, 1);
        float f3 = (z9 && iArr.length == 1) ? fMax : 0.0f;
        if (z9) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i13 = iArr[length];
                iArr2[length] = Math.round(f3);
                f3 += i13 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i14 = 0;
        while (i10 < length2) {
            int i15 = iArr[i10];
            iArr2[i14] = Math.round(f3);
            f3 += i15 + fMax;
            i10++;
            i14++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m6920f(int i9, int[] iArr, int[] iArr2, boolean z9) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float length = (i9 - i11) / (iArr.length + 1);
        if (z9) {
            float f3 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i13 = iArr[length2];
                iArr2[length2] = Math.round(f3);
                f3 += i13 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f10 = length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = iArr[i10];
            iArr2[i14] = Math.round(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C3220h m6921g(float f3) {
        return new C3220h(f3, true, new C3193a(4));
    }
}
