package p065eb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: eb.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0874j {

    /* JADX INFO: renamed from: a */
    public final String f2680a;

    /* JADX INFO: renamed from: b */
    public final String f2681b;

    /* JADX INFO: renamed from: c */
    public final String f2682c;

    /* JADX INFO: renamed from: d */
    public final int f2683d;

    /* JADX INFO: renamed from: e */
    public final long f2684e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0874j(String str, String str2, String str3, int i9, long j3) {
        str3.getClass();
        this.f2680a = str;
        this.f2681b = str2;
        this.f2682c = str3;
        this.f2683d = i9;
        this.f2684e = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0874j)) {
            return false;
        }
        C0874j c0874j = (C0874j) obj;
        return this.f2680a.equals(c0874j.f2680a) && this.f2681b.equals(c0874j.f2681b) && AbstractC1416l.m3825a(this.f2682c, c0874j.f2682c) && this.f2683d == c0874j.f2683d && this.f2684e == c0874j.f2684e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f2684e) + AbstractC0921a.m2242e(this.f2683d, AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f2680a.hashCode() * 31, 31, this.f2681b), 31, this.f2682c), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("VerifyAlias(contactWxid=", this.f2680a, ", verifyUsername=", this.f2681b, ", ticket=");
        sbM1027p.append(this.f2682c);
        sbM1027p.append(", scene=");
        sbM1027p.append(this.f2683d);
        sbM1027p.append(", time=");
        return AbstractC0921a.m2253p(sbM1027p, this.f2684e, ")");
    }
}
