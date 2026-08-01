package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0053z {

    /* JADX INFO: renamed from: a */
    public final List f295a;

    /* JADX INFO: renamed from: b */
    public final List f296b;

    /* JADX INFO: renamed from: c */
    public final List f297c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0053z(List list, List list2, List list3) {
        this.f295a = list;
        this.f296b = list2;
        this.f297c = list3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0053z)) {
            return false;
        }
        C0053z c0053z = (C0053z) obj;
        return AbstractC0223g.m414a(this.f295a, c0053z.f295a) && AbstractC0223g.m414a(this.f296b, c0053z.f296b) && AbstractC0223g.m414a(this.f297c, c0053z.f297c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f297c.hashCode() + AbstractC0174d.m349e(this.f296b, this.f295a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookPoint(activityClassNames=" + this.f295a + ", adapterClassNames=" + this.f296b + ", listEntryNames=" + this.f297c + ")";
    }
}
