package p143ja;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p143ja.C3788u;
import p143ja.C3791x;
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

/* JADX INFO: renamed from: ja.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3780m extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: B */
    public static final C3780m f10675B;

    /* JADX INFO: renamed from: C */
    public static InterfaceC6362s f10676C = new a();

    /* JADX INFO: renamed from: A */
    public int f10677A;

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10678s;

    /* JADX INFO: renamed from: t */
    public int f10679t;

    /* JADX INFO: renamed from: u */
    public List f10680u;

    /* JADX INFO: renamed from: v */
    public List f10681v;

    /* JADX INFO: renamed from: w */
    public List f10682w;

    /* JADX INFO: renamed from: x */
    public C3788u f10683x;

    /* JADX INFO: renamed from: y */
    public C3791x f10684y;

    /* JADX INFO: renamed from: z */
    public byte f10685z;

    /* JADX INFO: renamed from: ja.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3780m mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3780m(c6349f, c6351h);
        }
    }

    static {
        C3780m c3780m = new C3780m(true);
        f10675B = c3780m;
        c3780m.m14541Z();
    }

    public C3780m(C6349f c6349f, C6351h c6351h) {
        this.f10685z = (byte) -1;
        this.f10677A = -1;
        m14541Z();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 26) {
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 != 1) {
                                this.f10680u = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.f10680u.add(c6349f.m25097t(C3777j.f10624N, c6351h));
                        } else if (iM25071J == 34) {
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 != 2) {
                                this.f10681v = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.f10681v.add(c6349f.m25097t(C3782o.f10708N, c6351h));
                        } else if (iM25071J != 42) {
                            if (iM25071J == 242) {
                                C3788u.b bVarM14997G = (this.f10679t & 1) == 1 ? this.f10683x.mo13992c() : null;
                                C3788u c3788u = (C3788u) c6349f.m25097t(C3788u.f10889y, c6351h);
                                this.f10683x = c3788u;
                                if (bVarM14997G != null) {
                                    bVarM14997G.mo14019j(c3788u);
                                    this.f10683x = bVarM14997G.m15006n();
                                }
                                this.f10679t |= 1;
                            } else if (iM25071J == 258) {
                                C3791x.b bVarM15107B = (this.f10679t & 2) == 2 ? this.f10684y.mo13992c() : null;
                                C3791x c3791x = (C3791x) c6349f.m25097t(C3791x.f10950w, c6351h);
                                this.f10684y = c3791x;
                                if (bVarM15107B != null) {
                                    bVarM15107B.mo14019j(c3791x);
                                    this.f10684y = bVarM15107B.m15115n();
                                }
                                this.f10679t |= 2;
                            } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                            }
                        } else {
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 != 4) {
                                this.f10682w = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.f10682w.add(c6349f.m25097t(C3786s.f10836H, c6351h));
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (((i10 == true ? 1 : 0) & 1) == 1) {
                        this.f10680u = Collections.unmodifiableList(this.f10680u);
                    }
                    if (((i10 == true ? 1 : 0) & 2) == 2) {
                        this.f10681v = Collections.unmodifiableList(this.f10681v);
                    }
                    if (((i10 == true ? 1 : 0) & 4) == 4) {
                        this.f10682w = Collections.unmodifiableList(this.f10682w);
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10678s = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10678s = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            } catch (C6355l e10) {
                throw e10.m25261i(this);
            } catch (IOException e11) {
                throw new C6355l(e11.getMessage()).m25261i(this);
            }
        }
        if (((i10 == true ? 1 : 0) & 1) == 1) {
            this.f10680u = Collections.unmodifiableList(this.f10680u);
        }
        if (((i10 == true ? 1 : 0) & 2) == 2) {
            this.f10681v = Collections.unmodifiableList(this.f10681v);
        }
        if (((i10 == true ? 1 : 0) & 4) == 4) {
            this.f10682w = Collections.unmodifiableList(this.f10682w);
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10678s = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10678s = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: K */
    public static C3780m m14540K() {
        return f10675B;
    }

    /* JADX INFO: renamed from: Z */
    private void m14541Z() {
        List list = Collections.EMPTY_LIST;
        this.f10680u = list;
        this.f10681v = list;
        this.f10682w = list;
        this.f10683x = C3788u.m14993w();
        this.f10684y = C3791x.m15102u();
    }

    /* JADX INFO: renamed from: a0 */
    public static b m14542a0() {
        return b.m14563t();
    }

    /* JADX INFO: renamed from: b0 */
    public static b m14543b0(C3780m c3780m) {
        return m14542a0().mo14019j(c3780m);
    }

    /* JADX INFO: renamed from: d0 */
    public static C3780m m14544d0(InputStream inputStream, C6351h c6351h) {
        return (C3780m) f10676C.mo25021a(inputStream, c6351h);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C3780m mo14181b() {
        return f10675B;
    }

    /* JADX INFO: renamed from: M */
    public C3777j m14546M(int i10) {
        return (C3777j) this.f10680u.get(i10);
    }

    /* JADX INFO: renamed from: N */
    public int m14547N() {
        return this.f10680u.size();
    }

    /* JADX INFO: renamed from: O */
    public List m14548O() {
        return this.f10680u;
    }

    /* JADX INFO: renamed from: P */
    public C3782o m14549P(int i10) {
        return (C3782o) this.f10681v.get(i10);
    }

    /* JADX INFO: renamed from: Q */
    public int m14550Q() {
        return this.f10681v.size();
    }

    /* JADX INFO: renamed from: R */
    public List m14551R() {
        return this.f10681v;
    }

    /* JADX INFO: renamed from: S */
    public C3786s m14552S(int i10) {
        return (C3786s) this.f10682w.get(i10);
    }

    /* JADX INFO: renamed from: T */
    public int m14553T() {
        return this.f10682w.size();
    }

    /* JADX INFO: renamed from: U */
    public List m14554U() {
        return this.f10682w;
    }

    /* JADX INFO: renamed from: V */
    public C3788u m14555V() {
        return this.f10683x;
    }

    /* JADX INFO: renamed from: W */
    public C3791x m14556W() {
        return this.f10684y;
    }

    /* JADX INFO: renamed from: X */
    public boolean m14557X() {
        return (this.f10679t & 1) == 1;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m14558Y() {
        return (this.f10679t & 2) == 2;
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10685z;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < m14547N(); i10++) {
            if (!m14546M(i10).mo13991a()) {
                this.f10685z = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < m14550Q(); i11++) {
            if (!m14549P(i11).mo13991a()) {
                this.f10685z = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < m14553T(); i12++) {
            if (!m14552S(i12).mo13991a()) {
                this.f10685z = (byte) 0;
                return false;
            }
        }
        if (m14557X() && !m14555V().mo13991a()) {
            this.f10685z = (byte) 0;
            return false;
        }
        if (m25232s()) {
            this.f10685z = (byte) 1;
            return true;
        }
        this.f10685z = (byte) 0;
        return false;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14542a0();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        for (int i10 = 0; i10 < this.f10680u.size(); i10++) {
            c6350g.m25158c0(3, (InterfaceC6360q) this.f10680u.get(i10));
        }
        for (int i11 = 0; i11 < this.f10681v.size(); i11++) {
            c6350g.m25158c0(4, (InterfaceC6360q) this.f10681v.get(i11));
        }
        for (int i12 = 0; i12 < this.f10682w.size(); i12++) {
            c6350g.m25158c0(5, (InterfaceC6360q) this.f10682w.get(i12));
        }
        if ((this.f10679t & 1) == 1) {
            c6350g.m25158c0(30, this.f10683x);
        }
        if ((this.f10679t & 2) == 2) {
            c6350g.m25158c0(32, this.f10684y);
        }
        aVarM25238y.m25240a(200, c6350g);
        c6350g.m25163h0(this.f10678s);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14543b0(this);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10677A;
        if (i10 != -1) {
            return i10;
        }
        int iM25129r = 0;
        for (int i11 = 0; i11 < this.f10680u.size(); i11++) {
            iM25129r += C6350g.m25129r(3, (InterfaceC6360q) this.f10680u.get(i11));
        }
        for (int i12 = 0; i12 < this.f10681v.size(); i12++) {
            iM25129r += C6350g.m25129r(4, (InterfaceC6360q) this.f10681v.get(i12));
        }
        for (int i13 = 0; i13 < this.f10682w.size(); i13++) {
            iM25129r += C6350g.m25129r(5, (InterfaceC6360q) this.f10682w.get(i13));
        }
        if ((this.f10679t & 1) == 1) {
            iM25129r += C6350g.m25129r(30, this.f10683x);
        }
        if ((this.f10679t & 2) == 2) {
            iM25129r += C6350g.m25129r(32, this.f10684y);
        }
        int iM25233t = iM25129r + m25233t() + this.f10678s.size();
        this.f10677A = iM25233t;
        return iM25233t;
    }

    /* JADX INFO: renamed from: ja.m$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: t */
        public int f10686t;

        /* JADX INFO: renamed from: u */
        public List f10687u;

        /* JADX INFO: renamed from: v */
        public List f10688v;

        /* JADX INFO: renamed from: w */
        public List f10689w;

        /* JADX INFO: renamed from: x */
        public C3788u f10690x;

        /* JADX INFO: renamed from: y */
        public C3791x f10691y;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f10687u = list;
            this.f10688v = list;
            this.f10689w = list;
            this.f10690x = C3788u.m14993w();
            this.f10691y = C3791x.m15102u();
            m14567x();
        }

        /* JADX INFO: renamed from: t */
        public static b m14563t() {
            return new b();
        }

        /* JADX INFO: renamed from: u */
        private void m14564u() {
            if ((this.f10686t & 1) != 1) {
                this.f10687u = new ArrayList(this.f10687u);
                this.f10686t |= 1;
            }
        }

        /* JADX INFO: renamed from: v */
        private void m14565v() {
            if ((this.f10686t & 2) != 2) {
                this.f10688v = new ArrayList(this.f10688v);
                this.f10686t |= 2;
            }
        }

        /* JADX INFO: renamed from: w */
        private void m14566w() {
            if ((this.f10686t & 4) != 4) {
                this.f10689w = new ArrayList(this.f10689w);
                this.f10686t |= 4;
            }
        }

        /* JADX INFO: renamed from: A */
        public b m14568A(C3788u c3788u) {
            if ((this.f10686t & 8) != 8 || this.f10690x == C3788u.m14993w()) {
                this.f10690x = c3788u;
            } else {
                this.f10690x = C3788u.m14987E(this.f10690x).mo14019j(c3788u).m15006n();
            }
            this.f10686t |= 8;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m14569B(C3791x c3791x) {
            if ((this.f10686t & 16) != 16 || this.f10691y == C3791x.m15102u()) {
                this.f10691y = c3791x;
            } else {
                this.f10691y = C3791x.m15105z(this.f10691y).mo14019j(c3791x).m15115n();
            }
            this.f10686t |= 16;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3780m build() {
            C3780m c3780mM14571r = m14571r();
            if (c3780mM14571r.mo13991a()) {
                return c3780mM14571r;
            }
            throw AbstractC6344a.a.m25020h(c3780mM14571r);
        }

        /* JADX INFO: renamed from: r */
        public C3780m m14571r() {
            C3780m c3780m = new C3780m(this);
            int i10 = this.f10686t;
            if ((i10 & 1) == 1) {
                this.f10687u = Collections.unmodifiableList(this.f10687u);
                this.f10686t &= -2;
            }
            c3780m.f10680u = this.f10687u;
            if ((this.f10686t & 2) == 2) {
                this.f10688v = Collections.unmodifiableList(this.f10688v);
                this.f10686t &= -3;
            }
            c3780m.f10681v = this.f10688v;
            if ((this.f10686t & 4) == 4) {
                this.f10689w = Collections.unmodifiableList(this.f10689w);
                this.f10686t &= -5;
            }
            c3780m.f10682w = this.f10689w;
            int i11 = (i10 & 8) != 8 ? 0 : 1;
            c3780m.f10683x = this.f10690x;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            c3780m.f10684y = this.f10691y;
            c3780m.f10679t = i11;
            return c3780m;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14563t().mo14019j(m14571r());
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3780m c3780m) {
            if (c3780m == C3780m.m14540K()) {
                return this;
            }
            if (!c3780m.f10680u.isEmpty()) {
                if (this.f10687u.isEmpty()) {
                    this.f10687u = c3780m.f10680u;
                    this.f10686t &= -2;
                } else {
                    m14564u();
                    this.f10687u.addAll(c3780m.f10680u);
                }
            }
            if (!c3780m.f10681v.isEmpty()) {
                if (this.f10688v.isEmpty()) {
                    this.f10688v = c3780m.f10681v;
                    this.f10686t &= -3;
                } else {
                    m14565v();
                    this.f10688v.addAll(c3780m.f10681v);
                }
            }
            if (!c3780m.f10682w.isEmpty()) {
                if (this.f10689w.isEmpty()) {
                    this.f10689w = c3780m.f10682w;
                    this.f10686t &= -5;
                } else {
                    m14566w();
                    this.f10689w.addAll(c3780m.f10682w);
                }
            }
            if (c3780m.m14557X()) {
                m14568A(c3780m.m14555V());
            }
            if (c3780m.m14558Y()) {
                m14569B(c3780m.m14556W());
            }
            m25230o(c3780m);
            m25226k(m25225i().m25043c(c3780m.f10678s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3780m.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3780m.f10676C     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.m r3 = (p143ja.C3780m) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.m r4 = (p143ja.C3780m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3780m.b.mo14018e(qa.f, qa.h):ja.m$b");
        }

        /* JADX INFO: renamed from: x */
        private void m14567x() {
        }
    }

    public C3780m(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10685z = (byte) -1;
        this.f10677A = -1;
        this.f10678s = cVar.m25225i();
    }

    public C3780m(boolean z10) {
        this.f10685z = (byte) -1;
        this.f10677A = -1;
        this.f10678s = AbstractC6348e.f19966q;
    }
}
