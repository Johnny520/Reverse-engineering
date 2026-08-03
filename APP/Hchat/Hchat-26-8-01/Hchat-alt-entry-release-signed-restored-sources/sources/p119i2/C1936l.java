package p119i2;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: i2.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1936l extends AbstractC1938m {

    /* JADX INFO: renamed from: a */
    public final String f6567a;

    /* JADX INFO: renamed from: b */
    public final C1937l0 f6568b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1936l(String str, C1937l0 c1937l0) {
        this.f6567a = str;
        this.f6568b = c1937l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p119i2.AbstractC1938m
    /* JADX INFO: renamed from: a */
    public final C1937l0 mo4800a() {
        return this.f6568b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1936l)) {
            return false;
        }
        C1936l c1936l = (C1936l) obj;
        return this.f6567a.equals(c1936l.f6567a) && AbstractC1416l.m3825a(this.f6568b, c1936l.f6568b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f6567a.hashCode() * 31;
        C1937l0 c1937l0 = this.f6568b;
        return (iHashCode + (c1937l0 != null ? c1937l0.hashCode() : 0)) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2254q(new StringBuilder("LinkAnnotation.Url(url="), this.f6567a, ')');
    }
}
