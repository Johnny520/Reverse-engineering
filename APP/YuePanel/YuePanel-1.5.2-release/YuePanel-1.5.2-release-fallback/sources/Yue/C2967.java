package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2967 {

    @Yue.InterfaceC4543
    private static volatile android.view.Choreographer choreographer = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final long f9600 = 4611686018427387903L;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public static final Yue.AbstractC2965 f9601 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۡ$ۥ, reason: contains not printable characters */
    public static final class RunnableC2968 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC0932 f9602;

        public RunnableC2968(Yue.InterfaceC0932 r1) {
                r0 = this;
                r0.f9602 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                Yue.ۥۣ۟ۨ۟ r0 = r1.f9602
                Yue.C2967.m12595(r0)
                return
        }
    }

    static {
            r0 = 0
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L17
            Yue.ۥ۠ۤ۠ۦ r1 = new Yue.ۥ۠ۤ۠ۦ     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            r3 = 1
            android.os.Handler r2 = m12596(r2, r3)     // Catch: java.lang.Throwable -> L17
            r3 = 2
            r1.<init>(r2, r0, r3, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r1 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029
            java.lang.Object r1 = Yue.C5391.m20390(r1)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L22:
            boolean r2 = Yue.C5388.m20384(r1)
            if (r2 == 0) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            Yue.ۥ۠ۤ۠ۧ r0 = (Yue.AbstractC2965) r0
            Yue.C2967.f9601 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m12593(Yue.InterfaceC0932 r0, long r1) {
            m12603(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ void m12594(android.view.Choreographer r0, Yue.InterfaceC0932 r1) {
            m12602(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ void m12595(Yue.InterfaceC0932 r0) {
            m12604(r0)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final android.os.Handler m12596(@Yue.InterfaceC4418 android.os.Looper r4, boolean r5) {
            if (r5 == 0) goto L4b
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r1 = 0
            java.lang.Class<android.os.Looper> r2 = android.os.Looper.class
            java.lang.Class<android.os.Handler> r3 = android.os.Handler.class
            if (r5 < r0) goto L2c
            java.lang.String r5 = "createAsync"
            java.lang.Class[] r0 = new java.lang.Class[]{r2}
            java.lang.reflect.Method r5 = r3.getDeclaredMethod(r5, r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object r4 = r5.invoke(r1, r4)
            if (r4 == 0) goto L24
            android.os.Handler r4 = (android.os.Handler) r4
            return r4
        L24:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type android.os.Handler"
            r4.<init>(r5)
            throw r4
        L2c:
            java.lang.Class<android.os.Handler$Callback> r5 = android.os.Handler.Callback.class
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L45
            java.lang.Class[] r5 = new java.lang.Class[]{r2, r5, r0}     // Catch: java.lang.NoSuchMethodException -> L45
            java.lang.reflect.Constructor r5 = r3.getDeclaredConstructor(r5)     // Catch: java.lang.NoSuchMethodException -> L45
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1, r0}
            java.lang.Object r4 = r5.newInstance(r4)
            android.os.Handler r4 = (android.os.Handler) r4
            return r4
        L45:
            android.os.Handler r5 = new android.os.Handler
            r5.<init>(r4)
            return r5
        L4b:
            android.os.Handler r5 = new android.os.Handler
            r5.<init>(r4)
            return r5
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.Object m12597(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.lang.Long> r4) {
            android.view.Choreographer r0 = Yue.C2967.choreographer
            r1 = 1
            if (r0 == 0) goto L22
            Yue.ۥۣ۟ۨ۠ r2 = new Yue.ۥۣ۟ۨ۠
            Yue.ۥ۟ۧۤۢ r3 = Yue.C3332.m13940(r4)
            r2.<init>(r3, r1)
            r2.mo5307()
            m12594(r0, r2)
            java.lang.Object r0 = r2.m5329()
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto L21
            Yue.C1757.m8349(r4)
        L21:
            return r0
        L22:
            Yue.ۥۣ۟ۨ۠ r0 = new Yue.ۥۣ۟ۨ۠
            Yue.ۥ۟ۧۤۢ r2 = Yue.C3332.m13940(r4)
            r0.<init>(r2, r1)
            r0.mo5307()
            Yue.ۥ۠ۨۥۥ r1 = Yue.C1878.m8793()
            Yue.ۥ۠۠ۧۦ r2 = Yue.C2141.f6728
            Yue.ۥ۠ۤۡ$ۥ r3 = new Yue.ۥ۠ۤۡ$ۥ
            r3.<init>(r0)
            r1.dispatch(r2, r3)
            java.lang.Object r0 = r0.m5329()
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto L49
            Yue.C1757.m8349(r4)
        L49:
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    @Yue.InterfaceC3421(name = "from")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.AbstractC2965 m12598(@Yue.InterfaceC4418 android.os.Handler r2) {
            r0 = 0
            r1 = 1
            Yue.ۥ۠ۤ۠ۧ r2 = m12600(r2, r0, r1, r0)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    @Yue.InterfaceC3421(name = "from")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Yue.AbstractC2965 m12599(@Yue.InterfaceC4418 android.os.Handler r1, @Yue.InterfaceC4543 java.lang.String r2) {
            Yue.ۥ۠ۤ۠ۦ r0 = new Yue.ۥ۠ۤ۠ۦ
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ Yue.AbstractC2965 m12600(android.os.Handler r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            Yue.ۥ۠ۤ۠ۧ r0 = m12599(r0, r1)
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Use Dispatchers.Main instead")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m12601() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m12602(android.view.Choreographer r1, Yue.InterfaceC0932<? super java.lang.Long> r2) {
            Yue.ۥ۠ۤ۠ۨ r0 = new Yue.ۥ۠ۤ۠ۨ
            r0.<init>(r2)
            r1.postFrameCallback(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m12603(Yue.InterfaceC0932 r1, long r2) {
            Yue.ۥ۠ۨۥۥ r0 = Yue.C1878.m8793()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.mo5303(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m12604(Yue.InterfaceC0932<? super java.lang.Long> r1) {
            android.view.Choreographer r0 = Yue.C2967.choreographer
            if (r0 != 0) goto Ld
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            Yue.C3329.m13903(r0)
            Yue.C2967.choreographer = r0
        Ld:
            m12602(r0, r1)
            return
    }
}
