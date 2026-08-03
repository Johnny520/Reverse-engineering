package p246qd;

import java.util.Objects;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: qd.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3505i extends C3501e {

    /* JADX INFO: renamed from: L */
    public final AbstractC3506j f11374L;

    /* JADX INFO: renamed from: M */
    public final int f11375M;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3505i(int i9, AbstractC3506j abstractC3506j) {
        super(AbstractC3506j.f11394k.f11369K);
        Objects.requireNonNull(abstractC3506j);
        this.f11374L = abstractC3506j;
        if (i9 == 0) {
            throw null;
        }
        this.f11375M = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: q */
    public final int mo7355q() {
        return this.f11375M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: r */
    public final AbstractC3506j mo7356r() {
        return this.f11374L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.C3501e, p246qd.AbstractC3506j
    /* JADX INFO: renamed from: s */
    public final boolean mo7344s(Object obj) {
        if (!super.mo7344s(obj)) {
            return false;
        }
        C3505i c3505i = (C3505i) obj;
        return this.f11375M == c3505i.f11375M && this.f11374L.equals(c3505i.f11374L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: t */
    public final boolean mo7354t() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.C3501e, p246qd.AbstractC3506j
    public final String toString() {
        int i9 = this.f11375M;
        return i9 == 2 ? AbstractC3199a.m6831d(i9) : AbstractC3199a.m6831d(i9).concat(String.valueOf(this.f11374L));
    }
}
