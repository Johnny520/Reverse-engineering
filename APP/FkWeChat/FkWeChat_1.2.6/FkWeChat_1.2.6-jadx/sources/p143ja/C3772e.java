package p143ja;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qa.AbstractC6344a;
import qa.AbstractC6345b;
import qa.AbstractC6348e;
import qa.AbstractC6353j;
import qa.C6349f;
import qa.C6350g;
import qa.C6351h;
import qa.C6355l;
import qa.InterfaceC6360q;
import qa.InterfaceC6361r;
import qa.InterfaceC6362s;

/* JADX INFO: renamed from: ja.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3772e extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: A */
    public static final C3772e f10537A;

    /* JADX INFO: renamed from: B */
    public static InterfaceC6362s f10538B = new a();

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10539s;

    /* JADX INFO: renamed from: t */
    public int f10540t;

    /* JADX INFO: renamed from: u */
    public int f10541u;

    /* JADX INFO: renamed from: v */
    public List f10542v;

    /* JADX INFO: renamed from: w */
    public List f10543w;

    /* JADX INFO: renamed from: x */
    public List f10544x;

    /* JADX INFO: renamed from: y */
    public byte f10545y;

    /* JADX INFO: renamed from: z */
    public int f10546z;

    /* JADX INFO: renamed from: ja.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3772e mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3772e(c6349f, c6351h);
        }
    }

    static {
        C3772e c3772e = new C3772e(true);
        f10537A = c3772e;
        c3772e.m14283T();
    }

    public C3772e(C6349f c6349f, C6351h c6351h) {
        this.f10545y = (byte) -1;
        this.f10546z = -1;
        m14283T();
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
                            this.f10540t |= 1;
                            this.f10541u = c6349f.m25095r();
                        } else if (iM25071J == 18) {
                            if ((i10 & 2) != 2) {
                                this.f10542v = new ArrayList();
                                i10 |= 2;
                            }
                            this.f10542v.add(c6349f.m25097t(C3789v.f10900D, c6351h));
                        } else if (iM25071J == 248) {
                            if ((i10 & 4) != 4) {
                                this.f10543w = new ArrayList();
                                i10 |= 4;
                            }
                            this.f10543w.add(Integer.valueOf(c6349f.m25095r()));
                        } else if (iM25071J == 250) {
                            int iM25086i = c6349f.m25086i(c6349f.m25103z());
                            if ((i10 & 4) != 4 && c6349f.m25083e() > 0) {
                                this.f10543w = new ArrayList();
                                i10 |= 4;
                            }
                            while (c6349f.m25083e() > 0) {
                                this.f10543w.add(Integer.valueOf(c6349f.m25095r()));
                            }
                            c6349f.m25085h(iM25086i);
                        } else if (iM25071J == 258) {
                            if ((i10 & 8) != 8) {
                                this.f10544x = new ArrayList();
                                i10 |= 8;
                            }
                            this.f10544x.add(c6349f.m25097t(C3771d.f10527y, c6351h));
                        } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((i10 & 2) == 2) {
                        this.f10542v = Collections.unmodifiableList(this.f10542v);
                    }
                    if ((i10 & 4) == 4) {
                        this.f10543w = Collections.unmodifiableList(this.f10543w);
                    }
                    if ((i10 & 8) == 8) {
                        this.f10544x = Collections.unmodifiableList(this.f10544x);
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10539s = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10539s = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            } catch (C6355l e10) {
                throw e10.m25261i(this);
            } catch (IOException e11) {
                throw new C6355l(e11.getMessage()).m25261i(this);
            }
        }
        if ((i10 & 2) == 2) {
            this.f10542v = Collections.unmodifiableList(this.f10542v);
        }
        if ((i10 & 4) == 4) {
            this.f10543w = Collections.unmodifiableList(this.f10543w);
        }
        if ((i10 & 8) == 8) {
            this.f10544x = Collections.unmodifiableList(this.f10544x);
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10539s = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10539s = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: L */
    public static C3772e m14282L() {
        return f10537A;
    }

    /* JADX INFO: renamed from: T */
    private void m14283T() {
        this.f10541u = 6;
        List list = Collections.EMPTY_LIST;
        this.f10542v = list;
        this.f10543w = list;
        this.f10544x = list;
    }

    /* JADX INFO: renamed from: U */
    public static b m14284U() {
        return b.m14299t();
    }

    /* JADX INFO: renamed from: V */
    public static b m14285V(C3772e c3772e) {
        return m14284U().mo14019j(c3772e);
    }

    /* JADX INFO: renamed from: J */
    public C3771d m14286J(int i10) {
        return (C3771d) this.f10544x.get(i10);
    }

    /* JADX INFO: renamed from: K */
    public int m14287K() {
        return this.f10544x.size();
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public C3772e mo14181b() {
        return f10537A;
    }

    /* JADX INFO: renamed from: N */
    public int m14289N() {
        return this.f10541u;
    }

    /* JADX INFO: renamed from: O */
    public C3789v m14290O(int i10) {
        return (C3789v) this.f10542v.get(i10);
    }

    /* JADX INFO: renamed from: P */
    public int m14291P() {
        return this.f10542v.size();
    }

    /* JADX INFO: renamed from: Q */
    public List m14292Q() {
        return this.f10542v;
    }

    /* JADX INFO: renamed from: R */
    public List m14293R() {
        return this.f10543w;
    }

    /* JADX INFO: renamed from: S */
    public boolean m14294S() {
        return (this.f10540t & 1) == 1;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14284U();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14285V(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10545y;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < m14291P(); i10++) {
            if (!m14290O(i10).mo13991a()) {
                this.f10545y = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < m14287K(); i11++) {
            if (!m14286J(i11).mo13991a()) {
                this.f10545y = (byte) 0;
                return false;
            }
        }
        if (m25232s()) {
            this.f10545y = (byte) 1;
            return true;
        }
        this.f10545y = (byte) 0;
        return false;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10540t & 1) == 1) {
            c6350g.m25155Z(1, this.f10541u);
        }
        for (int i10 = 0; i10 < this.f10542v.size(); i10++) {
            c6350g.m25158c0(2, (InterfaceC6360q) this.f10542v.get(i10));
        }
        for (int i11 = 0; i11 < this.f10543w.size(); i11++) {
            c6350g.m25155Z(31, ((Integer) this.f10543w.get(i11)).intValue());
        }
        for (int i12 = 0; i12 < this.f10544x.size(); i12++) {
            c6350g.m25158c0(32, (InterfaceC6360q) this.f10544x.get(i12));
        }
        aVarM25238y.m25240a(19000, c6350g);
        c6350g.m25163h0(this.f10539s);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10546z;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10540t & 1) == 1 ? C6350g.m25126o(1, this.f10541u) : 0;
        for (int i11 = 0; i11 < this.f10542v.size(); i11++) {
            iM25126o += C6350g.m25129r(2, (InterfaceC6360q) this.f10542v.get(i11));
        }
        int iM25127p = 0;
        for (int i12 = 0; i12 < this.f10543w.size(); i12++) {
            iM25127p += C6350g.m25127p(((Integer) this.f10543w.get(i12)).intValue());
        }
        int size = iM25126o + iM25127p + (m14293R().size() * 2);
        for (int i13 = 0; i13 < this.f10544x.size(); i13++) {
            size += C6350g.m25129r(32, (InterfaceC6360q) this.f10544x.get(i13));
        }
        int iM25233t = size + m25233t() + this.f10539s.size();
        this.f10546z = iM25233t;
        return iM25233t;
    }

    /* JADX INFO: renamed from: ja.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: t */
        public int f10547t;

        /* JADX INFO: renamed from: u */
        public int f10548u = 6;

        /* JADX INFO: renamed from: v */
        public List f10549v;

        /* JADX INFO: renamed from: w */
        public List f10550w;

        /* JADX INFO: renamed from: x */
        public List f10551x;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f10549v = list;
            this.f10550w = list;
            this.f10551x = list;
            m14302x();
        }

        /* JADX INFO: renamed from: t */
        public static b m14299t() {
            return new b();
        }

        /* JADX INFO: renamed from: u */
        private void m14300u() {
            if ((this.f10547t & 8) != 8) {
                this.f10551x = new ArrayList(this.f10551x);
                this.f10547t |= 8;
            }
        }

        /* JADX INFO: renamed from: w */
        private void m14301w() {
            if ((this.f10547t & 4) != 4) {
                this.f10550w = new ArrayList(this.f10550w);
                this.f10547t |= 4;
            }
        }

        /* JADX INFO: renamed from: A */
        public b m14303A(int i10) {
            this.f10547t |= 1;
            this.f10548u = i10;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3772e build() {
            C3772e c3772eM14305r = m14305r();
            if (c3772eM14305r.mo13991a()) {
                return c3772eM14305r;
            }
            throw AbstractC6344a.a.m25020h(c3772eM14305r);
        }

        /* JADX INFO: renamed from: r */
        public C3772e m14305r() {
            C3772e c3772e = new C3772e(this);
            int i10 = (this.f10547t & 1) != 1 ? 0 : 1;
            c3772e.f10541u = this.f10548u;
            if ((this.f10547t & 2) == 2) {
                this.f10549v = Collections.unmodifiableList(this.f10549v);
                this.f10547t &= -3;
            }
            c3772e.f10542v = this.f10549v;
            if ((this.f10547t & 4) == 4) {
                this.f10550w = Collections.unmodifiableList(this.f10550w);
                this.f10547t &= -5;
            }
            c3772e.f10543w = this.f10550w;
            if ((this.f10547t & 8) == 8) {
                this.f10551x = Collections.unmodifiableList(this.f10551x);
                this.f10547t &= -9;
            }
            c3772e.f10544x = this.f10551x;
            c3772e.f10540t = i10;
            return c3772e;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14299t().mo14019j(m14305r());
        }

        /* JADX INFO: renamed from: v */
        public final void m14307v() {
            if ((this.f10547t & 2) != 2) {
                this.f10549v = new ArrayList(this.f10549v);
                this.f10547t |= 2;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3772e c3772e) {
            if (c3772e == C3772e.m14282L()) {
                return this;
            }
            if (c3772e.m14294S()) {
                m14303A(c3772e.m14289N());
            }
            if (!c3772e.f10542v.isEmpty()) {
                if (this.f10549v.isEmpty()) {
                    this.f10549v = c3772e.f10542v;
                    this.f10547t &= -3;
                } else {
                    m14307v();
                    this.f10549v.addAll(c3772e.f10542v);
                }
            }
            if (!c3772e.f10543w.isEmpty()) {
                if (this.f10550w.isEmpty()) {
                    this.f10550w = c3772e.f10543w;
                    this.f10547t &= -5;
                } else {
                    m14301w();
                    this.f10550w.addAll(c3772e.f10543w);
                }
            }
            if (!c3772e.f10544x.isEmpty()) {
                if (this.f10551x.isEmpty()) {
                    this.f10551x = c3772e.f10544x;
                    this.f10547t &= -9;
                } else {
                    m14300u();
                    this.f10551x.addAll(c3772e.f10544x);
                }
            }
            m25230o(c3772e);
            m25226k(m25225i().m25043c(c3772e.f10539s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3772e.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3772e.f10538B     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.e r3 = (p143ja.C3772e) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.e r4 = (p143ja.C3772e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3772e.b.mo14018e(qa.f, qa.h):ja.e$b");
        }

        /* JADX INFO: renamed from: x */
        private void m14302x() {
        }
    }

    public C3772e(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10545y = (byte) -1;
        this.f10546z = -1;
        this.f10539s = cVar.m25225i();
    }

    public C3772e(boolean z10) {
        this.f10545y = (byte) -1;
        this.f10546z = -1;
        this.f10539s = AbstractC6348e.f19966q;
    }
}
