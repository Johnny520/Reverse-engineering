package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bl {
    private static java.util.concurrent.ScheduledThreadPoolExecutor a = null;
    private static final long b = 30000;
    private static long c = 0;
    private static java.util.Map<java.lang.String, java.lang.Object> d = null;
    private static final long e = 2;
    private static volatile com.tendcloud.tenddata.bl f;
    private static boolean g;
    private static boolean h;



    public static class a implements java.lang.Runnable {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(com.tendcloud.tenddata.bl.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL     // Catch: java.lang.Throwable -> L5b
                android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L5b
                java.lang.String r2 = "android.permission.READ_PHONE_STATE"
                boolean r1 = com.tendcloud.tenddata.y.b(r1, r2)     // Catch: java.lang.Throwable -> L5b
                java.lang.String r2 = "duration"
                java.lang.String r3 = "isGetIMEI"
                if (r1 == 0) goto L31
                java.util.Map r1 = com.tendcloud.tenddata.bl.c()     // Catch: java.lang.Throwable -> L5b
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5b
                r1.put(r3, r4)     // Catch: java.lang.Throwable -> L5b
                java.util.Map r1 = com.tendcloud.tenddata.bl.c()     // Catch: java.lang.Throwable -> L5b
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
                long r5 = com.tendcloud.tenddata.bl.d()     // Catch: java.lang.Throwable -> L5b
                long r3 = r3 - r5
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L5b
            L2a:
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L5b
                com.tendcloud.tenddata.bl.c(r0)     // Catch: java.lang.Throwable -> L5b
                goto L5b
            L31:
                long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
                long r6 = com.tendcloud.tenddata.i.d(r0)     // Catch: java.lang.Throwable -> L5b
                long r4 = r4 - r6
                r6 = 30000(0x7530, double:1.4822E-319)
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 < 0) goto L5b
                java.util.Map r1 = com.tendcloud.tenddata.bl.c()     // Catch: java.lang.Throwable -> L5b
                java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5b
                r1.put(r3, r4)     // Catch: java.lang.Throwable -> L5b
                java.util.Map r1 = com.tendcloud.tenddata.bl.c()     // Catch: java.lang.Throwable -> L5b
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
                long r5 = com.tendcloud.tenddata.bl.d()     // Catch: java.lang.Throwable -> L5b
                long r3 = r3 - r5
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L5b
                goto L2a
            L5b:
                return
        }
    }

    public static class b implements java.util.concurrent.ThreadFactory {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(com.tendcloud.tenddata.bl.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                java.lang.Thread r0 = new java.lang.Thread
                java.lang.String r1 = "Check_Thread #"
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.bl r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            r0 = 0
            com.tendcloud.tenddata.bl.f = r0
            r0 = 0
            com.tendcloud.tenddata.bl.g = r0
            com.tendcloud.tenddata.bl.h = r0
            return
    }

    private bl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.bl a() {
            com.tendcloud.tenddata.bl r0 = com.tendcloud.tenddata.bl.f
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bl> r0 = com.tendcloud.tenddata.bl.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bl r1 = com.tendcloud.tenddata.bl.f     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bl r1 = new com.tendcloud.tenddata.bl     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bl.f = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bl r0 = com.tendcloud.tenddata.bl.f
            return r0
    }

    private void a(android.content.Context r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            boolean r0 = com.tendcloud.tenddata.bl.h
            if (r0 != 0) goto L15
            com.tendcloud.tenddata.ab.c()     // Catch: java.lang.Throwable -> L15
            com.tendcloud.tenddata.ab.a(r2, r3)     // Catch: java.lang.Throwable -> L15
            com.tendcloud.tenddata.ab.b(r2, r3)     // Catch: java.lang.Throwable -> L15
            com.tendcloud.tenddata.ab.c(r2, r3)     // Catch: java.lang.Throwable -> L15
            boolean r2 = com.tendcloud.tenddata.ab.b     // Catch: java.lang.Throwable -> L15
            r2 = 1
            com.tendcloud.tenddata.bl.h = r2     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    public static /* synthetic */ void a(com.tendcloud.tenddata.a r0) {
            d(r0)
            return
    }

    private static boolean a(android.content.Context r5) {
            r0 = 0
            if (r5 != 0) goto Ld
            java.lang.String r5 = "[ModuleInit] current context is null..."
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L30
            com.tendcloud.tenddata.h.eForInternal(r5)     // Catch: java.lang.Throwable -> L30
            return r0
        Ld:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L30
            r2 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r5 = r1.getPackageInfo(r5, r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String[] r5 = r5.requestedPermissions     // Catch: java.lang.Throwable -> L30
            int r1 = r5.length     // Catch: java.lang.Throwable -> L30
            r2 = r0
        L1f:
            if (r2 >= r1) goto L30
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "android.permission.READ_PHONE_STATE"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L2d
            r5 = 1
            return r5
        L2d:
            int r2 = r2 + 1
            goto L1f
        L30:
            return r0
    }

    public static /* synthetic */ void b() {
            e()
            return
    }

    public static /* synthetic */ void b(com.tendcloud.tenddata.a r0) {
            g(r0)
            return
    }

    public static /* synthetic */ java.util.Map c() {
            java.util.Map<java.lang.String, java.lang.Object> r0 = com.tendcloud.tenddata.bl.d
            return r0
    }

    public static /* synthetic */ void c(com.tendcloud.tenddata.a r0) {
            h(r0)
            return
    }

    public static /* synthetic */ long d() {
            long r0 = com.tendcloud.tenddata.bl.c
            return r0
    }

    private static void d(com.tendcloud.tenddata.a r4) {
            if (r4 != 0) goto Lc
            java.lang.String r4 = "TDFeatures is null..."
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L1d
            com.tendcloud.tenddata.h.eForInternal(r4)     // Catch: java.lang.Throwable -> L1d
            return
        Lc:
            long r0 = com.tendcloud.tenddata.i.d(r4)     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1d
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1d
            com.tendcloud.tenddata.i.b(r0, r4)     // Catch: java.lang.Throwable -> L1d
        L1d:
            return
    }

    private static void e() {
            long r0 = com.tendcloud.tenddata.i.e()     // Catch: java.lang.Throwable -> L11
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11
            com.tendcloud.tenddata.i.setInitTime(r0)     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    private static void e(com.tendcloud.tenddata.a r4) {
            long r0 = com.tendcloud.tenddata.i.d(r4)     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            return
        Lb:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e
            long r2 = com.tendcloud.tenddata.i.d(r4)     // Catch: java.lang.Throwable -> L1e
            long r0 = r0 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            r4 = 1
            com.tendcloud.tenddata.y.c = r4     // Catch: java.lang.Throwable -> L1e
        L1e:
            return
    }

    private static void f() {
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.bl.c = r0     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L23
            r0 = 1
            com.tendcloud.tenddata.bl$b r1 = new com.tendcloud.tenddata.bl$b     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L23
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.bl.a = r2     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.bl$a r0 = new com.tendcloud.tenddata.bl$a     // Catch: java.lang.Throwable -> L23
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L23
            r4 = 0
            r6 = 2
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L23
            r3 = r0
            r2.scheduleAtFixedRate(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L23
        L23:
            return
    }

    private static void f(com.tendcloud.tenddata.a r4) {
            java.util.Timer r0 = new java.util.Timer     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            com.tendcloud.tenddata.bl$1 r1 = new com.tendcloud.tenddata.bl$1     // Catch: java.lang.Throwable -> L10
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L10
            long r2 = com.tendcloud.tenddata.ab.q     // Catch: java.lang.Throwable -> L10
            r0.schedule(r1, r2)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r0 = move-exception
            com.tendcloud.tenddata.h.eForInternal(r0)
            g(r4)
        L17:
            return
    }

    private static void g() {
            com.tendcloud.tenddata.bv r0 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "env"
            r0.b = r1     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "getProp"
            r0.c = r1     // Catch: java.lang.Throwable -> L28
            java.util.TreeMap r1 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "sysproperty"
            java.lang.String r3 = com.tendcloud.tenddata.y.a()     // Catch: java.lang.Throwable -> L28
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L28
            r0.d = r1     // Catch: java.lang.Throwable -> L28
            com.tendcloud.tenddata.a r1 = com.tendcloud.tenddata.a.ENV     // Catch: java.lang.Throwable -> L28
            r0.a = r1     // Catch: java.lang.Throwable -> L28
            com.tendcloud.tenddata.z r1 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L28
            r1.post(r0)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    private static void g(com.tendcloud.tenddata.a r9) {
            java.lang.String r0 = "isDeclareIMEI"
            java.lang.String r1 = "targetAPI"
            if (r9 != 0) goto L10
            java.lang.String r9 = "TDFeatures is null..."
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> Ld4
            com.tendcloud.tenddata.h.eForInternal(r9)     // Catch: java.lang.Throwable -> Ld4
            return
        L10:
            java.util.TreeMap r2 = new java.util.TreeMap     // Catch: java.lang.Throwable -> Ld4
            r2.<init>()     // Catch: java.lang.Throwable -> Ld4
            boolean r3 = com.tendcloud.tenddata.ab.a(r9)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r4 = "first"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Ld4
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r4 = com.tendcloud.tenddata.zz.a     // Catch: java.lang.Throwable -> Ld4
            boolean r4 = com.tendcloud.tenddata.y.b(r4)     // Catch: java.lang.Throwable -> Ld4
            if (r4 != 0) goto L35
            java.lang.String r4 = "custom"
            java.lang.String r5 = com.tendcloud.tenddata.zz.a     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r5 = com.tendcloud.tenddata.y.a(r5)     // Catch: java.lang.Throwable -> Ld4
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> Ld4
        L35:
            android.content.Context r4 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L9c
            int r4 = com.tendcloud.tenddata.y.c(r4)     // Catch: java.lang.Throwable -> L9c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L9c
            r2.put(r1, r5)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r5 = r9.name()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = "TRACKING"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L9c
            if (r5 != 0) goto L5a
            java.lang.String r5 = r9.name()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = "SDK"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L9c
        L5a:
            if (r3 == 0) goto L9c
            android.content.Context r5 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L9c
            boolean r5 = a(r5)     // Catch: java.lang.Throwable -> L9c
            android.content.Context r6 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "android.permission.READ_PHONE_STATE"
            boolean r6 = com.tendcloud.tenddata.y.b(r6, r7)     // Catch: java.lang.Throwable -> L9c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L9c
            r2.put(r0, r7)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "isGetIMEI"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L9c
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L9c
            if (r6 != 0) goto L9c
            r6 = 23
            if (r4 < r6) goto L9c
            java.util.TreeMap r6 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L9c
            r6.<init>()     // Catch: java.lang.Throwable -> L9c
            com.tendcloud.tenddata.bl.d = r6     // Catch: java.lang.Throwable -> L9c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L9c
            r6.put(r1, r4)     // Catch: java.lang.Throwable -> L9c
            java.util.Map<java.lang.String, java.lang.Object> r1 = com.tendcloud.tenddata.bl.d     // Catch: java.lang.Throwable -> L9c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L9c
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L9c
            f()     // Catch: java.lang.Throwable -> L9c
        L9c:
            com.tendcloud.tenddata.bv r0 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> Ld4
            r0.<init>()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r1 = "app"
            r0.b = r1     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = "init"
            r0.c = r1     // Catch: java.lang.Throwable -> Lbd
            r0.d = r2     // Catch: java.lang.Throwable -> Lbd
            r0.a = r9     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto Lb6
            com.tendcloud.tenddata.bl$2 r1 = new com.tendcloud.tenddata.bl$2     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r9)     // Catch: java.lang.Throwable -> Lbd
            r0.f = r1     // Catch: java.lang.Throwable -> Lbd
        Lb6:
            com.tendcloud.tenddata.z r1 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lbd
            r1.post(r0)     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            com.tendcloud.tenddata.bu r0 = new com.tendcloud.tenddata.bu     // Catch: java.lang.Throwable -> Ld4
            r0.<init>()     // Catch: java.lang.Throwable -> Ld4
            r0.a = r9     // Catch: java.lang.Throwable -> Ld4
            com.tendcloud.tenddata.bu$a r9 = com.tendcloud.tenddata.bu.a.IMMEDIATELY     // Catch: java.lang.Throwable -> Ld4
            r0.b = r9     // Catch: java.lang.Throwable -> Ld4
            com.tendcloud.tenddata.z r9 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Ld4
            r9.post(r0)     // Catch: java.lang.Throwable -> Ld4
            if (r3 == 0) goto Ld4
            g()     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            return
    }

    private static void h(com.tendcloud.tenddata.a r2) {
            com.tendcloud.tenddata.bv r0 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "app"
            r0.b = r1     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "getIMEI"
            r0.c = r1     // Catch: java.lang.Throwable -> L31
            java.util.Map<java.lang.String, java.lang.Object> r1 = com.tendcloud.tenddata.bl.d     // Catch: java.lang.Throwable -> L31
            r0.d = r1     // Catch: java.lang.Throwable -> L31
            r0.a = r2     // Catch: java.lang.Throwable -> L31
            com.tendcloud.tenddata.z r1 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L31
            r1.post(r0)     // Catch: java.lang.Throwable -> L31
            com.tendcloud.tenddata.bu r0 = new com.tendcloud.tenddata.bu     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            r0.a = r2     // Catch: java.lang.Throwable -> L31
            com.tendcloud.tenddata.bu$a r2 = com.tendcloud.tenddata.bu.a.IMMEDIATELY     // Catch: java.lang.Throwable -> L31
            r0.b = r2     // Catch: java.lang.Throwable -> L31
            com.tendcloud.tenddata.z r2 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L31
            r2.post(r0)     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = com.tendcloud.tenddata.bl.a     // Catch: java.lang.Throwable -> L31
            r2.shutdown()     // Catch: java.lang.Throwable -> L31
        L31:
            return
    }

    public final void onTDEBEventInitEvent(com.tendcloud.tenddata.zz.a r7) {
            r6 = this;
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r7.paraMap     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "apiType"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lc5
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Lc5
            r1 = 1
            if (r0 == r1) goto L14
            return
        L14:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r7.paraMap     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "action"
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lc5
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r7.paraMap     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = "service"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lc5
            com.tendcloud.tenddata.a r2 = (com.tendcloud.tenddata.a) r2     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = "install"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r4 = "SDK"
            if (r3 != 0) goto L3c
            java.lang.String r3 = "deeplink"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto L53
        L3c:
            java.lang.String r3 = r2.name()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r5 = "TRACKING"
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> Lc5
            if (r3 != 0) goto L95
            java.lang.String r3 = r2.name()     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto L53
            goto L95
        L53:
            java.lang.String r7 = "init"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Lc5
            if (r7 == 0) goto Lc5
            android.content.Context r7 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> Lc5
            com.tendcloud.tenddata.bp.a()     // Catch: java.lang.Throwable -> Lc5
            com.tendcloud.tenddata.be.a()     // Catch: java.lang.Throwable -> Lc5
            com.tendcloud.tenddata.bj.a()     // Catch: java.lang.Throwable -> Lc5
            com.tendcloud.tenddata.bf.a()     // Catch: java.lang.Throwable -> Lc5
            com.tendcloud.tenddata.bn.a()     // Catch: java.lang.Throwable -> Lc5
            com.tendcloud.tenddata.bg.a()     // Catch: java.lang.Throwable -> Lc5
            com.tendcloud.tenddata.bk.a()     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = com.tendcloud.tenddata.y.a(r7)     // Catch: java.lang.Throwable -> Lc5
            if (r0 != 0) goto L7f
            com.tendcloud.tenddata.bd r0 = com.tendcloud.tenddata.bd.a()     // Catch: java.lang.Throwable -> Lc5
            r0.b()     // Catch: java.lang.Throwable -> Lc5
        L7f:
            com.tendcloud.tenddata.ab.b = r1     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r2.name()     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L8e
            r6.a(r7, r2)     // Catch: java.lang.Throwable -> Lc5
        L8e:
            e(r2)     // Catch: java.lang.Throwable -> Lc5
            f(r2)     // Catch: java.lang.Throwable -> Lc5
            goto Lc5
        L95:
            com.tendcloud.tenddata.bv r1 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> Lc5
            r1.<init>()     // Catch: java.lang.Throwable -> Lc5
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r7.paraMap     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r4 = "data"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Lc5
            java.util.HashMap<java.lang.String, java.lang.Object> r7 = r7.paraMap     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r4 = "domain"
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> Lc5
            r1.b = r7     // Catch: java.lang.Throwable -> Lc5
            r1.c = r0     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto Lbc
            boolean r7 = r3 instanceof java.util.Map     // Catch: java.lang.Throwable -> Lc5
            if (r7 == 0) goto Lbc
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> Lc5
            r1.d = r3     // Catch: java.lang.Throwable -> Lc5
        Lbc:
            r1.a = r2     // Catch: java.lang.Throwable -> Lc5
            com.tendcloud.tenddata.z r7 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lc5
            r7.post(r1)     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            return
    }
}
