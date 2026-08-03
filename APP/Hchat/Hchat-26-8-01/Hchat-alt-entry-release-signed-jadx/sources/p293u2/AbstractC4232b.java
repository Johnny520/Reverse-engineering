package p293u2;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: u2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4232b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m8508a(int i9, int i10, int i11, int i12) {
        if (!((i11 >= 0) & (i10 >= i9) & (i12 >= i11) & (i9 >= 0))) {
            AbstractC4239i.m8525a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m8515h(i9, i10, i11, i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m8509b(int i9, int i10, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i9 = 0;
        }
        if ((i13 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return m8508a(i9, i10, i11, i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m8510c(int i9) {
        if (i9 < 8191) {
            return 13;
        }
        if (i9 < 32767) {
            return 15;
        }
        if (i9 < 65535) {
            return 16;
        }
        return i9 < 262143 ? 18 : 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m8511d(long j3, long j4) {
        int i9 = (int) (j4 >> 32);
        int iM8506j = C4231a.m8506j(j3);
        int iM8504h = C4231a.m8504h(j3);
        if (i9 < iM8506j) {
            i9 = iM8506j;
        }
        if (i9 <= iM8504h) {
            iM8504h = i9;
        }
        int i10 = (int) (j4 & 4294967295L);
        int iM8505i = C4231a.m8505i(j3);
        int iM8503g = C4231a.m8503g(j3);
        if (i10 < iM8505i) {
            i10 = iM8505i;
        }
        if (i10 <= iM8503g) {
            iM8503g = i10;
        }
        return (((long) iM8504h) << 32) | (((long) iM8503g) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final long m8512e(long j3, long j4) {
        int iM8506j = C4231a.m8506j(j3);
        int iM8504h = C4231a.m8504h(j3);
        int iM8505i = C4231a.m8505i(j3);
        int iM8503g = C4231a.m8503g(j3);
        int iM8506j2 = C4231a.m8506j(j4);
        if (iM8506j2 < iM8506j) {
            iM8506j2 = iM8506j;
        }
        if (iM8506j2 > iM8504h) {
            iM8506j2 = iM8504h;
        }
        int iM8504h2 = C4231a.m8504h(j4);
        if (iM8504h2 >= iM8506j) {
            iM8506j = iM8504h2;
        }
        if (iM8506j <= iM8504h) {
            iM8504h = iM8506j;
        }
        int iM8505i2 = C4231a.m8505i(j4);
        if (iM8505i2 < iM8505i) {
            iM8505i2 = iM8505i;
        }
        if (iM8505i2 > iM8503g) {
            iM8505i2 = iM8503g;
        }
        int iM8503g2 = C4231a.m8503g(j4);
        if (iM8503g2 >= iM8505i) {
            iM8505i = iM8503g2;
        }
        if (iM8505i <= iM8503g) {
            iM8503g = iM8505i;
        }
        return m8508a(iM8506j2, iM8504h, iM8505i2, iM8503g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m8513f(int i9, long j3) {
        int iM8505i = C4231a.m8505i(j3);
        int iM8503g = C4231a.m8503g(j3);
        if (i9 < iM8505i) {
            i9 = iM8505i;
        }
        return i9 > iM8503g ? iM8503g : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m8514g(int i9, long j3) {
        int iM8506j = C4231a.m8506j(j3);
        int iM8504h = C4231a.m8504h(j3);
        if (i9 < iM8506j) {
            i9 = iM8506j;
        }
        return i9 > iM8504h ? iM8504h : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final long m8515h(int i9, int i10, int i11, int i12) {
        int i13 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int iM8510c = m8510c(i13);
        int i14 = i10 == Integer.MAX_VALUE ? i9 : i10;
        int iM8510c2 = m8510c(i14);
        if (iM8510c + iM8510c2 > 31) {
            m8517j(i14, i13);
        }
        int i15 = i10 + 1;
        int i16 = i12 + 1;
        int i17 = iM8510c2 - 13;
        return (((long) (i15 & (~(i15 >> 31)))) << 33) | ((long) ((i17 >> 1) + (i17 & 1))) | (((long) i9) << 2) | (((long) i11) << (iM8510c2 + 2)) | (((long) (i16 & (~(i16 >> 31)))) << (iM8510c2 + 33));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final long m8516i(int i9, int i10, long j3) {
        int iM8506j = C4231a.m8506j(j3) + i9;
        if (iM8506j < 0) {
            iM8506j = 0;
        }
        int iM8504h = C4231a.m8504h(j3);
        if (iM8504h != Integer.MAX_VALUE && (iM8504h = iM8504h + i9) < 0) {
            iM8504h = 0;
        }
        int iM8505i = C4231a.m8505i(j3) + i10;
        if (iM8505i < 0) {
            iM8505i = 0;
        }
        int iM8503g = C4231a.m8503g(j3);
        return m8508a(iM8506j, iM8504h, iM8505i, (iM8503g == Integer.MAX_VALUE || (iM8503g = iM8503g + i10) >= 0) ? iM8503g : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final void m8517j(int i9, int i10) {
        throw new IllegalArgumentException(AbstractC0921a.m2248k(i9, i10, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final Void m8518k(int i9) {
        throw new IllegalArgumentException(AbstractC0921a.m2250m(i9, "Can't represent a size of ", " in Constraints"));
    }
}
