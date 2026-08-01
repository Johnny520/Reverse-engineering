package p143ja;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.p218ws.WebSocketProtocol;
import p143ja.C3785r;
import p143ja.C3789v;
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

/* JADX INFO: renamed from: ja.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3782o extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: M */
    public static final C3782o f10707M;

    /* JADX INFO: renamed from: N */
    public static InterfaceC6362s f10708N = new a();

    /* JADX INFO: renamed from: A */
    public C3785r f10709A;

    /* JADX INFO: renamed from: B */
    public int f10710B;

    /* JADX INFO: renamed from: C */
    public List f10711C;

    /* JADX INFO: renamed from: D */
    public List f10712D;

    /* JADX INFO: renamed from: E */
    public int f10713E;

    /* JADX INFO: renamed from: F */
    public C3789v f10714F;

    /* JADX INFO: renamed from: G */
    public int f10715G;

    /* JADX INFO: renamed from: H */
    public int f10716H;

    /* JADX INFO: renamed from: I */
    public List f10717I;

    /* JADX INFO: renamed from: J */
    public List f10718J;

    /* JADX INFO: renamed from: K */
    public byte f10719K;

    /* JADX INFO: renamed from: L */
    public int f10720L;

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10721s;

    /* JADX INFO: renamed from: t */
    public int f10722t;

    /* JADX INFO: renamed from: u */
    public int f10723u;

    /* JADX INFO: renamed from: v */
    public int f10724v;

    /* JADX INFO: renamed from: w */
    public int f10725w;

    /* JADX INFO: renamed from: x */
    public C3785r f10726x;

    /* JADX INFO: renamed from: y */
    public int f10727y;

    /* JADX INFO: renamed from: z */
    public List f10728z;

    /* JADX INFO: renamed from: ja.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3782o mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3782o(c6349f, c6351h);
        }
    }

    static {
        C3782o c3782o = new C3782o(true);
        f10707M = c3782o;
        c3782o.m14615C0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C3782o(C6349f c6349f, C6351h c6351h) {
        this.f10713E = -1;
        this.f10719K = (byte) -1;
        this.f10720L = -1;
        m14615C0();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? Mo25224p = 16384;
            if (z10) {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f10728z = Collections.unmodifiableList(this.f10728z);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f10711C = Collections.unmodifiableList(this.f10711C);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f10712D = Collections.unmodifiableList(this.f10712D);
                }
                if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f10717I = Collections.unmodifiableList(this.f10717I);
                }
                if (((i10 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.f10718J = Collections.unmodifiableList(this.f10718J);
                }
                try {
                    c6350gM25111I.m25138H();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f10721s = bVarM25040t.m25058h();
                    throw th;
                }
                this.f10721s = bVarM25040t.m25058h();
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
                            this.f10722t |= 2;
                            this.f10724v = c6349f.m25095r();
                            break;
                        case 16:
                            this.f10722t |= 4;
                            this.f10725w = c6349f.m25095r();
                            break;
                        case 26:
                            C3785r.c cVarM14789A0 = (this.f10722t & 8) == 8 ? this.f10726x.mo13992c() : null;
                            C3785r c3785r = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                            this.f10726x = c3785r;
                            if (cVarM14789A0 != null) {
                                cVarM14789A0.mo14019j(c3785r);
                                this.f10726x = cVarM14789A0.m14869r();
                            }
                            this.f10722t |= 8;
                            break;
                        case 34:
                            int i11 = (i10 == true ? 1 : 0) & 32;
                            i10 = i10;
                            if (i11 != 32) {
                                this.f10728z = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 32;
                            }
                            this.f10728z.add(c6349f.m25097t(C3787t.f10863E, c6351h));
                            break;
                        case 42:
                            C3785r.c cVarM14789A02 = (this.f10722t & 32) == 32 ? this.f10709A.mo13992c() : null;
                            C3785r c3785r2 = (C3785r) c6349f.m25097t(C3785r.f10781L, c6351h);
                            this.f10709A = c3785r2;
                            if (cVarM14789A02 != null) {
                                cVarM14789A02.mo14019j(c3785r2);
                                this.f10709A = cVarM14789A02.m14869r();
                            }
                            this.f10722t |= 32;
                            break;
                        case Opcodes.AALOAD /* 50 */:
                            C3789v.b bVarM15038a0 = (this.f10722t & 128) == 128 ? this.f10714F.mo13992c() : null;
                            C3789v c3789v = (C3789v) c6349f.m25097t(C3789v.f10900D, c6351h);
                            this.f10714F = c3789v;
                            if (bVarM15038a0 != null) {
                                bVarM15038a0.mo14019j(c3789v);
                                this.f10714F = bVarM15038a0.m15047r();
                            }
                            this.f10722t |= 128;
                            break;
                        case Opcodes.FSTORE /* 56 */:
                            this.f10722t |= 256;
                            this.f10715G = c6349f.m25095r();
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                            this.f10722t |= 512;
                            this.f10716H = c6349f.m25095r();
                            break;
                        case 72:
                            this.f10722t |= 16;
                            this.f10727y = c6349f.m25095r();
                            break;
                        case 80:
                            this.f10722t |= 64;
                            this.f10710B = c6349f.m25095r();
                            break;
                        case Opcodes.POP2 /* 88 */:
                            this.f10722t |= 1;
                            this.f10723u = c6349f.m25095r();
                            break;
                        case 98:
                            int i12 = (i10 == true ? 1 : 0) & 256;
                            i10 = i10;
                            if (i12 != 256) {
                                this.f10711C = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 256;
                            }
                            this.f10711C.add(c6349f.m25097t(C3785r.f10781L, c6351h));
                            break;
                        case Opcodes.IMUL /* 104 */:
                            int i13 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i13 != 512) {
                                this.f10712D = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 512;
                            }
                            this.f10712D.add(Integer.valueOf(c6349f.m25095r()));
                            break;
                        case 106:
                            int iM25086i = c6349f.m25086i(c6349f.m25103z());
                            int i14 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i14 != 512) {
                                i10 = i10;
                                if (c6349f.m25083e() > 0) {
                                    this.f10712D = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                            }
                            while (c6349f.m25083e() > 0) {
                                this.f10712D.add(Integer.valueOf(c6349f.m25095r()));
                            }
                            c6349f.m25085h(iM25086i);
                            break;
                        case 248:
                            int i15 = (i10 == true ? 1 : 0) & 8192;
                            i10 = i10;
                            if (i15 != 8192) {
                                this.f10717I = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 8192;
                            }
                            this.f10717I.add(Integer.valueOf(c6349f.m25095r()));
                            break;
                        case 250:
                            int iM25086i2 = c6349f.m25086i(c6349f.m25103z());
                            int i16 = (i10 == true ? 1 : 0) & 8192;
                            i10 = i10;
                            if (i16 != 8192) {
                                i10 = i10;
                                if (c6349f.m25083e() > 0) {
                                    this.f10717I = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8192;
                                }
                            }
                            while (c6349f.m25083e() > 0) {
                                this.f10717I.add(Integer.valueOf(c6349f.m25095r()));
                            }
                            c6349f.m25085h(iM25086i2);
                            break;
                        case 258:
                            int i17 = (i10 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE;
                            i10 = i10;
                            if (i17 != 16384) {
                                this.f10718J = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | Http2.INITIAL_MAX_FRAME_SIZE;
                            }
                            this.f10718J.add(c6349f.m25097t(C3771d.f10527y, c6351h));
                            break;
                        default:
                            Mo25224p = mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J);
                            if (Mo25224p == 0) {
                                z10 = true;
                            }
                            break;
                    }
                } catch (C6355l e10) {
                    throw e10.m25261i(this);
                } catch (IOException e11) {
                    throw new C6355l(e11.getMessage()).m25261i(this);
                }
            } catch (Throwable th2) {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f10728z = Collections.unmodifiableList(this.f10728z);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f10711C = Collections.unmodifiableList(this.f10711C);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f10712D = Collections.unmodifiableList(this.f10712D);
                }
                if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f10717I = Collections.unmodifiableList(this.f10717I);
                }
                if (((i10 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE) == Mo25224p) {
                    this.f10718J = Collections.unmodifiableList(this.f10718J);
                }
                try {
                    c6350gM25111I.m25138H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f10721s = bVarM25040t.m25058h();
                    throw th3;
                }
                this.f10721s = bVarM25040t.m25058h();
                mo25223m();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    private void m14615C0() {
        this.f10723u = 518;
        this.f10724v = 2054;
        this.f10725w = 0;
        this.f10726x = C3785r.m14785X();
        this.f10727y = 0;
        List list = Collections.EMPTY_LIST;
        this.f10728z = list;
        this.f10709A = C3785r.m14785X();
        this.f10710B = 0;
        this.f10711C = list;
        this.f10712D = list;
        this.f10714F = C3789v.m15020I();
        this.f10715G = 0;
        this.f10716H = 0;
        this.f10717I = list;
        this.f10718J = list;
    }

    /* JADX INFO: renamed from: D0 */
    public static b m14617D0() {
        return b.m14673t();
    }

    /* JADX INFO: renamed from: E0 */
    public static b m14619E0(C3782o c3782o) {
        return m14617D0().mo14019j(c3782o);
    }

    /* JADX INFO: renamed from: c0 */
    public static C3782o m14637c0() {
        return f10707M;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m14638A0() {
        return (this.f10722t & 512) == 512;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m14639B0() {
        return (this.f10722t & 128) == 128;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14617D0();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14619E0(this);
    }

    /* JADX INFO: renamed from: W */
    public C3771d m14642W(int i10) {
        return (C3771d) this.f10718J.get(i10);
    }

    /* JADX INFO: renamed from: X */
    public int m14643X() {
        return this.f10718J.size();
    }

    /* JADX INFO: renamed from: Y */
    public C3785r m14644Y(int i10) {
        return (C3785r) this.f10711C.get(i10);
    }

    /* JADX INFO: renamed from: Z */
    public int m14645Z() {
        return this.f10711C.size();
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10719K;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!m14665u0()) {
            this.f10719K = (byte) 0;
            return false;
        }
        if (m14669y0() && !m14655k0().mo13991a()) {
            this.f10719K = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m14660p0(); i10++) {
            if (!m14659o0(i10).mo13991a()) {
                this.f10719K = (byte) 0;
                return false;
            }
        }
        if (m14667w0() && !m14653i0().mo13991a()) {
            this.f10719K = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < m14645Z(); i11++) {
            if (!m14644Y(i11).mo13991a()) {
                this.f10719K = (byte) 0;
                return false;
            }
        }
        if (m14639B0() && !m14658n0().mo13991a()) {
            this.f10719K = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < m14643X(); i12++) {
            if (!m14642W(i12).mo13991a()) {
                this.f10719K = (byte) 0;
                return false;
            }
        }
        if (m25232s()) {
            this.f10719K = (byte) 1;
            return true;
        }
        this.f10719K = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public List m14646a0() {
        return this.f10712D;
    }

    /* JADX INFO: renamed from: b0 */
    public List m14647b0() {
        return this.f10711C;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10722t & 2) == 2) {
            c6350g.m25155Z(1, this.f10724v);
        }
        if ((this.f10722t & 4) == 4) {
            c6350g.m25155Z(2, this.f10725w);
        }
        if ((this.f10722t & 8) == 8) {
            c6350g.m25158c0(3, this.f10726x);
        }
        for (int i10 = 0; i10 < this.f10728z.size(); i10++) {
            c6350g.m25158c0(4, (InterfaceC6360q) this.f10728z.get(i10));
        }
        if ((this.f10722t & 32) == 32) {
            c6350g.m25158c0(5, this.f10709A);
        }
        if ((this.f10722t & 128) == 128) {
            c6350g.m25158c0(6, this.f10714F);
        }
        if ((this.f10722t & 256) == 256) {
            c6350g.m25155Z(7, this.f10715G);
        }
        if ((this.f10722t & 512) == 512) {
            c6350g.m25155Z(8, this.f10716H);
        }
        if ((this.f10722t & 16) == 16) {
            c6350g.m25155Z(9, this.f10727y);
        }
        if ((this.f10722t & 64) == 64) {
            c6350g.m25155Z(10, this.f10710B);
        }
        if ((this.f10722t & 1) == 1) {
            c6350g.m25155Z(11, this.f10723u);
        }
        for (int i11 = 0; i11 < this.f10711C.size(); i11++) {
            c6350g.m25158c0(12, (InterfaceC6360q) this.f10711C.get(i11));
        }
        if (m14646a0().size() > 0) {
            c6350g.m25169n0(106);
            c6350g.m25169n0(this.f10713E);
        }
        for (int i12 = 0; i12 < this.f10712D.size(); i12++) {
            c6350g.m25156a0(((Integer) this.f10712D.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f10717I.size(); i13++) {
            c6350g.m25155Z(31, ((Integer) this.f10717I.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f10718J.size(); i14++) {
            c6350g.m25158c0(32, (InterfaceC6360q) this.f10718J.get(i14));
        }
        aVarM25238y.m25240a(19000, c6350g);
        c6350g.m25163h0(this.f10721s);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C3782o mo14181b() {
        return f10707M;
    }

    /* JADX INFO: renamed from: e0 */
    public int m14649e0() {
        return this.f10723u;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10720L;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10722t & 2) == 2 ? C6350g.m25126o(1, this.f10724v) : 0;
        if ((this.f10722t & 4) == 4) {
            iM25126o += C6350g.m25126o(2, this.f10725w);
        }
        if ((this.f10722t & 8) == 8) {
            iM25126o += C6350g.m25129r(3, this.f10726x);
        }
        for (int i11 = 0; i11 < this.f10728z.size(); i11++) {
            iM25126o += C6350g.m25129r(4, (InterfaceC6360q) this.f10728z.get(i11));
        }
        if ((this.f10722t & 32) == 32) {
            iM25126o += C6350g.m25129r(5, this.f10709A);
        }
        if ((this.f10722t & 128) == 128) {
            iM25126o += C6350g.m25129r(6, this.f10714F);
        }
        if ((this.f10722t & 256) == 256) {
            iM25126o += C6350g.m25126o(7, this.f10715G);
        }
        if ((this.f10722t & 512) == 512) {
            iM25126o += C6350g.m25126o(8, this.f10716H);
        }
        if ((this.f10722t & 16) == 16) {
            iM25126o += C6350g.m25126o(9, this.f10727y);
        }
        if ((this.f10722t & 64) == 64) {
            iM25126o += C6350g.m25126o(10, this.f10710B);
        }
        if ((this.f10722t & 1) == 1) {
            iM25126o += C6350g.m25126o(11, this.f10723u);
        }
        for (int i12 = 0; i12 < this.f10711C.size(); i12++) {
            iM25126o += C6350g.m25129r(12, (InterfaceC6360q) this.f10711C.get(i12));
        }
        int iM25127p = 0;
        for (int i13 = 0; i13 < this.f10712D.size(); i13++) {
            iM25127p += C6350g.m25127p(((Integer) this.f10712D.get(i13)).intValue());
        }
        int iM25127p2 = iM25126o + iM25127p;
        if (!m14646a0().isEmpty()) {
            iM25127p2 = iM25127p2 + 1 + C6350g.m25127p(iM25127p);
        }
        this.f10713E = iM25127p;
        int iM25127p3 = 0;
        for (int i14 = 0; i14 < this.f10717I.size(); i14++) {
            iM25127p3 += C6350g.m25127p(((Integer) this.f10717I.get(i14)).intValue());
        }
        int size = iM25127p2 + iM25127p3 + (m14662r0().size() * 2);
        for (int i15 = 0; i15 < this.f10718J.size(); i15++) {
            size += C6350g.m25129r(32, (InterfaceC6360q) this.f10718J.get(i15));
        }
        int iM25233t = size + m25233t() + this.f10721s.size();
        this.f10720L = iM25233t;
        return iM25233t;
    }

    /* JADX INFO: renamed from: f0 */
    public int m14650f0() {
        return this.f10715G;
    }

    /* JADX INFO: renamed from: g0 */
    public int m14651g0() {
        return this.f10725w;
    }

    /* JADX INFO: renamed from: h0 */
    public int m14652h0() {
        return this.f10724v;
    }

    /* JADX INFO: renamed from: i0 */
    public C3785r m14653i0() {
        return this.f10709A;
    }

    /* JADX INFO: renamed from: j0 */
    public int m14654j0() {
        return this.f10710B;
    }

    /* JADX INFO: renamed from: k0 */
    public C3785r m14655k0() {
        return this.f10726x;
    }

    /* JADX INFO: renamed from: l0 */
    public int m14656l0() {
        return this.f10727y;
    }

    /* JADX INFO: renamed from: m0 */
    public int m14657m0() {
        return this.f10716H;
    }

    /* JADX INFO: renamed from: n0 */
    public C3789v m14658n0() {
        return this.f10714F;
    }

    /* JADX INFO: renamed from: o0 */
    public C3787t m14659o0(int i10) {
        return (C3787t) this.f10728z.get(i10);
    }

    /* JADX INFO: renamed from: p0 */
    public int m14660p0() {
        return this.f10728z.size();
    }

    /* JADX INFO: renamed from: q0 */
    public List m14661q0() {
        return this.f10728z;
    }

    /* JADX INFO: renamed from: r0 */
    public List m14662r0() {
        return this.f10717I;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m14663s0() {
        return (this.f10722t & 1) == 1;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m14664t0() {
        return (this.f10722t & 256) == 256;
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m14665u0() {
        return (this.f10722t & 4) == 4;
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m14666v0() {
        return (this.f10722t & 2) == 2;
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m14667w0() {
        return (this.f10722t & 32) == 32;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m14668x0() {
        return (this.f10722t & 64) == 64;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m14669y0() {
        return (this.f10722t & 8) == 8;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m14670z0() {
        return (this.f10722t & 16) == 16;
    }

    /* JADX INFO: renamed from: ja.o$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: A */
        public C3785r f10729A;

        /* JADX INFO: renamed from: B */
        public int f10730B;

        /* JADX INFO: renamed from: C */
        public List f10731C;

        /* JADX INFO: renamed from: D */
        public List f10732D;

        /* JADX INFO: renamed from: E */
        public C3789v f10733E;

        /* JADX INFO: renamed from: F */
        public int f10734F;

        /* JADX INFO: renamed from: G */
        public int f10735G;

        /* JADX INFO: renamed from: H */
        public List f10736H;

        /* JADX INFO: renamed from: I */
        public List f10737I;

        /* JADX INFO: renamed from: t */
        public int f10738t;

        /* JADX INFO: renamed from: w */
        public int f10741w;

        /* JADX INFO: renamed from: y */
        public int f10743y;

        /* JADX INFO: renamed from: z */
        public List f10744z;

        /* JADX INFO: renamed from: u */
        public int f10739u = 518;

        /* JADX INFO: renamed from: v */
        public int f10740v = 2054;

        /* JADX INFO: renamed from: x */
        public C3785r f10742x = C3785r.m14785X();

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f10744z = list;
            this.f10729A = C3785r.m14785X();
            this.f10731C = list;
            this.f10732D = list;
            this.f10733E = C3789v.m15020I();
            this.f10736H = list;
            this.f10737I = list;
            m14679z();
        }

        /* JADX INFO: renamed from: t */
        public static b m14673t() {
            return new b();
        }

        /* JADX INFO: renamed from: u */
        private void m14674u() {
            if ((this.f10738t & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                this.f10737I = new ArrayList(this.f10737I);
                this.f10738t |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }

        /* JADX INFO: renamed from: v */
        private void m14675v() {
            if ((this.f10738t & 512) != 512) {
                this.f10732D = new ArrayList(this.f10732D);
                this.f10738t |= 512;
            }
        }

        /* JADX INFO: renamed from: w */
        private void m14676w() {
            if ((this.f10738t & 256) != 256) {
                this.f10731C = new ArrayList(this.f10731C);
                this.f10738t |= 256;
            }
        }

        /* JADX INFO: renamed from: x */
        private void m14677x() {
            if ((this.f10738t & 32) != 32) {
                this.f10744z = new ArrayList(this.f10744z);
                this.f10738t |= 32;
            }
        }

        /* JADX INFO: renamed from: y */
        private void m14678y() {
            if ((this.f10738t & 8192) != 8192) {
                this.f10736H = new ArrayList(this.f10736H);
                this.f10738t |= 8192;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3782o c3782o) {
            if (c3782o == C3782o.m14637c0()) {
                return this;
            }
            if (c3782o.m14663s0()) {
                m14685F(c3782o.m14649e0());
            }
            if (c3782o.m14666v0()) {
                m14688I(c3782o.m14652h0());
            }
            if (c3782o.m14665u0()) {
                m14687H(c3782o.m14651g0());
            }
            if (c3782o.m14669y0()) {
                m14683D(c3782o.m14655k0());
            }
            if (c3782o.m14670z0()) {
                m14690K(c3782o.m14656l0());
            }
            if (!c3782o.f10728z.isEmpty()) {
                if (this.f10744z.isEmpty()) {
                    this.f10744z = c3782o.f10728z;
                    this.f10738t &= -33;
                } else {
                    m14677x();
                    this.f10744z.addAll(c3782o.f10728z);
                }
            }
            if (c3782o.m14667w0()) {
                m14682C(c3782o.m14653i0());
            }
            if (c3782o.m14668x0()) {
                m14689J(c3782o.m14654j0());
            }
            if (!c3782o.f10711C.isEmpty()) {
                if (this.f10731C.isEmpty()) {
                    this.f10731C = c3782o.f10711C;
                    this.f10738t &= -257;
                } else {
                    m14676w();
                    this.f10731C.addAll(c3782o.f10711C);
                }
            }
            if (!c3782o.f10712D.isEmpty()) {
                if (this.f10732D.isEmpty()) {
                    this.f10732D = c3782o.f10712D;
                    this.f10738t &= -513;
                } else {
                    m14675v();
                    this.f10732D.addAll(c3782o.f10712D);
                }
            }
            if (c3782o.m14639B0()) {
                m14684E(c3782o.m14658n0());
            }
            if (c3782o.m14664t0()) {
                m14686G(c3782o.m14650f0());
            }
            if (c3782o.m14638A0()) {
                m14691L(c3782o.m14657m0());
            }
            if (!c3782o.f10717I.isEmpty()) {
                if (this.f10736H.isEmpty()) {
                    this.f10736H = c3782o.f10717I;
                    this.f10738t &= -8193;
                } else {
                    m14678y();
                    this.f10736H.addAll(c3782o.f10717I);
                }
            }
            if (!c3782o.f10718J.isEmpty()) {
                if (this.f10737I.isEmpty()) {
                    this.f10737I = c3782o.f10718J;
                    this.f10738t &= -16385;
                } else {
                    m14674u();
                    this.f10737I.addAll(c3782o.f10718J);
                }
            }
            m25230o(c3782o);
            m25226k(m25225i().m25043c(c3782o.f10721s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3782o.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3782o.f10708N     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.o r3 = (p143ja.C3782o) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.o r4 = (p143ja.C3782o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3782o.b.mo14018e(qa.f, qa.h):ja.o$b");
        }

        /* JADX INFO: renamed from: C */
        public b m14682C(C3785r c3785r) {
            if ((this.f10738t & 64) != 64 || this.f10729A == C3785r.m14785X()) {
                this.f10729A = c3785r;
            } else {
                this.f10729A = C3785r.m14788y0(this.f10729A).mo14019j(c3785r).m14869r();
            }
            this.f10738t |= 64;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m14683D(C3785r c3785r) {
            if ((this.f10738t & 8) != 8 || this.f10742x == C3785r.m14785X()) {
                this.f10742x = c3785r;
            } else {
                this.f10742x = C3785r.m14788y0(this.f10742x).mo14019j(c3785r).m14869r();
            }
            this.f10738t |= 8;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public b m14684E(C3789v c3789v) {
            if ((this.f10738t & 1024) != 1024 || this.f10733E == C3789v.m15020I()) {
                this.f10733E = c3789v;
            } else {
                this.f10733E = C3789v.m15023Y(this.f10733E).mo14019j(c3789v).m15047r();
            }
            this.f10738t |= 1024;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public b m14685F(int i10) {
            this.f10738t |= 1;
            this.f10739u = i10;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public b m14686G(int i10) {
            this.f10738t |= 2048;
            this.f10734F = i10;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public b m14687H(int i10) {
            this.f10738t |= 4;
            this.f10741w = i10;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public b m14688I(int i10) {
            this.f10738t |= 2;
            this.f10740v = i10;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public b m14689J(int i10) {
            this.f10738t |= 128;
            this.f10730B = i10;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public b m14690K(int i10) {
            this.f10738t |= 16;
            this.f10743y = i10;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public b m14691L(int i10) {
            this.f10738t |= 4096;
            this.f10735G = i10;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3782o build() {
            C3782o c3782oM14693r = m14693r();
            if (c3782oM14693r.mo13991a()) {
                return c3782oM14693r;
            }
            throw AbstractC6344a.a.m25020h(c3782oM14693r);
        }

        /* JADX INFO: renamed from: r */
        public C3782o m14693r() {
            C3782o c3782o = new C3782o(this);
            int i10 = this.f10738t;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3782o.f10723u = this.f10739u;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3782o.f10724v = this.f10740v;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3782o.f10725w = this.f10741w;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3782o.f10726x = this.f10742x;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3782o.f10727y = this.f10743y;
            if ((this.f10738t & 32) == 32) {
                this.f10744z = Collections.unmodifiableList(this.f10744z);
                this.f10738t &= -33;
            }
            c3782o.f10728z = this.f10744z;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3782o.f10709A = this.f10729A;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            c3782o.f10710B = this.f10730B;
            if ((this.f10738t & 256) == 256) {
                this.f10731C = Collections.unmodifiableList(this.f10731C);
                this.f10738t &= -257;
            }
            c3782o.f10711C = this.f10731C;
            if ((this.f10738t & 512) == 512) {
                this.f10732D = Collections.unmodifiableList(this.f10732D);
                this.f10738t &= -513;
            }
            c3782o.f10712D = this.f10732D;
            if ((i10 & 1024) == 1024) {
                i11 |= 128;
            }
            c3782o.f10714F = this.f10733E;
            if ((i10 & 2048) == 2048) {
                i11 |= 256;
            }
            c3782o.f10715G = this.f10734F;
            if ((i10 & 4096) == 4096) {
                i11 |= 512;
            }
            c3782o.f10716H = this.f10735G;
            if ((this.f10738t & 8192) == 8192) {
                this.f10736H = Collections.unmodifiableList(this.f10736H);
                this.f10738t &= -8193;
            }
            c3782o.f10717I = this.f10736H;
            if ((this.f10738t & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                this.f10737I = Collections.unmodifiableList(this.f10737I);
                this.f10738t &= -16385;
            }
            c3782o.f10718J = this.f10737I;
            c3782o.f10722t = i11;
            return c3782o;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14673t().mo14019j(m14693r());
        }

        /* JADX INFO: renamed from: z */
        private void m14679z() {
        }
    }

    public C3782o(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10713E = -1;
        this.f10719K = (byte) -1;
        this.f10720L = -1;
        this.f10721s = cVar.m25225i();
    }

    public C3782o(boolean z10) {
        this.f10713E = -1;
        this.f10719K = (byte) -1;
        this.f10720L = -1;
        this.f10721s = AbstractC6348e.f19966q;
    }
}
