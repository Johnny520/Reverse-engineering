package p189n;

import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p073f2.AbstractC2269u;
import p073f2.C2261q;
import p073f2.EnumC2265s;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4598w1;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.C6429e;
import p248r.C6430f;
import p248r.InterfaceC6434j;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: n.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5219g1 extends InterfaceC4507m.c implements InterfaceC4598w1 {

    /* JADX INFO: renamed from: F */
    public InterfaceC6434j f16021F;

    /* JADX INFO: renamed from: G */
    public C6429e f16022G;

    /* JADX INFO: renamed from: n.g1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f16023q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f16024r;

        /* JADX INFO: renamed from: t */
        public int f16026t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f16024r = obj;
            this.f16026t |= Integer.MIN_VALUE;
            return C5219g1.this.m21401I2(this);
        }
    }

    /* JADX INFO: renamed from: n.g1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f16027q;

        /* JADX INFO: renamed from: s */
        public int f16029s;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f16027q = obj;
            this.f16029s |= Integer.MIN_VALUE;
            return C5219g1.this.m21402J2(this);
        }
    }

    /* JADX INFO: renamed from: n.g1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f16030q;

        public c(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C5219g1.this.new c(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f16030q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C5219g1 c5219g1 = C5219g1.this;
                this.f16030q = 1;
                if (c5219g1.m21401I2(this) == objM24992g) {
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

    /* JADX INFO: renamed from: n.g1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f16032q;

        public d(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C5219g1.this.new d(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((d) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f16032q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C5219g1 c5219g1 = C5219g1.this;
                this.f16032q = 1;
                if (c5219g1.m21402J2(this) == objM24992g) {
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

    public C5219g1(InterfaceC6434j interfaceC6434j) {
        this.f16021F = interfaceC6434j;
    }

    @Override // p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: A0 */
    public void mo8047A0(C2261q c2261q, EnumC2265s enumC2265s, long j10) {
        if (enumC2265s == EnumC2265s.f6226r) {
            int iM8220g = c2261q.m8220g();
            AbstractC2269u.a aVar = AbstractC2269u.f6230a;
            if (AbstractC2269u.m8264i(iM8220g, aVar.m8265a())) {
                AbstractC2148k.m7817d(m17455f2(), null, null, new c(null), 3, null);
            } else if (AbstractC2269u.m8264i(iM8220g, aVar.m8266b())) {
                AbstractC2148k.m7817d(m17455f2(), null, null, new d(null), 3, null);
            }
        }
    }

    @Override // p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: G0 */
    public void mo8048G0() {
        m21403K2();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: I2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m21401I2(p228p8.InterfaceC5976f r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p189n.C5219g1.a
            if (r0 == 0) goto L13
            r0 = r5
            n.g1$a r0 = (p189n.C5219g1.a) r0
            int r1 = r0.f16026t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16026t = r1
            goto L18
        L13:
            n.g1$a r0 = new n.g1$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16024r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f16026t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f16023q
            r.e r0 = (p248r.C6429e) r0
            p172l8.AbstractC4713t.m18808b(r5)
            goto L4e
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L34:
            p172l8.AbstractC4713t.m18808b(r5)
            r.e r5 = r4.f16022G
            if (r5 != 0) goto L50
            r.e r5 = new r.e
            r5.<init>()
            r.j r2 = r4.f16021F
            r0.f16023q = r5
            r0.f16026t = r3
            java.lang.Object r0 = r2.mo25464b(r5, r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r5
        L4e:
            r4.f16022G = r0
        L50:
            l8.i0 r5 = p172l8.C4700i0.f13910a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p189n.C5219g1.m21401I2(p8.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: J2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m21402J2(p228p8.InterfaceC5976f r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p189n.C5219g1.b
            if (r0 == 0) goto L13
            r0 = r5
            n.g1$b r0 = (p189n.C5219g1.b) r0
            int r1 = r0.f16029s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16029s = r1
            goto L18
        L13:
            n.g1$b r0 = new n.g1$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16027q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f16029s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p172l8.AbstractC4713t.m18808b(r5)
            goto L47
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L30:
            p172l8.AbstractC4713t.m18808b(r5)
            r.e r5 = r4.f16022G
            if (r5 == 0) goto L4a
            r.f r2 = new r.f
            r2.<init>(r5)
            r.j r5 = r4.f16021F
            r0.f16029s = r3
            java.lang.Object r5 = r5.mo25464b(r2, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5 = 0
            r4.f16022G = r5
        L4a:
            l8.i0 r5 = p172l8.C4700i0.f13910a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p189n.C5219g1.m21402J2(p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: K2 */
    public final void m21403K2() {
        C6429e c6429e = this.f16022G;
        if (c6429e != null) {
            this.f16021F.mo25465c(new C6430f(c6429e));
            this.f16022G = null;
        }
    }

    /* JADX INFO: renamed from: L2 */
    public final void m21404L2(InterfaceC6434j interfaceC6434j) {
        if (AbstractC1061t.m3842c(this.f16021F, interfaceC6434j)) {
            return;
        }
        m21403K2();
        this.f16021F = interfaceC6434j;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        m21403K2();
    }
}
