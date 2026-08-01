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

/* JADX INFO: renamed from: ja.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3775h extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: x */
    public static final C3775h f10587x;

    /* JADX INFO: renamed from: y */
    public static InterfaceC6362s f10588y = new a();

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10589s;

    /* JADX INFO: renamed from: t */
    public int f10590t;

    /* JADX INFO: renamed from: u */
    public int f10591u;

    /* JADX INFO: renamed from: v */
    public byte f10592v;

    /* JADX INFO: renamed from: w */
    public int f10593w;

    /* JADX INFO: renamed from: ja.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3775h mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3775h(c6349f, c6351h);
        }
    }

    static {
        C3775h c3775h = new C3775h(true);
        f10587x = c3775h;
        c3775h.m14373H();
    }

    public C3775h(C6349f c6349f, C6351h c6351h) {
        this.f10592v = (byte) -1;
        this.f10593w = -1;
        m14373H();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 8) {
                            this.f10590t |= 1;
                            this.f10591u = c6349f.m25095r();
                        } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10589s = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10589s = bVarM25040t.m25058h();
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
            this.f10589s = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10589s = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: D */
    public static C3775h m14372D() {
        return f10587x;
    }

    /* JADX INFO: renamed from: H */
    private void m14373H() {
        this.f10591u = 0;
    }

    /* JADX INFO: renamed from: I */
    public static b m14374I() {
        return b.m14383t();
    }

    /* JADX INFO: renamed from: J */
    public static b m14375J(C3775h c3775h) {
        return m14374I().mo14019j(c3775h);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3775h mo14181b() {
        return f10587x;
    }

    /* JADX INFO: renamed from: F */
    public int m14377F() {
        return this.f10591u;
    }

    /* JADX INFO: renamed from: G */
    public boolean m14378G() {
        return (this.f10590t & 1) == 1;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14374I();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14375J(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10592v;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (m25232s()) {
            this.f10592v = (byte) 1;
            return true;
        }
        this.f10592v = (byte) 0;
        return false;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10590t & 1) == 1) {
            c6350g.m25155Z(1, this.f10591u);
        }
        aVarM25238y.m25240a(200, c6350g);
        c6350g.m25163h0(this.f10589s);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10593w;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = ((this.f10590t & 1) == 1 ? C6350g.m25126o(1, this.f10591u) : 0) + m25233t() + this.f10589s.size();
        this.f10593w = iM25126o;
        return iM25126o;
    }

    /* JADX INFO: renamed from: ja.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: t */
        public int f10594t;

        /* JADX INFO: renamed from: u */
        public int f10595u;

        public b() {
            m14384u();
        }

        /* JADX INFO: renamed from: t */
        public static b m14383t() {
            return new b();
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3775h build() {
            C3775h c3775hM14386r = m14386r();
            if (c3775hM14386r.mo13991a()) {
                return c3775hM14386r;
            }
            throw AbstractC6344a.a.m25020h(c3775hM14386r);
        }

        /* JADX INFO: renamed from: r */
        public C3775h m14386r() {
            C3775h c3775h = new C3775h(this);
            int i10 = (this.f10594t & 1) != 1 ? 0 : 1;
            c3775h.f10591u = this.f10595u;
            c3775h.f10590t = i10;
            return c3775h;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14383t().mo14019j(m14386r());
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3775h c3775h) {
            if (c3775h == C3775h.m14372D()) {
                return this;
            }
            if (c3775h.m14378G()) {
                m14390x(c3775h.m14377F());
            }
            m25230o(c3775h);
            m25226k(m25225i().m25043c(c3775h.f10589s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3775h.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3775h.f10588y     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.h r3 = (p143ja.C3775h) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.h r4 = (p143ja.C3775h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3775h.b.mo14018e(qa.f, qa.h):ja.h$b");
        }

        /* JADX INFO: renamed from: x */
        public b m14390x(int i10) {
            this.f10594t |= 1;
            this.f10595u = i10;
            return this;
        }

        /* JADX INFO: renamed from: u */
        private void m14384u() {
        }
    }

    public C3775h(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10592v = (byte) -1;
        this.f10593w = -1;
        this.f10589s = cVar.m25225i();
    }

    public C3775h(boolean z10) {
        this.f10592v = (byte) -1;
        this.f10593w = -1;
        this.f10589s = AbstractC6348e.f19966q;
    }
}
