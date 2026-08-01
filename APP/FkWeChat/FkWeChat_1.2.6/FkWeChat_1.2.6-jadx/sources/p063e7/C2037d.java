package p063e7;

import ec.AbstractC2108a2;
import ec.AbstractC2140i;
import ec.AbstractC2148k;
import ec.AbstractC2149k0;
import ec.AbstractC2169p0;
import ec.AbstractC2204y;
import ec.C2122d1;
import ec.EnumC2173q0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2196w;
import ec.InterfaceC2198w1;
import ec.InterfaceC2208z;
import io.ktor.utils.p131io.InterfaceC3473k;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p023b8.AbstractC1011d;
import p023b8.AbstractC1012e;
import p023b8.C1009b;
import p023b8.C1016i;
import p034c7.AbstractC1396x;
import p034c7.C1353a;
import p034c7.InterfaceC1359d;
import p078f7.AbstractC2345e;
import p078f7.C2348h;
import p096g7.AbstractC2541a;
import p125i7.AbstractC3216i;
import p125i7.InterfaceC3200a;
import p125i7.InterfaceC3219j0;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p210o7.C5651c;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p270s6.C7193c;
import p281t6.C8169v;
import p281t6.InterfaceC8163p;
import p295u6.C8536b0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: e7.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2037d extends AbstractC3216i {

    /* JADX INFO: renamed from: e */
    public final a f5640e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0173a f5641f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2149k0 f5642g;

    /* JADX INFO: renamed from: h */
    public final AbstractC2149k0 f5643h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2196w f5644i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2208z f5645j;
    private volatile InterfaceC2198w1 serverJob;

    /* JADX INFO: renamed from: e7.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3216i.a {

        /* JADX INFO: renamed from: h */
        public int f5646h = 45;

        /* JADX INFO: renamed from: i */
        public boolean f5647i;

        /* JADX INFO: renamed from: d */
        public final int m7339d() {
            return this.f5646h;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m7340e() {
            return this.f5647i;
        }
    }

    /* JADX INFO: renamed from: e7.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public Object f5648q;

        /* JADX INFO: renamed from: r */
        public Object f5649r;

        /* JADX INFO: renamed from: s */
        public int f5650s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C2035b f5651t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C2037d f5652u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f5653v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC3473k f5654w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f5655x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2035b c2035b, C2037d c2037d, String str, InterfaceC3473k interfaceC3473k, String str2, InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
            this.f5651t = c2035b;
            this.f5652u = c2037d;
            this.f5653v = str;
            this.f5654w = interfaceC3473k;
            this.f5655x = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
        
            if (r10.mo5368V(r1, r2, r9) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
        
            if (r1.mo12879b(r9) != r0) goto L36;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r9.f5650s
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L30
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L17
                java.lang.Object r0 = r9.f5648q
                io.ktor.utils.io.k r0 = (io.ktor.utils.p131io.InterfaceC3473k) r0
                goto L2b
            L17:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r10)
                r10 = 0
                return r10
            L1e:
                java.lang.Object r1 = r9.f5649r
                io.ktor.utils.io.k r1 = (io.ktor.utils.p131io.InterfaceC3473k) r1
                java.lang.Object r3 = r9.f5648q
                io.ktor.utils.io.k r3 = (io.ktor.utils.p131io.InterfaceC3473k) r3
                p172l8.AbstractC4713t.m18808b(r10)
                goto Lb3
            L2b:
                p172l8.AbstractC4713t.m18808b(r10)
                goto Lc0
            L30:
                p172l8.AbstractC4713t.m18808b(r10)
                e7.b r10 = r9.f5651t
                e7.h r10 = r10.mo7314a()
                t6.y$a r1 = p281t6.C8172y.f27409d
                java.lang.String r6 = p210o7.AbstractC5653e.m22859d(r10)
                t6.y r6 = r1.m31715e(r6)
                e7.b r7 = r9.f5651t
                e7.h r7 = r7.mo7314a()
                t6.p r7 = r7.mo12244g()
                t6.v r8 = p281t6.C8169v.f27347a
                java.lang.String r8 = r8.m31682k()
                java.lang.String r7 = r7.mo12334e(r8)
                if (r7 == 0) goto L63
                java.util.Locale r8 = java.util.Locale.ROOT
                java.lang.String r7 = r7.toLowerCase(r8)
                r7.getClass()
                goto L64
            L63:
                r7 = r5
            L64:
                e7.d r8 = r9.f5652u
                boolean r10 = p063e7.C2037d.m7327s(r8, r10)
                if (r7 == 0) goto Lc3
                t6.y r1 = r1.m31712b()
                boolean r1 = p024b9.AbstractC1061t.m3842c(r6, r1)
                if (r1 != 0) goto Lc3
                if (r10 != 0) goto L79
                goto Lc3
            L79:
                java.lang.String r10 = r9.f5653v
                boolean r10 = p024b9.AbstractC1061t.m3842c(r7, r10)
                if (r10 != 0) goto La1
                e7.b r10 = r9.f5651t
                t6.z$a r1 = p281t6.C8173z.f27462s
                t6.z r1 = r1.m31805g()
                java.lang.Class<t6.z> r2 = p281t6.C8173z.class
                g9.c r3 = p024b9.AbstractC1052o0.m3807b(r2)
                g9.n r5 = p024b9.AbstractC1052o0.m3817l(r2)     // Catch: java.lang.Throwable -> L93
            L93:
                c8.a r2 = new c8.a
                r2.<init>(r3, r5)
                r9.f5650s = r4
                java.lang.Object r10 = r10.mo5368V(r1, r2, r9)
                if (r10 != r0) goto Lc0
                goto Lbf
            La1:
                io.ktor.utils.io.k r1 = r9.f5654w
                java.lang.String r10 = r9.f5655x
                r9.f5648q = r1
                r9.f5649r = r1
                r9.f5650s = r3
                java.lang.Object r10 = io.ktor.utils.p131io.AbstractC3476n.m12985n(r1, r10, r9)
                if (r10 != r0) goto Lb2
                goto Lbf
            Lb2:
                r3 = r1
            Lb3:
                r9.f5648q = r3
                r9.f5649r = r5
                r9.f5650s = r2
                java.lang.Object r10 = r1.mo12879b(r9)
                if (r10 != r0) goto Lc0
            Lbf:
                return r0
            Lc0:
                l8.i0 r10 = p172l8.C4700i0.f13910a
                return r10
            Lc3:
                l8.i0 r10 = p172l8.C4700i0.f13910a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p063e7.C2037d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(AbstractC1012e abstractC1012e, Object obj, InterfaceC5976f interfaceC5976f) {
            return new b(this.f5651t, this.f5652u, this.f5653v, this.f5654w, this.f5655x, interfaceC5976f).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: e7.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f5656q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f5657r;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C8536b0 f5659t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C2348h f5660u;

        /* JADX INFO: renamed from: e7.d$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6544m implements InterfaceC0184l {

            /* JADX INFO: renamed from: q */
            public int f5661q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ AbstractC1011d f5662r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ Object f5663s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC1011d abstractC1011d, Object obj, InterfaceC5976f interfaceC5976f) {
                super(1, interfaceC5976f);
                this.f5662r = abstractC1011d;
                this.f5663s = obj;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
                return new a(this.f5662r, this.f5663s, interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f5661q;
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    AbstractC1011d abstractC1011d = this.f5662r;
                    Object obj2 = this.f5663s;
                    C4700i0 c4700i0 = C4700i0.f13910a;
                    this.f5661q = 1;
                    if (abstractC1011d.m3738j(obj2, c4700i0, this) == objM24992g) {
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

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo27m(InterfaceC5976f interfaceC5976f) {
                return ((a) create(interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C8536b0 c8536b0, C2348h c2348h, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f5659t = c8536b0;
            this.f5660u = c2348h;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            c cVar = C2037d.this.new c(this.f5659t, this.f5660u, interfaceC5976f);
            cVar.f5657r = obj;
            return cVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r2 = p242q8.AbstractC6325c.m24992g()
                int r0 = r1.f5656q
                r3 = 2
                r4 = 1
                if (r0 == 0) goto L30
                if (r0 == r4) goto L24
                if (r0 != r3) goto L1d
                java.lang.Object r0 = r1.f5657r
                r2 = r0
                e7.b r2 = (p063e7.C2035b) r2
                p172l8.AbstractC4713t.m18808b(r17)     // Catch: java.lang.Throwable -> L1a
                goto Lac
            L1a:
                r0 = move-exception
                goto Lb4
            L1d:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r0)
                r0 = 0
                return r0
            L24:
                java.lang.Object r0 = r1.f5657r
                r4 = r0
                e7.b r4 = (p063e7.C2035b) r4
                p172l8.AbstractC4713t.m18808b(r17)     // Catch: java.lang.Throwable -> L2d
                goto L9b
            L2d:
                r0 = move-exception
                r5 = r4
                goto La0
            L30:
                p172l8.AbstractC4713t.m18808b(r17)
                java.lang.Object r0 = r1.f5657r
                ec.o0 r0 = (ec.InterfaceC2165o0) r0
                e7.b r5 = new e7.b
                e7.d r6 = p063e7.C2037d.this
                a9.a r6 = p063e7.C2037d.m7321m(r6)
                java.lang.Object r6 = r6.invoke()
                c7.a r6 = (p034c7.C1353a) r6
                u6.b0 r7 = r1.f5659t
                f7.h r8 = r1.f5660u
                io.ktor.utils.io.g r8 = r8.m8527a()
                f7.h r9 = r1.f5660u
                io.ktor.utils.io.k r9 = r9.m8529c()
                e7.d r10 = p063e7.C2037d.this
                ec.k0 r10 = p063e7.C2037d.m7322n(r10)
                e7.d r11 = p063e7.C2037d.this
                ec.k0 r11 = p063e7.C2037d.m7325q(r11)
                f7.h r12 = r1.f5660u
                ec.w r12 = r12.m8531g()
                f7.h r13 = r1.f5660u
                java.net.SocketAddress r13 = r13.m8530f()
                f7.h r14 = r1.f5660u
                java.net.SocketAddress r14 = r14.m8528b()
                p8.j r15 = r0.getCoroutineContext()
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                e7.d r0 = p063e7.C2037d.this     // Catch: java.lang.Throwable -> L9f
                f7.h r6 = r1.f5660u     // Catch: java.lang.Throwable -> L9f
                io.ktor.utils.io.k r6 = r6.m8529c()     // Catch: java.lang.Throwable -> L9f
                p063e7.C2037d.m7320l(r0, r6, r5)     // Catch: java.lang.Throwable -> L9f
                e7.d r0 = p063e7.C2037d.this     // Catch: java.lang.Throwable -> L9f
                i7.l0 r0 = r0.m12224h()     // Catch: java.lang.Throwable -> L9f
                e7.d$c$a r6 = new e7.d$c$a     // Catch: java.lang.Throwable -> L9f
                r7 = 0
                r6.<init>(r0, r5, r7)     // Catch: java.lang.Throwable -> L9f
                r1.f5657r = r5     // Catch: java.lang.Throwable -> L9f
                r1.f5656q = r4     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r0 = p340x7.AbstractC9461a.m36877b(r6, r1)     // Catch: java.lang.Throwable -> L9f
                if (r0 != r2) goto L9a
                goto Laa
            L9a:
                r4 = r5
            L9b:
                r4.m7318i()
                goto Laf
            L9f:
                r0 = move-exception
            La0:
                r1.f5657r = r5     // Catch: java.lang.Throwable -> Lb2
                r1.f5656q = r3     // Catch: java.lang.Throwable -> Lb2
                java.lang.Object r0 = p125i7.AbstractC3236s.m12310e(r5, r0, r1)     // Catch: java.lang.Throwable -> Lb2
                if (r0 != r2) goto Lab
            Laa:
                return r2
            Lab:
                r2 = r5
            Lac:
                r2.m7318i()
            Laf:
                l8.i0 r0 = p172l8.C4700i0.f13910a
                return r0
            Lb2:
                r0 = move-exception
                r2 = r5
            Lb4:
                r2.m7318i()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p063e7.C2037d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: e7.d$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ AbstractC2149k0 f5664A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ InterfaceC1359d f5665B;

        /* JADX INFO: renamed from: q */
        public Object f5666q;

        /* JADX INFO: renamed from: r */
        public Object f5667r;

        /* JADX INFO: renamed from: s */
        public Object f5668s;

        /* JADX INFO: renamed from: t */
        public Object f5669t;

        /* JADX INFO: renamed from: u */
        public int f5670u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f5671v;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ InterfaceC2196w f5673x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ InterfaceC2208z f5674y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ InterfaceC2196w f5675z;

        /* JADX INFO: renamed from: e7.d$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f5676q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C2037d f5677r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ InterfaceC1359d f5678s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2037d c2037d, InterfaceC1359d interfaceC1359d, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f5677r = c2037d;
                this.f5678s = interfaceC1359d;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new a(this.f5677r, this.f5678s, interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC6325c.m24992g();
                if (this.f5676q != 0) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
                this.f5677r.m12223g().m28425b(AbstractC1396x.m5477e(), this.f5678s);
                return C4700i0.f13910a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2196w interfaceC2196w, InterfaceC2208z interfaceC2208z, InterfaceC2196w interfaceC2196w2, AbstractC2149k0 abstractC2149k0, InterfaceC1359d interfaceC1359d, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f5673x = interfaceC2196w;
            this.f5674y = interfaceC2208z;
            this.f5675z = interfaceC2196w2;
            this.f5664A = abstractC2149k0;
            this.f5665B = interfaceC1359d;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            d dVar = C2037d.this.new d(this.f5673x, this.f5674y, this.f5675z, this.f5664A, this.f5665B, interfaceC5976f);
            dVar.f5671v = obj;
            return dVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((d) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:70:0x01f8, code lost:
        
            if (ec.AbstractC2128f.m7750b(r14, r13) != r0) goto L72;
         */
        /* JADX WARN: Not initialized variable reg: 11, insn: 0x01fe: INVOKE (r0 I:java.util.Iterator) = (r11 I:java.lang.Iterable) INTERFACE call: java.lang.Iterable.iterator():java.util.Iterator A[MD:():java.util.Iterator<T> (c)] (LINE:511), block:B:74:0x01fe */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010a A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:42:0x0135, B:36:0x0104, B:38:0x010a, B:43:0x013e, B:44:0x014d, B:46:0x0153, B:48:0x016f, B:52:0x017b, B:53:0x017f, B:19:0x006b, B:20:0x0079, B:22:0x007f, B:25:0x0096, B:26:0x009d, B:27:0x009e, B:28:0x00b7, B:30:0x00bd, B:31:0x00cf, B:32:0x00dc, B:34:0x00e2, B:35:0x00f2), top: B:80:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x013e A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:42:0x0135, B:36:0x0104, B:38:0x010a, B:43:0x013e, B:44:0x014d, B:46:0x0153, B:48:0x016f, B:52:0x017b, B:53:0x017f, B:19:0x006b, B:20:0x0079, B:22:0x007f, B:25:0x0096, B:26:0x009d, B:27:0x009e, B:28:0x00b7, B:30:0x00bd, B:31:0x00cf, B:32:0x00dc, B:34:0x00e2, B:35:0x00f2), top: B:80:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01ab A[LOOP:1: B:59:0x01a5->B:61:0x01ab, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01cf A[PHI: r1
  0x01cf: PHI (r1v31 java.util.ArrayList) = (r1v30 java.util.ArrayList), (r1v38 java.util.ArrayList) binds: [B:63:0x01cc, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01e2 A[LOOP:0: B:66:0x01dc->B:68:0x01e2, LOOP_END] */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Iterable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0134 -> B:42:0x0135). Please report as a decompilation issue!!! */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 545
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p063e7.C2037d.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: e7.d$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f5679q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ boolean f5681s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f5681s = z10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C2037d.this.new e(this.f5681s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((e) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f5679q;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC4713t.m18808b(obj);
                    return obj;
                }
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            C2037d c2037d = C2037d.this;
            boolean z10 = this.f5681s;
            this.f5679q = 1;
            Object objM7329A = c2037d.m7329A(z10, this);
            return objM7329A == objM24992g ? objM24992g : objM7329A;
        }
    }

    /* JADX INFO: renamed from: e7.d$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f5682q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f5683r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f5684s;

        public f(InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f5682q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C2348h c2348h = (C2348h) this.f5683r;
                C8536b0 c8536b0 = (C8536b0) this.f5684s;
                C2037d c2037d = C2037d.this;
                this.f5683r = null;
                this.f5682q = 1;
                if (c2037d.m7335w(c2348h, c8536b0, this) == objM24992g) {
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

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(C2348h c2348h, C8536b0 c8536b0, InterfaceC5976f interfaceC5976f) {
            f fVar = C2037d.this.new f(interfaceC5976f);
            fVar.f5683r = c2348h;
            fVar.f5684s = c8536b0;
            return fVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: e7.d$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public boolean f5686q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f5687r;

        /* JADX INFO: renamed from: t */
        public int f5689t;

        public g(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f5687r = obj;
            this.f5689t |= Integer.MIN_VALUE;
            return C2037d.this.m7329A(false, this);
        }
    }

    /* JADX INFO: renamed from: e7.d$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class h extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f5690q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ long f5692s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ long f5693t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j10, long j11, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f5692s = j10;
            this.f5693t = j11;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C2037d.this.new h(this.f5692s, this.f5693t, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((h) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f5690q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C2037d c2037d = C2037d.this;
                long j10 = this.f5692s;
                long j11 = this.f5693t;
                this.f5690q = 1;
                if (c2037d.m7330B(j10, j11, this) == objM24992g) {
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

    /* JADX INFO: renamed from: e7.d$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class i extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public long f5694q;

        /* JADX INFO: renamed from: r */
        public long f5695r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f5696s;

        /* JADX INFO: renamed from: u */
        public int f5698u;

        public i(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f5696s = obj;
            this.f5698u |= Integer.MIN_VALUE;
            return C2037d.this.m7330B(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: e7.d$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class j extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f5699q;

        public j(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C2037d.this.new j(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((j) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f5699q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2198w1 interfaceC2198w1 = C2037d.this.serverJob;
                this.f5699q = 1;
                if (interfaceC2198w1.mo7657J0(this) == objM24992g) {
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

    /* JADX INFO: renamed from: e7.d$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class k extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f5701q;

        public k(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C2037d.this.new k(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((k) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f5701q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2198w1 interfaceC2198w1 = C2037d.this.serverJob;
                this.f5701q = 1;
                if (interfaceC2198w1.mo7657J0(this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return AbstractC6533b.m25845a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2037d(InterfaceC1359d interfaceC1359d, C7193c c7193c, boolean z10, a aVar, InterfaceC0173a interfaceC0173a) {
        super(interfaceC1359d, c7193c, z10, null, 8, null);
        interfaceC1359d.getClass();
        c7193c.getClass();
        aVar.getClass();
        interfaceC0173a.getClass();
        this.f5640e = aVar;
        this.f5641f = interfaceC0173a;
        C2122d1 c2122d1 = C2122d1.f5935a;
        this.f5642g = AbstractC2541a.m9058a(c2122d1);
        this.f5643h = AbstractC2541a.m9058a(c2122d1);
        this.f5644i = AbstractC2204y.m7936c(null, 1, null);
        this.f5645j = AbstractC2108a2.m7602b(null, 1, null);
        this.serverJob = AbstractC2108a2.m7602b(null, 1, null);
        this.serverJob = m7337y();
        this.serverJob.mo7650D0(new InterfaceC0184l() { // from class: e7.c
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C2037d.m7319k(this.f5639q, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static C4700i0 m7319k(C2037d c2037d, Throwable th) {
        if (th != null) {
            c2037d.f5645j.mo7942j(th);
        }
        if (th != null) {
            c2037d.f5644i.mo7917j(th);
        }
        return C4700i0.f13910a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m7329A(boolean r7, p228p8.InterfaceC5976f r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p063e7.C2037d.g
            if (r0 == 0) goto L13
            r0 = r8
            e7.d$g r0 = (p063e7.C2037d.g) r0
            int r1 = r0.f5689t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5689t = r1
            goto L18
        L13:
            e7.d$g r0 = new e7.d$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5687r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f5689t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            p172l8.AbstractC4713t.m18808b(r8)
            return r6
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r7)
            r7 = 0
            return r7
        L33:
            boolean r7 = r0.f5686q
            p172l8.AbstractC4713t.m18808b(r8)
            goto L4e
        L39:
            p172l8.AbstractC4713t.m18808b(r8)
            ec.w1 r8 = r6.serverJob
            r8.start()
            ec.w r8 = r6.f5644i
            r0.f5686q = r7
            r0.f5689t = r4
            java.lang.Object r8 = r8.mo7915K(r0)
            if (r8 != r1) goto L4e
            goto L71
        L4e:
            s6.c r8 = r6.m12223g()
            s6.a r2 = p034c7.AbstractC1396x.m5480h()
            c7.d r4 = r6.m12222f()
            c7.d r5 = r6.m12222f()
            ff.d r5 = r5.mo5387c()
            p270s6.AbstractC7194d.m28428a(r8, r2, r4, r5)
            if (r7 == 0) goto L72
            ec.w1 r7 = r6.serverJob
            r0.f5689t = r3
            java.lang.Object r7 = r7.mo7657J0(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p063e7.C2037d.m7329A(boolean, p8.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m7330B(long r7, long r9, p228p8.InterfaceC5976f r11) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r11 instanceof p063e7.C2037d.i
            if (r0 == 0) goto L13
            r0 = r11
            e7.d$i r0 = (p063e7.C2037d.i) r0
            int r1 = r0.f5698u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5698u = r1
            goto L18
        L13:
            e7.d$i r0 = new e7.d$i
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f5696s
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f5698u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            p172l8.AbstractC4713t.m18808b(r11)
            return r11
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r7)
            r7 = 0
            return r7
        L34:
            long r9 = r0.f5695r
            long r7 = r0.f5694q
            p172l8.AbstractC4713t.m18808b(r11)
            goto L56
        L3c:
            p172l8.AbstractC4713t.m18808b(r11)
            ec.z r11 = r6.f5645j
            r11.mo7943r0()
            e7.d$k r11 = new e7.d$k
            r11.<init>(r5)
            r0.f5694q = r7
            r0.f5695r = r9
            r0.f5698u = r4
            java.lang.Object r11 = ec.AbstractC2199w2.m7929e(r7, r11, r0)
            if (r11 != r1) goto L56
            goto L6d
        L56:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 != 0) goto L6f
            ec.w1 r11 = r6.serverJob
            ec.InterfaceC2198w1.a.m7920a(r11, r5, r4, r5)
            long r9 = r9 - r7
            e7.d$j r7 = new e7.d$j
            r7.<init>(r5)
            r0.f5698u = r3
            java.lang.Object r7 = ec.AbstractC2199w2.m7929e(r9, r7, r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            return r7
        L6f:
            l8.i0 r7 = p172l8.C4700i0.f13910a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p063e7.C2037d.m7330B(long, long, p8.f):java.lang.Object");
    }

    @Override // p125i7.InterfaceC3200a
    /* JADX INFO: renamed from: a */
    public InterfaceC3200a mo7331a(boolean z10) {
        return (InterfaceC3200a) AbstractC2541a.m9059b(new e(z10, null));
    }

    @Override // p125i7.InterfaceC3200a
    /* JADX INFO: renamed from: c */
    public void mo7332c(long j10, long j11) {
        AbstractC2541a.m9059b(new h(j10, j11, null));
    }

    /* JADX INFO: renamed from: u */
    public final void m7333u(InterfaceC3473k interfaceC3473k, C2035b c2035b) throws C1009b {
        C1016i c1016i = new C1016i("ExpectedHeaderPhase");
        c2035b.mo7314a().mo12242a().m3747u(C5651c.f17779w.m22854a(), c1016i);
        c2035b.mo7314a().mo12242a().m3749w(c1016i, new b(c2035b, this, "100-continue", interfaceC3473k, "HTTP/1.1 100 Continue\r\n\r\n", null));
    }

    /* JADX INFO: renamed from: v */
    public final a m7334v() {
        return this.f5640e;
    }

    /* JADX INFO: renamed from: w */
    public final Object m7335w(C2348h c2348h, C8536b0 c8536b0, InterfaceC5976f interfaceC5976f) {
        Object objM7762g = AbstractC2140i.m7762g(this.f5643h, new c(c8536b0, c2348h, null), interfaceC5976f);
        return objM7762g == AbstractC6325c.m24992g() ? objM7762g : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7336x(C2041h c2041h) {
        InterfaceC8163p interfaceC8163pMo12244g = c2041h.mo12244g();
        C8169v c8169v = C8169v.f27347a;
        String strMo12334e = interfaceC8163pMo12244g.mo12334e(c8169v.m31680i());
        Long lValueOf = strMo12334e != null ? Long.valueOf(Long.parseLong(strMo12334e)) : null;
        if (c2041h.mo12244g().mo12334e(c8169v.m31685n()) == null) {
            return lValueOf != null && lValueOf.longValue() > 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final InterfaceC2198w1 m7337y() {
        InterfaceC1359d interfaceC1359dM12222f = m12222f();
        AbstractC2149k0 abstractC2149k0 = this.f5643h;
        InterfaceC2208z interfaceC2208z = this.f5645j;
        InterfaceC2196w interfaceC2196w = this.f5644i;
        return AbstractC2148k.m7817d(AbstractC2169p0.m7878a(((C1353a) this.f5641f.invoke()).m5364W().mo1651c0(this.f5642g)), null, EnumC2173q0.f5999r, new d(m12225i(), interfaceC2208z, interfaceC2196w, abstractC2149k0, interfaceC1359dM12222f, null), 1, null);
    }

    /* JADX INFO: renamed from: z */
    public final C2045l m7338z(InterfaceC2165o0 interfaceC2165o0, InterfaceC3219j0 interfaceC3219j0) {
        return AbstractC2345e.m8512d(interfaceC2165o0, new C2046m(interfaceC3219j0.mo12227b(), interfaceC3219j0.mo12226a(), this.f5640e.m7339d(), this.f5640e.m7340e()), new f(null));
    }
}
