package p211o9;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: o9.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3101n {

    /* JADX INFO: renamed from: a */
    public final String f10012a;

    /* JADX INFO: renamed from: b */
    public final String f10013b;

    /* JADX INFO: renamed from: c */
    public final String f10014c;

    /* JADX INFO: renamed from: d */
    public final String f10015d;

    /* JADX INFO: renamed from: e */
    public final String f10016e;

    /* JADX INFO: renamed from: f */
    public final String f10017f;

    /* JADX INFO: renamed from: g */
    public final String f10018g;

    /* JADX INFO: renamed from: h */
    public final String f10019h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3101n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str7.getClass();
        this.f10012a = str;
        this.f10013b = str2;
        this.f10014c = str3;
        this.f10015d = str4;
        this.f10016e = str5;
        this.f10017f = str6;
        this.f10018g = str7;
        this.f10019h = str8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3101n)) {
            return false;
        }
        C3101n c3101n = (C3101n) obj;
        return AbstractC1416l.m3825a(this.f10012a, c3101n.f10012a) && AbstractC1416l.m3825a(this.f10013b, c3101n.f10013b) && AbstractC1416l.m3825a(this.f10014c, c3101n.f10014c) && this.f10015d.equals(c3101n.f10015d) && this.f10016e.equals(c3101n.f10016e) && this.f10017f.equals(c3101n.f10017f) && AbstractC1416l.m3825a(this.f10018g, c3101n.f10018g) && this.f10019h.equals(c3101n.f10019h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10019h.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f10012a.hashCode() * 31, 31, this.f10013b), 31, this.f10014c), 31, this.f10015d), 31, this.f10016e), 31, this.f10017f), 31, this.f10018g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ReplyVariables(userWxid=", this.f10012a, ", userName=", this.f10013b, ", groupNickname=");
        AbstractC2091b.m5173t(sbM1027p, this.f10014c, ", realNameTail=", this.f10015d, ", gender=");
        AbstractC2091b.m5173t(sbM1027p, this.f10016e, ", region=", this.f10017f, ", groupName=");
        return AbstractC2091b.m5164k(sbM1027p, this.f10018g, ", time=", this.f10019h, ")");
    }
}
