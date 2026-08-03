package p286t8;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: t8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4136a {

    /* JADX INFO: renamed from: a */
    public final String f13630a;

    /* JADX INFO: renamed from: b */
    public final long f13631b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4136a(String str, long j3) {
        this.f13630a = str;
        this.f13631b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4136a)) {
            return false;
        }
        C4136a c4136a = (C4136a) obj;
        return this.f13630a.equals(c4136a.f13630a) && this.f13631b == c4136a.f13631b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13631b) + (this.f13630a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2259v = AbstractC0921a.m2259v("PendingKey(talker=", this.f13630a, ", msgSvrId=", this.f13631b);
        sbM2259v.append(")");
        return sbM2259v.toString();
    }
}
