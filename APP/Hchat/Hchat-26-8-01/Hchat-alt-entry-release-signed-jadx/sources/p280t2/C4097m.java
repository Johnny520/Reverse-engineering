package p280t2;

/* JADX INFO: renamed from: t2.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4097m {

    /* JADX INFO: renamed from: a */
    public final int f13562a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m8275a(int i9) {
        return i9 == 1 ? "Ltr" : i9 == 2 ? "Rtl" : i9 == 3 ? "Content" : i9 == 4 ? "ContentOrLtr" : i9 == 5 ? "ContentOrRtl" : i9 == 0 ? "Unspecified" : "Invalid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4097m) {
            return this.f13562a == ((C4097m) obj).f13562a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f13562a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8275a(this.f13562a);
    }
}
