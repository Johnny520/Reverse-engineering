package p153e1;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: e1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2005a {

    /* JADX INFO: renamed from: a */
    public final long f6726a;

    public /* synthetic */ C2005a(long j5) {
        this.f6726a = j5;
    }

    /* JADX INFO: renamed from: a */
    public static long m3673a(long j5, int i5, int i6, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i5 = m3682j(j5);
        }
        if ((i9 & 2) != 0) {
            i6 = m3680h(j5);
        }
        if ((i9 & 4) != 0) {
            i7 = m3681i(j5);
        }
        if ((i9 & 8) != 0) {
            i8 = m3679g(j5);
        }
        if (i6 < i5 || i8 < i7 || i5 < 0 || i7 < 0) {
            AbstractC2013i.m3698a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC2006b.m3691h(i5, i6, i7, i8);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m3674b(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3675c(long j5) {
        int i5 = (int) (3 & j5);
        int i6 = (((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1);
        return (((int) (j5 >> (i6 + 46))) & ((1 << (18 - i6)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m3676d(long j5) {
        int i5 = (int) (3 & j5);
        return (((int) (j5 >> 33)) & ((1 << (((((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m3677e(long j5) {
        int i5 = (int) (3 & j5);
        int i6 = (((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1);
        int i7 = (1 << (18 - i6)) - 1;
        int i8 = ((int) (j5 >> (i6 + 15))) & i7;
        int i9 = ((int) (j5 >> (i6 + 46))) & i7;
        return i8 == (i9 == 0 ? Integer.MAX_VALUE : i9 - 1);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m3678f(long j5) {
        int i5 = (int) (3 & j5);
        int i6 = (1 << (((((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1)) + 13)) - 1;
        int i7 = ((int) (j5 >> 2)) & i6;
        int i8 = ((int) (j5 >> 33)) & i6;
        return i7 == (i8 == 0 ? Integer.MAX_VALUE : i8 - 1);
    }

    /* JADX INFO: renamed from: g */
    public static final int m3679g(long j5) {
        int i5 = (int) (3 & j5);
        int i6 = (((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1);
        int i7 = ((int) (j5 >> (i6 + 46))) & ((1 << (18 - i6)) - 1);
        if (i7 == 0) {
            return Integer.MAX_VALUE;
        }
        return i7 - 1;
    }

    /* JADX INFO: renamed from: h */
    public static final int m3680h(long j5) {
        int i5 = (int) (3 & j5);
        int i6 = (int) (j5 >> 33);
        int i7 = i6 & ((1 << (((((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1)) + 13)) - 1);
        if (i7 == 0) {
            return Integer.MAX_VALUE;
        }
        return i7 - 1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m3681i(long j5) {
        int i5 = (int) (3 & j5);
        int i6 = (((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1);
        return ((int) (j5 >> (i6 + 15))) & ((1 << (18 - i6)) - 1);
    }

    /* JADX INFO: renamed from: j */
    public static final int m3682j(long j5) {
        int i5 = (int) (3 & j5);
        return ((int) (j5 >> 2)) & ((1 << (((((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1)) + 13)) - 1);
    }

    /* JADX INFO: renamed from: k */
    public static String m3683k(long j5) {
        int iM3680h = m3680h(j5);
        String strValueOf = iM3680h == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM3680h);
        int iM3679g = m3679g(j5);
        String strValueOf2 = iM3679g != Integer.MAX_VALUE ? String.valueOf(iM3679g) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m3682j(j5));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m3681i(j5));
        sb.append(", maxHeight = ");
        return AbstractC0231b.m402m(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2005a) {
            return this.f6726a == ((C2005a) obj).f6726a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6726a);
    }

    public final String toString() {
        return m3683k(this.f6726a);
    }
}
