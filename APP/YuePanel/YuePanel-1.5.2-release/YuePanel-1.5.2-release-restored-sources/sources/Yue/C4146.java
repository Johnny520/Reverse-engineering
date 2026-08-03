package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4146 {

    /* JADX INFO: renamed from: ۥ */
    public static final int[] f712 = new int[0];

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long[] f713 = new long[0];

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object[] f8480 = new Object[0];

    /* JADX INFO: renamed from: ۥ */
    public static int m1100(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m1101(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m12009(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m12010(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m12011(int i) {
        return m12010(i * 4) / 4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m12012(int i) {
        return m12010(i * 8) / 8;
    }
}
