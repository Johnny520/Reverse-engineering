package p311v4;

/* JADX INFO: renamed from: v4.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4470s extends AbstractC4472u {

    /* JADX INFO: renamed from: g */
    public final int f14817g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4470s(int i9) {
        this.f14817g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public final int mo8896e(AbstractC4446a abstractC4446a) {
        int i9 = ((AbstractC4470s) abstractC4446a).f14817g;
        int i10 = this.f14817g;
        if (i10 < i9) {
            return -1;
        }
        return i10 > i9 ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f14817g == ((AbstractC4470s) obj).f14817g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14817g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: i */
    public final boolean mo8897i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4472u
    /* JADX INFO: renamed from: k */
    public final boolean mo8912k() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4472u
    /* JADX INFO: renamed from: l */
    public final int mo8913l() {
        return this.f14817g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4472u
    /* JADX INFO: renamed from: m */
    public final long mo8914m() {
        return this.f14817g;
    }
}
