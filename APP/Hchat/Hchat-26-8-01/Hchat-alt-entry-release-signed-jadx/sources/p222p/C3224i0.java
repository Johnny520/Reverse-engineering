package p222p;

import p293u2.AbstractC4232b;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5651v;
import tf.C4174u;

/* JADX INFO: renamed from: p.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3224i0 extends AbstractC3212e0 implements InterfaceC5651v {

    /* JADX INFO: renamed from: w */
    public InterfaceC3252r1 f10292w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3224i0(InterfaceC3252r1 interfaceC3252r1) {
        this.f10292w = interfaceC3252r1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        int iMo6856c = this.f10263v.mo6856c(interfaceC4418p0, interfaceC4418p0.getLayoutDirection()) - this.f10262u.mo6856c(interfaceC4418p0, interfaceC4418p0.getLayoutDirection());
        int iMo6857d = this.f10263v.mo6857d(interfaceC4418p0) - this.f10262u.mo6857d(interfaceC4418p0);
        int iMo6854a = (this.f10263v.mo6854a(interfaceC4418p0, interfaceC4418p0.getLayoutDirection()) - this.f10262u.mo6854a(interfaceC4418p0, interfaceC4418p0.getLayoutDirection())) + iMo6856c;
        int iMo6855b = (this.f10263v.mo6855b(interfaceC4418p0) - this.f10262u.mo6855b(interfaceC4418p0)) + iMo6857d;
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC4232b.m8516i(-iMo6854a, -iMo6855b, j3));
        return interfaceC4418p0.mo8010z(AbstractC4232b.m8514g(abstractC4377b1Mo8831Q.f14593g + iMo6854a, j3), AbstractC4232b.m8513f(abstractC4377b1Mo8831Q.f14594h + iMo6855b, j3), C4174u.f13711g, new C3221h0(abstractC4377b1Mo8831Q, iMo6856c, iMo6857d, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.AbstractC3212e0
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC3252r1 mo6894k1(InterfaceC3252r1 interfaceC3252r1) {
        return new C3234l1(interfaceC3252r1, this.f10292w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.AbstractC3212e0
    /* JADX INFO: renamed from: l1 */
    public final void mo6895l1() {
        super.mo6895l1();
        AbstractC5618k.m10157m(this);
    }
}
