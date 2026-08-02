package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gm0 {

    /* JADX INFO: renamed from: a */
    public final int f3581a;

    public final boolean equals(Object obj) {
        if (obj instanceof gm0) {
            return this.f3581a == ((gm0) obj).f3581a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3581a);
    }

    public final String toString() {
        int i = this.f3581a;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
