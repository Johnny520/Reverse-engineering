package p332wb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: wb.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5225q {

    /* JADX INFO: renamed from: a */
    public final String f20103a;

    /* JADX INFO: renamed from: b */
    public final String f20104b;

    /* JADX INFO: renamed from: c */
    public final String f20105c;

    /* JADX INFO: renamed from: d */
    public final String f20106d;

    /* JADX INFO: renamed from: e */
    public final String f20107e;

    /* JADX INFO: renamed from: f */
    public final String f20108f;

    /* JADX INFO: renamed from: g */
    public final String f20109g;

    /* JADX INFO: renamed from: h */
    public final String f20110h;

    /* JADX INFO: renamed from: i */
    public final String f20111i;

    /* JADX INFO: renamed from: j */
    public final String f20112j;

    /* JADX INFO: renamed from: k */
    public final String f20113k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5225q(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f20103a = str;
        this.f20104b = str2;
        this.f20105c = str3;
        this.f20106d = str4;
        this.f20107e = str5;
        this.f20108f = str6;
        this.f20109g = str7;
        this.f20110h = str8;
        this.f20111i = str9;
        this.f20112j = str10;
        this.f20113k = str11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5225q)) {
            return false;
        }
        C5225q c5225q = (C5225q) obj;
        return this.f20103a.equals(c5225q.f20103a) && this.f20104b.equals(c5225q.f20104b) && this.f20105c.equals(c5225q.f20105c) && this.f20106d.equals(c5225q.f20106d) && this.f20107e.equals(c5225q.f20107e) && this.f20108f.equals(c5225q.f20108f) && this.f20109g.equals(c5225q.f20109g) && this.f20110h.equals(c5225q.f20110h) && this.f20111i.equals(c5225q.f20111i) && this.f20112j.equals(c5225q.f20112j) && this.f20113k.equals(c5225q.f20113k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20113k.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f20103a.hashCode() * 31, 31, this.f20104b), 31, this.f20105c), 31, this.f20106d), 31, this.f20107e), 31, this.f20108f), 31, this.f20109g), 31, this.f20110h), 31, this.f20111i), 31, this.f20112j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("AutoReplyFriendAutomationKeys(labelNewFriendEnable=", this.f20103a, ", labelDateEnable=", this.f20104b, ", labelDateFormat=");
        AbstractC2091b.m5173t(sbM1027p, this.f20105c, ", labelExistingEnable=", this.f20106d, ", labelSelectedNames=");
        AbstractC2091b.m5173t(sbM1027p, this.f20107e, ", remarkNewFriendEnable=", this.f20108f, ", remarkNicknameSuffixEnable=");
        AbstractC2091b.m5173t(sbM1027p, this.f20109g, ", remarkDateEnable=", this.f20110h, ", remarkDateFormat=");
        AbstractC2091b.m5173t(sbM1027p, this.f20111i, ", remarkCustomEnable=", this.f20112j, ", remarkCustomText=");
        return AbstractC0921a.m2255r(sbM1027p, this.f20113k, ")");
    }
}
