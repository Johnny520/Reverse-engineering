package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: kx */
/* JADX INFO: loaded from: classes.dex */
public final class C0427kx implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f2976a;

    /* JADX INFO: renamed from: b */
    public final Object f2977b;

    public C0427kx(Object obj, Object obj2) {
        this.f2976a = obj;
        this.f2977b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0427kx)) {
            return false;
        }
        C0427kx c0427kx = (C0427kx) obj;
        return AbstractC0346ip.m1497i(this.f2976a, c0427kx.f2976a) && AbstractC0346ip.m1497i(this.f2977b, c0427kx.f2977b);
    }

    public final int hashCode() {
        Object obj = this.f2976a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2977b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2976a + ", " + this.f2977b + ')';
    }
}
