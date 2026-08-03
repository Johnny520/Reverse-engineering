package p293u2;

/* JADX INFO: renamed from: u2.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4238h {

    /* JADX INFO: renamed from: a */
    public final long f13911a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final float m8523a(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final float m8524b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4238h) {
            return this.f13911a == ((C4238h) obj).f13911a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13911a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j3 = this.f13911a;
        if (j3 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C4236f.m8521c(m8524b(j3))) + " x " + ((Object) C4236f.m8521c(m8523a(j3)));
    }
}
