package p058L;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import p000A.AbstractC0070k0;
import p000A.C0036S0;
import p000A.C0038T0;
import p000A.C0040U0;
import p000A.C0042V0;
import p000A.C0071l;
import p000A.C0078o0;
import p000A.C0090u0;
import p000A.EnumC0052b0;
import p034G.C0467l;
import p034G.EnumC0468m;
import p037G2.C0502n;
import p047I0.InterfaceC0744l0;
import p056K2.C0882h;
import p074O2.InterfaceC1046d;
import p092S0.AbstractC1251D;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1263a;
import p092S0.C1269g;
import p092S0.C1277o;
import p092S0.C1279q;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p096T0.C1410j;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p154e2.C2029h;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p160f3.InterfaceC2160t;
import p179i4.AbstractC2352g;
import p198m0.C2590u;
import p204n0.C2683b;
import p256w0.InterfaceC3388a;

/* JADX INFO: renamed from: L.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0920W {

    /* JADX INFO: renamed from: A */
    public boolean f2864A;

    /* JADX INFO: renamed from: a */
    public final C0040U0 f2865a;

    /* JADX INFO: renamed from: d */
    public C0078o0 f2868d;

    /* JADX INFO: renamed from: f */
    public InterfaceC1599a f2870f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0744l0 f2871g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2160t f2872h;

    /* JADX INFO: renamed from: i */
    public C0943o f2873i;

    /* JADX INFO: renamed from: j */
    public InterfaceC3388a f2874j;

    /* JADX INFO: renamed from: k */
    public C2590u f2875k;

    /* JADX INFO: renamed from: l */
    public final C1366i0 f2876l;

    /* JADX INFO: renamed from: m */
    public final C1366i0 f2877m;

    /* JADX INFO: renamed from: n */
    public long f2878n;

    /* JADX INFO: renamed from: o */
    public C1259L f2879o;

    /* JADX INFO: renamed from: p */
    public long f2880p;

    /* JADX INFO: renamed from: q */
    public final C1366i0 f2881q;

    /* JADX INFO: renamed from: r */
    public final C1366i0 f2882r;

    /* JADX INFO: renamed from: s */
    public int f2883s;

    /* JADX INFO: renamed from: t */
    public C1646u f2884t;

    /* JADX INFO: renamed from: u */
    public C2029h f2885u;

    /* JADX INFO: renamed from: v */
    public C1259L f2886v;

    /* JADX INFO: renamed from: w */
    public final C1366i0 f2887w;

    /* JADX INFO: renamed from: x */
    public final C0038T0 f2888x;

    /* JADX INFO: renamed from: y */
    public final C0918U f2889y;

    /* JADX INFO: renamed from: z */
    public final C2029h f2890z;

    /* JADX INFO: renamed from: b */
    public C0042V0 f2866b = AbstractC0070k0.f304c;

    /* JADX INFO: renamed from: c */
    public InterfaceC1601c f2867c = new C0071l(1);

    /* JADX INFO: renamed from: e */
    public final C1366i0 f2869e = AbstractC1385s.m2629s(new C1646u((String) null, 0, 7));

    public C0920W(C0040U0 c0040u0) {
        this.f2865a = c0040u0;
        Boolean bool = Boolean.TRUE;
        this.f2876l = AbstractC1385s.m2629s(bool);
        this.f2877m = AbstractC1385s.m2629s(bool);
        this.f2878n = 0L;
        this.f2880p = 0L;
        this.f2881q = AbstractC1385s.m2629s(null);
        this.f2882r = AbstractC1385s.m2629s(null);
        this.f2883s = -1;
        this.f2884t = new C1646u((String) null, 0L, 7);
        this.f2887w = AbstractC1385s.m2629s(Boolean.FALSE);
        C0038T0 c0038t0 = new C0038T0(5, false);
        c0038t0.f170f = EnumC0468m.f1390d;
        this.f2888x = c0038t0;
        this.f2889y = new C0918U(this);
        this.f2890z = new C2029h(this);
    }

    /* JADX INFO: renamed from: a */
    public static final C0882h m1926a(C0920W c0920w) {
        String str;
        C1259L c1259l;
        C1269g c1269gM1938m = c0920w.m1938m();
        if (c1269gM1938m == null || (str = c1269gM1938m.f4563e) == null || (c1259l = c0920w.f2886v) == null) {
            return null;
        }
        long j5 = c1259l.f4538a;
        int i5 = (int) (j5 >> 32);
        c0920w.f2866b.m57a(i5);
        int i6 = (int) (j5 & 4294967295L);
        c0920w.f2866b.m57a(i6);
        return new C0882h(str, new C1259L(AbstractC1251D.m2313b(i5, i6)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m1927b(C0920W c0920w, C1259L c1259l) {
        C1269g c1269gM1938m;
        String str;
        InterfaceC2160t interfaceC2160t;
        if (c1259l == null) {
            return;
        }
        long j5 = c1259l.f4538a;
        C0943o c0943o = c0920w.f2873i;
        if (c0943o == null || (c1269gM1938m = c0920w.m1938m()) == null || (str = c1269gM1938m.f4563e) == null) {
            return;
        }
        C0042V0 c0042v0 = c0920w.f2866b;
        int i5 = (int) (j5 >> 32);
        c0042v0.m57a(i5);
        int i6 = (int) (j5 & 4294967295L);
        c0042v0.m57a(i6);
        long jM2313b = AbstractC1251D.m2313b(i5, i6);
        if (str.length() <= 0 || C1259L.m2335c(jM2313b) || (interfaceC2160t = c0920w.f2872h) == null) {
            return;
        }
        AbstractC2162v.m3994p(interfaceC2160t, null, new C0917T(c0943o, str, jM2313b, c1259l, c0920w, c0042v0, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m1928c(p058L.C0920W r22, p115X0.C1646u r23, long r24, boolean r26, boolean r27, p029F0.C0363A r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p058L.C0920W.m1928c(L.W, X0.u, long, boolean, boolean, F0.A, boolean):long");
    }

    /* JADX INFO: renamed from: e */
    public static C1646u m1929e(C1269g c1269g, long j5) {
        return new C1646u(c1269g, j5, (C1259L) null);
    }

    /* JADX INFO: renamed from: d */
    public final C2136g0 m1930d(boolean z5) {
        InterfaceC2160t interfaceC2160t = this.f2872h;
        if (interfaceC2160t != null) {
            return AbstractC2162v.m3994p(interfaceC2160t, null, new C0502n(this, z5, (InterfaceC1046d) null), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m1931f() {
        InterfaceC2160t interfaceC2160t = this.f2872h;
        if (interfaceC2160t != null) {
            AbstractC2162v.m3994p(interfaceC2160t, null, new C0912N(this, null, 1), 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1932g(C2683b c2683b) {
        int iM2337e;
        if (!C1259L.m2335c(m1939n().f5651b)) {
            C0078o0 c0078o0 = this.f2868d;
            C0036S0 c0036s0M123d = c0078o0 != null ? c0078o0.m123d() : null;
            if (c2683b == null || c0036s0M123d == null) {
                iM2337e = C1259L.m2337e(m1939n().f5651b);
            } else {
                C0042V0 c0042v0 = this.f2866b;
                iM2337e = c0036s0M123d.m21b(c2683b.f8556a, true);
                c0042v0.m58b(iM2337e);
            }
            C1646u c1646uM2944a = C1646u.m2944a(m1939n(), null, AbstractC1251D.m2313b(iM2337e, iM2337e), 5);
            this.f2867c.mo1h(c1646uM2944a);
            this.f2886v = new C1259L(c1646uM2944a.f5651b);
        }
        m1942q((c2683b == null || m1939n().f5650a.f4563e.length() <= 0) ? EnumC0052b0.f211d : EnumC0052b0.f213f);
        m1945t(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m1933h(boolean z5) {
        C2590u c2590u;
        C0078o0 c0078o0 = this.f2868d;
        if (c0078o0 != null && !c0078o0.m121b() && (c2590u = this.f2875k) != null) {
            C2590u.m4539a(c2590u);
        }
        this.f2884t = m1939n();
        m1945t(z5);
        m1942q(EnumC0052b0.f212e);
    }

    /* JADX INFO: renamed from: i */
    public final C2683b m1934i() {
        return (C2683b) this.f2882r.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1935j() {
        return ((Boolean) this.f2876l.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1936k() {
        return ((Boolean) this.f2877m.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final long m1937l(boolean z5) {
        C0036S0 c0036s0M123d;
        long j5;
        C0078o0 c0078o0 = this.f2868d;
        if (c0078o0 == null || (c0036s0M123d = c0078o0.m123d()) == null) {
            return 9205357640488583168L;
        }
        C1257J c1257j = c0036s0M123d.f161a;
        C1277o c1277o = c1257j.f4527b;
        C1269g c1269gM1938m = m1938m();
        if (c1269gM1938m == null) {
            return 9205357640488583168L;
        }
        if (!AbstractC1665j.m2981a(c1269gM1938m.f4563e, c1257j.f4526a.f4516a.f4563e)) {
            return 9205357640488583168L;
        }
        C1646u c1646uM1939n = m1939n();
        if (z5) {
            long j6 = c1646uM1939n.f5651b;
            int i5 = C1259L.f4537c;
            j5 = j6 >> 32;
        } else {
            long j7 = c1646uM1939n.f5651b;
            int i6 = C1259L.f4537c;
            j5 = j7 & 4294967295L;
        }
        int i7 = (int) j5;
        this.f2866b.m57a(i7);
        boolean zM2339g = C1259L.m2339g(m1939n().f5651b);
        long j8 = c1257j.f4528c;
        int iM2363d = c1277o.m2363d(i7);
        if (iM2363d >= c1277o.f4590f) {
            return 9205357640488583168L;
        }
        boolean z6 = c1257j.m2324a(((!z5 || zM2339g) && (z5 || !zM2339g)) ? Math.max(i7 + (-1), 0) : i7) == c1257j.m2330g(i7);
        ArrayList arrayList = c1277o.f4592h;
        c1277o.m2369k(i7);
        C1279q c1279q = (C1279q) arrayList.get(i7 == ((C1269g) c1277o.f4585a.f808a).f4563e.length() ? AbstractC2352g.m4208u(arrayList) : AbstractC1251D.m2315d(i7, arrayList));
        C1263a c1263a = c1279q.f4595a;
        int iM2374d = c1279q.m2374d(i7);
        C1410j c1410j = c1263a.f4548d;
        return (((long) Float.floatToRawIntBits(AbstractC1926h.m3567j(c1277o.m2361b(iM2363d), 0.0f, (int) (j8 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC1926h.m3567j(z6 ? c1410j.m2712h(iM2374d, false) : c1410j.m2713i(iM2374d, false), 0.0f, (int) (j8 >> 32)))) << 32);
    }

    /* JADX INFO: renamed from: m */
    public final C1269g m1938m() {
        C0090u0 c0090u0;
        C0078o0 c0078o0 = this.f2868d;
        if (c0078o0 == null || (c0090u0 = c0078o0.f337a) == null) {
            return null;
        }
        return c0090u0.f402a;
    }

    /* JADX INFO: renamed from: n */
    public final C1646u m1939n() {
        return (C1646u) this.f2869e.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final void m1940o() {
        C2136g0 c2136g0;
        C0467l c0467l = (C0467l) this.f2888x.f169e;
        if (c0467l == null || (c2136g0 = c0467l.f1387x) == null) {
            return;
        }
        c2136g0.mo3905c(null);
        c0467l.f1387x = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m1941p() {
        InterfaceC2160t interfaceC2160t = this.f2872h;
        if (interfaceC2160t != null) {
            AbstractC2162v.m3994p(interfaceC2160t, null, new C0912N(this, null, 2), 1);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1942q(EnumC0052b0 enumC0052b0) {
        C0078o0 c0078o0 = this.f2868d;
        if (c0078o0 != null) {
            if (c0078o0.m120a() == enumC0052b0) {
                c0078o0 = null;
            }
            if (c0078o0 != null) {
                c0078o0.f347k.setValue(enumC0052b0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.f353q.getValue()).booleanValue() == false) goto L34;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1943r() {
        /*
            r7 = this;
            f0.f r0 = p158f0.AbstractC2086r.m3853e()
            r1 = 0
            if (r0 == 0) goto Lc
            W2.c r2 = r0.mo3789e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            f0.f r3 = p158f0.AbstractC2086r.m3856h(r0)
            boolean r4 = r7.m1936k()     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L71
            A.o0 r4 = r7.f2868d     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L2a
            T.i0 r4 = r4.f353q     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto L2a
            goto L71
        L2a:
            p158f0.AbstractC2086r.m3859k(r0, r3, r2)
            A.T0 r0 = r7.f2888x
            java.lang.Object r2 = r0.f170f
            G.m r2 = (p034G.EnumC0468m) r2
            G.m r3 = p034G.EnumC0468m.f1390d
            if (r2 == r3) goto L38
            goto L3d
        L38:
            java.lang.String r2 = "ToolbarRequester is not initialized."
            p238t.AbstractC3204b.m5477c(r2)
        L3d:
            java.lang.Object r0 = r0.f169e
            G.l r0 = (p034G.C0467l) r0
            if (r0 == 0) goto L6e
            boolean r2 = r0.f7199q
            if (r2 == 0) goto L6e
            f3.g0 r2 = r0.f1387x
            r3 = 1
            if (r2 == 0) goto L53
            boolean r2 = r2.mo3904b()
            if (r2 != r3) goto L53
            goto L6e
        L53:
            T.C r2 = p040H.AbstractC0548f.f1662b
            java.lang.Object r2 = p041H0.AbstractC0601k.m1032h(r0, r2)
            H.e r2 = (p040H.InterfaceC0547e) r2
            if (r2 != 0) goto L5e
            goto L6e
        L5e:
            f3.t r4 = r0.m4023x0()
            G.k r5 = new G.k
            r6 = 0
            r5.<init>(r0, r2, r1, r6)
            f3.g0 r1 = p160f3.AbstractC2162v.m3994p(r4, r1, r5, r3)
            r0.f1387x = r1
        L6e:
            return
        L6f:
            r1 = move-exception
            goto L75
        L71:
            p158f0.AbstractC2086r.m3859k(r0, r3, r2)
            return
        L75:
            p158f0.AbstractC2086r.m3859k(r0, r3, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p058L.C0920W.m1943r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1944s(p084Q2.AbstractC1178c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p058L.C0919V
            if (r0 == 0) goto L13
            r0 = r5
            L.V r0 = (p058L.C0919V) r0
            int r1 = r0.f2863j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2863j = r1
            goto L18
        L13:
            L.V r0 = new L.V
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2861h
            int r1 = r0.f2863j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            L.W r0 = r0.f2860g
            p127Z2.AbstractC1784a.m3205S(r5)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            p127Z2.AbstractC1784a.m3205S(r5)
            I0.l0 r5 = r4.f2871g
            if (r5 == 0) goto L65
            r0.f2860g = r4
            r0.f2863j = r2
            I0.i r5 = (p047I0.C0734i) r5
            I0.j r5 = r5.f2311a
            android.content.ClipboardManager r5 = r5.f2315a
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L50
            java.lang.String r1 = "text/*"
            boolean r5 = r5.hasMimeType(r1)
            if (r5 != r2) goto L50
            goto L51
        L50:
            r2 = r0
        L51:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            P2.a r0 = p079P2.EnumC1152a.f3788d
            if (r5 != r0) goto L5a
            return r0
        L5a:
            r0 = r4
        L5b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            T.i0 r0 = r0.f2887w
            r0.setValue(r5)
        L65:
            K2.q r5 = p056K2.C0891q.f2780a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p058L.C0920W.m1944s(Q2.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: t */
    public final void m1945t(boolean z5) {
        C0078o0 c0078o0 = this.f2868d;
        if (c0078o0 != null) {
            c0078o0.f348l.setValue(Boolean.valueOf(z5));
        }
        if (z5) {
            m1943r();
        } else {
            m1940o();
        }
    }
}
