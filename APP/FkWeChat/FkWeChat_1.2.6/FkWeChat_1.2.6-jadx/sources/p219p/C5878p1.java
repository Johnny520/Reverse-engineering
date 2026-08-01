package p219p;

import android.view.KeyEvent;
import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1023a;
import p042d2.AbstractC1856a;
import p042d2.AbstractC1858c;
import p042d2.AbstractC1859d;
import p042d2.InterfaceC1862g;
import p058e2.AbstractC2004f;
import p058e2.AbstractC2005g;
import p058e2.C2000b;
import p073f2.AbstractC2269u;
import p073f2.C2236d0;
import p073f2.C2261q;
import p073f2.EnumC2265s;
import p121i3.C3196z;
import p135j2.InterfaceC3578w;
import p148k.AbstractC3889m0;
import p166l2.AbstractC4528c2;
import p166l2.AbstractC4557k;
import p166l2.InterfaceC4524b2;
import p166l2.InterfaceC4545h;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p189n.C5189a1;
import p189n.EnumC5190a2;
import p189n.InterfaceC5225h2;
import p219p.AbstractC5870n;
import p219p.C5878p1;
import p228p8.InterfaceC5976f;
import p235q1.AbstractC6204g0;
import p235q1.AbstractC6214l0;
import p242q8.AbstractC6325c;
import p248r.InterfaceC6434j;
import p250r1.C6455e;
import p257r8.AbstractC6544m;
import p277t2.AbstractC8070f0;
import p277t2.InterfaceC8074h0;
import p348y.C9505k;
import p376zd.C10010p0;

/* JADX INFO: renamed from: p.p1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5878p1 extends AbstractC5831b0 implements InterfaceC1862g, InterfaceC4524b2, InterfaceC4545h, InterfaceC5895v0 {

    /* JADX INFO: renamed from: R */
    public InterfaceC5225h2 f18490R;

    /* JADX INFO: renamed from: S */
    public InterfaceC5859j0 f18491S;

    /* JADX INFO: renamed from: T */
    public final boolean f18492T;

    /* JADX INFO: renamed from: U */
    public final C2000b f18493U;

    /* JADX INFO: renamed from: V */
    public final C5840d1 f18494V;

    /* JADX INFO: renamed from: W */
    public final C5864l f18495W;

    /* JADX INFO: renamed from: X */
    public final C5893u1 f18496X;

    /* JADX INFO: renamed from: Y */
    public final C5863k1 f18497Y;

    /* JADX INFO: renamed from: Z */
    public final C5852h f18498Z;

    /* JADX INFO: renamed from: a0 */
    public InterfaceC0188p f18499a0;

    /* JADX INFO: renamed from: b0 */
    public InterfaceC0188p f18500b0;

    /* JADX INFO: renamed from: c0 */
    public C5880q0 f18501c0;

    /* JADX INFO: renamed from: p.p1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18502q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f18503r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0188p f18504s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C5893u1 f18505t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0188p interfaceC0188p, C5893u1 c5893u1, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18504s = interfaceC0188p;
            this.f18505t = c5893u1;
        }

        /* JADX INFO: renamed from: r */
        public static C4700i0 m23661r(InterfaceC5892u0 interfaceC5892u0, C5893u1 c5893u1, AbstractC5870n.b bVar) {
            interfaceC5892u0.mo23730a(c5893u1.m23752E(bVar.m23641a()), AbstractC2005g.f5574a.m7249b());
            return C4700i0.f13910a;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f18504s, this.f18505t, interfaceC5976f);
            aVar.f18503r = obj;
            return aVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18502q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                final InterfaceC5892u0 interfaceC5892u0 = (InterfaceC5892u0) this.f18503r;
                InterfaceC0188p interfaceC0188p = this.f18504s;
                final C5893u1 c5893u1 = this.f18505t;
                InterfaceC0184l interfaceC0184l = new InterfaceC0184l() { // from class: p.o1
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj2) {
                        return C5878p1.a.m23661r(interfaceC5892u0, c5893u1, (AbstractC5870n.b) obj2);
                    }
                };
                this.f18502q = 1;
                if (interfaceC0188p.invoke(interfaceC0184l, this) == objM24992g) {
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

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5892u0 interfaceC5892u0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC5892u0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: p.p1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b extends AbstractC1023a implements InterfaceC0188p {
        public b(Object obj) {
            super(2, obj, C5878p1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        /* JADX INFO: renamed from: a */
        public final Object m23663a(long j10, InterfaceC5976f interfaceC5976f) {
            return C5878p1.m23653r3((C5878p1) this.f3175q, j10, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m23663a(((C3196z) obj).m12144o(), (InterfaceC5976f) obj2);
        }
    }

    /* JADX INFO: renamed from: p.p1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18506q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ long f18508s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18508s = j10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C5878p1.this.new c(this.f18508s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18506q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C5893u1 c5893u1 = C5878p1.this.f18496X;
                long j10 = this.f18508s;
                this.f18506q = 1;
                if (c5893u1.m23764x(j10, false, this) == objM24992g) {
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

    /* JADX INFO: renamed from: p.p1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18509q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ long f18511s;

        /* JADX INFO: renamed from: p.p1$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f18512q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ Object f18513r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ long f18514s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j10, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f18514s = j10;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                a aVar = new a(this.f18514s, interfaceC5976f);
                aVar.f18513r = obj;
                return aVar;
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC6325c.m24992g();
                if (this.f18512q != 0) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
                ((InterfaceC5892u0) this.f18513r).mo23731b(this.f18514s, AbstractC2005g.f5574a.m7249b());
                return C4700i0.f13910a;
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5892u0 interfaceC5892u0, InterfaceC5976f interfaceC5976f) {
                return ((a) create(interfaceC5892u0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18511s = j10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C5878p1.this.new d(this.f18511s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((d) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18509q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C5893u1 c5893u1 = C5878p1.this.f18496X;
                EnumC5190a2 enumC5190a2 = EnumC5190a2.f15824r;
                a aVar = new a(this.f18511s, null);
                this.f18509q = 1;
                if (c5893u1.m23749B(enumC5190a2, aVar, this) == objM24992g) {
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

    /* JADX INFO: renamed from: p.p1$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18515q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ long f18517s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18517s = j10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C5878p1.this.new e(this.f18517s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((e) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18515q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C5893u1 c5893u1 = C5878p1.this.f18496X;
                long j10 = this.f18517s;
                this.f18515q = 1;
                if (c5893u1.m23764x(j10, true, this) == objM24992g) {
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

    /* JADX INFO: renamed from: p.p1$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18518q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ float f18520s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ float f18521t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f10, float f11, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18520s = f10;
            this.f18521t = f11;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C5878p1.this.new f(this.f18520s, this.f18521t, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((f) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18518q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C5893u1 c5893u1 = C5878p1.this.f18496X;
                float f10 = this.f18520s;
                float f11 = this.f18521t;
                long jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
                this.f18518q = 1;
                if (AbstractC5857i1.m23618m(c5893u1, jM25551e, this) == objM24992g) {
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

    /* JADX INFO: renamed from: p.p1$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18522q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ long f18523r;

        public g(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            g gVar = C5878p1.this.new g(interfaceC5976f);
            gVar.f18523r = ((C6455e) obj).m25566t();
            return gVar;
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m23665r(((C6455e) obj).m25566t(), (InterfaceC5976f) obj2);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18522q;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC4713t.m18808b(obj);
                    return obj;
                }
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            long j10 = this.f18523r;
            C5893u1 c5893u1 = C5878p1.this.f18496X;
            this.f18522q = 1;
            Object objM23618m = AbstractC5857i1.m23618m(c5893u1, j10, this);
            return objM23618m == objM24992g ? objM24992g : objM23618m;
        }

        /* JADX INFO: renamed from: r */
        public final Object m23665r(long j10, InterfaceC5976f interfaceC5976f) {
            return ((g) create(C6455e.m25550d(j10), interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C5878p1(InterfaceC5881q1 interfaceC5881q1, InterfaceC5225h2 interfaceC5225h2, InterfaceC5859j0 interfaceC5859j0, EnumC5898w0 enumC5898w0, boolean z10, boolean z11, InterfaceC6434j interfaceC6434j, InterfaceC5842e interfaceC5842e) {
        super(AbstractC5857i1.m23610e(), z10, interfaceC6434j, enumC5898w0);
        this.f18490R = interfaceC5225h2;
        this.f18491S = interfaceC5859j0;
        C2000b c2000b = new C2000b();
        this.f18493U = c2000b;
        this.f18494V = (C5840d1) m18049G2(new C5840d1(z10));
        C5864l c5864l = new C5864l(AbstractC3889m0.m15439c(AbstractC5857i1.m23613h()), null, 2, null);
        this.f18495W = c5864l;
        InterfaceC5225h2 interfaceC5225h22 = this.f18490R;
        InterfaceC5859j0 interfaceC5859j02 = this.f18491S;
        C5893u1 c5893u1 = new C5893u1(interfaceC5881q1, interfaceC5225h22, interfaceC5859j02 == null ? c5864l : interfaceC5859j02, enumC5898w0, z11, c2000b, this, new InterfaceC0173a() { // from class: p.l1
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Boolean.valueOf(C5878p1.m23649l3(this.f18456q));
            }
        });
        this.f18496X = c5893u1;
        C5863k1 c5863k1 = new C5863k1(c5893u1, z10);
        this.f18497Y = c5863k1;
        C5852h c5852h = (C5852h) m18049G2(new C5852h(enumC5898w0, c5893u1, z11, interfaceC5842e));
        this.f18498Z = c5852h;
        m18049G2(AbstractC2004f.m7242c(c5863k1, c2000b));
        m18049G2(AbstractC6204g0.m24387b(AbstractC6214l0.f19289a.m24449b(), null, 2, null));
        m18049G2(new C9505k(c5852h));
        m18049G2(new C5189a1(new InterfaceC0184l() { // from class: p.m1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C5878p1.m23648k3(this.f18475q, (InterfaceC3578w) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k3 */
    public static C4700i0 m23648k3(C5878p1 c5878p1, InterfaceC3578w interfaceC3578w) {
        c5878p1.f18498Z.m23585a3(interfaceC3578w);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: l3 */
    public static boolean m23649l3(C5878p1 c5878p1) {
        return c5878p1.m17461m2();
    }

    /* JADX INFO: renamed from: m3 */
    public static boolean m23650m3(C5878p1 c5878p1, float f10, float f11) {
        AbstractC2148k.m7817d(c5878p1.m17455f2(), null, null, c5878p1.new f(f10, f11, null), 3, null);
        return true;
    }

    /* JADX INFO: renamed from: r3 */
    public static final /* synthetic */ Object m23653r3(C5878p1 c5878p1, long j10, InterfaceC5976f interfaceC5976f) {
        c5878p1.m23657s3(j10);
        return C4700i0.f13910a;
    }

    @Override // p219p.AbstractC5831b0, p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: A0 */
    public void mo8047A0(C2261q c2261q, EnumC2265s enumC2265s, long j10) {
        List listM8216c = c2261q.m8216c();
        int size = listM8216c.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((Boolean) m23502Z2().mo27m((C2236d0) listM8216c.get(i10))).booleanValue()) {
                super.mo8047A0(c2261q, enumC2265s, j10);
                break;
            }
            i10++;
        }
        if (m23503a3()) {
            if (enumC2265s == EnumC2265s.f6225q && AbstractC2269u.m8264i(c2261q.m8220g(), AbstractC2269u.f6230a.m8270f())) {
                m23656q3();
            }
            C5880q0 c5880q0 = this.f18501c0;
            if (c5880q0 != null) {
                c5880q0.m23691w(c2261q, enumC2265s, j10);
            }
        }
    }

    @Override // p042d2.InterfaceC1862g
    /* JADX INFO: renamed from: Q */
    public boolean mo6615Q(KeyEvent keyEvent) {
        return false;
    }

    @Override // p219p.InterfaceC5895v0
    /* JADX INFO: renamed from: S0 */
    public void mo23654S0(long j10) {
        if (m17461m2()) {
            AbstractC4557k.m18003e(this, j10);
        }
    }

    @Override // p219p.AbstractC5831b0
    /* JADX INFO: renamed from: Y2 */
    public Object mo23501Y2(InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        C5893u1 c5893u1 = this.f18496X;
        Object objM23749B = c5893u1.m23749B(EnumC5190a2.f15824r, new a(interfaceC0188p, c5893u1, null), interfaceC5976f);
        return objM23749B == AbstractC6325c.m24992g() ? objM23749B : C4700i0.f13910a;
    }

    @Override // p219p.AbstractC5831b0
    /* JADX INFO: renamed from: d3 */
    public void mo23506d3(long j10) {
        AbstractC2148k.m7817d(this.f18493U.m7218e(), null, null, new c(j10, null), 3, null);
    }

    @Override // p219p.AbstractC5831b0
    /* JADX INFO: renamed from: h3 */
    public boolean mo23510h3() {
        return this.f18496X.m23751D();
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return this.f18492T;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        m23660v3();
        C5880q0 c5880q0 = this.f18501c0;
        if (c5880q0 != null) {
            c5880q0.m23682B(AbstractC4557k.m18011m(this));
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final void m23655p3() {
        this.f18499a0 = null;
        this.f18500b0 = null;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m23656q3() {
        if (this.f18501c0 == null) {
            this.f18501c0 = new C5880q0(this.f18496X, AbstractC5830b.m23488a(this), new b(this), AbstractC4557k.m18011m(this));
        }
        C5880q0 c5880q0 = this.f18501c0;
        if (c5880q0 != null) {
            c5880q0.m23692x(m17455f2());
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final void m23657s3(long j10) {
        AbstractC2148k.m7817d(this.f18493U.m7218e(), null, null, new e(j10, null), 3, null);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m23658t3() {
        this.f18499a0 = new InterfaceC0188p() { // from class: p.n1
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C5878p1.m23650m3(this.f18482q, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            }
        };
        this.f18500b0 = new g(null);
    }

    @Override // p166l2.InterfaceC4553j, p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: u */
    public void mo8056u() {
        mo8048G0();
        m23660v3();
        C5880q0 c5880q0 = this.f18501c0;
        if (c5880q0 != null) {
            c5880q0.m23682B(AbstractC4557k.m18011m(this));
        }
    }

    @Override // p042d2.InterfaceC1862g
    /* JADX INFO: renamed from: u0 */
    public boolean mo6616u0(KeyEvent keyEvent) {
        long jM25551e;
        if (!m23503a3()) {
            return false;
        }
        long jM6605a = AbstractC1859d.m6605a(keyEvent);
        AbstractC1856a.a aVar = AbstractC1856a.f5030a;
        if ((!AbstractC1856a.m6573s(jM6605a, aVar.m6587n()) && !AbstractC1856a.m6573s(AbstractC1859d.m6605a(keyEvent), aVar.m6588o())) || !AbstractC1858c.m6601e(AbstractC1859d.m6606b(keyEvent), AbstractC1858c.f5187a.m6602a()) || AbstractC1859d.m6609e(keyEvent)) {
            return false;
        }
        boolean zM23763w = this.f18496X.m23763w();
        C5852h c5852h = this.f18498Z;
        if (zM23763w) {
            int iM23582W2 = (int) (c5852h.m23582W2() & 4294967295L);
            jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(AbstractC1856a.m6573s(AbstractC1859d.m6605a(keyEvent), aVar.m6588o()) ? iM23582W2 : -iM23582W2)) & 4294967295L));
        } else {
            int iM23582W22 = (int) (c5852h.m23582W2() >> 32);
            jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(AbstractC1856a.m6573s(AbstractC1859d.m6605a(keyEvent), aVar.m6588o()) ? iM23582W22 : -iM23582W22)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        AbstractC2148k.m7817d(m17455f2(), null, null, new d(jM25551e, null), 3, null);
        return true;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m23659u3(InterfaceC5881q1 interfaceC5881q1, EnumC5898w0 enumC5898w0, InterfaceC5225h2 interfaceC5225h2, boolean z10, boolean z11, InterfaceC5859j0 interfaceC5859j0, InterfaceC6434j interfaceC6434j, InterfaceC5842e interfaceC5842e) {
        boolean z12;
        if (m23503a3() != z10) {
            this.f18497Y.m23622a(z10);
            this.f18494V.m23530H2(z10);
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z13 = z12;
        boolean zM23758K = this.f18496X.m23758K(interfaceC5881q1, enumC5898w0, interfaceC5225h2, z11, interfaceC5859j0 == null ? this.f18495W : interfaceC5859j0, this.f18493U);
        this.f18498Z.m23588d3(enumC5898w0, z11, interfaceC5842e);
        this.f18490R = interfaceC5225h2;
        this.f18491S = interfaceC5859j0;
        m23512j3(AbstractC5857i1.m23610e(), z10, interfaceC6434j, this.f18496X.m23763w() ? EnumC5898w0.f18786q : EnumC5898w0.f18787r, zM23758K);
        if (z13) {
            m23655p3();
            AbstractC4528c2.m17573b(this);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final void m23660v3() {
        if (m17461m2()) {
            this.f18495W.m23626g(AbstractC4557k.m18011m(this));
        }
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: z0 */
    public void mo1261z0(InterfaceC8074h0 interfaceC8074h0) {
        if (m23503a3() && (this.f18499a0 == null || this.f18500b0 == null)) {
            m23658t3();
        }
        InterfaceC0188p interfaceC0188p = this.f18499a0;
        if (interfaceC0188p != null) {
            AbstractC8070f0.m31088O(interfaceC8074h0, null, interfaceC0188p, 1, null);
        }
        InterfaceC0188p interfaceC0188p2 = this.f18500b0;
        if (interfaceC0188p2 != null) {
            AbstractC8070f0.m31089P(interfaceC8074h0, interfaceC0188p2);
        }
    }

    @Override // p219p.AbstractC5831b0
    /* JADX INFO: renamed from: c3 */
    public void mo23505c3(long j10) {
    }
}
