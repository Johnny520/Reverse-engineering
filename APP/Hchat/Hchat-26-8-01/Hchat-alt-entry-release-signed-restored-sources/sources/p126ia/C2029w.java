package p126ia;

/* JADX INFO: renamed from: ia.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2029w {

    /* JADX INFO: renamed from: a */
    public final long f6858a;

    /* JADX INFO: renamed from: b */
    public final int f6859b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2029w(long j3, int i9) {
        this.f6858a = j3;
        this.f6859b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2029w)) {
            return false;
        }
        C2029w c2029w = (C2029w) obj;
        return this.f6858a == c2029w.f6858a && this.f6859b == c2029w.f6859b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f6859b) + (Long.hashCode(this.f6858a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Varint(value=" + this.f6858a + ", next=" + this.f6859b + ")";
    }
}
