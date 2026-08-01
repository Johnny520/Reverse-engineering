package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0027a0 {

    /* JADX INFO: renamed from: a */
    public final List f204a;

    /* JADX INFO: renamed from: b */
    public final List f205b;

    /* JADX INFO: renamed from: c */
    public final List f206c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0027a0(List list, List list2, List list3) {
        this.f204a = list;
        this.f205b = list2;
        this.f206c = list3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0027a0)) {
            return false;
        }
        C0027a0 c0027a0 = (C0027a0) obj;
        return AbstractC0223g.m414a(this.f204a, c0027a0.f204a) && AbstractC0223g.m414a(this.f205b, c0027a0.f205b) && AbstractC0223g.m414a(this.f206c, c0027a0.f206c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f206c.hashCode() + AbstractC0174d.m349e(this.f205b, this.f204a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookPoint(activityClassNames=" + this.f204a + ", adapterClassNames=" + this.f205b + ", recyclerEntryNames=" + this.f206c + ")";
    }
}
