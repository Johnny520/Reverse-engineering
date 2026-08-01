package p166l2;

/* JADX INFO: renamed from: l2.d2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4532d2 {
    /* JADX INFO: renamed from: a */
    public static final void m17622a(int[] iArr, C4605z c4605z) {
        int iMin;
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (m17624c(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i10 += ((iArr[4] != 0 ? 1 : 0) | (m17625d(iArr) ? 1 : 0)) ^ 1;
            i11 += ((!m17625d(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        c4605z.m18457g(i10, i11, iMin);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m17624c(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m17625d(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    /* JADX INFO: renamed from: b */
    public static int[] m17623b(int[] iArr) {
        return iArr;
    }
}
