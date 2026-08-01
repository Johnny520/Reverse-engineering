package p189n;

import android.view.KeyEvent;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import ec.AbstractC2148k;
import ec.AbstractC2205y0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import p003a2.AbstractC0025b;
import p003a2.InterfaceC0024a;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p042d2.AbstractC1859d;
import p073f2.AbstractC2278y0;
import p073f2.InterfaceC2229a1;
import p073f2.InterfaceC2254m0;
import p117i.AbstractC3093x;
import p117i.C3070l0;
import p166l2.AbstractC4528c2;
import p166l2.AbstractC4549i;
import p166l2.InterfaceC4545h;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p179m2.AbstractC4870l1;
import p179m2.InterfaceC4862j3;
import p189n.C5238k0;
import p219p.AbstractC5896v1;
import p219p.InterfaceC5901x0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.InterfaceC6434j;
import p250r1.C6455e;
import p257r8.AbstractC6544m;
import p277t2.AbstractC8070f0;
import p277t2.C8079k;
import p277t2.InterfaceC8074h0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: n.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5238k0 extends AbstractC5197c implements InterfaceC4545h {

    /* JADX INFO: renamed from: d0 */
    public String f16101d0;

    /* JADX INFO: renamed from: e0 */
    public InterfaceC0173a f16102e0;

    /* JADX INFO: renamed from: f0 */
    public InterfaceC0173a f16103f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f16104g0;

    /* JADX INFO: renamed from: h0 */
    public final C3070l0 f16105h0;

    /* JADX INFO: renamed from: i0 */
    public final C3070l0 f16106i0;

    /* JADX INFO: renamed from: n.k0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2198w1 f16107a;

        /* JADX INFO: renamed from: b */
        public boolean f16108b;

        public a(InterfaceC2198w1 interfaceC2198w1) {
            this.f16107a = interfaceC2198w1;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m21452a() {
            return this.f16108b;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC2198w1 m21453b() {
            return this.f16107a;
        }

        /* JADX INFO: renamed from: c */
        public final void m21454c(boolean z10) {
            this.f16108b = z10;
        }
    }

    /* JADX INFO: renamed from: n.k0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: n.k0$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6544m implements InterfaceC0189q {

            /* JADX INFO: renamed from: q */
            public int f16110q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ Object f16111r;

            /* JADX INFO: renamed from: s */
            public /* synthetic */ long f16112s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ C5238k0 f16113t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5238k0 c5238k0, InterfaceC5976f interfaceC5976f) {
                super(3, interfaceC5976f);
                this.f16113t = c5238k0;
            }

            @Override // p010a9.InterfaceC0189q
            /* JADX INFO: renamed from: e */
            public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
                return m21458r((InterfaceC5901x0) obj, ((C6455e) obj2).m25566t(), (InterfaceC5976f) obj3);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f16110q;
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    InterfaceC5901x0 interfaceC5901x0 = (InterfaceC5901x0) this.f16111r;
                    long j10 = this.f16112s;
                    if (this.f16113t.m21307c3()) {
                        C5238k0 c5238k0 = this.f16113t;
                        this.f16110q = 1;
                        if (c5238k0.m21309e3(interfaceC5901x0, j10, this) == objM24992g) {
                            return objM24992g;
                        }
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

            /* JADX INFO: renamed from: r */
            public final Object m21458r(InterfaceC5901x0 interfaceC5901x0, long j10, InterfaceC5976f interfaceC5976f) {
                a aVar = new a(this.f16113t, interfaceC5976f);
                aVar.f16111r = interfaceC5901x0;
                aVar.f16112s = j10;
                return aVar.invokeSuspend(C4700i0.f13910a);
            }
        }

        public b() {
        }

        /* JADX INFO: renamed from: a */
        public static C4700i0 m21455a(C5238k0 c5238k0, C6455e c6455e) {
            if (c5238k0.m21307c3()) {
                c5238k0.m21308d3().invoke();
            }
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: b */
        public static C4700i0 m21456b(C5238k0 c5238k0, C6455e c6455e) {
            InterfaceC0173a interfaceC0173a = c5238k0.f16103f0;
            if (interfaceC0173a != null) {
                interfaceC0173a.invoke();
            }
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: c */
        public static C4700i0 m21457c(C5238k0 c5238k0, C6455e c6455e) {
            InterfaceC0173a interfaceC0173a = c5238k0.f16102e0;
            if (interfaceC0173a != null) {
                interfaceC0173a.invoke();
            }
            if (c5238k0.m21448v3()) {
                ((InterfaceC0024a) AbstractC4549i.m17816a(c5238k0, AbstractC4870l1.m19445j())).mo100a(AbstractC0025b.f41a.m108f());
            }
            return C4700i0.f13910a;
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC2254m0 interfaceC2254m0, InterfaceC5976f interfaceC5976f) {
            InterfaceC0184l interfaceC0184l;
            InterfaceC0184l interfaceC0184l2;
            if (!C5238k0.this.m21307c3() || C5238k0.this.f16103f0 == null) {
                interfaceC0184l = null;
            } else {
                final C5238k0 c5238k0 = C5238k0.this;
                interfaceC0184l = new InterfaceC0184l() { // from class: n.l0
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return C5238k0.b.m21456b(c5238k0, (C6455e) obj);
                    }
                };
            }
            if (!C5238k0.this.m21307c3() || C5238k0.this.f16102e0 == null) {
                interfaceC0184l2 = null;
            } else {
                final C5238k0 c5238k02 = C5238k0.this;
                interfaceC0184l2 = new InterfaceC0184l() { // from class: n.m0
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return C5238k0.b.m21457c(c5238k02, (C6455e) obj);
                    }
                };
            }
            a aVar = new a(C5238k0.this, null);
            final C5238k0 c5238k03 = C5238k0.this;
            Object objM23781l = AbstractC5896v1.m23781l(interfaceC2254m0, interfaceC0184l, interfaceC0184l2, aVar, new InterfaceC0184l() { // from class: n.n0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C5238k0.b.m21455a(c5238k03, (C6455e) obj);
                }
            }, interfaceC5976f);
            return objM23781l == AbstractC6325c.m24992g() ? objM23781l : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: n.k0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f16114q;

        public c(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C5238k0.this.new c(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f16114q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                long jMo17979c = ((InterfaceC4862j3) AbstractC4549i.m17816a(C5238k0.this, AbstractC4870l1.m19454s())).mo17979c();
                this.f16114q = 1;
                if (AbstractC2205y0.m7938b(jMo17979c, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            InterfaceC0173a interfaceC0173a = C5238k0.this.f16102e0;
            if (interfaceC0173a != null) {
                interfaceC0173a.invoke();
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: n.k0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public long f16116q;

        /* JADX INFO: renamed from: r */
        public long f16117r;

        /* JADX INFO: renamed from: s */
        public int f16118s;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f16120u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f16120u = j10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C5238k0.this.new d(this.f16120u, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((d) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            if (ec.AbstractC2205y0.m7938b(r4 - r6, r10) == r0) goto L18;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r10.f16118s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                p172l8.AbstractC4713t.m18808b(r11)
                goto L62
            L12:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r11)
                r11 = 0
                return r11
            L19:
                long r4 = r10.f16117r
                long r6 = r10.f16116q
                p172l8.AbstractC4713t.m18808b(r11)
                goto L45
            L21:
                p172l8.AbstractC4713t.m18808b(r11)
                n.k0 r11 = p189n.C5238k0.this
                androidx.compose.runtime.h3 r1 = p179m2.AbstractC4870l1.m19454s()
                java.lang.Object r11 = p166l2.AbstractC4549i.m17816a(r11, r1)
                m2.j3 r11 = (p179m2.InterfaceC4862j3) r11
                long r6 = r11.mo17978b()
                long r4 = r11.mo17977a()
                r10.f16116q = r6
                r10.f16117r = r4
                r10.f16118s = r3
                java.lang.Object r11 = ec.AbstractC2205y0.m7938b(r6, r10)
                if (r11 != r0) goto L45
                goto L61
            L45:
                n.k0 r11 = p189n.C5238k0.this
                i.l0 r11 = p189n.C5238k0.m21445s3(r11)
                long r8 = r10.f16120u
                java.lang.Object r11 = r11.m11578b(r8)
                n.k0$a r11 = (p189n.C5238k0.a) r11
                if (r11 == 0) goto L58
                r11.m21454c(r3)
            L58:
                long r4 = r4 - r6
                r10.f16118s = r2
                java.lang.Object r11 = ec.AbstractC2205y0.m7938b(r4, r10)
                if (r11 != r0) goto L62
            L61:
                return r0
            L62:
                n.k0 r11 = p189n.C5238k0.this
                a9.a r11 = r11.m21308d3()
                r11.invoke()
                l8.i0 r11 = p172l8.C4700i0.f13910a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p189n.C5238k0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C5238k0(InterfaceC0173a interfaceC0173a, String str, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z11, boolean z12, String str2, C8079k c8079k) {
        super(interfaceC6434j, interfaceC5279s1, z11, z12, str2, c8079k, interfaceC0173a, null);
        this.f16101d0 = str;
        this.f16102e0 = interfaceC0173a2;
        this.f16103f0 = interfaceC0173a3;
        this.f16104g0 = z10;
        this.f16105h0 = AbstractC3093x.m11597c();
        this.f16106i0 = AbstractC3093x.m11597c();
    }

    /* JADX INFO: renamed from: r3 */
    public static boolean m21444r3(C5238k0 c5238k0) {
        InterfaceC0173a interfaceC0173a = c5238k0.f16102e0;
        if (interfaceC0173a == null) {
            return true;
        }
        interfaceC0173a.invoke();
        return true;
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: W2 */
    public void mo21301W2(InterfaceC8074h0 interfaceC8074h0) {
        if (this.f16102e0 != null) {
            AbstractC8070f0.m31146x(interfaceC8074h0, this.f16101d0, new InterfaceC0173a() { // from class: n.j0
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return Boolean.valueOf(C5238k0.m21444r3(this.f16088q));
                }
            });
        }
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: X2 */
    public InterfaceC2229a1 mo21302X2() {
        return AbstractC2278y0.m8288a(new b());
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: j3 */
    public void mo21314j3() {
        m21449w3();
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: k3 */
    public boolean mo21315k3(KeyEvent keyEvent) {
        boolean z10;
        long jM6605a = AbstractC1859d.m6605a(keyEvent);
        if (this.f16102e0 == null || this.f16105h0.m11578b(jM6605a) != null) {
            z10 = false;
        } else {
            this.f16105h0.m11411r(jM6605a, AbstractC2148k.m7817d(m17455f2(), null, null, new c(null), 3, null));
            z10 = true;
        }
        a aVar = (a) this.f16106i0.m11578b(jM6605a);
        if (aVar != null) {
            if (aVar.m21453b().mo7586c()) {
                InterfaceC2198w1.a.m7920a(aVar.m21453b(), null, 1, null);
                if (!aVar.m21452a()) {
                    m21308d3().invoke();
                    this.f16106i0.m11408o(jM6605a);
                    return z10;
                }
            } else {
                this.f16106i0.m11408o(jM6605a);
            }
        }
        return z10;
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: l3 */
    public boolean mo21316l3(KeyEvent keyEvent) {
        InterfaceC0173a interfaceC0173a;
        long jM6605a = AbstractC1859d.m6605a(keyEvent);
        boolean z10 = false;
        if (this.f16105h0.m11578b(jM6605a) != null) {
            InterfaceC2198w1 interfaceC2198w1 = (InterfaceC2198w1) this.f16105h0.m11578b(jM6605a);
            if (interfaceC2198w1 != null) {
                if (interfaceC2198w1.mo7586c()) {
                    InterfaceC2198w1.a.m7920a(interfaceC2198w1, null, 1, null);
                } else {
                    z10 = true;
                }
            }
            this.f16105h0.m11408o(jM6605a);
        }
        if (this.f16103f0 != null) {
            if (this.f16106i0.m11578b(jM6605a) != null) {
                if (!z10 && (interfaceC0173a = this.f16103f0) != null) {
                    interfaceC0173a.invoke();
                }
                this.f16106i0.m11408o(jM6605a);
            } else if (!z10) {
                this.f16106i0.m11411r(jM6605a, new a(AbstractC2148k.m7817d(m17455f2(), null, null, new d(jM6605a, null), 3, null)));
            }
        } else if (!z10) {
            m21308d3().invoke();
        }
        return true;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: r2 */
    public void mo15375r2() {
        super.mo15375r2();
        m21449w3();
    }

    /* JADX INFO: renamed from: v3 */
    public final boolean m21448v3() {
        return this.f16104g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX INFO: renamed from: w3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21449w3() {
        /*
            r24 = this;
            r0 = r24
            i.l0 r1 = r0.f16105h0
            java.lang.Object[] r2 = r1.f8232c
            long[] r3 = r1.f8230a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = 0
            r13 = 1
            r14 = 8
            r15 = 0
            if (r4 < 0) goto L4d
            r5 = r15
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L18:
            r7 = r3[r5]
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = ~r7
            long r11 = r11 << r9
            long r11 = r11 & r7
            long r11 = r11 & r20
            int r6 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r6 == 0) goto L48
            int r6 = r5 - r4
            int r6 = ~r6
            int r6 = r6 >>> 31
            int r6 = 8 - r6
            r11 = r15
        L30:
            if (r11 >= r6) goto L46
            long r22 = r7 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto L42
            int r12 = r5 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            ec.w1 r12 = (ec.InterfaceC2198w1) r12
            ec.InterfaceC2198w1.a.m7920a(r12, r10, r13, r10)
        L42:
            long r7 = r7 >> r14
            int r11 = r11 + 1
            goto L30
        L46:
            if (r6 != r14) goto L56
        L48:
            if (r5 == r4) goto L56
            int r5 = r5 + 1
            goto L18
        L4d:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L56:
            r1.m11400g()
            i.l0 r1 = r0.f16106i0
            java.lang.Object[] r2 = r1.f8232c
            long[] r3 = r1.f8230a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L99
            r5 = r15
        L65:
            r6 = r3[r5]
            long r11 = ~r6
            long r11 = r11 << r9
            long r11 = r11 & r6
            long r11 = r11 & r20
            int r8 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r8 == 0) goto L94
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r11 = r15
        L78:
            if (r11 >= r8) goto L92
            long r22 = r6 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto L8e
            int r12 = r5 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            n.k0$a r12 = (p189n.C5238k0.a) r12
            ec.w1 r12 = r12.m21453b()
            ec.InterfaceC2198w1.a.m7920a(r12, r10, r13, r10)
        L8e:
            long r6 = r6 >> r14
            int r11 = r11 + 1
            goto L78
        L92:
            if (r8 != r14) goto L99
        L94:
            if (r5 == r4) goto L99
            int r5 = r5 + 1
            goto L65
        L99:
            r1.m11400g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p189n.C5238k0.m21449w3():void");
    }

    /* JADX INFO: renamed from: x3 */
    public final void m21450x3(boolean z10) {
        this.f16104g0 = z10;
    }

    /* JADX INFO: renamed from: y3 */
    public final void m21451y3(InterfaceC0173a interfaceC0173a, String str, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, String str2, C8079k c8079k) {
        boolean z12;
        if (!AbstractC1061t.m3842c(this.f16101d0, str)) {
            this.f16101d0 = str;
            AbstractC4528c2.m17573b(this);
        }
        if ((this.f16102e0 == null) != (interfaceC0173a2 == null)) {
            m21304Z2();
            AbstractC4528c2.m17573b(this);
            z12 = true;
        } else {
            z12 = false;
        }
        this.f16102e0 = interfaceC0173a2;
        if ((this.f16103f0 == null) != (interfaceC0173a3 == null)) {
            z12 = true;
        }
        this.f16103f0 = interfaceC0173a3;
        boolean z13 = m21307c3() == z11 ? z12 : true;
        m21321q3(interfaceC6434j, interfaceC5279s1, z10, z11, str2, c8079k, interfaceC0173a);
        if (z13) {
            m21319o3();
        }
    }

    public /* synthetic */ C5238k0(InterfaceC0173a interfaceC0173a, String str, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z11, boolean z12, String str2, C8079k c8079k, AbstractC1043k abstractC1043k) {
        this(interfaceC0173a, str, interfaceC0173a2, interfaceC0173a3, z10, interfaceC6434j, interfaceC5279s1, z11, z12, str2, c8079k);
    }
}
