package p177m0;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import p004a3.AbstractC0042h;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p104h3.AbstractC2869v;
import p104h3.C2852e;
import p104h3.C2853f;
import p104h3.C2857j;
import p104h3.C2858k;
import p104h3.C2859l;
import p121i3.C3173c;
import p121i3.C3193w;
import p135j2.AbstractC3503b;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4528c2;
import p166l2.AbstractC4546h0;
import p166l2.AbstractC4590u;
import p166l2.InterfaceC4524b2;
import p166l2.InterfaceC4534e0;
import p166l2.InterfaceC4587t;
import p172l8.C4700i0;
import p215oc.C5706c;
import p263s.AbstractC6635e;
import p265s1.AbstractC7078g1;
import p265s1.C7080g3;
import p265s1.C7128q1;
import p265s1.InterfaceC7088i1;
import p265s1.InterfaceC7143t1;
import p277t2.AbstractC8070f0;
import p277t2.InterfaceC8074h0;
import p290u1.AbstractC8488g;
import p290u1.C8491j;
import p290u1.InterfaceC8484c;
import p319w2.C9058e;
import p319w2.C9122q3;
import p319w2.C9147v3;
import p319w2.InterfaceC9143v;

/* JADX INFO: renamed from: m0.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4766d0 extends InterfaceC4507m.c implements InterfaceC4534e0, InterfaceC4587t, InterfaceC4524b2 {

    /* JADX INFO: renamed from: F */
    public String f14111F;

    /* JADX INFO: renamed from: G */
    public C9147v3 f14112G;

    /* JADX INFO: renamed from: H */
    public AbstractC0042h.b f14113H;

    /* JADX INFO: renamed from: I */
    public int f14114I;

    /* JADX INFO: renamed from: J */
    public boolean f14115J;

    /* JADX INFO: renamed from: K */
    public int f14116K;

    /* JADX INFO: renamed from: L */
    public int f14117L;

    /* JADX INFO: renamed from: M */
    public InterfaceC7143t1 f14118M;

    /* JADX INFO: renamed from: N */
    public Map f14119N;

    /* JADX INFO: renamed from: O */
    public C4769g f14120O;

    /* JADX INFO: renamed from: P */
    public InterfaceC0184l f14121P;

    /* JADX INFO: renamed from: Q */
    public a f14122Q;

    public C4766d0(String str, C9147v3 c9147v3, AbstractC0042h.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC7143t1 interfaceC7143t1) {
        this.f14111F = str;
        this.f14112G = c9147v3;
        this.f14113H = bVar;
        this.f14114I = i10;
        this.f14115J = z10;
        this.f14116K = i11;
        this.f14117L = i12;
        this.f14118M = interfaceC7143t1;
    }

    /* JADX INFO: renamed from: G2 */
    public static boolean m19059G2(C4766d0 c4766d0) {
        c4766d0.m19065L2();
        c4766d0.m19064Q2();
        return true;
    }

    /* JADX INFO: renamed from: H2 */
    public static C4700i0 m19060H2(AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, 0, 0, 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: I2 */
    public static boolean m19061I2(C4766d0 c4766d0, boolean z10) {
        a aVar = c4766d0.f14122Q;
        if (aVar == null) {
            return false;
        }
        aVar.m19078e(z10);
        c4766d0.m19064Q2();
        return true;
    }

    /* JADX INFO: renamed from: J2 */
    public static boolean m19062J2(C4766d0 c4766d0, C9058e c9058e) {
        c4766d0.m19070R2(c9058e.m35156k());
        c4766d0.m19064Q2();
        return true;
    }

    /* JADX INFO: renamed from: K2 */
    public static boolean m19063K2(C4766d0 c4766d0, List list) {
        C4769g c4769gM19067N2 = c4766d0.m19067N2();
        C9147v3 c9147v3 = c4766d0.f14112G;
        InterfaceC7143t1 interfaceC7143t1 = c4766d0.f14118M;
        C9122q3 c9122q3M19116p = c4769gM19067N2.m19116p(c9147v3.m35549K((16609104 & 1) != 0 ? C7128q1.f23644b.m28147h() : interfaceC7143t1 != null ? interfaceC7143t1.mo3692a() : C7128q1.f23644b.m28147h(), (16609104 & 2) != 0 ? C3193w.f8489b.m12108a() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & 128) != 0 ? C3193w.f8489b.m12108a() : 0L, (16609104 & 256) != 0 ? null : null, (16609104 & 512) != 0 ? null : null, (16609104 & 1024) != 0 ? null : null, (16609104 & 2048) != 0 ? C7128q1.f23644b.m28147h() : 0L, (16609104 & 4096) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null, (16609104 & 32768) != 0 ? C2857j.f7471b.m10231g() : 0, (16609104 & 65536) != 0 ? C2859l.f7485b.m10259f() : 0, (16609104 & 131072) != 0 ? C3193w.f8489b.m12108a() : 0L, (16609104 & 262144) != 0 ? null : null, (16609104 & 524288) != 0 ? null : null, (16609104 & 1048576) != 0 ? C2853f.f7424b.m10132b() : 0, (16609104 & 2097152) != 0 ? C2852e.f7419b.m10118c() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null));
        if (c9122q3M19116p != null) {
            list.add(c9122q3M19116p);
        } else {
            c9122q3M19116p = null;
        }
        return c9122q3M19116p != null;
    }

    /* JADX INFO: renamed from: Q2 */
    private final void m19064Q2() {
        AbstractC4528c2.m17573b(this);
        AbstractC4546h0.m17808b(this);
        AbstractC4590u.m18259a(this);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: G */
    public int mo15345G(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return m19068O2(interfaceC3566s).m19106f(i10, interfaceC3566s.getLayoutDirection());
    }

    /* JADX INFO: renamed from: L2 */
    public final void m19065L2() {
        this.f14122Q = null;
    }

    /* JADX INFO: renamed from: M2 */
    public final void m19066M2(boolean z10, boolean z11, boolean z12) {
        if (z11 || z12) {
            m19067N2().m19117q(this.f14111F, this.f14112G, this.f14113H, this.f14114I, this.f14115J, this.f14116K, this.f14117L);
        }
        if (m17461m2()) {
            if (z11 || (z10 && this.f14121P != null)) {
                AbstractC4528c2.m17573b(this);
            }
            if (z11 || z12) {
                AbstractC4546h0.m17808b(this);
                AbstractC4590u.m18259a(this);
            }
            if (z10) {
                AbstractC4590u.m18259a(this);
            }
        }
    }

    /* JADX INFO: renamed from: N2 */
    public final C4769g m19067N2() {
        if (this.f14120O == null) {
            this.f14120O = new C4769g(this.f14111F, this.f14112G, this.f14113H, this.f14114I, this.f14115J, this.f14116K, this.f14117L, null);
        }
        C4769g c4769g = this.f14120O;
        c4769g.getClass();
        return c4769g;
    }

    /* JADX INFO: renamed from: O2 */
    public final C4769g m19068O2(InterfaceC3566s interfaceC3566s) {
        C4769g c4769gM19069P2 = m19069P2();
        c4769gM19069P2.m19114n(interfaceC3566s);
        return c4769gM19069P2;
    }

    /* JADX INFO: renamed from: P2 */
    public final C4769g m19069P2() {
        C4769g c4769gM19074a;
        a aVar = this.f14122Q;
        if (aVar != null) {
            if (!aVar.m19076c()) {
                aVar = null;
            }
            if (aVar != null && (c4769gM19074a = aVar.m19074a()) != null) {
                return c4769gM19074a;
            }
        }
        return m19067N2();
    }

    /* JADX INFO: renamed from: R2 */
    public final boolean m19070R2(String str) {
        a aVar = this.f14122Q;
        if (aVar != null) {
            if (AbstractC1061t.m3842c(str, aVar.m19075b())) {
                return false;
            }
            aVar.m19079f(str);
            C4769g c4769gM19074a = aVar.m19074a();
            if (c4769gM19074a == null) {
                return false;
            }
            c4769gM19074a.m19117q(str, this.f14112G, this.f14113H, this.f14114I, this.f14115J, this.f14116K, this.f14117L);
            return true;
        }
        a aVar2 = new a(this.f14111F, str, false, null, 12, null);
        C4769g c4769g = new C4769g(str, this.f14112G, this.f14113H, this.f14114I, this.f14115J, this.f14116K, this.f14117L, null);
        c4769g.m19114n(m19067N2().m19101a());
        aVar2.m19077d(c4769g);
        this.f14122Q = aVar2;
        return true;
    }

    /* JADX INFO: renamed from: S2 */
    public final boolean m19071S2(InterfaceC7143t1 interfaceC7143t1, C9147v3 c9147v3) {
        boolean zM3842c = AbstractC1061t.m3842c(interfaceC7143t1, this.f14118M);
        this.f14118M = interfaceC7143t1;
        return (zM3842c && c9147v3.m35544F(this.f14112G)) ? false : true;
    }

    /* JADX INFO: renamed from: T2 */
    public final boolean m19072T2(C9147v3 c9147v3, int i10, int i11, boolean z10, AbstractC0042h.b bVar, int i12) {
        boolean z11 = !this.f14112G.m35545G(c9147v3);
        this.f14112G = c9147v3;
        if (this.f14117L != i10) {
            this.f14117L = i10;
            z11 = true;
        }
        if (this.f14116K != i11) {
            this.f14116K = i11;
            z11 = true;
        }
        if (this.f14115J != z10) {
            this.f14115J = z10;
            z11 = true;
        }
        if (!AbstractC1061t.m3842c(this.f14113H, bVar)) {
            this.f14113H = bVar;
            z11 = true;
        }
        if (AbstractC2869v.m10303g(this.f14114I, i12)) {
            return z11;
        }
        this.f14114I = i12;
        return true;
    }

    /* JADX INFO: renamed from: U2 */
    public final boolean m19073U2(String str) {
        if (AbstractC1061t.m3842c(this.f14111F, str)) {
            return false;
        }
        this.f14111F = str;
        m19065L2();
        return true;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            C4769g c4769gM19068O2 = m19068O2(interfaceC3561q0);
            boolean zM19108h = c4769gM19068O2.m19108h(j10, interfaceC3561q0.getLayoutDirection());
            c4769gM19068O2.m19104d();
            InterfaceC9143v interfaceC9143vM19105e = c4769gM19068O2.m19105e();
            interfaceC9143vM19105e.getClass();
            long jM19103c = c4769gM19068O2.m19103c();
            if (zM19108h) {
                AbstractC4546h0.m17807a(this);
                Map map = this.f14119N;
                if (map == null) {
                    map = new HashMap(2);
                    this.f14119N = map;
                }
                map.put(AbstractC3503b.m13041a(), Integer.valueOf(Math.round(interfaceC9143vM19105e.mo35097s())));
                map.put(AbstractC3503b.m13042b(), Integer.valueOf(Math.round(interfaceC9143vM19105e.mo35093o())));
            }
            int i10 = (int) (jM19103c >> 32);
            int i11 = (int) (jM19103c & 4294967295L);
            final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(C3173c.f8451b.m11980b(i10, i10, i11, i11));
            Map map2 = this.f14119N;
            map2.getClass();
            InterfaceC3558p0 interfaceC3558p0Mo1235x0 = interfaceC3561q0.mo1235x0(i10, i11, map2, new InterfaceC0184l() { // from class: m0.c0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C4766d0.m19060H2(abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
                }
            });
            Trace.endSection();
            return interfaceC3558p0Mo1235x0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: g */
    public int mo15346g(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return m19068O2(interfaceC3566s).m19106f(i10, interfaceC3566s.getLayoutDirection());
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return false;
    }

    @Override // p166l2.InterfaceC4587t
    /* JADX INFO: renamed from: o */
    public void mo1376o(InterfaceC8484c interfaceC8484c) {
        if (m17461m2()) {
            C4769g c4769gM19069P2 = m19069P2();
            InterfaceC9143v interfaceC9143vM19105e = c4769gM19069P2.m19105e();
            if (interfaceC9143vM19105e == null) {
                AbstractC6635e.m26319b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f14120O + ", textSubstitution=" + this.f14122Q + ')');
                C5706c.m23089a();
                return;
            }
            InterfaceC7088i1 interfaceC7088i1Mo32635i = interfaceC8484c.mo18044n1().mo32635i();
            boolean zM19102b = c4769gM19069P2.m19102b();
            if (zM19102b) {
                float fM19103c = (int) (c4769gM19069P2.m19103c() >> 32);
                float fM19103c2 = (int) (c4769gM19069P2.m19103c() & 4294967295L);
                interfaceC7088i1Mo32635i.mo27841n();
                InterfaceC7088i1.m27902t(interfaceC7088i1Mo32635i, 0.0f, 0.0f, fM19103c, fM19103c2, 0, 16, null);
            }
            try {
                C2858k c2858kM35539A = this.f14112G.m35539A();
                if (c2858kM35539A == null) {
                    c2858kM35539A = C2858k.f7480b.m10239c();
                }
                C2858k c2858k = c2858kM35539A;
                C7080g3 c7080g3M35574x = this.f14112G.m35574x();
                if (c7080g3M35574x == null) {
                    c7080g3M35574x = C7080g3.f23551d.m27892a();
                }
                C7080g3 c7080g3 = c7080g3M35574x;
                AbstractC8488g abstractC8488gM35559i = this.f14112G.m35559i();
                if (abstractC8488gM35559i == null) {
                    abstractC8488gM35559i = C8491j.f28345a;
                }
                AbstractC8488g abstractC8488g = abstractC8488gM35559i;
                AbstractC7078g1 abstractC7078g1M35557g = this.f14112G.m35557g();
                if (abstractC7078g1M35557g != null) {
                    InterfaceC9143v.m35534F(interfaceC9143vM19105e, interfaceC7088i1Mo32635i, abstractC7078g1M35557g, this.f14112G.m35554d(), c7080g3, c2858k, abstractC8488g, 0, 64, null);
                } else {
                    InterfaceC7143t1 interfaceC7143t1 = this.f14118M;
                    long jMo3692a = interfaceC7143t1 != null ? interfaceC7143t1.mo3692a() : C7128q1.f23644b.m28147h();
                    if (jMo3692a == 16) {
                        jMo3692a = this.f14112G.m35558h() != 16 ? this.f14112G.m35558h() : C7128q1.f23644b.m28140a();
                    }
                    InterfaceC9143v.m35535j(interfaceC9143vM19105e, interfaceC7088i1Mo32635i, jMo3692a, c7080g3, c2858k, abstractC8488g, 0, 32, null);
                }
                if (zM19102b) {
                    interfaceC7088i1Mo32635i.mo27847w();
                }
            } catch (Throwable th) {
                if (zM19102b) {
                    interfaceC7088i1Mo32635i.mo27847w();
                }
                throw th;
            }
        }
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: t */
    public int mo15347t(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return m19068O2(interfaceC3566s).m19111k(interfaceC3566s.getLayoutDirection());
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: v */
    public int mo15348v(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return m19068O2(interfaceC3566s).m19110j(interfaceC3566s.getLayoutDirection());
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: z0 */
    public void mo1261z0(InterfaceC8074h0 interfaceC8074h0) {
        InterfaceC0184l interfaceC0184l = this.f14121P;
        if (interfaceC0184l == null) {
            interfaceC0184l = new InterfaceC0184l() { // from class: m0.y
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return Boolean.valueOf(C4766d0.m19063K2(this.f14251q, (List) obj));
                }
            };
            this.f14121P = interfaceC0184l;
        }
        AbstractC8070f0.m31133q0(interfaceC8074h0, new C9058e(this.f14111F, null, 2, null));
        a aVar = this.f14122Q;
        if (aVar != null) {
            AbstractC8070f0.m31127n0(interfaceC8074h0, aVar.m19076c());
            AbstractC8070f0.m31141u0(interfaceC8074h0, new C9058e(aVar.m19075b(), null, 2, null));
        }
        AbstractC8070f0.m31143v0(interfaceC8074h0, null, new InterfaceC0184l() { // from class: m0.z
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C4766d0.m19062J2(this.f14252q, (C9058e) obj));
            }
        }, 1, null);
        AbstractC8070f0.m31075B0(interfaceC8074h0, null, new InterfaceC0184l() { // from class: m0.a0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C4766d0.m19061I2(this.f14093q, ((Boolean) obj).booleanValue()));
            }
        }, 1, null);
        AbstractC8070f0.m31102b(interfaceC8074h0, null, new InterfaceC0173a() { // from class: m0.b0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Boolean.valueOf(C4766d0.m19059G2(this.f14099q));
            }
        }, 1, null);
        AbstractC8070f0.m31124m(interfaceC8074h0, null, interfaceC0184l, 1, null);
    }

    /* JADX INFO: renamed from: m0.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f14123a;

        /* JADX INFO: renamed from: b */
        public String f14124b;

        /* JADX INFO: renamed from: c */
        public boolean f14125c;

        /* JADX INFO: renamed from: d */
        public C4769g f14126d;

        public /* synthetic */ a(String str, String str2, boolean z10, C4769g c4769g, int i10, AbstractC1043k abstractC1043k) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : c4769g);
        }

        /* JADX INFO: renamed from: a */
        public final C4769g m19074a() {
            return this.f14126d;
        }

        /* JADX INFO: renamed from: b */
        public final String m19075b() {
            return this.f14124b;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m19076c() {
            return this.f14125c;
        }

        /* JADX INFO: renamed from: d */
        public final void m19077d(C4769g c4769g) {
            this.f14126d = c4769g;
        }

        /* JADX INFO: renamed from: e */
        public final void m19078e(boolean z10) {
            this.f14125c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f14123a, aVar.f14123a) && AbstractC1061t.m3842c(this.f14124b, aVar.f14124b) && this.f14125c == aVar.f14125c && AbstractC1061t.m3842c(this.f14126d, aVar.f14126d);
        }

        /* JADX INFO: renamed from: f */
        public final void m19079f(String str) {
            this.f14124b = str;
        }

        public int hashCode() {
            int iHashCode = ((((this.f14123a.hashCode() * 31) + this.f14124b.hashCode()) * 31) + Boolean.hashCode(this.f14125c)) * 31;
            C4769g c4769g = this.f14126d;
            return iHashCode + (c4769g == null ? 0 : c4769g.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.f14126d + ", isShowingSubstitution=" + this.f14125c + ')';
        }

        public a(String str, String str2, boolean z10, C4769g c4769g) {
            this.f14123a = str;
            this.f14124b = str2;
            this.f14125c = z10;
            this.f14126d = c4769g;
        }
    }

    public /* synthetic */ C4766d0(String str, C9147v3 c9147v3, AbstractC0042h.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC7143t1 interfaceC7143t1, AbstractC1043k abstractC1043k) {
        this(str, c9147v3, bVar, i10, z10, i11, i12, interfaceC7143t1);
    }
}
