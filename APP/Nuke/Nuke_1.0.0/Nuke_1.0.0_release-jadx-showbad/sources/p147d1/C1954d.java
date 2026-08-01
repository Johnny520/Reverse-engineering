package p147d1;

/* JADX INFO: renamed from: d1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1954d {

    /* JADX INFO: renamed from: a */
    public final int f6623a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m3622a(int i5) {
        return i5 == 1 ? "Hyphens.None" : i5 == 2 ? "Hyphens.Auto" : i5 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1954d) {
            return this.f6623a == ((C1954d) obj).f6623a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f6623a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m3622a(this.f6623a);
    }
}
