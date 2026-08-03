package p243q9;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: q9.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3472h {

    /* JADX INFO: renamed from: a */
    public final String f11264a;

    /* JADX INFO: renamed from: b */
    public final String f11265b;

    /* JADX INFO: renamed from: c */
    public final String f11266c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3472h(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f11264a = str;
        this.f11265b = str2;
        this.f11266c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3472h)) {
            return false;
        }
        C3472h c3472h = (C3472h) obj;
        return AbstractC1416l.m3825a(this.f11264a, c3472h.f11264a) && AbstractC1416l.m3825a(this.f11265b, c3472h.f11265b) && AbstractC1416l.m3825a(this.f11266c, c3472h.f11266c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11266c.hashCode() + AbstractC0921a.m2244g(this.f11264a.hashCode() * 31, 31, this.f11265b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("GroupRenameTemplateBinding(groupId=", this.f11264a, ", label=", this.f11265b, ", templateId="), this.f11266c, ")");
    }
}
