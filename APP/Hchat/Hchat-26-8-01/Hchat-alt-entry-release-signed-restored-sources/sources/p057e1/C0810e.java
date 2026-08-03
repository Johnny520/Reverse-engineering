package p057e1;

import p007a7.AbstractC0018a;

/* JADX INFO: renamed from: e1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0810e {

    /* JADX INFO: renamed from: a */
    public final long f2428a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [i2.a.<init>(q2.d, int, int, long):void, q2.f.c(f1.s, long, float):void, s2.b.<init>(f1.p0, float):void] */
    public /* synthetic */ C0810e(long j3) {
        this.f2428a = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m2054a(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final float m2055b(long j3) {
        return Math.min(Float.intBitsToFloat((int) ((j3 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j3 & 2147483647L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m2056c(long j3) {
        return (j3 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j3 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j3 & 4294967295L)) <= 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2057d(long j3) {
        if (j3 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC0018a.m234V(Float.intBitsToFloat((int) (j3 >> 32))) + ", " + AbstractC0018a.m234V(Float.intBitsToFloat((int) (j3 & 4294967295L))) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0810e) {
            return this.f2428a == ((C0810e) obj).f2428a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f2428a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m2057d(this.f2428a);
    }
}
