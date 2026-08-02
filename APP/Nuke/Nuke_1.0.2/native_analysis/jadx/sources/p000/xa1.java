package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xa1 {

    /* JADX INFO: renamed from: a */
    public final int f12929a;

    public final boolean equals(Object obj) {
        if (obj instanceof xa1) {
            return this.f12929a == ((xa1) obj).f12929a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12929a);
    }

    public final String toString() {
        int i = this.f12929a;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
