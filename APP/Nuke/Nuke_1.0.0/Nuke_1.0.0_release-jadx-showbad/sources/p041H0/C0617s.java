package p041H0;

import p000A.C0038T0;
import p023E0.AbstractC0277a;
import p029F0.AbstractC0388a;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0377O;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p077P0.C1125l;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;
import p211o0.AbstractC2767z;
import p211o0.C2748g;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;
import p228r0.C3029b;

/* JADX INFO: renamed from: H0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0617s extends AbstractC0596h0 {

    /* JADX INFO: renamed from: W */
    public static final C2748g f1969W;

    /* JADX INFO: renamed from: U */
    public final C0552B0 f1970U;

    /* JADX INFO: renamed from: V */
    public C0615r f1971V;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2748g c2748gM4937g = AbstractC2767z.m4937g();
        c2748gM4937g.m4869g(C2762u.f8759d);
        c2748gM4937g.m4875m(1.0f);
        c2748gM4937g.m4876n(1);
        f1969W = c2748gM4937g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0617s(C0564I c0564i) {
        super(c0564i);
        C0552B0 c0552b0 = new C0552B0();
        c0552b0.f7189g = 0;
        this.f1970U = c0552b0;
        c0552b0.f7193k = this;
        this.f1971V = c0564i.f1719l != null ? new C0615r(this) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0596h0
    /* JADX INFO: renamed from: M0 */
    public final void mo976M0() {
        if (this.f1971V == null) {
            this.f1971V = new C0615r(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0596h0
    /* JADX INFO: renamed from: P0 */
    public final AbstractC0573S mo979P0() {
        return this.f1971V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0596h0
    /* JADX INFO: renamed from: R0 */
    public final AbstractC2206o mo981R0() {
        return this.f1970U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: T */
    public final int mo645T(int i5) {
        C0038T0 c0038t0M838t = this.f1932r.m838t();
        InterfaceC0377O interfaceC0377OM54y = c0038t0M838t.m54y();
        C0564I c0564i = (C0564I) c0038t0M838t.f169e;
        return interfaceC0377OM54y.mo652e(c0564i.f1699J.f1894d, c0564i.m831m(), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: X */
    public final int mo646X(int i5) {
        C0038T0 c0038t0M838t = this.f1932r.m838t();
        InterfaceC0377O interfaceC0377OM54y = c0038t0M838t.m54y();
        C0564I c0564i = (C0564I) c0038t0M838t.f169e;
        return interfaceC0377OM54y.mo15f(c0564i.f1699J.f1894d, c0564i.m831m(), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x00de */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:0x0122 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0119 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:97:0x0128 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x00de */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // p041H0.AbstractC0596h0
    /* JADX INFO: renamed from: X0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo987X0(C0592f0 c0592f0, long j5, C0613q c0613q, int i5, boolean z5) {
        boolean z6;
        int i6;
        boolean z7;
        boolean z8;
        C0564I c0564i;
        long j6 = j5;
        C0613q c0613q2 = c0613q;
        int i7 = c0592f0.f1908a;
        C0564I c0564i2 = this.f1932r;
        switch (i7) {
            case 0:
                z6 = true;
                break;
            default:
                C1125l c1125lM841w = c0564i2.m841w();
                z6 = !(c1125lM841w != null && c1125lM841w.f3705g);
                break;
        }
        if (z6) {
            if (m1006r1(j6)) {
                i6 = i5;
                z7 = z5;
                z8 = true;
            } else {
                i6 = i5;
                if (i6 == 1 && (Float.floatToRawIntBits(m973J0(j6, m980Q0())) & Integer.MAX_VALUE) < 2139095040) {
                    z8 = true;
                    z7 = false;
                }
            }
            if (z8) {
                return;
            }
            int i8 = c0613q2.f1968f;
            C1483e c1483eM842x = c0564i2.m842x();
            Object[] objArr = c1483eM842x.f5181d;
            int i9 = c1483eM842x.f5183f - 1;
            while (i9 >= 0) {
                C0564I c0564i3 = (C0564I) objArr[i9];
                if (c0564i3.m801I()) {
                    switch (c0592f0.f1908a) {
                        case 0:
                            c0564i3.m844z(j6, c0613q2, i6, z7);
                            c0564i = c0564i3;
                            break;
                        default:
                            C0590e0 c0590e0 = c0564i3.f1699J;
                            c0590e0.f1894d.m986W0(AbstractC0596h0.f1916T, c0590e0.f1894d.m978O0(j6), c0613q2, 1, z7);
                            c0613q2 = c0613q;
                            c0564i = c0564i3;
                            break;
                    }
                    long jM1055a = c0613q2.m1055a();
                    if (AbstractC0601k.m1033i(jM1055a) < 0.0f && AbstractC0601k.m1038n(jM1055a) && !AbstractC0601k.m1037m(jM1055a)) {
                        AbstractC0596h0 abstractC0596h0 = c0564i.f1699J.f1894d;
                        abstractC0596h0.getClass();
                        AbstractC2206o abstractC2206oM983T0 = abstractC0596h0.m983T0(AbstractC0598i0.m1014g(16));
                        if (abstractC2206oM983T0 != null && abstractC2206oM983T0.f7199q) {
                            if (!abstractC2206oM983T0.f7186d.f7199q) {
                                AbstractC0277a.m483b("visitLocalDescendants called on an unattached node");
                            }
                            AbstractC2206o abstractC2206o = abstractC2206oM983T0.f7186d;
                            if ((abstractC2206o.f7189g & 16) != 0) {
                                while (abstractC2206o != null) {
                                    if ((abstractC2206o.f7188f & 16) != 0) {
                                        ?? M1029e = abstractC2206o;
                                        ?? c1483e = 0;
                                        while (M1029e != 0) {
                                            if (M1029e instanceof InterfaceC0624v0) {
                                                if (((InterfaceC0624v0) M1029e).mo944Z()) {
                                                    c0613q2.f1968f = c0613q2.f1966d.f7767b - 1;
                                                }
                                            } else if ((M1029e.f7188f & 16) != 0 && (M1029e instanceof AbstractC0599j)) {
                                                AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                                                int i10 = 0;
                                                M1029e = M1029e;
                                                c1483e = c1483e;
                                                while (abstractC2206o2 != null) {
                                                    if ((abstractC2206o2.f7188f & 16) != 0) {
                                                        i10++;
                                                        c1483e = c1483e;
                                                        if (i10 == 1) {
                                                            M1029e = abstractC2206o2;
                                                        } else {
                                                            if (c1483e == 0) {
                                                                c1483e = new C1483e(new AbstractC2206o[16]);
                                                            }
                                                            if (M1029e != 0) {
                                                                c1483e.m2753b(M1029e);
                                                                M1029e = 0;
                                                            }
                                                            c1483e.m2753b(abstractC2206o2);
                                                        }
                                                    }
                                                    abstractC2206o2 = abstractC2206o2.f7191i;
                                                    M1029e = M1029e;
                                                    c1483e = c1483e;
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                            M1029e = AbstractC0601k.m1029e(c1483e);
                                        }
                                    }
                                    abstractC2206o = abstractC2206o.f7191i;
                                }
                            }
                        }
                        c0613q2.f1968f = i8;
                        return;
                    }
                }
                i9--;
                j6 = j5;
                i6 = i5;
            }
            c0613q2.f1968f = i8;
            return;
        }
        i6 = i5;
        z7 = z5;
        z8 = false;
        if (z8) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: Z */
    public final int mo647Z(int i5) {
        C0038T0 c0038t0M838t = this.f1932r.m838t();
        InterfaceC0377O interfaceC0377OM54y = c0038t0M838t.m54y();
        C0564I c0564i = (C0564I) c0038t0M838t.f169e;
        return interfaceC0377OM54y.mo653h(c0564i.f1699J.f1894d, c0564i.m831m(), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: e */
    public final AbstractC0391b0 mo648e(long j5) {
        m668l0(j5);
        C0564I c0564i = this.f1932r;
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            ((C0564I) objArr[i6]).f1700K.f1760p.f1852o = EnumC0561G.f1684f;
        }
        m1000k1(c0564i.f1690A.mo16i(this, c0564i.m831m(), j5));
        m991b1();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: f */
    public final int mo649f(int i5) {
        C0038T0 c0038t0M838t = this.f1932r.m838t();
        InterfaceC0377O interfaceC0377OM54y = c0038t0M838t.m54y();
        C0564I c0564i = (C0564I) c0038t0M838t.f169e;
        return interfaceC0377OM54y.mo651a(c0564i.f1699J.f1894d, c0564i.m831m(), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0596h0
    /* JADX INFO: renamed from: g1 */
    public final void mo996g1(InterfaceC2760s interfaceC2760s, C3029b c3029b) {
        C0564I c0564i = this.f1932r;
        InterfaceC0614q0 interfaceC0614q0M866a = AbstractC0567L.m866a(c0564i);
        C1483e c1483eM842x = c0564i.m842x();
        Object[] objArr = c1483eM842x.f5181d;
        int i5 = c1483eM842x.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0564I c0564i2 = (C0564I) objArr[i6];
            if (c0564i2.m801I()) {
                c0564i2.m828i(interfaceC2760s, c3029b);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0M866a).getShowLayoutBounds()) {
            long j5 = this.f1208f;
            interfaceC2760s.mo4854p(0.5f, 0.5f, ((int) (j5 >> 32)) - 0.5f, ((int) (j5 & 4294967295L)) - 0.5f, f1969W);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.AbstractC0391b0
    /* JADX INFO: renamed from: i0 */
    public final void mo666i0(long j5, float f2, InterfaceC1601c interfaceC1601c) {
        m997h1(j5, f2, interfaceC1601c);
        if (this.f1780m) {
            return;
        }
        this.f1932r.f1700K.f1760p.m936t0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: n0 */
    public final int mo885n0(AbstractC0388a abstractC0388a) {
        C0615r c0615r = this.f1971V;
        if (c0615r != null) {
            return c0615r.mo885n0(abstractC0388a);
        }
        C0580Z c0580z = this.f1932r.f1700K.f1760p;
        C0565J c0565j = c0580z.f1863z;
        if (c0580z.f1846i.f1748d == EnumC0557E.f1672d) {
            c0565j.f1737d = true;
            if (c0565j.f1735b) {
                c0580z.f1861x = true;
                c0580z.f1862y = true;
            }
        } else {
            c0565j.f1738e = true;
        }
        C0617s c0617sMo909w = c0580z.mo909w();
        boolean z5 = c0617sMo909w.f1781n;
        c0617sMo909w.f1781n = true;
        c0580z.mo913y();
        c0617sMo909w.f1781n = z5;
        Integer num = (Integer) c0565j.f1740g.get(abstractC0388a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
