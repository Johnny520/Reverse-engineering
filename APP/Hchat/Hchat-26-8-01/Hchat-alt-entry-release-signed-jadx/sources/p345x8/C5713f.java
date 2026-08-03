package p345x8;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: x8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5713f {

    /* JADX INFO: renamed from: a */
    public final String f23230a;

    /* JADX INFO: renamed from: b */
    public final String f23231b;

    /* JADX INFO: renamed from: c */
    public final String f23232c;

    /* JADX INFO: renamed from: d */
    public final String f23233d;

    /* JADX INFO: renamed from: e */
    public final String f23234e;

    /* JADX INFO: renamed from: f */
    public final String f23235f;

    /* JADX INFO: renamed from: g */
    public final String f23236g;

    /* JADX INFO: renamed from: h */
    public final String f23237h;

    /* JADX INFO: renamed from: i */
    public final String f23238i;

    /* JADX INFO: renamed from: j */
    public final String f23239j;

    /* JADX INFO: renamed from: k */
    public final String f23240k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5713f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f23230a = str;
        this.f23231b = str2;
        this.f23232c = str3;
        this.f23233d = str4;
        this.f23234e = str5;
        this.f23235f = str6;
        this.f23236g = str7;
        this.f23237h = str8;
        this.f23238i = str9;
        this.f23239j = str10;
        this.f23240k = str11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5713f)) {
            return false;
        }
        C5713f c5713f = (C5713f) obj;
        return this.f23230a.equals(c5713f.f23230a) && this.f23231b.equals(c5713f.f23231b) && this.f23232c.equals(c5713f.f23232c) && this.f23233d.equals(c5713f.f23233d) && this.f23234e.equals(c5713f.f23234e) && this.f23235f.equals(c5713f.f23235f) && this.f23236g.equals(c5713f.f23236g) && this.f23237h.equals(c5713f.f23237h) && this.f23238i.equals(c5713f.f23238i) && this.f23239j.equals(c5713f.f23239j) && this.f23240k.equals(c5713f.f23240k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23240k.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f23230a.hashCode() * 31, 31, this.f23231b), 31, this.f23232c), 31, this.f23233d), 31, this.f23234e), 31, this.f23235f), 31, this.f23236g), 31, this.f23237h), 31, this.f23238i), 31, this.f23239j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("FriendAutomationKeys(labelNewFriendEnable=", this.f23230a, ", labelDateEnable=", this.f23231b, ", labelDateFormat=");
        AbstractC2091b.m5173t(sbM1027p, this.f23232c, ", labelExistingEnable=", this.f23233d, ", labelSelectedNames=");
        AbstractC2091b.m5173t(sbM1027p, this.f23234e, ", remarkNewFriendEnable=", this.f23235f, ", remarkNicknameSuffixEnable=");
        AbstractC2091b.m5173t(sbM1027p, this.f23236g, ", remarkDateEnable=", this.f23237h, ", remarkDateFormat=");
        AbstractC2091b.m5173t(sbM1027p, this.f23238i, ", remarkCustomEnable=", this.f23239j, ", remarkCustomText=");
        return AbstractC0921a.m2255r(sbM1027p, this.f23240k, ")");
    }
}
