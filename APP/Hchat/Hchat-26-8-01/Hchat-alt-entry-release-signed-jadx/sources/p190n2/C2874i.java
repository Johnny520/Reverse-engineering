package p190n2;

/* JADX INFO: renamed from: n2.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2874i {

    /* JADX INFO: renamed from: a */
    public final int f9291a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m6285a(int i9) {
        return i9 == -1 ? "Unspecified" : i9 == 0 ? "None" : i9 == 1 ? "Default" : i9 == 2 ? "Go" : i9 == 3 ? "Search" : i9 == 4 ? "Send" : i9 == 5 ? "Previous" : i9 == 6 ? "Next" : i9 == 7 ? "Done" : "Invalid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2874i) {
            return this.f9291a == ((C2874i) obj).f9291a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f9291a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m6285a(this.f9291a);
    }
}
