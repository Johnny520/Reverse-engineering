package p230p8;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;

/* JADX INFO: renamed from: p8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3357i {

    /* JADX INFO: renamed from: a */
    public final String f10824a;

    /* JADX INFO: renamed from: b */
    public final int f10825b;

    /* JADX INFO: renamed from: c */
    public final String f10826c;

    /* JADX INFO: renamed from: d */
    public final int f10827d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1220a f10828e;

    /* JADX INFO: renamed from: f */
    public final String f10829f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1220a f10830g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1231l f10831h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1235p f10832i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3357i(String str, int i9, String str2, int i10, InterfaceC1220a interfaceC1220a, String str3, InterfaceC1220a interfaceC1220a2, InterfaceC1231l interfaceC1231l, InterfaceC1235p interfaceC1235p) {
        this.f10824a = str;
        this.f10825b = i9;
        this.f10826c = str2;
        this.f10827d = i10;
        this.f10828e = interfaceC1220a;
        this.f10829f = str3;
        this.f10830g = interfaceC1220a2;
        this.f10831h = interfaceC1231l;
        this.f10832i = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3357i)) {
            return false;
        }
        C3357i c3357i = (C3357i) obj;
        return this.f10824a.equals(c3357i.f10824a) && this.f10825b == c3357i.f10825b && this.f10826c.equals(c3357i.f10826c) && this.f10827d == c3357i.f10827d && AbstractC1416l.m3825a(this.f10828e, c3357i.f10828e) && this.f10829f.equals(c3357i.f10829f) && this.f10830g.equals(c3357i.f10830g) && this.f10831h.equals(c3357i.f10831h) && this.f10832i.equals(c3357i.f10832i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2242e = AbstractC0921a.m2242e(this.f10827d, AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f10825b, this.f10824a.hashCode() * 31, 31), 31, this.f10826c), 31);
        InterfaceC1220a interfaceC1220a = this.f10828e;
        return this.f10832i.hashCode() + ((this.f10831h.hashCode() + ((this.f10830g.hashCode() + AbstractC0921a.m2244g((iM2242e + (interfaceC1220a == null ? 0 : interfaceC1220a.hashCode())) * 31, 31, this.f10829f)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2258u = AbstractC0921a.m2258u(this.f10825b, "Entry(owner=", this.f10824a, ", itemId=", ", title=");
        sbM2258u.append(this.f10826c);
        sbM2258u.append(", order=");
        sbM2258u.append(this.f10827d);
        sbM2258u.append(", titleProvider=");
        sbM2258u.append(this.f10828e);
        sbM2258u.append(", iconName=");
        sbM2258u.append(this.f10829f);
        sbM2258u.append(", isEnabled=");
        sbM2258u.append(this.f10830g);
        sbM2258u.append(", isApplicable=");
        sbM2258u.append(this.f10831h);
        sbM2258u.append(", onClick=");
        sbM2258u.append(this.f10832i);
        sbM2258u.append(")");
        return sbM2258u.toString();
    }
}
