package p086r0;

import java.util.List;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0821A0 {

    /* JADX INFO: renamed from: a */
    public final List f2738a;

    /* JADX INFO: renamed from: b */
    public final Object f2739b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0821A0(Object obj, List list) {
        AbstractC0223g.m418e(list, "list");
        AbstractC0223g.m418e(obj, "owner");
        this.f2738a = list;
        this.f2739b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0821A0)) {
            return false;
        }
        C0821A0 c0821a0 = (C0821A0) obj;
        return AbstractC0223g.m414a(this.f2738a, c0821a0.f2738a) && AbstractC0223g.m414a(this.f2739b, c0821a0.f2739b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2739b.hashCode() + (this.f2738a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Legacy6566ConversationDataList(list=" + this.f2738a + ", owner=" + this.f2739b + ")";
    }
}
