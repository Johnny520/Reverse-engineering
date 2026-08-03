package p116i;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: i.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1788s0 implements InterfaceC1763k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1763k f5964a;

    /* JADX INFO: renamed from: b */
    public final long f5965b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1788s0(InterfaceC1803y interfaceC1803y, long j3) {
        this.f5964a = interfaceC1803y;
        this.f5965b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1763k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1774n1 mo4363a(C1771m1 c1771m1) {
        return new C1791t0(this.f5964a.mo4363a(c1771m1), this.f5965b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1788s0)) {
            return false;
        }
        C1788s0 c1788s0 = (C1788s0) obj;
        return c1788s0.f5965b == this.f5965b && AbstractC1416l.m3825a(c1788s0.f5964a, this.f5964a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f5965b) + (this.f5964a.hashCode() * 31);
    }
}
