package p143ja;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qa.AbstractC6344a;
import qa.AbstractC6345b;
import qa.AbstractC6348e;
import qa.AbstractC6353j;
import qa.AbstractC6354k;
import qa.C6349f;
import qa.C6350g;
import qa.C6351h;
import qa.C6355l;
import qa.InterfaceC6360q;
import qa.InterfaceC6361r;
import qa.InterfaceC6362s;

/* JADX INFO: renamed from: ja.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3783p extends AbstractC6353j implements InterfaceC6361r {

    /* JADX INFO: renamed from: v */
    public static final C3783p f10745v;

    /* JADX INFO: renamed from: w */
    public static InterfaceC6362s f10746w = new a();

    /* JADX INFO: renamed from: r */
    public final AbstractC6348e f10747r;

    /* JADX INFO: renamed from: s */
    public List f10748s;

    /* JADX INFO: renamed from: t */
    public byte f10749t;

    /* JADX INFO: renamed from: u */
    public int f10750u;

    /* JADX INFO: renamed from: ja.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3783p mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3783p(c6349f, c6351h);
        }
    }

    static {
        C3783p c3783p = new C3783p(true);
        f10745v = c3783p;
        c3783p.m14699x();
    }

    public C3783p(C6349f c6349f, C6351h c6351h) {
        this.f10749t = (byte) -1;
        this.f10750u = -1;
        m14699x();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 10) {
                            if (!z11) {
                                this.f10748s = new ArrayList();
                                z11 = true;
                            }
                            this.f10748s.add(c6349f.m25097t(c.f10754z, c6351h));
                        } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (z11) {
                        this.f10748s = Collections.unmodifiableList(this.f10748s);
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10747r = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10747r = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            } catch (C6355l e10) {
                throw e10.m25261i(this);
            } catch (IOException e11) {
                throw new C6355l(e11.getMessage()).m25261i(this);
            }
        }
        if (z11) {
            this.f10748s = Collections.unmodifiableList(this.f10748s);
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10747r = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10747r = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: u */
    public static C3783p m14698u() {
        return f10745v;
    }

    /* JADX INFO: renamed from: x */
    private void m14699x() {
        this.f10748s = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: y */
    public static b m14700y() {
        return b.m14708p();
    }

    /* JADX INFO: renamed from: z */
    public static b m14701z(C3783p c3783p) {
        return m14700y().mo14019j(c3783p);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14700y();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14701z(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10749t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < m14705w(); i10++) {
            if (!m14704v(i10).mo13991a()) {
                this.f10749t = (byte) 0;
                return false;
            }
        }
        this.f10749t = (byte) 1;
        return true;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        for (int i10 = 0; i10 < this.f10748s.size(); i10++) {
            c6350g.m25158c0(1, (InterfaceC6360q) this.f10748s.get(i10));
        }
        c6350g.m25163h0(this.f10747r);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10750u;
        if (i10 != -1) {
            return i10;
        }
        int iM25129r = 0;
        for (int i11 = 0; i11 < this.f10748s.size(); i11++) {
            iM25129r += C6350g.m25129r(1, (InterfaceC6360q) this.f10748s.get(i11));
        }
        int size = iM25129r + this.f10747r.size();
        this.f10750u = size;
        return size;
    }

    /* JADX INFO: renamed from: v */
    public c m14704v(int i10) {
        return (c) this.f10748s.get(i10);
    }

    /* JADX INFO: renamed from: w */
    public int m14705w() {
        return this.f10748s.size();
    }

    /* JADX INFO: renamed from: ja.p$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6353j implements InterfaceC6361r {

        /* JADX INFO: renamed from: y */
        public static final c f10753y;

        /* JADX INFO: renamed from: z */
        public static InterfaceC6362s f10754z = new a();

        /* JADX INFO: renamed from: r */
        public final AbstractC6348e f10755r;

        /* JADX INFO: renamed from: s */
        public int f10756s;

        /* JADX INFO: renamed from: t */
        public int f10757t;

        /* JADX INFO: renamed from: u */
        public int f10758u;

        /* JADX INFO: renamed from: v */
        public EnumC10125c f10759v;

        /* JADX INFO: renamed from: w */
        public byte f10760w;

        /* JADX INFO: renamed from: x */
        public int f10761x;

        /* JADX INFO: renamed from: ja.p$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a extends AbstractC6345b {
            @Override // qa.InterfaceC6362s
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c mo13999c(C6349f c6349f, C6351h c6351h) {
                return new c(c6349f, c6351h);
            }
        }

        /* JADX INFO: renamed from: ja.p$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum EnumC10125c implements AbstractC6354k.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* JADX INFO: renamed from: u */
            public static AbstractC6354k.b f10769u = new a();

            /* JADX INFO: renamed from: q */
            public final int f10771q;

            /* JADX INFO: renamed from: ja.p$c$c$a */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static class a implements AbstractC6354k.b {
                @Override // qa.AbstractC6354k.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC10125c mo14093a(int i10) {
                    return EnumC10125c.m14745a(i10);
                }
            }

            EnumC10125c(int i10, int i11) {
                this.f10771q = i11;
            }

            /* JADX INFO: renamed from: a */
            public static EnumC10125c m14745a(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // qa.AbstractC6354k.a
            /* JADX INFO: renamed from: b */
            public final int mo14092b() {
                return this.f10771q;
            }
        }

        static {
            c cVar = new c(true);
            f10753y = cVar;
            cVar.m14716D();
        }

        public c(C6349f c6349f, C6351h c6351h) {
            this.f10760w = (byte) -1;
            this.f10761x = -1;
            m14716D();
            AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
            C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iM25071J = c6349f.m25071J();
                            if (iM25071J != 0) {
                                if (iM25071J == 8) {
                                    this.f10756s |= 1;
                                    this.f10757t = c6349f.m25095r();
                                } else if (iM25071J == 16) {
                                    this.f10756s |= 2;
                                    this.f10758u = c6349f.m25095r();
                                } else if (iM25071J == 24) {
                                    int iM25090m = c6349f.m25090m();
                                    EnumC10125c enumC10125cM14745a = EnumC10125c.m14745a(iM25090m);
                                    if (enumC10125cM14745a == null) {
                                        c6350gM25111I.m25169n0(iM25071J);
                                        c6350gM25111I.m25169n0(iM25090m);
                                    } else {
                                        this.f10756s |= 4;
                                        this.f10759v = enumC10125cM14745a;
                                    }
                                } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new C6355l(e10.getMessage()).m25261i(this);
                        }
                    } catch (C6355l e11) {
                        throw e11.m25261i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10755r = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10755r = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            }
            try {
                c6350gM25111I.m25138H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f10755r = bVarM25040t.m25058h();
                throw th3;
            }
            this.f10755r = bVarM25040t.m25058h();
            mo25223m();
        }

        /* JADX INFO: renamed from: D */
        private void m14716D() {
            this.f10757t = -1;
            this.f10758u = 0;
            this.f10759v = EnumC10125c.PACKAGE;
        }

        /* JADX INFO: renamed from: E */
        public static b m14717E() {
            return b.m14735p();
        }

        /* JADX INFO: renamed from: F */
        public static b m14718F(c cVar) {
            return m14717E().mo14019j(cVar);
        }

        /* JADX INFO: renamed from: w */
        public static c m14724w() {
            return f10753y;
        }

        /* JADX INFO: renamed from: A */
        public boolean m14725A() {
            return (this.f10756s & 4) == 4;
        }

        /* JADX INFO: renamed from: B */
        public boolean m14726B() {
            return (this.f10756s & 1) == 1;
        }

        /* JADX INFO: renamed from: C */
        public boolean m14727C() {
            return (this.f10756s & 2) == 2;
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b mo13995g() {
            return m14717E();
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b mo13992c() {
            return m14718F(this);
        }

        @Override // qa.InterfaceC6361r
        /* JADX INFO: renamed from: a */
        public final boolean mo13991a() {
            byte b10 = this.f10760w;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (m14727C()) {
                this.f10760w = (byte) 1;
                return true;
            }
            this.f10760w = (byte) 0;
            return false;
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: d */
        public void mo13993d(C6350g c6350g) throws IOException {
            mo13994f();
            if ((this.f10756s & 1) == 1) {
                c6350g.m25155Z(1, this.f10757t);
            }
            if ((this.f10756s & 2) == 2) {
                c6350g.m25155Z(2, this.f10758u);
            }
            if ((this.f10756s & 4) == 4) {
                c6350g.m25147R(3, this.f10759v.mo14092b());
            }
            c6350g.m25163h0(this.f10755r);
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: f */
        public int mo13994f() {
            int i10 = this.f10761x;
            if (i10 != -1) {
                return i10;
            }
            int iM25126o = (this.f10756s & 1) == 1 ? C6350g.m25126o(1, this.f10757t) : 0;
            if ((this.f10756s & 2) == 2) {
                iM25126o += C6350g.m25126o(2, this.f10758u);
            }
            if ((this.f10756s & 4) == 4) {
                iM25126o += C6350g.m25119h(3, this.f10759v.mo14092b());
            }
            int size = iM25126o + this.f10755r.size();
            this.f10761x = size;
            return size;
        }

        /* JADX INFO: renamed from: x */
        public EnumC10125c m14730x() {
            return this.f10759v;
        }

        /* JADX INFO: renamed from: y */
        public int m14731y() {
            return this.f10757t;
        }

        /* JADX INFO: renamed from: z */
        public int m14732z() {
            return this.f10758u;
        }

        /* JADX INFO: renamed from: ja.p$c$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends AbstractC6353j.b implements InterfaceC6361r {

            /* JADX INFO: renamed from: r */
            public int f10762r;

            /* JADX INFO: renamed from: t */
            public int f10764t;

            /* JADX INFO: renamed from: s */
            public int f10763s = -1;

            /* JADX INFO: renamed from: u */
            public EnumC10125c f10765u = EnumC10125c.PACKAGE;

            public b() {
                m14736q();
            }

            /* JADX INFO: renamed from: p */
            public static b m14735p() {
                return new b();
            }

            @Override // qa.InterfaceC6360q.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarM14738n = m14738n();
                if (cVarM14738n.mo13991a()) {
                    return cVarM14738n;
                }
                throw AbstractC6344a.a.m25020h(cVarM14738n);
            }

            /* JADX INFO: renamed from: n */
            public c m14738n() {
                c cVar = new c(this);
                int i10 = this.f10762r;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f10757t = this.f10763s;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f10758u = this.f10764t;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                cVar.f10759v = this.f10765u;
                cVar.f10756s = i11;
                return cVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return m14735p().mo14019j(m14738n());
            }

            @Override // qa.AbstractC6353j.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo14019j(c cVar) {
                if (cVar == c.m14724w()) {
                    return this;
                }
                if (cVar.m14726B()) {
                    m14743u(cVar.m14731y());
                }
                if (cVar.m14727C()) {
                    m14744v(cVar.m14732z());
                }
                if (cVar.m14725A()) {
                    m14742t(cVar.m14730x());
                }
                m25226k(m25225i().m25043c(cVar.f10755r));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // qa.InterfaceC6360q.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public p143ja.C3783p.c.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    qa.s r1 = p143ja.C3783p.c.f10754z     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                    java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                    ja.p$c r3 = (p143ja.C3783p.c) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                    if (r3 == 0) goto Le
                    r2.mo14019j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    qa.q r4 = r3.m25260a()     // Catch: java.lang.Throwable -> Lf
                    ja.p$c r4 = (p143ja.C3783p.c) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.mo14019j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: p143ja.C3783p.c.b.mo14018e(qa.f, qa.h):ja.p$c$b");
            }

            /* JADX INFO: renamed from: t */
            public b m14742t(EnumC10125c enumC10125c) {
                enumC10125c.getClass();
                this.f10762r |= 4;
                this.f10765u = enumC10125c;
                return this;
            }

            /* JADX INFO: renamed from: u */
            public b m14743u(int i10) {
                this.f10762r |= 1;
                this.f10763s = i10;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public b m14744v(int i10) {
                this.f10762r |= 2;
                this.f10764t = i10;
                return this;
            }

            /* JADX INFO: renamed from: q */
            private void m14736q() {
            }
        }

        public c(AbstractC6353j.b bVar) {
            super(bVar);
            this.f10760w = (byte) -1;
            this.f10761x = -1;
            this.f10755r = bVar.m25225i();
        }

        public c(boolean z10) {
            this.f10760w = (byte) -1;
            this.f10761x = -1;
            this.f10755r = AbstractC6348e.f19966q;
        }
    }

    /* JADX INFO: renamed from: ja.p$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.b implements InterfaceC6361r {

        /* JADX INFO: renamed from: r */
        public int f10751r;

        /* JADX INFO: renamed from: s */
        public List f10752s = Collections.EMPTY_LIST;

        public b() {
            m14709r();
        }

        /* JADX INFO: renamed from: p */
        public static b m14708p() {
            return new b();
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3783p build() {
            C3783p c3783pM14711n = m14711n();
            if (c3783pM14711n.mo13991a()) {
                return c3783pM14711n;
            }
            throw AbstractC6344a.a.m25020h(c3783pM14711n);
        }

        /* JADX INFO: renamed from: n */
        public C3783p m14711n() {
            C3783p c3783p = new C3783p(this);
            if ((this.f10751r & 1) == 1) {
                this.f10752s = Collections.unmodifiableList(this.f10752s);
                this.f10751r &= -2;
            }
            c3783p.f10748s = this.f10752s;
            return c3783p;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14708p().mo14019j(m14711n());
        }

        /* JADX INFO: renamed from: q */
        public final void m14713q() {
            if ((this.f10751r & 1) != 1) {
                this.f10752s = new ArrayList(this.f10752s);
                this.f10751r |= 1;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3783p c3783p) {
            if (c3783p == C3783p.m14698u()) {
                return this;
            }
            if (!c3783p.f10748s.isEmpty()) {
                if (this.f10752s.isEmpty()) {
                    this.f10752s = c3783p.f10748s;
                    this.f10751r &= -2;
                } else {
                    m14713q();
                    this.f10752s.addAll(c3783p.f10748s);
                }
            }
            m25226k(m25225i().m25043c(c3783p.f10747r));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3783p.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3783p.f10746w     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.p r3 = (p143ja.C3783p) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                if (r3 == 0) goto Le
                r2.mo14019j(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                qa.q r4 = r3.m25260a()     // Catch: java.lang.Throwable -> Lf
                ja.p r4 = (p143ja.C3783p) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.mo14019j(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3783p.b.mo14018e(qa.f, qa.h):ja.p$b");
        }

        /* JADX INFO: renamed from: r */
        private void m14709r() {
        }
    }

    public C3783p(AbstractC6353j.b bVar) {
        super(bVar);
        this.f10749t = (byte) -1;
        this.f10750u = -1;
        this.f10747r = bVar.m25225i();
    }

    public C3783p(boolean z10) {
        this.f10749t = (byte) -1;
        this.f10750u = -1;
        this.f10747r = AbstractC6348e.f19966q;
    }
}
