package p136j8;

/* JADX INFO: renamed from: j8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2092c {

    /* JADX INFO: renamed from: a */
    public final String f6995a;

    /* JADX INFO: renamed from: b */
    public final int f6996b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2092c(String str, int i9) {
        this.f6995a = str;
        this.f6996b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2092c)) {
            return false;
        }
        C2092c c2092c = (C2092c) obj;
        return this.f6995a.equals(c2092c.f6995a) && this.f6996b == c2092c.f6996b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f6996b) + (this.f6995a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "VoiceSource(path=" + this.f6995a + ", durationMillis=" + this.f6996b + ")";
    }
}
