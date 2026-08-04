package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛸᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2497 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C1510 f12305 = new C1510();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final AbstractC0638 f12306;

    static {
        Integer num = AbstractC1359.f6331;
        f12306 = (num == null || num.intValue() >= 34) ? new C2762() : new C2051();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public long mo3132(long j, long j2) {
        long jMo1533;
        long j3;
        long jMo1529;
        int iMo1530;
        if (j2 <= j) {
            C1693.m3435("Random range is empty: [", Long.valueOf(j), ", ", Long.valueOf(j2), ").");
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iMo1530 = mo1529(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iMo1530 = mo1530();
                } else {
                    jMo1529 = (((long) mo1529(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) mo1530()) & 4294967295L);
                }
                jMo1529 = ((long) iMo1530) & 4294967295L;
            } else {
                do {
                    jMo1533 = mo1533() >>> 1;
                    j3 = jMo1533 % j4;
                } while ((j4 - 1) + (jMo1533 - j3) < 0);
                jMo1529 = j3;
            }
            return j + jMo1529;
        }
        while (true) {
            long jMo15332 = mo1533();
            if (j <= jMo15332 && jMo15332 < j2) {
                return jMo15332;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public abstract int mo1529(int i);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public abstract int mo1530();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public int mo3133(int i, int i2) {
        int iMo1530;
        int i3;
        int iMo1529;
        if (i2 <= i) {
            C1693.m3435("Random range is empty: [", Integer.valueOf(i), ", ", Integer.valueOf(i2), ").");
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iMo1529 = mo1529(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iMo1530 = mo1530() >>> 1;
                    i3 = iMo1530 % i4;
                } while ((i4 - 1) + (iMo1530 - i3) < 0);
                iMo1529 = i3;
            }
            return i + iMo1529;
        }
        while (true) {
            int iMo15302 = mo1530();
            if (i <= iMo15302 && iMo15302 < i2) {
                return iMo15302;
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public abstract long mo1533();
}
