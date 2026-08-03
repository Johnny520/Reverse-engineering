package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.w1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1188w1 {

    /* JADX INFO: renamed from: a */
    public final String f3995a;

    /* JADX INFO: renamed from: b */
    public final String f3996b;

    /* JADX INFO: renamed from: c */
    public final String f3997c;

    /* JADX INFO: renamed from: d */
    public final String f3998d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1188w1(String str, String str2, String str3, String str4) {
        str.getClass();
        str4.getClass();
        this.f3995a = str;
        this.f3996b = str2;
        this.f3997c = str3;
        this.f3998d = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1188w1)) {
            return false;
        }
        C1188w1 c1188w1 = (C1188w1) obj;
        return AbstractC1416l.m3825a(this.f3995a, c1188w1.f3995a) && AbstractC1416l.m3825a(this.f3996b, c1188w1.f3996b) && AbstractC1416l.m3825a(this.f3997c, c1188w1.f3997c) && AbstractC1416l.m3825a(this.f3998d, c1188w1.f3998d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f3995a.hashCode() * 31;
        String str = this.f3996b;
        return this.f3998d.hashCode() + AbstractC0921a.m2244g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f3997c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("FileChange(path=", this.f3995a, ", content=", this.f3996b, ", operation="), this.f3997c, ", sourcePath=", this.f3998d, ")");
    }
}
