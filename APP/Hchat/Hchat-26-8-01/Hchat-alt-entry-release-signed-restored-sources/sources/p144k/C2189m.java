package p144k;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p071f1.AbstractC1027s;
import p071f1.C1006h0;
import p071f1.C1034w;
import p071f1.InterfaceC1026r0;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C2189m extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final long f7264a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1027s f7265b;

    /* JADX INFO: renamed from: c */
    public final float f7266c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1026r0 f7267d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2189m(long j3, C1006h0 c1006h0, InterfaceC1026r0 interfaceC1026r0, int i9) {
        j3 = (i9 & 1) != 0 ? C1034w.f3263g : j3;
        c1006h0 = (i9 & 2) != 0 ? null : c1006h0;
        this.f7264a = j3;
        this.f7265b = c1006h0;
        this.f7266c = 1.0f;
        this.f7267d = interfaceC1026r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        C2189m c2189m = obj instanceof C2189m ? (C2189m) obj : null;
        return c2189m != null && C1034w.m2635c(this.f7264a, c2189m.f7264a) && AbstractC1416l.m3825a(this.f7265b, c2189m.f7265b) && this.f7266c == c2189m.f7266c && AbstractC1416l.m3825a(this.f7267d, c2189m.f7267d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C2195o c2195o = new C2195o();
        c2195o.f7278u = this.f7264a;
        c2195o.f7279v = this.f7265b;
        c2195o.f7280w = this.f7266c;
        c2195o.f7281x = this.f7267d;
        c2195o.f7282y = 9205357640488583168L;
        return c2195o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C2195o c2195o = (C2195o) abstractC5852n;
        c2195o.f7278u = this.f7264a;
        c2195o.f7279v = this.f7265b;
        c2195o.f7280w = this.f7266c;
        InterfaceC1026r0 interfaceC1026r0 = c2195o.f7281x;
        InterfaceC1026r0 interfaceC1026r02 = this.f7267d;
        if (!AbstractC1416l.m3825a(interfaceC1026r0, interfaceC1026r02)) {
            c2195o.f7281x = interfaceC1026r02;
            AbstractC5618k.m10158n(c2195o);
        }
        AbstractC5618k.m10156l(c2195o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        int iHashCode = Long.hashCode(this.f7264a) * 31;
        AbstractC1027s abstractC1027s = this.f7265b;
        return this.f7267d.hashCode() + AbstractC0921a.m2241d(this.f7266c, (iHashCode + (abstractC1027s != null ? abstractC1027s.hashCode() : 0)) * 31, 31);
    }
}
