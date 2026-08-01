package p309v5;

/* JADX INFO: renamed from: v5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8821c {
    /* JADX INFO: renamed from: a */
    public static boolean m33833a(int[] iArr, int i10, int i11) {
        int iM33837e = m33837e(iArr, i10);
        return iM33837e >= 0 && iM33837e < i11;
    }

    /* JADX INFO: renamed from: b */
    public static int m33834b(int[] iArr) {
        int iBitCount = 0;
        for (int i10 : iArr) {
            iBitCount += Integer.bitCount(i10);
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public static void m33835c(int[] iArr, int i10) {
        int i11 = i10 >> 5;
        iArr[i11] = (~(1 << (i10 & 31))) & iArr[i11];
    }

    /* JADX INFO: renamed from: d */
    public static int m33836d(int i10, int i11) {
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10 & (~((1 << i11) - 1)));
        if (iNumberOfTrailingZeros == 32) {
            return -1;
        }
        return iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: e */
    public static int m33837e(int[] iArr, int i10) {
        int iM33836d;
        int length = iArr.length;
        int i11 = i10 & 31;
        int i12 = i10 >> 5;
        while (i12 < length) {
            int i13 = iArr[i12];
            if (i13 != 0 && (iM33836d = m33836d(i13, i11)) >= 0) {
                return (i12 << 5) + iM33836d;
            }
            i12++;
            i11 = 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m33838f(int[] iArr, int i10) {
        return (iArr[i10 >> 5] & (1 << (i10 & 31))) != 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m33839g(int[] iArr) {
        return iArr.length * 32;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m33840h(int[] iArr) {
        for (int i10 : iArr) {
            if (i10 != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static int[] m33841i(int i10) {
        return new int[(i10 + 31) >> 5];
    }

    /* JADX INFO: renamed from: j */
    public static void m33842j(int[] iArr, int[] iArr2) {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            iArr[i10] = iArr[i10] | iArr2[i10];
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m33843k(int[] iArr, int i10) {
        int i11 = i10 >> 5;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    /* JADX INFO: renamed from: l */
    public static void m33844l(int[] iArr, int i10, boolean z10) {
        int i11 = i10 >> 5;
        int i12 = 1 << (i10 & 31);
        if (z10) {
            iArr[i11] = i12 | iArr[i11];
        } else {
            iArr[i11] = (~i12) & iArr[i11];
        }
    }
}
