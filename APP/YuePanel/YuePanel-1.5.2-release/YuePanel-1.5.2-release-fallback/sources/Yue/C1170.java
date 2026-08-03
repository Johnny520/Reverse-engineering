package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1170 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1170.C1171 f3653 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.reflect.Method f3654;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.reflect.Method f3655;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.reflect.Method f3656;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۨۦ$ۥ, reason: contains not printable characters */
    public static final class C1171 {
        public C1171() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1171(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C1170 m6113() {
                r5 = this;
                r0 = 0
                java.lang.String r1 = "dalvik.system.CloseGuard"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L22
                java.lang.String r2 = "get"
                java.lang.reflect.Method r2 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L22
                java.lang.String r3 = "open"
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L22
                java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.Exception -> L22
                java.lang.String r4 = "warnIfOpen"
                java.lang.reflect.Method r0 = r1.getMethod(r4, r0)     // Catch: java.lang.Exception -> L22
                r1 = r0
                r0 = r2
                goto L24
            L22:
                r1 = r0
                r3 = r1
            L24:
                Yue.ۥ۟ۤۨۦ r2 = new Yue.ۥ۟ۤۨۦ
                r2.<init>(r0, r3, r1)
                return r2
        }
    }

    static {
            Yue.ۥ۟ۤۨۦ$ۥ r0 = new Yue.ۥ۟ۤۨۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C1170.f3653 = r0
            return
    }

    public C1170(@Yue.InterfaceC4543 java.lang.reflect.Method r1, @Yue.InterfaceC4543 java.lang.reflect.Method r2, @Yue.InterfaceC4543 java.lang.reflect.Method r3) {
            r0 = this;
            r0.<init>()
            r0.f3654 = r1
            r0.f3655 = r2
            r0.f3656 = r3
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m6111(@Yue.InterfaceC4418 java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "closer"
            Yue.C3329.m13906(r4, r0)
            java.lang.reflect.Method r0 = r3.f3654
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Exception -> L1b
            java.lang.reflect.Method r2 = r3.f3655     // Catch: java.lang.Exception -> L1b
            Yue.C3329.m13903(r2)     // Catch: java.lang.Exception -> L1b
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L1b
            r2.invoke(r0, r4)     // Catch: java.lang.Exception -> L1b
            return r0
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m6112(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            java.lang.reflect.Method r0 = r2.f3656     // Catch: java.lang.Exception -> Ld
            Yue.C3329.m13903(r0)     // Catch: java.lang.Exception -> Ld
            r1 = 0
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            return r3
    }
}
