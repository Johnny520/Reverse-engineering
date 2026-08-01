package p163l;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: l.v3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4376v3 implements InterfaceC4341o3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4356r3 f12800a;

    /* JADX INFO: renamed from: b */
    public final EnumC4299g1 f12801b;

    /* JADX INFO: renamed from: c */
    public final long f12802c;

    /* JADX INFO: renamed from: d */
    public final long f12803d;

    public C4376v3(InterfaceC4356r3 interfaceC4356r3, EnumC4299g1 enumC4299g1, long j10) {
        this.f12800a = interfaceC4356r3;
        this.f12801b = enumC4299g1;
        this.f12802c = ((long) (interfaceC4356r3.mo16781f() + interfaceC4356r3.mo16782g())) * 1000000;
        this.f12803d = j10 * 1000000;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: a */
    public boolean mo17002a() {
        return true;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: b */
    public long mo17003b(AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        return Long.MAX_VALUE;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: d */
    public AbstractC4357s mo16779d(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        return this.f12800a.mo16779d(m17135h(j10), abstractC4357s, abstractC4357s2, m17136i(j10, abstractC4357s, abstractC4357s3, abstractC4357s2));
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: e */
    public AbstractC4357s mo16780e(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        return this.f12800a.mo16780e(m17135h(j10), abstractC4357s, abstractC4357s2, m17136i(j10, abstractC4357s, abstractC4357s3, abstractC4357s2));
    }

    /* JADX INFO: renamed from: h */
    public final long m17135h(long j10) {
        long j11 = this.f12803d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f12802c;
        long j14 = j12 / j13;
        return (this.f12801b == EnumC4299g1.f12621q || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC4357s m17136i(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        long j11 = this.f12803d;
        long j12 = j10 + j11;
        long j13 = this.f12802c;
        return j12 > j13 ? this.f12800a.mo16780e(j13 - j11, abstractC4357s, abstractC4357s3, abstractC4357s2) : abstractC4357s2;
    }

    public /* synthetic */ C4376v3(InterfaceC4356r3 interfaceC4356r3, EnumC4299g1 enumC4299g1, long j10, AbstractC1043k abstractC1043k) {
        this(interfaceC4356r3, enumC4299g1, j10);
    }
}
