package p071f1;

import p072f2.AbstractC1060w;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1231l;
import p259r9.AbstractC3754e0;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4666q;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5651v;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;
import tf.C4174u;

/* JADX INFO: renamed from: f1.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1023q extends AbstractC5852n implements InterfaceC5651v, InterfaceC5665z1 {

    /* JADX INFO: renamed from: u */
    public InterfaceC1231l f3232u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1023q(InterfaceC1231l interfaceC1231l) {
        this.f3232u = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: A */
    public final boolean mo2629A() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        boolean z9;
        InterfaceC1026r0 interfaceC1026r0;
        AbstractC5614i1 abstractC5614i1M10164t = AbstractC5618k.m10164t(this, 2);
        if (abstractC5614i1M10164t.f22860L) {
            InterfaceC1026r0 interfaceC1026r02 = abstractC5614i1M10164t.f22858J;
            z9 = abstractC5614i1M10164t.f22859K;
            interfaceC1026r0 = interfaceC1026r02;
        } else {
            C1020o0 c1020o0 = AbstractC0996c0.f3161a;
            if (c1020o0 == null) {
                AbstractC0996c0.f3161a = new C1020o0();
            } else {
                c1020o0.m2627e();
            }
            C1020o0 c1020o02 = AbstractC0996c0.f3161a;
            c1020o02.getClass();
            c1020o02.f3223w = abstractC5614i1M10164t.f22868u.f22771E;
            c1020o02.f3222v = AbstractC3754e0.m7908q0(abstractC5614i1M10164t.f14595i);
            AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
            InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
            AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
            try {
                this.f3232u.invoke(c1020o02);
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                interfaceC1026r0 = c1020o02.f3219s;
                z9 = c1020o02.f3220t;
            } catch (Throwable th2) {
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                throw th2;
            }
        }
        if (z9) {
            AbstractC1060w.m2681d(interfaceC1062y, interfaceC1026r0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C1021p(abstractC4377b1Mo8831Q, 0, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f3232u + ')';
    }
}
