package p101h0;

import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.InterfaceC0564p5;
import ec.AbstractC2148k;
import ec.EnumC2173q0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p056e0.C1964c;
import p118i0.AbstractC3111m;
import p118i0.InterfaceC3107i;
import p118i0.InterfaceC3108j;
import p135j2.InterfaceC3578w;
import p166l2.AbstractC4549i;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4545h;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p250r1.C6457g;
import p257r8.AbstractC6544m;

/* JADX INFO: renamed from: h0.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2815p extends AbstractC4565m implements InterfaceC4545h, InterfaceC3107i {

    /* JADX INFO: renamed from: H */
    public AbstractC2816q f7345H;

    /* JADX INFO: renamed from: I */
    public InterfaceC0184l f7346I;

    /* JADX INFO: renamed from: J */
    public InterfaceC0184l f7347J;

    /* JADX INFO: renamed from: K */
    public InterfaceC0184l f7348K;

    /* JADX INFO: renamed from: L */
    public InterfaceC2198w1 f7349L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC0564p5 f7350M = AbstractC0473c5.m1565d(new InterfaceC0173a() { // from class: h0.o
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return C2815p.m10017M2(this.f7344q);
        }
    });

    /* JADX INFO: renamed from: N */
    public C6457g f7351N = C6457g.f20319e.m25594a();

    /* JADX INFO: renamed from: h0.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public Object f7352q;

        /* JADX INFO: renamed from: r */
        public int f7353r;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC3108j f7355t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3108j interfaceC3108j, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f7355t = interfaceC3108j;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C2815p.this.new a(this.f7355t, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        
            if (r7.mo27m(r6) == r0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r6.f7353r
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L27
                if (r1 == r3) goto L23
                if (r1 == r2) goto L1b
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r7)
                r7 = 0
                return r7
            L1b:
                java.lang.Object r0 = r6.f7352q
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                p172l8.AbstractC4713t.m18808b(r7)
                goto L7a
            L23:
                p172l8.AbstractC4713t.m18808b(r7)
                goto L63
            L27:
                p172l8.AbstractC4713t.m18808b(r7)     // Catch: java.lang.Throwable -> L2b
                goto L52
            L2b:
                r7 = move-exception
                goto L66
            L2d:
                p172l8.AbstractC4713t.m18808b(r7)     // Catch: java.lang.Throwable -> L2b
                goto L45
            L31:
                p172l8.AbstractC4713t.m18808b(r7)
                h0.p r7 = p101h0.C2815p.this     // Catch: java.lang.Throwable -> L2b
                a9.l r7 = r7.m10020P2()     // Catch: java.lang.Throwable -> L2b
                if (r7 == 0) goto L45
                r6.f7353r = r5     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r7 = r7.mo27m(r6)     // Catch: java.lang.Throwable -> L2b
                if (r7 != r0) goto L45
                goto L78
            L45:
                i0.j r7 = r6.f7355t     // Catch: java.lang.Throwable -> L2b
                h0.p r1 = p101h0.C2815p.this     // Catch: java.lang.Throwable -> L2b
                r6.f7353r = r4     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r7 = r7.mo8918a(r1, r6)     // Catch: java.lang.Throwable -> L2b
                if (r7 != r0) goto L52
                goto L78
            L52:
                h0.p r7 = p101h0.C2815p.this
                a9.l r7 = r7.m10019O2()
                if (r7 == 0) goto L63
                r6.f7353r = r3
                java.lang.Object r7 = r7.mo27m(r6)
                if (r7 != r0) goto L63
                goto L78
            L63:
                l8.i0 r7 = p172l8.C4700i0.f13910a
                return r7
            L66:
                h0.p r1 = p101h0.C2815p.this
                a9.l r1 = r1.m10019O2()
                if (r1 == 0) goto L7b
                r6.f7352q = r7
                r6.f7353r = r2
                java.lang.Object r1 = r1.mo27m(r6)
                if (r1 != r0) goto L79
            L78:
                return r0
            L79:
                r0 = r7
            L7a:
                r7 = r0
            L7b:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p101h0.C2815p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C2815p(AbstractC2816q abstractC2816q, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3) {
        this.f7345H = abstractC2816q;
        this.f7346I = interfaceC0184l;
        this.f7347J = interfaceC0184l2;
        this.f7348K = interfaceC0184l3;
    }

    /* JADX INFO: renamed from: M2 */
    public static C1964c m10017M2(C2815p c2815p) {
        return c2815p.m17461m2() ? AbstractC2810k.m10008c(c2815p) : C1964c.f5467b.m7113a();
    }

    @Override // p118i0.InterfaceC3107i
    /* JADX INFO: renamed from: C0 */
    public long mo10002C0(InterfaceC3578w interfaceC3578w) {
        return mo10004q0(interfaceC3578w).m25587p();
    }

    /* JADX INFO: renamed from: N2 */
    public final C1964c m10018N2() {
        return (C1964c) this.f7350M.getValue();
    }

    /* JADX INFO: renamed from: O2 */
    public final InterfaceC0184l m10019O2() {
        return this.f7347J;
    }

    @Override // p118i0.InterfaceC3107i
    /* JADX INFO: renamed from: P0 */
    public C1964c mo10003P0() {
        return m10018N2();
    }

    /* JADX INFO: renamed from: P2 */
    public final InterfaceC0184l m10020P2() {
        return this.f7346I;
    }

    /* JADX INFO: renamed from: Q2 */
    public final AbstractC2816q m10021Q2() {
        return this.f7345H;
    }

    /* JADX INFO: renamed from: R2 */
    public final void m10022R2() {
        InterfaceC2198w1 interfaceC2198w1 = this.f7349L;
        if (interfaceC2198w1 == null) {
            return;
        }
        InterfaceC2198w1.a.m7920a(interfaceC2198w1, null, 1, null);
        this.f7349L = null;
    }

    /* JADX INFO: renamed from: S2 */
    public final void m10023S2(InterfaceC0184l interfaceC0184l) {
        this.f7348K = interfaceC0184l;
    }

    /* JADX INFO: renamed from: T2 */
    public final void m10024T2(InterfaceC0184l interfaceC0184l) {
        this.f7347J = interfaceC0184l;
    }

    /* JADX INFO: renamed from: U2 */
    public final void m10025U2(InterfaceC0184l interfaceC0184l) {
        this.f7346I = interfaceC0184l;
    }

    /* JADX INFO: renamed from: V2 */
    public final void m10026V2(AbstractC2816q abstractC2816q) {
        this.f7345H = abstractC2816q;
    }

    /* JADX INFO: renamed from: W2 */
    public final void m10027W2() {
        InterfaceC3108j interfaceC3108j;
        if (m17461m2()) {
            InterfaceC2198w1 interfaceC2198w1 = this.f7349L;
            if ((interfaceC2198w1 == null || !interfaceC2198w1.mo7586c()) && (interfaceC3108j = (InterfaceC3108j) AbstractC4549i.m17816a(this, AbstractC3111m.m11644d())) != null) {
                this.f7349L = AbstractC2148k.m7817d(m17455f2(), null, EnumC2173q0.f6001t, new a(interfaceC3108j, null), 1, null);
            }
        }
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        super.mo1377p2();
        this.f7345H.m10031d(this);
    }

    @Override // p118i0.InterfaceC3107i
    /* JADX INFO: renamed from: q0 */
    public C6457g mo10004q0(InterfaceC3578w interfaceC3578w) {
        if (!m17461m2()) {
            return this.f7351N;
        }
        C6457g c6457g = (C6457g) this.f7348K.mo27m(interfaceC3578w);
        if (c6457g == null) {
            return this.f7351N;
        }
        this.f7351N = c6457g;
        return c6457g;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        this.f7345H.m10031d(null);
        super.mo1378q2();
    }
}
