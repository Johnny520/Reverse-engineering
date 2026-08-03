package p080fb;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.q2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1166q2 {

    /* JADX INFO: renamed from: a */
    public final boolean f3893a;

    /* JADX INFO: renamed from: b */
    public final long f3894b;

    /* JADX INFO: renamed from: c */
    public final String f3895c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1166q2(boolean z9, long j3, String str) {
        this.f3893a = z9;
        this.f3894b = j3;
        this.f3895c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1166q2)) {
            return false;
        }
        C1166q2 c1166q2 = (C1166q2) obj;
        return this.f3893a == c1166q2.f3893a && this.f3894b == c1166q2.f3894b && this.f3895c.equals(c1166q2.f3895c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3895c.hashCode() + AbstractC0921a.m2243f(Boolean.hashCode(this.f3893a) * 31, 31, this.f3894b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TreeEntry(directory=" + this.f3893a + ", size=" + this.f3894b + ", digest=" + this.f3895c + ")";
    }
}
