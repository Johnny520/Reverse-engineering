package p247qe;

import p025bc.AbstractC0255e;
import p074f5.C1071g;
import p233pd.C3399j;
import p246qd.AbstractC3506j;
import p302ud.C4325u;

/* JADX INFO: renamed from: qe.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3523f implements InterfaceC3522e {

    /* JADX INFO: renamed from: a */
    public final C4325u f11462a;

    /* JADX INFO: renamed from: b */
    public final C3399j f11463b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3523f(C4325u c4325u, C3399j c3399j) {
        this.f11462a = c4325u;
        this.f11463b = c3399j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3522e
    /* JADX INFO: renamed from: a */
    public final AbstractC3506j mo7425a(C1071g c1071g) {
        C3399j c3399j = this.f11463b;
        AbstractC3506j abstractC3506jM2699b = c1071g.m2699b(c3399j.mo7179S(0));
        AbstractC3506j abstractC3506j = (AbstractC3506j) c3399j.f10948o;
        return this.f11462a.f14441g.f11519c.m7432d(abstractC3506jM2699b, abstractC3506j).m7435c() ? abstractC3506jM2699b : abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    /* JADX INFO: renamed from: b */
    public final int mo7424b() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    public final AbstractC3506j getType() {
        C3399j c3399j = this.f11463b;
        AbstractC3506j abstractC3506jMo7375I = c3399j.mo7179S(0).mo7375I();
        AbstractC3506j abstractC3506j = (AbstractC3506j) c3399j.f10948o;
        return this.f11462a.f14441g.f11519c.m7432d(abstractC3506jMo7375I, abstractC3506j).m7435c() ? abstractC3506jMo7375I : abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C3399j c3399j = this.f11463b;
        return AbstractC0255e.m1022k("CHECK_CAST_ASSIGN{(", String.valueOf(c3399j.f10948o), ") ", String.valueOf(c3399j.mo7179S(0).mo7375I()), "}");
    }
}
