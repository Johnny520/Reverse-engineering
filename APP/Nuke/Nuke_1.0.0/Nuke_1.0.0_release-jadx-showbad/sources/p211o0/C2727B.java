package p211o0;

/* JADX INFO: renamed from: o0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2727B {

    /* JADX INFO: renamed from: a */
    public final int f8671a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2727B) {
            return this.f8671a == ((C2727B) obj).f8671a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f8671a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i5 = this.f8671a;
        return i5 == 0 ? "Argb8888" : i5 == 1 ? "Alpha8" : i5 == 2 ? "Rgb565" : i5 == 3 ? "F16" : i5 == 4 ? "Gpu" : "Unknown";
    }
}
