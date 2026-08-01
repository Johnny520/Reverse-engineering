package p190n0;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p015b0.InterfaceC0790j3;
import p024b9.C1042j0;
import p073f2.AbstractC2263r;
import p073f2.AbstractC2264r0;
import p073f2.AbstractC2278y0;
import p073f2.C2236d0;
import p073f2.C2261q;
import p073f2.InterfaceC2230b;
import p073f2.InterfaceC2254m0;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p179m2.InterfaceC4862j3;
import p219p.AbstractC5865l0;
import p219p.AbstractC5891u;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p250r1.C6455e;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6542k;

/* JADX INFO: renamed from: n0.n1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5396n1 {

    /* JADX INFO: renamed from: n0.n1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f16602q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f16603r;

        /* JADX INFO: renamed from: s */
        public int f16604s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f16603r = obj;
            this.f16604s |= Integer.MIN_VALUE;
            return AbstractC5396n1.m21957h(null, this);
        }
    }

    /* JADX INFO: renamed from: n0.n1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f16605q;

        /* JADX INFO: renamed from: r */
        public Object f16606r;

        /* JADX INFO: renamed from: s */
        public Object f16607s;

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f16608t;

        /* JADX INFO: renamed from: u */
        public int f16609u;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f16608t = obj;
            this.f16609u |= Integer.MIN_VALUE;
            return AbstractC5396n1.m21960k(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: n0.n1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5412q f16610a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0790j3 f16611b;

        /* JADX INFO: renamed from: n0.n1$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6542k implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public int f16612r;

            /* JADX INFO: renamed from: s */
            public /* synthetic */ Object f16613s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ InterfaceC5412q f16614t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C5382l f16615u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ InterfaceC0790j3 f16616v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5412q interfaceC5412q, C5382l c5382l, InterfaceC0790j3 interfaceC0790j3, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f16614t = interfaceC5412q;
                this.f16615u = c5382l;
                this.f16616v = interfaceC0790j3;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                a aVar = new a(this.f16614t, this.f16615u, this.f16616v, interfaceC5976f);
                aVar.f16613s = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
            
                if (p190n0.AbstractC5396n1.m21960k(r1, r2, r4, r10, r9) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
            
                if (p190n0.AbstractC5396n1.m21962m(r1, r3, r10, r9) == r0) goto L32;
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
                    int r1 = r9.f16612r
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r4) goto L1e
                    if (r1 == r3) goto L19
                    if (r1 != r2) goto L12
                    goto L19
                L12:
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    p376zd.C10010p0.m38820a(r10)
                    r10 = 0
                    return r10
                L19:
                    p172l8.AbstractC4713t.m18808b(r10)
                    goto L89
                L1e:
                    java.lang.Object r1 = r9.f16613s
                    f2.b r1 = (p073f2.InterfaceC2230b) r1
                    p172l8.AbstractC4713t.m18808b(r10)
                    goto L39
                L26:
                    p172l8.AbstractC4713t.m18808b(r10)
                    java.lang.Object r10 = r9.f16613s
                    r1 = r10
                    f2.b r1 = (p073f2.InterfaceC2230b) r1
                    r9.f16613s = r1
                    r9.f16612r = r4
                    java.lang.Object r10 = p190n0.AbstractC5396n1.m21953d(r1, r9)
                    if (r10 != r0) goto L39
                    goto L88
                L39:
                    f2.q r10 = (p073f2.C2261q) r10
                    boolean r4 = p190n0.AbstractC5396n1.m21959j(r10)
                    r5 = 0
                    if (r4 == 0) goto L76
                    int r4 = r10.m8215b()
                    boolean r4 = p073f2.AbstractC2271v.m8275b(r4)
                    if (r4 == 0) goto L76
                    java.util.List r4 = r10.m8216c()
                    int r6 = r4.size()
                    r7 = 0
                L55:
                    if (r7 >= r6) goto L67
                    java.lang.Object r8 = r4.get(r7)
                    f2.d0 r8 = (p073f2.C2236d0) r8
                    boolean r8 = r8.m8085p()
                    if (r8 == 0) goto L64
                    goto L76
                L64:
                    int r7 = r7 + 1
                    goto L55
                L67:
                    n0.q r2 = r9.f16614t
                    n0.l r4 = r9.f16615u
                    r9.f16613s = r5
                    r9.f16612r = r3
                    java.lang.Object r10 = p190n0.AbstractC5396n1.m21955f(r1, r2, r4, r10, r9)
                    if (r10 != r0) goto L89
                    goto L88
                L76:
                    boolean r3 = p190n0.AbstractC5396n1.m21959j(r10)
                    if (r3 != 0) goto L89
                    b0.j3 r3 = r9.f16616v
                    r9.f16613s = r5
                    r9.f16612r = r2
                    java.lang.Object r10 = p190n0.AbstractC5396n1.m21956g(r1, r3, r10, r9)
                    if (r10 != r0) goto L89
                L88:
                    return r0
                L89:
                    l8.i0 r10 = p172l8.C4700i0.f13910a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p190n0.AbstractC5396n1.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2230b interfaceC2230b, InterfaceC5976f interfaceC5976f) {
                return ((a) create(interfaceC2230b, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }
        }

        public c(InterfaceC5412q interfaceC5412q, InterfaceC0790j3 interfaceC0790j3) {
            this.f16610a = interfaceC5412q;
            this.f16611b = interfaceC0790j3;
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC2254m0 interfaceC2254m0, InterfaceC5976f interfaceC5976f) {
            Object objM23631d = AbstractC5865l0.m23631d(interfaceC2254m0, new a(this.f16610a, new C5382l(interfaceC2254m0.getViewConfiguration()), this.f16611b, null), interfaceC5976f);
            return objM23631d == AbstractC6325c.m24992g() ? objM23631d : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: n0.n1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f16617q;

        /* JADX INFO: renamed from: r */
        public Object f16618r;

        /* JADX INFO: renamed from: s */
        public Object f16619s;

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f16620t;

        /* JADX INFO: renamed from: u */
        public int f16621u;

        public d(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f16620t = obj;
            this.f16621u |= Integer.MIN_VALUE;
            return AbstractC5396n1.m21962m(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: n0.n1$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0184l f16622a;

        /* JADX INFO: renamed from: n0.n1$e$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6542k implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public int f16623r;

            /* JADX INFO: renamed from: s */
            public /* synthetic */ Object f16624s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ InterfaceC0184l f16625t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f16625t = interfaceC0184l;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                a aVar = new a(this.f16625t, interfaceC5976f);
                aVar.f16624s = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:12:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p257r8.AbstractC6532a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                    int r1 = r4.f16623r
                    r2 = 1
                    if (r1 == 0) goto L1a
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f16624s
                    f2.b r1 = (p073f2.InterfaceC2230b) r1
                    p172l8.AbstractC4713t.m18808b(r5)
                    goto L2f
                L13:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    p376zd.C10010p0.m38820a(r5)
                    r5 = 0
                    return r5
                L1a:
                    p172l8.AbstractC4713t.m18808b(r5)
                    java.lang.Object r5 = r4.f16624s
                    f2.b r5 = (p073f2.InterfaceC2230b) r5
                    r1 = r5
                L22:
                    f2.s r5 = p073f2.EnumC2265s.f6225q
                    r4.f16624s = r1
                    r4.f16623r = r2
                    java.lang.Object r5 = r1.mo8033b0(r5, r4)
                    if (r5 != r0) goto L2f
                    return r0
                L2f:
                    f2.q r5 = (p073f2.C2261q) r5
                    a9.l r3 = r4.f16625t
                    boolean r5 = p190n0.AbstractC5396n1.m21959j(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = p257r8.AbstractC6533b.m25845a(r5)
                    r3.mo27m(r5)
                    goto L22
                */
                throw new UnsupportedOperationException("Method not decompiled: p190n0.AbstractC5396n1.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2230b interfaceC2230b, InterfaceC5976f interfaceC5976f) {
                return ((a) create(interfaceC2230b, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }
        }

        public e(InterfaceC0184l interfaceC0184l) {
            this.f16622a = interfaceC0184l;
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC2254m0 interfaceC2254m0, InterfaceC5976f interfaceC5976f) {
            Object objMo8053R = interfaceC2254m0.mo8053R(new a(this.f16622a, null), interfaceC5976f);
            return objMo8053R == AbstractC6325c.m24992g() ? objMo8053R : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m21950a(InterfaceC5412q interfaceC5412q, C2236d0 c2236d0) {
        if (interfaceC5412q.mo19131a(c2236d0.m8077h())) {
            c2236d0.m8071a();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m21951b(InterfaceC5412q interfaceC5412q, InterfaceC5455x0 interfaceC5455x0, C1042j0 c1042j0, C2236d0 c2236d0) {
        if (interfaceC5412q.mo19134d(c2236d0.m8077h(), interfaceC5455x0)) {
            c2236d0.m8071a();
            c1042j0.f3202q = true;
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m21952c(InterfaceC0790j3 interfaceC0790j3, C2236d0 c2236d0) {
        interfaceC0790j3.mo2967e(AbstractC2263r.m8234g(c2236d0));
        c2236d0.m8071a();
        return C4700i0.f13910a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m21957h(p073f2.InterfaceC2230b r7, p228p8.InterfaceC5976f r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p190n0.AbstractC5396n1.a
            if (r0 == 0) goto L13
            r0 = r8
            n0.n1$a r0 = (p190n0.AbstractC5396n1.a) r0
            int r1 = r0.f16604s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16604s = r1
            goto L18
        L13:
            n0.n1$a r0 = new n0.n1$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16603r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f16604s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f16602q
            f2.b r7 = (p073f2.InterfaceC2230b) r7
            p172l8.AbstractC4713t.m18808b(r8)
            goto L44
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r7)
            r7 = 0
            return r7
        L34:
            p172l8.AbstractC4713t.m18808b(r8)
        L37:
            f2.s r8 = p073f2.EnumC2265s.f6226r
            r0.f16602q = r7
            r0.f16604s = r3
            java.lang.Object r8 = r7.mo8033b0(r8, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            f2.q r8 = (p073f2.C2261q) r8
            java.util.List r2 = r8.m8216c()
            int r4 = r2.size()
            r5 = 0
        L4f:
            if (r5 >= r4) goto L61
            java.lang.Object r6 = r2.get(r5)
            f2.d0 r6 = (p073f2.C2236d0) r6
            boolean r6 = p073f2.AbstractC2263r.m8229b(r6)
            if (r6 != 0) goto L5e
            goto L37
        L5e:
            int r5 = r5 + 1
            goto L4f
        L61:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p190n0.AbstractC5396n1.m21957h(f2.b, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m21958i(InterfaceC4862j3 interfaceC4862j3, C2236d0 c2236d0, C2236d0 c2236d02) {
        return C6455e.m25557k(C6455e.m25562p(c2236d0.m8077h(), c2236d02.m8077h())) < AbstractC5891u.m23727q(interfaceC4862j3, c2236d0.m8083n());
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m21959j(C2261q c2261q) {
        List listM8216c = c2261q.m8216c();
        int size = listM8216c.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!AbstractC2264r0.m8244g(((C2236d0) listM8216c.get(i10)).m8083n(), AbstractC2264r0.f6219a.m8248b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r13 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m21960k(p073f2.InterfaceC2230b r9, final p190n0.InterfaceC5412q r10, p190n0.C5382l r11, p073f2.C2261q r12, p228p8.InterfaceC5976f r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p190n0.AbstractC5396n1.m21960k(f2.b, n0.q, n0.l, f2.q, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC4507m m21961l(InterfaceC4507m interfaceC4507m, InterfaceC5412q interfaceC5412q, InterfaceC0790j3 interfaceC0790j3) {
        return AbstractC2278y0.m8291d(interfaceC4507m, interfaceC5412q, interfaceC0790j3, new c(interfaceC5412q, interfaceC0790j3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m21962m(p073f2.InterfaceC2230b r8, final p015b0.InterfaceC0790j3 r9, p073f2.C2261q r10, p228p8.InterfaceC5976f r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p190n0.AbstractC5396n1.m21962m(f2.b, b0.j3, f2.q, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC4507m m21963n(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l) {
        return AbstractC2278y0.m8290c(interfaceC4507m, 8675309, new e(interfaceC0184l));
    }
}
