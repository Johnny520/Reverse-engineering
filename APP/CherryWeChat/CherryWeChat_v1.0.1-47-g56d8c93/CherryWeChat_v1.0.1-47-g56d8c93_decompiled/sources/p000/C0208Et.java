package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: Et */
/* JADX INFO: loaded from: classes.dex */
public final class C0208Et implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f613a;

    /* JADX INFO: renamed from: b */
    public final Object f614b;

    public C0208Et(Object obj, Object obj2) {
        this.f613a = obj;
        this.f614b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0208Et)) {
            return false;
        }
        C0208Et c0208Et = (C0208Et) obj;
        return AbstractC0585Nj.m1134a(this.f613a, c0208Et.f613a) && AbstractC0585Nj.m1134a(this.f614b, c0208Et.f614b);
    }

    public final int hashCode() {
        Object obj = this.f613a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f614b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f613a + ", " + this.f614b + ')';
    }
}
