package p066ed;

import java.util.List;
import p215od.C3131d;
import p246qd.AbstractC3506j;
import p302ud.InterfaceC4317m;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: ed.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0911d implements InterfaceC4317m, Comparable {

    /* JADX INFO: renamed from: g */
    public final C3131d f2838g;

    /* JADX INFO: renamed from: h */
    public final List f2839h;

    /* JADX INFO: renamed from: i */
    public final AbstractC3506j f2840i;

    /* JADX INFO: renamed from: j */
    public final List f2841j;

    /* JADX INFO: renamed from: k */
    public final List f2842k;

    /* JADX INFO: renamed from: l */
    public final int f2843l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0911d(C3131d c3131d, List list, AbstractC3506j abstractC3506j, List list2, List list3, int i9) {
        this.f2838g = c3131d;
        this.f2839h = list;
        this.f2840i = abstractC3506j;
        this.f2841j = list2;
        this.f2842k = list3;
        this.f2843l = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: c */
    public final List mo2218c() {
        return this.f2839h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2838g.compareTo(((C0911d) obj).f2838g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m, p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: d */
    public final String mo2219d() {
        return super.mo2219d().concat(" (c)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: e */
    public final AbstractC3506j mo2220e() {
        return this.f2840i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0911d) {
            return this.f2838g.equals(((C0911d) obj).f2838g);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    public final List getTypeParameters() {
        return this.f2841j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2838g.f10156m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: o */
    public final int mo2221o() {
        return this.f2843l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: q */
    public final C3131d mo2222q() {
        return this.f2838g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: s */
    public final List mo2223s() {
        return this.f2842k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClspMth{");
        List list = this.f2841j;
        if (AbstractC5798s.m10520n(list)) {
            sb2.append('<');
            sb2.append(AbstractC5798s.m10516j(list, ", "));
            sb2.append("> ");
        }
        C3131d c3131d = this.f2838g;
        sb2.append(c3131d.f10153j.f10141j + "." + c3131d.f10150g);
        sb2.append('(');
        sb2.append(AbstractC5798s.m10516j(this.f2839h, ", "));
        sb2.append("):");
        sb2.append(this.f2840i);
        if (mo2224v()) {
            sb2.append(" VARARG");
        }
        List list2 = this.f2842k;
        if (AbstractC5798s.m10520n(list2)) {
            sb2.append(" throws ");
            sb2.append(AbstractC5798s.m10516j(list2, ", "));
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: v */
    public final boolean mo2224v() {
        return (this.f2843l & 128) != 0;
    }
}
