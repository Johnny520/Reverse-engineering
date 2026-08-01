package p092S0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1274l extends AbstractC1275m {

    /* JADX INFO: renamed from: a */
    public final String f4578a;

    /* JADX INFO: renamed from: b */
    public final C1258K f4579b;

    public C1274l(String str, C1258K c1258k) {
        this.f4578a = str;
        this.f4579b = c1258k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1274l)) {
            return false;
        }
        C1274l c1274l = (C1274l) obj;
        return AbstractC1665j.m2981a(this.f4578a, c1274l.f4578a) && AbstractC1665j.m2981a(this.f4579b, c1274l.f4579b);
    }

    public final int hashCode() {
        int iHashCode = this.f4578a.hashCode() * 31;
        C1258K c1258k = this.f4579b;
        return (iHashCode + (c1258k != null ? c1258k.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0231b.m402m(new StringBuilder("LinkAnnotation.Url(url="), this.f4578a, ')');
    }
}
