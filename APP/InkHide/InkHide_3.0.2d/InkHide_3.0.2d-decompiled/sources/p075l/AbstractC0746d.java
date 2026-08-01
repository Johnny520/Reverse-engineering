package p075l;

/* JADX INFO: renamed from: l.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0746d {

    /* JADX INFO: renamed from: a */
    public static final int[] f2526a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final Object[] f2527b = new Object[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m1406a(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m1407b(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
