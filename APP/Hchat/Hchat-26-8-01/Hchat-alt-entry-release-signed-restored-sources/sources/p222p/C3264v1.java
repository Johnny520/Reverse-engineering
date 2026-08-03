package p222p;

import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p293u2.C4240j;
import p293u2.C4242l;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import tf.C4174u;

/* JADX INFO: renamed from: p.v1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3264v1 extends AbstractC5852n implements InterfaceC5651v {

    /* JADX INFO: renamed from: u */
    public EnumC3269y f10401u;

    /* JADX INFO: renamed from: v */
    public InterfaceC1235p f10402v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(final InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        final AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC4232b.m8508a(this.f10401u != EnumC3269y.f10410g ? 0 : C4231a.m8506j(j3), C4231a.m8504h(j3), this.f10401u == EnumC3269y.f10411h ? C4231a.m8505i(j3) : 0, C4231a.m8503g(j3)));
        final int iM7909r = AbstractC3754e0.m7909r(abstractC4377b1Mo8831Q.f14593g, C4231a.m8506j(j3), C4231a.m8504h(j3));
        final int iM7909r2 = AbstractC3754e0.m7909r(abstractC4377b1Mo8831Q.f14594h, C4231a.m8505i(j3), C4231a.m8503g(j3));
        return interfaceC4418p0.mo8010z(iM7909r, iM7909r2, C4174u.f13711g, new InterfaceC1231l() { // from class: p.u1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1231l
            public final Object invoke(Object obj) {
                InterfaceC1235p interfaceC1235p = this.f10391g.f10402v;
                AbstractC4377b1 abstractC4377b1 = abstractC4377b1Mo8831Q;
                AbstractC4374a1.m8810C((AbstractC4374a1) obj, abstractC4377b1, ((C4240j) interfaceC1235p.invoke(new C4242l((((long) (iM7909r - abstractC4377b1.f14593g)) << 32) | (((long) (iM7909r2 - abstractC4377b1.f14594h)) & 4294967295L)), interfaceC4418p0.getLayoutDirection())).f13912a);
                return C3967n.f12976a;
            }
        });
    }
}
