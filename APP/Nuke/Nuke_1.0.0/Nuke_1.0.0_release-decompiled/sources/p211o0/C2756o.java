package p211o0;

import com.bumptech.glide.AbstractC1925g;
import p007B0.C0171D;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0627x;
import p041H0.InterfaceC0632z0;
import p061L2.C0982v;
import p077P0.AbstractC1134u;
import p077P0.InterfaceC1136w;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2086r;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: o0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2756o extends AbstractC2206o implements InterfaceC0627x, InterfaceC0632z0 {

    /* JADX INFO: renamed from: r */
    public InterfaceC1601c f8750r;

    public C2756o(InterfaceC1601c interfaceC1601c) {
        this.f8750r = interfaceC1601c;
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        boolean z5;
        InterfaceC2738M interfaceC2738M;
        AbstractC0596h0 abstractC0596h0M1042r = AbstractC0601k.m1042r(this, 2);
        if (abstractC0596h0M1042r.f1925I) {
            InterfaceC2738M interfaceC2738M2 = abstractC0596h0M1042r.f1923G;
            z5 = abstractC0596h0M1042r.f1924H;
            interfaceC2738M = interfaceC2738M2;
        } else {
            C2735J c2735j = AbstractC2767z.f8775a;
            if (c2735j == null) {
                AbstractC2767z.f8775a = new C2735J();
            } else {
                c2735j.m4791a();
            }
            C2735J c2735j2 = AbstractC2767z.f8775a;
            AbstractC1665j.m2982b(c2735j2);
            c2735j2.f8696t = abstractC0596h0M1042r.f1932r.f1692C;
            c2735j2.f8695s = AbstractC1925g.m3523F(abstractC0596h0M1042r.f1208f);
            AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
            InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
            AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
            try {
                this.f8750r.mo1h(c2735j2);
                AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                interfaceC2738M = c2735j2.f8693q;
                z5 = c2735j2.f8694r;
            } catch (Throwable th) {
                AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                throw th;
            }
        }
        if (z5) {
            AbstractC1134u.m2190c(interfaceC1136w, interfaceC2738M);
        }
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0171D(11, abstractC0391b0Mo648e, this));
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: f */
    public final boolean mo1083f() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f8750r + ')';
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
