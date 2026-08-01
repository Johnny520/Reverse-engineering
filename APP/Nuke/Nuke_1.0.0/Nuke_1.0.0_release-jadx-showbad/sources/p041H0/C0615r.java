package p041H0;

import p000A.C0038T0;
import p029F0.AbstractC0388a;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0377O;
import p105V.C1483e;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: H0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0615r extends AbstractC0573S {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0573S
    /* JADX INFO: renamed from: H0 */
    public final void mo896H0() {
        C0576V c0576v = this.f1785r.f1932r.f1700K.f1761q;
        AbstractC1665j.m2982b(c0576v);
        c0576v.m908t0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: T */
    public final int mo645T(int i5) {
        C0038T0 c0038t0M838t = this.f1785r.f1932r.m838t();
        InterfaceC0377O interfaceC0377OM54y = c0038t0M838t.m54y();
        C0564I c0564i = (C0564I) c0038t0M838t.f169e;
        return interfaceC0377OM54y.mo652e(c0564i.f1699J.f1894d, c0564i.m830l(), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: X */
    public final int mo646X(int i5) {
        C0038T0 c0038t0M838t = this.f1785r.f1932r.m838t();
        InterfaceC0377O interfaceC0377OM54y = c0038t0M838t.m54y();
        C0564I c0564i = (C0564I) c0038t0M838t.f169e;
        return interfaceC0377OM54y.mo15f(c0564i.f1699J.f1894d, c0564i.m830l(), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: Z */
    public final int mo647Z(int i5) {
        C0038T0 c0038t0M838t = this.f1785r.f1932r.m838t();
        InterfaceC0377O interfaceC0377OM54y = c0038t0M838t.m54y();
        C0564I c0564i = (C0564I) c0038t0M838t.f169e;
        return interfaceC0377OM54y.mo653h(c0564i.f1699J.f1894d, c0564i.m830l(), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: e */
    public final AbstractC0391b0 mo648e(long j5) {
        m668l0(j5);
        AbstractC0596h0 abstractC0596h0 = this.f1785r;
        C1483e c1483eM843y = abstractC0596h0.f1932r.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0576V c0576v = ((C0564I) objArr[i6]).f1700K.f1761q;
            AbstractC1665j.m2982b(c0576v);
            c0576v.f1805m = EnumC0561G.f1684f;
        }
        C0564I c0564i = abstractC0596h0.f1932r;
        AbstractC0573S.m895G0(this, c0564i.f1690A.mo16i(this, c0564i.m830l(), j5));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: f */
    public final int mo649f(int i5) {
        C0038T0 c0038t0M838t = this.f1785r.f1932r.m838t();
        InterfaceC0377O interfaceC0377OM54y = c0038t0M838t.m54y();
        C0564I c0564i = (C0564I) c0038t0M838t.f169e;
        return interfaceC0377OM54y.mo651a(c0564i.f1699J.f1894d, c0564i.m830l(), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: n0 */
    public final int mo885n0(AbstractC0388a abstractC0388a) {
        C0576V c0576v = this.f1785r.f1932r.f1700K.f1761q;
        AbstractC1665j.m2982b(c0576v);
        C0565J c0565j = c0576v.f1812t;
        C0568M c0568m = c0576v.f1801i;
        if (c0568m.f1748d == EnumC0557E.f1673e) {
            c0565j.f1737d = true;
            if (c0565j.f1735b) {
                c0568m.f1750f = true;
                c0568m.f1751g = true;
            }
        } else {
            c0565j.f1738e = true;
        }
        C0615r c0615r = c0576v.mo909w().f1971V;
        if (c0615r != null) {
            c0615r.f1781n = true;
        }
        c0576v.mo913y();
        C0615r c0615r2 = c0576v.mo909w().f1971V;
        if (c0615r2 != null) {
            c0615r2.f1781n = false;
        }
        Integer num = (Integer) c0565j.f1740g.get(abstractC0388a);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f1790w.m4367g(iIntValue, abstractC0388a);
        return iIntValue;
    }
}
