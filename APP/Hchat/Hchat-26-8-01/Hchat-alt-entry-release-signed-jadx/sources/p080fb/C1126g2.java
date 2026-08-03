package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.g2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1126g2 {

    /* JADX INFO: renamed from: a */
    public final String f3685a;

    /* JADX INFO: renamed from: b */
    public final String f3686b;

    /* JADX INFO: renamed from: c */
    public final String f3687c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1126g2(String str, String str2, String str3) {
        str.getClass();
        this.f3685a = str;
        this.f3686b = str2;
        this.f3687c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1126g2)) {
            return false;
        }
        C1126g2 c1126g2 = (C1126g2) obj;
        return AbstractC1416l.m3825a(this.f3685a, c1126g2.f3685a) && this.f3686b.equals(c1126g2.f3686b) && this.f3687c.equals(c1126g2.f3687c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3687c.hashCode() + AbstractC0921a.m2244g(this.f3685a.hashCode() * 31, 31, this.f3686b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("SearchResult(title=", this.f3685a, ", url=", this.f3686b, ", snippet="), this.f3687c, ")");
    }
}
