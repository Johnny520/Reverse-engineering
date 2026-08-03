package p280t2;

/* JADX INFO: renamed from: t2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4088d {

    /* JADX INFO: renamed from: a */
    public final int f13541a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m8270a(int i9) {
        return i9 == 1 ? "Hyphens.None" : i9 == 2 ? "Hyphens.Auto" : i9 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4088d) {
            return this.f13541a == ((C4088d) obj).f13541a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f13541a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8270a(this.f13541a);
    }
}
