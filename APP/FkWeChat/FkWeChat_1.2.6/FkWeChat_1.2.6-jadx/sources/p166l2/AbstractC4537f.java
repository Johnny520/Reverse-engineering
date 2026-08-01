package p166l2;

/* JADX INFO: renamed from: l2.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4537f {
    /* JADX INFO: renamed from: b */
    public static final int m17639b(int[] iArr, int i10) {
        return iArr[i10 + m17640c(iArr)];
    }

    /* JADX INFO: renamed from: c */
    public static final int m17640c(int[] iArr) {
        return iArr.length / 2;
    }

    /* JADX INFO: renamed from: d */
    public static final void m17641d(int[] iArr, int i10, int i11) {
        iArr[i10 + m17640c(iArr)] = i11;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m17638a(int[] iArr) {
        return iArr;
    }
}
