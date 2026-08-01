package p001A0;

import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0048u {

    /* JADX INFO: renamed from: a */
    public final String f282a;

    /* JADX INFO: renamed from: b */
    public final String f283b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0193a f284c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0193a f285d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0204l f286e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0204l f287f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0048u(String str, String str2, InterfaceC0193a interfaceC0193a, InterfaceC0193a interfaceC0193a2, InterfaceC0204l interfaceC0204l, InterfaceC0204l interfaceC0204l2) {
        this.f282a = str;
        this.f283b = str2;
        this.f284c = interfaceC0193a;
        this.f285d = interfaceC0193a2;
        this.f286e = interfaceC0204l;
        this.f287f = interfaceC0204l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0048u)) {
            return false;
        }
        C0048u c0048u = (C0048u) obj;
        return AbstractC0223g.m414a(this.f282a, c0048u.f282a) && AbstractC0223g.m414a(this.f283b, c0048u.f283b) && AbstractC0223g.m414a(this.f284c, c0048u.f284c) && AbstractC0223g.m414a(this.f285d, c0048u.f285d) && AbstractC0223g.m414a(this.f286e, c0048u.f286e) && AbstractC0223g.m414a(this.f287f, c0048u.f287f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f287f.hashCode() + ((this.f286e.hashCode() + ((this.f285d.hashCode() + ((this.f284c.hashCode() + AbstractC0174d.m347c(this.f283b, this.f282a.hashCode() * 31, 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScanTask(key=" + this.f282a + ", label=" + this.f283b + ", isEnabled=" + this.f284c + ", isResolved=" + this.f285d + ", scan=" + this.f286e + ", onSkipped=" + this.f287f + ")";
    }
}
