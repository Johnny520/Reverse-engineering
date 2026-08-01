package p009E0;

import java.io.Serializable;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: E0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0103c implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f394a;

    /* JADX INFO: renamed from: b */
    public final Object f395b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0103c(Object obj, Object obj2) {
        this.f394a = obj;
        this.f395b = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0103c)) {
            return false;
        }
        C0103c c0103c = (C0103c) obj;
        return AbstractC0223g.m414a(this.f394a, c0103c.f394a) && AbstractC0223g.m414a(this.f395b, c0103c.f395b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f394a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f395b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f394a + ", " + this.f395b + ')';
    }
}
