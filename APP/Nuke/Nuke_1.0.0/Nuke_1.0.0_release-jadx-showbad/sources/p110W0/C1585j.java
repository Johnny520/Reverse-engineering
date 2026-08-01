package p110W0;

/* JADX INFO: renamed from: W0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1585j {

    /* JADX INFO: renamed from: a */
    public final int f5499a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1585j) {
            return this.f5499a == ((C1585j) obj).f5499a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f5499a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i5 = this.f5499a;
        return i5 == 0 ? "Normal" : i5 == 1 ? "Italic" : "Invalid";
    }
}
