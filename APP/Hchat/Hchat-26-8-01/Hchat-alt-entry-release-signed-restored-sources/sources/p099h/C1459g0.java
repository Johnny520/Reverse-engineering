package p099h;

import gg.AbstractC1416l;
import p085fg.InterfaceC1220a;
import p116i.C1744d1;
import p116i.C1765k1;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: h.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C1459g0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C1765k1 f4843a;

    /* JADX INFO: renamed from: b */
    public final C1744d1 f4844b;

    /* JADX INFO: renamed from: c */
    public final C1744d1 f4845c;

    /* JADX INFO: renamed from: d */
    public final C1744d1 f4846d;

    /* JADX INFO: renamed from: e */
    public final C1483r0 f4847e;

    /* JADX INFO: renamed from: f */
    public final C1485s0 f4848f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1220a f4849g;

    /* JADX INFO: renamed from: h */
    public final C1462h0 f4850h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1459g0(C1765k1 c1765k1, C1744d1 c1744d1, C1744d1 c1744d12, C1744d1 c1744d13, C1483r0 c1483r0, C1485s0 c1485s0, InterfaceC1220a interfaceC1220a, C1462h0 c1462h0) {
        this.f4843a = c1765k1;
        this.f4844b = c1744d1;
        this.f4845c = c1744d12;
        this.f4846d = c1744d13;
        this.f4847e = c1483r0;
        this.f4848f = c1485s0;
        this.f4849g = interfaceC1220a;
        this.f4850h = c1462h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1459g0)) {
            return false;
        }
        C1459g0 c1459g0 = (C1459g0) obj;
        return c1459g0.f4843a.equals(this.f4843a) && AbstractC1416l.m3825a(c1459g0.f4844b, this.f4844b) && AbstractC1416l.m3825a(c1459g0.f4845c, this.f4845c) && AbstractC1416l.m3825a(c1459g0.f4846d, this.f4846d) && c1459g0.f4847e.equals(this.f4847e) && AbstractC1416l.m3825a(c1459g0.f4848f, this.f4848f) && c1459g0.f4849g == this.f4849g && AbstractC1416l.m3825a(c1459g0.f4850h, this.f4850h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C1481q0(this.f4843a, this.f4844b, this.f4845c, this.f4846d, this.f4847e, this.f4848f, this.f4849g, this.f4850h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C1481q0 c1481q0 = (C1481q0) abstractC5852n;
        c1481q0.f4918v = this.f4843a;
        c1481q0.f4919w = this.f4844b;
        c1481q0.f4920x = this.f4845c;
        c1481q0.f4921y = this.f4846d;
        c1481q0.f4922z = this.f4847e;
        c1481q0.f4911A = this.f4848f;
        c1481q0.f4912B = this.f4849g;
        c1481q0.f4913C = this.f4850h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f4843a.hashCode() * 31;
        C1744d1 c1744d1 = this.f4844b;
        int iHashCode2 = (iHashCode + (c1744d1 != null ? c1744d1.hashCode() : 0)) * 31;
        C1744d1 c1744d12 = this.f4845c;
        int iHashCode3 = (iHashCode2 + (c1744d12 != null ? c1744d12.hashCode() : 0)) * 31;
        C1744d1 c1744d13 = this.f4846d;
        return this.f4850h.hashCode() + ((this.f4849g.hashCode() + ((this.f4848f.f4934a.hashCode() + ((this.f4847e.f4927a.hashCode() + ((iHashCode3 + (c1744d13 != null ? c1744d13.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
