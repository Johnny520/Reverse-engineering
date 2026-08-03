package p222p;

import p099h.AbstractC1495x0;
import p293u2.AbstractC4232b;
import p293u2.AbstractC4239i;
import p293u2.C4231a;
import p308v1.InterfaceC4409m0;
import p339x1.AbstractC5628n0;

/* JADX INFO: renamed from: p.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3245p0 extends AbstractC1495x0 {

    /* JADX INFO: renamed from: v */
    public EnumC3239n0 f10346v;

    /* JADX INFO: renamed from: w */
    public boolean f10347w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0, p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: G */
    public final int mo1345G(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return this.f10346v == EnumC3239n0.f10329g ? interfaceC4409m0.mo8829G(i9) : interfaceC4409m0.mo8830M(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0, p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: Q */
    public final int mo1347Q(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return this.f10346v == EnumC3239n0.f10329g ? interfaceC4409m0.mo8829G(i9) : interfaceC4409m0.mo8830M(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0
    /* JADX INFO: renamed from: k1 */
    public final long mo4006k1(InterfaceC4409m0 interfaceC4409m0, long j3) {
        int iMo8829G = this.f10346v == EnumC3239n0.f10329g ? interfaceC4409m0.mo8829G(C4231a.m8503g(j3)) : interfaceC4409m0.mo8830M(C4231a.m8503g(j3));
        if (iMo8829G < 0) {
            iMo8829G = 0;
        }
        if (iMo8829G < 0) {
            AbstractC4239i.m8525a("width must be >= 0");
        }
        return AbstractC4232b.m8515h(iMo8829G, iMo8829G, 0, Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0
    /* JADX INFO: renamed from: l1 */
    public final boolean mo4007l1() {
        return this.f10347w;
    }
}
