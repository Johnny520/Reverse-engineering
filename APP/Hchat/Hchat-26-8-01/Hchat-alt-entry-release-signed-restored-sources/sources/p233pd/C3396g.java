package p233pd;

import p246qd.AbstractC3506j;
import p302ud.C4320p;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: pd.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3396g extends C4320p {

    /* JADX INFO: renamed from: o */
    public final AbstractC3506j f10941o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3396g(int i9, AbstractC3506j abstractC3506j) {
        super(EnumC3400k.f10954F, i9);
        this.f10941o = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3396g c3396g = new C3396g(this.f14398m.size(), this.f10941o);
        m8681P(c3396g);
        return c3396g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        return (c4320p instanceof C3396g) && super.mo7168Y(c4320p) && this.f10941o == ((C3396g) c4320p).f10941o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        return AbstractC4855en.m9264h(super.toString(), " elemType: ", String.valueOf(this.f10941o));
    }
}
