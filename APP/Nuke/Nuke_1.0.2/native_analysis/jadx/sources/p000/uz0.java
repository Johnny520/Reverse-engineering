package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uz0 {

    /* JADX INFO: renamed from: a */
    public final int f11566a;

    public final boolean equals(Object obj) {
        if (obj instanceof uz0) {
            return this.f11566a == ((uz0) obj).f11566a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11566a);
    }

    public final String toString() {
        int i = this.f11566a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
