package p153e1;

import com.bumptech.glide.AbstractC1926h;

/* JADX INFO: renamed from: e1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2019o {

    /* JADX INFO: renamed from: b */
    public static final C2020p[] f6746b = {new C2020p(0), new C2020p(4294967296L), new C2020p(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f6747c = AbstractC1926h.m3582y(Float.NaN, 0);

    /* JADX INFO: renamed from: a */
    public final long f6748a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Q.c.h(java.lang.Object):java.lang.Object, S0.y.g(java.lang.Object, java.lang.Object):java.lang.Object] */
    public /* synthetic */ C2019o(long j5) {
        this.f6748a = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m3708a(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m3709b(long j5) {
        return f6746b[(int) ((j5 & 1095216660480L) >>> 32)].f6749a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m3710c(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m3711d(long j5) {
        long jM3709b = m3709b(j5);
        if (C2020p.m3712a(jM3709b, 0L)) {
            return "Unspecified";
        }
        if (C2020p.m3712a(jM3709b, 4294967296L)) {
            return m3710c(j5) + ".sp";
        }
        if (!C2020p.m3712a(jM3709b, 8589934592L)) {
            return "Invalid";
        }
        return m3710c(j5) + ".em";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2019o) {
            return this.f6748a == ((C2019o) obj).f6748a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f6748a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m3711d(this.f6748a);
    }
}
