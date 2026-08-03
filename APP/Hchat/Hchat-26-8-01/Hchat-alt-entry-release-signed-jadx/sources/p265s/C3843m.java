package p265s;

import p201o.AbstractC3026b;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: s.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3843m {

    /* JADX INFO: renamed from: a */
    public final int f12576a;

    /* JADX INFO: renamed from: b */
    public final int f12577b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3843m(int i9, int i10) {
        this.f12576a = i9;
        this.f12577b = i10;
        if (!(i9 >= 0)) {
            AbstractC3026b.m6428a("negative start index");
        }
        if (i10 >= i9) {
            return;
        }
        AbstractC3026b.m6428a("end index greater than start");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3843m)) {
            return false;
        }
        C3843m c3843m = (C3843m) obj;
        return this.f12576a == c3843m.f12576a && this.f12577b == c3843m.f12577b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f12577b) + (Integer.hashCode(this.f12576a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f12576a);
        sb2.append(", end=");
        return AbstractC3199a.m6841n(sb2, this.f12577b, ')');
    }
}
