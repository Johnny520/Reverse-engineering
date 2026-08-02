package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ix0 {

    /* JADX INFO: renamed from: a */
    public final int f4826a;

    public final boolean equals(Object obj) {
        if (obj instanceof ix0) {
            return this.f4826a == ((ix0) obj).f4826a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4826a);
    }

    public final String toString() {
        int i = this.f4826a;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : "Unknown";
    }
}
