package p233pd;

import p246qd.AbstractC3506j;
import p302ud.C4320p;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: pd.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3392c extends C4320p {

    /* JADX INFO: renamed from: o */
    public final AbstractC3506j f10929o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3392c(AbstractC3506j abstractC3506j) {
        super(EnumC3400k.f10979i, 0);
        this.f10929o = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3392c c3392c = new C3392c(this.f10929o);
        m8681P(c3392c);
        return c3392c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if ((c4320p instanceof C3392c) && super.mo7168Y(c4320p)) {
            return this.f10929o.equals(((C3392c) c4320p).f10929o);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        return AbstractC4855en.m9265i(super.toString(), " ", String.valueOf(this.f10929o), ".class");
    }
}
