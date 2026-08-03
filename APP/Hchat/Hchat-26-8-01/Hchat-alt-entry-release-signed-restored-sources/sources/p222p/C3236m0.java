package p222p;

import p099h.AbstractC1495x0;
import p293u2.AbstractC4232b;
import p293u2.AbstractC4239i;
import p293u2.C4231a;
import p308v1.InterfaceC4409m0;
import p339x1.AbstractC5628n0;

/* JADX INFO: renamed from: p.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3236m0 extends AbstractC1495x0 {

    /* JADX INFO: renamed from: v */
    public EnumC3239n0 f10322v;

    /* JADX INFO: renamed from: w */
    public boolean f10323w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0, p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: K0 */
    public final int mo1346K0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return this.f10322v == EnumC3239n0.f10329g ? interfaceC4409m0.mo8833p0(i9) : interfaceC4409m0.mo8832j(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0, p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: R0 */
    public final int mo1348R0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return this.f10322v == EnumC3239n0.f10329g ? interfaceC4409m0.mo8833p0(i9) : interfaceC4409m0.mo8832j(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0
    /* JADX INFO: renamed from: k1 */
    public final long mo4006k1(InterfaceC4409m0 interfaceC4409m0, long j3) {
        int iMo8833p0 = this.f10322v == EnumC3239n0.f10329g ? interfaceC4409m0.mo8833p0(C4231a.m8504h(j3)) : interfaceC4409m0.mo8832j(C4231a.m8504h(j3));
        if (iMo8833p0 < 0) {
            iMo8833p0 = 0;
        }
        if (iMo8833p0 < 0) {
            AbstractC4239i.m8525a("height must be >= 0");
        }
        return AbstractC4232b.m8515h(0, Integer.MAX_VALUE, iMo8833p0, iMo8833p0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0
    /* JADX INFO: renamed from: l1 */
    public final boolean mo4007l1() {
        return this.f10323w;
    }
}
