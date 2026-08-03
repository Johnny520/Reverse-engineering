package p233pd;

import p302ud.C4320p;
import p332wb.AbstractC4855en;
import p351xe.C5796q;

/* JADX INFO: renamed from: pd.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3393d extends C4320p {

    /* JADX INFO: renamed from: o */
    public final String f10930o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3393d(String str) {
        super(EnumC3400k.f10978h, 0);
        this.f10930o = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3393d c3393d = new C3393d(this.f10930o);
        m8681P(c3393d);
        return c3393d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if ((c4320p instanceof C3393d) && super.mo7168Y(c4320p)) {
            return this.f10930o.equals(((C3393d) c4320p).f10930o);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        return AbstractC4855en.m9264h(super.toString(), " ", C5796q.f23542b.m10506i(this.f10930o));
    }
}
