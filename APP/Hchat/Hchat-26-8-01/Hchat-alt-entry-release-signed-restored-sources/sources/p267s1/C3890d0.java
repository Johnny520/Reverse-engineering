package p267s1;

/* JADX INFO: renamed from: s1.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3890d0 {

    /* JADX INFO: renamed from: a */
    public final int f12762a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m8079a(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3890d0) {
            return this.f12762a == ((C3890d0) obj).f12762a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f12762a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8079a(this.f12762a);
    }
}
