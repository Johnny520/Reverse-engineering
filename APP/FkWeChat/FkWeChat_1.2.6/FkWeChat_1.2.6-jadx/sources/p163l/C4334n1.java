package p163l;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l.n1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4334n1 implements InterfaceC4341o3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4341o3 f12668a;

    /* JADX INFO: renamed from: b */
    public final long f12669b;

    public C4334n1(InterfaceC4341o3 interfaceC4341o3, long j10) {
        this.f12668a = interfaceC4341o3;
        this.f12669b = j10;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: a */
    public boolean mo17002a() {
        return this.f12668a.mo17002a();
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: b */
    public long mo17003b(AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        return this.f12668a.mo17003b(abstractC4357s, abstractC4357s2, abstractC4357s3) + this.f12669b;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: d */
    public AbstractC4357s mo16779d(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        long j11 = this.f12669b;
        return j10 < j11 ? abstractC4357s : this.f12668a.mo16779d(j10 - j11, abstractC4357s, abstractC4357s2, abstractC4357s3);
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: e */
    public AbstractC4357s mo16780e(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        long j11 = this.f12669b;
        return j10 < j11 ? abstractC4357s3 : this.f12668a.mo16780e(j10 - j11, abstractC4357s, abstractC4357s2, abstractC4357s3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4334n1)) {
            return false;
        }
        C4334n1 c4334n1 = (C4334n1) obj;
        return c4334n1.f12669b == this.f12669b && AbstractC1061t.m3842c(c4334n1.f12668a, this.f12668a);
    }

    public int hashCode() {
        return (this.f12668a.hashCode() * 31) + Long.hashCode(this.f12669b);
    }
}
