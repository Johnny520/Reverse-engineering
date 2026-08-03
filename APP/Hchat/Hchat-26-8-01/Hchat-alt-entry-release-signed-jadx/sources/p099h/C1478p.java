package p099h;

import gg.AbstractC1416l;
import p116i.C1744d1;
import p117i0.InterfaceC1809a1;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: h.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C1478p<S> extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C1744d1 f4903a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1809a1 f4904b;

    /* JADX INFO: renamed from: c */
    public final C1486t f4905c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1478p(C1744d1 c1744d1, InterfaceC1809a1 interfaceC1809a1, C1486t c1486t) {
        this.f4903a = c1744d1;
        this.f4904b = interfaceC1809a1;
        this.f4905c = c1486t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1478p)) {
            return false;
        }
        C1478p c1478p = (C1478p) obj;
        return AbstractC1416l.m3825a(c1478p.f4903a, this.f4903a) && c1478p.f4904b.equals(this.f4904b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C1484s c1484s = new C1484s(0);
        c1484s.f4928v = this.f4903a;
        c1484s.f4929w = this.f4904b;
        c1484s.f4930x = this.f4905c;
        c1484s.f4931y = AbstractC1468k.f4881a;
        return c1484s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C1484s c1484s = (C1484s) abstractC5852n;
        c1484s.f4928v = this.f4903a;
        c1484s.f4929w = this.f4904b;
        c1484s.f4930x = this.f4905c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f4905c.hashCode() * 31;
        C1744d1 c1744d1 = this.f4903a;
        return this.f4904b.hashCode() + ((iHashCode + (c1744d1 != null ? c1744d1.hashCode() : 0)) * 31);
    }
}
