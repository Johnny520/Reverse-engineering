package p041H0;

import p029F0.AbstractC0388a;
import p029F0.AbstractC0391b0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.C2014j;
import p153e1.C2016l;
import p169h0.AbstractC2206o;
import p186k.C2444z;
import p211o0.AbstractC2767z;
import p211o0.C2748g;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;
import p228r0.C3029b;

/* JADX INFO: renamed from: H0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0631z extends AbstractC0596h0 {

    /* JADX INFO: renamed from: W */
    public static final C2748g f2005W;

    /* JADX INFO: renamed from: U */
    public InterfaceC0627x f2006U;

    /* JADX INFO: renamed from: V */
    public C0629y f2007V;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2748g c2748gM4937g = AbstractC2767z.m4937g();
        c2748gM4937g.m4869g(C2762u.f8760e);
        c2748gM4937g.m4875m(1.0f);
        c2748gM4937g.m4876n(1);
        f2005W = c2748gM4937g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: H0.x */
    /* JADX WARN: Multi-variable type inference failed */
    public C0631z(C0564I c0564i, InterfaceC0627x interfaceC0627x) {
        super(c0564i);
        this.f2006U = interfaceC0627x;
        this.f2007V = c0564i.f1719l != null ? new C0629y(this) : null;
        if ((((AbstractC2206o) interfaceC0627x).f7186d.f7188f & 512) != 0) {
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0596h0
    /* JADX INFO: renamed from: M0 */
    public final void mo976M0() {
        if (this.f2007V == null) {
            this.f2007V = new C0629y(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0596h0
    /* JADX INFO: renamed from: P0 */
    public final AbstractC0573S mo979P0() {
        return this.f2007V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0596h0
    /* JADX INFO: renamed from: R0 */
    public final AbstractC2206o mo981R0() {
        return ((AbstractC2206o) this.f2006U).f7186d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: T */
    public final int mo645T(int i5) {
        InterfaceC0627x interfaceC0627x = this.f2006U;
        AbstractC0596h0 abstractC0596h0 = this.f1933s;
        AbstractC1665j.m2982b(abstractC0596h0);
        return interfaceC0627x.mo948j(this, abstractC0596h0, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: X */
    public final int mo646X(int i5) {
        InterfaceC0627x interfaceC0627x = this.f2006U;
        AbstractC0596h0 abstractC0596h0 = this.f1933s;
        AbstractC1665j.m2982b(abstractC0596h0);
        return interfaceC0627x.mo954w0(this, abstractC0596h0, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: Z */
    public final int mo647Z(int i5) {
        InterfaceC0627x interfaceC0627x = this.f2006U;
        AbstractC0596h0 abstractC0596h0 = this.f1933s;
        AbstractC1665j.m2982b(abstractC0596h0);
        return interfaceC0627x.mo949l0(this, abstractC0596h0, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: e */
    public final AbstractC0391b0 mo648e(long j5) {
        m668l0(j5);
        InterfaceC0627x interfaceC0627x = this.f2006U;
        AbstractC0596h0 abstractC0596h0 = this.f1933s;
        AbstractC1665j.m2982b(abstractC0596h0);
        m1000k1(interfaceC0627x.mo687d(this, abstractC0596h0, j5));
        m991b1();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: f */
    public final int mo649f(int i5) {
        InterfaceC0627x interfaceC0627x = this.f2006U;
        AbstractC0596h0 abstractC0596h0 = this.f1933s;
        AbstractC1665j.m2982b(abstractC0596h0);
        return interfaceC0627x.mo941T(this, abstractC0596h0, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0596h0
    /* JADX INFO: renamed from: g1 */
    public final void mo996g1(InterfaceC2760s interfaceC2760s, C3029b c3029b) {
        AbstractC0596h0 abstractC0596h0;
        AbstractC0596h0 abstractC0596h02 = this.f1933s;
        AbstractC1665j.m2982b(abstractC0596h02);
        abstractC0596h02.m974K0(interfaceC2760s, c3029b);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(this.f1932r)).getShowLayoutBounds() || (abstractC0596h0 = this.f1933s) == null) {
            return;
        }
        if (C2016l.m3704a(this.f1208f, abstractC0596h0.f1208f) && C2014j.m3700a(abstractC0596h0.f1919C, 0L)) {
            return;
        }
        long j5 = this.f1208f;
        interfaceC2760s.mo4854p(0.5f, 0.5f, ((int) (j5 >> 32)) - 0.5f, ((int) (j5 & 4294967295L)) - 0.5f, f2005W);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.AbstractC0391b0
    /* JADX INFO: renamed from: i0 */
    public final void mo666i0(long j5, float f2, InterfaceC1601c interfaceC1601c) {
        m997h1(j5, f2, interfaceC1601c);
        if (this.f1780m) {
            return;
        }
        m992c1();
        AbstractC0596h0 abstractC0596h0 = this.f1933s;
        AbstractC1665j.m2982b(abstractC0596h0);
        abstractC0596h0.f1781n = this.f1781n;
        mo894z0().mo608b();
        abstractC0596h0.f1781n = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: n0 */
    public final int mo885n0(AbstractC0388a abstractC0388a) {
        C0629y c0629y = this.f2007V;
        if (c0629y == null) {
            return AbstractC0601k.m1027c(this, abstractC0388a);
        }
        C2444z c2444z = c0629y.f1790w;
        int iM4364d = c2444z.m4364d(abstractC0388a);
        if (iM4364d >= 0) {
            return c2444z.f7900c[iM4364d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: H0.x */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s1 */
    public final void m1082s1(InterfaceC0627x interfaceC0627x) {
        if (!interfaceC0627x.equals(this.f2006U) && (((AbstractC2206o) interfaceC0627x).f7186d.f7188f & 512) != 0) {
            throw new ClassCastException();
        }
        this.f2006U = interfaceC0627x;
    }
}
