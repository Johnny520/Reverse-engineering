package p246qd;

/* JADX INFO: renamed from: qd.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3501e extends AbstractC3500d {

    /* JADX INFO: renamed from: K */
    public final String f11369K;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3501e(String str) {
        this.f11369K = str;
        this.f11410a = str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: l */
    public final String mo7350l() {
        return this.f11369K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: o */
    public final EnumC3513q mo7343o() {
        return EnumC3513q.OBJECT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: s */
    public boolean mo7344s(Object obj) {
        return this.f11369K.equals(((C3501e) obj).f11369K);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    public String toString() {
        return this.f11369K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: v */
    public final boolean mo7351v() {
        return true;
    }
}
