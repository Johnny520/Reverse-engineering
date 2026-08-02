package p000;

/* JADX INFO: renamed from: fz */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0221fz {

    /* JADX INFO: renamed from: a */
    public final long f3199a;

    public /* synthetic */ C0221fz(long j) {
        this.f3199a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m1756a(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = m1765j(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m1763h(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m1764i(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m1762g(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            mz0.m3220a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC0258gz.m2034h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m1757b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1758c(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1759d(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m1760e(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m1761f(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    /* JADX INFO: renamed from: g */
    public static final int m1762g(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: h */
    public static final int m1763h(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m1764i(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: j */
    public static final int m1765j(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    /* JADX INFO: renamed from: k */
    public static String m1766k(long j) {
        int iM1763h = m1763h(j);
        String strValueOf = iM1763h == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM1763h);
        int iM1762g = m1762g(j);
        String strValueOf2 = iM1762g != Integer.MAX_VALUE ? String.valueOf(iM1762g) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m1765j(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m1764i(j));
        sb.append(", maxHeight = ");
        return hk1.m2210i(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0221fz) {
            return this.f3199a == ((C0221fz) obj).f3199a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3199a);
    }

    public final String toString() {
        return m1766k(this.f3199a);
    }
}
