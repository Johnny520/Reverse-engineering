package p246qd;

import okhttp3.HttpUrl;

/* JADX INFO: renamed from: qd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3497a extends AbstractC3500d {

    /* JADX INFO: renamed from: L */
    public static final EnumC3513q[] f11364L = {EnumC3513q.ARRAY};

    /* JADX INFO: renamed from: K */
    public final AbstractC3506j f11365K;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3497a(AbstractC3506j abstractC3506j) {
        this.f11365K = abstractC3506j;
        this.f11410a = abstractC3506j.f11410a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3500d, p246qd.AbstractC3506j
    /* JADX INFO: renamed from: A */
    public final AbstractC3506j mo7338A() {
        return new C3497a(this.f11365K.mo7338A());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: f */
    public final int mo7339f() {
        return this.f11365K.mo7339f() + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: g */
    public final AbstractC3506j mo7340g() {
        return this.f11365K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: h */
    public final AbstractC3506j mo7341h() {
        return this.f11365K.mo7341h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3500d, p246qd.AbstractC3506j
    /* JADX INFO: renamed from: n */
    public final EnumC3513q[] mo7342n() {
        return f11364L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: o */
    public final EnumC3513q mo7343o() {
        return EnumC3513q.ARRAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: s */
    public final boolean mo7344s(Object obj) {
        return this.f11365K.equals(((C3497a) obj).f11365K);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    public final String toString() {
        return String.valueOf(this.f11365K).concat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3500d, p246qd.AbstractC3506j
    /* JADX INFO: renamed from: w */
    public final boolean mo7345w() {
        return this.f11365K.mo7345w();
    }
}
