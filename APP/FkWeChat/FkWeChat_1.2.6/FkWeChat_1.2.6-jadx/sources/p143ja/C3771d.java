package p143ja;

import java.io.IOException;
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

/* JADX INFO: renamed from: ja.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3771d extends AbstractC6353j implements InterfaceC6361r {

    /* JADX INFO: renamed from: x */
    public static final C3771d f10526x;

    /* JADX INFO: renamed from: y */
    public static InterfaceC6362s f10527y = new a();

    /* JADX INFO: renamed from: r */
    public final AbstractC6348e f10528r;

    /* JADX INFO: renamed from: s */
    public int f10529s;

    /* JADX INFO: renamed from: t */
    public int f10530t;

    /* JADX INFO: renamed from: u */
    public AbstractC6348e f10531u;

    /* JADX INFO: renamed from: v */
    public byte f10532v;

    /* JADX INFO: renamed from: w */
    public int f10533w;

    /* JADX INFO: renamed from: ja.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3771d mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3771d(c6349f, c6351h);
        }
    }

    static {
        C3771d c3771d = new C3771d(true);
        f10526x = c3771d;
        c3771d.m14248A();
    }

    public C3771d(C6349f c6349f, C6351h c6351h) {
        this.f10532v = (byte) -1;
        this.f10533w = -1;
        m14248A();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 8) {
                            this.f10529s |= 1;
                            this.f10530t = c6349f.m25095r();
                        } else if (iM25071J == 18) {
                            this.f10529s |= 2;
                            this.f10531u = c6349f.m25088k();
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
                try {
                    c6350gM25111I.m25138H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f10528r = bVarM25040t.m25058h();
                    throw th2;
                }
                this.f10528r = bVarM25040t.m25058h();
                mo25223m();
                throw th;
            }
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10528r = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10528r = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: A */
    private void m14248A() {
        this.f10530t = 0;
        this.f10531u = AbstractC6348e.f19966q;
    }

    /* JADX INFO: renamed from: B */
    public static b m14249B() {
        return b.m14264p();
    }

    /* JADX INFO: renamed from: C */
    public static b m14250C(C3771d c3771d) {
        return m14249B().mo14019j(c3771d);
    }

    /* JADX INFO: renamed from: w */
    public static C3771d m14255w() {
        return f10526x;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14249B();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14250C(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10532v;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!m14261z()) {
            this.f10532v = (byte) 0;
            return false;
        }
        if (m14260y()) {
            this.f10532v = (byte) 1;
            return true;
        }
        this.f10532v = (byte) 0;
        return false;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        if ((this.f10529s & 1) == 1) {
            c6350g.m25155Z(1, this.f10530t);
        }
        if ((this.f10529s & 2) == 2) {
            c6350g.m25143N(2, this.f10531u);
        }
        c6350g.m25163h0(this.f10528r);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10533w;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10529s & 1) == 1 ? C6350g.m25126o(1, this.f10530t) : 0;
        if ((this.f10529s & 2) == 2) {
            iM25126o += C6350g.m25115d(2, this.f10531u);
        }
        int size = iM25126o + this.f10528r.size();
        this.f10533w = size;
        return size;
    }

    /* JADX INFO: renamed from: v */
    public AbstractC6348e m14258v() {
        return this.f10531u;
    }

    /* JADX INFO: renamed from: x */
    public int m14259x() {
        return this.f10530t;
    }

    /* JADX INFO: renamed from: y */
    public boolean m14260y() {
        return (this.f10529s & 2) == 2;
    }

    /* JADX INFO: renamed from: z */
    public boolean m14261z() {
        return (this.f10529s & 1) == 1;
    }

    /* JADX INFO: renamed from: ja.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.b implements InterfaceC6361r {

        /* JADX INFO: renamed from: r */
        public int f10534r;

        /* JADX INFO: renamed from: s */
        public int f10535s;

        /* JADX INFO: renamed from: t */
        public AbstractC6348e f10536t = AbstractC6348e.f19966q;

        public b() {
            m14265q();
        }

        /* JADX INFO: renamed from: p */
        public static b m14264p() {
            return new b();
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3771d build() {
            C3771d c3771dM14267n = m14267n();
            if (c3771dM14267n.mo13991a()) {
                return c3771dM14267n;
            }
            throw AbstractC6344a.a.m25020h(c3771dM14267n);
        }

        /* JADX INFO: renamed from: n */
        public C3771d m14267n() {
            C3771d c3771d = new C3771d(this);
            int i10 = this.f10534r;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3771d.f10530t = this.f10535s;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3771d.f10531u = this.f10536t;
            c3771d.f10529s = i11;
            return c3771d;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14264p().mo14019j(m14267n());
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3771d c3771d) {
            if (c3771d == C3771d.m14255w()) {
                return this;
            }
            if (c3771d.m14261z()) {
                m14272u(c3771d.m14259x());
            }
            if (c3771d.m14260y()) {
                m14271t(c3771d.m14258v());
            }
            m25226k(m25225i().m25043c(c3771d.f10528r));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3771d.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3771d.f10527y     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.d r3 = (p143ja.C3771d) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.d r4 = (p143ja.C3771d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3771d.b.mo14018e(qa.f, qa.h):ja.d$b");
        }

        /* JADX INFO: renamed from: t */
        public b m14271t(AbstractC6348e abstractC6348e) {
            abstractC6348e.getClass();
            this.f10534r |= 2;
            this.f10536t = abstractC6348e;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public b m14272u(int i10) {
            this.f10534r |= 1;
            this.f10535s = i10;
            return this;
        }

        /* JADX INFO: renamed from: q */
        private void m14265q() {
        }
    }

    public C3771d(AbstractC6353j.b bVar) {
        super(bVar);
        this.f10532v = (byte) -1;
        this.f10533w = -1;
        this.f10528r = bVar.m25225i();
    }

    public C3771d(boolean z10) {
        this.f10532v = (byte) -1;
        this.f10533w = -1;
        this.f10528r = AbstractC6348e.f19966q;
    }
}
