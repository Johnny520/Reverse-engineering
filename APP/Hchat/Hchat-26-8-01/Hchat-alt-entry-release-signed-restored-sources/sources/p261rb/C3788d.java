package p261rb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: rb.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3788d {

    /* JADX INFO: renamed from: a */
    public final String f12418a;

    /* JADX INFO: renamed from: b */
    public final String f12419b;

    /* JADX INFO: renamed from: c */
    public final EnumC3789e f12420c;

    /* JADX INFO: renamed from: d */
    public final String f12421d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3788d(String str, String str2, EnumC3789e enumC3789e, String str3) {
        str.getClass();
        str2.getClass();
        enumC3789e.getClass();
        this.f12418a = str;
        this.f12419b = str2;
        this.f12420c = enumC3789e;
        this.f12421d = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3788d)) {
            return false;
        }
        C3788d c3788d = (C3788d) obj;
        return AbstractC1416l.m3825a(this.f12418a, c3788d.f12418a) && AbstractC1416l.m3825a(this.f12419b, c3788d.f12419b) && this.f12420c == c3788d.f12420c && this.f12421d.equals(c3788d.f12421d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12421d.hashCode() + ((this.f12420c.hashCode() + AbstractC0921a.m2244g(this.f12418a.hashCode() * 31, 31, this.f12419b)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ZombieCheckResult(wxid=", this.f12418a, ", name=", this.f12419b, ", type=");
        sbM1027p.append(this.f12420c);
        sbM1027p.append(", message=");
        sbM1027p.append(this.f12421d);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
