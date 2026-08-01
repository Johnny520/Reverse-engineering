package p041H0;

import java.util.List;
import p007B0.C0172E;
import p023E0.AbstractC0277a;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1480b;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p153e1.C2014j;
import p153e1.C2016l;

/* JADX INFO: renamed from: H0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0580Z extends AbstractC0391b0 implements InterfaceC0376N, InterfaceC0581a, InterfaceC0584b0 {

    /* JADX INFO: renamed from: C */
    public boolean f1835C;

    /* JADX INFO: renamed from: G */
    public float f1839G;

    /* JADX INFO: renamed from: H */
    public boolean f1840H;

    /* JADX INFO: renamed from: I */
    public InterfaceC1601c f1841I;

    /* JADX INFO: renamed from: K */
    public float f1843K;

    /* JADX INFO: renamed from: M */
    public boolean f1845M;

    /* JADX INFO: renamed from: i */
    public final C0568M f1846i;

    /* JADX INFO: renamed from: j */
    public boolean f1847j;

    /* JADX INFO: renamed from: m */
    public boolean f1850m;

    /* JADX INFO: renamed from: n */
    public boolean f1851n;

    /* JADX INFO: renamed from: q */
    public InterfaceC1601c f1854q;

    /* JADX INFO: renamed from: r */
    public float f1855r;

    /* JADX INFO: renamed from: t */
    public Object f1857t;

    /* JADX INFO: renamed from: u */
    public boolean f1858u;

    /* JADX INFO: renamed from: v */
    public boolean f1859v;

    /* JADX INFO: renamed from: w */
    public boolean f1860w;

    /* JADX INFO: renamed from: x */
    public boolean f1861x;

    /* JADX INFO: renamed from: y */
    public boolean f1862y;

    /* JADX INFO: renamed from: k */
    public int f1848k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    public int f1849l = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public EnumC0561G f1852o = EnumC0561G.f1684f;

    /* JADX INFO: renamed from: p */
    public long f1853p = 0;

    /* JADX INFO: renamed from: s */
    public boolean f1856s = true;

    /* JADX INFO: renamed from: z */
    public final C0565J f1863z = new C0565J(this, 0);

    /* JADX INFO: renamed from: A */
    public final C1483e f1833A = new C1483e(new C0580Z[16]);

    /* JADX INFO: renamed from: B */
    public boolean f1834B = true;

    /* JADX INFO: renamed from: D */
    public long f1836D = AbstractC2006b.m3685b(0, 0, 15);

    /* JADX INFO: renamed from: E */
    public final C0579Y f1837E = new C0579Y(this, 1);

    /* JADX INFO: renamed from: F */
    public final C0579Y f1838F = new C0579Y(this, 0);

    /* JADX INFO: renamed from: J */
    public long f1842J = 0;

    /* JADX INFO: renamed from: L */
    public final C0579Y f1844L = new C0579Y(this, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0580Z(C0568M c0568m) {
        this.f1846i = c0568m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: T */
    public final int mo645T(int i5) {
        C0568M c0568m = this.f1846i;
        if (!AbstractC0601k.m1039o(c0568m.f1745a)) {
            m935s0();
            return c0568m.m867a().mo645T(i5);
        }
        C0576V c0576v = c0568m.f1761q;
        AbstractC1665j.m2982b(c0576v);
        return c0576v.mo645T(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: U */
    public final int mo899U() {
        return this.f1849l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: W */
    public final void mo900W() {
        C0564I.m790V(this.f1846i.f1745a, false, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: X */
    public final int mo646X(int i5) {
        C0568M c0568m = this.f1846i;
        if (!AbstractC0601k.m1039o(c0568m.f1745a)) {
            m935s0();
            return c0568m.m867a().mo646X(i5);
        }
        C0576V c0576v = c0568m.f1761q;
        AbstractC1665j.m2982b(c0576v);
        return c0576v.mo646X(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: Z */
    public final int mo647Z(int i5) {
        C0568M c0568m = this.f1846i;
        if (!AbstractC0601k.m1039o(c0568m.f1745a)) {
            m935s0();
            return c0568m.m867a().mo647Z(i5);
        }
        C0576V c0576v = c0568m.f1761q;
        AbstractC1665j.m2982b(c0576v);
        return c0576v.mo647Z(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: a */
    public final C0565J mo901a() {
        return this.f1863z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.AbstractC0391b0
    /* JADX INFO: renamed from: d0 */
    public final int mo663d0() {
        return this.f1846i.m867a().mo663d0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: e */
    public final AbstractC0391b0 mo648e(long j5) {
        EnumC0561G enumC0561G;
        C0568M c0568m = this.f1846i;
        C0564I c0564i = c0568m.f1745a;
        EnumC0561G enumC0561G2 = c0564i.f1696G;
        EnumC0561G enumC0561G3 = EnumC0561G.f1684f;
        if (enumC0561G2 == enumC0561G3) {
            c0564i.m822e();
        }
        if (AbstractC0601k.m1039o(c0568m.f1745a)) {
            C0576V c0576v = c0568m.f1761q;
            AbstractC1665j.m2982b(c0576v);
            c0576v.f1805m = enumC0561G3;
            c0576v.mo648e(j5);
        }
        C0564I c0564i2 = c0568m.f1745a;
        C0564I c0564iM839u = c0564i2.m839u();
        if (c0564iM839u != null) {
            C0568M c0568m2 = c0564iM839u.f1700K;
            if (this.f1852o != enumC0561G3 && !c0564i2.f1698I) {
                AbstractC0277a.m483b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = c0568m2.f1748d.ordinal();
            if (iOrdinal == 0) {
                enumC0561G = EnumC0561G.f1682d;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + c0568m2.f1748d);
                }
                enumC0561G = EnumC0561G.f1683e;
            }
            this.f1852o = enumC0561G;
        } else {
            this.f1852o = enumC0561G3;
        }
        m938x0(j5);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: f */
    public final int mo649f(int i5) {
        C0568M c0568m = this.f1846i;
        if (!AbstractC0601k.m1039o(c0568m.f1745a)) {
            m935s0();
            return c0568m.m867a().mo649f(i5);
        }
        C0576V c0576v = c0568m.f1761q;
        AbstractC1665j.m2982b(c0576v);
        return c0576v.mo649f(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.AbstractC0391b0
    /* JADX INFO: renamed from: g0 */
    public final int mo664g0() {
        return this.f1846i.m867a().mo664g0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.AbstractC0391b0
    /* JADX INFO: renamed from: i0 */
    public final void mo666i0(long j5, float f2, InterfaceC1601c interfaceC1601c) {
        AbstractC0389a0 placementScope;
        C0568M c0568m = this.f1846i;
        C0564I c0564i = c0568m.f1745a;
        C0564I c0564i2 = c0568m.f1745a;
        try {
            this.f1859v = true;
            if (!C2014j.m3700a(j5, this.f1853p) || this.f1845M) {
                if (c0568m.f1755k || c0568m.f1754j || this.f1845M) {
                    this.f1861x = true;
                    this.f1845M = false;
                }
                m934r0();
            }
            C0576V c0576v = c0568m.f1761q;
            if (c0576v != null) {
                C0568M c0568m2 = c0576v.f1801i;
                if (c0576v.f1811s == EnumC0574T.f1793f && !AbstractC0601k.m1039o(c0568m2.f1745a)) {
                    c0568m2.f1747c = true;
                }
            }
            C0576V c0576v2 = c0568m.f1761q;
            if (c0576v2 != null && c0576v2.m903m0()) {
                AbstractC0596h0 abstractC0596h0 = c0568m.m867a().f1934t;
                if (abstractC0596h0 == null || (placementScope = abstractC0596h0.f1782o) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i2)).getPlacementScope();
                }
                C0576V c0576v3 = c0568m.f1761q;
                AbstractC1665j.m2982b(c0576v3);
                C0564I c0564iM839u = c0564i2.m839u();
                if (c0564iM839u != null) {
                    c0564iM839u.f1700K.f1752h = 0;
                }
                c0576v3.f1804l = Integer.MAX_VALUE;
                AbstractC0389a0.m658i(placementScope, c0576v3, (int) (j5 >> 32), (int) (4294967295L & j5));
            }
            C0576V c0576v4 = c0568m.f1761q;
            if (c0576v4 != null && !c0576v4.f1806n) {
                AbstractC0277a.m483b("Error: Placement happened before lookahead.");
            }
            m937w0(j5, f2, interfaceC1601c);
        } catch (Throwable th) {
            c0564i.m814Y(th);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: j */
    public final void mo902j(C0172E c0172e) {
        C1483e c1483eM843y = this.f1846i.f1745a.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            c0172e.mo1h(((C0564I) objArr[i6]).f1700K.f1760p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.AbstractC0391b0, p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: l */
    public final Object mo650l() {
        return this.f1857t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final List m931m0() {
        C0568M c0568m = this.f1846i;
        c0568m.f1745a.m825f0();
        boolean z5 = this.f1834B;
        C1483e c1483e = this.f1833A;
        if (!z5) {
            return c1483e.m2757f();
        }
        C0564I c0564i = c0568m.f1745a;
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0564I c0564i2 = (C0564I) objArr[i6];
            if (c1483e.f5183f <= i6) {
                c1483e.m2753b(c0564i2.f1700K.f1760p);
            } else {
                C0580Z c0580z = c0564i2.f1700K.f1760p;
                Object[] objArr2 = c1483e.f5181d;
                Object obj = objArr2[i6];
                objArr2[i6] = c0580z;
            }
        }
        c1483e.m2763l(((C1483e) ((C1480b) c0564i.m832n()).f5173e).f5183f, c1483e.f5183f);
        this.f1834B = false;
        return c1483e.m2757f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final void m932n0() {
        boolean z5 = this.f1858u;
        this.f1858u = true;
        C0568M c0568m = this.f1846i;
        C0564I c0564i = c0568m.f1745a;
        C0590e0 c0590e0 = c0564i.f1699J;
        if (!z5) {
            c0590e0.f1893c.m992c1();
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getRectManager().m2211e(c0568m.f1745a, true);
            if (c0564i.m835q()) {
                C0564I.m790V(c0564i, true, 6);
            } else if (c0564i.f1700K.f1749e) {
                C0564I.m789T(c0564i, true, 6);
            }
        }
        AbstractC0596h0 abstractC0596h0 = c0590e0.f1893c.f1933s;
        for (AbstractC0596h0 abstractC0596h02 = c0590e0.f1894d; !AbstractC1665j.m2981a(abstractC0596h02, abstractC0596h0) && abstractC0596h02 != null; abstractC0596h02 = abstractC0596h02.f1933s) {
            if (abstractC0596h02.f1930N) {
                abstractC0596h02.m988Y0();
            }
        }
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0564I c0564i2 = (C0564I) objArr[i6];
            if (c0564i2.m840v() != Integer.MAX_VALUE) {
                c0564i2.f1700K.f1760p.m932n0();
                C0564I.m791W(c0564i2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public final void m933p0() {
        if (this.f1858u) {
            this.f1858u = false;
            C0568M c0568m = this.f1846i;
            C0564I c0564i = c0568m.f1745a;
            C0564I c0564i2 = c0568m.f1745a;
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getRectManager().m2212g(c0564i2);
            C0590e0 c0590e0 = c0564i2.f1699J;
            AbstractC0596h0 abstractC0596h0 = c0590e0.f1893c.f1933s;
            for (AbstractC0596h0 abstractC0596h02 = c0590e0.f1894d; !AbstractC1665j.m2981a(abstractC0596h02, abstractC0596h0) && abstractC0596h02 != null; abstractC0596h02 = abstractC0596h02.f1933s) {
                abstractC0596h02.m994e1();
                abstractC0596h02.m999j1();
            }
            C1483e c1483eM843y = c0564i2.m843y();
            Object[] objArr = c1483eM843y.f5181d;
            int i5 = c1483eM843y.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                ((C0564I) objArr[i6]).f1700K.f1760p.m933p0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public final void m934r0() {
        C0568M c0568m = this.f1846i;
        if (c0568m.f1756l > 0) {
            C1483e c1483eM843y = c0568m.f1745a.m843y();
            Object[] objArr = c1483eM843y.f5181d;
            int i5 = c1483eM843y.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                C0564I c0564i = (C0564I) objArr[i6];
                C0568M c0568m2 = c0564i.f1700K;
                boolean z5 = c0568m2.f1754j;
                C0580Z c0580z = c0568m2.f1760p;
                if ((z5 || c0568m2.f1755k) && !c0580z.f1861x) {
                    c0564i.m812U(false);
                }
                c0580z.m934r0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0581a
    public final void requestLayout() {
        this.f1846i.f1745a.m812U(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public final void m935s0() {
        C0568M c0568m = this.f1846i;
        C0564I.m790V(c0568m.f1745a, false, 7);
        C0564I c0564i = c0568m.f1745a;
        C0564I c0564iM839u = c0564i.m839u();
        if (c0564iM839u == null || c0564i.f1696G != EnumC0561G.f1684f) {
            return;
        }
        int iOrdinal = c0564iM839u.f1700K.f1748d.ordinal();
        c0564i.f1696G = iOrdinal != 0 ? iOrdinal != 2 ? c0564iM839u.f1696G : EnumC0561G.f1683e : EnumC0561G.f1682d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public final void m936t0() {
        this.f1840H = true;
        C0568M c0568m = this.f1846i;
        C0564I c0564iM839u = c0568m.f1745a.m839u();
        float f2 = mo909w().f1920D;
        C0564I c0564i = c0568m.f1745a;
        C0590e0 c0590e0 = c0564i.f1699J;
        AbstractC0596h0 abstractC0596h0 = c0590e0.f1894d;
        C0617s c0617s = c0590e0.f1893c;
        while (abstractC0596h0 != c0617s) {
            AbstractC1665j.m2983c(abstractC0596h0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C0631z c0631z = (C0631z) abstractC0596h0;
            f2 += c0631z.f1920D;
            abstractC0596h0 = c0631z.f1933s;
        }
        if (f2 != this.f1839G) {
            this.f1839G = f2;
            if (c0564iM839u != null) {
                c0564iM839u.m807O();
            }
            if (c0564iM839u != null) {
                c0564iM839u.m794B();
            }
        }
        if (!mo909w().f1781n) {
            boolean z5 = this.f1858u;
            if (!z5 || this.f1863z.m848d()) {
                m932n0();
            }
            if (z5) {
                c0564i.f1699J.f1893c.m992c1();
            } else {
                if (c0564iM839u != null) {
                    c0564iM839u.m794B();
                }
                if (this.f1847j && c0564iM839u != null) {
                    c0564iM839u.m812U(false);
                }
            }
        }
        if (c0564iM839u != null) {
            C0568M c0568m2 = c0564iM839u.f1700K;
            if (!this.f1847j && c0568m2.f1748d == EnumC0557E.f1674f) {
                if (this.f1849l != Integer.MAX_VALUE) {
                    AbstractC0277a.m483b("Place was called on a node which was placed already");
                }
                int i5 = c0568m2.f1753i;
                this.f1849l = i5;
                c0568m2.f1753i = i5 + 1;
            }
        } else {
            this.f1849l = 0;
        }
        mo913y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0584b0
    /* JADX INFO: renamed from: v */
    public final void mo890v(boolean z5) {
        C0568M c0568m = this.f1846i;
        if (z5 != c0568m.m867a().f1779l) {
            c0568m.m867a().f1779l = z5;
            this.f1845M = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: w */
    public final C0617s mo909w() {
        return this.f1846i.f1745a.f1699J.f1893c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final void m937w0(long j5, float f2, InterfaceC1601c interfaceC1601c) {
        C0568M c0568m = this.f1846i;
        C0564I c0564i = c0568m.f1745a;
        C0564I c0564i2 = c0568m.f1745a;
        if (c0564i.f1710U) {
            AbstractC0277a.m482a("place is called on a deactivated node");
        }
        c0568m.f1748d = EnumC0557E.f1674f;
        this.f1853p = j5;
        this.f1855r = f2;
        this.f1854q = interfaceC1601c;
        this.f1840H = false;
        InterfaceC0614q0 interfaceC0614q0M866a = AbstractC0567L.m866a(c0564i2);
        if (this.f1861x || !this.f1858u) {
            this.f1863z.f1738e = false;
            c0568m.m872f(false);
            this.f1841I = interfaceC1601c;
            this.f1842J = j5;
            this.f1843K = f2;
            C0618s0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0M866a).getSnapshotObserver();
            snapshotObserver.f1972a.m3867c(c0564i2, snapshotObserver.f1977f, this.f1844L);
        } else {
            AbstractC0596h0 abstractC0596h0M867a = c0568m.m867a();
            abstractC0596h0M867a.m997h1(C2014j.m3702c(j5, abstractC0596h0M867a.f1210h), f2, interfaceC1601c);
            m936t0();
        }
        c0568m.f1748d = EnumC0557E.f1676h;
        if (c0568m.m867a().f1781n && (c0568m.f1755k || c0568m.f1754j)) {
            requestLayout();
        }
        this.f1851n = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: x */
    public final InterfaceC0581a mo911x() {
        C0568M c0568m;
        C0564I c0564iM839u = this.f1846i.f1745a.m839u();
        if (c0564iM839u == null || (c0568m = c0564iM839u.f1700K) == null) {
            return null;
        }
        return c0568m.f1760p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final boolean m938x0(long j5) {
        C0568M c0568m = this.f1846i;
        C0564I c0564i = c0568m.f1745a;
        C0564I c0564i2 = c0568m.f1745a;
        try {
            if (c0564i.f1710U) {
                AbstractC0277a.m482a("measure is called on a deactivated node");
            }
            InterfaceC0614q0 interfaceC0614q0M866a = AbstractC0567L.m866a(c0564i2);
            C0564I c0564iM839u = c0564i2.m839u();
            boolean z5 = true;
            c0564i2.f1698I = c0564i2.f1698I || (c0564iM839u != null && c0564iM839u.f1698I);
            if (!c0564i2.m835q() && C2005a.m3674b(this.f1209g, j5)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0M866a).m1308l(c0564i2, false);
                c0564i2.m813X();
                return false;
            }
            this.f1863z.f1737d = false;
            C1483e c1483eM843y = c0564i2.m843y();
            Object[] objArr = c1483eM843y.f5181d;
            int i5 = c1483eM843y.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                ((C0564I) objArr[i6]).f1700K.f1760p.f1863z.getClass();
            }
            this.f1850m = true;
            long j6 = c0568m.m867a().f1208f;
            m668l0(j5);
            EnumC0557E enumC0557E = c0568m.f1748d;
            EnumC0557E enumC0557E2 = EnumC0557E.f1676h;
            if (enumC0557E != enumC0557E2) {
                AbstractC0277a.m483b("layout state is not idle before measure starts");
            }
            this.f1836D = j5;
            EnumC0557E enumC0557E3 = EnumC0557E.f1672d;
            c0568m.f1748d = enumC0557E3;
            this.f1860w = false;
            C0618s0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i2)).getSnapshotObserver();
            snapshotObserver.f1972a.m3867c(c0564i2, snapshotObserver.f1974c, this.f1837E);
            if (c0568m.f1748d == enumC0557E3) {
                this.f1861x = true;
                this.f1862y = true;
                c0568m.f1748d = enumC0557E2;
            }
            if (C2016l.m3704a(c0568m.m867a().f1208f, j6) && c0568m.m867a().f1206d == this.f1206d && c0568m.m867a().f1207e == this.f1207e) {
                z5 = false;
            }
            m667j0((((long) c0568m.m867a().f1207e) & 4294967295L) | (((long) c0568m.m867a().f1206d) << 32));
            return z5;
        } catch (Throwable th) {
            c0564i.m814Y(th);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: y */
    public final void mo913y() {
        boolean zM938x0;
        this.f1835C = true;
        C0565J c0565j = this.f1863z;
        c0565j.m852h();
        boolean z5 = this.f1861x;
        C0568M c0568m = this.f1846i;
        if (z5) {
            C1483e c1483eM843y = c0568m.f1745a.m843y();
            Object[] objArr = c1483eM843y.f5181d;
            int i5 = c1483eM843y.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                C0564I c0564i = (C0564I) objArr[i6];
                boolean zM835q = c0564i.m835q();
                C0568M c0568m2 = c0564i.f1700K;
                if (zM835q && c0564i.m836r() == EnumC0561G.f1682d) {
                    C0580Z c0580z = c0568m2.f1760p;
                    C2005a c2005a = c0580z.f1850m ? new C2005a(c0580z.f1209g) : null;
                    if (c2005a != null) {
                        if (c0564i.f1696G == EnumC0561G.f1684f) {
                            c0564i.m822e();
                        }
                        zM938x0 = c0568m2.f1760p.m938x0(c2005a.f6726a);
                    } else {
                        zM938x0 = false;
                    }
                    if (zM938x0) {
                        C0564I.m790V(c0568m.f1745a, false, 7);
                    }
                }
            }
        }
        if (this.f1862y || (!mo909w().f1781n && this.f1861x)) {
            this.f1861x = false;
            EnumC0557E enumC0557E = c0568m.f1748d;
            c0568m.f1748d = EnumC0557E.f1674f;
            c0568m.m873g(false);
            C0564I c0564i2 = c0568m.f1745a;
            C0618s0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i2)).getSnapshotObserver();
            snapshotObserver.f1972a.m3867c(c0564i2, snapshotObserver.f1976e, this.f1838F);
            c0568m.f1748d = enumC0557E;
            this.f1862y = false;
        }
        if (c0565j.f1735b && c0565j.m849e()) {
            c0565j.m851g();
        }
        this.f1835C = false;
    }
}
