package p080fb;

/* JADX INFO: renamed from: fb.r1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1169r1 {

    /* JADX INFO: renamed from: a */
    public final String f3902a;

    /* JADX INFO: renamed from: b */
    public final boolean f3903b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1169r1(String str, boolean z9) {
        this.f3902a = str;
        this.f3903b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1169r1)) {
            return false;
        }
        C1169r1 c1169r1 = (C1169r1) obj;
        return this.f3902a.equals(c1169r1.f3902a) && this.f3903b == c1169r1.f3903b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3903b) + (this.f3902a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ResultPrefix(content=" + this.f3902a + ", truncated=" + this.f3903b + ")";
    }
}
