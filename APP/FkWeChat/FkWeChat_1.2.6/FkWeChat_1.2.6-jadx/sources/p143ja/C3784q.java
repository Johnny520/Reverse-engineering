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
import qa.C6357n;
import qa.InterfaceC6358o;
import qa.InterfaceC6361r;
import qa.InterfaceC6362s;
import qa.InterfaceC6363t;

/* JADX INFO: renamed from: ja.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3784q extends AbstractC6353j implements InterfaceC6361r {

    /* JADX INFO: renamed from: v */
    public static final C3784q f10772v;

    /* JADX INFO: renamed from: w */
    public static InterfaceC6362s f10773w = new a();

    /* JADX INFO: renamed from: r */
    public final AbstractC6348e f10774r;

    /* JADX INFO: renamed from: s */
    public InterfaceC6358o f10775s;

    /* JADX INFO: renamed from: t */
    public byte f10776t;

    /* JADX INFO: renamed from: u */
    public int f10777u;

    /* JADX INFO: renamed from: ja.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3784q mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3784q(c6349f, c6351h);
        }
    }

    static {
        C3784q c3784q = new C3784q(true);
        f10772v = c3784q;
        c3784q.m14751x();
    }

    public C3784q(C6349f c6349f, C6351h c6351h) {
        this.f10776t = (byte) -1;
        this.f10777u = -1;
        m14751x();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 10) {
                            AbstractC6348e abstractC6348eM25088k = c6349f.m25088k();
                            if (!z11) {
                                this.f10775s = new C6357n();
                                z11 = true;
                            }
                            this.f10775s.mo25269j(abstractC6348eM25088k);
                        } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (z11) {
                        this.f10775s = this.f10775s.mo25272n();
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10774r = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10774r = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            } catch (C6355l e10) {
                throw e10.m25261i(this);
            } catch (IOException e11) {
                throw new C6355l(e11.getMessage()).m25261i(this);
            }
        }
        if (z11) {
            this.f10775s = this.f10775s.mo25272n();
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10774r = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10774r = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: u */
    public static C3784q m14750u() {
        return f10772v;
    }

    /* JADX INFO: renamed from: x */
    private void m14751x() {
        this.f10775s = C6357n.f20025r;
    }

    /* JADX INFO: renamed from: y */
    public static b m14752y() {
        return b.m14760p();
    }

    /* JADX INFO: renamed from: z */
    public static b m14753z(C3784q c3784q) {
        return m14752y().mo14019j(c3784q);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14752y();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14753z(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10776t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f10776t = (byte) 1;
        return true;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        for (int i10 = 0; i10 < this.f10775s.size(); i10++) {
            c6350g.m25143N(1, this.f10775s.mo25271m(i10));
        }
        c6350g.m25163h0(this.f10774r);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10777u;
        if (i10 != -1) {
            return i10;
        }
        int iM25116e = 0;
        for (int i11 = 0; i11 < this.f10775s.size(); i11++) {
            iM25116e += C6350g.m25116e(this.f10775s.mo25271m(i11));
        }
        int size = iM25116e + m14757w().size() + this.f10774r.size();
        this.f10777u = size;
        return size;
    }

    /* JADX INFO: renamed from: v */
    public String m14756v(int i10) {
        return (String) this.f10775s.get(i10);
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC6363t m14757w() {
        return this.f10775s;
    }

    /* JADX INFO: renamed from: ja.q$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.b implements InterfaceC6361r {

        /* JADX INFO: renamed from: r */
        public int f10778r;

        /* JADX INFO: renamed from: s */
        public InterfaceC6358o f10779s = C6357n.f20025r;

        public b() {
            m14761r();
        }

        /* JADX INFO: renamed from: p */
        public static b m14760p() {
            return new b();
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3784q build() {
            C3784q c3784qM14763n = m14763n();
            if (c3784qM14763n.mo13991a()) {
                return c3784qM14763n;
            }
            throw AbstractC6344a.a.m25020h(c3784qM14763n);
        }

        /* JADX INFO: renamed from: n */
        public C3784q m14763n() {
            C3784q c3784q = new C3784q(this);
            if ((this.f10778r & 1) == 1) {
                this.f10779s = this.f10779s.mo25272n();
                this.f10778r &= -2;
            }
            c3784q.f10775s = this.f10779s;
            return c3784q;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14760p().mo14019j(m14763n());
        }

        /* JADX INFO: renamed from: q */
        public final void m14765q() {
            if ((this.f10778r & 1) != 1) {
                this.f10779s = new C6357n(this.f10779s);
                this.f10778r |= 1;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3784q c3784q) {
            if (c3784q == C3784q.m14750u()) {
                return this;
            }
            if (!c3784q.f10775s.isEmpty()) {
                if (this.f10779s.isEmpty()) {
                    this.f10779s = c3784q.f10775s;
                    this.f10778r &= -2;
                } else {
                    m14765q();
                    this.f10779s.addAll(c3784q.f10775s);
                }
            }
            m25226k(m25225i().m25043c(c3784q.f10774r));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3784q.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3784q.f10773w     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.q r3 = (p143ja.C3784q) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.q r4 = (p143ja.C3784q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3784q.b.mo14018e(qa.f, qa.h):ja.q$b");
        }

        /* JADX INFO: renamed from: r */
        private void m14761r() {
        }
    }

    public C3784q(AbstractC6353j.b bVar) {
        super(bVar);
        this.f10776t = (byte) -1;
        this.f10777u = -1;
        this.f10774r = bVar.m25225i();
    }

    public C3784q(boolean z10) {
        this.f10776t = (byte) -1;
        this.f10777u = -1;
        this.f10774r = AbstractC6348e.f19966q;
    }
}
