package p086r0;

import java.util.List;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0920m {

    /* JADX INFO: renamed from: a */
    public final List f3281a;

    /* JADX INFO: renamed from: b */
    public final List f3282b;

    /* JADX INFO: renamed from: c */
    public final int f3283c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0920m() {
        C0131s c0131s = C0131s.f426a;
        this(c0131s, c0131s, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m2038a() {
        return Math.min(this.f3283c, 4) + this.f3282b.size() + (this.f3281a.size() * 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0920m)) {
            return false;
        }
        C0920m c0920m = (C0920m) obj;
        return AbstractC0223g.m414a(this.f3281a, c0920m.f3281a) && AbstractC0223g.m414a(this.f3282b, c0920m.f3282b) && this.f3283c == c0920m.f3283c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f3283c) + AbstractC0174d.m349e(this.f3282b, this.f3281a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConversationSurfaceSample(usernames=" + this.f3281a + ", itemClassNames=" + this.f3282b + ", inspectedCount=" + this.f3283c + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0920m(List list, List list2, int i2) {
        this.f3281a = list;
        this.f3282b = list2;
        this.f3283c = i2;
    }
}
