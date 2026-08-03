package p293u2;

/* JADX INFO: renamed from: u2.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4246p {

    /* JADX INFO: renamed from: a */
    public final long f13926a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m8542a(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4246p) {
            return this.f13926a == ((C4246p) obj).f13926a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13926a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j3 = this.f13926a;
        return m8542a(j3, 0L) ? "Unspecified" : m8542a(j3, 4294967296L) ? "Sp" : m8542a(j3, 8589934592L) ? "Em" : "Invalid";
    }
}
