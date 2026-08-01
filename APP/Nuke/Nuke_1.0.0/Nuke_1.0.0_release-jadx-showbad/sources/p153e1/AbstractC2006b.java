package p153e1;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2006b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m3684a(int i5, int i6, int i7, int i8) {
        if (!((i7 >= 0) & (i6 >= i5) & (i8 >= i7) & (i5 >= 0))) {
            AbstractC2013i.m3698a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m3691h(i5, i6, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m3685b(int i5, int i6, int i7) {
        if ((i7 & 2) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return m3684a(0, i5, 0, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m3686c(int i5) {
        if (i5 < 8191) {
            return 13;
        }
        if (i5 < 32767) {
            return 15;
        }
        if (i5 < 65535) {
            return 16;
        }
        return i5 < 262143 ? 18 : 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m3687d(long j5, long j6) {
        int i5 = (int) (j6 >> 32);
        int iM3682j = C2005a.m3682j(j5);
        int iM3680h = C2005a.m3680h(j5);
        if (i5 < iM3682j) {
            i5 = iM3682j;
        }
        if (i5 <= iM3680h) {
            iM3680h = i5;
        }
        int i6 = (int) (j6 & 4294967295L);
        int iM3681i = C2005a.m3681i(j5);
        int iM3679g = C2005a.m3679g(j5);
        if (i6 < iM3681i) {
            i6 = iM3681i;
        }
        if (i6 <= iM3679g) {
            iM3679g = i6;
        }
        return (((long) iM3680h) << 32) | (((long) iM3679g) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final long m3688e(long j5, long j6) {
        int iM3682j = C2005a.m3682j(j5);
        int iM3680h = C2005a.m3680h(j5);
        int iM3681i = C2005a.m3681i(j5);
        int iM3679g = C2005a.m3679g(j5);
        int iM3682j2 = C2005a.m3682j(j6);
        if (iM3682j2 < iM3682j) {
            iM3682j2 = iM3682j;
        }
        if (iM3682j2 > iM3680h) {
            iM3682j2 = iM3680h;
        }
        int iM3680h2 = C2005a.m3680h(j6);
        if (iM3680h2 >= iM3682j) {
            iM3682j = iM3680h2;
        }
        if (iM3682j <= iM3680h) {
            iM3680h = iM3682j;
        }
        int iM3681i2 = C2005a.m3681i(j6);
        if (iM3681i2 < iM3681i) {
            iM3681i2 = iM3681i;
        }
        if (iM3681i2 > iM3679g) {
            iM3681i2 = iM3679g;
        }
        int iM3679g2 = C2005a.m3679g(j6);
        if (iM3679g2 >= iM3681i) {
            iM3681i = iM3679g2;
        }
        if (iM3681i <= iM3679g) {
            iM3679g = iM3681i;
        }
        return m3684a(iM3682j2, iM3680h, iM3681i2, iM3679g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m3689f(long j5, int i5) {
        int iM3681i = C2005a.m3681i(j5);
        int iM3679g = C2005a.m3679g(j5);
        if (i5 < iM3681i) {
            i5 = iM3681i;
        }
        return i5 > iM3679g ? iM3679g : i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m3690g(long j5, int i5) {
        int iM3682j = C2005a.m3682j(j5);
        int iM3680h = C2005a.m3680h(j5);
        if (i5 < iM3682j) {
            i5 = iM3682j;
        }
        return i5 > iM3680h ? iM3680h : i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final long m3691h(int i5, int i6, int i7, int i8) {
        int i9 = i8 == Integer.MAX_VALUE ? i7 : i8;
        int iM3686c = m3686c(i9);
        int i10 = i6 == Integer.MAX_VALUE ? i5 : i6;
        int iM3686c2 = m3686c(i10);
        if (iM3686c + iM3686c2 > 31) {
            m3693j(i10, i9);
        }
        int i11 = i6 + 1;
        int i12 = i8 + 1;
        int i13 = iM3686c2 - 13;
        return (((long) (i11 & (~(i11 >> 31)))) << 33) | ((long) ((i13 >> 1) + (i13 & 1))) | (((long) i5) << 2) | (((long) i7) << (iM3686c2 + 2)) | (((long) (i12 & (~(i12 >> 31)))) << (iM3686c2 + 33));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final long m3692i(int i5, int i6, long j5) {
        int iM3682j = C2005a.m3682j(j5) + i5;
        if (iM3682j < 0) {
            iM3682j = 0;
        }
        int iM3680h = C2005a.m3680h(j5);
        if (iM3680h != Integer.MAX_VALUE && (iM3680h = iM3680h + i5) < 0) {
            iM3680h = 0;
        }
        int iM3681i = C2005a.m3681i(j5) + i6;
        if (iM3681i < 0) {
            iM3681i = 0;
        }
        int iM3679g = C2005a.m3679g(j5);
        return m3684a(iM3682j, iM3680h, iM3681i, (iM3679g == Integer.MAX_VALUE || (iM3679g = iM3679g + i6) >= 0) ? iM3679g : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final void m3693j(int i5, int i6) {
        throw new IllegalArgumentException("Can't represent a width of " + i5 + " and height of " + i6 + " in Constraints");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final Void m3694k(int i5) {
        throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "Can't represent a size of ", " in Constraints"));
    }
}
