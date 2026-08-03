package p126ia;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: ia.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2008b {

    /* JADX INFO: renamed from: a */
    public final String f6773a;

    /* JADX INFO: renamed from: b */
    public final String f6774b;

    /* JADX INFO: renamed from: c */
    public final String f6775c;

    /* JADX INFO: renamed from: d */
    public final String f6776d;

    /* JADX INFO: renamed from: e */
    public final long f6777e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2008b(String str, String str2, String str3, String str4, long j3) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f6773a = str;
        this.f6774b = str2;
        this.f6775c = str3;
        this.f6776d = str4;
        this.f6777e = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2008b m4960a(C2008b c2008b, String str, String str2, String str3, long j3, int i9) {
        String str4 = str;
        String str5 = c2008b.f6773a;
        if ((i9 & 2) != 0) {
            str4 = c2008b.f6774b;
        }
        if ((i9 & 4) != 0) {
            str2 = c2008b.f6775c;
        }
        if ((i9 & 8) != 0) {
            str3 = c2008b.f6776d;
        }
        if ((i9 & 16) != 0) {
            j3 = c2008b.f6777e;
        }
        long j4 = j3;
        c2008b.getClass();
        str4.getClass();
        str2.getClass();
        str3.getClass();
        String str6 = str3;
        return new C2008b(str5, str4, str2, str6, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2008b)) {
            return false;
        }
        C2008b c2008b = (C2008b) obj;
        return this.f6773a.equals(c2008b.f6773a) && AbstractC1416l.m3825a(this.f6774b, c2008b.f6774b) && AbstractC1416l.m3825a(this.f6775c, c2008b.f6775c) && AbstractC1416l.m3825a(this.f6776d, c2008b.f6776d) && this.f6777e == c2008b.f6777e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f6777e) + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f6773a.hashCode() * 31, 31, this.f6774b), 31, this.f6775c), 31, this.f6776d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("FakeSnsComment(id=", this.f6773a, ", authorWxId=", this.f6774b, ", authorDisplayName=");
        AbstractC2091b.m5173t(sbM1027p, this.f6775c, ", content=", this.f6776d, ", createTimeMillis=");
        return AbstractC0921a.m2253p(sbM1027p, this.f6777e, ")");
    }
}
