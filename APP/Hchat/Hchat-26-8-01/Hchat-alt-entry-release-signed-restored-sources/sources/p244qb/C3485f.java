package p244qb;

import java.util.List;

/* JADX INFO: renamed from: qb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3485f {

    /* JADX INFO: renamed from: a */
    public final List f11313a;

    /* JADX INFO: renamed from: b */
    public final long f11314b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3485f(List list, long j3) {
        this.f11313a = list;
        this.f11314b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3485f)) {
            return false;
        }
        C3485f c3485f = (C3485f) obj;
        return this.f11313a.equals(c3485f.f11313a) && this.f11314b == c3485f.f11314b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f11314b) + (this.f11313a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedContacts(contacts=" + this.f11313a + ", cachedAt=" + this.f11314b + ")";
    }
}
