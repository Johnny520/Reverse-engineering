package p080fb;

/* JADX INFO: renamed from: fb.e2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1118e2 {

    /* JADX INFO: renamed from: a */
    public final String f3667a;

    /* JADX INFO: renamed from: b */
    public final boolean f3668b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1118e2(String str, boolean z9) {
        this.f3667a = str;
        this.f3668b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1118e2)) {
            return false;
        }
        C1118e2 c1118e2 = (C1118e2) obj;
        return this.f3667a.equals(c1118e2.f3667a) && this.f3668b == c1118e2.f3668b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3668b) + (this.f3667a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LimitedText(text=" + this.f3667a + ", truncated=" + this.f3668b + ")";
    }
}
