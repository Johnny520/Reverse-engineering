package p222p;

import gg.AbstractC1416l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;
import p356y0.InterfaceC5841c;

/* JADX INFO: renamed from: p.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3229k extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5841c f10307a;

    /* JADX INFO: renamed from: b */
    public final boolean f10308b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3229k(InterfaceC5841c interfaceC5841c, boolean z9) {
        this.f10307a = interfaceC5841c;
        this.f10308b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3229k c3229k = obj instanceof C3229k ? (C3229k) obj : null;
        return c3229k != null && AbstractC1416l.m3825a(this.f10307a, c3229k.f10307a) && this.f10308b == c3229k.f10308b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3232l c3232l = new C3232l();
        c3232l.f10315u = this.f10307a;
        c3232l.f10316v = this.f10308b;
        return c3232l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3232l c3232l = (C3232l) abstractC5852n;
        c3232l.f10315u = this.f10307a;
        c3232l.f10316v = this.f10308b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f10308b) + (this.f10307a.hashCode() * 31);
    }
}
