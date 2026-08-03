package p036c9;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: c9.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0424c1 {

    /* JADX INFO: renamed from: a */
    public final String f1216a;

    /* JADX INFO: renamed from: b */
    public final String f1217b;

    /* JADX INFO: renamed from: c */
    public final String f1218c;

    /* JADX INFO: renamed from: d */
    public final int f1219d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0424c1(int i9, String str, String str2, String str3) {
        str2.getClass();
        this.f1216a = str;
        this.f1217b = str2;
        this.f1218c = str3;
        this.f1219d = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0424c1)) {
            return false;
        }
        C0424c1 c0424c1 = (C0424c1) obj;
        return AbstractC1416l.m3825a(this.f1216a, c0424c1.f1216a) && AbstractC1416l.m3825a(this.f1217b, c0424c1.f1217b) && this.f1218c.equals(c0424c1.f1218c) && this.f1219d == c0424c1.f1219d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f1216a;
        return Integer.hashCode(this.f1219d) + AbstractC0921a.m2244g(AbstractC0921a.m2244g((str == null ? 0 : str.hashCode()) * 31, 31, this.f1217b), 31, this.f1218c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("GroupRow(id=", this.f1216a, ", name=", this.f1217b, ", path=");
        sbM1027p.append(this.f1218c);
        sbM1027p.append(", depth=");
        sbM1027p.append(this.f1219d);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
