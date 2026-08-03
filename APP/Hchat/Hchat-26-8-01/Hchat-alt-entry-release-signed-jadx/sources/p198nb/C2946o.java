package p198nb;

/* JADX INFO: renamed from: nb.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2946o extends AbstractC2943l {

    /* JADX INFO: renamed from: a */
    public final String f9661a;

    /* JADX INFO: renamed from: b */
    public final int f9662b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2946o(String str, int i9) {
        this.f9661a = str;
        this.f9662b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2946o)) {
            return false;
        }
        C2946o c2946o = (C2946o) obj;
        return this.f9661a.equals(c2946o.f9661a) && this.f9662b == c2946o.f9662b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f9662b) + (this.f9661a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "VoiceSpeech(path=" + this.f9661a + ", durationMillis=" + this.f9662b + ")";
    }
}
