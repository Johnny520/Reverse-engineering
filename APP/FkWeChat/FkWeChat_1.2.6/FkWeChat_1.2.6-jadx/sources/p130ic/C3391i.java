package p130ic;

import ec.AbstractC2169p0;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1043k;
import p024b9.C1050n0;
import p099gc.EnumC2732a;
import p113hc.InterfaceC2972c;
import p113hc.InterfaceC2974d;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ic.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3391i extends AbstractC3389g {

    /* JADX INFO: renamed from: u */
    public final InterfaceC0189q f9355u;

    /* JADX INFO: renamed from: ic.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f9356q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f9357r;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC2974d f9359t;

        /* JADX INFO: renamed from: ic.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10112a implements InterfaceC2974d {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ C1050n0 f9360q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ InterfaceC2165o0 f9361r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C3391i f9362s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ InterfaceC2974d f9363t;

            /* JADX INFO: renamed from: ic.i$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class C10113a extends AbstractC6544m implements InterfaceC0188p {

                /* JADX INFO: renamed from: q */
                public int f9364q;

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ C3391i f9365r;

                /* JADX INFO: renamed from: s */
                public final /* synthetic */ InterfaceC2974d f9366s;

                /* JADX INFO: renamed from: t */
                public final /* synthetic */ Object f9367t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10113a(C3391i c3391i, InterfaceC2974d interfaceC2974d, Object obj, InterfaceC5976f interfaceC5976f) {
                    super(2, interfaceC5976f);
                    this.f9365r = c3391i;
                    this.f9366s = interfaceC2974d;
                    this.f9367t = obj;
                }

                @Override // p257r8.AbstractC6532a
                public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                    return new C10113a(this.f9365r, this.f9366s, this.f9367t, interfaceC5976f);
                }

                @Override // p010a9.InterfaceC0188p
                public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                    return ((C10113a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
                }

                @Override // p257r8.AbstractC6532a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM24992g = AbstractC6325c.m24992g();
                    int i10 = this.f9364q;
                    if (i10 == 0) {
                        AbstractC4713t.m18808b(obj);
                        InterfaceC0189q interfaceC0189q = this.f9365r.f9355u;
                        InterfaceC2974d interfaceC2974d = this.f9366s;
                        Object obj2 = this.f9367t;
                        this.f9364q = 1;
                        if (interfaceC0189q.mo236e(interfaceC2974d, obj2, this) == objM24992g) {
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

            /* JADX INFO: renamed from: ic.i$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class b extends AbstractC6535d {

                /* JADX INFO: renamed from: q */
                public Object f9368q;

                /* JADX INFO: renamed from: r */
                public Object f9369r;

                /* JADX INFO: renamed from: s */
                public Object f9370s;

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f9371t;

                /* JADX INFO: renamed from: v */
                public int f9373v;

                public b(InterfaceC5976f interfaceC5976f) {
                    super(interfaceC5976f);
                }

                @Override // p257r8.AbstractC6532a
                public final Object invokeSuspend(Object obj) {
                    this.f9371t = obj;
                    this.f9373v |= Integer.MIN_VALUE;
                    return C10112a.this.mo400a(null, this);
                }
            }

            public C10112a(C1050n0 c1050n0, InterfaceC2165o0 interfaceC2165o0, C3391i c3391i, InterfaceC2974d interfaceC2974d) {
                this.f9360q = c1050n0;
                this.f9361r = interfaceC2165o0;
                this.f9362s = c3391i;
                this.f9363t = interfaceC2974d;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p113hc.InterfaceC2974d
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo400a(java.lang.Object r8, p228p8.InterfaceC5976f r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p130ic.C3391i.a.C10112a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    ic.i$a$a$b r0 = (p130ic.C3391i.a.C10112a.b) r0
                    int r1 = r0.f9373v
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f9373v = r1
                    goto L18
                L13:
                    ic.i$a$a$b r0 = new ic.i$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f9371t
                    java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                    int r2 = r0.f9373v
                    r3 = 1
                    if (r2 == 0) goto L3a
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f9370s
                    ec.w1 r8 = (ec.InterfaceC2198w1) r8
                    java.lang.Object r8 = r0.f9369r
                    java.lang.Object r0 = r0.f9368q
                    ic.i$a$a r0 = (p130ic.C3391i.a.C10112a) r0
                    p172l8.AbstractC4713t.m18808b(r9)
                    goto L5d
                L33:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    p376zd.C10010p0.m38820a(r8)
                    r8 = 0
                    return r8
                L3a:
                    p172l8.AbstractC4713t.m18808b(r9)
                    b9.n0 r9 = r7.f9360q
                    java.lang.Object r9 = r9.f3208q
                    ec.w1 r9 = (ec.InterfaceC2198w1) r9
                    if (r9 == 0) goto L5c
                    ic.j r2 = new ic.j
                    r2.<init>()
                    r9.mo7696n(r2)
                    r0.f9368q = r7
                    r0.f9369r = r8
                    r0.f9370s = r9
                    r0.f9373v = r3
                    java.lang.Object r9 = r9.mo7657J0(r0)
                    if (r9 != r1) goto L5c
                    return r1
                L5c:
                    r0 = r7
                L5d:
                    b9.n0 r9 = r0.f9360q
                    ec.o0 r1 = r0.f9361r
                    ec.q0 r3 = ec.EnumC2173q0.f6001t
                    ic.i$a$a$a r4 = new ic.i$a$a$a
                    ic.i r2 = r0.f9362s
                    hc.d r0 = r0.f9363t
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    ec.w1 r8 = ec.AbstractC2140i.m7759d(r1, r2, r3, r4, r5, r6)
                    r9.f3208q = r8
                    l8.i0 r8 = p172l8.C4700i0.f13910a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p130ic.C3391i.a.C10112a.mo400a(java.lang.Object, p8.f):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f9359t = interfaceC2974d;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = C3391i.this.new a(this.f9359t, interfaceC5976f);
            aVar.f9357r = obj;
            return aVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f9356q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f9357r;
                C1050n0 c1050n0 = new C1050n0();
                C3391i c3391i = C3391i.this;
                InterfaceC2972c interfaceC2972c = c3391i.f9351t;
                C10112a c10112a = new C10112a(c1050n0, interfaceC2165o0, c3391i, this.f9359t);
                this.f9356q = 1;
                if (interfaceC2972c.mo399b(c10112a, this) == objM24992g) {
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

    public /* synthetic */ C3391i(InterfaceC0189q interfaceC0189q, InterfaceC2972c interfaceC2972c, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a, int i11, AbstractC1043k abstractC1043k) {
        this(interfaceC0189q, interfaceC2972c, (i11 & 4) != 0 ? C5981k.f18917q : interfaceC5980j, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? EnumC2732a.f7138q : enumC2732a);
    }

    @Override // p130ic.AbstractC3387e
    /* JADX INFO: renamed from: k */
    public AbstractC3387e mo12727k(InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        return new C3391i(this.f9355u, this.f9351t, interfaceC5980j, i10, enumC2732a);
    }

    @Override // p130ic.AbstractC3389g
    /* JADX INFO: renamed from: s */
    public Object mo12740s(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        Object objM7882e = AbstractC2169p0.m7882e(new a(interfaceC2974d, null), interfaceC5976f);
        return objM7882e == AbstractC6325c.m24992g() ? objM7882e : C4700i0.f13910a;
    }

    public C3391i(InterfaceC0189q interfaceC0189q, InterfaceC2972c interfaceC2972c, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        super(interfaceC2972c, interfaceC5980j, i10, enumC2732a);
        this.f9355u = interfaceC0189q;
    }
}
