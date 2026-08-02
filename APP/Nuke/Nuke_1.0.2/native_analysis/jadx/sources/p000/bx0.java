package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 {

    /* JADX INFO: renamed from: a */
    public final int f1063a;

    /* JADX INFO: renamed from: a */
    public static String m598a(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bx0) {
            return this.f1063a == ((bx0) obj).f1063a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1063a);
    }

    public final String toString() {
        return m598a(this.f1063a);
    }
}
