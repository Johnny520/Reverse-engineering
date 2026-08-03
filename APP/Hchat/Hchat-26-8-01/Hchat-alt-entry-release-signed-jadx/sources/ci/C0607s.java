package ci;

import p036c9.C0446i;
import p293u2.C4238h;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import p357y1.AbstractC5888h1;
import p357y1.C5944v1;
import p357y1.InterfaceC5917o2;
import tf.C4174u;

/* JADX INFO: renamed from: ci.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0607s extends AbstractC5852n implements InterfaceC5609h, InterfaceC5651v {

    /* JADX INFO: renamed from: u */
    public final C0601p f1911u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0607s(C0601p c0601p) {
        this.f1911u = c0601p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        m1628k1();
        C0603q c0603q = new C0603q(this, 0);
        C0601p c0601p = this.f1911u;
        c0601p.f1895l = c0603q;
        c0601p.f1896m = new C0605r(this, 0);
        c0601p.f1897n = new C0605r(this, 1);
        c0601p.f1886c = new C0605r(this, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        C0614z c0614z;
        C0601p c0601p = this.f1911u;
        c0601p.f1895l = null;
        c0601p.f1896m = null;
        c0601p.f1897n = null;
        c0601p.f1886c = null;
        c0601p.m1621g(0.0f);
        c0601p.m1622h(0.0f);
        c0601p.f1887d = 0.0f;
        c0601p.f1888e = 0.0f;
        C0605r c0605r = c0601p.f1897n;
        if (c0605r == null || (c0614z = (C0614z) c0605r.invoke()) == null || !c0614z.m1630a()) {
            return;
        }
        c0614z.m1631b(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        interfaceC4409m0.getClass();
        m1628k1();
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C0446i(abstractC4377b1Mo8831Q, 6, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final void m1628k1() {
        InterfaceC4233c interfaceC4233c = (InterfaceC4233c) AbstractC5618k.m10152h(this, AbstractC5888h1.f23926h);
        C5944v1 c5944v1 = (C5944v1) ((InterfaceC5917o2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23939u));
        float fMo1601x0 = interfaceC4233c.mo1601x0(C4238h.m8523a(c5944v1.m10670a()));
        C0601p c0601p = this.f1911u;
        c0601p.f1889f = fMo1601x0;
        c0601p.f1890g = interfaceC4233c.mo1601x0(C4238h.m8524b(c5944v1.m10670a()));
    }
}
