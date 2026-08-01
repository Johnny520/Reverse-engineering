package p264s0;

import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p024b9.C1046l0;
import p113hc.InterfaceC2972c;
import p113hc.InterfaceC2974d;
import p121i3.C3173c;
import p121i3.C3179i;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p163l.AbstractC4277c;
import p163l.C4271b;
import p163l.InterfaceC4303h0;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4546h0;
import p166l2.InterfaceC4534e0;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.InterfaceC6431g;
import p248r.InterfaceC6432h;
import p248r.InterfaceC6436l;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6544m;
import p317w0.C9011j0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: s0.sb */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6938sb extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public InterfaceC6432h f22821F;

    /* JADX INFO: renamed from: G */
    public boolean f22822G;

    /* JADX INFO: renamed from: H */
    public InterfaceC4303h0 f22823H;

    /* JADX INFO: renamed from: I */
    public boolean f22824I;

    /* JADX INFO: renamed from: J */
    public C4271b f22825J;

    /* JADX INFO: renamed from: K */
    public C4271b f22826K;

    /* JADX INFO: renamed from: L */
    public float f22827L = Float.NaN;

    /* JADX INFO: renamed from: M */
    public float f22828M = Float.NaN;

    /* JADX INFO: renamed from: s0.sb$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f22829q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ float f22831s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f22831s = f10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C6938sb.this.new a(this.f22831s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f22829q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C4271b c4271b = C6938sb.this.f22826K;
                if (c4271b != null) {
                    Float fM25847c = AbstractC6533b.m25847c(this.f22831s);
                    InterfaceC4303h0 interfaceC4303h0M27531L2 = C6938sb.this.f22824I ? AbstractC7012xa.f23268f : C6938sb.this.m27531L2();
                    this.f22829q = 1;
                    obj = C4271b.m16787f(c4271b, fM25847c, interfaceC4303h0M27531L2, null, null, this, 12, null);
                    if (obj == objM24992g) {
                        return objM24992g;
                    }
                }
                return C4700i0.f13910a;
            }
            if (i10 != 1) {
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: s0.sb$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f22832q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ float f22834s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f22834s = f10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C6938sb.this.new b(this.f22834s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f22832q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C4271b c4271b = C6938sb.this.f22825J;
                if (c4271b != null) {
                    Float fM25847c = AbstractC6533b.m25847c(this.f22834s);
                    InterfaceC4303h0 interfaceC4303h0M27531L2 = C6938sb.this.f22824I ? AbstractC7012xa.f23268f : C6938sb.this.m27531L2();
                    this.f22832q = 1;
                    obj = C4271b.m16787f(c4271b, fM25847c, interfaceC4303h0M27531L2, null, null, this, 12, null);
                    if (obj == objM24992g) {
                        return objM24992g;
                    }
                }
                return C4700i0.f13910a;
            }
            if (i10 != 1) {
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: s0.sb$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f22835q;

        /* JADX INFO: renamed from: s0.sb$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements InterfaceC2974d {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ C1046l0 f22837q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C6938sb f22838r;

            public a(C1046l0 c1046l0, C6938sb c6938sb) {
                this.f22837q = c1046l0;
                this.f22838r = c6938sb;
            }

            @Override // p113hc.InterfaceC2974d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object mo400a(InterfaceC6431g interfaceC6431g, InterfaceC5976f interfaceC5976f) {
                if (interfaceC6431g instanceof InterfaceC6436l.b) {
                    this.f22837q.f3205q++;
                } else if (interfaceC6431g instanceof InterfaceC6436l.c) {
                    C1046l0 c1046l0 = this.f22837q;
                    c1046l0.f3205q--;
                } else if (interfaceC6431g instanceof InterfaceC6436l.a) {
                    C1046l0 c1046l02 = this.f22837q;
                    c1046l02.f3205q--;
                }
                boolean z10 = this.f22837q.f3205q > 0;
                if (this.f22838r.f22824I != z10) {
                    this.f22838r.f22824I = z10;
                    AbstractC4546h0.m17808b(this.f22838r);
                }
                return C4700i0.f13910a;
            }
        }

        public c(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C6938sb.this.new c(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f22835q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C1046l0 c1046l0 = new C1046l0();
                InterfaceC2972c interfaceC2972cMo25462a = C6938sb.this.m27533N2().mo25462a();
                a aVar = new a(c1046l0, C6938sb.this);
                this.f22835q = 1;
                if (interfaceC2972cMo25462a.mo399b(aVar, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    public C6938sb(InterfaceC6432h interfaceC6432h, boolean z10, InterfaceC4303h0 interfaceC4303h0) {
        this.f22821F = interfaceC6432h;
        this.f22822G = z10;
        this.f22823H = interfaceC4303h0;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m27526G2(AbstractC3545l1 abstractC3545l1, C6938sb c6938sb, float f10, AbstractC3545l1.a aVar) {
        C4271b c4271b = c6938sb.f22825J;
        AbstractC3545l1.a.m13270O(aVar, abstractC3545l1, c4271b != null ? (int) ((Number) c4271b.m16795m()).floatValue() : (int) f10, 0, 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: L2 */
    public final InterfaceC4303h0 m27531L2() {
        return this.f22823H;
    }

    /* JADX INFO: renamed from: M2 */
    public final boolean m27532M2() {
        return this.f22822G;
    }

    /* JADX INFO: renamed from: N2 */
    public final InterfaceC6432h m27533N2() {
        return this.f22821F;
    }

    /* JADX INFO: renamed from: O2 */
    public final void m27534O2(InterfaceC4303h0 interfaceC4303h0) {
        this.f22823H = interfaceC4303h0;
    }

    /* JADX INFO: renamed from: P2 */
    public final void m27535P2(boolean z10) {
        this.f22822G = z10;
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m27536Q2(InterfaceC6432h interfaceC6432h) {
        this.f22821F = interfaceC6432h;
    }

    /* JADX INFO: renamed from: R2 */
    public final void m27537R2() {
        if (this.f22826K == null && !Float.isNaN(this.f22828M)) {
            this.f22826K = AbstractC4277c.m16816b(this.f22828M, 0.0f, 2, null);
        }
        if (this.f22825J != null || Float.isNaN(this.f22827L)) {
            return;
        }
        this.f22825J = AbstractC4277c.m16816b(this.f22827L, 0.0f, 2, null);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        float fMo1233i1 = interfaceC3561q0.mo1233i1(this.f22824I ? C9011j0.f30154a.m34584n() : ((interfaceC3552n0.mo13150t(C3173c.m11973l(j10)) != 0 && interfaceC3552n0.mo13147W(C3173c.m11972k(j10)) != 0) || this.f22822G) ? AbstractC7012xa.m27664i() : AbstractC7012xa.m27665j());
        C4271b c4271b = this.f22826K;
        int iFloatValue = (int) (c4271b != null ? ((Number) c4271b.m16795m()).floatValue() : fMo1233i1);
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(C3173c.f8451b.m11981c(iFloatValue, iFloatValue));
        final float fMo1233i12 = interfaceC3561q0.mo1233i1(C3179i.m12003k(C3179i.m12003k(AbstractC7012xa.f23266d - interfaceC3561q0.mo1227R0(fMo1233i1)) / 2.0f));
        float fMo1233i13 = interfaceC3561q0.mo1233i1(C3179i.m12003k(C3179i.m12003k(AbstractC7012xa.f23265c - AbstractC7012xa.m27664i()) - AbstractC7012xa.f23267e));
        boolean z10 = this.f22824I;
        if (z10 && this.f22822G) {
            fMo1233i12 = fMo1233i13 - interfaceC3561q0.mo1233i1(C9011j0.f30154a.m34591u());
        } else if (z10 && !this.f22822G) {
            fMo1233i12 = interfaceC3561q0.mo1233i1(C9011j0.f30154a.m34591u());
        } else if (this.f22822G) {
            fMo1233i12 = fMo1233i13;
        }
        C4271b c4271b2 = this.f22826K;
        if (!AbstractC1061t.m3841b(c4271b2 != null ? (Float) c4271b2.m16793k() : null, fMo1233i1)) {
            AbstractC2148k.m7817d(m17455f2(), null, null, new a(fMo1233i1, null), 3, null);
        }
        C4271b c4271b3 = this.f22825J;
        if (!AbstractC1061t.m3841b(c4271b3 != null ? (Float) c4271b3.m16793k() : null, fMo1233i12)) {
            AbstractC2148k.m7817d(m17455f2(), null, null, new b(fMo1233i12, null), 3, null);
        }
        if (Float.isNaN(this.f22828M) && Float.isNaN(this.f22827L)) {
            this.f22828M = fMo1233i1;
            this.f22827L = fMo1233i12;
        }
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, iFloatValue, iFloatValue, null, new InterfaceC0184l() { // from class: s0.rb
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C6938sb.m27526G2(abstractC3545l1Mo13148X, this, fMo1233i12, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return false;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        AbstractC2148k.m7817d(m17455f2(), null, null, new c(null), 3, null);
    }
}
