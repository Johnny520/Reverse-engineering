package p244qb;

import gg.AbstractC1416l;
import java.util.List;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: qb.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3486g {

    /* JADX INFO: renamed from: a */
    public final String f11315a;

    /* JADX INFO: renamed from: b */
    public final String f11316b;

    /* JADX INFO: renamed from: c */
    public final boolean f11317c;

    /* JADX INFO: renamed from: d */
    public final String f11318d;

    /* JADX INFO: renamed from: e */
    public final String f11319e;

    /* JADX INFO: renamed from: f */
    public final List f11320f;

    /* JADX INFO: renamed from: g */
    public final List f11321g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3486g(String str, String str2, boolean z9, String str3, String str4, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f11315a = str;
        this.f11316b = str2;
        this.f11317c = z9;
        this.f11318d = str3;
        this.f11319e = str4;
        this.f11320f = list;
        this.f11321g = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3486g)) {
            return false;
        }
        C3486g c3486g = (C3486g) obj;
        return AbstractC1416l.m3825a(this.f11315a, c3486g.f11315a) && AbstractC1416l.m3825a(this.f11316b, c3486g.f11316b) && this.f11317c == c3486g.f11317c && AbstractC1416l.m3825a(this.f11318d, c3486g.f11318d) && AbstractC1416l.m3825a(this.f11319e, c3486g.f11319e) && this.f11320f.equals(c3486g.f11320f) && this.f11321g.equals(c3486g.f11321g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11321g.hashCode() + AbstractC2091b.m5158e(this.f11320f, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f11315a.hashCode() * 31, 31, this.f11316b), 31, this.f11317c), 31, this.f11318d), 31, this.f11319e), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ContactRow(id=", this.f11315a, ", label=", this.f11316b, ", group=");
        sbM1027p.append(this.f11317c);
        sbM1027p.append(", avatarUrl=");
        sbM1027p.append(this.f11318d);
        sbM1027p.append(", avatarBackupUrl=");
        sbM1027p.append(this.f11319e);
        sbM1027p.append(", labels=");
        sbM1027p.append(this.f11320f);
        sbM1027p.append(", searchAliases=");
        sbM1027p.append(this.f11321g);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
