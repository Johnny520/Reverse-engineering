package p056K2;

import java.io.Serializable;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: K2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0882h implements Serializable {

    /* JADX INFO: renamed from: d */
    public final Object f2769d;

    /* JADX INFO: renamed from: e */
    public final Object f2770e;

    public C0882h(Object obj, Object obj2) {
        this.f2769d = obj;
        this.f2770e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0882h)) {
            return false;
        }
        C0882h c0882h = (C0882h) obj;
        return AbstractC1665j.m2981a(this.f2769d, c0882h.f2769d) && AbstractC1665j.m2981a(this.f2770e, c0882h.f2770e);
    }

    public final int hashCode() {
        Object obj = this.f2769d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2770e;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2769d + ", " + this.f2770e + ')';
    }
}
