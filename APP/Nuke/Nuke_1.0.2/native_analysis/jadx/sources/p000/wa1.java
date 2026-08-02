package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wa1 {

    /* JADX INFO: renamed from: a */
    public final int f12443a;

    public final boolean equals(Object obj) {
        if (obj instanceof wa1) {
            return this.f12443a == ((wa1) obj).f12443a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12443a);
    }

    public final String toString() {
        int i = this.f12443a;
        return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
