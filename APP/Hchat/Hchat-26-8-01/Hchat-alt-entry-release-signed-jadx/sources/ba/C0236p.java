package ba;

import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: ba.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0236p {

    /* JADX INFO: renamed from: a */
    public final long f623a;

    /* JADX INFO: renamed from: b */
    public final long f624b;

    /* JADX INFO: renamed from: c */
    public final C0235o f625c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0236p(long j3, long j4, C0235o c0235o) {
        this.f623a = j3;
        this.f624b = j4;
        this.f625c = c0235o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0236p)) {
            return false;
        }
        C0236p c0236p = (C0236p) obj;
        return this.f623a == c0236p.f623a && this.f624b == c0236p.f624b && this.f625c.equals(c0236p.f625c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f625c.hashCode() + AbstractC0921a.m2243f(Long.hashCode(this.f623a) * 31, 31, this.f624b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM6842o = AbstractC3199a.m6842o(this.f623a, "CacheEntry(modified=", ", size=");
        sbM6842o.append(this.f624b);
        sbM6842o.append(", asset=");
        sbM6842o.append(this.f625c);
        sbM6842o.append(")");
        return sbM6842o.toString();
    }
}
