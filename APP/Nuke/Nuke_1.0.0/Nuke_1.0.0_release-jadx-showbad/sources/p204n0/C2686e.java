package p204n0;

import p128a.AbstractC1785a;

/* JADX INFO: renamed from: n0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2686e {

    /* JADX INFO: renamed from: a */
    public final long f8570a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [S0.a.<init>(a1.d, int, int, long):void, a1.f.c(o0.q, long, float):void, c1.b.<init>(o0.K, float):void] */
    public /* synthetic */ C2686e(long j5) {
        this.f8570a = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m4661a(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final float m4662b(long j5) {
        return Math.min(Float.intBitsToFloat((int) ((j5 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j5 & 2147483647L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m4663c(long j5) {
        return (j5 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j5 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j5 & 4294967295L)) <= 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m4664d(long j5) {
        if (j5 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC1785a.m3258t(Float.intBitsToFloat((int) (j5 >> 32))) + ", " + AbstractC1785a.m3258t(Float.intBitsToFloat((int) (j5 & 4294967295L))) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2686e) {
            return this.f8570a == ((C2686e) obj).f8570a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f8570a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m4664d(this.f8570a);
    }
}
