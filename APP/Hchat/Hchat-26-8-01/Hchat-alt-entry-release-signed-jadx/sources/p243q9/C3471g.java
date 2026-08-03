package p243q9;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: q9.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3471g {

    /* JADX INFO: renamed from: a */
    public final String f11255a;

    /* JADX INFO: renamed from: b */
    public final String f11256b;

    /* JADX INFO: renamed from: c */
    public final boolean f11257c;

    /* JADX INFO: renamed from: d */
    public final int f11258d;

    /* JADX INFO: renamed from: e */
    public final String f11259e;

    /* JADX INFO: renamed from: f */
    public final String f11260f;

    /* JADX INFO: renamed from: g */
    public final String f11261g;

    /* JADX INFO: renamed from: h */
    public final String f11262h;

    /* JADX INFO: renamed from: i */
    public final String f11263i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3471g(String str, String str2, boolean z9, int i9, String str3, String str4, String str5, String str6, String str7) {
        this.f11255a = str;
        this.f11256b = str2;
        this.f11257c = z9;
        this.f11258d = i9;
        this.f11259e = str3;
        this.f11260f = str4;
        this.f11261g = str5;
        this.f11262h = str6;
        this.f11263i = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3471g)) {
            return false;
        }
        C3471g c3471g = (C3471g) obj;
        return this.f11255a.equals(c3471g.f11255a) && this.f11256b.equals(c3471g.f11256b) && this.f11257c == c3471g.f11257c && this.f11258d == c3471g.f11258d && this.f11259e.equals(c3471g.f11259e) && this.f11260f.equals(c3471g.f11260f) && this.f11261g.equals(c3471g.f11261g) && this.f11262h.equals(c3471g.f11262h) && this.f11263i.equals(c3471g.f11263i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11263i.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f11258d, AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f11255a.hashCode() * 31, 31, this.f11256b), 31, this.f11257c), 31), 31, this.f11259e), 31, this.f11260f), 31, this.f11261g), 31, this.f11262h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("GroupRenameReplyTemplate(id=", this.f11255a, ", name=", this.f11256b, ", enabled=");
        sbM1027p.append(this.f11257c);
        sbM1027p.append(", delaySeconds=");
        sbM1027p.append(this.f11258d);
        sbM1027p.append(", promptType=");
        AbstractC2091b.m5173t(sbM1027p, this.f11259e, ", bothOrder=", this.f11260f, ", text=");
        AbstractC2091b.m5173t(sbM1027p, this.f11261g, ", cardTitle=", this.f11262h, ", cardDesc=");
        return AbstractC0921a.m2255r(sbM1027p, this.f11263i, ")");
    }
}
