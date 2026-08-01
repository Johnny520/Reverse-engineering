package p235q1;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p120i2.AbstractC3167a;
import p135j2.InterfaceC3515e;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4547h1;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4553j;
import p215oc.C5729x;
import p235q1.C6203g;
import p250r1.C6457g;
import p349y0.C9508c;
import p376zd.C10010p0;

/* JADX INFO: renamed from: q1.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6222p0 {

    /* JADX INFO: renamed from: q1.p0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19301a;

        static {
            int[] iArr = new int[EnumC6200e0.values().length];
            try {
                iArr[EnumC6200e0.f19246r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6200e0.f19245q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6200e0.f19247s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6200e0.f19248t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19301a = iArr;
        }
    }

    /* JADX INFO: renamed from: q1.p0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C6206h0 f19302r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C6206h0 f19303s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C6457g f19304t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ int f19305u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC0184l f19306v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6206h0 c6206h0, C6206h0 c6206h02, C6457g c6457g, int i10, InterfaceC0184l interfaceC0184l) {
            super(1);
            this.f19302r = c6206h0;
            this.f19303s = c6206h02;
            this.f19304t = c6457g;
            this.f19305u = i10;
            this.f19306v = interfaceC0184l;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(InterfaceC3515e.a aVar) {
            if (this.f19302r != AbstractC4557k.m18016r(this.f19303s).getFocusOwner().mo24511w()) {
                return Boolean.TRUE;
            }
            boolean zM24484r = AbstractC6222p0.m24484r(this.f19303s, this.f19304t, this.f19305u, this.f19306v);
            Boolean boolValueOf = Boolean.valueOf(zM24484r);
            if (zM24484r || !aVar.mo1290a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C6206h0 m24468b(C6206h0 c6206h0) {
        if (c6206h0.mo24362j0() != EnumC6200e0.f19246r) {
            C10010p0.m38820a("Searching for active node in inactive hierarchy");
            return null;
        }
        C6206h0 c6206h0M24428b = AbstractC6212k0.m24428b(c6206h0);
        if (c6206h0M24428b != null) {
            return c6206h0M24428b;
        }
        C10010p0.m38820a("ActiveParent must have a focusedChild");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m24469c(C6457g c6457g, C6457g c6457g2, C6457g c6457g3, int i10) {
        if (m24470d(c6457g3, i10, c6457g) || !m24470d(c6457g2, i10, c6457g)) {
            return false;
        }
        if (!m24471e(c6457g3, i10, c6457g)) {
            return true;
        }
        C6203g.a aVar = C6203g.f19254b;
        return C6203g.m24374l(i10, aVar.m24381d()) || C6203g.m24374l(i10, aVar.m24384g()) || m24472f(c6457g2, i10, c6457g) < m24473g(c6457g3, i10, c6457g);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m24470d(C6457g c6457g, int i10, C6457g c6457g2) {
        C6203g.a aVar = C6203g.f19254b;
        if (C6203g.m24374l(i10, aVar.m24381d()) || C6203g.m24374l(i10, aVar.m24384g())) {
            return c6457g.m25580i() > c6457g2.m25586o() && c6457g.m25586o() < c6457g2.m25580i();
        }
        if (C6203g.m24374l(i10, aVar.m24385h()) || C6203g.m24374l(i10, aVar.m24378a())) {
            return c6457g.m25584m() > c6457g2.m25583l() && c6457g.m25583l() < c6457g2.m25584m();
        }
        C10010p0.m38820a("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m24471e(C6457g c6457g, int i10, C6457g c6457g2) {
        C6203g.a aVar = C6203g.f19254b;
        if (C6203g.m24374l(i10, aVar.m24381d())) {
            return c6457g2.m25583l() >= c6457g.m25584m();
        }
        if (C6203g.m24374l(i10, aVar.m24384g())) {
            return c6457g2.m25584m() <= c6457g.m25583l();
        }
        if (C6203g.m24374l(i10, aVar.m24385h())) {
            return c6457g2.m25586o() >= c6457g.m25580i();
        }
        if (C6203g.m24374l(i10, aVar.m24378a())) {
            return c6457g2.m25580i() <= c6457g.m25586o();
        }
        C10010p0.m38820a("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m24472f(p250r1.C6457g r2, int r3, p250r1.C6457g r4) {
        /*
            q1.g$a r0 = p235q1.C6203g.f19254b
            int r1 = r0.m24381d()
            boolean r1 = p235q1.C6203g.m24374l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.m25583l()
            float r2 = r2.m25584m()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.m24384g()
            boolean r1 = p235q1.C6203g.m24374l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.m25583l()
            float r3 = r4.m25584m()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.m24385h()
            boolean r1 = p235q1.C6203g.m24374l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.m25586o()
            float r2 = r2.m25580i()
            goto L14
        L3e:
            int r0 = r0.m24378a()
            boolean r3 = p235q1.C6203g.m24374l(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.m25586o()
            float r3 = r4.m25580i()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            p376zd.C10010p0.m38820a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p235q1.AbstractC6222p0.m24472f(r1.g, int, r1.g):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m24473g(p250r1.C6457g r2, int r3, p250r1.C6457g r4) {
        /*
            q1.g$a r0 = p235q1.C6203g.f19254b
            int r1 = r0.m24381d()
            boolean r1 = p235q1.C6203g.m24374l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.m25583l()
            float r2 = r2.m25583l()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.m24384g()
            boolean r1 = p235q1.C6203g.m24374l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.m25584m()
            float r3 = r4.m25584m()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.m24385h()
            boolean r1 = p235q1.C6203g.m24374l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.m25586o()
            float r2 = r2.m25586o()
            goto L14
        L3e:
            int r0 = r0.m24378a()
            boolean r3 = p235q1.C6203g.m24374l(r3, r0)
            if (r3 == 0) goto L59
            float r2 = r2.m25580i()
            float r3 = r4.m25580i()
            goto L28
        L51:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L58
            return r2
        L58:
            return r3
        L59:
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            p376zd.C10010p0.m38820a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p235q1.AbstractC6222p0.m24473g(r1.g, int, r1.g):float");
    }

    /* JADX INFO: renamed from: h */
    public static final C6457g m24474h(C6457g c6457g) {
        return new C6457g(c6457g.m25584m(), c6457g.m25580i(), c6457g.m25584m(), c6457g.m25580i());
    }

    /* JADX INFO: renamed from: i */
    public static final void m24475i(InterfaceC4553j interfaceC4553j, C9508c c9508c) {
        int iM17812a = AbstractC4547h1.m17812a(1024);
        if (!interfaceC4553j.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitChildren called on an unattached node");
        }
        C9508c c9508c2 = new C9508c(new InterfaceC4507m.c[16], 0);
        InterfaceC4507m.c cVarM17453d2 = interfaceC4553j.mo17471z().m17453d2();
        if (cVarM17453d2 == null) {
            AbstractC4557k.m18001c(c9508c2, interfaceC4553j.mo17471z(), false);
        } else {
            c9508c2.m37029b(cVarM17453d2);
        }
        while (c9508c2.m37039l() != 0) {
            InterfaceC4507m.c cVarM18008j = (InterfaceC4507m.c) c9508c2.m37045r(c9508c2.m37039l() - 1);
            if ((cVarM18008j.m17452c2() & iM17812a) == 0) {
                AbstractC4557k.m18001c(c9508c2, cVarM18008j, false);
            } else {
                while (true) {
                    if (cVarM18008j == null) {
                        break;
                    }
                    if ((cVarM18008j.m17457h2() & iM17812a) != 0) {
                        C9508c c9508c3 = null;
                        while (cVarM18008j != null) {
                            if (cVarM18008j instanceof C6206h0) {
                                C6206h0 c6206h0 = (C6206h0) cVarM18008j;
                                if (c6206h0.m17461m2() && !AbstractC4557k.m18015q(c6206h0).mo13085p()) {
                                    if (c6206h0.m24395N2().mo17626e()) {
                                        c9508c.m37029b(c6206h0);
                                    } else {
                                        m24475i(c6206h0, c9508c);
                                    }
                                }
                            } else if ((cVarM18008j.m17457h2() & iM17812a) != 0 && (cVarM18008j instanceof AbstractC4565m)) {
                                int i10 = 0;
                                for (InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) cVarM18008j).m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
                                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarM18008j = cVarM18050H2;
                                        } else {
                                            if (c9508c3 == null) {
                                                c9508c3 = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (cVarM18008j != null) {
                                                c9508c3.m37029b(cVarM18008j);
                                                cVarM18008j = null;
                                            }
                                            c9508c3.m37029b(cVarM18050H2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarM18008j = AbstractC4557k.m18008j(c9508c3);
                        }
                    } else {
                        cVarM18008j = cVarM18008j.m17453d2();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final C6206h0 m24476j(C9508c c9508c, C6457g c6457g, int i10) {
        C6457g c6457gM25592u;
        C6203g.a aVar = C6203g.f19254b;
        if (C6203g.m24374l(i10, aVar.m24381d())) {
            c6457gM25592u = c6457g.m25592u((c6457g.m25584m() - c6457g.m25583l()) + 1, 0.0f);
        } else if (C6203g.m24374l(i10, aVar.m24384g())) {
            c6457gM25592u = c6457g.m25592u(-((c6457g.m25584m() - c6457g.m25583l()) + 1), 0.0f);
        } else if (C6203g.m24374l(i10, aVar.m24385h())) {
            c6457gM25592u = c6457g.m25592u(0.0f, (c6457g.m25580i() - c6457g.m25586o()) + 1);
        } else {
            if (!C6203g.m24374l(i10, aVar.m24378a())) {
                C10010p0.m38820a("This function should only be used for 2-D focus search");
                return null;
            }
            c6457gM25592u = c6457g.m25592u(0.0f, -((c6457g.m25580i() - c6457g.m25586o()) + 1));
        }
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        C6206h0 c6206h0 = null;
        for (int i11 = 0; i11 < iM37039l; i11++) {
            C6206h0 c6206h02 = (C6206h0) objArr[i11];
            if (AbstractC6212k0.m24433g(c6206h02)) {
                C6457g c6457gM24430d = AbstractC6212k0.m24430d(c6206h02);
                if (m24479m(c6457gM24430d, c6457gM25592u, c6457g, i10)) {
                    c6206h0 = c6206h02;
                    c6457gM25592u = c6457gM24430d;
                }
            }
        }
        return c6206h0;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m24477k(C6206h0 c6206h0, int i10, InterfaceC0184l interfaceC0184l) {
        C6457g c6457gM24485s;
        C9508c c9508c = new C9508c(new C6206h0[16], 0);
        m24475i(c6206h0, c9508c);
        if (c9508c.m37039l() <= 1) {
            C6206h0 c6206h02 = (C6206h0) (c9508c.m37039l() == 0 ? null : c9508c.f32299q[0]);
            if (c6206h02 != null) {
                return ((Boolean) interfaceC0184l.mo27m(c6206h02)).booleanValue();
            }
            return false;
        }
        C6203g.a aVar = C6203g.f19254b;
        if (C6203g.m24374l(i10, aVar.m24379b())) {
            i10 = aVar.m24384g();
        }
        if (C6203g.m24374l(i10, aVar.m24384g()) || C6203g.m24374l(i10, aVar.m24378a())) {
            c6457gM24485s = m24485s(AbstractC6212k0.m24430d(c6206h0));
        } else {
            if (!C6203g.m24374l(i10, aVar.m24381d()) && !C6203g.m24374l(i10, aVar.m24385h())) {
                C10010p0.m38820a("This function should only be used for 2-D focus search");
                return false;
            }
            c6457gM24485s = m24474h(AbstractC6212k0.m24430d(c6206h0));
        }
        C6206h0 c6206h0M24476j = m24476j(c9508c, c6457gM24485s, i10);
        if (c6206h0M24476j != null) {
            return ((Boolean) interfaceC0184l.mo27m(c6206h0M24476j)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m24478l(C6206h0 c6206h0, C6457g c6457g, int i10, InterfaceC0184l interfaceC0184l) {
        if (m24484r(c6206h0, c6457g, i10, interfaceC0184l)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC6191a.m24344a(c6206h0, i10, new b(AbstractC4557k.m18016r(c6206h0).getFocusOwner().mo24511w(), c6206h0, c6457g, i10, interfaceC0184l));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m24479m(C6457g c6457g, C6457g c6457g2, C6457g c6457g3, int i10) {
        if (!m24480n(c6457g, i10, c6457g3)) {
            return false;
        }
        if (m24480n(c6457g2, i10, c6457g3) && !m24469c(c6457g3, c6457g, c6457g2, i10)) {
            return !m24469c(c6457g3, c6457g2, c6457g, i10) && m24483q(i10, c6457g3, c6457g) < m24483q(i10, c6457g3, c6457g2);
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m24480n(C6457g c6457g, int i10, C6457g c6457g2) {
        C6203g.a aVar = C6203g.f19254b;
        if (C6203g.m24374l(i10, aVar.m24381d())) {
            return (c6457g2.m25584m() > c6457g.m25584m() || c6457g2.m25583l() >= c6457g.m25584m()) && c6457g2.m25583l() > c6457g.m25583l();
        }
        if (C6203g.m24374l(i10, aVar.m24384g())) {
            return (c6457g2.m25583l() < c6457g.m25583l() || c6457g2.m25584m() <= c6457g.m25583l()) && c6457g2.m25584m() < c6457g.m25584m();
        }
        if (C6203g.m24374l(i10, aVar.m24385h())) {
            return (c6457g2.m25580i() > c6457g.m25580i() || c6457g2.m25586o() >= c6457g.m25580i()) && c6457g2.m25586o() > c6457g.m25586o();
        }
        if (C6203g.m24374l(i10, aVar.m24378a())) {
            return (c6457g2.m25586o() < c6457g.m25586o() || c6457g2.m25580i() <= c6457g.m25586o()) && c6457g2.m25580i() < c6457g.m25580i();
        }
        C10010p0.m38820a("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m24481o(p250r1.C6457g r2, int r3, p250r1.C6457g r4) {
        /*
            q1.g$a r0 = p235q1.C6203g.f19254b
            int r1 = r0.m24381d()
            boolean r1 = p235q1.C6203g.m24374l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.m25583l()
            float r2 = r2.m25584m()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.m24384g()
            boolean r1 = p235q1.C6203g.m24374l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.m25583l()
            float r3 = r4.m25584m()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.m24385h()
            boolean r1 = p235q1.C6203g.m24374l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.m25586o()
            float r2 = r2.m25580i()
            goto L14
        L3e:
            int r0 = r0.m24378a()
            boolean r3 = p235q1.C6203g.m24374l(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.m25586o()
            float r3 = r4.m25580i()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            p376zd.C10010p0.m38820a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p235q1.AbstractC6222p0.m24481o(r1.g, int, r1.g):float");
    }

    /* JADX INFO: renamed from: p */
    public static final float m24482p(C6457g c6457g, int i10, C6457g c6457g2) {
        float f10;
        float f11;
        float fM25586o;
        float fM25580i;
        float fM25586o2;
        C6203g.a aVar = C6203g.f19254b;
        if (C6203g.m24374l(i10, aVar.m24381d()) || C6203g.m24374l(i10, aVar.m24384g())) {
            float fM25586o3 = c6457g2.m25586o();
            float fM25580i2 = c6457g2.m25580i() - c6457g2.m25586o();
            f10 = 2;
            f11 = fM25586o3 + (fM25580i2 / f10);
            fM25586o = c6457g.m25586o();
            fM25580i = c6457g.m25580i();
            fM25586o2 = c6457g.m25586o();
        } else {
            if (!C6203g.m24374l(i10, aVar.m24385h()) && !C6203g.m24374l(i10, aVar.m24378a())) {
                C10010p0.m38820a("This function should only be used for 2-D focus search");
                return 0.0f;
            }
            float fM25583l = c6457g2.m25583l();
            float fM25584m = c6457g2.m25584m() - c6457g2.m25583l();
            f10 = 2;
            f11 = fM25583l + (fM25584m / f10);
            fM25586o = c6457g.m25583l();
            fM25580i = c6457g.m25584m();
            fM25586o2 = c6457g.m25583l();
        }
        return f11 - (fM25586o + ((fM25580i - fM25586o2) / f10));
    }

    /* JADX INFO: renamed from: q */
    public static final long m24483q(int i10, C6457g c6457g, C6457g c6457g2) {
        long jM24481o = (long) m24481o(c6457g2, i10, c6457g);
        long jM24482p = (long) m24482p(c6457g2, i10, c6457g);
        return (((long) 13) * jM24481o * jM24481o) + (jM24482p * jM24482p);
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m24484r(C6206h0 c6206h0, C6457g c6457g, int i10, InterfaceC0184l interfaceC0184l) {
        C6206h0 c6206h0M24476j;
        C9508c c9508c = new C9508c(new C6206h0[16], 0);
        int iM17812a = AbstractC4547h1.m17812a(1024);
        if (!c6206h0.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitChildren called on an unattached node");
        }
        C9508c c9508c2 = new C9508c(new InterfaceC4507m.c[16], 0);
        InterfaceC4507m.c cVarM17453d2 = c6206h0.mo17471z().m17453d2();
        if (cVarM17453d2 == null) {
            AbstractC4557k.m18001c(c9508c2, c6206h0.mo17471z(), false);
        } else {
            c9508c2.m37029b(cVarM17453d2);
        }
        while (c9508c2.m37039l() != 0) {
            InterfaceC4507m.c cVarM18008j = (InterfaceC4507m.c) c9508c2.m37045r(c9508c2.m37039l() - 1);
            if ((cVarM18008j.m17452c2() & iM17812a) == 0) {
                AbstractC4557k.m18001c(c9508c2, cVarM18008j, false);
            } else {
                while (true) {
                    if (cVarM18008j == null) {
                        break;
                    }
                    if ((cVarM18008j.m17457h2() & iM17812a) != 0) {
                        C9508c c9508c3 = null;
                        while (cVarM18008j != null) {
                            if (cVarM18008j instanceof C6206h0) {
                                C6206h0 c6206h02 = (C6206h0) cVarM18008j;
                                if (c6206h02.m17461m2()) {
                                    c9508c.m37029b(c6206h02);
                                }
                            } else if ((cVarM18008j.m17457h2() & iM17812a) != 0 && (cVarM18008j instanceof AbstractC4565m)) {
                                int i11 = 0;
                                for (InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) cVarM18008j).m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
                                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarM18008j = cVarM18050H2;
                                        } else {
                                            if (c9508c3 == null) {
                                                c9508c3 = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (cVarM18008j != null) {
                                                c9508c3.m37029b(cVarM18008j);
                                                cVarM18008j = null;
                                            }
                                            c9508c3.m37029b(cVarM18050H2);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarM18008j = AbstractC4557k.m18008j(c9508c3);
                        }
                    } else {
                        cVarM18008j = cVarM18008j.m17453d2();
                    }
                }
            }
        }
        while (c9508c.m37039l() != 0 && (c6206h0M24476j = m24476j(c9508c, c6457g, i10)) != null) {
            if (c6206h0M24476j.m24395N2().mo17626e()) {
                return ((Boolean) interfaceC0184l.mo27m(c6206h0M24476j)).booleanValue();
            }
            if (m24478l(c6206h0M24476j, c6457g, i10, interfaceC0184l)) {
                return true;
            }
            c9508c.m37043p(c6206h0M24476j);
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static final C6457g m24485s(C6457g c6457g) {
        return new C6457g(c6457g.m25583l(), c6457g.m25586o(), c6457g.m25583l(), c6457g.m25586o());
    }

    /* JADX INFO: renamed from: t */
    public static final Boolean m24486t(C6206h0 c6206h0, int i10, C6457g c6457g, InterfaceC0184l interfaceC0184l) {
        EnumC6200e0 enumC6200e0Mo24362j0 = c6206h0.mo24362j0();
        int[] iArr = a.f19301a;
        int i11 = iArr[enumC6200e0Mo24362j0.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(m24477k(c6206h0, i10, interfaceC0184l));
            }
            if (i11 == 4) {
                return c6206h0.m24395N2().mo17626e() ? (Boolean) interfaceC0184l.mo27m(c6206h0) : c6457g == null ? Boolean.valueOf(m24477k(c6206h0, i10, interfaceC0184l)) : Boolean.valueOf(m24484r(c6206h0, c6457g, i10, interfaceC0184l));
            }
            C5729x.m23182a();
            return null;
        }
        C6206h0 c6206h0M24432f = AbstractC6212k0.m24432f(c6206h0);
        if (c6206h0M24432f == null) {
            C10010p0.m38820a("ActiveParent must have a focusedChild");
            return null;
        }
        int i12 = iArr[c6206h0M24432f.mo24362j0().ordinal()];
        if (i12 == 1) {
            Boolean boolM24486t = m24486t(c6206h0M24432f, i10, c6457g, interfaceC0184l);
            if (!AbstractC1061t.m3842c(boolM24486t, Boolean.FALSE)) {
                return boolM24486t;
            }
            if (c6457g == null) {
                c6457g = AbstractC6212k0.m24430d(m24468b(c6206h0M24432f));
            }
            return Boolean.valueOf(m24478l(c6206h0, c6457g, i10, interfaceC0184l));
        }
        if (i12 == 2 || i12 == 3) {
            if (c6457g == null) {
                c6457g = AbstractC6212k0.m24430d(c6206h0M24432f);
            }
            return Boolean.valueOf(m24478l(c6206h0, c6457g, i10, interfaceC0184l));
        }
        if (i12 != 4) {
            C5729x.m23182a();
            return null;
        }
        C10010p0.m38820a("ActiveParent must have a focusedChild");
        return null;
    }
}
