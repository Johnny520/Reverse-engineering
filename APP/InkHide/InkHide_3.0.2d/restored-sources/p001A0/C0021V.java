package p001A0;

import java.util.List;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0021V {

    /* JADX INFO: renamed from: a */
    public final List f161a;

    /* JADX INFO: renamed from: b */
    public final List f162b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0021V(List list, List list2) {
        this.f161a = list;
        this.f162b = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0021V)) {
            return false;
        }
        C0021V c0021v = (C0021V) obj;
        return AbstractC0223g.m414a(this.f161a, c0021v.f161a) && AbstractC0223g.m414a(this.f162b, c0021v.f162b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f162b.hashCode() + (this.f161a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookPoint(searchViewClassNames=" + this.f161a + ", editTextFieldNames=" + this.f162b + ")";
    }
}
