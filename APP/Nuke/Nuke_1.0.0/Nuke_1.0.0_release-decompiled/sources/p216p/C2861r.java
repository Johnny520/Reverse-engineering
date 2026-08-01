package p216p;

import p000A.C0049a;
import p041H0.AbstractC0599j;
import p041H0.InterfaceC0632z0;
import p077P0.AbstractC1134u;
import p077P0.InterfaceC1136w;
import p193l0.C2480c;
import p193l0.C2481d;
import p211o0.C2740O;
import p211o0.InterfaceC2738M;

/* JADX INFO: renamed from: p.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2861r extends AbstractC0599j implements InterfaceC0632z0 {

    /* JADX INFO: renamed from: t */
    public C2858o f9015t;

    /* JADX INFO: renamed from: u */
    public float f9016u;

    /* JADX INFO: renamed from: v */
    public C2740O f9017v;

    /* JADX INFO: renamed from: w */
    public InterfaceC2738M f9018w;

    /* JADX INFO: renamed from: x */
    public final C2480c f9019x;

    public C2861r(float f2, C2740O c2740o, InterfaceC2738M interfaceC2738M) {
        this.f9016u = f2;
        this.f9017v = c2740o;
        this.f9018w = interfaceC2738M;
        C2480c c2480c = new C2480c(new C2481d(), new C0049a(23, this));
        m1021J0(c2480c);
        this.f9019x = c2480c;
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        AbstractC1134u.m2190c(interfaceC1136w, this.f9018w);
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: f */
    public final boolean mo1083f() {
        return false;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
