package p080fb;

import java.util.List;

/* JADX INFO: renamed from: fb.b2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1106b2 {

    /* JADX INFO: renamed from: a */
    public final List f3582a;

    /* JADX INFO: renamed from: b */
    public final long f3583b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1106b2(List list, long j3) {
        this.f3582a = list;
        this.f3583b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1106b2)) {
            return false;
        }
        C1106b2 c1106b2 = (C1106b2) obj;
        return this.f3582a.equals(c1106b2.f3582a) && this.f3583b == c1106b2.f3583b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f3583b) + (this.f3582a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedAddresses(addresses=" + this.f3582a + ", expiresAt=" + this.f3583b + ")";
    }
}
