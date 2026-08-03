package p119i2;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: i2.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1934k extends AbstractC1938m {

    /* JADX INFO: renamed from: a */
    public final String f6559a;

    /* JADX INFO: renamed from: b */
    public final C1937l0 f6560b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1934k(String str, C1937l0 c1937l0) {
        this.f6559a = str;
        this.f6560b = c1937l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p119i2.AbstractC1938m
    /* JADX INFO: renamed from: a */
    public final C1937l0 mo4800a() {
        return this.f6560b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1934k)) {
            return false;
        }
        C1934k c1934k = (C1934k) obj;
        return this.f6559a.equals(c1934k.f6559a) && AbstractC1416l.m3825a(this.f6560b, c1934k.f6560b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f6559a.hashCode() * 31;
        C1937l0 c1937l0 = this.f6560b;
        return (iHashCode + (c1937l0 != null ? c1937l0.hashCode() : 0)) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2254q(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f6559a, ')');
    }
}
