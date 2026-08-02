package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ky2 {

    /* JADX INFO: renamed from: a */
    public final int f5851a;

    /* JADX INFO: renamed from: a */
    public static String m2761a(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ky2) {
            return this.f5851a == ((ky2) obj).f5851a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5851a);
    }

    public final String toString() {
        return m2761a(this.f5851a);
    }
}
