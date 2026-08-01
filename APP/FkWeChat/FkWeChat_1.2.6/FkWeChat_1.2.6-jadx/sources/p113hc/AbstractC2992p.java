package p113hc;

import p010a9.InterfaceC0188p;
import p024b9.C1050n0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: hc.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2992p {

    /* JADX INFO: renamed from: hc.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2974d {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0188p f7907q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f7908r;

        /* JADX INFO: renamed from: hc.p$a$a, reason: collision with other inner class name */
        public static final class C10102a extends AbstractC6535d {

            /* JADX INFO: renamed from: q */
            public Object f7909q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ Object f7910r;

            /* JADX INFO: renamed from: s */
            public int f7911s;

            /* JADX INFO: renamed from: u */
            public Object f7913u;

            public C10102a(InterfaceC5976f interfaceC5976f) {
                super(interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) {
                this.f7910r = obj;
                this.f7911s |= Integer.MIN_VALUE;
                return a.this.mo400a(null, this);
            }
        }

        public a(InterfaceC0188p interfaceC0188p, C1050n0 c1050n0) {
            this.f7907q = interfaceC0188p;
            this.f7908r = c1050n0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p113hc.InterfaceC2974d
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo400a(java.lang.Object r5, p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p113hc.AbstractC2992p.a.C10102a
                if (r0 == 0) goto L13
                r0 = r6
                hc.p$a$a r0 = (p113hc.AbstractC2992p.a.C10102a) r0
                int r1 = r0.f7911s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7911s = r1
                goto L18
            L13:
                hc.p$a$a r0 = new hc.p$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f7910r
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r0.f7911s
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f7913u
                java.lang.Object r0 = r0.f7909q
                hc.p$a r0 = (p113hc.AbstractC2992p.a) r0
                p172l8.AbstractC4713t.m18808b(r6)
                goto L51
            L2f:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r5)
                r5 = 0
                return r5
            L36:
                p172l8.AbstractC4713t.m18808b(r6)
                a9.p r6 = r4.f7907q
                r0.f7909q = r4
                r0.f7913u = r5
                r0.f7911s = r3
                r2 = 6
                p024b9.AbstractC1057r.m3835c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                p024b9.AbstractC1057r.m3835c(r0)
                if (r6 != r1) goto L50
                return r1
            L50:
                r0 = r4
            L51:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5c
                l8.i0 r5 = p172l8.C4700i0.f13910a
                return r5
            L5c:
                b9.n0 r6 = r0.f7908r
                r6.f3208q = r5
                ic.a r5 = new ic.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2992p.a.mo400a(java.lang.Object, p8.f):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hc.p$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f7914q;

        /* JADX INFO: renamed from: r */
        public Object f7915r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f7916s;

        /* JADX INFO: renamed from: t */
        public int f7917t;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f7916s = obj;
            this.f7917t |= Integer.MIN_VALUE;
            return AbstractC2976e.m10984l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: hc.p$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC2974d {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0188p f7918q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f7919r;

        /* JADX INFO: renamed from: hc.p$c$a */
        public static final class a extends AbstractC6535d {

            /* JADX INFO: renamed from: q */
            public Object f7920q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ Object f7921r;

            /* JADX INFO: renamed from: s */
            public int f7922s;

            /* JADX INFO: renamed from: u */
            public Object f7924u;

            public a(InterfaceC5976f interfaceC5976f) {
                super(interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) {
                this.f7921r = obj;
                this.f7922s |= Integer.MIN_VALUE;
                return c.this.mo400a(null, this);
            }
        }

        public c(InterfaceC0188p interfaceC0188p, C1050n0 c1050n0) {
            this.f7918q = interfaceC0188p;
            this.f7919r = c1050n0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p113hc.InterfaceC2974d
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo400a(java.lang.Object r5, p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p113hc.AbstractC2992p.c.a
                if (r0 == 0) goto L13
                r0 = r6
                hc.p$c$a r0 = (p113hc.AbstractC2992p.c.a) r0
                int r1 = r0.f7922s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7922s = r1
                goto L18
            L13:
                hc.p$c$a r0 = new hc.p$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f7921r
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r0.f7922s
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f7924u
                java.lang.Object r0 = r0.f7920q
                hc.p$c r0 = (p113hc.AbstractC2992p.c) r0
                p172l8.AbstractC4713t.m18808b(r6)
                goto L51
            L2f:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r5)
                r5 = 0
                return r5
            L36:
                p172l8.AbstractC4713t.m18808b(r6)
                a9.p r6 = r4.f7918q
                r0.f7920q = r4
                r0.f7924u = r5
                r0.f7922s = r3
                r2 = 6
                p024b9.AbstractC1057r.m3835c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                p024b9.AbstractC1057r.m3835c(r0)
                if (r6 != r1) goto L50
                return r1
            L50:
                r0 = r4
            L51:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5c
                l8.i0 r5 = p172l8.C4700i0.f13910a
                return r5
            L5c:
                b9.n0 r6 = r0.f7919r
                r6.f3208q = r5
                ic.a r5 = new ic.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2992p.c.mo400a(java.lang.Object, p8.f):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hc.p$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f7925q;

        /* JADX INFO: renamed from: r */
        public Object f7926r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f7927s;

        /* JADX INFO: renamed from: t */
        public int f7928t;

        public d(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f7927s = obj;
            this.f7928t |= Integer.MIN_VALUE;
            return AbstractC2976e.m10985m(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11041a(p113hc.InterfaceC2972c r4, p010a9.InterfaceC0188p r5, p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof p113hc.AbstractC2992p.b
            if (r0 == 0) goto L13
            r0 = r6
            hc.p$b r0 = (p113hc.AbstractC2992p.b) r0
            int r1 = r0.f7917t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7917t = r1
            goto L18
        L13:
            hc.p$b r0 = new hc.p$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7916s
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f7917t
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f7915r
            hc.p$a r4 = (p113hc.AbstractC2992p.a) r4
            java.lang.Object r5 = r0.f7914q
            b9.n0 r5 = (p024b9.C1050n0) r5
            p172l8.AbstractC4713t.m18808b(r6)     // Catch: p130ic.C3383a -> L31
            goto L68
        L31:
            r6 = move-exception
            goto L5e
        L33:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r4)
            r4 = 0
            return r4
        L3a:
            p172l8.AbstractC4713t.m18808b(r6)
            b9.n0 r6 = new b9.n0
            r6.<init>()
            jc.d0 r2 = p130ic.AbstractC3398p.f9379a
            r6.f3208q = r2
            hc.p$a r2 = new hc.p$a
            r2.<init>(r5, r6)
            r0.f7914q = r6     // Catch: p130ic.C3383a -> L5a
            r0.f7915r = r2     // Catch: p130ic.C3383a -> L5a
            r0.f7917t = r3     // Catch: p130ic.C3383a -> L5a
            java.lang.Object r4 = r4.mo399b(r2, r0)     // Catch: p130ic.C3383a -> L5a
            if (r4 != r1) goto L58
            return r1
        L58:
            r5 = r6
            goto L68
        L5a:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5e:
            p130ic.AbstractC3394l.m12743a(r6, r4)
            p8.j r4 = r0.getContext()
            ec.AbstractC2210z1.m7959l(r4)
        L68:
            java.lang.Object r4 = r5.f3208q
            jc.d0 r5 = p130ic.AbstractC3398p.f9379a
            if (r4 == r5) goto L6f
            return r4
        L6f:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2992p.m11041a(hc.c, a9.p, p8.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11042b(p113hc.InterfaceC2972c r4, p010a9.InterfaceC0188p r5, p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof p113hc.AbstractC2992p.d
            if (r0 == 0) goto L13
            r0 = r6
            hc.p$d r0 = (p113hc.AbstractC2992p.d) r0
            int r1 = r0.f7928t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7928t = r1
            goto L18
        L13:
            hc.p$d r0 = new hc.p$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7927s
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f7928t
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f7926r
            hc.p$c r4 = (p113hc.AbstractC2992p.c) r4
            java.lang.Object r5 = r0.f7925q
            b9.n0 r5 = (p024b9.C1050n0) r5
            p172l8.AbstractC4713t.m18808b(r6)     // Catch: p130ic.C3383a -> L31
            goto L64
        L31:
            r6 = move-exception
            goto L5a
        L33:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r4)
            r4 = 0
            return r4
        L3a:
            p172l8.AbstractC4713t.m18808b(r6)
            b9.n0 r6 = new b9.n0
            r6.<init>()
            hc.p$c r2 = new hc.p$c
            r2.<init>(r5, r6)
            r0.f7925q = r6     // Catch: p130ic.C3383a -> L56
            r0.f7926r = r2     // Catch: p130ic.C3383a -> L56
            r0.f7928t = r3     // Catch: p130ic.C3383a -> L56
            java.lang.Object r4 = r4.mo399b(r2, r0)     // Catch: p130ic.C3383a -> L56
            if (r4 != r1) goto L54
            return r1
        L54:
            r5 = r6
            goto L64
        L56:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5a:
            p130ic.AbstractC3394l.m12743a(r6, r4)
            p8.j r4 = r0.getContext()
            ec.AbstractC2210z1.m7959l(r4)
        L64:
            java.lang.Object r4 = r5.f3208q
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2992p.m11042b(hc.c, a9.p, p8.f):java.lang.Object");
    }
}
