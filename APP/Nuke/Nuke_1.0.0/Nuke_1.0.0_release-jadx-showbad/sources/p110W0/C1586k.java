package p110W0;

/* JADX INFO: renamed from: W0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1586k {

    /* JADX INFO: renamed from: a */
    public final int f5500a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1586k) {
            return this.f5500a == ((C1586k) obj).f5500a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f5500a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i5 = this.f5500a;
        return i5 == 0 ? "None" : i5 == 1 ? "Weight" : i5 == 2 ? "Style" : i5 == 65535 ? "All" : "Invalid";
    }
}
