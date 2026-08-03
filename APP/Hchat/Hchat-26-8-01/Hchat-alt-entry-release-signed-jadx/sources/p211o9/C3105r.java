package p211o9;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: o9.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3105r {

    /* JADX INFO: renamed from: a */
    public final String f10071a;

    /* JADX INFO: renamed from: b */
    public final String f10072b;

    /* JADX INFO: renamed from: c */
    public final String f10073c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3105r(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f10071a = str;
        this.f10072b = str2;
        this.f10073c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3105r)) {
            return false;
        }
        C3105r c3105r = (C3105r) obj;
        return AbstractC1416l.m3825a(this.f10071a, c3105r.f10071a) && AbstractC1416l.m3825a(this.f10072b, c3105r.f10072b) && AbstractC1416l.m3825a(this.f10073c, c3105r.f10073c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10073c.hashCode() + AbstractC0921a.m2244g(this.f10071a.hashCode() * 31, 31, this.f10072b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("GroupLeaveReplyTemplateBinding(groupId=", this.f10071a, ", label=", this.f10072b, ", templateId="), this.f10073c, ")");
    }
}
