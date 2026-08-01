package p143ja;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p143ja.C3785r;
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

/* JADX INFO: renamed from: ja.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3786s extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: G */
    public static final C3786s f10835G;

    /* JADX INFO: renamed from: H */
    public static InterfaceC6362s f10836H = new a();

    /* JADX INFO: renamed from: A */
    public int f10837A;

    /* JADX INFO: renamed from: B */
    public List f10838B;

    /* JADX INFO: renamed from: C */
    public List f10839C;

    /* JADX INFO: renamed from: D */
    public List f10840D;

    /* JADX INFO: renamed from: E */
    public byte f10841E;

    /* JADX INFO: renamed from: F */
    public int f10842F;

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10843s;

    /* JADX INFO: renamed from: t */
    public int f10844t;

    /* JADX INFO: renamed from: u */
    public int f10845u;

    /* JADX INFO: renamed from: v */
    public int f10846v;

    /* JADX INFO: renamed from: w */
    public List f10847w;

    /* JADX INFO: renamed from: x */
    public C3785r f10848x;

    /* JADX INFO: renamed from: y */
    public int f10849y;

    /* JADX INFO: renamed from: z */
    public C3785r f10850z;

    /* JADX INFO: renamed from: ja.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3786s mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3786s(c6349f, c6351h);
        }
    }

    static {
        C3786s c3786s = new C3786s(true);
        f10835G = c3786s;
        c3786s.m14892n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C3786s(C6349f c6349f, C6351h c6351h) {
        C3785r.c cVarMo13992c;
        this.f10841E = (byte) -1;
        this.f10842F = -1;
        m14892n0();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? Mo25224p = 128;
            if (z10) {
                if ((i10 & 4) == 4) {
                    this.f10847w = Collections.unmodifiableList(this.f10847w);
                }
                if ((i10 & 128) == 128) {
                    this.f10838B = Collections.unmodifiableList(this.f10838B);
                }
                if ((i10 & 256) == 256) {
                    this.f10839C = Collections.unmodifiableList(this.f10839C);
                }
                if ((i10 & 512) == 512) {
                    this.f10840D = Collections.unmodifiableList(this.f10840D);
                }
                try {
                    c6350gM25111I.m25138H();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f10843s = bVarM25040t.m25058h();
                    throw th;
                }
                this.f10843s = bVarM25040t.m25058h();
                mo25223m();
                return;
            }
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    switch (iM25071J) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f10844t |= 1;
                            this.f10845u = c6349f.m25095r();
                            break;
                        case 16:
                            this.f10844t |= 2;
                            this.f10846v = c6349f.m25095r();
                            break;
                        case 26:
                            if ((i10 & 4) != 4) {
                                this.f10847w = new ArrayList();
                                i10 |= 4;
                            }
                            this.f10847w.add(c6349f.m25097t(C3787t.f10863E, c6351h));
                            break;
                        case 34:
                            cVarMo13992c = (this.f10844t & 4) == 4 ? this.f10848x.mo13992c() : null;
                            C3785r c3785r = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                            this.f10848x = c3785r;
                            if (cVarMo13992c != null) {
                                cVarMo13992c.mo14019j(c3785r);
                                this.f10848x = cVarMo13992c.m14869r();
                            }
                            this.f10844t |= 4;
                            break;
                        case 40:
                            this.f10844t |= 8;
                            this.f10849y = c6349f.m25095r();
                            break;
                        case Opcodes.AALOAD /* 50 */:
                            cVarMo13992c = (this.f10844t & 16) == 16 ? this.f10850z.mo13992c() : null;
                            C3785r c3785r2 = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                            this.f10850z = c3785r2;
                            if (cVarMo13992c != null) {
                                cVarMo13992c.mo14019j(c3785r2);
                                this.f10850z = cVarMo13992c.m14869r();
                            }
                            this.f10844t |= 16;
                            break;
                        case Opcodes.FSTORE /* 56 */:
                            this.f10844t |= 32;
                            this.f10837A = c6349f.m25095r();
                            break;
                        case 66:
                            if ((i10 & 128) != 128) {
                                this.f10838B = new ArrayList();
                                i10 |= 128;
                            }
                            this.f10838B.add(c6349f.m25097t(C3769b.f10387y, c6351h));
                            break;
                        case 248:
                            if ((i10 & 256) != 256) {
                                this.f10839C = new ArrayList();
                                i10 |= 256;
                            }
                            this.f10839C.add(Integer.valueOf(c6349f.m25095r()));
                            break;
                        case 250:
                            int iM25086i = c6349f.m25086i(c6349f.m25103z());
                            if ((i10 & 256) != 256 && c6349f.m25083e() > 0) {
                                this.f10839C = new ArrayList();
                                i10 |= 256;
                            }
                            while (c6349f.m25083e() > 0) {
                                this.f10839C.add(Integer.valueOf(c6349f.m25095r()));
                            }
                            c6349f.m25085h(iM25086i);
                            break;
                        case 258:
                            if ((i10 & 512) != 512) {
                                this.f10840D = new ArrayList();
                                i10 |= 512;
                            }
                            this.f10840D.add(c6349f.m25097t(C3771d.f10527y, c6351h));
                            break;
                        default:
                            Mo25224p = mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J);
                            if (Mo25224p == 0) {
                                z10 = true;
                            }
                            break;
                    }
                } catch (Throwable th2) {
                    if ((i10 & 4) == 4) {
                        this.f10847w = Collections.unmodifiableList(this.f10847w);
                    }
                    if ((i10 & 128) == Mo25224p) {
                        this.f10838B = Collections.unmodifiableList(this.f10838B);
                    }
                    if ((i10 & 256) == 256) {
                        this.f10839C = Collections.unmodifiableList(this.f10839C);
                    }
                    if ((i10 & 512) == 512) {
                        this.f10840D = Collections.unmodifiableList(this.f10840D);
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f10843s = bVarM25040t.m25058h();
                        throw th3;
                    }
                    this.f10843s = bVarM25040t.m25058h();
                    mo25223m();
                    throw th2;
                }
            } catch (C6355l e10) {
                throw e10.m25261i(this);
            } catch (IOException e11) {
                throw new C6355l(e11.getMessage()).m25261i(this);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public static C3786s m14891V() {
        return f10835G;
    }

    /* JADX INFO: renamed from: n0 */
    private void m14892n0() {
        this.f10845u = 6;
        this.f10846v = 0;
        List list = Collections.EMPTY_LIST;
        this.f10847w = list;
        this.f10848x = C3785r.m14785X();
        this.f10849y = 0;
        this.f10850z = C3785r.m14785X();
        this.f10837A = 0;
        this.f10838B = list;
        this.f10839C = list;
        this.f10840D = list;
    }

    /* JADX INFO: renamed from: o0 */
    public static b m14893o0() {
        return b.m14922t();
    }

    /* JADX INFO: renamed from: p0 */
    public static b m14894p0(C3786s c3786s) {
        return m14893o0().mo14019j(c3786s);
    }

    /* JADX INFO: renamed from: r0 */
    public static C3786s m14895r0(InputStream inputStream, C6351h c6351h) {
        return (C3786s) f10836H.mo25022b(inputStream, c6351h);
    }

    /* JADX INFO: renamed from: Q */
    public C3769b m14896Q(int i10) {
        return (C3769b) this.f10838B.get(i10);
    }

    /* JADX INFO: renamed from: R */
    public int m14897R() {
        return this.f10838B.size();
    }

    /* JADX INFO: renamed from: S */
    public List m14898S() {
        return this.f10838B;
    }

    /* JADX INFO: renamed from: T */
    public C3771d m14899T(int i10) {
        return (C3771d) this.f10840D.get(i10);
    }

    /* JADX INFO: renamed from: U */
    public int m14900U() {
        return this.f10840D.size();
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public C3786s mo14181b() {
        return f10835G;
    }

    /* JADX INFO: renamed from: X */
    public C3785r m14902X() {
        return this.f10850z;
    }

    /* JADX INFO: renamed from: Y */
    public int m14903Y() {
        return this.f10837A;
    }

    /* JADX INFO: renamed from: Z */
    public int m14904Z() {
        return this.f10845u;
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10841E;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!m14915k0()) {
            this.f10841E = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m14907c0(); i10++) {
            if (!m14906b0(i10).mo13991a()) {
                this.f10841E = (byte) 0;
                return false;
            }
        }
        if (m14916l0() && !m14909e0().mo13991a()) {
            this.f10841E = (byte) 0;
            return false;
        }
        if (m14912h0() && !m14902X().mo13991a()) {
            this.f10841E = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < m14897R(); i11++) {
            if (!m14896Q(i11).mo13991a()) {
                this.f10841E = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < m14900U(); i12++) {
            if (!m14899T(i12).mo13991a()) {
                this.f10841E = (byte) 0;
                return false;
            }
        }
        if (m25232s()) {
            this.f10841E = (byte) 1;
            return true;
        }
        this.f10841E = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public int m14905a0() {
        return this.f10846v;
    }

    /* JADX INFO: renamed from: b0 */
    public C3787t m14906b0(int i10) {
        return (C3787t) this.f10847w.get(i10);
    }

    /* JADX INFO: renamed from: c0 */
    public int m14907c0() {
        return this.f10847w.size();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10844t & 1) == 1) {
            c6350g.m25155Z(1, this.f10845u);
        }
        if ((this.f10844t & 2) == 2) {
            c6350g.m25155Z(2, this.f10846v);
        }
        for (int i10 = 0; i10 < this.f10847w.size(); i10++) {
            c6350g.m25158c0(3, (InterfaceC6360q) this.f10847w.get(i10));
        }
        if ((this.f10844t & 4) == 4) {
            c6350g.m25158c0(4, this.f10848x);
        }
        if ((this.f10844t & 8) == 8) {
            c6350g.m25155Z(5, this.f10849y);
        }
        if ((this.f10844t & 16) == 16) {
            c6350g.m25158c0(6, this.f10850z);
        }
        if ((this.f10844t & 32) == 32) {
            c6350g.m25155Z(7, this.f10837A);
        }
        for (int i11 = 0; i11 < this.f10838B.size(); i11++) {
            c6350g.m25158c0(8, (InterfaceC6360q) this.f10838B.get(i11));
        }
        for (int i12 = 0; i12 < this.f10839C.size(); i12++) {
            c6350g.m25155Z(31, ((Integer) this.f10839C.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f10840D.size(); i13++) {
            c6350g.m25158c0(32, (InterfaceC6360q) this.f10840D.get(i13));
        }
        aVarM25238y.m25240a(200, c6350g);
        c6350g.m25163h0(this.f10843s);
    }

    /* JADX INFO: renamed from: d0 */
    public List m14908d0() {
        return this.f10847w;
    }

    /* JADX INFO: renamed from: e0 */
    public C3785r m14909e0() {
        return this.f10848x;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10842F;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10844t & 1) == 1 ? C6350g.m25126o(1, this.f10845u) : 0;
        if ((this.f10844t & 2) == 2) {
            iM25126o += C6350g.m25126o(2, this.f10846v);
        }
        for (int i11 = 0; i11 < this.f10847w.size(); i11++) {
            iM25126o += C6350g.m25129r(3, (InterfaceC6360q) this.f10847w.get(i11));
        }
        if ((this.f10844t & 4) == 4) {
            iM25126o += C6350g.m25129r(4, this.f10848x);
        }
        if ((this.f10844t & 8) == 8) {
            iM25126o += C6350g.m25126o(5, this.f10849y);
        }
        if ((this.f10844t & 16) == 16) {
            iM25126o += C6350g.m25129r(6, this.f10850z);
        }
        if ((this.f10844t & 32) == 32) {
            iM25126o += C6350g.m25126o(7, this.f10837A);
        }
        for (int i12 = 0; i12 < this.f10838B.size(); i12++) {
            iM25126o += C6350g.m25129r(8, (InterfaceC6360q) this.f10838B.get(i12));
        }
        int iM25127p = 0;
        for (int i13 = 0; i13 < this.f10839C.size(); i13++) {
            iM25127p += C6350g.m25127p(((Integer) this.f10839C.get(i13)).intValue());
        }
        int size = iM25126o + iM25127p + (m14911g0().size() * 2);
        for (int i14 = 0; i14 < this.f10840D.size(); i14++) {
            size += C6350g.m25129r(32, (InterfaceC6360q) this.f10840D.get(i14));
        }
        int iM25233t = size + m25233t() + this.f10843s.size();
        this.f10842F = iM25233t;
        return iM25233t;
    }

    /* JADX INFO: renamed from: f0 */
    public int m14910f0() {
        return this.f10849y;
    }

    /* JADX INFO: renamed from: g0 */
    public List m14911g0() {
        return this.f10839C;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m14912h0() {
        return (this.f10844t & 16) == 16;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m14913i0() {
        return (this.f10844t & 32) == 32;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m14914j0() {
        return (this.f10844t & 1) == 1;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m14915k0() {
        return (this.f10844t & 2) == 2;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m14916l0() {
        return (this.f10844t & 4) == 4;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m14917m0() {
        return (this.f10844t & 8) == 8;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14893o0();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14894p0(this);
    }

    /* JADX INFO: renamed from: ja.s$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: A */
        public int f10851A;

        /* JADX INFO: renamed from: B */
        public List f10852B;

        /* JADX INFO: renamed from: C */
        public List f10853C;

        /* JADX INFO: renamed from: D */
        public List f10854D;

        /* JADX INFO: renamed from: t */
        public int f10855t;

        /* JADX INFO: renamed from: u */
        public int f10856u = 6;

        /* JADX INFO: renamed from: v */
        public int f10857v;

        /* JADX INFO: renamed from: w */
        public List f10858w;

        /* JADX INFO: renamed from: x */
        public C3785r f10859x;

        /* JADX INFO: renamed from: y */
        public int f10860y;

        /* JADX INFO: renamed from: z */
        public C3785r f10861z;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f10858w = list;
            this.f10859x = C3785r.m14785X();
            this.f10861z = C3785r.m14785X();
            this.f10852B = list;
            this.f10853C = list;
            this.f10854D = list;
            m14926y();
        }

        /* JADX INFO: renamed from: t */
        public static b m14922t() {
            return new b();
        }

        /* JADX INFO: renamed from: v */
        private void m14923v() {
            if ((this.f10855t & 512) != 512) {
                this.f10854D = new ArrayList(this.f10854D);
                this.f10855t |= 512;
            }
        }

        /* JADX INFO: renamed from: w */
        private void m14924w() {
            if ((this.f10855t & 4) != 4) {
                this.f10858w = new ArrayList(this.f10858w);
                this.f10855t |= 4;
            }
        }

        /* JADX INFO: renamed from: x */
        private void m14925x() {
            if ((this.f10855t & 256) != 256) {
                this.f10853C = new ArrayList(this.f10853C);
                this.f10855t |= 256;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3786s c3786s) {
            if (c3786s == C3786s.m14891V()) {
                return this;
            }
            if (c3786s.m14914j0()) {
                m14931E(c3786s.m14904Z());
            }
            if (c3786s.m14915k0()) {
                m14932F(c3786s.m14905a0());
            }
            if (!c3786s.f10847w.isEmpty()) {
                if (this.f10858w.isEmpty()) {
                    this.f10858w = c3786s.f10847w;
                    this.f10855t &= -5;
                } else {
                    m14924w();
                    this.f10858w.addAll(c3786s.f10847w);
                }
            }
            if (c3786s.m14916l0()) {
                m14929C(c3786s.m14909e0());
            }
            if (c3786s.m14917m0()) {
                m14933G(c3786s.m14910f0());
            }
            if (c3786s.m14912h0()) {
                m14938z(c3786s.m14902X());
            }
            if (c3786s.m14913i0()) {
                m14930D(c3786s.m14903Y());
            }
            if (!c3786s.f10838B.isEmpty()) {
                if (this.f10852B.isEmpty()) {
                    this.f10852B = c3786s.f10838B;
                    this.f10855t &= -129;
                } else {
                    m14937u();
                    this.f10852B.addAll(c3786s.f10838B);
                }
            }
            if (!c3786s.f10839C.isEmpty()) {
                if (this.f10853C.isEmpty()) {
                    this.f10853C = c3786s.f10839C;
                    this.f10855t &= -257;
                } else {
                    m14925x();
                    this.f10853C.addAll(c3786s.f10839C);
                }
            }
            if (!c3786s.f10840D.isEmpty()) {
                if (this.f10854D.isEmpty()) {
                    this.f10854D = c3786s.f10840D;
                    this.f10855t &= -513;
                } else {
                    m14923v();
                    this.f10854D.addAll(c3786s.f10840D);
                }
            }
            m25230o(c3786s);
            m25226k(m25225i().m25043c(c3786s.f10843s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3786s.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3786s.f10836H     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.s r3 = (p143ja.C3786s) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.s r4 = (p143ja.C3786s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3786s.b.mo14018e(qa.f, qa.h):ja.s$b");
        }

        /* JADX INFO: renamed from: C */
        public b m14929C(C3785r c3785r) {
            if ((this.f10855t & 8) != 8 || this.f10859x == C3785r.m14785X()) {
                this.f10859x = c3785r;
            } else {
                this.f10859x = C3785r.m14788y0(this.f10859x).mo14019j(c3785r).m14869r();
            }
            this.f10855t |= 8;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m14930D(int i10) {
            this.f10855t |= 64;
            this.f10851A = i10;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public b m14931E(int i10) {
            this.f10855t |= 1;
            this.f10856u = i10;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public b m14932F(int i10) {
            this.f10855t |= 2;
            this.f10857v = i10;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public b m14933G(int i10) {
            this.f10855t |= 16;
            this.f10860y = i10;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3786s build() {
            C3786s c3786sM14935r = m14935r();
            if (c3786sM14935r.mo13991a()) {
                return c3786sM14935r;
            }
            throw AbstractC6344a.a.m25020h(c3786sM14935r);
        }

        /* JADX INFO: renamed from: r */
        public C3786s m14935r() {
            C3786s c3786s = new C3786s(this);
            int i10 = this.f10855t;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3786s.f10845u = this.f10856u;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3786s.f10846v = this.f10857v;
            if ((this.f10855t & 4) == 4) {
                this.f10858w = Collections.unmodifiableList(this.f10858w);
                this.f10855t &= -5;
            }
            c3786s.f10847w = this.f10858w;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            c3786s.f10848x = this.f10859x;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            c3786s.f10849y = this.f10860y;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            c3786s.f10850z = this.f10861z;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3786s.f10837A = this.f10851A;
            if ((this.f10855t & 128) == 128) {
                this.f10852B = Collections.unmodifiableList(this.f10852B);
                this.f10855t &= -129;
            }
            c3786s.f10838B = this.f10852B;
            if ((this.f10855t & 256) == 256) {
                this.f10853C = Collections.unmodifiableList(this.f10853C);
                this.f10855t &= -257;
            }
            c3786s.f10839C = this.f10853C;
            if ((this.f10855t & 512) == 512) {
                this.f10854D = Collections.unmodifiableList(this.f10854D);
                this.f10855t &= -513;
            }
            c3786s.f10840D = this.f10854D;
            c3786s.f10844t = i11;
            return c3786s;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14922t().mo14019j(m14935r());
        }

        /* JADX INFO: renamed from: u */
        public final void m14937u() {
            if ((this.f10855t & 128) != 128) {
                this.f10852B = new ArrayList(this.f10852B);
                this.f10855t |= 128;
            }
        }

        /* JADX INFO: renamed from: z */
        public b m14938z(C3785r c3785r) {
            if ((this.f10855t & 32) != 32 || this.f10861z == C3785r.m14785X()) {
                this.f10861z = c3785r;
            } else {
                this.f10861z = C3785r.m14788y0(this.f10861z).mo14019j(c3785r).m14869r();
            }
            this.f10855t |= 32;
            return this;
        }

        /* JADX INFO: renamed from: y */
        private void m14926y() {
        }
    }

    public C3786s(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10841E = (byte) -1;
        this.f10842F = -1;
        this.f10843s = cVar.m25225i();
    }

    public C3786s(boolean z10) {
        this.f10841E = (byte) -1;
        this.f10842F = -1;
        this.f10843s = AbstractC6348e.f19966q;
    }
}
