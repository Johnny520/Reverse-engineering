package p147d1;

/* JADX INFO: renamed from: d1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1961k {

    /* JADX INFO: renamed from: a */
    public final int f6639a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m3626a(int i5) {
        return i5 == 1 ? "Left" : i5 == 2 ? "Right" : i5 == 3 ? "Center" : i5 == 4 ? "Justify" : i5 == 5 ? "Start" : i5 == 6 ? "End" : i5 == 0 ? "Unspecified" : "Invalid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1961k) {
            return this.f6639a == ((C1961k) obj).f6639a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f6639a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m3626a(this.f6639a);
    }
}
