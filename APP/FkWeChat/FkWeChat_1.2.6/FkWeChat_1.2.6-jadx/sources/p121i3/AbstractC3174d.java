package p121i3;

/* JADX INFO: renamed from: i3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3174d {
    /* JADX INFO: renamed from: a */
    public static final long m11984a(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            AbstractC3184n.m12039a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m11991h(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m11985b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return m11984a(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: c */
    public static final int m11986c(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: d */
    public static final long m11987d(long j10, long j11) {
        int i10 = (int) (j11 >> 32);
        int iM11975n = C3173c.m11975n(j10);
        int iM11973l = C3173c.m11973l(j10);
        if (i10 < iM11975n) {
            i10 = iM11975n;
        }
        if (i10 <= iM11973l) {
            iM11973l = i10;
        }
        int i11 = (int) (j11 & 4294967295L);
        int iM11974m = C3173c.m11974m(j10);
        int iM11972k = C3173c.m11972k(j10);
        if (i11 < iM11974m) {
            i11 = iM11974m;
        }
        if (i11 <= iM11972k) {
            iM11972k = i11;
        }
        return C3189s.m12082c((((long) iM11973l) << 32) | (((long) iM11972k) & 4294967295L));
    }

    /* JADX INFO: renamed from: e */
    public static final long m11988e(long j10, long j11) {
        int iM11975n = C3173c.m11975n(j10);
        int iM11973l = C3173c.m11973l(j10);
        int iM11974m = C3173c.m11974m(j10);
        int iM11972k = C3173c.m11972k(j10);
        int iM11975n2 = C3173c.m11975n(j11);
        if (iM11975n2 < iM11975n) {
            iM11975n2 = iM11975n;
        }
        if (iM11975n2 > iM11973l) {
            iM11975n2 = iM11973l;
        }
        int iM11973l2 = C3173c.m11973l(j11);
        if (iM11973l2 >= iM11975n) {
            iM11975n = iM11973l2;
        }
        if (iM11975n <= iM11973l) {
            iM11973l = iM11975n;
        }
        int iM11974m2 = C3173c.m11974m(j11);
        if (iM11974m2 < iM11974m) {
            iM11974m2 = iM11974m;
        }
        if (iM11974m2 > iM11972k) {
            iM11974m2 = iM11972k;
        }
        int iM11972k2 = C3173c.m11972k(j11);
        if (iM11972k2 >= iM11974m) {
            iM11974m = iM11972k2;
        }
        if (iM11974m <= iM11972k) {
            iM11972k = iM11974m;
        }
        return m11984a(iM11975n2, iM11973l, iM11974m2, iM11972k);
    }

    /* JADX INFO: renamed from: f */
    public static final int m11989f(long j10, int i10) {
        int iM11974m = C3173c.m11974m(j10);
        int iM11972k = C3173c.m11972k(j10);
        if (i10 < iM11974m) {
            i10 = iM11974m;
        }
        return i10 > iM11972k ? iM11972k : i10;
    }

    /* JADX INFO: renamed from: g */
    public static final int m11990g(long j10, int i10) {
        int iM11975n = C3173c.m11975n(j10);
        int iM11973l = C3173c.m11973l(j10);
        if (i10 < iM11975n) {
            i10 = iM11975n;
        }
        return i10 > iM11973l ? iM11973l : i10;
    }

    /* JADX INFO: renamed from: h */
    public static final long m11991h(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iM11986c = m11986c(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iM11986c2 = m11986c(i15);
        if (iM11986c + iM11986c2 > 31) {
            m11994k(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = iM11986c2 - 13;
        return C3173c.m11963b((((long) (i16 & (~(i16 >> 31)))) << 33) | ((long) ((i18 >> 1) + (i18 & 1))) | (((long) i10) << 2) | (((long) i12) << (iM11986c2 + 2)) | (((long) (i17 & (~(i17 >> 31)))) << (iM11986c2 + 33)));
    }

    /* JADX INFO: renamed from: i */
    public static final long m11992i(long j10, int i10, int i11) {
        int iM11975n = C3173c.m11975n(j10) + i10;
        if (iM11975n < 0) {
            iM11975n = 0;
        }
        int iM11973l = C3173c.m11973l(j10);
        if (iM11973l != Integer.MAX_VALUE && (iM11973l = iM11973l + i10) < 0) {
            iM11973l = 0;
        }
        int iM11974m = C3173c.m11974m(j10) + i11;
        if (iM11974m < 0) {
            iM11974m = 0;
        }
        int iM11972k = C3173c.m11972k(j10);
        return m11984a(iM11975n, iM11973l, iM11974m, (iM11972k == Integer.MAX_VALUE || (iM11972k = iM11972k + i11) >= 0) ? iM11972k : 0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ long m11993j(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m11992i(j10, i10, i11);
    }

    /* JADX INFO: renamed from: k */
    public static final void m11994k(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    /* JADX INFO: renamed from: l */
    public static final Void m11995l(int i10) {
        throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
    }
}
