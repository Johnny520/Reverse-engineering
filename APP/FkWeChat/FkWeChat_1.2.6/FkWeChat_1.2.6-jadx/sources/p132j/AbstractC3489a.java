package p132j;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3489a {

    /* JADX INFO: renamed from: a */
    public static final int[] f9693a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f9694b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f9695c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final int m13004a(int[] iArr, int i10, int i11) {
        iArr.getClass();
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    /* JADX INFO: renamed from: b */
    public static final int m13005b(long[] jArr, int i10, long j10) {
        jArr.getClass();
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = jArr[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m13006c(Object obj, Object obj2) {
        return AbstractC1061t.m3842c(obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static final int m13007d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: e */
    public static final int m13008e(int i10) {
        return m13007d(i10 * 4) / 4;
    }

    /* JADX INFO: renamed from: f */
    public static final int m13009f(int i10) {
        return m13007d(i10 * 8) / 8;
    }
}
