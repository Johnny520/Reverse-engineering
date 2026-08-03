package p253r1;

import gg.AbstractC1416l;
import p041d1.C0655c0;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: r1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3648e extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3644a f11833a;

    /* JADX INFO: renamed from: b */
    public final C3647d f11834b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3648e(InterfaceC3644a interfaceC3644a, C3647d c3647d) {
        this.f11833a = interfaceC3644a;
        this.f11834b = c3647d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3648e)) {
            return false;
        }
        C3648e c3648e = (C3648e) obj;
        return AbstractC1416l.m3825a(c3648e.f11833a, this.f11833a) && AbstractC1416l.m3825a(c3648e.f11834b, this.f11834b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C3652i(this.f11833a, this.f11834b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3652i c3652i = (C3652i) abstractC5852n;
        c3652i.f11844u = this.f11833a;
        C3647d c3647d = c3652i.f11845v;
        if (c3647d.f11829a == c3652i) {
            c3647d.f11829a = null;
        }
        C3647d c3647d2 = this.f11834b;
        if (c3647d2 == null) {
            c3652i.f11845v = new C3647d();
        } else if (!c3647d2.equals(c3647d)) {
            c3652i.f11845v = c3647d2;
        }
        if (c3652i.f23801t) {
            C3647d c3647d3 = c3652i.f11845v;
            c3647d3.f11829a = c3652i;
            c3647d3.f11830b = null;
            c3652i.f11846w = null;
            c3647d3.f11831c = new C0655c0(c3652i, 13);
            c3647d3.f11832d = c3652i.m10550Y0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f11833a.hashCode() * 31;
        C3647d c3647d = this.f11834b;
        return iHashCode + (c3647d != null ? c3647d.hashCode() : 0);
    }
}
