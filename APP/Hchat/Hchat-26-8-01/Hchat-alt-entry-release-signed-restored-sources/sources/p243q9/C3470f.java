package p243q9;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: q9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3470f {

    /* JADX INFO: renamed from: a */
    public final String f11245a;

    /* JADX INFO: renamed from: b */
    public final String f11246b;

    /* JADX INFO: renamed from: c */
    public final String f11247c;

    /* JADX INFO: renamed from: d */
    public final String f11248d;

    /* JADX INFO: renamed from: e */
    public final String f11249e;

    /* JADX INFO: renamed from: f */
    public final String f11250f;

    /* JADX INFO: renamed from: g */
    public final String f11251g;

    /* JADX INFO: renamed from: h */
    public final String f11252h;

    /* JADX INFO: renamed from: i */
    public final String f11253i;

    /* JADX INFO: renamed from: j */
    public final String f11254j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3470f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        str.getClass();
        str9.getClass();
        this.f11245a = str;
        this.f11246b = str2;
        this.f11247c = str3;
        this.f11248d = str4;
        this.f11249e = str5;
        this.f11250f = str6;
        this.f11251g = str7;
        this.f11252h = str8;
        this.f11253i = str9;
        this.f11254j = str10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3470f)) {
            return false;
        }
        C3470f c3470f = (C3470f) obj;
        return AbstractC1416l.m3825a(this.f11245a, c3470f.f11245a) && this.f11246b.equals(c3470f.f11246b) && this.f11247c.equals(c3470f.f11247c) && this.f11248d.equals(c3470f.f11248d) && this.f11249e.equals(c3470f.f11249e) && this.f11250f.equals(c3470f.f11250f) && this.f11251g.equals(c3470f.f11251g) && this.f11252h.equals(c3470f.f11252h) && AbstractC1416l.m3825a(this.f11253i, c3470f.f11253i) && this.f11254j.equals(c3470f.f11254j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11254j.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f11245a.hashCode() * 31, 31, this.f11246b), 31, this.f11247c), 31, this.f11248d), 31, this.f11249e), 31, this.f11250f), 31, this.f11251g), 31, this.f11252h), 31, this.f11253i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ReplyVariables(userWxid=", this.f11245a, ", userName=", this.f11246b, ", groupNickname=");
        AbstractC2091b.m5173t(sbM1027p, this.f11247c, ", oldGroupNickname=", this.f11248d, ", newGroupNickname=");
        AbstractC2091b.m5173t(sbM1027p, this.f11249e, ", realNameTail=", this.f11250f, ", gender=");
        AbstractC2091b.m5173t(sbM1027p, this.f11251g, ", region=", this.f11252h, ", groupName=");
        return AbstractC2091b.m5164k(sbM1027p, this.f11253i, ", time=", this.f11254j, ")");
    }
}
