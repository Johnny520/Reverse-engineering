package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hm0 {

    /* JADX INFO: renamed from: a */
    public final int f4076a;

    public final boolean equals(Object obj) {
        if (obj instanceof hm0) {
            return this.f4076a == ((hm0) obj).f4076a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4076a);
    }

    public final String toString() {
        int i = this.f4076a;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
