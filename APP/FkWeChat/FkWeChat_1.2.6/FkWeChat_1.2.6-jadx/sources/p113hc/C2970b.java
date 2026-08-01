package p113hc;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.C1050n0;
import p130ic.AbstractC3398p;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: hc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2970b implements InterfaceC2972c {

    /* JADX INFO: renamed from: q */
    public final InterfaceC2972c f7822q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0184l f7823r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0188p f7824s;

    /* JADX INFO: renamed from: hc.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2974d {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f7826r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC2974d f7827s;

        /* JADX INFO: renamed from: hc.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10098a extends AbstractC6535d {

            /* JADX INFO: renamed from: q */
            public /* synthetic */ Object f7828q;

            /* JADX INFO: renamed from: s */
            public int f7830s;

            public C10098a(InterfaceC5976f interfaceC5976f) {
                super(interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) {
                this.f7828q = obj;
                this.f7830s |= Integer.MIN_VALUE;
                return a.this.mo400a(null, this);
            }
        }

        public a(C1050n0 c1050n0, InterfaceC2974d interfaceC2974d) {
            this.f7826r = c1050n0;
            this.f7827s = interfaceC2974d;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p113hc.InterfaceC2974d
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo400a(java.lang.Object r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p113hc.C2970b.a.C10098a
                if (r0 == 0) goto L13
                r0 = r7
                hc.b$a$a r0 = (p113hc.C2970b.a.C10098a) r0
                int r1 = r0.f7830s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7830s = r1
                goto L18
            L13:
                hc.b$a$a r0 = new hc.b$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f7828q
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r0.f7830s
                r3 = 1
                if (r2 == 0) goto L30
                if (r2 != r3) goto L29
                p172l8.AbstractC4713t.m18808b(r7)
                goto L66
            L29:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r6)
                r6 = 0
                return r6
            L30:
                p172l8.AbstractC4713t.m18808b(r7)
                hc.b r7 = p113hc.C2970b.this
                a9.l r7 = r7.f7823r
                java.lang.Object r7 = r7.mo27m(r6)
                b9.n0 r2 = r5.f7826r
                java.lang.Object r2 = r2.f3208q
                jc.d0 r4 = p130ic.AbstractC3398p.f9379a
                if (r2 == r4) goto L57
                hc.b r4 = p113hc.C2970b.this
                a9.p r4 = r4.f7824s
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L54
                goto L57
            L54:
                l8.i0 r6 = p172l8.C4700i0.f13910a
                return r6
            L57:
                b9.n0 r2 = r5.f7826r
                r2.f3208q = r7
                hc.d r7 = r5.f7827s
                r0.f7830s = r3
                java.lang.Object r6 = r7.mo400a(r6, r0)
                if (r6 != r1) goto L66
                return r1
            L66:
                l8.i0 r6 = p172l8.C4700i0.f13910a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p113hc.C2970b.a.mo400a(java.lang.Object, p8.f):java.lang.Object");
        }
    }

    public C2970b(InterfaceC2972c interfaceC2972c, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p) {
        this.f7822q = interfaceC2972c;
        this.f7823r = interfaceC0184l;
        this.f7824s = interfaceC0188p;
    }

    @Override // p113hc.InterfaceC2972c
    /* JADX INFO: renamed from: b */
    public Object mo399b(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        C1050n0 c1050n0 = new C1050n0();
        c1050n0.f3208q = AbstractC3398p.f9379a;
        Object objMo399b = this.f7822q.mo399b(new a(c1050n0, interfaceC2974d), interfaceC5976f);
        return objMo399b == AbstractC6325c.m24992g() ? objMo399b : C4700i0.f13910a;
    }
}
