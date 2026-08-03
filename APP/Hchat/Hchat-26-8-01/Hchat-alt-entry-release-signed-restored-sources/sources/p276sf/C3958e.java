package p276sf;

import gg.AbstractC1416l;
import java.io.Serializable;

/* JADX INFO: renamed from: sf.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3958e implements Serializable {

    /* JADX INFO: renamed from: g */
    public final Object f12961g;

    /* JADX INFO: renamed from: h */
    public final Object f12962h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3958e(Object obj, Object obj2) {
        this.f12961g = obj;
        this.f12962h = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m8179a() {
        return this.f12961g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m8180b() {
        return this.f12962h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3958e)) {
            return false;
        }
        C3958e c3958e = (C3958e) obj;
        return AbstractC1416l.m3825a(this.f12961g, c3958e.f12961g) && AbstractC1416l.m3825a(this.f12962h, c3958e.f12962h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f12961g;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f12962h;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f12961g + ", " + this.f12962h + ')';
    }
}
