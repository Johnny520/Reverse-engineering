package p222p;

import p234q.AbstractC3418a;
import p293u2.AbstractC4232b;
import p293u2.C4236f;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import tf.C4174u;

/* JADX INFO: renamed from: p.a1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3201a1 extends AbstractC5852n implements InterfaceC5651v {

    /* JADX INFO: renamed from: u */
    public InterfaceC3268x0 f10235u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        float fMo6925d = this.f10235u.mo6925d(interfaceC4418p0.getLayoutDirection());
        float fMo6924c = this.f10235u.mo6924c();
        float fMo6923b = this.f10235u.mo6923b(interfaceC4418p0.getLayoutDirection());
        float fMo6922a = this.f10235u.mo6922a();
        float f3 = 0;
        if (!((C4236f.m8519a(fMo6922a, f3) >= 0) & (C4236f.m8519a(fMo6925d, f3) >= 0) & (C4236f.m8519a(fMo6924c, f3) >= 0) & (C4236f.m8519a(fMo6923b, f3) >= 0))) {
            AbstractC3418a.m7194a("Padding must be non-negative");
        }
        int iMo1590G0 = interfaceC4418p0.mo1590G0(fMo6925d);
        int iMo1590G02 = interfaceC4418p0.mo1590G0(fMo6923b) + iMo1590G0;
        int iMo1590G03 = interfaceC4418p0.mo1590G0(fMo6924c);
        int iMo1590G04 = interfaceC4418p0.mo1590G0(fMo6922a) + iMo1590G03;
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC4232b.m8516i(-iMo1590G02, -iMo1590G04, j3));
        return interfaceC4418p0.mo8010z(AbstractC4232b.m8514g(abstractC4377b1Mo8831Q.f14593g + iMo1590G02, j3), AbstractC4232b.m8513f(abstractC4377b1Mo8831Q.f14594h + iMo1590G04, j3), C4174u.f13711g, new C3221h0(abstractC4377b1Mo8831Q, iMo1590G0, iMo1590G03, 1));
    }
}
