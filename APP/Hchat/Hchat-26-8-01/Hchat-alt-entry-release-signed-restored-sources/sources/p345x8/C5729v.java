package p345x8;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: x8.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5729v {

    /* JADX INFO: renamed from: a */
    public final String f23340a;

    /* JADX INFO: renamed from: b */
    public final String f23341b;

    /* JADX INFO: renamed from: c */
    public final String f23342c;

    /* JADX INFO: renamed from: d */
    public final String f23343d;

    /* JADX INFO: renamed from: e */
    public final String f23344e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5729v(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.f23340a = str;
        this.f23341b = str2;
        this.f23342c = str3;
        this.f23343d = str4;
        this.f23344e = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5729v)) {
            return false;
        }
        C5729v c5729v = (C5729v) obj;
        return AbstractC1416l.m3825a(this.f23340a, c5729v.f23340a) && this.f23341b.equals(c5729v.f23341b) && this.f23342c.equals(c5729v.f23342c) && this.f23343d.equals(c5729v.f23343d) && this.f23344e.equals(c5729v.f23344e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23344e.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f23340a.hashCode() * 31, 31, this.f23341b), 31, this.f23342c), 31, this.f23343d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("XiaozhiAgentOption(id=", this.f23340a, ", name=", this.f23341b, ", assistantName=");
        AbstractC2091b.m5173t(sbM1027p, this.f23342c, ", model=", this.f23343d, ", voice=");
        return AbstractC0921a.m2255r(sbM1027p, this.f23344e, ")");
    }
}
