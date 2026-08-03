package p116i;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: i.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1791t0 implements InterfaceC1774n1 {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1774n1 f5976g;

    /* JADX INFO: renamed from: h */
    public final long f5977h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1791t0(InterfaceC1774n1 interfaceC1774n1, long j3) {
        this.f5976g = interfaceC1774n1;
        this.f5977h = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: a */
    public final boolean mo594a() {
        return this.f5976g.mo594a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: b */
    public final long mo595b(AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return this.f5976g.mo595b(abstractC1781q, abstractC1781q2, abstractC1781q3) + this.f5977h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1791t0)) {
            return false;
        }
        C1791t0 c1791t0 = (C1791t0) obj;
        return c1791t0.f5977h == this.f5977h && AbstractC1416l.m3825a(c1791t0.f5976g, this.f5976g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f5977h) + (this.f5976g.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: n */
    public final AbstractC1781q mo607n(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        long j4 = this.f5977h;
        return j3 < j4 ? abstractC1781q3 : this.f5976g.mo607n(j3 - j4, abstractC1781q, abstractC1781q2, abstractC1781q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: w */
    public final AbstractC1781q mo612w(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        long j4 = this.f5977h;
        return j3 < j4 ? abstractC1781q : this.f5976g.mo612w(j3 - j4, abstractC1781q, abstractC1781q2, abstractC1781q3);
    }
}
