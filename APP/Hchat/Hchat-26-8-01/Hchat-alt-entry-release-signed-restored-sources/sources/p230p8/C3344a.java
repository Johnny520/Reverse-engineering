package p230p8;

import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: p8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3344a {

    /* JADX INFO: renamed from: a */
    public final long f10761a;

    /* JADX INFO: renamed from: b */
    public final long f10762b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3344a(long j3, long j4) {
        this.f10761a = j3;
        this.f10762b = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3344a)) {
            return false;
        }
        C3344a c3344a = (C3344a) obj;
        return this.f10761a == c3344a.f10761a && this.f10762b == c3344a.f10762b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f10762b) + (Long.hashCode(this.f10761a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2253p(AbstractC3199a.m6842o(this.f10761a, "VideoSpan(start=", ", end="), this.f10762b, ")");
    }
}
