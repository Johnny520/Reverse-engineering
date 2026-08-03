package p116i;

/* JADX INFO: renamed from: i.r1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1786r1 implements InterfaceC1774n1 {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1780p1 f5954g;

    /* JADX INFO: renamed from: h */
    public final EnumC1779p0 f5955h;

    /* JADX INFO: renamed from: i */
    public final long f5956i;

    /* JADX INFO: renamed from: j */
    public final long f5957j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1786r1(InterfaceC1780p1 interfaceC1780p1, EnumC1779p0 enumC1779p0, long j3) {
        this.f5954g = interfaceC1780p1;
        this.f5955h = enumC1779p0;
        this.f5956i = ((long) (interfaceC1780p1.mo4432v() + interfaceC1780p1.mo4431s())) * 1000000;
        this.f5957j = j3 * 1000000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: a */
    public final boolean mo594a() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: b */
    public final long mo595b(AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final long m4437c(long j3) {
        long j4 = this.f5957j;
        if (j3 + j4 <= 0) {
            return 0L;
        }
        long j5 = j3 + j4;
        long j10 = this.f5956i;
        long j11 = j5 / j10;
        return (this.f5955h == EnumC1779p0.f5928g || j11 % ((long) 2) == 0) ? j5 - (j11 * j10) : ((j11 + 1) * j10) - j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC1781q m4438d(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        long j4 = this.f5957j;
        long j5 = j3 + j4;
        long j10 = this.f5956i;
        return j5 > j10 ? this.f5954g.mo607n(j10 - j4, abstractC1781q, abstractC1781q3, abstractC1781q2) : abstractC1781q2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: n */
    public final AbstractC1781q mo607n(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return this.f5954g.mo607n(m4437c(j3), abstractC1781q, abstractC1781q2, m4438d(j3, abstractC1781q, abstractC1781q3, abstractC1781q2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: w */
    public final AbstractC1781q mo612w(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return this.f5954g.mo612w(m4437c(j3), abstractC1781q, abstractC1781q2, m4438d(j3, abstractC1781q, abstractC1781q3, abstractC1781q2));
    }
}
