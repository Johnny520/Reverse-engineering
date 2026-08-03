package p041d1;

/* JADX INFO: renamed from: d1.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0660f {

    /* JADX INFO: renamed from: a */
    public final int f2040a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m1836a(int i9) {
        return i9 == 1 ? "Next" : i9 == 2 ? "Previous" : i9 == 3 ? "Left" : i9 == 4 ? "Right" : i9 == 5 ? "Up" : i9 == 6 ? "Down" : i9 == 7 ? "Enter" : i9 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0660f) {
            return this.f2040a == ((C0660f) obj).f2040a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f2040a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m1836a(this.f2040a);
    }
}
