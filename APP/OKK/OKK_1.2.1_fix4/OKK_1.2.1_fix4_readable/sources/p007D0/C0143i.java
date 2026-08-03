package p007D0;

import java.io.Serializable;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: D0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0143i implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f334a;

    /* JADX INFO: renamed from: b */
    public final Object f335b;

    /* JADX INFO: renamed from: c */
    public final Object f336c;

    public C0143i(Object obj, Object obj2, Object obj3) {
        this.f334a = obj;
        this.f335b = obj2;
        this.f336c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0143i)) {
            return false;
        }
        C0143i c0143i = (C0143i) obj;
        return AbstractC0307g.m699a(this.f334a, c0143i.f334a) && AbstractC0307g.m699a(this.f335b, c0143i.f335b) && AbstractC0307g.m699a(this.f336c, c0143i.f336c);
    }

    public final int hashCode() {
        Object obj = this.f334a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f335b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f336c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f334a + ", " + this.f335b + ", " + this.f336c + ')';
    }
}
