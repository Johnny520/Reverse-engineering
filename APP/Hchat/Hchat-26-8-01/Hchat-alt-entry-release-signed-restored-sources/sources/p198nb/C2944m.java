package p198nb;

/* JADX INFO: renamed from: nb.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2944m {

    /* JADX INFO: renamed from: a */
    public final String f9657a;

    /* JADX INFO: renamed from: b */
    public final int f9658b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2944m(String str, int i9) {
        this.f9657a = str;
        this.f9658b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2944m)) {
            return false;
        }
        C2944m c2944m = (C2944m) obj;
        return this.f9657a.equals(c2944m.f9657a) && this.f9658b == c2944m.f9658b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f9658b) + (this.f9657a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ResolvedVoice(path=" + this.f9657a + ", durationMillis=" + this.f9658b + ")";
    }
}
