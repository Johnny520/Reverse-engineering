package p233pd;

import p246qd.AbstractC3506j;
import p302ud.C4320p;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: pd.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3405p extends C4320p {

    /* JADX INFO: renamed from: o */
    public final AbstractC3506j f11008o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3405p(int i9, AbstractC3506j abstractC3506j) {
        super(EnumC3400k.f10957I, i9);
        this.f11008o = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3405p c3405p = new C3405p(this.f14398m.size(), this.f11008o);
        m8681P(c3405p);
        return c3405p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        return (c4320p instanceof C3405p) && super.mo7168Y(c4320p) && this.f11008o == ((C3405p) c4320p).f11008o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        return AbstractC4855en.m9264h(super.toString(), " type: ", String.valueOf(this.f11008o));
    }
}
