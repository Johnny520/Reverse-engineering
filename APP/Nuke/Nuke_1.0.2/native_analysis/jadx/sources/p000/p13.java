package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p13 {

    /* JADX INFO: renamed from: b */
    public static final q13[] f7927b = {new q13(0), new q13(4294967296L), new q13(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f7928c = rg3.m4455I(Float.NaN, 0);

    /* JADX INFO: renamed from: a */
    public final long f7929a;

    /* JADX INFO: renamed from: a */
    public static final boolean m3673a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final long m3674b(long j) {
        return f7927b[(int) ((j & 1095216660480L) >>> 32)].f8703a;
    }

    /* JADX INFO: renamed from: c */
    public static final float m3675c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static String m3676d(long j) {
        long jM3674b = m3674b(j);
        if (q13.m4041a(jM3674b, 0L)) {
            return "Unspecified";
        }
        if (q13.m4041a(jM3674b, 4294967296L)) {
            return m3675c(j) + ".sp";
        }
        if (!q13.m4041a(jM3674b, 8589934592L)) {
            return "Invalid";
        }
        return m3675c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p13) {
            return this.f7929a == ((p13) obj).f7929a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7929a);
    }

    public final String toString() {
        return m3676d(this.f7929a);
    }
}
