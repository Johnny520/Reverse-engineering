package p254r5;

/* JADX INFO: renamed from: r5.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6515t extends AbstractC6516u {

    /* JADX INFO: renamed from: q */
    public final long f20436q;

    public AbstractC6515t(long j10) {
        this.f20436q = j10;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        long j10 = ((AbstractC6515t) abstractC6487a).f20436q;
        long j11 = this.f20436q;
        if (j11 < j10) {
            return -1;
        }
        return j11 > j10 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.f20436q == ((AbstractC6515t) obj).f20436q;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public final boolean mo25728h() {
        return true;
    }

    public final int hashCode() {
        long j10 = this.f20436q;
        return ((int) (j10 >> 32)) ^ ((int) j10);
    }

    @Override // p254r5.AbstractC6516u
    /* JADX INFO: renamed from: p */
    public final boolean mo25795p() {
        long j10 = this.f20436q;
        return ((long) ((int) j10)) == j10;
    }

    @Override // p254r5.AbstractC6516u
    /* JADX INFO: renamed from: s */
    public final int mo25796s() {
        return (int) this.f20436q;
    }

    @Override // p254r5.AbstractC6516u
    /* JADX INFO: renamed from: t */
    public final long mo25797t() {
        return this.f20436q;
    }
}
