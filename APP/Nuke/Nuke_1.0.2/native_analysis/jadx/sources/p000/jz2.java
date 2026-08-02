package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jz2 {

    /* JADX INFO: renamed from: a */
    public final int f5289a;

    /* JADX INFO: renamed from: a */
    public static String m2597a(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jz2) {
            return this.f5289a == ((jz2) obj).f5289a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5289a);
    }

    public final String toString() {
        return m2597a(this.f5289a);
    }
}
