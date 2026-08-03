package p246qd;

/* JADX INFO: renamed from: qd.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3503g extends AbstractC3500d {

    /* JADX INFO: renamed from: K */
    public final EnumC3513q f11372K;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3503g(EnumC3513q enumC3513q) {
        this.f11372K = enumC3513q;
        this.f11410a = enumC3513q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: o */
    public final EnumC3513q mo7343o() {
        return this.f11372K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: s */
    public final boolean mo7344s(Object obj) {
        return this.f11372K == ((C3503g) obj).f11372K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    public final String toString() {
        return this.f11372K.f11437h;
    }
}
