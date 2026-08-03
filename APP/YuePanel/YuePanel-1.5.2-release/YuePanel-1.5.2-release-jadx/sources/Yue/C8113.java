package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "UnsignedKt")
public final class C8113 {
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ */
    public static final int m4143(double d) {
        if (Double.isNaN(d) || d <= m26715(0)) {
            return 0;
        }
        if (d >= m26715(-1)) {
            return -1;
        }
        return d <= 2.147483647E9d ? C8057.m26318((int) d) : C8057.m26318(C8057.m26318((int) (d - ((double) Integer.MAX_VALUE))) + C8057.m26318(Integer.MAX_VALUE));
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟ */
    public static final long m4144(double d) {
        if (Double.isNaN(d) || d <= m26719(0L)) {
            return 0L;
        }
        if (d >= m26719(-1L)) {
            return -1L;
        }
        return d < 9.223372036854776E18d ? C8064.m26408((long) d) : C8064.m26408(C8064.m26408((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m26712(int i, int i2) {
        return C5499.m17107(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m26713(int i, int i2) {
        return C8057.m26318((int) ((((long) i) & C8578.f25466) / (((long) i2) & C8578.f25466)));
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m26714(int i, int i2) {
        return C8057.m26318((int) ((((long) i) & C8578.f25466) % (((long) i2) & C8578.f25466)));
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final double m26715(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * ((double) 2));
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m26716(long j, long j2) {
        return C5499.m17108(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long m26717(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? C8064.m26408(0L) : C8064.m26408(1L);
        }
        if (j >= 0) {
            return C8064.m26408(j / j2);
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return C8064.m26408(j3 + ((long) (Long.compareUnsigned(C8064.m26408(j - (j3 * j2)), C8064.m26408(j2)) < 0 ? 0 : 1)));
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m26718(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? j : C8064.m26408(j - j2);
        }
        if (j >= 0) {
            return C8064.m26408(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (Long.compareUnsigned(C8064.m26408(j3), C8064.m26408(j2)) < 0) {
            j2 = 0;
        }
        return C8064.m26408(j3 - j2);
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final double m26719(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String m26720(long j) {
        return m26721(j, 10);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String m26721(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, C3791.m836(i));
            C5499.m17102(string, "toString(this, checkRadix(radix))");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, C3791.m836(i));
        C5499.m17102(string2, "toString(this, checkRadix(radix))");
        sb.append(string2);
        String string3 = Long.toString(j4, C3791.m836(i));
        C5499.m17102(string3, "toString(this, checkRadix(radix))");
        sb.append(string3);
        return sb.toString();
    }
}
