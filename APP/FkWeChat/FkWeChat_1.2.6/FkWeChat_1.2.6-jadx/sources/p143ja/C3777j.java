package p143ja;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.p218ws.WebSocketProtocol;
import p143ja.C3773f;
import p143ja.C3785r;
import p143ja.C3788u;
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

/* JADX INFO: renamed from: ja.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3777j extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: M */
    public static final C3777j f10623M;

    /* JADX INFO: renamed from: N */
    public static InterfaceC6362s f10624N = new a();

    /* JADX INFO: renamed from: A */
    public C3785r f10625A;

    /* JADX INFO: renamed from: B */
    public int f10626B;

    /* JADX INFO: renamed from: C */
    public List f10627C;

    /* JADX INFO: renamed from: D */
    public List f10628D;

    /* JADX INFO: renamed from: E */
    public int f10629E;

    /* JADX INFO: renamed from: F */
    public List f10630F;

    /* JADX INFO: renamed from: G */
    public C3788u f10631G;

    /* JADX INFO: renamed from: H */
    public List f10632H;

    /* JADX INFO: renamed from: I */
    public C3773f f10633I;

    /* JADX INFO: renamed from: J */
    public List f10634J;

    /* JADX INFO: renamed from: K */
    public byte f10635K;

    /* JADX INFO: renamed from: L */
    public int f10636L;

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10637s;

    /* JADX INFO: renamed from: t */
    public int f10638t;

    /* JADX INFO: renamed from: u */
    public int f10639u;

    /* JADX INFO: renamed from: v */
    public int f10640v;

    /* JADX INFO: renamed from: w */
    public int f10641w;

    /* JADX INFO: renamed from: x */
    public C3785r f10642x;

    /* JADX INFO: renamed from: y */
    public int f10643y;

    /* JADX INFO: renamed from: z */
    public List f10644z;

    /* JADX INFO: renamed from: ja.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3777j mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3777j(c6349f, c6351h);
        }
    }

    static {
        C3777j c3777j = new C3777j(true);
        f10623M = c3777j;
        c3777j.m14445E0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    public C3777j(C6349f c6349f, C6351h c6351h) {
        boolean z10;
        this.f10629E = -1;
        this.f10635K = (byte) -1;
        this.f10636L = -1;
        m14445E0();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        boolean z11 = true;
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            ?? Mo25224p = 1024;
            if (z12) {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f10644z = Collections.unmodifiableList(this.f10644z);
                }
                if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f10630F = Collections.unmodifiableList(this.f10630F);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f10627C = Collections.unmodifiableList(this.f10627C);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f10628D = Collections.unmodifiableList(this.f10628D);
                }
                if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f10632H = Collections.unmodifiableList(this.f10632H);
                }
                if (((i10 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.f10634J = Collections.unmodifiableList(this.f10634J);
                }
                try {
                    c6350gM25111I.m25138H();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f10637s = bVarM25040t.m25058h();
                    throw th;
                }
                this.f10637s = bVarM25040t.m25058h();
                mo25223m();
                return;
            }
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    switch (iM25071J) {
                        case 0:
                            z10 = z11;
                            z12 = z10;
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 8:
                            z10 = z11;
                            this.f10638t |= 2;
                            this.f10640v = c6349f.m25095r();
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 16:
                            z10 = z11;
                            this.f10638t |= 4;
                            this.f10641w = c6349f.m25095r();
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 26:
                            z10 = z11;
                            C3785r.c cVarM14789A0 = (this.f10638t & 8) == 8 ? this.f10642x.mo13992c() : null;
                            C3785r c3785r = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                            this.f10642x = c3785r;
                            if (cVarM14789A0 != null) {
                                cVarM14789A0.mo14019j(c3785r);
                                this.f10642x = cVarM14789A0.m14869r();
                            }
                            this.f10638t |= 8;
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 34:
                            z10 = z11;
                            int i11 = (i10 == true ? 1 : 0) & 32;
                            i10 = i10;
                            if (i11 != 32) {
                                this.f10644z = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 32;
                            }
                            this.f10644z.add(c6349f.m25097t(C3787t.f10863E, c6351h));
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 42:
                            z10 = z11;
                            C3785r.c cVarM14789A02 = (this.f10638t & 32) == 32 ? this.f10625A.mo13992c() : null;
                            C3785r c3785r2 = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                            this.f10625A = c3785r2;
                            if (cVarM14789A02 != null) {
                                cVarM14789A02.mo14019j(c3785r2);
                                this.f10625A = cVarM14789A02.m14869r();
                            }
                            this.f10638t |= 32;
                            z11 = z10;
                            i10 = i10;
                            break;
                        case Opcodes.AALOAD /* 50 */:
                            z10 = z11;
                            int i12 = (i10 == true ? 1 : 0) & 1024;
                            i10 = i10;
                            if (i12 != 1024) {
                                this.f10630F = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1024;
                            }
                            this.f10630F.add(c6349f.m25097t(C3789v.f10900D, c6351h));
                            z11 = z10;
                            i10 = i10;
                            break;
                        case Opcodes.FSTORE /* 56 */:
                            z10 = z11;
                            this.f10638t |= 16;
                            this.f10643y = c6349f.m25095r();
                            z11 = z10;
                            i10 = i10;
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                            z10 = z11;
                            this.f10638t |= 64;
                            this.f10626B = c6349f.m25095r();
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 72:
                            z10 = z11;
                            this.f10638t |= 1;
                            this.f10639u = c6349f.m25095r();
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 82:
                            z10 = z11;
                            int i13 = (i10 == true ? 1 : 0) & 256;
                            i10 = i10;
                            if (i13 != 256) {
                                this.f10627C = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 256;
                            }
                            this.f10627C.add(c6349f.m25097t(C3785r.f10781L, c6351h));
                            z11 = z10;
                            i10 = i10;
                            break;
                        case Opcodes.POP2 /* 88 */:
                            z10 = z11;
                            int i14 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i14 != 512) {
                                this.f10628D = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 512;
                            }
                            this.f10628D.add(Integer.valueOf(c6349f.m25095r()));
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 90:
                            z10 = z11;
                            int iM25086i = c6349f.m25086i(c6349f.m25103z());
                            int i15 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i15 != 512) {
                                i10 = i10;
                                if (c6349f.m25083e() > 0) {
                                    this.f10628D = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                            }
                            while (c6349f.m25083e() > 0) {
                                this.f10628D.add(Integer.valueOf(c6349f.m25095r()));
                            }
                            c6349f.m25085h(iM25086i);
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 242:
                            z10 = z11;
                            C3788u.b bVarM14997G = (this.f10638t & 128) == 128 ? this.f10631G.mo13992c() : null;
                            C3788u c3788u = (C3788u) c6349f.m25097t(C3788u.f10889y, c6351h);
                            this.f10631G = c3788u;
                            if (bVarM14997G != null) {
                                bVarM14997G.mo14019j(c3788u);
                                this.f10631G = bVarM14997G.m15006n();
                            }
                            this.f10638t |= 128;
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 248:
                            z10 = z11;
                            int i16 = (i10 == true ? 1 : 0) & 4096;
                            i10 = i10;
                            if (i16 != 4096) {
                                this.f10632H = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4096;
                            }
                            this.f10632H.add(Integer.valueOf(c6349f.m25095r()));
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 250:
                            int iM25086i2 = c6349f.m25086i(c6349f.m25103z());
                            int i17 = (i10 == true ? 1 : 0) & 4096;
                            i10 = i10;
                            if (i17 != 4096) {
                                i10 = i10;
                                if (c6349f.m25083e() > 0) {
                                    this.f10632H = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4096;
                                }
                            }
                            while (c6349f.m25083e() > 0) {
                                this.f10632H.add(Integer.valueOf(c6349f.m25095r()));
                                z11 = z11;
                            }
                            z10 = z11;
                            c6349f.m25085h(iM25086i2);
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 258:
                            C3773f.b bVarM14318B = (this.f10638t & 256) == 256 ? this.f10633I.mo13992c() : null;
                            C3773f c3773f = (C3773f) c6349f.m25097t(C3773f.f10553w, c6351h);
                            this.f10633I = c3773f;
                            if (bVarM14318B != null) {
                                bVarM14318B.mo14019j(c3773f);
                                this.f10633I = bVarM14318B.m14326n();
                            }
                            this.f10638t |= 256;
                            i10 = i10;
                            z10 = z11;
                            z11 = z10;
                            i10 = i10;
                            break;
                        case 266:
                            int i18 = (i10 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE;
                            int i19 = i10;
                            if (i18 != 16384) {
                                this.f10634J = new ArrayList();
                                i19 = (i10 == true ? 1 : 0) | Http2.INITIAL_MAX_FRAME_SIZE;
                            }
                            this.f10634J.add(c6349f.m25097t(C3771d.f10527y, c6351h));
                            i10 = i19;
                            z10 = z11;
                            z11 = z10;
                            i10 = i10;
                            break;
                        default:
                            Mo25224p = mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J);
                            i10 = i10;
                            if (Mo25224p == 0) {
                                z12 = z11;
                                z10 = z12;
                            } else {
                                z10 = z11;
                            }
                            z11 = z10;
                            i10 = i10;
                            break;
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f10644z = Collections.unmodifiableList(this.f10644z);
                    }
                    if (((i10 == true ? 1 : 0) & 1024) == Mo25224p) {
                        this.f10630F = Collections.unmodifiableList(this.f10630F);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == 256) {
                        this.f10627C = Collections.unmodifiableList(this.f10627C);
                    }
                    if (((i10 == true ? 1 : 0) & 512) == 512) {
                        this.f10628D = Collections.unmodifiableList(this.f10628D);
                    }
                    if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                        this.f10632H = Collections.unmodifiableList(this.f10632H);
                    }
                    if (((i10 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                        this.f10634J = Collections.unmodifiableList(this.f10634J);
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f10637s = bVarM25040t.m25058h();
                        throw th3;
                    }
                    this.f10637s = bVarM25040t.m25058h();
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

    /* JADX INFO: renamed from: E0 */
    private void m14445E0() {
        this.f10639u = 6;
        this.f10640v = 6;
        this.f10641w = 0;
        this.f10642x = C3785r.m14785X();
        this.f10643y = 0;
        List list = Collections.EMPTY_LIST;
        this.f10644z = list;
        this.f10625A = C3785r.m14785X();
        this.f10626B = 0;
        this.f10627C = list;
        this.f10628D = list;
        this.f10630F = list;
        this.f10631G = C3788u.m14993w();
        this.f10632H = list;
        this.f10633I = C3773f.m14313u();
        this.f10634J = list;
    }

    /* JADX INFO: renamed from: F0 */
    public static b m14447F0() {
        return b.m14505t();
    }

    /* JADX INFO: renamed from: G0 */
    public static b m14449G0(C3777j c3777j) {
        return m14447F0().mo14019j(c3777j);
    }

    /* JADX INFO: renamed from: I0 */
    public static C3777j m14452I0(InputStream inputStream, C6351h c6351h) {
        return (C3777j) f10624N.mo25021a(inputStream, c6351h);
    }

    /* JADX INFO: renamed from: e0 */
    public static C3777j m14467e0() {
        return f10623M;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m14468A0() {
        return (this.f10638t & 64) == 64;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m14469B0() {
        return (this.f10638t & 8) == 8;
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m14470C0() {
        return (this.f10638t & 16) == 16;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m14471D0() {
        return (this.f10638t & 128) == 128;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14447F0();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14449G0(this);
    }

    /* JADX INFO: renamed from: X */
    public C3771d m14474X(int i10) {
        return (C3771d) this.f10634J.get(i10);
    }

    /* JADX INFO: renamed from: Y */
    public int m14475Y() {
        return this.f10634J.size();
    }

    /* JADX INFO: renamed from: Z */
    public C3785r m14476Z(int i10) {
        return (C3785r) this.f10627C.get(i10);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10635K;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!m14499x0()) {
            this.f10635K = (byte) 0;
            return false;
        }
        if (m14469B0() && !m14487l0().mo13991a()) {
            this.f10635K = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m14490o0(); i10++) {
            if (!m14489n0(i10).mo13991a()) {
                this.f10635K = (byte) 0;
                return false;
            }
        }
        if (m14501z0() && !m14485j0().mo13991a()) {
            this.f10635K = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < m14477a0(); i11++) {
            if (!m14476Z(i11).mo13991a()) {
                this.f10635K = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < m14494s0(); i12++) {
            if (!m14493r0(i12).mo13991a()) {
                this.f10635K = (byte) 0;
                return false;
            }
        }
        if (m14471D0() && !m14492q0().mo13991a()) {
            this.f10635K = (byte) 0;
            return false;
        }
        if (m14497v0() && !m14480d0().mo13991a()) {
            this.f10635K = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < m14475Y(); i13++) {
            if (!m14474X(i13).mo13991a()) {
                this.f10635K = (byte) 0;
                return false;
            }
        }
        if (m25232s()) {
            this.f10635K = (byte) 1;
            return true;
        }
        this.f10635K = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public int m14477a0() {
        return this.f10627C.size();
    }

    /* JADX INFO: renamed from: b0 */
    public List m14478b0() {
        return this.f10628D;
    }

    /* JADX INFO: renamed from: c0 */
    public List m14479c0() {
        return this.f10627C;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10638t & 2) == 2) {
            c6350g.m25155Z(1, this.f10640v);
        }
        if ((this.f10638t & 4) == 4) {
            c6350g.m25155Z(2, this.f10641w);
        }
        if ((this.f10638t & 8) == 8) {
            c6350g.m25158c0(3, this.f10642x);
        }
        for (int i10 = 0; i10 < this.f10644z.size(); i10++) {
            c6350g.m25158c0(4, (InterfaceC6360q) this.f10644z.get(i10));
        }
        if ((this.f10638t & 32) == 32) {
            c6350g.m25158c0(5, this.f10625A);
        }
        for (int i11 = 0; i11 < this.f10630F.size(); i11++) {
            c6350g.m25158c0(6, (InterfaceC6360q) this.f10630F.get(i11));
        }
        if ((this.f10638t & 16) == 16) {
            c6350g.m25155Z(7, this.f10643y);
        }
        if ((this.f10638t & 64) == 64) {
            c6350g.m25155Z(8, this.f10626B);
        }
        if ((this.f10638t & 1) == 1) {
            c6350g.m25155Z(9, this.f10639u);
        }
        for (int i12 = 0; i12 < this.f10627C.size(); i12++) {
            c6350g.m25158c0(10, (InterfaceC6360q) this.f10627C.get(i12));
        }
        if (m14478b0().size() > 0) {
            c6350g.m25169n0(90);
            c6350g.m25169n0(this.f10629E);
        }
        for (int i13 = 0; i13 < this.f10628D.size(); i13++) {
            c6350g.m25156a0(((Integer) this.f10628D.get(i13)).intValue());
        }
        if ((this.f10638t & 128) == 128) {
            c6350g.m25158c0(30, this.f10631G);
        }
        for (int i14 = 0; i14 < this.f10632H.size(); i14++) {
            c6350g.m25155Z(31, ((Integer) this.f10632H.get(i14)).intValue());
        }
        if ((this.f10638t & 256) == 256) {
            c6350g.m25158c0(32, this.f10633I);
        }
        for (int i15 = 0; i15 < this.f10634J.size(); i15++) {
            c6350g.m25158c0(33, (InterfaceC6360q) this.f10634J.get(i15));
        }
        aVarM25238y.m25240a(19000, c6350g);
        c6350g.m25163h0(this.f10637s);
    }

    /* JADX INFO: renamed from: d0 */
    public C3773f m14480d0() {
        return this.f10633I;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10636L;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10638t & 2) == 2 ? C6350g.m25126o(1, this.f10640v) : 0;
        if ((this.f10638t & 4) == 4) {
            iM25126o += C6350g.m25126o(2, this.f10641w);
        }
        if ((this.f10638t & 8) == 8) {
            iM25126o += C6350g.m25129r(3, this.f10642x);
        }
        for (int i11 = 0; i11 < this.f10644z.size(); i11++) {
            iM25126o += C6350g.m25129r(4, (InterfaceC6360q) this.f10644z.get(i11));
        }
        if ((this.f10638t & 32) == 32) {
            iM25126o += C6350g.m25129r(5, this.f10625A);
        }
        for (int i12 = 0; i12 < this.f10630F.size(); i12++) {
            iM25126o += C6350g.m25129r(6, (InterfaceC6360q) this.f10630F.get(i12));
        }
        if ((this.f10638t & 16) == 16) {
            iM25126o += C6350g.m25126o(7, this.f10643y);
        }
        if ((this.f10638t & 64) == 64) {
            iM25126o += C6350g.m25126o(8, this.f10626B);
        }
        if ((this.f10638t & 1) == 1) {
            iM25126o += C6350g.m25126o(9, this.f10639u);
        }
        for (int i13 = 0; i13 < this.f10627C.size(); i13++) {
            iM25126o += C6350g.m25129r(10, (InterfaceC6360q) this.f10627C.get(i13));
        }
        int iM25127p = 0;
        for (int i14 = 0; i14 < this.f10628D.size(); i14++) {
            iM25127p += C6350g.m25127p(((Integer) this.f10628D.get(i14)).intValue());
        }
        int iM25129r = iM25126o + iM25127p;
        if (!m14478b0().isEmpty()) {
            iM25129r = iM25129r + 1 + C6350g.m25127p(iM25127p);
        }
        this.f10629E = iM25127p;
        if ((this.f10638t & 128) == 128) {
            iM25129r += C6350g.m25129r(30, this.f10631G);
        }
        int iM25127p2 = 0;
        for (int i15 = 0; i15 < this.f10632H.size(); i15++) {
            iM25127p2 += C6350g.m25127p(((Integer) this.f10632H.get(i15)).intValue());
        }
        int size = iM25129r + iM25127p2 + (m14496u0().size() * 2);
        if ((this.f10638t & 256) == 256) {
            size += C6350g.m25129r(32, this.f10633I);
        }
        for (int i16 = 0; i16 < this.f10634J.size(); i16++) {
            size += C6350g.m25129r(33, (InterfaceC6360q) this.f10634J.get(i16));
        }
        int iM25233t = size + m25233t() + this.f10637s.size();
        this.f10636L = iM25233t;
        return iM25233t;
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C3777j mo14181b() {
        return f10623M;
    }

    /* JADX INFO: renamed from: g0 */
    public int m14482g0() {
        return this.f10639u;
    }

    /* JADX INFO: renamed from: h0 */
    public int m14483h0() {
        return this.f10641w;
    }

    /* JADX INFO: renamed from: i0 */
    public int m14484i0() {
        return this.f10640v;
    }

    /* JADX INFO: renamed from: j0 */
    public C3785r m14485j0() {
        return this.f10625A;
    }

    /* JADX INFO: renamed from: k0 */
    public int m14486k0() {
        return this.f10626B;
    }

    /* JADX INFO: renamed from: l0 */
    public C3785r m14487l0() {
        return this.f10642x;
    }

    /* JADX INFO: renamed from: m0 */
    public int m14488m0() {
        return this.f10643y;
    }

    /* JADX INFO: renamed from: n0 */
    public C3787t m14489n0(int i10) {
        return (C3787t) this.f10644z.get(i10);
    }

    /* JADX INFO: renamed from: o0 */
    public int m14490o0() {
        return this.f10644z.size();
    }

    /* JADX INFO: renamed from: p0 */
    public List m14491p0() {
        return this.f10644z;
    }

    /* JADX INFO: renamed from: q0 */
    public C3788u m14492q0() {
        return this.f10631G;
    }

    /* JADX INFO: renamed from: r0 */
    public C3789v m14493r0(int i10) {
        return (C3789v) this.f10630F.get(i10);
    }

    /* JADX INFO: renamed from: s0 */
    public int m14494s0() {
        return this.f10630F.size();
    }

    /* JADX INFO: renamed from: t0 */
    public List m14495t0() {
        return this.f10630F;
    }

    /* JADX INFO: renamed from: u0 */
    public List m14496u0() {
        return this.f10632H;
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m14497v0() {
        return (this.f10638t & 256) == 256;
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m14498w0() {
        return (this.f10638t & 1) == 1;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m14499x0() {
        return (this.f10638t & 4) == 4;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m14500y0() {
        return (this.f10638t & 2) == 2;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m14501z0() {
        return (this.f10638t & 32) == 32;
    }

    /* JADX INFO: renamed from: ja.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: A */
        public C3785r f10645A;

        /* JADX INFO: renamed from: B */
        public int f10646B;

        /* JADX INFO: renamed from: C */
        public List f10647C;

        /* JADX INFO: renamed from: D */
        public List f10648D;

        /* JADX INFO: renamed from: E */
        public List f10649E;

        /* JADX INFO: renamed from: F */
        public C3788u f10650F;

        /* JADX INFO: renamed from: G */
        public List f10651G;

        /* JADX INFO: renamed from: H */
        public C3773f f10652H;

        /* JADX INFO: renamed from: I */
        public List f10653I;

        /* JADX INFO: renamed from: t */
        public int f10654t;

        /* JADX INFO: renamed from: w */
        public int f10657w;

        /* JADX INFO: renamed from: y */
        public int f10659y;

        /* JADX INFO: renamed from: z */
        public List f10660z;

        /* JADX INFO: renamed from: u */
        public int f10655u = 6;

        /* JADX INFO: renamed from: v */
        public int f10656v = 6;

        /* JADX INFO: renamed from: x */
        public C3785r f10658x = C3785r.m14785X();

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f10660z = list;
            this.f10645A = C3785r.m14785X();
            this.f10647C = list;
            this.f10648D = list;
            this.f10649E = list;
            this.f10650F = C3788u.m14993w();
            this.f10651G = list;
            this.f10652H = C3773f.m14313u();
            this.f10653I = list;
            m14503A();
        }

        /* JADX INFO: renamed from: t */
        public static b m14505t() {
            return new b();
        }

        /* JADX INFO: renamed from: u */
        private void m14506u() {
            if ((this.f10654t & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                this.f10653I = new ArrayList(this.f10653I);
                this.f10654t |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }

        /* JADX INFO: renamed from: v */
        private void m14507v() {
            if ((this.f10654t & 512) != 512) {
                this.f10648D = new ArrayList(this.f10648D);
                this.f10654t |= 512;
            }
        }

        /* JADX INFO: renamed from: w */
        private void m14508w() {
            if ((this.f10654t & 256) != 256) {
                this.f10647C = new ArrayList(this.f10647C);
                this.f10654t |= 256;
            }
        }

        /* JADX INFO: renamed from: x */
        private void m14509x() {
            if ((this.f10654t & 32) != 32) {
                this.f10660z = new ArrayList(this.f10660z);
                this.f10654t |= 32;
            }
        }

        /* JADX INFO: renamed from: y */
        private void m14510y() {
            if ((this.f10654t & 1024) != 1024) {
                this.f10649E = new ArrayList(this.f10649E);
                this.f10654t |= 1024;
            }
        }

        /* JADX INFO: renamed from: z */
        private void m14511z() {
            if ((this.f10654t & 4096) != 4096) {
                this.f10651G = new ArrayList(this.f10651G);
                this.f10654t |= 4096;
            }
        }

        /* JADX INFO: renamed from: B */
        public b m14512B(C3773f c3773f) {
            if ((this.f10654t & 8192) != 8192 || this.f10652H == C3773f.m14313u()) {
                this.f10652H = c3773f;
            } else {
                this.f10652H = C3773f.m14316z(this.f10652H).mo14019j(c3773f).m14326n();
            }
            this.f10654t |= 8192;
            return this;
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3777j c3777j) {
            if (c3777j == C3777j.m14467e0()) {
                return this;
            }
            if (c3777j.m14498w0()) {
                m14518H(c3777j.m14482g0());
            }
            if (c3777j.m14500y0()) {
                m14520J(c3777j.m14484i0());
            }
            if (c3777j.m14499x0()) {
                m14519I(c3777j.m14483h0());
            }
            if (c3777j.m14469B0()) {
                m14516F(c3777j.m14487l0());
            }
            if (c3777j.m14470C0()) {
                m14522L(c3777j.m14488m0());
            }
            if (!c3777j.f10644z.isEmpty()) {
                if (this.f10660z.isEmpty()) {
                    this.f10660z = c3777j.f10644z;
                    this.f10654t &= -33;
                } else {
                    m14509x();
                    this.f10660z.addAll(c3777j.f10644z);
                }
            }
            if (c3777j.m14501z0()) {
                m14515E(c3777j.m14485j0());
            }
            if (c3777j.m14468A0()) {
                m14521K(c3777j.m14486k0());
            }
            if (!c3777j.f10627C.isEmpty()) {
                if (this.f10647C.isEmpty()) {
                    this.f10647C = c3777j.f10627C;
                    this.f10654t &= -257;
                } else {
                    m14508w();
                    this.f10647C.addAll(c3777j.f10627C);
                }
            }
            if (!c3777j.f10628D.isEmpty()) {
                if (this.f10648D.isEmpty()) {
                    this.f10648D = c3777j.f10628D;
                    this.f10654t &= -513;
                } else {
                    m14507v();
                    this.f10648D.addAll(c3777j.f10628D);
                }
            }
            if (!c3777j.f10630F.isEmpty()) {
                if (this.f10649E.isEmpty()) {
                    this.f10649E = c3777j.f10630F;
                    this.f10654t &= -1025;
                } else {
                    m14510y();
                    this.f10649E.addAll(c3777j.f10630F);
                }
            }
            if (c3777j.m14471D0()) {
                m14517G(c3777j.m14492q0());
            }
            if (!c3777j.f10632H.isEmpty()) {
                if (this.f10651G.isEmpty()) {
                    this.f10651G = c3777j.f10632H;
                    this.f10654t &= -4097;
                } else {
                    m14511z();
                    this.f10651G.addAll(c3777j.f10632H);
                }
            }
            if (c3777j.m14497v0()) {
                m14512B(c3777j.m14480d0());
            }
            if (!c3777j.f10634J.isEmpty()) {
                if (this.f10653I.isEmpty()) {
                    this.f10653I = c3777j.f10634J;
                    this.f10654t &= -16385;
                } else {
                    m14506u();
                    this.f10653I.addAll(c3777j.f10634J);
                }
            }
            m25230o(c3777j);
            m25226k(m25225i().m25043c(c3777j.f10637s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3777j.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3777j.f10624N     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.j r3 = (p143ja.C3777j) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.j r4 = (p143ja.C3777j) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3777j.b.mo14018e(qa.f, qa.h):ja.j$b");
        }

        /* JADX INFO: renamed from: E */
        public b m14515E(C3785r c3785r) {
            if ((this.f10654t & 64) != 64 || this.f10645A == C3785r.m14785X()) {
                this.f10645A = c3785r;
            } else {
                this.f10645A = C3785r.m14788y0(this.f10645A).mo14019j(c3785r).m14869r();
            }
            this.f10654t |= 64;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public b m14516F(C3785r c3785r) {
            if ((this.f10654t & 8) != 8 || this.f10658x == C3785r.m14785X()) {
                this.f10658x = c3785r;
            } else {
                this.f10658x = C3785r.m14788y0(this.f10658x).mo14019j(c3785r).m14869r();
            }
            this.f10654t |= 8;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public b m14517G(C3788u c3788u) {
            if ((this.f10654t & 2048) != 2048 || this.f10650F == C3788u.m14993w()) {
                this.f10650F = c3788u;
            } else {
                this.f10650F = C3788u.m14987E(this.f10650F).mo14019j(c3788u).m15006n();
            }
            this.f10654t |= 2048;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public b m14518H(int i10) {
            this.f10654t |= 1;
            this.f10655u = i10;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public b m14519I(int i10) {
            this.f10654t |= 4;
            this.f10657w = i10;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public b m14520J(int i10) {
            this.f10654t |= 2;
            this.f10656v = i10;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public b m14521K(int i10) {
            this.f10654t |= 128;
            this.f10646B = i10;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public b m14522L(int i10) {
            this.f10654t |= 16;
            this.f10659y = i10;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3777j build() {
            C3777j c3777jM14524r = m14524r();
            if (c3777jM14524r.mo13991a()) {
                return c3777jM14524r;
            }
            throw AbstractC6344a.a.m25020h(c3777jM14524r);
        }

        /* JADX INFO: renamed from: r */
        public C3777j m14524r() {
            C3777j c3777j = new C3777j(this);
            int i10 = this.f10654t;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3777j.f10639u = this.f10655u;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3777j.f10640v = this.f10656v;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3777j.f10641w = this.f10657w;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3777j.f10642x = this.f10658x;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3777j.f10643y = this.f10659y;
            if ((this.f10654t & 32) == 32) {
                this.f10660z = Collections.unmodifiableList(this.f10660z);
                this.f10654t &= -33;
            }
            c3777j.f10644z = this.f10660z;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3777j.f10625A = this.f10645A;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            c3777j.f10626B = this.f10646B;
            if ((this.f10654t & 256) == 256) {
                this.f10647C = Collections.unmodifiableList(this.f10647C);
                this.f10654t &= -257;
            }
            c3777j.f10627C = this.f10647C;
            if ((this.f10654t & 512) == 512) {
                this.f10648D = Collections.unmodifiableList(this.f10648D);
                this.f10654t &= -513;
            }
            c3777j.f10628D = this.f10648D;
            if ((this.f10654t & 1024) == 1024) {
                this.f10649E = Collections.unmodifiableList(this.f10649E);
                this.f10654t &= -1025;
            }
            c3777j.f10630F = this.f10649E;
            if ((i10 & 2048) == 2048) {
                i11 |= 128;
            }
            c3777j.f10631G = this.f10650F;
            if ((this.f10654t & 4096) == 4096) {
                this.f10651G = Collections.unmodifiableList(this.f10651G);
                this.f10654t &= -4097;
            }
            c3777j.f10632H = this.f10651G;
            if ((i10 & 8192) == 8192) {
                i11 |= 256;
            }
            c3777j.f10633I = this.f10652H;
            if ((this.f10654t & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                this.f10653I = Collections.unmodifiableList(this.f10653I);
                this.f10654t &= -16385;
            }
            c3777j.f10634J = this.f10653I;
            c3777j.f10638t = i11;
            return c3777j;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14505t().mo14019j(m14524r());
        }

        /* JADX INFO: renamed from: A */
        private void m14503A() {
        }
    }

    public C3777j(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10629E = -1;
        this.f10635K = (byte) -1;
        this.f10636L = -1;
        this.f10637s = cVar.m25225i();
    }

    public C3777j(boolean z10) {
        this.f10629E = -1;
        this.f10635K = (byte) -1;
        this.f10636L = -1;
        this.f10637s = AbstractC6348e.f19966q;
    }
}
