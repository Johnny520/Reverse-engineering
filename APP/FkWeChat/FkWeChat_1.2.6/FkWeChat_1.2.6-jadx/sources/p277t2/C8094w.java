package p277t2;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p121i3.C3189s;
import p135j2.AbstractC3581x;
import p135j2.InterfaceC3512d0;
import p135j2.InterfaceC3578w;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4528c2;
import p166l2.AbstractC4539f1;
import p166l2.AbstractC4547h1;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4565m;
import p166l2.C4531d1;
import p166l2.C4554j0;
import p166l2.InterfaceC4524b2;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p250r1.C6455e;
import p250r1.C6457g;
import p349y0.C9508c;

/* JADX INFO: renamed from: t2.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8094w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4507m.c f27032a;

    /* JADX INFO: renamed from: b */
    public final boolean f27033b;

    /* JADX INFO: renamed from: c */
    public final C4554j0 f27034c;

    /* JADX INFO: renamed from: d */
    public final C8087p f27035d;

    /* JADX INFO: renamed from: e */
    public boolean f27036e;

    /* JADX INFO: renamed from: f */
    public C8094w f27037f;

    /* JADX INFO: renamed from: g */
    public final int f27038g;

    /* JADX INFO: renamed from: t2.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C8079k f27039r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8079k c8079k) {
            super(1);
            this.f27039r = c8079k;
        }

        /* JADX INFO: renamed from: a */
        public final void m31300a(InterfaceC8074h0 interfaceC8074h0) {
            AbstractC8070f0.m31117i0(interfaceC8074h0, this.f27039r.m31194p());
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m31300a((InterfaceC8074h0) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: t2.w$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ String f27040r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f27040r = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m31301a(InterfaceC8074h0 interfaceC8074h0) {
            AbstractC8070f0.m31097X(interfaceC8074h0, this.f27040r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m31301a((InterfaceC8074h0) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: t2.w$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends InterfaceC4507m.c implements InterfaceC4524b2 {

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ InterfaceC0184l f27041F;

        public c(InterfaceC0184l interfaceC0184l) {
            this.f27041F = interfaceC0184l;
        }

        @Override // p166l2.InterfaceC4524b2
        /* JADX INFO: renamed from: z0 */
        public void mo1261z0(InterfaceC8074h0 interfaceC8074h0) {
            this.f27041F.mo27m(interfaceC8074h0);
        }
    }

    public C8094w(InterfaceC4507m.c cVar, boolean z10, C4554j0 c4554j0, C8087p c8087p) {
        this.f27032a = cVar;
        this.f27033b = z10;
        this.f27034c = c4554j0;
        this.f27035d = c8087p;
        this.f27038g = c4554j0.mo13084o();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ List m31268F(C8094w c8094w, List list, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return c8094w.m31275E(list, z10, z11);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ List m31269h(C8094w c8094w, List list, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list2 = new ArrayList();
        }
        return c8094w.m31282g(list, list2);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ List m31270o(C8094w c8094w, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !c8094w.f27033b;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return c8094w.m31288n(z10, z11, z12);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m31271A() {
        return this.f27033b && this.f27035d.m31258v();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m31272B() {
        AbstractC4539f1 abstractC4539f1M31281f = m31281f();
        if (abstractC4539f1M31281f != null) {
            return abstractC4539f1M31281f.m17729j3();
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m31273C() {
        if (this.f27036e || !m31295v().isEmpty()) {
            return false;
        }
        C4554j0 c4554j0M17848B0 = this.f27034c.m17848B0();
        while (true) {
            if (c4554j0M17848B0 == null) {
                c4554j0M17848B0 = null;
                break;
            }
            C8087p c8087pMo17919c = c4554j0M17848B0.mo17919c();
            if (c8087pMo17919c != null && c8087pMo17919c.m31258v()) {
                break;
            }
            c4554j0M17848B0 = c4554j0M17848B0.m17848B0();
        }
        return c4554j0M17848B0 == null;
    }

    /* JADX INFO: renamed from: D */
    public final void m31274D(List list, C8087p c8087p) {
        if (this.f27035d.m31257u()) {
            return;
        }
        m31268F(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            C8094w c8094w = (C8094w) list.get(size2);
            if (!c8094w.m31271A()) {
                c8087p.m31259w(c8094w.f27035d);
                c8094w.m31274D(list, c8087p);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final List m31275E(List list, boolean z10, boolean z11) {
        if (this.f27036e) {
            return AbstractC5114x.m20800o();
        }
        m31280e(this.f27034c, list, z11);
        if (z10) {
            m31278c(list);
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: a */
    public final C6457g m31276a(InterfaceC3578w interfaceC3578w) {
        ?? M18008j;
        C8094w c8094wM31293t = m31293t();
        if (c8094wM31293t == null) {
            return C6457g.f20319e.m25594a();
        }
        C4531d1 c4531d1M17965v0 = c8094wM31293t.f27034c.m17965v0();
        int iM17812a = AbstractC4547h1.m17812a(8);
        if ((c4531d1M17965v0.m17595i() & iM17812a) != 0) {
            loop0: for (InterfaceC4507m.c cVarM17597k = c4531d1M17965v0.m17597k(); cVarM17597k != null; cVarM17597k = cVarM17597k.m17453d2()) {
                if ((cVarM17597k.m17457h2() & iM17812a) != 0) {
                    M18008j = cVarM17597k;
                    ?? c9508c = 0;
                    while (M18008j != 0) {
                        if (M18008j instanceof InterfaceC4524b2) {
                            if (((InterfaceC4524b2) M18008j).mo17543P()) {
                                break loop0;
                            }
                        } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                            InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                            int i10 = 0;
                            M18008j = M18008j;
                            c9508c = c9508c;
                            while (cVarM18050H2 != null) {
                                if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                    i10++;
                                    c9508c = c9508c;
                                    if (i10 == 1) {
                                        M18008j = cVarM18050H2;
                                    } else {
                                        if (c9508c == 0) {
                                            c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                        }
                                        if (M18008j != 0) {
                                            c9508c.m37029b(M18008j);
                                            M18008j = 0;
                                        }
                                        c9508c.m37029b(cVarM18050H2);
                                    }
                                }
                                cVarM18050H2 = cVarM18050H2.m17453d2();
                                M18008j = M18008j;
                                c9508c = c9508c;
                            }
                            if (i10 == 1) {
                            }
                        }
                        M18008j = AbstractC4557k.m18008j(c9508c);
                    }
                }
                if ((cVarM17597k.m17452c2() & iM17812a) == 0) {
                    break;
                }
            }
            M18008j = 0;
        } else {
            M18008j = 0;
        }
        InterfaceC4524b2 interfaceC4524b2 = (InterfaceC4524b2) M18008j;
        AbstractC4539f1 abstractC4539f1M18010l = interfaceC4524b2 != null ? AbstractC4557k.m18010l(interfaceC4524b2, AbstractC4547h1.m17812a(8)) : null;
        return abstractC4539f1M18010l == null ? c8094wM31293t.m31276a(interfaceC3578w) : InterfaceC3578w.m13371r0(abstractC4539f1M18010l, interfaceC3578w, false, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final C8094w m31277b() {
        return new C8094w(this.f27032a, true, this.f27034c, this.f27035d);
    }

    /* JADX INFO: renamed from: c */
    public final void m31278c(List list) {
        C8079k c8079kM31307f = AbstractC8095x.m31307f(this);
        if (c8079kM31307f != null && this.f27035d.m31258v() && !list.isEmpty()) {
            list.add(m31279d(c8079kM31307f, new a(c8079kM31307f)));
        }
        C8087p c8087p = this.f27035d;
        C8064c0 c8064c0 = C8064c0.f26891a;
        if (c8087p.m31249e(c8064c0.m31021d()) && !list.isEmpty() && this.f27035d.m31258v()) {
            List list2 = (List) AbstractC8088q.m31262a(this.f27035d, c8064c0.m31021d());
            String str = list2 != null ? (String) AbstractC5081g0.m20578l0(list2) : null;
            if (str != null) {
                list.add(0, m31279d(null, new b(str)));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final C8094w m31279d(C8079k c8079k, InterfaceC0184l interfaceC0184l) {
        C8087p c8087p = new C8087p();
        c8087p.m31261y(false);
        c8087p.m31260x(false);
        interfaceC0184l.mo27m(c8087p);
        C8094w c8094w = new C8094w(new c(interfaceC0184l), false, new C4554j0(true, c8079k != null ? AbstractC8095x.m31308g(this) : AbstractC8095x.m31306e(this)), c8087p);
        c8094w.f27036e = true;
        c8094w.f27037f = this;
        return c8094w;
    }

    /* JADX INFO: renamed from: e */
    public final void m31280e(C4554j0 c4554j0, List list, boolean z10) {
        C9508c c9508cM17863I0 = c4554j0.m17863I0();
        Object[] objArr = c9508cM17863I0.f32299q;
        int iM37039l = c9508cM17863I0.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            C4554j0 c4554j02 = (C4554j0) objArr[i10];
            if (c4554j02.mo13082d() && (z10 || !c4554j02.mo13085p())) {
                if (c4554j02.m17965v0().m17602p(AbstractC4547h1.m17812a(8))) {
                    list.add(AbstractC8095x.m31302a(c4554j02, this.f27033b));
                } else {
                    m31280e(c4554j02, list, z10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC4539f1 m31281f() {
        AbstractC4539f1 abstractC4539f1M18010l;
        if (!this.f27036e) {
            InterfaceC4524b2 interfaceC4524b2M31283i = m31283i();
            return (interfaceC4524b2M31283i == null || (abstractC4539f1M18010l = AbstractC4557k.m18010l(interfaceC4524b2M31283i, AbstractC4547h1.m17812a(8))) == null) ? this.f27034c.m17907Y() : abstractC4539f1M18010l;
        }
        C8094w c8094wM31293t = m31293t();
        if (c8094wM31293t != null) {
            return c8094wM31293t.m31281f();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final List m31282g(List list, List list2) {
        m31268F(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            C8094w c8094w = (C8094w) list.get(size2);
            if (c8094w.m31271A()) {
                list2.add(c8094w);
            } else if (!c8094w.f27035d.m31257u()) {
                c8094w.m31282g(list, list2);
            }
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX INFO: renamed from: i */
    public final InterfaceC4524b2 m31283i() {
        ?? M18008j;
        boolean zM31258v = this.f27035d.m31258v();
        C4554j0 c4554j0 = this.f27034c;
        ?? r62 = 0;
        r62 = 0;
        r62 = 0;
        r62 = 0;
        if (zM31258v) {
            C4531d1 c4531d1M17965v0 = c4554j0.m17965v0();
            int iM17812a = AbstractC4547h1.m17812a(8);
            if ((c4531d1M17965v0.m17595i() & iM17812a) != 0) {
                InterfaceC4507m.c cVarM17597k = c4531d1M17965v0.m17597k();
                M18008j = 0;
                while (cVarM17597k != null) {
                    if ((cVarM17597k.m17457h2() & iM17812a) != 0) {
                        ?? M18008j2 = cVarM17597k;
                        ?? c9508c = 0;
                        while (M18008j2 != 0) {
                            if (M18008j2 instanceof InterfaceC4524b2) {
                                InterfaceC4524b2 interfaceC4524b2 = (InterfaceC4524b2) M18008j2;
                                if (interfaceC4524b2.mo17543P()) {
                                    if (interfaceC4524b2.mo17345R1()) {
                                        return interfaceC4524b2;
                                    }
                                    if (M18008j == 0) {
                                        M18008j = interfaceC4524b2;
                                    }
                                }
                            } else if ((M18008j2.m17457h2() & iM17812a) != 0 && (M18008j2 instanceof AbstractC4565m)) {
                                InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j2).m18050H2();
                                int i10 = 0;
                                M18008j2 = M18008j2;
                                c9508c = c9508c;
                                while (cVarM18050H2 != null) {
                                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                        i10++;
                                        c9508c = c9508c;
                                        if (i10 == 1) {
                                            M18008j2 = cVarM18050H2;
                                        } else {
                                            if (c9508c == 0) {
                                                c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (M18008j2 != 0) {
                                                c9508c.m37029b(M18008j2);
                                                M18008j2 = 0;
                                            }
                                            c9508c.m37029b(cVarM18050H2);
                                        }
                                    }
                                    cVarM18050H2 = cVarM18050H2.m17453d2();
                                    M18008j2 = M18008j2;
                                    c9508c = c9508c;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M18008j2 = AbstractC4557k.m18008j(c9508c);
                        }
                    }
                    if ((cVarM17597k.m17452c2() & iM17812a) == 0) {
                        break;
                    }
                    cVarM17597k = cVarM17597k.m17453d2();
                    M18008j = M18008j;
                }
                r62 = M18008j;
            }
        } else {
            C4531d1 c4531d1M17965v02 = c4554j0.m17965v0();
            int iM17812a2 = AbstractC4547h1.m17812a(8);
            if ((c4531d1M17965v02.m17595i() & iM17812a2) != 0) {
                loop3: for (InterfaceC4507m.c cVarM17597k2 = c4531d1M17965v02.m17597k(); cVarM17597k2 != null; cVarM17597k2 = cVarM17597k2.m17453d2()) {
                    if ((cVarM17597k2.m17457h2() & iM17812a2) != 0) {
                        M18008j = cVarM17597k2;
                        ?? c9508c2 = 0;
                        while (M18008j != 0) {
                            if (M18008j instanceof InterfaceC4524b2) {
                                if (((InterfaceC4524b2) M18008j).mo17543P()) {
                                    r62 = M18008j;
                                }
                            } else if ((M18008j.m17457h2() & iM17812a2) != 0 && (M18008j instanceof AbstractC4565m)) {
                                InterfaceC4507m.c cVarM18050H22 = ((AbstractC4565m) M18008j).m18050H2();
                                int i11 = 0;
                                M18008j = M18008j;
                                c9508c2 = c9508c2;
                                while (cVarM18050H22 != null) {
                                    if ((cVarM18050H22.m17457h2() & iM17812a2) != 0) {
                                        i11++;
                                        c9508c2 = c9508c2;
                                        if (i11 == 1) {
                                            M18008j = cVarM18050H22;
                                        } else {
                                            if (c9508c2 == 0) {
                                                c9508c2 = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (M18008j != 0) {
                                                c9508c2.m37029b(M18008j);
                                                M18008j = 0;
                                            }
                                            c9508c2.m37029b(cVarM18050H22);
                                        }
                                    }
                                    cVarM18050H22 = cVarM18050H22.m17453d2();
                                    M18008j = M18008j;
                                    c9508c2 = c9508c2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            M18008j = AbstractC4557k.m18008j(c9508c2);
                        }
                    }
                    if ((cVarM17597k2.m17452c2() & iM17812a2) == 0) {
                        break;
                    }
                }
            }
        }
        return (InterfaceC4524b2) r62;
    }

    /* JADX INFO: renamed from: j */
    public final C6457g m31284j() {
        InterfaceC3578w interfaceC3578wMo17733n;
        AbstractC4539f1 abstractC4539f1M31281f = m31281f();
        if (abstractC4539f1M31281f != null) {
            if (!abstractC4539f1M31281f.mo13245d()) {
                abstractC4539f1M31281f = null;
            }
            if (abstractC4539f1M31281f != null && (interfaceC3578wMo17733n = abstractC4539f1M31281f.mo17733n()) != null) {
                return m31276a(interfaceC3578wMo17733n);
            }
        }
        return C6457g.f20319e.m25594a();
    }

    /* JADX INFO: renamed from: k */
    public final C6457g m31285k() {
        C6457g c6457gM13411b;
        AbstractC4539f1 abstractC4539f1M31281f = m31281f();
        if (abstractC4539f1M31281f != null) {
            if (!abstractC4539f1M31281f.mo13245d()) {
                abstractC4539f1M31281f = null;
            }
            if (abstractC4539f1M31281f != null && (c6457gM13411b = AbstractC3581x.m13411b(abstractC4539f1M31281f)) != null) {
                return c6457gM13411b;
            }
        }
        return C6457g.f20319e.m25594a();
    }

    /* JADX INFO: renamed from: l */
    public final C6457g m31286l() {
        C6457g c6457gM13414e;
        AbstractC4539f1 abstractC4539f1M31281f = m31281f();
        if (abstractC4539f1M31281f != null) {
            if (!abstractC4539f1M31281f.mo13245d()) {
                abstractC4539f1M31281f = null;
            }
            if (abstractC4539f1M31281f != null && (c6457gM13414e = AbstractC3581x.m13414e(abstractC4539f1M31281f, false, 1, null)) != null) {
                return c6457gM13414e;
            }
        }
        return C6457g.f20319e.m25594a();
    }

    /* JADX INFO: renamed from: m */
    public final List m31287m() {
        return m31270o(this, false, false, false, 7, null);
    }

    /* JADX INFO: renamed from: n */
    public final List m31288n(boolean z10, boolean z11, boolean z12) {
        if (!z10 && this.f27035d.m31257u()) {
            return AbstractC5114x.m20800o();
        }
        ArrayList arrayList = new ArrayList();
        return m31271A() ? m31269h(this, arrayList, null, 2, null) : m31275E(arrayList, z11, z12);
    }

    /* JADX INFO: renamed from: p */
    public final C8087p m31289p() {
        boolean zM31271A = m31271A();
        C8087p c8087p = this.f27035d;
        if (!zM31271A) {
            return c8087p;
        }
        C8087p c8087pM31251o = c8087p.m31251o();
        m31274D(new ArrayList(), c8087pM31251o);
        return c8087pM31251o;
    }

    /* JADX INFO: renamed from: q */
    public final int m31290q() {
        return this.f27038g;
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC3512d0 m31291r() {
        return this.f27034c;
    }

    /* JADX INFO: renamed from: s */
    public final C4554j0 m31292s() {
        return this.f27034c;
    }

    /* JADX INFO: renamed from: t */
    public final C8094w m31293t() {
        C4554j0 c4554j0M17848B0;
        C8094w c8094w = this.f27037f;
        if (c8094w != null) {
            return c8094w;
        }
        if (this.f27033b) {
            c4554j0M17848B0 = this.f27034c.m17848B0();
            while (c4554j0M17848B0 != null) {
                C8087p c8087pMo17919c = c4554j0M17848B0.mo17919c();
                if (c8087pMo17919c != null && c8087pMo17919c.m31258v()) {
                    break;
                }
                c4554j0M17848B0 = c4554j0M17848B0.m17848B0();
            }
            c4554j0M17848B0 = null;
        } else {
            c4554j0M17848B0 = null;
        }
        if (c4554j0M17848B0 == null) {
            c4554j0M17848B0 = this.f27034c.m17848B0();
            while (true) {
                if (c4554j0M17848B0 == null) {
                    c4554j0M17848B0 = null;
                    break;
                }
                if (c4554j0M17848B0.m17965v0().m17602p(AbstractC4547h1.m17812a(8))) {
                    break;
                }
                c4554j0M17848B0 = c4554j0M17848B0.m17848B0();
            }
        }
        if (c4554j0M17848B0 == null) {
            return null;
        }
        return AbstractC8095x.m31302a(c4554j0M17848B0, this.f27033b);
    }

    /* JADX INFO: renamed from: u */
    public final long m31294u() {
        AbstractC4539f1 abstractC4539f1M31281f = m31281f();
        if (abstractC4539f1M31281f != null) {
            if (!abstractC4539f1M31281f.mo13245d()) {
                abstractC4539f1M31281f = null;
            }
            if (abstractC4539f1M31281f != null) {
                return AbstractC3581x.m13416g(abstractC4539f1M31281f);
            }
        }
        return C6455e.f20314b.m25569c();
    }

    /* JADX INFO: renamed from: v */
    public final List m31295v() {
        return m31270o(this, false, true, false, 4, null);
    }

    /* JADX INFO: renamed from: w */
    public final long m31296w() {
        AbstractC4539f1 abstractC4539f1M31281f = m31281f();
        return abstractC4539f1M31281f != null ? abstractC4539f1M31281f.mo13242a() : C3189s.f8481b.m12088a();
    }

    /* JADX INFO: renamed from: x */
    public final C6457g m31297x() {
        InterfaceC4524b2 interfaceC4524b2M31283i = m31283i();
        return interfaceC4524b2M31283i == null ? this.f27034c.m17907Y().m17702N3() : AbstractC4528c2.m17574c(interfaceC4524b2M31283i.mo17471z(), AbstractC4528c2.m17572a(this.f27035d));
    }

    /* JADX INFO: renamed from: y */
    public final C8087p m31298y() {
        return this.f27035d;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m31299z() {
        return this.f27036e;
    }
}
