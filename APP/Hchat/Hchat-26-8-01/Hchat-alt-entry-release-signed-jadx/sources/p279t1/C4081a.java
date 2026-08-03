package p279t1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: t1.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4081a {

    /* JADX INFO: renamed from: a */
    public long f13521a;

    /* JADX INFO: renamed from: b */
    public float f13522b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4081a)) {
            return false;
        }
        C4081a c4081a = (C4081a) obj;
        return this.f13521a == c4081a.f13521a && Float.compare(this.f13522b, c4081a.f13522b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13522b) + (Long.hashCode(this.f13521a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f13521a);
        sb2.append(", dataPoint=");
        return AbstractC0921a.m2252o(sb2, this.f13522b, ')');
    }
}
