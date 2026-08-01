package p095T;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p000A.C0002B;
import p000A.C0066i0;
import p027E4.C0330q;
import p028F.C0352m;
import p029F0.C0363A;
import p041H0.C0560F0;
import p056K2.C0882h;
import p061L2.C0983w;
import p100U.C1439L;
import p100U.C1440a;
import p105V.C1486h;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p136b0.C1849k;
import p179i4.AbstractC2352g;
import p186k.C2408E;
import p186k.C2409F;
import p186k.C2411H;
import p186k.C2439u;

/* JADX INFO: renamed from: T.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1397y implements InterfaceC1389u {

    /* JADX INFO: renamed from: d */
    public final AbstractC1391v f4955d;

    /* JADX INFO: renamed from: e */
    public final C0560F0 f4956e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f4957f = new AtomicReference(null);

    /* JADX INFO: renamed from: g */
    public final Object f4958g = new Object();

    /* JADX INFO: renamed from: h */
    public final C2411H f4959h;

    /* JADX INFO: renamed from: i */
    public final C1318I0 f4960i;

    /* JADX INFO: renamed from: j */
    public final C2408E f4961j;

    /* JADX INFO: renamed from: k */
    public final C2409F f4962k;

    /* JADX INFO: renamed from: l */
    public final C2409F f4963l;

    /* JADX INFO: renamed from: m */
    public final C2408E f4964m;

    /* JADX INFO: renamed from: n */
    public final C1440a f4965n;

    /* JADX INFO: renamed from: o */
    public final C1440a f4966o;

    /* JADX INFO: renamed from: p */
    public final C2408E f4967p;

    /* JADX INFO: renamed from: q */
    public C2408E f4968q;

    /* JADX INFO: renamed from: r */
    public boolean f4969r;

    /* JADX INFO: renamed from: s */
    public C0363A f4970s;

    /* JADX INFO: renamed from: t */
    public C1370k0 f4971t;

    /* JADX INFO: renamed from: u */
    public C1397y f4972u;

    /* JADX INFO: renamed from: v */
    public int f4973v;

    /* JADX INFO: renamed from: w */
    public final C0066i0 f4974w;

    /* JADX INFO: renamed from: x */
    public final C1849k f4975x;

    /* JADX INFO: renamed from: y */
    public final C1383r f4976y;

    /* JADX INFO: renamed from: z */
    public int f4977z;

    public C1397y(AbstractC1391v abstractC1391v, C0560F0 c0560f0) {
        this.f4955d = abstractC1391v;
        this.f4956e = c0560f0;
        C2411H c2411h = new C2411H(new C2409F());
        this.f4959h = c2411h;
        C1318I0 c1318i0 = new C1318I0();
        if (abstractC1391v.mo2522d()) {
            c1318i0.f4715n = new C2439u();
        }
        if (abstractC1391v.mo2524f()) {
            c1318i0.m2437b();
        }
        this.f4960i = c1318i0;
        this.f4961j = AbstractC2352g.m4201n();
        this.f4962k = new C2409F();
        this.f4963l = new C2409F();
        this.f4964m = AbstractC2352g.m4201n();
        C1440a c1440a = new C1440a();
        this.f4965n = c1440a;
        C1440a c1440a2 = new C1440a();
        this.f4966o = c1440a2;
        this.f4967p = AbstractC2352g.m4201n();
        this.f4968q = AbstractC2352g.m4201n();
        C0066i0 c0066i0 = new C0066i0(18, abstractC1391v);
        this.f4974w = c0066i0;
        this.f4975x = new C1849k();
        C1383r c1383r = new C1383r(c0560f0, abstractC1391v, c1318i0, c2411h, c1440a, c1440a2, c0066i0, this);
        abstractC1391v.mo2534p(c1383r);
        this.f4976y = c1383r;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2645A(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f4958g
            monitor-enter(r0)
            r14.m2668v(r15)     // Catch: java.lang.Throwable -> L4f
            k.E r1 = r14.f4964m     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.m4272g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof p186k.C2409F     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            k.F r15 = (p186k.C2409F) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f7794b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f7793a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            T.F r10 = (p095T.C1311F) r10     // Catch: java.lang.Throwable -> L4f
            r14.m2668v(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            T.F r15 = (p095T.C1311F) r15     // Catch: java.lang.Throwable -> L4f
            r14.m2668v(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1397y.m2645A(java.lang.Object):void");
    }

    /* JADX INFO: renamed from: B */
    public final void m2646B(InterfaceC1603e interfaceC1603e) {
        boolean zM2655i = m2655i();
        m2663q();
        AbstractC1391v abstractC1391v = this.f4955d;
        if (!zM2655i) {
            abstractC1391v.mo2519a(this, interfaceC1603e);
            return;
        }
        C1383r c1383r = this.f4976y;
        c1383r.f4909z = 0;
        c1383r.f4908y = true;
        abstractC1391v.mo2519a(this, interfaceC1603e);
        c1383r.m2600s();
    }

    /* JADX INFO: renamed from: a */
    public final void m2647a() {
        this.f4957f.set(null);
        this.f4965n.f5102h.m2724v();
        this.f4966o.f5102h.m2724v();
        C2411H c2411h = this.f4959h;
        if (c2411h.f7810d.m4285g()) {
            return;
        }
        C1849k c1849k = this.f4975x;
        try {
            c1849k.m3322g(c2411h, this.f4976y.m2607z());
            c1849k.m3318b();
        } finally {
            c1849k.m3317a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2648b(java.lang.Object r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            k.E r2 = r0.f4961j
            java.lang.Object r2 = r2.m4272g(r1)
            if (r2 == 0) goto L9c
            boolean r3 = r2 instanceof p186k.C2409F
            T.P r4 = p095T.EnumC1331P.f4758d
            k.F r5 = r0.f4962k
            k.F r6 = r0.f4963l
            k.E r7 = r0.f4967p
            if (r3 == 0) goto L81
            k.F r2 = (p186k.C2409F) r2
            java.lang.Object[] r3 = r2.f7794b
            long[] r2 = r2.f7793a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9c
            r10 = 0
        L24:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7c
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3e:
            if (r15 >= r13) goto L79
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r9 = r16
            T.t0 r9 = (p095T.C1388t0) r9
            boolean r16 = p179i4.AbstractC2352g.m4180C(r7, r1, r9)
            if (r16 != 0) goto L70
            r16 = r14
            T.P r14 = r9.m2642c(r1)
            if (r14 == r4) goto L72
            k.E r14 = r9.f4931g
            if (r14 == 0) goto L6c
            if (r22 != 0) goto L6c
            r6.m4279a(r9)
            goto L72
        L6c:
            r5.m4279a(r9)
            goto L72
        L70:
            r16 = r14
        L72:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L3e
        L79:
            r9 = r14
            if (r13 != r9) goto L9c
        L7c:
            if (r10 == r8) goto L9c
            int r10 = r10 + 1
            goto L24
        L81:
            T.t0 r2 = (p095T.C1388t0) r2
            boolean r3 = p179i4.AbstractC2352g.m4180C(r7, r1, r2)
            if (r3 != 0) goto L9c
            T.P r1 = r2.m2642c(r1)
            if (r1 == r4) goto L9c
            k.E r1 = r2.f4931g
            if (r1 == 0) goto L99
            if (r22 != 0) goto L99
            r6.m4279a(r2)
            return
        L99:
            r5.m4279a(r2)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1397y.m2648b(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2649c(java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1397y.m2649c(java.util.Set, boolean):void");
    }

    /* JADX INFO: renamed from: d */
    public final void m2650d() {
        synchronized (this.f4958g) {
            try {
                m2651e(this.f4965n);
                m2661o();
            } catch (Throwable th) {
                try {
                    if (!this.f4959h.f7810d.m4285g()) {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th2) {
                            c1849k.m3317a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    m2647a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2651e(p100U.C1440a r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1397y.m2651e(U.a):void");
    }

    /* JADX INFO: renamed from: f */
    public final void m2652f() {
        synchronized (this.f4958g) {
            try {
                if (this.f4966o.f5102h.m2727y()) {
                    m2651e(this.f4966o);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4959h.f7810d.m4285g()) {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th2) {
                            c1849k.m3317a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2653g() {
        C1849k c1849k;
        synchronized (this.f4958g) {
            try {
                this.f4976y.f4905v = null;
                if (!this.f4959h.f7810d.m4285g()) {
                    c1849k = this.f4975x;
                    try {
                        c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                        c1849k.m3318b();
                        c1849k.m3317a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4959h.f7810d.m4285g()) {
                        c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m2647a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2654h() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1397y.m2654h():void");
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2655i() {
        boolean z5;
        synchronized (this.f4958g) {
            z5 = true;
            if (this.f4977z != 1) {
                z5 = false;
            }
            if (z5) {
                this.f4977z = 0;
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: j */
    public final void m2656j(InterfaceC1603e interfaceC1603e) {
        try {
            synchronized (this.f4958g) {
                m2660n();
                C2408E c2408e = this.f4968q;
                this.f4968q = AbstractC2352g.m4201n();
                try {
                    C1383r c1383r = this.f4976y;
                    C0363A c0363a = this.f4970s;
                    if (!c1383r.f4888e.f5102h.m2726x()) {
                        AbstractC1387t.m2638a("Expected applyChanges() to have been called");
                    }
                    c1383r.f4878P = c0363a;
                    try {
                        c1383r.m2595n(c2408e, interfaceC1603e);
                    } finally {
                        c1383r.f4878P = null;
                    }
                } catch (Throwable th) {
                    this.f4968q = c2408e;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f4959h.f7810d.m4285g()) {
                    C1849k c1849k = this.f4975x;
                    try {
                        c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                        c1849k.m3318b();
                        c1849k.m3317a();
                    } catch (Throwable th3) {
                        c1849k.m3317a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m2647a();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final C1370k0 m2657k(boolean z5, InterfaceC1603e interfaceC1603e) {
        if (this.f4971t != null) {
            AbstractC1380p0.m2543b("A pausable composition is in progress");
        }
        C1370k0 c1370k0 = new C1370k0(this, this.f4955d, this.f4976y, this.f4959h, interfaceC1603e, z5, this.f4956e, this.f4958g);
        this.f4971t = c1370k0;
        return c1370k0;
    }

    /* JADX INFO: renamed from: l */
    public final void m2658l() {
        synchronized (this.f4958g) {
            try {
                if (this.f4971t != null) {
                    AbstractC1380p0.m2543b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z5 = this.f4960i.f4706e > 0;
                if (z5 || !this.f4959h.f7810d.m4285g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            if (z5) {
                                C1324L0 c1324l0M2439d = this.f4960i.m2439d();
                                try {
                                    c1324l0M2439d.m2483n(c1324l0M2439d.f4742t, new C0352m(8, this.f4975x, c1324l0M2439d));
                                    c1324l0M2439d.m2475e(true);
                                    this.f4956e.mo784g();
                                    c1849k.m3319c();
                                } catch (Throwable th) {
                                    c1324l0M2439d.m2475e(false);
                                    throw th;
                                }
                            }
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th2) {
                            c1849k.m3317a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f4961j.m4266a();
                this.f4964m.m4266a();
                this.f4968q.m4266a();
                this.f4965n.f5102h.m2724v();
                this.f4966o.f5102h.m2724v();
                C1383r c1383r = this.f4976y;
                c1383r.f4867E.clear();
                c1383r.f4902s.clear();
                c1383r.f4888e.f5102h.m2724v();
                c1383r.f4905v = null;
                this.f4977z = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2659m() {
        synchronized (this.f4958g) {
            try {
                if (this.f4976y.f4868F) {
                    AbstractC1380p0.m2543b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f4977z != 3) {
                    this.f4977z = 3;
                    C1440a c1440a = this.f4976y.f4874L;
                    if (c1440a != null) {
                        m2651e(c1440a);
                    }
                    boolean z5 = this.f4960i.f4706e > 0;
                    if (z5 || !this.f4959h.f7810d.m4285g()) {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            if (z5) {
                                C1324L0 c1324l0M2439d = this.f4960i.m2439d();
                                try {
                                    c1324l0M2439d.m2483n(c1324l0M2439d.f4742t, new C0002B(8, this.f4975x));
                                    c1324l0M2439d.m2457H();
                                    c1324l0M2439d.m2475e(true);
                                    this.f4956e.m779a();
                                    this.f4956e.mo784g();
                                    c1849k.m3319c();
                                } catch (Throwable th) {
                                    c1324l0M2439d.m2475e(false);
                                    throw th;
                                }
                            }
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th2) {
                            c1849k.m3317a();
                            throw th2;
                        }
                    }
                    C1383r c1383r = this.f4976y;
                    c1383r.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c1383r.f4885b.mo2539u(c1383r);
                        c1383r.f4867E.clear();
                        c1383r.f4902s.clear();
                        c1383r.f4888e.f5102h.m2724v();
                        c1383r.f4905v = null;
                        c1383r.f4884a.m779a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f4955d.mo2540v(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m2660n() {
        Object obj = AbstractC1385s.f4912b;
        AtomicReference atomicReference = this.f4957f;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC1387t.m2639b("pending composition has not been applied");
                throw new C0330q();
            }
            if (andSet instanceof Set) {
                m2649c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC1387t.m2639b("corrupt pendingModifications drain: " + atomicReference);
                throw new C0330q();
            }
            for (Set set : (Set[]) andSet) {
                m2649c(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2661o() {
        AtomicReference atomicReference = this.f4957f;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC1665j.m2981a(andSet, AbstractC1385s.f4912b)) {
            return;
        }
        if (andSet instanceof Set) {
            m2649c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m2649c(set, false);
            }
            return;
        }
        if (andSet != null) {
            AbstractC1387t.m2639b("corrupt pendingModifications drain: " + atomicReference);
            throw new C0330q();
        }
        if (this.f4971t == null) {
            AbstractC1387t.m2638a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2662p() {
        C0983w c0983w = C0983w.f3049d;
        AtomicReference atomicReference = this.f4957f;
        Object andSet = atomicReference.getAndSet(c0983w);
        if (AbstractC1665j.m2981a(andSet, AbstractC1385s.f4912b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m2649c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC1387t.m2639b("corrupt pendingModifications drain: " + atomicReference);
            throw new C0330q();
        }
        for (Set set : (Set[]) andSet) {
            m2649c(set, false);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2663q() {
        int i5 = this.f4977z;
        if (i5 != 0) {
            AbstractC1380p0.m2543b(i5 != 1 ? i5 != 2 ? i5 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f4971t == null) {
            return;
        }
        AbstractC1380p0.m2543b("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: r */
    public final void m2664r(ArrayList arrayList) {
        C2411H c2411h = this.f4959h;
        C1383r c1383r = this.f4976y;
        if (arrayList.size() > 0) {
            ((AbstractC1346X) ((C0882h) arrayList.get(0)).f2769d).getClass();
            throw null;
        }
        try {
            c1383r.getClass();
            try {
                c1383r.m2548B(arrayList);
                c1383r.m2588i();
            } catch (Throwable th) {
                c1383r.m2572a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!c2411h.f7810d.m4285g()) {
                    C1849k c1849k = this.f4975x;
                    try {
                        c1849k.m3322g(c2411h, c1383r.m2607z());
                        c1849k.m3318b();
                        c1849k.m3317a();
                    } catch (Throwable th3) {
                        c1849k.m3317a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m2647a();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final EnumC1331P m2665s(C1388t0 c1388t0, Object obj) {
        C1397y c1397y;
        int i5 = c1388t0.f4926b;
        if ((i5 & 2) != 0) {
            c1388t0.f4926b = i5 | 4;
        }
        C1349a c1349a = c1388t0.f4927c;
        if (c1349a == null || !c1349a.m2499a()) {
            return EnumC1331P.f4758d;
        }
        if (this.f4960i.m2440e(c1349a)) {
            if (c1388t0.f4928d == null) {
                return EnumC1331P.f4758d;
            }
            EnumC1331P enumC1331PM2667u = m2667u(c1388t0, c1349a, obj);
            if (enumC1331PM2667u != EnumC1331P.f4758d) {
                this.f4974w.m69i();
            }
            return enumC1331PM2667u;
        }
        synchronized (this.f4958g) {
            c1397y = this.f4972u;
        }
        if (c1397y != null) {
            C1383r c1383r = c1397y.f4976y;
            if (c1383r.f4868F && c1383r.m2575b0(c1388t0, obj)) {
                return EnumC1331P.f4761g;
            }
        }
        return EnumC1331P.f4758d;
    }

    /* JADX INFO: renamed from: t */
    public final void m2666t() {
        C1397y c1397y;
        synchronized (this.f4958g) {
            try {
                for (Object obj : this.f4960i.f4707f) {
                    C1388t0 c1388t0 = obj instanceof C1388t0 ? (C1388t0) obj : null;
                    if (c1388t0 != null && (c1397y = c1388t0.f4925a) != null) {
                        c1397y.m2665s(c1388t0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:80:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], EDGE_INSN: B:81:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p095T.EnumC1331P m2667u(p095T.C1388t0 r21, p095T.C1349a r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1397y.m2667u(T.t0, T.a, java.lang.Object):T.P");
    }

    /* JADX INFO: renamed from: v */
    public final void m2668v(Object obj) {
        Object objM4272g = this.f4961j.m4272g(obj);
        if (objM4272g == null) {
            return;
        }
        boolean z5 = objM4272g instanceof C2409F;
        C2408E c2408e = this.f4967p;
        if (!z5) {
            C1388t0 c1388t0 = (C1388t0) objM4272g;
            if (c1388t0.m2642c(obj) == EnumC1331P.f4761g) {
                AbstractC2352g.m4192e(c2408e, obj, c1388t0);
                return;
            }
            return;
        }
        C2409F c2409f = (C2409F) objM4272g;
        Object[] objArr = c2409f.f7794b;
        long[] jArr = c2409f.f7793a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        C1388t0 c1388t02 = (C1388t0) objArr[(i5 << 3) + i7];
                        if (c1388t02.m2642c(obj) == EnumC1331P.f4761g) {
                            AbstractC2352g.m4192e(c2408e, obj, c1388t02);
                        }
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2669w(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof p105V.C1486h
            k.E r3 = r0.f4964m
            k.E r4 = r0.f4961j
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            V.h r1 = (p105V.C1486h) r1
            k.F r1 = r1.f5195d
            java.lang.Object[] r2 = r1.f7794b
            long[] r1 = r1.f7793a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.m4268c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.m4268c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.m4268c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.m4268c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1397y.m2669w(java.util.Set):boolean");
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2670x() {
        synchronized (this.f4958g) {
            C1370k0 c1370k0 = this.f4971t;
            boolean zM2727y = false;
            if (c1370k0 != null && (c1370k0.f4828h.get() != EnumC1372l0.f4838h || c1370k0.f4829i != AbstractC1848j.m3313b())) {
                AtomicReference atomicReference = c1370k0.f4828h;
                EnumC1372l0 enumC1372l0 = EnumC1372l0.f4839i;
                EnumC1372l0 enumC1372l02 = EnumC1372l0.f4837g;
                while (!atomicReference.compareAndSet(enumC1372l0, enumC1372l02) && atomicReference.get() == enumC1372l0) {
                }
                c1370k0.f4832l.f4663d.m4334a(9);
                return false;
            }
            m2660n();
            try {
                C2408E c2408e = this.f4968q;
                this.f4968q = AbstractC2352g.m4201n();
                try {
                    C1383r c1383r = this.f4976y;
                    C0363A c0363a = this.f4970s;
                    C1439L c1439l = c1383r.f4888e.f5102h;
                    if (!c1439l.m2726x()) {
                        AbstractC1387t.m2638a("Expected applyChanges() to have been called");
                    }
                    if (c2408e.f7791e > 0 || !c1383r.f4902s.isEmpty()) {
                        c1383r.f4878P = c0363a;
                        try {
                            c1383r.m2595n(c2408e, null);
                            c1383r.f4878P = null;
                            zM2727y = c1439l.m2727y();
                        } catch (Throwable th) {
                            c1383r.f4878P = null;
                            throw th;
                        }
                    }
                    if (!zM2727y) {
                        m2661o();
                    }
                    return zM2727y;
                } catch (Throwable th2) {
                    this.f4968q = c2408e;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f4959h.f7810d.m4285g()) {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th4) {
                            c1849k.m3317a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    m2647a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final void m2671y(C1486h c1486h) {
        Object obj;
        while (true) {
            Object obj2 = this.f4957f.get();
            if (obj2 == null || obj2.equals(AbstractC1385s.f4912b)) {
                obj = c1486h;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c1486h};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f4957f).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c1486h;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f4957f;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f4958g) {
                    m2661o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2672z(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1397y.m2672z(java.lang.Object):void");
    }
}
