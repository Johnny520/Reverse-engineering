package ad;

import bd.AbstractC1109b;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.C4684a0;
import p172l8.C4688c0;
import p172l8.C4694f0;
import p172l8.C4700i0;
import p172l8.C4718y;
import p329wc.AbstractC9216d;
import p329wc.AbstractC9217e;
import p329wc.AbstractC9224l;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;
import p345xc.AbstractC9484b;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9753r1;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9957l;
import p375zc.AbstractC9961n;
import p375zc.C9936a0;
import p375zc.C9944e0;
import p375zc.C9951i;
import p375zc.InterfaceC9971w;

/* JADX INFO: renamed from: ad.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0251e extends AbstractC9753r1 implements InterfaceC9971w {

    /* JADX INFO: renamed from: b */
    public final AbstractC9939c f618b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f619c;

    /* JADX INFO: renamed from: d */
    public final C9951i f620d;

    /* JADX INFO: renamed from: e */
    public String f621e;

    /* JADX INFO: renamed from: f */
    public String f622f;

    /* JADX INFO: renamed from: ad.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC9484b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f624b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC9218f f625c;

        public a(String str, InterfaceC9218f interfaceC9218f) {
            this.f624b = str;
            this.f625c = interfaceC9218f;
        }

        @Override // p345xc.AbstractC9484b, p345xc.InterfaceC9488f
        /* JADX INFO: renamed from: F */
        public void mo631F(String str) {
            str.getClass();
            AbstractC0251e.this.mo740u0(this.f624b, new C9936a0(str, false, this.f625c));
        }

        @Override // p345xc.InterfaceC9488f
        /* JADX INFO: renamed from: a */
        public AbstractC1109b mo635a() {
            return AbstractC0251e.this.mo636b().mo33269a();
        }
    }

    /* JADX INFO: renamed from: ad.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC9484b {

        /* JADX INFO: renamed from: a */
        public final AbstractC1109b f626a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f628c;

        public b(String str) {
            this.f628c = str;
            this.f626a = AbstractC0251e.this.mo636b().mo33269a();
        }

        @Override // p345xc.AbstractC9484b, p345xc.InterfaceC9488f
        /* JADX INFO: renamed from: A */
        public void mo630A(long j10) {
            m742J(Long.toUnsignedString(C4688c0.m18729c(j10)));
        }

        /* JADX INFO: renamed from: J */
        public final void m742J(String str) {
            str.getClass();
            AbstractC0251e.this.mo740u0(this.f628c, new C9936a0(str, false, null, 4, null));
        }

        @Override // p345xc.InterfaceC9488f
        /* JADX INFO: renamed from: a */
        public AbstractC1109b mo635a() {
            return this.f626a;
        }

        @Override // p345xc.AbstractC9484b, p345xc.InterfaceC9488f
        /* JADX INFO: renamed from: i */
        public void mo642i(short s10) {
            m742J(C4694f0.m18760i(C4694f0.m18757c(s10)));
        }

        @Override // p345xc.AbstractC9484b, p345xc.InterfaceC9488f
        /* JADX INFO: renamed from: j */
        public void mo643j(byte b10) {
            m742J(C4718y.m18821j(C4718y.m18817c(b10)));
        }

        @Override // p345xc.AbstractC9484b, p345xc.InterfaceC9488f
        /* JADX INFO: renamed from: z */
        public void mo650z(int i10) {
            m742J(Integer.toUnsignedString(C4684a0.m18703c(i10)));
        }
    }

    public AbstractC0251e(AbstractC9939c abstractC9939c, InterfaceC0184l interfaceC0184l) {
        this.f618b = abstractC9939c;
        this.f619c = interfaceC0184l;
        this.f620d = abstractC9939c.m38514f();
    }

    /* JADX INFO: renamed from: d0 */
    public static C4700i0 m709d0(AbstractC0251e abstractC0251e, AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        abstractC0251e.mo740u0((String) abstractC0251e.m37861U(), abstractC9957l);
        return C4700i0.f13910a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    @Override // p361yc.AbstractC9685d3, p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo632G(p300uc.InterfaceC8662p r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.AbstractC0251e.mo632G(uc.p, java.lang.Object):void");
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: T */
    public void mo721T(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        this.f619c.mo27m(mo736q0());
    }

    @Override // p361yc.AbstractC9753r1
    /* JADX INFO: renamed from: Z */
    public String mo722Z(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str2;
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: a */
    public final AbstractC1109b mo635a() {
        return this.f618b.mo33269a();
    }

    @Override // p361yc.AbstractC9753r1
    /* JADX INFO: renamed from: a0 */
    public String mo723a0(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return AbstractC0261h0.m767g(interfaceC9218f, this.f618b, i10);
    }

    @Override // p375zc.InterfaceC9971w
    /* JADX INFO: renamed from: b */
    public final AbstractC9939c mo636b() {
        return this.f618b;
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: c */
    public InterfaceC9486d mo637c(InterfaceC9218f interfaceC9218f) {
        AbstractC0251e c0285r0;
        interfaceC9218f.getClass();
        InterfaceC0184l interfaceC0184l = m37862V() == null ? this.f619c : new InterfaceC0184l() { // from class: ad.d
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC0251e.m709d0(this.f612q, (AbstractC9957l) obj);
            }
        };
        AbstractC9224l abstractC9224lMo35896j = interfaceC9218f.mo35896j();
        if (AbstractC1061t.m3842c(abstractC9224lMo35896j, AbstractC9225m.b.f31487a) || (abstractC9224lMo35896j instanceof AbstractC9216d)) {
            c0285r0 = new C0285r0(this.f618b, interfaceC0184l);
        } else {
            boolean zM3842c = AbstractC1061t.m3842c(abstractC9224lMo35896j, AbstractC9225m.c.f31488a);
            AbstractC9939c abstractC9939c = this.f618b;
            if (zM3842c) {
                InterfaceC9218f interfaceC9218fM793a = AbstractC0271k1.m793a(interfaceC9218f.mo35894h(0), abstractC9939c.mo33269a());
                AbstractC9224l abstractC9224lMo35896j2 = interfaceC9218fM793a.mo35896j();
                if ((abstractC9224lMo35896j2 instanceof AbstractC9217e) || AbstractC1061t.m3842c(abstractC9224lMo35896j2, AbstractC9224l.b.f31485a)) {
                    c0285r0 = new C0289t0(this.f618b, interfaceC0184l);
                } else {
                    if (!abstractC9939c.m38514f().m38550c()) {
                        throw AbstractC0246c0.m698d(interfaceC9218fM793a);
                    }
                    c0285r0 = new C0285r0(this.f618b, interfaceC0184l);
                }
            } else {
                c0285r0 = new C0281p0(abstractC9939c, interfaceC0184l);
            }
        }
        String str = this.f621e;
        if (str != null) {
            if (c0285r0 instanceof C0289t0) {
                C0289t0 c0289t0 = (C0289t0) c0285r0;
                c0289t0.mo740u0("key", AbstractC9961n.m38576c(str));
                String strMo35888a = this.f622f;
                if (strMo35888a == null) {
                    strMo35888a = interfaceC9218f.mo35888a();
                }
                c0289t0.mo740u0("value", AbstractC9961n.m38576c(strMo35888a));
            } else {
                String strMo35888a2 = this.f622f;
                if (strMo35888a2 == null) {
                    strMo35888a2 = interfaceC9218f.mo35888a();
                }
                c0285r0.mo740u0(str, AbstractC9961n.m38576c(strMo35888a2));
            }
            this.f621e = null;
            this.f622f = null;
        }
        return c0285r0;
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: e */
    public boolean mo639e(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return this.f620d.m38556i();
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo710I(String str, boolean z10) {
        str.getClass();
        mo740u0(str, AbstractC9961n.m38574a(Boolean.valueOf(z10)));
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: f */
    public void mo640f() {
        String str = (String) m37862V();
        if (str == null) {
            this.f619c.mo27m(C9944e0.INSTANCE);
        } else {
            m733n0(str);
        }
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void mo711J(String str, byte b10) {
        str.getClass();
        mo740u0(str, AbstractC9961n.m38575b(Byte.valueOf(b10)));
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void mo712K(String str, char c10) {
        str.getClass();
        mo740u0(str, AbstractC9961n.m38576c(String.valueOf(c10)));
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void mo713L(String str, double d10) {
        str.getClass();
        mo740u0(str, AbstractC9961n.m38575b(Double.valueOf(d10)));
        if (!this.f620d.m38549b() && Math.abs(d10) > Double.MAX_VALUE) {
            throw AbstractC0246c0.m697c(Double.valueOf(d10), str, mo736q0().toString());
        }
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo714M(String str, InterfaceC9218f interfaceC9218f, int i10) {
        str.getClass();
        interfaceC9218f.getClass();
        mo740u0(str, AbstractC9961n.m38576c(interfaceC9218f.mo35892f(i10)));
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo715N(String str, float f10) {
        str.getClass();
        mo740u0(str, AbstractC9961n.m38575b(Float.valueOf(f10)));
        if (!this.f620d.m38549b() && Math.abs(f10) > Float.MAX_VALUE) {
            throw AbstractC0246c0.m697c(Float.valueOf(f10), str, mo736q0().toString());
        }
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public InterfaceC9488f mo716O(String str, InterfaceC9218f interfaceC9218f) {
        str.getClass();
        interfaceC9218f.getClass();
        return AbstractC0244b1.m655b(interfaceC9218f) ? m739t0(str) : AbstractC0244b1.m654a(interfaceC9218f) ? m738s0(str, interfaceC9218f) : super.mo716O(str, interfaceC9218f);
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo717P(String str, int i10) {
        str.getClass();
        mo740u0(str, AbstractC9961n.m38575b(Integer.valueOf(i10)));
    }

    @Override // p361yc.AbstractC9685d3, p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: m */
    public InterfaceC9488f mo645m(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        if (m37862V() == null) {
            return new C0270k0(this.f618b, this.f619c).mo645m(interfaceC9218f);
        }
        if (this.f621e != null) {
            this.f622f = interfaceC9218f.mo35888a();
        }
        return super.mo645m(interfaceC9218f);
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo718Q(String str, long j10) {
        str.getClass();
        mo740u0(str, AbstractC9961n.m38575b(Long.valueOf(j10)));
    }

    /* JADX INFO: renamed from: n0 */
    public void m733n0(String str) {
        str.getClass();
        mo740u0(str, C9944e0.INSTANCE);
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void mo719R(String str, short s10) {
        str.getClass();
        mo740u0(str, AbstractC9961n.m38575b(Short.valueOf(s10)));
    }

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo720S(String str, String str2) {
        str.getClass();
        str2.getClass();
        mo740u0(str, AbstractC9961n.m38576c(str2));
    }

    /* JADX INFO: renamed from: q0 */
    public abstract AbstractC9957l mo736q0();

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC0184l m737r0() {
        return this.f619c;
    }

    /* JADX INFO: renamed from: s0 */
    public final a m738s0(String str, InterfaceC9218f interfaceC9218f) {
        return new a(str, interfaceC9218f);
    }

    /* JADX INFO: renamed from: t0 */
    public final b m739t0(String str) {
        return new b(str);
    }

    /* JADX INFO: renamed from: u0 */
    public abstract void mo740u0(String str, AbstractC9957l abstractC9957l);

    public /* synthetic */ AbstractC0251e(AbstractC9939c abstractC9939c, InterfaceC0184l interfaceC0184l, AbstractC1043k abstractC1043k) {
        this(abstractC9939c, interfaceC0184l);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: v */
    public void mo741v() {
    }
}
