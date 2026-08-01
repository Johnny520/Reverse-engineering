package p008a7;

import io.ktor.utils.p131io.InterfaceC3468g;
import java.nio.charset.Charset;
import java.util.List;
import okhttp3.C5754i;
import p010a9.InterfaceC0188p;
import p035c8.C1399a;
import p113hc.InterfaceC2972c;
import p113hc.InterfaceC2974d;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p281t6.AbstractC8142e;
import p281t6.C8140d;
import p300uc.InterfaceC8646a0;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8659m;
import p314vb.C8897d;
import p323w6.AbstractC9195f;
import p323w6.C9199j;
import p370z6.InterfaceC9880d;
import p376zd.C10010p0;

/* JADX INFO: renamed from: a7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0167c implements InterfaceC9880d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8659m f469a;

    /* JADX INFO: renamed from: b */
    public final List f470b;

    /* JADX INFO: renamed from: a7.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2972c {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC2972c f471q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ Charset f472r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C1399a f473s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC3468g f474t;

        /* JADX INFO: renamed from: a7.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10037a implements InterfaceC2974d {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ InterfaceC2974d f475q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ Charset f476r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C1399a f477s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ InterfaceC3468g f478t;

            /* JADX INFO: renamed from: a7.c$a$a$a, reason: collision with other inner class name */
            public static final class C10038a extends AbstractC6535d {

                /* JADX INFO: renamed from: q */
                public /* synthetic */ Object f479q;

                /* JADX INFO: renamed from: r */
                public int f480r;

                /* JADX INFO: renamed from: s */
                public Object f481s;

                public C10038a(InterfaceC5976f interfaceC5976f) {
                    super(interfaceC5976f);
                }

                @Override // p257r8.AbstractC6532a
                public final Object invokeSuspend(Object obj) {
                    this.f479q = obj;
                    this.f480r |= Integer.MIN_VALUE;
                    return C10037a.this.mo400a(null, this);
                }
            }

            public C10037a(InterfaceC2974d interfaceC2974d, Charset charset, C1399a c1399a, InterfaceC3468g interfaceC3468g) {
                this.f475q = interfaceC2974d;
                this.f476r = charset;
                this.f477s = c1399a;
                this.f478t = interfaceC3468g;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
            
                if (r9.mo400a(r10, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p113hc.InterfaceC2974d
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo400a(java.lang.Object r9, p228p8.InterfaceC5976f r10) throws java.lang.Throwable {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof p008a7.C0167c.a.C10037a.C10038a
                    if (r0 == 0) goto L13
                    r0 = r10
                    a7.c$a$a$a r0 = (p008a7.C0167c.a.C10037a.C10038a) r0
                    int r1 = r0.f480r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f480r = r1
                    goto L18
                L13:
                    a7.c$a$a$a r0 = new a7.c$a$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f479q
                    java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                    int r2 = r0.f480r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3b
                    if (r2 == r4) goto L33
                    if (r2 != r3) goto L2c
                    p172l8.AbstractC4713t.m18808b(r10)
                    goto L62
                L2c:
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    p376zd.C10010p0.m38820a(r9)
                    r9 = 0
                    return r9
                L33:
                    java.lang.Object r9 = r0.f481s
                    hc.d r9 = (p113hc.InterfaceC2974d) r9
                    p172l8.AbstractC4713t.m18808b(r10)
                    goto L56
                L3b:
                    p172l8.AbstractC4713t.m18808b(r10)
                    hc.d r10 = r8.f475q
                    a7.e r9 = (p008a7.InterfaceC0169e) r9
                    java.nio.charset.Charset r2 = r8.f476r
                    c8.a r5 = r8.f477s
                    io.ktor.utils.io.g r6 = r8.f478t
                    r0.f481s = r10
                    r0.f480r = r4
                    java.lang.Object r9 = r9.mo404a(r2, r5, r6, r0)
                    if (r9 != r1) goto L53
                    goto L61
                L53:
                    r7 = r10
                    r10 = r9
                    r9 = r7
                L56:
                    r2 = 0
                    r0.f481s = r2
                    r0.f480r = r3
                    java.lang.Object r9 = r9.mo400a(r10, r0)
                    if (r9 != r1) goto L62
                L61:
                    return r1
                L62:
                    l8.i0 r9 = p172l8.C4700i0.f13910a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: p008a7.C0167c.a.C10037a.mo400a(java.lang.Object, p8.f):java.lang.Object");
            }
        }

        public a(InterfaceC2972c interfaceC2972c, Charset charset, C1399a c1399a, InterfaceC3468g interfaceC3468g) {
            this.f471q = interfaceC2972c;
            this.f472r = charset;
            this.f473s = c1399a;
            this.f474t = interfaceC3468g;
        }

        @Override // p113hc.InterfaceC2972c
        /* JADX INFO: renamed from: b */
        public Object mo399b(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
            Object objMo399b = this.f471q.mo399b(new C10037a(interfaceC2974d, this.f472r, this.f473s, this.f474t), interfaceC5976f);
            return objMo399b == AbstractC6325c.m24992g() ? objMo399b : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a7.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f483q;

        /* JADX INFO: renamed from: r */
        public Object f484r;

        /* JADX INFO: renamed from: s */
        public Object f485s;

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f486t;

        /* JADX INFO: renamed from: v */
        public int f488v;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f486t = obj;
            this.f488v |= Integer.MIN_VALUE;
            return C0167c.this.mo396a(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: a7.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f489q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f490r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC3468g f491s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC3468g interfaceC3468g, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f491s = interfaceC3468g;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            c cVar = new c(this.f491s, interfaceC5976f);
            cVar.f490r = obj;
            return cVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f489q == 0) {
                AbstractC4713t.m18808b(obj);
                return AbstractC6533b.m25845a(this.f490r != null || this.f491s.mo8544h());
            }
            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC5976f interfaceC5976f) {
            return ((c) create(obj, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: a7.c$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements InterfaceC2972c {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC2972c f492q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C8140d f493r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ Charset f494s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C1399a f495t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Object f496u;

        /* JADX INFO: renamed from: a7.c$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements InterfaceC2974d {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ InterfaceC2974d f497q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C8140d f498r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ Charset f499s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ C1399a f500t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ Object f501u;

            /* JADX INFO: renamed from: a7.c$d$a$a, reason: collision with other inner class name */
            public static final class C10039a extends AbstractC6535d {

                /* JADX INFO: renamed from: q */
                public /* synthetic */ Object f502q;

                /* JADX INFO: renamed from: r */
                public int f503r;

                /* JADX INFO: renamed from: s */
                public Object f504s;

                public C10039a(InterfaceC5976f interfaceC5976f) {
                    super(interfaceC5976f);
                }

                @Override // p257r8.AbstractC6532a
                public final Object invokeSuspend(Object obj) {
                    this.f502q = obj;
                    this.f503r |= Integer.MIN_VALUE;
                    return a.this.mo400a(null, this);
                }
            }

            public a(InterfaceC2974d interfaceC2974d, C8140d c8140d, Charset charset, C1399a c1399a, Object obj) {
                this.f497q = interfaceC2974d;
                this.f498r = c8140d;
                this.f499s = charset;
                this.f500t = c1399a;
                this.f501u = obj;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
            
                if (r10.mo400a(r11, r6) == r0) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
            @Override // p113hc.InterfaceC2974d
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo400a(java.lang.Object r10, p228p8.InterfaceC5976f r11) throws java.lang.Throwable {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof p008a7.C0167c.d.a.C10039a
                    if (r0 == 0) goto L14
                    r0 = r11
                    a7.c$d$a$a r0 = (p008a7.C0167c.d.a.C10039a) r0
                    int r1 = r0.f503r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f503r = r1
                L12:
                    r6 = r0
                    goto L1a
                L14:
                    a7.c$d$a$a r0 = new a7.c$d$a$a
                    r0.<init>(r11)
                    goto L12
                L1a:
                    java.lang.Object r11 = r6.f502q
                    java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                    int r1 = r6.f503r
                    r7 = 2
                    r2 = 1
                    if (r1 == 0) goto L3d
                    if (r1 == r2) goto L35
                    if (r1 != r7) goto L2e
                    p172l8.AbstractC4713t.m18808b(r11)
                    goto L68
                L2e:
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    p376zd.C10010p0.m38820a(r10)
                    r10 = 0
                    return r10
                L35:
                    java.lang.Object r10 = r6.f504s
                    hc.d r10 = (p113hc.InterfaceC2974d) r10
                    p172l8.AbstractC4713t.m18808b(r11)
                    goto L5c
                L3d:
                    p172l8.AbstractC4713t.m18808b(r11)
                    hc.d r11 = r9.f497q
                    r1 = r10
                    a7.e r1 = (p008a7.InterfaceC0169e) r1
                    r10 = r2
                    t6.d r2 = r9.f498r
                    java.nio.charset.Charset r3 = r9.f499s
                    c8.a r4 = r9.f500t
                    java.lang.Object r5 = r9.f501u
                    r6.f504s = r11
                    r6.f503r = r10
                    java.lang.Object r10 = r1.mo405b(r2, r3, r4, r5, r6)
                    if (r10 != r0) goto L59
                    goto L67
                L59:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L5c:
                    r1 = 0
                    r6.f504s = r1
                    r6.f503r = r7
                    java.lang.Object r10 = r10.mo400a(r11, r6)
                    if (r10 != r0) goto L68
                L67:
                    return r0
                L68:
                    l8.i0 r10 = p172l8.C4700i0.f13910a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p008a7.C0167c.d.a.mo400a(java.lang.Object, p8.f):java.lang.Object");
            }
        }

        public d(InterfaceC2972c interfaceC2972c, C8140d c8140d, Charset charset, C1399a c1399a, Object obj) {
            this.f492q = interfaceC2972c;
            this.f493r = c8140d;
            this.f494s = charset;
            this.f495t = c1399a;
            this.f496u = obj;
        }

        @Override // p113hc.InterfaceC2972c
        /* JADX INFO: renamed from: b */
        public Object mo399b(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
            Object objMo399b = this.f492q.mo399b(new a(interfaceC2974d, this.f493r, this.f494s, this.f495t, this.f496u), interfaceC5976f);
            return objMo399b == AbstractC6325c.m24992g() ? objMo399b : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a7.c$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f506q;

        /* JADX INFO: renamed from: r */
        public Object f507r;

        /* JADX INFO: renamed from: s */
        public Object f508s;

        /* JADX INFO: renamed from: t */
        public Object f509t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f510u;

        /* JADX INFO: renamed from: w */
        public int f512w;

        public e(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f510u = obj;
            this.f512w |= Integer.MIN_VALUE;
            return C0167c.this.mo397b(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: a7.c$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f513q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f514r;

        public f(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            f fVar = new f(interfaceC5976f);
            fVar.f514r = obj;
            return fVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f513q == 0) {
                AbstractC4713t.m18808b(obj);
                return AbstractC6533b.m25845a(((AbstractC9195f) this.f514r) != null);
            }
            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC9195f abstractC9195f, InterfaceC5976f interfaceC5976f) {
            return ((f) create(abstractC9195f, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C0167c(InterfaceC8659m interfaceC8659m) {
        interfaceC8659m.getClass();
        this.f469a = interfaceC8659m;
        this.f470b = AbstractC0166b.m395a(interfaceC8659m);
        if (interfaceC8659m instanceof InterfaceC8646a0) {
            return;
        }
        C5754i.m23255a("Only binary and string formats are supported, ", interfaceC8659m, " is not supported.");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:30:0x00a1, B:32:0x00a7, B:36:0x00b7, B:37:0x00d3), top: B:40:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:30:0x00a1, B:32:0x00a7, B:36:0x00b7, B:37:0x00d3), top: B:40:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // p370z6.InterfaceC9880d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo396a(java.nio.charset.Charset r9, p035c8.C1399a r10, io.ktor.utils.p131io.InterfaceC3468g r11, p228p8.InterfaceC5976f r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a7.C0167c.mo396a(java.nio.charset.Charset, c8.a, io.ktor.utils.io.g, p8.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p370z6.InterfaceC9880d
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo397b(p281t6.C8140d r11, java.nio.charset.Charset r12, p035c8.C1399a r13, java.lang.Object r14, p228p8.InterfaceC5976f r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r15 instanceof p008a7.C0167c.e
            if (r0 == 0) goto L13
            r0 = r15
            a7.c$e r0 = (p008a7.C0167c.e) r0
            int r1 = r0.f512w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f512w = r1
            goto L18
        L13:
            a7.c$e r0 = new a7.c$e
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f510u
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f512w
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3c
            java.lang.Object r14 = r0.f509t
            java.lang.Object r11 = r0.f508s
            r13 = r11
            c8.a r13 = (p035c8.C1399a) r13
            java.lang.Object r11 = r0.f507r
            r12 = r11
            java.nio.charset.Charset r12 = (java.nio.charset.Charset) r12
            java.lang.Object r11 = r0.f506q
            t6.d r11 = (p281t6.C8140d) r11
            p172l8.AbstractC4713t.m18808b(r15)
            r6 = r11
            r7 = r12
            r5 = r14
            goto L6e
        L3c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r11)
            r11 = 0
            return r11
        L43:
            p172l8.AbstractC4713t.m18808b(r15)
            java.util.List r15 = r10.f470b
            hc.c r5 = p113hc.AbstractC2976e.m10973a(r15)
            a7.c$d r4 = new a7.c$d
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            a7.c$f r11 = new a7.c$f
            r12 = 0
            r11.<init>(r12)
            r0.f506q = r6
            r0.f507r = r7
            r0.f508s = r8
            r0.f509t = r9
            r0.f512w = r3
            java.lang.Object r15 = p113hc.AbstractC2976e.m10985m(r4, r11, r0)
            if (r15 != r1) goto L6c
            return r1
        L6c:
            r13 = r8
            r5 = r9
        L6e:
            w6.f r15 = (p323w6.AbstractC9195f) r15
            if (r15 == 0) goto L73
            return r15
        L73:
            uc.m r11 = r10.f469a     // Catch: p300uc.C8661o -> L7f
            bd.b r11 = r11.mo33269a()     // Catch: p300uc.C8661o -> L7f
            uc.b r11 = p008a7.AbstractC0171g.m410d(r11, r13)     // Catch: p300uc.C8661o -> L7f
        L7d:
            r3 = r11
            goto L8a
        L7f:
            uc.m r11 = r10.f469a
            bd.b r11 = r11.mo33269a()
            uc.b r11 = p008a7.AbstractC0171g.m408b(r5, r11)
            goto L7d
        L8a:
            uc.m r4 = r10.f469a
            r2 = r10
            w6.f$a r11 = r2.m398c(r3, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a7.C0167c.mo397b(t6.d, java.nio.charset.Charset, c8.a, java.lang.Object, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC9195f.a m398c(InterfaceC8647b interfaceC8647b, InterfaceC8659m interfaceC8659m, Object obj, C8140d c8140d, Charset charset) {
        if (interfaceC8659m instanceof InterfaceC8646a0) {
            interfaceC8647b.getClass();
            return new C9199j(((InterfaceC8646a0) interfaceC8659m).mo33257c(interfaceC8647b, obj), AbstractC8142e.m31616c(c8140d, charset), null, 4, null);
        }
        C8897d.m34134a("Unsupported format ", interfaceC8659m);
        return null;
    }
}
