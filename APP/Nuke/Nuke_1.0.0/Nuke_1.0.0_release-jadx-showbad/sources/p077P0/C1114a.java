package p077P0;

import p056K2.InterfaceC0877c;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: P0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1114a {

    /* JADX INFO: renamed from: a */
    public final String f3633a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0877c f3634b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1114a(String str, InterfaceC0877c interfaceC0877c) {
        this.f3633a = str;
        this.f3634b = interfaceC0877c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1114a)) {
            return false;
        }
        C1114a c1114a = (C1114a) obj;
        return AbstractC1665j.m2981a(this.f3633a, c1114a.f3633a) && AbstractC1665j.m2981a(this.f3634b, c1114a.f3634b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f3633a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC0877c interfaceC0877c = this.f3634b;
        return iHashCode + (interfaceC0877c != null ? interfaceC0877c.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AccessibilityAction(label=" + this.f3633a + ", action=" + this.f3634b + ')';
    }
}
