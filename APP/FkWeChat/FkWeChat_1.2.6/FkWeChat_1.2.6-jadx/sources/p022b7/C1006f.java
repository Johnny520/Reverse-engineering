package p022b7;

import io.ktor.utils.p131io.InterfaceC3473k;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import p008a7.AbstractC0171g;
import p008a7.InterfaceC0169e;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p035c8.C1399a;
import p113hc.InterfaceC2972c;
import p113hc.InterfaceC2974d;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p281t6.AbstractC8142e;
import p281t6.C8140d;
import p299ub.C8614c;
import p300uc.InterfaceC8647b;
import p323w6.C9191b;
import p375zc.AbstractC9939c;
import p376zd.C10010p0;

/* JADX INFO: renamed from: b7.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1006f implements InterfaceC0169e {

    /* JADX INFO: renamed from: a */
    public final AbstractC9939c f3112a;

    /* JADX INFO: renamed from: b */
    public final Map f3113b;

    /* JADX INFO: renamed from: b7.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f3114q;

        /* JADX INFO: renamed from: s */
        public int f3116s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f3114q = obj;
            this.f3116s |= Integer.MIN_VALUE;
            return C1006f.this.mo404a(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: b7.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC2974d {

        /* JADX INFO: renamed from: q */
        public int f3117q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC3473k f3118r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C1001a f3119s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C1006f f3120t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC8647b f3121u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Charset f3122v;

        /* JADX INFO: renamed from: b7.f$b$a */
        public static final class a extends AbstractC6535d {

            /* JADX INFO: renamed from: q */
            public /* synthetic */ Object f3123q;

            /* JADX INFO: renamed from: r */
            public int f3124r;

            /* JADX INFO: renamed from: t */
            public Object f3126t;

            public a(InterfaceC5976f interfaceC5976f) {
                super(interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) {
                this.f3123q = obj;
                this.f3124r |= Integer.MIN_VALUE;
                return b.this.mo400a(null, this);
            }
        }

        public b(InterfaceC3473k interfaceC3473k, C1001a c1001a, C1006f c1006f, InterfaceC8647b interfaceC8647b, Charset charset) {
            this.f3118r = interfaceC3473k;
            this.f3119s = c1001a;
            this.f3120t = c1006f;
            this.f3121u = interfaceC8647b;
            this.f3122v = charset;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        
            if (r11.mo12879b(r5) != r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // p113hc.InterfaceC2974d
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo400a(java.lang.Object r11, p228p8.InterfaceC5976f r12) throws java.lang.Throwable {
            /*
                r10 = this;
                boolean r0 = r12 instanceof p022b7.C1006f.b.a
                if (r0 == 0) goto L14
                r0 = r12
                b7.f$b$a r0 = (p022b7.C1006f.b.a) r0
                int r1 = r0.f3124r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.f3124r = r1
            L12:
                r5 = r0
                goto L1a
            L14:
                b7.f$b$a r0 = new b7.f$b$a
                r0.<init>(r12)
                goto L12
            L1a:
                java.lang.Object r12 = r5.f3123q
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r5.f3124r
                r8 = 3
                r9 = 2
                r2 = 1
                if (r1 == 0) goto L42
                if (r1 == r2) goto L3c
                if (r1 == r9) goto L38
                if (r1 != r8) goto L31
                p172l8.AbstractC4713t.m18808b(r12)
                goto L98
            L31:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r11)
                r11 = 0
                return r11
            L38:
                p172l8.AbstractC4713t.m18808b(r12)
                goto L8d
            L3c:
                java.lang.Object r11 = r5.f3126t
                p172l8.AbstractC4713t.m18808b(r12)
                goto L67
            L42:
                p172l8.AbstractC4713t.m18808b(r12)
                int r12 = r10.f3117q
                int r1 = r12 + 1
                r10.f3117q = r1
                if (r12 < 0) goto L9b
                if (r12 <= 0) goto L67
                io.ktor.utils.io.k r1 = r10.f3118r
                b7.a r12 = r10.f3119s
                byte[] r12 = r12.m3695c()
                r5.f3126t = r11
                r5.f3124r = r2
                r3 = 0
                r4 = 0
                r6 = 6
                r7 = 0
                r2 = r12
                java.lang.Object r12 = io.ktor.utils.p131io.AbstractC3476n.m12982k(r1, r2, r3, r4, r5, r6, r7)
                if (r12 != r0) goto L67
                goto L97
            L67:
                b7.f r12 = r10.f3120t
                zc.c r12 = p022b7.C1006f.m3700c(r12)
                uc.b r1 = r10.f3121u
                uc.p r1 = (p300uc.InterfaceC8662p) r1
                java.lang.String r11 = r12.mo33257c(r1, r11)
                io.ktor.utils.io.k r1 = r10.f3118r
                java.nio.charset.Charset r12 = r10.f3122v
                byte[] r2 = p064e8.AbstractC2053f.m7404c(r11, r12)
                r11 = 0
                r5.f3126t = r11
                r5.f3124r = r9
                r3 = 0
                r4 = 0
                r6 = 6
                r7 = 0
                java.lang.Object r11 = io.ktor.utils.p131io.AbstractC3476n.m12982k(r1, r2, r3, r4, r5, r6, r7)
                if (r11 != r0) goto L8d
                goto L97
            L8d:
                io.ktor.utils.io.k r11 = r10.f3118r
                r5.f3124r = r8
                java.lang.Object r11 = r11.mo12879b(r5)
                if (r11 != r0) goto L98
            L97:
                return r0
            L98:
                l8.i0 r11 = p172l8.C4700i0.f13910a
                return r11
            L9b:
                java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
                java.lang.String r12 = "Index overflow has happened"
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p022b7.C1006f.b.mo400a(java.lang.Object, p8.f):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: b7.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f3127q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f3128r;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ Object f3130t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC8647b f3131u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Charset f3132v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, InterfaceC8647b interfaceC8647b, Charset charset, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f3130t = obj;
            this.f3131u = interfaceC8647b;
            this.f3132v = charset;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            c cVar = C1006f.this.new c(this.f3130t, this.f3131u, this.f3132v, interfaceC5976f);
            cVar.f3128r = obj;
            return cVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f3127q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC3473k interfaceC3473k = (InterfaceC3473k) this.f3128r;
                C1006f c1006f = C1006f.this;
                Object obj2 = this.f3130t;
                obj2.getClass();
                InterfaceC8647b interfaceC8647b = this.f3131u;
                interfaceC8647b.getClass();
                Charset charset = this.f3132v;
                this.f3127q = 1;
                if (c1006f.m3702e((InterfaceC2972c) obj2, interfaceC8647b, charset, interfaceC3473k, this) == objM24992g) {
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
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3473k interfaceC3473k, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC3473k, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: b7.f$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f3133q;

        /* JADX INFO: renamed from: r */
        public Object f3134r;

        /* JADX INFO: renamed from: s */
        public Object f3135s;

        /* JADX INFO: renamed from: t */
        public Object f3136t;

        /* JADX INFO: renamed from: u */
        public Object f3137u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f3138v;

        /* JADX INFO: renamed from: x */
        public int f3140x;

        public d(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f3138v = obj;
            this.f3140x |= Integer.MIN_VALUE;
            return C1006f.this.m3702e(null, null, null, null, this);
        }
    }

    public C1006f(AbstractC9939c abstractC9939c) {
        abstractC9939c.getClass();
        this.f3112a = abstractC9939c;
        this.f3113b = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p008a7.InterfaceC0169e
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo404a(java.nio.charset.Charset r5, p035c8.C1399a r6, io.ktor.utils.p131io.InterfaceC3468g r7, p228p8.InterfaceC5976f r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p022b7.C1006f.a
            if (r0 == 0) goto L13
            r0 = r8
            b7.f$a r0 = (p022b7.C1006f.a) r0
            int r1 = r0.f3116s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3116s = r1
            goto L18
        L13:
            b7.f$a r0 = new b7.f$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3114q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f3116s
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            p172l8.AbstractC4713t.m18808b(r8)     // Catch: java.lang.Throwable -> L29
            return r8
        L29:
            r5 = move-exception
            goto L5a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L32:
            p172l8.AbstractC4713t.m18808b(r8)
            java.nio.charset.Charset r8 = p299ub.C8614c.f28652b
            boolean r5 = p024b9.AbstractC1061t.m3842c(r5, r8)
            if (r5 == 0) goto L72
            g9.c r5 = r6.m5482b()
            java.lang.Class<sb.h> r8 = sb.InterfaceC7282h.class
            g9.c r8 = p024b9.AbstractC1052o0.m3807b(r8)
            boolean r5 = p024b9.AbstractC1061t.m3842c(r5, r8)
            if (r5 != 0) goto L4e
            goto L72
        L4e:
            zc.c r5 = r4.f3112a     // Catch: java.lang.Throwable -> L29
            r0.f3116s = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = p022b7.AbstractC1002b.m3696a(r5, r7, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r5 != r1) goto L59
            return r1
        L59:
            return r5
        L5a:
            z6.f r6 = new z6.f
            java.lang.String r7 = r5.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal input: "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7, r5)
            throw r6
        L72:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p022b7.C1006f.mo404a(java.nio.charset.Charset, c8.a, io.ktor.utils.io.g, p8.f):java.lang.Object");
    }

    @Override // p008a7.InterfaceC0169e
    /* JADX INFO: renamed from: b */
    public Object mo405b(C8140d c8140d, Charset charset, C1399a c1399a, Object obj, InterfaceC5976f interfaceC5976f) {
        if (!AbstractC1061t.m3842c(charset, C8614c.f28652b) || !AbstractC1061t.m3842c(c1399a.m5482b(), AbstractC1052o0.m3807b(InterfaceC2972c.class))) {
            return null;
        }
        return new C9191b(new c(obj, AbstractC0171g.m410d(this.f3112a.mo33269a(), AbstractC1007g.m3704a(c1399a)), charset, null), AbstractC8142e.m31616c(c8140d, charset), null, null, 12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        if (io.ktor.utils.p131io.AbstractC3476n.m12982k(r3, r4, 0, 0, r8, 6, null) != r11) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3702e(p113hc.InterfaceC2972c r17, p300uc.InterfaceC8647b r18, java.nio.charset.Charset r19, io.ktor.utils.p131io.InterfaceC3473k r20, p228p8.InterfaceC5976f r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022b7.C1006f.m3702e(hc.c, uc.b, java.nio.charset.Charset, io.ktor.utils.io.k, p8.f):java.lang.Object");
    }
}
