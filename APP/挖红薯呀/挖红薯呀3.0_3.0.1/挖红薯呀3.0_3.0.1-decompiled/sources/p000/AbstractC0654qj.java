package p000;

/* JADX INFO: renamed from: qj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0654qj {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m3254a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            y10.m5197a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m3260g(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m3255b(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return m3254a(0, i, 0, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m3256c(int i) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m3257d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM3139j = C0617pj.m3139j(j);
        int iM3137h = C0617pj.m3137h(j);
        if (i < iM3139j) {
            i = iM3139j;
        }
        if (i <= iM3137h) {
            iM3137h = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM3138i = C0617pj.m3138i(j);
        int iM3136g = C0617pj.m3136g(j);
        if (i2 < iM3138i) {
            i2 = iM3138i;
        }
        if (i2 <= iM3136g) {
            iM3136g = i2;
        }
        return (((long) iM3137h) << 32) | (((long) iM3136g) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m3258e(int i, long j) {
        int iM3138i = C0617pj.m3138i(j);
        int iM3136g = C0617pj.m3136g(j);
        if (i < iM3138i) {
            i = iM3138i;
        }
        return i > iM3136g ? iM3136g : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m3259f(int i, long j) {
        int iM3139j = C0617pj.m3139j(j);
        int iM3137h = C0617pj.m3137h(j);
        if (i < iM3139j) {
            i = iM3139j;
        }
        return i > iM3137h ? iM3137h : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final long m3260g(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM3256c = m3256c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM3256c2 = m3256c(i6);
        if (iM3256c + iM3256c2 > 31) {
            m3262i(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM3256c2 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM3256c2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM3256c2 + 33));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final long m3261h(long j, int i, int i2) {
        int iM3139j = C0617pj.m3139j(j) + i;
        if (iM3139j < 0) {
            iM3139j = 0;
        }
        int iM3137h = C0617pj.m3137h(j);
        if (iM3137h != Integer.MAX_VALUE && (iM3137h = iM3137h + i) < 0) {
            iM3137h = 0;
        }
        int iM3138i = C0617pj.m3138i(j) + i2;
        if (iM3138i < 0) {
            iM3138i = 0;
        }
        int iM3136g = C0617pj.m3136g(j);
        return m3254a(iM3139j, iM3137h, iM3138i, (iM3136g == Integer.MAX_VALUE || (iM3136g = iM3136g + i2) >= 0) ? iM3136g : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final void m3262i(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final Void m3263j(int i) {
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }
}
