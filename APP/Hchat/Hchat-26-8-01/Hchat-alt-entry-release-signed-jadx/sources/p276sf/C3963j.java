package p276sf;

import gg.AbstractC1416l;
import java.io.Serializable;

/* JADX INFO: renamed from: sf.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3963j implements Serializable {

    /* JADX INFO: renamed from: g */
    public final Object f12971g;

    /* JADX INFO: renamed from: h */
    public final Object f12972h;

    /* JADX INFO: renamed from: i */
    public final Object f12973i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3963j(Object obj, Object obj2, Object obj3) {
        this.f12971g = obj;
        this.f12972h = obj2;
        this.f12973i = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3963j)) {
            return false;
        }
        C3963j c3963j = (C3963j) obj;
        return AbstractC1416l.m3825a(this.f12971g, c3963j.f12971g) && AbstractC1416l.m3825a(this.f12972h, c3963j.f12972h) && AbstractC1416l.m3825a(this.f12973i, c3963j.f12973i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f12971g;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f12972h;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f12973i;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f12971g + ", " + this.f12972h + ", " + this.f12973i + ')';
    }
}
