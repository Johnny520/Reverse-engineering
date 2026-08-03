package p087g;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1256a {

    /* JADX INFO: renamed from: a */
    public static final int[] f4113a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f4114b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f4115c = new Object[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m3379a(int[] iArr, int i9, int i10) {
        iArr.getClass();
        int i11 = i9 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final int m3380b(long[] jArr, int i9, long j3) {
        jArr.getClass();
        int i10 = i9 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j4 = jArr[i12];
            if (j4 < j3) {
                i11 = i12 + 1;
            } else {
                if (j4 <= j3) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }
}
