package p338x0;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: x0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5579i {

    /* JADX INFO: renamed from: a */
    public final int f22705a;

    /* JADX INFO: renamed from: b */
    public final Integer f22706b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5579i(Integer num, int i9) {
        this.f22705a = i9;
        this.f22706b = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5579i)) {
            return false;
        }
        C5579i c5579i = (C5579i) obj;
        return this.f22705a == c5579i.f22705a && AbstractC1416l.m3825a(this.f22706b, c5579i.f22706b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f22705a) * 31;
        Integer num = this.f22706b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ObjectLocation(group=" + this.f22705a + ", dataOffset=" + this.f22706b + ')';
    }
}
