package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class u71 {

    /* JADX INFO: renamed from: b */
    public static final v71[] f6157b = {new v71(0), new v71(4294967296L), new v71(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f6158c = j50.m1670t(Float.NaN, 0);

    /* JADX INFO: renamed from: a */
    public final long f6159a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m4286a(long j, long j2) {
        return j == j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m4287b(long j) {
        return f6157b[(int) ((j & 1095216660480L) >>> 32)].f6440a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m4288c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m4289d(long j) {
        long jM4287b = m4287b(j);
        if (v71.m4419a(jM4287b, 0L)) {
            return "Unspecified";
        }
        if (v71.m4419a(jM4287b, 4294967296L)) {
            return m4288c(j) + ".sp";
        }
        if (!v71.m4419a(jM4287b, 8589934592L)) {
            return "Invalid";
        }
        return m4288c(j) + ".em";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof u71) {
            return this.f6159a == ((u71) obj).f6159a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f6159a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m4289d(this.f6159a);
    }
}
