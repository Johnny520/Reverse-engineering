package p007D0;

import java.io.Serializable;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: D0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0139e implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f328a;

    /* JADX INFO: renamed from: b */
    public final Object f329b;

    public C0139e(Object obj, Object obj2) {
        this.f328a = obj;
        this.f329b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0139e)) {
            return false;
        }
        C0139e c0139e = (C0139e) obj;
        return AbstractC0307g.m699a(this.f328a, c0139e.f328a) && AbstractC0307g.m699a(this.f329b, c0139e.f329b);
    }

    public final int hashCode() {
        Object obj = this.f328a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f329b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f328a + ", " + this.f329b + ')';
    }
}
