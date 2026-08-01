package p264s0;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1043k;
import p073f2.AbstractC2278y0;
import p073f2.C2236d0;
import p073f2.C2261q;
import p073f2.EnumC2265s;
import p073f2.InterfaceC2229a1;
import p073f2.InterfaceC2254m0;
import p121i3.AbstractC3190t;
import p121i3.C3185o;
import p163l.InterfaceC4317k;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4530d0;
import p166l2.InterfaceC4545h;
import p166l2.InterfaceC4598w1;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p219p.AbstractC5891u;
import p219p.AbstractC5896v1;
import p219p.InterfaceC5901x0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p250r1.C6455e;
import p257r8.AbstractC6544m;
import p264s0.C6673c1;
import p317w0.C9017m0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: s0.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6673c1 extends AbstractC4565m implements InterfaceC4598w1, InterfaceC4545h, InterfaceC4530d0 {

    /* JADX INFO: renamed from: H */
    public C6767i f20945H;

    /* JADX INFO: renamed from: I */
    public boolean f20946I;

    /* JADX INFO: renamed from: J */
    public int f20947J;

    /* JADX INFO: renamed from: K */
    public InterfaceC4317k f20948K;

    /* JADX INFO: renamed from: L */
    public float f20949L;

    /* JADX INFO: renamed from: M */
    public float f20950M;

    /* JADX INFO: renamed from: N */
    public final InterfaceC0512i2 f20951N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC2229a1 f20952O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC2229a1 f20953P;

    /* JADX INFO: renamed from: s0.c1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: s0.c1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10192a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f20955q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C6673c1 f20956r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10192a(C6673c1 c6673c1, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f20956r = c6673c1;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new C10192a(this.f20956r, interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((C10192a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f20955q;
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    if (this.f20956r.f20946I) {
                        this.f20956r.f20945H.mo26852d(C6813kd.f21851b.m27012b());
                    }
                    C6767i c6767i = this.f20956r.f20945H;
                    InterfaceC4317k interfaceC4317k = this.f20956r.f20948K;
                    this.f20955q = 1;
                    if (c6767i.m26865z(interfaceC4317k, this) == objM24992g) {
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

        /* JADX INFO: renamed from: s0.c1$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f20957q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C6673c1 f20958r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C6455e f20959s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C6673c1 c6673c1, C6455e c6455e, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f20958r = c6673c1;
                this.f20959s = c6455e;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new b(this.f20958r, this.f20959s, interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                b bVar;
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f20957q;
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    this.f20958r.f20949L += Float.intBitsToFloat((int) (this.f20959s.m25566t() >> 32));
                    this.f20958r.f20950M += Float.intBitsToFloat((int) (this.f20959s.m25566t() & 4294967295L));
                    C6767i c6767i = this.f20958r.f20945H;
                    float fM26556v0 = AbstractC6685cd.m26556v0(this.f20958r.f20950M - C3185o.m12050j(this.f20958r.m26451V2()), this.f20958r.f20949L - C3185o.m12049i(this.f20958r.m26451V2()));
                    InterfaceC4317k interfaceC4317k = this.f20958r.f20948K;
                    this.f20957q = 1;
                    bVar = this;
                    if (C6767i.m26834B(c6767i, fM26556v0, interfaceC4317k, false, bVar, 4, null) == objM24992g) {
                        return objM24992g;
                    }
                } else {
                    if (i10 != 1) {
                        C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC4713t.m18808b(obj);
                    bVar = this;
                }
                AbstractC6685cd.m26487D0(bVar.f20958r.f20945H, bVar.f20958r.f20949L, bVar.f20958r.f20950M, bVar.f20958r.m26452W2(), bVar.f20958r.m26451V2());
                return C4700i0.f13910a;
            }
        }

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public static C4700i0 m26455a(C6673c1 c6673c1) {
            AbstractC2148k.m7817d(c6673c1.m17455f2(), null, null, new C10192a(c6673c1, null), 3, null);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: b */
        public static C4700i0 m26456b(C6673c1 c6673c1, C2236d0 c2236d0, C6455e c6455e) {
            AbstractC2148k.m7817d(c6673c1.m17455f2(), null, null, new b(c6673c1, c6455e, null), 3, null);
            return C4700i0.f13910a;
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC2254m0 interfaceC2254m0, InterfaceC5976f interfaceC5976f) {
            final C6673c1 c6673c1 = C6673c1.this;
            InterfaceC0173a interfaceC0173a = new InterfaceC0173a() { // from class: s0.a1
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C6673c1.a.m26455a(c6673c1);
                }
            };
            final C6673c1 c6673c12 = C6673c1.this;
            Object objM23723m = AbstractC5891u.m23723m(interfaceC2254m0, null, interfaceC0173a, null, new InterfaceC0188p() { // from class: s0.b1
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return C6673c1.a.m26456b(c6673c12, (C2236d0) obj, (C6455e) obj2);
                }
            }, interfaceC5976f, 5, null);
            return objM23723m == AbstractC6325c.m24992g() ? objM23723m : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: s0.c1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: s0.c1$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6544m implements InterfaceC0189q {

            /* JADX INFO: renamed from: q */
            public int f20961q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ long f20962r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C6673c1 f20963s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6673c1 c6673c1, InterfaceC5976f interfaceC5976f) {
                super(3, interfaceC5976f);
                this.f20963s = c6673c1;
            }

            @Override // p010a9.InterfaceC0189q
            /* JADX INFO: renamed from: e */
            public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
                return m26458r((InterfaceC5901x0) obj, ((C6455e) obj2).m25566t(), (InterfaceC5976f) obj3);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC6325c.m24992g();
                if (this.f20961q != 0) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
                long j10 = this.f20962r;
                this.f20963s.f20949L = Float.intBitsToFloat((int) (j10 >> 32));
                this.f20963s.f20950M = Float.intBitsToFloat((int) (j10 & 4294967295L));
                return C4700i0.f13910a;
            }

            /* JADX INFO: renamed from: r */
            public final Object m26458r(InterfaceC5901x0 interfaceC5901x0, long j10, InterfaceC5976f interfaceC5976f) {
                a aVar = new a(this.f20963s, interfaceC5976f);
                aVar.f20962r = j10;
                return aVar.invokeSuspend(C4700i0.f13910a);
            }
        }

        /* JADX INFO: renamed from: s0.c1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10193b extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f20964q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C6673c1 f20965r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C6455e f20966s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10193b(C6673c1 c6673c1, C6455e c6455e, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f20965r = c6673c1;
                this.f20966s = c6455e;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new C10193b(this.f20965r, this.f20966s, interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((C10193b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f20964q;
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    C6767i c6767i = this.f20965r.f20945H;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f20966s.m25566t() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f20966s.m25566t() & 4294967295L));
                    float fM26452W2 = this.f20965r.m26452W2();
                    boolean z10 = this.f20965r.f20946I;
                    long jM26451V2 = this.f20965r.m26451V2();
                    InterfaceC4317k interfaceC4317k = this.f20965r.f20948K;
                    this.f20964q = 1;
                    if (AbstractC6685cd.m26491F0(c6767i, fIntBitsToFloat, fIntBitsToFloat2, fM26452W2, z10, jM26451V2, interfaceC4317k, this) == objM24992g) {
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

        public b() {
        }

        /* JADX INFO: renamed from: a */
        public static C4700i0 m26457a(C6673c1 c6673c1, C6455e c6455e) {
            AbstractC2148k.m7817d(c6673c1.m17455f2(), null, null, new C10193b(c6673c1, c6455e, null), 3, null);
            return C4700i0.f13910a;
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC2254m0 interfaceC2254m0, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(C6673c1.this, null);
            final C6673c1 c6673c1 = C6673c1.this;
            Object objM23782m = AbstractC5896v1.m23782m(interfaceC2254m0, null, null, aVar, new InterfaceC0184l() { // from class: s0.d1
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C6673c1.b.m26457a(c6673c1, (C6455e) obj);
                }
            }, interfaceC5976f, 3, null);
            return objM23782m == AbstractC6325c.m24992g() ? objM23782m : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: s0.c1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f20967q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C6767i f20968r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC4317k f20969s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6767i c6767i, InterfaceC4317k interfaceC4317k, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f20968r = c6767i;
            this.f20969s = interfaceC4317k;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new c(this.f20968r, this.f20969s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f20967q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C6767i c6767i = this.f20968r;
                InterfaceC4317k interfaceC4317k = this.f20969s;
                this.f20967q = 1;
                if (c6767i.m26856q(interfaceC4317k, this) == objM24992g) {
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

    public C6673c1(C6767i c6767i, boolean z10, int i10, InterfaceC4317k interfaceC4317k) {
        this.f20945H = c6767i;
        this.f20946I = z10;
        this.f20947J = i10;
        this.f20948K = interfaceC4317k;
        this.f20951N = AbstractC0522j5.m1773e(C3185o.m12043c(C3185o.f8471b.m12058b()), null, 2, null);
        this.f20952O = (InterfaceC2229a1) m18049G2(AbstractC2278y0.m8288a(new b()));
        this.f20953P = (InterfaceC2229a1) m18049G2(AbstractC2278y0.m8288a(new a()));
    }

    @Override // p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: A0 */
    public void mo8047A0(C2261q c2261q, EnumC2265s enumC2265s, long j10) {
        this.f20952O.mo8047A0(c2261q, enumC2265s, j10);
        this.f20953P.mo8047A0(c2261q, enumC2265s, j10);
    }

    @Override // p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: G0 */
    public void mo8048G0() {
        this.f20952O.mo8048G0();
        this.f20953P.mo8048G0();
    }

    /* JADX INFO: renamed from: V2 */
    public final long m26451V2() {
        return ((C3185o) this.f20951N.getValue()).m12056p();
    }

    /* JADX INFO: renamed from: W2 */
    public final float m26452W2() {
        return (AbstractC4557k.m18011m(this).mo1233i1(AbstractC6685cd.f21044h) * r0.mo1236x1(this.f20945H.m26860u())) / r0.mo1236x1(C9017m0.f30413a.m34698b());
    }

    @Override // p166l2.InterfaceC4530d0
    /* JADX INFO: renamed from: X */
    public void mo13125X(long j10) {
        m26453X2(AbstractC3190t.m12089a(j10));
        this.f20945H.m26845C(AbstractC4557k.m18011m(this).mo1225O0((int) (j10 >> 32)));
    }

    /* JADX INFO: renamed from: X2 */
    public final void m26453X2(long j10) {
        this.f20951N.setValue(C3185o.m12043c(j10));
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m26454Y2(C6767i c6767i, boolean z10, int i10, InterfaceC4317k interfaceC4317k) {
        this.f20945H = c6767i;
        this.f20946I = z10;
        this.f20948K = interfaceC4317k;
        if (C6813kd.m27007f(this.f20947J, i10)) {
            return;
        }
        this.f20947J = i10;
        AbstractC2148k.m7817d(m17455f2(), null, null, new c(c6767i, interfaceC4317k, null), 3, null);
    }

    public /* synthetic */ C6673c1(C6767i c6767i, boolean z10, int i10, InterfaceC4317k interfaceC4317k, AbstractC1043k abstractC1043k) {
        this(c6767i, z10, i10, interfaceC4317k);
    }
}
