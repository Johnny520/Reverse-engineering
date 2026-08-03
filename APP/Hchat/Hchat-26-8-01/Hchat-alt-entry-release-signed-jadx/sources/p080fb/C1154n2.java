package p080fb;

import java.util.List;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: fb.n2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1154n2 {

    /* JADX INFO: renamed from: a */
    public final List f3825a;

    /* JADX INFO: renamed from: b */
    public final List f3826b;

    /* JADX INFO: renamed from: c */
    public final List f3827c;

    /* JADX INFO: renamed from: d */
    public final String f3828d;

    /* JADX INFO: renamed from: e */
    public final boolean f3829e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1154n2(List list, List list2, List list3, String str, boolean z9) {
        this.f3825a = list;
        this.f3826b = list2;
        this.f3827c = list3;
        this.f3828d = str;
        this.f3829e = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m2973a() {
        return (this.f3825a.isEmpty() && this.f3826b.isEmpty() && this.f3827c.isEmpty()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154n2)) {
            return false;
        }
        C1154n2 c1154n2 = (C1154n2) obj;
        return this.f3825a.equals(c1154n2.f3825a) && this.f3826b.equals(c1154n2.f3826b) && this.f3827c.equals(c1154n2.f3827c) && this.f3828d.equals(c1154n2.f3828d) && this.f3829e == c1154n2.f3829e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3829e) + AbstractC0921a.m2244g(AbstractC2091b.m5158e(this.f3827c, AbstractC2091b.m5158e(this.f3826b, this.f3825a.hashCode() * 31, 31), 31), 31, this.f3828d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeSummary(created=");
        sb2.append(this.f3825a);
        sb2.append(", modified=");
        sb2.append(this.f3826b);
        sb2.append(", deleted=");
        sb2.append(this.f3827c);
        sb2.append(", diff=");
        sb2.append(this.f3828d);
        sb2.append(", diffTruncated=");
        return AbstractC3199a.m6840m(")", sb2, this.f3829e);
    }
}
