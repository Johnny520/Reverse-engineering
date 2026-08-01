package p092S0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1273k extends AbstractC1275m {

    /* JADX INFO: renamed from: a */
    public final String f4576a;

    /* JADX INFO: renamed from: b */
    public final C1258K f4577b;

    public C1273k(String str, C1258K c1258k) {
        this.f4576a = str;
        this.f4577b = c1258k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1273k)) {
            return false;
        }
        C1273k c1273k = (C1273k) obj;
        return AbstractC1665j.m2981a(this.f4576a, c1273k.f4576a) && AbstractC1665j.m2981a(this.f4577b, c1273k.f4577b);
    }

    public final int hashCode() {
        int iHashCode = this.f4576a.hashCode() * 31;
        C1258K c1258k = this.f4577b;
        return (iHashCode + (c1258k != null ? c1258k.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0231b.m402m(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f4576a, ')');
    }
}
