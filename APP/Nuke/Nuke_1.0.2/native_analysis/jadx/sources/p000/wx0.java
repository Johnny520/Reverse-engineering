package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wx0 {

    /* JADX INFO: renamed from: a */
    public final int f12704a;

    /* JADX INFO: renamed from: a */
    public static String m6018a(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wx0) {
            return this.f12704a == ((wx0) obj).f12704a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12704a);
    }

    public final String toString() {
        return m6018a(this.f12704a);
    }
}
