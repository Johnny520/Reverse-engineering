package p164l0;

import ec.AbstractC2148k;
import ec.AbstractC2169p0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p018b3.C0977t;
import p018b3.C0978t0;
import p018b3.InterfaceC0956i0;
import p024b9.AbstractC1061t;
import p024b9.C1055q;
import p099gc.EnumC2732a;
import p113hc.AbstractC3000x;
import p113hc.InterfaceC2974d;
import p113hc.InterfaceC2994r;
import p133j0.AbstractC3496d;
import p135j2.InterfaceC3578w;
import p164l0.AbstractC4436j2;
import p172l8.AbstractC4713t;
import p172l8.C4699i;
import p172l8.C4700i0;
import p179m2.InterfaceC4916u2;
import p215oc.C5706c;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p250r1.C6457g;
import p257r8.AbstractC6544m;
import p265s1.C7114n2;
import p319w2.C9122q3;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l0.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4405c extends AbstractC4436j2 {

    /* JADX INFO: renamed from: b */
    public InterfaceC2198w1 f12881b;

    /* JADX INFO: renamed from: c */
    public C4456o2 f12882c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2994r f12883d;

    /* JADX INFO: renamed from: l0.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f12884q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f12885r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0184l f12886s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C4405c f12887t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC4436j2.a f12888u;

        /* JADX INFO: renamed from: l0.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10138a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f12889q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ Object f12890r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ InterfaceC4916u2 f12891s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ InterfaceC0184l f12892t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C4405c f12893u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ AbstractC4436j2.a f12894v;

            /* JADX INFO: renamed from: l0.c$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class C10139a extends AbstractC6544m implements InterfaceC0188p {

                /* JADX INFO: renamed from: q */
                public int f12895q;

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ C4405c f12896r;

                /* JADX INFO: renamed from: s */
                public final /* synthetic */ InterfaceC4404b2 f12897s;

                /* JADX INFO: renamed from: l0.c$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
                public static final class C10140a implements InterfaceC2974d {

                    /* JADX INFO: renamed from: q */
                    public final /* synthetic */ InterfaceC4404b2 f12898q;

                    public C10140a(InterfaceC4404b2 interfaceC4404b2) {
                        this.f12898q = interfaceC4404b2;
                    }

                    @Override // p113hc.InterfaceC2974d
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Object mo400a(C4700i0 c4700i0, InterfaceC5976f interfaceC5976f) {
                        this.f12898q.mo17203a();
                        return C4700i0.f13910a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10139a(C4405c c4405c, InterfaceC4404b2 interfaceC4404b2, InterfaceC5976f interfaceC5976f) {
                    super(2, interfaceC5976f);
                    this.f12896r = c4405c;
                    this.f12897s = interfaceC4404b2;
                }

                /* JADX INFO: renamed from: r */
                public static C4700i0 m17216r(long j10) {
                    return C4700i0.f13910a;
                }

                @Override // p257r8.AbstractC6532a
                public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                    return new C10139a(this.f12896r, this.f12897s, interfaceC5976f);
                }

                @Override // p010a9.InterfaceC0188p
                public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                    return ((C10139a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
                
                    if (r5.mo399b(r1, r4) == r0) goto L18;
                 */
                @Override // p257r8.AbstractC6532a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                        int r1 = r4.f12895q
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1d
                        if (r1 == r3) goto L19
                        if (r1 == r2) goto L15
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        p376zd.C10010p0.m38820a(r5)
                    L13:
                        r5 = 0
                        return r5
                    L15:
                        p172l8.AbstractC4713t.m18808b(r5)
                        goto L46
                    L19:
                        p172l8.AbstractC4713t.m18808b(r5)
                        goto L2e
                    L1d:
                        p172l8.AbstractC4713t.m18808b(r5)
                        l0.b r5 = new l0.b
                        r5.<init>()
                        r4.f12895q = r3
                        java.lang.Object r5 = androidx.compose.runtime.AbstractC0456a2.m1514b(r5, r4)
                        if (r5 != r0) goto L2e
                        goto L45
                    L2e:
                        l0.c r5 = r4.f12896r
                        hc.r r5 = p164l0.C4405c.m17208n(r5)
                        if (r5 == 0) goto L4a
                        l0.c$a$a$a$a r1 = new l0.c$a$a$a$a
                        l0.b2 r3 = r4.f12897s
                        r1.<init>(r3)
                        r4.f12895q = r2
                        java.lang.Object r5 = r5.mo399b(r1, r4)
                        if (r5 != r0) goto L46
                    L45:
                        return r0
                    L46:
                        p215oc.C5706c.m23089a()
                        goto L13
                    L4a:
                        l8.i0 r5 = p172l8.C4700i0.f13910a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p164l0.C4405c.a.C10138a.C10139a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: l0.c$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public /* synthetic */ class b extends C1055q implements InterfaceC0184l {

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ AbstractC4436j2.a f12899y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(AbstractC4436j2.a aVar) {
                    super(1, AbstractC1061t.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f12899y = aVar;
                }

                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                    m17218y(((C7114n2) obj).m28036r());
                    return C4700i0.f13910a;
                }

                /* JADX INFO: renamed from: y */
                public final void m17218y(float[] fArr) {
                    C4405c.m17211s(this.f12899y, fArr);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10138a(InterfaceC4916u2 interfaceC4916u2, InterfaceC0184l interfaceC0184l, C4405c c4405c, AbstractC4436j2.a aVar, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f12891s = interfaceC4916u2;
                this.f12892t = interfaceC0184l;
                this.f12893u = c4405c;
                this.f12894v = aVar;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                C10138a c10138a = new C10138a(this.f12891s, this.f12892t, this.f12893u, this.f12894v, interfaceC5976f);
                c10138a.f12890r = obj;
                return c10138a;
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((C10138a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f12889q;
                try {
                    if (i10 == 0) {
                        AbstractC4713t.m18808b(obj);
                        InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f12890r;
                        InterfaceC4404b2 interfaceC4404b2 = (InterfaceC4404b2) AbstractC4440k2.m17278c().mo27m(this.f12891s.mo19413b());
                        C4456o2 c4456o2 = new C4456o2(this.f12891s.mo19413b(), new b(this.f12894v), interfaceC4404b2);
                        if (AbstractC3496d.m13028a()) {
                            AbstractC2148k.m7817d(interfaceC2165o0, null, null, new C10139a(this.f12893u, interfaceC4404b2, null), 3, null);
                        }
                        InterfaceC0184l interfaceC0184l = this.f12892t;
                        if (interfaceC0184l != null) {
                            interfaceC0184l.mo27m(c4456o2);
                        }
                        this.f12893u.f12882c = c4456o2;
                        InterfaceC4916u2 interfaceC4916u2 = this.f12891s;
                        this.f12889q = 1;
                        if (interfaceC4916u2.mo19412a(c4456o2, this) == objM24992g) {
                            return objM24992g;
                        }
                    } else {
                        if (i10 != 1) {
                            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC4713t.m18808b(obj);
                    }
                    throw new C4699i();
                } catch (Throwable th) {
                    this.f12893u.f12882c = null;
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0184l interfaceC0184l, C4405c c4405c, AbstractC4436j2.a aVar, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f12886s = interfaceC0184l;
            this.f12887t = c4405c;
            this.f12888u = aVar;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f12886s, this.f12887t, this.f12888u, interfaceC5976f);
            aVar.f12885r = obj;
            return aVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f12884q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C10138a c10138a = new C10138a((InterfaceC4916u2) this.f12885r, this.f12886s, this.f12887t, this.f12888u, null);
                this.f12884q = 1;
                if (AbstractC2169p0.m7882e(c10138a, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            C5706c.m23089a();
            return null;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4916u2 interfaceC4916u2, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC4916u2, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: m */
    public static C4700i0 m17207m(C0978t0 c0978t0, C4405c c4405c, C0977t c0977t, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, C4456o2 c4456o2) {
        c4456o2.m17302n(c0978t0, c4405c.m17271i(), c0977t, interfaceC0184l, interfaceC0184l2);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m17211s(AbstractC4436j2.a aVar, float[] fArr) {
        InterfaceC3578w interfaceC3578wMo17241B = aVar.mo17241B();
        if (interfaceC3578wMo17241B != null) {
            if (!interfaceC3578wMo17241B.mo13245d()) {
                interfaceC3578wMo17241B = null;
            }
            if (interfaceC3578wMo17241B == null) {
                return;
            }
            interfaceC3578wMo17241B.mo13240P(fArr);
        }
    }

    @Override // p018b3.InterfaceC0964m0
    /* JADX INFO: renamed from: a */
    public void mo3515a(C0978t0 c0978t0, InterfaceC0956i0 interfaceC0956i0, C9122q3 c9122q3, InterfaceC0184l interfaceC0184l, C6457g c6457g, C6457g c6457g2) {
        C4456o2 c4456o2 = this.f12882c;
        if (c4456o2 != null) {
            c4456o2.m17304p(c0978t0, interfaceC0956i0, c9122q3, c6457g, c6457g2);
        }
    }

    @Override // p018b3.InterfaceC0964m0
    /* JADX INFO: renamed from: b */
    public void mo3516b() {
        m17214r(null);
    }

    @Override // p018b3.InterfaceC0964m0
    /* JADX INFO: renamed from: d */
    public void mo3518d(C6457g c6457g) {
        C4456o2 c4456o2 = this.f12882c;
        if (c4456o2 != null) {
            c4456o2.m17300l(c6457g);
        }
    }

    @Override // p018b3.InterfaceC0964m0
    /* JADX INFO: renamed from: e */
    public void mo3519e() {
        InterfaceC2198w1 interfaceC2198w1 = this.f12881b;
        if (interfaceC2198w1 != null) {
            InterfaceC2198w1.a.m7920a(interfaceC2198w1, null, 1, null);
        }
        this.f12881b = null;
        InterfaceC2994r interfaceC2994rM17213q = m17213q();
        if (interfaceC2994rM17213q != null) {
            interfaceC2994rM17213q.mo11004d();
        }
    }

    @Override // p018b3.InterfaceC0964m0
    /* JADX INFO: renamed from: f */
    public void mo3520f(final C0978t0 c0978t0, final C0977t c0977t, final InterfaceC0184l interfaceC0184l, final InterfaceC0184l interfaceC0184l2) {
        m17214r(new InterfaceC0184l() { // from class: l0.a
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C4405c.m17207m(c0978t0, this, c0977t, interfaceC0184l, interfaceC0184l2, (C4456o2) obj);
            }
        });
    }

    @Override // p018b3.InterfaceC0964m0
    /* JADX INFO: renamed from: g */
    public void mo3521g(C0978t0 c0978t0, C0978t0 c0978t02) {
        C4456o2 c4456o2 = this.f12882c;
        if (c4456o2 != null) {
            c4456o2.m17303o(c0978t0, c0978t02);
        }
    }

    @Override // p164l0.AbstractC4436j2
    /* JADX INFO: renamed from: k */
    public void mo17212k() {
        InterfaceC2994r interfaceC2994rM17213q = m17213q();
        if (interfaceC2994rM17213q != null) {
            interfaceC2994rM17213q.mo11006f(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC2994r m17213q() {
        InterfaceC2994r interfaceC2994r = this.f12883d;
        if (interfaceC2994r != null) {
            return interfaceC2994r;
        }
        if (!AbstractC3496d.m13028a()) {
            return null;
        }
        InterfaceC2994r interfaceC2994rM11088b = AbstractC3000x.m11088b(1, 0, EnumC2732a.f7140s, 2, null);
        this.f12883d = interfaceC2994rM11088b;
        return interfaceC2994rM11088b;
    }

    /* JADX INFO: renamed from: r */
    public final void m17214r(InterfaceC0184l interfaceC0184l) {
        AbstractC4436j2.a aVarM17271i = m17271i();
        if (aVarM17271i == null) {
            return;
        }
        this.f12881b = aVarM17271i.mo17242D0(new a(interfaceC0184l, this, aVarM17271i, null));
    }
}
