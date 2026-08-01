package p119i1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p057e1.C1974c;
import p057e1.C1975c0;
import p057e1.C1993u;
import p117i.C3084s0;
import p119i1.AbstractC3137l;
import p119i1.C3147q;
import p172l8.C4699i;
import p172l8.C4700i0;
import p185m8.AbstractC5114x;
import p215oc.C5706c;

/* JADX INFO: renamed from: i1.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3159w {

    /* JADX INFO: renamed from: b */
    public static final long f8424b = 0;

    /* JADX INFO: renamed from: e */
    public static C3147q f8427e;

    /* JADX INFO: renamed from: f */
    public static long f8428f;

    /* JADX INFO: renamed from: g */
    public static final C3143o f8429g;

    /* JADX INFO: renamed from: h */
    public static final C3144o0 f8430h;

    /* JADX INFO: renamed from: i */
    public static List f8431i;

    /* JADX INFO: renamed from: j */
    public static List f8432j;

    /* JADX INFO: renamed from: k */
    public static final C3115b f8433k;

    /* JADX INFO: renamed from: l */
    public static final AbstractC3137l f8434l;

    /* JADX INFO: renamed from: m */
    public static C1974c f8435m;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0184l f8423a = new InterfaceC0184l() { // from class: i1.s
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return AbstractC3159w.m11898a((C3147q) obj);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final C1993u f8425c = new C1993u();

    /* JADX INFO: renamed from: d */
    public static final Object f8426d = new Object();

    static {
        C3147q.a aVar = C3147q.f8395u;
        f8427e = aVar.m11851a();
        long j10 = 1;
        f8428f = AbstractC3149r.m11861c(1) + j10;
        f8429g = new C3143o();
        f8430h = new C3144o0();
        f8431i = AbstractC5114x.m20800o();
        f8432j = AbstractC5114x.m20800o();
        long j11 = f8428f;
        f8428f = j10 + j11;
        C3115b c3115b = new C3115b(j11, aVar.m11851a());
        f8427e = f8427e.m11850u(c3115b.mo11678i());
        f8433k = c3115b;
        f8434l = c3115b;
        f8435m = new C1974c(0);
    }

    /* JADX INFO: renamed from: C */
    public static final C3147q m11874C(C3147q c3147q, long j10, long j11) {
        while (AbstractC1061t.m3844e(j10, j11) < 0) {
            c3147q = c3147q.m11850u(j10);
            j10 += (long) 1;
        }
        return c3147q;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11875D(p010a9.InterfaceC0184l r15) {
        /*
            i1.b r0 = p119i1.AbstractC3159w.f8433k
            java.lang.Object r1 = m11883L()
            monitor-enter(r1)
            i.s0 r2 = r0.mo11666E()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L17
            e1.c r3 = p119i1.AbstractC3159w.f8435m     // Catch: java.lang.Throwable -> L14
            r4 = 1
            r3.m7136a(r4)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r15 = move-exception
            goto L9e
        L17:
            java.lang.Object r15 = m11903c0(r0, r15)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L47
            r3 = -1
            java.util.List r4 = p119i1.AbstractC3159w.f8431i     // Catch: java.lang.Throwable -> L39
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L39
            r6 = r1
        L27:
            if (r6 >= r5) goto L3b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L39
            a9.p r7 = (p010a9.InterfaceC0188p) r7     // Catch: java.lang.Throwable -> L39
            java.util.Set r8 = p349y0.AbstractC9511f.m37066a(r2)     // Catch: java.lang.Throwable -> L39
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L39
            int r6 = r6 + 1
            goto L27
        L39:
            r15 = move-exception
            goto L41
        L3b:
            e1.c r0 = p119i1.AbstractC3159w.f8435m
            r0.m7136a(r3)
            goto L47
        L41:
            e1.c r0 = p119i1.AbstractC3159w.f8435m
            r0.m7136a(r3)
            throw r15
        L47:
            java.lang.Object r0 = m11883L()
            monitor-enter(r0)
            m11877F()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L9a
            java.lang.Object[] r3 = r2.f8093b     // Catch: java.lang.Throwable -> L8b
            long[] r2 = r2.f8092a     // Catch: java.lang.Throwable -> L8b
            int r4 = r2.length     // Catch: java.lang.Throwable -> L8b
            int r4 = r4 + (-2)
            if (r4 < 0) goto L98
            r5 = r1
        L5b:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L8b
            long r8 = ~r6     // Catch: java.lang.Throwable -> L8b
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L93
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L8b
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L75:
            if (r10 >= r8) goto L91
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L8d
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L8b
            i1.v0 r11 = (p119i1.InterfaceC3158v0) r11     // Catch: java.lang.Throwable -> L8b
            m11894W(r11)     // Catch: java.lang.Throwable -> L8b
            goto L8d
        L8b:
            r15 = move-exception
            goto L9c
        L8d:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L75
        L91:
            if (r8 != r9) goto L98
        L93:
            if (r5 == r4) goto L98
            int r5 = r5 + 1
            goto L5b
        L98:
            l8.i0 r1 = p172l8.C4700i0.f13910a     // Catch: java.lang.Throwable -> L8b
        L9a:
            monitor-exit(r0)
            return r15
        L9c:
            monitor-exit(r0)
            throw r15
        L9e:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p119i1.AbstractC3159w.m11875D(a9.l):java.lang.Object");
    }

    /* JADX INFO: renamed from: E */
    public static final void m11876E() {
        m11875D(f8423a);
    }

    /* JADX INFO: renamed from: F */
    public static final void m11877F() {
        C3144o0 c3144o0 = f8430h;
        int iM11834e = c3144o0.m11834e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iM11834e) {
                break;
            }
            C1975c0 c1975c0 = c3144o0.m11835f()[i10];
            Object obj = c1975c0 != null ? c1975c0.get() : null;
            if (obj != null && m11893V((InterfaceC3158v0) obj)) {
                if (i11 != i10) {
                    c3144o0.m11835f()[i11] = c1975c0;
                    c3144o0.m11833d()[i11] = c3144o0.m11833d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iM11834e; i12++) {
            c3144o0.m11835f()[i12] = null;
            c3144o0.m11833d()[i12] = 0;
        }
        if (i11 != iM11834e) {
            c3144o0.m11836g(i11);
        }
    }

    /* JADX INFO: renamed from: G */
    public static final AbstractC3137l m11878G(AbstractC3137l abstractC3137l, InterfaceC0184l interfaceC0184l, boolean z10) {
        boolean z11 = abstractC3137l instanceof C3121d;
        if (z11 || abstractC3137l == null) {
            return new C3117b1(z11 ? (C3121d) abstractC3137l : null, interfaceC0184l, null, false, z10);
        }
        return new C3120c1(abstractC3137l, interfaceC0184l, false, z10);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ AbstractC3137l m11879H(AbstractC3137l abstractC3137l, InterfaceC0184l interfaceC0184l, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC0184l = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m11878G(abstractC3137l, interfaceC0184l, z10);
    }

    /* JADX INFO: renamed from: I */
    public static final AbstractC3162x0 m11880I(AbstractC3162x0 abstractC3162x0) {
        AbstractC3162x0 abstractC3162x0M11896Y;
        AbstractC3137l.a aVar = AbstractC3137l.f8345e;
        AbstractC3137l abstractC3137lM11764c = aVar.m11764c();
        AbstractC3162x0 abstractC3162x0M11896Y2 = m11896Y(abstractC3162x0, abstractC3137lM11764c.mo11678i(), abstractC3137lM11764c.mo11675f());
        if (abstractC3162x0M11896Y2 != null) {
            return abstractC3162x0M11896Y2;
        }
        synchronized (m11883L()) {
            AbstractC3137l abstractC3137lM11764c2 = aVar.m11764c();
            abstractC3162x0M11896Y = m11896Y(abstractC3162x0, abstractC3137lM11764c2.mo11678i(), abstractC3137lM11764c2.mo11675f());
        }
        if (abstractC3162x0M11896Y != null) {
            return abstractC3162x0M11896Y;
        }
        m11895X();
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static final AbstractC3162x0 m11881J(AbstractC3162x0 abstractC3162x0, AbstractC3137l abstractC3137l) {
        AbstractC3162x0 abstractC3162x0M11896Y;
        AbstractC3162x0 abstractC3162x0M11896Y2 = m11896Y(abstractC3162x0, abstractC3137l.mo11678i(), abstractC3137l.mo11675f());
        if (abstractC3162x0M11896Y2 != null) {
            return abstractC3162x0M11896Y2;
        }
        synchronized (m11883L()) {
            abstractC3162x0M11896Y = m11896Y(abstractC3162x0, abstractC3137l.mo11678i(), abstractC3137l.mo11675f());
        }
        if (abstractC3162x0M11896Y != null) {
            return abstractC3162x0M11896Y;
        }
        m11895X();
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static final AbstractC3137l m11882K() {
        AbstractC3137l abstractC3137l = (AbstractC3137l) f8425c.m7197a();
        return abstractC3137l == null ? f8433k : abstractC3137l;
    }

    /* JADX INFO: renamed from: L */
    public static final Object m11883L() {
        return f8426d;
    }

    /* JADX INFO: renamed from: M */
    public static final InterfaceC0184l m11884M(final InterfaceC0184l interfaceC0184l, final InterfaceC0184l interfaceC0184l2, boolean z10) {
        if (!z10) {
            interfaceC0184l2 = null;
        }
        return (interfaceC0184l == null || interfaceC0184l2 == null || interfaceC0184l == interfaceC0184l2) ? interfaceC0184l == null ? interfaceC0184l2 : interfaceC0184l : new InterfaceC0184l() { // from class: i1.t
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3159w.m11902c(interfaceC0184l, interfaceC0184l2, obj);
            }
        };
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ InterfaceC0184l m11885N(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return m11884M(interfaceC0184l, interfaceC0184l2, z10);
    }

    /* JADX INFO: renamed from: O */
    public static final InterfaceC0184l m11886O(final InterfaceC0184l interfaceC0184l, final InterfaceC0184l interfaceC0184l2) {
        return (interfaceC0184l == null || interfaceC0184l2 == null || interfaceC0184l == interfaceC0184l2) ? interfaceC0184l == null ? interfaceC0184l2 : interfaceC0184l : new InterfaceC0184l() { // from class: i1.u
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3159w.m11904d(interfaceC0184l, interfaceC0184l2, obj);
            }
        };
    }

    /* JADX INFO: renamed from: P */
    public static final AbstractC3162x0 m11887P(AbstractC3162x0 abstractC3162x0, InterfaceC3158v0 interfaceC3158v0) {
        AbstractC3162x0 abstractC3162x0M11909f0 = m11909f0(interfaceC3158v0);
        if (abstractC3162x0M11909f0 != null) {
            abstractC3162x0M11909f0.m11943h(Long.MAX_VALUE);
            return abstractC3162x0M11909f0;
        }
        AbstractC3162x0 abstractC3162x0Mo1523d = abstractC3162x0.mo1523d(Long.MAX_VALUE);
        abstractC3162x0Mo1523d.m11942g(interfaceC3158v0.getFirstStateRecord());
        interfaceC3158v0.mo1521o(abstractC3162x0Mo1523d);
        return abstractC3162x0Mo1523d;
    }

    /* JADX INFO: renamed from: Q */
    public static final AbstractC3162x0 m11888Q(AbstractC3162x0 abstractC3162x0, InterfaceC3158v0 interfaceC3158v0, AbstractC3137l abstractC3137l) {
        AbstractC3162x0 abstractC3162x0M11889R;
        synchronized (m11883L()) {
            abstractC3162x0M11889R = m11889R(abstractC3162x0, interfaceC3158v0, abstractC3137l);
        }
        return abstractC3162x0M11889R;
    }

    /* JADX INFO: renamed from: R */
    public static final AbstractC3162x0 m11889R(AbstractC3162x0 abstractC3162x0, InterfaceC3158v0 interfaceC3158v0, AbstractC3137l abstractC3137l) {
        AbstractC3162x0 abstractC3162x0M11887P = m11887P(abstractC3162x0, interfaceC3158v0);
        abstractC3162x0M11887P.mo1522c(abstractC3162x0);
        abstractC3162x0M11887P.m11943h(abstractC3137l.mo11678i());
        return abstractC3162x0M11887P;
    }

    /* JADX INFO: renamed from: S */
    public static final void m11890S(AbstractC3137l abstractC3137l, InterfaceC3158v0 interfaceC3158v0) {
        abstractC3137l.mo11684w(abstractC3137l.mo11679j() + 1);
        InterfaceC0184l interfaceC0184lMo11680k = abstractC3137l.mo11680k();
        if (interfaceC0184lMo11680k != null) {
            interfaceC0184lMo11680k.mo27m(interfaceC3158v0);
        }
    }

    /* JADX INFO: renamed from: T */
    public static final Map m11891T(long j10, C3121d c3121d, C3147q c3147q) {
        long[] jArr;
        Map map;
        C3147q c3147q2;
        Object[] objArr;
        int i10;
        long[] jArr2;
        Map map2;
        C3147q c3147q3;
        Object[] objArr2;
        int i11;
        int i12;
        C3084s0 c3084s0Mo11666E = c3121d.mo11666E();
        Map map3 = null;
        if (c3084s0Mo11666E == null) {
            return null;
        }
        long jMo11678i = c3121d.mo11678i();
        C3147q c3147qM11849t = c3121d.mo11675f().m11850u(jMo11678i).m11849t(c3121d.m11699F());
        Object[] objArr3 = c3084s0Mo11666E.f8093b;
        long[] jArr3 = c3084s0Mo11666E.f8092a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i13 = 0;
        while (true) {
            long j11 = jArr3[i13];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j11) < 128) {
                        InterfaceC3158v0 interfaceC3158v0 = (InterfaceC3158v0) objArr3[(i13 << 3) + i16];
                        map2 = map3;
                        AbstractC3162x0 abstractC3162x0Mo1519e = interfaceC3158v0.getFirstStateRecord();
                        jArr2 = jArr3;
                        i11 = i13;
                        i12 = i14;
                        AbstractC3162x0 abstractC3162x0M11896Y = m11896Y(abstractC3162x0Mo1519e, j10, c3147q);
                        if (abstractC3162x0M11896Y == null) {
                            objArr2 = objArr3;
                        } else {
                            objArr2 = objArr3;
                            AbstractC3162x0 abstractC3162x0M11896Y2 = m11896Y(abstractC3162x0Mo1519e, jMo11678i, c3147qM11849t);
                            if (abstractC3162x0M11896Y2 != null && !AbstractC1061t.m3842c(abstractC3162x0M11896Y, abstractC3162x0M11896Y2)) {
                                c3147q3 = c3147qM11849t;
                                AbstractC3162x0 abstractC3162x0M11896Y3 = m11896Y(abstractC3162x0Mo1519e, jMo11678i, c3121d.mo11675f());
                                if (abstractC3162x0M11896Y3 == null) {
                                    m11895X();
                                    C5706c.m23089a();
                                    return null;
                                }
                                AbstractC3162x0 abstractC3162x0Mo1520l = interfaceC3158v0.mo1520l(abstractC3162x0M11896Y2, abstractC3162x0M11896Y, abstractC3162x0M11896Y3);
                                if (abstractC3162x0Mo1520l == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(abstractC3162x0M11896Y, abstractC3162x0Mo1520l);
                                map4 = map4;
                            }
                        }
                        c3147q3 = c3147qM11849t;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        c3147q3 = c3147qM11849t;
                        objArr2 = objArr3;
                        i11 = i13;
                        i12 = i14;
                    }
                    j11 >>= i12;
                    i16++;
                    map3 = map2;
                    i13 = i11;
                    i14 = i12;
                    jArr3 = jArr2;
                    objArr3 = objArr2;
                    c3147qM11849t = c3147q3;
                }
                jArr = jArr3;
                map = map3;
                c3147q2 = c3147qM11849t;
                objArr = objArr3;
                i10 = i13;
                if (i15 != i14) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                c3147q2 = c3147qM11849t;
                objArr = objArr3;
                i10 = i13;
            }
            int i17 = i10;
            if (i17 == length) {
                return map4;
            }
            i13 = i17 + 1;
            map3 = map;
            jArr3 = jArr;
            objArr3 = objArr;
            c3147qM11849t = c3147q2;
        }
    }

    /* JADX INFO: renamed from: U */
    public static final AbstractC3162x0 m11892U(AbstractC3162x0 abstractC3162x0, InterfaceC3158v0 interfaceC3158v0, AbstractC3137l abstractC3137l, AbstractC3162x0 abstractC3162x02) {
        AbstractC3162x0 abstractC3162x0M11887P;
        if (abstractC3137l.mo11677h()) {
            abstractC3137l.mo11681p(interfaceC3158v0);
        }
        long jMo11678i = abstractC3137l.mo11678i();
        if (abstractC3162x02.m11941f() == jMo11678i) {
            return abstractC3162x02;
        }
        synchronized (m11883L()) {
            abstractC3162x0M11887P = m11887P(abstractC3162x0, interfaceC3158v0);
        }
        abstractC3162x0M11887P.m11943h(jMo11678i);
        if (abstractC3162x02.m11941f() != AbstractC3149r.m11861c(1)) {
            abstractC3137l.mo11681p(interfaceC3158v0);
        }
        return abstractC3162x0M11887P;
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m11893V(InterfaceC3158v0 interfaceC3158v0) {
        AbstractC3162x0 abstractC3162x0;
        long jM11825e = f8429g.m11825e(f8428f);
        AbstractC3162x0 abstractC3162x02 = null;
        AbstractC3162x0 abstractC3162x0Mo1519e = null;
        int i10 = 0;
        for (AbstractC3162x0 abstractC3162x0Mo1519e2 = interfaceC3158v0.getFirstStateRecord(); abstractC3162x0Mo1519e2 != null; abstractC3162x0Mo1519e2 = abstractC3162x0Mo1519e2.m11940e()) {
            long jM11941f = abstractC3162x0Mo1519e2.m11941f();
            if (jM11941f != f8424b) {
                if (AbstractC1061t.m3844e(jM11941f, jM11825e) >= 0) {
                    i10++;
                } else if (abstractC3162x02 == null) {
                    i10++;
                    abstractC3162x02 = abstractC3162x0Mo1519e2;
                } else {
                    if (AbstractC1061t.m3844e(abstractC3162x0Mo1519e2.m11941f(), abstractC3162x02.m11941f()) < 0) {
                        abstractC3162x0 = abstractC3162x02;
                        abstractC3162x02 = abstractC3162x0Mo1519e2;
                    } else {
                        abstractC3162x0 = abstractC3162x0Mo1519e2;
                    }
                    if (abstractC3162x0Mo1519e == null) {
                        abstractC3162x0Mo1519e = interfaceC3158v0.getFirstStateRecord();
                        AbstractC3162x0 abstractC3162x03 = abstractC3162x0Mo1519e;
                        while (true) {
                            if (abstractC3162x0Mo1519e == null) {
                                abstractC3162x0Mo1519e = abstractC3162x03;
                                break;
                            }
                            if (AbstractC1061t.m3844e(abstractC3162x0Mo1519e.m11941f(), jM11825e) >= 0) {
                                break;
                            }
                            if (AbstractC1061t.m3844e(abstractC3162x03.m11941f(), abstractC3162x0Mo1519e.m11941f()) < 0) {
                                abstractC3162x03 = abstractC3162x0Mo1519e;
                            }
                            abstractC3162x0Mo1519e = abstractC3162x0Mo1519e.m11940e();
                        }
                    }
                    abstractC3162x02.m11943h(f8424b);
                    abstractC3162x02.mo1522c(abstractC3162x0Mo1519e);
                    abstractC3162x02 = abstractC3162x0;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX INFO: renamed from: W */
    public static final void m11894W(InterfaceC3158v0 interfaceC3158v0) {
        if (m11893V(interfaceC3158v0)) {
            f8430h.m11830a(interfaceC3158v0);
        }
    }

    /* JADX INFO: renamed from: X */
    public static final Void m11895X() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: Y */
    public static final AbstractC3162x0 m11896Y(AbstractC3162x0 abstractC3162x0, long j10, C3147q c3147q) {
        AbstractC3162x0 abstractC3162x02 = null;
        while (abstractC3162x0 != null) {
            if (m11913h0(abstractC3162x0, j10, c3147q) && (abstractC3162x02 == null || AbstractC1061t.m3844e(abstractC3162x02.m11941f(), abstractC3162x0.m11941f()) < 0)) {
                abstractC3162x02 = abstractC3162x0;
            }
            abstractC3162x0 = abstractC3162x0.m11940e();
        }
        if (abstractC3162x02 != null) {
            return abstractC3162x02;
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public static final AbstractC3162x0 m11897Z(AbstractC3162x0 abstractC3162x0, InterfaceC3158v0 interfaceC3158v0) {
        AbstractC3162x0 abstractC3162x0M11896Y;
        AbstractC3137l.a aVar = AbstractC3137l.f8345e;
        AbstractC3137l abstractC3137lM11764c = aVar.m11764c();
        InterfaceC0184l interfaceC0184lMo11676g = abstractC3137lM11764c.mo11676g();
        if (interfaceC0184lMo11676g != null) {
            interfaceC0184lMo11676g.mo27m(interfaceC3158v0);
        }
        AbstractC3162x0 abstractC3162x0M11896Y2 = m11896Y(abstractC3162x0, abstractC3137lM11764c.mo11678i(), abstractC3137lM11764c.mo11675f());
        if (abstractC3162x0M11896Y2 != null) {
            return abstractC3162x0M11896Y2;
        }
        synchronized (m11883L()) {
            AbstractC3137l abstractC3137lM11764c2 = aVar.m11764c();
            AbstractC3162x0 abstractC3162x0Mo1519e = interfaceC3158v0.getFirstStateRecord();
            abstractC3162x0Mo1519e.getClass();
            abstractC3162x0M11896Y = m11896Y(abstractC3162x0Mo1519e, abstractC3137lM11764c2.mo11678i(), abstractC3137lM11764c2.mo11675f());
            if (abstractC3162x0M11896Y == null) {
                m11895X();
                throw new C4699i();
            }
        }
        return abstractC3162x0M11896Y;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m11898a(C3147q c3147q) {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m11899a0(int i10) {
        f8429g.m11826f(i10);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC3137l m11900b(InterfaceC0184l interfaceC0184l, C3147q c3147q) {
        AbstractC3137l abstractC3137l = (AbstractC3137l) interfaceC0184l.mo27m(c3147q);
        synchronized (m11883L()) {
            f8427e = f8427e.m11850u(abstractC3137l.mo11678i());
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        return abstractC3137l;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Void m11901b0() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m11902c(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, Object obj) {
        interfaceC0184l.mo27m(obj);
        interfaceC0184l2.mo27m(obj);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Object m11903c0(C3115b c3115b, InterfaceC0184l interfaceC0184l) {
        long jMo11678i = c3115b.mo11678i();
        Object objMo27m = interfaceC0184l.mo27m(f8427e.m11846q(jMo11678i));
        long j10 = f8428f;
        f8428f = ((long) 1) + j10;
        f8427e = f8427e.m11846q(jMo11678i);
        c3115b.mo11683v(j10);
        c3115b.mo11682u(f8427e);
        c3115b.mo11684w(0);
        c3115b.mo11668Q(null);
        c3115b.m11756q();
        f8427e = f8427e.m11850u(j10);
        return objMo27m;
    }

    /* JADX INFO: renamed from: d */
    public static C4700i0 m11904d(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, Object obj) {
        interfaceC0184l.mo27m(obj);
        interfaceC0184l2.mo27m(obj);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d0 */
    public static final AbstractC3137l m11905d0(final InterfaceC0184l interfaceC0184l) {
        return (AbstractC3137l) m11875D(new InterfaceC0184l() { // from class: i1.v
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3159w.m11900b(interfaceC0184l, (C3147q) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static final int m11907e0(long j10, C3147q c3147q) {
        int iM11821a;
        long jM11848s = c3147q.m11848s(j10);
        synchronized (m11883L()) {
            iM11821a = f8429g.m11821a(jM11848s);
        }
        return iM11821a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final AbstractC3162x0 m11909f0(InterfaceC3158v0 interfaceC3158v0) {
        long jM11825e = f8429g.m11825e(f8428f) - ((long) 1);
        C3147q c3147qM11851a = C3147q.f8395u.m11851a();
        AbstractC3162x0 abstractC3162x0 = null;
        for (AbstractC3162x0 abstractC3162x0Mo1519e = interfaceC3158v0.getFirstStateRecord(); abstractC3162x0Mo1519e != null; abstractC3162x0Mo1519e = abstractC3162x0Mo1519e.m11940e()) {
            if (abstractC3162x0Mo1519e.m11941f() != f8424b) {
                if (m11913h0(abstractC3162x0Mo1519e, jM11825e, c3147qM11851a)) {
                    if (abstractC3162x0 == null) {
                        abstractC3162x0 = abstractC3162x0Mo1519e;
                    } else if (AbstractC1061t.m3844e(abstractC3162x0Mo1519e.m11941f(), abstractC3162x0.m11941f()) >= 0) {
                        return abstractC3162x0;
                    }
                }
            }
            return abstractC3162x0Mo1519e;
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public static final boolean m11911g0(long j10, long j11, C3147q c3147q) {
        return (j11 == f8424b || AbstractC1061t.m3844e(j11, j10) > 0 || c3147q.m11847r(j11)) ? false : true;
    }

    /* JADX INFO: renamed from: h0 */
    public static final boolean m11913h0(AbstractC3162x0 abstractC3162x0, long j10, C3147q c3147q) {
        return m11911g0(j10, abstractC3162x0.m11941f(), c3147q);
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m11915i0(AbstractC3137l abstractC3137l) {
        long jM11825e;
        if (f8427e.m11847r(abstractC3137l.mo11678i())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(abstractC3137l.mo11678i());
        sb2.append(", disposed=");
        sb2.append(abstractC3137l.m11754e());
        sb2.append(", applied=");
        C3121d c3121d = abstractC3137l instanceof C3121d ? (C3121d) abstractC3137l : null;
        sb2.append(c3121d != null ? Boolean.valueOf(c3121d.m11698D()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (m11883L()) {
            jM11825e = f8429g.m11825e(-1L);
        }
        sb2.append(jM11825e);
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* JADX INFO: renamed from: j0 */
    public static final AbstractC3162x0 m11917j0(AbstractC3162x0 abstractC3162x0, InterfaceC3158v0 interfaceC3158v0, AbstractC3137l abstractC3137l) {
        AbstractC3162x0 abstractC3162x0M11896Y;
        if (abstractC3137l.mo11677h()) {
            abstractC3137l.mo11681p(interfaceC3158v0);
        }
        long jMo11678i = abstractC3137l.mo11678i();
        AbstractC3162x0 abstractC3162x0M11896Y2 = m11896Y(abstractC3162x0, jMo11678i, abstractC3137l.mo11675f());
        if (abstractC3162x0M11896Y2 == null) {
            m11895X();
            C5706c.m23089a();
            return null;
        }
        if (abstractC3162x0M11896Y2.m11941f() == abstractC3137l.mo11678i()) {
            return abstractC3162x0M11896Y2;
        }
        synchronized (m11883L()) {
            abstractC3162x0M11896Y = m11896Y(interfaceC3158v0.getFirstStateRecord(), jMo11678i, abstractC3137l.mo11675f());
            if (abstractC3162x0M11896Y == null) {
                m11895X();
                throw new C4699i();
            }
            if (abstractC3162x0M11896Y.m11941f() != jMo11678i) {
                abstractC3162x0M11896Y = m11889R(abstractC3162x0M11896Y, interfaceC3158v0, abstractC3137l);
            }
        }
        abstractC3162x0M11896Y.getClass();
        if (abstractC3162x0M11896Y2.m11941f() != AbstractC3149r.m11861c(1)) {
            abstractC3137l.mo11681p(interfaceC3158v0);
        }
        return abstractC3162x0M11896Y;
    }
}
