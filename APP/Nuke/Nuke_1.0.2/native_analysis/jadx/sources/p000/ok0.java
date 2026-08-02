package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ok0 {

    /* JADX INFO: renamed from: a */
    public final int f7701a;

    /* JADX INFO: renamed from: a */
    public static String m3572a(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ok0) {
            return this.f7701a == ((ok0) obj).f7701a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7701a);
    }

    public final String toString() {
        return m3572a(this.f7701a);
    }
}
