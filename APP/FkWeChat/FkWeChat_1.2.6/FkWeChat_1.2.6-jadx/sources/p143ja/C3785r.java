package p143ja;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.p218ws.WebSocketProtocol;
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

/* JADX INFO: renamed from: ja.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3785r extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: K */
    public static final C3785r f10780K;

    /* JADX INFO: renamed from: L */
    public static InterfaceC6362s f10781L = new a();

    /* JADX INFO: renamed from: A */
    public int f10782A;

    /* JADX INFO: renamed from: B */
    public int f10783B;

    /* JADX INFO: renamed from: C */
    public int f10784C;

    /* JADX INFO: renamed from: D */
    public C3785r f10785D;

    /* JADX INFO: renamed from: E */
    public int f10786E;

    /* JADX INFO: renamed from: F */
    public C3785r f10787F;

    /* JADX INFO: renamed from: G */
    public int f10788G;

    /* JADX INFO: renamed from: H */
    public int f10789H;

    /* JADX INFO: renamed from: I */
    public byte f10790I;

    /* JADX INFO: renamed from: J */
    public int f10791J;

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10792s;

    /* JADX INFO: renamed from: t */
    public int f10793t;

    /* JADX INFO: renamed from: u */
    public List f10794u;

    /* JADX INFO: renamed from: v */
    public boolean f10795v;

    /* JADX INFO: renamed from: w */
    public int f10796w;

    /* JADX INFO: renamed from: x */
    public C3785r f10797x;

    /* JADX INFO: renamed from: y */
    public int f10798y;

    /* JADX INFO: renamed from: z */
    public int f10799z;

    /* JADX INFO: renamed from: ja.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3785r mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3785r(c6349f, c6351h);
        }
    }

    static {
        C3785r c3785r = new C3785r(true);
        f10780K = c3785r;
        c3785r.m14786w0();
    }

    public C3785r(C6349f c6349f, C6351h c6351h) {
        c cVarMo13992c;
        this.f10790I = (byte) -1;
        this.f10791J = -1;
        m14786w0();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    switch (iM25071J) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f10793t |= 4096;
                            this.f10789H = c6349f.m25095r();
                            break;
                        case Opcodes.LDC /* 18 */:
                            if (!z11) {
                                this.f10794u = new ArrayList();
                                z11 = true;
                            }
                            this.f10794u.add(c6349f.m25097t(b.f10801z, c6351h));
                            break;
                        case Opcodes.DLOAD /* 24 */:
                            this.f10793t |= 1;
                            this.f10795v = c6349f.m25087j();
                            break;
                        case 32:
                            this.f10793t |= 2;
                            this.f10796w = c6349f.m25095r();
                            break;
                        case 42:
                            cVarMo13992c = (this.f10793t & 4) == 4 ? this.f10797x.mo13992c() : null;
                            C3785r c3785r = (C3785r) c6349f.m25097t(f10781L, c6351h);
                            this.f10797x = c3785r;
                            if (cVarMo13992c != null) {
                                cVarMo13992c.mo14019j(c3785r);
                                this.f10797x = cVarMo13992c.m14869r();
                            }
                            this.f10793t |= 4;
                            break;
                        case 48:
                            this.f10793t |= 16;
                            this.f10799z = c6349f.m25095r();
                            break;
                        case Opcodes.FSTORE /* 56 */:
                            this.f10793t |= 32;
                            this.f10782A = c6349f.m25095r();
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                            this.f10793t |= 8;
                            this.f10798y = c6349f.m25095r();
                            break;
                        case 72:
                            this.f10793t |= 64;
                            this.f10783B = c6349f.m25095r();
                            break;
                        case 82:
                            cVarMo13992c = (this.f10793t & 256) == 256 ? this.f10785D.mo13992c() : null;
                            C3785r c3785r2 = (C3785r) c6349f.m25097t(f10781L, c6351h);
                            this.f10785D = c3785r2;
                            if (cVarMo13992c != null) {
                                cVarMo13992c.mo14019j(c3785r2);
                                this.f10785D = cVarMo13992c.m14869r();
                            }
                            this.f10793t |= 256;
                            break;
                        case Opcodes.POP2 /* 88 */:
                            this.f10793t |= 512;
                            this.f10786E = c6349f.m25095r();
                            break;
                        case Opcodes.IADD /* 96 */:
                            this.f10793t |= 128;
                            this.f10784C = c6349f.m25095r();
                            break;
                        case 106:
                            cVarMo13992c = (this.f10793t & 1024) == 1024 ? this.f10787F.mo13992c() : null;
                            C3785r c3785r3 = (C3785r) c6349f.m25097t(f10781L, c6351h);
                            this.f10787F = c3785r3;
                            if (cVarMo13992c != null) {
                                cVarMo13992c.mo14019j(c3785r3);
                                this.f10787F = cVarMo13992c.m14869r();
                            }
                            this.f10793t |= 1024;
                            break;
                        case Opcodes.IREM /* 112 */:
                            this.f10793t |= 2048;
                            this.f10788G = c6349f.m25095r();
                            break;
                        default:
                            if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                                z10 = true;
                            }
                            break;
                    }
                } catch (Throwable th) {
                    if (z11) {
                        this.f10794u = Collections.unmodifiableList(this.f10794u);
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10792s = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10792s = bVarM25040t.m25058h();
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
            this.f10794u = Collections.unmodifiableList(this.f10794u);
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10792s = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10792s = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: X */
    public static C3785r m14785X() {
        return f10780K;
    }

    /* JADX INFO: renamed from: w0 */
    private void m14786w0() {
        this.f10794u = Collections.EMPTY_LIST;
        this.f10795v = false;
        this.f10796w = 0;
        this.f10797x = m14785X();
        this.f10798y = 0;
        this.f10799z = 0;
        this.f10782A = 0;
        this.f10783B = 0;
        this.f10784C = 0;
        this.f10785D = m14785X();
        this.f10786E = 0;
        this.f10787F = m14785X();
        this.f10788G = 0;
        this.f10789H = 0;
    }

    /* JADX INFO: renamed from: x0 */
    public static c m14787x0() {
        return c.m14854t();
    }

    /* JADX INFO: renamed from: y0 */
    public static c m14788y0(C3785r c3785r) {
        return m14787x0().mo14019j(c3785r);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public c mo13992c() {
        return m14788y0(this);
    }

    /* JADX INFO: renamed from: R */
    public C3785r m14790R() {
        return this.f10787F;
    }

    /* JADX INFO: renamed from: S */
    public int m14791S() {
        return this.f10788G;
    }

    /* JADX INFO: renamed from: T */
    public b m14792T(int i10) {
        return (b) this.f10794u.get(i10);
    }

    /* JADX INFO: renamed from: U */
    public int m14793U() {
        return this.f10794u.size();
    }

    /* JADX INFO: renamed from: V */
    public List m14794V() {
        return this.f10794u;
    }

    /* JADX INFO: renamed from: W */
    public int m14795W() {
        return this.f10799z;
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public C3785r mo14181b() {
        return f10780K;
    }

    /* JADX INFO: renamed from: Z */
    public int m14797Z() {
        return this.f10789H;
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10790I;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < m14793U(); i10++) {
            if (!m14792T(i10).mo13991a()) {
                this.f10790I = (byte) 0;
                return false;
            }
        }
        if (m14812o0() && !m14799b0().mo13991a()) {
            this.f10790I = (byte) 0;
            return false;
        }
        if (m14815r0() && !m14802e0().mo13991a()) {
            this.f10790I = (byte) 0;
            return false;
        }
        if (m14807j0() && !m14790R().mo13991a()) {
            this.f10790I = (byte) 0;
            return false;
        }
        if (m25232s()) {
            this.f10790I = (byte) 1;
            return true;
        }
        this.f10790I = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public int m14798a0() {
        return this.f10796w;
    }

    /* JADX INFO: renamed from: b0 */
    public C3785r m14799b0() {
        return this.f10797x;
    }

    /* JADX INFO: renamed from: c0 */
    public int m14800c0() {
        return this.f10798y;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10793t & 4096) == 4096) {
            c6350g.m25155Z(1, this.f10789H);
        }
        for (int i10 = 0; i10 < this.f10794u.size(); i10++) {
            c6350g.m25158c0(2, (InterfaceC6360q) this.f10794u.get(i10));
        }
        if ((this.f10793t & 1) == 1) {
            c6350g.m25140K(3, this.f10795v);
        }
        if ((this.f10793t & 2) == 2) {
            c6350g.m25155Z(4, this.f10796w);
        }
        if ((this.f10793t & 4) == 4) {
            c6350g.m25158c0(5, this.f10797x);
        }
        if ((this.f10793t & 16) == 16) {
            c6350g.m25155Z(6, this.f10799z);
        }
        if ((this.f10793t & 32) == 32) {
            c6350g.m25155Z(7, this.f10782A);
        }
        if ((this.f10793t & 8) == 8) {
            c6350g.m25155Z(8, this.f10798y);
        }
        if ((this.f10793t & 64) == 64) {
            c6350g.m25155Z(9, this.f10783B);
        }
        if ((this.f10793t & 256) == 256) {
            c6350g.m25158c0(10, this.f10785D);
        }
        if ((this.f10793t & 512) == 512) {
            c6350g.m25155Z(11, this.f10786E);
        }
        if ((this.f10793t & 128) == 128) {
            c6350g.m25155Z(12, this.f10784C);
        }
        if ((this.f10793t & 1024) == 1024) {
            c6350g.m25158c0(13, this.f10787F);
        }
        if ((this.f10793t & 2048) == 2048) {
            c6350g.m25155Z(14, this.f10788G);
        }
        aVarM25238y.m25240a(200, c6350g);
        c6350g.m25163h0(this.f10792s);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m14801d0() {
        return this.f10795v;
    }

    /* JADX INFO: renamed from: e0 */
    public C3785r m14802e0() {
        return this.f10785D;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10791J;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10793t & 4096) == 4096 ? C6350g.m25126o(1, this.f10789H) : 0;
        for (int i11 = 0; i11 < this.f10794u.size(); i11++) {
            iM25126o += C6350g.m25129r(2, (InterfaceC6360q) this.f10794u.get(i11));
        }
        if ((this.f10793t & 1) == 1) {
            iM25126o += C6350g.m25112a(3, this.f10795v);
        }
        if ((this.f10793t & 2) == 2) {
            iM25126o += C6350g.m25126o(4, this.f10796w);
        }
        if ((this.f10793t & 4) == 4) {
            iM25126o += C6350g.m25129r(5, this.f10797x);
        }
        if ((this.f10793t & 16) == 16) {
            iM25126o += C6350g.m25126o(6, this.f10799z);
        }
        if ((this.f10793t & 32) == 32) {
            iM25126o += C6350g.m25126o(7, this.f10782A);
        }
        if ((this.f10793t & 8) == 8) {
            iM25126o += C6350g.m25126o(8, this.f10798y);
        }
        if ((this.f10793t & 64) == 64) {
            iM25126o += C6350g.m25126o(9, this.f10783B);
        }
        if ((this.f10793t & 256) == 256) {
            iM25126o += C6350g.m25129r(10, this.f10785D);
        }
        if ((this.f10793t & 512) == 512) {
            iM25126o += C6350g.m25126o(11, this.f10786E);
        }
        if ((this.f10793t & 128) == 128) {
            iM25126o += C6350g.m25126o(12, this.f10784C);
        }
        if ((this.f10793t & 1024) == 1024) {
            iM25126o += C6350g.m25129r(13, this.f10787F);
        }
        if ((this.f10793t & 2048) == 2048) {
            iM25126o += C6350g.m25126o(14, this.f10788G);
        }
        int iM25233t = iM25126o + m25233t() + this.f10792s.size();
        this.f10791J = iM25233t;
        return iM25233t;
    }

    /* JADX INFO: renamed from: f0 */
    public int m14803f0() {
        return this.f10786E;
    }

    /* JADX INFO: renamed from: g0 */
    public int m14804g0() {
        return this.f10784C;
    }

    /* JADX INFO: renamed from: h0 */
    public int m14805h0() {
        return this.f10782A;
    }

    /* JADX INFO: renamed from: i0 */
    public int m14806i0() {
        return this.f10783B;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m14807j0() {
        return (this.f10793t & 1024) == 1024;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m14808k0() {
        return (this.f10793t & 2048) == 2048;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m14809l0() {
        return (this.f10793t & 16) == 16;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m14810m0() {
        return (this.f10793t & 4096) == 4096;
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m14811n0() {
        return (this.f10793t & 2) == 2;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m14812o0() {
        return (this.f10793t & 4) == 4;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m14813p0() {
        return (this.f10793t & 8) == 8;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m14814q0() {
        return (this.f10793t & 1) == 1;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m14815r0() {
        return (this.f10793t & 256) == 256;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m14816s0() {
        return (this.f10793t & 512) == 512;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m14817t0() {
        return (this.f10793t & 128) == 128;
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m14818u0() {
        return (this.f10793t & 32) == 32;
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m14819v0() {
        return (this.f10793t & 64) == 64;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public c mo13995g() {
        return m14787x0();
    }

    /* JADX INFO: renamed from: ja.r$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j implements InterfaceC6361r {

        /* JADX INFO: renamed from: y */
        public static final b f10800y;

        /* JADX INFO: renamed from: z */
        public static InterfaceC6362s f10801z = new a();

        /* JADX INFO: renamed from: r */
        public final AbstractC6348e f10802r;

        /* JADX INFO: renamed from: s */
        public int f10803s;

        /* JADX INFO: renamed from: t */
        public c f10804t;

        /* JADX INFO: renamed from: u */
        public C3785r f10805u;

        /* JADX INFO: renamed from: v */
        public int f10806v;

        /* JADX INFO: renamed from: w */
        public byte f10807w;

        /* JADX INFO: renamed from: x */
        public int f10808x;

        /* JADX INFO: renamed from: ja.r$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a extends AbstractC6345b {
            @Override // qa.InterfaceC6362s
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b mo13999c(C6349f c6349f, C6351h c6351h) {
                return new b(c6349f, c6351h);
            }
        }

        /* JADX INFO: renamed from: ja.r$b$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum c implements AbstractC6354k.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* JADX INFO: renamed from: v */
            public static AbstractC6354k.b f10817v = new a();

            /* JADX INFO: renamed from: q */
            public final int f10819q;

            /* JADX INFO: renamed from: ja.r$b$c$a */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static class a implements AbstractC6354k.b {
                @Override // qa.AbstractC6354k.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c mo14093a(int i10) {
                    return c.m14851a(i10);
                }
            }

            c(int i10, int i11) {
                this.f10819q = i11;
            }

            /* JADX INFO: renamed from: a */
            public static c m14851a(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // qa.AbstractC6354k.a
            /* JADX INFO: renamed from: b */
            public final int mo14092b() {
                return this.f10819q;
            }
        }

        static {
            b bVar = new b(true);
            f10800y = bVar;
            bVar.m14822D();
        }

        public b(C6349f c6349f, C6351h c6351h) {
            this.f10807w = (byte) -1;
            this.f10808x = -1;
            m14822D();
            AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
            C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iM25071J = c6349f.m25071J();
                            if (iM25071J != 0) {
                                if (iM25071J == 8) {
                                    int iM25090m = c6349f.m25090m();
                                    c cVarM14851a = c.m14851a(iM25090m);
                                    if (cVarM14851a == null) {
                                        c6350gM25111I.m25169n0(iM25071J);
                                        c6350gM25111I.m25169n0(iM25090m);
                                    } else {
                                        this.f10803s |= 1;
                                        this.f10804t = cVarM14851a;
                                    }
                                } else if (iM25071J == 18) {
                                    c cVarMo13992c = (this.f10803s & 2) == 2 ? this.f10805u.mo13992c() : null;
                                    C3785r c3785r = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                                    this.f10805u = c3785r;
                                    if (cVarMo13992c != null) {
                                        cVarMo13992c.mo14019j(c3785r);
                                        this.f10805u = cVarMo13992c.m14869r();
                                    }
                                    this.f10803s |= 2;
                                } else if (iM25071J == 24) {
                                    this.f10803s |= 4;
                                    this.f10806v = c6349f.m25095r();
                                } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new C6355l(e10.getMessage()).m25261i(this);
                        }
                    } catch (C6355l e11) {
                        throw e11.m25261i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10802r = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10802r = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            }
            try {
                c6350gM25111I.m25138H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f10802r = bVarM25040t.m25058h();
                throw th3;
            }
            this.f10802r = bVarM25040t.m25058h();
            mo25223m();
        }

        /* JADX INFO: renamed from: D */
        private void m14822D() {
            this.f10804t = c.INV;
            this.f10805u = C3785r.m14785X();
            this.f10806v = 0;
        }

        /* JADX INFO: renamed from: E */
        public static C10126b m14823E() {
            return C10126b.m14841p();
        }

        /* JADX INFO: renamed from: F */
        public static C10126b m14824F(b bVar) {
            return m14823E().mo14019j(bVar);
        }

        /* JADX INFO: renamed from: w */
        public static b m14830w() {
            return f10800y;
        }

        /* JADX INFO: renamed from: A */
        public boolean m14831A() {
            return (this.f10803s & 1) == 1;
        }

        /* JADX INFO: renamed from: B */
        public boolean m14832B() {
            return (this.f10803s & 2) == 2;
        }

        /* JADX INFO: renamed from: C */
        public boolean m14833C() {
            return (this.f10803s & 4) == 4;
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public C10126b mo13995g() {
            return m14823E();
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public C10126b mo13992c() {
            return m14824F(this);
        }

        @Override // qa.InterfaceC6361r
        /* JADX INFO: renamed from: a */
        public final boolean mo13991a() {
            byte b10 = this.f10807w;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!m14832B() || m14837y().mo13991a()) {
                this.f10807w = (byte) 1;
                return true;
            }
            this.f10807w = (byte) 0;
            return false;
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: d */
        public void mo13993d(C6350g c6350g) throws IOException {
            mo13994f();
            if ((this.f10803s & 1) == 1) {
                c6350g.m25147R(1, this.f10804t.mo14092b());
            }
            if ((this.f10803s & 2) == 2) {
                c6350g.m25158c0(2, this.f10805u);
            }
            if ((this.f10803s & 4) == 4) {
                c6350g.m25155Z(3, this.f10806v);
            }
            c6350g.m25163h0(this.f10802r);
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: f */
        public int mo13994f() {
            int i10 = this.f10808x;
            if (i10 != -1) {
                return i10;
            }
            int iM25119h = (this.f10803s & 1) == 1 ? C6350g.m25119h(1, this.f10804t.mo14092b()) : 0;
            if ((this.f10803s & 2) == 2) {
                iM25119h += C6350g.m25129r(2, this.f10805u);
            }
            if ((this.f10803s & 4) == 4) {
                iM25119h += C6350g.m25126o(3, this.f10806v);
            }
            int size = iM25119h + this.f10802r.size();
            this.f10808x = size;
            return size;
        }

        /* JADX INFO: renamed from: x */
        public c m14836x() {
            return this.f10804t;
        }

        /* JADX INFO: renamed from: y */
        public C3785r m14837y() {
            return this.f10805u;
        }

        /* JADX INFO: renamed from: z */
        public int m14838z() {
            return this.f10806v;
        }

        /* JADX INFO: renamed from: ja.r$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10126b extends AbstractC6353j.b implements InterfaceC6361r {

            /* JADX INFO: renamed from: r */
            public int f10809r;

            /* JADX INFO: renamed from: s */
            public c f10810s = c.INV;

            /* JADX INFO: renamed from: t */
            public C3785r f10811t = C3785r.m14785X();

            /* JADX INFO: renamed from: u */
            public int f10812u;

            public C10126b() {
                m14842q();
            }

            /* JADX INFO: renamed from: p */
            public static C10126b m14841p() {
                return new C10126b();
            }

            @Override // qa.InterfaceC6360q.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarM14844n = m14844n();
                if (bVarM14844n.mo13991a()) {
                    return bVarM14844n;
                }
                throw AbstractC6344a.a.m25020h(bVarM14844n);
            }

            /* JADX INFO: renamed from: n */
            public b m14844n() {
                b bVar = new b(this);
                int i10 = this.f10809r;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f10804t = this.f10810s;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f10805u = this.f10811t;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.f10806v = this.f10812u;
                bVar.f10803s = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C10126b clone() {
                return m14841p().mo14019j(m14844n());
            }

            @Override // qa.AbstractC6353j.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C10126b mo14019j(b bVar) {
                if (bVar == b.m14830w()) {
                    return this;
                }
                if (bVar.m14831A()) {
                    m14849u(bVar.m14836x());
                }
                if (bVar.m14832B()) {
                    m14848t(bVar.m14837y());
                }
                if (bVar.m14833C()) {
                    m14850v(bVar.m14838z());
                }
                m25226k(m25225i().m25043c(bVar.f10802r));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // qa.InterfaceC6360q.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public p143ja.C3785r.b.C10126b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    qa.s r1 = p143ja.C3785r.b.f10801z     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                    java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                    ja.r$b r3 = (p143ja.C3785r.b) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                    ja.r$b r4 = (p143ja.C3785r.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: p143ja.C3785r.b.C10126b.mo14018e(qa.f, qa.h):ja.r$b$b");
            }

            /* JADX INFO: renamed from: t */
            public C10126b m14848t(C3785r c3785r) {
                if ((this.f10809r & 2) != 2 || this.f10811t == C3785r.m14785X()) {
                    this.f10811t = c3785r;
                } else {
                    this.f10811t = C3785r.m14788y0(this.f10811t).mo14019j(c3785r).m14869r();
                }
                this.f10809r |= 2;
                return this;
            }

            /* JADX INFO: renamed from: u */
            public C10126b m14849u(c cVar) {
                cVar.getClass();
                this.f10809r |= 1;
                this.f10810s = cVar;
                return this;
            }

            /* JADX INFO: renamed from: v */
            public C10126b m14850v(int i10) {
                this.f10809r |= 4;
                this.f10812u = i10;
                return this;
            }

            /* JADX INFO: renamed from: q */
            private void m14842q() {
            }
        }

        public b(AbstractC6353j.b bVar) {
            super(bVar);
            this.f10807w = (byte) -1;
            this.f10808x = -1;
            this.f10802r = bVar.m25225i();
        }

        public b(boolean z10) {
            this.f10807w = (byte) -1;
            this.f10808x = -1;
            this.f10802r = AbstractC6348e.f19966q;
        }
    }

    /* JADX INFO: renamed from: ja.r$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: A */
        public int f10820A;

        /* JADX INFO: renamed from: B */
        public int f10821B;

        /* JADX INFO: renamed from: C */
        public int f10822C;

        /* JADX INFO: renamed from: E */
        public int f10824E;

        /* JADX INFO: renamed from: G */
        public int f10826G;

        /* JADX INFO: renamed from: H */
        public int f10827H;

        /* JADX INFO: renamed from: t */
        public int f10828t;

        /* JADX INFO: renamed from: v */
        public boolean f10830v;

        /* JADX INFO: renamed from: w */
        public int f10831w;

        /* JADX INFO: renamed from: y */
        public int f10833y;

        /* JADX INFO: renamed from: z */
        public int f10834z;

        /* JADX INFO: renamed from: u */
        public List f10829u = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: x */
        public C3785r f10832x = C3785r.m14785X();

        /* JADX INFO: renamed from: D */
        public C3785r f10823D = C3785r.m14785X();

        /* JADX INFO: renamed from: F */
        public C3785r f10825F = C3785r.m14785X();

        public c() {
            m14856v();
        }

        /* JADX INFO: renamed from: t */
        public static c m14854t() {
            return new c();
        }

        /* JADX INFO: renamed from: u */
        private void m14855u() {
            if ((this.f10828t & 1) != 1) {
                this.f10829u = new ArrayList(this.f10829u);
                this.f10828t |= 1;
            }
        }

        /* JADX INFO: renamed from: A */
        public c m14857A(C3785r c3785r) {
            if ((this.f10828t & 512) != 512 || this.f10823D == C3785r.m14785X()) {
                this.f10823D = c3785r;
            } else {
                this.f10823D = C3785r.m14788y0(this.f10823D).mo14019j(c3785r).m14869r();
            }
            this.f10828t |= 512;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public c m14858B(int i10) {
            this.f10828t |= 4096;
            this.f10826G = i10;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public c m14859C(int i10) {
            this.f10828t |= 32;
            this.f10834z = i10;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public c m14860D(int i10) {
            this.f10828t |= 8192;
            this.f10827H = i10;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public c m14861E(int i10) {
            this.f10828t |= 4;
            this.f10831w = i10;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public c m14862F(int i10) {
            this.f10828t |= 16;
            this.f10833y = i10;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public c m14863G(boolean z10) {
            this.f10828t |= 2;
            this.f10830v = z10;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public c m14864H(int i10) {
            this.f10828t |= 1024;
            this.f10824E = i10;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public c m14865I(int i10) {
            this.f10828t |= 256;
            this.f10822C = i10;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public c m14866J(int i10) {
            this.f10828t |= 64;
            this.f10820A = i10;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public c m14867K(int i10) {
            this.f10828t |= 128;
            this.f10821B = i10;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3785r build() {
            C3785r c3785rM14869r = m14869r();
            if (c3785rM14869r.mo13991a()) {
                return c3785rM14869r;
            }
            throw AbstractC6344a.a.m25020h(c3785rM14869r);
        }

        /* JADX INFO: renamed from: r */
        public C3785r m14869r() {
            C3785r c3785r = new C3785r(this);
            int i10 = this.f10828t;
            if ((i10 & 1) == 1) {
                this.f10829u = Collections.unmodifiableList(this.f10829u);
                this.f10828t &= -2;
            }
            c3785r.f10794u = this.f10829u;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            c3785r.f10795v = this.f10830v;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            c3785r.f10796w = this.f10831w;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            c3785r.f10797x = this.f10832x;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            c3785r.f10798y = this.f10833y;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            c3785r.f10799z = this.f10834z;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3785r.f10782A = this.f10820A;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            c3785r.f10783B = this.f10821B;
            if ((i10 & 256) == 256) {
                i11 |= 128;
            }
            c3785r.f10784C = this.f10822C;
            if ((i10 & 512) == 512) {
                i11 |= 256;
            }
            c3785r.f10785D = this.f10823D;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            c3785r.f10786E = this.f10824E;
            if ((i10 & 2048) == 2048) {
                i11 |= 1024;
            }
            c3785r.f10787F = this.f10825F;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            c3785r.f10788G = this.f10826G;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            c3785r.f10789H = this.f10827H;
            c3785r.f10793t = i11;
            return c3785r;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return m14854t().mo14019j(m14869r());
        }

        /* JADX INFO: renamed from: w */
        public c m14871w(C3785r c3785r) {
            if ((this.f10828t & 2048) != 2048 || this.f10825F == C3785r.m14785X()) {
                this.f10825F = c3785r;
            } else {
                this.f10825F = C3785r.m14788y0(this.f10825F).mo14019j(c3785r).m14869r();
            }
            this.f10828t |= 2048;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public c m14872x(C3785r c3785r) {
            if ((this.f10828t & 8) != 8 || this.f10832x == C3785r.m14785X()) {
                this.f10832x = c3785r;
            } else {
                this.f10832x = C3785r.m14788y0(this.f10832x).mo14019j(c3785r).m14869r();
            }
            this.f10828t |= 8;
            return this;
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public c mo14019j(C3785r c3785r) {
            if (c3785r == C3785r.m14785X()) {
                return this;
            }
            if (!c3785r.f10794u.isEmpty()) {
                if (this.f10829u.isEmpty()) {
                    this.f10829u = c3785r.f10794u;
                    this.f10828t &= -2;
                } else {
                    m14855u();
                    this.f10829u.addAll(c3785r.f10794u);
                }
            }
            if (c3785r.m14814q0()) {
                m14863G(c3785r.m14801d0());
            }
            if (c3785r.m14811n0()) {
                m14861E(c3785r.m14798a0());
            }
            if (c3785r.m14812o0()) {
                m14872x(c3785r.m14799b0());
            }
            if (c3785r.m14813p0()) {
                m14862F(c3785r.m14800c0());
            }
            if (c3785r.m14809l0()) {
                m14859C(c3785r.m14795W());
            }
            if (c3785r.m14818u0()) {
                m14866J(c3785r.m14805h0());
            }
            if (c3785r.m14819v0()) {
                m14867K(c3785r.m14806i0());
            }
            if (c3785r.m14817t0()) {
                m14865I(c3785r.m14804g0());
            }
            if (c3785r.m14815r0()) {
                m14857A(c3785r.m14802e0());
            }
            if (c3785r.m14816s0()) {
                m14864H(c3785r.m14803f0());
            }
            if (c3785r.m14807j0()) {
                m14871w(c3785r.m14790R());
            }
            if (c3785r.m14808k0()) {
                m14858B(c3785r.m14791S());
            }
            if (c3785r.m14810m0()) {
                m14860D(c3785r.m14797Z());
            }
            m25230o(c3785r);
            m25226k(m25225i().m25043c(c3785r.f10792s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3785r.c mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3785r.f10781L     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.r r3 = (p143ja.C3785r) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.r r4 = (p143ja.C3785r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3785r.c.mo14018e(qa.f, qa.h):ja.r$c");
        }

        /* JADX INFO: renamed from: v */
        private void m14856v() {
        }
    }

    public C3785r(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10790I = (byte) -1;
        this.f10791J = -1;
        this.f10792s = cVar.m25225i();
    }

    public C3785r(boolean z10) {
        this.f10790I = (byte) -1;
        this.f10791J = -1;
        this.f10792s = AbstractC6348e.f19966q;
    }
}
