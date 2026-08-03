package p117i0;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: i0.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1868p0 {

    /* JADX INFO: renamed from: a */
    public final Integer f6196a;

    /* JADX INFO: renamed from: b */
    public final Object f6197b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1868p0(Integer num, Object obj) {
        this.f6196a = num;
        this.f6197b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868p0)) {
            return false;
        }
        C1868p0 c1868p0 = (C1868p0) obj;
        return this.f6196a.equals(c1868p0.f6196a) && AbstractC1416l.m3825a(this.f6197b, c1868p0.f6197b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f6196a.hashCode() * 31;
        Object obj = this.f6197b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "JoinedKey(left=" + this.f6196a + ", right=" + this.f6197b + ')';
    }
}
