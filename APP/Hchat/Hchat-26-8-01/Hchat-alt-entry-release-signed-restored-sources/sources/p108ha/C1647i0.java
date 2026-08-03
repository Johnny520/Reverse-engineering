package p108ha;

/* JADX INFO: renamed from: ha.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1647i0 {

    /* JADX INFO: renamed from: a */
    public final long f5408a;

    /* JADX INFO: renamed from: b */
    public final int f5409b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1647i0(long j3, int i9) {
        this.f5408a = j3;
        this.f5409b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1647i0)) {
            return false;
        }
        C1647i0 c1647i0 = (C1647i0) obj;
        return this.f5408a == c1647i0.f5408a && this.f5409b == c1647i0.f5409b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f5409b) + (Long.hashCode(this.f5408a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Varint(value=" + this.f5408a + ", next=" + this.f5409b + ")";
    }
}
