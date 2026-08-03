package ci;

import p036c9.C0446i;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1785r0;
import p187n.C2857k;
import p249qg.AbstractC3603v;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import tf.C4174u;

/* JADX INFO: renamed from: ci.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0598n0 extends AbstractC5852n implements InterfaceC5651v {

    /* JADX INFO: renamed from: u */
    public final C2857k f1874u;

    /* JADX INFO: renamed from: v */
    public final C1785r0 f1875v;

    /* JADX INFO: renamed from: w */
    public final C1739c f1876w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0598n0(C2857k c2857k, C1785r0 c1785r0) {
        c2857k.getClass();
        this.f1874u = c2857k;
        this.f1875v = c1785r0;
        this.f1876w = AbstractC1742d.m4365a(1.0f, 0.01f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public static final void m1614k1(C0598n0 c0598n0, float f3) {
        AbstractC3603v.m7563q(c0598n0.m10550Y0(), null, new C0596m0(c0598n0, f3, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        AbstractC3603v.m7563q(m10550Y0(), null, new C0575c(this, null, 2), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        interfaceC4409m0.getClass();
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C0446i(abstractC4377b1Mo8831Q, 10, this));
    }
}
