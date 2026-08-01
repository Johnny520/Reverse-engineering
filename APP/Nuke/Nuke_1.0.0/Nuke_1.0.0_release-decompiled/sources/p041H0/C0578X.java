package p041H0;

import p000A.C0038T0;
import p000A.C0066i0;
import p000A.C0072l0;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p029F0.AbstractC0389a0;
import p047I0.C0764u;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p153e1.C2005a;
import p169h0.AbstractC2206o;
import p211o0.C2735J;

/* JADX INFO: renamed from: H0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0578X {

    /* JADX INFO: renamed from: a */
    public final C0564I f1822a;

    /* JADX INFO: renamed from: c */
    public boolean f1824c;

    /* JADX INFO: renamed from: d */
    public boolean f1825d;

    /* JADX INFO: renamed from: i */
    public C2005a f1830i;

    /* JADX INFO: renamed from: b */
    public final C0072l0 f1823b = new C0072l0(1);

    /* JADX INFO: renamed from: e */
    public final C0038T0 f1826e = new C0038T0(8);

    /* JADX INFO: renamed from: f */
    public final C1483e f1827f = new C1483e(new C0564I[16]);

    /* JADX INFO: renamed from: g */
    public final long f1828g = 1;

    /* JADX INFO: renamed from: h */
    public final C1483e f1829h = new C1483e(new C0577W[16]);

    public C0578X(C0564I c0564i) {
        this.f1822a = c0564i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m914b(p041H0.C0564I r5, p153e1.C2005a r6) {
        /*
            H0.I r0 = r5.f1719l
            H0.M r1 = r5.f1700K
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            H0.V r0 = r1.f1761q
            p117X2.AbstractC1665j.m2982b(r0)
            long r3 = r6.f6726a
            boolean r6 = r0.m912x0(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            H0.V r6 = r1.f1761q
            if (r6 == 0) goto L21
            e1.a r1 = r6.f1808p
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            p117X2.AbstractC1665j.m2982b(r6)
            long r0 = r1.f6726a
            boolean r6 = r6.m912x0(r0)
        L2f:
            H0.I r0 = r5.m839u()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            H0.I r1 = r0.f1719l
            r3 = 3
            if (r1 != 0) goto L40
            p041H0.C0564I.m790V(r0, r2, r3)
            return r6
        L40:
            H0.G r1 = r5.m837s()
            H0.G r4 = p041H0.EnumC0561G.f1682d
            if (r1 != r4) goto L4c
            p041H0.C0564I.m789T(r0, r2, r3)
            return r6
        L4c:
            H0.G r5 = r5.m837s()
            H0.G r1 = p041H0.EnumC0561G.f1683e
            if (r5 != r1) goto L57
            r0.m811S(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.C0578X.m914b(H0.I, e1.a):boolean");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m915c(C0564I c0564i, C2005a c2005a) {
        boolean zM938x0;
        if (c2005a != null) {
            if (c0564i.f1696G == EnumC0561G.f1684f) {
                c0564i.m822e();
            }
            zM938x0 = c0564i.f1700K.f1760p.m938x0(c2005a.f6726a);
        } else {
            C0580Z c0580z = c0564i.f1700K.f1760p;
            C2005a c2005a2 = c0580z.f1850m ? new C2005a(c0580z.f1209g) : null;
            if (c2005a2 != null) {
                if (c0564i.f1696G == EnumC0561G.f1684f) {
                    c0564i.m822e();
                }
                zM938x0 = c0564i.f1700K.f1760p.m938x0(c2005a2.f6726a);
            } else {
                c0564i.getClass();
                zM938x0 = false;
            }
        }
        C0564I c0564iM839u = c0564i.m839u();
        if (zM938x0 && c0564iM839u != null) {
            if (c0564i.m836r() == EnumC0561G.f1682d) {
                C0564I.m790V(c0564iM839u, false, 3);
                return zM938x0;
            }
            if (c0564i.m836r() == EnumC0561G.f1683e) {
                c0564iM839u.m812U(false);
            }
        }
        return zM938x0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m916h(C0564I c0564i) {
        C0576V c0576v;
        C0565J c0565j;
        if (c0564i.f1700K.f1749e) {
            return (c0564i.m837s() == EnumC0561G.f1684f && ((c0576v = c0564i.f1700K.f1761q) == null || (c0565j = c0576v.f1812t) == null || !c0565j.m849e())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m917i(C0564I c0564i) {
        if (!c0564i.m835q()) {
            return false;
        }
        do {
            if (c0564i.m836r() == EnumC0561G.f1684f && !c0564i.f1700K.f1760p.f1863z.m849e()) {
                C0564I c0564iM839u = c0564i.m839u();
                if ((c0564iM839u != null ? c0564iM839u.f1700K.f1748d : null) != EnumC0557E.f1672d) {
                    return false;
                }
            }
            c0564i = c0564i.m839u();
            if (c0564i == null) {
                return false;
            }
        } while (!c0564i.m801I());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m918a(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            A.T0 r1 = r7.f1826e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.f169e
            V.e r8 = (p105V.C1483e) r8
            H0.I r2 = r7.f1822a
            int r3 = r2.f1709T
            if (r3 <= 0) goto L17
            r8.m2758g()
            r8.m2753b(r2)
            r2.f1708S = r0
        L17:
            java.lang.Object r8 = r1.f169e
            V.e r8 = (p105V.C1483e) r8
            int r2 = r8.f5183f
            if (r2 == 0) goto L62
            H0.n0 r3 = p041H0.C0608n0.f1956b
            java.lang.Object[] r4 = r8.f5181d
            r5 = 0
            p061L2.AbstractC0972l.m2006d0(r4, r3, r5, r2)
            int r2 = r8.f5183f
            java.lang.Object r3 = r1.f170f
            H0.I[] r3 = (p041H0.C0564I[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            H0.I[] r3 = new p041H0.C0564I[r3]
        L3a:
            r4 = 0
            r1.f170f = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.f5181d
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.m2758g()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            p117X2.AbstractC1665j.m2982b(r8)
            boolean r0 = r8.f1708S
            if (r0 == 0) goto L5b
            p000A.C0038T0.m26w(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.f170f = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.C0578X.m918a(boolean):void");
    }

    /* JADX INFO: renamed from: d */
    public final void m919d() {
        C1483e c1483e = this.f1829h;
        int i5 = c1483e.f5183f;
        if (i5 != 0) {
            Object[] objArr = c1483e.f5181d;
            for (int i6 = 0; i6 < i5; i6++) {
                C0577W c0577w = (C0577W) objArr[i6];
                C0564I c0564i = c0577w.f1819a;
                boolean z5 = c0577w.f1821c;
                C0564I c0564i2 = c0577w.f1819a;
                if (c0564i.m799G()) {
                    if (c0577w.f1820b) {
                        C0564I.m789T(c0564i2, z5, 2);
                    } else {
                        C0564I.m790V(c0564i2, z5, 2);
                    }
                }
            }
            c1483e.m2758g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m920e(C0564I c0564i) {
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0564I c0564i2 = (C0564I) objArr[i6];
            if (AbstractC1665j.m2981a(c0564i2.m802J(), Boolean.TRUE) && !c0564i2.f1710U) {
                if (this.f1823b.m103g(c0564i2)) {
                    c0564i2.m803K();
                }
                m920e(c0564i2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m921f(C0564I c0564i, boolean z5) {
        if (!this.f1824c) {
            AbstractC0277a.m483b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z5 ? c0564i.f1700K.f1749e : c0564i.m835q()) {
            AbstractC0277a.m482a("node not yet measured");
        }
        m922g(c0564i, z5);
    }

    /* JADX INFO: renamed from: g */
    public final void m922g(C0564I c0564i, boolean z5) {
        C0576V c0576v;
        C0565J c0565j;
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0564I c0564i2 = (C0564I) objArr[i6];
            EnumC0561G enumC0561G = EnumC0561G.f1682d;
            if ((!z5 && (c0564i2.m836r() == enumC0561G || c0564i2.f1700K.f1760p.f1863z.m849e())) || (z5 && (c0564i2.m837s() == enumC0561G || ((c0576v = c0564i2.f1700K.f1761q) != null && (c0565j = c0576v.f1812t) != null && c0565j.m849e())))) {
                boolean zM1039o = AbstractC0601k.m1039o(c0564i2);
                C0568M c0568m = c0564i2.f1700K;
                if (zM1039o && !z5) {
                    if (c0568m.f1749e && this.f1823b.m103g(c0564i2)) {
                        m926m(c0564i2, true, false);
                    } else {
                        m921f(c0564i2, true);
                    }
                }
                if (z5 ? c0568m.f1749e : c0564i2.m835q()) {
                    m926m(c0564i2, z5, false);
                }
                if (!(z5 ? c0568m.f1749e : c0564i2.m835q())) {
                    m922g(c0564i2, z5);
                }
            }
        }
        if (z5 ? c0564i.f1700K.f1749e : c0564i.m835q()) {
            m926m(c0564i, z5, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [V.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [V.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: j */
    public final boolean m923j(C0764u c0764u) {
        boolean z5;
        AbstractC2206o abstractC2206o;
        ?? c1483e;
        ?? M1029e;
        int i5;
        boolean z6;
        C0564I c0564i;
        boolean z7;
        C0072l0 c0072l0 = this.f1823b;
        C0564I c0564i2 = this.f1822a;
        if (!c0564i2.m799G()) {
            AbstractC0277a.m482a("performMeasureAndLayout called with unattached root");
        }
        if (!c0564i2.m801I()) {
            AbstractC0277a.m482a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f1824c) {
            AbstractC0277a.m482a("performMeasureAndLayout called during measure layout");
        }
        int i6 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        if (this.f1830i != null) {
            this.f1824c = true;
            this.f1825d = true;
            try {
                boolean zM112r = c0072l0.m112r();
                C0066i0 c0066i0 = (C0066i0) c0072l0.f307e;
                if (zM112r) {
                    z5 = false;
                    while (true) {
                        C0066i0 c0066i02 = (C0066i0) c0072l0.f309g;
                        C0066i0 c0066i03 = (C0066i0) c0072l0.f308f;
                        if (!((C0550A0) c0066i0.f297e).isEmpty()) {
                            c0564i = (C0564I) ((C0550A0) c0066i0.f297e).first();
                            c0066i0.m73m(c0564i);
                            z7 = c0564i.f1719l != null;
                            z6 = false;
                        } else if (!((C0550A0) c0066i03.f297e).isEmpty()) {
                            c0564i = (C0564I) ((C0550A0) c0066i03.f297e).first();
                            c0066i03.m73m(c0564i);
                            z7 = c0564i.f1719l != null;
                            z6 = true;
                        } else {
                            if (((C0550A0) c0066i02.f297e).isEmpty()) {
                                break;
                            }
                            C0564I c0564i3 = (C0564I) ((C0550A0) c0066i02.f297e).first();
                            c0066i02.m73m(c0564i3);
                            z6 = true;
                            c0564i = c0564i3;
                            z7 = false;
                        }
                        boolean zM926m = m926m(c0564i, z7, z6);
                        if (!z6) {
                            if (c0564i.f1700K.f1750f) {
                                c0072l0.m101e(c0564i, EnumC0621u.f1983e);
                            }
                            if (c0564i.m834p()) {
                                c0072l0.m101e(c0564i, EnumC0621u.f1985g);
                            }
                        }
                        if (c0564i == c0564i2 && zM926m) {
                            z5 = true;
                        }
                    }
                    if (c0764u != null) {
                        c0764u.mo6a();
                    }
                } else {
                    z5 = false;
                }
            } finally {
            }
        } else {
            z5 = false;
        }
        C1483e c1483e2 = this.f1827f;
        Object[] objArr = c1483e2.f5181d;
        int i7 = c1483e2.f5183f;
        int i8 = 0;
        while (i8 < i7) {
            C0590e0 c0590e0 = ((C0564I) objArr[i8]).f1699J;
            C0617s c0617s = c0590e0.f1893c;
            int i9 = 4194304;
            boolean zM1014g = AbstractC0598i0.m1014g(4194304);
            if (zM1014g) {
                abstractC2206o = c0617s.f1970U;
            } else {
                abstractC2206o = c0617s.f1970U.f7190h;
                if (abstractC2206o == null) {
                }
                i8++;
                i6 = 0;
            }
            C2735J c2735j = AbstractC0596h0.f1912P;
            AbstractC2206o abstractC2206oM983T0 = c0617s.m983T0(zM1014g);
            while (abstractC2206oM983T0 != null && (abstractC2206oM983T0.f7189g & i9) != 0) {
                if ((abstractC2206oM983T0.f7188f & i9) != 0) {
                    ?? r13 = abstractC2206oM983T0;
                    ?? r14 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof InterfaceC0625w) {
                            ((InterfaceC0625w) r13).mo953v(c0590e0.f1893c);
                        } else {
                            if ((r13.f7188f & i9) != 0 && (r13 instanceof AbstractC0599j)) {
                                AbstractC2206o abstractC2206o2 = ((AbstractC0599j) r13).f1943s;
                                M1029e = r13;
                                c1483e = r14;
                                while (abstractC2206o2 != null) {
                                    int i10 = i9;
                                    if ((abstractC2206o2.f7188f & i10) != 0) {
                                        i6++;
                                        c1483e = c1483e;
                                        if (i6 == 1) {
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
                                    i9 = i10;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                }
                                i5 = i9;
                                c1483e = c1483e;
                                if (i6 == 1) {
                                }
                                i9 = i5;
                                i6 = 0;
                                r13 = M1029e;
                                r14 = c1483e;
                            }
                            M1029e = AbstractC0601k.m1029e(c1483e);
                            i9 = i5;
                            i6 = 0;
                            r13 = M1029e;
                            r14 = c1483e;
                        }
                        i5 = i9;
                        c1483e = r14;
                        M1029e = AbstractC0601k.m1029e(c1483e);
                        i9 = i5;
                        i6 = 0;
                        r13 = M1029e;
                        r14 = c1483e;
                    }
                }
                int i11 = i9;
                if (abstractC2206oM983T0 != abstractC2206o) {
                    abstractC2206oM983T0 = abstractC2206oM983T0.f7191i;
                    i9 = i11;
                    i6 = 0;
                }
            }
            i8++;
            i6 = 0;
        }
        c1483e2.m2758g();
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [V.e] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [V.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [H0.I, java.lang.Object] */
    /* JADX INFO: renamed from: k */
    public final void m924k(C0564I c0564i, long j5) {
        AbstractC2206o abstractC2206o;
        ?? M1029e;
        boolean z5 = c0564i.f1710U;
        C0568M c0568m = c0564i.f1700K;
        if (z5) {
            return;
        }
        C0564I c0564i2 = this.f1822a;
        if (c0564i.equals(c0564i2)) {
            AbstractC0277a.m482a("measureAndLayout called on root");
        }
        if (!c0564i2.m799G()) {
            AbstractC0277a.m482a("performMeasureAndLayout called with unattached root");
        }
        if (!c0564i2.m801I()) {
            AbstractC0277a.m482a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f1824c) {
            AbstractC0277a.m482a("performMeasureAndLayout called during measure layout");
        }
        boolean z6 = false;
        if (this.f1830i != null) {
            this.f1824c = true;
            this.f1825d = false;
            try {
                C0072l0 c0072l0 = this.f1823b;
                ((C0066i0) c0072l0.f307e).m73m(c0564i);
                ((C0066i0) c0072l0.f308f).m73m(c0564i);
                ((C0066i0) c0072l0.f309g).m73m(c0564i);
                if (m914b(c0564i, new C2005a(j5)) || c0568m.f1750f) {
                    if (AbstractC1665j.m2981a(c0564i.m802J(), Boolean.TRUE)) {
                        c0564i.m803K();
                    }
                }
                m920e(c0564i);
                if (c0564i.f1696G == EnumC0561G.f1684f) {
                    c0564i.m822e();
                }
                boolean zM938x0 = c0568m.f1760p.m938x0(j5);
                C0564I c0564iM839u = c0564i.m839u();
                if (zM938x0 && c0564iM839u != null) {
                    if (c0564i.m836r() == EnumC0561G.f1682d) {
                        C0564I.m790V(c0564iM839u, false, 3);
                    } else if (c0564i.m836r() == EnumC0561G.f1683e) {
                        c0564iM839u.m812U(false);
                    }
                }
                if (c0564i.m834p() && c0564i.m801I()) {
                    c0564i.m810R();
                    C0038T0 c0038t0 = this.f1826e;
                    c0038t0.getClass();
                    if (c0564i.f1709T > 0) {
                        ((C1483e) c0038t0.f169e).m2753b(c0564i);
                        c0564i.f1708S = true;
                    }
                }
                m919d();
            } finally {
            }
        }
        C1483e c1483e = this.f1827f;
        Object[] objArr = c1483e.f5181d;
        int i5 = c1483e.f5183f;
        int i6 = 0;
        while (i6 < i5) {
            C0590e0 c0590e0 = ((C0564I) objArr[i6]).f1699J;
            C0617s c0617s = c0590e0.f1893c;
            boolean zM1014g = AbstractC0598i0.m1014g(4194304);
            if (zM1014g) {
                abstractC2206o = c0617s.f1970U;
            } else {
                abstractC2206o = c0617s.f1970U.f7190h;
                if (abstractC2206o == null) {
                }
                i6++;
                z6 = false;
            }
            C2735J c2735j = AbstractC0596h0.f1912P;
            AbstractC2206o abstractC2206oM983T0 = c0617s.m983T0(zM1014g);
            while (abstractC2206oM983T0 != null && (abstractC2206oM983T0.f7189g & 4194304) != 0) {
                if ((abstractC2206oM983T0.f7188f & 4194304) != 0) {
                    ?? r12 = abstractC2206oM983T0;
                    ?? c1483e2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof InterfaceC0625w) {
                            ((InterfaceC0625w) r12).mo953v(c0590e0.f1893c);
                        } else {
                            if ((r12.f7188f & 4194304) != 0 && (r12 instanceof AbstractC0599j)) {
                                AbstractC2206o abstractC2206o2 = ((AbstractC0599j) r12).f1943s;
                                ?? r15 = z6;
                                M1029e = r12;
                                c1483e2 = c1483e2;
                                while (abstractC2206o2 != null) {
                                    if ((abstractC2206o2.f7188f & 4194304) != 0) {
                                        r15++;
                                        c1483e2 = c1483e2;
                                        if (r15 == 1) {
                                            M1029e = abstractC2206o2;
                                        } else {
                                            if (c1483e2 == 0) {
                                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (M1029e != 0) {
                                                c1483e2.m2753b(M1029e);
                                                M1029e = 0;
                                            }
                                            c1483e2.m2753b(abstractC2206o2);
                                        }
                                    }
                                    abstractC2206o2 = abstractC2206o2.f7191i;
                                    M1029e = M1029e;
                                    c1483e2 = c1483e2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z6 = false;
                            r12 = M1029e;
                            c1483e2 = c1483e2;
                        }
                        M1029e = AbstractC0601k.m1029e(c1483e2);
                        z6 = false;
                        r12 = M1029e;
                        c1483e2 = c1483e2;
                    }
                }
                if (abstractC2206oM983T0 != abstractC2206o) {
                    abstractC2206oM983T0 = abstractC2206oM983T0.f7191i;
                    z6 = false;
                }
            }
            i6++;
            z6 = false;
        }
        c1483e.m2758g();
    }

    /* JADX INFO: renamed from: l */
    public final void m925l() {
        C0072l0 c0072l0 = this.f1823b;
        if (c0072l0.m112r()) {
            C0564I c0564i = this.f1822a;
            if (!c0564i.m799G()) {
                AbstractC0277a.m482a("performMeasureAndLayout called with unattached root");
            }
            if (!c0564i.m801I()) {
                AbstractC0277a.m482a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f1824c) {
                AbstractC0277a.m482a("performMeasureAndLayout called during measure layout");
            }
            if (this.f1830i != null) {
                this.f1824c = true;
                this.f1825d = false;
                try {
                    if (!((C0550A0) ((C0066i0) c0072l0.f309g).f297e).isEmpty() && !((C0550A0) ((C0066i0) c0072l0.f307e).f297e).isEmpty()) {
                        if (c0564i.f1719l != null) {
                            m928o(c0564i, true);
                        } else {
                            m927n(c0564i);
                        }
                    }
                    m928o(c0564i, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f1824c = false;
                        this.f1825d = false;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m926m(C0564I c0564i, boolean z5, boolean z6) {
        C2005a c2005a;
        boolean zM914b;
        AbstractC0389a0 placementScope;
        C0617s c0617s;
        C0564I c0564iM839u;
        C0576V c0576v;
        C0565J c0565j;
        boolean z7 = c0564i.f1710U;
        C0568M c0568m = c0564i.f1700K;
        if (z7 || (!c0564i.m801I() && !c0568m.f1760p.f1859v && !m917i(c0564i) && !AbstractC1665j.m2981a(c0564i.m802J(), Boolean.TRUE) && !m916h(c0564i) && !c0568m.f1760p.f1863z.m849e() && ((c0576v = c0568m.f1761q) == null || (c0565j = c0576v.f1812t) == null || !c0565j.m849e()))) {
            return false;
        }
        C0564I c0564i2 = this.f1822a;
        if (c0564i == c0564i2) {
            c2005a = this.f1830i;
            AbstractC1665j.m2982b(c2005a);
        } else {
            c2005a = null;
        }
        if (z5) {
            zM914b = c0568m.f1749e ? m914b(c0564i, c2005a) : false;
            if (z6 && ((zM914b || c0568m.f1750f) && AbstractC1665j.m2981a(c0564i.m802J(), Boolean.TRUE))) {
                c0564i.m803K();
            }
        } else {
            boolean zM915c = c0564i.m835q() ? m915c(c0564i, c2005a) : false;
            if (z6 && c0564i.m834p() && (c0564i == c0564i2 || ((c0564iM839u = c0564i.m839u()) != null && c0564iM839u.m801I() && c0568m.f1760p.f1859v))) {
                if (c0564i == c0564i2) {
                    if (c0564i.f1696G == EnumC0561G.f1684f) {
                        c0564i.m824f();
                    }
                    C0564I c0564iM839u2 = c0564i.m839u();
                    if (c0564iM839u2 == null || (c0617s = c0564iM839u2.f1699J.f1893c) == null || (placementScope = c0617s.f1782o) == null) {
                        placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getPlacementScope();
                    }
                    AbstractC0389a0.m660k(placementScope, c0568m.f1760p, 0, 0);
                } else {
                    c0564i.m810R();
                }
                C0038T0 c0038t0 = this.f1826e;
                c0038t0.getClass();
                if (c0564i.f1709T > 0) {
                    ((C1483e) c0038t0.f169e).m2753b(c0564i);
                    c0564i.f1708S = true;
                }
            }
            zM914b = zM915c;
        }
        m919d();
        return zM914b;
    }

    /* JADX INFO: renamed from: n */
    public final void m927n(C0564I c0564i) {
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0564I c0564i2 = (C0564I) objArr[i6];
            if (c0564i2.m836r() == EnumC0561G.f1682d || c0564i2.f1700K.f1760p.f1863z.m849e()) {
                if (AbstractC0601k.m1039o(c0564i2)) {
                    m928o(c0564i2, true);
                } else {
                    m927n(c0564i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m928o(C0564I c0564i, boolean z5) {
        C2005a c2005a;
        if (c0564i.f1710U) {
            return;
        }
        if (c0564i == this.f1822a) {
            c2005a = this.f1830i;
            AbstractC1665j.m2982b(c2005a);
        } else {
            c2005a = null;
        }
        if (z5) {
            m914b(c0564i, c2005a);
        } else {
            m915c(c0564i, c2005a);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m929p(C0564I c0564i, boolean z5) {
        int iOrdinal = c0564i.f1700K.f1748d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f1829h.m2753b(new C0577W(c0564i, false, z5));
            } else {
                if (iOrdinal != 4) {
                    throw new C0330q();
                }
                if (!c0564i.m835q() || z5) {
                    c0564i.f1700K.f1760p.f1860w = true;
                    if (!c0564i.f1710U && (c0564i.m801I() || m917i(c0564i))) {
                        C0564I c0564iM839u = c0564i.m839u();
                        if (c0564iM839u == null || !c0564iM839u.m835q()) {
                            this.f1823b.m101e(c0564i, EnumC0621u.f1984f);
                        }
                        if (!this.f1825d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m930q(long j5) {
        C2005a c2005a = this.f1830i;
        if (c2005a == null ? false : C2005a.m3674b(c2005a.f6726a, j5)) {
            return;
        }
        if (this.f1824c) {
            AbstractC0277a.m482a("updateRootConstraints called while measuring");
        }
        this.f1830i = new C2005a(j5);
        C0564I c0564i = this.f1822a;
        C0564I c0564i2 = c0564i.f1719l;
        C0568M c0568m = c0564i.f1700K;
        if (c0564i2 != null) {
            c0568m.f1749e = true;
        }
        c0568m.f1760p.f1860w = true;
        this.f1823b.m101e(c0564i, c0564i2 != null ? EnumC0621u.f1982d : EnumC0621u.f1984f);
    }
}
