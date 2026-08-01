package p143ja;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p143ja.C3785r;
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

/* JADX INFO: renamed from: ja.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3776i extends AbstractC6353j implements InterfaceC6361r {

    /* JADX INFO: renamed from: C */
    public static final C3776i f10596C;

    /* JADX INFO: renamed from: D */
    public static InterfaceC6362s f10597D = new a();

    /* JADX INFO: renamed from: A */
    public byte f10598A;

    /* JADX INFO: renamed from: B */
    public int f10599B;

    /* JADX INFO: renamed from: r */
    public final AbstractC6348e f10600r;

    /* JADX INFO: renamed from: s */
    public int f10601s;

    /* JADX INFO: renamed from: t */
    public int f10602t;

    /* JADX INFO: renamed from: u */
    public int f10603u;

    /* JADX INFO: renamed from: v */
    public c f10604v;

    /* JADX INFO: renamed from: w */
    public C3785r f10605w;

    /* JADX INFO: renamed from: x */
    public int f10606x;

    /* JADX INFO: renamed from: y */
    public List f10607y;

    /* JADX INFO: renamed from: z */
    public List f10608z;

    /* JADX INFO: renamed from: ja.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3776i mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3776i(c6349f, c6351h);
        }
    }

    /* JADX INFO: renamed from: ja.i$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum c implements AbstractC6354k.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* JADX INFO: renamed from: u */
        public static AbstractC6354k.b f10620u = new a();

        /* JADX INFO: renamed from: q */
        public final int f10622q;

        /* JADX INFO: renamed from: ja.i$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements AbstractC6354k.b {
            @Override // qa.AbstractC6354k.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo14093a(int i10) {
                return c.m14438a(i10);
            }
        }

        c(int i10, int i11) {
            this.f10622q = i11;
        }

        /* JADX INFO: renamed from: a */
        public static c m14438a(int i10) {
            if (i10 == 0) {
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // qa.AbstractC6354k.a
        /* JADX INFO: renamed from: b */
        public final int mo14092b() {
            return this.f10622q;
        }
    }

    static {
        C3776i c3776i = new C3776i(true);
        f10596C = c3776i;
        c3776i.m14394R();
    }

    public C3776i(C6349f c6349f, C6351h c6351h) {
        this.f10598A = (byte) -1;
        this.f10599B = -1;
        m14394R();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 8) {
                            this.f10601s |= 1;
                            this.f10602t = c6349f.m25095r();
                        } else if (iM25071J == 16) {
                            this.f10601s |= 2;
                            this.f10603u = c6349f.m25095r();
                        } else if (iM25071J == 24) {
                            int iM25090m = c6349f.m25090m();
                            c cVarM14438a = c.m14438a(iM25090m);
                            if (cVarM14438a == null) {
                                c6350gM25111I.m25169n0(iM25071J);
                                c6350gM25111I.m25169n0(iM25090m);
                            } else {
                                this.f10601s |= 4;
                                this.f10604v = cVarM14438a;
                            }
                        } else if (iM25071J == 34) {
                            C3785r.c cVarMo13992c = (this.f10601s & 8) == 8 ? this.f10605w.mo13992c() : null;
                            C3785r c3785r = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                            this.f10605w = c3785r;
                            if (cVarMo13992c != null) {
                                cVarMo13992c.mo14019j(c3785r);
                                this.f10605w = cVarMo13992c.m14869r();
                            }
                            this.f10601s |= 8;
                        } else if (iM25071J == 40) {
                            this.f10601s |= 16;
                            this.f10606x = c6349f.m25095r();
                        } else if (iM25071J == 50) {
                            if ((i10 & 32) != 32) {
                                this.f10607y = new ArrayList();
                                i10 |= 32;
                            }
                            this.f10607y.add(c6349f.m25097t(f10597D, c6351h));
                        } else if (iM25071J == 58) {
                            if ((i10 & 64) != 64) {
                                this.f10608z = new ArrayList();
                                i10 |= 64;
                            }
                            this.f10608z.add(c6349f.m25097t(f10597D, c6351h));
                        } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((i10 & 32) == 32) {
                        this.f10607y = Collections.unmodifiableList(this.f10607y);
                    }
                    if ((i10 & 64) == 64) {
                        this.f10608z = Collections.unmodifiableList(this.f10608z);
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10600r = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10600r = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            } catch (C6355l e10) {
                throw e10.m25261i(this);
            } catch (IOException e11) {
                throw new C6355l(e11.getMessage()).m25261i(this);
            }
        }
        if ((i10 & 32) == 32) {
            this.f10607y = Collections.unmodifiableList(this.f10607y);
        }
        if ((i10 & 64) == 64) {
            this.f10608z = Collections.unmodifiableList(this.f10608z);
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10600r = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10600r = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: F */
    public static C3776i m14393F() {
        return f10596C;
    }

    /* JADX INFO: renamed from: R */
    private void m14394R() {
        this.f10602t = 0;
        this.f10603u = 0;
        this.f10604v = c.TRUE;
        this.f10605w = C3785r.m14785X();
        this.f10606x = 0;
        List list = Collections.EMPTY_LIST;
        this.f10607y = list;
        this.f10608z = list;
    }

    /* JADX INFO: renamed from: S */
    public static b m14395S() {
        return b.m14424p();
    }

    /* JADX INFO: renamed from: T */
    public static b m14396T(C3776i c3776i) {
        return m14395S().mo14019j(c3776i);
    }

    /* JADX INFO: renamed from: C */
    public C3776i m14406C(int i10) {
        return (C3776i) this.f10607y.get(i10);
    }

    /* JADX INFO: renamed from: D */
    public int m14407D() {
        return this.f10607y.size();
    }

    /* JADX INFO: renamed from: E */
    public c m14408E() {
        return this.f10604v;
    }

    /* JADX INFO: renamed from: G */
    public int m14409G() {
        return this.f10602t;
    }

    /* JADX INFO: renamed from: H */
    public C3785r m14410H() {
        return this.f10605w;
    }

    /* JADX INFO: renamed from: I */
    public int m14411I() {
        return this.f10606x;
    }

    /* JADX INFO: renamed from: J */
    public C3776i m14412J(int i10) {
        return (C3776i) this.f10608z.get(i10);
    }

    /* JADX INFO: renamed from: K */
    public int m14413K() {
        return this.f10608z.size();
    }

    /* JADX INFO: renamed from: L */
    public int m14414L() {
        return this.f10603u;
    }

    /* JADX INFO: renamed from: M */
    public boolean m14415M() {
        return (this.f10601s & 4) == 4;
    }

    /* JADX INFO: renamed from: N */
    public boolean m14416N() {
        return (this.f10601s & 1) == 1;
    }

    /* JADX INFO: renamed from: O */
    public boolean m14417O() {
        return (this.f10601s & 8) == 8;
    }

    /* JADX INFO: renamed from: P */
    public boolean m14418P() {
        return (this.f10601s & 16) == 16;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m14419Q() {
        return (this.f10601s & 2) == 2;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14395S();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14396T(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10598A;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (m14417O() && !m14410H().mo13991a()) {
            this.f10598A = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m14407D(); i10++) {
            if (!m14406C(i10).mo13991a()) {
                this.f10598A = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < m14413K(); i11++) {
            if (!m14412J(i11).mo13991a()) {
                this.f10598A = (byte) 0;
                return false;
            }
        }
        this.f10598A = (byte) 1;
        return true;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        if ((this.f10601s & 1) == 1) {
            c6350g.m25155Z(1, this.f10602t);
        }
        if ((this.f10601s & 2) == 2) {
            c6350g.m25155Z(2, this.f10603u);
        }
        if ((this.f10601s & 4) == 4) {
            c6350g.m25147R(3, this.f10604v.mo14092b());
        }
        if ((this.f10601s & 8) == 8) {
            c6350g.m25158c0(4, this.f10605w);
        }
        if ((this.f10601s & 16) == 16) {
            c6350g.m25155Z(5, this.f10606x);
        }
        for (int i10 = 0; i10 < this.f10607y.size(); i10++) {
            c6350g.m25158c0(6, (InterfaceC6360q) this.f10607y.get(i10));
        }
        for (int i11 = 0; i11 < this.f10608z.size(); i11++) {
            c6350g.m25158c0(7, (InterfaceC6360q) this.f10608z.get(i11));
        }
        c6350g.m25163h0(this.f10600r);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10599B;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10601s & 1) == 1 ? C6350g.m25126o(1, this.f10602t) : 0;
        if ((this.f10601s & 2) == 2) {
            iM25126o += C6350g.m25126o(2, this.f10603u);
        }
        if ((this.f10601s & 4) == 4) {
            iM25126o += C6350g.m25119h(3, this.f10604v.mo14092b());
        }
        if ((this.f10601s & 8) == 8) {
            iM25126o += C6350g.m25129r(4, this.f10605w);
        }
        if ((this.f10601s & 16) == 16) {
            iM25126o += C6350g.m25126o(5, this.f10606x);
        }
        for (int i11 = 0; i11 < this.f10607y.size(); i11++) {
            iM25126o += C6350g.m25129r(6, (InterfaceC6360q) this.f10607y.get(i11));
        }
        for (int i12 = 0; i12 < this.f10608z.size(); i12++) {
            iM25126o += C6350g.m25129r(7, (InterfaceC6360q) this.f10608z.get(i12));
        }
        int size = iM25126o + this.f10600r.size();
        this.f10599B = size;
        return size;
    }

    /* JADX INFO: renamed from: ja.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.b implements InterfaceC6361r {

        /* JADX INFO: renamed from: r */
        public int f10609r;

        /* JADX INFO: renamed from: s */
        public int f10610s;

        /* JADX INFO: renamed from: t */
        public int f10611t;

        /* JADX INFO: renamed from: u */
        public c f10612u = c.TRUE;

        /* JADX INFO: renamed from: v */
        public C3785r f10613v = C3785r.m14785X();

        /* JADX INFO: renamed from: w */
        public int f10614w;

        /* JADX INFO: renamed from: x */
        public List f10615x;

        /* JADX INFO: renamed from: y */
        public List f10616y;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f10615x = list;
            this.f10616y = list;
            m14425s();
        }

        /* JADX INFO: renamed from: p */
        public static b m14424p() {
            return new b();
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3776i build() {
            C3776i c3776iM14427n = m14427n();
            if (c3776iM14427n.mo13991a()) {
                return c3776iM14427n;
            }
            throw AbstractC6344a.a.m25020h(c3776iM14427n);
        }

        /* JADX INFO: renamed from: n */
        public C3776i m14427n() {
            C3776i c3776i = new C3776i(this);
            int i10 = this.f10609r;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3776i.f10602t = this.f10610s;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3776i.f10603u = this.f10611t;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3776i.f10604v = this.f10612u;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3776i.f10605w = this.f10613v;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3776i.f10606x = this.f10614w;
            if ((this.f10609r & 32) == 32) {
                this.f10615x = Collections.unmodifiableList(this.f10615x);
                this.f10609r &= -33;
            }
            c3776i.f10607y = this.f10615x;
            if ((this.f10609r & 64) == 64) {
                this.f10616y = Collections.unmodifiableList(this.f10616y);
                this.f10609r &= -65;
            }
            c3776i.f10608z = this.f10616y;
            c3776i.f10601s = i11;
            return c3776i;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14424p().mo14019j(m14427n());
        }

        /* JADX INFO: renamed from: q */
        public final void m14429q() {
            if ((this.f10609r & 32) != 32) {
                this.f10615x = new ArrayList(this.f10615x);
                this.f10609r |= 32;
            }
        }

        /* JADX INFO: renamed from: r */
        public final void m14430r() {
            if ((this.f10609r & 64) != 64) {
                this.f10616y = new ArrayList(this.f10616y);
                this.f10609r |= 64;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3776i c3776i) {
            if (c3776i == C3776i.m14393F()) {
                return this;
            }
            if (c3776i.m14416N()) {
                m14435x(c3776i.m14409G());
            }
            if (c3776i.m14419Q()) {
                m14437z(c3776i.m14414L());
            }
            if (c3776i.m14415M()) {
                m14434w(c3776i.m14408E());
            }
            if (c3776i.m14417O()) {
                m14433v(c3776i.m14410H());
            }
            if (c3776i.m14418P()) {
                m14436y(c3776i.m14411I());
            }
            if (!c3776i.f10607y.isEmpty()) {
                if (this.f10615x.isEmpty()) {
                    this.f10615x = c3776i.f10607y;
                    this.f10609r &= -33;
                } else {
                    m14429q();
                    this.f10615x.addAll(c3776i.f10607y);
                }
            }
            if (!c3776i.f10608z.isEmpty()) {
                if (this.f10616y.isEmpty()) {
                    this.f10616y = c3776i.f10608z;
                    this.f10609r &= -65;
                } else {
                    m14430r();
                    this.f10616y.addAll(c3776i.f10608z);
                }
            }
            m25226k(m25225i().m25043c(c3776i.f10600r));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3776i.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3776i.f10597D     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.i r3 = (p143ja.C3776i) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.i r4 = (p143ja.C3776i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3776i.b.mo14018e(qa.f, qa.h):ja.i$b");
        }

        /* JADX INFO: renamed from: v */
        public b m14433v(C3785r c3785r) {
            if ((this.f10609r & 8) != 8 || this.f10613v == C3785r.m14785X()) {
                this.f10613v = c3785r;
            } else {
                this.f10613v = C3785r.m14788y0(this.f10613v).mo14019j(c3785r).m14869r();
            }
            this.f10609r |= 8;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public b m14434w(c cVar) {
            cVar.getClass();
            this.f10609r |= 4;
            this.f10612u = cVar;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m14435x(int i10) {
            this.f10609r |= 1;
            this.f10610s = i10;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m14436y(int i10) {
            this.f10609r |= 16;
            this.f10614w = i10;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m14437z(int i10) {
            this.f10609r |= 2;
            this.f10611t = i10;
            return this;
        }

        /* JADX INFO: renamed from: s */
        private void m14425s() {
        }
    }

    public C3776i(AbstractC6353j.b bVar) {
        super(bVar);
        this.f10598A = (byte) -1;
        this.f10599B = -1;
        this.f10600r = bVar.m25225i();
    }

    public C3776i(boolean z10) {
        this.f10598A = (byte) -1;
        this.f10599B = -1;
        this.f10600r = AbstractC6348e.f19966q;
    }
}
