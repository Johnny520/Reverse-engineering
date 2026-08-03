package p101h1;

import gg.AbstractC1416l;
import p057e1.C0810e;
import p071f1.InterfaceC1031u;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: h1.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1564a {

    /* JADX INFO: renamed from: a */
    public InterfaceC4233c f5215a;

    /* JADX INFO: renamed from: b */
    public EnumC4243m f5216b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1031u f5217c;

    /* JADX INFO: renamed from: d */
    public long f5218d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1564a)) {
            return false;
        }
        C1564a c1564a = (C1564a) obj;
        return AbstractC1416l.m3825a(this.f5215a, c1564a.f5215a) && this.f5216b == c1564a.f5216b && AbstractC1416l.m3825a(this.f5217c, c1564a.f5217c) && C0810e.m2054a(this.f5218d, c1564a.f5218d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f5218d) + ((this.f5217c.hashCode() + ((this.f5216b.hashCode() + (this.f5215a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DrawParams(density=" + this.f5215a + ", layoutDirection=" + this.f5216b + ", canvas=" + this.f5217c + ", size=" + ((Object) C0810e.m2057d(this.f5218d)) + ')';
    }
}
