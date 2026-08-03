package p243q9;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: q9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3468d {

    /* JADX INFO: renamed from: a */
    public final String f11240a;

    /* JADX INFO: renamed from: b */
    public final String f11241b;

    /* JADX INFO: renamed from: c */
    public final String f11242c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3468d(String str, String str2, String str3) {
        str.getClass();
        this.f11240a = str;
        this.f11241b = str2;
        this.f11242c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3468d)) {
            return false;
        }
        C3468d c3468d = (C3468d) obj;
        return AbstractC1416l.m3825a(this.f11240a, c3468d.f11240a) && this.f11241b.equals(c3468d.f11241b) && this.f11242c.equals(c3468d.f11242c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11242c.hashCode() + AbstractC0921a.m2244g(this.f11240a.hashCode() * 31, 31, this.f11241b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("MemberRename(memberId=", this.f11240a, ", oldName=", this.f11241b, ", newName="), this.f11242c, ")");
    }
}
