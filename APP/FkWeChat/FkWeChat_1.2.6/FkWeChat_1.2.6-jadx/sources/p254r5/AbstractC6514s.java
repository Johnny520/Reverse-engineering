package p254r5;

/* JADX INFO: renamed from: r5.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6514s extends AbstractC6516u {

    /* JADX INFO: renamed from: q */
    public final int f20435q;

    public AbstractC6514s(int i10) {
        this.f20435q = i10;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        int i10 = ((AbstractC6514s) abstractC6487a).f20435q;
        int i11 = this.f20435q;
        if (i11 < i10) {
            return -1;
        }
        return i11 > i10 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.f20435q == ((AbstractC6514s) obj).f20435q;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public final boolean mo25728h() {
        return false;
    }

    public final int hashCode() {
        return this.f20435q;
    }

    @Override // p254r5.AbstractC6516u
    /* JADX INFO: renamed from: p */
    public final boolean mo25795p() {
        return true;
    }

    @Override // p254r5.AbstractC6516u
    /* JADX INFO: renamed from: s */
    public final int mo25796s() {
        return this.f20435q;
    }

    @Override // p254r5.AbstractC6516u
    /* JADX INFO: renamed from: t */
    public final long mo25797t() {
        return this.f20435q;
    }
}
