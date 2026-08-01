package p143ja;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p143ja.C3780m;
import p143ja.C3783p;
import p143ja.C3784q;
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

/* JADX INFO: renamed from: ja.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3781n extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: A */
    public static final C3781n f10692A;

    /* JADX INFO: renamed from: B */
    public static InterfaceC6362s f10693B = new a();

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10694s;

    /* JADX INFO: renamed from: t */
    public int f10695t;

    /* JADX INFO: renamed from: u */
    public C3784q f10696u;

    /* JADX INFO: renamed from: v */
    public C3783p f10697v;

    /* JADX INFO: renamed from: w */
    public C3780m f10698w;

    /* JADX INFO: renamed from: x */
    public List f10699x;

    /* JADX INFO: renamed from: y */
    public byte f10700y;

    /* JADX INFO: renamed from: z */
    public int f10701z;

    /* JADX INFO: renamed from: ja.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3781n mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3781n(c6349f, c6351h);
        }
    }

    static {
        C3781n c3781n = new C3781n(true);
        f10692A = c3781n;
        c3781n.m14583S();
    }

    public C3781n(C6349f c6349f, C6351h c6351h) {
        this.f10700y = (byte) -1;
        this.f10701z = -1;
        m14583S();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 10) {
                            C3784q.b bVarM14755B = (this.f10695t & 1) == 1 ? this.f10696u.mo13992c() : null;
                            C3784q c3784q = (C3784q) c6349f.m25097t(C3784q.f10773w, c6351h);
                            this.f10696u = c3784q;
                            if (bVarM14755B != null) {
                                bVarM14755B.mo14019j(c3784q);
                                this.f10696u = bVarM14755B.m14763n();
                            }
                            this.f10695t |= 1;
                        } else if (iM25071J == 18) {
                            C3783p.b bVarM14703B = (this.f10695t & 2) == 2 ? this.f10697v.mo13992c() : null;
                            C3783p c3783p = (C3783p) c6349f.m25097t(C3783p.f10746w, c6351h);
                            this.f10697v = c3783p;
                            if (bVarM14703B != null) {
                                bVarM14703B.mo14019j(c3783p);
                                this.f10697v = bVarM14703B.m14711n();
                            }
                            this.f10695t |= 2;
                        } else if (iM25071J == 26) {
                            C3780m.b bVarMo13992c = (this.f10695t & 4) == 4 ? this.f10698w.mo13992c() : null;
                            C3780m c3780m = (C3780m) c6349f.m25097t(C3780m.f10676C, c6351h);
                            this.f10698w = c3780m;
                            if (bVarMo13992c != null) {
                                bVarMo13992c.mo14019j(c3780m);
                                this.f10698w = bVarMo13992c.m14571r();
                            }
                            this.f10695t |= 4;
                        } else if (iM25071J == 34) {
                            int i10 = (c10 == true ? 1 : 0) & '\b';
                            c10 = c10;
                            if (i10 != 8) {
                                this.f10699x = new ArrayList();
                                c10 = '\b';
                            }
                            this.f10699x.add(c6349f.m25097t(C3770c.f10454c0, c6351h));
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
                if (((c10 == true ? 1 : 0) & '\b') == 8) {
                    this.f10699x = Collections.unmodifiableList(this.f10699x);
                }
                try {
                    c6350gM25111I.m25138H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f10694s = bVarM25040t.m25058h();
                    throw th2;
                }
                this.f10694s = bVarM25040t.m25058h();
                mo25223m();
                throw th;
            }
        }
        if (((c10 == true ? 1 : 0) & '\b') == 8) {
            this.f10699x = Collections.unmodifiableList(this.f10699x);
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10694s = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10694s = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: K */
    public static C3781n m14582K() {
        return f10692A;
    }

    /* JADX INFO: renamed from: S */
    private void m14583S() {
        this.f10696u = C3784q.m14750u();
        this.f10697v = C3783p.m14698u();
        this.f10698w = C3780m.m14540K();
        this.f10699x = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: T */
    public static b m14584T() {
        return b.m14601t();
    }

    /* JADX INFO: renamed from: U */
    public static b m14585U(C3781n c3781n) {
        return m14584T().mo14019j(c3781n);
    }

    /* JADX INFO: renamed from: W */
    public static C3781n m14586W(InputStream inputStream, C6351h c6351h) {
        return (C3781n) f10693B.mo25021a(inputStream, c6351h);
    }

    /* JADX INFO: renamed from: H */
    public C3770c m14587H(int i10) {
        return (C3770c) this.f10699x.get(i10);
    }

    /* JADX INFO: renamed from: I */
    public int m14588I() {
        return this.f10699x.size();
    }

    /* JADX INFO: renamed from: J */
    public List m14589J() {
        return this.f10699x;
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C3781n mo14181b() {
        return f10692A;
    }

    /* JADX INFO: renamed from: M */
    public C3780m m14591M() {
        return this.f10698w;
    }

    /* JADX INFO: renamed from: N */
    public C3783p m14592N() {
        return this.f10697v;
    }

    /* JADX INFO: renamed from: O */
    public C3784q m14593O() {
        return this.f10696u;
    }

    /* JADX INFO: renamed from: P */
    public boolean m14594P() {
        return (this.f10695t & 4) == 4;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m14595Q() {
        return (this.f10695t & 2) == 2;
    }

    /* JADX INFO: renamed from: R */
    public boolean m14596R() {
        return (this.f10695t & 1) == 1;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14584T();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14585U(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10700y;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (m14595Q() && !m14592N().mo13991a()) {
            this.f10700y = (byte) 0;
            return false;
        }
        if (m14594P() && !m14591M().mo13991a()) {
            this.f10700y = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m14588I(); i10++) {
            if (!m14587H(i10).mo13991a()) {
                this.f10700y = (byte) 0;
                return false;
            }
        }
        if (m25232s()) {
            this.f10700y = (byte) 1;
            return true;
        }
        this.f10700y = (byte) 0;
        return false;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10695t & 1) == 1) {
            c6350g.m25158c0(1, this.f10696u);
        }
        if ((this.f10695t & 2) == 2) {
            c6350g.m25158c0(2, this.f10697v);
        }
        if ((this.f10695t & 4) == 4) {
            c6350g.m25158c0(3, this.f10698w);
        }
        for (int i10 = 0; i10 < this.f10699x.size(); i10++) {
            c6350g.m25158c0(4, (InterfaceC6360q) this.f10699x.get(i10));
        }
        aVarM25238y.m25240a(200, c6350g);
        c6350g.m25163h0(this.f10694s);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10701z;
        if (i10 != -1) {
            return i10;
        }
        int iM25129r = (this.f10695t & 1) == 1 ? C6350g.m25129r(1, this.f10696u) : 0;
        if ((this.f10695t & 2) == 2) {
            iM25129r += C6350g.m25129r(2, this.f10697v);
        }
        if ((this.f10695t & 4) == 4) {
            iM25129r += C6350g.m25129r(3, this.f10698w);
        }
        for (int i11 = 0; i11 < this.f10699x.size(); i11++) {
            iM25129r += C6350g.m25129r(4, (InterfaceC6360q) this.f10699x.get(i11));
        }
        int iM25233t = iM25129r + m25233t() + this.f10694s.size();
        this.f10701z = iM25233t;
        return iM25233t;
    }

    /* JADX INFO: renamed from: ja.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: t */
        public int f10702t;

        /* JADX INFO: renamed from: u */
        public C3784q f10703u = C3784q.m14750u();

        /* JADX INFO: renamed from: v */
        public C3783p f10704v = C3783p.m14698u();

        /* JADX INFO: renamed from: w */
        public C3780m f10705w = C3780m.m14540K();

        /* JADX INFO: renamed from: x */
        public List f10706x = Collections.EMPTY_LIST;

        public b() {
            m14602v();
        }

        /* JADX INFO: renamed from: t */
        public static b m14601t() {
            return new b();
        }

        /* JADX INFO: renamed from: A */
        public b m14603A(C3784q c3784q) {
            if ((this.f10702t & 1) != 1 || this.f10703u == C3784q.m14750u()) {
                this.f10703u = c3784q;
            } else {
                this.f10703u = C3784q.m14753z(this.f10703u).mo14019j(c3784q).m14763n();
            }
            this.f10702t |= 1;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3781n build() {
            C3781n c3781nM14605r = m14605r();
            if (c3781nM14605r.mo13991a()) {
                return c3781nM14605r;
            }
            throw AbstractC6344a.a.m25020h(c3781nM14605r);
        }

        /* JADX INFO: renamed from: r */
        public C3781n m14605r() {
            C3781n c3781n = new C3781n(this);
            int i10 = this.f10702t;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3781n.f10696u = this.f10703u;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3781n.f10697v = this.f10704v;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3781n.f10698w = this.f10705w;
            if ((this.f10702t & 8) == 8) {
                this.f10706x = Collections.unmodifiableList(this.f10706x);
                this.f10702t &= -9;
            }
            c3781n.f10699x = this.f10706x;
            c3781n.f10695t = i11;
            return c3781n;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14601t().mo14019j(m14605r());
        }

        /* JADX INFO: renamed from: u */
        public final void m14607u() {
            if ((this.f10702t & 8) != 8) {
                this.f10706x = new ArrayList(this.f10706x);
                this.f10702t |= 8;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3781n c3781n) {
            if (c3781n == C3781n.m14582K()) {
                return this;
            }
            if (c3781n.m14596R()) {
                m14603A(c3781n.m14593O());
            }
            if (c3781n.m14595Q()) {
                m14611z(c3781n.m14592N());
            }
            if (c3781n.m14594P()) {
                m14610y(c3781n.m14591M());
            }
            if (!c3781n.f10699x.isEmpty()) {
                if (this.f10706x.isEmpty()) {
                    this.f10706x = c3781n.f10699x;
                    this.f10702t &= -9;
                } else {
                    m14607u();
                    this.f10706x.addAll(c3781n.f10699x);
                }
            }
            m25230o(c3781n);
            m25226k(m25225i().m25043c(c3781n.f10694s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3781n.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3781n.f10693B     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.n r3 = (p143ja.C3781n) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.n r4 = (p143ja.C3781n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3781n.b.mo14018e(qa.f, qa.h):ja.n$b");
        }

        /* JADX INFO: renamed from: y */
        public b m14610y(C3780m c3780m) {
            if ((this.f10702t & 4) != 4 || this.f10705w == C3780m.m14540K()) {
                this.f10705w = c3780m;
            } else {
                this.f10705w = C3780m.m14543b0(this.f10705w).mo14019j(c3780m).m14571r();
            }
            this.f10702t |= 4;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m14611z(C3783p c3783p) {
            if ((this.f10702t & 2) != 2 || this.f10704v == C3783p.m14698u()) {
                this.f10704v = c3783p;
            } else {
                this.f10704v = C3783p.m14701z(this.f10704v).mo14019j(c3783p).m14711n();
            }
            this.f10702t |= 2;
            return this;
        }

        /* JADX INFO: renamed from: v */
        private void m14602v() {
        }
    }

    public C3781n(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10700y = (byte) -1;
        this.f10701z = -1;
        this.f10694s = cVar.m25225i();
    }

    public C3781n(boolean z10) {
        this.f10700y = (byte) -1;
        this.f10701z = -1;
        this.f10694s = AbstractC6348e.f19966q;
    }
}
