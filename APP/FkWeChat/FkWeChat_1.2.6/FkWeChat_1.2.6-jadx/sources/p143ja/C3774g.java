package p143ja;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p143ja.C3776i;
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

/* JADX INFO: renamed from: ja.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3774g extends AbstractC6353j implements InterfaceC6361r {

    /* JADX INFO: renamed from: A */
    public static InterfaceC6362s f10560A = new a();

    /* JADX INFO: renamed from: z */
    public static final C3774g f10561z;

    /* JADX INFO: renamed from: r */
    public final AbstractC6348e f10562r;

    /* JADX INFO: renamed from: s */
    public int f10563s;

    /* JADX INFO: renamed from: t */
    public c f10564t;

    /* JADX INFO: renamed from: u */
    public List f10565u;

    /* JADX INFO: renamed from: v */
    public C3776i f10566v;

    /* JADX INFO: renamed from: w */
    public d f10567w;

    /* JADX INFO: renamed from: x */
    public byte f10568x;

    /* JADX INFO: renamed from: y */
    public int f10569y;

    /* JADX INFO: renamed from: ja.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3774g mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3774g(c6349f, c6351h);
        }
    }

    /* JADX INFO: renamed from: ja.g$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum c implements AbstractC6354k.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* JADX INFO: renamed from: u */
        public static AbstractC6354k.b f10578u = new a();

        /* JADX INFO: renamed from: q */
        public final int f10580q;

        /* JADX INFO: renamed from: ja.g$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements AbstractC6354k.b {
            @Override // qa.AbstractC6354k.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo14093a(int i10) {
                return c.m14365a(i10);
            }
        }

        c(int i10, int i11) {
            this.f10580q = i11;
        }

        /* JADX INFO: renamed from: a */
        public static c m14365a(int i10) {
            if (i10 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // qa.AbstractC6354k.a
        /* JADX INFO: renamed from: b */
        public final int mo14092b() {
            return this.f10580q;
        }
    }

    /* JADX INFO: renamed from: ja.g$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum d implements AbstractC6354k.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* JADX INFO: renamed from: u */
        public static AbstractC6354k.b f10584u = new a();

        /* JADX INFO: renamed from: q */
        public final int f10586q;

        /* JADX INFO: renamed from: ja.g$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements AbstractC6354k.b {
            @Override // qa.AbstractC6354k.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d mo14093a(int i10) {
                return d.m14367a(i10);
            }
        }

        d(int i10, int i11) {
            this.f10586q = i11;
        }

        /* JADX INFO: renamed from: a */
        public static d m14367a(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // qa.AbstractC6354k.a
        /* JADX INFO: renamed from: b */
        public final int mo14092b() {
            return this.f10586q;
        }
    }

    static {
        C3774g c3774g = new C3774g(true);
        f10561z = c3774g;
        c3774g.m14331H();
    }

    public C3774g(C6349f c6349f, C6351h c6351h) {
        this.f10568x = (byte) -1;
        this.f10569y = -1;
        m14331H();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 8) {
                            int iM25090m = c6349f.m25090m();
                            c cVarM14365a = c.m14365a(iM25090m);
                            if (cVarM14365a == null) {
                                c6350gM25111I.m25169n0(iM25071J);
                                c6350gM25111I.m25169n0(iM25090m);
                            } else {
                                this.f10563s |= 1;
                                this.f10564t = cVarM14365a;
                            }
                        } else if (iM25071J == 18) {
                            if ((c10 & 2) != 2) {
                                this.f10565u = new ArrayList();
                                c10 = 2;
                            }
                            this.f10565u.add(c6349f.m25097t(C3776i.f10597D, c6351h));
                        } else if (iM25071J == 26) {
                            C3776i.b bVarMo13992c = (this.f10563s & 2) == 2 ? this.f10566v.mo13992c() : null;
                            C3776i c3776i = (C3776i) c6349f.m25097t(C3776i.f10597D, c6351h);
                            this.f10566v = c3776i;
                            if (bVarMo13992c != null) {
                                bVarMo13992c.mo14019j(c3776i);
                                this.f10566v = bVarMo13992c.m14427n();
                            }
                            this.f10563s |= 2;
                        } else if (iM25071J == 32) {
                            int iM25090m2 = c6349f.m25090m();
                            d dVarM14367a = d.m14367a(iM25090m2);
                            if (dVarM14367a == null) {
                                c6350gM25111I.m25169n0(iM25071J);
                                c6350gM25111I.m25169n0(iM25090m2);
                            } else {
                                this.f10563s |= 4;
                                this.f10567w = dVarM14367a;
                            }
                        } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((c10 & 2) == 2) {
                        this.f10565u = Collections.unmodifiableList(this.f10565u);
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10562r = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10562r = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            } catch (C6355l e10) {
                throw e10.m25261i(this);
            } catch (IOException e11) {
                throw new C6355l(e11.getMessage()).m25261i(this);
            }
        }
        if ((c10 & 2) == 2) {
            this.f10565u = Collections.unmodifiableList(this.f10565u);
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10562r = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10562r = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: H */
    private void m14331H() {
        this.f10564t = c.RETURNS_CONSTANT;
        this.f10565u = Collections.EMPTY_LIST;
        this.f10566v = C3776i.m14393F();
        this.f10567w = d.AT_MOST_ONCE;
    }

    /* JADX INFO: renamed from: I */
    public static b m14332I() {
        return b.m14354p();
    }

    /* JADX INFO: renamed from: J */
    public static b m14333J(C3774g c3774g) {
        return m14332I().mo14019j(c3774g);
    }

    /* JADX INFO: renamed from: z */
    public static C3774g m14341z() {
        return f10561z;
    }

    /* JADX INFO: renamed from: A */
    public C3776i m14342A(int i10) {
        return (C3776i) this.f10565u.get(i10);
    }

    /* JADX INFO: renamed from: B */
    public int m14343B() {
        return this.f10565u.size();
    }

    /* JADX INFO: renamed from: C */
    public c m14344C() {
        return this.f10564t;
    }

    /* JADX INFO: renamed from: D */
    public d m14345D() {
        return this.f10567w;
    }

    /* JADX INFO: renamed from: E */
    public boolean m14346E() {
        return (this.f10563s & 2) == 2;
    }

    /* JADX INFO: renamed from: F */
    public boolean m14347F() {
        return (this.f10563s & 1) == 1;
    }

    /* JADX INFO: renamed from: G */
    public boolean m14348G() {
        return (this.f10563s & 4) == 4;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14332I();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14333J(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10568x;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < m14343B(); i10++) {
            if (!m14342A(i10).mo13991a()) {
                this.f10568x = (byte) 0;
                return false;
            }
        }
        if (!m14346E() || m14351y().mo13991a()) {
            this.f10568x = (byte) 1;
            return true;
        }
        this.f10568x = (byte) 0;
        return false;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        if ((this.f10563s & 1) == 1) {
            c6350g.m25147R(1, this.f10564t.mo14092b());
        }
        for (int i10 = 0; i10 < this.f10565u.size(); i10++) {
            c6350g.m25158c0(2, (InterfaceC6360q) this.f10565u.get(i10));
        }
        if ((this.f10563s & 2) == 2) {
            c6350g.m25158c0(3, this.f10566v);
        }
        if ((this.f10563s & 4) == 4) {
            c6350g.m25147R(4, this.f10567w.mo14092b());
        }
        c6350g.m25163h0(this.f10562r);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10569y;
        if (i10 != -1) {
            return i10;
        }
        int iM25119h = (this.f10563s & 1) == 1 ? C6350g.m25119h(1, this.f10564t.mo14092b()) : 0;
        for (int i11 = 0; i11 < this.f10565u.size(); i11++) {
            iM25119h += C6350g.m25129r(2, (InterfaceC6360q) this.f10565u.get(i11));
        }
        if ((this.f10563s & 2) == 2) {
            iM25119h += C6350g.m25129r(3, this.f10566v);
        }
        if ((this.f10563s & 4) == 4) {
            iM25119h += C6350g.m25119h(4, this.f10567w.mo14092b());
        }
        int size = iM25119h + this.f10562r.size();
        this.f10569y = size;
        return size;
    }

    /* JADX INFO: renamed from: y */
    public C3776i m14351y() {
        return this.f10566v;
    }

    /* JADX INFO: renamed from: ja.g$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.b implements InterfaceC6361r {

        /* JADX INFO: renamed from: r */
        public int f10570r;

        /* JADX INFO: renamed from: s */
        public c f10571s = c.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: t */
        public List f10572t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: u */
        public C3776i f10573u = C3776i.m14393F();

        /* JADX INFO: renamed from: v */
        public d f10574v = d.AT_MOST_ONCE;

        public b() {
            m14355r();
        }

        /* JADX INFO: renamed from: p */
        public static b m14354p() {
            return new b();
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3774g build() {
            C3774g c3774gM14357n = m14357n();
            if (c3774gM14357n.mo13991a()) {
                return c3774gM14357n;
            }
            throw AbstractC6344a.a.m25020h(c3774gM14357n);
        }

        /* JADX INFO: renamed from: n */
        public C3774g m14357n() {
            C3774g c3774g = new C3774g(this);
            int i10 = this.f10570r;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3774g.f10564t = this.f10571s;
            if ((this.f10570r & 2) == 2) {
                this.f10572t = Collections.unmodifiableList(this.f10572t);
                this.f10570r &= -3;
            }
            c3774g.f10565u = this.f10572t;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            c3774g.f10566v = this.f10573u;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            c3774g.f10567w = this.f10574v;
            c3774g.f10563s = i11;
            return c3774g;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14354p().mo14019j(m14357n());
        }

        /* JADX INFO: renamed from: q */
        public final void m14359q() {
            if ((this.f10570r & 2) != 2) {
                this.f10572t = new ArrayList(this.f10572t);
                this.f10570r |= 2;
            }
        }

        /* JADX INFO: renamed from: s */
        public b m14360s(C3776i c3776i) {
            if ((this.f10570r & 4) != 4 || this.f10573u == C3776i.m14393F()) {
                this.f10573u = c3776i;
            } else {
                this.f10573u = C3776i.m14396T(this.f10573u).mo14019j(c3776i).m14427n();
            }
            this.f10570r |= 4;
            return this;
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3774g c3774g) {
            if (c3774g == C3774g.m14341z()) {
                return this;
            }
            if (c3774g.m14347F()) {
                m14363v(c3774g.m14344C());
            }
            if (!c3774g.f10565u.isEmpty()) {
                if (this.f10572t.isEmpty()) {
                    this.f10572t = c3774g.f10565u;
                    this.f10570r &= -3;
                } else {
                    m14359q();
                    this.f10572t.addAll(c3774g.f10565u);
                }
            }
            if (c3774g.m14346E()) {
                m14360s(c3774g.m14351y());
            }
            if (c3774g.m14348G()) {
                m14364w(c3774g.m14345D());
            }
            m25226k(m25225i().m25043c(c3774g.f10562r));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3774g.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3774g.f10560A     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.g r3 = (p143ja.C3774g) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.g r4 = (p143ja.C3774g) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3774g.b.mo14018e(qa.f, qa.h):ja.g$b");
        }

        /* JADX INFO: renamed from: v */
        public b m14363v(c cVar) {
            cVar.getClass();
            this.f10570r |= 1;
            this.f10571s = cVar;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public b m14364w(d dVar) {
            dVar.getClass();
            this.f10570r |= 8;
            this.f10574v = dVar;
            return this;
        }

        /* JADX INFO: renamed from: r */
        private void m14355r() {
        }
    }

    public C3774g(AbstractC6353j.b bVar) {
        super(bVar);
        this.f10568x = (byte) -1;
        this.f10569y = -1;
        this.f10562r = bVar.m25225i();
    }

    public C3774g(boolean z10) {
        this.f10568x = (byte) -1;
        this.f10569y = -1;
        this.f10562r = AbstractC6348e.f19966q;
    }
}
