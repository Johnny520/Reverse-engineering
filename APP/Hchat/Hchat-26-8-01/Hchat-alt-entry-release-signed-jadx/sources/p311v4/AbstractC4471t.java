package p311v4;

/* JADX INFO: renamed from: v4.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4471t extends AbstractC4472u {

    /* JADX INFO: renamed from: g */
    public final long f14818g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4471t(long j3) {
        this.f14818g = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public final int mo8896e(AbstractC4446a abstractC4446a) {
        long j3 = ((AbstractC4471t) abstractC4446a).f14818g;
        long j4 = this.f14818g;
        if (j4 < j3) {
            return -1;
        }
        return j4 > j3 ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f14818g == ((AbstractC4471t) obj).f14818g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long j3 = this.f14818g;
        return ((int) (j3 >> 32)) ^ ((int) j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: i */
    public final boolean mo8897i() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4472u
    /* JADX INFO: renamed from: k */
    public final boolean mo8912k() {
        long j3 = this.f14818g;
        return ((long) ((int) j3)) == j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4472u
    /* JADX INFO: renamed from: l */
    public final int mo8913l() {
        return (int) this.f14818g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4472u
    /* JADX INFO: renamed from: m */
    public final long mo8914m() {
        return this.f14818g;
    }
}
