package p143ja;

import java.io.IOException;
import qa.AbstractC6344a;
import qa.AbstractC6345b;
import qa.AbstractC6348e;
import qa.AbstractC6353j;
import qa.AbstractC6354k;
import qa.C6349f;
import qa.C6350g;
import qa.C6351h;
import qa.C6355l;
import qa.InterfaceC6361r;
import qa.InterfaceC6362s;

/* JADX INFO: renamed from: ja.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3790w extends AbstractC6353j implements InterfaceC6361r {

    /* JADX INFO: renamed from: B */
    public static final C3790w f10918B;

    /* JADX INFO: renamed from: C */
    public static InterfaceC6362s f10919C = new a();

    /* JADX INFO: renamed from: A */
    public int f10920A;

    /* JADX INFO: renamed from: r */
    public final AbstractC6348e f10921r;

    /* JADX INFO: renamed from: s */
    public int f10922s;

    /* JADX INFO: renamed from: t */
    public int f10923t;

    /* JADX INFO: renamed from: u */
    public int f10924u;

    /* JADX INFO: renamed from: v */
    public c f10925v;

    /* JADX INFO: renamed from: w */
    public int f10926w;

    /* JADX INFO: renamed from: x */
    public int f10927x;

    /* JADX INFO: renamed from: y */
    public d f10928y;

    /* JADX INFO: renamed from: z */
    public byte f10929z;

    /* JADX INFO: renamed from: ja.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3790w mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3790w(c6349f, c6351h);
        }
    }

    /* JADX INFO: renamed from: ja.w$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum c implements AbstractC6354k.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* JADX INFO: renamed from: u */
        public static AbstractC6354k.b f10940u = new a();

        /* JADX INFO: renamed from: q */
        public final int f10942q;

        /* JADX INFO: renamed from: ja.w$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements AbstractC6354k.b {
            @Override // qa.AbstractC6354k.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo14093a(int i10) {
                return c.m15095a(i10);
            }
        }

        c(int i10, int i11) {
            this.f10942q = i11;
        }

        /* JADX INFO: renamed from: a */
        public static c m15095a(int i10) {
            if (i10 == 0) {
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // qa.AbstractC6354k.a
        /* JADX INFO: renamed from: b */
        public final int mo14092b() {
            return this.f10942q;
        }
    }

    /* JADX INFO: renamed from: ja.w$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum d implements AbstractC6354k.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* JADX INFO: renamed from: u */
        public static AbstractC6354k.b f10946u = new a();

        /* JADX INFO: renamed from: q */
        public final int f10948q;

        /* JADX INFO: renamed from: ja.w$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements AbstractC6354k.b {
            @Override // qa.AbstractC6354k.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d mo14093a(int i10) {
                return d.m15097a(i10);
            }
        }

        d(int i10, int i11) {
            this.f10948q = i11;
        }

        /* JADX INFO: renamed from: a */
        public static d m15097a(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // qa.AbstractC6354k.a
        /* JADX INFO: renamed from: b */
        public final int mo14092b() {
            return this.f10948q;
        }
    }

    static {
        C3790w c3790w = new C3790w(true);
        f10918B = c3790w;
        c3790w.m15054M();
    }

    public C3790w(C6349f c6349f, C6351h c6351h) {
        this.f10929z = (byte) -1;
        this.f10920A = -1;
        m15054M();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 8) {
                            this.f10922s |= 1;
                            this.f10923t = c6349f.m25095r();
                        } else if (iM25071J == 16) {
                            this.f10922s |= 2;
                            this.f10924u = c6349f.m25095r();
                        } else if (iM25071J == 24) {
                            int iM25090m = c6349f.m25090m();
                            c cVarM15095a = c.m15095a(iM25090m);
                            if (cVarM15095a == null) {
                                c6350gM25111I.m25169n0(iM25071J);
                                c6350gM25111I.m25169n0(iM25090m);
                            } else {
                                this.f10922s |= 4;
                                this.f10925v = cVarM15095a;
                            }
                        } else if (iM25071J == 32) {
                            this.f10922s |= 8;
                            this.f10926w = c6349f.m25095r();
                        } else if (iM25071J == 40) {
                            this.f10922s |= 16;
                            this.f10927x = c6349f.m25095r();
                        } else if (iM25071J == 48) {
                            int iM25090m2 = c6349f.m25090m();
                            d dVarM15097a = d.m15097a(iM25090m2);
                            if (dVarM15097a == null) {
                                c6350gM25111I.m25169n0(iM25071J);
                                c6350gM25111I.m25169n0(iM25090m2);
                            } else {
                                this.f10922s |= 32;
                                this.f10928y = dVarM15097a;
                            }
                        } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10921r = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10921r = bVarM25040t.m25058h();
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
            this.f10921r = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10921r = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: M */
    private void m15054M() {
        this.f10923t = 0;
        this.f10924u = 0;
        this.f10925v = c.ERROR;
        this.f10926w = 0;
        this.f10927x = 0;
        this.f10928y = d.LANGUAGE_VERSION;
    }

    /* JADX INFO: renamed from: N */
    public static b m15055N() {
        return b.m15082p();
    }

    /* JADX INFO: renamed from: O */
    public static b m15056O(C3790w c3790w) {
        return m15055N().mo14019j(c3790w);
    }

    /* JADX INFO: renamed from: z */
    public static C3790w m15065z() {
        return f10918B;
    }

    /* JADX INFO: renamed from: A */
    public int m15066A() {
        return this.f10926w;
    }

    /* JADX INFO: renamed from: B */
    public c m15067B() {
        return this.f10925v;
    }

    /* JADX INFO: renamed from: C */
    public int m15068C() {
        return this.f10927x;
    }

    /* JADX INFO: renamed from: D */
    public int m15069D() {
        return this.f10923t;
    }

    /* JADX INFO: renamed from: E */
    public int m15070E() {
        return this.f10924u;
    }

    /* JADX INFO: renamed from: F */
    public d m15071F() {
        return this.f10928y;
    }

    /* JADX INFO: renamed from: G */
    public boolean m15072G() {
        return (this.f10922s & 8) == 8;
    }

    /* JADX INFO: renamed from: H */
    public boolean m15073H() {
        return (this.f10922s & 4) == 4;
    }

    /* JADX INFO: renamed from: I */
    public boolean m15074I() {
        return (this.f10922s & 16) == 16;
    }

    /* JADX INFO: renamed from: J */
    public boolean m15075J() {
        return (this.f10922s & 1) == 1;
    }

    /* JADX INFO: renamed from: K */
    public boolean m15076K() {
        return (this.f10922s & 2) == 2;
    }

    /* JADX INFO: renamed from: L */
    public boolean m15077L() {
        return (this.f10922s & 32) == 32;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m15055N();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m15056O(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10929z;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f10929z = (byte) 1;
        return true;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        if ((this.f10922s & 1) == 1) {
            c6350g.m25155Z(1, this.f10923t);
        }
        if ((this.f10922s & 2) == 2) {
            c6350g.m25155Z(2, this.f10924u);
        }
        if ((this.f10922s & 4) == 4) {
            c6350g.m25147R(3, this.f10925v.mo14092b());
        }
        if ((this.f10922s & 8) == 8) {
            c6350g.m25155Z(4, this.f10926w);
        }
        if ((this.f10922s & 16) == 16) {
            c6350g.m25155Z(5, this.f10927x);
        }
        if ((this.f10922s & 32) == 32) {
            c6350g.m25147R(6, this.f10928y.mo14092b());
        }
        c6350g.m25163h0(this.f10921r);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10920A;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10922s & 1) == 1 ? C6350g.m25126o(1, this.f10923t) : 0;
        if ((this.f10922s & 2) == 2) {
            iM25126o += C6350g.m25126o(2, this.f10924u);
        }
        if ((this.f10922s & 4) == 4) {
            iM25126o += C6350g.m25119h(3, this.f10925v.mo14092b());
        }
        if ((this.f10922s & 8) == 8) {
            iM25126o += C6350g.m25126o(4, this.f10926w);
        }
        if ((this.f10922s & 16) == 16) {
            iM25126o += C6350g.m25126o(5, this.f10927x);
        }
        if ((this.f10922s & 32) == 32) {
            iM25126o += C6350g.m25119h(6, this.f10928y.mo14092b());
        }
        int size = iM25126o + this.f10921r.size();
        this.f10920A = size;
        return size;
    }

    /* JADX INFO: renamed from: ja.w$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.b implements InterfaceC6361r {

        /* JADX INFO: renamed from: r */
        public int f10930r;

        /* JADX INFO: renamed from: s */
        public int f10931s;

        /* JADX INFO: renamed from: t */
        public int f10932t;

        /* JADX INFO: renamed from: v */
        public int f10934v;

        /* JADX INFO: renamed from: w */
        public int f10935w;

        /* JADX INFO: renamed from: u */
        public c f10933u = c.ERROR;

        /* JADX INFO: renamed from: x */
        public d f10936x = d.LANGUAGE_VERSION;

        public b() {
            m15083q();
        }

        /* JADX INFO: renamed from: p */
        public static b m15082p() {
            return new b();
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3790w build() {
            C3790w c3790wM15085n = m15085n();
            if (c3790wM15085n.mo13991a()) {
                return c3790wM15085n;
            }
            throw AbstractC6344a.a.m25020h(c3790wM15085n);
        }

        /* JADX INFO: renamed from: n */
        public C3790w m15085n() {
            C3790w c3790w = new C3790w(this);
            int i10 = this.f10930r;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3790w.f10923t = this.f10931s;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3790w.f10924u = this.f10932t;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3790w.f10925v = this.f10933u;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3790w.f10926w = this.f10934v;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3790w.f10927x = this.f10935w;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            c3790w.f10928y = this.f10936x;
            c3790w.f10922s = i11;
            return c3790w;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m15082p().mo14019j(m15085n());
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3790w c3790w) {
            if (c3790w == C3790w.m15065z()) {
                return this;
            }
            if (c3790w.m15075J()) {
                m15092w(c3790w.m15069D());
            }
            if (c3790w.m15076K()) {
                m15093x(c3790w.m15070E());
            }
            if (c3790w.m15073H()) {
                m15090u(c3790w.m15067B());
            }
            if (c3790w.m15072G()) {
                m15089t(c3790w.m15066A());
            }
            if (c3790w.m15074I()) {
                m15091v(c3790w.m15068C());
            }
            if (c3790w.m15077L()) {
                m15094y(c3790w.m15071F());
            }
            m25226k(m25225i().m25043c(c3790w.f10921r));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3790w.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3790w.f10919C     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.w r3 = (p143ja.C3790w) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.w r4 = (p143ja.C3790w) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3790w.b.mo14018e(qa.f, qa.h):ja.w$b");
        }

        /* JADX INFO: renamed from: t */
        public b m15089t(int i10) {
            this.f10930r |= 8;
            this.f10934v = i10;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public b m15090u(c cVar) {
            cVar.getClass();
            this.f10930r |= 4;
            this.f10933u = cVar;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public b m15091v(int i10) {
            this.f10930r |= 16;
            this.f10935w = i10;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public b m15092w(int i10) {
            this.f10930r |= 1;
            this.f10931s = i10;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m15093x(int i10) {
            this.f10930r |= 2;
            this.f10932t = i10;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m15094y(d dVar) {
            dVar.getClass();
            this.f10930r |= 32;
            this.f10936x = dVar;
            return this;
        }

        /* JADX INFO: renamed from: q */
        private void m15083q() {
        }
    }

    public C3790w(AbstractC6353j.b bVar) {
        super(bVar);
        this.f10929z = (byte) -1;
        this.f10920A = -1;
        this.f10921r = bVar.m25225i();
    }

    public C3790w(boolean z10) {
        this.f10929z = (byte) -1;
        this.f10920A = -1;
        this.f10921r = AbstractC6348e.f19966q;
    }
}
