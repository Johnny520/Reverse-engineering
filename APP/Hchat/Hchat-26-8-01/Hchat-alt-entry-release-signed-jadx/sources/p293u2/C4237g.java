package p293u2;

/* JADX INFO: renamed from: u2.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4237g {

    /* JADX INFO: renamed from: a */
    public final long f13910a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m8522a(long j3) {
        if (j3 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C4236f.m8521c(Float.intBitsToFloat((int) (j3 >> 32)))) + ", " + ((Object) C4236f.m8521c(Float.intBitsToFloat((int) (j3 & 4294967295L)))) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4237g) {
            return this.f13910a == ((C4237g) obj).f13910a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13910a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8522a(this.f13910a);
    }
}
