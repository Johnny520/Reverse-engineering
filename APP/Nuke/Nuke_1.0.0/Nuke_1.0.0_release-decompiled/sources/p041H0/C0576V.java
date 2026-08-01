package p041H0;

import p007B0.C0172E;
import p023E0.AbstractC0277a;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.AbstractC2006b;
import p153e1.C2005a;

/* JADX INFO: renamed from: H0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0576V extends AbstractC0391b0 implements InterfaceC0376N, InterfaceC0581a, InterfaceC0584b0 {

    /* JADX INFO: renamed from: D */
    public boolean f1800D;

    /* JADX INFO: renamed from: i */
    public final C0568M f1801i;

    /* JADX INFO: renamed from: j */
    public boolean f1802j;

    /* JADX INFO: renamed from: n */
    public boolean f1806n;

    /* JADX INFO: renamed from: o */
    public boolean f1807o;

    /* JADX INFO: renamed from: p */
    public C2005a f1808p;

    /* JADX INFO: renamed from: r */
    public InterfaceC1601c f1810r;

    /* JADX INFO: renamed from: w */
    public boolean f1815w;

    /* JADX INFO: renamed from: z */
    public Object f1818z;

    /* JADX INFO: renamed from: k */
    public int f1803k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    public int f1804l = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: m */
    public EnumC0561G f1805m = EnumC0561G.f1684f;

    /* JADX INFO: renamed from: q */
    public long f1809q = 0;

    /* JADX INFO: renamed from: s */
    public EnumC0574T f1811s = EnumC0574T.f1793f;

    /* JADX INFO: renamed from: t */
    public final C0565J f1812t = new C0565J(this, 1);

    /* JADX INFO: renamed from: u */
    public final C1483e f1813u = new C1483e(new C0576V[16]);

    /* JADX INFO: renamed from: v */
    public boolean f1814v = true;

    /* JADX INFO: renamed from: x */
    public final C0575U f1816x = new C0575U(this, 0);

    /* JADX INFO: renamed from: y */
    public boolean f1817y = true;

    /* JADX INFO: renamed from: A */
    public long f1797A = AbstractC2006b.m3685b(0, 0, 15);

    /* JADX INFO: renamed from: B */
    public final C0575U f1798B = new C0575U(this, 2);

    /* JADX INFO: renamed from: C */
    public final C0575U f1799C = new C0575U(this, 1);

    public C0576V(C0568M c0568m) {
        this.f1801i = c0568m;
        this.f1818z = c0568m.f1760p.f1857t;
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: T */
    public final int mo645T(int i5) {
        m907s0();
        AbstractC0573S abstractC0573SMo979P0 = this.f1801i.m867a().mo979P0();
        AbstractC1665j.m2982b(abstractC0573SMo979P0);
        return abstractC0573SMo979P0.mo645T(i5);
    }

    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: U */
    public final int mo899U() {
        return this.f1804l;
    }

    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: W */
    public final void mo900W() {
        C0564I.m789T(this.f1801i.f1745a, false, 7);
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: X */
    public final int mo646X(int i5) {
        m907s0();
        AbstractC0573S abstractC0573SMo979P0 = this.f1801i.m867a().mo979P0();
        AbstractC1665j.m2982b(abstractC0573SMo979P0);
        return abstractC0573SMo979P0.mo646X(i5);
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: Z */
    public final int mo647Z(int i5) {
        m907s0();
        AbstractC0573S abstractC0573SMo979P0 = this.f1801i.m867a().mo979P0();
        AbstractC1665j.m2982b(abstractC0573SMo979P0);
        return abstractC0573SMo979P0.mo647Z(i5);
    }

    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: a */
    public final C0565J mo901a() {
        return this.f1812t;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p029F0.AbstractC0391b0 mo648e(long r6) {
        /*
            r5 = this;
            H0.M r0 = r5.f1801i
            H0.I r1 = r0.f1745a
            H0.I r1 = r1.m839u()
            r2 = 0
            if (r1 == 0) goto L10
            H0.M r1 = r1.f1700K
            H0.E r1 = r1.f1748d
            goto L11
        L10:
            r1 = r2
        L11:
            H0.E r3 = p041H0.EnumC0557E.f1673e
            if (r1 == r3) goto L25
            H0.I r1 = r0.f1745a
            H0.I r1 = r1.m839u()
            if (r1 == 0) goto L21
            H0.M r1 = r1.f1700K
            H0.E r2 = r1.f1748d
        L21:
            H0.E r1 = p041H0.EnumC0557E.f1675g
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f1746b = r1
        L28:
            H0.I r1 = r0.f1745a
            H0.I r2 = r1.m839u()
            if (r2 == 0) goto L72
            H0.M r2 = r2.f1700K
            H0.G r3 = r5.f1805m
            H0.G r4 = p041H0.EnumC0561G.f1684f
            if (r3 == r4) goto L42
            boolean r1 = r1.f1698I
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            p023E0.AbstractC0277a.m483b(r1)
        L42:
            H0.E r1 = r2.f1748d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6d
            r3 = 1
            if (r1 == r3) goto L6d
            r3 = 2
            if (r1 == r3) goto L6a
            r3 = 3
            if (r1 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            H0.E r0 = r2.f1748d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6a:
            H0.G r1 = p041H0.EnumC0561G.f1683e
            goto L6f
        L6d:
            H0.G r1 = p041H0.EnumC0561G.f1682d
        L6f:
            r5.f1805m = r1
            goto L76
        L72:
            H0.G r1 = p041H0.EnumC0561G.f1684f
            r5.f1805m = r1
        L76:
            H0.I r0 = r0.f1745a
            H0.G r1 = r0.f1696G
            H0.G r2 = p041H0.EnumC0561G.f1684f
            if (r1 != r2) goto L81
            r0.m822e()
        L81:
            r5.m912x0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.C0576V.mo648e(long):F0.b0");
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: f */
    public final int mo649f(int i5) {
        m907s0();
        AbstractC0573S abstractC0573SMo979P0 = this.f1801i.m867a().mo979P0();
        AbstractC1665j.m2982b(abstractC0573SMo979P0);
        return abstractC0573SMo979P0.mo649f(i5);
    }

    @Override // p029F0.AbstractC0391b0
    /* JADX INFO: renamed from: i0 */
    public final void mo666i0(long j5, float f2, InterfaceC1601c interfaceC1601c) {
        m910w0(j5, interfaceC1601c);
    }

    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: j */
    public final void mo902j(C0172E c0172e) {
        C1483e c1483eM843y = this.f1801i.f1745a.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0576V c0576v = ((C0564I) objArr[i6]).f1700K.f1761q;
            AbstractC1665j.m2982b(c0576v);
            c0172e.mo1h(c0576v);
        }
    }

    @Override // p029F0.AbstractC0391b0, p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: l */
    public final Object mo650l() {
        return this.f1818z;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m903m0() {
        C0568M c0568m = this.f1801i;
        return AbstractC0601k.m1039o(c0568m.f1745a) || c0568m.f1747c;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m904n0(boolean z5) {
        if (z5 && m903m0()) {
            return;
        }
        if (z5 || m903m0()) {
            this.f1811s = EnumC0574T.f1793f;
            C1483e c1483eM843y = this.f1801i.f1745a.m843y();
            Object[] objArr = c1483eM843y.f5181d;
            int i5 = c1483eM843y.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                C0576V c0576v = ((C0564I) objArr[i6]).f1700K.f1761q;
                AbstractC1665j.m2982b(c0576v);
                c0576v.m904n0(true);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m905p0() {
        EnumC0574T enumC0574T = this.f1811s;
        C0568M c0568m = this.f1801i;
        boolean z5 = c0568m.f1747c;
        C0564I c0564i = c0568m.f1745a;
        EnumC0574T enumC0574T2 = EnumC0574T.f1791d;
        if (z5) {
            this.f1811s = EnumC0574T.f1792e;
        } else {
            this.f1811s = enumC0574T2;
        }
        if (enumC0574T != enumC0574T2 && c0568m.f1749e) {
            C0564I.m789T(c0564i, true, 6);
        }
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0564I c0564i2 = (C0564I) objArr[i6];
            C0576V c0576v = c0564i2.f1700K.f1761q;
            if (c0576v == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (c0576v.f1804l != Integer.MAX_VALUE) {
                c0576v.m905p0();
                C0564I.m791W(c0564i2);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m906r0() {
        C0568M c0568m = this.f1801i;
        if (c0568m.f1759o > 0) {
            C1483e c1483eM843y = c0568m.f1745a.m843y();
            Object[] objArr = c1483eM843y.f5181d;
            int i5 = c1483eM843y.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                C0564I c0564i = (C0564I) objArr[i6];
                C0568M c0568m2 = c0564i.f1700K;
                if ((c0568m2.f1757m || c0568m2.f1758n) && !c0568m2.f1750f) {
                    c0564i.m811S(false);
                }
                C0576V c0576v = c0568m2.f1761q;
                if (c0576v != null) {
                    c0576v.m906r0();
                }
            }
        }
    }

    @Override // p041H0.InterfaceC0581a
    public final void requestLayout() {
        this.f1801i.f1745a.m811S(false);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m907s0() {
        C0568M c0568m = this.f1801i;
        C0564I.m789T(c0568m.f1745a, false, 7);
        C0564I c0564i = c0568m.f1745a;
        C0564I c0564iM839u = c0564i.m839u();
        if (c0564iM839u == null || c0564i.f1696G != EnumC0561G.f1684f) {
            return;
        }
        int iOrdinal = c0564iM839u.f1700K.f1748d.ordinal();
        c0564i.f1696G = iOrdinal != 0 ? iOrdinal != 2 ? c0564iM839u.f1696G : EnumC0561G.f1683e : EnumC0561G.f1682d;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m908t0() {
        EnumC0557E enumC0557E;
        this.f1800D = true;
        C0568M c0568m = this.f1801i;
        C0564I c0564iM839u = c0568m.f1745a.m839u();
        EnumC0574T enumC0574T = this.f1811s;
        if ((enumC0574T != EnumC0574T.f1791d && !c0568m.f1747c) || (enumC0574T != EnumC0574T.f1792e && c0568m.f1747c)) {
            m905p0();
            if (this.f1802j && c0564iM839u != null) {
                c0564iM839u.m811S(false);
            }
        }
        if (c0564iM839u != null) {
            C0568M c0568m2 = c0564iM839u.f1700K;
            if (!this.f1802j && ((enumC0557E = c0568m2.f1748d) == EnumC0557E.f1674f || enumC0557E == EnumC0557E.f1675g)) {
                if (this.f1804l != Integer.MAX_VALUE) {
                    AbstractC0277a.m483b("Place was called on a node which was placed already");
                }
                int i5 = c0568m2.f1752h;
                this.f1804l = i5;
                c0568m2.f1752h = i5 + 1;
            }
        } else {
            this.f1804l = 0;
        }
        mo913y();
    }

    @Override // p041H0.InterfaceC0584b0
    /* JADX INFO: renamed from: v */
    public final void mo890v(boolean z5) {
        AbstractC0573S abstractC0573SMo979P0;
        C0568M c0568m = this.f1801i;
        AbstractC0573S abstractC0573SMo979P02 = c0568m.m867a().mo979P0();
        if (Boolean.valueOf(z5).equals(abstractC0573SMo979P02 != null ? Boolean.valueOf(abstractC0573SMo979P02.f1779l) : null) || (abstractC0573SMo979P0 = c0568m.m867a().mo979P0()) == null) {
            return;
        }
        abstractC0573SMo979P0.f1779l = z5;
    }

    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: w */
    public final C0617s mo909w() {
        return this.f1801i.f1745a.f1699J.f1893c;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /* JADX INFO: renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m910w0(long r10, p112W2.InterfaceC1601c r12) {
        /*
            r9 = this;
            H0.M r0 = r9.f1801i
            H0.I r1 = r0.f1745a
            H0.I r2 = r0.f1745a
            r3 = 0
            H0.I r4 = r1.m839u()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L12
            H0.M r4 = r4.f1700K     // Catch: java.lang.Throwable -> L1b
            H0.E r4 = r4.f1748d     // Catch: java.lang.Throwable -> L1b
            goto L13
        L12:
            r4 = r3
        L13:
            H0.E r5 = p041H0.EnumC0557E.f1675g     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            if (r4 != r5) goto L1d
            r0.f1747c = r6     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r10 = move-exception
            goto L8b
        L1d:
            boolean r4 = r2.f1710U     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L26
            java.lang.String r4 = "place is called on a deactivated node"
            p023E0.AbstractC0277a.m482a(r4)     // Catch: java.lang.Throwable -> L1b
        L26:
            r0.f1748d = r5     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r9.f1806n = r4     // Catch: java.lang.Throwable -> L1b
            r9.f1800D = r6     // Catch: java.lang.Throwable -> L1b
            long r7 = r9.f1809q     // Catch: java.lang.Throwable -> L1b
            boolean r5 = p153e1.C2014j.m3700a(r10, r7)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L42
            boolean r5 = r0.f1758n     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3d
            boolean r5 = r0.f1757m     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L3f
        L3d:
            r0.f1750f = r4     // Catch: java.lang.Throwable -> L1b
        L3f:
            r9.m906r0()     // Catch: java.lang.Throwable -> L1b
        L42:
            H0.q0 r5 = p041H0.AbstractC0567L.m866a(r2)     // Catch: java.lang.Throwable -> L1b
            r9.f1809q = r10     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r0.f1750f     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L6e
            H0.T r7 = r9.f1811s     // Catch: java.lang.Throwable -> L1b
            H0.T r8 = p041H0.EnumC0574T.f1793f     // Catch: java.lang.Throwable -> L1b
            if (r7 == r8) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == 0) goto L6e
            H0.h0 r2 = r0.m867a()     // Catch: java.lang.Throwable -> L1b
            H0.S r2 = r2.mo979P0()     // Catch: java.lang.Throwable -> L1b
            p117X2.AbstractC1665j.m2982b(r2)     // Catch: java.lang.Throwable -> L1b
            long r4 = r2.f1210h     // Catch: java.lang.Throwable -> L1b
            long r10 = p153e1.C2014j.m3702c(r10, r4)     // Catch: java.lang.Throwable -> L1b
            r2.m897I0(r10)     // Catch: java.lang.Throwable -> L1b
            r9.m908t0()     // Catch: java.lang.Throwable -> L1b
            goto L84
        L6e:
            r0.m874h(r6)     // Catch: java.lang.Throwable -> L1b
            H0.J r10 = r9.f1812t     // Catch: java.lang.Throwable -> L1b
            r10.f1738e = r6     // Catch: java.lang.Throwable -> L1b
            I0.y r5 = (p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y) r5     // Catch: java.lang.Throwable -> L1b
            H0.s0 r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L1b
            H0.U r11 = r9.f1799C     // Catch: java.lang.Throwable -> L1b
            H0.d r4 = r10.f1978g     // Catch: java.lang.Throwable -> L1b
            f0.t r10 = r10.f1972a     // Catch: java.lang.Throwable -> L1b
            r10.m3867c(r2, r4, r11)     // Catch: java.lang.Throwable -> L1b
        L84:
            r9.f1810r = r12     // Catch: java.lang.Throwable -> L1b
            H0.E r10 = p041H0.EnumC0557E.f1676h     // Catch: java.lang.Throwable -> L1b
            r0.f1748d = r10     // Catch: java.lang.Throwable -> L1b
            return
        L8b:
            r1.m814Y(r10)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.C0576V.m910w0(long, W2.c):void");
    }

    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: x */
    public final InterfaceC0581a mo911x() {
        C0568M c0568m;
        C0564I c0564iM839u = this.f1801i.f1745a.m839u();
        if (c0564iM839u == null || (c0568m = c0564iM839u.f1700K) == null) {
            return null;
        }
        return c0568m.f1761q;
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m912x0(long j5) {
        long j6;
        C0568M c0568m = this.f1801i;
        C0564I c0564i = c0568m.f1745a;
        C0564I c0564i2 = c0568m.f1745a;
        try {
            if (c0564i.f1710U) {
                AbstractC0277a.m482a("measure is called on a deactivated node");
            }
            C0564I c0564iM839u = c0564i2.m839u();
            c0564i2.f1698I = c0564i2.f1698I || (c0564iM839u != null && c0564iM839u.f1698I);
            if (!c0564i2.f1700K.f1749e) {
                C2005a c2005a = this.f1808p;
                if (c2005a == null ? false : C2005a.m3674b(c2005a.f6726a, j5)) {
                    InterfaceC0614q0 interfaceC0614q0 = c0564i2.f1725r;
                    if (interfaceC0614q0 != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0).m1308l(c0564i2, true);
                    }
                    c0564i2.m813X();
                    return false;
                }
            }
            this.f1808p = new C2005a(j5);
            m668l0(j5);
            this.f1812t.f1737d = false;
            C1483e c1483eM843y = c0564i2.m843y();
            Object[] objArr = c1483eM843y.f5181d;
            int i5 = c1483eM843y.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                C0576V c0576v = ((C0564I) objArr[i6]).f1700K.f1761q;
                AbstractC1665j.m2982b(c0576v);
                c0576v.f1812t.getClass();
            }
            if (this.f1807o) {
                j6 = this.f1208f;
            } else {
                long j7 = Integer.MIN_VALUE;
                j6 = (j7 & 4294967295L) | (j7 << 32);
            }
            this.f1807o = true;
            AbstractC0573S abstractC0573SMo979P0 = c0568m.m867a().mo979P0();
            if (!(abstractC0573SMo979P0 != null)) {
                AbstractC0277a.m483b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            c0568m.m869c(j5);
            m667j0((((long) abstractC0573SMo979P0.f1207e) & 4294967295L) | (((long) abstractC0573SMo979P0.f1206d) << 32));
            return (((int) (j6 >> 32)) == abstractC0573SMo979P0.f1206d && ((int) (j6 & 4294967295L)) == abstractC0573SMo979P0.f1207e) ? false : true;
        } catch (Throwable th) {
            c0564i.m814Y(th);
            throw null;
        }
    }

    @Override // p041H0.InterfaceC0581a
    /* JADX INFO: renamed from: y */
    public final void mo913y() {
        this.f1815w = true;
        C0565J c0565j = this.f1812t;
        c0565j.m852h();
        C0568M c0568m = this.f1801i;
        boolean z5 = c0568m.f1750f;
        C0564I c0564i = c0568m.f1745a;
        if (z5) {
            C1483e c1483eM843y = c0564i.m843y();
            Object[] objArr = c1483eM843y.f5181d;
            int i5 = c1483eM843y.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                C0564I c0564i2 = (C0564I) objArr[i6];
                C0568M c0568m2 = c0564i2.f1700K;
                if (c0568m2.f1749e && c0564i2.m837s() == EnumC0561G.f1682d) {
                    C0576V c0576v = c0568m2.f1761q;
                    AbstractC1665j.m2982b(c0576v);
                    C0576V c0576v2 = c0568m2.f1761q;
                    C2005a c2005a = c0576v2 != null ? c0576v2.f1808p : null;
                    AbstractC1665j.m2982b(c2005a);
                    if (c0576v.m912x0(c2005a.f6726a)) {
                        C0564I.m789T(c0564i, false, 7);
                    }
                }
            }
        }
        C0615r c0615r = mo909w().f1971V;
        AbstractC1665j.m2982b(c0615r);
        if (c0568m.f1751g || (!c0615r.f1781n && c0568m.f1750f)) {
            c0568m.f1750f = false;
            EnumC0557E enumC0557E = c0568m.f1748d;
            c0568m.f1748d = EnumC0557E.f1675g;
            c0568m.m875i(false);
            C0618s0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getSnapshotObserver();
            snapshotObserver.f1972a.m3867c(c0564i, snapshotObserver.f1979h, this.f1816x);
            c0568m.f1748d = enumC0557E;
            if (c0568m.f1757m && c0615r.f1781n) {
                requestLayout();
            }
            c0568m.f1751g = false;
        }
        if (c0565j.f1735b && c0565j.m849e()) {
            c0565j.m851g();
        }
        this.f1815w = false;
    }
}
