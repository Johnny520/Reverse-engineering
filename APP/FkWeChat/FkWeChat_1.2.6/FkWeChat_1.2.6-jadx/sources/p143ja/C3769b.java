package p143ja;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

/* JADX INFO: renamed from: ja.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3769b extends AbstractC6353j implements InterfaceC6361r {

    /* JADX INFO: renamed from: x */
    public static final C3769b f10386x;

    /* JADX INFO: renamed from: y */
    public static InterfaceC6362s f10387y = new a();

    /* JADX INFO: renamed from: r */
    public final AbstractC6348e f10388r;

    /* JADX INFO: renamed from: s */
    public int f10389s;

    /* JADX INFO: renamed from: t */
    public int f10390t;

    /* JADX INFO: renamed from: u */
    public List f10391u;

    /* JADX INFO: renamed from: v */
    public byte f10392v;

    /* JADX INFO: renamed from: w */
    public int f10393w;

    /* JADX INFO: renamed from: ja.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6345b {
        @Override // qa.InterfaceC6362s
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3769b mo13999c(C6349f c6349f, C6351h c6351h) {
            return new C3769b(c6349f, c6351h);
        }
    }

    static {
        C3769b c3769b = new C3769b(true);
        f10386x = c3769b;
        c3769b.m13978C();
    }

    public C3769b(C6349f c6349f, C6351h c6351h) {
        this.f10392v = (byte) -1;
        this.f10393w = -1;
        m13978C();
        AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
        C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iM25071J = c6349f.m25071J();
                    if (iM25071J != 0) {
                        if (iM25071J == 8) {
                            this.f10389s |= 1;
                            this.f10390t = c6349f.m25095r();
                        } else if (iM25071J == 18) {
                            if ((c10 & 2) != 2) {
                                this.f10391u = new ArrayList();
                                c10 = 2;
                            }
                            this.f10391u.add(c6349f.m25097t(b.f10395y, c6351h));
                        } else if (!mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((c10 & 2) == 2) {
                        this.f10391u = Collections.unmodifiableList(this.f10391u);
                    }
                    try {
                        c6350gM25111I.m25138H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10388r = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10388r = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            } catch (C6355l e10) {
                throw e10.m25261i(this);
            } catch (IOException e11) {
                throw new C6355l(e11.getMessage()).m25261i(this);
            }
        }
        if ((c10 & 2) == 2) {
            this.f10391u = Collections.unmodifiableList(this.f10391u);
        }
        try {
            c6350gM25111I.m25138H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10388r = bVarM25040t.m25058h();
            throw th3;
        }
        this.f10388r = bVarM25040t.m25058h();
        mo25223m();
    }

    /* JADX INFO: renamed from: C */
    private void m13978C() {
        this.f10390t = 0;
        this.f10391u = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: D */
    public static c m13979D() {
        return c.m14096p();
    }

    /* JADX INFO: renamed from: E */
    public static c m13980E(C3769b c3769b) {
        return m13979D().mo14019j(c3769b);
    }

    /* JADX INFO: renamed from: z */
    public static C3769b m13986z() {
        return f10386x;
    }

    /* JADX INFO: renamed from: A */
    public int m13987A() {
        return this.f10390t;
    }

    /* JADX INFO: renamed from: B */
    public boolean m13988B() {
        return (this.f10389s & 1) == 1;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public c mo13995g() {
        return m13979D();
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public c mo13992c() {
        return m13980E(this);
    }

    @Override // qa.InterfaceC6361r
    /* JADX INFO: renamed from: a */
    public final boolean mo13991a() {
        byte b10 = this.f10392v;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!m13988B()) {
            this.f10392v = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m13997x(); i10++) {
            if (!m13996w(i10).mo13991a()) {
                this.f10392v = (byte) 0;
                return false;
            }
        }
        this.f10392v = (byte) 1;
        return true;
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: d */
    public void mo13993d(C6350g c6350g) throws IOException {
        mo13994f();
        if ((this.f10389s & 1) == 1) {
            c6350g.m25155Z(1, this.f10390t);
        }
        for (int i10 = 0; i10 < this.f10391u.size(); i10++) {
            c6350g.m25158c0(2, (InterfaceC6360q) this.f10391u.get(i10));
        }
        c6350g.m25163h0(this.f10388r);
    }

    @Override // qa.InterfaceC6360q
    /* JADX INFO: renamed from: f */
    public int mo13994f() {
        int i10 = this.f10393w;
        if (i10 != -1) {
            return i10;
        }
        int iM25126o = (this.f10389s & 1) == 1 ? C6350g.m25126o(1, this.f10390t) : 0;
        for (int i11 = 0; i11 < this.f10391u.size(); i11++) {
            iM25126o += C6350g.m25129r(2, (InterfaceC6360q) this.f10391u.get(i11));
        }
        int size = iM25126o + this.f10388r.size();
        this.f10393w = size;
        return size;
    }

    /* JADX INFO: renamed from: w */
    public b m13996w(int i10) {
        return (b) this.f10391u.get(i10);
    }

    /* JADX INFO: renamed from: x */
    public int m13997x() {
        return this.f10391u.size();
    }

    /* JADX INFO: renamed from: y */
    public List m13998y() {
        return this.f10391u;
    }

    /* JADX INFO: renamed from: ja.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6353j implements InterfaceC6361r {

        /* JADX INFO: renamed from: x */
        public static final b f10394x;

        /* JADX INFO: renamed from: y */
        public static InterfaceC6362s f10395y = new a();

        /* JADX INFO: renamed from: r */
        public final AbstractC6348e f10396r;

        /* JADX INFO: renamed from: s */
        public int f10397s;

        /* JADX INFO: renamed from: t */
        public int f10398t;

        /* JADX INFO: renamed from: u */
        public c f10399u;

        /* JADX INFO: renamed from: v */
        public byte f10400v;

        /* JADX INFO: renamed from: w */
        public int f10401w;

        /* JADX INFO: renamed from: ja.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a extends AbstractC6345b {
            @Override // qa.InterfaceC6362s
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b mo13999c(C6349f c6349f, C6351h c6351h) {
                return new b(c6349f, c6351h);
            }
        }

        static {
            b bVar = new b(true);
            f10394x = bVar;
            bVar.m14001A();
        }

        public b(C6349f c6349f, C6351h c6351h) {
            this.f10400v = (byte) -1;
            this.f10401w = -1;
            m14001A();
            AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
            C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iM25071J = c6349f.m25071J();
                        if (iM25071J != 0) {
                            if (iM25071J == 8) {
                                this.f10397s |= 1;
                                this.f10398t = c6349f.m25095r();
                            } else if (iM25071J == 18) {
                                c.C10123b c10123bMo13992c = (this.f10397s & 2) == 2 ? this.f10399u.mo13992c() : null;
                                c cVar = (c) c6349f.m25097t(c.f10406H, c6351h);
                                this.f10399u = cVar;
                                if (c10123bMo13992c != null) {
                                    c10123bMo13992c.mo14019j(cVar);
                                    this.f10399u = c10123bMo13992c.m14080n();
                                }
                                this.f10397s |= 2;
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
                        this.f10396r = bVarM25040t.m25058h();
                        throw th2;
                    }
                    this.f10396r = bVarM25040t.m25058h();
                    mo25223m();
                    throw th;
                }
            }
            try {
                c6350gM25111I.m25138H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f10396r = bVarM25040t.m25058h();
                throw th3;
            }
            this.f10396r = bVarM25040t.m25058h();
            mo25223m();
        }

        /* JADX INFO: renamed from: A */
        private void m14001A() {
            this.f10398t = 0;
            this.f10399u = c.m14033L();
        }

        /* JADX INFO: renamed from: B */
        public static C10122b m14002B() {
            return C10122b.m14017p();
        }

        /* JADX INFO: renamed from: C */
        public static C10122b m14003C(b bVar) {
            return m14002B().mo14019j(bVar);
        }

        /* JADX INFO: renamed from: v */
        public static b m14008v() {
            return f10394x;
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public C10122b mo13995g() {
            return m14002B();
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public C10122b mo13992c() {
            return m14003C(this);
        }

        @Override // qa.InterfaceC6361r
        /* JADX INFO: renamed from: a */
        public final boolean mo13991a() {
            byte b10 = this.f10400v;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!m14013y()) {
                this.f10400v = (byte) 0;
                return false;
            }
            if (!m14014z()) {
                this.f10400v = (byte) 0;
                return false;
            }
            if (m14012x().mo13991a()) {
                this.f10400v = (byte) 1;
                return true;
            }
            this.f10400v = (byte) 0;
            return false;
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: d */
        public void mo13993d(C6350g c6350g) throws IOException {
            mo13994f();
            if ((this.f10397s & 1) == 1) {
                c6350g.m25155Z(1, this.f10398t);
            }
            if ((this.f10397s & 2) == 2) {
                c6350g.m25158c0(2, this.f10399u);
            }
            c6350g.m25163h0(this.f10396r);
        }

        @Override // qa.InterfaceC6360q
        /* JADX INFO: renamed from: f */
        public int mo13994f() {
            int i10 = this.f10401w;
            if (i10 != -1) {
                return i10;
            }
            int iM25126o = (this.f10397s & 1) == 1 ? C6350g.m25126o(1, this.f10398t) : 0;
            if ((this.f10397s & 2) == 2) {
                iM25126o += C6350g.m25129r(2, this.f10399u);
            }
            int size = iM25126o + this.f10396r.size();
            this.f10401w = size;
            return size;
        }

        /* JADX INFO: renamed from: w */
        public int m14011w() {
            return this.f10398t;
        }

        /* JADX INFO: renamed from: x */
        public c m14012x() {
            return this.f10399u;
        }

        /* JADX INFO: renamed from: y */
        public boolean m14013y() {
            return (this.f10397s & 1) == 1;
        }

        /* JADX INFO: renamed from: z */
        public boolean m14014z() {
            return (this.f10397s & 2) == 2;
        }

        /* JADX INFO: renamed from: ja.b$b$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c extends AbstractC6353j implements InterfaceC6361r {

            /* JADX INFO: renamed from: G */
            public static final c f10405G;

            /* JADX INFO: renamed from: H */
            public static InterfaceC6362s f10406H = new a();

            /* JADX INFO: renamed from: A */
            public C3769b f10407A;

            /* JADX INFO: renamed from: B */
            public List f10408B;

            /* JADX INFO: renamed from: C */
            public int f10409C;

            /* JADX INFO: renamed from: D */
            public int f10410D;

            /* JADX INFO: renamed from: E */
            public byte f10411E;

            /* JADX INFO: renamed from: F */
            public int f10412F;

            /* JADX INFO: renamed from: r */
            public final AbstractC6348e f10413r;

            /* JADX INFO: renamed from: s */
            public int f10414s;

            /* JADX INFO: renamed from: t */
            public EnumC10124c f10415t;

            /* JADX INFO: renamed from: u */
            public long f10416u;

            /* JADX INFO: renamed from: v */
            public float f10417v;

            /* JADX INFO: renamed from: w */
            public double f10418w;

            /* JADX INFO: renamed from: x */
            public int f10419x;

            /* JADX INFO: renamed from: y */
            public int f10420y;

            /* JADX INFO: renamed from: z */
            public int f10421z;

            /* JADX INFO: renamed from: ja.b$b$c$a */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static class a extends AbstractC6345b {
                @Override // qa.InterfaceC6362s
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c mo13999c(C6349f c6349f, C6351h c6351h) {
                    return new c(c6349f, c6351h);
                }
            }

            /* JADX INFO: renamed from: ja.b$b$c$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public enum EnumC10124c implements AbstractC6354k.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* JADX INFO: renamed from: E */
                public static AbstractC6354k.b f10438E = new a();

                /* JADX INFO: renamed from: q */
                public final int f10449q;

                /* JADX INFO: renamed from: ja.b$b$c$c$a */
                /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
                public static class a implements AbstractC6354k.b {
                    @Override // qa.AbstractC6354k.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC10124c mo14093a(int i10) {
                        return EnumC10124c.m14091a(i10);
                    }
                }

                EnumC10124c(int i10, int i11) {
                    this.f10449q = i11;
                }

                /* JADX INFO: renamed from: a */
                public static EnumC10124c m14091a(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case Opcodes.FCONST_0 /* 11 */:
                            return ANNOTATION;
                        case Opcodes.FCONST_1 /* 12 */:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // qa.AbstractC6354k.a
                /* JADX INFO: renamed from: b */
                public final int mo14092b() {
                    return this.f10449q;
                }
            }

            static {
                c cVar = new c(true);
                f10405G = cVar;
                cVar.m14068d0();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            public c(C6349f c6349f, C6351h c6351h) {
                this.f10411E = (byte) -1;
                this.f10412F = -1;
                m14068d0();
                AbstractC6348e.b bVarM25040t = AbstractC6348e.m25040t();
                C6350g c6350gM25111I = C6350g.m25111I(bVarM25040t, 1);
                boolean z10 = false;
                char c10 = 0;
                while (true) {
                    ?? Mo25224p = 256;
                    if (z10) {
                        if ((c10 & 256) == 256) {
                            this.f10408B = Collections.unmodifiableList(this.f10408B);
                        }
                        try {
                            c6350gM25111I.m25138H();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            this.f10413r = bVarM25040t.m25058h();
                            throw th;
                        }
                        this.f10413r = bVarM25040t.m25058h();
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
                                    int iM25090m = c6349f.m25090m();
                                    EnumC10124c enumC10124cM14091a = EnumC10124c.m14091a(iM25090m);
                                    if (enumC10124cM14091a == null) {
                                        c6350gM25111I.m25169n0(iM25071J);
                                        c6350gM25111I.m25169n0(iM25090m);
                                    } else {
                                        this.f10414s |= 1;
                                        this.f10415t = enumC10124cM14091a;
                                    }
                                    break;
                                case 16:
                                    this.f10414s |= 2;
                                    this.f10416u = c6349f.m25068G();
                                    break;
                                case 29:
                                    this.f10414s |= 4;
                                    this.f10417v = c6349f.m25093p();
                                    break;
                                case 33:
                                    this.f10414s |= 8;
                                    this.f10418w = c6349f.m25089l();
                                    break;
                                case 40:
                                    this.f10414s |= 16;
                                    this.f10419x = c6349f.m25095r();
                                    break;
                                case 48:
                                    this.f10414s |= 32;
                                    this.f10420y = c6349f.m25095r();
                                    break;
                                case Opcodes.FSTORE /* 56 */:
                                    this.f10414s |= 64;
                                    this.f10421z = c6349f.m25095r();
                                    break;
                                case 66:
                                    c cVarMo13992c = (this.f10414s & 128) == 128 ? this.f10407A.mo13992c() : null;
                                    C3769b c3769b = (C3769b) c6349f.m25097t(C3769b.f10387y, c6351h);
                                    this.f10407A = c3769b;
                                    if (cVarMo13992c != null) {
                                        cVarMo13992c.mo14019j(c3769b);
                                        this.f10407A = cVarMo13992c.m14099n();
                                    }
                                    this.f10414s |= 128;
                                    break;
                                case 74:
                                    if ((c10 & 256) != 256) {
                                        this.f10408B = new ArrayList();
                                        c10 = 256;
                                    }
                                    this.f10408B.add(c6349f.m25097t(f10406H, c6351h));
                                    break;
                                case 80:
                                    this.f10414s |= 512;
                                    this.f10410D = c6349f.m25095r();
                                    break;
                                case Opcodes.POP2 /* 88 */:
                                    this.f10414s |= 256;
                                    this.f10409C = c6349f.m25095r();
                                    break;
                                default:
                                    Mo25224p = mo25224p(c6349f, c6350gM25111I, c6351h, iM25071J);
                                    if (Mo25224p == 0) {
                                        z10 = true;
                                    }
                                    break;
                            }
                        } catch (Throwable th2) {
                            if ((c10 & 256) == Mo25224p) {
                                this.f10408B = Collections.unmodifiableList(this.f10408B);
                            }
                            try {
                                c6350gM25111I.m25138H();
                            } catch (IOException unused2) {
                            } catch (Throwable th3) {
                                this.f10413r = bVarM25040t.m25058h();
                                throw th3;
                            }
                            this.f10413r = bVarM25040t.m25058h();
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

            /* JADX INFO: renamed from: L */
            public static c m14033L() {
                return f10405G;
            }

            /* JADX INFO: renamed from: e0 */
            public static C10123b m14034e0() {
                return C10123b.m14073p();
            }

            /* JADX INFO: renamed from: f0 */
            public static C10123b m14035f0(c cVar) {
                return m14034e0().mo14019j(cVar);
            }

            /* JADX INFO: renamed from: F */
            public C3769b m14045F() {
                return this.f10407A;
            }

            /* JADX INFO: renamed from: G */
            public int m14046G() {
                return this.f10409C;
            }

            /* JADX INFO: renamed from: H */
            public c m14047H(int i10) {
                return (c) this.f10408B.get(i10);
            }

            /* JADX INFO: renamed from: I */
            public int m14048I() {
                return this.f10408B.size();
            }

            /* JADX INFO: renamed from: J */
            public List m14049J() {
                return this.f10408B;
            }

            /* JADX INFO: renamed from: K */
            public int m14050K() {
                return this.f10420y;
            }

            /* JADX INFO: renamed from: M */
            public double m14051M() {
                return this.f10418w;
            }

            /* JADX INFO: renamed from: N */
            public int m14052N() {
                return this.f10421z;
            }

            /* JADX INFO: renamed from: O */
            public int m14053O() {
                return this.f10410D;
            }

            /* JADX INFO: renamed from: P */
            public float m14054P() {
                return this.f10417v;
            }

            /* JADX INFO: renamed from: Q */
            public long m14055Q() {
                return this.f10416u;
            }

            /* JADX INFO: renamed from: R */
            public int m14056R() {
                return this.f10419x;
            }

            /* JADX INFO: renamed from: S */
            public EnumC10124c m14057S() {
                return this.f10415t;
            }

            /* JADX INFO: renamed from: T */
            public boolean m14058T() {
                return (this.f10414s & 128) == 128;
            }

            /* JADX INFO: renamed from: U */
            public boolean m14059U() {
                return (this.f10414s & 256) == 256;
            }

            /* JADX INFO: renamed from: V */
            public boolean m14060V() {
                return (this.f10414s & 32) == 32;
            }

            /* JADX INFO: renamed from: W */
            public boolean m14061W() {
                return (this.f10414s & 8) == 8;
            }

            /* JADX INFO: renamed from: X */
            public boolean m14062X() {
                return (this.f10414s & 64) == 64;
            }

            /* JADX INFO: renamed from: Y */
            public boolean m14063Y() {
                return (this.f10414s & 512) == 512;
            }

            /* JADX INFO: renamed from: Z */
            public boolean m14064Z() {
                return (this.f10414s & 4) == 4;
            }

            @Override // qa.InterfaceC6361r
            /* JADX INFO: renamed from: a */
            public final boolean mo13991a() {
                byte b10 = this.f10411E;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (m14058T() && !m14045F().mo13991a()) {
                    this.f10411E = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < m14048I(); i10++) {
                    if (!m14047H(i10).mo13991a()) {
                        this.f10411E = (byte) 0;
                        return false;
                    }
                }
                this.f10411E = (byte) 1;
                return true;
            }

            /* JADX INFO: renamed from: a0 */
            public boolean m14065a0() {
                return (this.f10414s & 2) == 2;
            }

            /* JADX INFO: renamed from: b0 */
            public boolean m14066b0() {
                return (this.f10414s & 16) == 16;
            }

            /* JADX INFO: renamed from: c0 */
            public boolean m14067c0() {
                return (this.f10414s & 1) == 1;
            }

            @Override // qa.InterfaceC6360q
            /* JADX INFO: renamed from: d */
            public void mo13993d(C6350g c6350g) throws IOException {
                mo13994f();
                if ((this.f10414s & 1) == 1) {
                    c6350g.m25147R(1, this.f10415t.mo14092b());
                }
                if ((this.f10414s & 2) == 2) {
                    c6350g.m25174s0(2, this.f10416u);
                }
                if ((this.f10414s & 4) == 4) {
                    c6350g.m25151V(3, this.f10417v);
                }
                if ((this.f10414s & 8) == 8) {
                    c6350g.m25145P(4, this.f10418w);
                }
                if ((this.f10414s & 16) == 16) {
                    c6350g.m25155Z(5, this.f10419x);
                }
                if ((this.f10414s & 32) == 32) {
                    c6350g.m25155Z(6, this.f10420y);
                }
                if ((this.f10414s & 64) == 64) {
                    c6350g.m25155Z(7, this.f10421z);
                }
                if ((this.f10414s & 128) == 128) {
                    c6350g.m25158c0(8, this.f10407A);
                }
                for (int i10 = 0; i10 < this.f10408B.size(); i10++) {
                    c6350g.m25158c0(9, (InterfaceC6360q) this.f10408B.get(i10));
                }
                if ((this.f10414s & 512) == 512) {
                    c6350g.m25155Z(10, this.f10410D);
                }
                if ((this.f10414s & 256) == 256) {
                    c6350g.m25155Z(11, this.f10409C);
                }
                c6350g.m25163h0(this.f10413r);
            }

            /* JADX INFO: renamed from: d0 */
            public final void m14068d0() {
                this.f10415t = EnumC10124c.BYTE;
                this.f10416u = 0L;
                this.f10417v = 0.0f;
                this.f10418w = 0.0d;
                this.f10419x = 0;
                this.f10420y = 0;
                this.f10421z = 0;
                this.f10407A = C3769b.m13986z();
                this.f10408B = Collections.EMPTY_LIST;
                this.f10409C = 0;
                this.f10410D = 0;
            }

            @Override // qa.InterfaceC6360q
            /* JADX INFO: renamed from: f */
            public int mo13994f() {
                int i10 = this.f10412F;
                if (i10 != -1) {
                    return i10;
                }
                int iM25119h = (this.f10414s & 1) == 1 ? C6350g.m25119h(1, this.f10415t.mo14092b()) : 0;
                if ((this.f10414s & 2) == 2) {
                    iM25119h += C6350g.m25137z(2, this.f10416u);
                }
                if ((this.f10414s & 4) == 4) {
                    iM25119h += C6350g.m25123l(3, this.f10417v);
                }
                if ((this.f10414s & 8) == 8) {
                    iM25119h += C6350g.m25117f(4, this.f10418w);
                }
                if ((this.f10414s & 16) == 16) {
                    iM25119h += C6350g.m25126o(5, this.f10419x);
                }
                if ((this.f10414s & 32) == 32) {
                    iM25119h += C6350g.m25126o(6, this.f10420y);
                }
                if ((this.f10414s & 64) == 64) {
                    iM25119h += C6350g.m25126o(7, this.f10421z);
                }
                if ((this.f10414s & 128) == 128) {
                    iM25119h += C6350g.m25129r(8, this.f10407A);
                }
                for (int i11 = 0; i11 < this.f10408B.size(); i11++) {
                    iM25119h += C6350g.m25129r(9, (InterfaceC6360q) this.f10408B.get(i11));
                }
                if ((this.f10414s & 512) == 512) {
                    iM25119h += C6350g.m25126o(10, this.f10410D);
                }
                if ((this.f10414s & 256) == 256) {
                    iM25119h += C6350g.m25126o(11, this.f10409C);
                }
                int size = iM25119h + this.f10413r.size();
                this.f10412F = size;
                return size;
            }

            @Override // qa.InterfaceC6360q
            /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
            public C10123b mo13995g() {
                return m14034e0();
            }

            @Override // qa.InterfaceC6360q
            /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
            public C10123b mo13992c() {
                return m14035f0(this);
            }

            /* JADX INFO: renamed from: ja.b$b$c$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class C10123b extends AbstractC6353j.b implements InterfaceC6361r {

                /* JADX INFO: renamed from: B */
                public int f10423B;

                /* JADX INFO: renamed from: C */
                public int f10424C;

                /* JADX INFO: renamed from: r */
                public int f10425r;

                /* JADX INFO: renamed from: t */
                public long f10427t;

                /* JADX INFO: renamed from: u */
                public float f10428u;

                /* JADX INFO: renamed from: v */
                public double f10429v;

                /* JADX INFO: renamed from: w */
                public int f10430w;

                /* JADX INFO: renamed from: x */
                public int f10431x;

                /* JADX INFO: renamed from: y */
                public int f10432y;

                /* JADX INFO: renamed from: s */
                public EnumC10124c f10426s = EnumC10124c.BYTE;

                /* JADX INFO: renamed from: z */
                public C3769b f10433z = C3769b.m13986z();

                /* JADX INFO: renamed from: A */
                public List f10422A = Collections.EMPTY_LIST;

                public C10123b() {
                    m14074r();
                }

                /* JADX INFO: renamed from: p */
                public static C10123b m14073p() {
                    return new C10123b();
                }

                /* JADX INFO: renamed from: A */
                public C10123b m14075A(float f10) {
                    this.f10425r |= 4;
                    this.f10428u = f10;
                    return this;
                }

                /* JADX INFO: renamed from: B */
                public C10123b m14076B(long j10) {
                    this.f10425r |= 2;
                    this.f10427t = j10;
                    return this;
                }

                /* JADX INFO: renamed from: C */
                public C10123b m14077C(int i10) {
                    this.f10425r |= 16;
                    this.f10430w = i10;
                    return this;
                }

                /* JADX INFO: renamed from: D */
                public C10123b m14078D(EnumC10124c enumC10124c) {
                    enumC10124c.getClass();
                    this.f10425r |= 1;
                    this.f10426s = enumC10124c;
                    return this;
                }

                @Override // qa.InterfaceC6360q.a
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarM14080n = m14080n();
                    if (cVarM14080n.mo13991a()) {
                        return cVarM14080n;
                    }
                    throw AbstractC6344a.a.m25020h(cVarM14080n);
                }

                /* JADX INFO: renamed from: n */
                public c m14080n() {
                    c cVar = new c(this);
                    int i10 = this.f10425r;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f10415t = this.f10426s;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f10416u = this.f10427t;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f10417v = this.f10428u;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f10418w = this.f10429v;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    cVar.f10419x = this.f10430w;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    cVar.f10420y = this.f10431x;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    cVar.f10421z = this.f10432y;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    cVar.f10407A = this.f10433z;
                    if ((this.f10425r & 256) == 256) {
                        this.f10422A = Collections.unmodifiableList(this.f10422A);
                        this.f10425r &= -257;
                    }
                    cVar.f10408B = this.f10422A;
                    if ((i10 & 512) == 512) {
                        i11 |= 256;
                    }
                    cVar.f10409C = this.f10423B;
                    if ((i10 & 1024) == 1024) {
                        i11 |= 512;
                    }
                    cVar.f10410D = this.f10424C;
                    cVar.f10414s = i11;
                    return cVar;
                }

                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public C10123b clone() {
                    return m14073p().mo14019j(m14080n());
                }

                /* JADX INFO: renamed from: q */
                public final void m14082q() {
                    if ((this.f10425r & 256) != 256) {
                        this.f10422A = new ArrayList(this.f10422A);
                        this.f10425r |= 256;
                    }
                }

                /* JADX INFO: renamed from: s */
                public C10123b m14083s(C3769b c3769b) {
                    if ((this.f10425r & 128) != 128 || this.f10433z == C3769b.m13986z()) {
                        this.f10433z = c3769b;
                    } else {
                        this.f10433z = C3769b.m13980E(this.f10433z).mo14019j(c3769b).m14099n();
                    }
                    this.f10425r |= 128;
                    return this;
                }

                @Override // qa.AbstractC6353j.b
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public C10123b mo14019j(c cVar) {
                    if (cVar == c.m14033L()) {
                        return this;
                    }
                    if (cVar.m14067c0()) {
                        m14078D(cVar.m14057S());
                    }
                    if (cVar.m14065a0()) {
                        m14076B(cVar.m14055Q());
                    }
                    if (cVar.m14064Z()) {
                        m14075A(cVar.m14054P());
                    }
                    if (cVar.m14061W()) {
                        m14088x(cVar.m14051M());
                    }
                    if (cVar.m14066b0()) {
                        m14077C(cVar.m14056R());
                    }
                    if (cVar.m14060V()) {
                        m14087w(cVar.m14050K());
                    }
                    if (cVar.m14062X()) {
                        m14089y(cVar.m14052N());
                    }
                    if (cVar.m14058T()) {
                        m14083s(cVar.m14045F());
                    }
                    if (!cVar.f10408B.isEmpty()) {
                        if (this.f10422A.isEmpty()) {
                            this.f10422A = cVar.f10408B;
                            this.f10425r &= -257;
                        } else {
                            m14082q();
                            this.f10422A.addAll(cVar.f10408B);
                        }
                    }
                    if (cVar.m14059U()) {
                        m14086v(cVar.m14046G());
                    }
                    if (cVar.m14063Y()) {
                        m14090z(cVar.m14053O());
                    }
                    m25226k(m25225i().m25043c(cVar.f10413r));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // qa.InterfaceC6360q.a
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public p143ja.C3769b.b.c.C10123b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        qa.s r1 = p143ja.C3769b.b.c.f10406H     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                        java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                        ja.b$b$c r3 = (p143ja.C3769b.b.c) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                        ja.b$b$c r4 = (p143ja.C3769b.b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: p143ja.C3769b.b.c.C10123b.mo14018e(qa.f, qa.h):ja.b$b$c$b");
                }

                /* JADX INFO: renamed from: v */
                public C10123b m14086v(int i10) {
                    this.f10425r |= 512;
                    this.f10423B = i10;
                    return this;
                }

                /* JADX INFO: renamed from: w */
                public C10123b m14087w(int i10) {
                    this.f10425r |= 32;
                    this.f10431x = i10;
                    return this;
                }

                /* JADX INFO: renamed from: x */
                public C10123b m14088x(double d10) {
                    this.f10425r |= 8;
                    this.f10429v = d10;
                    return this;
                }

                /* JADX INFO: renamed from: y */
                public C10123b m14089y(int i10) {
                    this.f10425r |= 64;
                    this.f10432y = i10;
                    return this;
                }

                /* JADX INFO: renamed from: z */
                public C10123b m14090z(int i10) {
                    this.f10425r |= 1024;
                    this.f10424C = i10;
                    return this;
                }

                /* JADX INFO: renamed from: r */
                private void m14074r() {
                }
            }

            public c(AbstractC6353j.b bVar) {
                super(bVar);
                this.f10411E = (byte) -1;
                this.f10412F = -1;
                this.f10413r = bVar.m25225i();
            }

            public c(boolean z10) {
                this.f10411E = (byte) -1;
                this.f10412F = -1;
                this.f10413r = AbstractC6348e.f19966q;
            }
        }

        /* JADX INFO: renamed from: ja.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10122b extends AbstractC6353j.b implements InterfaceC6361r {

            /* JADX INFO: renamed from: r */
            public int f10402r;

            /* JADX INFO: renamed from: s */
            public int f10403s;

            /* JADX INFO: renamed from: t */
            public c f10404t = c.m14033L();

            public C10122b() {
                m14023q();
            }

            /* JADX INFO: renamed from: p */
            public static C10122b m14017p() {
                return new C10122b();
            }

            @Override // qa.InterfaceC6360q.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarM14021n = m14021n();
                if (bVarM14021n.mo13991a()) {
                    return bVarM14021n;
                }
                throw AbstractC6344a.a.m25020h(bVarM14021n);
            }

            /* JADX INFO: renamed from: n */
            public b m14021n() {
                b bVar = new b(this);
                int i10 = this.f10402r;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f10398t = this.f10403s;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f10399u = this.f10404t;
                bVar.f10397s = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C10122b clone() {
                return m14017p().mo14019j(m14021n());
            }

            @Override // qa.AbstractC6353j.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C10122b mo14019j(b bVar) {
                if (bVar == b.m14008v()) {
                    return this;
                }
                if (bVar.m14013y()) {
                    m14027u(bVar.m14011w());
                }
                if (bVar.m14014z()) {
                    m14026t(bVar.m14012x());
                }
                m25226k(m25225i().m25043c(bVar.f10396r));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // qa.InterfaceC6360q.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public p143ja.C3769b.b.C10122b mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    qa.s r1 = p143ja.C3769b.b.f10395y     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                    java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                    ja.b$b r3 = (p143ja.C3769b.b) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                    ja.b$b r4 = (p143ja.C3769b.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: p143ja.C3769b.b.C10122b.mo14018e(qa.f, qa.h):ja.b$b$b");
            }

            /* JADX INFO: renamed from: t */
            public C10122b m14026t(c cVar) {
                if ((this.f10402r & 2) != 2 || this.f10404t == c.m14033L()) {
                    this.f10404t = cVar;
                } else {
                    this.f10404t = c.m14035f0(this.f10404t).mo14019j(cVar).m14080n();
                }
                this.f10402r |= 2;
                return this;
            }

            /* JADX INFO: renamed from: u */
            public C10122b m14027u(int i10) {
                this.f10402r |= 1;
                this.f10403s = i10;
                return this;
            }

            /* JADX INFO: renamed from: q */
            public final void m14023q() {
            }
        }

        public b(AbstractC6353j.b bVar) {
            super(bVar);
            this.f10400v = (byte) -1;
            this.f10401w = -1;
            this.f10396r = bVar.m25225i();
        }

        public b(boolean z10) {
            this.f10400v = (byte) -1;
            this.f10401w = -1;
            this.f10396r = AbstractC6348e.f19966q;
        }
    }

    /* JADX INFO: renamed from: ja.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6353j.b implements InterfaceC6361r {

        /* JADX INFO: renamed from: r */
        public int f10450r;

        /* JADX INFO: renamed from: s */
        public int f10451s;

        /* JADX INFO: renamed from: t */
        public List f10452t = Collections.EMPTY_LIST;

        public c() {
            m14097r();
        }

        /* JADX INFO: renamed from: p */
        public static c m14096p() {
            return new c();
        }

        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3769b build() {
            C3769b c3769bM14099n = m14099n();
            if (c3769bM14099n.mo13991a()) {
                return c3769bM14099n;
            }
            throw AbstractC6344a.a.m25020h(c3769bM14099n);
        }

        /* JADX INFO: renamed from: n */
        public C3769b m14099n() {
            C3769b c3769b = new C3769b(this);
            int i10 = (this.f10450r & 1) != 1 ? 0 : 1;
            c3769b.f10390t = this.f10451s;
            if ((this.f10450r & 2) == 2) {
                this.f10452t = Collections.unmodifiableList(this.f10452t);
                this.f10450r &= -3;
            }
            c3769b.f10391u = this.f10452t;
            c3769b.f10389s = i10;
            return c3769b;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return m14096p().mo14019j(m14099n());
        }

        /* JADX INFO: renamed from: q */
        public final void m14101q() {
            if ((this.f10450r & 2) != 2) {
                this.f10452t = new ArrayList(this.f10452t);
                this.f10450r |= 2;
            }
        }

        @Override // qa.AbstractC6353j.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public c mo14019j(C3769b c3769b) {
            if (c3769b == C3769b.m13986z()) {
                return this;
            }
            if (c3769b.m13988B()) {
                m14104u(c3769b.m13987A());
            }
            if (!c3769b.f10391u.isEmpty()) {
                if (this.f10452t.isEmpty()) {
                    this.f10452t = c3769b.f10391u;
                    this.f10450r &= -3;
                } else {
                    m14101q();
                    this.f10452t.addAll(c3769b.f10391u);
                }
            }
            m25226k(m25225i().m25043c(c3769b.f10388r));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // qa.InterfaceC6360q.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p143ja.C3769b.c mo14018e(qa.C6349f r3, qa.C6351h r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                qa.s r1 = p143ja.C3769b.f10387y     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                java.lang.Object r3 = r1.mo13999c(r3, r4)     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
                ja.b r3 = (p143ja.C3769b) r3     // Catch: java.lang.Throwable -> Lf qa.C6355l -> L11
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
                ja.b r4 = (p143ja.C3769b) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p143ja.C3769b.c.mo14018e(qa.f, qa.h):ja.b$c");
        }

        /* JADX INFO: renamed from: u */
        public c m14104u(int i10) {
            this.f10450r |= 1;
            this.f10451s = i10;
            return this;
        }

        /* JADX INFO: renamed from: r */
        private void m14097r() {
        }
    }

    public C3769b(AbstractC6353j.b bVar) {
        super(bVar);
        this.f10392v = (byte) -1;
        this.f10393w = -1;
        this.f10388r = bVar.m25225i();
    }

    public C3769b(boolean z10) {
        this.f10392v = (byte) -1;
        this.f10393w = -1;
        this.f10388r = AbstractC6348e.f19966q;
    }
}
