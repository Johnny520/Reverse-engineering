package p160l1;

import gg.AbstractC1416l;
import p057e1.C0810e;
import p068eh.AbstractC0921a;
import p071f1.InterfaceC1026r0;
import p293u2.EnumC4243m;

/* JADX INFO: renamed from: l1.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2432a {

    /* JADX INFO: renamed from: a */
    public InterfaceC1026r0 f7995a;

    /* JADX INFO: renamed from: b */
    public long f7996b;

    /* JADX INFO: renamed from: c */
    public EnumC4243m f7997c;

    /* JADX INFO: renamed from: d */
    public float f7998d;

    /* JADX INFO: renamed from: e */
    public C2435d f7999e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2432a(InterfaceC1026r0 interfaceC1026r0, long j3, EnumC4243m enumC4243m, float f3, C2435d c2435d) {
        this.f7995a = interfaceC1026r0;
        this.f7996b = j3;
        this.f7997c = enumC4243m;
        this.f7998d = f3;
        this.f7999e = c2435d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2432a)) {
            return false;
        }
        C2432a c2432a = (C2432a) obj;
        return AbstractC1416l.m3825a(this.f7995a, c2432a.f7995a) && C0810e.m2054a(this.f7996b, c2432a.f7996b) && this.f7997c == c2432a.f7997c && Float.compare(this.f7998d, c2432a.f7998d) == 0 && AbstractC1416l.m3825a(this.f7999e, c2432a.f7999e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2241d = AbstractC0921a.m2241d(this.f7998d, (this.f7997c.hashCode() + AbstractC0921a.m2243f(this.f7995a.hashCode() * 31, 31, this.f7996b)) * 31, 31);
        C2435d c2435d = this.f7999e;
        return iM2241d + (c2435d == null ? 0 : c2435d.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ShadowKey(shape=" + this.f7995a + ", size=" + ((Object) C0810e.m2057d(this.f7996b)) + ", layoutDirection=" + this.f7997c + ", density=" + this.f7998d + ", shadow=" + this.f7999e + ')';
    }
}
