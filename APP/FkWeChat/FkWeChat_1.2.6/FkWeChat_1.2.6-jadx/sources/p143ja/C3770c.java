package p143ja;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import qa.AbstractC6344a;
import qa.AbstractC6345b;
import qa.AbstractC6348e;
import qa.AbstractC6353j;
import qa.AbstractC6354k;
import qa.C6349f;
import qa.C6350g;
import qa.C6351h;
import qa.InterfaceC6360q;
import qa.InterfaceC6361r;
import qa.InterfaceC6362s;

/* JADX INFO: renamed from: ja.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3770c extends AbstractC6353j.d implements InterfaceC6361r {

    /* JADX INFO: renamed from: b0 */
    public static final C3770c f10453b0;

    /* JADX INFO: renamed from: c0 */
    public static InterfaceC6362s f10454c0 = new a();

    /* JADX INFO: renamed from: A */
    public int f10455A;

    /* JADX INFO: renamed from: B */
    public List f10456B;

    /* JADX INFO: renamed from: C */
    public int f10457C;

    /* JADX INFO: renamed from: D */
    public List f10458D;

    /* JADX INFO: renamed from: E */
    public List f10459E;

    /* JADX INFO: renamed from: F */
    public int f10460F;

    /* JADX INFO: renamed from: G */
    public List f10461G;

    /* JADX INFO: renamed from: H */
    public List f10462H;

    /* JADX INFO: renamed from: I */
    public List f10463I;

    /* JADX INFO: renamed from: J */
    public List f10464J;

    /* JADX INFO: renamed from: K */
    public List f10465K;

    /* JADX INFO: renamed from: L */
    public List f10466L;

    /* JADX INFO: renamed from: M */
    public int f10467M;

    /* JADX INFO: renamed from: N */
    public int f10468N;

    /* JADX INFO: renamed from: O */
    public C3785r f10469O;

    /* JADX INFO: renamed from: P */
    public int f10470P;

    /* JADX INFO: renamed from: Q */
    public List f10471Q;

    /* JADX INFO: renamed from: R */
    public int f10472R;

    /* JADX INFO: renamed from: S */
    public List f10473S;

    /* JADX INFO: renamed from: T */
    public List f10474T;

    /* JADX INFO: renamed from: U */
    public int f10475U;

    /* JADX INFO: renamed from: V */
    public C3788u f10476V;

    /* JADX INFO: renamed from: W */
    public List f10477W;

    /* JADX INFO: renamed from: X */
    public C3791x f10478X;

    /* JADX INFO: renamed from: Y */
    public List f10479Y;

    /* JADX INFO: renamed from: Z */
    public byte f10480Z;

    /* JADX INFO: renamed from: a0 */
    public int f10481a0;

    /* JADX INFO: renamed from: s */
    public final AbstractC6348e f10482s;

    /* JADX INFO: renamed from: t */
    public int f10483t;

    /* JADX INFO: renamed from: u */
    public int f10484u;

    /* JADX INFO: renamed from: v */
    public int f10485v;

    /* JADX INFO: renamed from: w */
    public int f10486w;

    /* JADX INFO: renamed from: x */
    public List f10487x;

    /* JADX INFO: renamed from: y */
    public List f10488y;

    /* JADX INFO: renamed from: z */
    public List f10489z;

    /* JADX INFO: renamed from: ja.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3770c mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3770c(c6349f, c6351h);
        }
    }

    /* JADX INFO: renamed from: ja.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum c implements AbstractC6354k.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* JADX INFO: renamed from: y */
        public static AbstractC6354k.b f10523y = new a();

        /* JADX INFO: renamed from: q */
        public final int f10525q;

        /* JADX INFO: renamed from: ja.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements AbstractC6354k.b {
            @Override // qa.AbstractC6354k.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo14093a(int i10) {
                return c.m14246a(i10);
            }
        }

        c(int i10, int i11) {
            this.f10525q = i11;
        }

        /* JADX INFO: renamed from: a */
        public static c m14246a(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // qa.AbstractC6354k.a
        /* JADX INFO: renamed from: b */
        public final int mo14092b() {
            return this.f10525q;
        }
    }

    static {
        C3770c c3770c = new C3770c(true);
        f10453b0 = c3770c;
        c3770c.m14151w1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Type inference failed for: r12v51, types: [ja.r$c] */
    /* JADX WARN: Type inference failed for: r12v82, types: [ja.u$b] */
    /* JADX WARN: Type inference failed for: r14v98, types: [ja.x$b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3770c(qa.C6349f r23, qa.C6351h r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143ja.C3770c.<init>(qa.f, qa.h):void");
    }

    /* JADX INFO: renamed from: A1 */
    public static C3770c m14106A1(InputStream inputStream, C6351h c6351h) {
        return (C3770c) f10454c0.mo25021a(inputStream, c6351h);
    }

    /* JADX INFO: renamed from: C0 */
    public static C3770c m14109C0() {
        return f10453b0;
    }

    /* JADX INFO: renamed from: w1 */
    private void m14151w1() {
        this.f10484u = 6;
        this.f10485v = 0;
        this.f10486w = 0;
        List list = Collections.EMPTY_LIST;
        this.f10487x = list;
        this.f10488y = list;
        this.f10489z = list;
        this.f10456B = list;
        this.f10458D = list;
        this.f10459E = list;
        this.f10461G = list;
        this.f10462H = list;
        this.f10463I = list;
        this.f10464J = list;
        this.f10465K = list;
        this.f10466L = list;
        this.f10468N = 0;
        this.f10469O = C3785r.m14785X();
        this.f10470P = 0;
        this.f10471Q = list;
        this.f10473S = list;
        this.f10474T = list;
        this.f10476V = C3788u.m14993w();
        this.f10477W = list;
        this.f10478X = C3791x.m15102u();
        this.f10479Y = list;
    }

    /* JADX INFO: renamed from: x1 */
    public static b m14152x1() {
        return b.m14215t();
    }

    /* JADX INFO: renamed from: y1 */
    public static b m14153y1(C3770c c3770c) {
        return m14152x1().mo14019j(c3770c);
    }

    /* JADX INFO: renamed from: A0 */
    public List m14154A0() {
        return this.f10459E;
    }

    /* JADX INFO: renamed from: B0 */
    public List m14155B0() {
        return this.f10458D;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public b mo13992c() {
        return m14153y1(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C3770c mo14181b() {
        return f10453b0;
    }

    /* JADX INFO: renamed from: E0 */
    public C3775h m14158E0(int i10) {
        return (C3775h) this.f10465K.get(i10);
    }

    /* JADX INFO: renamed from: F0 */
    public int m14159F0() {
        return this.f10465K.size();
    }

    /* JADX INFO: renamed from: G0 */
    public List m14160G0() {
        return this.f10465K;
    }

    /* JADX INFO: renamed from: H0 */
    public int m14161H0() {
        return this.f10484u;
    }

    /* JADX INFO: renamed from: I0 */
    public int m14162I0() {
        return this.f10485v;
    }

    /* JADX INFO: renamed from: J0 */
    public C3777j m14163J0(int i10) {
        return (C3777j) this.f10462H.get(i10);
    }

    /* JADX INFO: renamed from: K0 */
    public int m14164K0() {
        return this.f10462H.size();
    }

    /* JADX INFO: renamed from: L0 */
    public List m14165L0() {
        return this.f10462H;
    }

    /* JADX INFO: renamed from: M0 */
    public int m14166M0() {
        return this.f10468N;
    }

    /* JADX INFO: renamed from: N0 */
    public C3785r m14167N0() {
        return this.f10469O;
    }

    /* JADX INFO: renamed from: O0 */
    public int m14168O0() {
        return this.f10470P;
    }

    /* JADX INFO: renamed from: P0 */
    public int m14169P0() {
        return this.f10471Q.size();
    }

    /* JADX INFO: renamed from: Q0 */
    public List m14170Q0() {
        return this.f10471Q;
    }

    /* JADX INFO: renamed from: R0 */
    public C3785r m14171R0(int i10) {
        return (C3785r) this.f10473S.get(i10);
    }

    /* JADX INFO: renamed from: S0 */
    public int m14172S0() {
        return this.f10473S.size();
    }

    /* JADX INFO: renamed from: T0 */
    public int m14173T0() {
        return this.f10474T.size();
    }

    /* JADX INFO: renamed from: U0 */
    public List m14174U0() {
        return this.f10474T;
    }

    /* JADX INFO: renamed from: V0 */
    public List m14175V0() {
        return this.f10473S;
    }

    /* JADX INFO: renamed from: W0 */
    public List m14176W0() {
        return this.f10456B;
    }

    /* JADX INFO: renamed from: X0 */
    public C3782o m14177X0(int i10) {
        return (C3782o) this.f10463I.get(i10);
    }

    /* JADX INFO: renamed from: Y0 */
    public int m14178Y0() {
        return this.f10463I.size();
    }

    /* JADX INFO: renamed from: Z0 */
    public List m14179Z0() {
        return this.f10463I;
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10480Z;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!m14197q1()) {
            this.f10480Z = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m14190j1(); i10++) {
            if (!m14189i1(i10).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < m14183c1(); i11++) {
            if (!m14182b1(i11).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < m14210z0(); i12++) {
            if (!m14209y0(i12).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < m14207w0(); i13++) {
            if (!m14205v0(i13).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < m14164K0(); i14++) {
            if (!m14163J0(i14).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < m14178Y0(); i15++) {
            if (!m14177X0(i15).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < m14187g1(); i16++) {
            if (!m14186f1(i16).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < m14159F0(); i17++) {
            if (!m14158E0(i17).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        if (m14200s1() && !m14167N0().mo13991a()) {
            this.f10480Z = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < m14172S0(); i18++) {
            if (!m14171R0(i18).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        if (m14204u1() && !m14192l1().mo13991a()) {
            this.f10480Z = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < m14203u0(); i19++) {
            if (!m14201t0(i19).mo13991a()) {
                this.f10480Z = (byte) 0;
                return false;
            }
        }
        if (m25232s()) {
            this.f10480Z = (byte) 1;
            return true;
        }
        this.f10480Z = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: a1 */
    public List m14180a1() {
        return this.f10466L;
    }

    /* JADX INFO: renamed from: b1 */
    public C3785r m14182b1(int i10) {
        return (C3785r) this.f10488y.get(i10);
    }

    /* JADX INFO: renamed from: c1 */
    public int m14183c1() {
        return this.f10488y.size();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        AbstractC6353j.d.a aVarM25238y = m25238y();
        if ((this.f10483t & 1) == 1) {
            c6350g.m25155Z(1, this.f10484u);
        }
        if (m14184d1().size() > 0) {
            c6350g.m25169n0(18);
            c6350g.m25169n0(this.f10455A);
        }
        for (int i10 = 0; i10 < this.f10489z.size(); i10++) {
            c6350g.m25156a0(((Integer) this.f10489z.get(i10)).intValue());
        }
        if ((this.f10483t & 2) == 2) {
            c6350g.m25155Z(3, this.f10485v);
        }
        if ((this.f10483t & 4) == 4) {
            c6350g.m25155Z(4, this.f10486w);
        }
        for (int i11 = 0; i11 < this.f10487x.size(); i11++) {
            c6350g.m25158c0(5, (InterfaceC6360q) this.f10487x.get(i11));
        }
        for (int i12 = 0; i12 < this.f10488y.size(); i12++) {
            c6350g.m25158c0(6, (InterfaceC6360q) this.f10488y.get(i12));
        }
        if (m14176W0().size() > 0) {
            c6350g.m25169n0(58);
            c6350g.m25169n0(this.f10457C);
        }
        for (int i13 = 0; i13 < this.f10456B.size(); i13++) {
            c6350g.m25156a0(((Integer) this.f10456B.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f10461G.size(); i14++) {
            c6350g.m25158c0(8, (InterfaceC6360q) this.f10461G.get(i14));
        }
        for (int i15 = 0; i15 < this.f10462H.size(); i15++) {
            c6350g.m25158c0(9, (InterfaceC6360q) this.f10462H.get(i15));
        }
        for (int i16 = 0; i16 < this.f10463I.size(); i16++) {
            c6350g.m25158c0(10, (InterfaceC6360q) this.f10463I.get(i16));
        }
        for (int i17 = 0; i17 < this.f10464J.size(); i17++) {
            c6350g.m25158c0(11, (InterfaceC6360q) this.f10464J.get(i17));
        }
        for (int i18 = 0; i18 < this.f10465K.size(); i18++) {
            c6350g.m25158c0(13, (InterfaceC6360q) this.f10465K.get(i18));
        }
        if (m14180a1().size() > 0) {
            c6350g.m25169n0(Opcodes.IXOR);
            c6350g.m25169n0(this.f10467M);
        }
        for (int i19 = 0; i19 < this.f10466L.size(); i19++) {
            c6350g.m25156a0(((Integer) this.f10466L.get(i19)).intValue());
        }
        if ((this.f10483t & 8) == 8) {
            c6350g.m25155Z(17, this.f10468N);
        }
        if ((this.f10483t & 16) == 16) {
            c6350g.m25158c0(18, this.f10469O);
        }
        if ((this.f10483t & 32) == 32) {
            c6350g.m25155Z(19, this.f10470P);
        }
        for (int i20 = 0; i20 < this.f10458D.size(); i20++) {
            c6350g.m25158c0(20, (InterfaceC6360q) this.f10458D.get(i20));
        }
        if (m14154A0().size() > 0) {
            c6350g.m25169n0(Opcodes.TABLESWITCH);
            c6350g.m25169n0(this.f10460F);
        }
        for (int i21 = 0; i21 < this.f10459E.size(); i21++) {
            c6350g.m25156a0(((Integer) this.f10459E.get(i21)).intValue());
        }
        if (m14170Q0().size() > 0) {
            c6350g.m25169n0(Opcodes.GETSTATIC);
            c6350g.m25169n0(this.f10472R);
        }
        for (int i22 = 0; i22 < this.f10471Q.size(); i22++) {
            c6350g.m25156a0(((Integer) this.f10471Q.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.f10473S.size(); i23++) {
            c6350g.m25158c0(23, (InterfaceC6360q) this.f10473S.get(i23));
        }
        if (m14174U0().size() > 0) {
            c6350g.m25169n0(Opcodes.MONITORENTER);
            c6350g.m25169n0(this.f10475U);
        }
        for (int i24 = 0; i24 < this.f10474T.size(); i24++) {
            c6350g.m25156a0(((Integer) this.f10474T.get(i24)).intValue());
        }
        if ((this.f10483t & 64) == 64) {
            c6350g.m25158c0(30, this.f10476V);
        }
        for (int i25 = 0; i25 < this.f10477W.size(); i25++) {
            c6350g.m25155Z(31, ((Integer) this.f10477W.get(i25)).intValue());
        }
        if ((this.f10483t & 128) == 128) {
            c6350g.m25158c0(32, this.f10478X);
        }
        for (int i26 = 0; i26 < this.f10479Y.size(); i26++) {
            c6350g.m25158c0(33, (InterfaceC6360q) this.f10479Y.get(i26));
        }
        aVarM25238y.m25240a(19000, c6350g);
        c6350g.m25163h0(this.f10482s);
    }

    /* JADX INFO: renamed from: d1 */
    public List m14184d1() {
        return this.f10489z;
    }

    /* JADX INFO: renamed from: e1 */
    public List m14185e1() {
        return this.f10488y;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10481a0;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10483t & 1) == 1 ? C6350g.m25126o(1, this.f10484u) : 0;
        int iM25127p = 0;
        for (int i11 = 0; i11 < this.f10489z.size(); i11++) {
            iM25127p += C6350g.m25127p(((Integer) this.f10489z.get(i11)).intValue());
        }
        int iM25129r = iM25126o + iM25127p;
        if (!m14184d1().isEmpty()) {
            iM25129r = iM25129r + 1 + C6350g.m25127p(iM25127p);
        }
        this.f10455A = iM25127p;
        if ((this.f10483t & 2) == 2) {
            iM25129r += C6350g.m25126o(3, this.f10485v);
        }
        if ((this.f10483t & 4) == 4) {
            iM25129r += C6350g.m25126o(4, this.f10486w);
        }
        for (int i12 = 0; i12 < this.f10487x.size(); i12++) {
            iM25129r += C6350g.m25129r(5, (InterfaceC6360q) this.f10487x.get(i12));
        }
        for (int i13 = 0; i13 < this.f10488y.size(); i13++) {
            iM25129r += C6350g.m25129r(6, (InterfaceC6360q) this.f10488y.get(i13));
        }
        int iM25127p2 = 0;
        for (int i14 = 0; i14 < this.f10456B.size(); i14++) {
            iM25127p2 += C6350g.m25127p(((Integer) this.f10456B.get(i14)).intValue());
        }
        int iM25129r2 = iM25129r + iM25127p2;
        if (!m14176W0().isEmpty()) {
            iM25129r2 = iM25129r2 + 1 + C6350g.m25127p(iM25127p2);
        }
        this.f10457C = iM25127p2;
        for (int i15 = 0; i15 < this.f10461G.size(); i15++) {
            iM25129r2 += C6350g.m25129r(8, (InterfaceC6360q) this.f10461G.get(i15));
        }
        for (int i16 = 0; i16 < this.f10462H.size(); i16++) {
            iM25129r2 += C6350g.m25129r(9, (InterfaceC6360q) this.f10462H.get(i16));
        }
        for (int i17 = 0; i17 < this.f10463I.size(); i17++) {
            iM25129r2 += C6350g.m25129r(10, (InterfaceC6360q) this.f10463I.get(i17));
        }
        for (int i18 = 0; i18 < this.f10464J.size(); i18++) {
            iM25129r2 += C6350g.m25129r(11, (InterfaceC6360q) this.f10464J.get(i18));
        }
        for (int i19 = 0; i19 < this.f10465K.size(); i19++) {
            iM25129r2 += C6350g.m25129r(13, (InterfaceC6360q) this.f10465K.get(i19));
        }
        int iM25127p3 = 0;
        for (int i20 = 0; i20 < this.f10466L.size(); i20++) {
            iM25127p3 += C6350g.m25127p(((Integer) this.f10466L.get(i20)).intValue());
        }
        int iM25129r3 = iM25129r2 + iM25127p3;
        if (!m14180a1().isEmpty()) {
            iM25129r3 = iM25129r3 + 2 + C6350g.m25127p(iM25127p3);
        }
        this.f10467M = iM25127p3;
        if ((this.f10483t & 8) == 8) {
            iM25129r3 += C6350g.m25126o(17, this.f10468N);
        }
        if ((this.f10483t & 16) == 16) {
            iM25129r3 += C6350g.m25129r(18, this.f10469O);
        }
        if ((this.f10483t & 32) == 32) {
            iM25129r3 += C6350g.m25126o(19, this.f10470P);
        }
        for (int i21 = 0; i21 < this.f10458D.size(); i21++) {
            iM25129r3 += C6350g.m25129r(20, (InterfaceC6360q) this.f10458D.get(i21));
        }
        int iM25127p4 = 0;
        for (int i22 = 0; i22 < this.f10459E.size(); i22++) {
            iM25127p4 += C6350g.m25127p(((Integer) this.f10459E.get(i22)).intValue());
        }
        int iM25127p5 = iM25129r3 + iM25127p4;
        if (!m14154A0().isEmpty()) {
            iM25127p5 = iM25127p5 + 2 + C6350g.m25127p(iM25127p4);
        }
        this.f10460F = iM25127p4;
        int iM25127p6 = 0;
        for (int i23 = 0; i23 < this.f10471Q.size(); i23++) {
            iM25127p6 += C6350g.m25127p(((Integer) this.f10471Q.get(i23)).intValue());
        }
        int iM25129r4 = iM25127p5 + iM25127p6;
        if (!m14170Q0().isEmpty()) {
            iM25129r4 = iM25129r4 + 2 + C6350g.m25127p(iM25127p6);
        }
        this.f10472R = iM25127p6;
        for (int i24 = 0; i24 < this.f10473S.size(); i24++) {
            iM25129r4 += C6350g.m25129r(23, (InterfaceC6360q) this.f10473S.get(i24));
        }
        int iM25127p7 = 0;
        for (int i25 = 0; i25 < this.f10474T.size(); i25++) {
            iM25127p7 += C6350g.m25127p(((Integer) this.f10474T.get(i25)).intValue());
        }
        int iM25129r5 = iM25129r4 + iM25127p7;
        if (!m14174U0().isEmpty()) {
            iM25129r5 = iM25129r5 + 2 + C6350g.m25127p(iM25127p7);
        }
        this.f10475U = iM25127p7;
        if ((this.f10483t & 64) == 64) {
            iM25129r5 += C6350g.m25129r(30, this.f10476V);
        }
        int iM25127p8 = 0;
        for (int i26 = 0; i26 < this.f10477W.size(); i26++) {
            iM25127p8 += C6350g.m25127p(((Integer) this.f10477W.get(i26)).intValue());
        }
        int size = iM25129r5 + iM25127p8 + (m14193m1().size() * 2);
        if ((this.f10483t & 128) == 128) {
            size += C6350g.m25129r(32, this.f10478X);
        }
        for (int i27 = 0; i27 < this.f10479Y.size(); i27++) {
            size += C6350g.m25129r(33, (InterfaceC6360q) this.f10479Y.get(i27));
        }
        int iM25233t = size + m25233t() + this.f10482s.size();
        this.f10481a0 = iM25233t;
        return iM25233t;
    }

    /* JADX INFO: renamed from: f1 */
    public C3786s m14186f1(int i10) {
        return (C3786s) this.f10464J.get(i10);
    }

    /* JADX INFO: renamed from: g1 */
    public int m14187g1() {
        return this.f10464J.size();
    }

    /* JADX INFO: renamed from: h1 */
    public List m14188h1() {
        return this.f10464J;
    }

    /* JADX INFO: renamed from: i1 */
    public C3787t m14189i1(int i10) {
        return (C3787t) this.f10487x.get(i10);
    }

    /* JADX INFO: renamed from: j1 */
    public int m14190j1() {
        return this.f10487x.size();
    }

    /* JADX INFO: renamed from: k1 */
    public List m14191k1() {
        return this.f10487x;
    }

    /* JADX INFO: renamed from: l1 */
    public C3788u m14192l1() {
        return this.f10476V;
    }

    /* JADX INFO: renamed from: m1 */
    public List m14193m1() {
        return this.f10477W;
    }

    /* JADX INFO: renamed from: n1 */
    public C3791x m14194n1() {
        return this.f10478X;
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m14195o1() {
        return (this.f10483t & 4) == 4;
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m14196p1() {
        return (this.f10483t & 1) == 1;
    }

    /* JADX INFO: renamed from: q1 */
    public boolean m14197q1() {
        return (this.f10483t & 2) == 2;
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m14198r1() {
        return (this.f10483t & 8) == 8;
    }

    /* JADX INFO: renamed from: s0 */
    public int m14199s0() {
        return this.f10486w;
    }

    /* JADX INFO: renamed from: s1 */
    public boolean m14200s1() {
        return (this.f10483t & 16) == 16;
    }

    /* JADX INFO: renamed from: t0 */
    public C3771d m14201t0(int i10) {
        return (C3771d) this.f10479Y.get(i10);
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m14202t1() {
        return (this.f10483t & 32) == 32;
    }

    /* JADX INFO: renamed from: u0 */
    public int m14203u0() {
        return this.f10479Y.size();
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m14204u1() {
        return (this.f10483t & 64) == 64;
    }

    /* JADX INFO: renamed from: v0 */
    public C3772e m14205v0(int i10) {
        return (C3772e) this.f10461G.get(i10);
    }

    /* JADX INFO: renamed from: v1 */
    public boolean m14206v1() {
        return (this.f10483t & 128) == 128;
    }

    /* JADX INFO: renamed from: w0 */
    public int m14207w0() {
        return this.f10461G.size();
    }

    /* JADX INFO: renamed from: x0 */
    public List m14208x0() {
        return this.f10461G;
    }

    /* JADX INFO: renamed from: y0 */
    public C3785r m14209y0(int i10) {
        return (C3785r) this.f10458D.get(i10);
    }

    /* JADX INFO: renamed from: z0 */
    public int m14210z0() {
        return this.f10458D.size();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public b mo13995g() {
        return m14152x1();
    }

    /* JADX INFO: renamed from: ja.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j.c implements InterfaceC6361r {

        /* JADX INFO: renamed from: A */
        public List f10490A;

        /* JADX INFO: renamed from: B */
        public List f10491B;

        /* JADX INFO: renamed from: C */
        public List f10492C;

        /* JADX INFO: renamed from: D */
        public List f10493D;

        /* JADX INFO: renamed from: E */
        public List f10494E;

        /* JADX INFO: renamed from: F */
        public List f10495F;

        /* JADX INFO: renamed from: G */
        public List f10496G;

        /* JADX INFO: renamed from: H */
        public List f10497H;

        /* JADX INFO: renamed from: I */
        public List f10498I;

        /* JADX INFO: renamed from: J */
        public int f10499J;

        /* JADX INFO: renamed from: K */
        public C3785r f10500K;

        /* JADX INFO: renamed from: L */
        public int f10501L;

        /* JADX INFO: renamed from: M */
        public List f10502M;

        /* JADX INFO: renamed from: N */
        public List f10503N;

        /* JADX INFO: renamed from: O */
        public List f10504O;

        /* JADX INFO: renamed from: P */
        public C3788u f10505P;

        /* JADX INFO: renamed from: Q */
        public List f10506Q;

        /* JADX INFO: renamed from: R */
        public C3791x f10507R;

        /* JADX INFO: renamed from: S */
        public List f10508S;

        /* JADX INFO: renamed from: t */
        public int f10509t;

        /* JADX INFO: renamed from: u */
        public int f10510u = 6;

        /* JADX INFO: renamed from: v */
        public int f10511v;

        /* JADX INFO: renamed from: w */
        public int f10512w;

        /* JADX INFO: renamed from: x */
        public List f10513x;

        /* JADX INFO: renamed from: y */
        public List f10514y;

        /* JADX INFO: renamed from: z */
        public List f10515z;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f10513x = list;
            this.f10514y = list;
            this.f10515z = list;
            this.f10490A = list;
            this.f10491B = list;
            this.f10492C = list;
            this.f10493D = list;
            this.f10494E = list;
            this.f10495F = list;
            this.f10496G = list;
            this.f10497H = list;
            this.f10498I = list;
            this.f10500K = C3785r.m14785X();
            this.f10502M = list;
            this.f10503N = list;
            this.f10504O = list;
            this.f10505P = C3788u.m14993w();
            this.f10506Q = list;
            this.f10507R = C3791x.m15102u();
            this.f10508S = list;
            m14213L();
        }

        /* JADX INFO: renamed from: t */
        public static b m14215t() {
            return new b();
        }

        /* JADX INFO: renamed from: A */
        public final void m14216A() {
            if ((this.f10509t & 262144) != 262144) {
                this.f10502M = new ArrayList(this.f10502M);
                this.f10509t |= 262144;
            }
        }

        /* JADX INFO: renamed from: B */
        public final void m14217B() {
            if ((this.f10509t & 1048576) != 1048576) {
                this.f10504O = new ArrayList(this.f10504O);
                this.f10509t |= 1048576;
            }
        }

        /* JADX INFO: renamed from: C */
        public final void m14218C() {
            if ((this.f10509t & 524288) != 524288) {
                this.f10503N = new ArrayList(this.f10503N);
                this.f10509t |= 524288;
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m14219D() {
            if ((this.f10509t & 64) != 64) {
                this.f10490A = new ArrayList(this.f10490A);
                this.f10509t |= 64;
            }
        }

        /* JADX INFO: renamed from: E */
        public final void m14220E() {
            if ((this.f10509t & 2048) != 2048) {
                this.f10495F = new ArrayList(this.f10495F);
                this.f10509t |= 2048;
            }
        }

        /* JADX INFO: renamed from: F */
        public final void m14221F() {
            if ((this.f10509t & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                this.f10498I = new ArrayList(this.f10498I);
                this.f10509t |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m14222G() {
            if ((this.f10509t & 32) != 32) {
                this.f10515z = new ArrayList(this.f10515z);
                this.f10509t |= 32;
            }
        }

        /* JADX INFO: renamed from: H */
        public final void m14223H() {
            if ((this.f10509t & 16) != 16) {
                this.f10514y = new ArrayList(this.f10514y);
                this.f10509t |= 16;
            }
        }

        /* JADX INFO: renamed from: I */
        public final void m14224I() {
            if ((this.f10509t & 4096) != 4096) {
                this.f10496G = new ArrayList(this.f10496G);
                this.f10509t |= 4096;
            }
        }

        /* JADX INFO: renamed from: J */
        public final void m14225J() {
            if ((this.f10509t & 8) != 8) {
                this.f10513x = new ArrayList(this.f10513x);
                this.f10509t |= 8;
            }
        }

        /* JADX INFO: renamed from: K */
        public final void m14226K() {
            if ((this.f10509t & 4194304) != 4194304) {
                this.f10506Q = new ArrayList(this.f10506Q);
                this.f10509t |= 4194304;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public b mo14019j(C3770c c3770c) {
            if (c3770c == C3770c.m14109C0()) {
                return this;
            }
            if (c3770c.m14196p1()) {
                m14233S(c3770c.m14161H0());
            }
            if (c3770c.m14197q1()) {
                m14234T(c3770c.m14162I0());
            }
            if (c3770c.m14195o1()) {
                m14232R(c3770c.m14199s0());
            }
            if (!c3770c.f10487x.isEmpty()) {
                if (this.f10513x.isEmpty()) {
                    this.f10513x = c3770c.f10487x;
                    this.f10509t &= -9;
                } else {
                    m14225J();
                    this.f10513x.addAll(c3770c.f10487x);
                }
            }
            if (!c3770c.f10488y.isEmpty()) {
                if (this.f10514y.isEmpty()) {
                    this.f10514y = c3770c.f10488y;
                    this.f10509t &= -17;
                } else {
                    m14223H();
                    this.f10514y.addAll(c3770c.f10488y);
                }
            }
            if (!c3770c.f10489z.isEmpty()) {
                if (this.f10515z.isEmpty()) {
                    this.f10515z = c3770c.f10489z;
                    this.f10509t &= -33;
                } else {
                    m14222G();
                    this.f10515z.addAll(c3770c.f10489z);
                }
            }
            if (!c3770c.f10456B.isEmpty()) {
                if (this.f10490A.isEmpty()) {
                    this.f10490A = c3770c.f10456B;
                    this.f10509t &= -65;
                } else {
                    m14219D();
                    this.f10490A.addAll(c3770c.f10456B);
                }
            }
            if (!c3770c.f10458D.isEmpty()) {
                if (this.f10491B.isEmpty()) {
                    this.f10491B = c3770c.f10458D;
                    this.f10509t &= -129;
                } else {
                    m14243x();
                    this.f10491B.addAll(c3770c.f10458D);
                }
            }
            if (!c3770c.f10459E.isEmpty()) {
                if (this.f10492C.isEmpty()) {
                    this.f10492C = c3770c.f10459E;
                    this.f10509t &= -257;
                } else {
                    m14242w();
                    this.f10492C.addAll(c3770c.f10459E);
                }
            }
            if (!c3770c.f10461G.isEmpty()) {
                if (this.f10493D.isEmpty()) {
                    this.f10493D = c3770c.f10461G;
                    this.f10509t &= -513;
                } else {
                    m14241v();
                    this.f10493D.addAll(c3770c.f10461G);
                }
            }
            if (!c3770c.f10462H.isEmpty()) {
                if (this.f10494E.isEmpty()) {
                    this.f10494E = c3770c.f10462H;
                    this.f10509t &= -1025;
                } else {
                    m14245z();
                    this.f10494E.addAll(c3770c.f10462H);
                }
            }
            if (!c3770c.f10463I.isEmpty()) {
                if (this.f10495F.isEmpty()) {
                    this.f10495F = c3770c.f10463I;
                    this.f10509t &= -2049;
                } else {
                    m14220E();
                    this.f10495F.addAll(c3770c.f10463I);
                }
            }
            if (!c3770c.f10464J.isEmpty()) {
                if (this.f10496G.isEmpty()) {
                    this.f10496G = c3770c.f10464J;
                    this.f10509t &= -4097;
                } else {
                    m14224I();
                    this.f10496G.addAll(c3770c.f10464J);
                }
            }
            if (!c3770c.f10465K.isEmpty()) {
                if (this.f10497H.isEmpty()) {
                    this.f10497H = c3770c.f10465K;
                    this.f10509t &= -8193;
                } else {
                    m14244y();
                    this.f10497H.addAll(c3770c.f10465K);
                }
            }
            if (!c3770c.f10466L.isEmpty()) {
                if (this.f10498I.isEmpty()) {
                    this.f10498I = c3770c.f10466L;
                    this.f10509t &= -16385;
                } else {
                    m14221F();
                    this.f10498I.addAll(c3770c.f10466L);
                }
            }
            if (c3770c.m14198r1()) {
                m14235U(c3770c.m14166M0());
            }
            if (c3770c.m14200s1()) {
                m14229O(c3770c.m14167N0());
            }
            if (c3770c.m14202t1()) {
                m14236V(c3770c.m14168O0());
            }
            if (!c3770c.f10471Q.isEmpty()) {
                if (this.f10502M.isEmpty()) {
                    this.f10502M = c3770c.f10471Q;
                    this.f10509t &= -262145;
                } else {
                    m14216A();
                    this.f10502M.addAll(c3770c.f10471Q);
                }
            }
            if (!c3770c.f10473S.isEmpty()) {
                if (this.f10503N.isEmpty()) {
                    this.f10503N = c3770c.f10473S;
                    this.f10509t &= -524289;
                } else {
                    m14218C();
                    this.f10503N.addAll(c3770c.f10473S);
                }
            }
            if (!c3770c.f10474T.isEmpty()) {
                if (this.f10504O.isEmpty()) {
                    this.f10504O = c3770c.f10474T;
                    this.f10509t &= -1048577;
                } else {
                    m14217B();
                    this.f10504O.addAll(c3770c.f10474T);
                }
            }
            if (c3770c.m14204u1()) {
                m14230P(c3770c.m14192l1());
            }
            if (!c3770c.f10477W.isEmpty()) {
                if (this.f10506Q.isEmpty()) {
                    this.f10506Q = c3770c.f10477W;
                    this.f10509t &= -4194305;
                } else {
                    m14226K();
                    this.f10506Q.addAll(c3770c.f10477W);
                }
            }
            if (c3770c.m14206v1()) {
                m14231Q(c3770c.m14194n1());
            }
            if (!c3770c.f10479Y.isEmpty()) {
                if (this.f10508S.isEmpty()) {
                    this.f10508S = c3770c.f10479Y;
                    this.f10509t &= -16777217;
                } else {
                    m14240u();
                    this.f10508S.addAll(c3770c.f10479Y);
                }
            }
            m25230o(c3770c);
            m25226k(m25225i().m25043c(c3770c.f10482s));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3770c.b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3770c.f10454c0     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.c r3 = (p143ja.C3770c) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.c r4 = (p143ja.C3770c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3770c.b.mo14018e(qa.f, qa.h):ja.c$b");
        }

        /* JADX INFO: renamed from: O */
        public b m14229O(C3785r c3785r) {
            if ((this.f10509t & 65536) != 65536 || this.f10500K == C3785r.m14785X()) {
                this.f10500K = c3785r;
            } else {
                this.f10500K = C3785r.m14788y0(this.f10500K).mo14019j(c3785r).m14869r();
            }
            this.f10509t |= 65536;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public b m14230P(C3788u c3788u) {
            if ((this.f10509t & 2097152) != 2097152 || this.f10505P == C3788u.m14993w()) {
                this.f10505P = c3788u;
            } else {
                this.f10505P = C3788u.m14987E(this.f10505P).mo14019j(c3788u).m15006n();
            }
            this.f10509t |= 2097152;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public b m14231Q(C3791x c3791x) {
            if ((this.f10509t & 8388608) != 8388608 || this.f10507R == C3791x.m15102u()) {
                this.f10507R = c3791x;
            } else {
                this.f10507R = C3791x.m15105z(this.f10507R).mo14019j(c3791x).m15115n();
            }
            this.f10509t |= 8388608;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public b m14232R(int i10) {
            this.f10509t |= 4;
            this.f10512w = i10;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public b m14233S(int i10) {
            this.f10509t |= 1;
            this.f10510u = i10;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public b m14234T(int i10) {
            this.f10509t |= 2;
            this.f10511v = i10;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public b m14235U(int i10) {
            this.f10509t |= 32768;
            this.f10499J = i10;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public b m14236V(int i10) {
            this.f10509t |= 131072;
            this.f10501L = i10;
            return this;
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3770c build() {
            C3770c c3770cM14238r = m14238r();
            if (c3770cM14238r.mo13991a()) {
                return c3770cM14238r;
            }
            throw AbstractC6344a.a.m25020h(c3770cM14238r);
        }

        /* JADX INFO: renamed from: r */
        public C3770c m14238r() {
            C3770c c3770c = new C3770c(this);
            int i10 = this.f10509t;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3770c.f10484u = this.f10510u;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3770c.f10485v = this.f10511v;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3770c.f10486w = this.f10512w;
            if ((this.f10509t & 8) == 8) {
                this.f10513x = Collections.unmodifiableList(this.f10513x);
                this.f10509t &= -9;
            }
            c3770c.f10487x = this.f10513x;
            if ((this.f10509t & 16) == 16) {
                this.f10514y = Collections.unmodifiableList(this.f10514y);
                this.f10509t &= -17;
            }
            c3770c.f10488y = this.f10514y;
            if ((this.f10509t & 32) == 32) {
                this.f10515z = Collections.unmodifiableList(this.f10515z);
                this.f10509t &= -33;
            }
            c3770c.f10489z = this.f10515z;
            if ((this.f10509t & 64) == 64) {
                this.f10490A = Collections.unmodifiableList(this.f10490A);
                this.f10509t &= -65;
            }
            c3770c.f10456B = this.f10490A;
            if ((this.f10509t & 128) == 128) {
                this.f10491B = Collections.unmodifiableList(this.f10491B);
                this.f10509t &= -129;
            }
            c3770c.f10458D = this.f10491B;
            if ((this.f10509t & 256) == 256) {
                this.f10492C = Collections.unmodifiableList(this.f10492C);
                this.f10509t &= -257;
            }
            c3770c.f10459E = this.f10492C;
            if ((this.f10509t & 512) == 512) {
                this.f10493D = Collections.unmodifiableList(this.f10493D);
                this.f10509t &= -513;
            }
            c3770c.f10461G = this.f10493D;
            if ((this.f10509t & 1024) == 1024) {
                this.f10494E = Collections.unmodifiableList(this.f10494E);
                this.f10509t &= -1025;
            }
            c3770c.f10462H = this.f10494E;
            if ((this.f10509t & 2048) == 2048) {
                this.f10495F = Collections.unmodifiableList(this.f10495F);
                this.f10509t &= -2049;
            }
            c3770c.f10463I = this.f10495F;
            if ((this.f10509t & 4096) == 4096) {
                this.f10496G = Collections.unmodifiableList(this.f10496G);
                this.f10509t &= -4097;
            }
            c3770c.f10464J = this.f10496G;
            if ((this.f10509t & 8192) == 8192) {
                this.f10497H = Collections.unmodifiableList(this.f10497H);
                this.f10509t &= -8193;
            }
            c3770c.f10465K = this.f10497H;
            if ((this.f10509t & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                this.f10498I = Collections.unmodifiableList(this.f10498I);
                this.f10509t &= -16385;
            }
            c3770c.f10466L = this.f10498I;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            c3770c.f10468N = this.f10499J;
            if ((i10 & 65536) == 65536) {
                i11 |= 16;
            }
            c3770c.f10469O = this.f10500K;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            c3770c.f10470P = this.f10501L;
            if ((this.f10509t & 262144) == 262144) {
                this.f10502M = Collections.unmodifiableList(this.f10502M);
                this.f10509t &= -262145;
            }
            c3770c.f10471Q = this.f10502M;
            if ((this.f10509t & 524288) == 524288) {
                this.f10503N = Collections.unmodifiableList(this.f10503N);
                this.f10509t &= -524289;
            }
            c3770c.f10473S = this.f10503N;
            if ((this.f10509t & 1048576) == 1048576) {
                this.f10504O = Collections.unmodifiableList(this.f10504O);
                this.f10509t &= -1048577;
            }
            c3770c.f10474T = this.f10504O;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            c3770c.f10476V = this.f10505P;
            if ((this.f10509t & 4194304) == 4194304) {
                this.f10506Q = Collections.unmodifiableList(this.f10506Q);
                this.f10509t &= -4194305;
            }
            c3770c.f10477W = this.f10506Q;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            c3770c.f10478X = this.f10507R;
            if ((this.f10509t & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 16777216) {
                this.f10508S = Collections.unmodifiableList(this.f10508S);
                this.f10509t &= -16777217;
            }
            c3770c.f10479Y = this.f10508S;
            c3770c.f10483t = i11;
            return c3770c;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m14215t().mo14019j(m14238r());
        }

        /* JADX INFO: renamed from: u */
        public final void m14240u() {
            if ((this.f10509t & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 16777216) {
                this.f10508S = new ArrayList(this.f10508S);
                this.f10509t |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            }
        }

        /* JADX INFO: renamed from: v */
        public final void m14241v() {
            if ((this.f10509t & 512) != 512) {
                this.f10493D = new ArrayList(this.f10493D);
                this.f10509t |= 512;
            }
        }

        /* JADX INFO: renamed from: w */
        public final void m14242w() {
            if ((this.f10509t & 256) != 256) {
                this.f10492C = new ArrayList(this.f10492C);
                this.f10509t |= 256;
            }
        }

        /* JADX INFO: renamed from: x */
        public final void m14243x() {
            if ((this.f10509t & 128) != 128) {
                this.f10491B = new ArrayList(this.f10491B);
                this.f10509t |= 128;
            }
        }

        /* JADX INFO: renamed from: y */
        public final void m14244y() {
            if ((this.f10509t & 8192) != 8192) {
                this.f10497H = new ArrayList(this.f10497H);
                this.f10509t |= 8192;
            }
        }

        /* JADX INFO: renamed from: z */
        public final void m14245z() {
            if ((this.f10509t & 1024) != 1024) {
                this.f10494E = new ArrayList(this.f10494E);
                this.f10509t |= 1024;
            }
        }

        /* JADX INFO: renamed from: L */
        private void m14213L() {
        }
    }

    public C3770c(AbstractC6353j.c cVar) {
        super(cVar);
        this.f10455A = -1;
        this.f10457C = -1;
        this.f10460F = -1;
        this.f10467M = -1;
        this.f10472R = -1;
        this.f10475U = -1;
        this.f10480Z = (byte) -1;
        this.f10481a0 = -1;
        this.f10482s = cVar.m25225i();
    }

    public C3770c(boolean z10) {
        this.f10455A = -1;
        this.f10457C = -1;
        this.f10460F = -1;
        this.f10467M = -1;
        this.f10472R = -1;
        this.f10475U = -1;
        this.f10480Z = (byte) -1;
        this.f10481a0 = -1;
        this.f10482s = AbstractC6348e.f19966q;
    }
}
