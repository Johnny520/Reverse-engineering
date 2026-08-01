package p007B0;

/* JADX INFO: renamed from: B0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0196j {

    /* JADX INFO: renamed from: a */
    public final long f678a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0196j) {
            return this.f678a == ((C0196j) obj).f678a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f678a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f678a + ')';
    }
}
