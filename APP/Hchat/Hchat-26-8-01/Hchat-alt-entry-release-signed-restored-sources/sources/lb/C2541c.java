package lb;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: lb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2541c {

    /* JADX INFO: renamed from: a */
    public final String f8224a;

    /* JADX INFO: renamed from: b */
    public final long f8225b;

    /* JADX INFO: renamed from: c */
    public final Object f8226c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2541c(long j3, String str, Object obj) {
        this.f8224a = str;
        this.f8225b = j3;
        this.f8226c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2541c)) {
            return false;
        }
        C2541c c2541c = (C2541c) obj;
        return this.f8224a.equals(c2541c.f8224a) && this.f8225b == c2541c.f8225b && this.f8226c.equals(c2541c.f8226c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8226c.hashCode() + AbstractC0921a.m2243f(this.f8224a.hashCode() * 31, 31, this.f8225b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2259v = AbstractC0921a.m2259v("QuoteTarget(talker=", this.f8224a, ", msgId=", this.f8225b);
        sbM2259v.append(", nativeMessage=");
        sbM2259v.append(this.f8226c);
        sbM2259v.append(")");
        return sbM2259v.toString();
    }
}
