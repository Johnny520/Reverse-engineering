package p197n9;

import gg.AbstractC1416l;
import java.util.Set;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: n9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2912a {

    /* JADX INFO: renamed from: a */
    public final String f9409a;

    /* JADX INFO: renamed from: b */
    public final String f9410b;

    /* JADX INFO: renamed from: c */
    public final Set f9411c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2912a(String str, String str2, Set set) {
        str.getClass();
        str2.getClass();
        this.f9409a = str;
        this.f9410b = str2;
        this.f9411c = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2912a m6319a(C2912a c2912a, String str, Set set, int i9) {
        String str2 = c2912a.f9409a;
        if ((i9 & 2) != 0) {
            str = c2912a.f9410b;
        }
        c2912a.getClass();
        str2.getClass();
        str.getClass();
        return new C2912a(str2, str, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2912a)) {
            return false;
        }
        C2912a c2912a = (C2912a) obj;
        return AbstractC1416l.m3825a(this.f9409a, c2912a.f9409a) && AbstractC1416l.m3825a(this.f9410b, c2912a.f9410b) && this.f9411c.equals(c2912a.f9411c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9411c.hashCode() + AbstractC0921a.m2244g(this.f9409a.hashCode() * 31, 31, this.f9410b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("GroupChatLabel(id=", this.f9409a, ", name=", this.f9410b, ", groupIds=");
        sbM1027p.append(this.f9411c);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
