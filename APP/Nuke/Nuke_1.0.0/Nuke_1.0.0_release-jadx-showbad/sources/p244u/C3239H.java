package p244u;

import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0558E0;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p076P.C1063I;
import p153e1.AbstractC2006b;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.H */
/* JADX INFO: loaded from: classes.dex */
public class C3239H extends AbstractC2206o implements InterfaceC0627x, InterfaceC0558E0 {

    /* JADX INFO: renamed from: r */
    public InterfaceC3276j0 f10032r;

    /* JADX INFO: renamed from: s */
    public InterfaceC3276j0 f10033s;

    /* JADX INFO: renamed from: t */
    public InterfaceC3276j0 f10034t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3239H(InterfaceC3276j0 interfaceC3276j0) {
        C3233B c3233b = AbstractC3261c.f10089e;
        this.f10032r = c3233b;
        this.f10033s = c3233b;
        this.f10034t = interfaceC3276j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public void mo143B0() {
        AbstractC0601k.m1047w(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C3236E(this, 1));
        m5498J0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public void mo144C0() {
        this.f10033s = this.f10032r;
        AbstractC0601k.m1049y(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C3236E(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: D0 */
    public final void mo4022D0() {
        this.f10032r = AbstractC3261c.f10089e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final void m5498J0() {
        this.f10033s = new C3268f0(this.f10032r, this.f10034t);
        AbstractC0601k.m1049y(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C3236E(this, 0));
        AbstractC0601k.m1035k(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        int iMo5494a = this.f10033s.mo5494a(interfaceC0379Q, interfaceC0379Q.getLayoutDirection()) - this.f10032r.mo5494a(interfaceC0379Q, interfaceC0379Q.getLayoutDirection());
        int iMo5495b = this.f10033s.mo5495b(interfaceC0379Q) - this.f10032r.mo5495b(interfaceC0379Q);
        int iMo5497d = (this.f10033s.mo5497d(interfaceC0379Q, interfaceC0379Q.getLayoutDirection()) - this.f10032r.mo5497d(interfaceC0379Q, interfaceC0379Q.getLayoutDirection())) + iMo5494a;
        int iMo5496c = (this.f10033s.mo5496c(interfaceC0379Q) - this.f10032r.mo5496c(interfaceC0379Q)) + iMo5495b;
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(AbstractC2006b.m3692i(-iMo5497d, -iMo5496c, j5));
        return interfaceC0379Q.mo604f0(AbstractC2006b.m3690g(j5, abstractC0391b0Mo648e.f1206d + iMo5497d), AbstractC2006b.m3689f(j5, abstractC0391b0Mo648e.f1207e + iMo5496c), C0982v.f3048d, new C1063I(iMo5494a, iMo5495b, 1, abstractC0391b0Mo648e));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0558E0
    /* JADX INFO: renamed from: s */
    public final Object mo146s() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
