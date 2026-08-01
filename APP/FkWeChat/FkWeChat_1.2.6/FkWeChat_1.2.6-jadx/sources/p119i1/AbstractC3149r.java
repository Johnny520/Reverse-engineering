package p119i1;

import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: i1.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3149r {
    /* JADX INFO: renamed from: a */
    public static final int m11859a(long[] jArr, long j10) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j11 = jArr[i11];
            if (j10 > j11) {
                i10 = i11 + 1;
            } else {
                if (j10 >= j11) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: b */
    public static final long[] m11860b(int i10) {
        return new long[i10];
    }

    /* JADX INFO: renamed from: c */
    public static final long m11861c(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public static final long[] m11862d(long[] jArr, int i10, long j10) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        AbstractC5102r.m20659k(jArr, jArr2, 0, 0, i10);
        AbstractC5102r.m20659k(jArr, jArr2, i10 + 1, i10, length);
        jArr2[i10] = j10;
        return jArr2;
    }

    /* JADX INFO: renamed from: e */
    public static final long[] m11863e(long[] jArr, int i10) {
        int length = jArr.length;
        int i11 = length - 1;
        if (i11 == 0) {
            return null;
        }
        long[] jArr2 = new long[i11];
        if (i10 > 0) {
            AbstractC5102r.m20659k(jArr, jArr2, 0, 0, i10);
        }
        if (i10 < i11) {
            AbstractC5102r.m20659k(jArr, jArr2, i10, i10 + 1, length);
        }
        return jArr2;
    }
}
