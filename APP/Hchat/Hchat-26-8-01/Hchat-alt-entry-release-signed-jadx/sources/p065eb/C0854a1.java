package p065eb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: eb.a1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0854a1 {

    /* JADX INFO: renamed from: a */
    public final String f2615a;

    /* JADX INFO: renamed from: b */
    public final String f2616b;

    /* JADX INFO: renamed from: c */
    public final String f2617c;

    /* JADX INFO: renamed from: d */
    public final int f2618d;

    /* JADX INFO: renamed from: e */
    public final int f2619e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0854a1(int i9, int i10, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f2615a = str;
        this.f2616b = str2;
        this.f2617c = str3;
        this.f2618d = i9;
        this.f2619e = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0854a1)) {
            return false;
        }
        C0854a1 c0854a1 = (C0854a1) obj;
        return AbstractC1416l.m3825a(this.f2615a, c0854a1.f2615a) && AbstractC1416l.m3825a(this.f2616b, c0854a1.f2616b) && AbstractC1416l.m3825a(this.f2617c, c0854a1.f2617c) && this.f2618d == c0854a1.f2618d && this.f2619e == c0854a1.f2619e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f2619e) + AbstractC0921a.m2242e(this.f2618d, AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f2615a.hashCode() * 31, 31, this.f2616b), 31, this.f2617c), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ImageDownloadRequest(md5=", this.f2615a, ", url=", this.f2616b, ", aesKey=");
        sbM1027p.append(this.f2617c);
        sbM1027p.append(", fileType=");
        sbM1027p.append(this.f2618d);
        sbM1027p.append(", totalLen=");
        return AbstractC2091b.m5163j(sbM1027p, this.f2619e, ")");
    }
}
