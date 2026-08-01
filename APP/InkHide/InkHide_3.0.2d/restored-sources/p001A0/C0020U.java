package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0020U {

    /* JADX INFO: renamed from: a */
    public final List f157a;

    /* JADX INFO: renamed from: b */
    public final List f158b;

    /* JADX INFO: renamed from: c */
    public final List f159c;

    /* JADX INFO: renamed from: d */
    public final List f160d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0020U(List list, List list2, List list3, List list4) {
        this.f157a = list;
        this.f158b = list2;
        this.f159c = list3;
        this.f160d = list4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0020U)) {
            return false;
        }
        C0020U c0020u = (C0020U) obj;
        return AbstractC0223g.m414a(this.f157a, c0020u.f157a) && AbstractC0223g.m414a(this.f158b, c0020u.f158b) && AbstractC0223g.m414a(this.f159c, c0020u.f159c) && AbstractC0223g.m414a(this.f160d, c0020u.f160d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f160d.hashCode() + AbstractC0174d.m349e(this.f159c, AbstractC0174d.m349e(this.f158b, this.f157a.hashCode() * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookPoint(activityClassNames=" + this.f157a + ", adapterClassNames=" + this.f158b + ", dataFieldNames=" + this.f159c + ", recyclerEntryNames=" + this.f160d + ")";
    }
}
