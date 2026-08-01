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

/* JADX INFO: renamed from: ja.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3787t extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: D */
    public static final C3787t f10862D;

    /* JADX INFO: renamed from: E */
    public static InterfaceC6362s f10863E = new a();

    /* JADX INFO: renamed from: A */
    public int f10864A;

    /* JADX INFO: renamed from: B */
    public byte f10865B;

    /* JADX INFO: renamed from: C */
    public int f10866C;

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10867s;

    /* JADX INFO: renamed from: t */
    public int f10868t;

    /* JADX INFO: renamed from: u */
    public int f10869u;

    /* JADX INFO: renamed from: v */
    public int f10870v;

    /* JADX INFO: renamed from: w */
    public boolean f10871w;

    /* JADX INFO: renamed from: x */
    public c f10872x;

    /* JADX INFO: renamed from: y */
    public List f10873y;

    /* JADX INFO: renamed from: z */
    public List f10874z;

    /* JADX INFO: renamed from: ja.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3787t mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3787t(c6349f, c6351h);
        }
    }

    /* JADX INFO: renamed from: ja.t$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum c implements AbstractC6354k.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* JADX INFO: renamed from: u */
        public static AbstractC6354k.b f10885u = new a();

        /* JADX INFO: renamed from: q */
        public final int f10887q;

        /* JADX INFO: renamed from: ja.t$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements AbstractC6354k.b {
            @Override // qa.AbstractC6354k.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo14093a(int i10) {
                return c.m14983a(i10);
            }
        }

        c(int i10, int i11) {
            this.f10887q = i11;
        }

        /* JADX INFO: renamed from: a */
        public static c m14983a(int i10) {
            if (i10 == 0) {
                return IN;
            }
            if (i10 == 1) {
                return OUT;
            }
            if (i10 != 2) {
                return null;
            }
            return INV;
        }

        @Override // qa.AbstractC6354k.a
        /* JADX INFO: renamed from: b */
        public final int mo14092b() {
            return this.f10887q;
        }
    }

    static {
        C3787t c3787t = new C3787t(true);
        f10862D = c3787t;
        c3787t.m14950Y();
    }

    public C3787t(C6349f c6349f, C6351h c6351h) {
        this.f10864A = -1;
        this.f10865B = (byte) -1;
        this.f10866C = -1;
        m14950Y();
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
                            this.f10868t |= 1;
                            this.f10869u = c6349f.m25095r();
                        } else if (iM25071J == 16) {
                            this.f10868t |= 2;
                            this.f10870v = c6349f.m25095r();
                        } else if (iM25071J == 24) {
                            this.f10868t |= 4;
                            this.f10871w = c6349f.m25087j();
                        } else if (iM25071J == 32) {
                            int iM25090m = c6349f.m25090m();
                            c cVarM14983a = c.m14983a(iM25090m);
                            if (cVarM14983a == null) {
                                c6350gM25111I.m25169n0(iM25071J);
                                c6350gM25111I.m25169n0(iM25090m);
                            } else {
                                this.f10868t |= 8;
                                this.f10872x = cVarM14983a;
                            }
                        } else if (iM25071J == 42) {
                            if ((i10 & 16) != 16) {
                                this.f10873y = new ArrayList();
                                i10 |= 16;
                            }
                            this.f10873y.add(c6349f.m25097t(C3785r.f10781L, c6351h));
                        } else if (iM25071J == 48) {
                            if ((i10 & 32) != 32) {
                                this.f10874z = new ArrayList();
                                i10 |= 32;
                            }
                            this.f10874z.add(Integer.valueOf(c6349f.m25095r()));
                        } else if (iM25071J == 50) {
                            int iM25086i = c6349f.m25086i(c6349f.m25103z());
                            if ((i10 & 32) != 32 && c6349f.m25083e() > 0) {
                                this.f10874z = new ArrayList();
                                i10 |= 32;
                            }
                            while (c6349f.m25083e() > 0) {
                                this.f10874z.add(Integer.valueOf(c6349f.m25095r()));
                            }
                            c6349f.m25085h(iM25086i);
                        } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                        }
                    }
                    z10 = true;
                } catch (C6355l e10) {
                    throw e10.m25261i(this);
                } catch (IOException e11) {
                    throw new C6355l(e11.getMessage()).m25261i(this);
                }
            } catch (Throwable th) {
                if ((i10 & 16) == 16) {
                    this.f10873y = Collections.unmodifiableList(this.f10873y);
                }
                if ((i10 & 32) == 32) {
                    this.f10874z = Collections.unmodifiableList(this.f10874z);
                }
                try {
                    c6350gM25111I.m25138H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f10867s = bVarM25040t.m25058h();
                    throw th2;
                }
                this.f10867s = bVarM25040t.m25058h();
                mo25223m();
                throw th;
            }
        }
        if ((i10 & 16) == 16) {
            this.f10873y = Collections.unmodifiableList(this.f10873y);
        }
        if ((i10 & 32) == 32) {
            this.f10874z = Collections.unmodifiableList(this.f10874z);
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10867s = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10867s = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: K */
    public static C3787t m14949K() {
        return f10862D;
    }

    /* JADX INFO: renamed from: Y */
    private void m14950Y() {
        this.f10869u = 0;
        this.f10870v = 0;
        this.f10871w = false;
        this.f10872x = c.INV;
        List list = Collections.EMPTY_LIST;
        this.f10873y = list;
        this.f10874z = list;
    }

    /* JADX INFO: renamed from: Z */
    public static b m14951Z() {
        return b.m14970t();
    }

    /* JADX INFO: renamed from: a0 */
    public static b m14952a0(C3787t c3787t) {
        return m14951Z().mo14019j(c3787t);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C3787t mo14181b() {
        return f10862D;
    }

    /* JADX INFO: renamed from: M */
    public int m14954M() {
        return this.f10869u;
    }

    /* JADX INFO: renamed from: N */
    public int m14955N() {
        return this.f10870v;
    }

    /* JADX INFO: renamed from: O */
    public boolean m14956O() {
        return this.f10871w;
    }

    /* JADX INFO: renamed from: P */
    public C3785r m14957P(int i10) {
        return (C3785r) this.f10873y.get(i10);
    }

    /* JADX INFO: renamed from: Q */
    public int m14958Q() {
        return this.f10873y.size();
    }

    /* JADX INFO: renamed from: R */
    public List m14959R() {
        return this.f10874z;
    }

    /* JADX INFO: renamed from: S */
    public List m14960S() {
        return this.f10873y;
    }

    /* JADX INFO: renamed from: T */
    public c m14961T() {
        return this.f10872x;
    }

    /* JADX INFO: renamed from: U */
    public boolean m14962U() {
        return (this.f10868t & 1) == 1;
    }

    /* JADX INFO: renamed from: V */
    public boolean m14963V() {
        return (this.f10868t & 2) == 2;
    }

    /* JADX INFO: renamed from: W */
    public boolean m14964W() {
        return (this.f10868t & 4) == 4;
    }

    /* JADX INFO: renamed from: X */
    public boolean m14965X() {
        return (this.f10868t & 8) == 8;
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10865B;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!m14962U()) {
            this.f10865B = (byte) 0;
            return false;
        }
        if (!m14963V()) {
            this.f10865B = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m14958Q(); i10++) {
            if (!m14957P(i10).mo13991a()) {
                this.f10865B = (byte) 0;
                return false;
            }
        }
        if (m25232s()) {
            this.f10865B = (byte) 1;
            return true;
        }
        this.f10865B = (byte) 0;
        return false;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14951Z();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14952a0(this);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10868t & 1) == 1) {
            c6350g.m25155Z(1, this.f10869u);
        }
        if ((this.f10868t & 2) == 2) {
            c6350g.m25155Z(2, this.f10870v);
        }
        if ((this.f10868t & 4) == 4) {
            c6350g.m25140K(3, this.f10871w);
        }
        if ((this.f10868t & 8) == 8) {
            c6350g.m25147R(4, this.f10872x.mo14092b());
        }
        for (int i10 = 0; i10 < this.f10873y.size(); i10++) {
            c6350g.m25158c0(5, (InterfaceC6360q) this.f10873y.get(i10));
        }
        if (m14959R().size() > 0) {
            c6350g.m25169n0(50);
            c6350g.m25169n0(this.f10864A);
        }
        for (int i11 = 0; i11 < this.f10874z.size(); i11++) {
            c6350g.m25156a0(((Integer) this.f10874z.get(i11)).intValue());
        }
        aVarM25238y.m25240a(1000, c6350g);
        c6350g.m25163h0(this.f10867s);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10866C;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10868t & 1) == 1 ? C6350g.m25126o(1, this.f10869u) : 0;
        if ((this.f10868t & 2) == 2) {
            iM25126o += C6350g.m25126o(2, this.f10870v);
        }
        if ((this.f10868t & 4) == 4) {
            iM25126o += C6350g.m25112a(3, this.f10871w);
        }
        if ((this.f10868t & 8) == 8) {
            iM25126o += C6350g.m25119h(4, this.f10872x.mo14092b());
        }
        for (int i11 = 0; i11 < this.f10873y.size(); i11++) {
            iM25126o += C6350g.m25129r(5, (InterfaceC6360q) this.f10873y.get(i11));
        }
        int iM25127p = 0;
        for (int i12 = 0; i12 < this.f10874z.size(); i12++) {
            iM25127p += C6350g.m25127p(((Integer) this.f10874z.get(i12)).intValue());
        }
        int iM25127p2 = iM25126o + iM25127p;
        if (!m14959R().isEmpty()) {
            iM25127p2 = iM25127p2 + 1 + C6350g.m25127p(iM25127p);
        }
        this.f10864A = iM25127p;
        int iM25233t = iM25127p2 + m25233t() + this.f10867s.size();
        this.f10866C = iM25233t;
        return iM25233t;
    }

    /* JADX INFO: renamed from: ja.t$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: t */
        public int f10875t;

        /* JADX INFO: renamed from: u */
        public int f10876u;

        /* JADX INFO: renamed from: v */
        public int f10877v;

        /* JADX INFO: renamed from: w */
        public boolean f10878w;

        /* JADX INFO: renamed from: x */
        public c f10879x = c.INV;

        /* JADX INFO: renamed from: y */
        public List f10880y;

        /* JADX INFO: renamed from: z */
        public List f10881z;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f10880y = list;
            this.f10881z = list;
            m14971w();
        }

        /* JADX INFO: renamed from: t */
        public static b m14970t() {
            return new b();
        }

        /* JADX INFO: renamed from: A */
        public b m14972A(int i10) {
            this.f10875t |= 2;
            this.f10877v = i10;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m14973B(boolean z10) {
            this.f10875t |= 4;
            this.f10878w = z10;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public b m14974C(c cVar) {
            cVar.getClass();
            this.f10875t |= 8;
            this.f10879x = cVar;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3787t build() {
            C3787t c3787tM14976r = m14976r();
            if (c3787tM14976r.mo13991a()) {
                return c3787tM14976r;
            }
            throw AbstractC6344a.a.m25020h(c3787tM14976r);
        }

        /* JADX INFO: renamed from: r */
        public C3787t m14976r() {
            C3787t c3787t = new C3787t(this);
            int i10 = this.f10875t;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3787t.f10869u = this.f10876u;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3787t.f10870v = this.f10877v;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3787t.f10871w = this.f10878w;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3787t.f10872x = this.f10879x;
            if ((this.f10875t & 16) == 16) {
                this.f10880y = Collections.unmodifiableList(this.f10880y);
                this.f10875t &= -17;
            }
            c3787t.f10873y = this.f10880y;
            if ((this.f10875t & 32) == 32) {
                this.f10881z = Collections.unmodifiableList(this.f10881z);
                this.f10875t &= -33;
            }
            c3787t.f10874z = this.f10881z;
            c3787t.f10868t = i11;
            return c3787t;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14970t().mo14019j(m14976r());
        }

        /* JADX INFO: renamed from: u */
        public final void m14978u() {
            if ((this.f10875t & 32) != 32) {
                this.f10881z = new ArrayList(this.f10881z);
                this.f10875t |= 32;
            }
        }

        /* JADX INFO: renamed from: v */
        public final void m14979v() {
            if ((this.f10875t & 16) != 16) {
                this.f10880y = new ArrayList(this.f10880y);
                this.f10875t |= 16;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3787t c3787t) {
            if (c3787t == C3787t.m14949K()) {
                return this;
            }
            if (c3787t.m14962U()) {
                m14982z(c3787t.m14954M());
            }
            if (c3787t.m14963V()) {
                m14972A(c3787t.m14955N());
            }
            if (c3787t.m14964W()) {
                m14973B(c3787t.m14956O());
            }
            if (c3787t.m14965X()) {
                m14974C(c3787t.m14961T());
            }
            if (!c3787t.f10873y.isEmpty()) {
                if (this.f10880y.isEmpty()) {
                    this.f10880y = c3787t.f10873y;
                    this.f10875t &= -17;
                } else {
                    m14979v();
                    this.f10880y.addAll(c3787t.f10873y);
                }
            }
            if (!c3787t.f10874z.isEmpty()) {
                if (this.f10881z.isEmpty()) {
                    this.f10881z = c3787t.f10874z;
                    this.f10875t &= -33;
                } else {
                    m14978u();
                    this.f10881z.addAll(c3787t.f10874z);
                }
            }
            m25230o(c3787t);
            m25226k(m25225i().m25043c(c3787t.f10867s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3787t.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3787t.f10863E     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.t r3 = (p143ja.C3787t) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.t r4 = (p143ja.C3787t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3787t.b.mo14018e(qa.f, qa.h):ja.t$b");
        }

        /* JADX INFO: renamed from: z */
        public b m14982z(int i10) {
            this.f10875t |= 1;
            this.f10876u = i10;
            return this;
        }

        /* JADX INFO: renamed from: w */
        private void m14971w() {
        }
    }

    public C3787t(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10864A = -1;
        this.f10865B = (byte) -1;
        this.f10866C = -1;
        this.f10867s = cVar.m25225i();
    }

    public C3787t(boolean z10) {
        this.f10864A = -1;
        this.f10865B = (byte) -1;
        this.f10866C = -1;
        this.f10867s = AbstractC6348e.f19966q;
    }
}
