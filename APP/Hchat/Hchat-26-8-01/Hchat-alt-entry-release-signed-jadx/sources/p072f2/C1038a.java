package p072f2;

import gg.AbstractC1416l;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: f2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1038a {

    /* JADX INFO: renamed from: a */
    public final String f3269a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3955b f3270b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1038a(String str, InterfaceC3955b interfaceC3955b) {
        this.f3269a = str;
        this.f3270b = interfaceC3955b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1038a)) {
            return false;
        }
        C1038a c1038a = (C1038a) obj;
        return AbstractC1416l.m3825a(this.f3269a, c1038a.f3269a) && AbstractC1416l.m3825a(this.f3270b, c1038a.f3270b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f3269a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC3955b interfaceC3955b = this.f3270b;
        return iHashCode + (interfaceC3955b != null ? interfaceC3955b.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AccessibilityAction(label=" + this.f3269a + ", action=" + this.f3270b + ')';
    }
}
