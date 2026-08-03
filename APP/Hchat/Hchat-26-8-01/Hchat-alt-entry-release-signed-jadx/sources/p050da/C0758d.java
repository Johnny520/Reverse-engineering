package p050da;

/* JADX INFO: renamed from: da.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0758d {

    /* JADX INFO: renamed from: a */
    public final String f2265a;

    /* JADX INFO: renamed from: b */
    public final int f2266b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0758d(String str, int i9) {
        this.f2265a = str;
        this.f2266b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0758d)) {
            return false;
        }
        C0758d c0758d = (C0758d) obj;
        return this.f2265a.equals(c0758d.f2265a) && this.f2266b == c0758d.f2266b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f2266b) + (this.f2265a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextCandidate(text=" + this.f2265a + ", priority=" + this.f2266b + ")";
    }
}
