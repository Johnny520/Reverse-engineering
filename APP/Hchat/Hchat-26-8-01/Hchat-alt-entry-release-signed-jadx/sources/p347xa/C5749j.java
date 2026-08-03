package p347xa;

/* JADX INFO: renamed from: xa.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5749j {

    /* JADX INFO: renamed from: a */
    public final boolean f23409a;

    /* JADX INFO: renamed from: b */
    public final String f23410b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5749j(boolean z9, String str) {
        this.f23409a = z9;
        this.f23410b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5749j)) {
            return false;
        }
        C5749j c5749j = (C5749j) obj;
        return this.f23409a == c5749j.f23409a && this.f23410b.equals(c5749j.f23410b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23410b.hashCode() + (Boolean.hashCode(this.f23409a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "UpdateResult(success=" + this.f23409a + ", message=" + this.f23410b + ")";
    }
}
