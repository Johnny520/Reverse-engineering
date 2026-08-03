package p010aa;

import gg.AbstractC1416l;
import java.util.Set;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: aa.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0040h {

    /* JADX INFO: renamed from: a */
    public final String f131a;

    /* JADX INFO: renamed from: b */
    public final String f132b;

    /* JADX INFO: renamed from: c */
    public final boolean f133c;

    /* JADX INFO: renamed from: d */
    public final int f134d;

    /* JADX INFO: renamed from: e */
    public final String f135e;

    /* JADX INFO: renamed from: f */
    public final String f136f;

    /* JADX INFO: renamed from: g */
    public final String f137g;

    /* JADX INFO: renamed from: h */
    public final String f138h;

    /* JADX INFO: renamed from: i */
    public final boolean f139i;

    /* JADX INFO: renamed from: j */
    public final Set f140j;

    /* JADX INFO: renamed from: k */
    public final String f141k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0040h(String str, String str2, boolean z9, int i9, String str3, String str4, String str5, String str6, boolean z10, Set set, String str7) {
        set.getClass();
        str7.getClass();
        this.f131a = str;
        this.f132b = str2;
        this.f133c = z9;
        this.f134d = i9;
        this.f135e = str3;
        this.f136f = str4;
        this.f137g = str5;
        this.f138h = str6;
        this.f139i = z10;
        this.f140j = set;
        this.f141k = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0040h)) {
            return false;
        }
        C0040h c0040h = (C0040h) obj;
        return this.f131a.equals(c0040h.f131a) && this.f132b.equals(c0040h.f132b) && this.f133c == c0040h.f133c && this.f134d == c0040h.f134d && this.f135e.equals(c0040h.f135e) && this.f136f.equals(c0040h.f136f) && this.f137g.equals(c0040h.f137g) && this.f138h.equals(c0040h.f138h) && this.f139i == c0040h.f139i && AbstractC1416l.m3825a(this.f140j, c0040h.f140j) && AbstractC1416l.m3825a(this.f141k, c0040h.f141k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f141k.hashCode() + ((this.f140j.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f134d, AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f131a.hashCode() * 31, 31, this.f132b), 31, this.f133c), 31), 31, this.f135e), 31, this.f136f), 31, this.f137g), 31, this.f138h), 31, this.f139i)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("MessageBlockTemplate(id=", this.f131a, ", name=", this.f132b, ", enabled=");
        sbM1027p.append(this.f133c);
        sbM1027p.append(", mode=");
        sbM1027p.append(this.f134d);
        sbM1027p.append(", targets=");
        AbstractC2091b.m5173t(sbM1027p, this.f135e, ", targetGroupMembers=", this.f136f, ", excludes=");
        AbstractC2091b.m5173t(sbM1027p, this.f137g, ", excludeGroupMembers=", this.f138h, ", typeAll=");
        sbM1027p.append(this.f139i);
        sbM1027p.append(", types=");
        sbM1027p.append(this.f140j);
        sbM1027p.append(", textKeywords=");
        return AbstractC0921a.m2255r(sbM1027p, this.f141k, ")");
    }
}
