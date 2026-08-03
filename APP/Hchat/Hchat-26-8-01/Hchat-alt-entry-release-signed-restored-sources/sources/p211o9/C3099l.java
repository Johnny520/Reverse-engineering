package p211o9;

/* JADX INFO: renamed from: o9.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3099l {

    /* JADX INFO: renamed from: a */
    public final int f10007a;

    /* JADX INFO: renamed from: b */
    public final long f10008b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3099l(int i9, long j3) {
        this.f10007a = i9;
        this.f10008b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3099l)) {
            return false;
        }
        C3099l c3099l = (C3099l) obj;
        return this.f10007a == c3099l.f10007a && this.f10008b == c3099l.f10008b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f10008b) + (Integer.hashCode(this.f10007a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PendingInviteDetail(count=" + this.f10007a + ", updatedAt=" + this.f10008b + ")";
    }
}
