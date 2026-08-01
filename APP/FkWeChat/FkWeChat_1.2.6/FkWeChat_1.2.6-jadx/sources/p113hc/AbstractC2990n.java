package p113hc;

import p010a9.InterfaceC0188p;
import p024b9.C1042j0;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: hc.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2990n {

    /* JADX INFO: renamed from: hc.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2972c {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC2972c f7879q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0188p f7880r;

        public a(InterfaceC2972c interfaceC2972c, InterfaceC0188p interfaceC0188p) {
            this.f7879q = interfaceC2972c;
            this.f7880r = interfaceC0188p;
        }

        @Override // p113hc.InterfaceC2972c
        /* JADX INFO: renamed from: b */
        public Object mo399b(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
            Object objMo399b = this.f7879q.mo399b(new b(new C1042j0(), interfaceC2974d, this.f7880r), interfaceC5976f);
            return objMo399b == AbstractC6325c.m24992g() ? objMo399b : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: hc.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC2974d {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C1042j0 f7881q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC2974d f7882r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0188p f7883s;

        /* JADX INFO: renamed from: hc.n$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6535d {

            /* JADX INFO: renamed from: q */
            public Object f7884q;

            /* JADX INFO: renamed from: r */
            public Object f7885r;

            /* JADX INFO: renamed from: s */
            public /* synthetic */ Object f7886s;

            /* JADX INFO: renamed from: u */
            public int f7888u;

            public a(InterfaceC5976f interfaceC5976f) {
                super(interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) {
                this.f7886s = obj;
                this.f7888u |= Integer.MIN_VALUE;
                return b.this.mo400a(null, this);
            }
        }

        public b(C1042j0 c1042j0, InterfaceC2974d interfaceC2974d, InterfaceC0188p interfaceC0188p) {
            this.f7881q = c1042j0;
            this.f7882r = interfaceC2974d;
            this.f7883s = interfaceC0188p;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (r8.mo400a(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        
            if (r8.mo400a(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p113hc.InterfaceC2974d
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo400a(java.lang.Object r7, p228p8.InterfaceC5976f r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p113hc.AbstractC2990n.b.a
                if (r0 == 0) goto L13
                r0 = r8
                hc.n$b$a r0 = (p113hc.AbstractC2990n.b.a) r0
                int r1 = r0.f7888u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7888u = r1
                goto L18
            L13:
                hc.n$b$a r0 = new hc.n$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f7886s
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r0.f7888u
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L44
                if (r2 == r5) goto L40
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2f
                p172l8.AbstractC4713t.m18808b(r8)
                goto L87
            L2f:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r7)
                r7 = 0
                return r7
            L36:
                java.lang.Object r7 = r0.f7885r
                java.lang.Object r2 = r0.f7884q
                hc.n$b r2 = (p113hc.AbstractC2990n.b) r2
                p172l8.AbstractC4713t.m18808b(r8)
                goto L6b
            L40:
                p172l8.AbstractC4713t.m18808b(r8)
                goto L58
            L44:
                p172l8.AbstractC4713t.m18808b(r8)
                b9.j0 r8 = r6.f7881q
                boolean r8 = r8.f3202q
                if (r8 == 0) goto L5b
                hc.d r8 = r6.f7882r
                r0.f7888u = r5
                java.lang.Object r7 = r8.mo400a(r7, r0)
                if (r7 != r1) goto L58
                goto L86
            L58:
                l8.i0 r7 = p172l8.C4700i0.f13910a
                return r7
            L5b:
                a9.p r8 = r6.f7883s
                r0.f7884q = r6
                r0.f7885r = r7
                r0.f7888u = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6a
                goto L86
            L6a:
                r2 = r6
            L6b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8a
                b9.j0 r8 = r2.f7881q
                r8.f3202q = r5
                hc.d r8 = r2.f7882r
                r2 = 0
                r0.f7884q = r2
                r0.f7885r = r2
                r0.f7888u = r3
                java.lang.Object r7 = r8.mo400a(r7, r0)
                if (r7 != r1) goto L87
            L86:
                return r1
            L87:
                l8.i0 r7 = p172l8.C4700i0.f13910a
                return r7
            L8a:
                l8.i0 r7 = p172l8.C4700i0.f13910a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2990n.b.mo400a(java.lang.Object, p8.f):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hc.n$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC2972c {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC2972c f7889q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0188p f7890r;

        /* JADX INFO: renamed from: hc.n$c$a */
        public static final class a extends AbstractC6535d {

            /* JADX INFO: renamed from: q */
            public /* synthetic */ Object f7891q;

            /* JADX INFO: renamed from: r */
            public int f7892r;

            /* JADX INFO: renamed from: t */
            public Object f7894t;

            public a(InterfaceC5976f interfaceC5976f) {
                super(interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) {
                this.f7891q = obj;
                this.f7892r |= Integer.MIN_VALUE;
                return c.this.mo399b(null, this);
            }
        }

        public c(InterfaceC2972c interfaceC2972c, InterfaceC0188p interfaceC0188p) {
            this.f7889q = interfaceC2972c;
            this.f7890r = interfaceC0188p;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p113hc.InterfaceC2972c
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo399b(p113hc.InterfaceC2974d r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p113hc.AbstractC2990n.c.a
                if (r0 == 0) goto L13
                r0 = r7
                hc.n$c$a r0 = (p113hc.AbstractC2990n.c.a) r0
                int r1 = r0.f7892r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7892r = r1
                goto L18
            L13:
                hc.n$c$a r0 = new hc.n$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f7891q
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r0.f7892r
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f7894t
                hc.n$d r6 = (p113hc.AbstractC2990n.d) r6
                p172l8.AbstractC4713t.m18808b(r7)     // Catch: p130ic.C3383a -> L2d
                goto L59
            L2d:
                r7 = move-exception
                goto L4f
            L2f:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r6)
                r6 = 0
                return r6
            L36:
                p172l8.AbstractC4713t.m18808b(r7)
                hc.c r7 = r5.f7889q
                hc.n$d r2 = new hc.n$d
                a9.p r4 = r5.f7890r
                r2.<init>(r4, r6)
                r0.f7894t = r2     // Catch: p130ic.C3383a -> L4d
                r0.f7892r = r3     // Catch: p130ic.C3383a -> L4d
                java.lang.Object r6 = r7.mo399b(r2, r0)     // Catch: p130ic.C3383a -> L4d
                if (r6 != r1) goto L59
                return r1
            L4d:
                r7 = move-exception
                r6 = r2
            L4f:
                p130ic.AbstractC3394l.m12743a(r7, r6)
                p8.j r6 = r0.getContext()
                ec.AbstractC2210z1.m7959l(r6)
            L59:
                l8.i0 r6 = p172l8.C4700i0.f13910a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2990n.c.mo399b(hc.d, p8.f):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hc.n$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements InterfaceC2974d {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0188p f7895q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC2974d f7896r;

        /* JADX INFO: renamed from: hc.n$d$a */
        public static final class a extends AbstractC6535d {

            /* JADX INFO: renamed from: q */
            public Object f7897q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ Object f7898r;

            /* JADX INFO: renamed from: s */
            public int f7899s;

            /* JADX INFO: renamed from: u */
            public Object f7901u;

            public a(InterfaceC5976f interfaceC5976f) {
                super(interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) {
                this.f7898r = obj;
                this.f7899s |= Integer.MIN_VALUE;
                return d.this.mo400a(null, this);
            }
        }

        public d(InterfaceC0188p interfaceC0188p, InterfaceC2974d interfaceC2974d) {
            this.f7895q = interfaceC0188p;
            this.f7896r = interfaceC2974d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            if (r2.mo400a(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p113hc.InterfaceC2974d
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo400a(java.lang.Object r8, p228p8.InterfaceC5976f r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p113hc.AbstractC2990n.d.a
                if (r0 == 0) goto L13
                r0 = r9
                hc.n$d$a r0 = (p113hc.AbstractC2990n.d.a) r0
                int r1 = r0.f7899s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7899s = r1
                goto L18
            L13:
                hc.n$d$a r0 = new hc.n$d$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f7898r
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r0.f7899s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L45
                if (r2 == r4) goto L37
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f7897q
                hc.n$d r8 = (p113hc.AbstractC2990n.d) r8
                p172l8.AbstractC4713t.m18808b(r9)
                goto L7b
            L30:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r8)
                r8 = 0
                return r8
            L37:
                java.lang.Object r8 = r0.f7901u
                java.lang.Object r2 = r0.f7897q
                hc.n$d r2 = (p113hc.AbstractC2990n.d) r2
                p172l8.AbstractC4713t.m18808b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L62
            L45:
                p172l8.AbstractC4713t.m18808b(r9)
                a9.p r9 = r7.f7895q
                r0.f7897q = r7
                r0.f7901u = r8
                r0.f7899s = r4
                r2 = 6
                p024b9.AbstractC1057r.m3835c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                p024b9.AbstractC1057r.m3835c(r2)
                if (r9 != r1) goto L5f
                goto L79
            L5f:
                r2 = r9
                r9 = r8
                r8 = r7
            L62:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7a
                hc.d r2 = r8.f7896r
                r0.f7897q = r8
                r5 = 0
                r0.f7901u = r5
                r0.f7899s = r3
                java.lang.Object r9 = r2.mo400a(r9, r0)
                if (r9 != r1) goto L7b
            L79:
                return r1
            L7a:
                r4 = 0
            L7b:
                if (r4 == 0) goto L80
                l8.i0 r8 = p172l8.C4700i0.f13910a
                return r8
            L80:
                ic.a r9 = new ic.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2990n.d.mo400a(java.lang.Object, p8.f):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2972c m11036a(InterfaceC2972c interfaceC2972c, InterfaceC0188p interfaceC0188p) {
        return new a(interfaceC2972c, interfaceC0188p);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2972c m11037b(InterfaceC2972c interfaceC2972c, InterfaceC0188p interfaceC0188p) {
        return new c(interfaceC2972c, interfaceC0188p);
    }
}
