package p143ja;

import java.io.IOException;
import p143ja.C3785r;
import qa.AbstractC6344a;
import qa.AbstractC6345b;
import qa.AbstractC6348e;
import qa.AbstractC6353j;
import qa.C6349f;
import qa.C6350g;
import qa.C6351h;
import qa.C6355l;
import qa.InterfaceC6361r;
import qa.InterfaceC6362s;

/* JADX INFO: renamed from: ja.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3789v extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: C */
    public static final C3789v f10899C;

    /* JADX INFO: renamed from: D */
    public static InterfaceC6362s f10900D = new a();

    /* JADX INFO: renamed from: A */
    public byte f10901A;

    /* JADX INFO: renamed from: B */
    public int f10902B;

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10903s;

    /* JADX INFO: renamed from: t */
    public int f10904t;

    /* JADX INFO: renamed from: u */
    public int f10905u;

    /* JADX INFO: renamed from: v */
    public int f10906v;

    /* JADX INFO: renamed from: w */
    public C3785r f10907w;

    /* JADX INFO: renamed from: x */
    public int f10908x;

    /* JADX INFO: renamed from: y */
    public C3785r f10909y;

    /* JADX INFO: renamed from: z */
    public int f10910z;

    /* JADX INFO: renamed from: ja.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3789v mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3789v(c6349f, c6351h);
        }
    }

    static {
        C3789v c3789v = new C3789v(true);
        f10899C = c3789v;
        c3789v.m15021W();
    }

    public C3789v(C6349f c6349f, C6351h c6351h) {
        C3785r.c cVarMo13992c;
        this.f10901A = (byte) -1;
        this.f10902B = -1;
        m15021W();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 8) {
                            this.f10904t |= 1;
                            this.f10905u = c6349f.m25095r();
                        } else if (iM25071J != 16) {
                            if (iM25071J == 26) {
                                cVarMo13992c = (this.f10904t & 4) == 4 ? this.f10907w.mo13992c() : null;
                                C3785r c3785r = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                                this.f10907w = c3785r;
                                if (cVarMo13992c != null) {
                                    cVarMo13992c.mo14019j(c3785r);
                                    this.f10907w = cVarMo13992c.m14869r();
                                }
                                this.f10904t |= 4;
                            } else if (iM25071J == 34) {
                                cVarMo13992c = (this.f10904t & 16) == 16 ? this.f10909y.mo13992c() : null;
                                C3785r c3785r2 = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                                this.f10909y = c3785r2;
                                if (cVarMo13992c != null) {
                                    cVarMo13992c.mo14019j(c3785r2);
                                    this.f10909y = cVarMo13992c.m14869r();
                                }
                                this.f10904t |= 16;
                            } else if (iM25071J == 40) {
                                this.f10904t |= 8;
                                this.f10908x = c6349f.m25095r();
                            } else if (iM25071J == 48) {
                                this.f10904t |= 32;
                                this.f10910z = c6349f.m25095r();
                            } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                            }
                        } else {
                            this.f10904t |= 2;
                            this.f10906v = c6349f.m25095r();
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10903s = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10903s = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            } catch (C6355l e10) {
                throw e10.m25261i(this);
            } catch (IOException e11) {
                throw new C6355l(e11.getMessage()).m25261i(this);
            }
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10903s = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10903s = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: I */
    public static C3789v m15020I() {
        return f10899C;
    }

    /* JADX INFO: renamed from: W */
    private void m15021W() {
        this.f10905u = 0;
        this.f10906v = 0;
        this.f10907w = C3785r.m14785X();
        this.f10908x = 0;
        this.f10909y = C3785r.m14785X();
        this.f10910z = 0;
    }

    /* JADX INFO: renamed from: X */
    public static b m15022X() {
        return b.m15041t();
    }

    /* JADX INFO: renamed from: Y */
    public static b m15023Y(C3789v c3789v) {
        return m15022X().mo14019j(c3789v);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C3789v mo14181b() {
        return f10899C;
    }

    /* JADX INFO: renamed from: K */
    public int m15025K() {
        return this.f10905u;
    }

    /* JADX INFO: renamed from: L */
    public int m15026L() {
        return this.f10906v;
    }

    /* JADX INFO: renamed from: M */
    public C3785r m15027M() {
        return this.f10907w;
    }

    /* JADX INFO: renamed from: N */
    public int m15028N() {
        return this.f10908x;
    }

    /* JADX INFO: renamed from: O */
    public C3785r m15029O() {
        return this.f10909y;
    }

    /* JADX INFO: renamed from: P */
    public int m15030P() {
        return this.f10910z;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m15031Q() {
        return (this.f10904t & 1) == 1;
    }

    /* JADX INFO: renamed from: R */
    public boolean m15032R() {
        return (this.f10904t & 2) == 2;
    }

    /* JADX INFO: renamed from: S */
    public boolean m15033S() {
        return (this.f10904t & 4) == 4;
    }

    /* JADX INFO: renamed from: T */
    public boolean m15034T() {
        return (this.f10904t & 8) == 8;
    }

    /* JADX INFO: renamed from: U */
    public boolean m15035U() {
        return (this.f10904t & 16) == 16;
    }

    /* JADX INFO: renamed from: V */
    public boolean m15036V() {
        return (this.f10904t & 32) == 32;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m15022X();
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10901A;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!m15032R()) {
            this.f10901A = (byte) 0;
            return false;
        }
        if (m15033S() && !m15027M().mo13991a()) {
            this.f10901A = (byte) 0;
            return false;
        }
        if (m15035U() && !m15029O().mo13991a()) {
            this.f10901A = (byte) 0;
            return false;
        }
        if (m25232s()) {
            this.f10901A = (byte) 1;
            return true;
        }
        this.f10901A = (byte) 0;
        return false;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m15023Y(this);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10904t & 1) == 1) {
            c6350g.m25155Z(1, this.f10905u);
        }
        if ((this.f10904t & 2) == 2) {
            c6350g.m25155Z(2, this.f10906v);
        }
        if ((this.f10904t & 4) == 4) {
            c6350g.m25158c0(3, this.f10907w);
        }
        if ((this.f10904t & 16) == 16) {
            c6350g.m25158c0(4, this.f10909y);
        }
        if ((this.f10904t & 8) == 8) {
            c6350g.m25155Z(5, this.f10908x);
        }
        if ((this.f10904t & 32) == 32) {
            c6350g.m25155Z(6, this.f10910z);
        }
        aVarM25238y.m25240a(200, c6350g);
        c6350g.m25163h0(this.f10903s);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10902B;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10904t & 1) == 1 ? C6350g.m25126o(1, this.f10905u) : 0;
        if ((this.f10904t & 2) == 2) {
            iM25126o += C6350g.m25126o(2, this.f10906v);
        }
        if ((this.f10904t & 4) == 4) {
            iM25126o += C6350g.m25129r(3, this.f10907w);
        }
        if ((this.f10904t & 16) == 16) {
            iM25126o += C6350g.m25129r(4, this.f10909y);
        }
        if ((this.f10904t & 8) == 8) {
            iM25126o += C6350g.m25126o(5, this.f10908x);
        }
        if ((this.f10904t & 32) == 32) {
            iM25126o += C6350g.m25126o(6, this.f10910z);
        }
        int iM25233t = iM25126o + m25233t() + this.f10903s.size();
        this.f10902B = iM25233t;
        return iM25233t;
    }

    /* JADX INFO: renamed from: ja.v$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: t */
        public int f10911t;

        /* JADX INFO: renamed from: u */
        public int f10912u;

        /* JADX INFO: renamed from: v */
        public int f10913v;

        /* JADX INFO: renamed from: x */
        public int f10915x;

        /* JADX INFO: renamed from: z */
        public int f10917z;

        /* JADX INFO: renamed from: w */
        public C3785r f10914w = C3785r.m14785X();

        /* JADX INFO: renamed from: y */
        public C3785r f10916y = C3785r.m14785X();

        public b() {
            m15042u();
        }

        /* JADX INFO: renamed from: t */
        public static b m15041t() {
            return new b();
        }

        /* JADX INFO: renamed from: A */
        public b m15043A(int i10) {
            this.f10911t |= 2;
            this.f10913v = i10;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m15044B(int i10) {
            this.f10911t |= 8;
            this.f10915x = i10;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public b m15045C(int i10) {
            this.f10911t |= 32;
            this.f10917z = i10;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3789v build() {
            C3789v c3789vM15047r = m15047r();
            if (c3789vM15047r.mo13991a()) {
                return c3789vM15047r;
            }
            throw AbstractC6344a.a.m25020h(c3789vM15047r);
        }

        /* JADX INFO: renamed from: r */
        public C3789v m15047r() {
            C3789v c3789v = new C3789v(this);
            int i10 = this.f10911t;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3789v.f10905u = this.f10912u;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3789v.f10906v = this.f10913v;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3789v.f10907w = this.f10914w;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3789v.f10908x = this.f10915x;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3789v.f10909y = this.f10916y;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            c3789v.f10910z = this.f10917z;
            c3789v.f10904t = i11;
            return c3789v;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m15041t().mo14019j(m15047r());
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3789v c3789v) {
            if (c3789v == C3789v.m15020I()) {
                return this;
            }
            if (c3789v.m15031Q()) {
                m15053z(c3789v.m15025K());
            }
            if (c3789v.m15032R()) {
                m15043A(c3789v.m15026L());
            }
            if (c3789v.m15033S()) {
                m15051x(c3789v.m15027M());
            }
            if (c3789v.m15034T()) {
                m15044B(c3789v.m15028N());
            }
            if (c3789v.m15035U()) {
                m15052y(c3789v.m15029O());
            }
            if (c3789v.m15036V()) {
                m15045C(c3789v.m15030P());
            }
            m25230o(c3789v);
            m25226k(m25225i().m25043c(c3789v.f10903s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3789v.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3789v.f10900D     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.v r3 = (p143ja.C3789v) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.v r4 = (p143ja.C3789v) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3789v.b.mo14018e(qa.f, qa.h):ja.v$b");
        }

        /* JADX INFO: renamed from: x */
        public b m15051x(C3785r c3785r) {
            if ((this.f10911t & 4) != 4 || this.f10914w == C3785r.m14785X()) {
                this.f10914w = c3785r;
            } else {
                this.f10914w = C3785r.m14788y0(this.f10914w).mo14019j(c3785r).m14869r();
            }
            this.f10911t |= 4;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m15052y(C3785r c3785r) {
            if ((this.f10911t & 16) != 16 || this.f10916y == C3785r.m14785X()) {
                this.f10916y = c3785r;
            } else {
                this.f10916y = C3785r.m14788y0(this.f10916y).mo14019j(c3785r).m14869r();
            }
            this.f10911t |= 16;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m15053z(int i10) {
            this.f10911t |= 1;
            this.f10912u = i10;
            return this;
        }

        /* JADX INFO: renamed from: u */
        private void m15042u() {
        }
    }

    public C3789v(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10901A = (byte) -1;
        this.f10902B = -1;
        this.f10903s = cVar.m25225i();
    }

    public C3789v(boolean z10) {
        this.f10901A = (byte) -1;
        this.f10902B = -1;
        this.f10903s = AbstractC6348e.f19966q;
    }
}
