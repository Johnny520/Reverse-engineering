package p280t2;

/* JADX INFO: renamed from: t2.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4095k {

    /* JADX INFO: renamed from: a */
    public final int f13557a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m8274a(int i9) {
        return i9 == 1 ? "Left" : i9 == 2 ? "Right" : i9 == 3 ? "Center" : i9 == 4 ? "Justify" : i9 == 5 ? "Start" : i9 == 6 ? "End" : i9 == 0 ? "Unspecified" : "Invalid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4095k) {
            return this.f13557a == ((C4095k) obj).f13557a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f13557a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8274a(this.f13557a);
    }
}
