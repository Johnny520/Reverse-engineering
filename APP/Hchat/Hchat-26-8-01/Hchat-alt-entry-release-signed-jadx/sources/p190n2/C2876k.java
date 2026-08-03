package p190n2;

/* JADX INFO: renamed from: n2.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2876k {

    /* JADX INFO: renamed from: a */
    public final int f9299a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m6286a(int i9) {
        return i9 == 0 ? "Unspecified" : i9 == 1 ? "Text" : i9 == 2 ? "Ascii" : i9 == 3 ? "Number" : i9 == 4 ? "Phone" : i9 == 5 ? "Uri" : i9 == 6 ? "Email" : i9 == 7 ? "Password" : i9 == 8 ? "NumberPassword" : i9 == 9 ? "Decimal" : "Invalid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2876k) {
            return this.f9299a == ((C2876k) obj).f9299a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f9299a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m6286a(this.f9299a);
    }
}
