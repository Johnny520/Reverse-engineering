package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l51 {

    /* JADX INFO: renamed from: a */
    public final int f5938a;

    /* JADX INFO: renamed from: a */
    public static String m2840a(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l51) {
            return this.f5938a == ((l51) obj).f5938a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5938a);
    }

    public final String toString() {
        return m2840a(this.f5938a);
    }
}
