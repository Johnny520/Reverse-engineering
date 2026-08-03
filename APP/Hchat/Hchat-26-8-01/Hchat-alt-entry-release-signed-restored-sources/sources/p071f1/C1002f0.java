package p071f1;

/* JADX INFO: renamed from: f1.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1002f0 {

    /* JADX INFO: renamed from: a */
    public final int f3178a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1002f0) {
            return this.f3178a == ((C1002f0) obj).f3178a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f3178a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f3178a;
        return i9 == 0 ? "Argb8888" : i9 == 1 ? "Alpha8" : i9 == 2 ? "Rgb565" : i9 == 3 ? "F16" : i9 == 4 ? "Gpu" : "Unknown";
    }
}
