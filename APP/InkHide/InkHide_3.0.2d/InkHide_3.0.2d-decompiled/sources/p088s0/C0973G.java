package p088s0;

import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: s0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0973G {

    /* JADX INFO: renamed from: a */
    public final String f3481a;

    /* JADX INFO: renamed from: b */
    public final String f3482b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0193a f3483c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0193a f3484d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0204l f3485e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0973G(String str, String str2, InterfaceC0193a interfaceC0193a, InterfaceC0193a interfaceC0193a2, InterfaceC0204l interfaceC0204l) {
        AbstractC0223g.m418e(str, "title");
        AbstractC0223g.m418e(str2, "desc");
        AbstractC0223g.m418e(interfaceC0193a, "checked");
        AbstractC0223g.m418e(interfaceC0204l, "onChanged");
        this.f3481a = str;
        this.f3482b = str2;
        this.f3483c = interfaceC0193a;
        this.f3484d = interfaceC0193a2;
        this.f3485e = interfaceC0204l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0973G)) {
            return false;
        }
        C0973G c0973g = (C0973G) obj;
        return AbstractC0223g.m414a(this.f3481a, c0973g.f3481a) && AbstractC0223g.m414a(this.f3482b, c0973g.f3482b) && AbstractC0223g.m414a(this.f3483c, c0973g.f3483c) && AbstractC0223g.m414a(this.f3484d, c0973g.f3484d) && AbstractC0223g.m414a(this.f3485e, c0973g.f3485e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f3483c.hashCode() + AbstractC0174d.m347c(this.f3482b, this.f3481a.hashCode() * 31, 31)) * 31;
        InterfaceC0193a interfaceC0193a = this.f3484d;
        return this.f3485e.hashCode() + ((iHashCode + (interfaceC0193a == null ? 0 : interfaceC0193a.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OptionSwitchRow(title=" + this.f3481a + ", desc=" + this.f3482b + ", checked=" + this.f3483c + ", onClick=" + this.f3484d + ", onChanged=" + this.f3485e + ")";
    }
}
