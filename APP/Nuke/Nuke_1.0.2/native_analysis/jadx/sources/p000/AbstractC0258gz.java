package p000;

/* JADX INFO: renamed from: gz */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0258gz {
    /* JADX INFO: renamed from: a */
    public static final long m2027a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            mz0.m3220a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m2034h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m2028b(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m2027a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static final int m2029c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: d */
    public static final long m2030d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM1765j = C0221fz.m1765j(j);
        int iM1763h = C0221fz.m1763h(j);
        if (i < iM1765j) {
            i = iM1765j;
        }
        if (i <= iM1763h) {
            iM1763h = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM1764i = C0221fz.m1764i(j);
        int iM1762g = C0221fz.m1762g(j);
        if (i2 < iM1764i) {
            i2 = iM1764i;
        }
        if (i2 <= iM1762g) {
            iM1762g = i2;
        }
        return (((long) iM1763h) << 32) | (((long) iM1762g) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static final long m2031e(long j, long j2) {
        int iM1765j = C0221fz.m1765j(j);
        int iM1763h = C0221fz.m1763h(j);
        int iM1764i = C0221fz.m1764i(j);
        int iM1762g = C0221fz.m1762g(j);
        int iM1765j2 = C0221fz.m1765j(j2);
        if (iM1765j2 < iM1765j) {
            iM1765j2 = iM1765j;
        }
        if (iM1765j2 > iM1763h) {
            iM1765j2 = iM1763h;
        }
        int iM1763h2 = C0221fz.m1763h(j2);
        if (iM1763h2 >= iM1765j) {
            iM1765j = iM1763h2;
        }
        if (iM1765j <= iM1763h) {
            iM1763h = iM1765j;
        }
        int iM1764i2 = C0221fz.m1764i(j2);
        if (iM1764i2 < iM1764i) {
            iM1764i2 = iM1764i;
        }
        if (iM1764i2 > iM1762g) {
            iM1764i2 = iM1762g;
        }
        int iM1762g2 = C0221fz.m1762g(j2);
        if (iM1762g2 >= iM1764i) {
            iM1764i = iM1762g2;
        }
        if (iM1764i <= iM1762g) {
            iM1762g = iM1764i;
        }
        return m2027a(iM1765j2, iM1763h, iM1764i2, iM1762g);
    }

    /* JADX INFO: renamed from: f */
    public static final int m2032f(long j, int i) {
        int iM1764i = C0221fz.m1764i(j);
        int iM1762g = C0221fz.m1762g(j);
        if (i < iM1764i) {
            i = iM1764i;
        }
        return i > iM1762g ? iM1762g : i;
    }

    /* JADX INFO: renamed from: g */
    public static final int m2033g(long j, int i) {
        int iM1765j = C0221fz.m1765j(j);
        int iM1763h = C0221fz.m1763h(j);
        if (i < iM1765j) {
            i = iM1765j;
        }
        return i > iM1763h ? iM1763h : i;
    }

    /* JADX INFO: renamed from: h */
    public static final long m2034h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM2029c = m2029c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM2029c2 = m2029c(i6);
        if (iM2029c + iM2029c2 > 31) {
            m2036j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM2029c2 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM2029c2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM2029c2 + 33));
    }

    /* JADX INFO: renamed from: i */
    public static final long m2035i(int i, int i2, long j) {
        int iM1765j = C0221fz.m1765j(j) + i;
        if (iM1765j < 0) {
            iM1765j = 0;
        }
        int iM1763h = C0221fz.m1763h(j);
        if (iM1763h != Integer.MAX_VALUE && (iM1763h = iM1763h + i) < 0) {
            iM1763h = 0;
        }
        int iM1764i = C0221fz.m1764i(j) + i2;
        if (iM1764i < 0) {
            iM1764i = 0;
        }
        int iM1762g = C0221fz.m1762g(j);
        return m2027a(iM1765j, iM1763h, iM1764i, (iM1762g == Integer.MAX_VALUE || (iM1762g = iM1762g + i2) >= 0) ? iM1762g : 0);
    }

    /* JADX INFO: renamed from: j */
    public static final void m2036j(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    /* JADX INFO: renamed from: k */
    public static final Void m2037k(int i) {
        throw new IllegalArgumentException(hk1.m2208g(i, "Can't represent a size of ", " in Constraints"));
    }
}
